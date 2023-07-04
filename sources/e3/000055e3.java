package com.stripe.android.paymentsheet.analytics;

import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.model.PaymentSelection;

/* loaded from: classes6.dex */
public interface EventReporter {

    /* loaded from: classes6.dex */
    public enum Mode {
        Complete("complete"),
        Custom("custom");
        
        private final String code;

        Mode(String str) {
            this.code = str;
        }

        public final String getCode() {
            return this.code;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }
    }

    void onDismiss();

    void onInit(PaymentSheet.Configuration configuration);

    void onPaymentFailure(PaymentSelection paymentSelection);

    void onPaymentSuccess(PaymentSelection paymentSelection);

    void onSelectPaymentOption(PaymentSelection paymentSelection);

    void onShowExistingPaymentOptions();

    void onShowNewPaymentOptionForm();
}