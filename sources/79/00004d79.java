package com.stripe.android.financialconnections.di;

import com.stripe.android.financialconnections.repository.FinancialConnectionsApiRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
import javax.inject.Provider;
import tw.e;
import tw.h;

/* loaded from: classes2.dex */
public final class FinancialConnectionsSheetModule_ProvideConnectionsRepositoryFactory implements e<FinancialConnectionsRepository> {
    private final Provider<FinancialConnectionsApiRepository> repositoryProvider;

    public FinancialConnectionsSheetModule_ProvideConnectionsRepositoryFactory(Provider<FinancialConnectionsApiRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static FinancialConnectionsSheetModule_ProvideConnectionsRepositoryFactory create(Provider<FinancialConnectionsApiRepository> provider) {
        return new FinancialConnectionsSheetModule_ProvideConnectionsRepositoryFactory(provider);
    }

    public static FinancialConnectionsRepository provideConnectionsRepository(FinancialConnectionsApiRepository financialConnectionsApiRepository) {
        return (FinancialConnectionsRepository) h.e(FinancialConnectionsSheetModule.INSTANCE.provideConnectionsRepository(financialConnectionsApiRepository));
    }

    @Override // javax.inject.Provider
    public FinancialConnectionsRepository get() {
        return provideConnectionsRepository(this.repositoryProvider.get());
    }
}