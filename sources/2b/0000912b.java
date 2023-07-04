package org.bouncycastle.crypto.io;

import java.io.IOException;

/* loaded from: classes5.dex */
public class CipherIOException extends IOException {

    /* renamed from: a  reason: collision with root package name */
    private final Throwable f43143a;

    public CipherIOException(String str, Throwable th2) {
        super(str);
        this.f43143a = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f43143a;
    }
}