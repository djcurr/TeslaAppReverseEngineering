package q60;

import n60.i;

/* loaded from: classes5.dex */
public class r extends i.c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public r(n60.e eVar, n60.f fVar, n60.f fVar2) {
        super(eVar, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(n60.e eVar, n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
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
        q qVar = (q) this.f40630c;
        if (qVar.i()) {
            return i11.u();
        }
        q qVar2 = (q) this.f40629b;
        q qVar3 = (q) this.f40631d[0];
        int[] h11 = v60.f.h();
        p.m(qVar.f47938g, h11);
        int[] h12 = v60.f.h();
        p.m(h11, h12);
        int[] h13 = v60.f.h();
        p.m(qVar2.f47938g, h13);
        p.l(v60.f.b(h13, h13, h13), h13);
        p.f(h11, qVar2.f47938g, h11);
        p.l(v60.n.M(6, h11, 2, 0), h11);
        int[] h14 = v60.f.h();
        p.l(v60.n.N(6, h12, 3, 0, h14), h14);
        q qVar4 = new q(h12);
        p.m(h13, qVar4.f47938g);
        int[] iArr = qVar4.f47938g;
        p.o(iArr, h11, iArr);
        int[] iArr2 = qVar4.f47938g;
        p.o(iArr2, h11, iArr2);
        q qVar5 = new q(h11);
        p.o(h11, qVar4.f47938g, qVar5.f47938g);
        int[] iArr3 = qVar5.f47938g;
        p.f(iArr3, h13, iArr3);
        int[] iArr4 = qVar5.f47938g;
        p.o(iArr4, h14, iArr4);
        q qVar6 = new q(h13);
        p.p(qVar.f47938g, qVar6.f47938g);
        if (!qVar3.h()) {
            int[] iArr5 = qVar6.f47938g;
            p.f(iArr5, qVar3.f47938g, iArr5);
        }
        return new r(i11, qVar4, qVar5, new n60.f[]{qVar6});
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
        q qVar = (q) this.f40629b;
        q qVar2 = (q) this.f40630c;
        q qVar3 = (q) iVar.q();
        q qVar4 = (q) iVar.r();
        q qVar5 = (q) this.f40631d[0];
        q qVar6 = (q) iVar.s(0);
        int[] j11 = v60.f.j();
        int[] h11 = v60.f.h();
        int[] h12 = v60.f.h();
        int[] h13 = v60.f.h();
        boolean h14 = qVar5.h();
        if (h14) {
            iArr = qVar3.f47938g;
            iArr2 = qVar4.f47938g;
        } else {
            p.m(qVar5.f47938g, h12);
            p.f(h12, qVar3.f47938g, h11);
            p.f(h12, qVar5.f47938g, h12);
            p.f(h12, qVar4.f47938g, h12);
            iArr = h11;
            iArr2 = h12;
        }
        boolean h15 = qVar6.h();
        if (h15) {
            iArr3 = qVar.f47938g;
            iArr4 = qVar2.f47938g;
        } else {
            p.m(qVar6.f47938g, h13);
            p.f(h13, qVar.f47938g, j11);
            p.f(h13, qVar6.f47938g, h13);
            p.f(h13, qVar2.f47938g, h13);
            iArr3 = j11;
            iArr4 = h13;
        }
        int[] h16 = v60.f.h();
        p.o(iArr3, iArr, h16);
        p.o(iArr4, iArr2, h11);
        if (v60.f.u(h16)) {
            return v60.f.u(h11) ? J() : i11.u();
        }
        p.m(h16, h12);
        int[] h17 = v60.f.h();
        p.f(h12, h16, h17);
        p.f(h12, iArr3, h12);
        p.h(h17, h17);
        v60.f.x(iArr4, h17, j11);
        p.l(v60.f.b(h12, h12, h17), h17);
        q qVar7 = new q(h13);
        p.m(h11, qVar7.f47938g);
        int[] iArr5 = qVar7.f47938g;
        p.o(iArr5, h17, iArr5);
        q qVar8 = new q(h17);
        p.o(h12, qVar7.f47938g, qVar8.f47938g);
        p.g(qVar8.f47938g, h11, j11);
        p.k(j11, qVar8.f47938g);
        q qVar9 = new q(h16);
        if (!h14) {
            int[] iArr6 = qVar9.f47938g;
            p.f(iArr6, qVar5.f47938g, iArr6);
        }
        if (!h15) {
            int[] iArr7 = qVar9.f47938g;
            p.f(iArr7, qVar6.f47938g, iArr7);
        }
        return new r(i11, qVar7, qVar8, new n60.f[]{qVar9});
    }

    @Override // n60.i
    protected n60.i d() {
        return new r(null, f(), g());
    }

    @Override // n60.i
    public n60.i z() {
        return u() ? this : new r(this.f40628a, this.f40629b, this.f40630c.m(), this.f40631d);
    }
}