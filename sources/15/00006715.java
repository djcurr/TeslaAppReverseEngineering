package e4;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.a0;
import androidx.core.view.l0;
import b4.c;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import w3.c;
import w3.f;

/* loaded from: classes.dex */
public class a extends ViewGroup {
    private static boolean Q1;

    /* renamed from: g1  reason: collision with root package name */
    private static final int[] f24594g1 = {16843828};

    /* renamed from: p1  reason: collision with root package name */
    static final int[] f24595p1 = {16842931};

    /* renamed from: x1  reason: collision with root package name */
    static final boolean f24596x1;

    /* renamed from: y1  reason: collision with root package name */
    private static final boolean f24597y1;
    private Drawable A;
    private Drawable B;
    private Drawable C;
    private CharSequence E;
    private CharSequence F;
    private Object G;
    private boolean H;
    private Drawable K;
    private Drawable L;
    private Drawable O;
    private Drawable P;
    private final ArrayList<View> Q;
    private Rect R;
    private Matrix T;

    /* renamed from: a  reason: collision with root package name */
    private final d f24598a;

    /* renamed from: b  reason: collision with root package name */
    private float f24599b;

    /* renamed from: b1  reason: collision with root package name */
    private final w3.f f24600b1;

    /* renamed from: c  reason: collision with root package name */
    private int f24601c;

    /* renamed from: d  reason: collision with root package name */
    private int f24602d;

    /* renamed from: e  reason: collision with root package name */
    private float f24603e;

    /* renamed from: f  reason: collision with root package name */
    private Paint f24604f;

    /* renamed from: g  reason: collision with root package name */
    private final b4.c f24605g;

    /* renamed from: h  reason: collision with root package name */
    private final b4.c f24606h;

    /* renamed from: i  reason: collision with root package name */
    private final h f24607i;

    /* renamed from: j  reason: collision with root package name */
    private final h f24608j;

    /* renamed from: k  reason: collision with root package name */
    private int f24609k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f24610l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f24611m;

    /* renamed from: n  reason: collision with root package name */
    private int f24612n;

    /* renamed from: o  reason: collision with root package name */
    private int f24613o;

    /* renamed from: p  reason: collision with root package name */
    private int f24614p;

    /* renamed from: q  reason: collision with root package name */
    private int f24615q;

    /* renamed from: t  reason: collision with root package name */
    private boolean f24616t;

    /* renamed from: w  reason: collision with root package name */
    private e f24617w;

    /* renamed from: x  reason: collision with root package name */
    private List<e> f24618x;

    /* renamed from: y  reason: collision with root package name */
    private float f24619y;

    /* renamed from: z  reason: collision with root package name */
    private float f24620z;

    /* renamed from: e4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0476a implements w3.f {
        C0476a() {
        }

        @Override // w3.f
        public boolean a(View view, f.a aVar) {
            if (!a.this.C(view) || a.this.r(view) == 2) {
                return false;
            }
            a.this.f(view);
            return true;
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnApplyWindowInsetsListener {
        b(a aVar) {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((a) view).Q(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* loaded from: classes.dex */
    class c extends androidx.core.view.a {

        /* renamed from: a  reason: collision with root package name */
        private final Rect f24622a = new Rect();

        c() {
        }

        private void a(w3.c cVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (a.A(childAt)) {
                    cVar.c(childAt);
                }
            }
        }

        private void b(w3.c cVar, w3.c cVar2) {
            Rect rect = this.f24622a;
            cVar2.n(rect);
            cVar.Z(rect);
            cVar.N0(cVar2.O());
            cVar.v0(cVar2.v());
            cVar.c0(cVar2.p());
            cVar.g0(cVar2.r());
            cVar.k0(cVar2.G());
            cVar.n0(cVar2.I());
            cVar.W(cVar2.C());
            cVar.E0(cVar2.M());
            cVar.a(cVar2.k());
        }

