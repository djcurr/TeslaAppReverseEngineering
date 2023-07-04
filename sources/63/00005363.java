package com.stripe.android.networking;

import android.content.Context;
import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import java.util.Set;
import javax.inject.Provider;
import tw.e;
import zz.g;

/* loaded from: classes6.dex */
public final class StripeApiRepository_Factory implements e<StripeApiRepository> {
    private final Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;
    private final Provider<Context> appContextProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
    private final Provider<Set<String>> productUsageTokensProvider;
    private final Provider<h00.a<String>> publishableKeyProvider;
    private final Provider<g> workContextProvider;

    public StripeApiRepository_Factory(Provider<Context> provider, Provider<h00.a<String>> provider2, Provider<g> provider3, Provider<Set<String>> provider4, Provider<PaymentAnalyticsRequestFactory> provider5, Provider<AnalyticsRequestExecutor> provider6, Provider<Logger> provider7) {
        this.appContextProvider = provider;
        this.publishableKeyProvider = provider2;
        this.workContextProvider = provider3;
        this.productUsageTokensProvider = provider4;
        this.paymentAnalyticsRequestFactoryProvider = provider5;
        this.analyticsRequestExecutorProvider = provider6;
        this.loggerProvider = provider7;
    }

    public static StripeApiRepository_Factory create(Provider<Context> provider, Provider<h00.a<String>> provider2, Provider<g> provider3, Provider<Set<String>> provider4, Provider<PaymentAnalyticsRequestFactory> provider5, Provider<AnalyticsRequestExecutor> provider6, Provider<Logger> provider7) {
        return new StripeApiRepository_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static StripeApiRepository newInstance(Context context, h00.a<String> aVar, g gVar, Set<String> set, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, AnalyticsRequestExecutor analyticsRequestExecutor, Logger logger) {
        return new StripeApiRepository(context, aVar, gVar, set, paymentAnalyticsRequestFactory, analyticsRequestExecutor, logger);
    }

    @Override // javax.inject.Provider
    public StripeApiRepository get() {
        return newInstance(this.appContextProvider.get(), this.publishableKeyProvider.get(), this.workContextProvider.get(), this.productUsageTokensProvider.get(), this.paymentAnalyticsRequestFactoryProvider.get(), this.analyticsRequestExecutorProvider.get(), this.loggerProvider.get());
    }
}