package com.stripe.android;

import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import javax.inject.Provider;
import tw.e;

/* loaded from: classes2.dex */
public final class GooglePayJsonFactory_Factory implements e<GooglePayJsonFactory> {
    private final Provider<GooglePayPaymentMethodLauncher.Config> googlePayConfigProvider;
    private final Provider<h00.a<String>> publishableKeyProvider;
    private final Provider<h00.a<String>> stripeAccountIdProvider;

    public GooglePayJsonFactory_Factory(Provider<h00.a<String>> provider, Provider<h00.a<String>> provider2, Provider<GooglePayPaymentMethodLauncher.Config> provider3) {
        this.publishableKeyProvider = provider;
        this.stripeAccountIdProvider = provider2;
        this.googlePayConfigProvider = provider3;
    }

    public static GooglePayJsonFactory_Factory create(Provider<h00.a<String>> provider, Provider<h00.a<String>> provider2, Provider<GooglePayPaymentMethodLauncher.Config> provider3) {
        return new GooglePayJsonFactory_Factory(provider, provider2, provider3);
    }

    public static GooglePayJsonFactory newInstance(h00.a<String> aVar, h00.a<String> aVar2, GooglePayPaymentMethodLauncher.Config config) {
        return new GooglePayJsonFactory(aVar, aVar2, config);
    }

    @Override // javax.inject.Provider
    public GooglePayJsonFactory get() {
        return newInstance(this.publishableKeyProvider.get(), this.stripeAccountIdProvider.get(), this.googlePayConfigProvider.get());
    }
}