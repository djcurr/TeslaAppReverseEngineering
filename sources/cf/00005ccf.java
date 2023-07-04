package com.stripe.android.view;

import com.stripe.android.R;

/* loaded from: classes6.dex */
public enum PaymentFlowPage {
    ShippingInfo(R.string.title_add_an_address),
    ShippingMethod(R.string.title_select_shipping_method);
    
    private final int titleResId;

    PaymentFlowPage(int i11) {
        this.titleResId = i11;
    }

    public final int getTitleResId() {
        return this.titleResId;
    }
}