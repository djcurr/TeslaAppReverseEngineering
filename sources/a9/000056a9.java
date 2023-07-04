package com.stripe.android.paymentsheet.injection;

import tw.e;

/* loaded from: classes6.dex */
public final class PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory implements e<Boolean> {

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory INSTANCE = new PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory();

        private InstanceHolder() {
        }
    }

    public static PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provideEnabledLogging() {
        return PaymentSheetCommonModule.Companion.provideEnabledLogging();
    }

    @Override // javax.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provideEnabledLogging());
    }
}