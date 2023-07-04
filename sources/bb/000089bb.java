package n50;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class d implements org.bouncycastle.crypto.c {

    /* renamed from: g  reason: collision with root package name */
    private u50.e f40534g;

    public void a(org.bouncycastle.crypto.t tVar) {
        this.f40534g = (u50.e) tVar;
    }

    @Override // org.bouncycastle.crypto.c
    public org.bouncycastle.crypto.b generateKeyPair() {
        e eVar = e.f40535a;
        u50.i c11 = this.f40534g.c();
        BigInteger a11 = eVar.a(c11, this.f40534g.a());
        return new org.bouncycastle.crypto.b(new u50.k(eVar.b(c11, a11), c11), new u50.j(a11, c11));
    }
}