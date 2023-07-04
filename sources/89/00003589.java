package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes3.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    private int f14887a;

    /* renamed from: b  reason: collision with root package name */
    private int f14888b;

    /* renamed from: c  reason: collision with root package name */
    private int f14889c;

    /* renamed from: d  reason: collision with root package name */
    private ViewPropertyAnimator f14890d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f14890d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f14887a = 0;
        this.f14888b = 2;
        this.f14889c = 0;
    }

    private void F(V v11, int i11, long j11, TimeInterpolator timeInterpolator) {
        this.f14890d = v11.animate().translationY(i11).setInterpolator(timeInterpolator).setDuration(j11).setListener(new a());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v11, View view, View view2, int i11, int i12) {
        return i11 == 2;
    }

    public boolean G() {
        return this.f14888b == 1;
    }

    public boolean H() {
        return this.f14888b == 2;
    }

    public void I(V v11, int i11) {
        this.f14889c = i11;
        if (this.f14888b == 1) {
            v11.setTranslationY(this.f14887a + i11);
        }
    }

    public void J(V v11) {
        K(v11, true);
    }

    public void K(V v11, boolean z11) {
        if (G()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f14890d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v11.clearAnimation();
        }
        this.f14888b = 1;
        int i11 = this.f14887a + this.f14889c;
        if (z11) {
            F(v11, i11, 175L, gk.a.f27995c);
        } else {
            v11.setTranslationY(i11);
        }
    }

    public void L(V v11) {
        M(v11, true);
    }

    public void M(V v11, boolean z11) {
        if (H()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f14890d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v11.clearAnimation();
        }
        this.f14888b = 2;
        if (z11) {
            F(v11, 0, 225L, gk.a.f27996d);
        } else {
            v11.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v11, int i11) {
        this.f14887a = v11.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v11.getLayoutParams()).bottomMargin;
        return super.l(coordinatorLayout, v11, i11);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, V v11, View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        if (i12 > 0) {
            J(v11);
        } else if (i12 < 0) {
            L(v11);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14887a = 0;
        this.f14888b = 2;
        this.f14889c = 0;
    }
}