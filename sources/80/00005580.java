package com.stripe.android.paymentsheet;

import android.widget.ScrollView;

/* loaded from: classes6.dex */
final class PaymentSheetActivity$scrollView$2 extends kotlin.jvm.internal.u implements h00.a<ScrollView> {
    final /* synthetic */ PaymentSheetActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetActivity$scrollView$2(PaymentSheetActivity paymentSheetActivity) {
        super(0);
        this.this$0 = paymentSheetActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final ScrollView invoke() {
        ScrollView scrollView = this.this$0.getViewBinding$paymentsheet_release().scrollView;
        kotlin.jvm.internal.s.f(scrollView, "viewBinding.scrollView");
        return scrollView;
    }
}