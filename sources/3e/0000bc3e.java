package w40;

/* loaded from: classes5.dex */
public class h extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private e50.b f55508a;

    public h(org.bouncycastle.asn1.k kVar, e40.b bVar) {
        this.f55508a = new e50.b(kVar, bVar);
    }

    private h(org.bouncycastle.asn1.p pVar) {
        this.f55508a = e50.b.f(pVar);
    }

    public static h f(Object obj) {
        if (obj instanceof h) {
            return (h) obj;
        }
        if (obj != null) {
            return new h(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public org.bouncycastle.asn1.k e() {
        return this.f55508a.e();
    }

    public e40.b h() {
        return this.f55508a.i();
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        return this.f55508a.toASN1Primitive();
    }
}