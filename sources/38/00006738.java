package e50;

/* loaded from: classes5.dex */
public class g extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.asn1.i f24689a;

    /* renamed from: b  reason: collision with root package name */
    private z f24690b;

    /* renamed from: c  reason: collision with root package name */
    private c f24691c;

    /* renamed from: d  reason: collision with root package name */
    private b f24692d;

    /* renamed from: e  reason: collision with root package name */
    private org.bouncycastle.asn1.i f24693e;

    /* renamed from: f  reason: collision with root package name */
    private d f24694f;

    /* renamed from: g  reason: collision with root package name */
    private org.bouncycastle.asn1.p f24695g;

    /* renamed from: h  reason: collision with root package name */
    private org.bouncycastle.asn1.j0 f24696h;

    /* renamed from: i  reason: collision with root package name */
    private v f24697i;

    private g(org.bouncycastle.asn1.p pVar) {
        if (pVar.size() < 6 || pVar.size() > 9) {
            throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
        }
        int i11 = 0;
        if (pVar.r(0) instanceof org.bouncycastle.asn1.i) {
            this.f24689a = org.bouncycastle.asn1.i.p(pVar.r(0));
            i11 = 1;
        } else {
            this.f24689a = new org.bouncycastle.asn1.i(0L);
        }
        this.f24690b = z.h(pVar.r(i11));
        this.f24691c = c.e(pVar.r(i11 + 1));
        this.f24692d = b.f(pVar.r(i11 + 2));
        this.f24693e = org.bouncycastle.asn1.i.p(pVar.r(i11 + 3));
        this.f24694f = d.e(pVar.r(i11 + 4));
        this.f24695g = org.bouncycastle.asn1.p.p(pVar.r(i11 + 5));
        for (int i12 = i11 + 6; i12 < pVar.size(); i12++) {
            e40.b r11 = pVar.r(i12);
            if (r11 instanceof org.bouncycastle.asn1.j0) {
                this.f24696h = org.bouncycastle.asn1.j0.v(pVar.r(i12));
            } else if ((r11 instanceof org.bouncycastle.asn1.p) || (r11 instanceof v)) {
                this.f24697i = v.f(pVar.r(i12));
            }
        }
    }

    public static g j(Object obj) {
        if (obj instanceof g) {
            return (g) obj;
        }
        if (obj != null) {
            return new g(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public d e() {
        return this.f24694f;
    }

    public org.bouncycastle.asn1.p f() {
        return this.f24695g;
    }

    public v h() {
        return this.f24697i;
    }

    public z i() {
        return this.f24690b;
    }

    public c k() {
        return this.f24691c;
    }

    public org.bouncycastle.asn1.i m() {
        return this.f24693e;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(9);
        if (!this.f24689a.t(0)) {
            dVar.a(this.f24689a);
        }
        dVar.a(this.f24690b);
        dVar.a(this.f24691c);
        dVar.a(this.f24692d);
        dVar.a(this.f24693e);
        dVar.a(this.f24694f);
        dVar.a(this.f24695g);
        org.bouncycastle.asn1.j0 j0Var = this.f24696h;
        if (j0Var != null) {
            dVar.a(j0Var);
        }
        v vVar = this.f24697i;
        if (vVar != null) {
            dVar.a(vVar);
        }
        return new org.bouncycastle.asn1.w0(dVar);
    }
}