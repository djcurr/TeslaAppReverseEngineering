package org.spongycastle.util;

/* loaded from: classes4.dex */
public class StoreException extends RuntimeException {
    private Throwable _e;

    public StoreException(String str, Throwable th2) {
        super(str);
        this._e = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this._e;
    }
}