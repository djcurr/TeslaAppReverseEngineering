package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;

/* loaded from: classes6.dex */
/* synthetic */ class BasePaymentMethodsListFragment$setupRecyclerView$4 extends kotlin.jvm.internal.p implements h00.a<vz.b0> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public BasePaymentMethodsListFragment$setupRecyclerView$4(Object obj) {
        super(0, obj, BaseSheetViewModel.class, "launchLink", "launchLink()V", 0);
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ vz.b0 invoke() {
        invoke2();
        return vz.b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((BaseSheetViewModel) this.receiver).launchLink();
    }
}