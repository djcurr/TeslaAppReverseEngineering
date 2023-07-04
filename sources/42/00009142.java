package org.bouncycastle.i18n;

/* loaded from: classes5.dex */
public class LocalizedException extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private Throwable f43157a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f43157a;
    }
}