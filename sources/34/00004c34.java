package com.stripe.android;

import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.StripePaymentController", f = "StripePaymentController.kt", l = {276, 282, 291, 298}, m = "startAuth")
/* loaded from: classes2.dex */
public final class StripePaymentController$startAuth$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripePaymentController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripePaymentController$startAuth$1(StripePaymentController stripePaymentController, zz.d<? super StripePaymentController$startAuth$1> dVar) {
        super(dVar);
        this.this$0 = stripePaymentController;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.startAuth(null, null, null, null, this);
    }
}