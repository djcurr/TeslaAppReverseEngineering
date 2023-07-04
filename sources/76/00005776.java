package com.stripe.android.paymentsheet.repositories;

import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.Logger;
import com.stripe.android.networking.StripeRepository;
import java.util.Set;
import javax.inject.Provider;
import tw.e;
import zz.g;

/* loaded from: classes6.dex */
public final class CustomerApiRepository_Factory implements e<CustomerApiRepository> {
    private final Provider<PaymentConfiguration> lazyPaymentConfigProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<Set<String>> productUsageTokensProvider;
    private final Provider<StripeRepository> stripeRepositoryProvider;
    private final Provider<g> workContextProvider;

    public CustomerApiRepository_Factory(Provider<StripeRepository> provider, Provider<PaymentConfiguration> provider2, Provider<Logger> provider3, Provider<g> provider4, Provider<Set<String>> provider5) {
        this.stripeRepositoryProvider = provider;
        this.lazyPaymentConfigProvider = provider2;
        this.loggerProvider = provider3;
        this.workContextProvider = provider4;
        this.productUsageTokensProvider = provider5;
    }

    public static CustomerApiRepository_Factory create(Provider<StripeRepository> provider, Provider<PaymentConfiguration> provider2, Provider<Logger> provider3, Provider<g> provider4, Provider<Set<String>> provider5) {
        return new CustomerApiRepository_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static CustomerApiRepository newInstance(StripeRepository stripeRepository, Provider<PaymentConfiguration> provider, Logger logger, g gVar, Set<String> set) {
        return new CustomerApiRepository(stripeRepository, provider, logger, gVar, set);
    }

    @Override // javax.inject.Provider
    public CustomerApiRepository get() {
        return newInstance(this.stripeRepositoryProvider.get(), this.lazyPaymentConfigProvider, this.loggerProvider.get(), this.workContextProvider.get(), this.productUsageTokensProvider.get());
    }
}