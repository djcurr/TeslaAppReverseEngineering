package ch.qos.logback.core.joran.spi;

/* loaded from: classes.dex */
public class JoranException extends Exception {
    private static final long serialVersionUID = 1112493363728774021L;

    public JoranException(String str) {
        super(str);
    }

    public JoranException(String str, Throwable th2) {
        super(str, th2);
    }
}