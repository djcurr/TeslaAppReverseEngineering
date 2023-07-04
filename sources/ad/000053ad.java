package com.stripe.android.payments.bankaccount.domain;

import com.stripe.android.networking.StripeRepository;
import javax.inject.Provider;
import tw.e;

/* loaded from: classes6.dex */
public final class AttachFinancialConnectionsSession_Factory implements e<AttachFinancialConnectionsSession> {
    private final Provider<StripeRepository> stripeRepositoryProvider;

    public AttachFinancialConnectionsSession_Factory(Provider<StripeRepository> provider) {
        this.stripeRepositoryProvider = provider;
    }

    public static AttachFinancialConnectionsSession_Factory create(Provider<StripeRepository> provider) {
        return new AttachFinancialConnectionsSession_Factory(provider);
    }

    public static AttachFinancialConnectionsSession newInstance(StripeRepository stripeRepository) {
        return new AttachFinancialConnectionsSession(stripeRepository);
    }

    @Override // javax.inject.Provider
    public AttachFinancialConnectionsSession get() {
        return newInstance(this.stripeRepositoryProvider.get());
    }
}