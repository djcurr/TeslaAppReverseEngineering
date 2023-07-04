package com.stripe.android.view;

import android.content.Intent;
import com.stripe.android.view.PaymentMethodsActivityStarter;

/* loaded from: classes6.dex */
final class PaymentMethodsActivity$args$2 extends kotlin.jvm.internal.u implements h00.a<PaymentMethodsActivityStarter.Args> {
    final /* synthetic */ PaymentMethodsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsActivity$args$2(PaymentMethodsActivity paymentMethodsActivity) {
        super(0);
        this.this$0 = paymentMethodsActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final PaymentMethodsActivityStarter.Args invoke() {
        PaymentMethodsActivityStarter.Args.Companion companion = PaymentMethodsActivityStarter.Args.Companion;
        Intent intent = this.this$0.getIntent();
        kotlin.jvm.internal.s.f(intent, "intent");
        return companion.create$payments_core_release(intent);
    }
}