package com.stripe.android.paymentsheet.paymentdatacollection;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.o;
import androidx.lifecycle.s0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
public final class ComposeFormDataCollectionFragment$special$$inlined$viewModels$default$3 extends u implements h00.a<s0.b> {
    final /* synthetic */ h00.a $ownerProducer;
    final /* synthetic */ Fragment $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeFormDataCollectionFragment$special$$inlined$viewModels$default$3(h00.a aVar, Fragment fragment) {
        super(0);
        this.$ownerProducer = aVar;
        this.$this_viewModels = fragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final s0.b invoke() {
        Object invoke = this.$ownerProducer.invoke();
        o oVar = invoke instanceof o ? (o) invoke : null;
        s0.b defaultViewModelProviderFactory = oVar != null ? oVar.getDefaultViewModelProviderFactory() : null;
        if (defaultViewModelProviderFactory == null) {
            defaultViewModelProviderFactory = this.$this_viewModels.getDefaultViewModelProviderFactory();
        }
        s.f(defaultViewModelProviderFactory, "(ownerProducer() as? Has…tViewModelProviderFactory");
        return defaultViewModelProviderFactory;
    }
}