package com.stripe.android.paymentsheet.model;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class PaymentOption {
    public static final int $stable = 0;
    private final int drawableResourceId;
    private final String label;

    public PaymentOption(int i11, String label) {
        s.g(label, "label");
        this.drawableResourceId = i11;
        this.label = label;
    }

    public static /* synthetic */ PaymentOption copy$default(PaymentOption paymentOption, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = paymentOption.drawableResourceId;
        }
        if ((i12 & 2) != 0) {
            str = paymentOption.label;
        }
        return paymentOption.copy(i11, str);
    }

    public final int component1() {
        return this.drawableResourceId;
    }

    public final String component2() {
        return this.label;
    }

    public final PaymentOption copy(int i11, String label) {
        s.g(label, "label");
        return new PaymentOption(i11, label);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentOption) {
            PaymentOption paymentOption = (PaymentOption) obj;
            return this.drawableResourceId == paymentOption.drawableResourceId && s.c(this.label, paymentOption.label);
        }
        return false;
    }

    public final int getDrawableResourceId() {
        return this.drawableResourceId;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return (Integer.hashCode(this.drawableResourceId) * 31) + this.label.hashCode();
    }

    public String toString() {
        return "PaymentOption(drawableResourceId=" + this.drawableResourceId + ", label=" + this.label + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}