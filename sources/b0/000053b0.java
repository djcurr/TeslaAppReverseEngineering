package com.stripe.android.payments.bankaccount.domain;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import vz.q;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.payments.bankaccount.domain.CreateFinancialConnectionsSession", f = "CreateFinancialConnectionsSession.kt", l = {44}, m = "forSetupIntent-yxL6bBk")
/* loaded from: classes6.dex */
public final class CreateFinancialConnectionsSession$forSetupIntent$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CreateFinancialConnectionsSession this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateFinancialConnectionsSession$forSetupIntent$1(CreateFinancialConnectionsSession createFinancialConnectionsSession, zz.d<? super CreateFinancialConnectionsSession$forSetupIntent$1> dVar) {
        super(dVar);
        this.this$0 = createFinancialConnectionsSession;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m278forSetupIntentyxL6bBk = this.this$0.m278forSetupIntentyxL6bBk(null, null, null, null, this);
        d11 = a00.d.d();
        return m278forSetupIntentyxL6bBk == d11 ? m278forSetupIntentyxL6bBk : q.a(m278forSetupIntentyxL6bBk);
    }
}