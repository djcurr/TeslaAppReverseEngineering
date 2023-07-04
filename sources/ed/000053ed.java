package com.stripe.android.payments.core.authentication;

import javax.inject.Provider;
import tw.e;

/* loaded from: classes6.dex */
public final class OxxoAuthenticator_Factory implements e<OxxoAuthenticator> {
    private final Provider<NoOpIntentAuthenticator> noOpIntentAuthenticatorProvider;
    private final Provider<WebIntentAuthenticator> webIntentAuthenticatorProvider;

    public OxxoAuthenticator_Factory(Provider<WebIntentAuthenticator> provider, Provider<NoOpIntentAuthenticator> provider2) {
        this.webIntentAuthenticatorProvider = provider;
        this.noOpIntentAuthenticatorProvider = provider2;
    }

    public static OxxoAuthenticator_Factory create(Provider<WebIntentAuthenticator> provider, Provider<NoOpIntentAuthenticator> provider2) {
        return new OxxoAuthenticator_Factory(provider, provider2);
    }

    public static OxxoAuthenticator newInstance(WebIntentAuthenticator webIntentAuthenticator, NoOpIntentAuthenticator noOpIntentAuthenticator) {
        return new OxxoAuthenticator(webIntentAuthenticator, noOpIntentAuthenticator);
    }

    @Override // javax.inject.Provider
    public OxxoAuthenticator get() {
        return newInstance(this.webIntentAuthenticatorProvider.get(), this.noOpIntentAuthenticatorProvider.get());
    }
}