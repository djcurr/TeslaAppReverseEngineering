package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import b5.a;
import b5.b;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R;
import com.stripe.android.view.CardNumberEditText;
import com.stripe.android.view.CardNumberTextInputLayout;
import com.stripe.android.view.CvcEditText;
import com.stripe.android.view.ExpiryDateEditText;
import com.stripe.android.view.PostalCodeEditText;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class CardMultilineWidgetBinding implements a {
    public final CardNumberEditText etCardNumber;
    public final CvcEditText etCvc;
    public final ExpiryDateEditText etExpiry;
    public final PostalCodeEditText etPostalCode;
    private final View rootView;
    public final LinearLayout secondRowLayout;
    public final CardNumberTextInputLayout tlCardNumber;
    public final TextInputLayout tlCvc;
    public final TextInputLayout tlExpiry;
    public final TextInputLayout tlPostalCode;

    private CardMultilineWidgetBinding(View view, CardNumberEditText cardNumberEditText, CvcEditText cvcEditText, ExpiryDateEditText expiryDateEditText, PostalCodeEditText postalCodeEditText, LinearLayout linearLayout, CardNumberTextInputLayout cardNumberTextInputLayout, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3) {
        this.rootView = view;
        this.etCardNumber = cardNumberEditText;
        this.etCvc = cvcEditText;
        this.etExpiry = expiryDateEditText;
        this.etPostalCode = postalCodeEditText;
        this.secondRowLayout = linearLayout;
        this.tlCardNumber = cardNumberTextInputLayout;
        this.tlCvc = textInputLayout;
        this.tlExpiry = textInputLayout2;
        this.tlPostalCode = textInputLayout3;
    }

    public static CardMultilineWidgetBinding bind(View view) {
        int i11 = R.id.et_card_number;
        CardNumberEditText cardNumberEditText = (CardNumberEditText) b.a(view, i11);
        if (cardNumberEditText != null) {
            i11 = R.id.et_cvc;
            CvcEditText cvcEditText = (CvcEditText) b.a(view, i11);
            if (cvcEditText != null) {
                i11 = R.id.et_expiry;
                ExpiryDateEditText expiryDateEditText = (ExpiryDateEditText) b.a(view, i11);
                if (expiryDateEditText != null) {
                    i11 = R.id.et_postal_code;
                    PostalCodeEditText postalCodeEditText = (PostalCodeEditText) b.a(view, i11);
                    if (postalCodeEditText != null) {
                        i11 = R.id.second_row_layout;
                        LinearLayout linearLayout = (LinearLayout) b.a(view, i11);
                        if (linearLayout != null) {
                            i11 = R.id.tl_card_number;
                            CardNumberTextInputLayout cardNumberTextInputLayout = (CardNumberTextInputLayout) b.a(view, i11);
                            if (cardNumberTextInputLayout != null) {
                                i11 = R.id.tl_cvc;
                                TextInputLayout textInputLayout = (TextInputLayout) b.a(view, i11);
                                if (textInputLayout != null) {
                                    i11 = R.id.tl_expiry;
                                    TextInputLayout textInputLayout2 = (TextInputLayout) b.a(view, i11);
                                    if (textInputLayout2 != null) {
                                        i11 = R.id.tl_postal_code;
                                        TextInputLayout textInputLayout3 = (TextInputLayout) b.a(view, i11);
                                        if (textInputLayout3 != null) {
                                            return new CardMultilineWidgetBinding(view, cardNumberEditText, cvcEditText, expiryDateEditText, postalCodeEditText, linearLayout, cardNumberTextInputLayout, textInputLayout, textInputLayout2, textInputLayout3);
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

    public static CardMultilineWidgetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.card_multiline_widget, viewGroup);
        return bind(viewGroup);
    }

    @Override // b5.a
    public View getRoot() {
        return this.rootView;
    }
}