package ch.qos.logback.classic;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.LoggingEvent;
import ch.qos.logback.classic.util.LoggerNameUtil;
import ch.qos.logback.core.Appender;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.AppenderAttachable;
import ch.qos.logback.core.spi.AppenderAttachableImpl;
import ch.qos.logback.core.spi.FilterReply;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.spi.LocationAwareLogger;

/* loaded from: classes.dex */
public final class Logger implements org.slf4j.Logger, LocationAwareLogger, AppenderAttachable<ILoggingEvent>, Serializable {
    public static final String FQCN = Logger.class.getName();
    private static final long serialVersionUID = 5454405123156820674L;
    private transient AppenderAttachableImpl<ILoggingEvent> aai;
    private transient boolean additive = true;
    private transient List<Logger> childrenList;
    private transient int effectiveLevelInt;
    private transient Level level;
    final transient LoggerContext loggerContext;
    private String name;
    private transient Logger parent;

    public Logger(String str, Logger logger, LoggerContext loggerContext) {
        this.name = str;
        this.parent = logger;
        this.loggerContext = loggerContext;
    }

    private int appendLoopOnAppenders(ILoggingEvent iLoggingEvent) {
        AppenderAttachableImpl<ILoggingEvent> appenderAttachableImpl = this.aai;
        if (appenderAttachableImpl != null) {
            return appenderAttachableImpl.appendLoopOnAppenders(iLoggingEvent);
        }
        return 0;
    }

    private void buildLoggingEventAndAppend(String str, Marker marker, Level level, String str2, Object[] objArr, Throwable th2) {
        LoggingEvent loggingEvent = new LoggingEvent(str, this, level, str2, th2, objArr);
        loggingEvent.setMarker(marker);
        callAppenders(loggingEvent);
    }

    private FilterReply callTurboFilters(Marker marker, Level level) {
        return this.loggerContext.getTurboFilterChainDecision_0_3OrMore(marker, this, level, null, null, null);
    }

    private void filterAndLog_0_Or3Plus(String str, Marker marker, Level level, String str2, Object[] objArr, Throwable th2) {
        FilterReply turboFilterChainDecision_0_3OrMore = this.loggerContext.getTurboFilterChainDecision_0_3OrMore(marker, this, level, str2, objArr, th2);
        if (turboFilterChainDecision_0_3OrMore == FilterReply.NEUTRAL) {
            if (this.effectiveLevelInt > level.levelInt) {
                return;
            }
        } else if (turboFilterChainDecision_0_3OrMore == FilterReply.DENY) {
            return;
        }
        buildLoggingEventAndAppend(str, marker, level, str2, objArr, th2);
    }

    private void filterAndLog_1(String str, Marker marker, Level level, String str2, Object obj, Throwable th2) {
        FilterReply turboFilterChainDecision_1 = this.loggerContext.getTurboFilterChainDecision_1(marker, this, level, str2, obj, th2);
        if (turboFilterChainDecision_1 == FilterReply.NEUTRAL) {
            if (this.effectiveLevelInt > level.levelInt) {
                return;
            }
        } else if (turboFilterChainDecision_1 == FilterReply.DENY) {
            return;
        }
        buildLoggingEventAndAppend(str, marker, level, str2, new Object[]{obj}, th2);
    }

    private void filterAndLog_2(String str, Marker marker, Level level, String str2, Object obj, Object obj2, Throwable th2) {
        FilterReply turboFilterChainDecision_2 = this.loggerContext.getTurboFilterChainDecision_2(marker, this, level, str2, obj, obj2, th2);
        if (turboFilterChainDecision_2 == FilterReply.NEUTRAL) {
            if (this.effectiveLevelInt > level.levelInt) {
                return;
            }
        } else if (turboFilterChainDecision_2 == FilterReply.DENY) {
            return;
        }
        buildLoggingEventAndAppend(str, marker, level, str2, new Object[]{obj, obj2}, th2);
    }

    private synchronized void handleParentLevelChange(int i11) {
        if (this.level == null) {
            this.effectiveLevelInt = i11;
            List<Logger> list = this.childrenList;
            if (list != null) {
                int size = list.size();
                for (int i12 = 0; i12 < size; i12++) {
                    this.childrenList.get(i12).handleParentLevelChange(i11);
                }
            }
        }
    }

