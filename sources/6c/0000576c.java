package com.stripe.android.paymentsheet.paymentdatacollection.ach.di;

import tw.e;

/* loaded from: classes6.dex */
public final class USBankAccountFormViewModelModule_ProvidesEnableLoggingFactory implements e<Boolean> {
    private final USBankAccountFormViewModelModule module;

    public USBankAccountFormViewModelModule_ProvidesEnableLoggingFactory(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule) {
        this.module = uSBankAccountFormViewModelModule;
    }

    public static USBankAccountFormViewModelModule_ProvidesEnableLoggingFactory create(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule) {
        return new USBankAccountFormViewModelModule_ProvidesEnableLoggingFactory(uSBankAccountFormViewModelModule);
    }

    public static boolean providesEnableLogging(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule) {
        return uSBankAccountFormViewModelModule.providesEnableLogging();
    }

    @Override // javax.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(providesEnableLogging(this.module));
    }
}