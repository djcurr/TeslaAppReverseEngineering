package com.stripe.android.financialconnections.di;

import java.util.Locale;
import tw.e;

/* loaded from: classes2.dex */
public final class FinancialConnectionsSheetModule_ProvideLocaleFactory implements e<Locale> {

    /* loaded from: classes2.dex */
    private static final class InstanceHolder {
        private static final FinancialConnectionsSheetModule_ProvideLocaleFactory INSTANCE = new FinancialConnectionsSheetModule_ProvideLocaleFactory();

        private InstanceHolder() {
        }
    }

    public static FinancialConnectionsSheetModule_ProvideLocaleFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Locale provideLocale() {
        return FinancialConnectionsSheetModule.INSTANCE.provideLocale();
    }

    @Override // javax.inject.Provider
    public Locale get() {
        return provideLocale();
    }
}