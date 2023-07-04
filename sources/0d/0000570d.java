package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
public final class USBankAccountFormFragment$special$$inlined$viewModels$default$2 extends u implements h00.a<t0> {
    final /* synthetic */ h00.a $ownerProducer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$special$$inlined$viewModels$default$2(h00.a aVar) {
        super(0);
        this.$ownerProducer = aVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final t0 invoke() {
        t0 viewModelStore = ((u0) this.$ownerProducer.invoke()).getViewModelStore();
        s.f(viewModelStore, "ownerProducer().viewModelStore");
        return viewModelStore;
    }
}