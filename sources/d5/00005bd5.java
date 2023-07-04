package com.stripe.android.view;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.t0;

/* loaded from: classes6.dex */
public final class AddPaymentMethodActivity$special$$inlined$viewModels$2 extends kotlin.jvm.internal.u implements h00.a<t0> {
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodActivity$special$$inlined$viewModels$2(ComponentActivity componentActivity) {
        super(0);
        this.$this_viewModels = componentActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final t0 invoke() {
        t0 viewModelStore = this.$this_viewModels.getViewModelStore();
        kotlin.jvm.internal.s.f(viewModelStore, "viewModelStore");
        return viewModelStore;
    }
}