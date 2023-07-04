package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private boolean f1558a;

    /* renamed from: b  reason: collision with root package name */
    private int f1559b;

    /* renamed from: c  reason: collision with root package name */
    private int f1560c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1559b = -1;
        this.f1560c = 0;
        int[] iArr = g.j.J0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        androidx.core.view.a0.u0(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f1558a = obtainStyledAttributes.getBoolean(g.j.K0, true);
        obtainStyledAttributes.recycle();
    }

    private int a(int i11) {
        int childCount = getChildCount();
        while (i11 < childCount) {
            if (getChildAt(i11).getVisibility() == 0) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    private boolean b() {
        return getOrientation() == 1;
    }

    private void setStacked(boolean z11) {
        setOrientation(z11 ? 1 : 0);
        setGravity(z11 ? 8388613 : 80);
        View findViewById = findViewById(g.f.G);
        if (findViewById != null) {
            findViewById.setVisibility(z11 ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(this.f1560c, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        boolean z11;
        int size = View.MeasureSpec.getSize(i11);
        int i14 = 0;
        if (this.f1558a) {
            if (size > this.f1559b && b()) {
                setStacked(false);
            }
            this.f1559b = size;
        }
        if (b() || View.MeasureSpec.getMode(i11) != 1073741824) {
            i13 = i11;
            z11 = false;
        } else {
            i13 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z11 = true;
        }
        super.onMeasure(i13, i12);
        if (this.f1558a && !b()) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                setStacked(true);
                z11 = true;
            }
        }
        if (z11) {
            super.onMeasure(i11, i12);
        }
        int a11 = a(0);
        if (a11 >= 0) {
            View childAt = getChildAt(a11);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (b()) {
                int a12 = a(a11 + 1);
                if (a12 >= 0) {
                    paddingTop += getChildAt(a12).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i14 = paddingTop;
            } else {
                i14 = paddingTop + getPaddingBottom();
            }
        }
        if (androidx.core.view.a0.G(this) != i14) {
            setMinimumHeight(i14);
        }
    }

    public void setAllowStacking(boolean z11) {
        if (this.f1558a != z11) {
            this.f1558a = z11;
            if (!z11 && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}