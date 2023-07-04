package e50;

/* loaded from: classes5.dex */
public class b extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.asn1.k f24661a;

    /* renamed from: b  reason: collision with root package name */
    private e40.b f24662b;

    public b(org.bouncycastle.asn1.k kVar) {
        this.f24661a = kVar;
    }

    public b(org.bouncycastle.asn1.k kVar, e40.b bVar) {
        this.f24661a = kVar;
        this.f24662b = bVar;
    }

    private b(org.bouncycastle.asn1.p pVar) {
        if (pVar.size() >= 1 && pVar.size() <= 2) {
            this.f24661a = org.bouncycastle.asn1.k.u(pVar.r(0));
            this.f24662b = pVar.size() == 2 ? pVar.r(1) : null;
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
    }

    public static b f(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj != null) {
            return new b(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public static b h(org.bouncycastle.asn1.s sVar, boolean z11) {
        return f(org.bouncycastle.asn1.p.q(sVar, z11));
    }

    public org.bouncycastle.asn1.k e() {
        return this.f24661a;
    }

    public e40.b i() {
        return this.f24662b;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(this.f24661a);
        e40.b bVar = this.f24662b;
        if (bVar != null) {
            dVar.a(bVar);
        }
        return new org.bouncycastle.asn1.w0(dVar);
    }
}