package com.stripe.android.financialconnections.di;

import android.app.Application;
import javax.inject.Provider;
import tw.e;
import tw.h;

/* loaded from: classes2.dex */
public final class FinancialConnectionsSheetConfigurationModule_ProvidesApplicationIdFactory implements e<String> {
    private final Provider<Application> applicationProvider;

    public FinancialConnectionsSheetConfigurationModule_ProvidesApplicationIdFactory(Provider<Application> provider) {
        this.applicationProvider = provider;
    }

    public static FinancialConnectionsSheetConfigurationModule_ProvidesApplicationIdFactory create(Provider<Application> provider) {
        return new FinancialConnectionsSheetConfigurationModule_ProvidesApplicationIdFactory(provider);
    }

    public static String providesApplicationId(Application application) {
        return (String) h.e(FinancialConnectionsSheetConfigurationModule.INSTANCE.providesApplicationId(application));
    }

    @Override // javax.inject.Provider
    public String get() {
        return providesApplicationId(this.applicationProvider.get());
    }
}