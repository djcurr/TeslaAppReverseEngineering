package wg;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.a0;
import com.facebook.react.uimanager.d;
import com.facebook.react.uimanager.events.i;
import com.facebook.react.uimanager.k;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.t;
import com.facebook.react.uimanager.u;
import com.facebook.react.uimanager.y;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Field;
import java.util.List;
import wg.f;

/* loaded from: classes3.dex */
public class e extends ScrollView implements t, ViewGroup.OnHierarchyChangeListener, View.OnLayoutChangeListener, d.a, y, f.d, f.c {
    private static Field P = null;
    private static boolean Q = false;
    private boolean A;
    private int B;
    private View C;
    private com.facebook.react.views.view.f E;
    private int F;
    private int G;
    private final com.facebook.react.uimanager.d H;
    private final f.C1269f K;
    private final ValueAnimator L;
    private q O;

    /* renamed from: a  reason: collision with root package name */
    private final b f55821a;

    /* renamed from: b  reason: collision with root package name */
    private final OverScroller f55822b;

    /* renamed from: c  reason: collision with root package name */
    private final h f55823c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f55824d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f55825e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f55826f;

    /* renamed from: g  reason: collision with root package name */
    private Rect f55827g;

    /* renamed from: h  reason: collision with root package name */
    private String f55828h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f55829i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f55830j;

    /* renamed from: k  reason: collision with root package name */
    private Runnable f55831k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f55832l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f55833m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f55834n;

    /* renamed from: o  reason: collision with root package name */
    private wg.a f55835o;

    /* renamed from: p  reason: collision with root package name */
    private String f55836p;

    /* renamed from: q  reason: collision with root package name */
    private Drawable f55837q;

    /* renamed from: t  reason: collision with root package name */
    private int f55838t;

    /* renamed from: w  reason: collision with root package name */
    private boolean f55839w;

    /* renamed from: x  reason: collision with root package name */
    private int f55840x;

    /* renamed from: y  reason: collision with root package name */
    private List<Integer> f55841y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f55842z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private boolean f55843a = false;

        /* renamed from: b  reason: collision with root package name */
        private boolean f55844b = true;

