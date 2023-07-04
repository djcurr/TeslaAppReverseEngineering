package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import b5.a;
import b5.b;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R;
import com.stripe.android.view.CardMultilineWidget;
import com.stripe.android.view.CountryTextInputLayout;
import com.stripe.android.view.PostalCodeEditText;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class StripeCardFormViewBinding implements a {
    public final CardMultilineWidget cardMultilineWidget;
    public final MaterialCardView cardMultilineWidgetContainer;
    public final CountryTextInputLayout countryLayout;
    public final View countryPostalDivider;
    public final TextView errors;
    public final PostalCodeEditText postalCode;
    public final TextInputLayout postalCodeContainer;
    private final View rootView;

    private StripeCardFormViewBinding(View view, CardMultilineWidget cardMultilineWidget, MaterialCardView materialCardView, CountryTextInputLayout countryTextInputLayout, View view2, TextView textView, PostalCodeEditText postalCodeEditText, TextInputLayout textInputLayout) {
        this.rootView = view;
        this.cardMultilineWidget = cardMultilineWidget;
        this.cardMultilineWidgetContainer = materialCardView;
        this.countryLayout = countryTextInputLayout;
        this.countryPostalDivider = view2;
        this.errors = textView;
        this.postalCode = postalCodeEditText;
        this.postalCodeContainer = textInputLayout;
    }

    public static StripeCardFormViewBinding bind(View view) {
        View a11;
        int i11 = R.id.card_multiline_widget;
        CardMultilineWidget cardMultilineWidget = (CardMultilineWidget) b.a(view, i11);
        if (cardMultilineWidget != null) {
            i11 = R.id.card_multiline_widget_container;
            MaterialCardView materialCardView = (MaterialCardView) b.a(view, i11);
            if (materialCardView != null) {
                i11 = R.id.country_layout;
                CountryTextInputLayout countryTextInputLayout = (CountryTextInputLayout) b.a(view, i11);
                if (countryTextInputLayout != null && (a11 = b.a(view, (i11 = R.id.country_postal_divider))) != null) {
                    i11 = R.id.errors;
                    TextView textView = (TextView) b.a(view, i11);
                    if (textView != null) {
                        i11 = R.id.postal_code;
                        PostalCodeEditText postalCodeEditText = (PostalCodeEditText) b.a(view, i11);
                        if (postalCodeEditText != null) {
                            i11 = R.id.postal_code_container;
                            TextInputLayout textInputLayout = (TextInputLayout) b.a(view, i11);
                            if (textInputLayout != null) {
                                return new StripeCardFormViewBinding(view, cardMultilineWidget, materialCardView, countryTextInputLayout, a11, textView, postalCodeEditText, textInputLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static StripeCardFormViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.stripe_card_form_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // b5.a
    public View getRoot() {
        return this.rootView;
    }
}