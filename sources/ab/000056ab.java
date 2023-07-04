package com.stripe.android.paymentsheet.injection;

import java.util.Locale;
import tw.e;

/* loaded from: classes6.dex */
public final class PaymentSheetCommonModule_Companion_ProvideLocaleFactory implements e<Locale> {

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final PaymentSheetCommonModule_Companion_ProvideLocaleFactory INSTANCE = new PaymentSheetCommonModule_Companion_ProvideLocaleFactory();

        private InstanceHolder() {
        }
    }

    public static PaymentSheetCommonModule_Companion_ProvideLocaleFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Locale provideLocale() {
        return PaymentSheetCommonModule.Companion.provideLocale();
    }

    @Override // javax.inject.Provider
    public Locale get() {
        return provideLocale();
    }
}