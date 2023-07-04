package ch.qos.logback.classic.net;

import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.pattern.SyslogStartConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.classic.util.LevelToSyslogSeverity;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.Layout;
import ch.qos.logback.core.net.SyslogAppenderBase;
import ch.qos.logback.core.net.SyslogOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class SyslogAppender extends SyslogAppenderBase<ILoggingEvent> {
    public static final String DEFAULT_STACKTRACE_PATTERN = "\t";
    public static final String DEFAULT_SUFFIX_PATTERN = "[%thread] %logger %msg";
    PatternLayout stackTraceLayout = new PatternLayout();
    String stackTracePattern = DEFAULT_STACKTRACE_PATTERN;
    boolean throwableExcluded = false;

    private void handleThrowableFirstLine(OutputStream outputStream, IThrowableProxy iThrowableProxy, String str, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        if (!z11) {
            sb2.append(CoreConstants.CAUSED_BY);
        }
        sb2.append(iThrowableProxy.getClassName());
        sb2.append(": ");
        sb2.append(iThrowableProxy.getMessage());
        outputStream.write(sb2.toString().getBytes());
        outputStream.flush();
    }

    private void setupStackTraceLayout() {
        this.stackTraceLayout.getInstanceConverterMap().put("syslogStart", SyslogStartConverter.class.getName());
        PatternLayout patternLayout = this.stackTraceLayout;
        patternLayout.setPattern(getPrefixPattern() + this.stackTracePattern);
        this.stackTraceLayout.setContext(getContext());
        this.stackTraceLayout.start();
    }

    @Override // ch.qos.logback.core.net.SyslogAppenderBase
    public Layout<ILoggingEvent> buildLayout() {
        PatternLayout patternLayout = new PatternLayout();
        patternLayout.getInstanceConverterMap().put("syslogStart", SyslogStartConverter.class.getName());
        if (this.suffixPattern == null) {
            this.suffixPattern = DEFAULT_SUFFIX_PATTERN;
        }
        patternLayout.setPattern(getPrefixPattern() + this.suffixPattern);
        patternLayout.setContext(getContext());
        patternLayout.start();
        return patternLayout;
    }

    @Override // ch.qos.logback.core.net.SyslogAppenderBase
    public SyslogOutputStream createOutputStream() {
        return new SyslogOutputStream(getSyslogHost(), getPort());
    }

    String getPrefixPattern() {
        return "%syslogStart{" + getFacility() + "}%nopex{}";
    }

    @Override // ch.qos.logback.core.net.SyslogAppenderBase
    public int getSeverityForEvent(Object obj) {
        return LevelToSyslogSeverity.convert((ILoggingEvent) obj);
    }

    public String getStackTracePattern() {
        return this.stackTracePattern;
    }

    public boolean isThrowableExcluded() {
        return this.throwableExcluded;
    }

    @Override // ch.qos.logback.core.net.SyslogAppenderBase
    protected void postProcess(Object obj, OutputStream outputStream) {
        ILoggingEvent iLoggingEvent;
        IThrowableProxy throwableProxy;
        if (this.throwableExcluded || (throwableProxy = (iLoggingEvent = (ILoggingEvent) obj).getThrowableProxy()) == null) {
            return;
        }
        String doLayout = this.stackTraceLayout.doLayout(iLoggingEvent);
        boolean z11 = true;
        while (throwableProxy != null) {
            StackTraceElementProxy[] stackTraceElementProxyArray = throwableProxy.getStackTraceElementProxyArray();
            try {
                handleThrowableFirstLine(outputStream, throwableProxy, doLayout, z11);
                for (StackTraceElementProxy stackTraceElementProxy : stackTraceElementProxyArray) {
                    outputStream.write((doLayout + stackTraceElementProxy).getBytes());
                    outputStream.flush();
                }
                throwableProxy = throwableProxy.getCause();
                z11 = false;
            } catch (IOException unused) {
                return;
            }
        }
    }

    public void setStackTracePattern(String str) {
        this.stackTracePattern = str;
    }

    public void setThrowableExcluded(boolean z11) {
        this.throwableExcluded = z11;
    }

    boolean stackTraceHeaderLine(StringBuilder sb2, boolean z11) {
        return false;
    }

    @Override // ch.qos.logback.core.net.SyslogAppenderBase, ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        super.start();
        setupStackTraceLayout();
    }
}