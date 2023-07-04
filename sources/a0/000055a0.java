package com.stripe.android.paymentsheet;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.s0;

/* loaded from: classes6.dex */
public final class PaymentSheetListFragment$special$$inlined$activityViewModels$2 extends kotlin.jvm.internal.u implements h00.a<s0.b> {
    final /* synthetic */ Fragment $this_activityViewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetListFragment$special$$inlined$activityViewModels$2(Fragment fragment) {
        super(0);
        this.$this_activityViewModels = fragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final s0.b invoke() {
        s0.b defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
        kotlin.jvm.internal.s.f(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
        return defaultViewModelProviderFactory;
    }
}