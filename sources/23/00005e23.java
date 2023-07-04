package com.swmansion.reanimated.transitions;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.view.ViewGroup;
import androidx.transition.b0;
import androidx.transition.d;
import androidx.transition.e;
import androidx.transition.e0;
import androidx.transition.y;

/* loaded from: classes6.dex */
final class ChangeTransition extends y {
    private final e mChangeTransform = new e();
    private final d mChangeBounds = new d();

    @Override // androidx.transition.y
    public void captureEndValues(e0 e0Var) {
        this.mChangeTransform.captureEndValues(e0Var);
        this.mChangeBounds.captureEndValues(e0Var);
    }

    @Override // androidx.transition.y
    public void captureStartValues(e0 e0Var) {
        this.mChangeTransform.captureStartValues(e0Var);
        this.mChangeBounds.captureStartValues(e0Var);
    }

    @Override // androidx.transition.y
    public Animator createAnimator(ViewGroup viewGroup, e0 e0Var, e0 e0Var2) {
        this.mChangeTransform.f(false);
        Animator createAnimator = this.mChangeTransform.createAnimator(viewGroup, e0Var, e0Var2);
        Animator createAnimator2 = this.mChangeBounds.createAnimator(viewGroup, e0Var, e0Var2);
        if (createAnimator == null) {
            return createAnimator2;
        }
        if (createAnimator2 == null) {
            return createAnimator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(createAnimator, createAnimator2);
        return animatorSet;
    }

    @Override // androidx.transition.y
    public y setDuration(long j11) {
        this.mChangeTransform.setDuration(j11);
        this.mChangeBounds.setDuration(j11);
        return super.setDuration(j11);
    }

    @Override // androidx.transition.y
    public y setInterpolator(TimeInterpolator timeInterpolator) {
        this.mChangeTransform.setInterpolator(timeInterpolator);
        this.mChangeBounds.setInterpolator(timeInterpolator);
        return super.setInterpolator(timeInterpolator);
    }

    @Override // androidx.transition.y
    public void setPropagation(b0 b0Var) {
        this.mChangeTransform.setPropagation(b0Var);
        this.mChangeBounds.setPropagation(b0Var);
        super.setPropagation(b0Var);
    }

    @Override // androidx.transition.y
    public y setStartDelay(long j11) {
        this.mChangeTransform.setStartDelay(j11);
        this.mChangeBounds.setStartDelay(j11);
        return super.setStartDelay(j11);
    }
}