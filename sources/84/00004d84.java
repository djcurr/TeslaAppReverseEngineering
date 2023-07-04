package com.stripe.android.financialconnections.domain;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSession", f = "FetchFinancialConnectionsSession.kt", l = {23, 28, 34}, m = "invoke")
/* loaded from: classes2.dex */
public final class FetchFinancialConnectionsSession$invoke$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FetchFinancialConnectionsSession this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchFinancialConnectionsSession$invoke$1(FetchFinancialConnectionsSession fetchFinancialConnectionsSession, zz.d<? super FetchFinancialConnectionsSession$invoke$1> dVar) {
        super(dVar);
        this.this$0 = fetchFinancialConnectionsSession;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, this);
    }
}