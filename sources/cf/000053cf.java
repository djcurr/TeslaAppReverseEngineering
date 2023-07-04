package com.stripe.android.payments.bankaccount.ui;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.s0;
import h00.a;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
public final class CollectBankAccountActivity$special$$inlined$viewModels$1 extends u implements a<s0.b> {
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectBankAccountActivity$special$$inlined$viewModels$1(ComponentActivity componentActivity) {
        super(0);
        this.$this_viewModels = componentActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final s0.b invoke() {
        s0.b defaultViewModelProviderFactory = this.$this_viewModels.getDefaultViewModelProviderFactory();
        s.f(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
        return defaultViewModelProviderFactory;
    }
}