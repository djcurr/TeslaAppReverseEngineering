package com.stripe.android.financialconnections.di;

import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.StripeNetworkClient;
import javax.inject.Provider;
import tw.e;
import tw.h;
import zz.g;

/* loaded from: classes2.dex */
public final class FinancialConnectionsSheetModule_ProvideStripeNetworkClientFactory implements e<StripeNetworkClient> {
    private final Provider<g> contextProvider;
    private final Provider<Logger> loggerProvider;

    public FinancialConnectionsSheetModule_ProvideStripeNetworkClientFactory(Provider<g> provider, Provider<Logger> provider2) {
        this.contextProvider = provider;
        this.loggerProvider = provider2;
    }

    public static FinancialConnectionsSheetModule_ProvideStripeNetworkClientFactory create(Provider<g> provider, Provider<Logger> provider2) {
        return new FinancialConnectionsSheetModule_ProvideStripeNetworkClientFactory(provider, provider2);
    }

    public static StripeNetworkClient provideStripeNetworkClient(g gVar, Logger logger) {
        return (StripeNetworkClient) h.e(FinancialConnectionsSheetModule.INSTANCE.provideStripeNetworkClient(gVar, logger));
    }

    @Override // javax.inject.Provider
    public StripeNetworkClient get() {
        return provideStripeNetworkClient(this.contextProvider.get(), this.loggerProvider.get());
    }
}