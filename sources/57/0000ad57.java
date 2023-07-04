package q60;

import n60.i;

/* loaded from: classes5.dex */
public class l0 extends i.c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public l0(n60.e eVar, n60.f fVar, n60.f fVar2) {
        super(eVar, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l0(n60.e eVar, n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
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
        k0 k0Var = (k0) this.f40630c;
        if (k0Var.i()) {
            return i11.u();
        }
        k0 k0Var2 = (k0) this.f40629b;
        k0 k0Var3 = (k0) this.f40631d[0];
        int[] i12 = v60.h.i();
        int[] i13 = v60.h.i();
        int[] i14 = v60.h.i();
        j0.n(k0Var.f47889g, i14);
        int[] i15 = v60.h.i();
        j0.n(i14, i15);
        boolean h11 = k0Var3.h();
        int[] iArr = k0Var3.f47889g;
        if (!h11) {
            j0.n(iArr, i13);
            iArr = i13;
        }
        j0.q(k0Var2.f47889g, iArr, i12);
        j0.a(k0Var2.f47889g, iArr, i13);
        j0.g(i13, i12, i13);
        j0.m(v60.h.b(i13, i13, i13), i13);
        j0.g(i14, k0Var2.f47889g, i14);
        j0.m(v60.n.M(8, i14, 2, 0), i14);
        j0.m(v60.n.N(8, i15, 3, 0, i12), i12);
        k0 k0Var4 = new k0(i15);
        j0.n(i13, k0Var4.f47889g);
        int[] iArr2 = k0Var4.f47889g;
        j0.q(iArr2, i14, iArr2);
        int[] iArr3 = k0Var4.f47889g;
        j0.q(iArr3, i14, iArr3);
        k0 k0Var5 = new k0(i14);
        j0.q(i14, k0Var4.f47889g, k0Var5.f47889g);
        int[] iArr4 = k0Var5.f47889g;
        j0.g(iArr4, i13, iArr4);
        int[] iArr5 = k0Var5.f47889g;
        j0.q(iArr5, i12, iArr5);
        k0 k0Var6 = new k0(i13);
        j0.r(k0Var.f47889g, k0Var6.f47889g);
        if (!h11) {
            int[] iArr6 = k0Var6.f47889g;
            j0.g(iArr6, k0Var3.f47889g, iArr6);
        }
        return new l0(i11, k0Var4, k0Var5, new n60.f[]{k0Var6});
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
        k0 k0Var = (k0) this.f40629b;
        k0 k0Var2 = (k0) this.f40630c;
        k0 k0Var3 = (k0) iVar.q();
        k0 k0Var4 = (k0) iVar.r();
        k0 k0Var5 = (k0) this.f40631d[0];
        k0 k0Var6 = (k0) iVar.s(0);
        int[] k11 = v60.h.k();
        int[] i12 = v60.h.i();
        int[] i13 = v60.h.i();
        int[] i14 = v60.h.i();
        boolean h11 = k0Var5.h();
        if (h11) {
            iArr = k0Var3.f47889g;
            iArr2 = k0Var4.f47889g;
        } else {
            j0.n(k0Var5.f47889g, i13);
            j0.g(i13, k0Var3.f47889g, i12);
            j0.g(i13, k0Var5.f47889g, i13);
            j0.g(i13, k0Var4.f47889g, i13);
            iArr = i12;
            iArr2 = i13;
        }
        boolean h12 = k0Var6.h();
        if (h12) {
            iArr3 = k0Var.f47889g;
            iArr4 = k0Var2.f47889g;
        } else {
            j0.n(k0Var6.f47889g, i14);
            j0.g(i14, k0Var.f47889g, k11);
            j0.g(i14, k0Var6.f47889g, i14);
            j0.g(i14, k0Var2.f47889g, i14);
            iArr3 = k11;
            iArr4 = i14;
        }
        int[] i15 = v60.h.i();
        j0.q(iArr3, iArr, i15);
        j0.q(iArr4, iArr2, i12);
        if (v60.h.v(i15)) {
            return v60.h.v(i12) ? J() : i11.u();
        }
        j0.n(i15, i13);
        int[] i16 = v60.h.i();
        j0.g(i13, i15, i16);
        j0.g(i13, iArr3, i13);
        j0.i(i16, i16);
        v60.h.y(iArr4, i16, k11);
        j0.m(v60.h.b(i13, i13, i16), i16);
        k0 k0Var7 = new k0(i14);
        j0.n(i12, k0Var7.f47889g);
        int[] iArr5 = k0Var7.f47889g;
        j0.q(iArr5, i16, iArr5);
        k0 k0Var8 = new k0(i16);
        j0.q(i13, k0Var7.f47889g, k0Var8.f47889g);
        j0.h(k0Var8.f47889g, i12, k11);
        j0.l(k11, k0Var8.f47889g);
        k0 k0Var9 = new k0(i15);
        if (!h11) {
            int[] iArr6 = k0Var9.f47889g;
            j0.g(iArr6, k0Var5.f47889g, iArr6);
        }
        if (!h12) {
            int[] iArr7 = k0Var9.f47889g;
            j0.g(iArr7, k0Var6.f47889g, iArr7);
        }
        return new l0(i11, k0Var7, k0Var8, new n60.f[]{k0Var9});
    }

    @Override // n60.i
    protected n60.i d() {
        return new l0(null, f(), g());
    }

    @Override // n60.i
    public n60.i z() {
        return u() ? this : new l0(this.f40628a, this.f40629b, this.f40630c.m(), this.f40631d);
    }
}