package com.stripe.android.financialconnections.di;

import com.stripe.android.financialconnections.analytics.DefaultFinancialConnectionsEventReporter;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEventReporter;
import javax.inject.Provider;
import tw.e;
import tw.h;

/* loaded from: classes2.dex */
public final class FinancialConnectionsSheetModule_ProvideEventReporterFactory implements e<FinancialConnectionsEventReporter> {
    private final Provider<DefaultFinancialConnectionsEventReporter> defaultFinancialConnectionsEventReporterProvider;

    public FinancialConnectionsSheetModule_ProvideEventReporterFactory(Provider<DefaultFinancialConnectionsEventReporter> provider) {
        this.defaultFinancialConnectionsEventReporterProvider = provider;
    }

    public static FinancialConnectionsSheetModule_ProvideEventReporterFactory create(Provider<DefaultFinancialConnectionsEventReporter> provider) {
        return new FinancialConnectionsSheetModule_ProvideEventReporterFactory(provider);
    }

    public static FinancialConnectionsEventReporter provideEventReporter(DefaultFinancialConnectionsEventReporter defaultFinancialConnectionsEventReporter) {
        return (FinancialConnectionsEventReporter) h.e(FinancialConnectionsSheetModule.INSTANCE.provideEventReporter(defaultFinancialConnectionsEventReporter));
    }

    @Override // javax.inject.Provider
    public FinancialConnectionsEventReporter get() {
        return provideEventReporter(this.defaultFinancialConnectionsEventReporterProvider.get());
    }
}