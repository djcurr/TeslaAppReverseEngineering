package com.stripe.android.payments.paymentlauncher;

import androidx.lifecycle.s0;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class PaymentLauncherConfirmationActivity$viewModel$2 extends u implements h00.a<s0.b> {
    final /* synthetic */ PaymentLauncherConfirmationActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentLauncherConfirmationActivity$viewModel$2(PaymentLauncherConfirmationActivity paymentLauncherConfirmationActivity) {
        super(0);
        this.this$0 = paymentLauncherConfirmationActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final s0.b invoke() {
        return this.this$0.getViewModelFactory$payments_core_release();
    }
}