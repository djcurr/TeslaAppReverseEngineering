package com.stripe.android.payments.core.injection;

import android.content.Context;
import com.stripe.android.payments.DefaultReturnUrl;
import javax.inject.Provider;
import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class PaymentLauncherModule_ProvideDefaultReturnUrlFactory implements e<DefaultReturnUrl> {
    private final Provider<Context> contextProvider;
    private final PaymentLauncherModule module;

    public PaymentLauncherModule_ProvideDefaultReturnUrlFactory(PaymentLauncherModule paymentLauncherModule, Provider<Context> provider) {
        this.module = paymentLauncherModule;
        this.contextProvider = provider;
    }

    public static PaymentLauncherModule_ProvideDefaultReturnUrlFactory create(PaymentLauncherModule paymentLauncherModule, Provider<Context> provider) {
        return new PaymentLauncherModule_ProvideDefaultReturnUrlFactory(paymentLauncherModule, provider);
    }

    public static DefaultReturnUrl provideDefaultReturnUrl(PaymentLauncherModule paymentLauncherModule, Context context) {
        return (DefaultReturnUrl) h.e(paymentLauncherModule.provideDefaultReturnUrl(context));
    }

    @Override // javax.inject.Provider
    public DefaultReturnUrl get() {
        return provideDefaultReturnUrl(this.module, this.contextProvider.get());
    }
}