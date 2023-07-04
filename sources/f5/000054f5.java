package com.stripe.android.paymentsheet;

import android.content.Intent;
import com.stripe.android.paymentsheet.PaymentOptionContract;

/* loaded from: classes6.dex */
final class PaymentOptionsActivity$starterArgs$2 extends kotlin.jvm.internal.u implements h00.a<PaymentOptionContract.Args> {
    final /* synthetic */ PaymentOptionsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionsActivity$starterArgs$2(PaymentOptionsActivity paymentOptionsActivity) {
        super(0);
        this.this$0 = paymentOptionsActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final PaymentOptionContract.Args invoke() {
        PaymentOptionContract.Args.Companion companion = PaymentOptionContract.Args.Companion;
        Intent intent = this.this$0.getIntent();
        kotlin.jvm.internal.s.f(intent, "intent");
        return companion.fromIntent$paymentsheet_release(intent);
    }
}