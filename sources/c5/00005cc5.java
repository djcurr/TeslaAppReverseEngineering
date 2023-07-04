package com.stripe.android.view;

import com.stripe.android.PaymentSessionConfig;
import com.stripe.android.view.PaymentFlowActivityStarter;

/* loaded from: classes6.dex */
final class PaymentFlowActivity$paymentSessionConfig$2 extends kotlin.jvm.internal.u implements h00.a<PaymentSessionConfig> {
    final /* synthetic */ PaymentFlowActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentFlowActivity$paymentSessionConfig$2(PaymentFlowActivity paymentFlowActivity) {
        super(0);
        this.this$0 = paymentFlowActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final PaymentSessionConfig invoke() {
        PaymentFlowActivityStarter.Args args;
        args = this.this$0.getArgs();
        return args.getPaymentSessionConfig$payments_core_release();
    }
}