    private boolean isRootLogger() {
        return this.parent == null;
    }

    private void localLevelReset() {
        this.effectiveLevelInt = 10000;
        this.level = isRootLogger() ? Level.DEBUG : null;
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public synchronized void addAppender(Appender<ILoggingEvent> appender) {
        if (this.aai == null) {
            this.aai = new AppenderAttachableImpl<>();
        }
        this.aai.addAppender(appender);
    }

    public void callAppenders(ILoggingEvent iLoggingEvent) {
        int i11 = 0;
        for (Logger logger = this; logger != null; logger = logger.parent) {
            i11 += logger.appendLoopOnAppenders(iLoggingEvent);
            if (!logger.additive) {
                break;
            }
        }
        if (i11 == 0) {
            this.loggerContext.noAppenderDefinedWarning(this);
        }
    }

    Logger createChildByLastNamePart(String str) {
        Logger logger;
        if (LoggerNameUtil.getFirstSeparatorIndexOf(str) != -1) {
            throw new IllegalArgumentException("Child name [" + str + " passed as parameter, may not include [" + CoreConstants.DOT + "]");
        }
        if (this.childrenList == null) {
            this.childrenList = new CopyOnWriteArrayList();
        }
        if (isRootLogger()) {
            logger = new Logger(str, this, this.loggerContext);
        } else {
            logger = new Logger(this.name + CoreConstants.DOT + str, this, this.loggerContext);
        }
        this.childrenList.add(logger);
        logger.effectiveLevelInt = this.effectiveLevelInt;
        return logger;
    }

    public Logger createChildByName(String str) {
        if (LoggerNameUtil.getSeparatorIndexOf(str, this.name.length() + 1) == -1) {
            if (this.childrenList == null) {
                this.childrenList = new CopyOnWriteArrayList();
            }
            Logger logger = new Logger(str, this, this.loggerContext);
            this.childrenList.add(logger);
            logger.effectiveLevelInt = this.effectiveLevelInt;
            return logger;
        }
        throw new IllegalArgumentException("For logger [" + this.name + "] child name [" + str + " passed as parameter, may not include '.' after index" + (this.name.length() + 1));
    }

    @Override // org.slf4j.Logger
    public void debug(String str) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.DEBUG, str, null, null);
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Object obj) {
        filterAndLog_1(FQCN, null, Level.DEBUG, str, obj, null);
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Object obj, Object obj2) {
        filterAndLog_2(FQCN, null, Level.DEBUG, str, obj, obj2, null);
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Throwable th2) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.DEBUG, str, null, th2);
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Object... objArr) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.DEBUG, str, objArr, null);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str) {
        filterAndLog_0_Or3Plus(FQCN, marker, Level.DEBUG, str, null, null);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str, Object obj) {
        filterAndLog_1(FQCN, marker, Level.DEBUG, str, obj, null);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str, Object obj, Object obj2) {
        filterAndLog_2(FQCN, marker, Level.DEBUG, str, obj, obj2, null);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str, Throwable th2) {
        filterAndLog_0_Or3Plus(FQCN, marker, Level.DEBUG, str, null, th2);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str, Object... objArr) {
        filterAndLog_0_Or3Plus(FQCN, marker, Level.DEBUG, str, objArr, null);
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public void detachAndStopAllAppenders() {
        AppenderAttachableImpl<ILoggingEvent> appenderAttachableImpl = this.aai;
        if (appenderAttachableImpl != null) {
            appenderAttachableImpl.detachAndStopAllAppenders();
        }
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean detachAppender(Appender<ILoggingEvent> appender) {
        AppenderAttachableImpl<ILoggingEvent> appenderAttachableImpl = this.aai;
        if (appenderAttachableImpl == null) {
            return false;
        }
        return appenderAttachableImpl.detachAppender(appender);
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean detachAppender(String str) {
        AppenderAttachableImpl<ILoggingEvent> appenderAttachableImpl = this.aai;
        if (appenderAttachableImpl == null) {
            return false;
        }
        return appenderAttachableImpl.detachAppender(str);
    }

    @Override // org.slf4j.Logger
    public void error(String str) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.ERROR, str, null, null);
    }

    @Override // org.slf4j.Logger
    public void error(String str, Object obj) {
        filterAndLog_1(FQCN, null, Level.ERROR, str, obj, null);
    }

    @Override // org.slf4j.Logger
    public void error(String str, Object obj, Object obj2) {
        filterAndLog_2(FQCN, null, Level.ERROR, str, obj, obj2, null);
    }

    @Override // org.slf4j.Logger
    public void error(String str, Throwable th2) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.ERROR, str, null, th2);
    }

    @Override // org.slf4j.Logger
    public void error(String str, Object... objArr) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.ERROR, str, objArr, null);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str) {
        filterAndLog_0_Or3Plus(FQCN, marker, Level.ERROR, str, null, null);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str, Object obj) {
        filterAndLog_1(FQCN, marker, Level.ERROR, str, obj, null);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str, Object obj, Object obj2) {
        filterAndLog_2(FQCN, marker, Level.ERROR, str, obj, obj2, null);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str, Throwable th2) {
        filterAndLog_0_Or3Plus(FQCN, marker, Level.ERROR, str, null, th2);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str, Object... objArr) {
        filterAndLog_0_Or3Plus(FQCN, marker, Level.ERROR, str, objArr, null);
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public Appender<ILoggingEvent> getAppender(String str) {
        AppenderAttachableImpl<ILoggingEvent> appenderAttachableImpl = this.aai;
        if (appenderAttachableImpl == null) {
            return null;
        }
        return appenderAttachableImpl.getAppender(str);
    }

    public Logger getChildByName(String str) {
        List<Logger> list = this.childrenList;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Logger logger = this.childrenList.get(i11);
            if (str.equals(logger.getName())) {
                return logger;
            }
        }
        return null;
    }

    public Level getEffectiveLevel() {
        return Level.toLevel(this.effectiveLevelInt);
    }

    int getEffectiveLevelInt() {
        return this.effectiveLevelInt;
    }

    public Level getLevel() {
        return this.level;
    }

    public LoggerContext getLoggerContext() {
        return this.loggerContext;
    }

    @Override // org.slf4j.Logger
    public String getName() {
        return this.name;
    }

    @Override // org.slf4j.Logger
    public void info(String str) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.INFO, str, null, null);
    }

    @Override // org.slf4j.Logger
    public void info(String str, Object obj) {
        filterAndLog_1(FQCN, null, Level.INFO, str, obj, null);
    }

    @Override // org.slf4j.Logger
    public void info(String str, Object obj, Object obj2) {
        filterAndLog_2(FQCN, null, Level.INFO, str, obj, obj2, null);
    }

    @Override // org.slf4j.Logger
    public void info(String str, Throwable th2) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.INFO, str, null, th2);
    }

    @Override // org.slf4j.Logger
    public void info(String str, Object... objArr) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.INFO, str, objArr, null);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str) {
        filterAndLog_0_Or3Plus(FQCN, marker, Level.INFO, str, null, null);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str, Object obj) {
        filterAndLog_1(FQCN, marker, Level.INFO, str, obj, null);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str, Object obj, Object obj2) {
        filterAndLog_2(FQCN, marker, Level.INFO, str, obj, obj2, null);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str, Throwable th2) {
        filterAndLog_0_Or3Plus(FQCN, marker, Level.INFO, str, null, th2);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str, Object... objArr) {
        filterAndLog_0_Or3Plus(FQCN, marker, Level.INFO, str, objArr, null);
    }

    public boolean isAdditive() {
        return this.additive;
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean isAttached(Appender<ILoggingEvent> appender) {
        AppenderAttachableImpl<ILoggingEvent> appenderAttachableImpl = this.aai;
        if (appenderAttachableImpl == null) {
            return false;
        }
        return appenderAttachableImpl.isAttached(appender);
    }

    @Override // org.slf4j.Logger
    public boolean isDebugEnabled() {
        return isDebugEnabled(null);
    }

    @Override // org.slf4j.Logger
    public boolean isDebugEnabled(Marker marker) {
        FilterReply callTurboFilters = callTurboFilters(marker, Level.DEBUG);
        if (callTurboFilters == FilterReply.NEUTRAL) {
            return this.effectiveLevelInt <= 10000;
        } else if (callTurboFilters == FilterReply.DENY) {
            return false;
        } else {
            if (callTurboFilters == FilterReply.ACCEPT) {
                return true;
            }
            throw new IllegalStateException("Unknown FilterReply value: " + callTurboFilters);
        }
    }

    public boolean isEnabledFor(Level level) {
        return isEnabledFor(null, level);
    }

    public boolean isEnabledFor(Marker marker, Level level) {
        FilterReply callTurboFilters = callTurboFilters(marker, level);
        if (callTurboFilters == FilterReply.NEUTRAL) {
            return this.effectiveLevelInt <= level.levelInt;
        } else if (callTurboFilters == FilterReply.DENY) {
            return false;
        } else {
            if (callTurboFilters == FilterReply.ACCEPT) {
                return true;
            }
            throw new IllegalStateException("Unknown FilterReply value: " + callTurboFilters);
        }
    }

    @Override // org.slf4j.Logger
    public boolean isErrorEnabled() {
        return isErrorEnabled(null);
    }

    @Override // org.slf4j.Logger
    public boolean isErrorEnabled(Marker marker) {
        FilterReply callTurboFilters = callTurboFilters(marker, Level.ERROR);
        if (callTurboFilters == FilterReply.NEUTRAL) {
            return this.effectiveLevelInt <= 40000;
        } else if (callTurboFilters == FilterReply.DENY) {
            return false;
        } else {
            if (callTurboFilters == FilterReply.ACCEPT) {
                return true;
            }
            throw new IllegalStateException("Unknown FilterReply value: " + callTurboFilters);
        }
    }

    @Override // org.slf4j.Logger
    public boolean isInfoEnabled() {
        return isInfoEnabled(null);
    }

    @Override // org.slf4j.Logger
    public boolean isInfoEnabled(Marker marker) {
        FilterReply callTurboFilters = callTurboFilters(marker, Level.INFO);
        if (callTurboFilters == FilterReply.NEUTRAL) {
            return this.effectiveLevelInt <= 20000;
        } else if (callTurboFilters == FilterReply.DENY) {
            return false;
        } else {
            if (callTurboFilters == FilterReply.ACCEPT) {
                return true;
            }
            throw new IllegalStateException("Unknown FilterReply value: " + callTurboFilters);
        }
    }

    @Override // org.slf4j.Logger
    public boolean isTraceEnabled() {
        return isTraceEnabled(null);
    }

    @Override // org.slf4j.Logger
    public boolean isTraceEnabled(Marker marker) {
        FilterReply callTurboFilters = callTurboFilters(marker, Level.TRACE);
        if (callTurboFilters == FilterReply.NEUTRAL) {
            return this.effectiveLevelInt <= 5000;
        } else if (callTurboFilters == FilterReply.DENY) {
            return false;
        } else {
            if (callTurboFilters == FilterReply.ACCEPT) {
                return true;
            }
            throw new IllegalStateException("Unknown FilterReply value: " + callTurboFilters);
        }
    }

    @Override // org.slf4j.Logger
    public boolean isWarnEnabled() {
        return isWarnEnabled(null);
    }

    @Override // org.slf4j.Logger
    public boolean isWarnEnabled(Marker marker) {
        FilterReply callTurboFilters = callTurboFilters(marker, Level.WARN);
        if (callTurboFilters == FilterReply.NEUTRAL) {
            return this.effectiveLevelInt <= 30000;
        } else if (callTurboFilters == FilterReply.DENY) {
            return false;
        } else {
            if (callTurboFilters == FilterReply.ACCEPT) {
                return true;
            }
            throw new IllegalStateException("Unknown FilterReply value: " + callTurboFilters);
        }
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public Iterator<Appender<ILoggingEvent>> iteratorForAppenders() {
        AppenderAttachableImpl<ILoggingEvent> appenderAttachableImpl = this.aai;
        return appenderAttachableImpl == null ? Collections.EMPTY_LIST.iterator() : appenderAttachableImpl.iteratorForAppenders();
    }

    @Override // org.slf4j.spi.LocationAwareLogger
    public void log(Marker marker, String str, int i11, String str2, Object[] objArr, Throwable th2) {
        filterAndLog_0_Or3Plus(str, marker, Level.fromLocationAwareLoggerInteger(i11), str2, objArr, th2);
    }

    public void log(org.slf4j.event.LoggingEvent loggingEvent) {
        filterAndLog_0_Or3Plus(FQCN, loggingEvent.getMarker(), Level.fromLocationAwareLoggerInteger(loggingEvent.getLevel().toInt()), loggingEvent.getMessage(), loggingEvent.getArgumentArray(), loggingEvent.getThrowable());
    }

    protected Object readResolve() {
        return LoggerFactory.getLogger(getName());
    }

    public void recursiveReset() {
        detachAndStopAllAppenders();
        localLevelReset();
        this.additive = true;
        if (this.childrenList == null) {
            return;
        }
        Iterator it2 = new CopyOnWriteArrayList(this.childrenList).iterator();
        while (it2.hasNext()) {
            ((Logger) it2.next()).recursiveReset();
        }
    }

    public void setAdditive(boolean z11) {
        this.additive = z11;
    }

    public synchronized void setLevel(Level level) {
        if (this.level == level) {
            return;
        }
        if (level == null && isRootLogger()) {
            throw new IllegalArgumentException("The level of the root logger cannot be set to null");
        }
        this.level = level;
        if (level == null) {
            Logger logger = this.parent;
            this.effectiveLevelInt = logger.effectiveLevelInt;
            level = logger.getEffectiveLevel();
        } else {
            this.effectiveLevelInt = level.levelInt;
        }
        List<Logger> list = this.childrenList;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.childrenList.get(i11).handleParentLevelChange(this.effectiveLevelInt);
            }
        }
        this.loggerContext.fireOnLevelChange(this, level);
    }

    public String toString() {
        return "Logger[" + this.name + "]";
    }

    @Override // org.slf4j.Logger
    public void trace(String str) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.TRACE, str, null, null);
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Object obj) {
        filterAndLog_1(FQCN, null, Level.TRACE, str, obj, null);
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Object obj, Object obj2) {
        filterAndLog_2(FQCN, null, Level.TRACE, str, obj, obj2, null);
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Throwable th2) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.TRACE, str, null, th2);
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Object... objArr) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.TRACE, str, objArr, null);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str) {
        filterAndLog_0_Or3Plus(FQCN, marker, Level.TRACE, str, null, null);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str, Object obj) {
        filterAndLog_1(FQCN, marker, Level.TRACE, str, obj, null);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str, Object obj, Object obj2) {
        filterAndLog_2(FQCN, marker, Level.TRACE, str, obj, obj2, null);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str, Throwable th2) {
        filterAndLog_0_Or3Plus(FQCN, marker, Level.TRACE, str, null, th2);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str, Object... objArr) {
        filterAndLog_0_Or3Plus(FQCN, marker, Level.TRACE, str, objArr, null);
    }

    @Override // org.slf4j.Logger
    public void warn(String str) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.WARN, str, null, null);
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Object obj) {
        filterAndLog_1(FQCN, null, Level.WARN, str, obj, null);
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Object obj, Object obj2) {
        filterAndLog_2(FQCN, null, Level.WARN, str, obj, obj2, null);
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Throwable th2) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.WARN, str, null, th2);
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Object... objArr) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.WARN, str, objArr, null);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str) {
        filterAndLog_0_Or3Plus(FQCN, marker, Level.WARN, str, null, null);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str, Object obj) {
        filterAndLog_1(FQCN, marker, Level.WARN, str, obj, null);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str, Object obj, Object obj2) {
        filterAndLog_2(FQCN, marker, Level.WARN, str, obj, obj2, null);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str, Throwable th2) {
        filterAndLog_0_Or3Plus(FQCN, marker, Level.WARN, str, null, th2);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str, Object... objArr) {
        filterAndLog_0_Or3Plus(FQCN, marker, Level.WARN, str, objArr, null);
    }
}