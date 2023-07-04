package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class j1 implements h2.e0 {

    /* renamed from: m  reason: collision with root package name */
    private static final h00.p<o0, Matrix, vz.b0> f2975m;

    /* renamed from: a  reason: collision with root package name */
    private final AndroidComposeView f2976a;

    /* renamed from: b  reason: collision with root package name */
    private h00.l<? super t1.u, vz.b0> f2977b;

    /* renamed from: c  reason: collision with root package name */
    private h00.a<vz.b0> f2978c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f2979d;

    /* renamed from: e  reason: collision with root package name */
    private final f1 f2980e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2981f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2982g;

    /* renamed from: h  reason: collision with root package name */
    private t1.o0 f2983h;

    /* renamed from: i  reason: collision with root package name */
    private final c1<o0> f2984i;

    /* renamed from: j  reason: collision with root package name */
    private final t1.v f2985j;

    /* renamed from: k  reason: collision with root package name */
    private long f2986k;

    /* renamed from: l  reason: collision with root package name */
    private final o0 f2987l;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.p<o0, Matrix, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f2988a = new a();

        a() {
            super(2);
        }

        public final void a(o0 rn2, Matrix matrix) {
            kotlin.jvm.internal.s.g(rn2, "rn");
            kotlin.jvm.internal.s.g(matrix, "matrix");
            rn2.A(matrix);
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(o0 o0Var, Matrix matrix) {
            a(o0Var, matrix);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new b(null);
        f2975m = a.f2988a;
    }

    public j1(AndroidComposeView ownerView, h00.l<? super t1.u, vz.b0> drawBlock, h00.a<vz.b0> invalidateParentLayer) {
        o0 g1Var;
        kotlin.jvm.internal.s.g(ownerView, "ownerView");
        kotlin.jvm.internal.s.g(drawBlock, "drawBlock");
        kotlin.jvm.internal.s.g(invalidateParentLayer, "invalidateParentLayer");
        this.f2976a = ownerView;
        this.f2977b = drawBlock;
        this.f2978c = invalidateParentLayer;
        this.f2980e = new f1(ownerView.getDensity());
        this.f2984i = new c1<>(f2975m);
        this.f2985j = new t1.v();
        this.f2986k = t1.h1.f51446b.a();
        if (Build.VERSION.SDK_INT >= 29) {
            g1Var = new h1(ownerView);
        } else {
            g1Var = new g1(ownerView);
        }
        g1Var.z(true);
        this.f2987l = g1Var;
    }

    private final void j(t1.u uVar) {
        if (this.f2987l.y() || this.f2987l.w()) {
            this.f2980e.a(uVar);
        }
    }

    private final void k(boolean z11) {
        if (z11 != this.f2979d) {
            this.f2979d = z11;
            this.f2976a.U(this, z11);
        }
    }

    private final void l() {
        if (Build.VERSION.SDK_INT >= 26) {
            j2.f2989a.a(this.f2976a);
        } else {
            this.f2976a.invalidate();
        }
    }

    @Override // h2.e0
    public void a(t1.u canvas) {
        kotlin.jvm.internal.s.g(canvas, "canvas");
        Canvas c11 = t1.c.c(canvas);
        if (c11.isHardwareAccelerated()) {
            i();
            boolean z11 = this.f2987l.J() > BitmapDescriptorFactory.HUE_RED;
            this.f2982g = z11;
            if (z11) {
                canvas.i();
            }
            this.f2987l.o(c11);
            if (this.f2982g) {
                canvas.n();
                return;
            }
            return;
        }
        float p11 = this.f2987l.p();
        float x11 = this.f2987l.x();
        float G = this.f2987l.G();
        float C = this.f2987l.C();
        if (this.f2987l.h() < 1.0f) {
            t1.o0 o0Var = this.f2983h;
            if (o0Var == null) {
                o0Var = t1.i.a();
                this.f2983h = o0Var;
            }
            o0Var.b(this.f2987l.h());
            c11.saveLayer(p11, x11, G, C, o0Var.q());
        } else {
            canvas.m();
        }
        canvas.b(p11, x11);
        canvas.q(this.f2984i.b(this.f2987l));
        j(canvas);
        h00.l<? super t1.u, vz.b0> lVar = this.f2977b;
        if (lVar != null) {
            lVar.mo12invoke(canvas);
        }
        canvas.h();
        k(false);
    }

    @Override // h2.e0
    public long b(long j11, boolean z11) {
        if (z11) {
            float[] a11 = this.f2984i.a(this.f2987l);
            s1.f d11 = a11 == null ? null : s1.f.d(t1.k0.c(a11, j11));
            return d11 == null ? s1.f.f49950b.a() : d11.t();
        }
        return t1.k0.c(this.f2984i.b(this.f2987l), j11);
    }

    @Override // h2.e0
    public void c(long j11) {
        int g11 = x2.o.g(j11);
        int f11 = x2.o.f(j11);
        float f12 = g11;
        this.f2987l.D(t1.h1.f(this.f2986k) * f12);
        float f13 = f11;
        this.f2987l.E(t1.h1.g(this.f2986k) * f13);
        o0 o0Var = this.f2987l;
        if (o0Var.r(o0Var.p(), this.f2987l.x(), this.f2987l.p() + g11, this.f2987l.x() + f11)) {
            this.f2980e.h(s1.m.a(f12, f13));
            this.f2987l.F(this.f2980e.c());
            invalidate();
            this.f2984i.c();
        }
    }

    @Override // h2.e0
    public void d(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, long j11, t1.c1 shape, boolean z11, t1.x0 x0Var, x2.q layoutDirection, x2.d density) {
        h00.a<vz.b0> aVar;
        kotlin.jvm.internal.s.g(shape, "shape");
        kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.s.g(density, "density");
        this.f2986k = j11;
        boolean z12 = true;
        boolean z13 = this.f2987l.y() && !this.f2980e.d();
        this.f2987l.f(f11);
        this.f2987l.m(f12);
        this.f2987l.b(f13);
        this.f2987l.n(f14);
        this.f2987l.d(f15);
        this.f2987l.t(f16);
        this.f2987l.l(f19);
        this.f2987l.j(f17);
        this.f2987l.k(f18);
        this.f2987l.i(f21);
        this.f2987l.D(t1.h1.f(j11) * this.f2987l.getWidth());
        this.f2987l.E(t1.h1.g(j11) * this.f2987l.getHeight());
        this.f2987l.H(z11 && shape != t1.w0.a());
        this.f2987l.q(z11 && shape == t1.w0.a());
        this.f2987l.g(x0Var);
        boolean g11 = this.f2980e.g(shape, this.f2987l.h(), this.f2987l.y(), this.f2987l.J(), layoutDirection, density);
        this.f2987l.F(this.f2980e.c());
        if (!this.f2987l.y() || this.f2980e.d()) {
            z12 = false;
        }
        if (z13 == z12 && (!z12 || !g11)) {
            l();
        } else {
            invalidate();
        }
        if (!this.f2982g && this.f2987l.J() > BitmapDescriptorFactory.HUE_RED && (aVar = this.f2978c) != null) {
            aVar.mo11invoke();
        }
        this.f2984i.c();
    }

    @Override // h2.e0
    public void destroy() {
        if (this.f2987l.v()) {
            this.f2987l.s();
        }
        this.f2977b = null;
        this.f2978c = null;
        this.f2981f = true;
        k(false);
        this.f2976a.b0();
        this.f2976a.a0(this);
    }

    @Override // h2.e0
    public boolean e(long j11) {
        float l11 = s1.f.l(j11);
        float m11 = s1.f.m(j11);
        if (this.f2987l.w()) {
            return BitmapDescriptorFactory.HUE_RED <= l11 && l11 < ((float) this.f2987l.getWidth()) && BitmapDescriptorFactory.HUE_RED <= m11 && m11 < ((float) this.f2987l.getHeight());
        } else if (this.f2987l.y()) {
            return this.f2980e.e(j11);
        } else {
            return true;
        }
    }

    @Override // h2.e0
    public void f(h00.l<? super t1.u, vz.b0> drawBlock, h00.a<vz.b0> invalidateParentLayer) {
        kotlin.jvm.internal.s.g(drawBlock, "drawBlock");
        kotlin.jvm.internal.s.g(invalidateParentLayer, "invalidateParentLayer");
        k(false);
        this.f2981f = false;
        this.f2982g = false;
        this.f2986k = t1.h1.f51446b.a();
        this.f2977b = drawBlock;
        this.f2978c = invalidateParentLayer;
    }

    @Override // h2.e0
    public void g(s1.d rect, boolean z11) {
        kotlin.jvm.internal.s.g(rect, "rect");
        if (z11) {
            float[] a11 = this.f2984i.a(this.f2987l);
            if (a11 == null) {
                rect.g(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                return;
            } else {
                t1.k0.d(a11, rect);
                return;
            }
        }
        t1.k0.d(this.f2984i.b(this.f2987l), rect);
    }

    @Override // h2.e0
    public void h(long j11) {
        int p11 = this.f2987l.p();
        int x11 = this.f2987l.x();
        int h11 = x2.k.h(j11);
        int i11 = x2.k.i(j11);
        if (p11 == h11 && x11 == i11) {
            return;
        }
        this.f2987l.B(h11 - p11);
        this.f2987l.u(i11 - x11);
        l();
        this.f2984i.c();
    }

    @Override // h2.e0
    public void i() {
        if (this.f2979d || !this.f2987l.v()) {
            k(false);
            t1.q0 b11 = (!this.f2987l.y() || this.f2980e.d()) ? null : this.f2980e.b();
            h00.l<? super t1.u, vz.b0> lVar = this.f2977b;
            if (lVar == null) {
                return;
            }
            this.f2987l.I(this.f2985j, b11, lVar);
        }
    }

    @Override // h2.e0
    public void invalidate() {
        if (this.f2979d || this.f2981f) {
            return;
        }
        this.f2976a.invalidate();
        k(true);
    }
}