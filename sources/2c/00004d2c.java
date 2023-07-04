package com.stripe.android.financialconnections;

import android.content.Intent;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes2.dex */
final class FinancialConnectionsSheetActivity$starterArgs$2 extends u implements h00.a<FinancialConnectionsSheetActivityArgs> {
    final /* synthetic */ FinancialConnectionsSheetActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetActivity$starterArgs$2(FinancialConnectionsSheetActivity financialConnectionsSheetActivity) {
        super(0);
        this.this$0 = financialConnectionsSheetActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final FinancialConnectionsSheetActivityArgs invoke() {
        FinancialConnectionsSheetActivityArgs.Companion companion = FinancialConnectionsSheetActivityArgs.Companion;
        Intent intent = this.this$0.getIntent();
        s.f(intent, "intent");
        return companion.fromIntent$financial_connections_release(intent);
    }
}