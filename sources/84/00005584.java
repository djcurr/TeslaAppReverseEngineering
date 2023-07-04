package com.stripe.android.paymentsheet;

import android.widget.TextView;

/* loaded from: classes6.dex */
final class PaymentSheetActivity$testModeIndicator$2 extends kotlin.jvm.internal.u implements h00.a<TextView> {
    final /* synthetic */ PaymentSheetActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetActivity$testModeIndicator$2(PaymentSheetActivity paymentSheetActivity) {
        super(0);
        this.this$0 = paymentSheetActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final TextView invoke() {
        TextView textView = this.this$0.getViewBinding$paymentsheet_release().testmode;
        kotlin.jvm.internal.s.f(textView, "viewBinding.testmode");
        return textView;
    }
}