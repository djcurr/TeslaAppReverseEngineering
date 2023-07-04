package com.stripe.android.paymentsheet;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;

/* loaded from: classes6.dex */
public final class PaymentOptionsListFragment$special$$inlined$activityViewModels$1 extends kotlin.jvm.internal.u implements h00.a<t0> {
    final /* synthetic */ Fragment $this_activityViewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionsListFragment$special$$inlined$activityViewModels$1(Fragment fragment) {
        super(0);
        this.$this_activityViewModels = fragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final t0 invoke() {
        t0 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
        kotlin.jvm.internal.s.f(viewModelStore, "requireActivity().viewModelStore");
        return viewModelStore;
    }
}