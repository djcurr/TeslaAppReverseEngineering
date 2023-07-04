package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import androidx.core.view.a0;
import androidx.core.view.r;
import androidx.core.view.t;
import androidx.recyclerview.widget.l;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import w3.c;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements r, androidx.core.view.o, ScrollingView {
    private static final a F = new a();
    private static final int[] G = {16843130};
    private final t A;
    private final androidx.core.view.p B;
    private float C;
    private b E;

    /* renamed from: a  reason: collision with root package name */
    private long f4588a;

    /* renamed from: b  reason: collision with root package name */
    private final Rect f4589b;

    /* renamed from: c  reason: collision with root package name */
    private OverScroller f4590c;

    /* renamed from: d  reason: collision with root package name */
    public EdgeEffect f4591d;

    /* renamed from: e  reason: collision with root package name */
    public EdgeEffect f4592e;

    /* renamed from: f  reason: collision with root package name */
    private int f4593f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f4594g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f4595h;

    /* renamed from: i  reason: collision with root package name */
    private View f4596i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f4597j;

    /* renamed from: k  reason: collision with root package name */
    private VelocityTracker f4598k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f4599l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f4600m;

    /* renamed from: n  reason: collision with root package name */
    private int f4601n;

    /* renamed from: o  reason: collision with root package name */
    private int f4602o;

    /* renamed from: p  reason: collision with root package name */
    private int f4603p;

    /* renamed from: q  reason: collision with root package name */
    private int f4604q;

    /* renamed from: t  reason: collision with root package name */
    private final int[] f4605t;

    /* renamed from: w  reason: collision with root package name */
    private final int[] f4606w;

    /* renamed from: x  reason: collision with root package name */
    private int f4607x;

    /* renamed from: y  reason: collision with root package name */
    private int f4608y;

    /* renamed from: z  reason: collision with root package name */
    private c f4609z;

    /* loaded from: classes.dex */
    static class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            w3.e.a(accessibilityEvent, nestedScrollView.getScrollX());
            w3.e.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, w3.c cVar) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(view, cVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            cVar.c0(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            cVar.D0(true);
            if (nestedScrollView.getScrollY() > 0) {
                cVar.b(c.a.f55458l);
                cVar.b(c.a.f55462p);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                cVar.b(c.a.f55457k);
                cVar.b(c.a.f55464r);
            }
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
            if (super.performAccessibilityAction(view, i11, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (nestedScrollView.isEnabled()) {
                if (i11 != 4096) {
                    if (i11 == 8192 || i11 == 16908344) {
                        int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                        if (max != nestedScrollView.getScrollY()) {
                            nestedScrollView.P(0, max, true);
                            return true;
                        }
                        return false;
                    } else if (i11 != 16908346) {
                        return false;
                    }
                }
                int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min != nestedScrollView.getScrollY()) {
                    nestedScrollView.P(0, min, true);
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(NestedScrollView nestedScrollView, int i11, int i12, int i13, int i14);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends View.BaseSavedState {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f4610a;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<c> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public c[] newArray(int i11) {
                return new c[i11];
            }
        }

        c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f4610a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f4610a);
        }

        c(Parcel parcel) {
            super(parcel);
            this.f4610a = parcel.readInt();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j3.a.f33149c);
    }

    private static boolean A(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && A((View) parent, view2);
    }

    private boolean B(View view, int i11, int i12) {
        view.getDrawingRect(this.f4589b);
        offsetDescendantRectToMyCoords(view, this.f4589b);
        return this.f4589b.bottom + i11 >= getScrollY() && this.f4589b.top - i11 <= getScrollY() + i12;
    }

    private void C(int i11, int i12, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i11);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.B.e(0, scrollY2, 0, i11 - scrollY2, null, i12, iArr);
    }

    private void D(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4604q) {
            int i11 = actionIndex == 0 ? 1 : 0;
            this.f4593f = (int) motionEvent.getY(i11);
            this.f4604q = motionEvent.getPointerId(i11);
            VelocityTracker velocityTracker = this.f4598k;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void G() {
        VelocityTracker velocityTracker = this.f4598k;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4598k = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int H(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f4591d
            float r0 = androidx.core.widget.h.b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L31
            android.widget.EdgeEffect r0 = r3.f4591d
            float r4 = -r4
            float r4 = androidx.core.widget.h.d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f4591d
            float r5 = androidx.core.widget.h.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f4591d
            r5.onRelease()
        L2f:
            r1 = r4
            goto L54
        L31:
            android.widget.EdgeEffect r0 = r3.f4592e
            float r0 = androidx.core.widget.h.b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            android.widget.EdgeEffect r0 = r3.f4592e
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.h.d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f4592e
            float r5 = androidx.core.widget.h.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f4592e
            r5.onRelease()
            goto L2f
        L54:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L63
            r3.invalidate()
        L63:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.H(int, float):int");
    }

    private void I(boolean z11) {
        if (z11) {
            Q(2, 1);
        } else {
            S(1);
        }
        this.f4608y = getScrollY();
        a0.n0(this);
    }

    private boolean J(int i11, int i12, int i13) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i14 = height + scrollY;
        boolean z11 = false;
        boolean z12 = i11 == 33;
        View r11 = r(z12, i12, i13);
        if (r11 == null) {
            r11 = this;
        }
        if (i12 < scrollY || i13 > i14) {
            i(z12 ? i12 - scrollY : i13 - i14);
            z11 = true;
        }
        if (r11 != findFocus()) {
            r11.requestFocus(i11);
        }
        return z11;
    }

    private void K(View view) {
        view.getDrawingRect(this.f4589b);
        offsetDescendantRectToMyCoords(view, this.f4589b);
        int f11 = f(this.f4589b);
        if (f11 != 0) {
            scrollBy(0, f11);
        }
    }

    private boolean L(Rect rect, boolean z11) {
        int f11 = f(rect);
        boolean z12 = f11 != 0;
        if (z12) {
            if (z11) {
                scrollBy(0, f11);
            } else {
                M(0, f11);
            }
        }
        return z12;
    }

    private void N(int i11, int i12, int i13, boolean z11) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f4588a > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int scrollY = getScrollY();
            OverScroller overScroller = this.f4590c;
            int scrollX = getScrollX();
            overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i12 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i13);
            I(z11);
        } else {
            if (!this.f4590c.isFinished()) {
                b();
            }
            scrollBy(i11, i12);
        }
        this.f4588a = AnimationUtils.currentAnimationTimeMillis();
    }

    private boolean R(MotionEvent motionEvent) {
        boolean z11;
        if (h.b(this.f4591d) != BitmapDescriptorFactory.HUE_RED) {
            h.d(this.f4591d, BitmapDescriptorFactory.HUE_RED, motionEvent.getY() / getHeight());
            z11 = true;
        } else {
            z11 = false;
        }
        if (h.b(this.f4592e) != BitmapDescriptorFactory.HUE_RED) {
            h.d(this.f4592e, BitmapDescriptorFactory.HUE_RED, 1.0f - (motionEvent.getY() / getHeight()));
            return true;
        }
        return z11;
    }

    private void b() {
        this.f4590c.abortAnimation();
        S(1);
    }

    private boolean d() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
        }
        return false;
    }

    private static int e(int i11, int i12, int i13) {
        if (i12 >= i13 || i11 < 0) {
            return 0;
        }
        return i12 + i11 > i13 ? i13 - i12 : i11;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.C == BitmapDescriptorFactory.HUE_RED) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.C = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.C;
    }

    private void i(int i11) {
        if (i11 != 0) {
            if (this.f4600m) {
                M(0, i11);
            } else {
                scrollBy(0, i11);
            }
        }
    }

    private boolean l(int i11) {
        if (h.b(this.f4591d) != BitmapDescriptorFactory.HUE_RED) {
            this.f4591d.onAbsorb(i11);
        } else if (h.b(this.f4592e) == BitmapDescriptorFactory.HUE_RED) {
            return false;
        } else {
            this.f4592e.onAbsorb(-i11);
        }
        return true;
    }

    private void p() {
        this.f4597j = false;
        G();
        S(0);
        this.f4591d.onRelease();
        this.f4592e.onRelease();
    }

    private View r(boolean z11, int i11, int i12) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z12 = false;
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) focusables.get(i13);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i11 < bottom && top < i12) {
                boolean z13 = i11 < top && bottom < i12;
                if (view == null) {
                    view = view2;
                    z12 = z13;
                } else {
                    boolean z14 = (z11 && top < view.getTop()) || (!z11 && bottom > view.getBottom());
                    if (z12) {
                        if (z13) {
                            if (!z14) {
                            }
                            view = view2;
                        }
                    } else if (z13) {
                        view = view2;
                        z12 = true;
                    } else {
                        if (!z14) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    private boolean v(int i11, int i12) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            return i12 >= childAt.getTop() - scrollY && i12 < childAt.getBottom() - scrollY && i11 >= childAt.getLeft() && i11 < childAt.getRight();
        }
        return false;
    }

    private void w() {
        VelocityTracker velocityTracker = this.f4598k;
        if (velocityTracker == null) {
            this.f4598k = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void x() {
        this.f4590c = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f4601n = viewConfiguration.getScaledTouchSlop();
        this.f4602o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4603p = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void y() {
        if (this.f4598k == null) {
            this.f4598k = VelocityTracker.obtain();
        }
    }

    private boolean z(View view) {
        return !B(view, 0, getHeight());
    }

    boolean E(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z11) {
        boolean z12;
        boolean z13;
        int overScrollMode = getOverScrollMode();
        boolean z14 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z15 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z16 = overScrollMode == 0 || (overScrollMode == 1 && z14);
        boolean z17 = overScrollMode == 0 || (overScrollMode == 1 && z15);
        int i19 = i13 + i11;
        int i21 = !z16 ? 0 : i17;
        int i22 = i14 + i12;
        int i23 = !z17 ? 0 : i18;
        int i24 = -i21;
        int i25 = i21 + i15;
        int i26 = -i23;
        int i27 = i23 + i16;
        if (i19 > i25) {
            i19 = i25;
            z12 = true;
        } else if (i19 < i24) {
            z12 = true;
            i19 = i24;
        } else {
            z12 = false;
        }
        if (i22 > i27) {
            i22 = i27;
            z13 = true;
        } else if (i22 < i26) {
            z13 = true;
            i22 = i26;
        } else {
            z13 = false;
        }
        if (z13 && !u(1)) {
            this.f4590c.springBack(i19, i22, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i19, i22, z12, z13);
        return z12 || z13;
    }

    public boolean F(int i11) {
        boolean z11 = i11 == 130;
        int height = getHeight();
        if (z11) {
            this.f4589b.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f4589b;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f4589b.top = getScrollY() - height;
            Rect rect2 = this.f4589b;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f4589b;
        int i12 = rect3.top;
        int i13 = height + i12;
        rect3.bottom = i13;
        return J(i11, i12, i13);
    }

    public final void M(int i11, int i12) {
        N(i11, i12, l.f.DEFAULT_SWIPE_ANIMATION_DURATION, false);
    }

    void O(int i11, int i12, int i13, boolean z11) {
        N(i11 - getScrollX(), i12 - getScrollY(), i13, z11);
    }

    void P(int i11, int i12, boolean z11) {
        O(i11, i12, l.f.DEFAULT_SWIPE_ANIMATION_DURATION, z11);
    }

    public boolean Q(int i11, int i12) {
        return this.B.q(i11, i12);
    }

    public void S(int i11) {
        this.B.s(i11);
    }

    @Override // androidx.core.view.q
    public void a(View view, View view2, int i11, int i12) {
        this.A.c(view, view2, i11, i12);
        Q(2, i12);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public boolean c(int i11) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i11);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && B(findNextFocus, maxScrollAmount, getHeight())) {
            findNextFocus.getDrawingRect(this.f4589b);
            offsetDescendantRectToMyCoords(findNextFocus, this.f4589b);
            i(f(this.f4589b));
            findNextFocus.requestFocus(i11);
        } else {
            if (i11 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i11 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i11 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            i(maxScrollAmount);
        }
        if (findFocus != null && findFocus.isFocused() && z(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
            return true;
        }
        return true;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f4590c.isFinished()) {
            return;
        }
        this.f4590c.computeScrollOffset();
        int currY = this.f4590c.getCurrY();
        int i11 = currY - this.f4608y;
        this.f4608y = currY;
        int[] iArr = this.f4606w;
        boolean z11 = false;
        iArr[1] = 0;
        g(0, i11, iArr, null, 1);
        int i12 = i11 - this.f4606w[1];
        int scrollRange = getScrollRange();
        if (i12 != 0) {
            int scrollY = getScrollY();
            E(0, i12, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i13 = i12 - scrollY2;
            int[] iArr2 = this.f4606w;
            iArr2[1] = 0;
            h(0, scrollY2, 0, i13, this.f4605t, 1, iArr2);
            i12 = i13 - this.f4606w[1];
        }
        if (i12 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z11 = true;
            }
            if (z11) {
                if (i12 < 0) {
                    if (this.f4591d.isFinished()) {
                        this.f4591d.onAbsorb((int) this.f4590c.getCurrVelocity());
                    }
                } else if (this.f4592e.isFinished()) {
                    this.f4592e.onAbsorb((int) this.f4590c.getCurrVelocity());
                }
            }
            b();
        }
        if (!this.f4590c.isFinished()) {
            a0.n0(this);
        } else {
            S(1);
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || q(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f11, float f12, boolean z11) {
        return this.B.a(f11, f12, z11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f11, float f12) {
        return this.B.b(f11, f12);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i11, int i12, int[] iArr, int[] iArr2) {
        return g(i11, i12, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i11, int i12, int i13, int i14, int[] iArr) {
        return this.B.f(i11, i12, i13, i14, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i11 = 0;
        if (!this.f4591d.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 < 21 || getClipToPadding()) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft() + 0;
            } else {
                paddingLeft = 0;
            }
            if (i12 >= 21 && getClipToPadding()) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(paddingLeft, min);
            this.f4591d.setSize(width, height);
            if (this.f4591d.draw(canvas)) {
                a0.n0(this);
            }
            canvas.restoreToCount(save);
        }
        if (this.f4592e.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 21 || getClipToPadding()) {
            width2 -= getPaddingLeft() + getPaddingRight();
            i11 = 0 + getPaddingLeft();
        }
        if (i13 >= 21 && getClipToPadding()) {
            height2 -= getPaddingTop() + getPaddingBottom();
            max -= getPaddingBottom();
        }
        canvas.translate(i11 - width2, max);
        canvas.rotate(180.0f, width2, BitmapDescriptorFactory.HUE_RED);
        this.f4592e.setSize(width2, height2);
        if (this.f4592e.draw(canvas)) {
            a0.n0(this);
        }
        canvas.restoreToCount(save2);
    }

    protected int f(Rect rect) {
        int i11;
        int i12;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i14 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i13 - verticalFadingEdgeLength : i13;
        int i15 = rect.bottom;
        if (i15 > i14 && rect.top > scrollY) {
            if (rect.height() > height) {
                i12 = rect.top - scrollY;
            } else {
                i12 = rect.bottom - i14;
            }
            return Math.min(i12 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i13);
        } else if (rect.top >= scrollY || i15 >= i14) {
            return 0;
        } else {
            if (rect.height() > height) {
                i11 = 0 - (i14 - rect.bottom);
            } else {
                i11 = 0 - (scrollY - rect.top);
            }
            return Math.max(i11, -getScrollY());
        }
    }

    public boolean g(int i11, int i12, int[] iArr, int[] iArr2, int i13) {
        return this.B.d(i11, i12, iArr, iArr2, i13);
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.A.a();
    }

    int getScrollRange() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return 0;
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public void h(int i11, int i12, int i13, int i14, int[] iArr, int i15, int[] iArr2) {
        this.B.e(i11, i12, i13, i14, iArr, i15, iArr2);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return u(0);
    }

    @Override // android.view.View, androidx.core.view.o
    public boolean isNestedScrollingEnabled() {
        return this.B.m();
    }

    @Override // androidx.core.view.q
    public void j(View view, int i11) {
        this.A.e(view, i11);
        S(i11);
    }

    @Override // androidx.core.view.q
    public void k(View view, int i11, int i12, int[] iArr, int i13) {
        g(i11, i12, iArr, null, i13);
    }

    @Override // androidx.core.view.r
    public void m(View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        C(i14, i15, iArr);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i11, int i12) {
        view.measure(FrameLayout.getChildMeasureSpec(i11, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i11, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i12, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // androidx.core.view.q
    public void n(View view, int i11, int i12, int i13, int i14, int i15) {
        C(i14, i15, null);
    }

    @Override // androidx.core.view.q
    public boolean o(View view, View view2, int i11, int i12) {
        return (i11 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4595h = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f4597j) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != BitmapDescriptorFactory.HUE_RED) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z11 = true;
        if (action == 2 && this.f4597j) {
            return true;
        }
        int i11 = action & 255;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    int i12 = this.f4604q;
                    if (i12 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i12);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i12 + " in onInterceptTouchEvent");
                        } else {
                            int y11 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y11 - this.f4593f) > this.f4601n && (2 & getNestedScrollAxes()) == 0) {
                                this.f4597j = true;
                                this.f4593f = y11;
                                y();
                                this.f4598k.addMovement(motionEvent);
                                this.f4607x = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i11 != 3) {
                    if (i11 == 6) {
                        D(motionEvent);
                    }
                }
            }
            this.f4597j = false;
            this.f4604q = -1;
            G();
            if (this.f4590c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                a0.n0(this);
            }
            S(0);
        } else {
            int y12 = (int) motionEvent.getY();
            if (!v((int) motionEvent.getX(), y12)) {
                if (!R(motionEvent) && this.f4590c.isFinished()) {
                    z11 = false;
                }
                this.f4597j = z11;
                G();
            } else {
                this.f4593f = y12;
                this.f4604q = motionEvent.getPointerId(0);
                w();
                this.f4598k.addMovement(motionEvent);
                this.f4590c.computeScrollOffset();
                if (!R(motionEvent) && this.f4590c.isFinished()) {
                    z11 = false;
                }
                this.f4597j = z11;
                Q(2, 0);
            }
        }
        return this.f4597j;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        int i15 = 0;
        this.f4594g = false;
        View view = this.f4596i;
        if (view != null && A(view, this)) {
            K(this.f4596i);
        }
        this.f4596i = null;
        if (!this.f4595h) {
            if (this.f4609z != null) {
                scrollTo(getScrollX(), this.f4609z.f4610a);
                this.f4609z = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i15 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i14 - i12) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int e11 = e(scrollY, paddingTop, i15);
            if (e11 != scrollY) {
                scrollTo(getScrollX(), e11);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f4595h = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (this.f4599l && View.MeasureSpec.getMode(i12) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i11, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public boolean onNestedFling(View view, float f11, float f12, boolean z11) {
        if (z11) {
            return false;
        }
        dispatchNestedFling(BitmapDescriptorFactory.HUE_RED, f12, true);
        s((int) f12);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public boolean onNestedPreFling(View view, float f11, float f12) {
        return dispatchNestedPreFling(f11, f12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
        k(view, i11, i12, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        C(i14, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public void onNestedScrollAccepted(View view, View view2, int i11) {
        a(view, view2, i11, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i11, int i12, boolean z11, boolean z12) {
        super.scrollTo(i11, i12);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i11, Rect rect) {
        View findNextFocusFromRect;
        if (i11 == 2) {
            i11 = com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE;
        } else if (i11 == 1) {
            i11 = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i11);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i11);
        }
        if (findNextFocusFromRect == null || z(findNextFocusFromRect)) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i11, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.f4609z = cVar;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f4610a = getScrollY();
        return cVar;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i11, int i12, int i13, int i14) {
        super.onScrollChanged(i11, i12, i13, i14);
        b bVar = this.E;
        if (bVar != null) {
            bVar.a(this, i11, i12, i13, i14);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !B(findFocus, 0, i14)) {
            return;
        }
        findFocus.getDrawingRect(this.f4589b);
        offsetDescendantRectToMyCoords(findFocus, this.f4589b);
        i(f(this.f4589b));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public boolean onStartNestedScroll(View view, View view2, int i11) {
        return o(view, view2, i11, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public void onStopNestedScroll(View view) {
        j(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01d8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean q(KeyEvent keyEvent) {
        this.f4589b.setEmpty();
        boolean d11 = d();
        int i11 = com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE;
        if (!d11) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE)) ? false : true;
        } else if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                if (!keyEvent.isAltPressed()) {
                    return c(33);
                }
                return t(33);
            } else if (keyCode == 20) {
                if (!keyEvent.isAltPressed()) {
                    return c(com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
                }
                return t(com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
            } else if (keyCode != 62) {
                return false;
            } else {
                if (keyEvent.isShiftPressed()) {
                    i11 = 33;
                }
                F(i11);
                return false;
            }
        } else {
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f4594g) {
            K(view2);
        } else {
            this.f4596i = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z11) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return L(rect, z11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        if (z11) {
            G();
        }
        super.requestDisallowInterceptTouchEvent(z11);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f4594g = true;
        super.requestLayout();
    }

    public void s(int i11) {
        if (getChildCount() > 0) {
            this.f4590c.fling(getScrollX(), getScrollY(), 0, i11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            I(true);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i11, int i12) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int e11 = e(i11, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int e12 = e(i12, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (e11 == getScrollX() && e12 == getScrollY()) {
                return;
            }
            super.scrollTo(e11, e12);
        }
    }

    public void setFillViewport(boolean z11) {
        if (z11 != this.f4599l) {
            this.f4599l = z11;
            requestLayout();
        }
    }

    @Override // android.view.View, androidx.core.view.o
    public void setNestedScrollingEnabled(boolean z11) {
        this.B.n(z11);
    }

    public void setOnScrollChangeListener(b bVar) {
        this.E = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z11) {
        this.f4600m = z11;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i11) {
        return Q(i11, 0);
    }

    @Override // android.view.View, androidx.core.view.o
    public void stopNestedScroll() {
        S(0);
    }

    public boolean t(int i11) {
        int childCount;
        boolean z11 = i11 == 130;
        int height = getHeight();
        Rect rect = this.f4589b;
        rect.top = 0;
        rect.bottom = height;
        if (z11 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f4589b.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f4589b;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f4589b;
        return J(i11, rect3.top, rect3.bottom);
    }

    public boolean u(int i11) {
        return this.B.l(i11);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f4589b = new Rect();
        this.f4594g = true;
        this.f4595h = false;
        this.f4596i = null;
        this.f4597j = false;
        this.f4600m = true;
        this.f4604q = -1;
        this.f4605t = new int[2];
        this.f4606w = new int[2];
        this.f4591d = h.a(context, attributeSet);
        this.f4592e = h.a(context, attributeSet);
        x();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, G, i11, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.A = new t(this);
        this.B = new androidx.core.view.p(this);
        setNestedScrollingEnabled(true);
        a0.w0(this, F);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11) {
        if (getChildCount() <= 0) {
            super.addView(view, i11);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i11, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}