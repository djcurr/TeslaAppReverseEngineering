package com.stripe.android.paymentsheet.injection;

import com.stripe.android.PaymentConfiguration;
import h00.a;
import javax.inject.Provider;
import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory implements e<a<String>> {
    private final Provider<PaymentConfiguration> paymentConfigurationProvider;

    public PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory(Provider<PaymentConfiguration> provider) {
        this.paymentConfigurationProvider = provider;
    }

    public static PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory create(Provider<PaymentConfiguration> provider) {
        return new PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory(provider);
    }

    public static a<String> providePublishableKey(Provider<PaymentConfiguration> provider) {
        return (a) h.e(PaymentSheetCommonModule.Companion.providePublishableKey(provider));
    }

    @Override // javax.inject.Provider
    public a<String> get() {
        return providePublishableKey(this.paymentConfigurationProvider);
    }
}