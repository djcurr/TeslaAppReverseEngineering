package com.stripe.android.paymentsheet;

import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes6.dex */
final class PaymentSheetActivity$appbar$2 extends kotlin.jvm.internal.u implements h00.a<AppBarLayout> {
    final /* synthetic */ PaymentSheetActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetActivity$appbar$2(PaymentSheetActivity paymentSheetActivity) {
        super(0);
        this.this$0 = paymentSheetActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final AppBarLayout invoke() {
        AppBarLayout appBarLayout = this.this$0.getViewBinding$paymentsheet_release().appbar;
        kotlin.jvm.internal.s.f(appBarLayout, "viewBinding.appbar");
        return appBarLayout;
    }
}