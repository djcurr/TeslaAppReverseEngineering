package com.stripe.android.payments.bankaccount.ui;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.t0;
import h00.a;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
public final class CollectBankAccountActivity$special$$inlined$viewModels$2 extends u implements a<t0> {
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectBankAccountActivity$special$$inlined$viewModels$2(ComponentActivity componentActivity) {
        super(0);
        this.$this_viewModels = componentActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final t0 invoke() {
        t0 viewModelStore = this.$this_viewModels.getViewModelStore();
        s.f(viewModelStore, "viewModelStore");
        return viewModelStore;
    }
}