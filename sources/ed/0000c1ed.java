package y50;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.DataLengthException;
import u50.a0;
import u50.b0;
import u50.d0;
import u50.e0;
import u50.g1;

/* loaded from: classes5.dex */
public class h implements org.bouncycastle.crypto.m {

    /* renamed from: g  reason: collision with root package name */
    private boolean f59154g;

    /* renamed from: h  reason: collision with root package name */
    private b0 f59155h;

    /* renamed from: i  reason: collision with root package name */
    private SecureRandom f59156i;

    private BigInteger a(e0 e0Var, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger e11 = e0Var.b().e();
        if (bigInteger.compareTo(n60.d.f40585b) < 0 || bigInteger.compareTo(e11) >= 0 || bigInteger2.compareTo(n60.d.f40584a) < 0 || bigInteger2.compareTo(e11) >= 0) {
            return null;
        }
        n60.i A = n60.c.r(e0Var.b().b(), bigInteger2, e0Var.c(), bigInteger).A();
        if (A.u()) {
            return null;
        }
        return bigInteger.subtract(A.f().t()).mod(e11);
    }

    @Override // org.bouncycastle.crypto.l
    public BigInteger[] generateSignature(byte[] bArr) {
        org.bouncycastle.crypto.b generateKeyPair;
        BigInteger mod;
        if (this.f59154g) {
            BigInteger order = getOrder();
            BigInteger bigInteger = new BigInteger(1, bArr);
            d0 d0Var = (d0) this.f59155h;
            if (bigInteger.compareTo(order) < 0) {
                do {
                    n50.l lVar = new n50.l();
                    lVar.b(new a0(d0Var.b(), this.f59156i));
                    generateKeyPair = lVar.generateKeyPair();
                    mod = ((e0) generateKeyPair.b()).c().f().t().add(bigInteger).mod(order);
                } while (mod.equals(n60.d.f40584a));
                return new BigInteger[]{mod, ((d0) generateKeyPair.a()).c().subtract(mod.multiply(d0Var.c())).mod(order)};
            }
            throw new DataLengthException("input too large for ECNR key");
        }
        throw new IllegalStateException("not initialised for signing");
    }

    @Override // org.bouncycastle.crypto.m
    public BigInteger getOrder() {
        return this.f59155h.b().e();
    }

    @Override // org.bouncycastle.crypto.l
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        b0 b0Var;
        this.f59154g = z11;
        if (!z11) {
            b0Var = (e0) iVar;
        } else if (iVar instanceof g1) {
            g1 g1Var = (g1) iVar;
            this.f59156i = g1Var.b();
            this.f59155h = (d0) g1Var.a();
            return;
        } else {
            this.f59156i = org.bouncycastle.crypto.k.b();
            b0Var = (d0) iVar;
        }
        this.f59155h = b0Var;
    }

    @Override // org.bouncycastle.crypto.l
    public boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        if (this.f59154g) {
            throw new IllegalStateException("not initialised for verifying");
        }
        e0 e0Var = (e0) this.f59155h;
        BigInteger e11 = e0Var.b().e();
        int bitLength = e11.bitLength();
        BigInteger bigInteger3 = new BigInteger(1, bArr);
        if (bigInteger3.bitLength() <= bitLength) {
            BigInteger a11 = a(e0Var, bigInteger, bigInteger2);
            return a11 != null && a11.equals(bigInteger3.mod(e11));
        }
        throw new DataLengthException("input too large for ECNR key.");
    }
}