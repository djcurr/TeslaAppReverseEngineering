package q60;

import n60.i;

/* loaded from: classes5.dex */
public class v2 extends i.b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public v2(n60.e eVar, n60.f fVar, n60.f fVar2) {
        super(eVar, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v2(n60.e eVar, n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
        super(eVar, fVar, fVar2, fVarArr);
    }

    @Override // n60.i
    public n60.i J() {
        long[] jArr;
        if (u()) {
            return this;
        }
        n60.e i11 = i();
        r2 r2Var = (r2) this.f40629b;
        if (r2Var.i()) {
            return i11.u();
        }
        r2 r2Var2 = (r2) this.f40630c;
        r2 r2Var3 = (r2) this.f40631d[0];
        long[] c11 = v60.m.c();
        long[] c12 = v60.m.c();
        long[] s11 = r2Var3.h() ? null : q2.s(r2Var3.f47952g);
        long[] jArr2 = r2Var2.f47952g;
        if (s11 == null) {
            jArr = r2Var3.f47952g;
        } else {
            q2.q(jArr2, s11, c11);
            q2.w(r2Var3.f47952g, c12);
            jArr2 = c11;
            jArr = c12;
        }
        long[] c13 = v60.m.c();
        q2.w(r2Var2.f47952g, c13);
        q2.d(jArr2, jArr, c13);
        if (v60.m.g(c13)) {
            return new v2(i11, new r2(c13), u2.f47978m);
        }
        long[] d11 = v60.m.d();
        q2.p(c13, jArr2, d11);
        r2 r2Var4 = new r2(c11);
        q2.w(c13, r2Var4.f47952g);
        r2 r2Var5 = new r2(c13);
        if (s11 != null) {
            long[] jArr3 = r2Var5.f47952g;
            q2.o(jArr3, jArr, jArr3);
        }
        long[] jArr4 = r2Var.f47952g;
        if (s11 != null) {
            q2.q(jArr4, s11, c12);
            jArr4 = c12;
        }
        q2.x(jArr4, d11);
        q2.t(d11, c12);
        q2.d(r2Var4.f47952g, r2Var5.f47952g, c12);
        return new v2(i11, r2Var4, new r2(c12), new n60.f[]{r2Var5});
    }

    @Override // n60.i
    public n60.i K(n60.i iVar) {
        if (u()) {
            return iVar;
        }
        if (iVar.u()) {
            return J();
        }
        n60.e i11 = i();
        r2 r2Var = (r2) this.f40629b;
        if (r2Var.i()) {
            return iVar;
        }
        r2 r2Var2 = (r2) iVar.n();
        r2 r2Var3 = (r2) iVar.s(0);
        if (r2Var2.i() || !r2Var3.h()) {
            return J().a(iVar);
        }
        r2 r2Var4 = (r2) this.f40630c;
        r2 r2Var5 = (r2) this.f40631d[0];
        r2 r2Var6 = (r2) iVar.o();
        long[] c11 = v60.m.c();
        long[] c12 = v60.m.c();
        long[] c13 = v60.m.c();
        long[] c14 = v60.m.c();
        q2.w(r2Var.f47952g, c11);
        q2.w(r2Var4.f47952g, c12);
        q2.w(r2Var5.f47952g, c13);
        q2.o(r2Var4.f47952g, r2Var5.f47952g, c14);
        q2.d(c13, c12, c14);
        long[] s11 = q2.s(c13);
        q2.q(r2Var6.f47952g, s11, c13);
        q2.b(c13, c12, c13);
        long[] d11 = v60.m.d();
        q2.p(c13, c14, d11);
        q2.r(c11, s11, d11);
        q2.t(d11, c13);
        q2.q(r2Var2.f47952g, s11, c11);
        q2.b(c11, c14, c12);
        q2.w(c12, c12);
        if (v60.m.g(c12)) {
            return v60.m.g(c13) ? iVar.J() : i11.u();
        } else if (v60.m.g(c13)) {
            return new v2(i11, new r2(c13), u2.f47978m);
        } else {
            r2 r2Var7 = new r2();
            q2.w(c13, r2Var7.f47952g);
            long[] jArr = r2Var7.f47952g;
            q2.o(jArr, c11, jArr);
            r2 r2Var8 = new r2(c11);
            q2.o(c13, c12, r2Var8.f47952g);
            long[] jArr2 = r2Var8.f47952g;
            q2.q(jArr2, s11, jArr2);
            r2 r2Var9 = new r2(c12);
            q2.b(c13, c12, r2Var9.f47952g);
            long[] jArr3 = r2Var9.f47952g;
            q2.w(jArr3, jArr3);
            v60.n.X(18, d11);
            q2.p(r2Var9.f47952g, c14, d11);
            q2.f(r2Var6.f47952g, c14);
            q2.p(c14, r2Var8.f47952g, d11);
            q2.t(d11, r2Var9.f47952g);
            return new v2(i11, r2Var7, r2Var9, new n60.f[]{r2Var8});
        }
    }

    @Override // n60.i
    public n60.i a(n60.i iVar) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        r2 r2Var;
        r2 r2Var2;
        r2 r2Var3;
        if (u()) {
            return iVar;
        }
        if (iVar.u()) {
            return this;
        }
        n60.e i11 = i();
        r2 r2Var4 = (r2) this.f40629b;
        r2 r2Var5 = (r2) iVar.n();
        if (r2Var4.i()) {
            return r2Var5.i() ? i11.u() : iVar.a(this);
        }
        r2 r2Var6 = (r2) this.f40630c;
        r2 r2Var7 = (r2) this.f40631d[0];
        r2 r2Var8 = (r2) iVar.o();
        r2 r2Var9 = (r2) iVar.s(0);
        long[] c11 = v60.m.c();
        long[] c12 = v60.m.c();
        long[] c13 = v60.m.c();
        long[] c14 = v60.m.c();
        long[] s11 = r2Var7.h() ? null : q2.s(r2Var7.f47952g);
        if (s11 == null) {
            jArr = r2Var5.f47952g;
            jArr2 = r2Var8.f47952g;
        } else {
            q2.q(r2Var5.f47952g, s11, c12);
            q2.q(r2Var8.f47952g, s11, c14);
            jArr = c12;
            jArr2 = c14;
        }
        long[] s12 = r2Var9.h() ? null : q2.s(r2Var9.f47952g);
        long[] jArr4 = r2Var4.f47952g;
        if (s12 == null) {
            jArr3 = r2Var6.f47952g;
        } else {
            q2.q(jArr4, s12, c11);
            q2.q(r2Var6.f47952g, s12, c13);
            jArr4 = c11;
            jArr3 = c13;
        }
        q2.b(jArr3, jArr2, c13);
        q2.b(jArr4, jArr, c14);
        if (v60.m.g(c14)) {
            return v60.m.g(c13) ? J() : i11.u();
        }
        if (r2Var5.i()) {
            n60.i A = A();
            r2 r2Var10 = (r2) A.q();
            n60.f r11 = A.r();
            n60.f d11 = r11.a(r2Var8).d(r2Var10);
            r2Var = (r2) d11.o().a(d11).a(r2Var10).b();
            if (r2Var.i()) {
                return new v2(i11, r2Var, u2.f47978m);
            }
            r2Var2 = (r2) d11.j(r2Var10.a(r2Var)).a(r2Var).a(r11).d(r2Var).a(r2Var);
            r2Var3 = (r2) i11.m(n60.d.f40585b);
        } else {
            q2.w(c14, c14);
            long[] s13 = q2.s(c13);
            q2.q(jArr4, s13, c11);
            q2.q(jArr, s13, c12);
            r2 r2Var11 = new r2(c11);
            q2.o(c11, c12, r2Var11.f47952g);
            if (r2Var11.i()) {
                return new v2(i11, r2Var11, u2.f47978m);
            }
            r2 r2Var12 = new r2(c13);
            q2.q(c14, s13, r2Var12.f47952g);
            if (s12 != null) {
                long[] jArr5 = r2Var12.f47952g;
                q2.q(jArr5, s12, jArr5);
            }
            long[] d12 = v60.m.d();
            q2.b(c12, c14, c14);
            q2.x(c14, d12);
            q2.b(r2Var6.f47952g, r2Var7.f47952g, c14);
            q2.p(c14, r2Var12.f47952g, d12);
            r2 r2Var13 = new r2(c14);
            q2.t(d12, r2Var13.f47952g);
            if (s11 != null) {
                long[] jArr6 = r2Var12.f47952g;
                q2.q(jArr6, s11, jArr6);
            }
            r2Var = r2Var11;
            r2Var2 = r2Var13;
            r2Var3 = r2Var12;
        }
        return new v2(i11, r2Var, r2Var2, new n60.f[]{r2Var3});
    }

    @Override // n60.i
    protected n60.i d() {
        return new v2(null, f(), g());
    }

    @Override // n60.i
    protected boolean h() {
        n60.f n11 = n();
        return (n11.i() || o().s() == n11.s()) ? false : true;
    }

    @Override // n60.i
    public n60.f r() {
        n60.f fVar = this.f40629b;
        n60.f fVar2 = this.f40630c;
        if (u() || fVar.i()) {
            return fVar2;
        }
        n60.f j11 = fVar2.a(fVar).j(fVar);
        n60.f fVar3 = this.f40631d[0];
        return !fVar3.h() ? j11.d(fVar3) : j11;
    }

    @Override // n60.i
    public n60.i z() {
        if (u()) {
            return this;
        }
        n60.f fVar = this.f40629b;
        if (fVar.i()) {
            return this;
        }
        n60.f fVar2 = this.f40630c;
        n60.f fVar3 = this.f40631d[0];
        return new v2(this.f40628a, fVar, fVar2.a(fVar3), new n60.f[]{fVar3});
    }
}