        /* renamed from: c  reason: collision with root package name */
        private int f55845c = 0;

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f55826f) {
                e.this.f55826f = false;
                this.f55845c = 0;
                this.f55844b = true;
            } else {
                f.q(e.this);
                int i11 = this.f55845c + 1;
                this.f55845c = i11;
                this.f55844b = i11 < 3;
                if (!e.this.f55830j || this.f55843a) {
                    if (e.this.f55834n) {
                        f.h(e.this);
                    }
                    e.this.i();
                } else {
                    this.f55843a = true;
                    e.this.l(0);
                    a0.p0(e.this, this, 20L);
                }
            }
            if (!this.f55844b) {
                e.this.f55831k = null;
            } else {
                a0.p0(e.this, this, 20L);
            }
        }
    }

    public e(Context context, wg.a aVar) {
        super(context);
        this.f55821a = new b();
        this.f55823c = new h();
        this.f55824d = new Rect();
        this.f55825e = new Rect();
        this.f55828h = "hidden";
        this.f55830j = false;
        this.f55833m = true;
        this.f55835o = null;
        this.f55838t = 0;
        this.f55839w = false;
        this.f55840x = 0;
        this.f55842z = true;
        this.A = true;
        this.B = 0;
        this.F = -1;
        this.G = -1;
        this.H = new com.facebook.react.uimanager.d();
        this.K = new f.C1269f(0);
        this.L = ObjectAnimator.ofInt(this, "scrollY", 0, 0);
        this.O = q.AUTO;
        this.f55835o = aVar;
        this.E = new com.facebook.react.views.view.f(this);
        this.f55822b = getOverScrollerFromParent();
        setOnHierarchyChangeListener(this);
        setScrollBarStyle(33554432);
    }

    private View getContentView() {
        return getChildAt(0);
    }

    private int getMaxScrollY() {
        return Math.max(0, this.C.getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
    }

    private OverScroller getOverScrollerFromParent() {
        if (!Q) {
            Q = true;
            try {
                Field declaredField = ScrollView.class.getDeclaredField("mScroller");
                P = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                nd.a.G("ReactNative", "Failed to get mScroller field for ScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = P;
        OverScroller overScroller = null;
        if (field != null) {
            try {
                Object obj = field.get(this);
                if (obj instanceof OverScroller) {
                    overScroller = (OverScroller) obj;
                } else {
                    nd.a.G("ReactNative", "Failed to cast mScroller field in ScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
                }
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("Failed to get mScroller from ScrollView!", e11);
            }
        }
        return overScroller;
    }

    private int getSnapInterval() {
        int i11 = this.f55840x;
        return i11 != 0 ? i11 : getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (p()) {
            wf.a.c(this.f55835o);
            wf.a.c(this.f55836p);
            this.f55835o.b(this.f55836p);
        }
    }

    private void j() {
        if (p()) {
            wf.a.c(this.f55835o);
            wf.a.c(this.f55836p);
            this.f55835o.a(this.f55836p);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(int i11) {
        int min;
        int i12;
        int floor;
        int i13;
        int top;
        int top2;
        int height;
        int i14;
        OverScroller overScroller;
        if (getChildCount() <= 0) {
            return;
        }
        if (this.f55840x == 0 && this.f55841y == null && this.B == 0) {
            x(i11);
            return;
        }
        int i15 = 1;
        int i16 = 0;
        boolean z11 = getFlingAnimator() != this.L;
        int maxScrollY = getMaxScrollY();
        int q11 = q(i11);
        if (this.f55839w) {
            q11 = getScrollY();
        }
        int height2 = (getHeight() - getPaddingBottom()) - getPaddingTop();
        List<Integer> list = this.f55841y;
        if (list != null) {
            i13 = list.get(0).intValue();
            List<Integer> list2 = this.f55841y;
            i12 = list2.get(list2.size() - 1).intValue();
            min = maxScrollY;
            floor = 0;
            for (int i17 = 0; i17 < this.f55841y.size(); i17++) {
                int intValue = this.f55841y.get(i17).intValue();
                if (intValue <= q11 && q11 - intValue < q11 - floor) {
                    floor = intValue;
                }
                if (intValue >= q11 && intValue - q11 < min - q11) {
                    min = intValue;
                }
            }
        } else {
            int i18 = this.B;
            if (i18 != 0) {
                int i19 = this.f55840x;
                if (i19 > 0) {
                    double d11 = q11 / i19;
                    double floor2 = Math.floor(d11);
                    int i21 = this.f55840x;
                    int max = Math.max(n(i18, (int) (floor2 * i21), i21, height2), 0);
                    int i22 = this.B;
                    double ceil = Math.ceil(d11);
                    int i23 = this.f55840x;
                    min = Math.min(n(i22, (int) (ceil * i23), i23, height2), maxScrollY);
                    i12 = maxScrollY;
                    floor = max;
                } else {
                    ViewGroup viewGroup = (ViewGroup) getContentView();
                    int i24 = maxScrollY;
                    int i25 = i24;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    while (i26 < viewGroup.getChildCount()) {
                        View childAt = viewGroup.getChildAt(i26);
                        int i29 = this.B;
                        if (i29 != i15) {
                            if (i29 == 2) {
                                top2 = childAt.getTop();
                                height = (height2 - childAt.getHeight()) / 2;
                            } else if (i29 == 3) {
                                top2 = childAt.getTop();
                                height = height2 - childAt.getHeight();
                            } else {
                                throw new IllegalStateException("Invalid SnapToAlignment value: " + this.B);
                            }
                            top = top2 - height;
                        } else {
                            top = childAt.getTop();
                        }
                        if (top <= q11 && q11 - top < q11 - i27) {
                            i27 = top;
                        }
                        if (top >= q11 && top - q11 < i25 - q11) {
                            i25 = top;
                        }
                        i24 = Math.min(i24, top);
                        i28 = Math.max(i28, top);
                        i26++;
                        i15 = 1;
                    }
                    floor = Math.max(i27, i24);
                    min = Math.min(i25, i28);
                    i12 = maxScrollY;
                }
            } else {
                double snapInterval = getSnapInterval();
                double d12 = q11 / snapInterval;
                min = Math.min((int) (Math.ceil(d12) * snapInterval), maxScrollY);
                i12 = maxScrollY;
                floor = (int) (Math.floor(d12) * snapInterval);
            }
            i13 = 0;
        }
        int i31 = q11 - floor;
        int i32 = min - q11;
        int i33 = Math.abs(i31) < Math.abs(i32) ? floor : min;
        if (!this.A && q11 >= i12) {
            if (getScrollY() < i12) {
                i14 = i11;
                q11 = i12;
            }
            i14 = i11;
        } else if (!this.f55842z && q11 <= i13) {
            if (getScrollY() > i13) {
                i14 = i11;
                q11 = i13;
            }
            i14 = i11;
        } else if (i11 > 0) {
            i14 = !z11 ? i11 + ((int) (i32 * 10.0d)) : i11;
            q11 = min;
        } else if (i11 < 0) {
            i14 = !z11 ? i11 - ((int) (i31 * 10.0d)) : i11;
            q11 = floor;
        } else {
            i14 = i11;
            q11 = i33;
        }
        int min2 = Math.min(Math.max(0, q11), maxScrollY);
        if (!z11 && (overScroller = this.f55822b) != null) {
            this.f55826f = true;
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            if (i14 == 0) {
                i14 = min2 - getScrollY();
            }
            int i34 = i14;
            if (min2 == 0 || min2 == maxScrollY) {
                i16 = height2 / 2;
            }
            overScroller.fling(scrollX, scrollY, 0, i34, 0, 0, min2, min2, 0, i16);
            postInvalidateOnAnimation();
            return;
        }
        r(getScrollX(), min2);
    }

    private int n(int i11, int i12, int i13, int i14) {
        int i15;
        if (i11 != 1) {
            if (i11 == 2) {
                i15 = (i14 - i13) / 2;
            } else if (i11 != 3) {
                throw new IllegalStateException("Invalid SnapToAlignment value: " + this.B);
            } else {
                i15 = i14 - i13;
            }
            return i12 - i15;
        }
        return i12;
    }

    private void o(int i11, int i12) {
        if (this.f55831k != null) {
            return;
        }
        if (this.f55834n) {
            j();
            f.g(this, i11, i12);
        }
        this.f55826f = false;
        a aVar = new a();
        this.f55831k = aVar;
        a0.p0(this, aVar, 20L);
    }

    private boolean p() {
        String str;
        return (this.f55835o == null || (str = this.f55836p) == null || str.isEmpty()) ? false : true;
    }

    private int q(int i11) {
        if (getFlingAnimator() == this.L) {
            return f.n(this, 0, i11, 0, getMaxScrollY()).y;
        }
        return m(i11) + f.k(this, getScrollY(), getReactScrollViewScrollState().b().y, i11);
    }

    private void s(View view) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            scrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
        }
    }

    private void w(int i11, int i12) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getWidth() != 0 && childAt.getHeight() != 0) {
            this.F = -1;
            this.G = -1;
            return;
        }
        this.F = i11;
        this.G = i12;
    }

    private void x(int i11) {
        double snapInterval = getSnapInterval();
        double k11 = f.k(this, getScrollY(), getReactScrollViewScrollState().b().y, i11);
        double d11 = k11 / snapInterval;
        int floor = (int) Math.floor(d11);
        int ceil = (int) Math.ceil(d11);
        int round = (int) Math.round(d11);
        int round2 = (int) Math.round(q(i11) / snapInterval);
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
            this.f55826f = true;
            r(getScrollX(), (int) d12);
        }
    }

    private void y(int i11) {
        getReactScrollViewScrollState().m(i11);
        f.i(this);
    }

    @Override // wg.f.c
    public void a(int i11, int i12) {
        this.L.cancel();
        this.L.setDuration(f.j(getContext())).setIntValues(i11, i12);
        this.L.start();
    }

    @Override // android.widget.ScrollView, android.view.View
    public void draw(Canvas canvas) {
        if (this.f55838t != 0) {
            View childAt = getChildAt(0);
            if (this.f55837q != null && childAt != null && childAt.getBottom() < getHeight()) {
                this.f55837q.setBounds(0, childAt.getBottom(), getWidth(), getHeight());
                this.f55837q.draw(canvas);
            }
        }
        getDrawingRect(this.f55824d);
        String str = this.f55828h;
        str.hashCode();
        if (!str.equals("visible")) {
            canvas.clipRect(this.f55824d);
        }
        super.draw(canvas);
    }

    @Override // android.widget.ScrollView
    public boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.f55833m || !(keyCode == 19 || keyCode == 20)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.widget.ScrollView
    public void fling(int i11) {
        float signum = Math.signum(this.f55821a.b());
        if (signum == BitmapDescriptorFactory.HUE_RED) {
            signum = Math.signum(i11);
        }
        int abs = (int) (Math.abs(i11) * signum);
        if (this.f55830j) {
            l(abs);
        } else if (this.f55822b != null) {
            this.f55822b.fling(getScrollX(), getScrollY(), 0, abs, 0, 0, 0, Integer.MAX_VALUE, 0, ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
            a0.n0(this);
        } else {
            super.fling(abs);
        }
        o(0, abs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return super.getChildVisibleRect(view, rect, point);
    }

    @Override // com.facebook.react.uimanager.t
    public void getClippingRect(Rect rect) {
        rect.set((Rect) wf.a.c(this.f55827g));
    }

    @Override // com.facebook.react.uimanager.d.a
    public com.facebook.react.uimanager.d getFabricViewStateManager() {
        return this.H;
    }

    @Override // wg.f.c
    public ValueAnimator getFlingAnimator() {
        return this.L;
    }

    @Override // com.facebook.react.uimanager.x
    public String getOverflow() {
        return this.f55828h;
    }

    @Override // com.facebook.react.uimanager.y
    public Rect getOverflowInset() {
        return this.f55825e;
    }

    public q getPointerEvents() {
        return this.O;
    }

    @Override // wg.f.d
    public f.C1269f getReactScrollViewScrollState() {
        return this.K;
    }

    @Override // com.facebook.react.uimanager.t
    public boolean getRemoveClippedSubviews() {
        return this.f55832l;
    }

    public void k() {
        awakenScrollBars();
    }

    public int m(int i11) {
        return f.n(this, 0, i11, 0, getMaxScrollY()).y;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f55832l) {
            updateClippingRect();
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        this.C = view2;
        view2.addOnLayoutChangeListener(this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
        this.C.removeOnLayoutChangeListener(this);
        this.C = null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String str = (String) getTag(com.facebook.react.h.f11877k);
        if (str != null) {
            accessibilityNodeInfo.setViewIdResourceName(str);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f55833m) {
            if (q.canChildrenBeTouchTarget(this.O)) {
                try {
                    if (super.onInterceptTouchEvent(motionEvent)) {
                        i.a(this, motionEvent);
                        f.b(this);
                        this.f55829i = true;
                        j();
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

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15 = this.F;
        if (i15 == -1) {
            i15 = getScrollX();
        }
        int i16 = this.G;
        if (i16 == -1) {
            i16 = getScrollY();
        }
        scrollTo(i15, i16);
        f.a(this);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (this.C == null) {
            return;
        }
        int scrollY = getScrollY();
        int maxScrollY = getMaxScrollY();
        if (scrollY > maxScrollY) {
            scrollTo(getScrollX(), maxScrollY);
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        k.a(i11, i12);
        setMeasuredDimension(View.MeasureSpec.getSize(i11), View.MeasureSpec.getSize(i12));
    }

    @Override // android.widget.ScrollView, android.view.View
    protected void onOverScrolled(int i11, int i12, boolean z11, boolean z12) {
        int maxScrollY;
        OverScroller overScroller = this.f55822b;
        if (overScroller != null && this.C != null && !overScroller.isFinished() && this.f55822b.getCurrY() != this.f55822b.getFinalY() && i12 >= (maxScrollY = getMaxScrollY())) {
            this.f55822b.abortAnimation();
            i12 = maxScrollY;
        }
        super.onOverScrolled(i11, i12, z11, z12);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i11, int i12, int i13, int i14) {
        super.onScrollChanged(i11, i12, i13, i14);
        this.f55826f = true;
        if (this.f55821a.c(i11, i12)) {
            if (this.f55832l) {
                updateClippingRect();
            }
            f.s(this, this.f55821a.a(), this.f55821a.b());
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (this.f55832l) {
            updateClippingRect();
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f55833m && q.canBeTouchTarget(this.O)) {
            this.f55823c.a(motionEvent);
            if ((motionEvent.getAction() & 255) == 1 && this.f55829i) {
                f.q(this);
                float b11 = this.f55823c.b();
                float c11 = this.f55823c.c();
                f.c(this, b11, c11);
                this.f55829i = false;
                o(Math.round(b11), Math.round(c11));
            }
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void r(int i11, int i12) {
        f.p(this, i11, i12);
        w(i11, i12);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (view2 != null) {
            s(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.widget.ScrollView, android.view.View
    public void scrollTo(int i11, int i12) {
        super.scrollTo(i11, i12);
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        f.r(this, scrollX, scrollY);
        w(scrollX, scrollY);
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
        OverScroller overScroller = this.f55822b;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f11);
        }
    }

    public void setDisableIntervalMomentum(boolean z11) {
        this.f55839w = z11;
    }

    public void setEndFillColor(int i11) {
        if (i11 != this.f55838t) {
            this.f55838t = i11;
            this.f55837q = new ColorDrawable(this.f55838t);
        }
    }

    public void setOverflow(String str) {
        this.f55828h = str;
        invalidate();
    }

    @Override // com.facebook.react.uimanager.y
    public void setOverflowInset(int i11, int i12, int i13, int i14) {
        this.f55825e.set(i11, i12, i13, i14);
    }

    public void setPagingEnabled(boolean z11) {
        this.f55830j = z11;
    }

    public void setPointerEvents(q qVar) {
        this.O = qVar;
    }

    public void setRemoveClippedSubviews(boolean z11) {
        if (z11 && this.f55827g == null) {
            this.f55827g = new Rect();
        }
        this.f55832l = z11;
        updateClippingRect();
    }

    public void setScrollAwayTopPaddingEnabledUnstable(int i11) {
        int childCount = getChildCount();
        wf.a.b(childCount == 1, "React Native ScrollView always has exactly 1 child; a content View");
        if (childCount > 0) {
            for (int i12 = 0; i12 < childCount; i12++) {
                getChildAt(i12).setTranslationY(i11);
            }
            setPadding(0, 0, 0, i11);
        }
        y(i11);
        setRemoveClippedSubviews(this.f55832l);
    }

    public void setScrollEnabled(boolean z11) {
        this.f55833m = z11;
    }

    public void setScrollPerfTag(String str) {
        this.f55836p = str;
    }

    public void setSendMomentumEvents(boolean z11) {
        this.f55834n = z11;
    }

    public void setSnapInterval(int i11) {
        this.f55840x = i11;
    }

    public void setSnapOffsets(List<Integer> list) {
        this.f55841y = list;
    }

    public void setSnapToAlignment(int i11) {
        this.B = i11;
    }

    public void setSnapToEnd(boolean z11) {
        this.A = z11;
    }

    public void setSnapToStart(boolean z11) {
        this.f55842z = z11;
    }

    public void t(int i11, float f11, float f12) {
        this.E.c(i11, f11, f12);
    }

    public void u(float f11, int i11) {
        this.E.e(f11, i11);
    }

    @Override // com.facebook.react.uimanager.t
    public void updateClippingRect() {
        if (this.f55832l) {
            wf.a.c(this.f55827g);
            u.a(this, this.f55827g);
            View childAt = getChildAt(0);
            if (childAt instanceof t) {
                ((t) childAt).updateClippingRect();
            }
        }
    }

    public void v(int i11, float f11) {
        this.E.g(i11, f11);
    }
}