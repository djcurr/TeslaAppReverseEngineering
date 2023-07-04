package com.stripe.android.payments.core.authentication.threeds2;

import com.stripe.android.PaymentAuthConfig;
import java.util.Set;
import javax.inject.Provider;
import tw.e;

/* loaded from: classes6.dex */
public final class Stripe3DS2Authenticator_Factory implements e<Stripe3DS2Authenticator> {
    private final Provider<PaymentAuthConfig> configProvider;
    private final Provider<Boolean> enableLoggingProvider;
    private final Provider<String> injectorKeyProvider;
    private final Provider<Set<String>> productUsageProvider;
    private final Provider<h00.a<String>> publishableKeyProvider;

    public Stripe3DS2Authenticator_Factory(Provider<PaymentAuthConfig> provider, Provider<Boolean> provider2, Provider<String> provider3, Provider<h00.a<String>> provider4, Provider<Set<String>> provider5) {
        this.configProvider = provider;
        this.enableLoggingProvider = provider2;
        this.injectorKeyProvider = provider3;
        this.publishableKeyProvider = provider4;
        this.productUsageProvider = provider5;
    }

    public static Stripe3DS2Authenticator_Factory create(Provider<PaymentAuthConfig> provider, Provider<Boolean> provider2, Provider<String> provider3, Provider<h00.a<String>> provider4, Provider<Set<String>> provider5) {
        return new Stripe3DS2Authenticator_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static Stripe3DS2Authenticator newInstance(PaymentAuthConfig paymentAuthConfig, boolean z11, String str, h00.a<String> aVar, Set<String> set) {
        return new Stripe3DS2Authenticator(paymentAuthConfig, z11, str, aVar, set);
    }

    @Override // javax.inject.Provider
    public Stripe3DS2Authenticator get() {
        return newInstance(this.configProvider.get(), this.enableLoggingProvider.get().booleanValue(), this.injectorKeyProvider.get(), this.publishableKeyProvider.get(), this.productUsageProvider.get());
    }
}