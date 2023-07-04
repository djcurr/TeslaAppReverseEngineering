package com.stripe.android.payments.core.injection;

import com.stripe.android.PaymentBrowserAuthStarter;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.core.authentication.DefaultPaymentAuthenticatorRegistry;
import com.stripe.android.view.AuthActivityStarterHost;
import h00.l;
import javax.inject.Provider;
import sw.a;
import tw.d;
import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class AuthenticationModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory implements e<l<AuthActivityStarterHost, PaymentBrowserAuthStarter>> {
    private final Provider<DefaultReturnUrl> defaultReturnUrlProvider;
    private final Provider<DefaultPaymentAuthenticatorRegistry> registryProvider;

    public AuthenticationModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory(Provider<DefaultPaymentAuthenticatorRegistry> provider, Provider<DefaultReturnUrl> provider2) {
        this.registryProvider = provider;
        this.defaultReturnUrlProvider = provider2;
    }

    public static AuthenticationModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory create(Provider<DefaultPaymentAuthenticatorRegistry> provider, Provider<DefaultReturnUrl> provider2) {
        return new AuthenticationModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory(provider, provider2);
    }

    public static l<AuthActivityStarterHost, PaymentBrowserAuthStarter> providePaymentBrowserAuthStarterFactory(a<DefaultPaymentAuthenticatorRegistry> aVar, DefaultReturnUrl defaultReturnUrl) {
        return (l) h.e(AuthenticationModule.Companion.providePaymentBrowserAuthStarterFactory(aVar, defaultReturnUrl));
    }

    @Override // javax.inject.Provider
    public l<AuthActivityStarterHost, PaymentBrowserAuthStarter> get() {
        return providePaymentBrowserAuthStarterFactory(d.a(this.registryProvider), this.defaultReturnUrlProvider.get());
    }
}