package com.stripe.android.payments.core.authentication.threeds2;

import com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent;
import javax.inject.Provider;

/* loaded from: classes6.dex */
public final class Stripe3ds2TransactionViewModelFactory_MembersInjector implements sw.b<Stripe3ds2TransactionViewModelFactory> {
    private final Provider<Stripe3ds2TransactionViewModelSubcomponent.Builder> subComponentBuilderProvider;

    public Stripe3ds2TransactionViewModelFactory_MembersInjector(Provider<Stripe3ds2TransactionViewModelSubcomponent.Builder> provider) {
        this.subComponentBuilderProvider = provider;
    }

    public static sw.b<Stripe3ds2TransactionViewModelFactory> create(Provider<Stripe3ds2TransactionViewModelSubcomponent.Builder> provider) {
        return new Stripe3ds2TransactionViewModelFactory_MembersInjector(provider);
    }

    public static void injectSubComponentBuilder(Stripe3ds2TransactionViewModelFactory stripe3ds2TransactionViewModelFactory, Stripe3ds2TransactionViewModelSubcomponent.Builder builder) {
        stripe3ds2TransactionViewModelFactory.subComponentBuilder = builder;
    }

    public void injectMembers(Stripe3ds2TransactionViewModelFactory stripe3ds2TransactionViewModelFactory) {
        injectSubComponentBuilder(stripe3ds2TransactionViewModelFactory, this.subComponentBuilderProvider.get());
    }
}