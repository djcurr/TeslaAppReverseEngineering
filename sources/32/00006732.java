package e50;

/* loaded from: classes5.dex */
public class d extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    org.bouncycastle.asn1.g f24675a;

    /* renamed from: b  reason: collision with root package name */
    org.bouncycastle.asn1.g f24676b;

    private d(org.bouncycastle.asn1.p pVar) {
        if (pVar.size() == 2) {
            this.f24675a = org.bouncycastle.asn1.g.t(pVar.r(0));
            this.f24676b = org.bouncycastle.asn1.g.t(pVar.r(1));
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
    }

    public static d e(Object obj) {
        if (obj instanceof d) {
            return (d) obj;
        }
        if (obj != null) {
            return new d(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public org.bouncycastle.asn1.g f() {
        return this.f24676b;
    }

    public org.bouncycastle.asn1.g h() {
        return this.f24675a;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(this.f24675a);
        dVar.a(this.f24676b);
        return new org.bouncycastle.asn1.w0(dVar);
    }
}