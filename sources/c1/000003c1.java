package androidx.camera.core;

import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.g1;
import androidx.camera.core.impl.p1;
import androidx.camera.core.impl.q1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class o extends f1 {

    /* renamed from: p */
    public static final d f2457p = new d();

    /* renamed from: l */
    final r f2458l;

    /* renamed from: m */
    private final Object f2459m;

    /* renamed from: n */
    private a f2460n;

    /* renamed from: o */
    private DeferrableSurface f2461o;

    /* loaded from: classes.dex */
    public interface a {
        void a(g0 g0Var);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    /* loaded from: classes.dex */
    public static final class c implements p1.a<o, androidx.camera.core.impl.l0, c> {

        /* renamed from: a */
        private final androidx.camera.core.impl.x0 f2462a;

        public c() {
            this(androidx.camera.core.impl.x0.I());
        }

        static c d(androidx.camera.core.impl.d0 d0Var) {
            return new c(androidx.camera.core.impl.x0.J(d0Var));
        }

        @Override // z.q
        public androidx.camera.core.impl.w0 a() {
            return this.f2462a;
        }

        public o c() {
            if (a().g(androidx.camera.core.impl.p0.f2348b, null) != null && a().g(androidx.camera.core.impl.p0.f2350d, null) != null) {
                throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
            }
            return new o(b());
        }

        @Override // androidx.camera.core.impl.p1.a
        /* renamed from: e */
        public androidx.camera.core.impl.l0 b() {
            return new androidx.camera.core.impl.l0(androidx.camera.core.impl.b1.G(this.f2462a));
        }

        public c f(Size size) {
            a().p(androidx.camera.core.impl.p0.f2351e, size);
            return this;
        }

        public c g(int i11) {
            a().p(androidx.camera.core.impl.l0.f2325u, Integer.valueOf(i11));
            return this;
        }

        public c h(Size size) {
            a().p(androidx.camera.core.impl.p0.f2352f, size);
            return this;
        }

        public c i(int i11) {
            a().p(p1.f2358l, Integer.valueOf(i11));
            return this;
        }

        public c j(int i11) {
            a().p(androidx.camera.core.impl.p0.f2348b, Integer.valueOf(i11));
            return this;
        }

        public c k(Class<o> cls) {
            a().p(d0.e.f23253p, cls);
            if (a().g(d0.e.f23252o, null) == null) {
                l(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public c l(String str) {
            a().p(d0.e.f23252o, str);
            return this;
        }

        public c m(Size size) {
            a().p(androidx.camera.core.impl.p0.f2350d, size);
            return this;
        }

        public c n(int i11) {
            a().p(androidx.camera.core.impl.p0.f2349c, Integer.valueOf(i11));
            return this;
        }

        private c(androidx.camera.core.impl.x0 x0Var) {
            this.f2462a = x0Var;
            Class cls = (Class) x0Var.g(d0.e.f23253p, null);
            if (cls != null && !cls.equals(o.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            k(o.class);
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        private static final Size f2463a;

        /* renamed from: b */
        private static final Size f2464b;

        /* renamed from: c */
        private static final androidx.camera.core.impl.l0 f2465c;

        static {
            Size size = new Size(640, 480);
            f2463a = size;
            Size size2 = new Size(1920, 1080);
            f2464b = size2;
            f2465c = new c().f(size).h(size2).i(1).j(0).b();
        }

        public androidx.camera.core.impl.l0 a() {
            return f2465c;
        }
    }

    o(androidx.camera.core.impl.l0 l0Var) {
        super(l0Var);
        this.f2459m = new Object();
        if (((androidx.camera.core.impl.l0) f()).E(0) == 1) {
            this.f2458l = new s();
        } else {
            this.f2458l = new t(l0Var.B(b0.a.b()));
        }
    }

    public static /* synthetic */ void J(o oVar, a aVar, g0 g0Var) {
        oVar.P(aVar, g0Var);
    }

    public /* synthetic */ void O(String str, androidx.camera.core.impl.l0 l0Var, Size size, g1 g1Var, g1.e eVar) {
        K();
        this.f2458l.g();
        if (o(str)) {
            G(L(str, l0Var, size).m());
            s();
        }
    }

    public /* synthetic */ void P(a aVar, g0 g0Var) {
        if (n() != null) {
            g0Var.c0(n());
        }
        aVar.a(g0Var);
    }

    private void R() {
        androidx.camera.core.impl.s c11 = c();
        if (c11 != null) {
            this.f2458l.m(j(c11));
        }
    }

    @Override // androidx.camera.core.f1
    protected Size D(Size size) {
        G(L(e(), (androidx.camera.core.impl.l0) f(), size).m());
        return size;
    }

    void K() {
        a0.j.a();
        DeferrableSurface deferrableSurface = this.f2461o;
        if (deferrableSurface != null) {
            deferrableSurface.c();
            this.f2461o = null;
        }
    }

    g1.b L(final String str, final androidx.camera.core.impl.l0 l0Var, final Size size) {
        a1 a1Var;
        a0.j.a();
        Executor executor = (Executor) v3.h.f(l0Var.B(b0.a.b()));
        int N = M() == 1 ? N() : 4;
        if (l0Var.G() != null) {
            a1Var = new a1(l0Var.G().a(size.getWidth(), size.getHeight(), h(), N, 0L));
        } else {
            a1Var = new a1(h0.a(size.getWidth(), size.getHeight(), h(), N));
        }
        R();
        a1Var.e(this.f2458l, executor);
        g1.b n11 = g1.b.n(l0Var);
        DeferrableSurface deferrableSurface = this.f2461o;
        if (deferrableSurface != null) {
            deferrableSurface.c();
        }
        androidx.camera.core.impl.s0 s0Var = new androidx.camera.core.impl.s0(a1Var.getSurface());
        this.f2461o = s0Var;
        s0Var.f().a(new n(a1Var), b0.a.d());
        n11.k(this.f2461o);
        n11.f(new g1.c() { // from class: z.u
            @Override // androidx.camera.core.impl.g1.c
            public final void a(g1 g1Var, g1.e eVar) {
                androidx.camera.core.o.this.O(str, l0Var, size, g1Var, eVar);
            }
        });
        return n11;
    }

    public int M() {
        return ((androidx.camera.core.impl.l0) f()).E(0);
    }

    public int N() {
        return ((androidx.camera.core.impl.l0) f()).F(6);
    }

    public void Q(Executor executor, final a aVar) {
        synchronized (this.f2459m) {
            this.f2458l.l(executor, new a() { // from class: z.t
                {
                    androidx.camera.core.o.this = this;
                }

                @Override // androidx.camera.core.o.a
                public final void a(androidx.camera.core.g0 g0Var) {
                    androidx.camera.core.o.J(androidx.camera.core.o.this, aVar, g0Var);
                }
            });
            if (this.f2460n == null) {
                q();
            }
            this.f2460n = aVar;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.camera.core.impl.p1<?>, androidx.camera.core.impl.p1] */
    @Override // androidx.camera.core.f1
    public p1<?> g(boolean z11, q1 q1Var) {
        androidx.camera.core.impl.d0 a11 = q1Var.a(q1.a.IMAGE_ANALYSIS);
        if (z11) {
            a11 = androidx.camera.core.impl.d0.A(a11, f2457p.a());
        }
        if (a11 == null) {
            return null;
        }
        return m(a11).b();
    }

    @Override // androidx.camera.core.f1
    public p1.a<?, ?, ?> m(androidx.camera.core.impl.d0 d0Var) {
        return c.d(d0Var);
    }

    public String toString() {
        return "ImageAnalysis:" + i();
    }

    @Override // androidx.camera.core.f1
    public void w() {
        this.f2458l.f();
    }

    @Override // androidx.camera.core.f1
    public void z() {
        K();
        this.f2458l.h();
    }
}