package com.stripe.android.view;

import android.text.Editable;
import com.stripe.android.view.StripeEditText;

/* loaded from: classes6.dex */
public final class BackUpFieldDeleteListener implements StripeEditText.DeleteEmptyListener {
    private final StripeEditText backUpTarget;

    public BackUpFieldDeleteListener(StripeEditText backUpTarget) {
        kotlin.jvm.internal.s.g(backUpTarget, "backUpTarget");
        this.backUpTarget = backUpTarget;
    }

    @Override // com.stripe.android.view.StripeEditText.DeleteEmptyListener
    public void onDeleteEmpty() {
        String obj;
        Editable text = this.backUpTarget.getText();
        String str = "";
        if (text != null && (obj = text.toString()) != null) {
            str = obj;
        }
        if (str.length() > 1) {
            StripeEditText stripeEditText = this.backUpTarget;
            String substring = str.substring(0, str.length() - 1);
            kotlin.jvm.internal.s.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            stripeEditText.setText(substring);
        }
        this.backUpTarget.requestFocus();
        StripeEditText stripeEditText2 = this.backUpTarget;
        stripeEditText2.setSelection(stripeEditText2.length());
    }
}