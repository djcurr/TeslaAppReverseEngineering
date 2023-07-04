package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import android.app.Application;
import androidx.lifecycle.l0;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel;
import javax.inject.Provider;
import tw.e;

/* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel_Factory  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1429USBankAccountFormViewModel_Factory implements e<USBankAccountFormViewModel> {
    private final Provider<Application> applicationProvider;
    private final Provider<USBankAccountFormViewModel.Args> argsProvider;
    private final Provider<PaymentConfiguration> lazyPaymentConfigProvider;
    private final Provider<l0> savedStateHandleProvider;
    private final Provider<StripeRepository> stripeRepositoryProvider;

    public C1429USBankAccountFormViewModel_Factory(Provider<USBankAccountFormViewModel.Args> provider, Provider<Application> provider2, Provider<StripeRepository> provider3, Provider<PaymentConfiguration> provider4, Provider<l0> provider5) {
        this.argsProvider = provider;
        this.applicationProvider = provider2;
        this.stripeRepositoryProvider = provider3;
        this.lazyPaymentConfigProvider = provider4;
        this.savedStateHandleProvider = provider5;
    }

    public static C1429USBankAccountFormViewModel_Factory create(Provider<USBankAccountFormViewModel.Args> provider, Provider<Application> provider2, Provider<StripeRepository> provider3, Provider<PaymentConfiguration> provider4, Provider<l0> provider5) {
        return new C1429USBankAccountFormViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static USBankAccountFormViewModel newInstance(USBankAccountFormViewModel.Args args, Application application, StripeRepository stripeRepository, Provider<PaymentConfiguration> provider, l0 l0Var) {
        return new USBankAccountFormViewModel(args, application, stripeRepository, provider, l0Var);
    }

    @Override // javax.inject.Provider
    public USBankAccountFormViewModel get() {
        return newInstance(this.argsProvider.get(), this.applicationProvider.get(), this.stripeRepositoryProvider.get(), this.lazyPaymentConfigProvider, this.savedStateHandleProvider.get());
    }
}