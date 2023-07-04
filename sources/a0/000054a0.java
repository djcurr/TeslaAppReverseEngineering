package com.stripe.android.payments.paymentlauncher;

import androidx.activity.result.d;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;

/* loaded from: classes6.dex */
public interface StripePaymentLauncherAssistedFactory {
    StripePaymentLauncher create(h00.a<String> aVar, h00.a<String> aVar2, d<PaymentLauncherContract.Args> dVar);
}