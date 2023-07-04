package com.stripe.android.link.theme;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import t1.a0;
import y0.l;

/* loaded from: classes6.dex */
public final class LinkColors {
    private final long buttonLabel;
    private final long closeButton;
    private final long componentBackground;
    private final long componentBorder;
    private final long componentDivider;
    private final long dialogButtonLabel;
    private final long disabledText;
    private final long errorComponentBackground;
    private final long errorText;
    private final long linkLogo;
    private final l materialColors;
    private final long secondaryButtonLabel;

    private LinkColors(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, l lVar) {
        this.componentBackground = j11;
        this.componentBorder = j12;
        this.componentDivider = j13;
        this.buttonLabel = j14;
        this.dialogButtonLabel = j15;
        this.disabledText = j16;
        this.closeButton = j17;
        this.linkLogo = j18;
        this.errorText = j19;
        this.errorComponentBackground = j21;
        this.secondaryButtonLabel = j22;
        this.materialColors = lVar;
    }

    public /* synthetic */ LinkColors(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, j22, lVar);
    }

    /* renamed from: component1-0d7_KjU  reason: not valid java name */
    public final long m175component10d7_KjU() {
        return this.componentBackground;
    }

    /* renamed from: component10-0d7_KjU  reason: not valid java name */
    public final long m176component100d7_KjU() {
        return this.errorComponentBackground;
    }

    /* renamed from: component11-0d7_KjU  reason: not valid java name */
    public final long m177component110d7_KjU() {
        return this.secondaryButtonLabel;
    }

    public final l component12() {
        return this.materialColors;
    }

    /* renamed from: component2-0d7_KjU  reason: not valid java name */
    public final long m178component20d7_KjU() {
        return this.componentBorder;
    }

    /* renamed from: component3-0d7_KjU  reason: not valid java name */
    public final long m179component30d7_KjU() {
        return this.componentDivider;
    }

    /* renamed from: component4-0d7_KjU  reason: not valid java name */
    public final long m180component40d7_KjU() {
        return this.buttonLabel;
    }

    /* renamed from: component5-0d7_KjU  reason: not valid java name */
    public final long m181component50d7_KjU() {
        return this.dialogButtonLabel;
    }

    /* renamed from: component6-0d7_KjU  reason: not valid java name */
    public final long m182component60d7_KjU() {
        return this.disabledText;
    }

    /* renamed from: component7-0d7_KjU  reason: not valid java name */
    public final long m183component70d7_KjU() {
        return this.closeButton;
    }

    /* renamed from: component8-0d7_KjU  reason: not valid java name */
    public final long m184component80d7_KjU() {
        return this.linkLogo;
    }

    /* renamed from: component9-0d7_KjU  reason: not valid java name */
    public final long m185component90d7_KjU() {
        return this.errorText;
    }

    /* renamed from: copy-ZfCOgdI  reason: not valid java name */
    public final LinkColors m186copyZfCOgdI(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, l materialColors) {
        s.g(materialColors, "materialColors");
        return new LinkColors(j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, j22, materialColors, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LinkColors) {
            LinkColors linkColors = (LinkColors) obj;
            return a0.n(this.componentBackground, linkColors.componentBackground) && a0.n(this.componentBorder, linkColors.componentBorder) && a0.n(this.componentDivider, linkColors.componentDivider) && a0.n(this.buttonLabel, linkColors.buttonLabel) && a0.n(this.dialogButtonLabel, linkColors.dialogButtonLabel) && a0.n(this.disabledText, linkColors.disabledText) && a0.n(this.closeButton, linkColors.closeButton) && a0.n(this.linkLogo, linkColors.linkLogo) && a0.n(this.errorText, linkColors.errorText) && a0.n(this.errorComponentBackground, linkColors.errorComponentBackground) && a0.n(this.secondaryButtonLabel, linkColors.secondaryButtonLabel) && s.c(this.materialColors, linkColors.materialColors);
        }
        return false;
    }

    /* renamed from: getButtonLabel-0d7_KjU  reason: not valid java name */
    public final long m187getButtonLabel0d7_KjU() {
        return this.buttonLabel;
    }

    /* renamed from: getCloseButton-0d7_KjU  reason: not valid java name */
    public final long m188getCloseButton0d7_KjU() {
        return this.closeButton;
    }

    /* renamed from: getComponentBackground-0d7_KjU  reason: not valid java name */
    public final long m189getComponentBackground0d7_KjU() {
        return this.componentBackground;
    }

    /* renamed from: getComponentBorder-0d7_KjU  reason: not valid java name */
    public final long m190getComponentBorder0d7_KjU() {
        return this.componentBorder;
    }

    /* renamed from: getComponentDivider-0d7_KjU  reason: not valid java name */
    public final long m191getComponentDivider0d7_KjU() {
        return this.componentDivider;
    }

    /* renamed from: getDialogButtonLabel-0d7_KjU  reason: not valid java name */
    public final long m192getDialogButtonLabel0d7_KjU() {
        return this.dialogButtonLabel;
    }

    /* renamed from: getDisabledText-0d7_KjU  reason: not valid java name */
    public final long m193getDisabledText0d7_KjU() {
        return this.disabledText;
    }

    /* renamed from: getErrorComponentBackground-0d7_KjU  reason: not valid java name */
    public final long m194getErrorComponentBackground0d7_KjU() {
        return this.errorComponentBackground;
    }

    /* renamed from: getErrorText-0d7_KjU  reason: not valid java name */
    public final long m195getErrorText0d7_KjU() {
        return this.errorText;
    }

    /* renamed from: getLinkLogo-0d7_KjU  reason: not valid java name */
    public final long m196getLinkLogo0d7_KjU() {
        return this.linkLogo;
    }

    public final l getMaterialColors() {
        return this.materialColors;
    }

    /* renamed from: getSecondaryButtonLabel-0d7_KjU  reason: not valid java name */
    public final long m197getSecondaryButtonLabel0d7_KjU() {
        return this.secondaryButtonLabel;
    }

    public int hashCode() {
        return (((((((((((((((((((((a0.t(this.componentBackground) * 31) + a0.t(this.componentBorder)) * 31) + a0.t(this.componentDivider)) * 31) + a0.t(this.buttonLabel)) * 31) + a0.t(this.dialogButtonLabel)) * 31) + a0.t(this.disabledText)) * 31) + a0.t(this.closeButton)) * 31) + a0.t(this.linkLogo)) * 31) + a0.t(this.errorText)) * 31) + a0.t(this.errorComponentBackground)) * 31) + a0.t(this.secondaryButtonLabel)) * 31) + this.materialColors.hashCode();
    }

    public String toString() {
        return "LinkColors(componentBackground=" + ((Object) a0.u(this.componentBackground)) + ", componentBorder=" + ((Object) a0.u(this.componentBorder)) + ", componentDivider=" + ((Object) a0.u(this.componentDivider)) + ", buttonLabel=" + ((Object) a0.u(this.buttonLabel)) + ", dialogButtonLabel=" + ((Object) a0.u(this.dialogButtonLabel)) + ", disabledText=" + ((Object) a0.u(this.disabledText)) + ", closeButton=" + ((Object) a0.u(this.closeButton)) + ", linkLogo=" + ((Object) a0.u(this.linkLogo)) + ", errorText=" + ((Object) a0.u(this.errorText)) + ", errorComponentBackground=" + ((Object) a0.u(this.errorComponentBackground)) + ", secondaryButtonLabel=" + ((Object) a0.u(this.secondaryButtonLabel)) + ", materialColors=" + this.materialColors + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}