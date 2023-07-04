package com.stripe.android.payments.bankaccount.di;

import android.app.Application;
import android.content.Context;
import javax.inject.Provider;
import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class CollectBankAccountModule_ProvidesAppContextFactory implements e<Context> {
    private final Provider<Application> applicationProvider;

    public CollectBankAccountModule_ProvidesAppContextFactory(Provider<Application> provider) {
        this.applicationProvider = provider;
    }

    public static CollectBankAccountModule_ProvidesAppContextFactory create(Provider<Application> provider) {
        return new CollectBankAccountModule_ProvidesAppContextFactory(provider);
    }

    public static Context providesAppContext(Application application) {
        return (Context) h.e(CollectBankAccountModule.INSTANCE.providesAppContext(application));
    }

    @Override // javax.inject.Provider
    public Context get() {
        return providesAppContext(this.applicationProvider.get());
    }
}