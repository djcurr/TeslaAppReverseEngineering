package wg;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import androidx.core.view.a0;
import com.facebook.react.uimanager.d;
import com.facebook.react.uimanager.events.i;
import com.facebook.react.uimanager.k;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.t;
import com.facebook.react.uimanager.u;
import com.facebook.react.uimanager.y;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import wg.f;

/* loaded from: classes3.dex */
public class d extends HorizontalScrollView implements t, d.a, y, f.d, f.c {
    private static boolean R = false;

    /* renamed from: g1  reason: collision with root package name */
    private static Field f55792g1;
    private boolean A;
    private boolean B;
    private int C;
    private com.facebook.react.views.view.f E;
    private boolean F;
    private int G;
    private int H;
    private final com.facebook.react.uimanager.d K;
    private final f.C1269f L;
    private final ValueAnimator O;
    private q P;
    private final Rect Q;

    /* renamed from: a  reason: collision with root package name */
    private int f55794a;

    /* renamed from: b  reason: collision with root package name */
    private final wg.b f55795b;

    /* renamed from: c  reason: collision with root package name */
    private final OverScroller f55796c;

    /* renamed from: d  reason: collision with root package name */
    private final h f55797d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f55798e;

    /* renamed from: f  reason: collision with root package name */
    private final Rect f55799f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f55800g;

    /* renamed from: h  reason: collision with root package name */
    private Rect f55801h;

    /* renamed from: i  reason: collision with root package name */
    private String f55802i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f55803j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f55804k;

    /* renamed from: l  reason: collision with root package name */
    private Runnable f55805l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f55806m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f55807n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f55808o;

    /* renamed from: p  reason: collision with root package name */
    private wg.a f55809p;

    /* renamed from: q  reason: collision with root package name */
    private String f55810q;

    /* renamed from: t  reason: collision with root package name */
    private Drawable f55811t;

    /* renamed from: w  reason: collision with root package name */
    private int f55812w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f55813x;

    /* renamed from: y  reason: collision with root package name */
    private int f55814y;

    /* renamed from: z  reason: collision with root package name */
    private List<Integer> f55815z;
    private static String T = d.class.getSimpleName();

    /* renamed from: b1  reason: collision with root package name */
    private static int f55791b1 = Integer.MIN_VALUE;

    /* renamed from: p1  reason: collision with root package name */
    private static boolean f55793p1 = false;

