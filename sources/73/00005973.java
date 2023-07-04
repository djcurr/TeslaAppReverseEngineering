package com.stripe.android.ui.core;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import t1.a0;
import y0.l;

/* loaded from: classes6.dex */
public final class PaymentsColors {
    public static final int $stable = 0;
    private final long appBarIcon;
    private final long component;
    private final long componentBorder;
    private final long componentDivider;
    private final l materialColors;
    private final long onComponent;
    private final long placeholderText;
    private final long subtitle;
    private final long textCursor;

    private PaymentsColors(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, l lVar) {
        this.component = j11;
        this.componentBorder = j12;
        this.componentDivider = j13;
        this.onComponent = j14;
        this.subtitle = j15;
        this.textCursor = j16;
        this.placeholderText = j17;
        this.appBarIcon = j18;
        this.materialColors = lVar;
    }

    public /* synthetic */ PaymentsColors(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, j14, j15, j16, j17, j18, lVar);
    }

    /* renamed from: component1-0d7_KjU  reason: not valid java name */
    public final long m371component10d7_KjU() {
        return this.component;
    }

    /* renamed from: component2-0d7_KjU  reason: not valid java name */
    public final long m372component20d7_KjU() {
        return this.componentBorder;
    }

    /* renamed from: component3-0d7_KjU  reason: not valid java name */
    public final long m373component30d7_KjU() {
        return this.componentDivider;
    }

    /* renamed from: component4-0d7_KjU  reason: not valid java name */
    public final long m374component40d7_KjU() {
        return this.onComponent;
    }

    /* renamed from: component5-0d7_KjU  reason: not valid java name */
    public final long m375component50d7_KjU() {
        return this.subtitle;
    }

    /* renamed from: component6-0d7_KjU  reason: not valid java name */
    public final long m376component60d7_KjU() {
        return this.textCursor;
    }

    /* renamed from: component7-0d7_KjU  reason: not valid java name */
    public final long m377component70d7_KjU() {
        return this.placeholderText;
    }

    /* renamed from: component8-0d7_KjU  reason: not valid java name */
    public final long m378component80d7_KjU() {
        return this.appBarIcon;
    }

    public final l component9() {
        return this.materialColors;
    }

    /* renamed from: copy-KvvhxLA  reason: not valid java name */
    public final PaymentsColors m379copyKvvhxLA(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, l materialColors) {
        s.g(materialColors, "materialColors");
        return new PaymentsColors(j11, j12, j13, j14, j15, j16, j17, j18, materialColors, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentsColors) {
            PaymentsColors paymentsColors = (PaymentsColors) obj;
            return a0.n(this.component, paymentsColors.component) && a0.n(this.componentBorder, paymentsColors.componentBorder) && a0.n(this.componentDivider, paymentsColors.componentDivider) && a0.n(this.onComponent, paymentsColors.onComponent) && a0.n(this.subtitle, paymentsColors.subtitle) && a0.n(this.textCursor, paymentsColors.textCursor) && a0.n(this.placeholderText, paymentsColors.placeholderText) && a0.n(this.appBarIcon, paymentsColors.appBarIcon) && s.c(this.materialColors, paymentsColors.materialColors);
        }
        return false;
    }

    /* renamed from: getAppBarIcon-0d7_KjU  reason: not valid java name */
    public final long m380getAppBarIcon0d7_KjU() {
        return this.appBarIcon;
    }

    /* renamed from: getComponent-0d7_KjU  reason: not valid java name */
    public final long m381getComponent0d7_KjU() {
        return this.component;
    }

    /* renamed from: getComponentBorder-0d7_KjU  reason: not valid java name */
    public final long m382getComponentBorder0d7_KjU() {
        return this.componentBorder;
    }

    /* renamed from: getComponentDivider-0d7_KjU  reason: not valid java name */
    public final long m383getComponentDivider0d7_KjU() {
        return this.componentDivider;
    }

    public final l getMaterialColors() {
        return this.materialColors;
    }

    /* renamed from: getOnComponent-0d7_KjU  reason: not valid java name */
    public final long m384getOnComponent0d7_KjU() {
        return this.onComponent;
    }

    /* renamed from: getPlaceholderText-0d7_KjU  reason: not valid java name */
    public final long m385getPlaceholderText0d7_KjU() {
        return this.placeholderText;
    }

    /* renamed from: getSubtitle-0d7_KjU  reason: not valid java name */
    public final long m386getSubtitle0d7_KjU() {
        return this.subtitle;
    }

    /* renamed from: getTextCursor-0d7_KjU  reason: not valid java name */
    public final long m387getTextCursor0d7_KjU() {
        return this.textCursor;
    }

    public int hashCode() {
        return (((((((((((((((a0.t(this.component) * 31) + a0.t(this.componentBorder)) * 31) + a0.t(this.componentDivider)) * 31) + a0.t(this.onComponent)) * 31) + a0.t(this.subtitle)) * 31) + a0.t(this.textCursor)) * 31) + a0.t(this.placeholderText)) * 31) + a0.t(this.appBarIcon)) * 31) + this.materialColors.hashCode();
    }

    public String toString() {
        return "PaymentsColors(component=" + ((Object) a0.u(this.component)) + ", componentBorder=" + ((Object) a0.u(this.componentBorder)) + ", componentDivider=" + ((Object) a0.u(this.componentDivider)) + ", onComponent=" + ((Object) a0.u(this.onComponent)) + ", subtitle=" + ((Object) a0.u(this.subtitle)) + ", textCursor=" + ((Object) a0.u(this.textCursor)) + ", placeholderText=" + ((Object) a0.u(this.placeholderText)) + ", appBarIcon=" + ((Object) a0.u(this.appBarIcon)) + ", materialColors=" + this.materialColors + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}