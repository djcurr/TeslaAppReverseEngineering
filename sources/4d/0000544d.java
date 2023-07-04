package com.stripe.android.payments.core.injection;

import android.content.Context;
import javax.inject.Provider;
import tw.e;

/* loaded from: classes6.dex */
public final class PaymentLauncherModule_ProvideIsInstantAppFactory implements e<Boolean> {
    private final Provider<Context> contextProvider;
    private final PaymentLauncherModule module;

    public PaymentLauncherModule_ProvideIsInstantAppFactory(PaymentLauncherModule paymentLauncherModule, Provider<Context> provider) {
        this.module = paymentLauncherModule;
        this.contextProvider = provider;
    }

    public static PaymentLauncherModule_ProvideIsInstantAppFactory create(PaymentLauncherModule paymentLauncherModule, Provider<Context> provider) {
        return new PaymentLauncherModule_ProvideIsInstantAppFactory(paymentLauncherModule, provider);
    }

    public static boolean provideIsInstantApp(PaymentLauncherModule paymentLauncherModule, Context context) {
        return paymentLauncherModule.provideIsInstantApp(context);
    }

    @Override // javax.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provideIsInstantApp(this.module, this.contextProvider.get()));
    }
}