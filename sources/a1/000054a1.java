package com.stripe.android.payments.paymentlauncher;

import androidx.activity.result.d;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import javax.inject.Provider;
import tw.f;

/* loaded from: classes6.dex */
public final class StripePaymentLauncherAssistedFactory_Impl implements StripePaymentLauncherAssistedFactory {
    private final StripePaymentLauncher_Factory delegateFactory;

    StripePaymentLauncherAssistedFactory_Impl(StripePaymentLauncher_Factory stripePaymentLauncher_Factory) {
        this.delegateFactory = stripePaymentLauncher_Factory;
    }

    @Override // com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory
    public StripePaymentLauncher create(h00.a<String> aVar, h00.a<String> aVar2, d<PaymentLauncherContract.Args> dVar) {
        return this.delegateFactory.get(aVar, aVar2, dVar);
    }

    public static Provider<StripePaymentLauncherAssistedFactory> create(StripePaymentLauncher_Factory stripePaymentLauncher_Factory) {
        return f.a(new StripePaymentLauncherAssistedFactory_Impl(stripePaymentLauncher_Factory));
    }
}