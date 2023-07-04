package com.stripe.android.link;

import android.content.Context;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.ui.core.forms.resources.ResourceRepository;
import h00.a;
import java.util.Set;
import javax.inject.Provider;
import zz.g;

/* loaded from: classes6.dex */
public final class LinkPaymentLauncher_Factory {
    private final Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;
    private final Provider<Context> contextProvider;
    private final Provider<Boolean> enableLoggingProvider;
    private final Provider<g> ioContextProvider;
    private final Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
    private final Provider<Set<String>> productUsageProvider;
    private final Provider<a<String>> publishableKeyProvider;
    private final Provider<ResourceRepository> resourceRepositoryProvider;
    private final Provider<a<String>> stripeAccountIdProvider;
    private final Provider<StripeRepository> stripeRepositoryProvider;
    private final Provider<g> uiContextProvider;

    public LinkPaymentLauncher_Factory(Provider<Context> provider, Provider<Set<String>> provider2, Provider<a<String>> provider3, Provider<a<String>> provider4, Provider<Boolean> provider5, Provider<g> provider6, Provider<g> provider7, Provider<PaymentAnalyticsRequestFactory> provider8, Provider<AnalyticsRequestExecutor> provider9, Provider<StripeRepository> provider10, Provider<ResourceRepository> provider11) {
        this.contextProvider = provider;
        this.productUsageProvider = provider2;
        this.publishableKeyProvider = provider3;
        this.stripeAccountIdProvider = provider4;
        this.enableLoggingProvider = provider5;
        this.ioContextProvider = provider6;
        this.uiContextProvider = provider7;
        this.paymentAnalyticsRequestFactoryProvider = provider8;
        this.analyticsRequestExecutorProvider = provider9;
        this.stripeRepositoryProvider = provider10;
        this.resourceRepositoryProvider = provider11;
    }

    public static LinkPaymentLauncher_Factory create(Provider<Context> provider, Provider<Set<String>> provider2, Provider<a<String>> provider3, Provider<a<String>> provider4, Provider<Boolean> provider5, Provider<g> provider6, Provider<g> provider7, Provider<PaymentAnalyticsRequestFactory> provider8, Provider<AnalyticsRequestExecutor> provider9, Provider<StripeRepository> provider10, Provider<ResourceRepository> provider11) {
        return new LinkPaymentLauncher_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static LinkPaymentLauncher newInstance(String str, String str2, Context context, Set<String> set, a<String> aVar, a<String> aVar2, boolean z11, g gVar, g gVar2, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, AnalyticsRequestExecutor analyticsRequestExecutor, StripeRepository stripeRepository, ResourceRepository resourceRepository) {
        return new LinkPaymentLauncher(str, str2, context, set, aVar, aVar2, z11, gVar, gVar2, paymentAnalyticsRequestFactory, analyticsRequestExecutor, stripeRepository, resourceRepository);
    }

    public LinkPaymentLauncher get(String str, String str2) {
        return newInstance(str, str2, this.contextProvider.get(), this.productUsageProvider.get(), this.publishableKeyProvider.get(), this.stripeAccountIdProvider.get(), this.enableLoggingProvider.get().booleanValue(), this.ioContextProvider.get(), this.uiContextProvider.get(), this.paymentAnalyticsRequestFactoryProvider.get(), this.analyticsRequestExecutorProvider.get(), this.stripeRepositoryProvider.get(), this.resourceRepositoryProvider.get());
    }
}