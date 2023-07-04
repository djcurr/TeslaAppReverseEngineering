package com.stripe.android.payments.bankaccount.domain;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import vz.q;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.payments.bankaccount.domain.VerifyWithMicrodeposit", f = "VerifyWithMicrodeposit.kt", l = {24}, m = "forPaymentIntent-yxL6bBk")
/* loaded from: classes6.dex */
public final class VerifyWithMicrodeposit$forPaymentIntent$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ VerifyWithMicrodeposit this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyWithMicrodeposit$forPaymentIntent$1(VerifyWithMicrodeposit verifyWithMicrodeposit, zz.d<? super VerifyWithMicrodeposit$forPaymentIntent$1> dVar) {
        super(dVar);
        this.this$0 = verifyWithMicrodeposit;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m281forPaymentIntentyxL6bBk = this.this$0.m281forPaymentIntentyxL6bBk(null, null, 0, 0, this);
        d11 = a00.d.d();
        return m281forPaymentIntentyxL6bBk == d11 ? m281forPaymentIntentyxL6bBk : q.a(m281forPaymentIntentyxL6bBk);
    }
}