package q60;

import n60.i;

/* loaded from: classes5.dex */
public class p0 extends i.c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public p0(n60.e eVar, n60.f fVar, n60.f fVar2) {
        super(eVar, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p0(n60.e eVar, n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
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
        o0 o0Var = (o0) this.f40630c;
        if (o0Var.i()) {
            return i11.u();
        }
        o0 o0Var2 = (o0) this.f40629b;
        o0 o0Var3 = (o0) this.f40631d[0];
        int[] k11 = v60.n.k(12);
        int[] k12 = v60.n.k(12);
        int[] k13 = v60.n.k(12);
        n0.n(o0Var.f47927g, k13);
        int[] k14 = v60.n.k(12);
        n0.n(k13, k14);
        boolean h11 = o0Var3.h();
        int[] iArr = o0Var3.f47927g;
        if (!h11) {
            n0.n(iArr, k12);
            iArr = k12;
        }
        n0.q(o0Var2.f47927g, iArr, k11);
        n0.a(o0Var2.f47927g, iArr, k12);
        n0.h(k12, k11, k12);
        n0.m(v60.n.c(12, k12, k12, k12), k12);
        n0.h(k13, o0Var2.f47927g, k13);
        n0.m(v60.n.M(12, k13, 2, 0), k13);
        n0.m(v60.n.N(12, k14, 3, 0, k11), k11);
        o0 o0Var4 = new o0(k14);
        n0.n(k12, o0Var4.f47927g);
        int[] iArr2 = o0Var4.f47927g;
        n0.q(iArr2, k13, iArr2);
        int[] iArr3 = o0Var4.f47927g;
        n0.q(iArr3, k13, iArr3);
        o0 o0Var5 = new o0(k13);
        n0.q(k13, o0Var4.f47927g, o0Var5.f47927g);
        int[] iArr4 = o0Var5.f47927g;
        n0.h(iArr4, k12, iArr4);
        int[] iArr5 = o0Var5.f47927g;
        n0.q(iArr5, k11, iArr5);
        o0 o0Var6 = new o0(k12);
        n0.r(o0Var.f47927g, o0Var6.f47927g);
        if (!h11) {
            int[] iArr6 = o0Var6.f47927g;
            n0.h(iArr6, o0Var3.f47927g, iArr6);
        }
        return new p0(i11, o0Var4, o0Var5, new n60.f[]{o0Var6});
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
        o0 o0Var = (o0) this.f40629b;
        o0 o0Var2 = (o0) this.f40630c;
        o0 o0Var3 = (o0) iVar.q();
        o0 o0Var4 = (o0) iVar.r();
        o0 o0Var5 = (o0) this.f40631d[0];
        o0 o0Var6 = (o0) iVar.s(0);
        int[] k11 = v60.n.k(24);
        int[] k12 = v60.n.k(24);
        int[] k13 = v60.n.k(12);
        int[] k14 = v60.n.k(12);
        boolean h11 = o0Var5.h();
        if (h11) {
            iArr = o0Var3.f47927g;
            iArr2 = o0Var4.f47927g;
        } else {
            n0.n(o0Var5.f47927g, k13);
            n0.h(k13, o0Var3.f47927g, k12);
            n0.h(k13, o0Var5.f47927g, k13);
            n0.h(k13, o0Var4.f47927g, k13);
            iArr = k12;
            iArr2 = k13;
        }
        boolean h12 = o0Var6.h();
        if (h12) {
            iArr3 = o0Var.f47927g;
            iArr4 = o0Var2.f47927g;
        } else {
            n0.n(o0Var6.f47927g, k14);
            n0.h(k14, o0Var.f47927g, k11);
            n0.h(k14, o0Var6.f47927g, k14);
            n0.h(k14, o0Var2.f47927g, k14);
            iArr3 = k11;
            iArr4 = k14;
        }
        int[] k15 = v60.n.k(12);
        n0.q(iArr3, iArr, k15);
        int[] k16 = v60.n.k(12);
        n0.q(iArr4, iArr2, k16);
        if (v60.n.A(12, k15)) {
            return v60.n.A(12, k16) ? J() : i11.u();
        }
        n0.n(k15, k13);
        int[] k17 = v60.n.k(12);
        n0.h(k13, k15, k17);
        n0.h(k13, iArr3, k13);
        n0.i(k17, k17);
        v60.j.a(iArr4, k17, k11);
        n0.m(v60.n.c(12, k13, k13, k17), k17);
        o0 o0Var7 = new o0(k14);
        n0.n(k16, o0Var7.f47927g);
        int[] iArr5 = o0Var7.f47927g;
        n0.q(iArr5, k17, iArr5);
        o0 o0Var8 = new o0(k17);
        n0.q(k13, o0Var7.f47927g, o0Var8.f47927g);
        v60.j.a(o0Var8.f47927g, k16, k12);
        n0.b(k11, k12, k11);
        n0.l(k11, o0Var8.f47927g);
        o0 o0Var9 = new o0(k15);
        if (!h11) {
            int[] iArr6 = o0Var9.f47927g;
            n0.h(iArr6, o0Var5.f47927g, iArr6);
        }
        if (!h12) {
            int[] iArr7 = o0Var9.f47927g;
            n0.h(iArr7, o0Var6.f47927g, iArr7);
        }
        return new p0(i11, o0Var7, o0Var8, new n60.f[]{o0Var9});
    }

    @Override // n60.i
    protected n60.i d() {
        return new p0(null, f(), g());
    }

    @Override // n60.i
    public n60.i z() {
        return u() ? this : new p0(this.f40628a, this.f40629b, this.f40630c.m(), this.f40631d);
    }
}