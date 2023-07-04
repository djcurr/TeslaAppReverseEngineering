package com.stripe.android.payments.paymentlauncher;

import androidx.lifecycle.l0;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.PaymentIntentFlowResultProcessor;
import com.stripe.android.payments.SetupIntentFlowResultProcessor;
import com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry;
import java.util.Map;
import javax.inject.Provider;
import tw.d;
import tw.e;
import zz.g;

/* renamed from: com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel_Factory  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1425PaymentLauncherViewModel_Factory implements e<PaymentLauncherViewModel> {
    private final Provider<DefaultAnalyticsRequestExecutor> analyticsRequestExecutorProvider;
    private final Provider<ApiRequest.Options> apiRequestOptionsProvider;
    private final Provider<PaymentAuthenticatorRegistry> authenticatorRegistryProvider;
    private final Provider<DefaultReturnUrl> defaultReturnUrlProvider;
    private final Provider<Boolean> isInstantAppProvider;
    private final Provider<Boolean> isPaymentIntentProvider;
    private final Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
    private final Provider<PaymentIntentFlowResultProcessor> paymentIntentFlowResultProcessorProvider;
    private final Provider<l0> savedStateHandleProvider;
    private final Provider<SetupIntentFlowResultProcessor> setupIntentFlowResultProcessorProvider;
    private final Provider<StripeRepository> stripeApiRepositoryProvider;
    private final Provider<Map<String, String>> threeDs1IntentReturnUrlMapProvider;
    private final Provider<g> uiContextProvider;

    public C1425PaymentLauncherViewModel_Factory(Provider<Boolean> provider, Provider<StripeRepository> provider2, Provider<PaymentAuthenticatorRegistry> provider3, Provider<DefaultReturnUrl> provider4, Provider<ApiRequest.Options> provider5, Provider<Map<String, String>> provider6, Provider<PaymentIntentFlowResultProcessor> provider7, Provider<SetupIntentFlowResultProcessor> provider8, Provider<DefaultAnalyticsRequestExecutor> provider9, Provider<PaymentAnalyticsRequestFactory> provider10, Provider<g> provider11, Provider<l0> provider12, Provider<Boolean> provider13) {
        this.isPaymentIntentProvider = provider;
        this.stripeApiRepositoryProvider = provider2;
        this.authenticatorRegistryProvider = provider3;
        this.defaultReturnUrlProvider = provider4;
        this.apiRequestOptionsProvider = provider5;
        this.threeDs1IntentReturnUrlMapProvider = provider6;
        this.paymentIntentFlowResultProcessorProvider = provider7;
        this.setupIntentFlowResultProcessorProvider = provider8;
        this.analyticsRequestExecutorProvider = provider9;
        this.paymentAnalyticsRequestFactoryProvider = provider10;
        this.uiContextProvider = provider11;
        this.savedStateHandleProvider = provider12;
        this.isInstantAppProvider = provider13;
    }

    public static C1425PaymentLauncherViewModel_Factory create(Provider<Boolean> provider, Provider<StripeRepository> provider2, Provider<PaymentAuthenticatorRegistry> provider3, Provider<DefaultReturnUrl> provider4, Provider<ApiRequest.Options> provider5, Provider<Map<String, String>> provider6, Provider<PaymentIntentFlowResultProcessor> provider7, Provider<SetupIntentFlowResultProcessor> provider8, Provider<DefaultAnalyticsRequestExecutor> provider9, Provider<PaymentAnalyticsRequestFactory> provider10, Provider<g> provider11, Provider<l0> provider12, Provider<Boolean> provider13) {
        return new C1425PaymentLauncherViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    public static PaymentLauncherViewModel newInstance(boolean z11, StripeRepository stripeRepository, PaymentAuthenticatorRegistry paymentAuthenticatorRegistry, DefaultReturnUrl defaultReturnUrl, Provider<ApiRequest.Options> provider, Map<String, String> map, sw.a<PaymentIntentFlowResultProcessor> aVar, sw.a<SetupIntentFlowResultProcessor> aVar2, DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, g gVar, l0 l0Var, boolean z12) {
        return new PaymentLauncherViewModel(z11, stripeRepository, paymentAuthenticatorRegistry, defaultReturnUrl, provider, map, aVar, aVar2, defaultAnalyticsRequestExecutor, paymentAnalyticsRequestFactory, gVar, l0Var, z12);
    }

    @Override // javax.inject.Provider
    /* renamed from: get */
    public PaymentLauncherViewModel mo0get() {
        return newInstance(this.isPaymentIntentProvider.mo0get().booleanValue(), this.stripeApiRepositoryProvider.mo0get(), this.authenticatorRegistryProvider.mo0get(), this.defaultReturnUrlProvider.mo0get(), this.apiRequestOptionsProvider, this.threeDs1IntentReturnUrlMapProvider.mo0get(), d.a(this.paymentIntentFlowResultProcessorProvider), d.a(this.setupIntentFlowResultProcessorProvider), this.analyticsRequestExecutorProvider.mo0get(), this.paymentAnalyticsRequestFactoryProvider.mo0get(), this.uiContextProvider.mo0get(), this.savedStateHandleProvider.mo0get(), this.isInstantAppProvider.mo0get().booleanValue());
    }
}