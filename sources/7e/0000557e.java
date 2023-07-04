package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.ui.PrimaryButton;

/* loaded from: classes6.dex */
final class PaymentSheetActivity$primaryButton$2 extends kotlin.jvm.internal.u implements h00.a<PrimaryButton> {
    final /* synthetic */ PaymentSheetActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetActivity$primaryButton$2(PaymentSheetActivity paymentSheetActivity) {
        super(0);
        this.this$0 = paymentSheetActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final PrimaryButton invoke() {
        PrimaryButton primaryButton = this.this$0.getViewBinding$paymentsheet_release().buyButton;
        kotlin.jvm.internal.s.f(primaryButton, "viewBinding.buyButton");
        return primaryButton;
    }
}