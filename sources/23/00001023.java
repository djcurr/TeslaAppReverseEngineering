package ch.qos.logback.classic;

import ch.qos.logback.classic.spi.LoggerComparator;
import ch.qos.logback.classic.spi.LoggerContextListener;
import ch.qos.logback.classic.spi.LoggerContextVO;
import ch.qos.logback.classic.spi.TurboFilterList;
import ch.qos.logback.classic.turbo.TurboFilter;
import ch.qos.logback.classic.util.LoggerNameUtil;
import ch.qos.logback.core.ContextBase;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.FilterReply;
import ch.qos.logback.core.status.StatusListener;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.status.WarnStatus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import org.slf4j.ILoggerFactory;
import org.slf4j.Marker;

/* loaded from: classes.dex */
public class LoggerContext extends ContextBase implements ILoggerFactory {
    public static final boolean DEFAULT_PACKAGING_DATA = false;
    private List<String> frameworkPackages;
    final Logger root;
    private int size;
    private int noAppenderWarning = 0;
    private final List<LoggerContextListener> loggerContextListenerList = new ArrayList();
    private final TurboFilterList turboFilterList = new TurboFilterList();
    private boolean packagingDataEnabled = false;
    private int maxCallerDataDepth = 8;
    int resetCount = 0;
    private Map<String, Logger> loggerCache = new ConcurrentHashMap();
    private LoggerContextVO loggerContextRemoteView = new LoggerContextVO(this);

    public LoggerContext() {
        Logger logger = new Logger(org.slf4j.Logger.ROOT_LOGGER_NAME, null, this);
        this.root = logger;
        logger.setLevel(Level.DEBUG);
        this.loggerCache.put(org.slf4j.Logger.ROOT_LOGGER_NAME, logger);
        initEvaluatorMap();
        this.size = 1;
        this.frameworkPackages = new ArrayList();
    }

    private void cancelScheduledTasks() {
        for (ScheduledFuture<?> scheduledFuture : this.scheduledFutures) {
            scheduledFuture.cancel(false);
        }
        this.scheduledFutures.clear();
    }

    private void fireOnReset() {
        for (LoggerContextListener loggerContextListener : this.loggerContextListenerList) {
            loggerContextListener.onReset(this);
        }
    }

    private void fireOnStart() {
        for (LoggerContextListener loggerContextListener : this.loggerContextListenerList) {
            loggerContextListener.onStart(this);
        }
    }

    private void fireOnStop() {
        for (LoggerContextListener loggerContextListener : this.loggerContextListenerList) {
            loggerContextListener.onStop(this);
        }
    }

    private void incSize() {
        this.size++;
    }

    private void resetAllListeners() {
        this.loggerContextListenerList.clear();
    }

    private void resetListenersExceptResetResistant() {
        ArrayList arrayList = new ArrayList();
        for (LoggerContextListener loggerContextListener : this.loggerContextListenerList) {
            if (loggerContextListener.isResetResistant()) {
                arrayList.add(loggerContextListener);
            }
        }
        this.loggerContextListenerList.retainAll(arrayList);
    }

    private void resetStatusListeners() {
        StatusManager statusManager = getStatusManager();
        for (StatusListener statusListener : statusManager.getCopyOfStatusListenerList()) {
            statusManager.remove(statusListener);
        }
    }

    private void updateLoggerContextVO() {
        this.loggerContextRemoteView = new LoggerContextVO(this);
    }

    public void addListener(LoggerContextListener loggerContextListener) {
        this.loggerContextListenerList.add(loggerContextListener);
    }

    public void addTurboFilter(TurboFilter turboFilter) {
        this.turboFilterList.add(turboFilter);
    }

