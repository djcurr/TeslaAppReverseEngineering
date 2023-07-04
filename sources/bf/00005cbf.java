package com.stripe.android.view;

import android.content.Intent;
import com.stripe.android.view.PaymentFlowActivityStarter;

/* loaded from: classes6.dex */
final class PaymentFlowActivity$args$2 extends kotlin.jvm.internal.u implements h00.a<PaymentFlowActivityStarter.Args> {
    final /* synthetic */ PaymentFlowActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentFlowActivity$args$2(PaymentFlowActivity paymentFlowActivity) {
        super(0);
        this.this$0 = paymentFlowActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final PaymentFlowActivityStarter.Args invoke() {
        PaymentFlowActivityStarter.Args.Companion companion = PaymentFlowActivityStarter.Args.Companion;
        Intent intent = this.this$0.getIntent();
        kotlin.jvm.internal.s.f(intent, "intent");
        return companion.create(intent);
    }
}