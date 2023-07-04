package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import s1.l;
import t1.m0;
import t1.u;

/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a  reason: collision with root package name */
    private x2.d f2926a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2927b;

    /* renamed from: c  reason: collision with root package name */
    private final Outline f2928c;

    /* renamed from: d  reason: collision with root package name */
    private long f2929d;

    /* renamed from: e  reason: collision with root package name */
    private t1.c1 f2930e;

    /* renamed from: f  reason: collision with root package name */
    private t1.q0 f2931f;

    /* renamed from: g  reason: collision with root package name */
    private t1.q0 f2932g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2933h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f2934i;

    /* renamed from: j  reason: collision with root package name */
    private t1.q0 f2935j;

    /* renamed from: k  reason: collision with root package name */
    private s1.j f2936k;

    /* renamed from: l  reason: collision with root package name */
    private float f2937l;

    /* renamed from: m  reason: collision with root package name */
    private long f2938m;

    /* renamed from: n  reason: collision with root package name */
    private long f2939n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f2940o;

    /* renamed from: p  reason: collision with root package name */
    private x2.q f2941p;

    /* renamed from: q  reason: collision with root package name */
    private t1.q0 f2942q;

    /* renamed from: r  reason: collision with root package name */
    private t1.q0 f2943r;

    /* renamed from: s  reason: collision with root package name */
    private t1.m0 f2944s;

    public f1(x2.d density) {
        kotlin.jvm.internal.s.g(density, "density");
        this.f2926a = density;
        this.f2927b = true;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f2928c = outline;
        l.a aVar = s1.l.f49969b;
        this.f2929d = aVar.b();
        this.f2930e = t1.w0.a();
        this.f2938m = s1.f.f49950b.c();
        this.f2939n = aVar.b();
        this.f2941p = x2.q.Ltr;
    }

    private final boolean f(s1.j jVar, long j11, long j12, float f11) {
        if (jVar == null || !s1.k.d(jVar)) {
            return false;
        }
        if (jVar.e() == s1.f.l(j11)) {
            if (jVar.g() == s1.f.m(j11)) {
                if (jVar.f() == s1.f.l(j11) + s1.l.i(j12)) {
                    if (jVar.a() == s1.f.m(j11) + s1.l.g(j12)) {
                        return (s1.a.d(jVar.h()) > f11 ? 1 : (s1.a.d(jVar.h()) == f11 ? 0 : -1)) == 0;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    private final void i() {
        if (this.f2933h) {
            this.f2938m = s1.f.f49950b.c();
            long j11 = this.f2929d;
            this.f2939n = j11;
            this.f2937l = BitmapDescriptorFactory.HUE_RED;
            this.f2932g = null;
            this.f2933h = false;
            this.f2934i = false;
            if (this.f2940o && s1.l.i(j11) > BitmapDescriptorFactory.HUE_RED && s1.l.g(this.f2929d) > BitmapDescriptorFactory.HUE_RED) {
                this.f2927b = true;
                t1.m0 a11 = this.f2930e.a(this.f2929d, this.f2941p, this.f2926a);
                this.f2944s = a11;
                if (a11 instanceof m0.b) {
                    k(((m0.b) a11).a());
                    return;
                } else if (a11 instanceof m0.c) {
                    l(((m0.c) a11).a());
                    return;
                } else if (a11 instanceof m0.a) {
                    j(((m0.a) a11).a());
                    return;
                } else {
                    return;
                }
            }
            this.f2928c.setEmpty();
        }
    }

    private final void j(t1.q0 q0Var) {
        if (Build.VERSION.SDK_INT <= 28 && !q0Var.b()) {
            this.f2927b = false;
            this.f2928c.setEmpty();
            this.f2934i = true;
        } else {
            Outline outline = this.f2928c;
            if (q0Var instanceof t1.j) {
                outline.setConvexPath(((t1.j) q0Var).q());
                this.f2934i = !this.f2928c.canClip();
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        }
        this.f2932g = q0Var;
    }

    private final void k(s1.h hVar) {
        int c11;
        int c12;
        int c13;
        int c14;
        this.f2938m = s1.g.a(hVar.i(), hVar.l());
        this.f2939n = s1.m.a(hVar.n(), hVar.h());
        Outline outline = this.f2928c;
        c11 = j00.c.c(hVar.i());
        c12 = j00.c.c(hVar.l());
        c13 = j00.c.c(hVar.j());
        c14 = j00.c.c(hVar.e());
        outline.setRect(c11, c12, c13, c14);
    }

    private final void l(s1.j jVar) {
        int c11;
        int c12;
        int c13;
        int c14;
        float d11 = s1.a.d(jVar.h());
        this.f2938m = s1.g.a(jVar.e(), jVar.g());
        this.f2939n = s1.m.a(jVar.j(), jVar.d());
        if (s1.k.d(jVar)) {
            Outline outline = this.f2928c;
            c11 = j00.c.c(jVar.e());
            c12 = j00.c.c(jVar.g());
            c13 = j00.c.c(jVar.f());
            c14 = j00.c.c(jVar.a());
            outline.setRoundRect(c11, c12, c13, c14, d11);
            this.f2937l = d11;
            return;
        }
        t1.q0 q0Var = this.f2931f;
        if (q0Var == null) {
            q0Var = t1.n.a();
            this.f2931f = q0Var;
        }
        q0Var.reset();
        q0Var.j(jVar);
        j(q0Var);
    }

    public final void a(t1.u canvas) {
        kotlin.jvm.internal.s.g(canvas, "canvas");
        t1.q0 b11 = b();
        if (b11 != null) {
            u.a.a(canvas, b11, 0, 2, null);
            return;
        }
        float f11 = this.f2937l;
        if (f11 > BitmapDescriptorFactory.HUE_RED) {
            t1.q0 q0Var = this.f2935j;
            s1.j jVar = this.f2936k;
            if (q0Var == null || !f(jVar, this.f2938m, this.f2939n, f11)) {
                s1.j c11 = s1.k.c(s1.f.l(this.f2938m), s1.f.m(this.f2938m), s1.f.l(this.f2938m) + s1.l.i(this.f2939n), s1.f.m(this.f2938m) + s1.l.g(this.f2939n), s1.b.b(this.f2937l, BitmapDescriptorFactory.HUE_RED, 2, null));
                if (q0Var == null) {
                    q0Var = t1.n.a();
                } else {
                    q0Var.reset();
                }
                q0Var.j(c11);
                this.f2936k = c11;
                this.f2935j = q0Var;
            }
            u.a.a(canvas, q0Var, 0, 2, null);
            return;
        }
        u.a.b(canvas, s1.f.l(this.f2938m), s1.f.m(this.f2938m), s1.f.l(this.f2938m) + s1.l.i(this.f2939n), s1.f.m(this.f2938m) + s1.l.g(this.f2939n), 0, 16, null);
    }

    public final t1.q0 b() {
        i();
        return this.f2932g;
    }

    public final Outline c() {
        i();
        if (this.f2940o && this.f2927b) {
            return this.f2928c;
        }
        return null;
    }

    public final boolean d() {
        return !this.f2934i;
    }

    public final boolean e(long j11) {
        t1.m0 m0Var;
        if (this.f2940o && (m0Var = this.f2944s) != null) {
            return m1.b(m0Var, s1.f.l(j11), s1.f.m(j11), this.f2942q, this.f2943r);
        }
        return true;
    }

    public final boolean g(t1.c1 shape, float f11, boolean z11, float f12, x2.q layoutDirection, x2.d density) {
        kotlin.jvm.internal.s.g(shape, "shape");
        kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.s.g(density, "density");
        this.f2928c.setAlpha(f11);
        boolean z12 = !kotlin.jvm.internal.s.c(this.f2930e, shape);
        if (z12) {
            this.f2930e = shape;
            this.f2933h = true;
        }
        boolean z13 = z11 || f12 > BitmapDescriptorFactory.HUE_RED;
        if (this.f2940o != z13) {
            this.f2940o = z13;
            this.f2933h = true;
        }
        if (this.f2941p != layoutDirection) {
            this.f2941p = layoutDirection;
            this.f2933h = true;
        }
        if (!kotlin.jvm.internal.s.c(this.f2926a, density)) {
            this.f2926a = density;
            this.f2933h = true;
        }
        return z12;
    }

    public final void h(long j11) {
        if (s1.l.f(this.f2929d, j11)) {
            return;
        }
        this.f2929d = j11;
        this.f2933h = true;
    }
}