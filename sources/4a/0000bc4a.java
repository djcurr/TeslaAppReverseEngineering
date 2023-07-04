package w40;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class t extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private BigInteger f55586a;

    /* renamed from: b  reason: collision with root package name */
    private BigInteger f55587b;

    public t(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f55586a = bigInteger;
        this.f55587b = bigInteger2;
    }

    private t(org.bouncycastle.asn1.p pVar) {
        if (pVar.size() == 2) {
            Enumeration s11 = pVar.s();
            this.f55586a = org.bouncycastle.asn1.i.p(s11.nextElement()).r();
            this.f55587b = org.bouncycastle.asn1.i.p(s11.nextElement()).r();
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
    }

    public static t e(Object obj) {
        if (obj instanceof t) {
            return (t) obj;
        }
        if (obj != null) {
            return new t(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public BigInteger f() {
        return this.f55586a;
    }

    public BigInteger h() {
        return this.f55587b;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(new org.bouncycastle.asn1.i(f()));
        dVar.a(new org.bouncycastle.asn1.i(h()));
        return new w0(dVar);
    }
}