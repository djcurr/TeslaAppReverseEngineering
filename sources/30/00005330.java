package com.stripe.android.networking;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", l = {208, 207}, m = "confirmPaymentIntent$payments_core_release")
/* loaded from: classes6.dex */
public final class StripeApiRepository$confirmPaymentIntent$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository$confirmPaymentIntent$1(StripeApiRepository stripeApiRepository, zz.d<? super StripeApiRepository$confirmPaymentIntent$1> dVar) {
        super(dVar);
        this.this$0 = stripeApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.confirmPaymentIntent$payments_core_release(null, null, null, this);
    }
}