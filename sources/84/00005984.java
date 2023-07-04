package com.stripe.android.ui.core;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import x2.r;

/* loaded from: classes6.dex */
public final class PrimaryButtonTypography {
    public static final int $stable = 0;
    private final Integer fontFamily;
    private final long fontSize;

    private PrimaryButtonTypography(Integer num, long j11) {
        this.fontFamily = num;
        this.fontSize = j11;
    }

    public /* synthetic */ PrimaryButtonTypography(Integer num, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, j11);
    }

    /* renamed from: copy-mpE4wyQ$default  reason: not valid java name */
    public static /* synthetic */ PrimaryButtonTypography m419copympE4wyQ$default(PrimaryButtonTypography primaryButtonTypography, Integer num, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = primaryButtonTypography.fontFamily;
        }
        if ((i11 & 2) != 0) {
            j11 = primaryButtonTypography.fontSize;
        }
        return primaryButtonTypography.m421copympE4wyQ(num, j11);
    }

    public final Integer component1() {
        return this.fontFamily;
    }

    /* renamed from: component2-XSAIIZE  reason: not valid java name */
    public final long m420component2XSAIIZE() {
        return this.fontSize;
    }

    /* renamed from: copy-mpE4wyQ  reason: not valid java name */
    public final PrimaryButtonTypography m421copympE4wyQ(Integer num, long j11) {
        return new PrimaryButtonTypography(num, j11, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PrimaryButtonTypography) {
            PrimaryButtonTypography primaryButtonTypography = (PrimaryButtonTypography) obj;
            return s.c(this.fontFamily, primaryButtonTypography.fontFamily) && r.e(this.fontSize, primaryButtonTypography.fontSize);
        }
        return false;
    }

    public final Integer getFontFamily() {
        return this.fontFamily;
    }

    /* renamed from: getFontSize-XSAIIZE  reason: not valid java name */
    public final long m422getFontSizeXSAIIZE() {
        return this.fontSize;
    }

    public int hashCode() {
        Integer num = this.fontFamily;
        return ((num == null ? 0 : num.hashCode()) * 31) + r.i(this.fontSize);
    }

    public String toString() {
        return "PrimaryButtonTypography(fontFamily=" + this.fontFamily + ", fontSize=" + ((Object) r.j(this.fontSize)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}