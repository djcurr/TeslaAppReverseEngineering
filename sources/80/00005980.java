package com.stripe.android.ui.core;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import x2.r;

/* loaded from: classes6.dex */
public final class PaymentsTypography {
    public static final int $stable = 0;
    private final Integer fontFamily;
    private final float fontSizeMultiplier;
    private final int fontWeightBold;
    private final int fontWeightMedium;
    private final int fontWeightNormal;
    private final long largeFontSize;
    private final long mediumFontSize;
    private final long smallFontSize;
    private final long xLargeFontSize;
    private final long xSmallFontSize;
    private final long xxSmallFontSize;

    private PaymentsTypography(int i11, int i12, int i13, float f11, long j11, long j12, long j13, long j14, long j15, long j16, Integer num) {
        this.fontWeightNormal = i11;
        this.fontWeightMedium = i12;
        this.fontWeightBold = i13;
        this.fontSizeMultiplier = f11;
        this.xxSmallFontSize = j11;
        this.xSmallFontSize = j12;
        this.smallFontSize = j13;
        this.mediumFontSize = j14;
        this.largeFontSize = j15;
        this.xLargeFontSize = j16;
        this.fontFamily = num;
    }

    public /* synthetic */ PaymentsTypography(int i11, int i12, int i13, float f11, long j11, long j12, long j13, long j14, long j15, long j16, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, i13, f11, j11, j12, j13, j14, j15, j16, num);
    }

    public final int component1() {
        return this.fontWeightNormal;
    }

    /* renamed from: component10-XSAIIZE  reason: not valid java name */
    public final long m398component10XSAIIZE() {
        return this.xLargeFontSize;
    }

    public final Integer component11() {
        return this.fontFamily;
    }

    public final int component2() {
        return this.fontWeightMedium;
    }

    public final int component3() {
        return this.fontWeightBold;
    }

    public final float component4() {
        return this.fontSizeMultiplier;
    }

    /* renamed from: component5-XSAIIZE  reason: not valid java name */
    public final long m399component5XSAIIZE() {
        return this.xxSmallFontSize;
    }

    /* renamed from: component6-XSAIIZE  reason: not valid java name */
    public final long m400component6XSAIIZE() {
        return this.xSmallFontSize;
    }

    /* renamed from: component7-XSAIIZE  reason: not valid java name */
    public final long m401component7XSAIIZE() {
        return this.smallFontSize;
    }

    /* renamed from: component8-XSAIIZE  reason: not valid java name */
    public final long m402component8XSAIIZE() {
        return this.mediumFontSize;
    }

    /* renamed from: component9-XSAIIZE  reason: not valid java name */
    public final long m403component9XSAIIZE() {
        return this.largeFontSize;
    }

    /* renamed from: copy-D6c4kWA  reason: not valid java name */
    public final PaymentsTypography m404copyD6c4kWA(int i11, int i12, int i13, float f11, long j11, long j12, long j13, long j14, long j15, long j16, Integer num) {
        return new PaymentsTypography(i11, i12, i13, f11, j11, j12, j13, j14, j15, j16, num, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentsTypography) {
            PaymentsTypography paymentsTypography = (PaymentsTypography) obj;
            return this.fontWeightNormal == paymentsTypography.fontWeightNormal && this.fontWeightMedium == paymentsTypography.fontWeightMedium && this.fontWeightBold == paymentsTypography.fontWeightBold && s.c(Float.valueOf(this.fontSizeMultiplier), Float.valueOf(paymentsTypography.fontSizeMultiplier)) && r.e(this.xxSmallFontSize, paymentsTypography.xxSmallFontSize) && r.e(this.xSmallFontSize, paymentsTypography.xSmallFontSize) && r.e(this.smallFontSize, paymentsTypography.smallFontSize) && r.e(this.mediumFontSize, paymentsTypography.mediumFontSize) && r.e(this.largeFontSize, paymentsTypography.largeFontSize) && r.e(this.xLargeFontSize, paymentsTypography.xLargeFontSize) && s.c(this.fontFamily, paymentsTypography.fontFamily);
        }
        return false;
    }

    public final Integer getFontFamily() {
        return this.fontFamily;
    }

    public final float getFontSizeMultiplier() {
        return this.fontSizeMultiplier;
    }

    public final int getFontWeightBold() {
        return this.fontWeightBold;
    }

    public final int getFontWeightMedium() {
        return this.fontWeightMedium;
    }

    public final int getFontWeightNormal() {
        return this.fontWeightNormal;
    }

    /* renamed from: getLargeFontSize-XSAIIZE  reason: not valid java name */
    public final long m405getLargeFontSizeXSAIIZE() {
        return this.largeFontSize;
    }

    /* renamed from: getMediumFontSize-XSAIIZE  reason: not valid java name */
    public final long m406getMediumFontSizeXSAIIZE() {
        return this.mediumFontSize;
    }

    /* renamed from: getSmallFontSize-XSAIIZE  reason: not valid java name */
    public final long m407getSmallFontSizeXSAIIZE() {
        return this.smallFontSize;
    }

    /* renamed from: getXLargeFontSize-XSAIIZE  reason: not valid java name */
    public final long m408getXLargeFontSizeXSAIIZE() {
        return this.xLargeFontSize;
    }

    /* renamed from: getXSmallFontSize-XSAIIZE  reason: not valid java name */
    public final long m409getXSmallFontSizeXSAIIZE() {
        return this.xSmallFontSize;
    }

    /* renamed from: getXxSmallFontSize-XSAIIZE  reason: not valid java name */
    public final long m410getXxSmallFontSizeXSAIIZE() {
        return this.xxSmallFontSize;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((Integer.hashCode(this.fontWeightNormal) * 31) + Integer.hashCode(this.fontWeightMedium)) * 31) + Integer.hashCode(this.fontWeightBold)) * 31) + Float.hashCode(this.fontSizeMultiplier)) * 31) + r.i(this.xxSmallFontSize)) * 31) + r.i(this.xSmallFontSize)) * 31) + r.i(this.smallFontSize)) * 31) + r.i(this.mediumFontSize)) * 31) + r.i(this.largeFontSize)) * 31) + r.i(this.xLargeFontSize)) * 31;
        Integer num = this.fontFamily;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "PaymentsTypography(fontWeightNormal=" + this.fontWeightNormal + ", fontWeightMedium=" + this.fontWeightMedium + ", fontWeightBold=" + this.fontWeightBold + ", fontSizeMultiplier=" + this.fontSizeMultiplier + ", xxSmallFontSize=" + ((Object) r.j(this.xxSmallFontSize)) + ", xSmallFontSize=" + ((Object) r.j(this.xSmallFontSize)) + ", smallFontSize=" + ((Object) r.j(this.smallFontSize)) + ", mediumFontSize=" + ((Object) r.j(this.mediumFontSize)) + ", largeFontSize=" + ((Object) r.j(this.largeFontSize)) + ", xLargeFontSize=" + ((Object) r.j(this.xLargeFontSize)) + ", fontFamily=" + this.fontFamily + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}