package com.stripe.android.payments.bankaccount.ui;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel", f = "CollectBankAccountViewModel.kt", l = {61, 67, 78, 85}, m = "createFinancialConnectionsSession")
/* loaded from: classes6.dex */
public final class CollectBankAccountViewModel$createFinancialConnectionsSession$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CollectBankAccountViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectBankAccountViewModel$createFinancialConnectionsSession$1(CollectBankAccountViewModel collectBankAccountViewModel, zz.d<? super CollectBankAccountViewModel$createFinancialConnectionsSession$1> dVar) {
        super(dVar);
        this.this$0 = collectBankAccountViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.createFinancialConnectionsSession(this);
    }
}