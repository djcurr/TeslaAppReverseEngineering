package e50;

/* loaded from: classes5.dex */
public class a extends e40.c {

    /* renamed from: c  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24655c;

    /* renamed from: a  reason: collision with root package name */
    org.bouncycastle.asn1.k f24656a;

    /* renamed from: b  reason: collision with root package name */
    w f24657b;

    static {
        new org.bouncycastle.asn1.k("1.3.6.1.5.5.7.48.2");
        f24655c = new org.bouncycastle.asn1.k("1.3.6.1.5.5.7.48.1");
    }

    private a(org.bouncycastle.asn1.p pVar) {
        this.f24656a = null;
        this.f24657b = null;
        if (pVar.size() != 2) {
            throw new IllegalArgumentException("wrong number of elements in sequence");
        }
        this.f24656a = org.bouncycastle.asn1.k.u(pVar.r(0));
        this.f24657b = w.f(pVar.r(1));
    }

    public static a h(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj != null) {
            return new a(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public w e() {
        return this.f24657b;
    }

    public org.bouncycastle.asn1.k f() {
        return this.f24656a;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(this.f24656a);
        dVar.a(this.f24657b);
        return new org.bouncycastle.asn1.w0(dVar);
    }

    public String toString() {
        return "AccessDescription: Oid(" + this.f24656a.t() + ")";
    }
}