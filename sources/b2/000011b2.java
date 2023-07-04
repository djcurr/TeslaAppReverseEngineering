package ch.qos.logback.core.spi;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.status.ErrorStatus;
import ch.qos.logback.core.status.InfoStatus;
import ch.qos.logback.core.status.Status;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.status.WarnStatus;
import java.io.PrintStream;

/* loaded from: classes.dex */
public class ContextAwareBase implements ContextAware {
    protected Context context;
    final Object declaredOrigin;
    private int noContextWarning;

    public ContextAwareBase() {
        this.noContextWarning = 0;
        this.declaredOrigin = this;
    }

    public ContextAwareBase(ContextAware contextAware) {
        this.noContextWarning = 0;
        this.declaredOrigin = contextAware;
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addError(String str) {
        addStatus(new ErrorStatus(str, getDeclaredOrigin()));
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addError(String str, Throwable th2) {
        addStatus(new ErrorStatus(str, getDeclaredOrigin(), th2));
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addInfo(String str) {
        addStatus(new InfoStatus(str, getDeclaredOrigin()));
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addInfo(String str, Throwable th2) {
        addStatus(new InfoStatus(str, getDeclaredOrigin(), th2));
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addStatus(Status status) {
        Context context = this.context;
        if (context != null) {
            StatusManager statusManager = context.getStatusManager();
            if (statusManager != null) {
                statusManager.add(status);
                return;
            }
            return;
        }
        int i11 = this.noContextWarning;
        this.noContextWarning = i11 + 1;
        if (i11 == 0) {
            PrintStream printStream = System.out;
            printStream.println("LOGBACK: No context given for " + this);
        }
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addWarn(String str) {
        addStatus(new WarnStatus(str, getDeclaredOrigin()));
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addWarn(String str, Throwable th2) {
        addStatus(new WarnStatus(str, getDeclaredOrigin(), th2));
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public Context getContext() {
        return this.context;
    }

    protected Object getDeclaredOrigin() {
        return this.declaredOrigin;
    }

    public StatusManager getStatusManager() {
        Context context = this.context;
        if (context == null) {
            return null;
        }
        return context.getStatusManager();
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void setContext(Context context) {
        Context context2 = this.context;
        if (context2 == null) {
            this.context = context;
        } else if (context2 != context) {
            throw new IllegalStateException("Context has been already set");
        }
    }
}