    public Logger exists(String str) {
        return this.loggerCache.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void fireOnLevelChange(Logger logger, Level level) {
        for (LoggerContextListener loggerContextListener : this.loggerContextListenerList) {
            loggerContextListener.onLevelChange(logger, level);
        }
    }

    public List<LoggerContextListener> getCopyOfListenerList() {
        return new ArrayList(this.loggerContextListenerList);
    }

    public List<String> getFrameworkPackages() {
        return this.frameworkPackages;
    }

    public final Logger getLogger(Class<?> cls) {
        return getLogger(cls.getName());
    }

    @Override // org.slf4j.ILoggerFactory
    public Logger getLogger(String str) {
        Logger childByName;
        if (str == null) {
            throw new IllegalArgumentException("name argument cannot be null");
        }
        if (org.slf4j.Logger.ROOT_LOGGER_NAME.equalsIgnoreCase(str)) {
            return this.root;
        }
        Logger logger = this.root;
        Logger logger2 = this.loggerCache.get(str);
        if (logger2 != null) {
            return logger2;
        }
        int i11 = 0;
        while (true) {
            int separatorIndexOf = LoggerNameUtil.getSeparatorIndexOf(str, i11);
            String substring = separatorIndexOf == -1 ? str : str.substring(0, separatorIndexOf);
            int i12 = separatorIndexOf + 1;
            synchronized (logger) {
                childByName = logger.getChildByName(substring);
                if (childByName == null) {
                    childByName = logger.createChildByName(substring);
                    this.loggerCache.put(substring, childByName);
                    incSize();
                }
            }
            if (separatorIndexOf == -1) {
                return childByName;
            }
            i11 = i12;
            logger = childByName;
        }
    }

    public LoggerContextVO getLoggerContextRemoteView() {
        return this.loggerContextRemoteView;
    }

    public List<Logger> getLoggerList() {
        ArrayList arrayList = new ArrayList(this.loggerCache.values());
        Collections.sort(arrayList, new LoggerComparator());
        return arrayList;
    }

    public int getMaxCallerDataDepth() {
        return this.maxCallerDataDepth;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final FilterReply getTurboFilterChainDecision_0_3OrMore(Marker marker, Logger logger, Level level, String str, Object[] objArr, Throwable th2) {
        return this.turboFilterList.size() == 0 ? FilterReply.NEUTRAL : this.turboFilterList.getTurboFilterChainDecision(marker, logger, level, str, objArr, th2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final FilterReply getTurboFilterChainDecision_1(Marker marker, Logger logger, Level level, String str, Object obj, Throwable th2) {
        return this.turboFilterList.size() == 0 ? FilterReply.NEUTRAL : this.turboFilterList.getTurboFilterChainDecision(marker, logger, level, str, new Object[]{obj}, th2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final FilterReply getTurboFilterChainDecision_2(Marker marker, Logger logger, Level level, String str, Object obj, Object obj2, Throwable th2) {
        return this.turboFilterList.size() == 0 ? FilterReply.NEUTRAL : this.turboFilterList.getTurboFilterChainDecision(marker, logger, level, str, new Object[]{obj, obj2}, th2);
    }

    public TurboFilterList getTurboFilterList() {
        return this.turboFilterList;
    }

    void initEvaluatorMap() {
        putObject(CoreConstants.EVALUATOR_MAP, new HashMap());
    }

    public boolean isPackagingDataEnabled() {
        return this.packagingDataEnabled;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void noAppenderDefinedWarning(Logger logger) {
        int i11 = this.noAppenderWarning;
        this.noAppenderWarning = i11 + 1;
        if (i11 == 0) {
            StatusManager statusManager = getStatusManager();
            statusManager.add(new WarnStatus("No appenders present in context [" + getName() + "] for logger [" + logger.getName() + "].", logger));
        }
    }

    public void putProperties(Properties properties) {
        for (String str : properties.stringPropertyNames()) {
            super.putProperty(str, properties.getProperty(str));
        }
        updateLoggerContextVO();
    }

    @Override // ch.qos.logback.core.ContextBase, ch.qos.logback.core.Context
    public void putProperty(String str, String str2) {
        super.putProperty(str, str2);
        updateLoggerContextVO();
    }

    public void removeListener(LoggerContextListener loggerContextListener) {
        this.loggerContextListenerList.remove(loggerContextListener);
    }

    @Override // ch.qos.logback.core.ContextBase
    public void reset() {
        this.resetCount++;
        super.reset();
        initEvaluatorMap();
        initCollisionMaps();
        this.root.recursiveReset();
        resetTurboFilterList();
        cancelScheduledTasks();
        fireOnReset();
        resetListenersExceptResetResistant();
        resetStatusListeners();
    }

    public void resetTurboFilterList() {
        Iterator<TurboFilter> it2 = this.turboFilterList.iterator();
        while (it2.hasNext()) {
            it2.next().stop();
        }
        this.turboFilterList.clear();
    }

    public void setMaxCallerDataDepth(int i11) {
        this.maxCallerDataDepth = i11;
    }

    @Override // ch.qos.logback.core.ContextBase, ch.qos.logback.core.Context
    public void setName(String str) {
        super.setName(str);
        updateLoggerContextVO();
    }

    public void setPackagingDataEnabled(boolean z11) {
        this.packagingDataEnabled = z11;
    }

    int size() {
        return this.size;
    }

    @Override // ch.qos.logback.core.ContextBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        super.start();
        fireOnStart();
    }

    @Override // ch.qos.logback.core.ContextBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        reset();
        fireOnStop();
        resetAllListeners();
        super.stop();
    }

    @Override // ch.qos.logback.core.ContextBase
    public String toString() {
        return getClass().getName() + "[" + getName() + "]";
    }
}