package ch.qos.logback.core.spi;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.status.Status;

/* loaded from: classes.dex */
public interface ContextAware {
    void addError(String str);

    void addError(String str, Throwable th2);

    void addInfo(String str);

    void addInfo(String str, Throwable th2);

    void addStatus(Status status);

    void addWarn(String str);

    void addWarn(String str, Throwable th2);

    Context getContext();

    void setContext(Context context);
}