    /* loaded from: classes3.dex */
    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setScrollable(d.this.f55807n);
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, w3.c cVar) {
            super.onInitializeAccessibilityNodeInfo(view, cVar);
            cVar.D0(d.this.f55807n);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private boolean f55817a = false;

        /* renamed from: b  reason: collision with root package name */
        private boolean f55818b = true;

        /* renamed from: c  reason: collision with root package name */
        private int f55819c = 0;

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (d.this.f55800g) {
                d.this.f55800g = false;
                this.f55819c = 0;
                this.f55818b = true;
            } else {
                f.q(d.this);
                int i11 = this.f55819c + 1;
                this.f55819c = i11;
                this.f55818b = i11 < 3;
                if (!d.this.f55804k || this.f55817a) {
                    if (d.this.f55808o) {
                        f.h(d.this);
                    }
                    d.this.j();
                } else {
                    this.f55817a = true;
                    d.this.m(0);
                    a0.p0(d.this, this, 20L);
                }
            }
            if (!this.f55818b) {
                d.this.f55805l = null;
            } else {
                a0.p0(d.this, this, 20L);
            }
        }
    }

    public d(Context context, wg.a aVar) {
        super(context);
        this.f55794a = f55791b1;
        this.f55795b = new wg.b();
        this.f55797d = new h();
        this.f55798e = new Rect();
        this.f55799f = new Rect();
        this.f55802i = "hidden";
        this.f55804k = false;
        this.f55807n = true;
        this.f55809p = null;
        this.f55812w = 0;
        this.f55813x = false;
        this.f55814y = 0;
        this.A = true;
        this.B = true;
        this.C = 0;
        this.F = false;
        this.G = -1;
        this.H = -1;
        this.K = new com.facebook.react.uimanager.d();
        this.O = ObjectAnimator.ofInt(this, "scrollX", 0, 0);
        this.P = q.AUTO;
        this.Q = new Rect();
        this.E = new com.facebook.react.views.view.f(this);
        this.f55809p = aVar;
        a0.w0(this, new a());
        this.f55796c = getOverScrollerFromParent();
        this.L = new f.C1269f(jg.a.d().g(context) ? 1 : 0);
    }

    private void B(int i11, int i12) {
        if (R) {
            nd.a.r(T, "setPendingContentOffsets[%d] x %d y %d", Integer.valueOf(getId()), Integer.valueOf(i11), Integer.valueOf(i12));
        }
        View contentView = getContentView();
        if (contentView != null && contentView.getWidth() != 0 && contentView.getHeight() != 0) {
            this.G = -1;
            this.H = -1;
            return;
        }
        this.G = i11;
        this.H = i12;
    }

    private void C(int i11) {
        if (R) {
            nd.a.q(T, "smoothScrollAndSnap[%d] velocity %d", Integer.valueOf(getId()), Integer.valueOf(i11));
        }
        double snapInterval = getSnapInterval();
        double k11 = f.k(this, getScrollX(), getReactScrollViewScrollState().b().x, i11);
        double d11 = k11 / snapInterval;
        int floor = (int) Math.floor(d11);
        int ceil = (int) Math.ceil(d11);
        int round = (int) Math.round(d11);
        int round2 = (int) Math.round(v(i11) / snapInterval);
        if (i11 > 0 && ceil == floor) {
            ceil++;
        } else if (i11 < 0 && floor == ceil) {
            floor--;
        }
        if (i11 > 0 && round < ceil && round2 > floor) {
            round = ceil;
        } else if (i11 < 0 && round > floor && round2 < ceil) {
            round = floor;
        }
        double d12 = round * snapInterval;
        if (d12 != k11) {
            this.f55800g = true;
            w((int) d12, getScrollY());
        }
    }

    private void D(int i11) {
        if (R) {
            nd.a.q(T, "smoothScrollToNextPage[%d] direction %d", Integer.valueOf(getId()), Integer.valueOf(i11));
        }
        int width = getWidth();
        int scrollX = getScrollX();
        int i12 = scrollX / width;
        if (scrollX % width != 0) {
            i12++;
        }
        int i13 = i11 == 17 ? i12 - 1 : i12 + 1;
        if (i13 < 0) {
            i13 = 0;
        }
        w(i13 * width, getScrollY());
        q(0, 0);
    }

    private View getContentView() {
        return getChildAt(0);
    }

    private OverScroller getOverScrollerFromParent() {
        if (!f55793p1) {
            f55793p1 = true;
            try {
                Field declaredField = HorizontalScrollView.class.getDeclaredField("mScroller");
                f55792g1 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                nd.a.G(T, "Failed to get mScroller field for HorizontalScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = f55792g1;
        OverScroller overScroller = null;
        if (field != null) {
            try {
                Object obj = field.get(this);
                if (obj instanceof OverScroller) {
                    overScroller = (OverScroller) obj;
                } else {
                    nd.a.G(T, "Failed to cast mScroller field in HorizontalScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
                }
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("Failed to get mScroller from HorizontalScrollView!", e11);
            }
        }
        return overScroller;
    }

    private int getSnapInterval() {
        int i11 = this.f55814y;
        return i11 != 0 ? i11 : getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (t()) {
            wf.a.c(this.f55809p);
            wf.a.c(this.f55810q);
            this.f55809p.b(this.f55810q);
        }
    }

    private void k() {
        if (t()) {
            wf.a.c(this.f55809p);
            wf.a.c(this.f55810q);
            this.f55809p.a(this.f55810q);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(int i11) {
        int i12;
        int floor;
        int min;
        int i13;
        int i14;
        OverScroller overScroller;
        if (R) {
            nd.a.q(T, "smoothScrollAndSnap[%d] velocityX %d", Integer.valueOf(getId()), Integer.valueOf(i11));
        }
        if (getChildCount() <= 0) {
            return;
        }
        if (this.f55814y == 0 && this.f55815z == null && this.C == 0) {
            C(i11);
            return;
        }
        boolean z11 = getFlingAnimator() != this.O;
        int max = Math.max(0, computeHorizontalScrollRange() - getWidth());
        int v11 = v(i11);
        if (this.f55813x) {
            v11 = getScrollX();
        }
        int width = (getWidth() - a0.K(this)) - a0.J(this);
        int f11 = getReactScrollViewScrollState().f();
        if (f11 == 1) {
            v11 = max - v11;
            i12 = -i11;
        } else {
            i12 = i11;
        }
        List<Integer> list = this.f55815z;
        if (list != null && !list.isEmpty()) {
            i14 = this.f55815z.get(0).intValue();
            List<Integer> list2 = this.f55815z;
            i13 = list2.get(list2.size() - 1).intValue();
            min = max;
            floor = 0;
            for (int i15 = 0; i15 < this.f55815z.size(); i15++) {
                int intValue = this.f55815z.get(i15).intValue();
                if (intValue <= v11 && v11 - intValue < v11 - floor) {
                    floor = intValue;
                }
                if (intValue >= v11 && intValue - v11 < min - v11) {
                    min = intValue;
                }
            }
        } else {
            int i16 = this.C;
            if (i16 != 0) {
                int i17 = this.f55814y;
                if (i17 > 0) {
                    double d11 = v11 / i17;
                    double floor2 = Math.floor(d11);
                    int i18 = this.f55814y;
                    floor = Math.max(o(i16, (int) (floor2 * i18), i18, width), 0);
                    int i19 = this.C;
                    double ceil = Math.ceil(d11);
                    int i21 = this.f55814y;
                    min = Math.min(o(i19, (int) (ceil * i21), i21, width), max);
                    i13 = max;
                    i14 = 0;
                } else {
                    ViewGroup viewGroup = (ViewGroup) getContentView();
                    int i22 = max;
                    int i23 = i22;
                    int i24 = 0;
                    int i25 = 0;
                    for (int i26 = 0; i26 < viewGroup.getChildCount(); i26++) {
                        View childAt = viewGroup.getChildAt(i26);
                        int o11 = o(this.C, childAt.getLeft(), childAt.getWidth(), width);
                        if (o11 <= v11 && v11 - o11 < v11 - i24) {
                            i24 = o11;
                        }
                        if (o11 >= v11 && o11 - v11 < i23 - v11) {
                            i23 = o11;
                        }
                        i22 = Math.min(i22, o11);
                        i25 = Math.max(i25, o11);
                    }
                    int max2 = Math.max(i24, i22);
                    min = Math.min(i23, i25);
                    i13 = max;
                    floor = max2;
                }
            } else {
                double snapInterval = getSnapInterval();
                double d12 = v11 / snapInterval;
                floor = (int) (Math.floor(d12) * snapInterval);
                min = Math.min((int) (Math.ceil(d12) * snapInterval), max);
                i13 = max;
            }
            i14 = 0;
        }
        int i27 = v11 - floor;
        int i28 = min - v11;
        int i29 = Math.abs(i27) < Math.abs(i28) ? floor : min;
        int scrollX = getScrollX();
        if (f11 == 1) {
            scrollX = max - scrollX;
        }
        if (this.B || v11 < i13) {
            if (this.A || v11 > i14) {
                if (i12 > 0) {
                    if (!z11) {
                        i12 += (int) (i28 * 10.0d);
                    }
                    v11 = min;
                } else if (i12 < 0) {
                    if (!z11) {
                        i12 -= (int) (i27 * 10.0d);
                    }
                    v11 = floor;
                } else {
                    v11 = i29;
                }
            } else if (scrollX > i14) {
                v11 = i14;
            }
        } else if (scrollX < i13) {
            v11 = i13;
        }
        int min2 = Math.min(Math.max(0, v11), max);
        if (f11 == 1) {
            min2 = max - min2;
            i12 = -i12;
        }
        int i31 = min2;
        if (!z11 && (overScroller = this.f55796c) != null) {
            this.f55800g = true;
            overScroller.fling(getScrollX(), getScrollY(), i12 != 0 ? i12 : i31 - getScrollX(), 0, i31, i31, 0, 0, (i31 == 0 || i31 == max) ? width / 2 : 0, 0);
            postInvalidateOnAnimation();
            return;
        }
        w(i31, getScrollY());
    }

    private int o(int i11, int i12, int i13, int i14) {
        int i15;
        if (i11 != 1) {
            if (i11 == 2) {
                i15 = (i14 - i13) / 2;
            } else if (i11 != 3) {
                throw new IllegalStateException("Invalid SnapToAlignment value: " + this.C);
            } else {
                i15 = i14 - i13;
            }
            return i12 - i15;
        }
        return i12;
    }

    private int p(View view) {
        view.getDrawingRect(this.Q);
        offsetDescendantRectToMyCoords(view, this.Q);
        return computeScrollDeltaToGetChildRectOnScreen(this.Q);
    }

    private void q(int i11, int i12) {
        if (R) {
            nd.a.r(T, "handlePostTouchScrolling[%d] velocityX %d velocityY %d", Integer.valueOf(getId()), Integer.valueOf(i11), Integer.valueOf(i12));
        }
        if (this.f55805l != null) {
            return;
        }
        if (this.f55808o) {
            f.g(this, i11, i12);
        }
        this.f55800g = false;
        b bVar = new b();
        this.f55805l = bVar;
        a0.p0(this, bVar, 20L);
    }

    private boolean r(View view) {
        int p11 = p(view);
        view.getDrawingRect(this.Q);
        return p11 != 0 && Math.abs(p11) < this.Q.width() / 2;
    }

    private boolean s(View view) {
        int p11 = p(view);
        view.getDrawingRect(this.Q);
        return p11 != 0 && Math.abs(p11) < this.Q.width();
    }

    private boolean t() {
        String str;
        return (this.f55809p == null || (str = this.f55810q) == null || str.isEmpty()) ? false : true;
    }

    private boolean u(View view) {
        return p(view) == 0;
    }

    private int v(int i11) {
        int max = Math.max(0, computeHorizontalScrollRange() - getWidth());
        if (getFlingAnimator() == this.O) {
            return f.n(this, i11, 0, max, 0).x;
        }
        return n(i11) + f.k(this, getScrollX(), getReactScrollViewScrollState().b().x, i11);
    }

    private void x(View view) {
        int p11 = p(view);
        if (p11 != 0) {
            scrollBy(p11, 0);
        }
    }

    public void A(int i11, float f11) {
        this.E.g(i11, f11);
    }

    @Override // wg.f.c
    public void a(int i11, int i12) {
        this.O.cancel();
        this.O.setDuration(f.j(getContext())).setIntValues(i11, i12);
        this.O.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i11, int i12) {
        if (this.f55804k && !this.F) {
            ArrayList arrayList2 = new ArrayList();
            super.addFocusables(arrayList2, i11, i12);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                View view = (View) it2.next();
                if (u(view) || s(view) || view.isFocused()) {
                    arrayList.add(view);
                }
            }
            return;
        }
        super.addFocusables(arrayList, i11, i12);
    }

    @Override // android.widget.HorizontalScrollView
    public boolean arrowScroll(int i11) {
        if (this.f55804k) {
            boolean z11 = true;
            this.F = true;
            if (getChildCount() > 0) {
                View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus(), i11);
                View contentView = getContentView();
                if (contentView != null && findNextFocus != null && findNextFocus.getParent() == contentView) {
                    if (!u(findNextFocus) && !r(findNextFocus)) {
                        D(i11);
                    }
                    findNextFocus.requestFocus();
                } else {
                    D(i11);
                }
            } else {
                z11 = false;
            }
            this.F = false;
            return z11;
        }
        return super.arrowScroll(i11);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void draw(Canvas canvas) {
        if (this.f55812w != 0) {
            View contentView = getContentView();
            if (this.f55811t != null && contentView != null && contentView.getRight() < getWidth()) {
                this.f55811t.setBounds(contentView.getRight(), 0, getWidth(), getHeight());
                this.f55811t.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.HorizontalScrollView
    public boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.f55807n || !(keyCode == 21 || keyCode == 22)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView
    public void fling(int i11) {
        if (R) {
            nd.a.q(T, "fling[%d] velocityX %d", Integer.valueOf(getId()), Integer.valueOf(i11));
        }
        int abs = (int) (Math.abs(i11) * Math.signum(this.f55795b.a()));
        if (this.f55804k) {
            m(abs);
        } else if (this.f55796c != null) {
            this.f55796c.fling(getScrollX(), getScrollY(), abs, 0, 0, Integer.MAX_VALUE, 0, 0, ((getWidth() - a0.K(this)) - a0.J(this)) / 2, 0);
            a0.n0(this);
        } else {
            super.fling(abs);
        }
        q(abs, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return super.getChildVisibleRect(view, rect, point);
    }

    @Override // com.facebook.react.uimanager.t
    public void getClippingRect(Rect rect) {
        rect.set((Rect) wf.a.c(this.f55801h));
    }

    @Override // com.facebook.react.uimanager.d.a
    public com.facebook.react.uimanager.d getFabricViewStateManager() {
        return this.K;
    }

    @Override // wg.f.c
    public ValueAnimator getFlingAnimator() {
        return this.O;
    }

    @Override // com.facebook.react.uimanager.x
    public String getOverflow() {
        return this.f55802i;
    }

    @Override // com.facebook.react.uimanager.y
    public Rect getOverflowInset() {
        return this.f55799f;
    }

    public q getPointerEvents() {
        return this.P;
    }

    @Override // wg.f.d
    public f.C1269f getReactScrollViewScrollState() {
        return this.L;
    }

    @Override // com.facebook.react.uimanager.t
    public boolean getRemoveClippedSubviews() {
        return this.f55806m;
    }

    public void l() {
        awakenScrollBars();
    }

    public int n(int i11) {
        return f.n(this, i11, 0, Math.max(0, computeHorizontalScrollRange() - getWidth()), 0).x;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f55806m) {
            updateClippingRect();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (R) {
            nd.a.p(T, "onDraw[%d]", Integer.valueOf(getId()));
        }
        getDrawingRect(this.f55798e);
        String str = this.f55802i;
        str.hashCode();
        if (!str.equals("visible")) {
            canvas.clipRect(this.f55798e);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f55807n) {
            if (q.canChildrenBeTouchTarget(this.P)) {
                try {
                    if (super.onInterceptTouchEvent(motionEvent)) {
                        i.a(this, motionEvent);
                        f.b(this);
                        this.f55803j = true;
                        k();
                        getFlingAnimator().cancel();
                        return true;
                    }
                } catch (IllegalArgumentException e11) {
                    nd.a.H("ReactNative", "Error intercepting touch event.", e11);
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        OverScroller overScroller;
        if (R) {
            nd.a.t(T, "onLayout[%d] l %d t %d r %d b %d", Integer.valueOf(getId()), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
        }
        int i15 = this.f55794a;
        if (i15 != f55791b1 && (overScroller = this.f55796c) != null && i15 != overScroller.getFinalX() && !this.f55796c.isFinished()) {
            if (R) {
                nd.a.q(T, "onLayout[%d] scroll hack enabled: reset to previous scrollX position of %d", Integer.valueOf(getId()), Integer.valueOf(this.f55794a));
            }
            OverScroller overScroller2 = this.f55796c;
            overScroller2.startScroll(this.f55794a, overScroller2.getFinalY(), 0, 0);
            this.f55796c.forceFinished(true);
            this.f55794a = f55791b1;
        }
        int i16 = this.G;
        if (i16 == -1) {
            i16 = getScrollX();
        }
        int i17 = this.H;
        if (i17 == -1) {
            i17 = getScrollY();
        }
        scrollTo(i16, i17);
        f.a(this);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        OverScroller overScroller;
        k.a(i11, i12);
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        if (R) {
            nd.a.r(T, "onMeasure[%d] measured width: %d measured height: %d", Integer.valueOf(getId()), Integer.valueOf(size), Integer.valueOf(size2));
        }
        boolean z11 = getMeasuredHeight() != size2;
        setMeasuredDimension(size, size2);
        if (!z11 || (overScroller = this.f55796c) == null) {
            return;
        }
        this.f55794a = overScroller.getCurrX();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected void onOverScrolled(int i11, int i12, boolean z11, boolean z12) {
        int computeHorizontalScrollRange;
        if (R) {
            nd.a.t(T, "onOverScrolled[%d] scrollX %d scrollY %d clampedX %b clampedY %b", Integer.valueOf(getId()), Integer.valueOf(i11), Integer.valueOf(i12), Boolean.valueOf(z11), Boolean.valueOf(z12));
        }
        OverScroller overScroller = this.f55796c;
        if (overScroller != null && !overScroller.isFinished() && this.f55796c.getCurrX() != this.f55796c.getFinalX() && i11 >= (computeHorizontalScrollRange = computeHorizontalScrollRange() - getWidth())) {
            this.f55796c.abortAnimation();
            i11 = computeHorizontalScrollRange;
        }
        super.onOverScrolled(i11, i12, z11, z12);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i11, int i12, int i13, int i14) {
        if (R) {
            nd.a.t(T, "onScrollChanged[%d] x %d y %d oldx %d oldy %d", Integer.valueOf(getId()), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
        }
        super.onScrollChanged(i11, i12, i13, i14);
        this.f55800g = true;
        if (this.f55795b.c(i11, i12)) {
            if (this.f55806m) {
                updateClippingRect();
            }
            f.s(this, this.f55795b.a(), this.f55795b.b());
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (this.f55806m) {
            updateClippingRect();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f55807n && q.canBeTouchTarget(this.P)) {
            this.f55797d.a(motionEvent);
            if ((motionEvent.getAction() & 255) == 1 && this.f55803j) {
                f.q(this);
                float b11 = this.f55797d.b();
                float c11 = this.f55797d.c();
                f.c(this, b11, c11);
                this.f55803j = false;
                q(Math.round(b11), Math.round(c11));
            }
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView
    public boolean pageScroll(int i11) {
        boolean pageScroll = super.pageScroll(i11);
        if (this.f55804k && pageScroll) {
            q(0, 0);
        }
        return pageScroll;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (view2 != null && !this.f55804k) {
            x(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void scrollTo(int i11, int i12) {
        if (R) {
            nd.a.r(T, "scrollTo[%d] x %d y %d", Integer.valueOf(getId()), Integer.valueOf(i11), Integer.valueOf(i12));
        }
        super.scrollTo(i11, i12);
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        f.r(this, scrollX, scrollY);
        B(scrollX, scrollY);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        this.E.b(i11);
    }

    public void setBorderRadius(float f11) {
        this.E.d(f11);
    }

    public void setBorderStyle(String str) {
        this.E.f(str);
    }

    public void setDecelerationRate(float f11) {
        getReactScrollViewScrollState().h(f11);
        OverScroller overScroller = this.f55796c;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f11);
        }
    }

    public void setDisableIntervalMomentum(boolean z11) {
        this.f55813x = z11;
    }

    public void setEndFillColor(int i11) {
        if (i11 != this.f55812w) {
            this.f55812w = i11;
            this.f55811t = new ColorDrawable(this.f55812w);
        }
    }

    public void setOverflow(String str) {
        this.f55802i = str;
        invalidate();
    }

    @Override // com.facebook.react.uimanager.y
    public void setOverflowInset(int i11, int i12, int i13, int i14) {
        this.f55799f.set(i11, i12, i13, i14);
    }

    public void setPagingEnabled(boolean z11) {
        this.f55804k = z11;
    }

    public void setPointerEvents(q qVar) {
        this.P = qVar;
    }

    public void setRemoveClippedSubviews(boolean z11) {
        if (z11 && this.f55801h == null) {
            this.f55801h = new Rect();
        }
        this.f55806m = z11;
        updateClippingRect();
    }

    public void setScrollEnabled(boolean z11) {
        this.f55807n = z11;
    }

    public void setScrollPerfTag(String str) {
        this.f55810q = str;
    }

    public void setSendMomentumEvents(boolean z11) {
        this.f55808o = z11;
    }

    public void setSnapInterval(int i11) {
        this.f55814y = i11;
    }

    public void setSnapOffsets(List<Integer> list) {
        this.f55815z = list;
    }

    public void setSnapToAlignment(int i11) {
        this.C = i11;
    }

    public void setSnapToEnd(boolean z11) {
        this.B = z11;
    }

    public void setSnapToStart(boolean z11) {
        this.A = z11;
    }

    @Override // com.facebook.react.uimanager.t
    public void updateClippingRect() {
        if (this.f55806m) {
            wf.a.c(this.f55801h);
            u.a(this, this.f55801h);
            View contentView = getContentView();
            if (contentView instanceof t) {
                ((t) contentView).updateClippingRect();
            }
        }
    }

    public void w(int i11, int i12) {
        f.p(this, i11, i12);
        B(i11, i12);
    }

    public void y(int i11, float f11, float f12) {
        this.E.c(i11, f11, f12);
    }

    public void z(float f11, int i11) {
        this.E.e(f11, i11);
    }
}