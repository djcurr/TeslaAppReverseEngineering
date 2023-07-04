package com.stripe.android.paymentsheet;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.ui.core.PaymentsColors;
import com.stripe.android.ui.core.PaymentsShapes;
import com.stripe.android.ui.core.PaymentsTheme;
import com.stripe.android.ui.core.PaymentsThemeDefaults;
import com.stripe.android.ui.core.PaymentsTypography;
import com.stripe.android.ui.core.PrimaryButtonColors;
import com.stripe.android.ui.core.PrimaryButtonShape;
import com.stripe.android.ui.core.PrimaryButtonStyle;
import com.stripe.android.ui.core.PrimaryButtonTypography;
import x2.r;

/* loaded from: classes6.dex */
public final class PaymentSheetConfigurationKtxKt {
    public static final void parseAppearance(PaymentSheet.Appearance appearance) {
        PaymentsColors m379copyKvvhxLA;
        PaymentsColors m379copyKvvhxLA2;
        PaymentsTypography m404copyD6c4kWA;
        long k11;
        kotlin.jvm.internal.s.g(appearance, "<this>");
        PaymentsTheme paymentsTheme = PaymentsTheme.INSTANCE;
        PaymentsThemeDefaults paymentsThemeDefaults = PaymentsThemeDefaults.INSTANCE;
        m379copyKvvhxLA = r3.m379copyKvvhxLA((r34 & 1) != 0 ? r3.component : t1.c0.b(appearance.getColorsLight().getComponent()), (r34 & 2) != 0 ? r3.componentBorder : t1.c0.b(appearance.getColorsLight().getComponentBorder()), (r34 & 4) != 0 ? r3.componentDivider : t1.c0.b(appearance.getColorsLight().getComponentDivider()), (r34 & 8) != 0 ? r3.onComponent : t1.c0.b(appearance.getColorsLight().getOnComponent()), (r34 & 16) != 0 ? r3.subtitle : t1.c0.b(appearance.getColorsLight().getSubtitle()), (r34 & 32) != 0 ? r3.textCursor : 0L, (r34 & 64) != 0 ? r3.placeholderText : t1.c0.b(appearance.getColorsLight().getPlaceholderText()), (r34 & 128) != 0 ? r3.appBarIcon : t1.c0.b(appearance.getColorsLight().getAppBarIcon()), (r34 & 256) != 0 ? paymentsThemeDefaults.getColorsLight().materialColors : y0.m.g(t1.c0.b(appearance.getColorsLight().getPrimary()), 0L, 0L, 0L, 0L, t1.c0.b(appearance.getColorsLight().getSurface()), t1.c0.b(appearance.getColorsLight().getError()), 0L, 0L, 0L, t1.c0.b(appearance.getColorsLight().getOnSurface()), 0L, 2974, null));
        paymentsTheme.setColorsLightMutable(m379copyKvvhxLA);
        m379copyKvvhxLA2 = r4.m379copyKvvhxLA((r34 & 1) != 0 ? r4.component : t1.c0.b(appearance.getColorsDark().getComponent()), (r34 & 2) != 0 ? r4.componentBorder : t1.c0.b(appearance.getColorsDark().getComponentBorder()), (r34 & 4) != 0 ? r4.componentDivider : t1.c0.b(appearance.getColorsDark().getComponentDivider()), (r34 & 8) != 0 ? r4.onComponent : t1.c0.b(appearance.getColorsDark().getOnComponent()), (r34 & 16) != 0 ? r4.subtitle : t1.c0.b(appearance.getColorsDark().getSubtitle()), (r34 & 32) != 0 ? r4.textCursor : 0L, (r34 & 64) != 0 ? r4.placeholderText : t1.c0.b(appearance.getColorsDark().getPlaceholderText()), (r34 & 128) != 0 ? r4.appBarIcon : t1.c0.b(appearance.getColorsDark().getAppBarIcon()), (r34 & 256) != 0 ? paymentsThemeDefaults.getColorsDark().materialColors : y0.m.d(t1.c0.b(appearance.getColorsDark().getPrimary()), 0L, 0L, 0L, 0L, t1.c0.b(appearance.getColorsDark().getSurface()), t1.c0.b(appearance.getColorsDark().getError()), 0L, 0L, 0L, t1.c0.b(appearance.getColorsDark().getOnSurface()), 0L, 2974, null));
        paymentsTheme.setColorsDarkMutable(m379copyKvvhxLA2);
        paymentsTheme.setShapesMutable(PaymentsShapes.copy$default(paymentsThemeDefaults.getShapes(), appearance.getShapes().getCornerRadiusDp(), appearance.getShapes().getBorderStrokeWidthDp(), BitmapDescriptorFactory.HUE_RED, 4, null));
        m404copyD6c4kWA = r4.m404copyD6c4kWA((r34 & 1) != 0 ? r4.fontWeightNormal : 0, (r34 & 2) != 0 ? r4.fontWeightMedium : 0, (r34 & 4) != 0 ? r4.fontWeightBold : 0, (r34 & 8) != 0 ? r4.fontSizeMultiplier : appearance.getTypography().getSizeScaleFactor(), (r34 & 16) != 0 ? r4.xxSmallFontSize : 0L, (r34 & 32) != 0 ? r4.xSmallFontSize : 0L, (r34 & 64) != 0 ? r4.smallFontSize : 0L, (r34 & 128) != 0 ? r4.mediumFontSize : 0L, (r34 & 256) != 0 ? r4.largeFontSize : 0L, (r34 & 512) != 0 ? r4.xLargeFontSize : 0L, (r34 & 1024) != 0 ? paymentsThemeDefaults.getTypography().fontFamily : appearance.getTypography().getFontResId());
        paymentsTheme.setTypographyMutable(m404copyD6c4kWA);
        PrimaryButtonStyle primaryButtonStyle = paymentsThemeDefaults.getPrimaryButtonStyle();
        Integer background = appearance.getPrimaryButton().getColorsLight().getBackground();
        PrimaryButtonColors primaryButtonColors = new PrimaryButtonColors(t1.c0.b(background == null ? appearance.getColorsLight().getPrimary() : background.intValue()), t1.c0.b(appearance.getPrimaryButton().getColorsLight().getOnBackground()), t1.c0.b(appearance.getPrimaryButton().getColorsLight().getBorder()), null);
        Integer background2 = appearance.getPrimaryButton().getColorsDark().getBackground();
        PrimaryButtonColors primaryButtonColors2 = new PrimaryButtonColors(t1.c0.b(background2 == null ? appearance.getColorsDark().getPrimary() : background2.intValue()), t1.c0.b(appearance.getPrimaryButton().getColorsDark().getOnBackground()), t1.c0.b(appearance.getPrimaryButton().getColorsDark().getBorder()), null);
        Float cornerRadiusDp = appearance.getPrimaryButton().getShape().getCornerRadiusDp();
        float cornerRadiusDp2 = cornerRadiusDp == null ? appearance.getShapes().getCornerRadiusDp() : cornerRadiusDp.floatValue();
        Float borderStrokeWidthDp = appearance.getPrimaryButton().getShape().getBorderStrokeWidthDp();
        PrimaryButtonShape primaryButtonShape = new PrimaryButtonShape(cornerRadiusDp2, borderStrokeWidthDp == null ? appearance.getShapes().getBorderStrokeWidthDp() : borderStrokeWidthDp.floatValue());
        Integer fontResId = appearance.getPrimaryButton().getTypography().getFontResId();
        if (fontResId == null) {
            fontResId = appearance.getTypography().getFontResId();
        }
        Float fontSizeSp = appearance.getPrimaryButton().getTypography().getFontSizeSp();
        r b11 = fontSizeSp == null ? null : r.b(x2.s.e(fontSizeSp.floatValue()));
        if (b11 == null) {
            long m405getLargeFontSizeXSAIIZE = paymentsThemeDefaults.getTypography().m405getLargeFontSizeXSAIIZE();
            float sizeScaleFactor = appearance.getTypography().getSizeScaleFactor();
            x2.s.b(m405getLargeFontSizeXSAIIZE);
            k11 = x2.s.i(r.f(m405getLargeFontSizeXSAIIZE), r.h(m405getLargeFontSizeXSAIIZE) * sizeScaleFactor);
        } else {
            k11 = b11.k();
        }
        paymentsTheme.setPrimaryButtonStyle(primaryButtonStyle.copy(primaryButtonColors, primaryButtonColors2, primaryButtonShape, new PrimaryButtonTypography(fontResId, k11, null)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
        if (r3 == true) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void validate(com.stripe.android.paymentsheet.PaymentSheet.Configuration r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.s.g(r3, r0)
            java.lang.String r0 = r3.getMerchantDisplayName()
            boolean r0 = kotlin.text.m.w(r0)
            if (r0 != 0) goto L51
            com.stripe.android.paymentsheet.PaymentSheet$CustomerConfiguration r0 = r3.getCustomer()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L19
        L17:
            r0 = r2
            goto L27
        L19:
            java.lang.String r0 = r0.getId()
            if (r0 != 0) goto L20
            goto L17
        L20:
            boolean r0 = kotlin.text.m.w(r0)
            if (r0 != r1) goto L17
            r0 = r1
        L27:
            if (r0 != 0) goto L49
            com.stripe.android.paymentsheet.PaymentSheet$CustomerConfiguration r3 = r3.getCustomer()
            if (r3 != 0) goto L31
        L2f:
            r1 = r2
            goto L3e
        L31:
            java.lang.String r3 = r3.getEphemeralKeySecret()
            if (r3 != 0) goto L38
            goto L2f
        L38:
            boolean r3 = kotlin.text.m.w(r3)
            if (r3 != r1) goto L2f
        L3e:
            if (r1 != 0) goto L41
            return
        L41:
            java.security.InvalidParameterException r3 = new java.security.InvalidParameterException
            java.lang.String r0 = "When a CustomerConfiguration is passed to PaymentSheet, the ephemeralKeySecret cannot be an empty string."
            r3.<init>(r0)
            throw r3
        L49:
            java.security.InvalidParameterException r3 = new java.security.InvalidParameterException
            java.lang.String r0 = "When a CustomerConfiguration is passed to PaymentSheet, the Customer ID cannot be an empty string."
            r3.<init>(r0)
            throw r3
        L51:
            java.security.InvalidParameterException r3 = new java.security.InvalidParameterException
            java.lang.String r0 = "When a Configuration is passed to PaymentSheet, the Merchant display name cannot be an empty string."
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.PaymentSheetConfigurationKtxKt.validate(com.stripe.android.paymentsheet.PaymentSheet$Configuration):void");
    }
}