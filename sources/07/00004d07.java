package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import b5.a;
import b5.b;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R;
import com.stripe.android.view.BecsDebitAccountNumberEditText;
import com.stripe.android.view.BecsDebitBsbEditText;
import com.stripe.android.view.BecsDebitMandateAcceptanceTextView;
import com.stripe.android.view.EmailEditText;
import com.stripe.android.view.StripeEditText;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class BecsDebitWidgetBinding implements a {
    public final BecsDebitAccountNumberEditText accountNumberEditText;
    public final TextInputLayout accountNumberTextInputLayout;
    public final BecsDebitBsbEditText bsbEditText;
    public final TextInputLayout bsbTextInputLayout;
    public final EmailEditText emailEditText;
    public final TextInputLayout emailTextInputLayout;
    public final BecsDebitMandateAcceptanceTextView mandateAcceptanceTextView;
    public final StripeEditText nameEditText;
    public final TextInputLayout nameTextInputLayout;
    private final View rootView;

    private BecsDebitWidgetBinding(View view, BecsDebitAccountNumberEditText becsDebitAccountNumberEditText, TextInputLayout textInputLayout, BecsDebitBsbEditText becsDebitBsbEditText, TextInputLayout textInputLayout2, EmailEditText emailEditText, TextInputLayout textInputLayout3, BecsDebitMandateAcceptanceTextView becsDebitMandateAcceptanceTextView, StripeEditText stripeEditText, TextInputLayout textInputLayout4) {
        this.rootView = view;
        this.accountNumberEditText = becsDebitAccountNumberEditText;
        this.accountNumberTextInputLayout = textInputLayout;
        this.bsbEditText = becsDebitBsbEditText;
        this.bsbTextInputLayout = textInputLayout2;
        this.emailEditText = emailEditText;
        this.emailTextInputLayout = textInputLayout3;
        this.mandateAcceptanceTextView = becsDebitMandateAcceptanceTextView;
        this.nameEditText = stripeEditText;
        this.nameTextInputLayout = textInputLayout4;
    }

    public static BecsDebitWidgetBinding bind(View view) {
        int i11 = R.id.account_number_edit_text;
        BecsDebitAccountNumberEditText becsDebitAccountNumberEditText = (BecsDebitAccountNumberEditText) b.a(view, i11);
        if (becsDebitAccountNumberEditText != null) {
            i11 = R.id.account_number_text_input_layout;
            TextInputLayout textInputLayout = (TextInputLayout) b.a(view, i11);
            if (textInputLayout != null) {
                i11 = R.id.bsb_edit_text;
                BecsDebitBsbEditText becsDebitBsbEditText = (BecsDebitBsbEditText) b.a(view, i11);
                if (becsDebitBsbEditText != null) {
                    i11 = R.id.bsb_text_input_layout;
                    TextInputLayout textInputLayout2 = (TextInputLayout) b.a(view, i11);
                    if (textInputLayout2 != null) {
                        i11 = R.id.email_edit_text;
                        EmailEditText emailEditText = (EmailEditText) b.a(view, i11);
                        if (emailEditText != null) {
                            i11 = R.id.email_text_input_layout;
                            TextInputLayout textInputLayout3 = (TextInputLayout) b.a(view, i11);
                            if (textInputLayout3 != null) {
                                i11 = R.id.mandate_acceptance_text_view;
                                BecsDebitMandateAcceptanceTextView becsDebitMandateAcceptanceTextView = (BecsDebitMandateAcceptanceTextView) b.a(view, i11);
                                if (becsDebitMandateAcceptanceTextView != null) {
                                    i11 = R.id.name_edit_text;
                                    StripeEditText stripeEditText = (StripeEditText) b.a(view, i11);
                                    if (stripeEditText != null) {
                                        i11 = R.id.name_text_input_layout;
                                        TextInputLayout textInputLayout4 = (TextInputLayout) b.a(view, i11);
                                        if (textInputLayout4 != null) {
                                            return new BecsDebitWidgetBinding(view, becsDebitAccountNumberEditText, textInputLayout, becsDebitBsbEditText, textInputLayout2, emailEditText, textInputLayout3, becsDebitMandateAcceptanceTextView, stripeEditText, textInputLayout4);
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

    public static BecsDebitWidgetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.becs_debit_widget, viewGroup);
        return bind(viewGroup);
    }

    @Override // b5.a
    public View getRoot() {
        return this.rootView;
    }
}