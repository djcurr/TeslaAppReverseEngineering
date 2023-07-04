package com.reactnativestripesdk;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.facebook.react.modules.appstate.AppStateModule;
import com.reactnativestripesdk.utils.PaymentSheetAppearanceException;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;

/* loaded from: classes2.dex */
public final class i0 {
    private static final PaymentSheet.Colors a(Bundle bundle, PaymentSheet.Colors colors) {
        return bundle == null ? colors : colors.copy(g(bundle.getString("primary"), colors.getPrimary()), g(bundle.getString(AppStateModule.APP_STATE_BACKGROUND), colors.getSurface()), g(bundle.getString("componentBackground"), colors.getComponent()), g(bundle.getString("componentBorder"), colors.getComponentBorder()), g(bundle.getString("componentDivider"), colors.getComponentDivider()), g(bundle.getString("componentText"), colors.getOnComponent()), g(bundle.getString("primaryText"), colors.getOnSurface()), g(bundle.getString("secondaryText"), colors.getSubtitle()), g(bundle.getString("placeholderText"), colors.getPlaceholderText()), g(bundle.getString("icon"), colors.getAppBarIcon()), g(bundle.getString("error"), colors.getError()));
    }

    public static final PaymentSheet.Appearance b(m0 m0Var, Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        kotlin.jvm.internal.s.g(m0Var, "<this>");
        Bundle bundle4 = bundle == null ? null : bundle.getBundle("colors");
        if (bundle4 == null || (bundle2 = bundle4.getBundle("light")) == null) {
            bundle2 = bundle4;
        }
        if (bundle4 != null && (bundle3 = bundle4.getBundle("dark")) != null) {
            bundle4 = bundle3;
        }
        PaymentSheet.Typography f11 = f(m0Var, bundle == null ? null : bundle.getBundle(PaymentSheetEvent.FIELD_FONT));
        PaymentSheet.Colors.Companion companion = PaymentSheet.Colors.Companion;
        return new PaymentSheet.Appearance(a(bundle2, companion.getDefaultLight()), a(bundle4, companion.getDefaultDark()), e(bundle == null ? null : bundle.getBundle("shapes")), f11, c(m0Var, bundle != null ? bundle.getBundle("primaryButton") : null));
    }

