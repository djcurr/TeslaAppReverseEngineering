package com.stripe.android.googlepaylauncher;

import androidx.lifecycle.l0;
import com.google.android.gms.wallet.PaymentsClient;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract;
import com.stripe.android.networking.StripeRepository;
import javax.inject.Provider;

/* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel_Factory  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1416GooglePayPaymentMethodLauncherViewModel_Factory implements tw.e<GooglePayPaymentMethodLauncherViewModel> {
    private final Provider<GooglePayPaymentMethodLauncherContract.Args> argsProvider;
    private final Provider<GooglePayJsonFactory> googlePayJsonFactoryProvider;
    private final Provider<GooglePayRepository> googlePayRepositoryProvider;
    private final Provider<PaymentsClient> paymentsClientProvider;
    private final Provider<ApiRequest.Options> requestOptionsProvider;
    private final Provider<l0> savedStateHandleProvider;
    private final Provider<StripeRepository> stripeRepositoryProvider;

    public C1416GooglePayPaymentMethodLauncherViewModel_Factory(Provider<PaymentsClient> provider, Provider<ApiRequest.Options> provider2, Provider<GooglePayPaymentMethodLauncherContract.Args> provider3, Provider<StripeRepository> provider4, Provider<GooglePayJsonFactory> provider5, Provider<GooglePayRepository> provider6, Provider<l0> provider7) {
        this.paymentsClientProvider = provider;
        this.requestOptionsProvider = provider2;
        this.argsProvider = provider3;
        this.stripeRepositoryProvider = provider4;
        this.googlePayJsonFactoryProvider = provider5;
        this.googlePayRepositoryProvider = provider6;
        this.savedStateHandleProvider = provider7;
    }

    public static C1416GooglePayPaymentMethodLauncherViewModel_Factory create(Provider<PaymentsClient> provider, Provider<ApiRequest.Options> provider2, Provider<GooglePayPaymentMethodLauncherContract.Args> provider3, Provider<StripeRepository> provider4, Provider<GooglePayJsonFactory> provider5, Provider<GooglePayRepository> provider6, Provider<l0> provider7) {
        return new C1416GooglePayPaymentMethodLauncherViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static GooglePayPaymentMethodLauncherViewModel newInstance(PaymentsClient paymentsClient, ApiRequest.Options options, GooglePayPaymentMethodLauncherContract.Args args, StripeRepository stripeRepository, GooglePayJsonFactory googlePayJsonFactory, GooglePayRepository googlePayRepository, l0 l0Var) {
        return new GooglePayPaymentMethodLauncherViewModel(paymentsClient, options, args, stripeRepository, googlePayJsonFactory, googlePayRepository, l0Var);
    }

    @Override // javax.inject.Provider
    public GooglePayPaymentMethodLauncherViewModel get() {
        return newInstance(this.paymentsClientProvider.get(), this.requestOptionsProvider.get(), this.argsProvider.get(), this.stripeRepositoryProvider.get(), this.googlePayJsonFactoryProvider.get(), this.googlePayRepositoryProvider.get(), this.savedStateHandleProvider.get());
    }
}