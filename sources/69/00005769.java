package com.stripe.android.paymentsheet.paymentdatacollection.ach.di;

import android.content.Context;
import com.stripe.android.PaymentConfiguration;
import javax.inject.Provider;
import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class USBankAccountFormViewModelModule_ProvidePaymentConfigurationFactory implements e<PaymentConfiguration> {
    private final Provider<Context> appContextProvider;
    private final USBankAccountFormViewModelModule module;

    public USBankAccountFormViewModelModule_ProvidePaymentConfigurationFactory(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, Provider<Context> provider) {
        this.module = uSBankAccountFormViewModelModule;
        this.appContextProvider = provider;
    }

    public static USBankAccountFormViewModelModule_ProvidePaymentConfigurationFactory create(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, Provider<Context> provider) {
        return new USBankAccountFormViewModelModule_ProvidePaymentConfigurationFactory(uSBankAccountFormViewModelModule, provider);
    }

    public static PaymentConfiguration providePaymentConfiguration(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, Context context) {
        return (PaymentConfiguration) h.e(uSBankAccountFormViewModelModule.providePaymentConfiguration(context));
    }

    @Override // javax.inject.Provider
    public PaymentConfiguration get() {
        return providePaymentConfiguration(this.module, this.appContextProvider.get());
    }
}