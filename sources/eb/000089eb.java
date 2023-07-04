package n60;

import ch.qos.logback.core.CoreConstants;
import java.math.BigInteger;
import java.util.Hashtable;
import n60.e;
import n60.f;

/* loaded from: classes5.dex */
public abstract class i {

    /* renamed from: f */
    protected static final f[] f40627f = new f[0];

    /* renamed from: a */
    protected n60.e f40628a;

    /* renamed from: b */
    protected f f40629b;

    /* renamed from: c */
    protected f f40630c;

    /* renamed from: d */
    protected f[] f40631d;

    /* renamed from: e */
    protected Hashtable f40632e;

    /* loaded from: classes5.dex */
    public class a implements p {

        /* renamed from: a */
        final /* synthetic */ boolean f40633a;

        /* renamed from: b */
        final /* synthetic */ boolean f40634b;

        a(boolean z11, boolean z12) {
            i.this = r1;
            this.f40633a = z11;
            this.f40634b = z12;
        }

        @Override // n60.p
        public q a(q qVar) {
            u uVar = qVar instanceof u ? (u) qVar : null;
            if (uVar == null) {
                uVar = new u();
            }
            if (uVar.b()) {
                return uVar;
            }
            if (!uVar.a()) {
                if (!this.f40633a && !i.this.C()) {
                    uVar.e();
                    return uVar;
                }
                uVar.d();
            }
            if (this.f40634b && !uVar.c()) {
                if (!i.this.D()) {
                    uVar.e();
                    return uVar;
                }
                uVar.f();
            }
            return uVar;
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class b extends i {
        public b(n60.e eVar, f fVar, f fVar2) {
            super(eVar, fVar, fVar2);
        }

        public b(n60.e eVar, f fVar, f fVar2, f[] fVarArr) {
            super(eVar, fVar, fVar2, fVarArr);
        }

        @Override // n60.i
        protected boolean C() {
            f l11;
            f p11;
            n60.e i11 = i();
            f fVar = this.f40629b;
            f n11 = i11.n();
            f o11 = i11.o();
            int q11 = i11.q();
            if (q11 != 6) {
                f fVar2 = this.f40630c;
                f j11 = fVar2.a(fVar).j(fVar2);
                if (q11 != 0) {
                    if (q11 != 1) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    f fVar3 = this.f40631d[0];
                    if (!fVar3.h()) {
                        f j12 = fVar3.j(fVar3.o());
                        j11 = j11.j(fVar3);
                        n11 = n11.j(fVar3);
                        o11 = o11.j(j12);
                    }
                }
                return j11.equals(fVar.a(n11).j(fVar.o()).a(o11));
            }
            f fVar4 = this.f40631d[0];
            boolean h11 = fVar4.h();
            if (fVar.i()) {
                f o12 = this.f40630c.o();
                if (!h11) {
                    o11 = o11.j(fVar4.o());
                }
                return o12.equals(o11);
            }
            f fVar5 = this.f40630c;
            f o13 = fVar.o();
            if (h11) {
                l11 = fVar5.o().a(fVar5).a(n11);
                p11 = o13.o().a(o11);
            } else {
                f o14 = fVar4.o();
                f o15 = o14.o();
                l11 = fVar5.a(fVar4).l(fVar5, n11, o14);
                p11 = o13.p(o11, o15);
            }
            return l11.j(o13).equals(p11);
        }

        @Override // n60.i
        protected boolean D() {
            BigInteger p11 = this.f40628a.p();
            if (n60.d.f40586c.equals(p11)) {
                return ((f.a) A().f()).w() != 0;
            } else if (n60.d.f40588e.equals(p11)) {
                i A = A();
                f f11 = A.f();
                n60.e eVar = this.f40628a;
                f J = ((e.b) eVar).J(f11.a(eVar.n()));
                if (J == null) {
                    return false;
                }
                return ((f.a) f11.j(J).a(A.g())).w() == 0;
            } else {
                return super.D();
            }
        }

        @Override // n60.i
        public i E(f fVar) {
            if (u()) {
                return this;
            }
            int j11 = j();
            if (j11 == 5) {
                f n11 = n();
                return i().i(n11, o().a(n11).d(fVar).a(n11.j(fVar)), p());
            } else if (j11 != 6) {
                return super.E(fVar);
            } else {
                f n12 = n();
                f o11 = o();
                f fVar2 = p()[0];
                f j12 = n12.j(fVar.o());
                return i().i(j12, o11.a(n12).a(j12), new f[]{fVar2.j(fVar)});
            }
        }

        @Override // n60.i
        public i F(f fVar) {
            if (u()) {
                return this;
            }
            int j11 = j();
            if (j11 == 5 || j11 == 6) {
                f n11 = n();
                return i().i(n11, o().a(n11).j(fVar).a(n11), p());
            }
            return super.F(fVar);
        }

        @Override // n60.i
        public i G(i iVar) {
            return iVar.u() ? this : a(iVar.z());
        }

        public b L(int i11) {
            i h11;
            if (u()) {
                return this;
            }
            n60.e i12 = i();
            int q11 = i12.q();
            f fVar = this.f40629b;
            if (q11 != 0) {
                if (q11 != 1) {
                    if (q11 != 5) {
                        if (q11 != 6) {
                            throw new IllegalStateException("unsupported coordinate system");
                        }
                    }
                }
                h11 = i12.i(fVar.q(i11), this.f40630c.q(i11), new f[]{this.f40631d[0].q(i11)});
                return (b) h11;
            }
            h11 = i12.h(fVar.q(i11), this.f40630c.q(i11));
            return (b) h11;
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class c extends i {
        public c(n60.e eVar, f fVar, f fVar2) {
            super(eVar, fVar, fVar2);
        }

        public c(n60.e eVar, f fVar, f fVar2, f[] fVarArr) {
            super(eVar, fVar, fVar2, fVarArr);
        }

        @Override // n60.i
        protected boolean C() {
            f fVar = this.f40629b;
            f fVar2 = this.f40630c;
            f n11 = this.f40628a.n();
            f o11 = this.f40628a.o();
            f o12 = fVar2.o();
            int j11 = j();
            if (j11 != 0) {
                if (j11 == 1) {
                    f fVar3 = this.f40631d[0];
                    if (!fVar3.h()) {
                        f o13 = fVar3.o();
                        f j12 = fVar3.j(o13);
                        o12 = o12.j(fVar3);
                        n11 = n11.j(o13);
                        o11 = o11.j(j12);
                    }
                } else if (j11 != 2 && j11 != 3 && j11 != 4) {
                    throw new IllegalStateException("unsupported coordinate system");
                } else {
                    f fVar4 = this.f40631d[0];
                    if (!fVar4.h()) {
                        f o14 = fVar4.o();
                        f o15 = o14.o();
                        f j13 = o14.j(o15);
                        n11 = n11.j(o15);
                        o11 = o11.j(j13);
                    }
                }
            }
            return o12.equals(fVar.o().a(n11).j(fVar).a(o11));
        }

        @Override // n60.i
        public i G(i iVar) {
            return iVar.u() ? this : a(iVar.z());
        }

        @Override // n60.i
        protected boolean h() {
            return g().s();
        }
    }

    /* loaded from: classes5.dex */
    public static class d extends b {
        public d(n60.e eVar, f fVar, f fVar2) {
            super(eVar, fVar, fVar2);
        }

        public d(n60.e eVar, f fVar, f fVar2, f[] fVarArr) {
            super(eVar, fVar, fVar2, fVarArr);
        }

        @Override // n60.i
        public i J() {
            f a11;
            if (u()) {
                return this;
            }
            n60.e i11 = i();
            f fVar = this.f40629b;
            if (fVar.i()) {
                return i11.u();
            }
            int q11 = i11.q();
            if (q11 == 0) {
                f a12 = this.f40630c.d(fVar).a(fVar);
                f a13 = a12.o().a(a12).a(i11.n());
                return new d(i11, a13, fVar.p(a13, a12.b()));
            } else if (q11 == 1) {
                f fVar2 = this.f40630c;
                f fVar3 = this.f40631d[0];
                boolean h11 = fVar3.h();
                f j11 = h11 ? fVar : fVar.j(fVar3);
                if (!h11) {
                    fVar2 = fVar2.j(fVar3);
                }
                f o11 = fVar.o();
                f a14 = o11.a(fVar2);
                f o12 = j11.o();
                f a15 = a14.a(j11);
                f l11 = a15.l(a14, o12, i11.n());
                return new d(i11, j11.j(l11), o11.o().l(j11, l11, a15), new f[]{j11.j(o12)});
            } else if (q11 == 6) {
                f fVar4 = this.f40630c;
                f fVar5 = this.f40631d[0];
                boolean h12 = fVar5.h();
                f j12 = h12 ? fVar4 : fVar4.j(fVar5);
                f o13 = h12 ? fVar5 : fVar5.o();
                f n11 = i11.n();
                f j13 = h12 ? n11 : n11.j(o13);
                f a16 = fVar4.o().a(j12).a(j13);
                if (a16.i()) {
                    return new d(i11, a16, i11.o().n());
                }
                f o14 = a16.o();
                f j14 = h12 ? a16 : a16.j(o13);
                f o15 = i11.o();
                if (o15.c() < (i11.t() >> 1)) {
                    f o16 = fVar4.a(fVar).o();
                    a11 = o16.a(a16).a(o13).j(o16).a(o15.h() ? j13.a(o13).o() : j13.p(o15, o13.o())).a(o14);
                    if (!n11.i()) {
                        if (!n11.h()) {
                            a11 = a11.a(n11.b().j(j14));
                        }
                        return new d(i11, o14, a11, new f[]{j14});
                    }
                } else {
                    if (!h12) {
                        fVar = fVar.j(fVar5);
                    }
                    a11 = fVar.p(a16, j12).a(o14);
                }
                a11 = a11.a(j14);
                return new d(i11, o14, a11, new f[]{j14});
            } else {
                throw new IllegalStateException("unsupported coordinate system");
            }
        }

        @Override // n60.i
        public i K(i iVar) {
            if (u()) {
                return iVar;
            }
            if (iVar.u()) {
                return J();
            }
            n60.e i11 = i();
            f fVar = this.f40629b;
            if (fVar.i()) {
                return iVar;
            }
            if (i11.q() != 6) {
                return J().a(iVar);
            }
            f fVar2 = iVar.f40629b;
            f fVar3 = iVar.f40631d[0];
            if (fVar2.i() || !fVar3.h()) {
                return J().a(iVar);
            }
            f fVar4 = this.f40630c;
            f fVar5 = this.f40631d[0];
            f fVar6 = iVar.f40630c;
            f o11 = fVar.o();
            f o12 = fVar4.o();
            f o13 = fVar5.o();
            f a11 = i11.n().j(o13).a(o12).a(fVar4.j(fVar5));
            f b11 = fVar6.b();
            f l11 = i11.n().a(b11).j(o13).a(o12).l(a11, o11, o13);
            f j11 = fVar2.j(o13);
            f o14 = j11.a(a11).o();
            if (o14.i()) {
                return l11.i() ? iVar.J() : i11.u();
            } else if (l11.i()) {
                return new d(i11, l11, i11.o().n());
            } else {
                f j12 = l11.o().j(j11);
                f j13 = l11.j(o14).j(o13);
                return new d(i11, j12, l11.a(o14).o().l(a11, b11, j13), new f[]{j13});
            }
        }

        @Override // n60.i
        public i a(i iVar) {
            f fVar;
            f fVar2;
            f fVar3;
            f fVar4;
            f fVar5;
            f fVar6;
            if (u()) {
                return iVar;
            }
            if (iVar.u()) {
                return this;
            }
            n60.e i11 = i();
            int q11 = i11.q();
            f fVar7 = this.f40629b;
            f fVar8 = iVar.f40629b;
            if (q11 == 0) {
                f fVar9 = this.f40630c;
                f fVar10 = iVar.f40630c;
                f a11 = fVar7.a(fVar8);
                f a12 = fVar9.a(fVar10);
                if (a11.i()) {
                    return a12.i() ? J() : i11.u();
                }
                f d11 = a12.d(a11);
                f a13 = d11.o().a(d11).a(a11).a(i11.n());
                return new d(i11, a13, d11.j(fVar7.a(a13)).a(a13).a(fVar9));
            } else if (q11 == 1) {
                f fVar11 = this.f40630c;
                f fVar12 = this.f40631d[0];
                f fVar13 = iVar.f40630c;
                f fVar14 = iVar.f40631d[0];
                boolean h11 = fVar14.h();
                f a14 = fVar12.j(fVar13).a(h11 ? fVar11 : fVar11.j(fVar14));
                f a15 = fVar12.j(fVar8).a(h11 ? fVar7 : fVar7.j(fVar14));
                if (a15.i()) {
                    return a14.i() ? J() : i11.u();
                }
                f o11 = a15.o();
                f j11 = o11.j(a15);
                if (!h11) {
                    fVar12 = fVar12.j(fVar14);
                }
                f a16 = a14.a(a15);
                f a17 = a16.l(a14, o11, i11.n()).j(fVar12).a(j11);
                f j12 = a15.j(a17);
                if (!h11) {
                    o11 = o11.j(fVar14);
                }
                return new d(i11, j12, a14.l(fVar7, a15, fVar11).l(o11, a16, a17), new f[]{j11.j(fVar12)});
            } else if (q11 == 6) {
                if (fVar7.i()) {
                    return fVar8.i() ? i11.u() : iVar.a(this);
                }
                f fVar15 = this.f40630c;
                f fVar16 = this.f40631d[0];
                f fVar17 = iVar.f40630c;
                f fVar18 = iVar.f40631d[0];
                boolean h12 = fVar16.h();
                if (h12) {
                    fVar = fVar8;
                    fVar2 = fVar17;
                } else {
                    fVar = fVar8.j(fVar16);
                    fVar2 = fVar17.j(fVar16);
                }
                boolean h13 = fVar18.h();
                if (h13) {
                    fVar3 = fVar15;
                } else {
                    fVar7 = fVar7.j(fVar18);
                    fVar3 = fVar15.j(fVar18);
                }
                f a18 = fVar3.a(fVar2);
                f a19 = fVar7.a(fVar);
                if (a19.i()) {
                    return a18.i() ? J() : i11.u();
                }
                if (fVar8.i()) {
                    i A = A();
                    f q12 = A.q();
                    f r11 = A.r();
                    f d12 = r11.a(fVar17).d(q12);
                    fVar4 = d12.o().a(d12).a(q12).a(i11.n());
                    if (fVar4.i()) {
                        return new d(i11, fVar4, i11.o().n());
                    }
                    fVar6 = d12.j(q12.a(fVar4)).a(fVar4).a(r11).d(fVar4).a(fVar4);
                    fVar5 = i11.m(n60.d.f40585b);
                } else {
                    f o12 = a19.o();
                    f j13 = a18.j(fVar7);
                    f j14 = a18.j(fVar);
                    f j15 = j13.j(j14);
                    if (j15.i()) {
                        return new d(i11, j15, i11.o().n());
                    }
                    f j16 = a18.j(o12);
                    f j17 = !h13 ? j16.j(fVar18) : j16;
                    f p11 = j14.a(o12).p(j17, fVar15.a(fVar16));
                    if (!h12) {
                        j17 = j17.j(fVar16);
                    }
                    fVar4 = j15;
                    fVar5 = j17;
                    fVar6 = p11;
                }
                return new d(i11, fVar4, fVar6, new f[]{fVar5});
            } else {
                throw new IllegalStateException("unsupported coordinate system");
            }
        }

        @Override // n60.i
        protected i d() {
            return new d(null, f(), g());
        }

        @Override // n60.i
        protected boolean h() {
            f n11 = n();
            if (n11.i()) {
                return false;
            }
            f o11 = o();
            int j11 = j();
            return (j11 == 5 || j11 == 6) ? o11.s() != n11.s() : o11.d(n11).s();
        }

        @Override // n60.i
        public f r() {
            int j11 = j();
            if (j11 == 5 || j11 == 6) {
                f fVar = this.f40629b;
                f fVar2 = this.f40630c;
                if (u() || fVar.i()) {
                    return fVar2;
                }
                f j12 = fVar2.a(fVar).j(fVar);
                if (6 == j11) {
                    f fVar3 = this.f40631d[0];
                    return !fVar3.h() ? j12.d(fVar3) : j12;
                }
                return j12;
            }
            return this.f40630c;
        }

        @Override // n60.i
        public i z() {
            if (u()) {
                return this;
            }
            f fVar = this.f40629b;
            if (fVar.i()) {
                return this;
            }
            int j11 = j();
            if (j11 != 0) {
                if (j11 == 1) {
                    return new d(this.f40628a, fVar, this.f40630c.a(fVar), new f[]{this.f40631d[0]});
                } else if (j11 != 5) {
                    if (j11 == 6) {
                        f fVar2 = this.f40630c;
                        f fVar3 = this.f40631d[0];
                        return new d(this.f40628a, fVar, fVar2.a(fVar3), new f[]{fVar3});
                    }
                    throw new IllegalStateException("unsupported coordinate system");
                } else {
                    return new d(this.f40628a, fVar, this.f40630c.b());
                }
            }
            return new d(this.f40628a, fVar, this.f40630c.a(fVar));
        }
    }

    /* loaded from: classes5.dex */
    public static class e extends c {
        public e(n60.e eVar, f fVar, f fVar2) {
            super(eVar, fVar, fVar2);
        }

        public e(n60.e eVar, f fVar, f fVar2, f[] fVarArr) {
            super(eVar, fVar, fVar2, fVarArr);
        }

        @Override // n60.i
        public i H() {
            if (u()) {
                return this;
            }
            f fVar = this.f40630c;
            if (fVar.i()) {
                return this;
            }
            n60.e i11 = i();
            int q11 = i11.q();
            if (q11 != 0) {
                return q11 != 4 ? J().a(this) : Q(false).a(this);
            }
            f fVar2 = this.f40629b;
            f R = R(fVar);
            f o11 = R.o();
            f a11 = P(fVar2.o()).a(i().n());
            f r11 = P(fVar2).j(o11).r(a11.o());
            if (r11.i()) {
                return i().u();
            }
            f g11 = r11.j(R).g();
            f j11 = r11.j(g11).j(a11);
            f r12 = o11.o().j(g11).r(j11);
            f a12 = r12.r(j11).j(j11.a(r12)).a(fVar2);
            return new e(i11, a12, fVar2.r(a12).j(r12).r(fVar));
        }

        @Override // n60.i
        public i I(int i11) {
            f o11;
            if (i11 >= 0) {
                if (i11 == 0 || u()) {
                    return this;
                }
                if (i11 == 1) {
                    return J();
                }
                n60.e i12 = i();
                f fVar = this.f40630c;
                if (fVar.i()) {
                    return i12.u();
                }
                int q11 = i12.q();
                f n11 = i12.n();
                f fVar2 = this.f40629b;
                f[] fVarArr = this.f40631d;
                f m11 = fVarArr.length < 1 ? i12.m(n60.d.f40585b) : fVarArr[0];
                if (!m11.h() && q11 != 0) {
                    if (q11 == 1) {
                        o11 = m11.o();
                        fVar2 = fVar2.j(m11);
                        fVar = fVar.j(o11);
                    } else if (q11 == 2) {
                        o11 = null;
                    } else if (q11 != 4) {
                        throw new IllegalStateException("unsupported coordinate system");
                    } else {
                        n11 = O();
                    }
                    n11 = L(m11, o11);
                }
                int i13 = 0;
                while (i13 < i11) {
                    if (fVar.i()) {
                        return i12.u();
                    }
                    f P = P(fVar2.o());
                    f R = R(fVar);
                    f j11 = R.j(fVar);
                    f R2 = R(fVar2.j(j11));
                    f R3 = R(j11.o());
                    if (!n11.i()) {
                        P = P.a(n11);
                        n11 = R(R3.j(n11));
                    }
                    f r11 = P.o().r(R(R2));
                    fVar = P.j(R2.r(r11)).r(R3);
                    m11 = m11.h() ? R : R.j(m11);
                    i13++;
                    fVar2 = r11;
                }
                if (q11 == 0) {
                    f g11 = m11.g();
                    f o12 = g11.o();
                    return new e(i12, fVar2.j(o12), fVar.j(o12.j(g11)));
                } else if (q11 != 1) {
                    if (q11 != 2) {
                        if (q11 == 4) {
                            return new e(i12, fVar2, fVar, new f[]{m11, n11});
                        }
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    return new e(i12, fVar2, fVar, new f[]{m11});
                } else {
                    return new e(i12, fVar2.j(m11), fVar, new f[]{m11.j(m11.o())});
                }
            }
            throw new IllegalArgumentException("'e' cannot be negative");
        }

        @Override // n60.i
        public i J() {
            f fVar;
            f j11;
            if (u()) {
                return this;
            }
            n60.e i11 = i();
            f fVar2 = this.f40630c;
            if (fVar2.i()) {
                return i11.u();
            }
            int q11 = i11.q();
            f fVar3 = this.f40629b;
            if (q11 == 0) {
                f d11 = P(fVar3.o()).a(i().n()).d(R(fVar2));
                f r11 = d11.o().r(R(fVar3));
                return new e(i11, r11, d11.j(fVar3.r(r11)).r(fVar2));
            } else if (q11 == 1) {
                f fVar4 = this.f40631d[0];
                boolean h11 = fVar4.h();
                f n11 = i11.n();
                if (!n11.i() && !h11) {
                    n11 = n11.j(fVar4.o());
                }
                f a11 = n11.a(P(fVar3.o()));
                f j12 = h11 ? fVar2 : fVar2.j(fVar4);
                f o11 = h11 ? fVar2.o() : j12.j(fVar2);
                f N = N(fVar3.j(o11));
                f r12 = a11.o().r(R(N));
                f R = R(j12);
                f j13 = r12.j(R);
                f R2 = R(o11);
                return new e(i11, j13, N.r(r12).j(a11).r(R(R2.o())), new f[]{R(h11 ? R(R2) : R.o()).j(j12)});
            } else if (q11 != 2) {
                if (q11 == 4) {
                    return Q(true);
                }
                throw new IllegalStateException("unsupported coordinate system");
            } else {
                f fVar5 = this.f40631d[0];
                boolean h12 = fVar5.h();
                f o12 = fVar2.o();
                f o13 = o12.o();
                f n12 = i11.n();
                f m11 = n12.m();
                if (m11.t().equals(BigInteger.valueOf(3L))) {
                    f o14 = h12 ? fVar5 : fVar5.o();
                    fVar = P(fVar3.a(o14).j(fVar3.r(o14)));
                    j11 = o12.j(fVar3);
                } else {
                    f P = P(fVar3.o());
                    if (!h12) {
                        if (n12.i()) {
                            fVar = P;
                        } else {
                            f o15 = fVar5.o().o();
                            if (m11.c() < n12.c()) {
                                fVar = P.r(o15.j(m11));
                            } else {
                                n12 = o15.j(n12);
                            }
                        }
                        j11 = fVar3.j(o12);
                    }
                    fVar = P.a(n12);
                    j11 = fVar3.j(o12);
                }
                f N2 = N(j11);
                f r13 = fVar.o().r(R(N2));
                f r14 = N2.r(r13).j(fVar).r(M(o13));
                f R3 = R(fVar2);
                if (!h12) {
                    R3 = R3.j(fVar5);
                }
                return new e(i11, r13, r14, new f[]{R3});
            }
        }

        @Override // n60.i
        public i K(i iVar) {
            if (this == iVar) {
                return H();
            }
            if (u()) {
                return iVar;
            }
            if (iVar.u()) {
                return J();
            }
            f fVar = this.f40630c;
            if (fVar.i()) {
                return iVar;
            }
            n60.e i11 = i();
            int q11 = i11.q();
            if (q11 != 0) {
                return q11 != 4 ? J().a(iVar) : Q(false).a(iVar);
            }
            f fVar2 = this.f40629b;
            f fVar3 = iVar.f40629b;
            f fVar4 = iVar.f40630c;
            f r11 = fVar3.r(fVar2);
            f r12 = fVar4.r(fVar);
            if (r11.i()) {
                return r12.i() ? H() : this;
            }
            f o11 = r11.o();
            f r13 = o11.j(R(fVar2).a(fVar3)).r(r12.o());
            if (r13.i()) {
                return i11.u();
            }
            f g11 = r13.j(r11).g();
            f j11 = r13.j(g11).j(r12);
            f r14 = R(fVar).j(o11).j(r11).j(g11).r(j11);
            f a11 = r14.r(j11).j(j11.a(r14)).a(fVar3);
            return new e(i11, a11, fVar2.r(a11).j(r14).r(fVar));
        }

        protected f L(f fVar, f fVar2) {
            f n11 = i().n();
            if (n11.i() || fVar.h()) {
                return n11;
            }
            if (fVar2 == null) {
                fVar2 = fVar.o();
            }
            f o11 = fVar2.o();
            f m11 = n11.m();
            return m11.c() < n11.c() ? o11.j(m11).m() : o11.j(n11);
        }

        protected f M(f fVar) {
            return N(R(fVar));
        }

        protected f N(f fVar) {
            return R(R(fVar));
        }

        protected f O() {
            f[] fVarArr = this.f40631d;
            f fVar = fVarArr[1];
            if (fVar == null) {
                f L = L(fVarArr[0], null);
                fVarArr[1] = L;
                return L;
            }
            return fVar;
        }

        protected f P(f fVar) {
            return R(fVar).a(fVar);
        }

        protected e Q(boolean z11) {
            f fVar = this.f40629b;
            f fVar2 = this.f40630c;
            f fVar3 = this.f40631d[0];
            f O = O();
            f a11 = P(fVar.o()).a(O);
            f R = R(fVar2);
            f j11 = R.j(fVar2);
            f R2 = R(fVar.j(j11));
            f r11 = a11.o().r(R(R2));
            f R3 = R(j11.o());
            f r12 = a11.j(R2.r(r11)).r(R3);
            f R4 = z11 ? R(R3.j(O)) : null;
            if (!fVar3.h()) {
                R = R.j(fVar3);
            }
            return new e(i(), r11, r12, new f[]{R, R4});
        }

        protected f R(f fVar) {
            return fVar.a(fVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:165:0x0128  */
        /* JADX WARN: Removed duplicated region for block: B:166:0x0136  */
        @Override // n60.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public n60.i a(n60.i r17) {
            /*
                Method dump skipped, instructions count: 532
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: n60.i.e.a(n60.i):n60.i");
        }

        @Override // n60.i
        protected i d() {
            return new e(null, f(), g());
        }

        @Override // n60.i
        public f s(int i11) {
            return (i11 == 1 && 4 == j()) ? O() : super.s(i11);
        }

        @Override // n60.i
        public i z() {
            if (u()) {
                return this;
            }
            n60.e i11 = i();
            return i11.q() != 0 ? new e(i11, this.f40629b, this.f40630c.m(), this.f40631d) : new e(i11, this.f40629b, this.f40630c.m());
        }
    }

    protected i(n60.e eVar, f fVar, f fVar2) {
        this(eVar, fVar, fVar2, m(eVar));
    }

    protected i(n60.e eVar, f fVar, f fVar2, f[] fVarArr) {
        this.f40632e = null;
        this.f40628a = eVar;
        this.f40629b = fVar;
        this.f40630c = fVar2;
        this.f40631d = fVarArr;
    }

    protected static f[] m(n60.e eVar) {
        int q11 = eVar == null ? 0 : eVar.q();
        if (q11 == 0 || q11 == 5) {
            return f40627f;
        }
        f m11 = eVar.m(n60.d.f40585b);
        if (q11 != 1 && q11 != 2) {
            if (q11 == 3) {
                return new f[]{m11, m11, m11};
            }
            if (q11 == 4) {
                return new f[]{m11, eVar.n()};
            }
            if (q11 != 6) {
                throw new IllegalArgumentException("unknown coordinate system");
            }
        }
        return new f[]{m11};
    }

    public i A() {
        int j11;
        if (u() || (j11 = j()) == 0 || j11 == 5) {
            return this;
        }
        f s11 = s(0);
        if (s11.h()) {
            return this;
        }
        if (this.f40628a != null) {
            f C = this.f40628a.C(org.bouncycastle.crypto.k.b());
            return B(s11.j(C).g().j(C));
        }
        throw new IllegalStateException("Detached points must be in affine coordinates");
    }

    public i B(f fVar) {
        int j11 = j();
        if (j11 != 1) {
            if (j11 == 2 || j11 == 3 || j11 == 4) {
                f o11 = fVar.o();
                return c(o11, o11.j(fVar));
            } else if (j11 != 6) {
                throw new IllegalStateException("not a projective coordinate system");
            }
        }
        return c(fVar, fVar);
    }

    protected abstract boolean C();

    protected boolean D() {
        BigInteger w11;
        return n60.d.f40585b.equals(this.f40628a.p()) || (w11 = this.f40628a.w()) == null || n60.c.q(this, w11).u();
    }

    public i E(f fVar) {
        return u() ? this : i().i(n().j(fVar), o(), p());
    }

    public i F(f fVar) {
        return u() ? this : i().i(n(), o().j(fVar), p());
    }

    public abstract i G(i iVar);

    public i H() {
        return K(this);
    }

    public i I(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("'e' cannot be negative");
        }
        i iVar = this;
        while (true) {
            i11--;
            if (i11 < 0) {
                return iVar;
            }
            iVar = iVar.J();
        }
    }

    public abstract i J();

    public i K(i iVar) {
        return J().a(iVar);
    }

    public abstract i a(i iVar);

    protected void b() {
        if (!v()) {
            throw new IllegalStateException("point not in normal form");
        }
    }

    protected i c(f fVar, f fVar2) {
        return i().h(n().j(fVar), o().j(fVar2));
    }

    protected abstract i d();

    public boolean e(i iVar) {
        i iVar2;
        if (iVar == null) {
            return false;
        }
        n60.e i11 = i();
        n60.e i12 = iVar.i();
        boolean z11 = i11 == null;
        boolean z12 = i12 == null;
        boolean u11 = u();
        boolean u12 = iVar.u();
        if (u11 || u12) {
            if (u11 && u12) {
                return z11 || z12 || i11.l(i12);
            }
            return false;
        }
        if (!z11 || !z12) {
            if (!z11) {
                if (z12) {
                    iVar2 = A();
                } else if (!i11.l(i12)) {
                    return false;
                } else {
                    i[] iVarArr = {this, i11.x(iVar)};
                    i11.z(iVarArr);
                    iVar2 = iVarArr[0];
                    iVar = iVarArr[1];
                }
                return iVar2.q().equals(iVar.q()) && iVar2.r().equals(iVar.r());
            }
            iVar = iVar.A();
        }
        iVar2 = this;
        if (iVar2.q().equals(iVar.q())) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return e((i) obj);
        }
        return false;
    }

    public f f() {
        b();
        return q();
    }

    public f g() {
        b();
        return r();
    }

    protected abstract boolean h();

    public int hashCode() {
        n60.e i11 = i();
        int i12 = i11 == null ? 0 : ~i11.hashCode();
        if (u()) {
            return i12;
        }
        i A = A();
        return (i12 ^ (A.q().hashCode() * 17)) ^ (A.r().hashCode() * 257);
    }

    public n60.e i() {
        return this.f40628a;
    }

    protected int j() {
        n60.e eVar = this.f40628a;
        if (eVar == null) {
            return 0;
        }
        return eVar.q();
    }

    public final i k() {
        return A().d();
    }

    public byte[] l(boolean z11) {
        if (u()) {
            return new byte[1];
        }
        i A = A();
        byte[] e11 = A.q().e();
        if (z11) {
            byte[] bArr = new byte[e11.length + 1];
            bArr[0] = (byte) (A.h() ? 3 : 2);
            System.arraycopy(e11, 0, bArr, 1, e11.length);
            return bArr;
        }
        byte[] e12 = A.r().e();
        byte[] bArr2 = new byte[e11.length + e12.length + 1];
        bArr2[0] = 4;
        System.arraycopy(e11, 0, bArr2, 1, e11.length);
        System.arraycopy(e12, 0, bArr2, e11.length + 1, e12.length);
        return bArr2;
    }

    public final f n() {
        return this.f40629b;
    }

    public final f o() {
        return this.f40630c;
    }

    protected final f[] p() {
        return this.f40631d;
    }

    public f q() {
        return this.f40629b;
    }

    public f r() {
        return this.f40630c;
    }

    public f s(int i11) {
        if (i11 >= 0) {
            f[] fVarArr = this.f40631d;
            if (i11 < fVarArr.length) {
                return fVarArr[i11];
            }
        }
        return null;
    }

    public boolean t(boolean z11, boolean z12) {
        if (u()) {
            return true;
        }
        return !((u) i().B(this, "bc_validity", new a(z11, z12))).b();
    }

    public String toString() {
        if (u()) {
            return "INF";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        stringBuffer.append(n());
        stringBuffer.append(CoreConstants.COMMA_CHAR);
        stringBuffer.append(o());
        for (int i11 = 0; i11 < this.f40631d.length; i11++) {
            stringBuffer.append(CoreConstants.COMMA_CHAR);
            stringBuffer.append(this.f40631d[i11]);
        }
        stringBuffer.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return stringBuffer.toString();
    }

    public boolean u() {
        if (this.f40629b != null && this.f40630c != null) {
            f[] fVarArr = this.f40631d;
            if (fVarArr.length <= 0 || !fVarArr[0].i()) {
                return false;
            }
        }
        return true;
    }

    public boolean v() {
        int j11 = j();
        return j11 == 0 || j11 == 5 || u() || this.f40631d[0].h();
    }

    public boolean w() {
        return t(false, true);
    }

    public boolean x() {
        return t(false, false);
    }

    public i y(BigInteger bigInteger) {
        return i().v().a(this, bigInteger);
    }

    public abstract i z();
}