package com.stripe.android.payments.financialconnections;

import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResultCallback;
import h00.l;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.s;
import vz.g;

/* loaded from: classes6.dex */
final class FinancialConnectionsPaymentsProxy$sam$com_stripe_android_financialconnections_FinancialConnectionsSheetResultCallback$0 implements FinancialConnectionsSheetResultCallback, m {
    private final /* synthetic */ l function;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FinancialConnectionsPaymentsProxy$sam$com_stripe_android_financialconnections_FinancialConnectionsSheetResultCallback$0(l lVar) {
        this.function = lVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof FinancialConnectionsSheetResultCallback) && (obj instanceof m)) {
            return s.c(getFunctionDelegate(), ((m) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.m
    public final g<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.stripe.android.financialconnections.FinancialConnectionsSheetResultCallback
    public final /* synthetic */ void onFinancialConnectionsSheetResult(FinancialConnectionsSheetResult financialConnectionsSheetResult) {
        this.function.invoke(financialConnectionsSheetResult);
    }
}