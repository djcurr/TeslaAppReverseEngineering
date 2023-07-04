package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import b5.a;
import b5.b;
import com.stripe.android.R;
import com.stripe.android.view.CardMultilineWidget;
import com.stripe.android.view.ShippingInfoWidget;

/* loaded from: classes2.dex */
public final class AddPaymentMethodCardViewBinding implements a {
    public final LinearLayout addPaymentMethodCard;
    public final ShippingInfoWidget billingAddressWidget;
    public final CardMultilineWidget cardMultilineWidget;
    private final LinearLayout rootView;

    private AddPaymentMethodCardViewBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ShippingInfoWidget shippingInfoWidget, CardMultilineWidget cardMultilineWidget) {
        this.rootView = linearLayout;
        this.addPaymentMethodCard = linearLayout2;
        this.billingAddressWidget = shippingInfoWidget;
        this.cardMultilineWidget = cardMultilineWidget;
    }

    public static AddPaymentMethodCardViewBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R.id.billing_address_widget;
        ShippingInfoWidget shippingInfoWidget = (ShippingInfoWidget) b.a(view, i11);
        if (shippingInfoWidget != null) {
            i11 = R.id.card_multiline_widget;
            CardMultilineWidget cardMultilineWidget = (CardMultilineWidget) b.a(view, i11);
            if (cardMultilineWidget != null) {
                return new AddPaymentMethodCardViewBinding(linearLayout, linearLayout, shippingInfoWidget, cardMultilineWidget);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static AddPaymentMethodCardViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AddPaymentMethodCardViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.add_payment_method_card_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // b5.a
    public LinearLayout getRoot() {
        return this.rootView;
    }
}