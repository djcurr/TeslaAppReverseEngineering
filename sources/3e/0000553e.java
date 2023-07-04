package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent;
import javax.inject.Provider;

/* loaded from: classes6.dex */
public final class PaymentOptionsViewModel_Factory_MembersInjector implements sw.b<PaymentOptionsViewModel.Factory> {
    private final Provider<PaymentOptionsViewModelSubcomponent.Builder> subComponentBuilderProvider;

    public PaymentOptionsViewModel_Factory_MembersInjector(Provider<PaymentOptionsViewModelSubcomponent.Builder> provider) {
        this.subComponentBuilderProvider = provider;
    }

    public static sw.b<PaymentOptionsViewModel.Factory> create(Provider<PaymentOptionsViewModelSubcomponent.Builder> provider) {
        return new PaymentOptionsViewModel_Factory_MembersInjector(provider);
    }

    public static void injectSubComponentBuilderProvider(PaymentOptionsViewModel.Factory factory, Provider<PaymentOptionsViewModelSubcomponent.Builder> provider) {
        factory.subComponentBuilderProvider = provider;
    }

    public void injectMembers(PaymentOptionsViewModel.Factory factory) {
        injectSubComponentBuilderProvider(factory, this.subComponentBuilderProvider);
    }
}