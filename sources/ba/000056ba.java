package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import com.stripe.android.paymentsheet.PrefsRepository;
import javax.inject.Provider;
import tw.e;
import tw.h;
import zz.g;

/* loaded from: classes6.dex */
public final class PaymentSheetViewModelModule_ProvidePrefsRepositoryFactory implements e<PrefsRepository> {
    private final Provider<Context> appContextProvider;
    private final PaymentSheetViewModelModule module;
    private final Provider<g> workContextProvider;

    public PaymentSheetViewModelModule_ProvidePrefsRepositoryFactory(PaymentSheetViewModelModule paymentSheetViewModelModule, Provider<Context> provider, Provider<g> provider2) {
        this.module = paymentSheetViewModelModule;
        this.appContextProvider = provider;
        this.workContextProvider = provider2;
    }

    public static PaymentSheetViewModelModule_ProvidePrefsRepositoryFactory create(PaymentSheetViewModelModule paymentSheetViewModelModule, Provider<Context> provider, Provider<g> provider2) {
        return new PaymentSheetViewModelModule_ProvidePrefsRepositoryFactory(paymentSheetViewModelModule, provider, provider2);
    }

    public static PrefsRepository providePrefsRepository(PaymentSheetViewModelModule paymentSheetViewModelModule, Context context, g gVar) {
        return (PrefsRepository) h.e(paymentSheetViewModelModule.providePrefsRepository(context, gVar));
    }

    @Override // javax.inject.Provider
    public PrefsRepository get() {
        return providePrefsRepository(this.module, this.appContextProvider.get(), this.workContextProvider.get());
    }
}