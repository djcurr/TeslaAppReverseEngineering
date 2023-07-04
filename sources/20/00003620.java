package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public class BaselineLayout extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private int f15371a;

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f15371a = -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.f15371a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i13 - i11) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i16 = ((paddingRight - measuredWidth) / 2) + paddingLeft;
                int baseline = (this.f15371a == -1 || childAt.getBaseline() == -1) ? paddingTop : (this.f15371a + paddingTop) - childAt.getBaseline();
                childAt.layout(i16, baseline, measuredWidth + i16, measuredHeight + baseline);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int childCount = getChildCount();
        int i13 = -1;
        int i14 = -1;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i11, i12);
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    i13 = Math.max(i13, baseline);
                    i14 = Math.max(i14, childAt.getMeasuredHeight() - baseline);
                }
                i16 = Math.max(i16, childAt.getMeasuredWidth());
                i15 = Math.max(i15, childAt.getMeasuredHeight());
                i17 = View.combineMeasuredStates(i17, childAt.getMeasuredState());
            }
        }
        if (i13 != -1) {
            i15 = Math.max(i15, Math.max(i14, getPaddingBottom()) + i13);
            this.f15371a = i13;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i16, getSuggestedMinimumWidth()), i11, i17), View.resolveSizeAndState(Math.max(i15, getSuggestedMinimumHeight()), i12, i17 << 16));
    }
}