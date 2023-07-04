package com.stripe.android.link.ui.paymentmethod;

import com.stripe.android.link.injection.SignedInViewModelSubcomponent;
import com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel;
import javax.inject.Provider;
import sw.b;

/* loaded from: classes6.dex */
public final class PaymentMethodViewModel_Factory_MembersInjector implements b<PaymentMethodViewModel.Factory> {
    private final Provider<SignedInViewModelSubcomponent.Builder> subComponentBuilderProvider;

    public PaymentMethodViewModel_Factory_MembersInjector(Provider<SignedInViewModelSubcomponent.Builder> provider) {
        this.subComponentBuilderProvider = provider;
    }

    public static b<PaymentMethodViewModel.Factory> create(Provider<SignedInViewModelSubcomponent.Builder> provider) {
        return new PaymentMethodViewModel_Factory_MembersInjector(provider);
    }

    public static void injectSubComponentBuilderProvider(PaymentMethodViewModel.Factory factory, Provider<SignedInViewModelSubcomponent.Builder> provider) {
        factory.subComponentBuilderProvider = provider;
    }

    public void injectMembers(PaymentMethodViewModel.Factory factory) {
        injectSubComponentBuilderProvider(factory, this.subComponentBuilderProvider);
    }
}