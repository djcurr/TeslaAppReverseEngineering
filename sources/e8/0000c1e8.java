package y50;

import java.math.BigInteger;
import java.security.SecureRandom;
import u50.g1;

/* loaded from: classes5.dex */
public class c implements org.bouncycastle.crypto.m {

    /* renamed from: g  reason: collision with root package name */
    private final b f59141g;

    /* renamed from: h  reason: collision with root package name */
    private u50.p f59142h;

    /* renamed from: i  reason: collision with root package name */
    private SecureRandom f59143i;

    public c() {
        this.f59141g = new q();
    }

    public c(b bVar) {
        this.f59141g = bVar;
    }

    private BigInteger a(BigInteger bigInteger, byte[] bArr) {
        if (bigInteger.bitLength() >= bArr.length * 8) {
            return new BigInteger(1, bArr);
        }
        int bitLength = bigInteger.bitLength() / 8;
        byte[] bArr2 = new byte[bitLength];
        System.arraycopy(bArr, 0, bArr2, 0, bitLength);
        return new BigInteger(1, bArr2);
    }

    private BigInteger b(BigInteger bigInteger, SecureRandom secureRandom) {
        return r70.a.e(7, org.bouncycastle.crypto.k.c(secureRandom)).add(BigInteger.valueOf(128L)).multiply(bigInteger);
    }

    protected SecureRandom c(boolean z11, SecureRandom secureRandom) {
        if (z11) {
            return org.bouncycastle.crypto.k.c(secureRandom);
        }
        return null;
    }

    @Override // org.bouncycastle.crypto.l
    public BigInteger[] generateSignature(byte[] bArr) {
        u50.r b11 = this.f59142h.b();
        BigInteger c11 = b11.c();
        BigInteger a11 = a(c11, bArr);
        BigInteger c12 = ((u50.s) this.f59142h).c();
        if (this.f59141g.isDeterministic()) {
            this.f59141g.init(c11, c12, bArr);
        } else {
            this.f59141g.init(c11, this.f59143i);
        }
        BigInteger nextK = this.f59141g.nextK();
        BigInteger mod = b11.a().modPow(nextK.add(b(c11, this.f59143i)), b11.b()).mod(c11);
        return new BigInteger[]{mod, r70.a.j(c11, nextK).multiply(a11.add(c12.multiply(mod))).mod(c11)};
    }

    @Override // org.bouncycastle.crypto.m
    public BigInteger getOrder() {
        return this.f59142h.b().c();
    }

    @Override // org.bouncycastle.crypto.l
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        u50.p pVar;
        SecureRandom secureRandom;
        if (!z11) {
            pVar = (u50.t) iVar;
        } else if (iVar instanceof g1) {
            g1 g1Var = (g1) iVar;
            this.f59142h = (u50.s) g1Var.a();
            secureRandom = g1Var.b();
            this.f59143i = c((z11 || this.f59141g.isDeterministic()) ? false : true, secureRandom);
        } else {
            pVar = (u50.s) iVar;
        }
        this.f59142h = pVar;
        secureRandom = null;
        this.f59143i = c((z11 || this.f59141g.isDeterministic()) ? false : true, secureRandom);
    }

    @Override // org.bouncycastle.crypto.l
    public boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        u50.r b11 = this.f59142h.b();
        BigInteger c11 = b11.c();
        BigInteger a11 = a(c11, bArr);
        BigInteger valueOf = BigInteger.valueOf(0L);
        if (valueOf.compareTo(bigInteger) >= 0 || c11.compareTo(bigInteger) <= 0 || valueOf.compareTo(bigInteger2) >= 0 || c11.compareTo(bigInteger2) <= 0) {
            return false;
        }
        BigInteger k11 = r70.a.k(c11, bigInteger2);
        BigInteger mod = a11.multiply(k11).mod(c11);
        BigInteger mod2 = bigInteger.multiply(k11).mod(c11);
        BigInteger b12 = b11.b();
        return b11.a().modPow(mod, b12).multiply(((u50.t) this.f59142h).c().modPow(mod2, b12)).mod(b12).mod(c11).equals(bigInteger);
    }
}