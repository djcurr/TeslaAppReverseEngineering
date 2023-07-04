package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.a0;

/* loaded from: classes3.dex */
public class c extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private int f15421a;

    /* renamed from: b  reason: collision with root package name */
    private int f15422b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f15423c;

    /* renamed from: d  reason: collision with root package name */
    private int f15424d;

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static int a(int i11, int i12, int i13) {
        if (i12 != Integer.MIN_VALUE) {
            return i12 != 1073741824 ? i13 : i11;
        }
        return Math.min(i13, i11);
    }

    private void d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, fk.k.f26550f1, 0, 0);
        this.f15421a = obtainStyledAttributes.getDimensionPixelSize(fk.k.f26562h1, 0);
        this.f15422b = obtainStyledAttributes.getDimensionPixelSize(fk.k.f26556g1, 0);
        obtainStyledAttributes.recycle();
    }

    public int b(View view) {
        Object tag = view.getTag(fk.f.H);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public boolean c() {
        return this.f15423c;
    }

    protected int getItemSpacing() {
        return this.f15422b;
    }

    protected int getLineSpacing() {
        return this.f15421a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getRowCount() {
        return this.f15424d;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        if (getChildCount() == 0) {
            this.f15424d = 0;
            return;
        }
        this.f15424d = 1;
        boolean z12 = a0.F(this) == 1;
        int paddingRight = z12 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z12 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i17 = (i13 - i11) - paddingLeft;
        int i18 = paddingRight;
        int i19 = paddingTop;
        for (int i21 = 0; i21 < getChildCount(); i21++) {
            View childAt = getChildAt(i21);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(fk.f.H, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i16 = androidx.core.view.h.b(marginLayoutParams);
                    i15 = androidx.core.view.h.a(marginLayoutParams);
                } else {
                    i15 = 0;
                    i16 = 0;
                }
                int measuredWidth = i18 + i16 + childAt.getMeasuredWidth();
                if (!this.f15423c && measuredWidth > i17) {
                    i19 = this.f15421a + paddingTop;
                    this.f15424d++;
                    i18 = paddingRight;
                }
                childAt.setTag(fk.f.H, Integer.valueOf(this.f15424d - 1));
                int i22 = i18 + i16;
                int measuredWidth2 = childAt.getMeasuredWidth() + i22;
                int measuredHeight = childAt.getMeasuredHeight() + i19;
                if (z12) {
                    childAt.layout(i17 - measuredWidth2, i19, (i17 - i18) - i16, measuredHeight);
                } else {
                    childAt.layout(i22, i19, measuredWidth2, measuredHeight);
                }
                i18 += i16 + i15 + childAt.getMeasuredWidth() + this.f15422b;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int size = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        int mode2 = View.MeasureSpec.getMode(i12);
        int i16 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i16 - getPaddingRight();
        int i17 = paddingTop;
        int i18 = 0;
        for (int i19 = 0; i19 < getChildCount(); i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i11, i12);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i13 = marginLayoutParams.leftMargin + 0;
                    i14 = marginLayoutParams.rightMargin + 0;
                } else {
                    i13 = 0;
                    i14 = 0;
                }
                int i21 = paddingLeft;
                if (paddingLeft + i13 + childAt.getMeasuredWidth() <= paddingRight || c()) {
                    i15 = i21;
                } else {
                    i15 = getPaddingLeft();
                    i17 = this.f15421a + paddingTop;
                }
                int measuredWidth = i15 + i13 + childAt.getMeasuredWidth();
                int measuredHeight = i17 + childAt.getMeasuredHeight();
                if (measuredWidth > i18) {
                    i18 = measuredWidth;
                }
                paddingLeft = i15 + i13 + i14 + childAt.getMeasuredWidth() + this.f15422b;
                if (i19 == getChildCount() - 1) {
                    i18 += i14;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(a(size, mode, i18 + getPaddingRight()), a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setItemSpacing(int i11) {
        this.f15422b = i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setLineSpacing(int i11) {
        this.f15421a = i11;
    }

    public void setSingleLine(boolean z11) {
        this.f15423c = z11;
    }

    public c(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f15423c = false;
        d(context, attributeSet);
    }
}