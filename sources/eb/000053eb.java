package com.stripe.android.payments.core.authentication;

import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.view.AuthActivityStarterHost;
import h00.l;
import javax.inject.Provider;
import tw.e;

/* loaded from: classes6.dex */
public final class NoOpIntentAuthenticator_Factory implements e<NoOpIntentAuthenticator> {
    private final Provider<l<AuthActivityStarterHost, PaymentRelayStarter>> paymentRelayStarterFactoryProvider;

    public NoOpIntentAuthenticator_Factory(Provider<l<AuthActivityStarterHost, PaymentRelayStarter>> provider) {
        this.paymentRelayStarterFactoryProvider = provider;
    }

    public static NoOpIntentAuthenticator_Factory create(Provider<l<AuthActivityStarterHost, PaymentRelayStarter>> provider) {
        return new NoOpIntentAuthenticator_Factory(provider);
    }

    public static NoOpIntentAuthenticator newInstance(l<AuthActivityStarterHost, PaymentRelayStarter> lVar) {
        return new NoOpIntentAuthenticator(lVar);
    }

    @Override // javax.inject.Provider
    public NoOpIntentAuthenticator get() {
        return newInstance(this.paymentRelayStarterFactoryProvider.get());
    }
}