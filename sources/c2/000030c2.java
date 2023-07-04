package com.google.android.gms.wallet.callback;

import com.google.android.gms.wallet.PaymentData;

/* loaded from: classes3.dex */
public abstract class BasePaymentDataCallbacks {
    /* JADX INFO: Access modifiers changed from: protected */
    public void onPaymentAuthorized(PaymentData paymentData, OnCompleteListener<PaymentAuthorizationResult> onCompleteListener) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onPaymentDataChanged(IntermediatePaymentData intermediatePaymentData, OnCompleteListener<PaymentDataRequestUpdate> onCompleteListener) {
    }
}