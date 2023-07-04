package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.PaymentOptionContract;

/* loaded from: classes6.dex */
final class PaymentOptionsActivity$viewModelFactory$2 extends kotlin.jvm.internal.u implements h00.a<PaymentOptionContract.Args> {
    final /* synthetic */ PaymentOptionsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionsActivity$viewModelFactory$2(PaymentOptionsActivity paymentOptionsActivity) {
        super(0);
        this.this$0 = paymentOptionsActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final PaymentOptionContract.Args invoke() {
        PaymentOptionContract.Args starterArgs;
        starterArgs = this.this$0.getStarterArgs();
        if (starterArgs != null) {
            return starterArgs;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}