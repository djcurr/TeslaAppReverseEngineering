package q60;

import n60.i;

/* loaded from: classes5.dex */
public class j extends i.c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public j(n60.e eVar, n60.f fVar, n60.f fVar2) {
        super(eVar, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(n60.e eVar, n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
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
        i iVar = (i) this.f40630c;
        if (iVar.i()) {
            return i11.u();
        }
        i iVar2 = (i) this.f40629b;
        i iVar3 = (i) this.f40631d[0];
        int[] d11 = v60.e.d();
        int[] d12 = v60.e.d();
        int[] d13 = v60.e.d();
        h.m(iVar.f47863g, d13);
        int[] d14 = v60.e.d();
        h.m(d13, d14);
        boolean h11 = iVar3.h();
        int[] iArr = iVar3.f47863g;
        if (!h11) {
            h.m(iArr, d12);
            iArr = d12;
        }
        h.o(iVar2.f47863g, iArr, d11);
        h.a(iVar2.f47863g, iArr, d12);
        h.f(d12, d11, d12);
        h.l(v60.e.b(d12, d12, d12), d12);
        h.f(d13, iVar2.f47863g, d13);
        h.l(v60.n.M(5, d13, 2, 0), d13);
        h.l(v60.n.N(5, d14, 3, 0, d11), d11);
        i iVar4 = new i(d14);
        h.m(d12, iVar4.f47863g);
        int[] iArr2 = iVar4.f47863g;
        h.o(iArr2, d13, iArr2);
        int[] iArr3 = iVar4.f47863g;
        h.o(iArr3, d13, iArr3);
        i iVar5 = new i(d13);
        h.o(d13, iVar4.f47863g, iVar5.f47863g);
        int[] iArr4 = iVar5.f47863g;
        h.f(iArr4, d12, iArr4);
        int[] iArr5 = iVar5.f47863g;
        h.o(iArr5, d11, iArr5);
        i iVar6 = new i(d12);
        h.p(iVar.f47863g, iVar6.f47863g);
        if (!h11) {
            int[] iArr6 = iVar6.f47863g;
            h.f(iArr6, iVar3.f47863g, iArr6);
        }
        return new j(i11, iVar4, iVar5, new n60.f[]{iVar6});
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
        i iVar2 = (i) this.f40629b;
        i iVar3 = (i) this.f40630c;
        i iVar4 = (i) iVar.q();
        i iVar5 = (i) iVar.r();
        i iVar6 = (i) this.f40631d[0];
        i iVar7 = (i) iVar.s(0);
        int[] e11 = v60.e.e();
        int[] d11 = v60.e.d();
        int[] d12 = v60.e.d();
        int[] d13 = v60.e.d();
        boolean h11 = iVar6.h();
        if (h11) {
            iArr = iVar4.f47863g;
            iArr2 = iVar5.f47863g;
        } else {
            h.m(iVar6.f47863g, d12);
            h.f(d12, iVar4.f47863g, d11);
            h.f(d12, iVar6.f47863g, d12);
            h.f(d12, iVar5.f47863g, d12);
            iArr = d11;
            iArr2 = d12;
        }
        boolean h12 = iVar7.h();
        if (h12) {
            iArr3 = iVar2.f47863g;
            iArr4 = iVar3.f47863g;
        } else {
            h.m(iVar7.f47863g, d13);
            h.f(d13, iVar2.f47863g, e11);
            h.f(d13, iVar7.f47863g, d13);
            h.f(d13, iVar3.f47863g, d13);
            iArr3 = e11;
            iArr4 = d13;
        }
        int[] d14 = v60.e.d();
        h.o(iArr3, iArr, d14);
        h.o(iArr4, iArr2, d11);
        if (v60.e.k(d14)) {
            return v60.e.k(d11) ? J() : i11.u();
        }
        h.m(d14, d12);
        int[] d15 = v60.e.d();
        h.f(d12, d14, d15);
        h.f(d12, iArr3, d12);
        h.h(d15, d15);
        v60.e.l(iArr4, d15, e11);
        h.l(v60.e.b(d12, d12, d15), d15);
        i iVar8 = new i(d13);
        h.m(d11, iVar8.f47863g);
        int[] iArr5 = iVar8.f47863g;
        h.o(iArr5, d15, iArr5);
        i iVar9 = new i(d15);
        h.o(d12, iVar8.f47863g, iVar9.f47863g);
        h.g(iVar9.f47863g, d11, e11);
        h.k(e11, iVar9.f47863g);
        i iVar10 = new i(d14);
        if (!h11) {
            int[] iArr6 = iVar10.f47863g;
            h.f(iArr6, iVar6.f47863g, iArr6);
        }
        if (!h12) {
            int[] iArr7 = iVar10.f47863g;
            h.f(iArr7, iVar7.f47863g, iArr7);
        }
        return new j(i11, iVar8, iVar9, new n60.f[]{iVar10});
    }

    @Override // n60.i
    protected n60.i d() {
        return new j(null, f(), g());
    }

    @Override // n60.i
    public n60.i z() {
        return u() ? this : new j(this.f40628a, this.f40629b, this.f40630c.m(), this.f40631d);
    }
}