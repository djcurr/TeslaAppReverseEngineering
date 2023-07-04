package com.stripe.android.payments;

import android.content.Context;
import com.stripe.android.core.Logger;
import com.stripe.android.networking.StripeRepository;
import javax.inject.Provider;
import tw.e;
import zz.g;

/* loaded from: classes6.dex */
public final class SetupIntentFlowResultProcessor_Factory implements e<SetupIntentFlowResultProcessor> {
    private final Provider<Context> contextProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<h00.a<String>> publishableKeyProvider;
    private final Provider<StripeRepository> stripeRepositoryProvider;
    private final Provider<g> workContextProvider;

    public SetupIntentFlowResultProcessor_Factory(Provider<Context> provider, Provider<h00.a<String>> provider2, Provider<StripeRepository> provider3, Provider<Logger> provider4, Provider<g> provider5) {
        this.contextProvider = provider;
        this.publishableKeyProvider = provider2;
        this.stripeRepositoryProvider = provider3;
        this.loggerProvider = provider4;
        this.workContextProvider = provider5;
    }

    public static SetupIntentFlowResultProcessor_Factory create(Provider<Context> provider, Provider<h00.a<String>> provider2, Provider<StripeRepository> provider3, Provider<Logger> provider4, Provider<g> provider5) {
        return new SetupIntentFlowResultProcessor_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static SetupIntentFlowResultProcessor newInstance(Context context, h00.a<String> aVar, StripeRepository stripeRepository, Logger logger, g gVar) {
        return new SetupIntentFlowResultProcessor(context, aVar, stripeRepository, logger, gVar);
    }

    @Override // javax.inject.Provider
    public SetupIntentFlowResultProcessor get() {
        return newInstance(this.contextProvider.get(), this.publishableKeyProvider.get(), this.stripeRepositoryProvider.get(), this.loggerProvider.get(), this.workContextProvider.get());
    }
}