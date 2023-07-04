package com.stripe.android.paymentsheet.injection;

import com.stripe.android.paymentsheet.analytics.EventReporter;
import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class PaymentOptionsViewModelModule_ProvideEventReporterModeFactory implements e<EventReporter.Mode> {
    private final PaymentOptionsViewModelModule module;

    public PaymentOptionsViewModelModule_ProvideEventReporterModeFactory(PaymentOptionsViewModelModule paymentOptionsViewModelModule) {
        this.module = paymentOptionsViewModelModule;
    }

    public static PaymentOptionsViewModelModule_ProvideEventReporterModeFactory create(PaymentOptionsViewModelModule paymentOptionsViewModelModule) {
        return new PaymentOptionsViewModelModule_ProvideEventReporterModeFactory(paymentOptionsViewModelModule);
    }

    public static EventReporter.Mode provideEventReporterMode(PaymentOptionsViewModelModule paymentOptionsViewModelModule) {
        return (EventReporter.Mode) h.e(paymentOptionsViewModelModule.provideEventReporterMode());
    }

    @Override // javax.inject.Provider
    public EventReporter.Mode get() {
        return provideEventReporterMode(this.module);
    }
}