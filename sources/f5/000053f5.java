package com.stripe.android.payments.core.authentication;

import com.stripe.android.PaymentBrowserAuthStarter;
import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.view.AuthActivityStarterHost;
import h00.a;
import h00.l;
import javax.inject.Provider;
import tw.e;
import zz.g;

/* loaded from: classes6.dex */
public final class SourceAuthenticator_Factory implements e<SourceAuthenticator> {
    private final Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;
    private final Provider<Boolean> enableLoggingProvider;
    private final Provider<Boolean> isInstantAppProvider;
    private final Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
    private final Provider<l<AuthActivityStarterHost, PaymentBrowserAuthStarter>> paymentBrowserAuthStarterFactoryProvider;
    private final Provider<l<AuthActivityStarterHost, PaymentRelayStarter>> paymentRelayStarterFactoryProvider;
    private final Provider<a<String>> publishableKeyProvider;
    private final Provider<g> uiContextProvider;

    public SourceAuthenticator_Factory(Provider<l<AuthActivityStarterHost, PaymentBrowserAuthStarter>> provider, Provider<l<AuthActivityStarterHost, PaymentRelayStarter>> provider2, Provider<AnalyticsRequestExecutor> provider3, Provider<PaymentAnalyticsRequestFactory> provider4, Provider<Boolean> provider5, Provider<g> provider6, Provider<a<String>> provider7, Provider<Boolean> provider8) {
        this.paymentBrowserAuthStarterFactoryProvider = provider;
        this.paymentRelayStarterFactoryProvider = provider2;
        this.analyticsRequestExecutorProvider = provider3;
        this.paymentAnalyticsRequestFactoryProvider = provider4;
        this.enableLoggingProvider = provider5;
        this.uiContextProvider = provider6;
        this.publishableKeyProvider = provider7;
        this.isInstantAppProvider = provider8;
    }

    public static SourceAuthenticator_Factory create(Provider<l<AuthActivityStarterHost, PaymentBrowserAuthStarter>> provider, Provider<l<AuthActivityStarterHost, PaymentRelayStarter>> provider2, Provider<AnalyticsRequestExecutor> provider3, Provider<PaymentAnalyticsRequestFactory> provider4, Provider<Boolean> provider5, Provider<g> provider6, Provider<a<String>> provider7, Provider<Boolean> provider8) {
        return new SourceAuthenticator_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static SourceAuthenticator newInstance(l<AuthActivityStarterHost, PaymentBrowserAuthStarter> lVar, l<AuthActivityStarterHost, PaymentRelayStarter> lVar2, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean z11, g gVar, a<String> aVar, boolean z12) {
        return new SourceAuthenticator(lVar, lVar2, analyticsRequestExecutor, paymentAnalyticsRequestFactory, z11, gVar, aVar, z12);
    }

    @Override // javax.inject.Provider
    public SourceAuthenticator get() {
        return newInstance(this.paymentBrowserAuthStarterFactoryProvider.get(), this.paymentRelayStarterFactoryProvider.get(), this.analyticsRequestExecutorProvider.get(), this.paymentAnalyticsRequestFactoryProvider.get(), this.enableLoggingProvider.get().booleanValue(), this.uiContextProvider.get(), this.publishableKeyProvider.get(), this.isInstantAppProvider.get().booleanValue());
    }
}