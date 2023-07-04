package org.bouncycastle.jce.provider;

/* loaded from: classes5.dex */
public class AnnotatedException extends Exception {
    private Throwable _underlyingException;

    public AnnotatedException(String str) {
        this(str, null);
    }

    public AnnotatedException(String str, Throwable th2) {
        super(str);
        this._underlyingException = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this._underlyingException;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Throwable getUnderlyingException() {
        return this._underlyingException;
    }
}