package org.bouncycastle.crypto;

/* loaded from: classes5.dex */
public class CryptoException extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private Throwable f43123a;

    public CryptoException() {
    }

    public CryptoException(String str) {
        super(str);
    }

    public CryptoException(String str, Throwable th2) {
        super(str);
        this.f43123a = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f43123a;
    }
}