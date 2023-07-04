package com.stripe.android.payments.paymentlauncher;

import com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel;
import javax.inject.Provider;

/* loaded from: classes6.dex */
public final class PaymentLauncherViewModel_Factory_MembersInjector implements sw.b<PaymentLauncherViewModel.Factory> {
    private final Provider<PaymentLauncherViewModelSubcomponent.Builder> subComponentBuilderProvider;

    public PaymentLauncherViewModel_Factory_MembersInjector(Provider<PaymentLauncherViewModelSubcomponent.Builder> provider) {
        this.subComponentBuilderProvider = provider;
    }

    public static sw.b<PaymentLauncherViewModel.Factory> create(Provider<PaymentLauncherViewModelSubcomponent.Builder> provider) {
        return new PaymentLauncherViewModel_Factory_MembersInjector(provider);
    }

    public static void injectSubComponentBuilderProvider(PaymentLauncherViewModel.Factory factory, Provider<PaymentLauncherViewModelSubcomponent.Builder> provider) {
        factory.subComponentBuilderProvider = provider;
    }

    public void injectMembers(PaymentLauncherViewModel.Factory factory) {
        injectSubComponentBuilderProvider(factory, this.subComponentBuilderProvider);
    }
}