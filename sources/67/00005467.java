package com.stripe.android.payments.financialconnections;

import com.stripe.android.financialconnections.FinancialConnectionsSheet;

/* loaded from: classes6.dex */
public final class DefaultIsFinancialConnectionsAvailable implements IsFinancialConnectionsAvailable {
    @Override // com.stripe.android.payments.financialconnections.IsFinancialConnectionsAvailable
    public boolean invoke() {
        try {
            FinancialConnectionsSheet.Companion companion = FinancialConnectionsSheet.Companion;
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}