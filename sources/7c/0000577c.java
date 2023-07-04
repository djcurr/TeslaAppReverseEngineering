package com.stripe.android.paymentsheet.repositories;

import com.stripe.android.PaymentConfiguration;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentsheet.repositories.StripeIntentRepository;
import java.util.Locale;
import javax.inject.Provider;
import tw.e;
import zz.g;

/* loaded from: classes6.dex */
public final class StripeIntentRepository_Api_Factory implements e<StripeIntentRepository.Api> {
    private final Provider<PaymentConfiguration> lazyPaymentConfigProvider;
    private final Provider<Locale> localeProvider;
    private final Provider<StripeRepository> stripeRepositoryProvider;
    private final Provider<g> workContextProvider;

    public StripeIntentRepository_Api_Factory(Provider<StripeRepository> provider, Provider<PaymentConfiguration> provider2, Provider<g> provider3, Provider<Locale> provider4) {
        this.stripeRepositoryProvider = provider;
        this.lazyPaymentConfigProvider = provider2;
        this.workContextProvider = provider3;
        this.localeProvider = provider4;
    }

    public static StripeIntentRepository_Api_Factory create(Provider<StripeRepository> provider, Provider<PaymentConfiguration> provider2, Provider<g> provider3, Provider<Locale> provider4) {
        return new StripeIntentRepository_Api_Factory(provider, provider2, provider3, provider4);
    }

    public static StripeIntentRepository.Api newInstance(StripeRepository stripeRepository, Provider<PaymentConfiguration> provider, g gVar, Locale locale) {
        return new StripeIntentRepository.Api(stripeRepository, provider, gVar, locale);
    }

    @Override // javax.inject.Provider
    public StripeIntentRepository.Api get() {
        return newInstance(this.stripeRepositoryProvider.get(), this.lazyPaymentConfigProvider, this.workContextProvider.get(), this.localeProvider.get());
    }
}