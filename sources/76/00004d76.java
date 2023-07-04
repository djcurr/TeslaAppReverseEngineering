package com.stripe.android.financialconnections.di;

import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import javax.inject.Provider;
import tw.e;
import tw.h;

/* loaded from: classes2.dex */
public final class FinancialConnectionsSheetConfigurationModule_ProvidesPublishableKeyFactory implements e<String> {
    private final Provider<FinancialConnectionsSheet.Configuration> configurationProvider;

    public FinancialConnectionsSheetConfigurationModule_ProvidesPublishableKeyFactory(Provider<FinancialConnectionsSheet.Configuration> provider) {
        this.configurationProvider = provider;
    }

    public static FinancialConnectionsSheetConfigurationModule_ProvidesPublishableKeyFactory create(Provider<FinancialConnectionsSheet.Configuration> provider) {
        return new FinancialConnectionsSheetConfigurationModule_ProvidesPublishableKeyFactory(provider);
    }

    public static String providesPublishableKey(FinancialConnectionsSheet.Configuration configuration) {
        return (String) h.e(FinancialConnectionsSheetConfigurationModule.INSTANCE.providesPublishableKey(configuration));
    }

    @Override // javax.inject.Provider
    public String get() {
        return providesPublishableKey(this.configurationProvider.get());
    }
}