package com.stripe.android.payments.core.authentication.threeds2;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel", f = "Stripe3ds2TransactionViewModel.kt", l = {107, 115}, m = "begin3ds2Auth")
/* loaded from: classes6.dex */
public final class Stripe3ds2TransactionViewModel$begin3ds2Auth$1 extends d {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Stripe3ds2TransactionViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Stripe3ds2TransactionViewModel$begin3ds2Auth$1(Stripe3ds2TransactionViewModel stripe3ds2TransactionViewModel, zz.d<? super Stripe3ds2TransactionViewModel$begin3ds2Auth$1> dVar) {
        super(dVar);
        this.this$0 = stripe3ds2TransactionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object begin3ds2Auth;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        begin3ds2Auth = this.this$0.begin3ds2Auth(null, this);
        return begin3ds2Auth;
    }
}