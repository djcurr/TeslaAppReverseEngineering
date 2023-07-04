package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.di.USBankAccountFormViewModelSubcomponent;
import javax.inject.Provider;
import sw.b;

/* loaded from: classes6.dex */
public final class USBankAccountFormViewModel_Factory_MembersInjector implements b<USBankAccountFormViewModel.Factory> {
    private final Provider<USBankAccountFormViewModelSubcomponent.Builder> subComponentBuilderProvider;

    public USBankAccountFormViewModel_Factory_MembersInjector(Provider<USBankAccountFormViewModelSubcomponent.Builder> provider) {
        this.subComponentBuilderProvider = provider;
    }

    public static b<USBankAccountFormViewModel.Factory> create(Provider<USBankAccountFormViewModelSubcomponent.Builder> provider) {
        return new USBankAccountFormViewModel_Factory_MembersInjector(provider);
    }

    public static void injectSubComponentBuilderProvider(USBankAccountFormViewModel.Factory factory, Provider<USBankAccountFormViewModelSubcomponent.Builder> provider) {
        factory.subComponentBuilderProvider = provider;
    }

    public void injectMembers(USBankAccountFormViewModel.Factory factory) {
        injectSubComponentBuilderProvider(factory, this.subComponentBuilderProvider);
    }
}