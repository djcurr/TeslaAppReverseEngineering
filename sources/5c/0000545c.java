package com.stripe.android.payments.core.injection;

import android.content.Context;
import com.stripe.android.stripe3ds2.service.StripeThreeDs2Service;
import javax.inject.Provider;
import tw.e;
import tw.h;
import zz.g;

/* loaded from: classes6.dex */
public final class Stripe3ds2TransactionModule_Companion_ProvideStripeThreeDs2ServiceFactory implements e<StripeThreeDs2Service> {
    private final Provider<Context> contextProvider;
    private final Provider<Boolean> enableLoggingProvider;
    private final Provider<g> workContextProvider;

    public Stripe3ds2TransactionModule_Companion_ProvideStripeThreeDs2ServiceFactory(Provider<Context> provider, Provider<Boolean> provider2, Provider<g> provider3) {
        this.contextProvider = provider;
        this.enableLoggingProvider = provider2;
        this.workContextProvider = provider3;
    }

    public static Stripe3ds2TransactionModule_Companion_ProvideStripeThreeDs2ServiceFactory create(Provider<Context> provider, Provider<Boolean> provider2, Provider<g> provider3) {
        return new Stripe3ds2TransactionModule_Companion_ProvideStripeThreeDs2ServiceFactory(provider, provider2, provider3);
    }

    public static StripeThreeDs2Service provideStripeThreeDs2Service(Context context, boolean z11, g gVar) {
        return (StripeThreeDs2Service) h.e(Stripe3ds2TransactionModule.Companion.provideStripeThreeDs2Service(context, z11, gVar));
    }

    @Override // javax.inject.Provider
    public StripeThreeDs2Service get() {
        return provideStripeThreeDs2Service(this.contextProvider.get(), this.enableLoggingProvider.get().booleanValue(), this.workContextProvider.get());
    }
}