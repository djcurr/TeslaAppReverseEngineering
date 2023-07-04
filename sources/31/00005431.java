package com.stripe.android.payments.core.injection;

import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.payments.core.authentication.DefaultPaymentAuthenticatorRegistry;
import com.stripe.android.view.AuthActivityStarterHost;
import h00.l;
import javax.inject.Provider;
import sw.a;
import tw.d;
import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class AuthenticationModule_Companion_ProvidePaymentRelayStarterFactoryFactory implements e<l<AuthActivityStarterHost, PaymentRelayStarter>> {
    private final Provider<DefaultPaymentAuthenticatorRegistry> registryProvider;

    public AuthenticationModule_Companion_ProvidePaymentRelayStarterFactoryFactory(Provider<DefaultPaymentAuthenticatorRegistry> provider) {
        this.registryProvider = provider;
    }

    public static AuthenticationModule_Companion_ProvidePaymentRelayStarterFactoryFactory create(Provider<DefaultPaymentAuthenticatorRegistry> provider) {
        return new AuthenticationModule_Companion_ProvidePaymentRelayStarterFactoryFactory(provider);
    }

    public static l<AuthActivityStarterHost, PaymentRelayStarter> providePaymentRelayStarterFactory(a<DefaultPaymentAuthenticatorRegistry> aVar) {
        return (l) h.e(AuthenticationModule.Companion.providePaymentRelayStarterFactory(aVar));
    }

    @Override // javax.inject.Provider
    public l<AuthActivityStarterHost, PaymentRelayStarter> get() {
        return providePaymentRelayStarterFactory(d.a(this.registryProvider));
    }
}