package e50;

import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class o0 extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    org.bouncycastle.asn1.p f24749a;

    /* renamed from: b  reason: collision with root package name */
    org.bouncycastle.asn1.i f24750b;

    /* renamed from: c  reason: collision with root package name */
    org.bouncycastle.asn1.i f24751c;

    /* renamed from: d  reason: collision with root package name */
    b f24752d;

    /* renamed from: e  reason: collision with root package name */
    c50.c f24753e;

    /* renamed from: f  reason: collision with root package name */
    t0 f24754f;

    /* renamed from: g  reason: collision with root package name */
    t0 f24755g;

    /* renamed from: h  reason: collision with root package name */
    c50.c f24756h;

    /* renamed from: i  reason: collision with root package name */
    m0 f24757i;

    /* renamed from: j  reason: collision with root package name */
    org.bouncycastle.asn1.j0 f24758j;

    /* renamed from: k  reason: collision with root package name */
    org.bouncycastle.asn1.j0 f24759k;

    /* renamed from: l  reason: collision with root package name */
    v f24760l;

    private o0(org.bouncycastle.asn1.p pVar) {
        int i11;
        boolean z11;
        boolean z12;
        this.f24749a = pVar;
        if (pVar.r(0) instanceof org.bouncycastle.asn1.s) {
            this.f24750b = org.bouncycastle.asn1.i.q((org.bouncycastle.asn1.s) pVar.r(0), true);
            i11 = 0;
        } else {
            this.f24750b = new org.bouncycastle.asn1.i(0L);
            i11 = -1;
        }
        if (this.f24750b.t(0)) {
            z12 = false;
            z11 = true;
        } else if (this.f24750b.t(1)) {
            z11 = false;
            z12 = true;
        } else if (!this.f24750b.t(2)) {
            throw new IllegalArgumentException("version number not recognised");
        } else {
            z11 = false;
            z12 = false;
        }
        this.f24751c = org.bouncycastle.asn1.i.p(pVar.r(i11 + 1));
        this.f24752d = b.f(pVar.r(i11 + 2));
        this.f24753e = c50.c.f(pVar.r(i11 + 3));
        org.bouncycastle.asn1.p pVar2 = (org.bouncycastle.asn1.p) pVar.r(i11 + 4);
        this.f24754f = t0.f(pVar2.r(0));
        this.f24755g = t0.f(pVar2.r(1));
        this.f24756h = c50.c.f(pVar.r(i11 + 5));
        int i12 = i11 + 6;
        this.f24757i = m0.h(pVar.r(i12));
        int size = (pVar.size() - i12) - 1;
        if (size != 0 && z11) {
            throw new IllegalArgumentException("version 1 certificate contains extra data");
        }
        while (size > 0) {
            org.bouncycastle.asn1.s sVar = (org.bouncycastle.asn1.s) pVar.r(i12 + size);
            int s11 = sVar.s();
            if (s11 == 1) {
                this.f24758j = org.bouncycastle.asn1.j0.w(sVar, false);
            } else if (s11 == 2) {
                this.f24759k = org.bouncycastle.asn1.j0.w(sVar, false);
            } else if (s11 != 3) {
                throw new IllegalArgumentException("Unknown tag encountered in structure: " + sVar.s());
            } else if (z12) {
                throw new IllegalArgumentException("version 2 certificate cannot contain extensions");
            } else {
                this.f24760l = v.f(org.bouncycastle.asn1.p.q(sVar, true));
            }
            size--;
        }
    }

    public static o0 h(Object obj) {
        if (obj instanceof o0) {
            return (o0) obj;
        }
        if (obj != null) {
            return new o0(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public t0 e() {
        return this.f24755g;
    }

    public v f() {
        return this.f24760l;
    }

    public c50.c i() {
        return this.f24753e;
    }

    public org.bouncycastle.asn1.j0 j() {
        return this.f24758j;
    }

    public org.bouncycastle.asn1.i k() {
        return this.f24751c;
    }

    public b m() {
        return this.f24752d;
    }

    public t0 n() {
        return this.f24754f;
    }

    public c50.c o() {
        return this.f24756h;
    }

    public m0 p() {
        return this.f24757i;
    }

    public org.bouncycastle.asn1.j0 q() {
        return this.f24759k;
    }

    public int r() {
        return this.f24750b.x() + 1;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        if (r70.j.b("org.bouncycastle.x509.allow_non-der_tbscert") != null && !r70.j.c("org.bouncycastle.x509.allow_non-der_tbscert")) {
            org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d();
            if (!this.f24750b.t(0)) {
                dVar.a(new z0(true, 0, this.f24750b));
            }
            dVar.a(this.f24751c);
            dVar.a(this.f24752d);
            dVar.a(this.f24753e);
            org.bouncycastle.asn1.d dVar2 = new org.bouncycastle.asn1.d(2);
            dVar2.a(this.f24754f);
            dVar2.a(this.f24755g);
            dVar.a(new org.bouncycastle.asn1.w0(dVar2));
            e40.b bVar = this.f24756h;
            if (bVar == null) {
                bVar = new org.bouncycastle.asn1.w0();
            }
            dVar.a(bVar);
            dVar.a(this.f24757i);
            org.bouncycastle.asn1.j0 j0Var = this.f24758j;
            if (j0Var != null) {
                dVar.a(new z0(false, 1, j0Var));
            }
            org.bouncycastle.asn1.j0 j0Var2 = this.f24759k;
            if (j0Var2 != null) {
                dVar.a(new z0(false, 2, j0Var2));
            }
            v vVar = this.f24760l;
            if (vVar != null) {
                dVar.a(new z0(true, 3, vVar));
            }
            return new org.bouncycastle.asn1.w0(dVar);
        }
        return this.f24749a;
    }
}