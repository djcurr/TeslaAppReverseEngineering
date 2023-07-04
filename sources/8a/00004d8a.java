package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
import javax.inject.Provider;
import tw.e;

/* loaded from: classes2.dex */
public final class GenerateFinancialConnectionsSessionManifest_Factory implements e<GenerateFinancialConnectionsSessionManifest> {
    private final Provider<FinancialConnectionsRepository> financialConnectionsRepositoryProvider;

    public GenerateFinancialConnectionsSessionManifest_Factory(Provider<FinancialConnectionsRepository> provider) {
        this.financialConnectionsRepositoryProvider = provider;
    }

    public static GenerateFinancialConnectionsSessionManifest_Factory create(Provider<FinancialConnectionsRepository> provider) {
        return new GenerateFinancialConnectionsSessionManifest_Factory(provider);
    }

    public static GenerateFinancialConnectionsSessionManifest newInstance(FinancialConnectionsRepository financialConnectionsRepository) {
        return new GenerateFinancialConnectionsSessionManifest(financialConnectionsRepository);
    }

    @Override // javax.inject.Provider
    public GenerateFinancialConnectionsSessionManifest get() {
        return newInstance(this.financialConnectionsRepositoryProvider.get());
    }
}