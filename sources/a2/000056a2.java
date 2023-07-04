package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PrefsRepository;
import h00.l;
import javax.inject.Provider;
import tw.e;
import tw.h;
import zz.g;

/* loaded from: classes6.dex */
public final class PaymentOptionsViewModelModule_ProvidePrefsRepositoryFactoryFactory implements e<l<PaymentSheet.CustomerConfiguration, PrefsRepository>> {
    private final Provider<Context> appContextProvider;
    private final PaymentOptionsViewModelModule module;
    private final Provider<g> workContextProvider;

    public PaymentOptionsViewModelModule_ProvidePrefsRepositoryFactoryFactory(PaymentOptionsViewModelModule paymentOptionsViewModelModule, Provider<Context> provider, Provider<g> provider2) {
        this.module = paymentOptionsViewModelModule;
        this.appContextProvider = provider;
        this.workContextProvider = provider2;
    }

    public static PaymentOptionsViewModelModule_ProvidePrefsRepositoryFactoryFactory create(PaymentOptionsViewModelModule paymentOptionsViewModelModule, Provider<Context> provider, Provider<g> provider2) {
        return new PaymentOptionsViewModelModule_ProvidePrefsRepositoryFactoryFactory(paymentOptionsViewModelModule, provider, provider2);
    }

    public static l<PaymentSheet.CustomerConfiguration, PrefsRepository> providePrefsRepositoryFactory(PaymentOptionsViewModelModule paymentOptionsViewModelModule, Context context, g gVar) {
        return (l) h.e(paymentOptionsViewModelModule.providePrefsRepositoryFactory(context, gVar));
    }

    @Override // javax.inject.Provider
    public l<PaymentSheet.CustomerConfiguration, PrefsRepository> get() {
        return providePrefsRepositoryFactory(this.module, this.appContextProvider.get(), this.workContextProvider.get());
    }
}