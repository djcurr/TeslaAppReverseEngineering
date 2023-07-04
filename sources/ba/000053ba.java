package com.stripe.android.payments.bankaccount.domain;

import com.stripe.android.networking.StripeRepository;
import javax.inject.Provider;
import tw.e;

/* loaded from: classes6.dex */
public final class VerifyWithMicrodeposit_Factory implements e<VerifyWithMicrodeposit> {
    private final Provider<StripeRepository> stripeRepositoryProvider;

    public VerifyWithMicrodeposit_Factory(Provider<StripeRepository> provider) {
        this.stripeRepositoryProvider = provider;
    }

    public static VerifyWithMicrodeposit_Factory create(Provider<StripeRepository> provider) {
        return new VerifyWithMicrodeposit_Factory(provider);
    }

    public static VerifyWithMicrodeposit newInstance(StripeRepository stripeRepository) {
        return new VerifyWithMicrodeposit(stripeRepository);
    }

    @Override // javax.inject.Provider
    public VerifyWithMicrodeposit get() {
        return newInstance(this.stripeRepositoryProvider.get());
    }
}