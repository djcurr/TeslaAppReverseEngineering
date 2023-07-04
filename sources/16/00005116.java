package com.stripe.android.model;

import com.stripe.android.core.model.StripeModel;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public abstract class CustomerPaymentSource implements StripeModel {
    public static final int $stable = 0;

    private CustomerPaymentSource() {
    }

    public /* synthetic */ CustomerPaymentSource(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getId();

    public abstract TokenizationMethod getTokenizationMethod();
}