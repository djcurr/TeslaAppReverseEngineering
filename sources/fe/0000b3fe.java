package t1;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.b0;
import f2.m0;
import f2.v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o1.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d1 extends androidx.compose.ui.platform.z0 implements f2.v {

    /* renamed from: b  reason: collision with root package name */
    private final float f51392b;

    /* renamed from: c  reason: collision with root package name */
    private final float f51393c;

    /* renamed from: d  reason: collision with root package name */
    private final float f51394d;

    /* renamed from: e  reason: collision with root package name */
    private final float f51395e;

    /* renamed from: f  reason: collision with root package name */
    private final float f51396f;

    /* renamed from: g  reason: collision with root package name */
    private final float f51397g;

    /* renamed from: h  reason: collision with root package name */
    private final float f51398h;

    /* renamed from: i  reason: collision with root package name */
    private final float f51399i;

    /* renamed from: j  reason: collision with root package name */
    private final float f51400j;

    /* renamed from: k  reason: collision with root package name */
    private final float f51401k;

    /* renamed from: l  reason: collision with root package name */
    private final long f51402l;

    /* renamed from: m  reason: collision with root package name */
    private final c1 f51403m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f51404n;

    /* renamed from: o  reason: collision with root package name */
    private final x0 f51405o;

    /* renamed from: p  reason: collision with root package name */
    private final h00.l<g0, vz.b0> f51406p;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<g0, vz.b0> {
        a() {
            super(1);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(g0 g0Var) {
            invoke2(g0Var);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(g0 g0Var) {
            kotlin.jvm.internal.s.g(g0Var, "$this$null");
            g0Var.f(d1.this.f51392b);
            g0Var.m(d1.this.f51393c);
            g0Var.b(d1.this.f51394d);
            g0Var.n(d1.this.f51395e);
            g0Var.d(d1.this.f51396f);
            g0Var.Q(d1.this.f51397g);
            g0Var.j(d1.this.f51398h);
            g0Var.k(d1.this.f51399i);
            g0Var.l(d1.this.f51400j);
            g0Var.i(d1.this.f51401k);
            g0Var.H(d1.this.f51402l);
            g0Var.x(d1.this.f51403m);
            g0Var.B(d1.this.f51404n);
            g0Var.g(d1.this.f51405o);
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<m0.a, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f2.m0 f51408a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d1 f51409b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f2.m0 m0Var, d1 d1Var) {
            super(1);
            this.f51408a = m0Var;
            this.f51409b = d1Var;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(m0.a aVar) {
            invoke2(aVar);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a layout) {
            kotlin.jvm.internal.s.g(layout, "$this$layout");
            m0.a.v(layout, this.f51408a, 0, 0, BitmapDescriptorFactory.HUE_RED, this.f51409b.f51406p, 4, null);
        }
    }

    private d1(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, long j11, c1 c1Var, boolean z11, x0 x0Var, h00.l<? super androidx.compose.ui.platform.y0, vz.b0> lVar) {
        super(lVar);
        this.f51392b = f11;
        this.f51393c = f12;
        this.f51394d = f13;
        this.f51395e = f14;
        this.f51396f = f15;
        this.f51397g = f16;
        this.f51398h = f17;
        this.f51399i = f18;
        this.f51400j = f19;
        this.f51401k = f21;
        this.f51402l = j11;
        this.f51403m = c1Var;
        this.f51404n = z11;
        this.f51406p = new a();
    }

    public /* synthetic */ d1(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, long j11, c1 c1Var, boolean z11, x0 x0Var, h00.l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, f13, f14, f15, f16, f17, f18, f19, f21, j11, c1Var, z11, x0Var, lVar);
    }

    @Override // o1.f
    public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
        return (R) v.a.b(this, r11, pVar);
    }

    @Override // f2.v
    public int L(f2.k kVar, f2.j jVar, int i11) {
        return v.a.d(this, kVar, jVar, i11);
    }

    @Override // f2.v
    public int S(f2.k kVar, f2.j jVar, int i11) {
        return v.a.f(this, kVar, jVar, i11);
    }

    @Override // f2.v
    public f2.a0 Z(f2.b0 receiver, f2.y measurable, long j11) {
        kotlin.jvm.internal.s.g(receiver, "$receiver");
        kotlin.jvm.internal.s.g(measurable, "measurable");
        f2.m0 X = measurable.X(j11);
        return b0.a.b(receiver, X.B0(), X.w0(), null, new b(X, this), 4, null);
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) v.a.c(this, r11, pVar);
    }

    public boolean equals(Object obj) {
        d1 d1Var = obj instanceof d1 ? (d1) obj : null;
        if (d1Var == null) {
            return false;
        }
        if (this.f51392b == d1Var.f51392b) {
            if (this.f51393c == d1Var.f51393c) {
                if (this.f51394d == d1Var.f51394d) {
                    if (this.f51395e == d1Var.f51395e) {
                        if (this.f51396f == d1Var.f51396f) {
                            if (this.f51397g == d1Var.f51397g) {
                                if (this.f51398h == d1Var.f51398h) {
                                    if (this.f51399i == d1Var.f51399i) {
                                        if (this.f51400j == d1Var.f51400j) {
                                            return ((this.f51401k > d1Var.f51401k ? 1 : (this.f51401k == d1Var.f51401k ? 0 : -1)) == 0) && h1.e(this.f51402l, d1Var.f51402l) && kotlin.jvm.internal.s.c(this.f51403m, d1Var.f51403m) && this.f51404n == d1Var.f51404n && kotlin.jvm.internal.s.c(this.f51405o, d1Var.f51405o);
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // o1.f
    public o1.f g0(o1.f fVar) {
        return v.a.h(this, fVar);
    }

    @Override // f2.v
    public int h0(f2.k kVar, f2.j jVar, int i11) {
        return v.a.e(this, kVar, jVar, i11);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((Float.hashCode(this.f51392b) * 31) + Float.hashCode(this.f51393c)) * 31) + Float.hashCode(this.f51394d)) * 31) + Float.hashCode(this.f51395e)) * 31) + Float.hashCode(this.f51396f)) * 31) + Float.hashCode(this.f51397g)) * 31) + Float.hashCode(this.f51398h)) * 31) + Float.hashCode(this.f51399i)) * 31) + Float.hashCode(this.f51400j)) * 31) + Float.hashCode(this.f51401k)) * 31) + h1.h(this.f51402l)) * 31) + this.f51403m.hashCode()) * 31) + Boolean.hashCode(this.f51404n)) * 31) + 0;
    }

    @Override // o1.f
    public boolean p(h00.l<? super f.c, Boolean> lVar) {
        return v.a.a(this, lVar);
    }

    @Override // f2.v
    public int t(f2.k kVar, f2.j jVar, int i11) {
        return v.a.g(this, kVar, jVar, i11);
    }

    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.f51392b + ", scaleY=" + this.f51393c + ", alpha = " + this.f51394d + ", translationX=" + this.f51395e + ", translationY=" + this.f51396f + ", shadowElevation=" + this.f51397g + ", rotationX=" + this.f51398h + ", rotationY=" + this.f51399i + ", rotationZ=" + this.f51400j + ", cameraDistance=" + this.f51401k + ", transformOrigin=" + ((Object) h1.i(this.f51402l)) + ", shape=" + this.f51403m + ", clip=" + this.f51404n + ", renderEffect=" + this.f51405o + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}