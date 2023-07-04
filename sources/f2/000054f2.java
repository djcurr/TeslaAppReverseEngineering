package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.ui.PrimaryButton;

/* loaded from: classes6.dex */
final class PaymentOptionsActivity$primaryButton$2 extends kotlin.jvm.internal.u implements h00.a<PrimaryButton> {
    final /* synthetic */ PaymentOptionsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionsActivity$primaryButton$2(PaymentOptionsActivity paymentOptionsActivity) {
        super(0);
        this.this$0 = paymentOptionsActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final PrimaryButton invoke() {
        PrimaryButton primaryButton = this.this$0.getViewBinding$paymentsheet_release().continueButton;
        kotlin.jvm.internal.s.f(primaryButton, "viewBinding.continueButton");
        return primaryButton;
    }
}