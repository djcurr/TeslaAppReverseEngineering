package q60;

import n60.i;

/* loaded from: classes5.dex */
public class z extends i.c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public z(n60.e eVar, n60.f fVar, n60.f fVar2) {
        super(eVar, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(n60.e eVar, n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
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
        y yVar = (y) this.f40630c;
        if (yVar.i()) {
            return i11.u();
        }
        y yVar2 = (y) this.f40629b;
        y yVar3 = (y) this.f40631d[0];
        int[] e11 = v60.g.e();
        x.m(yVar.f48006g, e11);
        int[] e12 = v60.g.e();
        x.m(e11, e12);
        int[] e13 = v60.g.e();
        x.m(yVar2.f48006g, e13);
        x.l(v60.g.b(e13, e13, e13), e13);
        x.f(e11, yVar2.f48006g, e11);
        x.l(v60.n.M(7, e11, 2, 0), e11);
        int[] e14 = v60.g.e();
        x.l(v60.n.N(7, e12, 3, 0, e14), e14);
        y yVar4 = new y(e12);
        x.m(e13, yVar4.f48006g);
        int[] iArr = yVar4.f48006g;
        x.o(iArr, e11, iArr);
        int[] iArr2 = yVar4.f48006g;
        x.o(iArr2, e11, iArr2);
        y yVar5 = new y(e11);
        x.o(e11, yVar4.f48006g, yVar5.f48006g);
        int[] iArr3 = yVar5.f48006g;
        x.f(iArr3, e13, iArr3);
        int[] iArr4 = yVar5.f48006g;
        x.o(iArr4, e14, iArr4);
        y yVar6 = new y(e13);
        x.p(yVar.f48006g, yVar6.f48006g);
        if (!yVar3.h()) {
            int[] iArr5 = yVar6.f48006g;
            x.f(iArr5, yVar3.f48006g, iArr5);
        }
        return new z(i11, yVar4, yVar5, new n60.f[]{yVar6});
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
        y yVar = (y) this.f40629b;
        y yVar2 = (y) this.f40630c;
        y yVar3 = (y) iVar.q();
        y yVar4 = (y) iVar.r();
        y yVar5 = (y) this.f40631d[0];
        y yVar6 = (y) iVar.s(0);
        int[] f11 = v60.g.f();
        int[] e11 = v60.g.e();
        int[] e12 = v60.g.e();
        int[] e13 = v60.g.e();
        boolean h11 = yVar5.h();
        if (h11) {
            iArr = yVar3.f48006g;
            iArr2 = yVar4.f48006g;
        } else {
            x.m(yVar5.f48006g, e12);
            x.f(e12, yVar3.f48006g, e11);
            x.f(e12, yVar5.f48006g, e12);
            x.f(e12, yVar4.f48006g, e12);
            iArr = e11;
            iArr2 = e12;
        }
        boolean h12 = yVar6.h();
        if (h12) {
            iArr3 = yVar.f48006g;
            iArr4 = yVar2.f48006g;
        } else {
            x.m(yVar6.f48006g, e13);
            x.f(e13, yVar.f48006g, f11);
            x.f(e13, yVar6.f48006g, e13);
            x.f(e13, yVar2.f48006g, e13);
            iArr3 = f11;
            iArr4 = e13;
        }
        int[] e14 = v60.g.e();
        x.o(iArr3, iArr, e14);
        x.o(iArr4, iArr2, e11);
        if (v60.g.l(e14)) {
            return v60.g.l(e11) ? J() : i11.u();
        }
        x.m(e14, e12);
        int[] e15 = v60.g.e();
        x.f(e12, e14, e15);
        x.f(e12, iArr3, e12);
        x.h(e15, e15);
        v60.g.m(iArr4, e15, f11);
        x.l(v60.g.b(e12, e12, e15), e15);
        y yVar7 = new y(e13);
        x.m(e11, yVar7.f48006g);
        int[] iArr5 = yVar7.f48006g;
        x.o(iArr5, e15, iArr5);
        y yVar8 = new y(e15);
        x.o(e12, yVar7.f48006g, yVar8.f48006g);
        x.g(yVar8.f48006g, e11, f11);
        x.k(f11, yVar8.f48006g);
        y yVar9 = new y(e14);
        if (!h11) {
            int[] iArr6 = yVar9.f48006g;
            x.f(iArr6, yVar5.f48006g, iArr6);
        }
        if (!h12) {
            int[] iArr7 = yVar9.f48006g;
            x.f(iArr7, yVar6.f48006g, iArr7);
        }
        return new z(i11, yVar7, yVar8, new n60.f[]{yVar9});
    }

    @Override // n60.i
    protected n60.i d() {
        return new z(null, f(), g());
    }

    @Override // n60.i
    public n60.i z() {
        return u() ? this : new z(this.f40628a, this.f40629b, this.f40630c.m(), this.f40631d);
    }
}