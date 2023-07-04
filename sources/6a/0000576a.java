package com.stripe.android.paymentsheet.paymentdatacollection.ach.di;

import android.content.Context;
import h00.a;
import javax.inject.Provider;
import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class USBankAccountFormViewModelModule_ProvidePublishableKeyFactory implements e<a<String>> {
    private final Provider<Context> appContextProvider;
    private final USBankAccountFormViewModelModule module;

    public USBankAccountFormViewModelModule_ProvidePublishableKeyFactory(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, Provider<Context> provider) {
        this.module = uSBankAccountFormViewModelModule;
        this.appContextProvider = provider;
    }

    public static USBankAccountFormViewModelModule_ProvidePublishableKeyFactory create(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, Provider<Context> provider) {
        return new USBankAccountFormViewModelModule_ProvidePublishableKeyFactory(uSBankAccountFormViewModelModule, provider);
    }

    public static a<String> providePublishableKey(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, Context context) {
        return (a) h.e(uSBankAccountFormViewModelModule.providePublishableKey(context));
    }

    @Override // javax.inject.Provider
    public a<String> get() {
        return providePublishableKey(this.module, this.appContextProvider.get());
    }
}