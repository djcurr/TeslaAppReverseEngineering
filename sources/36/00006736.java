package e50;

/* loaded from: classes5.dex */
public class f extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    g f24682a;

    /* renamed from: b  reason: collision with root package name */
    b f24683b;

    /* renamed from: c  reason: collision with root package name */
    org.bouncycastle.asn1.j0 f24684c;

    public f(org.bouncycastle.asn1.p pVar) {
        if (pVar.size() == 3) {
            this.f24682a = g.j(pVar.r(0));
            this.f24683b = b.f(pVar.r(1));
            this.f24684c = org.bouncycastle.asn1.j0.v(pVar.r(2));
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
    }

    public static f f(Object obj) {
        if (obj instanceof f) {
            return (f) obj;
        }
        if (obj != null) {
            return new f(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public g e() {
        return this.f24682a;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(3);
        dVar.a(this.f24682a);
        dVar.a(this.f24683b);
        dVar.a(this.f24684c);
        return new org.bouncycastle.asn1.w0(dVar);
    }
}