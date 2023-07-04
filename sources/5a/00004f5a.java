package com.stripe.android.link.repositories;

import com.stripe.android.core.Logger;
import com.stripe.android.networking.StripeRepository;
import h00.a;
import java.util.Locale;
import javax.inject.Provider;
import tw.e;
import zz.g;

/* loaded from: classes6.dex */
public final class LinkApiRepository_Factory implements e<LinkApiRepository> {
    private final Provider<Locale> localeProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<a<String>> publishableKeyProvider;
    private final Provider<a<String>> stripeAccountIdProvider;
    private final Provider<StripeRepository> stripeRepositoryProvider;
    private final Provider<g> workContextProvider;

    public LinkApiRepository_Factory(Provider<a<String>> provider, Provider<a<String>> provider2, Provider<StripeRepository> provider3, Provider<Logger> provider4, Provider<g> provider5, Provider<Locale> provider6) {
        this.publishableKeyProvider = provider;
        this.stripeAccountIdProvider = provider2;
        this.stripeRepositoryProvider = provider3;
        this.loggerProvider = provider4;
        this.workContextProvider = provider5;
        this.localeProvider = provider6;
    }

    public static LinkApiRepository_Factory create(Provider<a<String>> provider, Provider<a<String>> provider2, Provider<StripeRepository> provider3, Provider<Logger> provider4, Provider<g> provider5, Provider<Locale> provider6) {
        return new LinkApiRepository_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static LinkApiRepository newInstance(a<String> aVar, a<String> aVar2, StripeRepository stripeRepository, Logger logger, g gVar, Locale locale) {
        return new LinkApiRepository(aVar, aVar2, stripeRepository, logger, gVar, locale);
    }

    @Override // javax.inject.Provider
    public LinkApiRepository get() {
        return newInstance(this.publishableKeyProvider.get(), this.stripeAccountIdProvider.get(), this.stripeRepositoryProvider.get(), this.loggerProvider.get(), this.workContextProvider.get(), this.localeProvider.get());
    }
}