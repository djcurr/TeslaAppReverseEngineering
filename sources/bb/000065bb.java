package di;

import ak.n;
import android.os.Looper;
import android.util.SparseArray;
import android.view.Surface;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.z0;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.common.collect.t;
import di.e1;
import java.io.IOException;
import java.util.List;
import zj.d;

/* loaded from: classes3.dex */
public class d1 implements s0.a, com.google.android.exoplayer2.audio.a, bk.w, com.google.android.exoplayer2.source.k, d.a, com.google.android.exoplayer2.drm.f {

    /* renamed from: a */
    private final ak.b f24023a;

    /* renamed from: b */
    private final z0.b f24024b;

    /* renamed from: c */
    private final z0.c f24025c;

    /* renamed from: d */
    private final a f24026d;

    /* renamed from: e */
    private final SparseArray<e1.a> f24027e;

    /* renamed from: f */
    private ak.n<e1, e1.b> f24028f;

    /* renamed from: g */
    private com.google.android.exoplayer2.s0 f24029g;

    /* renamed from: h */
    private boolean f24030h;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final z0.b f24031a;

        /* renamed from: b */
        private com.google.common.collect.r<j.a> f24032b = com.google.common.collect.r.r();

        /* renamed from: c */
        private com.google.common.collect.t<j.a, com.google.android.exoplayer2.z0> f24033c = com.google.common.collect.t.l();

        /* renamed from: d */
        private j.a f24034d;

        /* renamed from: e */
        private j.a f24035e;

        /* renamed from: f */
        private j.a f24036f;

        public a(z0.b bVar) {
            this.f24031a = bVar;
        }

        private void b(t.a<j.a, com.google.android.exoplayer2.z0> aVar, j.a aVar2, com.google.android.exoplayer2.z0 z0Var) {
            if (aVar2 == null) {
                return;
            }
            if (z0Var.b(aVar2.f26303a) != -1) {
                aVar.d(aVar2, z0Var);
                return;
            }
            com.google.android.exoplayer2.z0 z0Var2 = this.f24033c.get(aVar2);
            if (z0Var2 != null) {
                aVar.d(aVar2, z0Var2);
            }
        }

        private static j.a c(com.google.android.exoplayer2.s0 s0Var, com.google.common.collect.r<j.a> rVar, j.a aVar, z0.b bVar) {
            com.google.android.exoplayer2.z0 l11 = s0Var.l();
            int q11 = s0Var.q();
            Object m11 = l11.q() ? null : l11.m(q11);
            int d11 = (s0Var.c() || l11.q()) ? -1 : l11.f(q11, bVar).d(ci.b.c(s0Var.C()) - bVar.l());
            for (int i11 = 0; i11 < rVar.size(); i11++) {
                j.a aVar2 = rVar.get(i11);
                if (i(aVar2, m11, s0Var.c(), s0Var.i(), s0Var.s(), d11)) {
                    return aVar2;
                }
            }
            if (rVar.isEmpty() && aVar != null) {
                if (i(aVar, m11, s0Var.c(), s0Var.i(), s0Var.s(), d11)) {
                    return aVar;
                }
            }
            return null;
        }

        private static boolean i(j.a aVar, Object obj, boolean z11, int i11, int i12, int i13) {
            if (aVar.f26303a.equals(obj)) {
                return (z11 && aVar.f26304b == i11 && aVar.f26305c == i12) || (!z11 && aVar.f26304b == -1 && aVar.f26307e == i13);
            }
            return false;
        }

        private void m(com.google.android.exoplayer2.z0 z0Var) {
            t.a<j.a, com.google.android.exoplayer2.z0> a11 = com.google.common.collect.t.a();
            if (this.f24032b.isEmpty()) {
                b(a11, this.f24035e, z0Var);
                if (!com.google.common.base.q.a(this.f24036f, this.f24035e)) {
                    b(a11, this.f24036f, z0Var);
                }
                if (!com.google.common.base.q.a(this.f24034d, this.f24035e) && !com.google.common.base.q.a(this.f24034d, this.f24036f)) {
                    b(a11, this.f24034d, z0Var);
                }
            } else {
                for (int i11 = 0; i11 < this.f24032b.size(); i11++) {
                    b(a11, this.f24032b.get(i11), z0Var);
                }
                if (!this.f24032b.contains(this.f24034d)) {
                    b(a11, this.f24034d, z0Var);
                }
            }
            this.f24033c = a11.a();
        }

