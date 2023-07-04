package com.stripe.android.paymentsheet.paymentdatacollection.ach.di;

import java.util.Set;
import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class USBankAccountFormViewModelModule_ProvidesProductUsageFactory implements e<Set<String>> {
    private final USBankAccountFormViewModelModule module;

    public USBankAccountFormViewModelModule_ProvidesProductUsageFactory(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule) {
        this.module = uSBankAccountFormViewModelModule;
    }

    public static USBankAccountFormViewModelModule_ProvidesProductUsageFactory create(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule) {
        return new USBankAccountFormViewModelModule_ProvidesProductUsageFactory(uSBankAccountFormViewModelModule);
    }

    public static Set<String> providesProductUsage(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule) {
        return (Set) h.e(uSBankAccountFormViewModelModule.providesProductUsage());
    }

    @Override // javax.inject.Provider
    public Set<String> get() {
        return providesProductUsage(this.module);
    }
}