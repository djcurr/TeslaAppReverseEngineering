package com.stripe.android.paymentsheet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import b5.a;
import b5.b;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.ui.BillingAddressView;
import com.stripe.android.view.CardMultilineWidget;

/* loaded from: classes6.dex */
public final class FragmentPaymentsheetAddCardBinding implements a {
    public final BillingAddressView billingAddress;
    public final TextView billingAddressLabel;
    public final TextView billingErrors;
    public final Space bottomSpace;
    public final TextView cardErrors;
    public final TextView cardInfoLabel;
    public final CardMultilineWidget cardMultilineWidget;
    public final MaterialCardView cardMultilineWidgetContainer;
    private final ConstraintLayout rootView;
    public final MaterialCheckBox saveCardCheckbox;

    private FragmentPaymentsheetAddCardBinding(ConstraintLayout constraintLayout, BillingAddressView billingAddressView, TextView textView, TextView textView2, Space space, TextView textView3, TextView textView4, CardMultilineWidget cardMultilineWidget, MaterialCardView materialCardView, MaterialCheckBox materialCheckBox) {
        this.rootView = constraintLayout;
        this.billingAddress = billingAddressView;
        this.billingAddressLabel = textView;
        this.billingErrors = textView2;
        this.bottomSpace = space;
        this.cardErrors = textView3;
        this.cardInfoLabel = textView4;
        this.cardMultilineWidget = cardMultilineWidget;
        this.cardMultilineWidgetContainer = materialCardView;
        this.saveCardCheckbox = materialCheckBox;
    }

    public static FragmentPaymentsheetAddCardBinding bind(View view) {
        int i11 = R.id.billing_address;
        BillingAddressView billingAddressView = (BillingAddressView) b.a(view, i11);
        if (billingAddressView != null) {
            i11 = R.id.billing_address_label;
            TextView textView = (TextView) b.a(view, i11);
            if (textView != null) {
                i11 = R.id.billing_errors;
                TextView textView2 = (TextView) b.a(view, i11);
                if (textView2 != null) {
                    i11 = R.id.bottom_space;
                    Space space = (Space) b.a(view, i11);
                    if (space != null) {
                        i11 = R.id.card_errors;
                        TextView textView3 = (TextView) b.a(view, i11);
                        if (textView3 != null) {
                            i11 = R.id.card_info_label;
                            TextView textView4 = (TextView) b.a(view, i11);
                            if (textView4 != null) {
                                i11 = R.id.card_multiline_widget;
                                CardMultilineWidget cardMultilineWidget = (CardMultilineWidget) b.a(view, i11);
                                if (cardMultilineWidget != null) {
                                    i11 = R.id.card_multiline_widget_container;
                                    MaterialCardView materialCardView = (MaterialCardView) b.a(view, i11);
                                    if (materialCardView != null) {
                                        i11 = R.id.save_card_checkbox;
                                        MaterialCheckBox materialCheckBox = (MaterialCheckBox) b.a(view, i11);
                                        if (materialCheckBox != null) {
                                            return new FragmentPaymentsheetAddCardBinding((ConstraintLayout) view, billingAddressView, textView, textView2, space, textView3, textView4, cardMultilineWidget, materialCardView, materialCheckBox);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static FragmentPaymentsheetAddCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPaymentsheetAddCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.fragment_paymentsheet_add_card, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // b5.a
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}