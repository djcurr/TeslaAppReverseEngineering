package q60;

import n60.i;

/* loaded from: classes5.dex */
public class d0 extends i.c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public d0(n60.e eVar, n60.f fVar, n60.f fVar2) {
        super(eVar, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0(n60.e eVar, n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
        super(eVar, fVar, fVar2, fVarArr);
    }

    @Override // n60.i
    public n60.i H() {
        return (u() || this.f40630c.i()) ? this : J().a(this);
    }

    @Override // n60.i
    public n60.i J() {
        if (u()) {
            return this;
        }
        n60.e i11 = i();
        c0 c0Var = (c0) this.f40630c;
        if (c0Var.i()) {
            return i11.u();
        }
        c0 c0Var2 = (c0) this.f40629b;
        c0 c0Var3 = (c0) this.f40631d[0];
        int[] e11 = v60.g.e();
        int[] e12 = v60.g.e();
        int[] e13 = v60.g.e();
        b0.n(c0Var.f47811g, e13);
        int[] e14 = v60.g.e();
        b0.n(e13, e14);
        boolean h11 = c0Var3.h();
        int[] iArr = c0Var3.f47811g;
        if (!h11) {
            b0.n(iArr, e12);
            iArr = e12;
        }
        b0.q(c0Var2.f47811g, iArr, e11);
        b0.a(c0Var2.f47811g, iArr, e12);
        b0.g(e12, e11, e12);
        b0.m(v60.g.b(e12, e12, e12), e12);
        b0.g(e13, c0Var2.f47811g, e13);
        b0.m(v60.n.M(7, e13, 2, 0), e13);
        b0.m(v60.n.N(7, e14, 3, 0, e11), e11);
        c0 c0Var4 = new c0(e14);
        b0.n(e12, c0Var4.f47811g);
        int[] iArr2 = c0Var4.f47811g;
        b0.q(iArr2, e13, iArr2);
        int[] iArr3 = c0Var4.f47811g;
        b0.q(iArr3, e13, iArr3);
        c0 c0Var5 = new c0(e13);
        b0.q(e13, c0Var4.f47811g, c0Var5.f47811g);
        int[] iArr4 = c0Var5.f47811g;
        b0.g(iArr4, e12, iArr4);
        int[] iArr5 = c0Var5.f47811g;
        b0.q(iArr5, e11, iArr5);
        c0 c0Var6 = new c0(e12);
        b0.r(c0Var.f47811g, c0Var6.f47811g);
        if (!h11) {
            int[] iArr6 = c0Var6.f47811g;
            b0.g(iArr6, c0Var3.f47811g, iArr6);
        }
        return new d0(i11, c0Var4, c0Var5, new n60.f[]{c0Var6});
    }

    @Override // n60.i
    public n60.i K(n60.i iVar) {
        return this == iVar ? H() : u() ? iVar : iVar.u() ? J() : this.f40630c.i() ? iVar : J().a(iVar);
    }

    @Override // n60.i
    public n60.i a(n60.i iVar) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (u()) {
            return iVar;
        }
        if (iVar.u()) {
            return this;
        }
        if (this == iVar) {
            return J();
        }
        n60.e i11 = i();
        c0 c0Var = (c0) this.f40629b;
        c0 c0Var2 = (c0) this.f40630c;
        c0 c0Var3 = (c0) iVar.q();
        c0 c0Var4 = (c0) iVar.r();
        c0 c0Var5 = (c0) this.f40631d[0];
        c0 c0Var6 = (c0) iVar.s(0);
        int[] f11 = v60.g.f();
        int[] e11 = v60.g.e();
        int[] e12 = v60.g.e();
        int[] e13 = v60.g.e();
        boolean h11 = c0Var5.h();
        if (h11) {
            iArr = c0Var3.f47811g;
            iArr2 = c0Var4.f47811g;
        } else {
            b0.n(c0Var5.f47811g, e12);
            b0.g(e12, c0Var3.f47811g, e11);
            b0.g(e12, c0Var5.f47811g, e12);
            b0.g(e12, c0Var4.f47811g, e12);
            iArr = e11;
            iArr2 = e12;
        }
        boolean h12 = c0Var6.h();
        if (h12) {
            iArr3 = c0Var.f47811g;
            iArr4 = c0Var2.f47811g;
        } else {
            b0.n(c0Var6.f47811g, e13);
            b0.g(e13, c0Var.f47811g, f11);
            b0.g(e13, c0Var6.f47811g, e13);
            b0.g(e13, c0Var2.f47811g, e13);
            iArr3 = f11;
            iArr4 = e13;
        }
        int[] e14 = v60.g.e();
        b0.q(iArr3, iArr, e14);
        b0.q(iArr4, iArr2, e11);
        if (v60.g.l(e14)) {
            return v60.g.l(e11) ? J() : i11.u();
        }
        b0.n(e14, e12);
        int[] e15 = v60.g.e();
        b0.g(e12, e14, e15);
        b0.g(e12, iArr3, e12);
        b0.i(e15, e15);
        v60.g.m(iArr4, e15, f11);
        b0.m(v60.g.b(e12, e12, e15), e15);
        c0 c0Var7 = new c0(e13);
        b0.n(e11, c0Var7.f47811g);
        int[] iArr5 = c0Var7.f47811g;
        b0.q(iArr5, e15, iArr5);
        c0 c0Var8 = new c0(e15);
        b0.q(e12, c0Var7.f47811g, c0Var8.f47811g);
        b0.h(c0Var8.f47811g, e11, f11);
        b0.l(f11, c0Var8.f47811g);
        c0 c0Var9 = new c0(e14);
        if (!h11) {
            int[] iArr6 = c0Var9.f47811g;
            b0.g(iArr6, c0Var5.f47811g, iArr6);
        }
        if (!h12) {
            int[] iArr7 = c0Var9.f47811g;
            b0.g(iArr7, c0Var6.f47811g, iArr7);
        }
        return new d0(i11, c0Var7, c0Var8, new n60.f[]{c0Var9});
    }

    @Override // n60.i
    protected n60.i d() {
        return new d0(null, f(), g());
    }

    @Override // n60.i
    public n60.i z() {
        return u() ? this : new d0(this.f40628a, this.f40629b, this.f40630c.m(), this.f40631d);
    }
}