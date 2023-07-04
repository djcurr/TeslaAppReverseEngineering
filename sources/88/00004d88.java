package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
import javax.inject.Provider;
import tw.e;

/* loaded from: classes2.dex */
public final class FetchFinancialConnectionsSession_Factory implements e<FetchFinancialConnectionsSession> {
    private final Provider<FinancialConnectionsRepository> financialConnectionsRepositoryProvider;

    public FetchFinancialConnectionsSession_Factory(Provider<FinancialConnectionsRepository> provider) {
        this.financialConnectionsRepositoryProvider = provider;
    }

    public static FetchFinancialConnectionsSession_Factory create(Provider<FinancialConnectionsRepository> provider) {
        return new FetchFinancialConnectionsSession_Factory(provider);
    }

    public static FetchFinancialConnectionsSession newInstance(FinancialConnectionsRepository financialConnectionsRepository) {
        return new FetchFinancialConnectionsSession(financialConnectionsRepository);
    }

    @Override // javax.inject.Provider
    public FetchFinancialConnectionsSession get() {
        return newInstance(this.financialConnectionsRepositoryProvider.get());
    }
}