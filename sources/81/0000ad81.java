package q60;

import n60.i;

/* loaded from: classes5.dex */
public class t0 extends i.c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public t0(n60.e eVar, n60.f fVar, n60.f fVar2) {
        super(eVar, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t0(n60.e eVar, n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
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
        s0 s0Var = (s0) this.f40630c;
        if (s0Var.i()) {
            return i11.u();
        }
        s0 s0Var2 = (s0) this.f40629b;
        s0 s0Var3 = (s0) this.f40631d[0];
        int[] k11 = v60.n.k(17);
        int[] k12 = v60.n.k(17);
        int[] k13 = v60.n.k(17);
        r0.n(s0Var.f47960g, k13);
        int[] k14 = v60.n.k(17);
        r0.n(k13, k14);
        boolean h11 = s0Var3.h();
        int[] iArr = s0Var3.f47960g;
        if (!h11) {
            r0.n(iArr, k12);
            iArr = k12;
        }
        r0.p(s0Var2.f47960g, iArr, k11);
        r0.a(s0Var2.f47960g, iArr, k12);
        r0.h(k12, k11, k12);
        v60.n.c(17, k12, k12, k12);
        r0.m(k12);
        r0.h(k13, s0Var2.f47960g, k13);
        v60.n.M(17, k13, 2, 0);
        r0.m(k13);
        v60.n.N(17, k14, 3, 0, k11);
        r0.m(k11);
        s0 s0Var4 = new s0(k14);
        r0.n(k12, s0Var4.f47960g);
        int[] iArr2 = s0Var4.f47960g;
        r0.p(iArr2, k13, iArr2);
        int[] iArr3 = s0Var4.f47960g;
        r0.p(iArr3, k13, iArr3);
        s0 s0Var5 = new s0(k13);
        r0.p(k13, s0Var4.f47960g, s0Var5.f47960g);
        int[] iArr4 = s0Var5.f47960g;
        r0.h(iArr4, k12, iArr4);
        int[] iArr5 = s0Var5.f47960g;
        r0.p(iArr5, k11, iArr5);
        s0 s0Var6 = new s0(k12);
        r0.q(s0Var.f47960g, s0Var6.f47960g);
        if (!h11) {
            int[] iArr6 = s0Var6.f47960g;
            r0.h(iArr6, s0Var3.f47960g, iArr6);
        }
        return new t0(i11, s0Var4, s0Var5, new n60.f[]{s0Var6});
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
        s0 s0Var = (s0) this.f40629b;
        s0 s0Var2 = (s0) this.f40630c;
        s0 s0Var3 = (s0) iVar.q();
        s0 s0Var4 = (s0) iVar.r();
        s0 s0Var5 = (s0) this.f40631d[0];
        s0 s0Var6 = (s0) iVar.s(0);
        int[] k11 = v60.n.k(17);
        int[] k12 = v60.n.k(17);
        int[] k13 = v60.n.k(17);
        int[] k14 = v60.n.k(17);
        boolean h11 = s0Var5.h();
        if (h11) {
            iArr = s0Var3.f47960g;
            iArr2 = s0Var4.f47960g;
        } else {
            r0.n(s0Var5.f47960g, k13);
            r0.h(k13, s0Var3.f47960g, k12);
            r0.h(k13, s0Var5.f47960g, k13);
            r0.h(k13, s0Var4.f47960g, k13);
            iArr = k12;
            iArr2 = k13;
        }
        boolean h12 = s0Var6.h();
        if (h12) {
            iArr3 = s0Var.f47960g;
            iArr4 = s0Var2.f47960g;
        } else {
            r0.n(s0Var6.f47960g, k14);
            r0.h(k14, s0Var.f47960g, k11);
            r0.h(k14, s0Var6.f47960g, k14);
            r0.h(k14, s0Var2.f47960g, k14);
            iArr3 = k11;
            iArr4 = k14;
        }
        int[] k15 = v60.n.k(17);
        r0.p(iArr3, iArr, k15);
        r0.p(iArr4, iArr2, k12);
        if (v60.n.A(17, k15)) {
            return v60.n.A(17, k12) ? J() : i11.u();
        }
        r0.n(k15, k13);
        int[] k16 = v60.n.k(17);
        r0.h(k13, k15, k16);
        r0.h(k13, iArr3, k13);
        r0.h(iArr4, k16, k11);
        s0 s0Var7 = new s0(k14);
        r0.n(k12, s0Var7.f47960g);
        int[] iArr5 = s0Var7.f47960g;
        r0.a(iArr5, k16, iArr5);
        int[] iArr6 = s0Var7.f47960g;
        r0.p(iArr6, k13, iArr6);
        int[] iArr7 = s0Var7.f47960g;
        r0.p(iArr7, k13, iArr7);
        s0 s0Var8 = new s0(k16);
        r0.p(k13, s0Var7.f47960g, s0Var8.f47960g);
        r0.h(s0Var8.f47960g, k12, k12);
        r0.p(k12, k11, s0Var8.f47960g);
        s0 s0Var9 = new s0(k15);
        if (!h11) {
            int[] iArr8 = s0Var9.f47960g;
            r0.h(iArr8, s0Var5.f47960g, iArr8);
        }
        if (!h12) {
            int[] iArr9 = s0Var9.f47960g;
            r0.h(iArr9, s0Var6.f47960g, iArr9);
        }
        return new t0(i11, s0Var7, s0Var8, new n60.f[]{s0Var9});
    }

    @Override // n60.i
    protected n60.i d() {
        return new t0(null, f(), g());
    }

    @Override // n60.i
    public n60.i z() {
        return u() ? this : new t0(this.f40628a, this.f40629b, this.f40630c.m(), this.f40631d);
    }
}