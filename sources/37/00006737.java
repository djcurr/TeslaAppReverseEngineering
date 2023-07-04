package e50;

/* loaded from: classes5.dex */
public class f0 extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    org.bouncycastle.asn1.e f24685a;

    /* renamed from: b  reason: collision with root package name */
    org.bouncycastle.asn1.k f24686b;

    /* renamed from: c  reason: collision with root package name */
    b f24687c;

    /* renamed from: d  reason: collision with root package name */
    org.bouncycastle.asn1.j0 f24688d;

    private f0(org.bouncycastle.asn1.p pVar) {
        if (pVar.size() > 4 || pVar.size() < 3) {
            throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
        }
        int i11 = 0;
        this.f24685a = org.bouncycastle.asn1.e.q(pVar.r(0));
        if (pVar.size() == 4) {
            this.f24686b = org.bouncycastle.asn1.k.u(pVar.r(1));
            i11 = 1;
        }
        this.f24687c = b.f(pVar.r(i11 + 1));
        this.f24688d = org.bouncycastle.asn1.j0.v(pVar.r(i11 + 2));
    }

    public static f0 h(Object obj) {
        if (obj instanceof f0) {
            return (f0) obj;
        }
        if (obj != null) {
            return new f0(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public static f0 i(org.bouncycastle.asn1.s sVar, boolean z11) {
        return h(org.bouncycastle.asn1.p.q(sVar, z11));
    }

    public b e() {
        return this.f24687c;
    }

    public org.bouncycastle.asn1.e f() {
        return this.f24685a;
    }

    public org.bouncycastle.asn1.j0 j() {
        return this.f24688d;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(4);
        dVar.a(this.f24685a);
        org.bouncycastle.asn1.k kVar = this.f24686b;
        if (kVar != null) {
            dVar.a(kVar);
        }
        dVar.a(this.f24687c);
        dVar.a(this.f24688d);
        return new org.bouncycastle.asn1.w0(dVar);
    }
}