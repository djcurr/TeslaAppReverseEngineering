package com.stripe.android.view;

import androidx.lifecycle.s0;
import com.stripe.android.CustomerSession;
import com.stripe.android.view.PaymentFlowActivityStarter;
import com.stripe.android.view.PaymentFlowViewModel;

/* loaded from: classes6.dex */
final class PaymentFlowActivity$viewModel$2 extends kotlin.jvm.internal.u implements h00.a<s0.b> {
    final /* synthetic */ PaymentFlowActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentFlowActivity$viewModel$2(PaymentFlowActivity paymentFlowActivity) {
        super(0);
        this.this$0 = paymentFlowActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final s0.b invoke() {
        CustomerSession customerSession;
        PaymentFlowActivityStarter.Args args;
        customerSession = this.this$0.getCustomerSession();
        args = this.this$0.getArgs();
        return new PaymentFlowViewModel.Factory(customerSession, args.getPaymentSessionData$payments_core_release());
    }
}