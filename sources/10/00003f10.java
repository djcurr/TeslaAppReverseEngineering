package com.nimbusds.jose.crypto.impl;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f17935a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f17936b;

    public f(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            this.f17935a = bArr;
            if (bArr2 != null) {
                this.f17936b = bArr2;
                return;
            }
            throw new IllegalArgumentException("The authentication tag must not be null");
        }
        throw new IllegalArgumentException("The cipher text must not be null");
    }

    public byte[] a() {
        return this.f17936b;
    }

    public byte[] b() {
        return this.f17935a;
    }
}