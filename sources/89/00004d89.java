package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
import kotlin.jvm.internal.s;
import zz.d;

/* loaded from: classes2.dex */
public final class GenerateFinancialConnectionsSessionManifest {
    private final FinancialConnectionsRepository financialConnectionsRepository;

    public GenerateFinancialConnectionsSessionManifest(FinancialConnectionsRepository financialConnectionsRepository) {
        s.g(financialConnectionsRepository, "financialConnectionsRepository");
        this.financialConnectionsRepository = financialConnectionsRepository;
    }

    public final Object invoke(String str, String str2, d<? super FinancialConnectionsSessionManifest> dVar) {
        return this.financialConnectionsRepository.generateFinancialConnectionsSessionManifest(str, str2, dVar);
    }
}