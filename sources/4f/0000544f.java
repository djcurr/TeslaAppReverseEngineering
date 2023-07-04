package com.stripe.android.payments.core.injection;

import java.util.Map;
import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class PaymentLauncherModule_ProvideThreeDs1IntentReturnUrlMapFactory implements e<Map<String, String>> {
    private final PaymentLauncherModule module;

    public PaymentLauncherModule_ProvideThreeDs1IntentReturnUrlMapFactory(PaymentLauncherModule paymentLauncherModule) {
        this.module = paymentLauncherModule;
    }

    public static PaymentLauncherModule_ProvideThreeDs1IntentReturnUrlMapFactory create(PaymentLauncherModule paymentLauncherModule) {
        return new PaymentLauncherModule_ProvideThreeDs1IntentReturnUrlMapFactory(paymentLauncherModule);
    }

    public static Map<String, String> provideThreeDs1IntentReturnUrlMap(PaymentLauncherModule paymentLauncherModule) {
        return (Map) h.e(paymentLauncherModule.provideThreeDs1IntentReturnUrlMap());
    }

    @Override // javax.inject.Provider
    public Map<String, String> get() {
        return provideThreeDs1IntentReturnUrlMap(this.module);
    }
}