package com.stripe.android.view;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.view.AddPaymentMethodActivityStarter;

/* loaded from: classes6.dex */
final class AddPaymentMethodActivity$paymentMethodType$2 extends kotlin.jvm.internal.u implements h00.a<PaymentMethod.Type> {
    final /* synthetic */ AddPaymentMethodActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodActivity$paymentMethodType$2(AddPaymentMethodActivity addPaymentMethodActivity) {
        super(0);
        this.this$0 = addPaymentMethodActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final PaymentMethod.Type invoke() {
        AddPaymentMethodActivityStarter.Args args;
        args = this.this$0.getArgs();
        return args.getPaymentMethodType$payments_core_release();
    }
}