package com.stripe.android.networking;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", l = {1866}, m = "maybeForDashboard")
/* loaded from: classes6.dex */
public final class StripeApiRepository$maybeForDashboard$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository$maybeForDashboard$1(StripeApiRepository stripeApiRepository, zz.d<? super StripeApiRepository$maybeForDashboard$1> dVar) {
        super(dVar);
        this.this$0 = stripeApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object maybeForDashboard;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        maybeForDashboard = this.this$0.maybeForDashboard(null, null, this);
        return maybeForDashboard;
    }
}