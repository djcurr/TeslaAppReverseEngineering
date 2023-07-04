package com.google.android.exoplayer2;

import ak.n;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.google.android.exoplayer2.g0;
import com.google.android.exoplayer2.q0;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.z0;
import di.d1;
import fj.s;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class d0 extends e {
    private long A;

    /* renamed from: b */
    final xj.n f13236b;

    /* renamed from: c */
    private final v0[] f13237c;

    /* renamed from: d */
    private final xj.m f13238d;

    /* renamed from: e */
    private final ak.j f13239e;

    /* renamed from: f */
    private final g0.f f13240f;

    /* renamed from: g */
    private final g0 f13241g;

    /* renamed from: h */
    private final ak.n<s0.a, s0.b> f13242h;

    /* renamed from: i */
    private final z0.b f13243i;

    /* renamed from: j */
    private final List<a> f13244j;

    /* renamed from: k */
    private final boolean f13245k;

    /* renamed from: l */
    private final fj.p f13246l;

    /* renamed from: m */
    private final d1 f13247m;

    /* renamed from: n */
    private final Looper f13248n;

    /* renamed from: o */
    private final zj.d f13249o;

    /* renamed from: p */
    private final ak.b f13250p;

    /* renamed from: q */
    private int f13251q;

    /* renamed from: r */
    private boolean f13252r;

    /* renamed from: s */
    private int f13253s;

    /* renamed from: t */
    private boolean f13254t;

    /* renamed from: u */
    private int f13255u;

    /* renamed from: v */
    private int f13256v;

    /* renamed from: w */
    private fj.s f13257w;

    /* renamed from: x */
    private r0 f13258x;

    /* renamed from: y */
    private int f13259y;

    /* renamed from: z */
    private int f13260z;

    /* loaded from: classes3.dex */
    public static final class a implements o0 {

        /* renamed from: a */
        private final Object f13261a;

        /* renamed from: b */
        private z0 f13262b;

        public a(Object obj, z0 z0Var) {
            this.f13261a = obj;
            this.f13262b = z0Var;
        }

        @Override // com.google.android.exoplayer2.o0
        public Object a() {
            return this.f13261a;
        }

        @Override // com.google.android.exoplayer2.o0
        public z0 b() {
            return this.f13262b;
        }
    }

    public d0(v0[] v0VarArr, xj.m mVar, fj.p pVar, ci.k kVar, zj.d dVar, d1 d1Var, boolean z11, ci.q qVar, h0 h0Var, long j11, boolean z12, ak.b bVar, Looper looper, s0 s0Var) {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = ak.k0.f481e;
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(str).length());
        sb2.append("Init ");
        sb2.append(hexString);
        sb2.append(" [");
        sb2.append("ExoPlayerLib/2.13.2");
        sb2.append("] [");
        sb2.append(str);
        sb2.append("]");
        ak.o.f("ExoPlayerImpl", sb2.toString());
        ak.a.f(v0VarArr.length > 0);
        this.f13237c = (v0[]) ak.a.e(v0VarArr);
        this.f13238d = (xj.m) ak.a.e(mVar);
        this.f13246l = pVar;
        this.f13249o = dVar;
        this.f13247m = d1Var;
        this.f13245k = z11;
        this.f13248n = looper;
        this.f13250p = bVar;
        this.f13251q = 0;
        final s0 s0Var2 = s0Var != null ? s0Var : this;
        this.f13242h = new ak.n<>(looper, bVar, new com.google.common.base.a0() { // from class: ci.g
            @Override // com.google.common.base.a0
            /* renamed from: get */
            public final Object mo100get() {
                return new s0.b();
            }
        }, new n.b() { // from class: com.google.android.exoplayer2.r
            @Override // ak.n.b
            public final void a(Object obj, ak.s sVar) {
                d0.Q(s0.this, (s0.a) obj, (s0.b) sVar);
            }
        });
        this.f13244j = new ArrayList();
        this.f13257w = new s.a(0);
        xj.n nVar = new xj.n(new ci.o[v0VarArr.length], new xj.g[v0VarArr.length], null);
        this.f13236b = nVar;
        this.f13243i = new z0.b();
        this.f13259y = -1;
        this.f13239e = bVar.b(looper, null);
        g0.f fVar = new g0.f() { // from class: com.google.android.exoplayer2.s
            @Override // com.google.android.exoplayer2.g0.f
            public final void a(g0.e eVar) {
                d0.T(d0.this, eVar);
            }
        };
        this.f13240f = fVar;
        this.f13258x = r0.k(nVar);
        if (d1Var != null) {
            d1Var.u2(s0Var2, looper);
            r(d1Var);
            dVar.c(new Handler(looper), d1Var);
        }
        this.f13241g = new g0(v0VarArr, mVar, nVar, kVar, dVar, this.f13251q, this.f13252r, d1Var, qVar, h0Var, j11, z12, looper, bVar, fVar);
    }

    public static /* synthetic */ void A0(r0 r0Var, int i11, s0.a aVar) {
        aVar.T(r0Var.f13770k, i11);
    }

    public static /* synthetic */ void B0(r0 r0Var, s0.a aVar) {
        aVar.g(r0Var.f13771l);
    }

    public static /* synthetic */ void C0(r0 r0Var, s0.a aVar) {
        aVar.b0(o0(r0Var));
    }

    public static /* synthetic */ void D0(r0 r0Var, s0.a aVar) {
        aVar.e(r0Var.f13772m);
    }

    public static /* synthetic */ void E0(r0 r0Var, s0.a aVar) {
        aVar.V(r0Var.f13773n);
    }

    public static /* synthetic */ void F0(r0 r0Var, s0.a aVar) {
        aVar.J(r0Var.f13774o);
    }

    public static /* synthetic */ void G0(r0 r0Var, int i11, s0.a aVar) {
        aVar.l(r0Var.f13760a, i11);
    }

    public static /* synthetic */ void H(r0 r0Var, int i11, s0.a aVar) {
        G0(r0Var, i11, aVar);
    }

    public static /* synthetic */ void I(int i11, s0.a aVar) {
        aVar.B(i11);
    }

    public static /* synthetic */ void J(int i11, s0.a aVar) {
        aVar.f(i11);
    }

    public static /* synthetic */ void J0(r0 r0Var, s0.a aVar) {
        aVar.C(r0Var.f13764e);
    }

    public static /* synthetic */ void K(r0 r0Var, s0.a aVar) {
        x0(r0Var, aVar);
    }

    private r0 K0(r0 r0Var, z0 z0Var, Pair<Object, Long> pair) {
        int i11;
        long j11;
        ak.a.a(z0Var.q() || pair != null);
        z0 z0Var2 = r0Var.f13760a;
        r0 j12 = r0Var.j(z0Var);
        if (z0Var.q()) {
            j.a l11 = r0.l();
            r0 b11 = j12.c(l11, ci.b.c(this.A), ci.b.c(this.A), 0L, fj.v.f26353d, this.f13236b, com.google.common.collect.r.r()).b(l11);
            b11.f13775p = b11.f13777r;
            return b11;
        }
        Object obj = j12.f13761b.f26303a;
        boolean z11 = !obj.equals(((Pair) ak.k0.j(pair)).first);
        j.a aVar = z11 ? new j.a(pair.first) : j12.f13761b;
        long longValue = ((Long) pair.second).longValue();
        long c11 = ci.b.c(t());
        if (!z0Var2.q()) {
            c11 -= z0Var2.h(obj, this.f13243i).l();
        }
        if (z11 || longValue < c11) {
            ak.a.f(!aVar.b());
            r0 b12 = j12.c(aVar, longValue, longValue, 0L, z11 ? fj.v.f26353d : j12.f13766g, z11 ? this.f13236b : j12.f13767h, z11 ? com.google.common.collect.r.r() : j12.f13768i).b(aVar);
            b12.f13775p = longValue;
            return b12;
        } else if (i11 == 0) {
            int b13 = z0Var.b(j12.f13769j.f26303a);
            if (b13 == -1 || z0Var.f(b13, this.f13243i).f14781c != z0Var.h(aVar.f26303a, this.f13243i).f14781c) {
                z0Var.h(aVar.f26303a, this.f13243i);
                if (aVar.b()) {
                    j11 = this.f13243i.b(aVar.f26304b, aVar.f26305c);
                } else {
                    j11 = this.f13243i.f14782d;
                }
                r0 b14 = j12.c(aVar, j12.f13777r, j12.f13777r, j11 - j12.f13777r, j12.f13766g, j12.f13767h, j12.f13768i).b(aVar);
                b14.f13775p = j11;
                return b14;
            }
            return j12;
        } else {
            ak.a.f(!aVar.b());
            long max = Math.max(0L, j12.f13776q - (longValue - c11));
            long j13 = j12.f13775p;
            if (j12.f13769j.equals(j12.f13761b)) {
                j13 = longValue + max;
            }
            r0 c12 = j12.c(aVar, longValue, longValue, max, j12.f13766g, j12.f13767h, j12.f13768i);
            c12.f13775p = j13;
            return c12;
        }
    }

    public static /* synthetic */ void L(r0 r0Var, s0.a aVar) {
        E0(r0Var, aVar);
    }

    private long L0(j.a aVar, long j11) {
        long d11 = ci.b.d(j11);
        this.f13258x.f13760a.h(aVar.f26303a, this.f13243i);
        return d11 + this.f13243i.k();
    }

    public static /* synthetic */ void M(boolean z11, s0.a aVar) {
        aVar.u(z11);
    }

    public static /* synthetic */ void N(r0 r0Var, s0.a aVar) {
        C0(r0Var, aVar);
    }

    private r0 N0(int i11, int i12) {
        boolean z11 = false;
        ak.a.a(i11 >= 0 && i12 >= i11 && i12 <= this.f13244j.size());
        int g11 = g();
        z0 l11 = l();
        int size = this.f13244j.size();
        this.f13253s++;
        O0(i11, i12);
        z0 d02 = d0();
        r0 K0 = K0(this.f13258x, d02, j0(l11, d02));
        int i13 = K0.f13763d;
        if (i13 != 1 && i13 != 4 && i11 < i12 && i12 == size && g11 >= K0.f13760a.p()) {
            z11 = true;
        }
        if (z11) {
            K0 = K0.h(4);
        }
        this.f13241g.k0(i11, i12, this.f13257w);
        return K0;
    }

    public static /* synthetic */ void O(r0 r0Var, s0.a aVar) {
        w0(r0Var, aVar);
    }

    private void O0(int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            this.f13244j.remove(i13);
        }
        this.f13257w = this.f13257w.a(i11, i12);
    }

    public static /* synthetic */ void P(r0 r0Var, s0.a aVar) {
        z0(r0Var, aVar);
    }

    public static /* synthetic */ void Q(s0 s0Var, s0.a aVar, s0.b bVar) {
        aVar.G(s0Var, bVar);
    }

    private void Q0(List<com.google.android.exoplayer2.source.j> list, int i11, long j11, boolean z11) {
        int i12 = i11;
        int i02 = i0();
        long C = C();
        this.f13253s++;
        if (!this.f13244j.isEmpty()) {
            O0(0, this.f13244j.size());
        }
        List<q0.c> c02 = c0(0, list);
        z0 d02 = d0();
        if (!d02.q() && i12 >= d02.p()) {
            throw new IllegalSeekPositionException(d02, i12, j11);
        }
        long j12 = j11;
        if (z11) {
            i12 = d02.a(this.f13252r);
            j12 = -9223372036854775807L;
        } else if (i12 == -1) {
            i12 = i02;
            j12 = C;
        }
        r0 K0 = K0(this.f13258x, d02, k0(d02, i12, j12));
        int i13 = K0.f13763d;
        if (i12 != -1 && i13 != 1) {
            i13 = (d02.q() || i12 >= d02.p()) ? 4 : 2;
        }
        r0 h11 = K0.h(i13);
        this.f13241g.I0(c02, i12, ci.b.c(j12), this.f13257w);
        V0(h11, false, 4, 0, 1, false);
    }

    public static /* synthetic */ void R(r0 r0Var, xj.k kVar, s0.a aVar) {
        v0(r0Var, kVar, aVar);
    }

    public static /* synthetic */ void S(r0 r0Var, s0.a aVar) {
        J0(r0Var, aVar);
    }

    public static /* synthetic */ void T(d0 d0Var, g0.e eVar) {
        d0Var.r0(eVar);
    }

    public static /* synthetic */ void U(r0 r0Var, s0.a aVar) {
        y0(r0Var, aVar);
    }

    public static /* synthetic */ void V(s0.a aVar) {
        s0(aVar);
    }

    private void V0(final r0 r0Var, boolean z11, final int i11, final int i12, final int i13, boolean z12) {
        final i0 i0Var;
        r0 r0Var2 = this.f13258x;
        this.f13258x = r0Var;
        Pair<Boolean, Integer> f02 = f0(r0Var, r0Var2, z11, i11, !r0Var2.f13760a.equals(r0Var.f13760a));
        boolean booleanValue = ((Boolean) f02.first).booleanValue();
        final int intValue = ((Integer) f02.second).intValue();
        if (!r0Var2.f13760a.equals(r0Var.f13760a)) {
            this.f13242h.i(0, new n.a() { // from class: com.google.android.exoplayer2.m
                @Override // ak.n.a
                public final void invoke(Object obj) {
                    d0.H(r0.this, i12, (s0.a) obj);
                }
            });
        }
        if (z11) {
            this.f13242h.i(12, new n.a() { // from class: com.google.android.exoplayer2.i
                @Override // ak.n.a
                public final void invoke(Object obj) {
                    d0.I(i11, (s0.a) obj);
                }
            });
        }
        if (booleanValue) {
            if (r0Var.f13760a.q()) {
                i0Var = null;
            } else {
                i0Var = r0Var.f13760a.n(r0Var.f13760a.h(r0Var.f13761b.f26303a, this.f13243i).f14781c, this.f13377a).f14789c;
            }
            this.f13242h.i(1, new n.a() { // from class: com.google.android.exoplayer2.v
                @Override // ak.n.a
                public final void invoke(Object obj) {
                    d0.W(i0.this, intValue, (s0.a) obj);
                }
            });
        }
        ExoPlaybackException exoPlaybackException = r0Var2.f13764e;
        ExoPlaybackException exoPlaybackException2 = r0Var.f13764e;
        if (exoPlaybackException != exoPlaybackException2 && exoPlaybackException2 != null) {
            this.f13242h.i(11, new n.a() { // from class: com.google.android.exoplayer2.b0
                @Override // ak.n.a
                public final void invoke(Object obj) {
                    d0.S(r0.this, (s0.a) obj);
                }
            });
        }
        xj.n nVar = r0Var2.f13767h;
        xj.n nVar2 = r0Var.f13767h;
        if (nVar != nVar2) {
            this.f13238d.d(nVar2.f57591d);
            final xj.k kVar = new xj.k(r0Var.f13767h.f57590c);
            this.f13242h.i(2, new n.a() { // from class: com.google.android.exoplayer2.o
                @Override // ak.n.a
                public final void invoke(Object obj) {
                    d0.R(r0.this, kVar, (s0.a) obj);
                }
            });
        }
        if (!r0Var2.f13768i.equals(r0Var.f13768i)) {
            this.f13242h.i(3, new n.a() { // from class: com.google.android.exoplayer2.z
                @Override // ak.n.a
                public final void invoke(Object obj) {
                    d0.O(r0.this, (s0.a) obj);
                }
            });
        }
        if (r0Var2.f13765f != r0Var.f13765f) {
            this.f13242h.i(4, new n.a() { // from class: com.google.android.exoplayer2.w
                @Override // ak.n.a
                public final void invoke(Object obj) {
                    d0.K(r0.this, (s0.a) obj);
                }
            });
        }
        if (r0Var2.f13763d != r0Var.f13763d || r0Var2.f13770k != r0Var.f13770k) {
            this.f13242h.i(-1, new n.a() { // from class: com.google.android.exoplayer2.c0
                @Override // ak.n.a
                public final void invoke(Object obj) {
                    d0.U(r0.this, (s0.a) obj);
                }
            });
        }
        if (r0Var2.f13763d != r0Var.f13763d) {
            this.f13242h.i(5, new n.a() { // from class: com.google.android.exoplayer2.a0
                @Override // ak.n.a
                public final void invoke(Object obj) {
                    d0.P(r0.this, (s0.a) obj);
                }
            });
        }
        if (r0Var2.f13770k != r0Var.f13770k) {
            this.f13242h.i(6, new n.a() { // from class: com.google.android.exoplayer2.n
                @Override // ak.n.a
                public final void invoke(Object obj) {
                    d0.a0(r0.this, i13, (s0.a) obj);
                }
            });
        }
        if (r0Var2.f13771l != r0Var.f13771l) {
            this.f13242h.i(7, new n.a() { // from class: com.google.android.exoplayer2.j
                @Override // ak.n.a
                public final void invoke(Object obj) {
                    d0.X(r0.this, (s0.a) obj);
                }
            });
        }
        if (o0(r0Var2) != o0(r0Var)) {
            this.f13242h.i(8, new n.a() { // from class: com.google.android.exoplayer2.y
                @Override // ak.n.a
                public final void invoke(Object obj) {
                    d0.N(r0.this, (s0.a) obj);
                }
            });
        }
        if (!r0Var2.f13772m.equals(r0Var.f13772m)) {
            this.f13242h.i(13, new n.a() { // from class: com.google.android.exoplayer2.l
                @Override // ak.n.a
                public final void invoke(Object obj) {
                    d0.b0(r0.this, (s0.a) obj);
                }
            });
        }
        if (z12) {
            this.f13242h.i(-1, new n.a() { // from class: ci.f
                @Override // ak.n.a
                public final void invoke(Object obj) {
                    ((s0.a) obj).E();
                }
            });
        }
        if (r0Var2.f13773n != r0Var.f13773n) {
            this.f13242h.i(-1, new n.a() { // from class: com.google.android.exoplayer2.x
                @Override // ak.n.a
                public final void invoke(Object obj) {
                    d0.L(r0.this, (s0.a) obj);
                }
            });
        }
        if (r0Var2.f13774o != r0Var.f13774o) {
            this.f13242h.i(-1, new n.a() { // from class: com.google.android.exoplayer2.k
                @Override // ak.n.a
                public final void invoke(Object obj) {
                    d0.Z(r0.this, (s0.a) obj);
                }
            });
        }
        this.f13242h.e();
    }

    public static /* synthetic */ void W(i0 i0Var, int i11, s0.a aVar) {
        aVar.P(i0Var, i11);
    }

    public static /* synthetic */ void X(r0 r0Var, s0.a aVar) {
        B0(r0Var, aVar);
    }

    public static /* synthetic */ void Y(d0 d0Var, g0.e eVar) {
        d0Var.m79q0(eVar);
    }

    public static /* synthetic */ void Z(r0 r0Var, s0.a aVar) {
        F0(r0Var, aVar);
    }

    public static /* synthetic */ void a0(r0 r0Var, int i11, s0.a aVar) {
        A0(r0Var, i11, aVar);
    }

    public static /* synthetic */ void b0(r0 r0Var, s0.a aVar) {
        D0(r0Var, aVar);
    }

    private List<q0.c> c0(int i11, List<com.google.android.exoplayer2.source.j> list) {
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            q0.c cVar = new q0.c(list.get(i12), this.f13245k);
            arrayList.add(cVar);
            this.f13244j.add(i12 + i11, new a(cVar.f13754b, cVar.f13753a.O()));
        }
        this.f13257w = this.f13257w.g(i11, arrayList.size());
        return arrayList;
    }

    private z0 d0() {
        return new u0(this.f13244j, this.f13257w);
    }

    private Pair<Boolean, Integer> f0(r0 r0Var, r0 r0Var2, boolean z11, int i11, boolean z12) {
        z0 z0Var = r0Var2.f13760a;
        z0 z0Var2 = r0Var.f13760a;
        if (z0Var2.q() && z0Var.q()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i12 = 3;
        if (z0Var2.q() != z0Var.q()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        Object obj = z0Var.n(z0Var.h(r0Var2.f13761b.f26303a, this.f13243i).f14781c, this.f13377a).f14787a;
        Object obj2 = z0Var2.n(z0Var2.h(r0Var.f13761b.f26303a, this.f13243i).f14781c, this.f13377a).f14787a;
        int i13 = this.f13377a.f14799m;
        if (!obj.equals(obj2)) {
            if (z11 && i11 == 0) {
                i12 = 1;
            } else if (z11 && i11 == 1) {
                i12 = 2;
            } else if (!z12) {
                throw new IllegalStateException();
            }
            return new Pair<>(Boolean.TRUE, Integer.valueOf(i12));
        } else if (z11 && i11 == 0 && z0Var2.b(r0Var.f13761b.f26303a) == i13) {
            return new Pair<>(Boolean.TRUE, 0);
        } else {
            return new Pair<>(Boolean.FALSE, -1);
        }
    }

    private int i0() {
        if (this.f13258x.f13760a.q()) {
            return this.f13259y;
        }
        r0 r0Var = this.f13258x;
        return r0Var.f13760a.h(r0Var.f13761b.f26303a, this.f13243i).f14781c;
    }

    private Pair<Object, Long> j0(z0 z0Var, z0 z0Var2) {
        long t11 = t();
        if (!z0Var.q() && !z0Var2.q()) {
            Pair<Object, Long> j11 = z0Var.j(this.f13377a, this.f13243i, g(), ci.b.c(t11));
            Object obj = ((Pair) ak.k0.j(j11)).first;
            if (z0Var2.b(obj) != -1) {
                return j11;
            }
            Object v02 = g0.v0(this.f13377a, this.f13243i, this.f13251q, this.f13252r, obj, z0Var, z0Var2);
            if (v02 != null) {
                z0Var2.h(v02, this.f13243i);
                int i11 = this.f13243i.f14781c;
                return k0(z0Var2, i11, z0Var2.n(i11, this.f13377a).b());
            }
            return k0(z0Var2, -1, -9223372036854775807L);
        }
        boolean z11 = !z0Var.q() && z0Var2.q();
        int i02 = z11 ? -1 : i0();
        if (z11) {
            t11 = -9223372036854775807L;
        }
        return k0(z0Var2, i02, t11);
    }

    private Pair<Object, Long> k0(z0 z0Var, int i11, long j11) {
        if (z0Var.q()) {
            this.f13259y = i11;
            if (j11 == -9223372036854775807L) {
                j11 = 0;
            }
            this.A = j11;
            this.f13260z = 0;
            return null;
        }
        if (i11 == -1 || i11 >= z0Var.p()) {
            i11 = z0Var.a(this.f13252r);
            j11 = z0Var.n(i11, this.f13377a).b();
        }
        return z0Var.j(this.f13377a, this.f13243i, i11, ci.b.c(j11));
    }

    /* renamed from: n0 */
    public void m79q0(g0.e eVar) {
        int i11 = this.f13253s - eVar.f13480c;
        this.f13253s = i11;
        if (eVar.f13481d) {
            this.f13254t = true;
            this.f13255u = eVar.f13482e;
        }
        if (eVar.f13483f) {
            this.f13256v = eVar.f13484g;
        }
        if (i11 == 0) {
            z0 z0Var = eVar.f13479b.f13760a;
            if (!this.f13258x.f13760a.q() && z0Var.q()) {
                this.f13259y = -1;
                this.A = 0L;
                this.f13260z = 0;
            }
            if (!z0Var.q()) {
                List<z0> E = ((u0) z0Var).E();
                ak.a.f(E.size() == this.f13244j.size());
                for (int i12 = 0; i12 < E.size(); i12++) {
                    this.f13244j.get(i12).f13262b = E.get(i12);
                }
            }
            boolean z11 = this.f13254t;
            this.f13254t = false;
            V0(eVar.f13479b, z11, this.f13255u, 1, this.f13256v, false);
        }
    }

    private static boolean o0(r0 r0Var) {
        return r0Var.f13763d == 3 && r0Var.f13770k && r0Var.f13771l == 0;
    }

    public /* synthetic */ void r0(final g0.e eVar) {
        this.f13239e.g(new Runnable() { // from class: com.google.android.exoplayer2.u
            @Override // java.lang.Runnable
            public final void run() {
                d0.Y(d0.this, eVar);
            }
        });
    }

    public static /* synthetic */ void s0(s0.a aVar) {
        aVar.C(ExoPlaybackException.b(new ExoTimeoutException(1)));
    }

    public static /* synthetic */ void v0(r0 r0Var, xj.k kVar, s0.a aVar) {
        aVar.q(r0Var.f13766g, kVar);
    }

    public static /* synthetic */ void w0(r0 r0Var, s0.a aVar) {
        aVar.j(r0Var.f13768i);
    }

    public static /* synthetic */ void x0(r0 r0Var, s0.a aVar) {
        aVar.D(r0Var.f13765f);
    }

    public static /* synthetic */ void y0(r0 r0Var, s0.a aVar) {
        aVar.L(r0Var.f13770k, r0Var.f13763d);
    }

    public static /* synthetic */ void z0(r0 r0Var, s0.a aVar) {
        aVar.n(r0Var.f13763d);
    }

    @Override // com.google.android.exoplayer2.s0
    public boolean A() {
        return this.f13252r;
    }

    @Override // com.google.android.exoplayer2.s0
    public long B() {
        if (this.f13258x.f13760a.q()) {
            return this.A;
        }
        r0 r0Var = this.f13258x;
        if (r0Var.f13769j.f26306d != r0Var.f13761b.f26306d) {
            return r0Var.f13760a.n(g(), this.f13377a).d();
        }
        long j11 = r0Var.f13775p;
        if (this.f13258x.f13769j.b()) {
            r0 r0Var2 = this.f13258x;
            z0.b h11 = r0Var2.f13760a.h(r0Var2.f13769j.f26303a, this.f13243i);
            long f11 = h11.f(this.f13258x.f13769j.f26304b);
            j11 = f11 == Long.MIN_VALUE ? h11.f14782d : f11;
        }
        return L0(this.f13258x.f13769j, j11);
    }

    @Override // com.google.android.exoplayer2.s0
    public long C() {
        if (this.f13258x.f13760a.q()) {
            return this.A;
        }
        if (this.f13258x.f13761b.b()) {
            return ci.b.d(this.f13258x.f13777r);
        }
        r0 r0Var = this.f13258x;
        return L0(r0Var.f13761b, r0Var.f13777r);
    }

    public void M0() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = ak.k0.f481e;
        String b11 = ci.h.b();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 36 + String.valueOf(str).length() + String.valueOf(b11).length());
        sb2.append("Release ");
        sb2.append(hexString);
        sb2.append(" [");
        sb2.append("ExoPlayerLib/2.13.2");
        sb2.append("] [");
        sb2.append(str);
        sb2.append("] [");
        sb2.append(b11);
        sb2.append("]");
        ak.o.f("ExoPlayerImpl", sb2.toString());
        if (!this.f13241g.h0()) {
            this.f13242h.l(11, new n.a() { // from class: com.google.android.exoplayer2.q
                @Override // ak.n.a
                public final void invoke(Object obj) {
                    d0.V((s0.a) obj);
                }
            });
        }
        this.f13242h.j();
        this.f13239e.e(null);
        d1 d1Var = this.f13247m;
        if (d1Var != null) {
            this.f13249o.a(d1Var);
        }
        r0 h11 = this.f13258x.h(1);
        this.f13258x = h11;
        r0 b12 = h11.b(h11.f13761b);
        this.f13258x = b12;
        b12.f13775p = b12.f13777r;
        this.f13258x.f13776q = 0L;
    }

    public void P0(List<com.google.android.exoplayer2.source.j> list, int i11, long j11) {
        Q0(list, i11, j11, false);
    }

    public void R0(boolean z11, int i11, int i12) {
        r0 r0Var = this.f13258x;
        if (r0Var.f13770k == z11 && r0Var.f13771l == i11) {
            return;
        }
        this.f13253s++;
        r0 e11 = r0Var.e(z11, i11);
        this.f13241g.L0(z11, i11);
        V0(e11, false, 4, 0, i12, false);
    }

    public void S0(ci.l lVar) {
        if (lVar == null) {
            lVar = ci.l.f9244d;
        }
        if (this.f13258x.f13772m.equals(lVar)) {
            return;
        }
        r0 g11 = this.f13258x.g(lVar);
        this.f13253s++;
        this.f13241g.N0(lVar);
        V0(g11, false, 4, 0, 1, false);
    }

    public void T0(boolean z11) {
        U0(z11, null);
    }

    public void U0(boolean z11, ExoPlaybackException exoPlaybackException) {
        r0 b11;
        if (z11) {
            b11 = N0(0, this.f13244j.size()).f(null);
        } else {
            r0 r0Var = this.f13258x;
            b11 = r0Var.b(r0Var.f13761b);
            b11.f13775p = b11.f13777r;
            b11.f13776q = 0L;
        }
        r0 h11 = b11.h(1);
        if (exoPlaybackException != null) {
            h11 = h11.f(exoPlaybackException);
        }
        this.f13253s++;
        this.f13241g.d1();
        V0(h11, false, 4, 0, 1, false);
    }

    @Override // com.google.android.exoplayer2.s0
    public void a() {
        r0 r0Var = this.f13258x;
        if (r0Var.f13763d != 1) {
            return;
        }
        r0 f11 = r0Var.f(null);
        r0 h11 = f11.h(f11.f13760a.q() ? 4 : 2);
        this.f13253s++;
        this.f13241g.f0();
        V0(h11, false, 4, 1, 1, false);
    }

    @Override // com.google.android.exoplayer2.s0
    public ci.l b() {
        return this.f13258x.f13772m;
    }

    @Override // com.google.android.exoplayer2.s0
    public boolean c() {
        return this.f13258x.f13761b.b();
    }

    @Override // com.google.android.exoplayer2.s0
    public long d() {
        return ci.b.d(this.f13258x.f13776q);
    }

    public t0 e0(t0.b bVar) {
        return new t0(this.f13241g, bVar, this.f13258x.f13760a, g(), this.f13250p, this.f13241g.B());
    }

    @Override // com.google.android.exoplayer2.s0
    public void f(s0.a aVar) {
        this.f13242h.k(aVar);
    }

    @Override // com.google.android.exoplayer2.s0
    public int g() {
        int i02 = i0();
        if (i02 == -1) {
            return 0;
        }
        return i02;
    }

    public boolean g0() {
        return this.f13258x.f13774o;
    }

    @Override // com.google.android.exoplayer2.s0
    public void h(boolean z11) {
        R0(z11, 0, 1);
    }

    public xj.k h0() {
        return new xj.k(this.f13258x.f13767h.f57590c);
    }

    @Override // com.google.android.exoplayer2.s0
    public int i() {
        if (c()) {
            return this.f13258x.f13761b.f26304b;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.s0
    public int j() {
        return this.f13258x.f13771l;
    }

    @Override // com.google.android.exoplayer2.s0
    public long k() {
        if (c()) {
            r0 r0Var = this.f13258x;
            j.a aVar = r0Var.f13761b;
            r0Var.f13760a.h(aVar.f26303a, this.f13243i);
            return ci.b.d(this.f13243i.b(aVar.f26304b, aVar.f26305c));
        }
        return E();
    }

    @Override // com.google.android.exoplayer2.s0
    public z0 l() {
        return this.f13258x.f13760a;
    }

    public int l0() {
        return this.f13237c.length;
    }

    @Override // com.google.android.exoplayer2.s0
    public Looper m() {
        return this.f13248n;
    }

    public int m0(int i11) {
        return this.f13237c[i11].d();
    }

    @Override // com.google.android.exoplayer2.s0
    public void n(int i11, long j11) {
        z0 z0Var = this.f13258x.f13760a;
        if (i11 >= 0 && (z0Var.q() || i11 < z0Var.p())) {
            this.f13253s++;
            if (c()) {
                ak.o.h("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                g0.e eVar = new g0.e(this.f13258x);
                eVar.b(1);
                this.f13240f.a(eVar);
                return;
            }
            r0 K0 = K0(this.f13258x.h(w() != 1 ? 2 : 1), z0Var, k0(z0Var, i11, j11));
            this.f13241g.x0(z0Var, i11, ci.b.c(j11));
            V0(K0, true, 1, 0, 1, true);
            return;
        }
        throw new IllegalSeekPositionException(z0Var, i11, j11);
    }

    @Override // com.google.android.exoplayer2.s0
    public boolean o() {
        return this.f13258x.f13770k;
    }

    @Override // com.google.android.exoplayer2.s0
    public void p(final boolean z11) {
        if (this.f13252r != z11) {
            this.f13252r = z11;
            this.f13241g.S0(z11);
            this.f13242h.l(10, new n.a() { // from class: com.google.android.exoplayer2.p
                @Override // ak.n.a
                public final void invoke(Object obj) {
                    d0.M(z11, (s0.a) obj);
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.s0
    public int q() {
        if (this.f13258x.f13760a.q()) {
            return this.f13260z;
        }
        r0 r0Var = this.f13258x;
        return r0Var.f13760a.b(r0Var.f13761b.f26303a);
    }

    @Override // com.google.android.exoplayer2.s0
    public void r(s0.a aVar) {
        this.f13242h.c(aVar);
    }

    @Override // com.google.android.exoplayer2.s0
    public int s() {
        if (c()) {
            return this.f13258x.f13761b.f26305c;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.s0
    public long t() {
        if (c()) {
            r0 r0Var = this.f13258x;
            r0Var.f13760a.h(r0Var.f13761b.f26303a, this.f13243i);
            r0 r0Var2 = this.f13258x;
            if (r0Var2.f13762c == -9223372036854775807L) {
                return r0Var2.f13760a.n(g(), this.f13377a).b();
            }
            return this.f13243i.k() + ci.b.d(this.f13258x.f13762c);
        }
        return C();
    }

    @Override // com.google.android.exoplayer2.s0
    public long v() {
        if (c()) {
            r0 r0Var = this.f13258x;
            if (r0Var.f13769j.equals(r0Var.f13761b)) {
                return ci.b.d(this.f13258x.f13775p);
            }
            return k();
        }
        return B();
    }

    @Override // com.google.android.exoplayer2.s0
    public int w() {
        return this.f13258x.f13763d;
    }

    @Override // com.google.android.exoplayer2.s0
    public void x(final int i11) {
        if (this.f13251q != i11) {
            this.f13251q = i11;
            this.f13241g.P0(i11);
            this.f13242h.l(9, new n.a() { // from class: com.google.android.exoplayer2.t
                @Override // ak.n.a
                public final void invoke(Object obj) {
                    d0.J(i11, (s0.a) obj);
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.s0
    public int z() {
        return this.f13251q;
    }
}