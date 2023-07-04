package com.stripe.android.view;

import com.stripe.android.model.PaymentMethod;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PaymentMethodsActivity$setupRecyclerView$2 extends kotlin.jvm.internal.u implements h00.l<PaymentMethod, vz.b0> {
    final /* synthetic */ PaymentMethodsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsActivity$setupRecyclerView$2(PaymentMethodsActivity paymentMethodsActivity) {
        super(1);
        this.this$0 = paymentMethodsActivity;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ vz.b0 invoke(PaymentMethod paymentMethod) {
        invoke2(paymentMethod);
        return vz.b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PaymentMethod it2) {
        kotlin.jvm.internal.s.g(it2, "it");
        PaymentMethodsActivity.finishWithResult$default(this.this$0, it2, 0, 2, null);
    }
}