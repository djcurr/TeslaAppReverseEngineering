package com.stripe.android.financialconnections.di;

import tw.e;

/* loaded from: classes2.dex */
public final class FinancialConnectionsSheetConfigurationModule_ProvidesEnableLoggingFactory implements e<Boolean> {

    /* loaded from: classes2.dex */
    private static final class InstanceHolder {
        private static final FinancialConnectionsSheetConfigurationModule_ProvidesEnableLoggingFactory INSTANCE = new FinancialConnectionsSheetConfigurationModule_ProvidesEnableLoggingFactory();

        private InstanceHolder() {
        }
    }

    public static FinancialConnectionsSheetConfigurationModule_ProvidesEnableLoggingFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean providesEnableLogging() {
        return FinancialConnectionsSheetConfigurationModule.INSTANCE.providesEnableLogging();
    }

    @Override // javax.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(providesEnableLogging());
    }
}