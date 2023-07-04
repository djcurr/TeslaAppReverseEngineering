package e50;

/* loaded from: classes5.dex */
public class j0 extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.asn1.k f24720a;

    /* renamed from: b  reason: collision with root package name */
    private e40.b f24721b;

    public j0(org.bouncycastle.asn1.p pVar) {
        if (pVar.size() == 2) {
            this.f24720a = org.bouncycastle.asn1.k.u(pVar.r(0));
            this.f24721b = pVar.r(1);
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
    }

    public static j0 e(Object obj) {
        if (obj instanceof j0) {
            return (j0) obj;
        }
        if (obj != null) {
            return new j0(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(this.f24720a);
        dVar.a(this.f24721b);
        return new org.bouncycastle.asn1.w0(dVar);
    }
}