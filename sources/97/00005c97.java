package com.stripe.android.view;

import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.view.StripeEditText;

/* loaded from: classes6.dex */
public final class ErrorListener implements StripeEditText.ErrorMessageListener {
    private final TextInputLayout textInputLayout;

    public ErrorListener(TextInputLayout textInputLayout) {
        kotlin.jvm.internal.s.g(textInputLayout, "textInputLayout");
        this.textInputLayout = textInputLayout;
    }

    @Override // com.stripe.android.view.StripeEditText.ErrorMessageListener
    public void displayErrorMessage(String str) {
        if (str == null) {
            this.textInputLayout.setError(null);
            this.textInputLayout.setErrorEnabled(false);
            return;
        }
        this.textInputLayout.setError(str);
    }
}