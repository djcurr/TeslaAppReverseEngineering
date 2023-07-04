package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class FetchFinancialConnectionsSessionForToken {
    private final FinancialConnectionsRepository connectionsRepository;

    public FetchFinancialConnectionsSessionForToken(FinancialConnectionsRepository connectionsRepository) {
        s.g(connectionsRepository, "connectionsRepository");
        this.connectionsRepository = connectionsRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.String r5, zz.d<? super vz.p<com.stripe.android.financialconnections.model.FinancialConnectionsSession, com.stripe.android.model.Token>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSessionForToken$invoke$1
            if (r0 == 0) goto L13
            r0 = r6
            com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSessionForToken$invoke$1 r0 = (com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSessionForToken$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSessionForToken$invoke$1 r0 = new com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSessionForToken$invoke$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            vz.r.b(r6)
            com.stripe.android.financialconnections.repository.FinancialConnectionsRepository r6 = r4.connectionsRepository
            r0.label = r3
            java.lang.Object r6 = r6.getFinancialConnectionsSession(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            com.stripe.android.financialconnections.model.FinancialConnectionsSession r6 = (com.stripe.android.financialconnections.model.FinancialConnectionsSession) r6
            java.lang.String r5 = r6.getBankAccountToken$financial_connections_release()
            if (r5 != 0) goto L49
            r5 = 0
            goto L57
        L49:
            com.stripe.android.model.parsers.TokenJsonParser r0 = new com.stripe.android.model.parsers.TokenJsonParser
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r5)
            com.stripe.android.model.Token r5 = r0.parse(r1)
        L57:
            if (r5 == 0) goto L5e
            vz.p r5 = vz.v.a(r6, r5)
            return r5
        L5e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Could not extract Token from FinancialConnectionsSession."
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSessionForToken.invoke(java.lang.String, zz.d):java.lang.Object");
    }
}