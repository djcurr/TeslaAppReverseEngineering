package q60;

import n60.i;

/* loaded from: classes5.dex */
public class v extends i.c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public v(n60.e eVar, n60.f fVar, n60.f fVar2) {
        super(eVar, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(n60.e eVar, n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
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
        u uVar = (u) this.f40630c;
        if (uVar.i()) {
            return i11.u();
        }
        u uVar2 = (u) this.f40629b;
        u uVar3 = (u) this.f40631d[0];
        int[] h11 = v60.f.h();
        int[] h12 = v60.f.h();
        int[] h13 = v60.f.h();
        t.n(uVar.f47975g, h13);
        int[] h14 = v60.f.h();
        t.n(h13, h14);
        boolean h15 = uVar3.h();
        int[] iArr = uVar3.f47975g;
        if (!h15) {
            t.n(iArr, h12);
            iArr = h12;
        }
        t.q(uVar2.f47975g, iArr, h11);
        t.a(uVar2.f47975g, iArr, h12);
        t.g(h12, h11, h12);
        t.m(v60.f.b(h12, h12, h12), h12);
        t.g(h13, uVar2.f47975g, h13);
        t.m(v60.n.M(6, h13, 2, 0), h13);
        t.m(v60.n.N(6, h14, 3, 0, h11), h11);
        u uVar4 = new u(h14);
        t.n(h12, uVar4.f47975g);
        int[] iArr2 = uVar4.f47975g;
        t.q(iArr2, h13, iArr2);
        int[] iArr3 = uVar4.f47975g;
        t.q(iArr3, h13, iArr3);
        u uVar5 = new u(h13);
        t.q(h13, uVar4.f47975g, uVar5.f47975g);
        int[] iArr4 = uVar5.f47975g;
        t.g(iArr4, h12, iArr4);
        int[] iArr5 = uVar5.f47975g;
        t.q(iArr5, h11, iArr5);
        u uVar6 = new u(h12);
        t.r(uVar.f47975g, uVar6.f47975g);
        if (!h15) {
            int[] iArr6 = uVar6.f47975g;
            t.g(iArr6, uVar3.f47975g, iArr6);
        }
        return new v(i11, uVar4, uVar5, new n60.f[]{uVar6});
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
        u uVar = (u) this.f40629b;
        u uVar2 = (u) this.f40630c;
        u uVar3 = (u) iVar.q();
        u uVar4 = (u) iVar.r();
        u uVar5 = (u) this.f40631d[0];
        u uVar6 = (u) iVar.s(0);
        int[] j11 = v60.f.j();
        int[] h11 = v60.f.h();
        int[] h12 = v60.f.h();
        int[] h13 = v60.f.h();
        boolean h14 = uVar5.h();
        if (h14) {
            iArr = uVar3.f47975g;
            iArr2 = uVar4.f47975g;
        } else {
            t.n(uVar5.f47975g, h12);
            t.g(h12, uVar3.f47975g, h11);
            t.g(h12, uVar5.f47975g, h12);
            t.g(h12, uVar4.f47975g, h12);
            iArr = h11;
            iArr2 = h12;
        }
        boolean h15 = uVar6.h();
        if (h15) {
            iArr3 = uVar.f47975g;
            iArr4 = uVar2.f47975g;
        } else {
            t.n(uVar6.f47975g, h13);
            t.g(h13, uVar.f47975g, j11);
            t.g(h13, uVar6.f47975g, h13);
            t.g(h13, uVar2.f47975g, h13);
            iArr3 = j11;
            iArr4 = h13;
        }
        int[] h16 = v60.f.h();
        t.q(iArr3, iArr, h16);
        t.q(iArr4, iArr2, h11);
        if (v60.f.u(h16)) {
            return v60.f.u(h11) ? J() : i11.u();
        }
        t.n(h16, h12);
        int[] h17 = v60.f.h();
        t.g(h12, h16, h17);
        t.g(h12, iArr3, h12);
        t.i(h17, h17);
        v60.f.x(iArr4, h17, j11);
        t.m(v60.f.b(h12, h12, h17), h17);
        u uVar7 = new u(h13);
        t.n(h11, uVar7.f47975g);
        int[] iArr5 = uVar7.f47975g;
        t.q(iArr5, h17, iArr5);
        u uVar8 = new u(h17);
        t.q(h12, uVar7.f47975g, uVar8.f47975g);
        t.h(uVar8.f47975g, h11, j11);
        t.l(j11, uVar8.f47975g);
        u uVar9 = new u(h16);
        if (!h14) {
            int[] iArr6 = uVar9.f47975g;
            t.g(iArr6, uVar5.f47975g, iArr6);
        }
        if (!h15) {
            int[] iArr7 = uVar9.f47975g;
            t.g(iArr7, uVar6.f47975g, iArr7);
        }
        return new v(i11, uVar7, uVar8, new n60.f[]{uVar9});
    }

    @Override // n60.i
    protected n60.i d() {
        return new v(null, f(), g());
    }

    @Override // n60.i
    public n60.i z() {
        return u() ? this : new v(this.f40628a, this.f40629b, this.f40630c.m(), this.f40631d);
    }
}