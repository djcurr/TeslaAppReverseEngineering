package com.stripe.android.ui.core;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class PrimaryButtonShape {
    public static final int $stable = 0;
    private final float borderStrokeWidth;
    private final float cornerRadius;

    public PrimaryButtonShape(float f11, float f12) {
        this.cornerRadius = f11;
        this.borderStrokeWidth = f12;
    }

    public static /* synthetic */ PrimaryButtonShape copy$default(PrimaryButtonShape primaryButtonShape, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = primaryButtonShape.cornerRadius;
        }
        if ((i11 & 2) != 0) {
            f12 = primaryButtonShape.borderStrokeWidth;
        }
        return primaryButtonShape.copy(f11, f12);
    }

    public final float component1() {
        return this.cornerRadius;
    }

    public final float component2() {
        return this.borderStrokeWidth;
    }

    public final PrimaryButtonShape copy(float f11, float f12) {
        return new PrimaryButtonShape(f11, f12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PrimaryButtonShape) {
            PrimaryButtonShape primaryButtonShape = (PrimaryButtonShape) obj;
            return s.c(Float.valueOf(this.cornerRadius), Float.valueOf(primaryButtonShape.cornerRadius)) && s.c(Float.valueOf(this.borderStrokeWidth), Float.valueOf(primaryButtonShape.borderStrokeWidth));
        }
        return false;
    }

    public final float getBorderStrokeWidth() {
        return this.borderStrokeWidth;
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public int hashCode() {
        return (Float.hashCode(this.cornerRadius) * 31) + Float.hashCode(this.borderStrokeWidth);
    }

    public String toString() {
        return "PrimaryButtonShape(cornerRadius=" + this.cornerRadius + ", borderStrokeWidth=" + this.borderStrokeWidth + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}