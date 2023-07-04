package e50;

/* loaded from: classes5.dex */
public class a0 extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    x f24658a;

    /* renamed from: b  reason: collision with root package name */
    org.bouncycastle.asn1.i f24659b;

    /* renamed from: c  reason: collision with root package name */
    org.bouncycastle.asn1.j0 f24660c;

    private a0(org.bouncycastle.asn1.p pVar) {
        if (pVar.size() != 2 && pVar.size() != 3) {
            throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
        }
        this.f24658a = x.f(pVar.r(0));
        this.f24659b = org.bouncycastle.asn1.i.p(pVar.r(1));
        if (pVar.size() == 3) {
            this.f24660c = org.bouncycastle.asn1.j0.v(pVar.r(2));
        }
    }

    public static a0 e(Object obj) {
        if (obj instanceof a0) {
            return (a0) obj;
        }
        if (obj != null) {
            return new a0(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public static a0 f(org.bouncycastle.asn1.s sVar, boolean z11) {
        return e(org.bouncycastle.asn1.p.q(sVar, z11));
    }

    public x h() {
        return this.f24658a;
    }

    public org.bouncycastle.asn1.i i() {
        return this.f24659b;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(3);
        dVar.a(this.f24658a);
        dVar.a(this.f24659b);
        org.bouncycastle.asn1.j0 j0Var = this.f24660c;
        if (j0Var != null) {
            dVar.a(j0Var);
        }
        return new org.bouncycastle.asn1.w0(dVar);
    }
}