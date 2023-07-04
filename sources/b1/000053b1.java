package com.stripe.android.payments.bankaccount.domain;

import com.stripe.android.networking.StripeRepository;
import javax.inject.Provider;
import tw.e;

/* loaded from: classes6.dex */
public final class CreateFinancialConnectionsSession_Factory implements e<CreateFinancialConnectionsSession> {
    private final Provider<StripeRepository> stripeRepositoryProvider;

    public CreateFinancialConnectionsSession_Factory(Provider<StripeRepository> provider) {
        this.stripeRepositoryProvider = provider;
    }

    public static CreateFinancialConnectionsSession_Factory create(Provider<StripeRepository> provider) {
        return new CreateFinancialConnectionsSession_Factory(provider);
    }

    public static CreateFinancialConnectionsSession newInstance(StripeRepository stripeRepository) {
        return new CreateFinancialConnectionsSession(stripeRepository);
    }

    @Override // javax.inject.Provider
    public CreateFinancialConnectionsSession get() {
        return newInstance(this.stripeRepositoryProvider.get());
    }
}