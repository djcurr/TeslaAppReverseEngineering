package w40;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class d extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    org.bouncycastle.asn1.i f55501a;

    /* renamed from: b  reason: collision with root package name */
    org.bouncycastle.asn1.i f55502b;

    /* renamed from: c  reason: collision with root package name */
    org.bouncycastle.asn1.i f55503c;

    public d(BigInteger bigInteger, BigInteger bigInteger2, int i11) {
        this.f55501a = new org.bouncycastle.asn1.i(bigInteger);
        this.f55502b = new org.bouncycastle.asn1.i(bigInteger2);
        this.f55503c = i11 != 0 ? new org.bouncycastle.asn1.i(i11) : null;
    }

    private d(org.bouncycastle.asn1.p pVar) {
        Enumeration s11 = pVar.s();
        this.f55501a = org.bouncycastle.asn1.i.p(s11.nextElement());
        this.f55502b = org.bouncycastle.asn1.i.p(s11.nextElement());
        this.f55503c = s11.hasMoreElements() ? (org.bouncycastle.asn1.i) s11.nextElement() : null;
    }

    public static d f(Object obj) {
        if (obj instanceof d) {
            return (d) obj;
        }
        if (obj != null) {
            return new d(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public BigInteger e() {
        return this.f55502b.r();
    }

    public BigInteger h() {
        org.bouncycastle.asn1.i iVar = this.f55503c;
        if (iVar == null) {
            return null;
        }
        return iVar.r();
    }

    public BigInteger i() {
        return this.f55501a.r();
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(3);
        dVar.a(this.f55501a);
        dVar.a(this.f55502b);
        if (h() != null) {
            dVar.a(this.f55503c);
        }
        return new w0(dVar);
    }
}