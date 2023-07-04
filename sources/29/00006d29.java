package f3;

import f3.d;
import f3.e;

/* loaded from: classes.dex */
public class a extends i {

    /* renamed from: z0  reason: collision with root package name */
    private int f25670z0 = 0;
    private boolean A0 = true;
    private int B0 = 0;
    boolean C0 = false;

    public void A1(int i11) {
        this.B0 = i11;
    }

    @Override // f3.e
    public void g(a3.d dVar, boolean z11) {
        Object[] objArr;
        boolean z12;
        int i11;
        int i12;
        int i13;
        d[] dVarArr = this.U;
        dVarArr[0] = this.M;
        dVarArr[2] = this.N;
        dVarArr[1] = this.O;
        dVarArr[3] = this.P;
        int i14 = 0;
        while (true) {
            objArr = this.U;
            if (i14 >= objArr.length) {
                break;
            }
            objArr[i14].f25699i = dVar.q(objArr[i14]);
            i14++;
        }
        int i15 = this.f25670z0;
        if (i15 < 0 || i15 >= 4) {
            return;
        }
        d dVar2 = objArr[i15];
        if (!this.C0) {
            s1();
        }
        if (this.C0) {
            this.C0 = false;
            int i16 = this.f25670z0;
            if (i16 == 0 || i16 == 1) {
                dVar.f(this.M.f25699i, this.f25709d0);
                dVar.f(this.O.f25699i, this.f25709d0);
                return;
            } else if (i16 == 2 || i16 == 3) {
                dVar.f(this.N.f25699i, this.f25711e0);
                dVar.f(this.P.f25699i, this.f25711e0);
                return;
            } else {
                return;
            }
        }
        for (int i17 = 0; i17 < this.f25759y0; i17++) {
            e eVar = this.f25758x0[i17];
            if ((this.A0 || eVar.h()) && ((((i12 = this.f25670z0) == 0 || i12 == 1) && eVar.y() == e.b.MATCH_CONSTRAINT && eVar.M.f25696f != null && eVar.O.f25696f != null) || (((i13 = this.f25670z0) == 2 || i13 == 3) && eVar.T() == e.b.MATCH_CONSTRAINT && eVar.N.f25696f != null && eVar.P.f25696f != null))) {
                z12 = true;
                break;
            }
        }
        z12 = false;
        boolean z13 = this.M.k() || this.O.k();
        boolean z14 = this.N.k() || this.P.k();
        int i18 = !z12 && (((i11 = this.f25670z0) == 0 && z13) || ((i11 == 2 && z14) || ((i11 == 1 && z13) || (i11 == 3 && z14)))) ? 5 : 4;
        for (int i19 = 0; i19 < this.f25759y0; i19++) {
            e eVar2 = this.f25758x0[i19];
            if (this.A0 || eVar2.h()) {
                a3.i q11 = dVar.q(eVar2.U[this.f25670z0]);
                d[] dVarArr2 = eVar2.U;
                int i21 = this.f25670z0;
                dVarArr2[i21].f25699i = q11;
                int i22 = (dVarArr2[i21].f25696f == null || dVarArr2[i21].f25696f.f25694d != this) ? 0 : dVarArr2[i21].f25697g + 0;
                if (i21 != 0 && i21 != 2) {
                    dVar.g(dVar2.f25699i, q11, this.B0 + i22, z12);
                } else {
                    dVar.i(dVar2.f25699i, q11, this.B0 - i22, z12);
                }
                dVar.e(dVar2.f25699i, q11, this.B0 + i22, i18);
            }
        }
        int i23 = this.f25670z0;
        if (i23 == 0) {
            dVar.e(this.O.f25699i, this.M.f25699i, 0, 8);
            dVar.e(this.M.f25699i, this.Y.O.f25699i, 0, 4);
            dVar.e(this.M.f25699i, this.Y.M.f25699i, 0, 0);
        } else if (i23 == 1) {
            dVar.e(this.M.f25699i, this.O.f25699i, 0, 8);
            dVar.e(this.M.f25699i, this.Y.M.f25699i, 0, 4);
            dVar.e(this.M.f25699i, this.Y.O.f25699i, 0, 0);
        } else if (i23 == 2) {
            dVar.e(this.P.f25699i, this.N.f25699i, 0, 8);
            dVar.e(this.N.f25699i, this.Y.P.f25699i, 0, 4);
            dVar.e(this.N.f25699i, this.Y.N.f25699i, 0, 0);
        } else if (i23 == 3) {
            dVar.e(this.N.f25699i, this.P.f25699i, 0, 8);
            dVar.e(this.N.f25699i, this.Y.N.f25699i, 0, 4);
            dVar.e(this.N.f25699i, this.Y.P.f25699i, 0, 0);
        }
    }

