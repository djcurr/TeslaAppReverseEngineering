package com.stripe.android.paymentsheet;

import com.stripe.android.link.ui.LinkButtonView;

/* loaded from: classes6.dex */
final class PaymentSheetActivity$linkButton$2 extends kotlin.jvm.internal.u implements h00.a<LinkButtonView> {
    final /* synthetic */ PaymentSheetActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetActivity$linkButton$2(PaymentSheetActivity paymentSheetActivity) {
        super(0);
        this.this$0 = paymentSheetActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final LinkButtonView invoke() {
        return this.this$0.getViewBinding$paymentsheet_release().linkButton;
    }
}