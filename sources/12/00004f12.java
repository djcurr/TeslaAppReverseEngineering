package com.stripe.android.link.confirmation;

import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory;
import h00.a;
import javax.inject.Provider;
import tw.e;

/* loaded from: classes6.dex */
public final class ConfirmationManager_Factory implements e<ConfirmationManager> {
    private final Provider<StripePaymentLauncherAssistedFactory> paymentLauncherFactoryProvider;
    private final Provider<a<String>> publishableKeyProvider;
    private final Provider<a<String>> stripeAccountIdProvider;

    public ConfirmationManager_Factory(Provider<StripePaymentLauncherAssistedFactory> provider, Provider<a<String>> provider2, Provider<a<String>> provider3) {
        this.paymentLauncherFactoryProvider = provider;
        this.publishableKeyProvider = provider2;
        this.stripeAccountIdProvider = provider3;
    }

    public static ConfirmationManager_Factory create(Provider<StripePaymentLauncherAssistedFactory> provider, Provider<a<String>> provider2, Provider<a<String>> provider3) {
        return new ConfirmationManager_Factory(provider, provider2, provider3);
    }

    public static ConfirmationManager newInstance(StripePaymentLauncherAssistedFactory stripePaymentLauncherAssistedFactory, a<String> aVar, a<String> aVar2) {
        return new ConfirmationManager(stripePaymentLauncherAssistedFactory, aVar, aVar2);
    }

    @Override // javax.inject.Provider
    public ConfirmationManager get() {
        return newInstance(this.paymentLauncherFactoryProvider.get(), this.publishableKeyProvider.get(), this.stripeAccountIdProvider.get());
    }
}