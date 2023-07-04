package com.stripe.android.payments.bankaccount.domain;

import com.stripe.android.networking.StripeRepository;
import javax.inject.Provider;
import tw.e;

/* loaded from: classes6.dex */
public final class RetrieveStripeIntent_Factory implements e<RetrieveStripeIntent> {
    private final Provider<StripeRepository> stripeRepositoryProvider;

    public RetrieveStripeIntent_Factory(Provider<StripeRepository> provider) {
        this.stripeRepositoryProvider = provider;
    }

    public static RetrieveStripeIntent_Factory create(Provider<StripeRepository> provider) {
        return new RetrieveStripeIntent_Factory(provider);
    }

    public static RetrieveStripeIntent newInstance(StripeRepository stripeRepository) {
        return new RetrieveStripeIntent(stripeRepository);
    }

    @Override // javax.inject.Provider
    public RetrieveStripeIntent get() {
        return newInstance(this.stripeRepositoryProvider.get());
    }
}