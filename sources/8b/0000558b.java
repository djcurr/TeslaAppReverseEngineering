package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.PaymentSheetContract;

/* loaded from: classes6.dex */
final class PaymentSheetActivity$viewModelFactory$2 extends kotlin.jvm.internal.u implements h00.a<PaymentSheetContract.Args> {
    final /* synthetic */ PaymentSheetActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetActivity$viewModelFactory$2(PaymentSheetActivity paymentSheetActivity) {
        super(0);
        this.this$0 = paymentSheetActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final PaymentSheetContract.Args invoke() {
        PaymentSheetContract.Args starterArgs;
        starterArgs = this.this$0.getStarterArgs();
        if (starterArgs != null) {
            return starterArgs;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}