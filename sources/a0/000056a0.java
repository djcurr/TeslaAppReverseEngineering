package com.stripe.android.paymentsheet.injection;

import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class PaymentOptionsViewModelModule_ProvideDummyInjectorKeyFactory implements e<String> {
    private final PaymentOptionsViewModelModule module;

    public PaymentOptionsViewModelModule_ProvideDummyInjectorKeyFactory(PaymentOptionsViewModelModule paymentOptionsViewModelModule) {
        this.module = paymentOptionsViewModelModule;
    }

    public static PaymentOptionsViewModelModule_ProvideDummyInjectorKeyFactory create(PaymentOptionsViewModelModule paymentOptionsViewModelModule) {
        return new PaymentOptionsViewModelModule_ProvideDummyInjectorKeyFactory(paymentOptionsViewModelModule);
    }

    public static String provideDummyInjectorKey(PaymentOptionsViewModelModule paymentOptionsViewModelModule) {
        return (String) h.e(paymentOptionsViewModelModule.provideDummyInjectorKey());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provideDummyInjectorKey(this.module);
    }
}