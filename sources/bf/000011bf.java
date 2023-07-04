package ch.qos.logback.core.status;

/* loaded from: classes.dex */
public class ErrorStatus extends StatusBase {
    public ErrorStatus(String str, Object obj) {
        super(2, str, obj);
    }

    public ErrorStatus(String str, Object obj, Throwable th2) {
        super(2, str, obj, th2);
    }
}