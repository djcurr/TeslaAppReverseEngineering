package com.stripe.android.payments.core.injection;

import com.stripe.android.PaymentAuthConfig;
import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class Stripe3DSAuthenticatorModule_Companion_ProvidePaymentAuthConfigFactory implements e<PaymentAuthConfig> {

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final Stripe3DSAuthenticatorModule_Companion_ProvidePaymentAuthConfigFactory INSTANCE = new Stripe3DSAuthenticatorModule_Companion_ProvidePaymentAuthConfigFactory();

        private InstanceHolder() {
        }
    }

    public static Stripe3DSAuthenticatorModule_Companion_ProvidePaymentAuthConfigFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static PaymentAuthConfig providePaymentAuthConfig() {
        return (PaymentAuthConfig) h.e(Stripe3DSAuthenticatorModule.Companion.providePaymentAuthConfig());
    }

    @Override // javax.inject.Provider
    public PaymentAuthConfig get() {
        return providePaymentAuthConfig();
    }
}