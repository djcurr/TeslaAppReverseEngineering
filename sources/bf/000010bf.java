package ch.qos.logback.core.boolex;

/* loaded from: classes.dex */
public class EvaluationException extends Exception {
    private static final long serialVersionUID = 1;

    public EvaluationException(String str) {
        super(str);
    }

    public EvaluationException(String str, Throwable th2) {
        super(str, th2);
    }

    public EvaluationException(Throwable th2) {
        super(th2);
    }
}