        public j.a d() {
            return this.f24034d;
        }

        public j.a e() {
            if (this.f24032b.isEmpty()) {
                return null;
            }
            return (j.a) com.google.common.collect.w.b(this.f24032b);
        }

        public com.google.android.exoplayer2.z0 f(j.a aVar) {
            return this.f24033c.get(aVar);
        }

        public j.a g() {
            return this.f24035e;
        }

        public j.a h() {
            return this.f24036f;
        }

        public void j(com.google.android.exoplayer2.s0 s0Var) {
            this.f24034d = c(s0Var, this.f24032b, this.f24035e, this.f24031a);
        }

        public void k(List<j.a> list, j.a aVar, com.google.android.exoplayer2.s0 s0Var) {
            this.f24032b = com.google.common.collect.r.o(list);
            if (!list.isEmpty()) {
                this.f24035e = list.get(0);
                this.f24036f = (j.a) ak.a.e(aVar);
            }
            if (this.f24034d == null) {
                this.f24034d = c(s0Var, this.f24032b, this.f24035e, this.f24031a);
            }
            m(s0Var.l());
        }

        public void l(com.google.android.exoplayer2.s0 s0Var) {
            this.f24034d = c(s0Var, this.f24032b, this.f24035e, this.f24031a);
            m(s0Var.l());
        }
    }

    public d1(ak.b bVar) {
        this.f24023a = (ak.b) ak.a.e(bVar);
        this.f24028f = new ak.n<>(ak.k0.P(), bVar, new com.google.common.base.a0() { // from class: di.x0
            @Override // com.google.common.base.a0
            public final Object get() {
                return new e1.b();
            }
        }, new n.b() { // from class: di.w0
            @Override // ak.n.b
            public final void a(Object obj, ak.s sVar) {
                d1.m0((e1) obj, (e1.b) sVar);
            }
        });
        z0.b bVar2 = new z0.b();
        this.f24024b = bVar2;
        this.f24025c = new z0.c();
        this.f24026d = new a(bVar2);
        this.f24027e = new SparseArray<>();
    }

    public static /* synthetic */ void A0(e1.a aVar, int i11, long j11, e1 e1Var) {
        e1Var.c(aVar, i11, j11);
    }

    public static /* synthetic */ void B0(e1.a aVar, e1 e1Var) {
        e1Var.B(aVar);
    }

    public static /* synthetic */ void C0(e1.a aVar, int i11, e1 e1Var) {
        e1Var.S(aVar, i11);
    }

    public static /* synthetic */ void D0(e1.a aVar, ci.l lVar, e1 e1Var) {
        e1Var.b(aVar, lVar);
    }

    public static /* synthetic */ void E0(e1.a aVar, List list, e1 e1Var) {
        e1Var.l(aVar, list);
    }

    public static /* synthetic */ void F0(e1.a aVar, e1 e1Var) {
        e1Var.G(aVar);
    }

    public static /* synthetic */ void G0(e1.a aVar, fj.g gVar, fj.h hVar, IOException iOException, boolean z11, e1 e1Var) {
        e1Var.w(aVar, gVar, hVar, iOException, z11);
    }

    public static /* synthetic */ void H0(e1.a aVar, boolean z11, e1 e1Var) {
        e1Var.a0(aVar, z11);
    }

    public static /* synthetic */ void I0(e1.a aVar, String str, e1 e1Var) {
        e1Var.q(aVar, str);
    }

    public static /* synthetic */ void J0(e1.a aVar, fj.h hVar, e1 e1Var) {
        e1Var.o(aVar, hVar);
    }

    public static /* synthetic */ void K0(e1.a aVar, fj.g gVar, fj.h hVar, e1 e1Var) {
        e1Var.L(aVar, gVar, hVar);
    }

    public static /* synthetic */ void L0(e1.a aVar, e1 e1Var) {
        e1Var.r(aVar);
    }

    public static /* synthetic */ void M0(e1.a aVar, e1 e1Var) {
        e1Var.d(aVar);
    }

    public static /* synthetic */ void N0(e1.a aVar, ci.i iVar, fi.e eVar, e1 e1Var) {
        i2(aVar, iVar, eVar, e1Var);
    }

    public static /* synthetic */ void O0(e1.a aVar, ci.i iVar, fi.e eVar, e1 e1Var) {
        r1(aVar, iVar, eVar, e1Var);
    }

    public static /* synthetic */ void P0(e1.a aVar, fj.g gVar, fj.h hVar, e1 e1Var) {
        e1Var.H(aVar, gVar, hVar);
    }

    public static /* synthetic */ void Q0(e1.a aVar, long j11, int i11, e1 e1Var) {
        e1Var.Y(aVar, j11, i11);
    }

    public static /* synthetic */ void R0(e1.a aVar, int i11, e1 e1Var) {
        e1Var.E(aVar, i11);
    }

    public static /* synthetic */ void S0(e1.a aVar, int i11, e1 e1Var) {
        e1Var.X(aVar, i11);
    }

    public static /* synthetic */ void T0(e1.a aVar, float f11, e1 e1Var) {
        e1Var.U(aVar, f11);
    }

    public static /* synthetic */ void U0(e1.a aVar, boolean z11, int i11, e1 e1Var) {
        e1Var.f0(aVar, z11, i11);
    }

    public static /* synthetic */ void V0(e1.a aVar, boolean z11, int i11, e1 e1Var) {
        e1Var.d0(aVar, z11, i11);
    }

    public static /* synthetic */ void W0(e1.a aVar, Surface surface, e1 e1Var) {
        e1Var.u(aVar, surface);
    }

    public static /* synthetic */ void X0(e1.a aVar, String str, long j11, e1 e1Var) {
        n1(aVar, str, j11, e1Var);
    }

    public static /* synthetic */ void Y0(e1.a aVar, e1 e1Var) {
        e1Var.Q(aVar);
    }

    public static /* synthetic */ void Z0(e1.a aVar, boolean z11, e1 e1Var) {
        e1Var.f(aVar, z11);
    }

    public static /* synthetic */ void a1(e1.a aVar, long j11, e1 e1Var) {
        e1Var.a(aVar, j11);
    }

    public static /* synthetic */ void b1(e1.a aVar, int i11, long j11, long j12, e1 e1Var) {
        e1Var.D(aVar, i11, j11, j12);
    }

    public static /* synthetic */ void c0(e1.a aVar, boolean z11, e1 e1Var) {
        e1Var.n(aVar, z11);
    }

    public static /* synthetic */ void c1(e1.a aVar, fi.d dVar, e1 e1Var) {
        g2(aVar, dVar, e1Var);
    }

    public static /* synthetic */ void d0(e1.a aVar, int i11, e1 e1Var) {
        e1Var.s(aVar, i11);
    }

    public static /* synthetic */ void d1(d1 d1Var, com.google.android.exoplayer2.s0 s0Var, e1 e1Var, e1.b bVar) {
        d1Var.m2(s0Var, e1Var, bVar);
    }

    public static /* synthetic */ void d2(e1.a aVar, String str, long j11, e1 e1Var) {
        e1Var.x(aVar, str, j11);
        e1Var.M(aVar, 2, str, j11);
    }

    public static /* synthetic */ void e0(e1.a aVar, wi.a aVar2, e1 e1Var) {
        e1Var.j(aVar, aVar2);
    }

    public static /* synthetic */ void f0(e1.a aVar, fj.h hVar, e1 e1Var) {
        e1Var.W(aVar, hVar);
    }

    public static /* synthetic */ void f2(e1.a aVar, fi.d dVar, e1 e1Var) {
        e1Var.t(aVar, dVar);
        e1Var.V(aVar, 2, dVar);
    }

    public static /* synthetic */ void g0(e1.a aVar, String str, e1 e1Var) {
        e1Var.O(aVar, str);
    }

    private e1.a g1(j.a aVar) {
        ak.a.e(this.f24029g);
        com.google.android.exoplayer2.z0 f11 = aVar == null ? null : this.f24026d.f(aVar);
        if (aVar != null && f11 != null) {
            return f1(f11, f11.h(aVar.f26303a, this.f24024b).f14781c, aVar);
        }
        int g11 = this.f24029g.g();
        com.google.android.exoplayer2.z0 l11 = this.f24029g.l();
        if (!(g11 < l11.p())) {
            l11 = com.google.android.exoplayer2.z0.f14778a;
        }
        return f1(l11, g11, null);
    }

    public static /* synthetic */ void g2(e1.a aVar, fi.d dVar, e1 e1Var) {
        e1Var.I(aVar, dVar);
        e1Var.y(aVar, 2, dVar);
    }

    public static /* synthetic */ void h0(e1.a aVar, Exception exc, e1 e1Var) {
        e1Var.i(aVar, exc);
    }

    private e1.a h1() {
        return g1(this.f24026d.e());
    }

    public static /* synthetic */ void i0(e1.a aVar, fj.v vVar, xj.k kVar, e1 e1Var) {
        e1Var.e(aVar, vVar, kVar);
    }

    private e1.a i1(int i11, j.a aVar) {
        ak.a.e(this.f24029g);
        if (aVar != null) {
            if (this.f24026d.f(aVar) != null) {
                return g1(aVar);
            }
            return f1(com.google.android.exoplayer2.z0.f14778a, i11, aVar);
        }
        com.google.android.exoplayer2.z0 l11 = this.f24029g.l();
        if (!(i11 < l11.p())) {
            l11 = com.google.android.exoplayer2.z0.f14778a;
        }
        return f1(l11, i11, null);
    }

    public static /* synthetic */ void i2(e1.a aVar, ci.i iVar, fi.e eVar, e1 e1Var) {
        e1Var.P(aVar, iVar, eVar);
        e1Var.h(aVar, 2, iVar);
    }

    public static /* synthetic */ void j0(e1.a aVar, fi.d dVar, e1 e1Var) {
        f2(aVar, dVar, e1Var);
    }

    private e1.a j1() {
        return g1(this.f24026d.g());
    }

    public static /* synthetic */ void k0(e1.a aVar, int i11, int i12, int i13, float f11, e1 e1Var) {
        e1Var.p(aVar, i11, i12, i13, f11);
    }

    private e1.a k1() {
        return g1(this.f24026d.h());
    }

    public static /* synthetic */ void l0(e1.a aVar, int i11, long j11, long j12, e1 e1Var) {
        e1Var.c0(aVar, i11, j11, j12);
    }

    public static /* synthetic */ void l1(e1 e1Var, e1.b bVar) {
    }

    public static /* synthetic */ void m0(e1 e1Var, e1.b bVar) {
        l1(e1Var, bVar);
    }

    public /* synthetic */ void m2(com.google.android.exoplayer2.s0 s0Var, e1 e1Var, e1.b bVar) {
        bVar.f(this.f24027e);
        e1Var.N(s0Var, bVar);
    }

    public static /* synthetic */ void n0(e1.a aVar, String str, long j11, e1 e1Var) {
        d2(aVar, str, j11, e1Var);
    }

    public static /* synthetic */ void n1(e1.a aVar, String str, long j11, e1 e1Var) {
        e1Var.h0(aVar, str, j11);
        e1Var.M(aVar, 1, str, j11);
    }

    public static /* synthetic */ void o0(e1.a aVar, int i11, int i12, e1 e1Var) {
        e1Var.F(aVar, i11, i12);
    }

    public static /* synthetic */ void p0(e1.a aVar, com.google.android.exoplayer2.i0 i0Var, int i11, e1 e1Var) {
        e1Var.b0(aVar, i0Var, i11);
    }

    public static /* synthetic */ void p1(e1.a aVar, fi.d dVar, e1 e1Var) {
        e1Var.T(aVar, dVar);
        e1Var.V(aVar, 1, dVar);
    }

    public static /* synthetic */ void q0(e1.a aVar, e1 e1Var) {
        e1Var.K(aVar);
    }

    public static /* synthetic */ void q1(e1.a aVar, fi.d dVar, e1 e1Var) {
        e1Var.A(aVar, dVar);
        e1Var.y(aVar, 1, dVar);
    }

    public static /* synthetic */ void r0(e1.a aVar, ExoPlaybackException exoPlaybackException, e1 e1Var) {
        e1Var.e0(aVar, exoPlaybackException);
    }

    public static /* synthetic */ void r1(e1.a aVar, ci.i iVar, fi.e eVar, e1 e1Var) {
        e1Var.C(aVar, iVar, eVar);
        e1Var.h(aVar, 1, iVar);
    }

    public static /* synthetic */ void s0(e1.a aVar, fi.d dVar, e1 e1Var) {
        q1(aVar, dVar, e1Var);
    }

    public static /* synthetic */ void t0(e1.a aVar, Exception exc, e1 e1Var) {
        e1Var.g(aVar, exc);
    }

    public static /* synthetic */ void u0(e1.a aVar, fi.d dVar, e1 e1Var) {
        p1(aVar, dVar, e1Var);
    }

    public static /* synthetic */ void v0(e1.a aVar, int i11, e1 e1Var) {
        e1Var.J(aVar, i11);
    }

    public static /* synthetic */ void w0(e1.a aVar, boolean z11, e1 e1Var) {
        e1Var.R(aVar, z11);
    }

    public static /* synthetic */ void x0(e1.a aVar, fj.g gVar, fj.h hVar, e1 e1Var) {
        e1Var.v(aVar, gVar, hVar);
    }

    public static /* synthetic */ void y0(e1.a aVar, e1 e1Var) {
        e1Var.g0(aVar);
    }

    public static /* synthetic */ void z0(e1.a aVar, e1 e1Var) {
        e1Var.z(aVar);
    }

    @Override // bk.w
    public final void A(final ci.i iVar, final fi.e eVar) {
        final e1.a k12 = k1();
        t2(k12, 1022, new n.a() { // from class: di.o
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.N0(e1.a.this, iVar, eVar, (e1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.s0.a
    public final void B(final int i11) {
        if (i11 == 1) {
            this.f24030h = false;
        }
        this.f24026d.j((com.google.android.exoplayer2.s0) ak.a.e(this.f24029g));
        final e1.a e12 = e1();
        t2(e12, 12, new n.a() { // from class: di.e
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.S0(e1.a.this, i11, (e1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.s0.a
    public final void C(final ExoPlaybackException exoPlaybackException) {
        final e1.a e12;
        fj.i iVar = exoPlaybackException.f13027g;
        if (iVar != null) {
            e12 = g1(new j.a(iVar));
        } else {
            e12 = e1();
        }
        t2(e12, 11, new n.a() { // from class: di.r
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.r0(e1.a.this, exoPlaybackException, (e1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.s0.a
    public final void D(final boolean z11) {
        final e1.a e12 = e1();
        t2(e12, 4, new n.a() { // from class: di.o0
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.c0(e1.a.this, z11, (e1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.s0.a
    public final void E() {
        final e1.a e12 = e1();
        t2(e12, -1, new n.a() { // from class: di.y0
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.L0(e1.a.this, (e1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.f
    public final void F(int i11, j.a aVar, final Exception exc) {
        final e1.a i12 = i1(i11, aVar);
        t2(i12, 1032, new n.a() { // from class: di.g0
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.t0(e1.a.this, exc, (e1) obj);
            }
        });
    }

    @Override // bk.w
    public final void H(final int i11, final long j11) {
        final e1.a j12 = j1();
        t2(j12, 1023, new n.a() { // from class: di.h
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.A0(e1.a.this, i11, j11, (e1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void I(final ci.i iVar, final fi.e eVar) {
        final e1.a k12 = k1();
        t2(k12, 1010, new n.a() { // from class: di.p
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.O0(e1.a.this, iVar, eVar, (e1) obj);
            }
        });
    }

    @Override // bk.w
    public final void K(final fi.d dVar) {
        final e1.a k12 = k1();
        t2(k12, 1020, new n.a() { // from class: di.x
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.c1(e1.a.this, dVar, (e1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.s0.a
    public final void L(final boolean z11, final int i11) {
        final e1.a e12 = e1();
        t2(e12, -1, new n.a() { // from class: di.t0
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.U0(e1.a.this, z11, i11, (e1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.k
    public final void M(int i11, j.a aVar, final fj.h hVar) {
        final e1.a i12 = i1(i11, aVar);
        t2(i12, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, new n.a() { // from class: di.c0
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.f0(e1.a.this, hVar, (e1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.k
    public final void N(int i11, j.a aVar, final fj.h hVar) {
        final e1.a i12 = i1(i11, aVar);
        t2(i12, 1005, new n.a() { // from class: di.d0
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.J0(e1.a.this, hVar, (e1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.s0.a
    public final void P(final com.google.android.exoplayer2.i0 i0Var, final int i11) {
        final e1.a e12 = e1();
        t2(e12, 1, new n.a() { // from class: di.s
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.p0(e1.a.this, i0Var, i11, (e1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.k
    public final void Q(int i11, j.a aVar, final fj.g gVar, final fj.h hVar) {
        final e1.a i12 = i1(i11, aVar);
        t2(i12, 1001, new n.a() { // from class: di.y
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.x0(e1.a.this, gVar, hVar, (e1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.k
    public final void R(int i11, j.a aVar, final fj.g gVar, final fj.h hVar) {
        final e1.a i12 = i1(i11, aVar);
        t2(i12, 1002, new n.a() { // from class: di.z
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.K0(e1.a.this, gVar, hVar, (e1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.f
    public final void S(int i11, j.a aVar) {
        final e1.a i12 = i1(i11, aVar);
        t2(i12, 1031, new n.a() { // from class: di.w
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.z0(e1.a.this, (e1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.s0.a
    public final void T(final boolean z11, final int i11) {
        final e1.a e12 = e1();
        t2(e12, 6, new n.a() { // from class: di.u0
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.V0(e1.a.this, z11, i11, (e1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.f
    public final void U(int i11, j.a aVar) {
        final e1.a i12 = i1(i11, aVar);
        t2(i12, 1035, new n.a() { // from class: di.z0
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.M0(e1.a.this, (e1) obj);
            }
        });
    }

    @Override // bk.w
    public final void W(final fi.d dVar) {
        final e1.a j12 = j1();
        t2(j12, 1025, new n.a() { // from class: di.t
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.j0(e1.a.this, dVar, (e1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void X(final int i11, final long j11, final long j12) {
        final e1.a k12 = k1();
        t2(k12, 1012, new n.a() { // from class: di.j
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.b1(e1.a.this, i11, j11, j12, (e1) obj);
            }
        });
    }

    @Override // bk.w
    public final void Z(final long j11, final int i11) {
        final e1.a j12 = j1();
        t2(j12, 1026, new n.a() { // from class: di.m
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.Q0(e1.a.this, j11, i11, (e1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void a(final boolean z11) {
        final e1.a k12 = k1();
        t2(k12, 1017, new n.a() { // from class: di.q0
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.H0(e1.a.this, z11, (e1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.f
    public final void a0(int i11, j.a aVar) {
        final e1.a i12 = i1(i11, aVar);
        t2(i12, 1033, new n.a() { // from class: di.a
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.q0(e1.a.this, (e1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.k
    public final void b(int i11, j.a aVar, final fj.g gVar, final fj.h hVar) {
        final e1.a i12 = i1(i11, aVar);
        t2(i12, 1000, new n.a() { // from class: di.a0
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.P0(e1.a.this, gVar, hVar, (e1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.s0.a
    public void b0(final boolean z11) {
        final e1.a e12 = e1();
        t2(e12, 8, new n.a() { // from class: di.r0
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.Z0(e1.a.this, z11, (e1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void c(final Exception exc) {
        final e1.a k12 = k1();
        t2(k12, 1018, new n.a() { // from class: di.f0
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.h0(e1.a.this, exc, (e1) obj);
            }
        });
    }

    @Override // bk.w
    public final void d(final int i11, final int i12, final int i13, final float f11) {
        final e1.a k12 = k1();
        t2(k12, 1028, new n.a() { // from class: di.g
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.k0(e1.a.this, i11, i12, i13, f11, (e1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.s0.a
    public final void e(final ci.l lVar) {
        final e1.a e12 = e1();
        t2(e12, 13, new n.a() { // from class: di.q
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.D0(e1.a.this, lVar, (e1) obj);
            }
        });
    }

    protected final e1.a e1() {
        return g1(this.f24026d.d());
    }

    @Override // com.google.android.exoplayer2.s0.a
    public final void f(final int i11) {
        final e1.a e12 = e1();
        t2(e12, 9, new n.a() { // from class: di.d
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.R0(e1.a.this, i11, (e1) obj);
            }
        });
    }

    protected final e1.a f1(com.google.android.exoplayer2.z0 z0Var, int i11, j.a aVar) {
        long t11;
        j.a aVar2 = z0Var.q() ? null : aVar;
        long elapsedRealtime = this.f24023a.elapsedRealtime();
        boolean z11 = true;
        boolean z12 = z0Var.equals(this.f24029g.l()) && i11 == this.f24029g.g();
        long j11 = 0;
        if (aVar2 != null && aVar2.b()) {
            if (!z12 || this.f24029g.i() != aVar2.f26304b || this.f24029g.s() != aVar2.f26305c) {
                z11 = false;
            }
            if (z11) {
                j11 = this.f24029g.C();
            }
        } else if (z12) {
            t11 = this.f24029g.t();
            return new e1.a(elapsedRealtime, z0Var, i11, aVar2, t11, this.f24029g.l(), this.f24029g.g(), this.f24026d.d(), this.f24029g.C(), this.f24029g.d());
        } else if (!z0Var.q()) {
            j11 = z0Var.n(i11, this.f24025c).b();
        }
        t11 = j11;
        return new e1.a(elapsedRealtime, z0Var, i11, aVar2, t11, this.f24029g.l(), this.f24029g.g(), this.f24026d.d(), this.f24029g.C(), this.f24029g.d());
    }

    @Override // com.google.android.exoplayer2.s0.a
    public final void g(final int i11) {
        final e1.a e12 = e1();
        t2(e12, 7, new n.a() { // from class: di.c1
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.d0(e1.a.this, i11, (e1) obj);
            }
        });
    }

    @Override // bk.w
    public final void i(final String str) {
        final e1.a k12 = k1();
        t2(k12, 1024, new n.a() { // from class: di.j0
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.I0(e1.a.this, str, (e1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.s0.a
    public final void j(final List<wi.a> list) {
        final e1.a e12 = e1();
        t2(e12, 3, new n.a() { // from class: di.m0
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.E0(e1.a.this, list, (e1) obj);
            }
        });
    }

    @Override // bk.w
    public final void k(final String str, long j11, final long j12) {
        final e1.a k12 = k1();
        t2(k12, 1021, new n.a() { // from class: di.k0
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.n0(e1.a.this, str, j12, (e1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.s0.a
    public final void l(com.google.android.exoplayer2.z0 z0Var, final int i11) {
        this.f24026d.l((com.google.android.exoplayer2.s0) ak.a.e(this.f24029g));
        final e1.a e12 = e1();
        t2(e12, 0, new n.a() { // from class: di.b
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.v0(e1.a.this, i11, (e1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void m(final fi.d dVar) {
        final e1.a k12 = k1();
        t2(k12, 1008, new n.a() { // from class: di.u
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.s0(e1.a.this, dVar, (e1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.s0.a
    public final void n(final int i11) {
        final e1.a e12 = e1();
        t2(e12, 5, new n.a() { // from class: di.c
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.C0(e1.a.this, i11, (e1) obj);
            }
        });
    }

    public final void n2() {
        if (this.f24030h) {
            return;
        }
        final e1.a e12 = e1();
        this.f24030h = true;
        t2(e12, -1, new n.a() { // from class: di.a1
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.Y0(e1.a.this, (e1) obj);
            }
        });
    }

    @Override // zj.d.a
    public final void o(final int i11, final long j11, final long j12) {
        final e1.a h12 = h1();
        t2(h12, 1006, new n.a() { // from class: di.i
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.l0(e1.a.this, i11, j11, j12, (e1) obj);
            }
        });
    }

    public final void o2(final wi.a aVar) {
        final e1.a e12 = e1();
        t2(e12, 1007, new n.a() { // from class: di.n0
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.e0(e1.a.this, aVar, (e1) obj);
            }
        });
    }

    @Override // bk.w
    public final void p(final Surface surface) {
        final e1.a k12 = k1();
        t2(k12, 1027, new n.a() { // from class: di.n
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.W0(e1.a.this, surface, (e1) obj);
            }
        });
    }

    public void p2(final int i11, final int i12) {
        final e1.a k12 = k1();
        t2(k12, 1029, new n.a() { // from class: di.f
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.o0(e1.a.this, i11, i12, (e1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.s0.a
    public final void q(final fj.v vVar, final xj.k kVar) {
        final e1.a e12 = e1();
        t2(e12, 2, new n.a() { // from class: di.e0
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.i0(e1.a.this, vVar, kVar, (e1) obj);
            }
        });
    }

    public final void q2(final float f11) {
        final e1.a k12 = k1();
        t2(k12, 1019, new n.a() { // from class: di.b1
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.T0(e1.a.this, f11, (e1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.k
    public final void r(int i11, j.a aVar, final fj.g gVar, final fj.h hVar, final IOException iOException, final boolean z11) {
        final e1.a i12 = i1(i11, aVar);
        t2(i12, 1003, new n.a() { // from class: di.b0
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.G0(e1.a.this, gVar, hVar, iOException, z11, (e1) obj);
            }
        });
    }

    public void r2() {
        final e1.a e12 = e1();
        this.f24027e.put(1036, e12);
        this.f24028f.h(1036, new n.a() { // from class: di.l
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.y0(e1.a.this, (e1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void s(final String str) {
        final e1.a k12 = k1();
        t2(k12, 1013, new n.a() { // from class: di.i0
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.g0(e1.a.this, str, (e1) obj);
            }
        });
    }

    public final void s2() {
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void t(final String str, long j11, final long j12) {
        final e1.a k12 = k1();
        t2(k12, 1009, new n.a() { // from class: di.l0
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.X0(e1.a.this, str, j12, (e1) obj);
            }
        });
    }

    protected final void t2(e1.a aVar, int i11, n.a<e1> aVar2) {
        this.f24027e.put(i11, aVar);
        this.f24028f.l(i11, aVar2);
    }

    @Override // com.google.android.exoplayer2.s0.a
    public final void u(final boolean z11) {
        final e1.a e12 = e1();
        t2(e12, 10, new n.a() { // from class: di.p0
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.w0(e1.a.this, z11, (e1) obj);
            }
        });
    }

    public void u2(final com.google.android.exoplayer2.s0 s0Var, Looper looper) {
        ak.a.f(this.f24029g == null || this.f24026d.f24032b.isEmpty());
        this.f24029g = (com.google.android.exoplayer2.s0) ak.a.e(s0Var);
        this.f24028f = this.f24028f.d(looper, new n.b() { // from class: di.v0
            @Override // ak.n.b
            public final void a(Object obj, ak.s sVar) {
                d1.d1(d1.this, s0Var, (e1) obj, (e1.b) sVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.f
    public final void v(int i11, j.a aVar) {
        final e1.a i12 = i1(i11, aVar);
        t2(i12, 1034, new n.a() { // from class: di.s0
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.F0(e1.a.this, (e1) obj);
            }
        });
    }

    public final void v2(List<j.a> list, j.a aVar) {
        this.f24026d.k(list, aVar, (com.google.android.exoplayer2.s0) ak.a.e(this.f24029g));
    }

    @Override // com.google.android.exoplayer2.drm.f
    public final void w(int i11, j.a aVar) {
        final e1.a i12 = i1(i11, aVar);
        t2(i12, 1030, new n.a() { // from class: di.h0
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.B0(e1.a.this, (e1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void x(final long j11) {
        final e1.a k12 = k1();
        t2(k12, 1011, new n.a() { // from class: di.k
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.a1(e1.a.this, j11, (e1) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void z(final fi.d dVar) {
        final e1.a j12 = j1();
        t2(j12, 1014, new n.a() { // from class: di.v
            @Override // ak.n.a
            public final void invoke(Object obj) {
                d1.u0(e1.a.this, dVar, (e1) obj);
            }
        });
    }
}