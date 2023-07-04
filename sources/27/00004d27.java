package com.stripe.android.financialconnections;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.t0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes2.dex */
public final class FinancialConnectionsSheetActivity$special$$inlined$viewModels$2 extends u implements h00.a<t0> {
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetActivity$special$$inlined$viewModels$2(ComponentActivity componentActivity) {
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