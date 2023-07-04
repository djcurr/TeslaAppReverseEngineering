package com.stripe.android.financialconnections.di;

import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import javax.inject.Provider;
import tw.e;
import tw.h;

/* loaded from: classes2.dex */
public final class FinancialConnectionsSheetModule_ProvidesAnalyticsRequestExecutor$financial_connections_releaseFactory implements e<AnalyticsRequestExecutor> {
    private final Provider<DefaultAnalyticsRequestExecutor> executorProvider;

    public FinancialConnectionsSheetModule_ProvidesAnalyticsRequestExecutor$financial_connections_releaseFactory(Provider<DefaultAnalyticsRequestExecutor> provider) {
        this.executorProvider = provider;
    }

    public static FinancialConnectionsSheetModule_ProvidesAnalyticsRequestExecutor$financial_connections_releaseFactory create(Provider<DefaultAnalyticsRequestExecutor> provider) {
        return new FinancialConnectionsSheetModule_ProvidesAnalyticsRequestExecutor$financial_connections_releaseFactory(provider);
    }

    public static AnalyticsRequestExecutor providesAnalyticsRequestExecutor$financial_connections_release(DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor) {
        return (AnalyticsRequestExecutor) h.e(FinancialConnectionsSheetModule.INSTANCE.providesAnalyticsRequestExecutor$financial_connections_release(defaultAnalyticsRequestExecutor));
    }

    @Override // javax.inject.Provider
    public AnalyticsRequestExecutor get() {
        return providesAnalyticsRequestExecutor$financial_connections_release(this.executorProvider.get());
    }
}