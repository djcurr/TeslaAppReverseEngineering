package com.stripe.android.ui.core;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import x2.g;
import y0.x0;

/* loaded from: classes6.dex */
public final class PaymentsComposeShapes {
    public static final int $stable = 0;
    private final float borderStrokeWidth;
    private final float borderStrokeWidthSelected;
    private final x0 material;

    private PaymentsComposeShapes(float f11, float f12, x0 x0Var) {
        this.borderStrokeWidth = f11;
        this.borderStrokeWidthSelected = f12;
        this.material = x0Var;
    }

    public /* synthetic */ PaymentsComposeShapes(float f11, float f12, x0 x0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, x0Var);
    }

    /* renamed from: copy-Md-fbLM$default  reason: not valid java name */
    public static /* synthetic */ PaymentsComposeShapes m388copyMdfbLM$default(PaymentsComposeShapes paymentsComposeShapes, float f11, float f12, x0 x0Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = paymentsComposeShapes.borderStrokeWidth;
        }
        if ((i11 & 2) != 0) {
            f12 = paymentsComposeShapes.borderStrokeWidthSelected;
        }
        if ((i11 & 4) != 0) {
            x0Var = paymentsComposeShapes.material;
        }
        return paymentsComposeShapes.m391copyMdfbLM(f11, f12, x0Var);
    }

    /* renamed from: component1-D9Ej5fM  reason: not valid java name */
    public final float m389component1D9Ej5fM() {
        return this.borderStrokeWidth;
    }

    /* renamed from: component2-D9Ej5fM  reason: not valid java name */
    public final float m390component2D9Ej5fM() {
        return this.borderStrokeWidthSelected;
    }

    public final x0 component3() {
        return this.material;
    }

    /* renamed from: copy-Md-fbLM  reason: not valid java name */
    public final PaymentsComposeShapes m391copyMdfbLM(float f11, float f12, x0 material) {
        s.g(material, "material");
        return new PaymentsComposeShapes(f11, f12, material, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentsComposeShapes) {
            PaymentsComposeShapes paymentsComposeShapes = (PaymentsComposeShapes) obj;
            return g.h(this.borderStrokeWidth, paymentsComposeShapes.borderStrokeWidth) && g.h(this.borderStrokeWidthSelected, paymentsComposeShapes.borderStrokeWidthSelected) && s.c(this.material, paymentsComposeShapes.material);
        }
        return false;
    }

    /* renamed from: getBorderStrokeWidth-D9Ej5fM  reason: not valid java name */
    public final float m392getBorderStrokeWidthD9Ej5fM() {
        return this.borderStrokeWidth;
    }

    /* renamed from: getBorderStrokeWidthSelected-D9Ej5fM  reason: not valid java name */
    public final float m393getBorderStrokeWidthSelectedD9Ej5fM() {
        return this.borderStrokeWidthSelected;
    }

    public final x0 getMaterial() {
        return this.material;
    }

    public int hashCode() {
        return (((g.i(this.borderStrokeWidth) * 31) + g.i(this.borderStrokeWidthSelected)) * 31) + this.material.hashCode();
    }

    public String toString() {
        return "PaymentsComposeShapes(borderStrokeWidth=" + ((Object) g.k(this.borderStrokeWidth)) + ", borderStrokeWidthSelected=" + ((Object) g.k(this.borderStrokeWidthSelected)) + ", material=" + this.material + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}