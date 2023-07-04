package e50;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class l extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private BigInteger f24723a;

    public l(BigInteger bigInteger) {
        if (r70.a.f49293a.compareTo(bigInteger) > 0) {
            throw new IllegalArgumentException("Invalid CRL number : not in (0..MAX)");
        }
        this.f24723a = bigInteger;
    }

    public BigInteger e() {
        return this.f24723a;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        return new org.bouncycastle.asn1.i(this.f24723a);
    }

    public String toString() {
        return "CRLNumber: " + e();
    }
}