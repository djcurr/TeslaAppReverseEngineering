package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import com.stripe.android.R;

/* loaded from: classes6.dex */
public final class ThemeConfig {
    private final StripeColorUtils colorUtils;
    private final int selectedColorInt;
    private final int selectedTextAlphaColorInt;
    private final int[] textColorValues;
    private final int unselectedColorInt;
    private final int unselectedTextAlphaColorInt;
    private final int unselectedTextColorInt;

    public ThemeConfig(Context context) {
        kotlin.jvm.internal.s.g(context, "context");
        StripeColorUtils stripeColorUtils = new StripeColorUtils(context);
        this.colorUtils = stripeColorUtils;
        int determineColor = determineColor(context, stripeColorUtils.getColorAccent(), R.color.stripe_accent_color_default);
        this.selectedColorInt = determineColor;
        this.unselectedColorInt = determineColor(context, stripeColorUtils.getColorControlNormal(), R.color.stripe_control_normal_color_default);
        int determineColor2 = determineColor(context, stripeColorUtils.getTextColorSecondary(), R.color.stripe_color_text_secondary_default);
        this.unselectedTextColorInt = determineColor2;
        Resources resources = context.getResources();
        int i11 = R.integer.stripe_light_text_alpha_hex;
        int k11 = m3.a.k(determineColor, resources.getInteger(i11));
        this.selectedTextAlphaColorInt = k11;
        int k12 = m3.a.k(determineColor2, context.getResources().getInteger(i11));
        this.unselectedTextAlphaColorInt = k12;
        this.textColorValues = new int[]{determineColor, k11, determineColor2, k12};
    }

    private final int determineColor(Context context, int i11, int i12) {
        return StripeColorUtils.Companion.isColorTransparent(i11) ? androidx.core.content.b.getColor(context, i12) : i11;
    }

    public final int getTextAlphaColor$payments_core_release(boolean z11) {
        return z11 ? this.selectedTextAlphaColorInt : this.unselectedTextAlphaColorInt;
    }

    public final int getTextColor$payments_core_release(boolean z11) {
        return z11 ? this.selectedColorInt : this.unselectedTextColorInt;
    }

    public final int[] getTextColorValues$payments_core_release() {
        return this.textColorValues;
    }

    public final int getTintColor$payments_core_release(boolean z11) {
        return z11 ? this.selectedColorInt : this.unselectedColorInt;
    }
}