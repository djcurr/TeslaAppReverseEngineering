package com.stripe.android.payments.bankaccount.domain;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import vz.q;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.payments.bankaccount.domain.VerifyWithMicrodeposit", f = "VerifyWithMicrodeposit.kt", l = {62}, m = "forSetupIntent-yxL6bBk")
/* loaded from: classes6.dex */
public final class VerifyWithMicrodeposit$forSetupIntent$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ VerifyWithMicrodeposit this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyWithMicrodeposit$forSetupIntent$1(VerifyWithMicrodeposit verifyWithMicrodeposit, zz.d<? super VerifyWithMicrodeposit$forSetupIntent$1> dVar) {
        super(dVar);
        this.this$0 = verifyWithMicrodeposit;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m283forSetupIntentyxL6bBk = this.this$0.m283forSetupIntentyxL6bBk(null, null, 0, 0, this);
        d11 = a00.d.d();
        return m283forSetupIntentyxL6bBk == d11 ? m283forSetupIntentyxL6bBk : q.a(m283forSetupIntentyxL6bBk);
    }
}