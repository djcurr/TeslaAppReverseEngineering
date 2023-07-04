package com.stripe.android.paymentsheet.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.databinding.StripeGooglePayButtonBinding;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class GooglePayButton extends FrameLayout {
    private PrimaryButton.State state;
    private final StripeGooglePayButtonBinding viewBinding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GooglePayButton(Context context) {
        this(context, null, 0, 6, null);
        s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GooglePayButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.g(context, "context");
    }

    public /* synthetic */ GooglePayButton(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void onFinishProcessing() {
        PrimaryButton primaryButton = this.viewBinding.primaryButton;
        s.f(primaryButton, "viewBinding.primaryButton");
        primaryButton.setVisibility(0);
        RelativeLayout relativeLayout = this.viewBinding.googlePayButtonIcon;
        s.f(relativeLayout, "viewBinding.googlePayButtonIcon");
        relativeLayout.setVisibility(8);
    }

    private final void onReadyState() {
        PrimaryButton primaryButton = this.viewBinding.primaryButton;
        s.f(primaryButton, "viewBinding.primaryButton");
        primaryButton.setVisibility(8);
        RelativeLayout relativeLayout = this.viewBinding.googlePayButtonIcon;
        s.f(relativeLayout, "viewBinding.googlePayButtonIcon");
        relativeLayout.setVisibility(0);
    }

    private final void onStartProcessing() {
        PrimaryButton primaryButton = this.viewBinding.primaryButton;
        s.f(primaryButton, "viewBinding.primaryButton");
        primaryButton.setVisibility(0);
        RelativeLayout relativeLayout = this.viewBinding.googlePayButtonIcon;
        s.f(relativeLayout, "viewBinding.googlePayButtonIcon");
        relativeLayout.setVisibility(8);
    }

    private final void updateAlpha() {
        RelativeLayout relativeLayout = this.viewBinding.googlePayButtonIcon;
        PrimaryButton.State state = this.state;
        relativeLayout.setAlpha(((state == null || (state instanceof PrimaryButton.State.Ready)) && !isEnabled()) ? 0.5f : 1.0f);
    }

    public final StripeGooglePayButtonBinding getViewBinding$paymentsheet_release() {
        return this.viewBinding;
    }

    public final void setBackgroundColor(boolean z11) {
        int i11;
        int i12;
        if (z11) {
            i11 = R.drawable.stripe_googlepay_button_no_shadow_background_dark;
        } else {
            i11 = R.drawable.stripe_googlepay_button_no_shadow_background_light;
        }
        this.viewBinding.googlePayButtonIcon.setBackground(l3.h.f(getResources(), i11, null));
        if (z11) {
            i12 = R.drawable.stripe_googlepay_button_content_dark;
        } else {
            i12 = R.drawable.stripe_googlepay_button_content_light;
        }
        this.viewBinding.googlePayButtonContent.setImageDrawable(l3.h.f(getResources(), i12, null));
        this.viewBinding.primaryButton.setBackgroundTintList(ColorStateList.valueOf(z11 ? -16777216 : -1));
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        this.viewBinding.primaryButton.setEnabled(z11);
        updateAlpha();
    }

    public final void updateState(PrimaryButton.State state) {
        this.viewBinding.primaryButton.updateState(state);
        this.state = state;
        updateAlpha();
        if (state instanceof PrimaryButton.State.Ready) {
            onReadyState();
        } else if (s.c(state, PrimaryButton.State.StartProcessing.INSTANCE)) {
            onStartProcessing();
        } else if (state instanceof PrimaryButton.State.FinishProcessing) {
            onFinishProcessing();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.g(context, "context");
        StripeGooglePayButtonBinding inflate = StripeGooglePayButtonBinding.inflate(LayoutInflater.from(context), this);
        s.f(inflate, "inflate(\n        LayoutI…text),\n        this\n    )");
        this.viewBinding = inflate;
        super.setClickable(true);
        super.setEnabled(true);
    }
}