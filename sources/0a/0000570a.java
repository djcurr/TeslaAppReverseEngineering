package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
public final class USBankAccountFormFragment$sheetViewModel$2$invoke$$inlined$activityViewModels$3 extends u implements h00.a<t0> {
    final /* synthetic */ Fragment $this_activityViewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$sheetViewModel$2$invoke$$inlined$activityViewModels$3(Fragment fragment) {
        super(0);
        this.$this_activityViewModels = fragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final t0 invoke() {
        t0 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
        s.f(viewModelStore, "requireActivity().viewModelStore");
        return viewModelStore;
    }
}