package e50;

import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class u0 extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    x f24803a;

    /* renamed from: b  reason: collision with root package name */
    a0 f24804b;

    /* renamed from: c  reason: collision with root package name */
    f0 f24805c;

    public u0(org.bouncycastle.asn1.p pVar) {
        int i11;
        if (pVar.size() > 3) {
            throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
        }
        if (pVar.r(0) instanceof org.bouncycastle.asn1.s) {
            i11 = 0;
        } else {
            this.f24803a = x.f(pVar.r(0));
            i11 = 1;
        }
        while (i11 != pVar.size()) {
            org.bouncycastle.asn1.s p11 = org.bouncycastle.asn1.s.p(pVar.r(i11));
            if (p11.s() == 0) {
                this.f24804b = a0.f(p11, false);
            } else if (p11.s() != 1) {
                throw new IllegalArgumentException("Bad tag number: " + p11.s());
            } else {
                this.f24805c = f0.i(p11, false);
            }
            i11++;
        }
    }

    public static u0 f(Object obj) {
        if (obj instanceof u0) {
            return (u0) obj;
        }
        if (obj != null) {
            return new u0(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public static u0 h(org.bouncycastle.asn1.s sVar, boolean z11) {
        return f(org.bouncycastle.asn1.p.q(sVar, z11));
    }

    public a0 e() {
        return this.f24804b;
    }

    public x i() {
        return this.f24803a;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(3);
        x xVar = this.f24803a;
        if (xVar != null) {
            dVar.a(xVar);
        }
        a0 a0Var = this.f24804b;
        if (a0Var != null) {
            dVar.a(new z0(false, 0, a0Var));
        }
        f0 f0Var = this.f24805c;
        if (f0Var != null) {
            dVar.a(new z0(false, 1, f0Var));
        }
        return new org.bouncycastle.asn1.w0(dVar);
    }
}