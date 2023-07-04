package com.google.zxing;

/* loaded from: classes2.dex */
public abstract class ReaderException extends Exception {

    /* renamed from: a  reason: collision with root package name */
    protected static final boolean f17416a;

    /* renamed from: b  reason: collision with root package name */
    protected static final StackTraceElement[] f17417b;

    static {
        f17416a = System.getProperty("surefire.test.class.path") != null;
        f17417b = new StackTraceElement[0];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReaderException() {
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReaderException(Throwable th2) {
        super(th2);
    }
}