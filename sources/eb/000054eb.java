package com.stripe.android.paymentsheet;

import android.view.View;

/* loaded from: classes6.dex */
final class PaymentOptionsActivity$bottomSpacer$2 extends kotlin.jvm.internal.u implements h00.a<View> {
    final /* synthetic */ PaymentOptionsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionsActivity$bottomSpacer$2(PaymentOptionsActivity paymentOptionsActivity) {
        super(0);
        this.this$0 = paymentOptionsActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final View invoke() {
        View view = this.this$0.getViewBinding$paymentsheet_release().bottomSpacer;
        kotlin.jvm.internal.s.f(view, "viewBinding.bottomSpacer");
        return view;
    }
}