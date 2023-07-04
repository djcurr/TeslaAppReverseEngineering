package com.stripe.android.financialconnections.di;

import android.app.Application;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import javax.inject.Provider;
import tw.e;
import tw.h;

/* loaded from: classes2.dex */
public final class FinancialConnectionsSheetModule_ProvideAnalyticsRequestFactory$financial_connections_releaseFactory implements e<AnalyticsRequestFactory> {
    private final Provider<Application> applicationProvider;
    private final Provider<String> publishableKeyProvider;

    public FinancialConnectionsSheetModule_ProvideAnalyticsRequestFactory$financial_connections_releaseFactory(Provider<Application> provider, Provider<String> provider2) {
        this.applicationProvider = provider;
        this.publishableKeyProvider = provider2;
    }

    public static FinancialConnectionsSheetModule_ProvideAnalyticsRequestFactory$financial_connections_releaseFactory create(Provider<Application> provider, Provider<String> provider2) {
        return new FinancialConnectionsSheetModule_ProvideAnalyticsRequestFactory$financial_connections_releaseFactory(provider, provider2);
    }

    public static AnalyticsRequestFactory provideAnalyticsRequestFactory$financial_connections_release(Application application, String str) {
        return (AnalyticsRequestFactory) h.e(FinancialConnectionsSheetModule.INSTANCE.provideAnalyticsRequestFactory$financial_connections_release(application, str));
    }

    @Override // javax.inject.Provider
    public AnalyticsRequestFactory get() {
        return provideAnalyticsRequestFactory$financial_connections_release(this.applicationProvider.get(), this.publishableKeyProvider.get());
    }
}