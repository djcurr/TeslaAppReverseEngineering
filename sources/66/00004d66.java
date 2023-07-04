package com.stripe.android.financialconnections.analytics;

import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import javax.inject.Provider;
import tw.e;
import zz.g;

/* loaded from: classes2.dex */
public final class DefaultFinancialConnectionsEventReporter_Factory implements e<DefaultFinancialConnectionsEventReporter> {
    private final Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;
    private final Provider<AnalyticsRequestFactory> analyticsRequestFactoryProvider;
    private final Provider<g> workContextProvider;

    public DefaultFinancialConnectionsEventReporter_Factory(Provider<AnalyticsRequestExecutor> provider, Provider<AnalyticsRequestFactory> provider2, Provider<g> provider3) {
        this.analyticsRequestExecutorProvider = provider;
        this.analyticsRequestFactoryProvider = provider2;
        this.workContextProvider = provider3;
    }

    public static DefaultFinancialConnectionsEventReporter_Factory create(Provider<AnalyticsRequestExecutor> provider, Provider<AnalyticsRequestFactory> provider2, Provider<g> provider3) {
        return new DefaultFinancialConnectionsEventReporter_Factory(provider, provider2, provider3);
    }

    public static DefaultFinancialConnectionsEventReporter newInstance(AnalyticsRequestExecutor analyticsRequestExecutor, AnalyticsRequestFactory analyticsRequestFactory, g gVar) {
        return new DefaultFinancialConnectionsEventReporter(analyticsRequestExecutor, analyticsRequestFactory, gVar);
    }

    @Override // javax.inject.Provider
    public DefaultFinancialConnectionsEventReporter get() {
        return newInstance(this.analyticsRequestExecutorProvider.get(), this.analyticsRequestFactoryProvider.get(), this.workContextProvider.get());
    }
}