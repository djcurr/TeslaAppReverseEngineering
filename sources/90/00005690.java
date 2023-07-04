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
public final class FlowControllerModule_Companion_ProvidePrefsRepositoryFactoryFactory implements e<l<PaymentSheet.CustomerConfiguration, PrefsRepository>> {
    private final Provider<Context> appContextProvider;
    private final Provider<g> workContextProvider;

    public FlowControllerModule_Companion_ProvidePrefsRepositoryFactoryFactory(Provider<Context> provider, Provider<g> provider2) {
        this.appContextProvider = provider;
        this.workContextProvider = provider2;
    }

    public static FlowControllerModule_Companion_ProvidePrefsRepositoryFactoryFactory create(Provider<Context> provider, Provider<g> provider2) {
        return new FlowControllerModule_Companion_ProvidePrefsRepositoryFactoryFactory(provider, provider2);
    }

    public static l<PaymentSheet.CustomerConfiguration, PrefsRepository> providePrefsRepositoryFactory(Context context, g gVar) {
        return (l) h.e(FlowControllerModule.Companion.providePrefsRepositoryFactory(context, gVar));
    }

    @Override // javax.inject.Provider
    public l<PaymentSheet.CustomerConfiguration, PrefsRepository> get() {
        return providePrefsRepositoryFactory(this.appContextProvider.get(), this.workContextProvider.get());
    }
}