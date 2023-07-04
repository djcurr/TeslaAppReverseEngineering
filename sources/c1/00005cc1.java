package com.stripe.android.view;

/* loaded from: classes6.dex */
final class PaymentFlowActivity$keyboardController$2 extends kotlin.jvm.internal.u implements h00.a<KeyboardController> {
    final /* synthetic */ PaymentFlowActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentFlowActivity$keyboardController$2(PaymentFlowActivity paymentFlowActivity) {
        super(0);
        this.this$0 = paymentFlowActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final KeyboardController invoke() {
        return new KeyboardController(this.this$0);
    }
}