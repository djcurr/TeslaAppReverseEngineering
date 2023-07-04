package q60;

import n60.i;

/* loaded from: classes5.dex */
public class f extends i.c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public f(n60.e eVar, n60.f fVar, n60.f fVar2) {
        super(eVar, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(n60.e eVar, n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
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
        m mVar = (m) this.f40630c;
        if (mVar.i()) {
            return i11.u();
        }
        m mVar2 = (m) this.f40629b;
        m mVar3 = (m) this.f40631d[0];
        int[] d11 = v60.e.d();
        l.m(mVar.f47900g, d11);
        int[] d12 = v60.e.d();
        l.m(d11, d12);
        int[] d13 = v60.e.d();
        l.m(mVar2.f47900g, d13);
        l.l(v60.e.b(d13, d13, d13), d13);
        l.f(d11, mVar2.f47900g, d11);
        l.l(v60.n.M(5, d11, 2, 0), d11);
        int[] d14 = v60.e.d();
        l.l(v60.n.N(5, d12, 3, 0, d14), d14);
        m mVar4 = new m(d12);
        l.m(d13, mVar4.f47900g);
        int[] iArr = mVar4.f47900g;
        l.o(iArr, d11, iArr);
        int[] iArr2 = mVar4.f47900g;
        l.o(iArr2, d11, iArr2);
        m mVar5 = new m(d11);
        l.o(d11, mVar4.f47900g, mVar5.f47900g);
        int[] iArr3 = mVar5.f47900g;
        l.f(iArr3, d13, iArr3);
        int[] iArr4 = mVar5.f47900g;
        l.o(iArr4, d14, iArr4);
        m mVar6 = new m(d13);
        l.p(mVar.f47900g, mVar6.f47900g);
        if (!mVar3.h()) {
            int[] iArr5 = mVar6.f47900g;
            l.f(iArr5, mVar3.f47900g, iArr5);
        }
        return new f(i11, mVar4, mVar5, new n60.f[]{mVar6});
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
        m mVar = (m) this.f40629b;
        m mVar2 = (m) this.f40630c;
        m mVar3 = (m) iVar.q();
        m mVar4 = (m) iVar.r();
        m mVar5 = (m) this.f40631d[0];
        m mVar6 = (m) iVar.s(0);
        int[] e11 = v60.e.e();
        int[] d11 = v60.e.d();
        int[] d12 = v60.e.d();
        int[] d13 = v60.e.d();
        boolean h11 = mVar5.h();
        if (h11) {
            iArr = mVar3.f47900g;
            iArr2 = mVar4.f47900g;
        } else {
            l.m(mVar5.f47900g, d12);
            l.f(d12, mVar3.f47900g, d11);
            l.f(d12, mVar5.f47900g, d12);
            l.f(d12, mVar4.f47900g, d12);
            iArr = d11;
            iArr2 = d12;
        }
        boolean h12 = mVar6.h();
        if (h12) {
            iArr3 = mVar.f47900g;
            iArr4 = mVar2.f47900g;
        } else {
            l.m(mVar6.f47900g, d13);
            l.f(d13, mVar.f47900g, e11);
            l.f(d13, mVar6.f47900g, d13);
            l.f(d13, mVar2.f47900g, d13);
            iArr3 = e11;
            iArr4 = d13;
        }
        int[] d14 = v60.e.d();
        l.o(iArr3, iArr, d14);
        l.o(iArr4, iArr2, d11);
        if (v60.e.k(d14)) {
            return v60.e.k(d11) ? J() : i11.u();
        }
        l.m(d14, d12);
        int[] d15 = v60.e.d();
        l.f(d12, d14, d15);
        l.f(d12, iArr3, d12);
        l.h(d15, d15);
        v60.e.l(iArr4, d15, e11);
        l.l(v60.e.b(d12, d12, d15), d15);
        m mVar7 = new m(d13);
        l.m(d11, mVar7.f47900g);
        int[] iArr5 = mVar7.f47900g;
        l.o(iArr5, d15, iArr5);
        m mVar8 = new m(d15);
        l.o(d12, mVar7.f47900g, mVar8.f47900g);
        l.g(mVar8.f47900g, d11, e11);
        l.k(e11, mVar8.f47900g);
        m mVar9 = new m(d14);
        if (!h11) {
            int[] iArr6 = mVar9.f47900g;
            l.f(iArr6, mVar5.f47900g, iArr6);
        }
        if (!h12) {
            int[] iArr7 = mVar9.f47900g;
            l.f(iArr7, mVar6.f47900g, iArr7);
        }
        return new f(i11, mVar7, mVar8, new n60.f[]{mVar9});
    }

    @Override // n60.i
    protected n60.i d() {
        return new f(null, f(), g());
    }

    @Override // n60.i
    public n60.i z() {
        return u() ? this : new f(this.f40628a, this.f40629b, this.f40630c.m(), this.f40631d);
    }
}