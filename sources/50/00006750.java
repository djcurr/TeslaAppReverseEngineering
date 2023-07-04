package e50;

import java.math.BigInteger;
import java.util.Enumeration;

/* loaded from: classes5.dex */
public class q extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    org.bouncycastle.asn1.i f24766a;

    /* renamed from: b  reason: collision with root package name */
    org.bouncycastle.asn1.i f24767b;

    /* renamed from: c  reason: collision with root package name */
    org.bouncycastle.asn1.i f24768c;

    public q(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f24766a = new org.bouncycastle.asn1.i(bigInteger);
        this.f24767b = new org.bouncycastle.asn1.i(bigInteger2);
        this.f24768c = new org.bouncycastle.asn1.i(bigInteger3);
    }

    private q(org.bouncycastle.asn1.p pVar) {
        if (pVar.size() != 3) {
            throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
        }
        Enumeration s11 = pVar.s();
        this.f24766a = org.bouncycastle.asn1.i.p(s11.nextElement());
        this.f24767b = org.bouncycastle.asn1.i.p(s11.nextElement());
        this.f24768c = org.bouncycastle.asn1.i.p(s11.nextElement());
    }

    public static q f(Object obj) {
        if (obj instanceof q) {
            return (q) obj;
        }
        if (obj != null) {
            return new q(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public BigInteger e() {
        return this.f24768c.r();
    }

    public BigInteger h() {
        return this.f24766a.r();
    }

    public BigInteger i() {
        return this.f24767b.r();
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(3);
        dVar.a(this.f24766a);
        dVar.a(this.f24767b);
        dVar.a(this.f24768c);
        return new org.bouncycastle.asn1.w0(dVar);
    }
}