package com.stripe.android.view;

/* loaded from: classes6.dex */
final class PaymentMethodsActivity$cardDisplayTextFactory$2 extends kotlin.jvm.internal.u implements h00.a<CardDisplayTextFactory> {
    final /* synthetic */ PaymentMethodsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsActivity$cardDisplayTextFactory$2(PaymentMethodsActivity paymentMethodsActivity) {
        super(0);
        this.this$0 = paymentMethodsActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final CardDisplayTextFactory invoke() {
        return new CardDisplayTextFactory(this.this$0);
    }
}