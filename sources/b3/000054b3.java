package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.PaymentOptionsAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public /* synthetic */ class BasePaymentMethodsListFragment$setupRecyclerView$2 extends kotlin.jvm.internal.p implements h00.l<PaymentOptionsAdapter.Item.SavedPaymentMethod, vz.b0> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public BasePaymentMethodsListFragment$setupRecyclerView$2(Object obj) {
        super(1, obj, BasePaymentMethodsListFragment.class, "deletePaymentMethod", "deletePaymentMethod(Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$Item$SavedPaymentMethod;)V", 0);
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ vz.b0 invoke(PaymentOptionsAdapter.Item.SavedPaymentMethod savedPaymentMethod) {
        invoke2(savedPaymentMethod);
        return vz.b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PaymentOptionsAdapter.Item.SavedPaymentMethod p02) {
        kotlin.jvm.internal.s.g(p02, "p0");
        ((BasePaymentMethodsListFragment) this.receiver).deletePaymentMethod(p02);
    }
}