package n50;

import java.math.BigInteger;
import java.security.SecureRandom;
import u50.r0;
import u50.t0;
import u50.u0;
import u50.v0;

/* loaded from: classes5.dex */
public class r implements org.bouncycastle.crypto.c {

    /* renamed from: g  reason: collision with root package name */
    private r0 f40566g;

    public void a(org.bouncycastle.crypto.t tVar) {
        this.f40566g = (r0) tVar;
    }

    @Override // org.bouncycastle.crypto.c
    public org.bouncycastle.crypto.b generateKeyPair() {
        t0 c11 = this.f40566g.c();
        SecureRandom a11 = this.f40566g.a();
        BigInteger c12 = c11.c();
        BigInteger b11 = c11.b();
        BigInteger a12 = c11.a();
        while (true) {
            BigInteger e11 = r70.a.e(256, a11);
            if (e11.signum() >= 1 && e11.compareTo(c12) < 0 && n60.x.h(e11) >= 64) {
                return new org.bouncycastle.crypto.b(new v0(a12.modPow(e11, b11), c11), new u0(e11, c11));
            }
        }
    }
}