package org.bouncycastle.util;

/* loaded from: classes5.dex */
public class StoreException extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private Throwable f43207a;

    public StoreException(String str, Throwable th2) {
        super(str);
        this.f43207a = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f43207a;
    }
}