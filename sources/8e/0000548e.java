package com.stripe.android.payments.paymentlauncher;

import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel;
import kotlin.jvm.internal.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PaymentLauncherViewModel$Factory$fallbackInitialize$2 extends u implements h00.a<String> {
    final /* synthetic */ PaymentLauncherViewModel.Factory.FallbackInitializeParam $arg;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentLauncherViewModel$Factory$fallbackInitialize$2(PaymentLauncherViewModel.Factory.FallbackInitializeParam fallbackInitializeParam) {
        super(0);
        this.$arg = fallbackInitializeParam;
    }

    @Override // h00.a
    public final String invoke() {
        return this.$arg.getStripeAccountId();
    }
}