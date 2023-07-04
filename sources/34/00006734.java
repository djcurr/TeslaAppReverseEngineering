package e50;

/* loaded from: classes5.dex */
public class e extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.asn1.k f24678a;

    /* renamed from: b  reason: collision with root package name */
    private org.bouncycastle.asn1.q f24679b;

    private e(org.bouncycastle.asn1.p pVar) {
        if (pVar.size() == 2) {
            this.f24678a = org.bouncycastle.asn1.k.u(pVar.r(0));
            this.f24679b = org.bouncycastle.asn1.q.q(pVar.r(1));
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
    }

    public static e f(Object obj) {
        if (obj instanceof e) {
            return (e) obj;
        }
        if (obj != null) {
            return new e(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public org.bouncycastle.asn1.k e() {
        return new org.bouncycastle.asn1.k(this.f24678a.t());
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(this.f24678a);
        dVar.a(this.f24679b);
        return new org.bouncycastle.asn1.w0(dVar);
    }
}