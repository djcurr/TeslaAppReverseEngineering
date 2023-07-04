package com.stripe.android.paymentsheet;

import android.view.View;

/* loaded from: classes6.dex */
final class PaymentSheetActivity$bottomSpacer$2 extends kotlin.jvm.internal.u implements h00.a<View> {
    final /* synthetic */ PaymentSheetActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetActivity$bottomSpacer$2(PaymentSheetActivity paymentSheetActivity) {
        super(0);
        this.this$0 = paymentSheetActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final View invoke() {
        View view = this.this$0.getViewBinding$paymentsheet_release().bottomSpacer;
        kotlin.jvm.internal.s.f(view, "viewBinding.bottomSpacer");
        return view;
    }
}