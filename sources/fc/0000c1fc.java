package y50;

import java.math.BigInteger;
import org.bouncycastle.asn1.w0;
import org.spongycastle.asn1.ASN1Encoding;

/* loaded from: classes5.dex */
public class s implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final s f59208a = new s();

    @Override // y50.a
    public BigInteger[] a(BigInteger bigInteger, byte[] bArr) {
        org.bouncycastle.asn1.p pVar = (org.bouncycastle.asn1.p) org.bouncycastle.asn1.n.k(bArr);
        if (pVar.size() == 2) {
            BigInteger d11 = d(bigInteger, pVar, 0);
            BigInteger d12 = d(bigInteger, pVar, 1);
            if (org.bouncycastle.util.a.c(b(bigInteger, d11, d12), bArr)) {
                return new BigInteger[]{d11, d12};
            }
        }
        throw new IllegalArgumentException("Malformed signature");
    }

    @Override // y50.a
    public byte[] b(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d();
        e(bigInteger, dVar, bigInteger2);
        e(bigInteger, dVar, bigInteger3);
        return new w0(dVar).d(ASN1Encoding.DER);
    }

    protected BigInteger c(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger2.signum() < 0 || (bigInteger != null && bigInteger2.compareTo(bigInteger) >= 0)) {
            throw new IllegalArgumentException("Value out of range");
        }
        return bigInteger2;
    }

    protected BigInteger d(BigInteger bigInteger, org.bouncycastle.asn1.p pVar, int i11) {
        return c(bigInteger, ((org.bouncycastle.asn1.i) pVar.r(i11)).s());
    }

    protected void e(BigInteger bigInteger, org.bouncycastle.asn1.d dVar, BigInteger bigInteger2) {
        dVar.a(new org.bouncycastle.asn1.i(c(bigInteger, bigInteger2)));
    }
}