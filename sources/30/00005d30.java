package com.stripe.android.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class ViewWidthAnimator {
    private final long duration;
    private final View view;

    public ViewWidthAnimator(View view, long j11) {
        kotlin.jvm.internal.s.g(view, "view");
        this.view = view;
        this.duration = j11;
    }

    public static /* synthetic */ void a(ViewWidthAnimator viewWidthAnimator, ValueAnimator valueAnimator) {
        m548animate$lambda2$lambda1(viewWidthAnimator, valueAnimator);
    }

    public static final /* synthetic */ View access$getView$p(ViewWidthAnimator viewWidthAnimator) {
        return viewWidthAnimator.view;
    }

    /* renamed from: animate$lambda-2$lambda-1 */
    public static final void m548animate$lambda2$lambda1(ViewWidthAnimator this$0, ValueAnimator valueAnimator) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        View view = this$0.view;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams.width = intValue;
        view.setLayoutParams(layoutParams);
    }

    public final void animate(int i11, final int i12, final h00.a<vz.b0> onAnimationEnd) {
        kotlin.jvm.internal.s.g(onAnimationEnd, "onAnimationEnd");
        ValueAnimator duration = ValueAnimator.ofInt(i11, i12).setDuration(this.duration);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.stripe.android.view.p0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ViewWidthAnimator.a(ViewWidthAnimator.this, valueAnimator);
            }
        });
        duration.addListener(new AnimatorListenerAdapter() { // from class: com.stripe.android.view.ViewWidthAnimator$animate$1$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                View access$getView$p = ViewWidthAnimator.access$getView$p(ViewWidthAnimator.this);
                int i13 = i12;
                ViewGroup.LayoutParams layoutParams = access$getView$p.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                layoutParams.width = i13;
                access$getView$p.setLayoutParams(layoutParams);
                onAnimationEnd.invoke();
            }
        });
        duration.start();
    }
}