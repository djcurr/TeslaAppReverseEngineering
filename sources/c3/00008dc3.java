package o60;

import n60.e;
import n60.f;
import n60.i;
import v60.h;

/* loaded from: classes5.dex */
public class d extends i.c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public d(e eVar, f fVar, f fVar2) {
        super(eVar, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(e eVar, f fVar, f fVar2, f[] fVarArr) {
        super(eVar, fVar, fVar2, fVarArr);
    }

    @Override // n60.i
    public i H() {
        return (u() || this.f40630c.i()) ? this : N(false).a(this);
    }

    @Override // n60.i
    public i J() {
        if (u()) {
            return this;
        }
        return this.f40630c.i() ? i().u() : N(true);
    }

    @Override // n60.i
    public i K(i iVar) {
        return this == iVar ? H() : u() ? iVar : iVar.u() ? J() : this.f40630c.i() ? iVar : N(false).a(iVar);
    }

    protected c L(c cVar, int[] iArr) {
        c cVar2 = (c) i().n();
        if (cVar.h()) {
            return cVar2;
        }
        c cVar3 = new c();
        if (iArr == null) {
            iArr = cVar3.f42302g;
            b.n(cVar.f42302g, iArr);
        }
        b.n(iArr, cVar3.f42302g);
        int[] iArr2 = cVar3.f42302g;
        b.g(iArr2, cVar2.f42302g, iArr2);
        return cVar3;
    }

    protected c M() {
        f[] fVarArr = this.f40631d;
        c cVar = (c) fVarArr[1];
        if (cVar == null) {
            c L = L((c) fVarArr[0], null);
            fVarArr[1] = L;
            return L;
        }
        return cVar;
    }

    protected d N(boolean z11) {
        c cVar = (c) this.f40629b;
        c cVar2 = (c) this.f40630c;
        c cVar3 = (c) this.f40631d[0];
        c M = M();
        int[] i11 = h.i();
        b.n(cVar.f42302g, i11);
        b.m(h.b(i11, i11, i11) + h.d(M.f42302g, i11), i11);
        int[] i12 = h.i();
        b.s(cVar2.f42302g, i12);
        int[] i13 = h.i();
        b.g(i12, cVar2.f42302g, i13);
        int[] i14 = h.i();
        b.g(i13, cVar.f42302g, i14);
        b.s(i14, i14);
        int[] i15 = h.i();
        b.n(i13, i15);
        b.s(i15, i15);
        c cVar4 = new c(i13);
        b.n(i11, cVar4.f42302g);
        int[] iArr = cVar4.f42302g;
        b.r(iArr, i14, iArr);
        int[] iArr2 = cVar4.f42302g;
        b.r(iArr2, i14, iArr2);
        c cVar5 = new c(i14);
        b.r(i14, cVar4.f42302g, cVar5.f42302g);
        int[] iArr3 = cVar5.f42302g;
        b.g(iArr3, i11, iArr3);
        int[] iArr4 = cVar5.f42302g;
        b.r(iArr4, i15, iArr4);
        c cVar6 = new c(i12);
        if (!h.t(cVar3.f42302g)) {
            int[] iArr5 = cVar6.f42302g;
            b.g(iArr5, cVar3.f42302g, iArr5);
        }
        c cVar7 = null;
        if (z11) {
            cVar7 = new c(i15);
            int[] iArr6 = cVar7.f42302g;
            b.g(iArr6, M.f42302g, iArr6);
            int[] iArr7 = cVar7.f42302g;
            b.s(iArr7, iArr7);
        }
        return new d(i(), cVar4, cVar5, new f[]{cVar6, cVar7});
    }

    @Override // n60.i
    public i a(i iVar) {
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
        e i11 = i();
        c cVar = (c) this.f40629b;
        c cVar2 = (c) this.f40630c;
        c cVar3 = (c) this.f40631d[0];
        c cVar4 = (c) iVar.q();
        c cVar5 = (c) iVar.r();
        c cVar6 = (c) iVar.s(0);
        int[] k11 = h.k();
        int[] i12 = h.i();
        int[] i13 = h.i();
        int[] i14 = h.i();
        boolean h11 = cVar3.h();
        if (h11) {
            iArr = cVar4.f42302g;
            iArr2 = cVar5.f42302g;
        } else {
            b.n(cVar3.f42302g, i13);
            b.g(i13, cVar4.f42302g, i12);
            b.g(i13, cVar3.f42302g, i13);
            b.g(i13, cVar5.f42302g, i13);
            iArr = i12;
            iArr2 = i13;
        }
        boolean h12 = cVar6.h();
        if (h12) {
            iArr3 = cVar.f42302g;
            iArr4 = cVar2.f42302g;
        } else {
            b.n(cVar6.f42302g, i14);
            b.g(i14, cVar.f42302g, k11);
            b.g(i14, cVar6.f42302g, i14);
            b.g(i14, cVar2.f42302g, i14);
            iArr3 = k11;
            iArr4 = i14;
        }
        int[] i15 = h.i();
        b.r(iArr3, iArr, i15);
        b.r(iArr4, iArr2, i12);
        if (h.v(i15)) {
            return h.v(i12) ? J() : i11.u();
        }
        int[] i16 = h.i();
        b.n(i15, i16);
        int[] i17 = h.i();
        b.g(i16, i15, i17);
        b.g(i16, iArr3, i13);
        b.i(i17, i17);
        h.y(iArr4, i17, k11);
        b.m(h.b(i13, i13, i17), i17);
        c cVar7 = new c(i14);
        b.n(i12, cVar7.f42302g);
        int[] iArr5 = cVar7.f42302g;
        b.r(iArr5, i17, iArr5);
        c cVar8 = new c(i17);
        b.r(i13, cVar7.f42302g, cVar8.f42302g);
        b.h(cVar8.f42302g, i12, k11);
        b.l(k11, cVar8.f42302g);
        c cVar9 = new c(i15);
        if (!h11) {
            int[] iArr6 = cVar9.f42302g;
            b.g(iArr6, cVar3.f42302g, iArr6);
        }
        if (!h12) {
            int[] iArr7 = cVar9.f42302g;
            b.g(iArr7, cVar6.f42302g, iArr7);
        }
        return new d(i11, cVar7, cVar8, new f[]{cVar9, L(cVar9, (h11 && h12) ? null : null)});
    }

    @Override // n60.i
    protected i d() {
        return new d(null, f(), g());
    }

    @Override // n60.i
    public f s(int i11) {
        return i11 == 1 ? M() : super.s(i11);
    }

    @Override // n60.i
    public i z() {
        return u() ? this : new d(i(), this.f40629b, this.f40630c.m(), this.f40631d);
    }
}