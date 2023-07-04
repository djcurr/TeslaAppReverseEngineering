package com.stripe.android.view;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.view.AddPaymentMethodActivityStarter;

/* loaded from: classes6.dex */
final class AddPaymentMethodActivity$shouldAttachToCustomer$2 extends kotlin.jvm.internal.u implements h00.a<Boolean> {
    final /* synthetic */ AddPaymentMethodActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodActivity$shouldAttachToCustomer$2(AddPaymentMethodActivity addPaymentMethodActivity) {
        super(0);
        this.this$0 = addPaymentMethodActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final Boolean invoke() {
        PaymentMethod.Type paymentMethodType;
        boolean z11;
        AddPaymentMethodActivityStarter.Args args;
        paymentMethodType = this.this$0.getPaymentMethodType();
        if (paymentMethodType.isReusable) {
            args = this.this$0.getArgs();
            if (args.getShouldAttachToCustomer$payments_core_release()) {
                z11 = true;
                return Boolean.valueOf(z11);
            }
        }
        z11 = false;
        return Boolean.valueOf(z11);
    }
}