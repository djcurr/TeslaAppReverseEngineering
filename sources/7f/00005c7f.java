package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.stripe.android.R;
import com.stripe.android.databinding.CardWidgetProgressViewBinding;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class CardWidgetProgressView extends FrameLayout {
    private final Animation fadeIn;
    private final Animation fadeOut;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardWidgetProgressView(Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardWidgetProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    public /* synthetic */ CardWidgetProgressView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void hide() {
        startAnimation(this.fadeOut);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.stripe_card_widget_progress_size);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams.width = dimensionPixelSize;
        layoutParams.height = dimensionPixelSize;
        setLayoutParams(layoutParams);
    }

    public final void show() {
        startAnimation(this.fadeIn);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardWidgetProgressView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.s.g(context, "context");
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.stripe_card_widget_progress_fade_in);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.stripe.android.view.CardWidgetProgressView$fadeIn$1$1
            {
                CardWidgetProgressView.this = this;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                CardWidgetProgressView.this.setVisibility(0);
            }
        });
        this.fadeIn = loadAnimation;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.stripe_card_widget_progress_fade_out);
        loadAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: com.stripe.android.view.CardWidgetProgressView$fadeOut$1$1
            {
                CardWidgetProgressView.this = this;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                CardWidgetProgressView.this.setVisibility(4);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                CardWidgetProgressView.this.setVisibility(0);
            }
        });
        this.fadeOut = loadAnimation2;
        CardWidgetProgressViewBinding.inflate(LayoutInflater.from(context), this);
        setBackgroundResource(R.drawable.stripe_card_progress_background);
        setClipToOutline(true);
        setVisibility(4);
    }
}