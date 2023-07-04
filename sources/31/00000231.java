package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.j;
import androidx.core.view.l0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements a0, androidx.core.view.s, androidx.core.view.q, androidx.core.view.r {
    static final int[] O = {g.a.f27040b, 16842841};
    private androidx.core.view.l0 A;
    private androidx.core.view.l0 B;
    private d C;
    private OverScroller E;
    ViewPropertyAnimator F;
    final AnimatorListenerAdapter G;
    private final Runnable H;
    private final Runnable K;
    private final androidx.core.view.t L;

    /* renamed from: a  reason: collision with root package name */
    private int f1513a;

    /* renamed from: b  reason: collision with root package name */
    private int f1514b;

    /* renamed from: c  reason: collision with root package name */
    private ContentFrameLayout f1515c;

    /* renamed from: d  reason: collision with root package name */
    ActionBarContainer f1516d;

    /* renamed from: e  reason: collision with root package name */
    private b0 f1517e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f1518f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1519g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1520h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1521i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f1522j;

    /* renamed from: k  reason: collision with root package name */
    boolean f1523k;

    /* renamed from: l  reason: collision with root package name */
    private int f1524l;

    /* renamed from: m  reason: collision with root package name */
    private int f1525m;

    /* renamed from: n  reason: collision with root package name */
    private final Rect f1526n;

    /* renamed from: o  reason: collision with root package name */
    private final Rect f1527o;

    /* renamed from: p  reason: collision with root package name */
    private final Rect f1528p;

    /* renamed from: q  reason: collision with root package name */
    private final Rect f1529q;

    /* renamed from: t  reason: collision with root package name */
    private final Rect f1530t;

    /* renamed from: w  reason: collision with root package name */
    private final Rect f1531w;

    /* renamed from: x  reason: collision with root package name */
    private final Rect f1532x;

    /* renamed from: y  reason: collision with root package name */
    private androidx.core.view.l0 f1533y;

    /* renamed from: z  reason: collision with root package name */
    private androidx.core.view.l0 f1534z;

    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.F = null;
            actionBarOverlayLayout.f1523k = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.F = null;
            actionBarOverlayLayout.f1523k = false;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.F = actionBarOverlayLayout.f1516d.animate().translationY(BitmapDescriptorFactory.HUE_RED).setListener(ActionBarOverlayLayout.this.G);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.F = actionBarOverlayLayout.f1516d.animate().translationY(-ActionBarOverlayLayout.this.f1516d.getHeight()).setListener(ActionBarOverlayLayout.this.G);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();

        void b(int i11);

        void c();

        void d(boolean z11);

        void e();

        void f();
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i11, int i12) {
            super(i11, i12);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1514b = 0;
        this.f1526n = new Rect();
        this.f1527o = new Rect();
        this.f1528p = new Rect();
        this.f1529q = new Rect();
        this.f1530t = new Rect();
        this.f1531w = new Rect();
        this.f1532x = new Rect();
        androidx.core.view.l0 l0Var = androidx.core.view.l0.f4534b;
        this.f1533y = l0Var;
        this.f1534z = l0Var;
        this.A = l0Var;
        this.B = l0Var;
        this.G = new a();
        this.H = new b();
        this.K = new c();
        v(context);
        this.L = new androidx.core.view.t(this);
    }

    private void A() {
        u();
        this.H.run();
    }

    private boolean B(float f11) {
        this.E.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.E.getFinalY() > this.f1516d.getHeight();
    }

    private void p() {
        u();
        this.K.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean q(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.q(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    private b0 t(View view) {
        if (view instanceof b0) {
            return (b0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(O);
        this.f1513a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1518f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1519g = context.getApplicationInfo().targetSdkVersion < 19;
        this.E = new OverScroller(context);
    }

    private void x() {
        u();
        postDelayed(this.K, 600L);
    }

    private void y() {
        u();
        postDelayed(this.H, 600L);
    }

    @Override // androidx.core.view.q
    public void a(View view, View view2, int i11, int i12) {
        if (i12 == 0) {
            onNestedScrollAccepted(view, view2, i11);
        }
    }

    @Override // androidx.appcompat.widget.a0
    public boolean b() {
        z();
        return this.f1517e.b();
    }

    @Override // androidx.appcompat.widget.a0
    public boolean c() {
        z();
        return this.f1517e.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.a0
    public boolean d() {
        z();
        return this.f1517e.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1518f == null || this.f1519g) {
            return;
        }
        int bottom = this.f1516d.getVisibility() == 0 ? (int) (this.f1516d.getBottom() + this.f1516d.getTranslationY() + 0.5f) : 0;
        this.f1518f.setBounds(0, bottom, getWidth(), this.f1518f.getIntrinsicHeight() + bottom);
        this.f1518f.draw(canvas);
    }

    @Override // androidx.appcompat.widget.a0
    public void e(Menu menu, j.a aVar) {
        z();
        this.f1517e.e(menu, aVar);
    }

    @Override // androidx.appcompat.widget.a0
    public boolean f() {
        z();
        return this.f1517e.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        z();
        boolean q11 = q(this.f1516d, rect, true, true, false, true);
        this.f1529q.set(rect);
        a1.a(this, this.f1529q, this.f1526n);
        if (!this.f1530t.equals(this.f1529q)) {
            this.f1530t.set(this.f1529q);
            q11 = true;
        }
        if (!this.f1527o.equals(this.f1526n)) {
            this.f1527o.set(this.f1526n);
            q11 = true;
        }
        if (q11) {
            requestLayout();
        }
        return true;
    }

    @Override // androidx.appcompat.widget.a0
    public void g() {
        z();
        this.f1517e.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1516d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.L.a();
    }

    public CharSequence getTitle() {
        z();
        return this.f1517e.getTitle();
    }

    @Override // androidx.appcompat.widget.a0
    public boolean h() {
        z();
        return this.f1517e.h();
    }

    @Override // androidx.appcompat.widget.a0
    public void i(int i11) {
        z();
        if (i11 == 2) {
            this.f1517e.p();
        } else if (i11 == 5) {
            this.f1517e.x();
        } else if (i11 != 109) {
        } else {
            setOverlayMode(true);
        }
    }

    @Override // androidx.core.view.q
    public void j(View view, int i11) {
        if (i11 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.q
    public void k(View view, int i11, int i12, int[] iArr, int i13) {
        if (i13 == 0) {
            onNestedPreScroll(view, i11, i12, iArr);
        }
    }

    @Override // androidx.appcompat.widget.a0
    public void l() {
        z();
        this.f1517e.r();
    }

    @Override // androidx.core.view.r
    public void m(View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        n(view, i11, i12, i13, i14, i15);
    }

    @Override // androidx.core.view.q
    public void n(View view, int i11, int i12, int i13, int i14, int i15) {
        if (i15 == 0) {
            onNestedScroll(view, i11, i12, i13, i14);
        }
    }

    @Override // androidx.core.view.q
    public boolean o(View view, View view2, int i11, int i12) {
        return i12 == 0 && onStartNestedScroll(view, view2, i11);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        z();
        androidx.core.view.l0 x11 = androidx.core.view.l0.x(windowInsets, this);
        boolean q11 = q(this.f1516d, new Rect(x11.k(), x11.m(), x11.l(), x11.j()), true, true, false, true);
        androidx.core.view.a0.h(this, x11, this.f1526n);
        Rect rect = this.f1526n;
        androidx.core.view.l0 n11 = x11.n(rect.left, rect.top, rect.right, rect.bottom);
        this.f1533y = n11;
        boolean z11 = true;
        if (!this.f1534z.equals(n11)) {
            this.f1534z = this.f1533y;
            q11 = true;
        }
        if (this.f1527o.equals(this.f1526n)) {
            z11 = q11;
        } else {
            this.f1527o.set(this.f1526n);
        }
        if (z11) {
            requestLayout();
        }
        return x11.a().c().b().v();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        androidx.core.view.a0.t0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i17 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i16, i17, measuredWidth + i16, measuredHeight + i17);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int measuredHeight;
        z();
        measureChildWithMargins(this.f1516d, i11, 0, i12, 0);
        e eVar = (e) this.f1516d.getLayoutParams();
        int max = Math.max(0, this.f1516d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f1516d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1516d.getMeasuredState());
        boolean z11 = (androidx.core.view.a0.R(this) & 256) != 0;
        if (z11) {
            measuredHeight = this.f1513a;
            if (this.f1521i && this.f1516d.getTabContainer() != null) {
                measuredHeight += this.f1513a;
            }
        } else {
            measuredHeight = this.f1516d.getVisibility() != 8 ? this.f1516d.getMeasuredHeight() : 0;
        }
        this.f1528p.set(this.f1526n);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 21) {
            this.A = this.f1533y;
        } else {
            this.f1531w.set(this.f1529q);
        }
        if (!this.f1520h && !z11) {
            Rect rect = this.f1528p;
            rect.top += measuredHeight;
            rect.bottom += 0;
            if (i13 >= 21) {
                this.A = this.A.n(0, measuredHeight, 0, 0);
            }
        } else if (i13 >= 21) {
            this.A = new l0.b(this.A).c(m3.b.b(this.A.k(), this.A.m() + measuredHeight, this.A.l(), this.A.j() + 0)).a();
        } else {
            Rect rect2 = this.f1531w;
            rect2.top += measuredHeight;
            rect2.bottom += 0;
        }
        q(this.f1515c, this.f1528p, true, true, true, true);
        if (i13 >= 21 && !this.B.equals(this.A)) {
            androidx.core.view.l0 l0Var = this.A;
            this.B = l0Var;
            androidx.core.view.a0.i(this.f1515c, l0Var);
        } else if (i13 < 21 && !this.f1532x.equals(this.f1531w)) {
            this.f1532x.set(this.f1531w);
            this.f1515c.a(this.f1531w);
        }
        measureChildWithMargins(this.f1515c, i11, 0, i12, 0);
        e eVar2 = (e) this.f1515c.getLayoutParams();
        int max3 = Math.max(max, this.f1515c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f1515c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1515c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i11, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i12, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public boolean onNestedFling(View view, float f11, float f12, boolean z11) {
        if (this.f1522j && z11) {
            if (B(f12)) {
                p();
            } else {
                A();
            }
            this.f1523k = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public boolean onNestedPreFling(View view, float f11, float f12) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        int i15 = this.f1524l + i12;
        this.f1524l = i15;
        setActionBarHideOffset(i15);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public void onNestedScrollAccepted(View view, View view2, int i11) {
        this.L.b(view, view2, i11);
        this.f1524l = getActionBarHideOffset();
        u();
        d dVar = this.C;
        if (dVar != null) {
            dVar.f();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public boolean onStartNestedScroll(View view, View view2, int i11) {
        if ((i11 & 2) == 0 || this.f1516d.getVisibility() != 0) {
            return false;
        }
        return this.f1522j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public void onStopNestedScroll(View view) {
        if (this.f1522j && !this.f1523k) {
            if (this.f1524l <= this.f1516d.getHeight()) {
                y();
            } else {
                x();
            }
        }
        d dVar = this.C;
        if (dVar != null) {
            dVar.c();
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i11) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i11);
        }
        z();
        int i12 = this.f1525m ^ i11;
        this.f1525m = i11;
        boolean z11 = (i11 & 4) == 0;
        boolean z12 = (i11 & 256) != 0;
        d dVar = this.C;
        if (dVar != null) {
            dVar.d(!z12);
            if (!z11 && z12) {
                this.C.e();
            } else {
                this.C.a();
            }
        }
        if ((i12 & 256) == 0 || this.C == null) {
            return;
        }
        androidx.core.view.a0.t0(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i11) {
        super.onWindowVisibilityChanged(i11);
        this.f1514b = i11;
        d dVar = this.C;
        if (dVar != null) {
            dVar.b(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: r */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: s */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i11) {
        u();
        this.f1516d.setTranslationY(-Math.max(0, Math.min(i11, this.f1516d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.C = dVar;
        if (getWindowToken() != null) {
            this.C.b(this.f1514b);
            int i11 = this.f1525m;
            if (i11 != 0) {
                onWindowSystemUiVisibilityChanged(i11);
                androidx.core.view.a0.t0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z11) {
        this.f1521i = z11;
    }

    public void setHideOnContentScrollEnabled(boolean z11) {
        if (z11 != this.f1522j) {
            this.f1522j = z11;
            if (z11) {
                return;
            }
            u();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i11) {
        z();
        this.f1517e.setIcon(i11);
    }

    public void setLogo(int i11) {
        z();
        this.f1517e.t(i11);
    }

    public void setOverlayMode(boolean z11) {
        this.f1520h = z11;
        this.f1519g = z11 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z11) {
    }

    public void setUiOptions(int i11) {
    }

    @Override // androidx.appcompat.widget.a0
    public void setWindowCallback(Window.Callback callback) {
        z();
        this.f1517e.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.a0
    public void setWindowTitle(CharSequence charSequence) {
        z();
        this.f1517e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    void u() {
        removeCallbacks(this.H);
        removeCallbacks(this.K);
        ViewPropertyAnimator viewPropertyAnimator = this.F;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean w() {
        return this.f1520h;
    }

    void z() {
        if (this.f1515c == null) {
            this.f1515c = (ContentFrameLayout) findViewById(g.f.f27116b);
            this.f1516d = (ActionBarContainer) findViewById(g.f.f27117c);
            this.f1517e = t(findViewById(g.f.f27115a));
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        z();
        this.f1517e.setIcon(drawable);
    }
}