package androidx.camera.core;

import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import androidx.camera.core.e1;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.c0;
import androidx.camera.core.impl.g1;
import androidx.camera.core.impl.p1;
import androidx.camera.core.impl.q1;
import androidx.camera.core.r0;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class r0 extends f1 {

    /* renamed from: r  reason: collision with root package name */
    public static final c f2495r = new c();

    /* renamed from: s  reason: collision with root package name */
    private static final Executor f2496s = b0.a.d();

    /* renamed from: l  reason: collision with root package name */
    private d f2497l;

    /* renamed from: m  reason: collision with root package name */
    private Executor f2498m;

    /* renamed from: n  reason: collision with root package name */
    private DeferrableSurface f2499n;

    /* renamed from: o  reason: collision with root package name */
    e1 f2500o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f2501p;

    /* renamed from: q  reason: collision with root package name */
    private Size f2502q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends androidx.camera.core.impl.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.camera.core.impl.n0 f2503a;

        a(androidx.camera.core.impl.n0 n0Var) {
            this.f2503a = n0Var;
        }

        @Override // androidx.camera.core.impl.e
        public void b(androidx.camera.core.impl.m mVar) {
            super.b(mVar);
            if (this.f2503a.a(new d0.b(mVar))) {
                r0.this.u();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements p1.a<r0, androidx.camera.core.impl.c1, b> {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.camera.core.impl.x0 f2505a;

        public b() {
            this(androidx.camera.core.impl.x0.I());
        }

        static b d(androidx.camera.core.impl.d0 d0Var) {
            return new b(androidx.camera.core.impl.x0.J(d0Var));
        }

        @Override // z.q
        public androidx.camera.core.impl.w0 a() {
            return this.f2505a;
        }

        public r0 c() {
            if (a().g(androidx.camera.core.impl.p0.f2348b, null) != null && a().g(androidx.camera.core.impl.p0.f2350d, null) != null) {
                throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
            }
            return new r0(b());
        }

        @Override // androidx.camera.core.impl.p1.a
        /* renamed from: e */
        public androidx.camera.core.impl.c1 b() {
            return new androidx.camera.core.impl.c1(androidx.camera.core.impl.b1.G(this.f2505a));
        }

        public b f(int i11) {
            a().p(p1.f2358l, Integer.valueOf(i11));
            return this;
        }

        public b g(int i11) {
            a().p(androidx.camera.core.impl.p0.f2348b, Integer.valueOf(i11));
            return this;
        }

        public b h(Class<r0> cls) {
            a().p(d0.e.f23253p, cls);
            if (a().g(d0.e.f23252o, null) == null) {
                i(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public b i(String str) {
            a().p(d0.e.f23252o, str);
            return this;
        }

        public b j(int i11) {
            a().p(androidx.camera.core.impl.p0.f2349c, Integer.valueOf(i11));
            return this;
        }

        private b(androidx.camera.core.impl.x0 x0Var) {
            this.f2505a = x0Var;
            Class cls = (Class) x0Var.g(d0.e.f23253p, null);
            if (cls != null && !cls.equals(r0.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            h(r0.class);
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private static final androidx.camera.core.impl.c1 f2506a = new b().f(2).g(0).b();

        public androidx.camera.core.impl.c1 a() {
            return f2506a;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(e1 e1Var);
    }

    r0(androidx.camera.core.impl.c1 c1Var) {
        super(c1Var);
        this.f2498m = f2496s;
        this.f2501p = false;
    }

    private Rect L(Size size) {
        if (n() != null) {
            return n();
        }
        if (size != null) {
            return new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(String str, androidx.camera.core.impl.c1 c1Var, Size size, g1 g1Var, g1.e eVar) {
        if (o(str)) {
            G(K(str, c1Var, size).m());
            s();
        }
    }

    private boolean P() {
        final e1 e1Var = this.f2500o;
        final d dVar = this.f2497l;
        if (dVar == null || e1Var == null) {
            return false;
        }
        this.f2498m.execute(new Runnable() { // from class: z.p0
            @Override // java.lang.Runnable
            public final void run() {
                r0.d.this.a(e1Var);
            }
        });
        return true;
    }

    private void Q() {
        androidx.camera.core.impl.s c11 = c();
        d dVar = this.f2497l;
        Rect L = L(this.f2502q);
        e1 e1Var = this.f2500o;
        if (c11 == null || dVar == null || L == null) {
            return;
        }
        e1Var.x(e1.g.d(L, j(c11), M()));
    }

    private void T(String str, androidx.camera.core.impl.c1 c1Var, Size size) {
        G(K(str, c1Var, size).m());
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.camera.core.impl.p1<?>, androidx.camera.core.impl.p1] */
    @Override // androidx.camera.core.f1
    p1<?> A(androidx.camera.core.impl.r rVar, p1.a<?, ?, ?> aVar) {
        if (aVar.a().g(androidx.camera.core.impl.c1.f2280u, null) != null) {
            aVar.a().p(androidx.camera.core.impl.o0.f2342a, 35);
        } else {
            aVar.a().p(androidx.camera.core.impl.o0.f2342a, 34);
        }
        return aVar.b();
    }

    @Override // androidx.camera.core.f1
    protected Size D(Size size) {
        this.f2502q = size;
        T(e(), (androidx.camera.core.impl.c1) f(), this.f2502q);
        return size;
    }

    @Override // androidx.camera.core.f1
    public void F(Rect rect) {
        super.F(rect);
        Q();
    }

    g1.b K(final String str, final androidx.camera.core.impl.c1 c1Var, final Size size) {
        a0.j.a();
        g1.b n11 = g1.b.n(c1Var);
        androidx.camera.core.impl.b0 E = c1Var.E(null);
        DeferrableSurface deferrableSurface = this.f2499n;
        if (deferrableSurface != null) {
            deferrableSurface.c();
        }
        e1 e1Var = new e1(size, c(), E != null);
        this.f2500o = e1Var;
        if (P()) {
            Q();
        } else {
            this.f2501p = true;
        }
        if (E != null) {
            c0.a aVar = new c0.a();
            final HandlerThread handlerThread = new HandlerThread("CameraX-preview_processing");
            handlerThread.start();
            String num = Integer.toString(aVar.hashCode());
            x0 x0Var = new x0(size.getWidth(), size.getHeight(), c1Var.getInputFormat(), new Handler(handlerThread.getLooper()), aVar, E, e1Var.k(), num);
            n11.d(x0Var.n());
            x0Var.f().a(new Runnable() { // from class: z.o0
                @Override // java.lang.Runnable
                public final void run() {
                    handlerThread.quitSafely();
                }
            }, b0.a.a());
            this.f2499n = x0Var;
            n11.l(num, Integer.valueOf(aVar.getId()));
        } else {
            androidx.camera.core.impl.n0 F = c1Var.F(null);
            if (F != null) {
                n11.d(new a(F));
            }
            this.f2499n = e1Var.k();
        }
        n11.k(this.f2499n);
        n11.f(new g1.c() { // from class: z.n0
            @Override // androidx.camera.core.impl.g1.c
            public final void a(g1 g1Var, g1.e eVar) {
                androidx.camera.core.r0.this.N(str, c1Var, size, g1Var, eVar);
            }
        });
        return n11;
    }

    public int M() {
        return l();
    }

    public void R(d dVar) {
        S(f2496s, dVar);
    }

    public void S(Executor executor, d dVar) {
        a0.j.a();
        if (dVar == null) {
            this.f2497l = null;
            r();
            return;
        }
        this.f2497l = dVar;
        this.f2498m = executor;
        q();
        if (this.f2501p) {
            if (P()) {
                Q();
                this.f2501p = false;
            }
        } else if (b() != null) {
            T(e(), (androidx.camera.core.impl.c1) f(), b());
            s();
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.camera.core.impl.p1<?>, androidx.camera.core.impl.p1] */
    @Override // androidx.camera.core.f1
    public p1<?> g(boolean z11, q1 q1Var) {
        androidx.camera.core.impl.d0 a11 = q1Var.a(q1.a.PREVIEW);
        if (z11) {
            a11 = androidx.camera.core.impl.d0.A(a11, f2495r.a());
        }
        if (a11 == null) {
            return null;
        }
        return m(a11).b();
    }

    @Override // androidx.camera.core.f1
    public p1.a<?, ?, ?> m(androidx.camera.core.impl.d0 d0Var) {
        return b.d(d0Var);
    }

    public String toString() {
        return "Preview:" + i();
    }

    @Override // androidx.camera.core.f1
    public void z() {
        DeferrableSurface deferrableSurface = this.f2499n;
        if (deferrableSurface != null) {
            deferrableSurface.c();
        }
        this.f2500o = null;
    }
}