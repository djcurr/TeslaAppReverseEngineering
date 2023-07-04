package com.stripe.android.payments.bankaccount.di;

import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import h00.a;
import javax.inject.Provider;
import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class CollectBankAccountModule_ProvidePublishableKeyFactory implements e<a<String>> {
    private final Provider<CollectBankAccountContract.Args> argsProvider;

    public CollectBankAccountModule_ProvidePublishableKeyFactory(Provider<CollectBankAccountContract.Args> provider) {
        this.argsProvider = provider;
    }

    public static CollectBankAccountModule_ProvidePublishableKeyFactory create(Provider<CollectBankAccountContract.Args> provider) {
        return new CollectBankAccountModule_ProvidePublishableKeyFactory(provider);
    }

    public static a<String> providePublishableKey(CollectBankAccountContract.Args args) {
        return (a) h.e(CollectBankAccountModule.INSTANCE.providePublishableKey(args));
    }

    @Override // javax.inject.Provider
    public a<String> get() {
        return providePublishableKey(this.argsProvider.get());
    }
}