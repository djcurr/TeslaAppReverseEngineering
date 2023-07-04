package y50;

import java.math.BigInteger;
import java.security.SecureRandom;
import u50.b0;
import u50.d0;
import u50.e0;
import u50.g1;
import u50.y;

/* loaded from: classes5.dex */
public class f implements org.bouncycastle.crypto.m {

    /* renamed from: g  reason: collision with root package name */
    b0 f59150g;

    /* renamed from: h  reason: collision with root package name */
    SecureRandom f59151h;

    protected n60.h a() {
        return new n60.k();
    }

    @Override // org.bouncycastle.crypto.l
    public BigInteger[] generateSignature(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(1, org.bouncycastle.util.a.P(bArr));
        y b11 = this.f59150g.b();
        BigInteger e11 = b11.e();
        BigInteger c11 = ((d0) this.f59150g).c();
        n60.h a11 = a();
        while (true) {
            BigInteger e12 = r70.a.e(e11.bitLength(), this.f59151h);
            BigInteger bigInteger2 = n60.d.f40584a;
            if (!e12.equals(bigInteger2)) {
                BigInteger mod = a11.a(b11.b(), e12).A().f().t().mod(e11);
                if (mod.equals(bigInteger2)) {
                    continue;
                } else {
                    BigInteger mod2 = e12.multiply(bigInteger).add(c11.multiply(mod)).mod(e11);
                    if (!mod2.equals(bigInteger2)) {
                        return new BigInteger[]{mod, mod2};
                    }
                }
            }
        }
    }

    @Override // org.bouncycastle.crypto.m
    public BigInteger getOrder() {
        return this.f59150g.b().e();
    }

    @Override // org.bouncycastle.crypto.l
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        b0 b0Var;
        if (!z11) {
            b0Var = (e0) iVar;
        } else if (iVar instanceof g1) {
            g1 g1Var = (g1) iVar;
            this.f59151h = g1Var.b();
            this.f59150g = (d0) g1Var.a();
            return;
        } else {
            this.f59151h = org.bouncycastle.crypto.k.b();
            b0Var = (d0) iVar;
        }
        this.f59150g = b0Var;
    }

    @Override // org.bouncycastle.crypto.l
    public boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = new BigInteger(1, org.bouncycastle.util.a.P(bArr));
        BigInteger e11 = this.f59150g.b().e();
        BigInteger bigInteger4 = n60.d.f40585b;
        if (bigInteger.compareTo(bigInteger4) < 0 || bigInteger.compareTo(e11) >= 0 || bigInteger2.compareTo(bigInteger4) < 0 || bigInteger2.compareTo(e11) >= 0) {
            return false;
        }
        BigInteger k11 = r70.a.k(e11, bigInteger3);
        n60.i A = n60.c.r(this.f59150g.b().b(), bigInteger2.multiply(k11).mod(e11), ((e0) this.f59150g).c(), e11.subtract(bigInteger).multiply(k11).mod(e11)).A();
        if (A.u()) {
            return false;
        }
        return A.f().t().mod(e11).equals(bigInteger);
    }
}