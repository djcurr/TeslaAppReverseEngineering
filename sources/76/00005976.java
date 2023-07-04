package com.stripe.android.ui.core;

import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class PaymentsTheme {
    public static final int $stable;
    public static final PaymentsTheme INSTANCE = new PaymentsTheme();
    private static PaymentsColors colorsDarkMutable = null;
    private static PaymentsColors colorsLightMutable = null;
    public static final double minContrastForWhite = 2.2d;
    private static PrimaryButtonStyle primaryButtonStyle;
    private static PaymentsShapes shapesMutable;
    private static PaymentsTypography typographyMutable;

    static {
        PaymentsThemeDefaults paymentsThemeDefaults = PaymentsThemeDefaults.INSTANCE;
        colorsDarkMutable = paymentsThemeDefaults.getColorsDark();
        colorsLightMutable = paymentsThemeDefaults.getColorsLight();
        shapesMutable = paymentsThemeDefaults.getShapes();
        typographyMutable = paymentsThemeDefaults.getTypography();
        primaryButtonStyle = paymentsThemeDefaults.getPrimaryButtonStyle();
        $stable = 8;
    }

    private PaymentsTheme() {
    }

    public final PaymentsColors getColors(boolean z11) {
        return z11 ? colorsDarkMutable : colorsLightMutable;
    }

    public final PaymentsColors getColorsDarkMutable() {
        return colorsDarkMutable;
    }

    public final PaymentsColors getColorsLightMutable() {
        return colorsLightMutable;
    }

    public final PrimaryButtonStyle getPrimaryButtonStyle() {
        return primaryButtonStyle;
    }

    public final PaymentsShapes getShapesMutable() {
        return shapesMutable;
    }

    public final PaymentsTypography getTypographyMutable() {
        return typographyMutable;
    }

    public final void setColorsDarkMutable(PaymentsColors paymentsColors) {
        s.g(paymentsColors, "<set-?>");
        colorsDarkMutable = paymentsColors;
    }

    public final void setColorsLightMutable(PaymentsColors paymentsColors) {
        s.g(paymentsColors, "<set-?>");
        colorsLightMutable = paymentsColors;
    }

    public final void setPrimaryButtonStyle(PrimaryButtonStyle primaryButtonStyle2) {
        s.g(primaryButtonStyle2, "<set-?>");
        primaryButtonStyle = primaryButtonStyle2;
    }

    public final void setShapesMutable(PaymentsShapes paymentsShapes) {
        s.g(paymentsShapes, "<set-?>");
        shapesMutable = paymentsShapes;
    }

    public final void setTypographyMutable(PaymentsTypography paymentsTypography) {
        s.g(paymentsTypography, "<set-?>");
        typographyMutable = paymentsTypography;
    }
}