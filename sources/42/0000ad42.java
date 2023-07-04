package q60;

import n60.i;

/* loaded from: classes5.dex */
public class h0 extends i.c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(n60.e eVar, n60.f fVar, n60.f fVar2) {
        super(eVar, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(n60.e eVar, n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
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
        g0 g0Var = (g0) this.f40630c;
        if (g0Var.i()) {
            return i11.u();
        }
        g0 g0Var2 = (g0) this.f40629b;
        g0 g0Var3 = (g0) this.f40631d[0];
        int[] i12 = v60.h.i();
        f0.m(g0Var.f47851g, i12);
        int[] i13 = v60.h.i();
        f0.m(i12, i13);
        int[] i14 = v60.h.i();
        f0.m(g0Var2.f47851g, i14);
        f0.l(v60.h.b(i14, i14, i14), i14);
        f0.f(i12, g0Var2.f47851g, i12);
        f0.l(v60.n.M(8, i12, 2, 0), i12);
        int[] i15 = v60.h.i();
        f0.l(v60.n.N(8, i13, 3, 0, i15), i15);
        g0 g0Var4 = new g0(i13);
        f0.m(i14, g0Var4.f47851g);
        int[] iArr = g0Var4.f47851g;
        f0.o(iArr, i12, iArr);
        int[] iArr2 = g0Var4.f47851g;
        f0.o(iArr2, i12, iArr2);
        g0 g0Var5 = new g0(i12);
        f0.o(i12, g0Var4.f47851g, g0Var5.f47851g);
        int[] iArr3 = g0Var5.f47851g;
        f0.f(iArr3, i14, iArr3);
        int[] iArr4 = g0Var5.f47851g;
        f0.o(iArr4, i15, iArr4);
        g0 g0Var6 = new g0(i14);
        f0.p(g0Var.f47851g, g0Var6.f47851g);
        if (!g0Var3.h()) {
            int[] iArr5 = g0Var6.f47851g;
            f0.f(iArr5, g0Var3.f47851g, iArr5);
        }
        return new h0(i11, g0Var4, g0Var5, new n60.f[]{g0Var6});
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
        g0 g0Var = (g0) this.f40629b;
        g0 g0Var2 = (g0) this.f40630c;
        g0 g0Var3 = (g0) iVar.q();
        g0 g0Var4 = (g0) iVar.r();
        g0 g0Var5 = (g0) this.f40631d[0];
        g0 g0Var6 = (g0) iVar.s(0);
        int[] k11 = v60.h.k();
        int[] i12 = v60.h.i();
        int[] i13 = v60.h.i();
        int[] i14 = v60.h.i();
        boolean h11 = g0Var5.h();
        if (h11) {
            iArr = g0Var3.f47851g;
            iArr2 = g0Var4.f47851g;
        } else {
            f0.m(g0Var5.f47851g, i13);
            f0.f(i13, g0Var3.f47851g, i12);
            f0.f(i13, g0Var5.f47851g, i13);
            f0.f(i13, g0Var4.f47851g, i13);
            iArr = i12;
            iArr2 = i13;
        }
        boolean h12 = g0Var6.h();
        if (h12) {
            iArr3 = g0Var.f47851g;
            iArr4 = g0Var2.f47851g;
        } else {
            f0.m(g0Var6.f47851g, i14);
            f0.f(i14, g0Var.f47851g, k11);
            f0.f(i14, g0Var6.f47851g, i14);
            f0.f(i14, g0Var2.f47851g, i14);
            iArr3 = k11;
            iArr4 = i14;
        }
        int[] i15 = v60.h.i();
        f0.o(iArr3, iArr, i15);
        f0.o(iArr4, iArr2, i12);
        if (v60.h.v(i15)) {
            return v60.h.v(i12) ? J() : i11.u();
        }
        f0.m(i15, i13);
        int[] i16 = v60.h.i();
        f0.f(i13, i15, i16);
        f0.f(i13, iArr3, i13);
        f0.h(i16, i16);
        v60.h.y(iArr4, i16, k11);
        f0.l(v60.h.b(i13, i13, i16), i16);
        g0 g0Var7 = new g0(i14);
        f0.m(i12, g0Var7.f47851g);
        int[] iArr5 = g0Var7.f47851g;
        f0.o(iArr5, i16, iArr5);
        g0 g0Var8 = new g0(i16);
        f0.o(i13, g0Var7.f47851g, g0Var8.f47851g);
        f0.g(g0Var8.f47851g, i12, k11);
        f0.k(k11, g0Var8.f47851g);
        g0 g0Var9 = new g0(i15);
        if (!h11) {
            int[] iArr6 = g0Var9.f47851g;
            f0.f(iArr6, g0Var5.f47851g, iArr6);
        }
        if (!h12) {
            int[] iArr7 = g0Var9.f47851g;
            f0.f(iArr7, g0Var6.f47851g, iArr7);
        }
        return new h0(i11, g0Var7, g0Var8, new n60.f[]{g0Var9});
    }

    @Override // n60.i
    protected n60.i d() {
        return new h0(null, f(), g());
    }

    @Override // n60.i
    public n60.i z() {
        return u() ? this : new h0(this.f40628a, this.f40629b, this.f40630c.m(), this.f40631d);
    }
}