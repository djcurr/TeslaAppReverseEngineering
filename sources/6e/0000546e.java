package com.stripe.android.payments.financialconnections;

import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class UnsupportedFinancialConnectionsPaymentsProxy implements FinancialConnectionsPaymentsProxy {
    @Override // com.stripe.android.payments.financialconnections.FinancialConnectionsPaymentsProxy
    public void present(String financialConnectionsSessionClientSecret, String publishableKey) {
        s.g(financialConnectionsSessionClientSecret, "financialConnectionsSessionClientSecret");
        s.g(publishableKey, "publishableKey");
    }
}