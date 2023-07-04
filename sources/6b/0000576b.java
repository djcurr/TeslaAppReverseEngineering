package com.stripe.android.paymentsheet.paymentdatacollection.ach.di;

import android.app.Application;
import android.content.Context;
import javax.inject.Provider;
import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class USBankAccountFormViewModelModule_ProvidesAppContextFactory implements e<Context> {
    private final Provider<Application> applicationProvider;
    private final USBankAccountFormViewModelModule module;

    public USBankAccountFormViewModelModule_ProvidesAppContextFactory(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, Provider<Application> provider) {
        this.module = uSBankAccountFormViewModelModule;
        this.applicationProvider = provider;
    }

    public static USBankAccountFormViewModelModule_ProvidesAppContextFactory create(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, Provider<Application> provider) {
        return new USBankAccountFormViewModelModule_ProvidesAppContextFactory(uSBankAccountFormViewModelModule, provider);
    }

    public static Context providesAppContext(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, Application application) {
        return (Context) h.e(uSBankAccountFormViewModelModule.providesAppContext(application));
    }

    @Override // javax.inject.Provider
    public Context get() {
        return providesAppContext(this.module, this.applicationProvider.get());
    }
}