package y50;

import java.math.BigInteger;
import java.security.SecureRandom;
import u50.b0;
import u50.d0;
import u50.e0;
import u50.g1;
import u50.y;

/* loaded from: classes5.dex */
public class e implements n60.d, org.bouncycastle.crypto.m {

    /* renamed from: g  reason: collision with root package name */
    private final b f59147g;

    /* renamed from: h  reason: collision with root package name */
    private b0 f59148h;

    /* renamed from: i  reason: collision with root package name */
    private SecureRandom f59149i;

    public e() {
        this.f59147g = new q();
    }

    public e(b bVar) {
        this.f59147g = bVar;
    }

    protected BigInteger a(BigInteger bigInteger, byte[] bArr) {
        int bitLength = bigInteger.bitLength();
        int length = bArr.length * 8;
        BigInteger bigInteger2 = new BigInteger(1, bArr);
        return bitLength < length ? bigInteger2.shiftRight(length - bitLength) : bigInteger2;
    }

    protected n60.h b() {
        return new n60.k();
    }

    protected n60.f c(int i11, n60.i iVar) {
        if (i11 != 1) {
            if (i11 == 2 || i11 == 3 || i11 == 4) {
                return iVar.s(0).o();
            }
            if (i11 != 6 && i11 != 7) {
                return null;
            }
        }
        return iVar.s(0);
    }

    protected SecureRandom d(boolean z11, SecureRandom secureRandom) {
        if (z11) {
            return org.bouncycastle.crypto.k.c(secureRandom);
        }
        return null;
    }

    @Override // org.bouncycastle.crypto.l
    public BigInteger[] generateSignature(byte[] bArr) {
        y b11 = this.f59148h.b();
        BigInteger e11 = b11.e();
        BigInteger a11 = a(e11, bArr);
        BigInteger c11 = ((d0) this.f59148h).c();
        if (this.f59147g.isDeterministic()) {
            this.f59147g.init(e11, c11, bArr);
        } else {
            this.f59147g.init(e11, this.f59149i);
        }
        n60.h b12 = b();
        while (true) {
            BigInteger nextK = this.f59147g.nextK();
            BigInteger mod = b12.a(b11.b(), nextK).A().f().t().mod(e11);
            BigInteger bigInteger = n60.d.f40584a;
            if (!mod.equals(bigInteger)) {
                BigInteger mod2 = r70.a.j(e11, nextK).multiply(a11.add(c11.multiply(mod))).mod(e11);
                if (!mod2.equals(bigInteger)) {
                    return new BigInteger[]{mod, mod2};
                }
            }
        }
    }

    @Override // org.bouncycastle.crypto.m
    public BigInteger getOrder() {
        return this.f59148h.b().e();
    }

    @Override // org.bouncycastle.crypto.l
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        b0 b0Var;
        SecureRandom secureRandom;
        if (!z11) {
            b0Var = (e0) iVar;
        } else if (iVar instanceof g1) {
            g1 g1Var = (g1) iVar;
            this.f59148h = (d0) g1Var.a();
            secureRandom = g1Var.b();
            this.f59149i = d((z11 || this.f59147g.isDeterministic()) ? false : true, secureRandom);
        } else {
            b0Var = (d0) iVar;
        }
        this.f59148h = b0Var;
        secureRandom = null;
        this.f59149i = d((z11 || this.f59147g.isDeterministic()) ? false : true, secureRandom);
    }

    @Override // org.bouncycastle.crypto.l
    public boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger p11;
        n60.f c11;
        y b11 = this.f59148h.b();
        BigInteger e11 = b11.e();
        BigInteger a11 = a(e11, bArr);
        BigInteger bigInteger3 = n60.d.f40585b;
        if (bigInteger.compareTo(bigInteger3) < 0 || bigInteger.compareTo(e11) >= 0 || bigInteger2.compareTo(bigInteger3) < 0 || bigInteger2.compareTo(e11) >= 0) {
            return false;
        }
        BigInteger k11 = r70.a.k(e11, bigInteger2);
        n60.i r11 = n60.c.r(b11.b(), a11.multiply(k11).mod(e11), ((e0) this.f59148h).c(), bigInteger.multiply(k11).mod(e11));
        if (r11.u()) {
            return false;
        }
        n60.e i11 = r11.i();
        if (i11 == null || (p11 = i11.p()) == null || p11.compareTo(n60.d.f40589f) > 0 || (c11 = c(i11.q(), r11)) == null || c11.i()) {
            return r11.A().f().t().mod(e11).equals(bigInteger);
        }
        n60.f q11 = r11.q();
        while (i11.y(bigInteger)) {
            if (i11.m(bigInteger).j(c11).equals(q11)) {
                return true;
            }
            bigInteger = bigInteger.add(e11);
        }
        return false;
    }
}