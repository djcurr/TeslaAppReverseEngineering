package com.stripe.android.paymentsheet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import b5.a;
import b5.b;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.view.CountryTextInputLayout;
import com.stripe.android.view.StripeEditText;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class StripeBillingAddressLayoutBinding implements a {
    public final TextInputEditText address1;
    public final View address1Divider;
    public final TextInputLayout address1Layout;
    public final TextInputEditText address2;
    public final View address2Divider;
    public final TextInputLayout address2Layout;
    public final TextInputEditText city;
    public final TextInputLayout cityLayout;
    public final LinearLayout cityPostalContainer;
    public final View cityPostalDivider;
    public final CountryTextInputLayout countryLayout;
    public final StripeEditText postalCode;
    public final TextInputLayout postalCodeLayout;
    private final View rootView;
    public final TextInputEditText state;
    public final View stateDivider;
    public final TextInputLayout stateLayout;

    private StripeBillingAddressLayoutBinding(View view, TextInputEditText textInputEditText, View view2, TextInputLayout textInputLayout, TextInputEditText textInputEditText2, View view3, TextInputLayout textInputLayout2, TextInputEditText textInputEditText3, TextInputLayout textInputLayout3, LinearLayout linearLayout, View view4, CountryTextInputLayout countryTextInputLayout, StripeEditText stripeEditText, TextInputLayout textInputLayout4, TextInputEditText textInputEditText4, View view5, TextInputLayout textInputLayout5) {
        this.rootView = view;
        this.address1 = textInputEditText;
        this.address1Divider = view2;
        this.address1Layout = textInputLayout;
        this.address2 = textInputEditText2;
        this.address2Divider = view3;
        this.address2Layout = textInputLayout2;
        this.city = textInputEditText3;
        this.cityLayout = textInputLayout3;
        this.cityPostalContainer = linearLayout;
        this.cityPostalDivider = view4;
        this.countryLayout = countryTextInputLayout;
        this.postalCode = stripeEditText;
        this.postalCodeLayout = textInputLayout4;
        this.state = textInputEditText4;
        this.stateDivider = view5;
        this.stateLayout = textInputLayout5;
    }

    public static StripeBillingAddressLayoutBinding bind(View view) {
        View a11;
        View a12;
        View a13;
        View a14;
        int i11 = R.id.address1;
        TextInputEditText textInputEditText = (TextInputEditText) b.a(view, i11);
        if (textInputEditText != null && (a11 = b.a(view, (i11 = R.id.address1_divider))) != null) {
            i11 = R.id.address1_layout;
            TextInputLayout textInputLayout = (TextInputLayout) b.a(view, i11);
            if (textInputLayout != null) {
                i11 = R.id.address2;
                TextInputEditText textInputEditText2 = (TextInputEditText) b.a(view, i11);
                if (textInputEditText2 != null && (a12 = b.a(view, (i11 = R.id.address2_divider))) != null) {
                    i11 = R.id.address2_layout;
                    TextInputLayout textInputLayout2 = (TextInputLayout) b.a(view, i11);
                    if (textInputLayout2 != null) {
                        i11 = R.id.city;
                        TextInputEditText textInputEditText3 = (TextInputEditText) b.a(view, i11);
                        if (textInputEditText3 != null) {
                            i11 = R.id.city_layout;
                            TextInputLayout textInputLayout3 = (TextInputLayout) b.a(view, i11);
                            if (textInputLayout3 != null) {
                                i11 = R.id.city_postal_container;
                                LinearLayout linearLayout = (LinearLayout) b.a(view, i11);
                                if (linearLayout != null && (a13 = b.a(view, (i11 = R.id.city_postal_divider))) != null) {
                                    i11 = R.id.country_layout;
                                    CountryTextInputLayout countryTextInputLayout = (CountryTextInputLayout) b.a(view, i11);
                                    if (countryTextInputLayout != null) {
                                        i11 = R.id.postal_code;
                                        StripeEditText stripeEditText = (StripeEditText) b.a(view, i11);
                                        if (stripeEditText != null) {
                                            i11 = R.id.postal_code_layout;
                                            TextInputLayout textInputLayout4 = (TextInputLayout) b.a(view, i11);
                                            if (textInputLayout4 != null) {
                                                i11 = R.id.state;
                                                TextInputEditText textInputEditText4 = (TextInputEditText) b.a(view, i11);
                                                if (textInputEditText4 != null && (a14 = b.a(view, (i11 = R.id.state_divider))) != null) {
                                                    i11 = R.id.state_layout;
                                                    TextInputLayout textInputLayout5 = (TextInputLayout) b.a(view, i11);
                                                    if (textInputLayout5 != null) {
                                                        return new StripeBillingAddressLayoutBinding(view, textInputEditText, a11, textInputLayout, textInputEditText2, a12, textInputLayout2, textInputEditText3, textInputLayout3, linearLayout, a13, countryTextInputLayout, stripeEditText, textInputLayout4, textInputEditText4, a14, textInputLayout5);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static StripeBillingAddressLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.stripe_billing_address_layout, viewGroup);
        return bind(viewGroup);
    }

    @Override // b5.a
    public View getRoot() {
        return this.rootView;
    }
}