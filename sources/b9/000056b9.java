package com.stripe.android.paymentsheet.injection;

import com.stripe.android.paymentsheet.PaymentSheetContract;
import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class PaymentSheetViewModelModule_ProvideArgsFactory implements e<PaymentSheetContract.Args> {
    private final PaymentSheetViewModelModule module;

    public PaymentSheetViewModelModule_ProvideArgsFactory(PaymentSheetViewModelModule paymentSheetViewModelModule) {
        this.module = paymentSheetViewModelModule;
    }

    public static PaymentSheetViewModelModule_ProvideArgsFactory create(PaymentSheetViewModelModule paymentSheetViewModelModule) {
        return new PaymentSheetViewModelModule_ProvideArgsFactory(paymentSheetViewModelModule);
    }

    public static PaymentSheetContract.Args provideArgs(PaymentSheetViewModelModule paymentSheetViewModelModule) {
        return (PaymentSheetContract.Args) h.e(paymentSheetViewModelModule.provideArgs());
    }

    @Override // javax.inject.Provider
    public PaymentSheetContract.Args get() {
        return provideArgs(this.module);
    }
}