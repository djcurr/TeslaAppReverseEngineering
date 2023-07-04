package w40;

/* loaded from: classes5.dex */
public class g extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private e50.b f55507a;

    public g(org.bouncycastle.asn1.k kVar) {
        this.f55507a = new e50.b(kVar);
    }

    public g(org.bouncycastle.asn1.k kVar, e40.b bVar) {
        this.f55507a = new e50.b(kVar, bVar);
    }

    private g(org.bouncycastle.asn1.p pVar) {
        this.f55507a = e50.b.f(pVar);
    }

    public static g f(Object obj) {
        if (obj instanceof g) {
            return (g) obj;
        }
        if (obj != null) {
            return new g(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public org.bouncycastle.asn1.k e() {
        return this.f55507a.e();
    }

    public e40.b h() {
        return this.f55507a.i();
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        return this.f55507a.toASN1Primitive();
    }
}