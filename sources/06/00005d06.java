package com.stripe.android.view;

import com.stripe.android.model.PaymentMethod;

/* loaded from: classes6.dex */
final class PaymentMethodsRecyclerView$paymentMethodSelectedCallback$1 extends kotlin.jvm.internal.u implements h00.l<PaymentMethod, vz.b0> {
    public static final PaymentMethodsRecyclerView$paymentMethodSelectedCallback$1 INSTANCE = new PaymentMethodsRecyclerView$paymentMethodSelectedCallback$1();

    PaymentMethodsRecyclerView$paymentMethodSelectedCallback$1() {
        super(1);
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ vz.b0 invoke(PaymentMethod paymentMethod) {
        invoke2(paymentMethod);
        return vz.b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PaymentMethod it2) {
        kotlin.jvm.internal.s.g(it2, "it");
    }
}