        @Override // androidx.core.view.a
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                List<CharSequence> text = accessibilityEvent.getText();
                View p11 = a.this.p();
                if (p11 != null) {
                    CharSequence s11 = a.this.s(a.this.t(p11));
                    if (s11 != null) {
                        text.add(s11);
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, w3.c cVar) {
            if (a.f24596x1) {
                super.onInitializeAccessibilityNodeInfo(view, cVar);
            } else {
                w3.c R = w3.c.R(cVar);
                super.onInitializeAccessibilityNodeInfo(view, R);
                cVar.G0(view);
                ViewParent L = a0.L(view);
                if (L instanceof View) {
                    cVar.x0((View) L);
                }
                b(cVar, R);
                R.T();
                a(cVar, (ViewGroup) view);
            }
            cVar.c0("androidx.drawerlayout.widget.DrawerLayout");
            cVar.m0(false);
            cVar.n0(false);
            cVar.U(c.a.f55451e);
            cVar.U(c.a.f55452f);
        }

        @Override // androidx.core.view.a
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (a.f24596x1 || a.A(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    static final class d extends androidx.core.view.a {
        d() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, w3.c cVar) {
            super.onInitializeAccessibilityNodeInfo(view, cVar);
            if (a.A(view)) {
                return;
            }
            cVar.x0(null);
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(View view);

        void b(View view);

        void c(int i11);

        void d(View view, float f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class h extends c.AbstractC0147c {

        /* renamed from: a  reason: collision with root package name */
        private final int f24633a;

        /* renamed from: b  reason: collision with root package name */
        private b4.c f24634b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f24635c = new RunnableC0478a();

        /* renamed from: e4.a$h$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0478a implements Runnable {
            RunnableC0478a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.o();
            }
        }

        h(int i11) {
            this.f24633a = i11;
        }

        private void n() {
            View n11 = a.this.n(this.f24633a == 3 ? 5 : 3);
            if (n11 != null) {
                a.this.f(n11);
            }
        }

        @Override // b4.c.AbstractC0147c
        public int a(View view, int i11, int i12) {
            if (a.this.c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i11, 0));
            }
            int width = a.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i11, width));
        }

        @Override // b4.c.AbstractC0147c
        public int b(View view, int i11, int i12) {
            return view.getTop();
        }

        @Override // b4.c.AbstractC0147c
        public int d(View view) {
            if (a.this.D(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // b4.c.AbstractC0147c
        public void f(int i11, int i12) {
            View n11;
            if ((i11 & 1) == 1) {
                n11 = a.this.n(3);
            } else {
                n11 = a.this.n(5);
            }
            if (n11 == null || a.this.r(n11) != 0) {
                return;
            }
            this.f24634b.b(n11, i12);
        }

        @Override // b4.c.AbstractC0147c
        public boolean g(int i11) {
            return false;
        }

        @Override // b4.c.AbstractC0147c
        public void h(int i11, int i12) {
            a.this.postDelayed(this.f24635c, 160L);
        }

        @Override // b4.c.AbstractC0147c
        public void i(View view, int i11) {
            ((f) view.getLayoutParams()).f24626c = false;
            n();
        }

        @Override // b4.c.AbstractC0147c
        public void j(int i11) {
            a.this.V(i11, this.f24634b.v());
        }

        @Override // b4.c.AbstractC0147c
        public void k(View view, int i11, int i12, int i13, int i14) {
            int width = view.getWidth();
            float width2 = (a.this.c(view, 3) ? i11 + width : a.this.getWidth() - i11) / width;
            a.this.S(view, width2);
            view.setVisibility(width2 == BitmapDescriptorFactory.HUE_RED ? 4 : 0);
            a.this.invalidate();
        }

        @Override // b4.c.AbstractC0147c
        public void l(View view, float f11, float f12) {
            int i11;
            float u11 = a.this.u(view);
            int width = view.getWidth();
            if (a.this.c(view, 3)) {
                int i12 = (f11 > BitmapDescriptorFactory.HUE_RED ? 1 : (f11 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                i11 = (i12 > 0 || (i12 == 0 && u11 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = a.this.getWidth();
                if (f11 < BitmapDescriptorFactory.HUE_RED || (f11 == BitmapDescriptorFactory.HUE_RED && u11 > 0.5f)) {
                    width2 -= width;
                }
                i11 = width2;
            }
            this.f24634b.O(i11, view.getTop());
            a.this.invalidate();
        }

        @Override // b4.c.AbstractC0147c
        public boolean m(View view, int i11) {
            return a.this.D(view) && a.this.c(view, this.f24633a) && a.this.r(view) == 0;
        }

        void o() {
            View n11;
            int width;
            int x11 = this.f24634b.x();
            boolean z11 = this.f24633a == 3;
            if (z11) {
                n11 = a.this.n(3);
                width = (n11 != null ? -n11.getWidth() : 0) + x11;
            } else {
                n11 = a.this.n(5);
                width = a.this.getWidth() - x11;
            }
            if (n11 != null) {
                if (((!z11 || n11.getLeft() >= width) && (z11 || n11.getLeft() <= width)) || a.this.r(n11) != 0) {
                    return;
                }
                this.f24634b.Q(n11, width, n11.getTop());
                ((f) n11.getLayoutParams()).f24626c = true;
                a.this.invalidate();
                n();
                a.this.b();
            }
        }

        public void p() {
            a.this.removeCallbacks(this.f24635c);
        }

        public void q(b4.c cVar) {
            this.f24634b = cVar;
        }
    }

    static {
        int i11 = Build.VERSION.SDK_INT;
        f24596x1 = i11 >= 19;
        f24597y1 = i11 >= 21;
        Q1 = i11 >= 29;
    }

    public a(Context context) {
        this(context, null);
    }

    static boolean A(View view) {
        return (a0.D(view) == 4 || a0.D(view) == 2) ? false : true;
    }

    private boolean F(float f11, float f12, View view) {
        if (this.R == null) {
            this.R = new Rect();
        }
        view.getHitRect(this.R);
        return this.R.contains((int) f11, (int) f12);
    }

    private void G(Drawable drawable, int i11) {
        if (drawable == null || !n3.a.h(drawable)) {
            return;
        }
        n3.a.m(drawable, i11);
    }

    private Drawable N() {
        int F = a0.F(this);
        if (F == 0) {
            Drawable drawable = this.K;
            if (drawable != null) {
                G(drawable, F);
                return this.K;
            }
        } else {
            Drawable drawable2 = this.L;
            if (drawable2 != null) {
                G(drawable2, F);
                return this.L;
            }
        }
        return this.O;
    }

    private Drawable O() {
        int F = a0.F(this);
        if (F == 0) {
            Drawable drawable = this.L;
            if (drawable != null) {
                G(drawable, F);
                return this.L;
            }
        } else {
            Drawable drawable2 = this.K;
            if (drawable2 != null) {
                G(drawable2, F);
                return this.K;
            }
        }
        return this.P;
    }

    private void P() {
        if (f24597y1) {
            return;
        }
        this.B = N();
        this.C = O();
    }

    private void T(View view) {
        c.a aVar = c.a.f55461o;
        a0.q0(view, aVar.b());
        if (!C(view) || r(view) == 2) {
            return;
        }
        a0.s0(view, aVar, null, this.f24600b1);
    }

    private void U(View view, boolean z11) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((!z11 && !D(childAt)) || (z11 && childAt == view)) {
                a0.G0(childAt, 1);
            } else {
                a0.G0(childAt, 4);
            }
        }
    }

    private boolean m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent v11 = v(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(v11);
            v11.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    private MotionEvent v(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(getScrollX() - view.getLeft(), getScrollY() - view.getTop());
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.T == null) {
                this.T = new Matrix();
            }
            matrix.invert(this.T);
            obtain.transform(this.T);
        }
        return obtain;
    }

    static String w(int i11) {
        return (i11 & 3) == 3 ? "LEFT" : (i11 & 5) == 5 ? "RIGHT" : Integer.toHexString(i11);
    }

    private static boolean x(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    private boolean y() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            if (((f) getChildAt(i11).getLayoutParams()).f24626c) {
                return true;
            }
        }
        return false;
    }

    private boolean z() {
        return p() != null;
    }

    boolean B(View view) {
        return ((f) view.getLayoutParams()).f24624a == 0;
    }

    public boolean C(View view) {
        if (D(view)) {
            return (((f) view.getLayoutParams()).f24627d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    boolean D(View view) {
        int b11 = androidx.core.view.e.b(((f) view.getLayoutParams()).f24624a, a0.F(view));
        return ((b11 & 3) == 0 && (b11 & 5) == 0) ? false : true;
    }

    public boolean E(View view) {
        if (D(view)) {
            return ((f) view.getLayoutParams()).f24625b > BitmapDescriptorFactory.HUE_RED;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    void H(View view, float f11) {
        float u11 = u(view);
        float width = view.getWidth();
        int i11 = ((int) (width * f11)) - ((int) (u11 * width));
        if (!c(view, 3)) {
            i11 = -i11;
        }
        view.offsetLeftAndRight(i11);
        S(view, f11);
    }

    public void I(int i11) {
        J(i11, true);
    }

    public void J(int i11, boolean z11) {
        View n11 = n(i11);
        if (n11 != null) {
            L(n11, z11);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i11));
    }

    public void K(View view) {
        L(view, true);
    }

    public void L(View view, boolean z11) {
        if (D(view)) {
            f fVar = (f) view.getLayoutParams();
            if (this.f24611m) {
                fVar.f24625b = 1.0f;
                fVar.f24627d = 1;
                U(view, true);
                T(view);
            } else if (z11) {
                fVar.f24627d |= 2;
                if (c(view, 3)) {
                    this.f24605g.Q(view, 0, view.getTop());
                } else {
                    this.f24606h.Q(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                H(view, 1.0f);
                V(0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void M(e eVar) {
        List<e> list;
        if (eVar == null || (list = this.f24618x) == null) {
            return;
        }
        list.remove(eVar);
    }

    public void Q(Object obj, boolean z11) {
        this.G = obj;
        this.H = z11;
        setWillNotDraw(!z11 && getBackground() == null);
        requestLayout();
    }

    public void R(int i11, int i12) {
        View n11;
        int b11 = androidx.core.view.e.b(i12, a0.F(this));
        if (i12 == 3) {
            this.f24612n = i11;
        } else if (i12 == 5) {
            this.f24613o = i11;
        } else if (i12 == 8388611) {
            this.f24614p = i11;
        } else if (i12 == 8388613) {
            this.f24615q = i11;
        }
        if (i11 != 0) {
            (b11 == 3 ? this.f24605g : this.f24606h).a();
        }
        if (i11 != 1) {
            if (i11 == 2 && (n11 = n(b11)) != null) {
                K(n11);
                return;
            }
            return;
        }
        View n12 = n(b11);
        if (n12 != null) {
            f(n12);
        }
    }

    void S(View view, float f11) {
        f fVar = (f) view.getLayoutParams();
        if (f11 == fVar.f24625b) {
            return;
        }
        fVar.f24625b = f11;
        l(view, f11);
    }

    void V(int i11, View view) {
        int A = this.f24605g.A();
        int A2 = this.f24606h.A();
        int i12 = 2;
        if (A == 1 || A2 == 1) {
            i12 = 1;
        } else if (A != 2 && A2 != 2) {
            i12 = 0;
        }
        if (view != null && i11 == 0) {
            float f11 = ((f) view.getLayoutParams()).f24625b;
            if (f11 == BitmapDescriptorFactory.HUE_RED) {
                j(view);
            } else if (f11 == 1.0f) {
                k(view);
            }
        }
        if (i12 != this.f24609k) {
            this.f24609k = i12;
            List<e> list = this.f24618x;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f24618x.get(size).c(i12);
                }
            }
        }
    }

    public void a(e eVar) {
        if (eVar == null) {
            return;
        }
        if (this.f24618x == null) {
            this.f24618x = new ArrayList();
        }
        this.f24618x.add(eVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i11, int i12) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (D(childAt)) {
                if (C(childAt)) {
                    childAt.addFocusables(arrayList, i11, i12);
                    z11 = true;
                }
            } else {
                this.Q.add(childAt);
            }
        }
        if (!z11) {
            int size = this.Q.size();
            for (int i14 = 0; i14 < size; i14++) {
                View view = this.Q.get(i14);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i11, i12);
                }
            }
        }
        this.Q.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i11, layoutParams);
        if (o() == null && !D(view)) {
            a0.G0(view, 1);
        } else {
            a0.G0(view, 4);
        }
        if (f24596x1) {
            return;
        }
        a0.w0(view, this.f24598a);
    }

    void b() {
        if (this.f24616t) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            getChildAt(i11).dispatchTouchEvent(obtain);
        }
        obtain.recycle();
        this.f24616t = true;
    }

    boolean c(View view, int i11) {
        return (t(view) & i11) == i11;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f11 = BitmapDescriptorFactory.HUE_RED;
        for (int i11 = 0; i11 < childCount; i11++) {
            f11 = Math.max(f11, ((f) getChildAt(i11).getLayoutParams()).f24625b);
        }
        this.f24603e = f11;
        boolean m11 = this.f24605g.m(true);
        boolean m12 = this.f24606h.m(true);
        if (m11 || m12) {
            a0.n0(this);
        }
    }

    public void d(int i11) {
        e(i11, true);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() != 10 && this.f24603e > BitmapDescriptorFactory.HUE_RED) {
            int childCount = getChildCount();
            if (childCount != 0) {
                float x11 = motionEvent.getX();
                float y11 = motionEvent.getY();
                for (int i11 = childCount - 1; i11 >= 0; i11--) {
                    View childAt = getChildAt(i11);
                    if (F(x11, y11, childAt) && !B(childAt) && m(motionEvent, childAt)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j11) {
        int i11;
        int height = getHeight();
        boolean B = B(view);
        int width = getWidth();
        int save = canvas.save();
        int i12 = 0;
        if (B) {
            int childCount = getChildCount();
            int i13 = 0;
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (childAt != view && childAt.getVisibility() == 0 && x(childAt) && D(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i13) {
                            i13 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i13, 0, width, getHeight());
            i12 = i13;
        }
        boolean drawChild = super.drawChild(canvas, view, j11);
        canvas.restoreToCount(save);
        float f11 = this.f24603e;
        if (f11 > BitmapDescriptorFactory.HUE_RED && B) {
            this.f24604f.setColor((this.f24602d & 16777215) | (((int) ((((-16777216) & i11) >>> 24) * f11)) << 24));
            canvas.drawRect(i12, BitmapDescriptorFactory.HUE_RED, width, getHeight(), this.f24604f);
        } else if (this.B != null && c(view, 3)) {
            int intrinsicWidth = this.B.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max((float) BitmapDescriptorFactory.HUE_RED, Math.min(right2 / this.f24605g.x(), 1.0f));
            this.B.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.B.setAlpha((int) (max * 255.0f));
            this.B.draw(canvas);
        } else if (this.C != null && c(view, 5)) {
            int intrinsicWidth2 = this.C.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max((float) BitmapDescriptorFactory.HUE_RED, Math.min((getWidth() - left2) / this.f24606h.x(), 1.0f));
            this.C.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.C.setAlpha((int) (max2 * 255.0f));
            this.C.draw(canvas);
        }
        return drawChild;
    }

    public void e(int i11, boolean z11) {
        View n11 = n(i11);
        if (n11 != null) {
            g(n11, z11);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i11));
    }

    public void f(View view) {
        g(view, true);
    }

    public void g(View view, boolean z11) {
        if (D(view)) {
            f fVar = (f) view.getLayoutParams();
            if (this.f24611m) {
                fVar.f24625b = BitmapDescriptorFactory.HUE_RED;
                fVar.f24627d = 0;
            } else if (z11) {
                fVar.f24627d |= 4;
                if (c(view, 3)) {
                    this.f24605g.Q(view, -view.getWidth(), view.getTop());
                } else {
                    this.f24606h.Q(view, getWidth(), view.getTop());
                }
            } else {
                H(view, BitmapDescriptorFactory.HUE_RED);
                V(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    public float getDrawerElevation() {
        return f24597y1 ? this.f24599b : BitmapDescriptorFactory.HUE_RED;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.A;
    }

    public void h() {
        i(false);
    }

    void i(boolean z11) {
        boolean Q;
        int childCount = getChildCount();
        boolean z12 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (D(childAt) && (!z11 || fVar.f24626c)) {
                int width = childAt.getWidth();
                if (c(childAt, 3)) {
                    Q = this.f24605g.Q(childAt, -width, childAt.getTop());
                } else {
                    Q = this.f24606h.Q(childAt, getWidth(), childAt.getTop());
                }
                z12 |= Q;
                fVar.f24626c = false;
            }
        }
        this.f24607i.p();
        this.f24608j.p();
        if (z12) {
            invalidate();
        }
    }

    void j(View view) {
        View rootView;
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f24627d & 1) == 1) {
            fVar.f24627d = 0;
            List<e> list = this.f24618x;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f24618x.get(size).b(view);
                }
            }
            U(view, false);
            T(view);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    void k(View view) {
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f24627d & 1) == 0) {
            fVar.f24627d = 1;
            List<e> list = this.f24618x;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f24618x.get(size).a(view);
                }
            }
            U(view, true);
            T(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    void l(View view, float f11) {
        List<e> list = this.f24618x;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f24618x.get(size).d(view, f11);
            }
        }
    }

    View n(int i11) {
        int b11 = androidx.core.view.e.b(i11, a0.F(this)) & 7;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if ((t(childAt) & 7) == b11) {
                return childAt;
            }
        }
        return null;
    }

    View o() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((((f) childAt.getLayoutParams()).f24627d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24611m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24611m = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object obj;
        super.onDraw(canvas);
        if (!this.H || this.A == null) {
            return;
        }
        int systemWindowInsetTop = (Build.VERSION.SDK_INT < 21 || (obj = this.G) == null) ? 0 : ((WindowInsets) obj).getSystemWindowInsetTop();
        if (systemWindowInsetTop > 0) {
            this.A.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.A.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r0 != 3) goto L7;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            b4.c r1 = r6.f24605g
            boolean r1 = r1.P(r7)
            b4.c r2 = r6.f24606h
            boolean r2 = r2.P(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L38
            if (r0 == r2) goto L31
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L31
            goto L36
        L1e:
            b4.c r7 = r6.f24605g
            boolean r7 = r7.d(r4)
            if (r7 == 0) goto L36
            e4.a$h r7 = r6.f24607i
            r7.p()
            e4.a$h r7 = r6.f24608j
            r7.p()
            goto L36
        L31:
            r6.i(r2)
            r6.f24616t = r3
        L36:
            r7 = r3
            goto L60
        L38:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f24619y = r0
            r6.f24620z = r7
            float r4 = r6.f24603e
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5d
            b4.c r4 = r6.f24605g
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.t(r0, r7)
            if (r7 == 0) goto L5d
            boolean r7 = r6.B(r7)
            if (r7 == 0) goto L5d
            r7 = r2
            goto L5e
        L5d:
            r7 = r3
        L5e:
            r6.f24616t = r3
        L60:
            if (r1 != 0) goto L70
            if (r7 != 0) goto L70
            boolean r7 = r6.y()
            if (r7 != 0) goto L70
            boolean r7 = r6.f24616t
            if (r7 == 0) goto L6f
            goto L70
        L6f:
            r2 = r3
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.a.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (i11 == 4 && z()) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(i11, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            View p11 = p();
            if (p11 != null && r(p11) == 0) {
                h();
            }
            return p11 != null;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        WindowInsets rootWindowInsets;
        int i15;
        float f11;
        int i16;
        boolean z12 = true;
        this.f24610l = true;
        int i17 = i13 - i11;
        int childCount = getChildCount();
        int i18 = 0;
        while (i18 < childCount) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (B(childAt)) {
                    int i19 = ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
                    childAt.layout(i19, ((ViewGroup.MarginLayoutParams) fVar).topMargin, childAt.getMeasuredWidth() + i19, ((ViewGroup.MarginLayoutParams) fVar).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (c(childAt, 3)) {
                        float f12 = measuredWidth;
                        i16 = (-measuredWidth) + ((int) (fVar.f24625b * f12));
                        f11 = (measuredWidth + i16) / f12;
                    } else {
                        float f13 = measuredWidth;
                        f11 = (i17 - i15) / f13;
                        i16 = i17 - ((int) (fVar.f24625b * f13));
                    }
                    boolean z13 = f11 != fVar.f24625b ? z12 : false;
                    int i21 = fVar.f24624a & 112;
                    if (i21 == 16) {
                        int i22 = i14 - i12;
                        int i23 = (i22 - measuredHeight) / 2;
                        int i24 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        if (i23 < i24) {
                            i23 = i24;
                        } else {
                            int i25 = i23 + measuredHeight;
                            int i26 = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                            if (i25 > i22 - i26) {
                                i23 = (i22 - i26) - measuredHeight;
                            }
                        }
                        childAt.layout(i16, i23, measuredWidth + i16, measuredHeight + i23);
                    } else if (i21 != 80) {
                        int i27 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        childAt.layout(i16, i27, measuredWidth + i16, measuredHeight + i27);
                    } else {
                        int i28 = i14 - i12;
                        childAt.layout(i16, (i28 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i16, i28 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    }
                    if (z13) {
                        S(childAt, f11);
                    }
                    int i29 = fVar.f24625b > BitmapDescriptorFactory.HUE_RED ? 0 : 4;
                    if (childAt.getVisibility() != i29) {
                        childAt.setVisibility(i29);
                    }
                }
            }
            i18++;
            z12 = true;
        }
        if (Q1 && (rootWindowInsets = getRootWindowInsets()) != null) {
            m3.b i31 = l0.w(rootWindowInsets).i();
            b4.c cVar = this.f24605g;
            cVar.L(Math.max(cVar.w(), i31.f38364a));
            b4.c cVar2 = this.f24606h;
            cVar2.L(Math.max(cVar2.w(), i31.f38366c));
        }
        this.f24610l = false;
        this.f24611m = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int t11;
        int mode = View.MeasureSpec.getMode(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        int i13 = 0;
        boolean z11 = this.G != null && a0.C(this);
        int F = a0.F(this);
        int childCount = getChildCount();
        int i14 = 0;
        boolean z12 = false;
        boolean z13 = false;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (z11) {
                    int b11 = androidx.core.view.e.b(fVar.f24624a, F);
                    if (a0.C(childAt)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.G;
                            if (b11 == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i13, windowInsets.getSystemWindowInsetBottom());
                            } else if (b11 == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i13, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (Build.VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.G;
                        if (b11 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i13, windowInsets2.getSystemWindowInsetBottom());
                        } else if (b11 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i13, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) fVar).topMargin = windowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, 1073741824));
                } else if (D(childAt)) {
                    if (f24597y1) {
                        float z14 = a0.z(childAt);
                        float f11 = this.f24599b;
                        if (z14 != f11) {
                            a0.D0(childAt, f11);
                        }
                    }
                    int i15 = (t(childAt) & 7) == 3 ? 1 : i13;
                    if ((i15 != 0 && z12) || (i15 == 0 && z13)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + w(t11) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (i15 != 0) {
                        z12 = true;
                    } else {
                        z13 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i11, this.f24601c + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((ViewGroup.MarginLayoutParams) fVar).width), ViewGroup.getChildMeasureSpec(i12, ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, ((ViewGroup.MarginLayoutParams) fVar).height));
                    i14++;
                    i13 = 0;
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i14 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            i14++;
            i13 = 0;
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View n11;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        int i11 = gVar.f24628c;
        if (i11 != 0 && (n11 = n(i11)) != null) {
            K(n11);
        }
        int i12 = gVar.f24629d;
        if (i12 != 3) {
            R(i12, 3);
        }
        int i13 = gVar.f24630e;
        if (i13 != 3) {
            R(i13, 5);
        }
        int i14 = gVar.f24631f;
        if (i14 != 3) {
            R(i14, 8388611);
        }
        int i15 = gVar.f24632g;
        if (i15 != 3) {
            R(i15, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i11) {
        P();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            f fVar = (f) getChildAt(i11).getLayoutParams();
            int i12 = fVar.f24627d;
            boolean z11 = i12 == 1;
            boolean z12 = i12 == 2;
            if (z11 || z12) {
                gVar.f24628c = fVar.f24624a;
                break;
            }
        }
        gVar.f24629d = this.f24612n;
        gVar.f24630e = this.f24613o;
        gVar.f24631f = this.f24614p;
        gVar.f24632g = this.f24615q;
        return gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        if (r(r7) != 2) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            b4.c r0 = r6.f24605g
            r0.F(r7)
            b4.c r0 = r6.f24606h
            r0.F(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5f
            if (r0 == r2) goto L20
            r7 = 3
            if (r0 == r7) goto L1a
            goto L6d
        L1a:
            r6.i(r2)
            r6.f24616t = r1
            goto L6d
        L20:
            float r0 = r7.getX()
            float r7 = r7.getY()
            b4.c r3 = r6.f24605g
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.t(r4, r5)
            if (r3 == 0) goto L5a
            boolean r3 = r6.B(r3)
            if (r3 == 0) goto L5a
            float r3 = r6.f24619y
            float r0 = r0 - r3
            float r3 = r6.f24620z
            float r7 = r7 - r3
            b4.c r3 = r6.f24605g
            int r3 = r3.z()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5a
            android.view.View r7 = r6.o()
            if (r7 == 0) goto L5a
            int r7 = r6.r(r7)
            r0 = 2
            if (r7 != r0) goto L5b
        L5a:
            r1 = r2
        L5b:
            r6.i(r1)
            goto L6d
        L5f:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f24619y = r0
            r6.f24620z = r7
            r6.f24616t = r1
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.a.onTouchEvent(android.view.MotionEvent):boolean");
    }

    View p() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (D(childAt) && E(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int q(int i11) {
        int F = a0.F(this);
        if (i11 == 3) {
            int i12 = this.f24612n;
            if (i12 != 3) {
                return i12;
            }
            int i13 = F == 0 ? this.f24614p : this.f24615q;
            if (i13 != 3) {
                return i13;
            }
            return 0;
        } else if (i11 == 5) {
            int i14 = this.f24613o;
            if (i14 != 3) {
                return i14;
            }
            int i15 = F == 0 ? this.f24615q : this.f24614p;
            if (i15 != 3) {
                return i15;
            }
            return 0;
        } else if (i11 == 8388611) {
            int i16 = this.f24614p;
            if (i16 != 3) {
                return i16;
            }
            int i17 = F == 0 ? this.f24612n : this.f24613o;
            if (i17 != 3) {
                return i17;
            }
            return 0;
        } else if (i11 != 8388613) {
            return 0;
        } else {
            int i18 = this.f24615q;
            if (i18 != 3) {
                return i18;
            }
            int i19 = F == 0 ? this.f24613o : this.f24612n;
            if (i19 != 3) {
                return i19;
            }
            return 0;
        }
    }

    public int r(View view) {
        if (D(view)) {
            return q(((f) view.getLayoutParams()).f24624a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        super.requestDisallowInterceptTouchEvent(z11);
        if (z11) {
            i(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f24610l) {
            return;
        }
        super.requestLayout();
    }

    public CharSequence s(int i11) {
        int b11 = androidx.core.view.e.b(i11, a0.F(this));
        if (b11 == 3) {
            return this.E;
        }
        if (b11 == 5) {
            return this.F;
        }
        return null;
    }

    public void setDrawerElevation(float f11) {
        this.f24599b = f11;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (D(childAt)) {
                a0.D0(childAt, this.f24599b);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(e eVar) {
        e eVar2 = this.f24617w;
        if (eVar2 != null) {
            M(eVar2);
        }
        if (eVar != null) {
            a(eVar);
        }
        this.f24617w = eVar;
    }

    public void setDrawerLockMode(int i11) {
        R(i11, 3);
        R(i11, 5);
    }

    public void setScrimColor(int i11) {
        this.f24602d = i11;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.A = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i11) {
        this.A = new ColorDrawable(i11);
        invalidate();
    }

    int t(View view) {
        return androidx.core.view.e.b(((f) view.getLayoutParams()).f24624a, a0.F(this));
    }

    float u(View view) {
        return ((f) view.getLayoutParams()).f24625b;
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d4.a.f23570a);
    }

    public a(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f24598a = new d();
        this.f24602d = -1728053248;
        this.f24604f = new Paint();
        this.f24611m = true;
        this.f24612n = 3;
        this.f24613o = 3;
        this.f24614p = 3;
        this.f24615q = 3;
        this.K = null;
        this.L = null;
        this.O = null;
        this.P = null;
        this.f24600b1 = new C0476a();
        setDescendantFocusability(262144);
        float f11 = getResources().getDisplayMetrics().density;
        this.f24601c = (int) ((64.0f * f11) + 0.5f);
        float f12 = f11 * 400.0f;
        h hVar = new h(3);
        this.f24607i = hVar;
        h hVar2 = new h(5);
        this.f24608j = hVar2;
        b4.c n11 = b4.c.n(this, 1.0f, hVar);
        this.f24605g = n11;
        n11.M(1);
        n11.N(f12);
        hVar.q(n11);
        b4.c n12 = b4.c.n(this, 1.0f, hVar2);
        this.f24606h = n12;
        n12.M(2);
        n12.N(f12);
        hVar2.q(n12);
        setFocusableInTouchMode(true);
        a0.G0(this, 1);
        a0.w0(this, new c());
        setMotionEventSplittingEnabled(false);
        if (a0.C(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new b(this));
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f24594g1);
                try {
                    this.A = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.A = null;
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, d4.c.f23572a, i11, 0);
        try {
            int i12 = d4.c.f23573b;
            if (obtainStyledAttributes2.hasValue(i12)) {
                this.f24599b = obtainStyledAttributes2.getDimension(i12, BitmapDescriptorFactory.HUE_RED);
            } else {
                this.f24599b = getResources().getDimension(d4.b.f23571a);
            }
            obtainStyledAttributes2.recycle();
            this.Q = new ArrayList<>();
        } catch (Throwable th2) {
            obtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public void setStatusBarBackground(int i11) {
        this.A = i11 != 0 ? androidx.core.content.b.getDrawable(getContext(), i11) : null;
        invalidate();
    }

    /* loaded from: classes.dex */
    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f24624a;

        /* renamed from: b  reason: collision with root package name */
        float f24625b;

        /* renamed from: c  reason: collision with root package name */
        boolean f24626c;

        /* renamed from: d  reason: collision with root package name */
        int f24627d;

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f24624a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f24595p1);
            this.f24624a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public f(int i11, int i12) {
            super(i11, i12);
            this.f24624a = 0;
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f24624a = 0;
            this.f24624a = fVar.f24624a;
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f24624a = 0;
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f24624a = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class g extends a4.a {
        public static final Parcelable.Creator<g> CREATOR = new C0477a();

        /* renamed from: c  reason: collision with root package name */
        int f24628c;

        /* renamed from: d  reason: collision with root package name */
        int f24629d;

        /* renamed from: e  reason: collision with root package name */
        int f24630e;

        /* renamed from: f  reason: collision with root package name */
        int f24631f;

        /* renamed from: g  reason: collision with root package name */
        int f24632g;

        /* renamed from: e4.a$g$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0477a implements Parcelable.ClassLoaderCreator<g> {
            C0477a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public g[] newArray(int i11) {
                return new g[i11];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f24628c = 0;
            this.f24628c = parcel.readInt();
            this.f24629d = parcel.readInt();
            this.f24630e = parcel.readInt();
            this.f24631f = parcel.readInt();
            this.f24632g = parcel.readInt();
        }

        @Override // a4.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f24628c);
            parcel.writeInt(this.f24629d);
            parcel.writeInt(this.f24630e);
            parcel.writeInt(this.f24631f);
            parcel.writeInt(this.f24632g);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
            this.f24628c = 0;
        }
    }
}