package com.stripe.android.paymentsheet.injection;

import com.stripe.android.paymentsheet.analytics.EventReporter;
import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class PaymentSheetLauncherModule_Companion_ProvideEventReporterModeFactory implements e<EventReporter.Mode> {

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final PaymentSheetLauncherModule_Companion_ProvideEventReporterModeFactory INSTANCE = new PaymentSheetLauncherModule_Companion_ProvideEventReporterModeFactory();

        private InstanceHolder() {
        }
    }

    public static PaymentSheetLauncherModule_Companion_ProvideEventReporterModeFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static EventReporter.Mode provideEventReporterMode() {
        return (EventReporter.Mode) h.e(PaymentSheetLauncherModule.Companion.provideEventReporterMode());
    }

    @Override // javax.inject.Provider
    public EventReporter.Mode get() {
        return provideEventReporterMode();
    }
}