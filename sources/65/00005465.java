package com.stripe.android.payments.core.injection;

import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.core.authentication.PaymentAuthenticator;
import com.stripe.android.payments.core.authentication.UnsupportedAuthenticator;
import javax.inject.Provider;
import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class WeChatPayAuthenticatorModule_ProvideWeChatAuthenticator$payments_core_releaseFactory implements e<PaymentAuthenticator<StripeIntent>> {
    private final WeChatPayAuthenticatorModule module;
    private final Provider<UnsupportedAuthenticator> unsupportedAuthenticatorProvider;

    public WeChatPayAuthenticatorModule_ProvideWeChatAuthenticator$payments_core_releaseFactory(WeChatPayAuthenticatorModule weChatPayAuthenticatorModule, Provider<UnsupportedAuthenticator> provider) {
        this.module = weChatPayAuthenticatorModule;
        this.unsupportedAuthenticatorProvider = provider;
    }

    public static WeChatPayAuthenticatorModule_ProvideWeChatAuthenticator$payments_core_releaseFactory create(WeChatPayAuthenticatorModule weChatPayAuthenticatorModule, Provider<UnsupportedAuthenticator> provider) {
        return new WeChatPayAuthenticatorModule_ProvideWeChatAuthenticator$payments_core_releaseFactory(weChatPayAuthenticatorModule, provider);
    }

    public static PaymentAuthenticator<StripeIntent> provideWeChatAuthenticator$payments_core_release(WeChatPayAuthenticatorModule weChatPayAuthenticatorModule, UnsupportedAuthenticator unsupportedAuthenticator) {
        return (PaymentAuthenticator) h.e(weChatPayAuthenticatorModule.provideWeChatAuthenticator$payments_core_release(unsupportedAuthenticator));
    }

    @Override // javax.inject.Provider
    public PaymentAuthenticator<StripeIntent> get() {
        return provideWeChatAuthenticator$payments_core_release(this.module, this.unsupportedAuthenticatorProvider.get());
    }
}