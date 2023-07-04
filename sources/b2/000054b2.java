package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.model.PaymentSelection;

/* loaded from: classes6.dex */
/* synthetic */ class BasePaymentMethodsListFragment$setupRecyclerView$1 extends kotlin.jvm.internal.p implements h00.p<PaymentSelection, Boolean, vz.b0> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public BasePaymentMethodsListFragment$setupRecyclerView$1(Object obj) {
        super(2, obj, BasePaymentMethodsListFragment.class, "onPaymentOptionSelected", "onPaymentOptionSelected(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Z)V", 0);
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ vz.b0 invoke(PaymentSelection paymentSelection, Boolean bool) {
        invoke(paymentSelection, bool.booleanValue());
        return vz.b0.f54756a;
    }

    public final void invoke(PaymentSelection p02, boolean z11) {
        kotlin.jvm.internal.s.g(p02, "p0");
        ((BasePaymentMethodsListFragment) this.receiver).onPaymentOptionSelected(p02, z11);
    }
}