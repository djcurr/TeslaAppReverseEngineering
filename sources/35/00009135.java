package org.bouncycastle.crypto;

/* loaded from: classes5.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private b f43153a;

    /* renamed from: b  reason: collision with root package name */
    private s f43154b;

    public q(b bVar, s sVar) {
        this.f43153a = bVar;
        this.f43154b = sVar;
    }

    public byte[] a() {
        return this.f43154b.getEncoded(this.f43153a.b());
    }

    public b b() {
        return this.f43153a;
    }
}