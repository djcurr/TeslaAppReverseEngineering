package com.stripe.android.payments;

import android.content.Context;
import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.RetryDelaySupplier;
import com.stripe.android.networking.StripeRepository;
import javax.inject.Provider;
import tw.e;
import zz.g;

/* loaded from: classes6.dex */
public final class PaymentIntentFlowResultProcessor_Factory implements e<PaymentIntentFlowResultProcessor> {
    private final Provider<Context> contextProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<h00.a<String>> publishableKeyProvider;
    private final Provider<RetryDelaySupplier> retryDelaySupplierProvider;
    private final Provider<StripeRepository> stripeRepositoryProvider;
    private final Provider<g> workContextProvider;

    public PaymentIntentFlowResultProcessor_Factory(Provider<Context> provider, Provider<h00.a<String>> provider2, Provider<StripeRepository> provider3, Provider<Logger> provider4, Provider<g> provider5, Provider<RetryDelaySupplier> provider6) {
        this.contextProvider = provider;
        this.publishableKeyProvider = provider2;
        this.stripeRepositoryProvider = provider3;
        this.loggerProvider = provider4;
        this.workContextProvider = provider5;
        this.retryDelaySupplierProvider = provider6;
    }

    public static PaymentIntentFlowResultProcessor_Factory create(Provider<Context> provider, Provider<h00.a<String>> provider2, Provider<StripeRepository> provider3, Provider<Logger> provider4, Provider<g> provider5, Provider<RetryDelaySupplier> provider6) {
        return new PaymentIntentFlowResultProcessor_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static PaymentIntentFlowResultProcessor newInstance(Context context, h00.a<String> aVar, StripeRepository stripeRepository, Logger logger, g gVar, RetryDelaySupplier retryDelaySupplier) {
        return new PaymentIntentFlowResultProcessor(context, aVar, stripeRepository, logger, gVar, retryDelaySupplier);
    }

    @Override // javax.inject.Provider
    public PaymentIntentFlowResultProcessor get() {
        return newInstance(this.contextProvider.get(), this.publishableKeyProvider.get(), this.stripeRepositoryProvider.get(), this.loggerProvider.get(), this.workContextProvider.get(), this.retryDelaySupplierProvider.get());
    }
}