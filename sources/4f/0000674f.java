package e50;

/* loaded from: classes5.dex */
public class p0 extends e40.c implements y0, w40.n {

    /* renamed from: a  reason: collision with root package name */
    org.bouncycastle.asn1.p f24763a;

    /* renamed from: b  reason: collision with root package name */
    c50.c f24764b;

    /* renamed from: c  reason: collision with root package name */
    c50.c f24765c;

    public p0(org.bouncycastle.asn1.p pVar) {
        int i11;
        this.f24763a = pVar;
        if (pVar.r(0) instanceof org.bouncycastle.asn1.s) {
            org.bouncycastle.asn1.i.q((org.bouncycastle.asn1.s) pVar.r(0), true);
            i11 = 0;
        } else {
            new org.bouncycastle.asn1.i(0L);
            i11 = -1;
        }
        org.bouncycastle.asn1.i.p(pVar.r(i11 + 1));
        b.f(pVar.r(i11 + 2));
        this.f24764b = c50.c.f(pVar.r(i11 + 3));
        org.bouncycastle.asn1.p pVar2 = (org.bouncycastle.asn1.p) pVar.r(i11 + 4);
        t0.f(pVar2.r(0));
        t0.f(pVar2.r(1));
        this.f24765c = c50.c.f(pVar.r(i11 + 5));
        int i12 = i11 + 6;
        m0.h(pVar.r(i12));
        for (int size = (pVar.size() - i12) - 1; size > 0; size--) {
            org.bouncycastle.asn1.s p11 = org.bouncycastle.asn1.s.p(pVar.r(i12 + size));
            int s11 = p11.s();
            if (s11 == 1 || s11 == 2) {
                org.bouncycastle.asn1.j0.w(p11, false);
            } else if (s11 == 3) {
                w0.e(p11);
            }
        }
    }

    public static p0 e(Object obj) {
        if (obj instanceof p0) {
            return (p0) obj;
        }
        if (obj != null) {
            return new p0(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public c50.c f() {
        return this.f24764b;
    }

    public c50.c h() {
        return this.f24765c;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        return this.f24763a;
    }
}