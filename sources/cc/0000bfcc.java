package xr;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.gesturehandler.GestureHandler;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class f {

    /* renamed from: o  reason: collision with root package name */
    public static final a f57653o = new a(null);

    /* renamed from: p  reason: collision with root package name */
    private static final PointF f57654p = new PointF();

    /* renamed from: q  reason: collision with root package name */
    private static final float[] f57655q = new float[2];

    /* renamed from: r  reason: collision with root package name */
    private static final Matrix f57656r = new Matrix();

    /* renamed from: s  reason: collision with root package name */
    private static final float[] f57657s = new float[2];

    /* renamed from: t  reason: collision with root package name */
    private static final Comparator<GestureHandler<?>> f57658t = new Comparator() { // from class: xr.e
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int o11;
            o11 = f.o((GestureHandler) obj, (GestureHandler) obj2);
            return o11;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f57659a;

    /* renamed from: b  reason: collision with root package name */
    private final g f57660b;

    /* renamed from: c  reason: collision with root package name */
    private final o f57661c;

    /* renamed from: d  reason: collision with root package name */
    private float f57662d;

    /* renamed from: e  reason: collision with root package name */
    private final GestureHandler<?>[] f57663e;

    /* renamed from: f  reason: collision with root package name */
    private final GestureHandler<?>[] f57664f;

    /* renamed from: g  reason: collision with root package name */
    private final GestureHandler<?>[] f57665g;

    /* renamed from: h  reason: collision with root package name */
    private final GestureHandler<?>[] f57666h;

    /* renamed from: i  reason: collision with root package name */
    private int f57667i;

    /* renamed from: j  reason: collision with root package name */
    private int f57668j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f57669k;

    /* renamed from: l  reason: collision with root package name */
    private int f57670l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f57671m;

    /* renamed from: n  reason: collision with root package name */
    private int f57672n;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean g(GestureHandler<?> gestureHandler, GestureHandler<?> gestureHandler2) {
            return gestureHandler == gestureHandler2 || gestureHandler.A0(gestureHandler2) || gestureHandler2.A0(gestureHandler);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean h(int i11) {
            return i11 == 3 || i11 == 1 || i11 == 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean i(float f11, float f12, View view) {
            if (BitmapDescriptorFactory.HUE_RED <= f11 && f11 <= ((float) view.getWidth())) {
                if (BitmapDescriptorFactory.HUE_RED <= f12 && f12 <= ((float) view.getHeight())) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean j(GestureHandler<?> gestureHandler, GestureHandler<?> gestureHandler2) {
            if (gestureHandler.U(gestureHandler2) && !g(gestureHandler, gestureHandler2)) {
                if (gestureHandler == gestureHandler2 || !(gestureHandler.W() || gestureHandler.M() == 4)) {
                    return true;
                }
                return gestureHandler.z0(gestureHandler2);
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k(GestureHandler<?> gestureHandler, GestureHandler<?> gestureHandler2) {
            return gestureHandler != gestureHandler2 && (gestureHandler.C0(gestureHandler2) || gestureHandler2.B0(gestureHandler));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean l(View view, float[] fArr) {
            return (!(view instanceof ViewGroup) || view.getBackground() != null) && i(fArr[0], fArr[1], view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void m(float f11, float f12, ViewGroup viewGroup, View view, PointF pointF) {
            float scrollX = (f11 + viewGroup.getScrollX()) - view.getLeft();
            float scrollY = (f12 + viewGroup.getScrollY()) - view.getTop();
            Matrix matrix = view.getMatrix();
            if (!matrix.isIdentity()) {
                float[] fArr = f.f57655q;
                fArr[0] = scrollX;
                fArr[1] = scrollY;
                matrix.invert(f.f57656r);
                f.f57656r.mapPoints(fArr);
                float f13 = fArr[0];
                scrollY = fArr[1];
                scrollX = f13;
            }
            pointF.set(scrollX, scrollY);
        }
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f57673a;

        static {
            int[] iArr = new int[com.swmansion.gesturehandler.e.values().length];
            iArr[com.swmansion.gesturehandler.e.NONE.ordinal()] = 1;
            iArr[com.swmansion.gesturehandler.e.BOX_ONLY.ordinal()] = 2;
            iArr[com.swmansion.gesturehandler.e.BOX_NONE.ordinal()] = 3;
            iArr[com.swmansion.gesturehandler.e.AUTO.ordinal()] = 4;
            f57673a = iArr;
        }
    }

    public f(ViewGroup wrapperView, g handlerRegistry, o viewConfigHelper) {
        s.g(wrapperView, "wrapperView");
        s.g(handlerRegistry, "handlerRegistry");
        s.g(viewConfigHelper, "viewConfigHelper");
        this.f57659a = wrapperView;
        this.f57660b = handlerRegistry;
        this.f57661c = viewConfigHelper;
        this.f57663e = new GestureHandler[20];
        this.f57664f = new GestureHandler[20];
        this.f57665g = new GestureHandler[20];
        this.f57666h = new GestureHandler[20];
    }

    private final boolean A(View view, float[] fArr, int i11) {
        int i12 = b.f57673a[this.f57661c.a(view).ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    boolean n11 = view instanceof ViewGroup ? n((ViewGroup) view, fArr, i11) : false;
                    if (x(view, fArr, i11) || n11 || f57653o.l(view, fArr)) {
                        return true;
                    }
                } else if (view instanceof ViewGroup) {
                    return n((ViewGroup) view, fArr, i11);
                }
            } else if (x(view, fArr, i11) || f57653o.l(view, fArr)) {
                return true;
            }
        }
        return false;
    }

    private final void B(GestureHandler<?> gestureHandler) {
        if (p(gestureHandler)) {
            d(gestureHandler);
            return;
        }
        t(gestureHandler);
        gestureHandler.n0(false);
    }

    private final void d(GestureHandler<?> gestureHandler) {
        int i11 = this.f57668j;
        if (i11 > 0) {
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                if (this.f57664f[i12] == gestureHandler) {
                    return;
                }
                if (i13 >= i11) {
                    break;
                }
                i12 = i13;
            }
        }
        int i14 = this.f57668j;
        GestureHandler<?>[] gestureHandlerArr = this.f57664f;
        if (i14 < gestureHandlerArr.length) {
            this.f57668j = i14 + 1;
            gestureHandlerArr[i14] = gestureHandler;
            gestureHandler.n0(true);
            int i15 = this.f57672n;
            this.f57672n = i15 + 1;
            gestureHandler.l0(i15);
            return;
        }
        throw new IllegalStateException("Too many recognizers".toString());
    }

    private final boolean e(View view) {
        return view.getVisibility() == 0 && view.getAlpha() >= this.f57662d;
    }

    private final void f() {
        int i11 = this.f57668j - 1;
        if (i11 >= 0) {
            while (true) {
                int i12 = i11 - 1;
                GestureHandler<?> gestureHandler = this.f57664f[i11];
                s.e(gestureHandler);
                gestureHandler.o();
                if (i12 < 0) {
                    break;
                }
                i11 = i12;
            }
        }
        int i13 = this.f57667i;
        int i14 = 0;
        if (i13 > 0) {
            while (true) {
                int i15 = i14 + 1;
                this.f57665g[i14] = this.f57663e[i14];
                if (i15 >= i13) {
                    break;
                }
                i14 = i15;
            }
        }
        int i16 = i13 - 1;
        if (i16 < 0) {
            return;
        }
        while (true) {
            int i17 = i16 - 1;
            GestureHandler<?> gestureHandler2 = this.f57665g[i16];
            s.e(gestureHandler2);
            gestureHandler2.o();
            if (i17 < 0) {
                return;
            }
            i16 = i17;
        }
    }

    private final void g() {
        GestureHandler<?>[] gestureHandlerArr = this.f57664f;
        int i11 = this.f57668j;
        int i12 = 0;
        if (i11 > 0) {
            int i13 = 0;
            while (true) {
                int i14 = i12 + 1;
                GestureHandler<?> gestureHandler = gestureHandlerArr[i12];
                s.e(gestureHandler);
                if (gestureHandler.W()) {
                    gestureHandlerArr[i13] = gestureHandlerArr[i12];
                    i13++;
                }
                if (i14 >= i11) {
                    break;
                }
                i12 = i14;
            }
            i12 = i13;
        }
        this.f57668j = i12;
    }

    private final void h() {
        int i11;
        int i12 = this.f57667i - 1;
        boolean z11 = false;
        if (i12 >= 0) {
            while (true) {
                int i13 = i12 - 1;
                GestureHandler<?> gestureHandler = this.f57663e[i12];
                s.e(gestureHandler);
                if (f57653o.h(gestureHandler.M()) && !gestureHandler.W()) {
                    this.f57663e[i12] = null;
                    gestureHandler.h0();
                    gestureHandler.m0(false);
                    gestureHandler.n0(false);
                    gestureHandler.l0(Integer.MAX_VALUE);
                    z11 = true;
                }
                if (i13 < 0) {
                    break;
                }
                i12 = i13;
            }
        }
        if (z11) {
            GestureHandler<?>[] gestureHandlerArr = this.f57663e;
            int i14 = this.f57667i;
            if (i14 > 0) {
                int i15 = 0;
                i11 = 0;
                while (true) {
                    int i16 = i15 + 1;
                    if (gestureHandlerArr[i15] != null) {
                        gestureHandlerArr[i11] = gestureHandlerArr[i15];
                        i11++;
                    }
                    if (i16 >= i14) {
                        break;
                    }
                    i15 = i16;
                }
            } else {
                i11 = 0;
            }
            this.f57667i = i11;
        }
        this.f57671m = false;
    }

    private final void i(GestureHandler<?> gestureHandler, MotionEvent motionEvent) {
        if (!r(gestureHandler.R())) {
            gestureHandler.o();
        } else if (gestureHandler.G0()) {
            int actionMasked = motionEvent.getActionMasked();
            float[] fArr = f57657s;
            l(gestureHandler.R(), motionEvent, fArr);
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            motionEvent.setLocation(fArr[0], fArr[1]);
            if (gestureHandler.J() && gestureHandler.M() != 0) {
                gestureHandler.F0(motionEvent);
            }
            if (!gestureHandler.W() || actionMasked != 2) {
                boolean z11 = gestureHandler.M() == 0;
                gestureHandler.T(motionEvent);
                if (gestureHandler.V()) {
                    if (gestureHandler.L()) {
                        gestureHandler.w0(false);
                        gestureHandler.j0();
                    }
                    gestureHandler.t(motionEvent);
                }
                if (gestureHandler.J() && z11) {
                    gestureHandler.F0(motionEvent);
                }
                if (actionMasked == 1 || actionMasked == 6) {
                    gestureHandler.E0(motionEvent.getPointerId(motionEvent.getActionIndex()));
                }
            }
            motionEvent.setLocation(x11, y11);
        }
    }

    private final void j(MotionEvent motionEvent) {
        int i11 = this.f57667i;
        int i12 = 0;
        wz.l.k(this.f57663e, this.f57665g, 0, 0, i11);
        wz.o.z(this.f57665g, f57658t, 0, i11);
        if (i11 <= 0) {
            return;
        }
        while (true) {
            int i13 = i12 + 1;
            GestureHandler<?> gestureHandler = this.f57665g[i12];
            s.e(gestureHandler);
            i(gestureHandler, motionEvent);
            if (i13 >= i11) {
                return;
            }
            i12 = i13;
        }
    }

    private final boolean k(View view, float[] fArr, int i11) {
        boolean z11 = false;
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                ArrayList<GestureHandler<?>> a11 = this.f57660b.a((View) parent);
                if (a11 != null) {
                    Iterator<GestureHandler<?>> it2 = a11.iterator();
                    while (it2.hasNext()) {
                        GestureHandler<?> handler = it2.next();
                        if (handler.X() && handler.Z(view, fArr[0], fArr[1])) {
                            s.f(handler, "handler");
                            w(handler, viewGroup);
                            handler.D0(i11);
                            z11 = true;
                        }
                    }
                }
            }
        }
        return z11;
    }

    private final void l(View view, MotionEvent motionEvent, float[] fArr) {
        if (view == this.f57659a) {
            fArr[0] = motionEvent.getX();
            fArr[1] = motionEvent.getY();
            return;
        }
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ViewParent parent = view.getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            l(viewGroup, motionEvent, fArr);
            PointF pointF = f57654p;
            f57653o.m(fArr[0], fArr[1], viewGroup, view, pointF);
            fArr[0] = pointF.x;
            fArr[1] = pointF.y;
            return;
        }
        throw new IllegalArgumentException("Parent is null? View is no longer in the tree".toString());
    }

    private final void m(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float[] fArr = f57657s;
        fArr[0] = motionEvent.getX(actionIndex);
        fArr[1] = motionEvent.getY(actionIndex);
        A(this.f57659a, fArr, pointerId);
        n(this.f57659a, fArr, pointerId);
    }

    private final boolean n(ViewGroup viewGroup, float[] fArr, int i11) {
        int childCount = viewGroup.getChildCount() - 1;
        if (childCount >= 0) {
            while (true) {
                int i12 = childCount - 1;
                View c11 = this.f57661c.c(viewGroup, childCount);
                if (e(c11)) {
                    PointF pointF = f57654p;
                    a aVar = f57653o;
                    aVar.m(fArr[0], fArr[1], viewGroup, c11, pointF);
                    float f11 = fArr[0];
                    float f12 = fArr[1];
                    fArr[0] = pointF.x;
                    fArr[1] = pointF.y;
                    boolean A = (!q(c11) || aVar.i(fArr[0], fArr[1], c11)) ? A(c11, fArr, i11) : false;
                    fArr[0] = f11;
                    fArr[1] = f12;
                    if (A) {
                        return true;
                    }
                }
                if (i12 < 0) {
                    break;
                }
                childCount = i12;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(GestureHandler gestureHandler, GestureHandler gestureHandler2) {
        if ((gestureHandler.V() && gestureHandler2.V()) || (gestureHandler.W() && gestureHandler2.W())) {
            return Integer.signum(gestureHandler2.D() - gestureHandler.D());
        }
        if (!gestureHandler.V()) {
            if (gestureHandler2.V()) {
                return 1;
            }
            if (!gestureHandler.W()) {
                return gestureHandler2.W() ? 1 : 0;
            }
        }
        return -1;
    }

    private final boolean p(GestureHandler<?> gestureHandler) {
        int i11 = this.f57667i;
        if (i11 > 0) {
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                GestureHandler<?> gestureHandler2 = this.f57663e[i12];
                s.e(gestureHandler2);
                a aVar = f57653o;
                if (!aVar.h(gestureHandler2.M()) && aVar.k(gestureHandler, gestureHandler2)) {
                    return true;
                }
                if (i13 >= i11) {
                    break;
                }
                i12 = i13;
            }
        }
        return false;
    }

    private final boolean q(View view) {
        return !(view instanceof ViewGroup) || this.f57661c.b((ViewGroup) view);
    }

    private final boolean r(View view) {
        if (view == null) {
            return false;
        }
        if (view == this.f57659a) {
            return true;
        }
        ViewParent parent = view.getParent();
        while (parent != null && parent != this.f57659a) {
            parent = parent.getParent();
        }
        return parent == this.f57659a;
    }

    private final boolean s(View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return false;
        }
        Matrix matrix = view.getMatrix();
        float[] fArr = f57655q;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        float left = fArr[0] + view.getLeft();
        float top = fArr[1] + view.getTop();
        return left < BitmapDescriptorFactory.HUE_RED || left + ((float) view.getWidth()) > ((float) viewGroup.getWidth()) || top < BitmapDescriptorFactory.HUE_RED || top + ((float) view.getHeight()) > ((float) viewGroup.getHeight());
    }

    private final void t(GestureHandler<?> gestureHandler) {
        int i11;
        int M = gestureHandler.M();
        gestureHandler.n0(false);
        gestureHandler.m0(true);
        gestureHandler.w0(true);
        int i12 = this.f57672n;
        this.f57672n = i12 + 1;
        gestureHandler.l0(i12);
        int i13 = this.f57667i;
        if (i13 > 0) {
            int i14 = 0;
            i11 = 0;
            while (true) {
                int i15 = i14 + 1;
                GestureHandler<?> gestureHandler2 = this.f57663e[i14];
                s.e(gestureHandler2);
                if (f57653o.j(gestureHandler2, gestureHandler)) {
                    this.f57666h[i11] = gestureHandler2;
                    i11++;
                }
                if (i15 >= i13) {
                    break;
                }
                i14 = i15;
            }
        } else {
            i11 = 0;
        }
        int i16 = i11 - 1;
        if (i16 >= 0) {
            while (true) {
                int i17 = i16 - 1;
                GestureHandler<?> gestureHandler3 = this.f57666h[i16];
                s.e(gestureHandler3);
                gestureHandler3.o();
                if (i17 < 0) {
                    break;
                }
                i16 = i17;
            }
        }
        int i18 = this.f57668j - 1;
        if (i18 >= 0) {
            while (true) {
                int i19 = i18 - 1;
                GestureHandler<?> gestureHandler4 = this.f57664f[i18];
                s.e(gestureHandler4);
                if (f57653o.j(gestureHandler4, gestureHandler)) {
                    gestureHandler4.o();
                    gestureHandler4.n0(false);
                }
                if (i19 < 0) {
                    break;
                }
                i18 = i19;
            }
        }
        g();
        gestureHandler.u(4, 2);
        if (M != 4) {
            gestureHandler.u(5, 4);
            if (M != 5) {
                gestureHandler.u(0, 5);
            }
        }
    }

    private final void w(GestureHandler<?> gestureHandler, View view) {
        int i11 = this.f57667i;
        if (i11 > 0) {
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                if (this.f57663e[i12] == gestureHandler) {
                    return;
                }
                if (i13 >= i11) {
                    break;
                }
                i12 = i13;
            }
        }
        int i14 = this.f57667i;
        GestureHandler<?>[] gestureHandlerArr = this.f57663e;
        if (i14 < gestureHandlerArr.length) {
            this.f57667i = i14 + 1;
            gestureHandlerArr[i14] = gestureHandler;
            gestureHandler.m0(false);
            gestureHandler.n0(false);
            gestureHandler.l0(Integer.MAX_VALUE);
            gestureHandler.g0(view, this);
            return;
        }
        throw new IllegalStateException("Too many recognizers".toString());
    }

    private final boolean x(View view, float[] fArr, int i11) {
        int size;
        boolean z11;
        ArrayList<GestureHandler<?>> a11 = this.f57660b.a(view);
        boolean z12 = false;
        if (a11 != null && (size = a11.size()) > 0) {
            int i12 = 0;
            z11 = false;
            while (true) {
                int i13 = i12 + 1;
                GestureHandler<?> gestureHandler = a11.get(i12);
                s.f(gestureHandler, "it[i]");
                GestureHandler<?> gestureHandler2 = gestureHandler;
                if (gestureHandler2.X() && gestureHandler2.Z(view, fArr[0], fArr[1])) {
                    w(gestureHandler2, view);
                    gestureHandler2.D0(i11);
                    z11 = true;
                }
                if (i13 >= size) {
                    break;
                }
                i12 = i13;
            }
        } else {
            z11 = false;
        }
        float width = view.getWidth();
        float f11 = fArr[0];
        if (BitmapDescriptorFactory.HUE_RED <= f11 && f11 <= width) {
            float height = view.getHeight();
            float f12 = fArr[1];
            if (BitmapDescriptorFactory.HUE_RED <= f12 && f12 <= height) {
                z12 = true;
            }
            if (z12 && s(view) && k(view, fArr, i11)) {
                return true;
            }
        }
        return z11;
    }

    private final void y() {
        if (!this.f57669k && this.f57670l == 0) {
            h();
        } else {
            this.f57671m = true;
        }
    }

    public final void u(GestureHandler<?> handler, int i11, int i12) {
        s.g(handler, "handler");
        this.f57670l++;
        if (f57653o.h(i11)) {
            int i13 = this.f57668j;
            if (i13 > 0) {
                int i14 = 0;
                while (true) {
                    int i15 = i14 + 1;
                    GestureHandler<?> gestureHandler = this.f57664f[i14];
                    a aVar = f57653o;
                    s.e(gestureHandler);
                    if (aVar.k(gestureHandler, handler)) {
                        if (i11 == 5) {
                            gestureHandler.o();
                            gestureHandler.n0(false);
                        } else {
                            B(gestureHandler);
                        }
                    }
                    if (i15 >= i13) {
                        break;
                    }
                    i14 = i15;
                }
            }
            g();
        }
        if (i11 == 4) {
            B(handler);
        } else if (i12 == 4 || i12 == 5) {
            if (handler.V()) {
                handler.u(i11, i12);
            } else if (i12 == 4) {
                handler.u(i11, 2);
            }
        } else if (i12 != 0 || i11 != 3) {
            handler.u(i11, i12);
        }
        this.f57670l--;
        y();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r1 != 5) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v(android.view.MotionEvent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.s.g(r4, r0)
            r0 = 1
            r3.f57669k = r0
            int r1 = r4.getActionMasked()
            if (r1 == 0) goto L19
            r2 = 3
            if (r1 == r2) goto L15
            r2 = 5
            if (r1 == r2) goto L19
            goto L1c
        L15:
            r3.f()
            goto L1c
        L19:
            r3.m(r4)
        L1c:
            r3.j(r4)
            r4 = 0
            r3.f57669k = r4
            boolean r4 = r3.f57671m
            if (r4 == 0) goto L2d
            int r4 = r3.f57670l
            if (r4 != 0) goto L2d
            r3.h()
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xr.f.v(android.view.MotionEvent):boolean");
    }

    public final void z(float f11) {
        this.f57662d = f11;
    }
}