package org.bouncycastle.x509.util;

/* loaded from: classes5.dex */
public class StreamParsingException extends Exception {

    /* renamed from: a  reason: collision with root package name */
    Throwable f43218a;

    public StreamParsingException(String str, Throwable th2) {
        super(str);
        this.f43218a = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f43218a;
    }
}