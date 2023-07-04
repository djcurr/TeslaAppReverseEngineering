package n50;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class i implements org.bouncycastle.crypto.c {

    /* renamed from: h  reason: collision with root package name */
    private static final BigInteger f40545h = BigInteger.valueOf(1);

    /* renamed from: g  reason: collision with root package name */
    private u50.o f40546g;

    private static BigInteger a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return bigInteger2.modPow(bigInteger3, bigInteger);
    }

    private static BigInteger b(BigInteger bigInteger, SecureRandom secureRandom) {
        BigInteger f11;
        int bitLength = bigInteger.bitLength() >>> 2;
        do {
            BigInteger bigInteger2 = f40545h;
            f11 = r70.a.f(bigInteger2, bigInteger.subtract(bigInteger2), secureRandom);
        } while (n60.x.h(f11) < bitLength);
        return f11;
    }

    public void c(org.bouncycastle.crypto.t tVar) {
        this.f40546g = (u50.o) tVar;
    }

    @Override // org.bouncycastle.crypto.c
    public org.bouncycastle.crypto.b generateKeyPair() {
        u50.r c11 = this.f40546g.c();
        BigInteger b11 = b(c11.c(), this.f40546g.a());
        return new org.bouncycastle.crypto.b(new u50.t(a(c11.b(), c11.a(), b11), c11), new u50.s(b11, c11));
    }
}