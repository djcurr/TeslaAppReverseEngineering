package com.stripe.android.view;

import com.stripe.android.view.PaymentMethodsActivityStarter;

/* loaded from: classes6.dex */
final class PaymentMethodsActivity$startedFromPaymentSession$2 extends kotlin.jvm.internal.u implements h00.a<Boolean> {
    final /* synthetic */ PaymentMethodsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsActivity$startedFromPaymentSession$2(PaymentMethodsActivity paymentMethodsActivity) {
        super(0);
        this.this$0 = paymentMethodsActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final Boolean invoke() {
        PaymentMethodsActivityStarter.Args args;
        args = this.this$0.getArgs();
        return Boolean.valueOf(args.isPaymentSessionActive$payments_core_release());
    }
}