package com.stripe.android.paymentsheet;

import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes6.dex */
final class PaymentSheetActivity$header$2 extends kotlin.jvm.internal.u implements h00.a<ComposeView> {
    final /* synthetic */ PaymentSheetActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetActivity$header$2(PaymentSheetActivity paymentSheetActivity) {
        super(0);
        this.this$0 = paymentSheetActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final ComposeView invoke() {
        ComposeView composeView = this.this$0.getViewBinding$paymentsheet_release().header;
        kotlin.jvm.internal.s.f(composeView, "viewBinding.header");
        return composeView;
    }
}