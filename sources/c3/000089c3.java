package n50;

import java.math.BigInteger;
import java.security.SecureRandom;
import u50.d0;
import u50.e0;

/* loaded from: classes5.dex */
public class l implements org.bouncycastle.crypto.c, n60.d {

    /* renamed from: g  reason: collision with root package name */
    u50.y f40556g;

    /* renamed from: h  reason: collision with root package name */
    SecureRandom f40557h;

    protected n60.h a() {
        return new n60.k();
    }

    public void b(org.bouncycastle.crypto.t tVar) {
        u50.a0 a0Var = (u50.a0) tVar;
        this.f40557h = a0Var.a();
        this.f40556g = a0Var.c();
    }

    @Override // org.bouncycastle.crypto.c
    public org.bouncycastle.crypto.b generateKeyPair() {
        BigInteger e11 = this.f40556g.e();
        int bitLength = e11.bitLength();
        int i11 = bitLength >>> 2;
        while (true) {
            BigInteger e12 = r70.a.e(bitLength, this.f40557h);
            if (e12.compareTo(n60.d.f40585b) >= 0 && e12.compareTo(e11) < 0 && n60.x.h(e12) >= i11) {
                return new org.bouncycastle.crypto.b(new e0(a().a(this.f40556g.b(), e12), this.f40556g), new d0(e12, this.f40556g));
            }
        }
    }
}