package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class PaymentFlowViewPager extends androidx.viewpager.widget.b {
    public static final int $stable = 0;
    private final boolean isSwipingAllowed;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentFlowViewPager(Context context) {
        this(context, null, false, 6, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentFlowViewPager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, false, 4, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    public /* synthetic */ PaymentFlowViewPager(Context context, AttributeSet attributeSet, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? false : z11);
    }

    @Override // androidx.viewpager.widget.b, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.isSwipingAllowed) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.b, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.isSwipingAllowed) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentFlowViewPager(Context context, AttributeSet attributeSet, boolean z11) {
        super(context, attributeSet);
        kotlin.jvm.internal.s.g(context, "context");
        this.isSwipingAllowed = z11;
    }
}