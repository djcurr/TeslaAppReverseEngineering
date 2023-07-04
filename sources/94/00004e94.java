package com.stripe.android.googlepaylauncher.injection;

import android.content.Context;
import com.google.android.gms.wallet.PaymentsClient;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.PaymentsClientFactory;
import javax.inject.Provider;
import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class GooglePayPaymentMethodLauncherModule_Companion_ProvidePaymentsClientFactory implements e<PaymentsClient> {
    private final Provider<Context> contextProvider;
    private final Provider<GooglePayPaymentMethodLauncher.Config> googlePayConfigProvider;
    private final Provider<PaymentsClientFactory> paymentsClientFactoryProvider;

    public GooglePayPaymentMethodLauncherModule_Companion_ProvidePaymentsClientFactory(Provider<Context> provider, Provider<GooglePayPaymentMethodLauncher.Config> provider2, Provider<PaymentsClientFactory> provider3) {
        this.contextProvider = provider;
        this.googlePayConfigProvider = provider2;
        this.paymentsClientFactoryProvider = provider3;
    }

    public static GooglePayPaymentMethodLauncherModule_Companion_ProvidePaymentsClientFactory create(Provider<Context> provider, Provider<GooglePayPaymentMethodLauncher.Config> provider2, Provider<PaymentsClientFactory> provider3) {
        return new GooglePayPaymentMethodLauncherModule_Companion_ProvidePaymentsClientFactory(provider, provider2, provider3);
    }

    public static PaymentsClient providePaymentsClient(Context context, GooglePayPaymentMethodLauncher.Config config, PaymentsClientFactory paymentsClientFactory) {
        return (PaymentsClient) h.e(GooglePayPaymentMethodLauncherModule.Companion.providePaymentsClient(context, config, paymentsClientFactory));
    }

    @Override // javax.inject.Provider
    public PaymentsClient get() {
        return providePaymentsClient(this.contextProvider.get(), this.googlePayConfigProvider.get(), this.paymentsClientFactoryProvider.get());
    }
}