package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import com.stripe.android.paymentsheet.injection.PaymentSheetViewModelSubcomponent;
import javax.inject.Provider;

/* loaded from: classes6.dex */
public final class PaymentSheetViewModel_Factory_MembersInjector implements sw.b<PaymentSheetViewModel.Factory> {
    private final Provider<PaymentSheetViewModelSubcomponent.Builder> subComponentBuilderProvider;

    public PaymentSheetViewModel_Factory_MembersInjector(Provider<PaymentSheetViewModelSubcomponent.Builder> provider) {
        this.subComponentBuilderProvider = provider;
    }

    public static sw.b<PaymentSheetViewModel.Factory> create(Provider<PaymentSheetViewModelSubcomponent.Builder> provider) {
        return new PaymentSheetViewModel_Factory_MembersInjector(provider);
    }

    public static void injectSubComponentBuilderProvider(PaymentSheetViewModel.Factory factory, Provider<PaymentSheetViewModelSubcomponent.Builder> provider) {
        factory.subComponentBuilderProvider = provider;
    }

    public void injectMembers(PaymentSheetViewModel.Factory factory) {
        injectSubComponentBuilderProvider(factory, this.subComponentBuilderProvider);
    }
}