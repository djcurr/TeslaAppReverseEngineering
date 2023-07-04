package com.stripe.android.payments.core.authentication;

import com.stripe.android.PaymentBrowserAuthStarter;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.view.AuthActivityStarterHost;
import h00.a;
import h00.l;
import java.util.Map;
import javax.inject.Provider;
import tw.e;
import zz.g;

/* loaded from: classes6.dex */
public final class WebIntentAuthenticator_Factory implements e<WebIntentAuthenticator> {
    private final Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;
    private final Provider<Boolean> enableLoggingProvider;
    private final Provider<Boolean> isInstantAppProvider;
    private final Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
    private final Provider<l<AuthActivityStarterHost, PaymentBrowserAuthStarter>> paymentBrowserAuthStarterFactoryProvider;
    private final Provider<a<String>> publishableKeyProvider;
    private final Provider<Map<String, String>> threeDs1IntentReturnUrlMapProvider;
    private final Provider<g> uiContextProvider;

    public WebIntentAuthenticator_Factory(Provider<l<AuthActivityStarterHost, PaymentBrowserAuthStarter>> provider, Provider<AnalyticsRequestExecutor> provider2, Provider<PaymentAnalyticsRequestFactory> provider3, Provider<Boolean> provider4, Provider<g> provider5, Provider<Map<String, String>> provider6, Provider<a<String>> provider7, Provider<Boolean> provider8) {
        this.paymentBrowserAuthStarterFactoryProvider = provider;
        this.analyticsRequestExecutorProvider = provider2;
        this.paymentAnalyticsRequestFactoryProvider = provider3;
        this.enableLoggingProvider = provider4;
        this.uiContextProvider = provider5;
        this.threeDs1IntentReturnUrlMapProvider = provider6;
        this.publishableKeyProvider = provider7;
        this.isInstantAppProvider = provider8;
    }

    public static WebIntentAuthenticator_Factory create(Provider<l<AuthActivityStarterHost, PaymentBrowserAuthStarter>> provider, Provider<AnalyticsRequestExecutor> provider2, Provider<PaymentAnalyticsRequestFactory> provider3, Provider<Boolean> provider4, Provider<g> provider5, Provider<Map<String, String>> provider6, Provider<a<String>> provider7, Provider<Boolean> provider8) {
        return new WebIntentAuthenticator_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static WebIntentAuthenticator newInstance(l<AuthActivityStarterHost, PaymentBrowserAuthStarter> lVar, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean z11, g gVar, Map<String, String> map, a<String> aVar, boolean z12) {
        return new WebIntentAuthenticator(lVar, analyticsRequestExecutor, paymentAnalyticsRequestFactory, z11, gVar, map, aVar, z12);
    }

    @Override // javax.inject.Provider
    public WebIntentAuthenticator get() {
        return newInstance(this.paymentBrowserAuthStarterFactoryProvider.get(), this.analyticsRequestExecutorProvider.get(), this.paymentAnalyticsRequestFactoryProvider.get(), this.enableLoggingProvider.get().booleanValue(), this.uiContextProvider.get(), this.threeDs1IntentReturnUrlMapProvider.get(), this.publishableKeyProvider.get(), this.isInstantAppProvider.get().booleanValue());
    }
}