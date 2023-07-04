package com.stripe.android.paymentsheet.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.paymentsheet.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes6.dex */
public final class PrimaryButtonAnimator {
    public static final Companion Companion = new Companion(null);
    public static final long HOLD_ANIMATION_ON_SLIDE_IN_COMPLETION = 1500;
    private final Context context;
    private final long slideAnimationDuration;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PrimaryButtonAnimator(Context context) {
        s.g(context, "context");
        this.context = context;
        this.slideAnimationDuration = context.getResources().getInteger(17694720);
    }

    public static final /* synthetic */ void access$delay(PrimaryButtonAnimator primaryButtonAnimator, View view, h00.a aVar) {
        primaryButtonAnimator.delay(view, aVar);
    }

    public static final /* synthetic */ void access$slideToCenter(PrimaryButtonAnimator primaryButtonAnimator, View view, int i11, h00.a aVar) {
        primaryButtonAnimator.slideToCenter(view, i11, aVar);
    }

    public final void delay(View view, final h00.a<b0> aVar) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, "rotation", BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        animator.setDuration(HOLD_ANIMATION_ON_SLIDE_IN_COMPLETION);
        s.f(animator, "animator");
        animator.addListener(new Animator.AnimatorListener() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonAnimator$delay$lambda-4$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                s.g(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                s.g(animator2, "animator");
                h00.a.this.invoke();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
                s.g(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                s.g(animator2, "animator");
            }
        });
        animator.start();
    }

    public final void slideToCenter(final View view, int i11, final h00.a<b0> aVar) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, "translationX", BitmapDescriptorFactory.HUE_RED, -((view.getLeft() + ((view.getRight() - view.getLeft()) / 2.0f)) - (i11 / 2.0f)));
        animator.setDuration(this.slideAnimationDuration);
        s.f(animator, "animator");
        animator.addListener(new Animator.AnimatorListener() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonAnimator$slideToCenter$lambda-2$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                s.g(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                s.g(animator2, "animator");
                PrimaryButtonAnimator.access$delay(PrimaryButtonAnimator.this, view, aVar);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
                s.g(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                s.g(animator2, "animator");
            }
        });
        animator.start();
    }

    public final void fadeIn$paymentsheet_release(final View view, final int i11, final h00.a<b0> onAnimationEnd) {
        s.g(view, "view");
        s.g(onAnimationEnd, "onAnimationEnd");
        Animation loadAnimation = AnimationUtils.loadAnimation(this.context, R.anim.stripe_paymentsheet_transition_fade_in);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonAnimator$fadeIn$1$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view.setVisibility(0);
                PrimaryButtonAnimator.access$slideToCenter(this, view, i11, onAnimationEnd);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                view.setVisibility(0);
            }
        });
        view.startAnimation(loadAnimation);
    }

    public final void fadeOut$paymentsheet_release(final View view) {
        s.g(view, "view");
        Animation loadAnimation = AnimationUtils.loadAnimation(this.context, R.anim.stripe_paymentsheet_transition_fade_out);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonAnimator$fadeOut$1$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view.setVisibility(4);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                view.setVisibility(0);
            }
        });
        view.startAnimation(loadAnimation);
    }
}