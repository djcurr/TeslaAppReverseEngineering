package y50;

import java.math.BigInteger;
import java.security.SecureRandom;
import u50.g1;
import u50.s0;
import u50.t0;
import u50.u0;
import u50.v0;

/* loaded from: classes5.dex */
public class k implements org.bouncycastle.crypto.m {

    /* renamed from: g  reason: collision with root package name */
    s0 f59166g;

    /* renamed from: h  reason: collision with root package name */
    SecureRandom f59167h;

    @Override // org.bouncycastle.crypto.l
    public BigInteger[] generateSignature(byte[] bArr) {
        BigInteger e11;
        BigInteger bigInteger = new BigInteger(1, org.bouncycastle.util.a.P(bArr));
        t0 b11 = this.f59166g.b();
        do {
            e11 = r70.a.e(b11.c().bitLength(), this.f59167h);
        } while (e11.compareTo(b11.c()) >= 0);
        BigInteger mod = b11.a().modPow(e11, b11.b()).mod(b11.c());
        return new BigInteger[]{mod, e11.multiply(bigInteger).add(((u0) this.f59166g).c().multiply(mod)).mod(b11.c())};
    }

    @Override // org.bouncycastle.crypto.m
    public BigInteger getOrder() {
        return this.f59166g.b().c();
    }

    @Override // org.bouncycastle.crypto.l
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        s0 s0Var;
        if (!z11) {
            s0Var = (v0) iVar;
        } else if (iVar instanceof g1) {
            g1 g1Var = (g1) iVar;
            this.f59167h = g1Var.b();
            this.f59166g = (u0) g1Var.a();
            return;
        } else {
            this.f59167h = org.bouncycastle.crypto.k.b();
            s0Var = (u0) iVar;
        }
        this.f59166g = s0Var;
    }

    @Override // org.bouncycastle.crypto.l
    public boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = new BigInteger(1, org.bouncycastle.util.a.P(bArr));
        t0 b11 = this.f59166g.b();
        BigInteger valueOf = BigInteger.valueOf(0L);
        if (valueOf.compareTo(bigInteger) >= 0 || b11.c().compareTo(bigInteger) <= 0 || valueOf.compareTo(bigInteger2) >= 0 || b11.c().compareTo(bigInteger2) <= 0) {
            return false;
        }
        BigInteger modPow = bigInteger3.modPow(b11.c().subtract(new BigInteger("2")), b11.c());
        return b11.a().modPow(bigInteger2.multiply(modPow).mod(b11.c()), b11.b()).multiply(((v0) this.f59166g).c().modPow(b11.c().subtract(bigInteger).multiply(modPow).mod(b11.c()), b11.b())).mod(b11.b()).mod(b11.c()).equals(bigInteger);
    }
}