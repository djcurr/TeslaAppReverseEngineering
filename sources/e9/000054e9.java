package com.stripe.android.paymentsheet;

import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes6.dex */
final class PaymentOptionsActivity$appbar$2 extends kotlin.jvm.internal.u implements h00.a<AppBarLayout> {
    final /* synthetic */ PaymentOptionsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionsActivity$appbar$2(PaymentOptionsActivity paymentOptionsActivity) {
        super(0);
        this.this$0 = paymentOptionsActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final AppBarLayout invoke() {
        AppBarLayout appBarLayout = this.this$0.getViewBinding$paymentsheet_release().appbar;
        kotlin.jvm.internal.s.f(appBarLayout, "viewBinding.appbar");
        return appBarLayout;
    }
}