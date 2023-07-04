package com.stripe.android.financialconnections;

import androidx.lifecycle.s0;
import kotlin.jvm.internal.u;

/* loaded from: classes2.dex */
final class FinancialConnectionsSheetActivity$viewModel$2 extends u implements h00.a<s0.b> {
    final /* synthetic */ FinancialConnectionsSheetActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetActivity$viewModel$2(FinancialConnectionsSheetActivity financialConnectionsSheetActivity) {
        super(0);
        this.this$0 = financialConnectionsSheetActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final s0.b invoke() {
        return this.this$0.getViewModelFactory$financial_connections_release();
    }
}