package p60;

import n60.e;
import n60.f;
import n60.i;
import v60.h;
import v60.n;

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
        return (u() || this.f40630c.i()) ? this : J().a(this);
    }

    @Override // n60.i
    public i J() {
        if (u()) {
            return this;
        }
        e i11 = i();
        c cVar = (c) this.f40630c;
        if (cVar.i()) {
            return i11.u();
        }
        c cVar2 = (c) this.f40629b;
        c cVar3 = (c) this.f40631d[0];
        int[] i12 = h.i();
        int[] i13 = h.i();
        int[] i14 = h.i();
        b.n(cVar.f46376g, i14);
        int[] i15 = h.i();
        b.n(i14, i15);
        boolean h11 = cVar3.h();
        int[] iArr = cVar3.f46376g;
        if (!h11) {
            b.n(iArr, i13);
            iArr = i13;
        }
        b.q(cVar2.f46376g, iArr, i12);
        b.a(cVar2.f46376g, iArr, i13);
        b.g(i13, i12, i13);
        b.m(h.b(i13, i13, i13), i13);
        b.g(i14, cVar2.f46376g, i14);
        b.m(n.M(8, i14, 2, 0), i14);
        b.m(n.N(8, i15, 3, 0, i12), i12);
        c cVar4 = new c(i15);
        b.n(i13, cVar4.f46376g);
        int[] iArr2 = cVar4.f46376g;
        b.q(iArr2, i14, iArr2);
        int[] iArr3 = cVar4.f46376g;
        b.q(iArr3, i14, iArr3);
        c cVar5 = new c(i14);
        b.q(i14, cVar4.f46376g, cVar5.f46376g);
        int[] iArr4 = cVar5.f46376g;
        b.g(iArr4, i13, iArr4);
        int[] iArr5 = cVar5.f46376g;
        b.q(iArr5, i12, iArr5);
        c cVar6 = new c(i13);
        b.r(cVar.f46376g, cVar6.f46376g);
        if (!h11) {
            int[] iArr6 = cVar6.f46376g;
            b.g(iArr6, cVar3.f46376g, iArr6);
        }
        return new d(i11, cVar4, cVar5, new f[]{cVar6});
    }

    @Override // n60.i
    public i K(i iVar) {
        return this == iVar ? H() : u() ? iVar : iVar.u() ? J() : this.f40630c.i() ? iVar : J().a(iVar);
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
        c cVar3 = (c) iVar.q();
        c cVar4 = (c) iVar.r();
        c cVar5 = (c) this.f40631d[0];
        c cVar6 = (c) iVar.s(0);
        int[] k11 = h.k();
        int[] i12 = h.i();
        int[] i13 = h.i();
        int[] i14 = h.i();
        boolean h11 = cVar5.h();
        if (h11) {
            iArr = cVar3.f46376g;
            iArr2 = cVar4.f46376g;
        } else {
            b.n(cVar5.f46376g, i13);
            b.g(i13, cVar3.f46376g, i12);
            b.g(i13, cVar5.f46376g, i13);
            b.g(i13, cVar4.f46376g, i13);
            iArr = i12;
            iArr2 = i13;
        }
        boolean h12 = cVar6.h();
        if (h12) {
            iArr3 = cVar.f46376g;
            iArr4 = cVar2.f46376g;
        } else {
            b.n(cVar6.f46376g, i14);
            b.g(i14, cVar.f46376g, k11);
            b.g(i14, cVar6.f46376g, i14);
            b.g(i14, cVar2.f46376g, i14);
            iArr3 = k11;
            iArr4 = i14;
        }
        int[] i15 = h.i();
        b.q(iArr3, iArr, i15);
        b.q(iArr4, iArr2, i12);
        if (h.v(i15)) {
            return h.v(i12) ? J() : i11.u();
        }
        b.n(i15, i13);
        int[] i16 = h.i();
        b.g(i13, i15, i16);
        b.g(i13, iArr3, i13);
        b.i(i16, i16);
        h.y(iArr4, i16, k11);
        b.m(h.b(i13, i13, i16), i16);
        c cVar7 = new c(i14);
        b.n(i12, cVar7.f46376g);
        int[] iArr5 = cVar7.f46376g;
        b.q(iArr5, i16, iArr5);
        c cVar8 = new c(i16);
        b.q(i13, cVar7.f46376g, cVar8.f46376g);
        b.h(cVar8.f46376g, i12, k11);
        b.l(k11, cVar8.f46376g);
        c cVar9 = new c(i15);
        if (!h11) {
            int[] iArr6 = cVar9.f46376g;
            b.g(iArr6, cVar5.f46376g, iArr6);
        }
        if (!h12) {
            int[] iArr7 = cVar9.f46376g;
            b.g(iArr7, cVar6.f46376g, iArr7);
        }
        return new d(i11, cVar7, cVar8, new f[]{cVar9});
    }

    @Override // n60.i
    protected i d() {
        return new d(null, f(), g());
    }

    @Override // n60.i
    public i z() {
        return u() ? this : new d(this.f40628a, this.f40629b, this.f40630c.m(), this.f40631d);
    }
}