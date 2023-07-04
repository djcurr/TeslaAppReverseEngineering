package com.stripe.android.payments.core.authentication.threeds2;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel", f = "Stripe3ds2TransactionViewModel.kt", l = {71}, m = "start3ds2Flow")
/* loaded from: classes6.dex */
public final class Stripe3ds2TransactionViewModel$start3ds2Flow$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Stripe3ds2TransactionViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Stripe3ds2TransactionViewModel$start3ds2Flow$1(Stripe3ds2TransactionViewModel stripe3ds2TransactionViewModel, zz.d<? super Stripe3ds2TransactionViewModel$start3ds2Flow$1> dVar) {
        super(dVar);
        this.this$0 = stripe3ds2TransactionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.start3ds2Flow(this);
    }
}