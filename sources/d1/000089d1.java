package n50;

import java.math.BigInteger;
import u50.m1;
import u50.n1;
import u50.o1;

/* loaded from: classes5.dex */
public class z implements org.bouncycastle.crypto.c {

    /* renamed from: h  reason: collision with root package name */
    private static final BigInteger f40579h = BigInteger.valueOf(1);

    /* renamed from: g  reason: collision with root package name */
    private m1 f40580g;

    private static int b(int i11, int i12) {
        if (i11 >= 1536) {
            if (i12 <= 100) {
                return 3;
            }
            if (i12 <= 128) {
                return 4;
            }
            return 4 + (((i12 - 128) + 1) / 2);
        } else if (i11 >= 1024) {
            if (i12 <= 100) {
                return 4;
            }
            if (i12 <= 112) {
                return 5;
            }
            return (((i12 - 112) + 1) / 2) + 5;
        } else if (i11 < 512) {
            if (i12 <= 80) {
                return 40;
            }
            return 40 + (((i12 - 80) + 1) / 2);
        } else if (i12 <= 80) {
            return 5;
        } else {
            if (i12 <= 100) {
                return 7;
            }
            return (((i12 - 100) + 1) / 2) + 7;
        }
    }

    protected BigInteger a(int i11, BigInteger bigInteger, BigInteger bigInteger2) {
        for (int i12 = 0; i12 != i11 * 5; i12++) {
            BigInteger g11 = r70.a.g(i11, 1, this.f40580g.a());
            BigInteger mod = g11.mod(bigInteger);
            BigInteger bigInteger3 = f40579h;
            if (!mod.equals(bigInteger3) && g11.multiply(g11).compareTo(bigInteger2) >= 0 && d(g11) && bigInteger.gcd(g11.subtract(bigInteger3)).equals(bigInteger3)) {
                return g11;
            }
        }
        throw new IllegalStateException("unable to generate prime number for RSA key");
    }

    public void c(org.bouncycastle.crypto.t tVar) {
        this.f40580g = (m1) tVar;
    }

    protected boolean d(BigInteger bigInteger) {
        return !m60.a.b(bigInteger) && m60.a.e(bigInteger, this.f40580g.a(), b(bigInteger.bitLength(), this.f40580g.c()));
    }

    @Override // org.bouncycastle.crypto.c
    public org.bouncycastle.crypto.b generateKeyPair() {
        BigInteger a11;
        BigInteger a12;
        BigInteger multiply;
        BigInteger bigInteger;
        z zVar = this;
        int b11 = zVar.f40580g.b();
        int i11 = (b11 + 1) / 2;
        int i12 = b11 - i11;
        int i13 = b11 / 2;
        int i14 = i13 - 100;
        int i15 = b11 / 3;
        if (i14 < i15) {
            i14 = i15;
        }
        int i16 = b11 >> 2;
        BigInteger pow = BigInteger.valueOf(2L).pow(i13);
        BigInteger bigInteger2 = f40579h;
        BigInteger shiftLeft = bigInteger2.shiftLeft(b11 - 1);
        BigInteger shiftLeft2 = bigInteger2.shiftLeft(i14);
        org.bouncycastle.crypto.b bVar = null;
        boolean z11 = false;
        while (!z11) {
            BigInteger d11 = zVar.f40580g.d();
            do {
                a11 = zVar.a(i11, d11, shiftLeft);
                while (true) {
                    a12 = zVar.a(i12, d11, shiftLeft);
                    BigInteger abs = a12.subtract(a11).abs();
                    if (abs.bitLength() < i14 || abs.compareTo(shiftLeft2) <= 0) {
                        zVar = this;
                        b11 = b11;
                    } else {
                        multiply = a11.multiply(a12);
                        if (multiply.bitLength() != b11) {
                            a11 = a11.max(a12);
                        }
                    }
                }
            } while (n60.x.h(multiply) < i16);
            if (a11.compareTo(a12) < 0) {
                bigInteger = a11;
                a11 = a12;
            } else {
                bigInteger = a12;
            }
            BigInteger bigInteger3 = f40579h;
            BigInteger subtract = a11.subtract(bigInteger3);
            BigInteger subtract2 = bigInteger.subtract(bigInteger3);
            int i17 = b11;
            BigInteger modInverse = d11.modInverse(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2));
            if (modInverse.compareTo(pow) <= 0) {
                zVar = this;
                b11 = i17;
            } else {
                bVar = new org.bouncycastle.crypto.b(new n1(false, multiply, d11), new o1(multiply, d11, modInverse, a11, bigInteger, modInverse.remainder(subtract), modInverse.remainder(subtract2), r70.a.j(a11, bigInteger)));
                z11 = true;
                b11 = i17;
                zVar = this;
            }
        }
        return bVar;
    }
}