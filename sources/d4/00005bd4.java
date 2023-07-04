package com.stripe.android.view;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.s0;

/* loaded from: classes6.dex */
public final class AddPaymentMethodActivity$special$$inlined$viewModels$1 extends kotlin.jvm.internal.u implements h00.a<s0.b> {
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodActivity$special$$inlined$viewModels$1(ComponentActivity componentActivity) {
        super(0);
        this.$this_viewModels = componentActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final s0.b invoke() {
        s0.b defaultViewModelProviderFactory = this.$this_viewModels.getDefaultViewModelProviderFactory();
        kotlin.jvm.internal.s.f(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
        return defaultViewModelProviderFactory;
    }
}