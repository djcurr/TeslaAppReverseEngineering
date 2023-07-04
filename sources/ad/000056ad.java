package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import com.stripe.android.PaymentConfiguration;
import javax.inject.Provider;
import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory implements e<PaymentConfiguration> {
    private final Provider<Context> appContextProvider;

    public PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory(Provider<Context> provider) {
        this.appContextProvider = provider;
    }

    public static PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory create(Provider<Context> provider) {
        return new PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory(provider);
    }

    public static PaymentConfiguration providePaymentConfiguration(Context context) {
        return (PaymentConfiguration) h.e(PaymentSheetCommonModule.Companion.providePaymentConfiguration(context));
    }

    @Override // javax.inject.Provider
    public PaymentConfiguration get() {
        return providePaymentConfiguration(this.appContextProvider.get());
    }
}