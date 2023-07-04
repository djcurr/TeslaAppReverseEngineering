package com.stripe.android.payments.bankaccount.ui;

import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import h00.l;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public /* synthetic */ class CollectBankAccountActivity$initConnectionsPaymentsProxy$1 extends p implements l<FinancialConnectionsSheetResult, b0> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public CollectBankAccountActivity$initConnectionsPaymentsProxy$1(Object obj) {
        super(1, obj, CollectBankAccountViewModel.class, "onConnectionsResult", "onConnectionsResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;)V", 0);
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(FinancialConnectionsSheetResult financialConnectionsSheetResult) {
        invoke2(financialConnectionsSheetResult);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(FinancialConnectionsSheetResult p02) {
        s.g(p02, "p0");
        ((CollectBankAccountViewModel) this.receiver).onConnectionsResult(p02);
    }
}