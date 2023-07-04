package x0;

import androidx.compose.ui.platform.j0;
import androidx.compose.ui.platform.p1;
import androidx.compose.ui.platform.r1;
import c1.o0;
import c1.s1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s1.f;
import s2.k0;
import vz.b0;
import w0.a1;
import w0.e0;
import w0.t0;
import w0.v0;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private final a1 f56593a;

    /* renamed from: b  reason: collision with root package name */
    private s2.t f56594b;

    /* renamed from: c  reason: collision with root package name */
    private h00.l<? super s2.a0, b0> f56595c;

    /* renamed from: d  reason: collision with root package name */
    private t0 f56596d;

    /* renamed from: e  reason: collision with root package name */
    private final o0 f56597e;

    /* renamed from: f  reason: collision with root package name */
    private k0 f56598f;

    /* renamed from: g  reason: collision with root package name */
    private j0 f56599g;

    /* renamed from: h  reason: collision with root package name */
    private p1 f56600h;

    /* renamed from: i  reason: collision with root package name */
    private z1.a f56601i;

    /* renamed from: j  reason: collision with root package name */
    private r1.s f56602j;

    /* renamed from: k  reason: collision with root package name */
    private final o0 f56603k;

    /* renamed from: l  reason: collision with root package name */
    private long f56604l;

    /* renamed from: m  reason: collision with root package name */
    private Integer f56605m;

    /* renamed from: n  reason: collision with root package name */
    private long f56606n;

    /* renamed from: o  reason: collision with root package name */
    private s2.a0 f56607o;

    /* renamed from: p  reason: collision with root package name */
    private final e0 f56608p;

    /* renamed from: q  reason: collision with root package name */
    private final x0.g f56609q;

    /* loaded from: classes.dex */
    public static final class a implements e0 {
        a() {
        }

        @Override // w0.e0
        public void a(long j11) {
            t tVar = t.this;
            tVar.f56604l = m.a(tVar.u(true));
            t.this.f56606n = s1.f.f49950b.c();
            t0 z11 = t.this.z();
            if (z11 == null) {
                return;
            }
            z11.o(w0.i.Cursor);
        }

        @Override // w0.e0
        public void b(long j11) {
            v0 g11;
            n2.w i11;
            t tVar = t.this;
            tVar.f56606n = s1.f.q(tVar.f56606n, j11);
            t0 z11 = t.this.z();
            if (z11 == null || (g11 = z11.g()) == null || (i11 = g11.i()) == null) {
                return;
            }
            t tVar2 = t.this;
            int w11 = i11.w(s1.f.q(tVar2.f56604l, tVar2.f56606n));
            long b11 = n2.z.b(w11, w11);
            if (n2.y.g(b11, tVar2.C().g())) {
                return;
            }
            z1.a v11 = tVar2.v();
            if (v11 != null) {
                v11.a(z1.b.f60041a.b());
            }
            tVar2.y().invoke(tVar2.k(tVar2.C().e(), b11));
        }

        @Override // w0.e0
        public void onCancel() {
        }

        @Override // w0.e0
        public void onStop() {
            t0 z11 = t.this.z();
            if (z11 == null) {
                return;
            }
            z11.o(null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements e0 {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f56612b;

        b(boolean z11) {
            this.f56612b = z11;
        }

        @Override // w0.e0
        public void a(long j11) {
            t tVar = t.this;
            tVar.f56604l = m.a(tVar.u(this.f56612b));
            t.this.f56606n = s1.f.f49950b.c();
            t0 z11 = t.this.z();
            if (z11 != null) {
                z11.o(this.f56612b ? w0.i.SelectionStart : w0.i.SelectionEnd);
            }
            t0 z12 = t.this.z();
            if (z12 == null) {
                return;
            }
            z12.u(false);
        }

        @Override // w0.e0
        public void b(long j11) {
            v0 g11;
            n2.w i11;
            int originalToTransformed;
            int w11;
            t tVar = t.this;
            tVar.f56606n = s1.f.q(tVar.f56606n, j11);
            t0 z11 = t.this.z();
            if (z11 != null && (g11 = z11.g()) != null && (i11 = g11.i()) != null) {
                boolean z12 = this.f56612b;
                t tVar2 = t.this;
                if (z12) {
                    originalToTransformed = i11.w(s1.f.q(tVar2.f56604l, tVar2.f56606n));
                } else {
                    originalToTransformed = tVar2.x().originalToTransformed(n2.y.n(tVar2.C().g()));
                }
                int i12 = originalToTransformed;
                if (!z12) {
                    w11 = i11.w(s1.f.q(tVar2.f56604l, tVar2.f56606n));
                } else {
                    w11 = tVar2.x().originalToTransformed(n2.y.i(tVar2.C().g()));
                }
                tVar2.U(tVar2.C(), i12, w11, z12, k.f56574a.c());
            }
            t0 z13 = t.this.z();
            if (z13 == null) {
                return;
            }
            z13.u(false);
        }

        @Override // w0.e0
        public void onCancel() {
        }

        @Override // w0.e0
        public void onStop() {
            t0 z11 = t.this.z();
            if (z11 != null) {
                z11.o(null);
            }
            t0 z12 = t.this.z();
            if (z12 != null) {
                z12.u(true);
            }
            p1 A = t.this.A();
            if ((A != null ? A.getStatus() : null) == r1.Hidden) {
                t.this.T();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements x0.g {
        c() {
        }

        @Override // x0.g
        public boolean a(long j11, k adjustment) {
            v0 g11;
            kotlin.jvm.internal.s.g(adjustment, "adjustment");
            r1.s t11 = t.this.t();
            if (t11 != null) {
                t11.c();
            }
            t.this.f56604l = j11;
            t0 z11 = t.this.z();
            if (z11 == null || (g11 = z11.g()) == null) {
                return false;
            }
            t tVar = t.this;
            tVar.f56605m = Integer.valueOf(v0.h(g11, j11, false, 2, null));
            int h11 = v0.h(g11, tVar.f56604l, false, 2, null);
            tVar.U(tVar.C(), h11, h11, false, adjustment);
            return true;
        }

        @Override // x0.g
        public boolean b(long j11, k adjustment) {
            t0 z11;
            v0 g11;
            kotlin.jvm.internal.s.g(adjustment, "adjustment");
            if ((t.this.C().h().length() == 0) || (z11 = t.this.z()) == null || (g11 = z11.g()) == null) {
                return false;
            }
            t tVar = t.this;
            int g12 = g11.g(j11, false);
            s2.a0 C = tVar.C();
            Integer num = tVar.f56605m;
            kotlin.jvm.internal.s.e(num);
            tVar.U(C, num.intValue(), g12, false, adjustment);
            return true;
        }

        @Override // x0.g
        public boolean c(long j11) {
            t0 z11;
            v0 g11;
            if ((t.this.C().h().length() == 0) || (z11 = t.this.z()) == null || (g11 = z11.g()) == null) {
                return false;
            }
            t tVar = t.this;
            tVar.U(tVar.C(), tVar.x().originalToTransformed(n2.y.n(tVar.C().g())), g11.g(j11, false), false, k.f56574a.e());
            return true;
        }

        @Override // x0.g
        public boolean d(long j11) {
            v0 g11;
            t0 z11 = t.this.z();
            if (z11 == null || (g11 = z11.g()) == null) {
                return false;
            }
            t tVar = t.this;
            tVar.U(tVar.C(), tVar.x().originalToTransformed(n2.y.n(tVar.C().g())), v0.h(g11, j11, false, 2, null), false, k.f56574a.e());
            return true;
        }
    }

    /* loaded from: classes.dex */
    static final class d extends kotlin.jvm.internal.u implements h00.l<s2.a0, b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f56614a = new d();

        d() {
            super(1);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(s2.a0 a0Var) {
            invoke2(a0Var);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(s2.a0 it2) {
            kotlin.jvm.internal.s.g(it2, "it");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.a<b0> {
        e() {
            super(0);
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ b0 invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            t.j(t.this, false, 1, null);
            t.this.E();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.a<b0> {
        f() {
            super(0);
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ b0 invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            t.this.m();
            t.this.E();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.u implements h00.a<b0> {
        g() {
            super(0);
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ b0 invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            t.this.G();
            t.this.E();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class h extends kotlin.jvm.internal.u implements h00.a<b0> {
        h() {
            super(0);
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ b0 invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            t.this.H();
        }
    }

    /* loaded from: classes.dex */
    public static final class i implements e0 {
        i() {
        }

        @Override // w0.e0
        public void a(long j11) {
            v0 g11;
            v0 g12;
            t0 z11;
            v0 g13;
            t0 z12 = t.this.z();
            if (z12 == null || z12.a() == null) {
                t0 z13 = t.this.z();
                if (!((z13 == null || (g11 = z13.g()) == null || !g11.j(j11)) ? false : true) && (z11 = t.this.z()) != null && (g13 = z11.g()) != null) {
                    t tVar = t.this;
                    int transformedToOriginal = tVar.x().transformedToOriginal(v0.e(g13, g13.f(s1.f.m(j11)), false, 2, null));
                    z1.a v11 = tVar.v();
                    if (v11 != null) {
                        v11.a(z1.b.f60041a.b());
                    }
                    s2.a0 k11 = tVar.k(tVar.C().e(), n2.z.b(transformedToOriginal, transformedToOriginal));
                    tVar.p();
                    tVar.y().invoke(k11);
                    return;
                }
                if (t.this.C().h().length() == 0) {
                    return;
                }
                t.this.p();
                t0 z14 = t.this.z();
                if (z14 != null && (g12 = z14.g()) != null) {
                    t tVar2 = t.this;
                    int h11 = v0.h(g12, j11, false, 2, null);
                    tVar2.U(tVar2.C(), h11, h11, false, k.f56574a.g());
                    tVar2.f56605m = Integer.valueOf(h11);
                }
                t.this.f56604l = j11;
                t.this.f56606n = s1.f.f49950b.c();
            }
        }

        @Override // w0.e0
        public void b(long j11) {
            v0 g11;
            if (t.this.C().h().length() == 0) {
                return;
            }
            t tVar = t.this;
            tVar.f56606n = s1.f.q(tVar.f56606n, j11);
            t0 z11 = t.this.z();
            if (z11 != null && (g11 = z11.g()) != null) {
                t tVar2 = t.this;
                Integer num = tVar2.f56605m;
                tVar2.U(tVar2.C(), num == null ? g11.g(tVar2.f56604l, false) : num.intValue(), g11.g(s1.f.q(tVar2.f56604l, tVar2.f56606n), false), false, k.f56574a.g());
            }
            t0 z12 = t.this.z();
            if (z12 == null) {
                return;
            }
            z12.u(false);
        }

        @Override // w0.e0
        public void onCancel() {
        }

        @Override // w0.e0
        public void onStop() {
            t0 z11 = t.this.z();
            if (z11 != null) {
                z11.u(true);
            }
            p1 A = t.this.A();
            if ((A == null ? null : A.getStatus()) == r1.Hidden) {
                t.this.T();
            }
            t.this.f56605m = null;
        }
    }

    public t() {
        this(null, 1, null);
    }

    public t(a1 a1Var) {
        o0 d11;
        o0 d12;
        this.f56593a = a1Var;
        this.f56594b = s2.t.f50149a.a();
        this.f56595c = d.f56614a;
        d11 = s1.d(new s2.a0((String) null, 0L, (n2.y) null, 7, (DefaultConstructorMarker) null), null, 2, null);
        this.f56597e = d11;
        this.f56598f = k0.f50112a.c();
        d12 = s1.d(Boolean.TRUE, null, 2, null);
        this.f56603k = d12;
        f.a aVar = s1.f.f49950b;
        this.f56604l = aVar.c();
        this.f56606n = aVar.c();
        this.f56607o = new s2.a0((String) null, 0L, (n2.y) null, 7, (DefaultConstructorMarker) null);
        this.f56608p = new i();
        this.f56609q = new c();
    }

    private final void L(w0.j jVar) {
        t0 t0Var = this.f56596d;
        if (t0Var == null) {
            return;
        }
        t0Var.p(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(s2.a0 a0Var, int i11, int i12, boolean z11, k kVar) {
        v0 g11;
        long b11 = n2.z.b(this.f56594b.originalToTransformed(n2.y.n(a0Var.g())), this.f56594b.originalToTransformed(n2.y.i(a0Var.g())));
        t0 t0Var = this.f56596d;
        long a11 = s.a((t0Var == null || (g11 = t0Var.g()) == null) ? null : g11.i(), i11, i12, n2.y.h(b11) ? null : n2.y.b(b11), z11, kVar);
        long b12 = n2.z.b(this.f56594b.transformedToOriginal(n2.y.n(a11)), this.f56594b.transformedToOriginal(n2.y.i(a11)));
        if (n2.y.g(b12, a0Var.g())) {
            return;
        }
        z1.a aVar = this.f56601i;
        if (aVar != null) {
            aVar.a(z1.b.f60041a.b());
        }
        this.f56595c.invoke(k(a0Var.e(), b12));
        t0 t0Var2 = this.f56596d;
        if (t0Var2 != null) {
            t0Var2.w(u.b(this, true));
        }
        t0 t0Var3 = this.f56596d;
        if (t0Var3 == null) {
            return;
        }
        t0Var3.v(u.b(this, false));
    }

    public static /* synthetic */ void j(t tVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        tVar.i(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s2.a0 k(n2.a aVar, long j11) {
        return new s2.a0(aVar, j11, (n2.y) null, 4, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ void o(t tVar, s1.f fVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fVar = null;
        }
        tVar.n(fVar);
    }

    private final s1.h r() {
        f2.o f11;
        f2.o f12;
        n2.w i11;
        int m11;
        float l11;
        float m12;
        f2.o f13;
        n2.w i12;
        int m13;
        float l12;
        f2.o f14;
        t0 t0Var = this.f56596d;
        if (t0Var == null) {
            return s1.h.f49955e.a();
        }
        t0 z11 = z();
        s1.f fVar = null;
        s1.f d11 = (z11 == null || (f11 = z11.f()) == null) ? null : s1.f.d(f11.q0(u(true)));
        long c11 = d11 == null ? s1.f.f49950b.c() : d11.t();
        t0 z12 = z();
        if (z12 != null && (f14 = z12.f()) != null) {
            fVar = s1.f.d(f14.q0(u(false)));
        }
        long c12 = fVar == null ? s1.f.f49950b.c() : fVar.t();
        t0 z13 = z();
        float f15 = BitmapDescriptorFactory.HUE_RED;
        if (z13 == null || (f12 = z13.f()) == null) {
            m12 = 0.0f;
        } else {
            v0 g11 = t0Var.g();
            if (g11 != null && (i11 = g11.i()) != null) {
                m11 = m00.l.m(n2.y.n(C().g()), 0, Math.max(0, C().h().length() - 1));
                s1.h d12 = i11.d(m11);
                if (d12 != null) {
                    l11 = d12.l();
                    m12 = s1.f.m(f12.q0(s1.g.a(BitmapDescriptorFactory.HUE_RED, l11)));
                }
            }
            l11 = 0.0f;
            m12 = s1.f.m(f12.q0(s1.g.a(BitmapDescriptorFactory.HUE_RED, l11)));
        }
        t0 z14 = z();
        if (z14 != null && (f13 = z14.f()) != null) {
            v0 g12 = t0Var.g();
            if (g12 != null && (i12 = g12.i()) != null) {
                m13 = m00.l.m(n2.y.i(C().g()), 0, Math.max(0, C().h().length() - 1));
                s1.h d13 = i12.d(m13);
                if (d13 != null) {
                    l12 = d13.l();
                    f15 = s1.f.m(f13.q0(s1.g.a(BitmapDescriptorFactory.HUE_RED, l12)));
                }
            }
            l12 = 0.0f;
            f15 = s1.f.m(f13.q0(s1.g.a(BitmapDescriptorFactory.HUE_RED, l12)));
        }
        return new s1.h(Math.min(s1.f.l(c11), s1.f.l(c12)), Math.min(m12, f15), Math.max(s1.f.l(c11), s1.f.l(c12)), Math.max(s1.f.m(c11), s1.f.m(c12)) + (x2.g.f(25) * t0Var.n().a().getDensity()));
    }

    public final p1 A() {
        return this.f56600h;
    }

    public final e0 B() {
        return this.f56608p;
    }

    public final s2.a0 C() {
        return (s2.a0) this.f56597e.getValue();
    }

    public final e0 D(boolean z11) {
        return new b(z11);
    }

    public final void E() {
        p1 p1Var;
        p1 p1Var2 = this.f56600h;
        if ((p1Var2 == null ? null : p1Var2.getStatus()) != r1.Shown || (p1Var = this.f56600h) == null) {
            return;
        }
        p1Var.hide();
    }

    public final boolean F() {
        return !kotlin.jvm.internal.s.c(this.f56607o.h(), C().h());
    }

    public final void G() {
        j0 j0Var = this.f56599g;
        n2.a text = j0Var == null ? null : j0Var.getText();
        if (text == null) {
            return;
        }
        n2.a i11 = s2.b0.c(C(), C().h().length()).i(text).i(s2.b0.b(C(), C().h().length()));
        int l11 = n2.y.l(C().g()) + text.length();
        this.f56595c.invoke(k(i11, n2.z.b(l11, l11)));
        L(w0.j.None);
        a1 a1Var = this.f56593a;
        if (a1Var == null) {
            return;
        }
        a1Var.a();
    }

    public final void H() {
        L(w0.j.None);
        s2.a0 k11 = k(C().e(), n2.z.b(0, C().h().length()));
        this.f56595c.invoke(k11);
        this.f56607o = s2.a0.d(this.f56607o, null, k11.g(), null, 5, null);
        E();
        t0 t0Var = this.f56596d;
        if (t0Var != null) {
            t0Var.u(true);
        }
        T();
    }

    public final void I(j0 j0Var) {
        this.f56599g = j0Var;
    }

    public final void J(boolean z11) {
        this.f56603k.setValue(Boolean.valueOf(z11));
    }

    public final void K(r1.s sVar) {
        this.f56602j = sVar;
    }

    public final void M(z1.a aVar) {
        this.f56601i = aVar;
    }

    public final void N(s2.t tVar) {
        kotlin.jvm.internal.s.g(tVar, "<set-?>");
        this.f56594b = tVar;
    }

    public final void O(h00.l<? super s2.a0, b0> lVar) {
        kotlin.jvm.internal.s.g(lVar, "<set-?>");
        this.f56595c = lVar;
    }

    public final void P(t0 t0Var) {
        this.f56596d = t0Var;
    }

    public final void Q(p1 p1Var) {
        this.f56600h = p1Var;
    }

    public final void R(s2.a0 a0Var) {
        kotlin.jvm.internal.s.g(a0Var, "<set-?>");
        this.f56597e.setValue(a0Var);
    }

    public final void S(k0 k0Var) {
        kotlin.jvm.internal.s.g(k0Var, "<set-?>");
        this.f56598f = k0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T() {
        /*
            r8 = this;
            s2.a0 r0 = r8.C()
            long r0 = r0.g()
            boolean r0 = n2.y.h(r0)
            r1 = 0
            if (r0 != 0) goto L16
            x0.t$e r0 = new x0.t$e
            r0.<init>()
            r4 = r0
            goto L17
        L16:
            r4 = r1
        L17:
            s2.a0 r0 = r8.C()
            long r2 = r0.g()
            boolean r0 = n2.y.h(r2)
            if (r0 != 0) goto L32
            boolean r0 = r8.s()
            if (r0 == 0) goto L32
            x0.t$f r0 = new x0.t$f
            r0.<init>()
            r6 = r0
            goto L33
        L32:
            r6 = r1
        L33:
            boolean r0 = r8.s()
            if (r0 == 0) goto L4c
            androidx.compose.ui.platform.j0 r0 = r8.f56599g
            if (r0 != 0) goto L3f
            r0 = r1
            goto L43
        L3f:
            n2.a r0 = r0.getText()
        L43:
            if (r0 == 0) goto L4c
            x0.t$g r0 = new x0.t$g
            r0.<init>()
            r5 = r0
            goto L4d
        L4c:
            r5 = r1
        L4d:
            s2.a0 r0 = r8.C()
            long r2 = r0.g()
            int r0 = n2.y.j(r2)
            s2.a0 r2 = r8.C()
            java.lang.String r2 = r2.h()
            int r2 = r2.length()
            if (r0 == r2) goto L82
            s2.a0 r0 = r8.f56607o
            long r2 = r0.g()
            int r0 = n2.y.j(r2)
            s2.a0 r2 = r8.f56607o
            java.lang.String r2 = r2.h()
            int r2 = r2.length()
            if (r0 == r2) goto L82
            x0.t$h r1 = new x0.t$h
            r1.<init>()
        L82:
            r7 = r1
            androidx.compose.ui.platform.p1 r2 = r8.f56600h
            if (r2 != 0) goto L88
            goto L8f
        L88:
            s1.h r3 = r8.r()
            r2.a(r3, r4, r5, r6, r7)
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.t.T():void");
    }

    public final void i(boolean z11) {
        if (n2.y.h(C().g())) {
            return;
        }
        j0 j0Var = this.f56599g;
        if (j0Var != null) {
            j0Var.a(s2.b0.a(C()));
        }
        if (z11) {
            int k11 = n2.y.k(C().g());
            this.f56595c.invoke(k(C().e(), n2.z.b(k11, k11)));
            L(w0.j.None);
        }
    }

    public final e0 l() {
        return new a();
    }

    public final void m() {
        if (n2.y.h(C().g())) {
            return;
        }
        j0 j0Var = this.f56599g;
        if (j0Var != null) {
            j0Var.a(s2.b0.a(C()));
        }
        n2.a i11 = s2.b0.c(C(), C().h().length()).i(s2.b0.b(C(), C().h().length()));
        int l11 = n2.y.l(C().g());
        this.f56595c.invoke(k(i11, n2.z.b(l11, l11)));
        L(w0.j.None);
        a1 a1Var = this.f56593a;
        if (a1Var == null) {
            return;
        }
        a1Var.a();
    }

    public final void n(s1.f fVar) {
        w0.j jVar;
        int k11;
        if (!n2.y.h(C().g())) {
            t0 t0Var = this.f56596d;
            v0 g11 = t0Var == null ? null : t0Var.g();
            if (fVar != null && g11 != null) {
                k11 = this.f56594b.transformedToOriginal(v0.h(g11, fVar.t(), false, 2, null));
            } else {
                k11 = n2.y.k(C().g());
            }
            this.f56595c.invoke(s2.a0.d(C(), null, n2.z.a(k11), null, 5, null));
        }
        if (fVar != null) {
            if (C().h().length() > 0) {
                jVar = w0.j.Cursor;
                L(jVar);
                E();
            }
        }
        jVar = w0.j.None;
        L(jVar);
        E();
    }

    public final void p() {
        r1.s sVar;
        t0 t0Var = this.f56596d;
        boolean z11 = false;
        if (t0Var != null && !t0Var.c()) {
            z11 = true;
        }
        if (z11 && (sVar = this.f56602j) != null) {
            sVar.c();
        }
        this.f56607o = C();
        t0 t0Var2 = this.f56596d;
        if (t0Var2 != null) {
            t0Var2.u(true);
        }
        L(w0.j.Selection);
    }

    public final void q() {
        t0 t0Var = this.f56596d;
        if (t0Var != null) {
            t0Var.u(false);
        }
        L(w0.j.None);
    }

    public final boolean s() {
        return ((Boolean) this.f56603k.getValue()).booleanValue();
    }

    public final r1.s t() {
        return this.f56602j;
    }

    public final long u(boolean z11) {
        long g11 = C().g();
        int n11 = z11 ? n2.y.n(g11) : n2.y.i(g11);
        t0 t0Var = this.f56596d;
        v0 g12 = t0Var == null ? null : t0Var.g();
        kotlin.jvm.internal.s.e(g12);
        return z.a(g12.i(), this.f56594b.originalToTransformed(n11), z11, n2.y.m(C().g()));
    }

    public final z1.a v() {
        return this.f56601i;
    }

    public final x0.g w() {
        return this.f56609q;
    }

    public final s2.t x() {
        return this.f56594b;
    }

    public final h00.l<s2.a0, b0> y() {
        return this.f56595c;
    }

    public final t0 z() {
        return this.f56596d;
    }

    public /* synthetic */ t(a1 a1Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : a1Var);
    }
}