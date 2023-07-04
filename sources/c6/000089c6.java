package n50;

import java.math.BigInteger;
import u50.l0;
import u50.n0;
import u50.o0;
import u50.p0;

/* loaded from: classes5.dex */
public class o implements org.bouncycastle.crypto.c {

    /* renamed from: g  reason: collision with root package name */
    private l0 f40560g;

    public void a(org.bouncycastle.crypto.t tVar) {
        this.f40560g = (l0) tVar;
    }

    @Override // org.bouncycastle.crypto.c
    public org.bouncycastle.crypto.b generateKeyPair() {
        e eVar = e.f40535a;
        n0 c11 = this.f40560g.c();
        u50.i iVar = new u50.i(c11.c(), c11.a(), null, c11.b());
        BigInteger a11 = eVar.a(iVar, this.f40560g.a());
        return new org.bouncycastle.crypto.b(new p0(eVar.b(iVar, a11), c11), new o0(a11, c11));
    }
}