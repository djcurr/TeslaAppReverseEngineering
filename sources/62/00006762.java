package e50;

import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class z extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    a0 f24850a;

    /* renamed from: b  reason: collision with root package name */
    x f24851b;

    /* renamed from: c  reason: collision with root package name */
    f0 f24852c;

    /* renamed from: d  reason: collision with root package name */
    private int f24853d;

    private z(org.bouncycastle.asn1.p pVar) {
        this.f24853d = 1;
        if (pVar.size() > 3) {
            throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
        }
        for (int i11 = 0; i11 != pVar.size(); i11++) {
            org.bouncycastle.asn1.s p11 = org.bouncycastle.asn1.s.p(pVar.r(i11));
            int s11 = p11.s();
            if (s11 == 0) {
                this.f24850a = a0.f(p11, false);
            } else if (s11 == 1) {
                this.f24851b = x.h(p11, false);
            } else if (s11 != 2) {
                throw new IllegalArgumentException("unknown tag in Holder");
            } else {
                this.f24852c = f0.i(p11, false);
            }
        }
        this.f24853d = 1;
    }

    private z(org.bouncycastle.asn1.s sVar) {
        this.f24853d = 1;
        int s11 = sVar.s();
        if (s11 == 0) {
            this.f24850a = a0.f(sVar, true);
        } else if (s11 != 1) {
            throw new IllegalArgumentException("unknown tag in Holder");
        } else {
            this.f24851b = x.h(sVar, true);
        }
        this.f24853d = 0;
    }

    public static z h(Object obj) {
        if (obj instanceof z) {
            return (z) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.s) {
            return new z(org.bouncycastle.asn1.s.p(obj));
        }
        if (obj != null) {
            return new z(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public a0 e() {
        return this.f24850a;
    }

    public x f() {
        return this.f24851b;
    }

    public f0 i() {
        return this.f24852c;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        if (this.f24853d != 1) {
            x xVar = this.f24851b;
            return xVar != null ? new z0(true, 1, xVar) : new z0(true, 0, this.f24850a);
        }
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(3);
        a0 a0Var = this.f24850a;
        if (a0Var != null) {
            dVar.a(new z0(false, 0, a0Var));
        }
        x xVar2 = this.f24851b;
        if (xVar2 != null) {
            dVar.a(new z0(false, 1, xVar2));
        }
        f0 f0Var = this.f24852c;
        if (f0Var != null) {
            dVar.a(new z0(false, 2, f0Var));
        }
        return new org.bouncycastle.asn1.w0(dVar);
    }
}