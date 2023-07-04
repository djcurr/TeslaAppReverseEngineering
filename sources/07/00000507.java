package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class z1 extends View implements h2.e0 {

    /* renamed from: m  reason: collision with root package name */
    public static final c f3176m = new c(null);

    /* renamed from: n  reason: collision with root package name */
    private static final h00.p<View, Matrix, vz.b0> f3177n = b.f3195a;

    /* renamed from: o  reason: collision with root package name */
    private static final ViewOutlineProvider f3178o = new a();

    /* renamed from: p  reason: collision with root package name */
    private static Method f3179p;

    /* renamed from: q  reason: collision with root package name */
    private static Field f3180q;

    /* renamed from: t  reason: collision with root package name */
    private static boolean f3181t;

    /* renamed from: w  reason: collision with root package name */
    private static boolean f3182w;

    /* renamed from: a  reason: collision with root package name */
    private final AndroidComposeView f3183a;

    /* renamed from: b  reason: collision with root package name */
    private final s0 f3184b;

    /* renamed from: c  reason: collision with root package name */
    private h00.l<? super t1.u, vz.b0> f3185c;

    /* renamed from: d  reason: collision with root package name */
    private h00.a<vz.b0> f3186d;

    /* renamed from: e  reason: collision with root package name */
    private final f1 f3187e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3188f;

    /* renamed from: g  reason: collision with root package name */
    private Rect f3189g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3190h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3191i;

    /* renamed from: j  reason: collision with root package name */
    private final t1.v f3192j;

    /* renamed from: k  reason: collision with root package name */
    private final c1<View> f3193k;

    /* renamed from: l  reason: collision with root package name */
    private long f3194l;

    /* loaded from: classes.dex */
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            kotlin.jvm.internal.s.g(view, "view");
            kotlin.jvm.internal.s.g(outline, "outline");
            Outline c11 = ((z1) view).f3187e.c();
            kotlin.jvm.internal.s.e(c11);
            outline.set(c11);
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.p<View, Matrix, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f3195a = new b();

        b() {
            super(2);
        }

        public final void a(View view, Matrix matrix) {
            kotlin.jvm.internal.s.g(view, "view");
            kotlin.jvm.internal.s.g(matrix, "matrix");
            matrix.set(view.getMatrix());
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(View view, Matrix matrix) {
            a(view, matrix);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return z1.f3181t;
        }

        public final boolean b() {
            return z1.f3182w;
        }

        public final void c(boolean z11) {
            z1.f3182w = z11;
        }

        public final void d(View view) {
            kotlin.jvm.internal.s.g(view, "view");
            try {
                if (!a()) {
                    z1.f3181t = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        z1.f3179p = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                        z1.f3180q = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        z1.f3179p = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        z1.f3180q = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = z1.f3179p;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = z1.f3180q;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = z1.f3180q;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = z1.f3179p;
                if (method2 == null) {
                    return;
                }
                method2.invoke(view, new Object[0]);
            } catch (Throwable unused) {
                c(true);
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3196a = new a(null);

        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final long a(View view) {
                kotlin.jvm.internal.s.g(view, "view");
                return view.getUniqueDrawingId();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(AndroidComposeView ownerView, s0 container, h00.l<? super t1.u, vz.b0> drawBlock, h00.a<vz.b0> invalidateParentLayer) {
        super(ownerView.getContext());
        kotlin.jvm.internal.s.g(ownerView, "ownerView");
        kotlin.jvm.internal.s.g(container, "container");
        kotlin.jvm.internal.s.g(drawBlock, "drawBlock");
        kotlin.jvm.internal.s.g(invalidateParentLayer, "invalidateParentLayer");
        this.f3183a = ownerView;
        this.f3184b = container;
        this.f3185c = drawBlock;
        this.f3186d = invalidateParentLayer;
        this.f3187e = new f1(ownerView.getDensity());
        this.f3192j = new t1.v();
        this.f3193k = new c1<>(f3177n);
        this.f3194l = t1.h1.f51446b.a();
        setWillNotDraw(false);
        setId(View.generateViewId());
        container.addView(this);
    }

    private final t1.q0 getManualClipPath() {
        if (!getClipToOutline() || this.f3187e.d()) {
            return null;
        }
        return this.f3187e.b();
    }

    private final void setInvalidated(boolean z11) {
        if (z11 != this.f3190h) {
            this.f3190h = z11;
            this.f3183a.U(this, z11);
        }
    }

    private final void t() {
        Rect rect;
        if (this.f3188f) {
            Rect rect2 = this.f3189g;
            if (rect2 == null) {
                this.f3189g = new Rect(0, 0, getWidth(), getHeight());
            } else {
                kotlin.jvm.internal.s.e(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f3189g;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void u() {
        setOutlineProvider(this.f3187e.c() != null ? f3178o : null);
    }

    @Override // h2.e0
    public void a(t1.u canvas) {
        kotlin.jvm.internal.s.g(canvas, "canvas");
        boolean z11 = getElevation() > BitmapDescriptorFactory.HUE_RED;
        this.f3191i = z11;
        if (z11) {
            canvas.i();
        }
        this.f3184b.a(canvas, this, getDrawingTime());
        if (this.f3191i) {
            canvas.n();
        }
    }

    @Override // h2.e0
    public long b(long j11, boolean z11) {
        if (z11) {
            float[] a11 = this.f3193k.a(this);
            s1.f d11 = a11 == null ? null : s1.f.d(t1.k0.c(a11, j11));
            return d11 == null ? s1.f.f49950b.a() : d11.t();
        }
        return t1.k0.c(this.f3193k.b(this), j11);
    }

    @Override // h2.e0
    public void c(long j11) {
        int g11 = x2.o.g(j11);
        int f11 = x2.o.f(j11);
        if (g11 == getWidth() && f11 == getHeight()) {
            return;
        }
        float f12 = g11;
        setPivotX(t1.h1.f(this.f3194l) * f12);
        float f13 = f11;
        setPivotY(t1.h1.g(this.f3194l) * f13);
        this.f3187e.h(s1.m.a(f12, f13));
        u();
        layout(getLeft(), getTop(), getLeft() + g11, getTop() + f11);
        t();
        this.f3193k.c();
    }

    @Override // h2.e0
    public void d(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, long j11, t1.c1 shape, boolean z11, t1.x0 x0Var, x2.q layoutDirection, x2.d density) {
        h00.a<vz.b0> aVar;
        kotlin.jvm.internal.s.g(shape, "shape");
        kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.s.g(density, "density");
        this.f3194l = j11;
        setScaleX(f11);
        setScaleY(f12);
        setAlpha(f13);
        setTranslationX(f14);
        setTranslationY(f15);
        setElevation(f16);
        setRotation(f19);
        setRotationX(f17);
        setRotationY(f18);
        setPivotX(t1.h1.f(this.f3194l) * getWidth());
        setPivotY(t1.h1.g(this.f3194l) * getHeight());
        setCameraDistancePx(f21);
        this.f3188f = z11 && shape == t1.w0.a();
        t();
        boolean z12 = getManualClipPath() != null;
        setClipToOutline(z11 && shape != t1.w0.a());
        boolean g11 = this.f3187e.g(shape, getAlpha(), getClipToOutline(), getElevation(), layoutDirection, density);
        u();
        boolean z13 = getManualClipPath() != null;
        if (z12 != z13 || (z13 && g11)) {
            invalidate();
        }
        if (!this.f3191i && getElevation() > BitmapDescriptorFactory.HUE_RED && (aVar = this.f3186d) != null) {
            aVar.mo11invoke();
        }
        this.f3193k.c();
        if (Build.VERSION.SDK_INT >= 31) {
            b2.f2851a.a(this, x0Var);
        }
    }

    @Override // h2.e0
    public void destroy() {
        setInvalidated(false);
        this.f3183a.b0();
        this.f3185c = null;
        this.f3186d = null;
        boolean a02 = this.f3183a.a0(this);
        if (Build.VERSION.SDK_INT < 23 && !f3182w && a02) {
            setVisibility(8);
        } else {
            this.f3184b.removeViewInLayout(this);
        }
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.s.g(canvas, "canvas");
        boolean z11 = false;
        setInvalidated(false);
        t1.v vVar = this.f3192j;
        Canvas w11 = vVar.a().w();
        vVar.a().y(canvas);
        t1.b a11 = vVar.a();
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            z11 = true;
            a11.m();
            this.f3187e.a(a11);
        }
        h00.l<? super t1.u, vz.b0> lVar = this.f3185c;
        if (lVar != null) {
            lVar.mo12invoke(a11);
        }
        if (z11) {
            a11.h();
        }
        vVar.a().y(w11);
    }

    @Override // h2.e0
    public boolean e(long j11) {
        float l11 = s1.f.l(j11);
        float m11 = s1.f.m(j11);
        if (this.f3188f) {
            return BitmapDescriptorFactory.HUE_RED <= l11 && l11 < ((float) getWidth()) && BitmapDescriptorFactory.HUE_RED <= m11 && m11 < ((float) getHeight());
        } else if (getClipToOutline()) {
            return this.f3187e.e(j11);
        } else {
            return true;
        }
    }

    @Override // h2.e0
    public void f(h00.l<? super t1.u, vz.b0> drawBlock, h00.a<vz.b0> invalidateParentLayer) {
        kotlin.jvm.internal.s.g(drawBlock, "drawBlock");
        kotlin.jvm.internal.s.g(invalidateParentLayer, "invalidateParentLayer");
        if (Build.VERSION.SDK_INT < 23 && !f3182w) {
            setVisibility(0);
        } else {
            this.f3184b.addView(this);
        }
        this.f3188f = false;
        this.f3191i = false;
        this.f3194l = t1.h1.f51446b.a();
        this.f3185c = drawBlock;
        this.f3186d = invalidateParentLayer;
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // h2.e0
    public void g(s1.d rect, boolean z11) {
        kotlin.jvm.internal.s.g(rect, "rect");
        if (z11) {
            float[] a11 = this.f3193k.a(this);
            if (a11 != null) {
                t1.k0.d(a11, rect);
                return;
            } else {
                rect.g(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                return;
            }
        }
        t1.k0.d(this.f3193k.b(this), rect);
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final s0 getContainer() {
        return this.f3184b;
    }

    public long getLayerId() {
        return getId();
    }

    public final AndroidComposeView getOwnerView() {
        return this.f3183a;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return d.f3196a.a(this.f3183a);
        }
        return -1L;
    }

    @Override // h2.e0
    public void h(long j11) {
        int h11 = x2.k.h(j11);
        if (h11 != getLeft()) {
            offsetLeftAndRight(h11 - getLeft());
            this.f3193k.c();
        }
        int i11 = x2.k.i(j11);
        if (i11 != getTop()) {
            offsetTopAndBottom(i11 - getTop());
            this.f3193k.c();
        }
    }

    @Override // h2.e0
    public void i() {
        if (!this.f3190h || f3182w) {
            return;
        }
        setInvalidated(false);
        f3176m.d(this);
    }

    @Override // android.view.View, h2.e0
    public void invalidate() {
        if (this.f3190h) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f3183a.invalidate();
    }

    @Override // android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }

    public final boolean s() {
        return this.f3190h;
    }

    public final void setCameraDistancePx(float f11) {
        setCameraDistance(f11 * getResources().getDisplayMetrics().densityDpi);
    }
}