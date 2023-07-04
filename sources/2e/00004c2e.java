package com.stripe.android;

import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.StripePaymentController", f = "StripePaymentController.kt", l = {238}, m = "confirmPaymentIntent")
/* loaded from: classes2.dex */
public final class StripePaymentController$confirmPaymentIntent$1 extends kotlin.coroutines.jvm.internal.d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripePaymentController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripePaymentController$confirmPaymentIntent$1(StripePaymentController stripePaymentController, zz.d<? super StripePaymentController$confirmPaymentIntent$1> dVar) {
        super(dVar);
        this.this$0 = stripePaymentController;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object confirmPaymentIntent;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        confirmPaymentIntent = this.this$0.confirmPaymentIntent(null, null, this);
        return confirmPaymentIntent;
    }
}