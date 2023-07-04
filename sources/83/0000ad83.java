package q60;

import n60.i;

/* loaded from: classes5.dex */
public class t2 extends i.b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public t2(n60.e eVar, n60.f fVar, n60.f fVar2) {
        super(eVar, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t2(n60.e eVar, n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
        super(eVar, fVar, fVar2, fVarArr);
    }

    @Override // n60.i
    public n60.i J() {
        if (u()) {
            return this;
        }
        n60.e i11 = i();
        n60.f fVar = this.f40629b;
        if (fVar.i()) {
            return i11.u();
        }
        n60.f fVar2 = this.f40630c;
        n60.f fVar3 = this.f40631d[0];
        boolean h11 = fVar3.h();
        n60.f o11 = h11 ? fVar3 : fVar3.o();
        n60.f a11 = h11 ? fVar2.o().a(fVar2) : fVar2.a(fVar3).j(fVar2);
        if (a11.i()) {
            return new t2(i11, a11, i11.o());
        }
        n60.f o12 = a11.o();
        n60.f j11 = h11 ? a11 : a11.j(o11);
        n60.f o13 = fVar2.a(fVar).o();
        if (!h11) {
            fVar3 = o11.o();
        }
        return new t2(i11, o12, o13.a(a11).a(o11).j(o13).a(fVar3).a(o12).a(j11), new n60.f[]{j11});
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
        n60.f fVar = this.f40629b;
        if (fVar.i()) {
            return iVar;
        }
        n60.f n11 = iVar.n();
        n60.f s11 = iVar.s(0);
        if (n11.i() || !s11.h()) {
            return J().a(iVar);
        }
        n60.f fVar2 = this.f40630c;
        n60.f fVar3 = this.f40631d[0];
        n60.f o11 = iVar.o();
        n60.f o12 = fVar.o();
        n60.f o13 = fVar2.o();
        n60.f o14 = fVar3.o();
        n60.f a11 = o13.a(fVar2.j(fVar3));
        n60.f b11 = o11.b();
        n60.f l11 = b11.j(o14).a(o13).l(a11, o12, o14);
        n60.f j11 = n11.j(o14);
        n60.f o15 = j11.a(a11).o();
        if (o15.i()) {
            return l11.i() ? iVar.J() : i11.u();
        } else if (l11.i()) {
            return new t2(i11, l11, i11.o());
        } else {
            n60.f j12 = l11.o().j(j11);
            n60.f j13 = l11.j(o15).j(o14);
            return new t2(i11, j12, l11.a(o15).o().l(a11, b11, j13), new n60.f[]{j13});
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
            r2Var = (r2) d11.o().a(d11).a(r2Var10);
            if (r2Var.i()) {
                return new t2(i11, r2Var, i11.o());
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
                return new t2(i11, r2Var11, i11.o());
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
        return new t2(i11, r2Var, r2Var2, new n60.f[]{r2Var3});
    }

    @Override // n60.i
    protected n60.i d() {
        return new t2(null, f(), g());
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
        return new t2(this.f40628a, fVar, fVar2.a(fVar3), new n60.f[]{fVar3});
    }
}