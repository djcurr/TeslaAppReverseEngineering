package y50;

import java.math.BigInteger;
import java.security.SecureRandom;
import u50.b0;
import u50.d0;
import u50.e0;
import u50.g1;
import u50.y;

/* loaded from: classes5.dex */
public class d implements org.bouncycastle.crypto.m {

    /* renamed from: i  reason: collision with root package name */
    private static final BigInteger f59144i = BigInteger.valueOf(1);

    /* renamed from: g  reason: collision with root package name */
    private b0 f59145g;

    /* renamed from: h  reason: collision with root package name */
    private SecureRandom f59146h;

    private static BigInteger b(BigInteger bigInteger, n60.f fVar) {
        return e(fVar.t(), bigInteger.bitLength() - 1);
    }

    private static BigInteger c(BigInteger bigInteger, SecureRandom secureRandom) {
        return r70.a.e(bigInteger.bitLength() - 1, secureRandom);
    }

    private static n60.f d(n60.e eVar, byte[] bArr) {
        return eVar.m(e(new BigInteger(1, org.bouncycastle.util.a.P(bArr)), eVar.t()));
    }

    private static BigInteger e(BigInteger bigInteger, int i11) {
        return bigInteger.bitLength() > i11 ? bigInteger.mod(f59144i.shiftLeft(i11)) : bigInteger;
    }

    protected n60.h a() {
        return new n60.k();
    }

    @Override // org.bouncycastle.crypto.l
    public BigInteger[] generateSignature(byte[] bArr) {
        y b11 = this.f59145g.b();
        n60.e a11 = b11.a();
        n60.f d11 = d(a11, bArr);
        if (d11.i()) {
            d11 = a11.m(f59144i);
        }
        BigInteger e11 = b11.e();
        BigInteger c11 = ((d0) this.f59145g).c();
        n60.h a12 = a();
        while (true) {
            BigInteger c12 = c(e11, this.f59146h);
            n60.f f11 = a12.a(b11.b(), c12).A().f();
            if (!f11.i()) {
                BigInteger b12 = b(e11, d11.j(f11));
                if (b12.signum() != 0) {
                    BigInteger mod = b12.multiply(c11).add(c12).mod(e11);
                    if (mod.signum() != 0) {
                        return new BigInteger[]{b12, mod};
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // org.bouncycastle.crypto.m
    public BigInteger getOrder() {
        return this.f59145g.b().e();
    }

    @Override // org.bouncycastle.crypto.l
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        b0 b0Var;
        if (z11) {
            if (iVar instanceof g1) {
                g1 g1Var = (g1) iVar;
                this.f59146h = g1Var.b();
                iVar = g1Var.a();
            } else {
                this.f59146h = org.bouncycastle.crypto.k.b();
            }
            b0Var = (d0) iVar;
        } else {
            b0Var = (e0) iVar;
        }
        this.f59145g = b0Var;
    }

    @Override // org.bouncycastle.crypto.l
    public boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger.signum() <= 0 || bigInteger2.signum() <= 0) {
            return false;
        }
        y b11 = this.f59145g.b();
        BigInteger e11 = b11.e();
        if (bigInteger.compareTo(e11) >= 0 || bigInteger2.compareTo(e11) >= 0) {
            return false;
        }
        n60.e a11 = b11.a();
        n60.f d11 = d(a11, bArr);
        if (d11.i()) {
            d11 = a11.m(f59144i);
        }
        n60.i A = n60.c.r(b11.b(), bigInteger2, ((e0) this.f59145g).c(), bigInteger).A();
        return !A.u() && b(e11, d11.j(A.f())).compareTo(bigInteger) == 0;
    }
}