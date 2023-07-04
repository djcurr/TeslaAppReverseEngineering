package com.stripe.android.payments.financialconnections;

import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class DefaultFinancialConnectionsPaymentsProxy implements FinancialConnectionsPaymentsProxy {
    private final FinancialConnectionsSheet financialConnectionsSheet;

    public DefaultFinancialConnectionsPaymentsProxy(FinancialConnectionsSheet financialConnectionsSheet) {
        s.g(financialConnectionsSheet, "financialConnectionsSheet");
        this.financialConnectionsSheet = financialConnectionsSheet;
    }

    @Override // com.stripe.android.payments.financialconnections.FinancialConnectionsPaymentsProxy
    public void present(String financialConnectionsSessionClientSecret, String publishableKey) {
        s.g(financialConnectionsSessionClientSecret, "financialConnectionsSessionClientSecret");
        s.g(publishableKey, "publishableKey");
        this.financialConnectionsSheet.present(new FinancialConnectionsSheet.Configuration(financialConnectionsSessionClientSecret, publishableKey));
    }
}