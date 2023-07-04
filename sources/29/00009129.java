package org.bouncycastle.crypto;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    protected SecureRandom f43141a;

    /* renamed from: b  reason: collision with root package name */
    protected int f43142b;

    public byte[] a() {
        byte[] bArr = new byte[this.f43142b];
        this.f43141a.nextBytes(bArr);
        return bArr;
    }

    public void b(t tVar) {
        this.f43141a = tVar.a();
        this.f43142b = (tVar.b() + 7) / 8;
    }
}