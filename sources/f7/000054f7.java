package com.stripe.android.paymentsheet;

import com.google.android.material.appbar.MaterialToolbar;

/* loaded from: classes6.dex */
final class PaymentOptionsActivity$toolbar$2 extends kotlin.jvm.internal.u implements h00.a<MaterialToolbar> {
    final /* synthetic */ PaymentOptionsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionsActivity$toolbar$2(PaymentOptionsActivity paymentOptionsActivity) {
        super(0);
        this.this$0 = paymentOptionsActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final MaterialToolbar invoke() {
        MaterialToolbar materialToolbar = this.this$0.getViewBinding$paymentsheet_release().toolbar;
        kotlin.jvm.internal.s.f(materialToolbar, "viewBinding.toolbar");
        return materialToolbar;
    }
}