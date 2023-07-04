package com.stripe.android.financialconnections;

import androidx.lifecycle.l0;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEventReporter;
import com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSession;
import com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSessionForToken;
import com.stripe.android.financialconnections.domain.GenerateFinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import javax.inject.Provider;
import tw.e;

/* renamed from: com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel_Factory  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1415FinancialConnectionsSheetViewModel_Factory implements e<FinancialConnectionsSheetViewModel> {
    private final Provider<String> applicationIdProvider;
    private final Provider<FinancialConnectionsEventReporter> eventReporterProvider;
    private final Provider<FetchFinancialConnectionsSessionForToken> fetchFinancialConnectionsSessionForTokenProvider;
    private final Provider<FetchFinancialConnectionsSession> fetchFinancialConnectionsSessionProvider;
    private final Provider<GenerateFinancialConnectionsSessionManifest> generateFinancialConnectionsSessionManifestProvider;
    private final Provider<l0> savedStateHandleProvider;
    private final Provider<FinancialConnectionsSheetActivityArgs> starterArgsProvider;

    public C1415FinancialConnectionsSheetViewModel_Factory(Provider<String> provider, Provider<FinancialConnectionsSheetActivityArgs> provider2, Provider<GenerateFinancialConnectionsSessionManifest> provider3, Provider<FetchFinancialConnectionsSession> provider4, Provider<FetchFinancialConnectionsSessionForToken> provider5, Provider<l0> provider6, Provider<FinancialConnectionsEventReporter> provider7) {
        this.applicationIdProvider = provider;
        this.starterArgsProvider = provider2;
        this.generateFinancialConnectionsSessionManifestProvider = provider3;
        this.fetchFinancialConnectionsSessionProvider = provider4;
        this.fetchFinancialConnectionsSessionForTokenProvider = provider5;
        this.savedStateHandleProvider = provider6;
        this.eventReporterProvider = provider7;
    }

    public static C1415FinancialConnectionsSheetViewModel_Factory create(Provider<String> provider, Provider<FinancialConnectionsSheetActivityArgs> provider2, Provider<GenerateFinancialConnectionsSessionManifest> provider3, Provider<FetchFinancialConnectionsSession> provider4, Provider<FetchFinancialConnectionsSessionForToken> provider5, Provider<l0> provider6, Provider<FinancialConnectionsEventReporter> provider7) {
        return new C1415FinancialConnectionsSheetViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static FinancialConnectionsSheetViewModel newInstance(String str, FinancialConnectionsSheetActivityArgs financialConnectionsSheetActivityArgs, GenerateFinancialConnectionsSessionManifest generateFinancialConnectionsSessionManifest, FetchFinancialConnectionsSession fetchFinancialConnectionsSession, FetchFinancialConnectionsSessionForToken fetchFinancialConnectionsSessionForToken, l0 l0Var, FinancialConnectionsEventReporter financialConnectionsEventReporter) {
        return new FinancialConnectionsSheetViewModel(str, financialConnectionsSheetActivityArgs, generateFinancialConnectionsSessionManifest, fetchFinancialConnectionsSession, fetchFinancialConnectionsSessionForToken, l0Var, financialConnectionsEventReporter);
    }

    @Override // javax.inject.Provider
    public FinancialConnectionsSheetViewModel get() {
        return newInstance(this.applicationIdProvider.get(), this.starterArgsProvider.get(), this.generateFinancialConnectionsSessionManifestProvider.get(), this.fetchFinancialConnectionsSessionProvider.get(), this.fetchFinancialConnectionsSessionForTokenProvider.get(), this.savedStateHandleProvider.get(), this.eventReporterProvider.get());
    }
}