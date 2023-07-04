package org.spongycastle.jce.provider;

import org.spongycastle.jce.exception.ExtException;

/* loaded from: classes4.dex */
public class AnnotatedException extends Exception implements ExtException {
    private Throwable _underlyingException;

    public AnnotatedException(String str, Throwable th2) {
        super(str);
        this._underlyingException = th2;
    }

    @Override // java.lang.Throwable, org.spongycastle.jce.exception.ExtException
    public Throwable getCause() {
        return this._underlyingException;
    }

    Throwable getUnderlyingException() {
        return this._underlyingException;
    }

    public AnnotatedException(String str) {
        this(str, null);
    }
}