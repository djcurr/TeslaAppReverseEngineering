package com.stripe.android.ui.core;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class PrimaryButtonStyle {
    public static final int $stable = 0;
    private final PrimaryButtonColors colorsDark;
    private final PrimaryButtonColors colorsLight;
    private final PrimaryButtonShape shape;
    private final PrimaryButtonTypography typography;

    public PrimaryButtonStyle(PrimaryButtonColors colorsLight, PrimaryButtonColors colorsDark, PrimaryButtonShape shape, PrimaryButtonTypography typography) {
        s.g(colorsLight, "colorsLight");
        s.g(colorsDark, "colorsDark");
        s.g(shape, "shape");
        s.g(typography, "typography");
        this.colorsLight = colorsLight;
        this.colorsDark = colorsDark;
        this.shape = shape;
        this.typography = typography;
    }

    public static /* synthetic */ PrimaryButtonStyle copy$default(PrimaryButtonStyle primaryButtonStyle, PrimaryButtonColors primaryButtonColors, PrimaryButtonColors primaryButtonColors2, PrimaryButtonShape primaryButtonShape, PrimaryButtonTypography primaryButtonTypography, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            primaryButtonColors = primaryButtonStyle.colorsLight;
        }
        if ((i11 & 2) != 0) {
            primaryButtonColors2 = primaryButtonStyle.colorsDark;
        }
        if ((i11 & 4) != 0) {
            primaryButtonShape = primaryButtonStyle.shape;
        }
        if ((i11 & 8) != 0) {
            primaryButtonTypography = primaryButtonStyle.typography;
        }
        return primaryButtonStyle.copy(primaryButtonColors, primaryButtonColors2, primaryButtonShape, primaryButtonTypography);
    }

    public final PrimaryButtonColors component1() {
        return this.colorsLight;
    }

    public final PrimaryButtonColors component2() {
        return this.colorsDark;
    }

    public final PrimaryButtonShape component3() {
        return this.shape;
    }

    public final PrimaryButtonTypography component4() {
        return this.typography;
    }

    public final PrimaryButtonStyle copy(PrimaryButtonColors colorsLight, PrimaryButtonColors colorsDark, PrimaryButtonShape shape, PrimaryButtonTypography typography) {
        s.g(colorsLight, "colorsLight");
        s.g(colorsDark, "colorsDark");
        s.g(shape, "shape");
        s.g(typography, "typography");
        return new PrimaryButtonStyle(colorsLight, colorsDark, shape, typography);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PrimaryButtonStyle) {
            PrimaryButtonStyle primaryButtonStyle = (PrimaryButtonStyle) obj;
            return s.c(this.colorsLight, primaryButtonStyle.colorsLight) && s.c(this.colorsDark, primaryButtonStyle.colorsDark) && s.c(this.shape, primaryButtonStyle.shape) && s.c(this.typography, primaryButtonStyle.typography);
        }
        return false;
    }

    public final PrimaryButtonColors getColorsDark() {
        return this.colorsDark;
    }

    public final PrimaryButtonColors getColorsLight() {
        return this.colorsLight;
    }

    public final PrimaryButtonShape getShape() {
        return this.shape;
    }

    public final PrimaryButtonTypography getTypography() {
        return this.typography;
    }

    public int hashCode() {
        return (((((this.colorsLight.hashCode() * 31) + this.colorsDark.hashCode()) * 31) + this.shape.hashCode()) * 31) + this.typography.hashCode();
    }

    public String toString() {
        return "PrimaryButtonStyle(colorsLight=" + this.colorsLight + ", colorsDark=" + this.colorsDark + ", shape=" + this.shape + ", typography=" + this.typography + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}