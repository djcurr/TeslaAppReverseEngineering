package com.stripe.android.financialconnections.repository;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsApiRepository", f = "FinancialConnectionsApiRepository.kt", l = {94}, m = "executeRequest")
/* loaded from: classes2.dex */
public final class FinancialConnectionsApiRepository$executeRequest$1<Response> extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FinancialConnectionsApiRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsApiRepository$executeRequest$1(FinancialConnectionsApiRepository financialConnectionsApiRepository, zz.d<? super FinancialConnectionsApiRepository$executeRequest$1> dVar) {
        super(dVar);
        this.this$0 = financialConnectionsApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object executeRequest;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        executeRequest = this.this$0.executeRequest(null, null, this);
        return executeRequest;
    }
}