    private static final PaymentSheet.PrimaryButton c(m0 m0Var, Bundle bundle) {
        if (bundle == null) {
            return new PaymentSheet.PrimaryButton(null, null, null, null, 15, null);
        }
        Bundle bundle2 = bundle.getBundle(PaymentSheetEvent.FIELD_FONT);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        Bundle bundle3 = bundle.getBundle("shapes");
        if (bundle3 == null) {
            bundle3 = Bundle.EMPTY;
        }
        Bundle darkColorParams = bundle.getBundle("colors");
        if (darkColorParams == null) {
            darkColorParams = Bundle.EMPTY;
        }
        Bundle lightColorParams = darkColorParams.getBundle("light");
        if (lightColorParams == null) {
            lightColorParams = darkColorParams;
        }
        Bundle bundle4 = darkColorParams.getBundle("dark");
        if (bundle4 != null) {
            darkColorParams = bundle4;
        }
        kotlin.jvm.internal.s.f(lightColorParams, "lightColorParams");
        PaymentSheet.PrimaryButtonColors.Companion companion = PaymentSheet.PrimaryButtonColors.Companion;
        PaymentSheet.PrimaryButtonColors d11 = d(lightColorParams, companion.getDefaultLight());
        kotlin.jvm.internal.s.f(darkColorParams, "darkColorParams");
        return new PaymentSheet.PrimaryButton(d11, d(darkColorParams, companion.getDefaultDark()), new PaymentSheet.PrimaryButtonShape(i(bundle3, "borderRadius"), i(bundle3, "borderWidth")), new PaymentSheet.PrimaryButtonTypography(j(m0Var, bundle2, "family", null), null, 2, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
        r0 = kotlin.text.v.D(r2, "#", "", false, 4, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final com.stripe.android.paymentsheet.PaymentSheet.PrimaryButtonColors d(android.os.Bundle r8, com.stripe.android.paymentsheet.PaymentSheet.PrimaryButtonColors r9) {
        /*
            java.lang.String r0 = "background"
            java.lang.String r0 = r8.getString(r0)
            r1 = 0
            if (r0 != 0) goto Lb
        L9:
            r0 = r1
            goto L4e
        Lb:
            java.lang.CharSequence r0 = kotlin.text.m.d1(r0)
            java.lang.String r2 = r0.toString()
            if (r2 != 0) goto L16
            goto L9
        L16:
            r5 = 0
            r6 = 4
            r7 = 0
            java.lang.String r3 = "#"
            java.lang.String r4 = ""
            java.lang.String r0 = kotlin.text.m.D(r2, r3, r4, r5, r6, r7)
            if (r0 != 0) goto L24
            goto L9
        L24:
            int r2 = r0.length()
            r3 = 6
            if (r2 == r3) goto L40
            int r2 = r0.length()
            r3 = 8
            if (r2 != r3) goto L34
            goto L40
        L34:
            com.reactnativestripesdk.utils.PaymentSheetAppearanceException r8 = new com.reactnativestripesdk.utils.PaymentSheetAppearanceException
            java.lang.String r9 = "Failed to set Payment Sheet appearance. Expected hex string of length 6 or 8, but received: "
            java.lang.String r9 = kotlin.jvm.internal.s.p(r9, r0)
            r8.<init>(r9)
            throw r8
        L40:
            java.lang.String r2 = "#"
            java.lang.String r0 = kotlin.jvm.internal.s.p(r2, r0)
            int r0 = android.graphics.Color.parseColor(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L4e:
            if (r0 != 0) goto L51
            goto L52
        L51:
            r1 = r0
        L52:
            java.lang.String r0 = "text"
            java.lang.String r0 = r8.getString(r0)
            int r2 = r9.getOnBackground()
            int r0 = g(r0, r2)
            java.lang.String r2 = "border"
            java.lang.String r8 = r8.getString(r2)
            int r9 = r9.getBorder()
            int r8 = g(r8, r9)
            com.stripe.android.paymentsheet.PaymentSheet$PrimaryButtonColors r9 = new com.stripe.android.paymentsheet.PaymentSheet$PrimaryButtonColors
            r9.<init>(r1, r0, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativestripesdk.i0.d(android.os.Bundle, com.stripe.android.paymentsheet.PaymentSheet$PrimaryButtonColors):com.stripe.android.paymentsheet.PaymentSheet$PrimaryButtonColors");
    }

    private static final PaymentSheet.Shapes e(Bundle bundle) {
        PaymentSheet.Shapes.Companion companion = PaymentSheet.Shapes.Companion;
        return companion.getDefault().copy(h(bundle, "borderRadius", companion.getDefault().getCornerRadiusDp()), h(bundle, "borderWidth", companion.getDefault().getBorderStrokeWidthDp()));
    }

    private static final PaymentSheet.Typography f(m0 m0Var, Bundle bundle) {
        PaymentSheet.Typography.Companion companion = PaymentSheet.Typography.Companion;
        return companion.getDefault().copy(h(bundle, "scale", companion.getDefault().getSizeScaleFactor()), j(m0Var, bundle, "family", companion.getDefault().getFontResId()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
        r6 = kotlin.text.v.D(r0, "#", "", false, 4, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final int g(java.lang.String r6, int r7) {
        /*
            if (r6 != 0) goto L3
            goto L1b
        L3:
            java.lang.CharSequence r6 = kotlin.text.m.d1(r6)
            java.lang.String r0 = r6.toString()
            if (r0 != 0) goto Le
            goto L1b
        Le:
            r3 = 0
            r4 = 4
            r5 = 0
            java.lang.String r1 = "#"
            java.lang.String r2 = ""
            java.lang.String r6 = kotlin.text.m.D(r0, r1, r2, r3, r4, r5)
            if (r6 != 0) goto L1c
        L1b:
            return r7
        L1c:
            int r7 = r6.length()
            r0 = 6
            if (r7 == r0) goto L38
            int r7 = r6.length()
            r0 = 8
            if (r7 != r0) goto L2c
            goto L38
        L2c:
            com.reactnativestripesdk.utils.PaymentSheetAppearanceException r7 = new com.reactnativestripesdk.utils.PaymentSheetAppearanceException
            java.lang.String r0 = "Failed to set Payment Sheet appearance. Expected hex string of length 6 or 8, but received: "
            java.lang.String r6 = kotlin.jvm.internal.s.p(r0, r6)
            r7.<init>(r6)
            throw r7
        L38:
            java.lang.String r7 = "#"
            java.lang.String r6 = kotlin.jvm.internal.s.p(r7, r6)
            int r6 = android.graphics.Color.parseColor(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativestripesdk.i0.g(java.lang.String, int):int");
    }

    private static final float h(Bundle bundle, String str, float f11) {
        boolean z11 = false;
        if (bundle != null && bundle.containsKey(str)) {
            z11 = true;
        }
        return z11 ? bundle.getFloat(str, bundle.getInt(str)) : f11;
    }

    private static final Float i(Bundle bundle, String str) {
        boolean z11 = false;
        if (bundle != null && bundle.containsKey(str)) {
            z11 = true;
        }
        if (z11) {
            return Float.valueOf(bundle.getFloat(str, bundle.getInt(str)));
        }
        return null;
    }

    private static final Integer j(m0 m0Var, Bundle bundle, String str, Integer num) {
        boolean z11 = false;
        if (bundle != null && bundle.containsKey(str)) {
            z11 = true;
        }
        if (z11) {
            String string = bundle.getString(str);
            if (string != null) {
                if (!new kotlin.text.i("[^a-z0-9]").a(string)) {
                    Resources resources = m0Var.getResources();
                    Context context = m0Var.getContext();
                    int identifier = resources.getIdentifier(string, PaymentSheetEvent.FIELD_FONT, context == null ? null : context.getPackageName());
                    if (identifier != 0) {
                        return Integer.valueOf(identifier);
                    }
                    throw new PaymentSheetAppearanceException("Encountered an error when setting a custom font: Failed to find font: " + string);
                }
                throw new PaymentSheetAppearanceException("Encountered an error when setting a custom font: appearance.font." + str + " should only contain lowercase alphanumeric characters on Android, but received '" + string + "'. This value must match the filename in android/app/src/main/res/font");
            }
            throw new PaymentSheetAppearanceException("Encountered an error when setting a custom font: expected String for font." + str + ", but received null.");
        }
        return num;
    }
}