package ch.qos.logback.core.spi;

/* loaded from: classes.dex */
public class ScanException extends Exception {
    private static final long serialVersionUID = -3132040414328475658L;
    Throwable cause;

    public ScanException(String str) {
        super(str);
    }

    public ScanException(String str, Throwable th2) {
        super(str);
        this.cause = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}