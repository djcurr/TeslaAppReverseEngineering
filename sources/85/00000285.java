package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public class g0 extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private boolean f1775a;

    /* renamed from: b  reason: collision with root package name */
    private int f1776b;

    /* renamed from: c  reason: collision with root package name */
    private int f1777c;

    /* renamed from: d  reason: collision with root package name */
    private int f1778d;

    /* renamed from: e  reason: collision with root package name */
    private int f1779e;

    /* renamed from: f  reason: collision with root package name */
    private int f1780f;

    /* renamed from: g  reason: collision with root package name */
    private float f1781g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1782h;

    /* renamed from: i  reason: collision with root package name */
    private int[] f1783i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f1784j;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f1785k;

    /* renamed from: l  reason: collision with root package name */
    private int f1786l;

    /* renamed from: m  reason: collision with root package name */
    private int f1787m;

    /* renamed from: n  reason: collision with root package name */
    private int f1788n;

    /* renamed from: o  reason: collision with root package name */
    private int f1789o;

    /* loaded from: classes.dex */
    public static class a extends LinearLayout.LayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i11, int i12) {
            super(i11, i12);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public g0(Context context) {
        this(context, null);
    }

    private void A(View view, int i11, int i12, int i13, int i14) {
        view.layout(i11, i12, i13 + i11, i14 + i12);
    }

    private void k(int i11, int i12) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i13 = 0; i13 < i11; i13++) {
            View s11 = s(i13);
            if (s11.getVisibility() != 8) {
                a aVar = (a) s11.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i14 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = s11.getMeasuredWidth();
                    measureChildWithMargins(s11, i12, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i14;
                }
            }
        }
    }

    private void l(int i11, int i12) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i13 = 0; i13 < i11; i13++) {
            View s11 = s(i13);
            if (s11.getVisibility() != 8) {
                a aVar = (a) s11.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i14 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = s11.getMeasuredHeight();
                    measureChildWithMargins(s11, makeMeasureSpec, 0, i12, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i14;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    void g(Canvas canvas) {
        int right;
        int left;
        int i11;
        int left2;
        int virtualChildCount = getVirtualChildCount();
        boolean b11 = a1.b(this);
        for (int i12 = 0; i12 < virtualChildCount; i12++) {
            View s11 = s(i12);
            if (s11 != null && s11.getVisibility() != 8 && t(i12)) {
                a aVar = (a) s11.getLayoutParams();
                if (b11) {
                    left2 = s11.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin;
                } else {
                    left2 = (s11.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f1786l;
                }
                j(canvas, left2);
            }
        }
        if (t(virtualChildCount)) {
            View s12 = s(virtualChildCount - 1);
            if (s12 != null) {
                a aVar2 = (a) s12.getLayoutParams();
                if (b11) {
                    left = s12.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i11 = this.f1786l;
                    right = left - i11;
                } else {
                    right = s12.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (b11) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i11 = this.f1786l;
                right = left - i11;
            }
            j(canvas, right);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int i11;
        if (this.f1776b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i12 = this.f1776b;
        if (childCount > i12) {
            View childAt = getChildAt(i12);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f1776b == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i13 = this.f1777c;
            if (this.f1778d == 1 && (i11 = this.f1779e & 112) != 48) {
                if (i11 == 16) {
                    i13 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1780f) / 2;
                } else if (i11 == 80) {
                    i13 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1780f;
                }
            }
            return i13 + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1776b;
    }

    public Drawable getDividerDrawable() {
        return this.f1785k;
    }

    public int getDividerPadding() {
        return this.f1789o;
    }

    public int getDividerWidth() {
        return this.f1786l;
    }

    public int getGravity() {
        return this.f1779e;
    }

    public int getOrientation() {
        return this.f1778d;
    }

    public int getShowDividers() {
        return this.f1788n;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1781g;
    }

    void h(Canvas canvas) {
        int bottom;
        int virtualChildCount = getVirtualChildCount();
        for (int i11 = 0; i11 < virtualChildCount; i11++) {
            View s11 = s(i11);
            if (s11 != null && s11.getVisibility() != 8 && t(i11)) {
                i(canvas, (s11.getTop() - ((LinearLayout.LayoutParams) ((a) s11.getLayoutParams())).topMargin) - this.f1787m);
            }
        }
        if (t(virtualChildCount)) {
            View s12 = s(virtualChildCount - 1);
            if (s12 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.f1787m;
            } else {
                bottom = s12.getBottom() + ((LinearLayout.LayoutParams) ((a) s12.getLayoutParams())).bottomMargin;
            }
            i(canvas, bottom);
        }
    }

    void i(Canvas canvas, int i11) {
        this.f1785k.setBounds(getPaddingLeft() + this.f1789o, i11, (getWidth() - getPaddingRight()) - this.f1789o, this.f1787m + i11);
        this.f1785k.draw(canvas);
    }

    void j(Canvas canvas, int i11) {
        this.f1785k.setBounds(i11, getPaddingTop() + this.f1789o, this.f1786l + i11, (getHeight() - getPaddingBottom()) - this.f1789o);
        this.f1785k.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m */
    public a generateDefaultLayoutParams() {
        int i11 = this.f1778d;
        if (i11 == 0) {
            return new a(-2, -2);
        }
        if (i11 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: n */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f1785k == null) {
            return;
        }
        if (this.f1778d == 1) {
            h(canvas);
        } else {
            g(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        if (this.f1778d == 1) {
            v(i11, i12, i13, i14);
        } else {
            u(i11, i12, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        if (this.f1778d == 1) {
            z(i11, i12);
        } else {
            x(i11, i12);
        }
    }

    int p(View view, int i11) {
        return 0;
    }

    int q(View view) {
        return 0;
    }

    int r(View view) {
        return 0;
    }

    View s(int i11) {
        return getChildAt(i11);
    }

    public void setBaselineAligned(boolean z11) {
        this.f1775a = z11;
    }

    public void setBaselineAlignedChildIndex(int i11) {
        if (i11 >= 0 && i11 < getChildCount()) {
            this.f1776b = i11;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1785k) {
            return;
        }
        this.f1785k = drawable;
        if (drawable != null) {
            this.f1786l = drawable.getIntrinsicWidth();
            this.f1787m = drawable.getIntrinsicHeight();
        } else {
            this.f1786l = 0;
            this.f1787m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i11) {
        this.f1789o = i11;
    }

    public void setGravity(int i11) {
        if (this.f1779e != i11) {
            if ((8388615 & i11) == 0) {
                i11 |= 8388611;
            }
            if ((i11 & 112) == 0) {
                i11 |= 48;
            }
            this.f1779e = i11;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i11) {
        int i12 = i11 & 8388615;
        int i13 = this.f1779e;
        if ((8388615 & i13) != i12) {
            this.f1779e = i12 | ((-8388616) & i13);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z11) {
        this.f1782h = z11;
    }

    public void setOrientation(int i11) {
        if (this.f1778d != i11) {
            this.f1778d = i11;
            requestLayout();
        }
    }

    public void setShowDividers(int i11) {
        if (i11 != this.f1788n) {
            requestLayout();
        }
        this.f1788n = i11;
    }

    public void setVerticalGravity(int i11) {
        int i12 = i11 & 112;
        int i13 = this.f1779e;
        if ((i13 & 112) != i12) {
            this.f1779e = i12 | (i13 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f11) {
        this.f1781g = Math.max((float) BitmapDescriptorFactory.HUE_RED, f11);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean t(int i11) {
        if (i11 == 0) {
            return (this.f1788n & 1) != 0;
        } else if (i11 == getChildCount()) {
            return (this.f1788n & 4) != 0;
        } else if ((this.f1788n & 2) != 0) {
            for (int i12 = i11 - 1; i12 >= 0; i12--) {
                if (getChildAt(i12).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void u(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.g0.u(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void v(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.f1779e
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L3b
            r0 = 80
            if (r1 == r0) goto L2f
            int r0 = r17.getPaddingTop()
            goto L47
        L2f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.f1780f
            int r0 = r0 - r1
            goto L47
        L3b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f1780f
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L47:
            r1 = 0
            r12 = r1
        L49:
            if (r12 >= r10) goto Lcb
            android.view.View r13 = r6.s(r12)
            r14 = 1
            if (r13 != 0) goto L59
            int r1 = r6.y(r12)
            int r0 = r0 + r1
            goto Lc7
        L59:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto Lc7
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.g0$a r5 = (androidx.appcompat.widget.g0.a) r5
            int r1 = r5.gravity
            if (r1 >= 0) goto L75
            r1 = r11
        L75:
            int r2 = androidx.core.view.a0.F(r17)
            int r1 = androidx.core.view.e.b(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L8d
            r2 = 5
            if (r1 == r2) goto L88
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L98
        L88:
            int r1 = r8 - r4
            int r2 = r5.rightMargin
            goto L97
        L8d:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
            int r2 = r5.rightMargin
        L97:
            int r1 = r1 - r2
        L98:
            r2 = r1
            boolean r1 = r6.t(r12)
            if (r1 == 0) goto La2
            int r1 = r6.f1787m
            int r0 = r0 + r1
        La2:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.q(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.A(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.r(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.p(r13, r12)
            int r12 = r12 + r0
            r0 = r16
            r1 = 1
            goto Lc8
        Lc7:
            r1 = r14
        Lc8:
            int r12 = r12 + r1
            goto L49
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.g0.v(int, int, int, int):void");
    }

    void w(View view, int i11, int i12, int i13, int i14, int i15) {
        measureChildWithMargins(view, i12, i13, i14, i15);
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void x(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.g0.x(int, int):void");
    }

    int y(int i11) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0325  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void z(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.g0.z(int, int):void");
    }

    public g0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public g0(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f1775a = true;
        this.f1776b = -1;
        this.f1777c = 0;
        this.f1779e = 8388659;
        int[] iArr = g.j.Q0;
        u0 v11 = u0.v(context, attributeSet, iArr, i11, 0);
        androidx.core.view.a0.u0(this, context, iArr, attributeSet, v11.r(), i11, 0);
        int k11 = v11.k(g.j.S0, -1);
        if (k11 >= 0) {
            setOrientation(k11);
        }
        int k12 = v11.k(g.j.R0, -1);
        if (k12 >= 0) {
            setGravity(k12);
        }
        boolean a11 = v11.a(g.j.T0, true);
        if (!a11) {
            setBaselineAligned(a11);
        }
        this.f1781g = v11.i(g.j.V0, -1.0f);
        this.f1776b = v11.k(g.j.U0, -1);
        this.f1782h = v11.a(g.j.Y0, false);
        setDividerDrawable(v11.g(g.j.W0));
        this.f1788n = v11.k(g.j.Z0, 0);
        this.f1789o = v11.f(g.j.X0, 0);
        v11.w();
    }
}