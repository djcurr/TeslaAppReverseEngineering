package com.stripe.android.payments.core.authentication;

import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.view.AuthActivityStarterHost;
import h00.l;
import javax.inject.Provider;
import tw.e;

/* loaded from: classes6.dex */
public final class UnsupportedAuthenticator_Factory implements e<UnsupportedAuthenticator> {
    private final Provider<l<AuthActivityStarterHost, PaymentRelayStarter>> paymentRelayStarterFactoryProvider;

    public UnsupportedAuthenticator_Factory(Provider<l<AuthActivityStarterHost, PaymentRelayStarter>> provider) {
        this.paymentRelayStarterFactoryProvider = provider;
    }

    public static UnsupportedAuthenticator_Factory create(Provider<l<AuthActivityStarterHost, PaymentRelayStarter>> provider) {
        return new UnsupportedAuthenticator_Factory(provider);
    }

    public static UnsupportedAuthenticator newInstance(l<AuthActivityStarterHost, PaymentRelayStarter> lVar) {
        return new UnsupportedAuthenticator(lVar);
    }

    @Override // javax.inject.Provider
    public UnsupportedAuthenticator get() {
        return newInstance(this.paymentRelayStarterFactoryProvider.get());
    }
}