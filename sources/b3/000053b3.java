package com.stripe.android.payments.bankaccount.domain;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import vz.q;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.payments.bankaccount.domain.RetrieveStripeIntent", f = "RetrieveStripeIntent.kt", l = {19}, m = "invoke-0E7RQCE")
/* loaded from: classes6.dex */
public final class RetrieveStripeIntent$invoke$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RetrieveStripeIntent this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrieveStripeIntent$invoke$1(RetrieveStripeIntent retrieveStripeIntent, zz.d<? super RetrieveStripeIntent$invoke$1> dVar) {
        super(dVar);
        this.this$0 = retrieveStripeIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m279invoke0E7RQCE = this.this$0.m279invoke0E7RQCE(null, null, this);
        d11 = a00.d.d();
        return m279invoke0E7RQCE == d11 ? m279invoke0E7RQCE : q.a(m279invoke0E7RQCE);
    }
}