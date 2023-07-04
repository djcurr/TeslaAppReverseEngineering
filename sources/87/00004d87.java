package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
import javax.inject.Provider;
import tw.e;

/* loaded from: classes2.dex */
public final class FetchFinancialConnectionsSessionForToken_Factory implements e<FetchFinancialConnectionsSessionForToken> {
    private final Provider<FinancialConnectionsRepository> connectionsRepositoryProvider;

    public FetchFinancialConnectionsSessionForToken_Factory(Provider<FinancialConnectionsRepository> provider) {
        this.connectionsRepositoryProvider = provider;
    }

    public static FetchFinancialConnectionsSessionForToken_Factory create(Provider<FinancialConnectionsRepository> provider) {
        return new FetchFinancialConnectionsSessionForToken_Factory(provider);
    }

    public static FetchFinancialConnectionsSessionForToken newInstance(FinancialConnectionsRepository financialConnectionsRepository) {
        return new FetchFinancialConnectionsSessionForToken(financialConnectionsRepository);
    }

    @Override // javax.inject.Provider
    public FetchFinancialConnectionsSessionForToken get() {
        return newInstance(this.connectionsRepositoryProvider.get());
    }
}