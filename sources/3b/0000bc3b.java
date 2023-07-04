package w40;

import org.bouncycastle.asn1.b0;
import org.bouncycastle.asn1.f0;

/* loaded from: classes5.dex */
public class e extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    org.bouncycastle.asn1.p f55504a;

    public e(org.bouncycastle.asn1.k kVar, e50.b bVar, e40.b bVar2) {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(3);
        dVar.a(kVar);
        dVar.a(bVar.toASN1Primitive());
        dVar.a(new f0(false, 0, bVar2));
        this.f55504a = new b0(dVar);
    }

    private e(org.bouncycastle.asn1.p pVar) {
        if (!((org.bouncycastle.asn1.i) pVar.r(0)).t(0)) {
            throw new IllegalArgumentException("sequence not version 0");
        }
        this.f55504a = org.bouncycastle.asn1.p.p(pVar.r(1));
    }

    public static e h(Object obj) {
        if (obj instanceof e) {
            return (e) obj;
        }
        if (obj != null) {
            return new e(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public org.bouncycastle.asn1.l e() {
        if (this.f55504a.size() == 3) {
            return org.bouncycastle.asn1.l.q(org.bouncycastle.asn1.s.p(this.f55504a.r(2)), false);
        }
        return null;
    }

    public e50.b f() {
        return e50.b.f(this.f55504a.r(1));
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(new org.bouncycastle.asn1.i(0L));
        dVar.a(this.f55504a);
        return new b0(dVar);
    }
}