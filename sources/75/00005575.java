package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.ui.GooglePayButton;

/* loaded from: classes6.dex */
final class PaymentSheetActivity$googlePayButton$2 extends kotlin.jvm.internal.u implements h00.a<GooglePayButton> {
    final /* synthetic */ PaymentSheetActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetActivity$googlePayButton$2(PaymentSheetActivity paymentSheetActivity) {
        super(0);
        this.this$0 = paymentSheetActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final GooglePayButton invoke() {
        return this.this$0.getViewBinding$paymentsheet_release().googlePayButton;
    }
}