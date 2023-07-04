package com.stripe.android.financialconnections.analytics;

import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;

/* loaded from: classes2.dex */
public interface FinancialConnectionsEventReporter {
    void onPresented(FinancialConnectionsSheet.Configuration configuration);

    void onResult(FinancialConnectionsSheet.Configuration configuration, FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult);
}