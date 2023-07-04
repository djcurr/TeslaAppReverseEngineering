package com.stripe.android.paymentsheet.ui;

import com.stripe.android.paymentsheet.R;

/* loaded from: classes6.dex */
public final class AnimationConstants {
    public static final AnimationConstants INSTANCE = new AnimationConstants();
    private static final int FADE_IN = R.anim.stripe_paymentsheet_transition_fade_in;
    private static final int FADE_OUT = R.anim.stripe_paymentsheet_transition_fade_out;

    private AnimationConstants() {
    }

    public final int getFADE_IN() {
        return FADE_IN;
    }

    public final int getFADE_OUT() {
        return FADE_OUT;
    }
}