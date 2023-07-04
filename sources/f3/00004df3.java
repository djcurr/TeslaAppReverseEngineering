package com.stripe.android.financialconnections.repository;

import com.stripe.android.financialconnections.model.FinancialConnectionsAccountList;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.GetFinancialConnectionsAcccountsParams;
import zz.d;

/* loaded from: classes2.dex */
public interface FinancialConnectionsRepository {
    Object generateFinancialConnectionsSessionManifest(String str, String str2, d<? super FinancialConnectionsSessionManifest> dVar);

    Object getFinancialConnectionsAccounts(GetFinancialConnectionsAcccountsParams getFinancialConnectionsAcccountsParams, d<? super FinancialConnectionsAccountList> dVar);

    Object getFinancialConnectionsSession(String str, d<? super FinancialConnectionsSession> dVar);
}