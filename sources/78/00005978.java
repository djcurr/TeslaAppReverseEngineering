package com.stripe.android.ui.core;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import c1.e1;
import c1.i;
import c1.r;
import c1.w0;
import c1.x0;
import h00.p;
import j1.c;
import kotlin.jvm.internal.s;
import l3.h;
import m0.e;
import m0.f;
import m0.j;
import m3.a;
import n2.a0;
import r2.l;
import t1.a0;
import t1.c0;
import vz.b0;
import x2.g;
import y0.h0;
import y0.r1;

/* loaded from: classes6.dex */
public final class PaymentsThemeKt {
    private static final w0<PaymentsColors> LocalColors = r.d(PaymentsThemeKt$LocalColors$1.INSTANCE);
    private static final w0<PaymentsShapes> LocalShapes = r.d(PaymentsThemeKt$LocalShapes$1.INSTANCE);
    private static final w0<PaymentsTypography> LocalTypography = r.d(PaymentsThemeKt$LocalTypography$1.INSTANCE);

    public static final void DefaultPaymentsTheme(p<? super i, ? super Integer, b0> content, i iVar, int i11) {
        int i12;
        s.g(content, "content");
        i h11 = iVar.h(-392212140);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(content) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (((i12 & 11) ^ 2) == 0 && h11.i()) {
            h11.G();
        } else {
            PaymentsThemeDefaults paymentsThemeDefaults = PaymentsThemeDefaults.INSTANCE;
            PaymentsColors colors = paymentsThemeDefaults.colors(j.a(h11, 0));
            PaymentsShapes shapes = paymentsThemeDefaults.getShapes();
            PaymentsTypography typography = paymentsThemeDefaults.getTypography();
            r.a(new x0[]{LocalColors.c(colors), LocalShapes.c(shapes), LocalTypography.c(typography)}, c.b(h11, -819901133, true, new PaymentsThemeKt$DefaultPaymentsTheme$1(colors, typography, shapes, content, i12)), h11, 56);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new PaymentsThemeKt$DefaultPaymentsTheme$2(content, i11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00af, code lost:
        if ((r22 & 4) != 0) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void PaymentsTheme(com.stripe.android.ui.core.PaymentsColors r16, com.stripe.android.ui.core.PaymentsShapes r17, com.stripe.android.ui.core.PaymentsTypography r18, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r19, c1.i r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.PaymentsThemeKt.PaymentsTheme(com.stripe.android.ui.core.PaymentsColors, com.stripe.android.ui.core.PaymentsShapes, com.stripe.android.ui.core.PaymentsTypography, h00.p, c1.i, int, int):void");
    }

    /* renamed from: convertDpToPx-3ABfNKs  reason: not valid java name */
    public static final float m394convertDpToPx3ABfNKs(Context convertDpToPx, float f11) {
        s.g(convertDpToPx, "$this$convertDpToPx");
        return f11 * convertDpToPx.getResources().getDisplayMetrics().density;
    }

    /* renamed from: createTextSpanFromTextStyle-qhTmNto  reason: not valid java name */
    public static final SpannableString m395createTextSpanFromTextStyleqhTmNto(String str, Context context, float f11, long j11, Integer num) {
        Typeface typeface;
        s.g(context, "context");
        if (str == null) {
            str = "";
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new AbsoluteSizeSpan((int) m394convertDpToPx3ABfNKs(context, f11)), 0, spannableString.length(), 0);
        spannableString.setSpan(new ForegroundColorSpan(c0.j(j11)), 0, spannableString.length(), 0);
        if (num != null) {
            typeface = h.g(context, num.intValue());
        } else {
            typeface = Typeface.DEFAULT;
        }
        if (typeface != null) {
            spannableString.setSpan(new CustomTypefaceSpan(typeface), 0, spannableString.length(), 0);
        }
        return spannableString;
    }

    public static final int getBackgroundColor(PrimaryButtonStyle primaryButtonStyle, Context context) {
        s.g(primaryButtonStyle, "<this>");
        s.g(context, "context");
        return c0.j((isSystemDarkTheme(context) ? primaryButtonStyle.getColorsDark() : primaryButtonStyle.getColorsLight()).m416getBackground0d7_KjU());
    }

    public static final e getBorderStroke(h0 h0Var, boolean z11, i iVar, int i11) {
        float borderStrokeWidth;
        long m382getComponentBorder0d7_KjU;
        s.g(h0Var, "<this>");
        if (z11) {
            iVar.x(520097982);
            borderStrokeWidth = getPaymentsShapes(h0Var, iVar, h0.f58132b | (i11 & 14)).getBorderStrokeWidthSelected();
        } else {
            iVar.x(520098028);
            borderStrokeWidth = getPaymentsShapes(h0Var, iVar, h0.f58132b | (i11 & 14)).getBorderStrokeWidth();
        }
        iVar.N();
        if (z11) {
            iVar.x(520098108);
            m382getComponentBorder0d7_KjU = getPaymentsColors(h0Var, iVar, h0.f58132b | (i11 & 14)).getMaterialColors().j();
        } else {
            iVar.x(520098136);
            m382getComponentBorder0d7_KjU = getPaymentsColors(h0Var, iVar, h0.f58132b | (i11 & 14)).m382getComponentBorder0d7_KjU();
        }
        iVar.N();
        return f.a(g.f(borderStrokeWidth), m382getComponentBorder0d7_KjU);
    }

    public static final int getBorderStrokeColor(PrimaryButtonStyle primaryButtonStyle, Context context) {
        s.g(primaryButtonStyle, "<this>");
        s.g(context, "context");
        return c0.j((isSystemDarkTheme(context) ? primaryButtonStyle.getColorsDark() : primaryButtonStyle.getColorsLight()).m417getBorder0d7_KjU());
    }

    public static final a0 getComposeTextStyle(PrimaryButtonStyle primaryButtonStyle, i iVar, int i11) {
        s.g(primaryButtonStyle, "<this>");
        a0 c11 = a0.c(h0.f58131a.c(iVar, 8).i(), (j.a(iVar, 0) ? primaryButtonStyle.getColorsDark() : primaryButtonStyle.getColorsLight()).m418getOnBackground0d7_KjU(), primaryButtonStyle.getTypography().m422getFontSizeXSAIIZE(), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262140, null);
        return primaryButtonStyle.getTypography().getFontFamily() != null ? a0.c(c11, 0L, 0L, null, null, null, r2.f.a(r2.g.b(primaryButtonStyle.getTypography().getFontFamily().intValue(), null, 0, 6, null)), null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262111, null) : c11;
    }

    public static final w0<PaymentsColors> getLocalColors() {
        return LocalColors;
    }

    public static final w0<PaymentsShapes> getLocalShapes() {
        return LocalShapes;
    }

    public static final w0<PaymentsTypography> getLocalTypography() {
        return LocalTypography;
    }

    public static final int getOnBackgroundColor(PrimaryButtonStyle primaryButtonStyle, Context context) {
        s.g(primaryButtonStyle, "<this>");
        s.g(context, "context");
        return c0.j((isSystemDarkTheme(context) ? primaryButtonStyle.getColorsDark() : primaryButtonStyle.getColorsLight()).m418getOnBackground0d7_KjU());
    }

    public static final PaymentsColors getPaymentsColors(h0 h0Var, i iVar, int i11) {
        s.g(h0Var, "<this>");
        return (PaymentsColors) iVar.A(LocalColors);
    }

    public static final PaymentsShapes getPaymentsShapes(h0 h0Var, i iVar, int i11) {
        s.g(h0Var, "<this>");
        return (PaymentsShapes) iVar.A(LocalShapes);
    }

    public static final float getRawValueFromDimenResource(Context context, int i11) {
        s.g(context, "<this>");
        return context.getResources().getDimension(i11) / context.getResources().getDisplayMetrics().density;
    }

    public static final boolean isSystemDarkTheme(Context context) {
        s.g(context, "<this>");
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* renamed from: shouldUseDarkDynamicColor-8_81llA  reason: not valid java name */
    public static final boolean m396shouldUseDarkDynamicColor8_81llA(long j11) {
        int j12 = c0.j(j11);
        a0.a aVar = t1.a0.f51365b;
        double c11 = a.c(j12, c0.j(aVar.a()));
        double c12 = a.c(c0.j(j11), c0.j(aVar.g()));
        return c12 <= 2.2d && c11 > c12;
    }

    public static final PaymentsComposeShapes toComposeShapes(PaymentsShapes paymentsShapes, i iVar, int i11) {
        s.g(paymentsShapes, "<this>");
        return new PaymentsComposeShapes(g.f(paymentsShapes.getBorderStrokeWidth()), g.f(paymentsShapes.getBorderStrokeWidthSelected()), y0.x0.b(h0.f58131a.b(iVar, 8), v0.g.c(g.f(paymentsShapes.getCornerRadius())), v0.g.c(g.f(paymentsShapes.getCornerRadius())), null, 4, null), null);
    }

    public static final r1 toComposeTypography(PaymentsTypography paymentsTypography, i iVar, int i11) {
        s.g(paymentsTypography, "<this>");
        r2.e a11 = paymentsTypography.getFontFamily() != null ? r2.f.a(r2.g.b(paymentsTypography.getFontFamily().intValue(), null, 0, 6, null)) : r2.e.f49078a.a();
        a0.a aVar = n2.a0.f40262s;
        n2.a0 a12 = aVar.a();
        long m408getXLargeFontSizeXSAIIZE = paymentsTypography.m408getXLargeFontSizeXSAIIZE();
        float fontSizeMultiplier = paymentsTypography.getFontSizeMultiplier();
        x2.s.b(m408getXLargeFontSizeXSAIIZE);
        r2.e eVar = a11;
        n2.a0 c11 = n2.a0.c(a12, 0L, x2.s.i(x2.r.f(m408getXLargeFontSizeXSAIIZE), x2.r.h(m408getXLargeFontSizeXSAIIZE) * fontSizeMultiplier), new l(paymentsTypography.getFontWeightBold()), null, null, eVar, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262105, null);
        n2.a0 a13 = aVar.a();
        long m405getLargeFontSizeXSAIIZE = paymentsTypography.m405getLargeFontSizeXSAIIZE();
        float fontSizeMultiplier2 = paymentsTypography.getFontSizeMultiplier();
        x2.s.b(m405getLargeFontSizeXSAIIZE);
        n2.a0 c12 = n2.a0.c(a13, 0L, x2.s.i(x2.r.f(m405getLargeFontSizeXSAIIZE), x2.r.h(m405getLargeFontSizeXSAIIZE) * fontSizeMultiplier2), new l(paymentsTypography.getFontWeightMedium()), null, null, eVar, null, x2.s.d(-0.32d), null, null, null, 0L, null, null, null, null, 0L, null, 261977, null);
        n2.a0 a14 = aVar.a();
        long m407getSmallFontSizeXSAIIZE = paymentsTypography.m407getSmallFontSizeXSAIIZE();
        float fontSizeMultiplier3 = paymentsTypography.getFontSizeMultiplier();
        x2.s.b(m407getSmallFontSizeXSAIIZE);
        n2.a0 c13 = n2.a0.c(a14, 0L, x2.s.i(x2.r.f(m407getSmallFontSizeXSAIIZE), x2.r.h(m407getSmallFontSizeXSAIIZE) * fontSizeMultiplier3), new l(paymentsTypography.getFontWeightMedium()), null, null, eVar, null, x2.s.d(-0.15d), null, null, null, 0L, null, null, null, null, 0L, null, 261977, null);
        n2.a0 a15 = aVar.a();
        long m406getMediumFontSizeXSAIIZE = paymentsTypography.m406getMediumFontSizeXSAIIZE();
        float fontSizeMultiplier4 = paymentsTypography.getFontSizeMultiplier();
        x2.s.b(m406getMediumFontSizeXSAIIZE);
        n2.a0 c14 = n2.a0.c(a15, 0L, x2.s.i(x2.r.f(m406getMediumFontSizeXSAIIZE), x2.r.h(m406getMediumFontSizeXSAIIZE) * fontSizeMultiplier4), new l(paymentsTypography.getFontWeightNormal()), null, null, eVar, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262105, null);
        n2.a0 a16 = aVar.a();
        long m406getMediumFontSizeXSAIIZE2 = paymentsTypography.m406getMediumFontSizeXSAIIZE();
        float fontSizeMultiplier5 = paymentsTypography.getFontSizeMultiplier();
        x2.s.b(m406getMediumFontSizeXSAIIZE2);
        n2.a0 c15 = n2.a0.c(a16, 0L, x2.s.i(x2.r.f(m406getMediumFontSizeXSAIIZE2), x2.r.h(m406getMediumFontSizeXSAIIZE2) * fontSizeMultiplier5), new l(paymentsTypography.getFontWeightNormal()), null, null, eVar, null, x2.s.d(-0.15d), null, null, null, 0L, null, null, null, null, 0L, null, 261977, null);
        n2.a0 a17 = aVar.a();
        long m409getXSmallFontSizeXSAIIZE = paymentsTypography.m409getXSmallFontSizeXSAIIZE();
        float fontSizeMultiplier6 = paymentsTypography.getFontSizeMultiplier();
        x2.s.b(m409getXSmallFontSizeXSAIIZE);
        n2.a0 c16 = n2.a0.c(a17, 0L, x2.s.i(x2.r.f(m409getXSmallFontSizeXSAIIZE), x2.r.h(m409getXSmallFontSizeXSAIIZE) * fontSizeMultiplier6), new l(paymentsTypography.getFontWeightMedium()), null, null, eVar, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262105, null);
        n2.a0 a18 = aVar.a();
        long m410getXxSmallFontSizeXSAIIZE = paymentsTypography.m410getXxSmallFontSizeXSAIIZE();
        float fontSizeMultiplier7 = paymentsTypography.getFontSizeMultiplier();
        x2.s.b(m410getXxSmallFontSizeXSAIIZE);
        return r1.b(h0.f58131a.c(iVar, 8), null, null, null, c11, c12, c13, c15, null, c14, n2.a0.c(a18, 0L, x2.s.i(x2.r.f(m410getXxSmallFontSizeXSAIIZE), x2.r.h(m410getXxSmallFontSizeXSAIIZE) * fontSizeMultiplier7), new l(paymentsTypography.getFontWeightNormal()), null, null, eVar, null, x2.s.d(-0.15d), null, null, null, 0L, null, null, null, null, 0L, null, 261977, null), null, c16, null, 5255, null);
    }
}