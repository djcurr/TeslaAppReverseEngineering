package com.stripe.android.ui.core;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class PaymentsShapes {
    public static final int $stable = 0;
    private final float borderStrokeWidth;
    private final float borderStrokeWidthSelected;
    private final float cornerRadius;

    public PaymentsShapes(float f11, float f12, float f13) {
        this.cornerRadius = f11;
        this.borderStrokeWidth = f12;
        this.borderStrokeWidthSelected = f13;
    }

    public static /* synthetic */ PaymentsShapes copy$default(PaymentsShapes paymentsShapes, float f11, float f12, float f13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = paymentsShapes.cornerRadius;
        }
        if ((i11 & 2) != 0) {
            f12 = paymentsShapes.borderStrokeWidth;
        }
        if ((i11 & 4) != 0) {
            f13 = paymentsShapes.borderStrokeWidthSelected;
        }
        return paymentsShapes.copy(f11, f12, f13);
    }

    public final float component1() {
        return this.cornerRadius;
    }

    public final float component2() {
        return this.borderStrokeWidth;
    }

    public final float component3() {
        return this.borderStrokeWidthSelected;
    }

    public final PaymentsShapes copy(float f11, float f12, float f13) {
        return new PaymentsShapes(f11, f12, f13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentsShapes) {
            PaymentsShapes paymentsShapes = (PaymentsShapes) obj;
            return s.c(Float.valueOf(this.cornerRadius), Float.valueOf(paymentsShapes.cornerRadius)) && s.c(Float.valueOf(this.borderStrokeWidth), Float.valueOf(paymentsShapes.borderStrokeWidth)) && s.c(Float.valueOf(this.borderStrokeWidthSelected), Float.valueOf(paymentsShapes.borderStrokeWidthSelected));
        }
        return false;
    }

    public final float getBorderStrokeWidth() {
        return this.borderStrokeWidth;
    }

    public final float getBorderStrokeWidthSelected() {
        return this.borderStrokeWidthSelected;
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public int hashCode() {
        return (((Float.hashCode(this.cornerRadius) * 31) + Float.hashCode(this.borderStrokeWidth)) * 31) + Float.hashCode(this.borderStrokeWidthSelected);
    }

    public String toString() {
        return "PaymentsShapes(cornerRadius=" + this.cornerRadius + ", borderStrokeWidth=" + this.borderStrokeWidth + ", borderStrokeWidthSelected=" + this.borderStrokeWidthSelected + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}