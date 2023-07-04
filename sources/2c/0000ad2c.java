package q60;

import n60.i;

/* loaded from: classes5.dex */
public class d extends i.c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public d(n60.e eVar, n60.f fVar, n60.f fVar2) {
        super(eVar, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(n60.e eVar, n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
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
        c cVar = (c) this.f40630c;
        if (cVar.i()) {
            return i11.u();
        }
        c cVar2 = (c) this.f40629b;
        c cVar3 = (c) this.f40631d[0];
        int[] f11 = v60.d.f();
        int[] f12 = v60.d.f();
        int[] f13 = v60.d.f();
        b.n(cVar.f47809g, f13);
        int[] f14 = v60.d.f();
        b.n(f13, f14);
        boolean h11 = cVar3.h();
        int[] iArr = cVar3.f47809g;
        if (!h11) {
            b.n(iArr, f12);
            iArr = f12;
        }
        b.q(cVar2.f47809g, iArr, f11);
        b.a(cVar2.f47809g, iArr, f12);
        b.g(f12, f11, f12);
        b.m(v60.d.b(f12, f12, f12), f12);
        b.g(f13, cVar2.f47809g, f13);
        b.m(v60.n.M(4, f13, 2, 0), f13);
        b.m(v60.n.N(4, f14, 3, 0, f11), f11);
        c cVar4 = new c(f14);
        b.n(f12, cVar4.f47809g);
        int[] iArr2 = cVar4.f47809g;
        b.q(iArr2, f13, iArr2);
        int[] iArr3 = cVar4.f47809g;
        b.q(iArr3, f13, iArr3);
        c cVar5 = new c(f13);
        b.q(f13, cVar4.f47809g, cVar5.f47809g);
        int[] iArr4 = cVar5.f47809g;
        b.g(iArr4, f12, iArr4);
        int[] iArr5 = cVar5.f47809g;
        b.q(iArr5, f11, iArr5);
        c cVar6 = new c(f12);
        b.r(cVar.f47809g, cVar6.f47809g);
        if (!h11) {
            int[] iArr6 = cVar6.f47809g;
            b.g(iArr6, cVar3.f47809g, iArr6);
        }
        return new d(i11, cVar4, cVar5, new n60.f[]{cVar6});
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
        c cVar = (c) this.f40629b;
        c cVar2 = (c) this.f40630c;
        c cVar3 = (c) iVar.q();
        c cVar4 = (c) iVar.r();
        c cVar5 = (c) this.f40631d[0];
        c cVar6 = (c) iVar.s(0);
        int[] h11 = v60.d.h();
        int[] f11 = v60.d.f();
        int[] f12 = v60.d.f();
        int[] f13 = v60.d.f();
        boolean h12 = cVar5.h();
        if (h12) {
            iArr = cVar3.f47809g;
            iArr2 = cVar4.f47809g;
        } else {
            b.n(cVar5.f47809g, f12);
            b.g(f12, cVar3.f47809g, f11);
            b.g(f12, cVar5.f47809g, f12);
            b.g(f12, cVar4.f47809g, f12);
            iArr = f11;
            iArr2 = f12;
        }
        boolean h13 = cVar6.h();
        if (h13) {
            iArr3 = cVar.f47809g;
            iArr4 = cVar2.f47809g;
        } else {
            b.n(cVar6.f47809g, f13);
            b.g(f13, cVar.f47809g, h11);
            b.g(f13, cVar6.f47809g, f13);
            b.g(f13, cVar2.f47809g, f13);
            iArr3 = h11;
            iArr4 = f13;
        }
        int[] f14 = v60.d.f();
        b.q(iArr3, iArr, f14);
        b.q(iArr4, iArr2, f11);
        if (v60.d.q(f14)) {
            return v60.d.q(f11) ? J() : i11.u();
        }
        b.n(f14, f12);
        int[] f15 = v60.d.f();
        b.g(f12, f14, f15);
        b.g(f12, iArr3, f12);
        b.i(f15, f15);
        v60.d.s(iArr4, f15, h11);
        b.m(v60.d.b(f12, f12, f15), f15);
        c cVar7 = new c(f13);
        b.n(f11, cVar7.f47809g);
        int[] iArr5 = cVar7.f47809g;
        b.q(iArr5, f15, iArr5);
        c cVar8 = new c(f15);
        b.q(f12, cVar7.f47809g, cVar8.f47809g);
        b.h(cVar8.f47809g, f11, h11);
        b.l(h11, cVar8.f47809g);
        c cVar9 = new c(f14);
        if (!h12) {
            int[] iArr6 = cVar9.f47809g;
            b.g(iArr6, cVar5.f47809g, iArr6);
        }
        if (!h13) {
            int[] iArr7 = cVar9.f47809g;
            b.g(iArr7, cVar6.f47809g, iArr7);
        }
        return new d(i11, cVar7, cVar8, new n60.f[]{cVar9});
    }

    @Override // n60.i
    protected n60.i d() {
        return new d(null, f(), g());
    }

    @Override // n60.i
    public n60.i z() {
        return u() ? this : new d(this.f40628a, this.f40629b, this.f40630c.m(), this.f40631d);
    }
}