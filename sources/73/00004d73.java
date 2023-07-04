package com.stripe.android.financialconnections.di;

import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import javax.inject.Provider;
import tw.e;
import tw.h;

/* loaded from: classes2.dex */
public final class FinancialConnectionsSheetConfigurationModule_ProvidesConfigurationFactory implements e<FinancialConnectionsSheet.Configuration> {
    private final Provider<FinancialConnectionsSheetActivityArgs> argsProvider;

    public FinancialConnectionsSheetConfigurationModule_ProvidesConfigurationFactory(Provider<FinancialConnectionsSheetActivityArgs> provider) {
        this.argsProvider = provider;
    }

    public static FinancialConnectionsSheetConfigurationModule_ProvidesConfigurationFactory create(Provider<FinancialConnectionsSheetActivityArgs> provider) {
        return new FinancialConnectionsSheetConfigurationModule_ProvidesConfigurationFactory(provider);
    }

    public static FinancialConnectionsSheet.Configuration providesConfiguration(FinancialConnectionsSheetActivityArgs financialConnectionsSheetActivityArgs) {
        return (FinancialConnectionsSheet.Configuration) h.e(FinancialConnectionsSheetConfigurationModule.INSTANCE.providesConfiguration(financialConnectionsSheetActivityArgs));
    }

    @Override // javax.inject.Provider
    public FinancialConnectionsSheet.Configuration get() {
        return providesConfiguration(this.argsProvider.get());
    }
}