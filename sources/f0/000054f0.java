package com.stripe.android.paymentsheet;

import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes6.dex */
final class PaymentOptionsActivity$notesView$2 extends kotlin.jvm.internal.u implements h00.a<ComposeView> {
    final /* synthetic */ PaymentOptionsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionsActivity$notesView$2(PaymentOptionsActivity paymentOptionsActivity) {
        super(0);
        this.this$0 = paymentOptionsActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final ComposeView invoke() {
        ComposeView composeView = this.this$0.getViewBinding$paymentsheet_release().notes;
        kotlin.jvm.internal.s.f(composeView, "viewBinding.notes");
        return composeView;
    }
}