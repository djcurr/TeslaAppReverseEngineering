package l50;

import java.math.BigInteger;
import java.security.SecureRandom;
import u50.n1;
import u50.o1;

/* loaded from: classes5.dex */
public class n0 implements org.bouncycastle.crypto.a {

    /* renamed from: d  reason: collision with root package name */
    private static final BigInteger f36812d = BigInteger.valueOf(1);

    /* renamed from: a  reason: collision with root package name */
    private o0 f36813a = new o0();

    /* renamed from: b  reason: collision with root package name */
    private n1 f36814b;

    /* renamed from: c  reason: collision with root package name */
    private SecureRandom f36815c;

    @Override // org.bouncycastle.crypto.a
    public int getInputBlockSize() {
        return this.f36813a.c();
    }

    @Override // org.bouncycastle.crypto.a
    public int getOutputBlockSize() {
        return this.f36813a.d();
    }

    @Override // org.bouncycastle.crypto.a
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        SecureRandom b11;
        this.f36813a.e(z11, iVar);
        if (!(iVar instanceof u50.g1)) {
            n1 n1Var = (n1) iVar;
            this.f36814b = n1Var;
            if (n1Var instanceof o1) {
                b11 = org.bouncycastle.crypto.k.b();
                this.f36815c = b11;
                return;
            }
            this.f36815c = null;
        }
        u50.g1 g1Var = (u50.g1) iVar;
        n1 n1Var2 = (n1) g1Var.a();
        this.f36814b = n1Var2;
        if (n1Var2 instanceof o1) {
            b11 = g1Var.b();
            this.f36815c = b11;
            return;
        }
        this.f36815c = null;
    }

    @Override // org.bouncycastle.crypto.a
    public byte[] processBlock(byte[] bArr, int i11, int i12) {
        BigInteger f11;
        o1 o1Var;
        BigInteger h11;
        if (this.f36814b != null) {
            BigInteger a11 = this.f36813a.a(bArr, i11, i12);
            n1 n1Var = this.f36814b;
            if (!(n1Var instanceof o1) || (h11 = (o1Var = (o1) n1Var).h()) == null) {
                f11 = this.f36813a.f(a11);
            } else {
                BigInteger c11 = o1Var.c();
                BigInteger bigInteger = f36812d;
                BigInteger f12 = r70.a.f(bigInteger, c11.subtract(bigInteger), this.f36815c);
                f11 = this.f36813a.f(f12.modPow(h11, c11).multiply(a11).mod(c11)).multiply(r70.a.j(c11, f12)).mod(c11);
                if (!a11.equals(f11.modPow(h11, c11))) {
                    throw new IllegalStateException("RSA engine faulty decryption/signing detected");
                }
            }
            return this.f36813a.b(f11);
        }
        throw new IllegalStateException("RSA engine not initialised");
    }
}