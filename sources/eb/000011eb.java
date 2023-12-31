package ch.qos.logback.core.util;

/* loaded from: classes.dex */
public class IncompatibleClassException extends Exception {
    private static final long serialVersionUID = -5823372159561159549L;
    Class<?> obtainedClass;
    Class<?> requestedClass;

    /* JADX INFO: Access modifiers changed from: package-private */
    public IncompatibleClassException(Class<?> cls, Class<?> cls2) {
        this.requestedClass = cls;
        this.obtainedClass = cls2;
    }
}