package com.stripe.android.payments;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.payments.PaymentIntentFlowResultProcessor", f = "PaymentFlowResultProcessor.kt", l = {196, 206, 208}, m = "refreshStripeIntentUntilTerminalState")
/* loaded from: classes6.dex */
public final class PaymentIntentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1 extends d {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PaymentIntentFlowResultProcessor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentIntentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1(PaymentIntentFlowResultProcessor paymentIntentFlowResultProcessor, zz.d<? super PaymentIntentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1> dVar) {
        super(dVar);
        this.this$0 = paymentIntentFlowResultProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.refreshStripeIntentUntilTerminalState(null, null, this);
    }
}