    @Override // f3.e
    public boolean h() {
        return true;
    }

    @Override // f3.e
    public boolean n0() {
        return this.C0;
    }

    @Override // f3.e
    public boolean o0() {
        return this.C0;
    }

    public boolean s1() {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        boolean z11 = true;
        while (true) {
            i11 = this.f25759y0;
            if (i14 >= i11) {
                break;
            }
            e eVar = this.f25758x0[i14];
            if ((this.A0 || eVar.h()) && ((((i12 = this.f25670z0) == 0 || i12 == 1) && !eVar.n0()) || (((i13 = this.f25670z0) == 2 || i13 == 3) && !eVar.o0()))) {
                z11 = false;
            }
            i14++;
        }
        if (!z11 || i11 <= 0) {
            return false;
        }
        int i15 = 0;
        boolean z12 = false;
        for (int i16 = 0; i16 < this.f25759y0; i16++) {
            e eVar2 = this.f25758x0[i16];
            if (this.A0 || eVar2.h()) {
                if (!z12) {
                    int i17 = this.f25670z0;
                    if (i17 == 0) {
                        i15 = eVar2.m(d.b.LEFT).d();
                    } else if (i17 == 1) {
                        i15 = eVar2.m(d.b.RIGHT).d();
                    } else if (i17 == 2) {
                        i15 = eVar2.m(d.b.TOP).d();
                    } else if (i17 == 3) {
                        i15 = eVar2.m(d.b.BOTTOM).d();
                    }
                    z12 = true;
                }
                int i18 = this.f25670z0;
                if (i18 == 0) {
                    i15 = Math.min(i15, eVar2.m(d.b.LEFT).d());
                } else if (i18 == 1) {
                    i15 = Math.max(i15, eVar2.m(d.b.RIGHT).d());
                } else if (i18 == 2) {
                    i15 = Math.min(i15, eVar2.m(d.b.TOP).d());
                } else if (i18 == 3) {
                    i15 = Math.max(i15, eVar2.m(d.b.BOTTOM).d());
                }
            }
        }
        int i19 = i15 + this.B0;
        int i21 = this.f25670z0;
        if (i21 != 0 && i21 != 1) {
            H0(i19, i19);
        } else {
            E0(i19, i19);
        }
        this.C0 = true;
        return true;
    }

    public boolean t1() {
        return this.A0;
    }

    @Override // f3.e
    public String toString() {
        String str = "[Barrier] " + r() + " {";
        for (int i11 = 0; i11 < this.f25759y0; i11++) {
            e eVar = this.f25758x0[i11];
            if (i11 > 0) {
                str = str + ", ";
            }
            str = str + eVar.r();
        }
        return str + "}";
    }

    public int u1() {
        return this.f25670z0;
    }

    public int v1() {
        return this.B0;
    }

    public int w1() {
        int i11 = this.f25670z0;
        if (i11 == 0 || i11 == 1) {
            return 0;
        }
        return (i11 == 2 || i11 == 3) ? 1 : -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void x1() {
        for (int i11 = 0; i11 < this.f25759y0; i11++) {
            e eVar = this.f25758x0[i11];
            if (this.A0 || eVar.h()) {
                int i12 = this.f25670z0;
                if (i12 == 0 || i12 == 1) {
                    eVar.R0(0, true);
                } else if (i12 == 2 || i12 == 3) {
                    eVar.R0(1, true);
                }
            }
        }
    }

    public void y1(boolean z11) {
        this.A0 = z11;
    }

    public void z1(int i11) {
        this.f25670z0 = i11;
    }
}