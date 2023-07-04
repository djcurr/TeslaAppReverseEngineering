package com.stripe.android.paymentsheet.injection;

import com.stripe.android.PaymentConfiguration;
import h00.a;
import javax.inject.Provider;
import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class PaymentSheetCommonModule_Companion_ProvideStripeAccountIdFactory implements e<a<String>> {
    private final Provider<PaymentConfiguration> paymentConfigurationProvider;

    public PaymentSheetCommonModule_Companion_ProvideStripeAccountIdFactory(Provider<PaymentConfiguration> provider) {
        this.paymentConfigurationProvider = provider;
    }

    public static PaymentSheetCommonModule_Companion_ProvideStripeAccountIdFactory create(Provider<PaymentConfiguration> provider) {
        return new PaymentSheetCommonModule_Companion_ProvideStripeAccountIdFactory(provider);
    }

    public static a<String> provideStripeAccountId(Provider<PaymentConfiguration> provider) {
        return (a) h.e(PaymentSheetCommonModule.Companion.provideStripeAccountId(provider));
    }

    @Override // javax.inject.Provider
    public a<String> get() {
        return provideStripeAccountId(this.paymentConfigurationProvider);
    }
}