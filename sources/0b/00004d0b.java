package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b5.a;
import b5.b;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R;
import com.stripe.android.view.CardBrandView;
import com.stripe.android.view.CardNumberEditText;
import com.stripe.android.view.CvcEditText;
import com.stripe.android.view.ExpiryDateEditText;
import com.stripe.android.view.PostalCodeEditText;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class CardInputWidgetBinding implements a {
    public final CardBrandView cardBrandView;
    public final CardNumberEditText cardNumberEditText;
    public final TextInputLayout cardNumberTextInputLayout;
    public final FrameLayout container;
    public final CvcEditText cvcEditText;
    public final TextInputLayout cvcTextInputLayout;
    public final ExpiryDateEditText expiryDateEditText;
    public final TextInputLayout expiryDateTextInputLayout;
    public final PostalCodeEditText postalCodeEditText;
    public final TextInputLayout postalCodeTextInputLayout;
    private final View rootView;

    private CardInputWidgetBinding(View view, CardBrandView cardBrandView, CardNumberEditText cardNumberEditText, TextInputLayout textInputLayout, FrameLayout frameLayout, CvcEditText cvcEditText, TextInputLayout textInputLayout2, ExpiryDateEditText expiryDateEditText, TextInputLayout textInputLayout3, PostalCodeEditText postalCodeEditText, TextInputLayout textInputLayout4) {
        this.rootView = view;
        this.cardBrandView = cardBrandView;
        this.cardNumberEditText = cardNumberEditText;
        this.cardNumberTextInputLayout = textInputLayout;
        this.container = frameLayout;
        this.cvcEditText = cvcEditText;
        this.cvcTextInputLayout = textInputLayout2;
        this.expiryDateEditText = expiryDateEditText;
        this.expiryDateTextInputLayout = textInputLayout3;
        this.postalCodeEditText = postalCodeEditText;
        this.postalCodeTextInputLayout = textInputLayout4;
    }

    public static CardInputWidgetBinding bind(View view) {
        int i11 = R.id.card_brand_view;
        CardBrandView cardBrandView = (CardBrandView) b.a(view, i11);
        if (cardBrandView != null) {
            i11 = R.id.card_number_edit_text;
            CardNumberEditText cardNumberEditText = (CardNumberEditText) b.a(view, i11);
            if (cardNumberEditText != null) {
                i11 = R.id.card_number_text_input_layout;
                TextInputLayout textInputLayout = (TextInputLayout) b.a(view, i11);
                if (textInputLayout != null) {
                    i11 = R.id.container;
                    FrameLayout frameLayout = (FrameLayout) b.a(view, i11);
                    if (frameLayout != null) {
                        i11 = R.id.cvc_edit_text;
                        CvcEditText cvcEditText = (CvcEditText) b.a(view, i11);
                        if (cvcEditText != null) {
                            i11 = R.id.cvc_text_input_layout;
                            TextInputLayout textInputLayout2 = (TextInputLayout) b.a(view, i11);
                            if (textInputLayout2 != null) {
                                i11 = R.id.expiry_date_edit_text;
                                ExpiryDateEditText expiryDateEditText = (ExpiryDateEditText) b.a(view, i11);
                                if (expiryDateEditText != null) {
                                    i11 = R.id.expiry_date_text_input_layout;
                                    TextInputLayout textInputLayout3 = (TextInputLayout) b.a(view, i11);
                                    if (textInputLayout3 != null) {
                                        i11 = R.id.postal_code_edit_text;
                                        PostalCodeEditText postalCodeEditText = (PostalCodeEditText) b.a(view, i11);
                                        if (postalCodeEditText != null) {
                                            i11 = R.id.postal_code_text_input_layout;
                                            TextInputLayout textInputLayout4 = (TextInputLayout) b.a(view, i11);
                                            if (textInputLayout4 != null) {
                                                return new CardInputWidgetBinding(view, cardBrandView, cardNumberEditText, textInputLayout, frameLayout, cvcEditText, textInputLayout2, expiryDateEditText, textInputLayout3, postalCodeEditText, textInputLayout4);
                                            }
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

    public static CardInputWidgetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.card_input_widget, viewGroup);
        return bind(viewGroup);
    }

    @Override // b5.a
    public View getRoot() {
        return this.rootView;
    }
}