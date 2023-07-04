package com.stripe.android.financialconnections.repository;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.StripeNetworkClient;
import javax.inject.Provider;
import tw.e;

/* loaded from: classes2.dex */
public final class FinancialConnectionsApiRepository_Factory implements e<FinancialConnectionsApiRepository> {
    private final Provider<ApiRequest.Factory> apiRequestFactoryProvider;
    private final Provider<String> publishableKeyProvider;
    private final Provider<StripeNetworkClient> stripeNetworkClientProvider;

    public FinancialConnectionsApiRepository_Factory(Provider<String> provider, Provider<StripeNetworkClient> provider2, Provider<ApiRequest.Factory> provider3) {
        this.publishableKeyProvider = provider;
        this.stripeNetworkClientProvider = provider2;
        this.apiRequestFactoryProvider = provider3;
    }

    public static FinancialConnectionsApiRepository_Factory create(Provider<String> provider, Provider<StripeNetworkClient> provider2, Provider<ApiRequest.Factory> provider3) {
        return new FinancialConnectionsApiRepository_Factory(provider, provider2, provider3);
    }

    public static FinancialConnectionsApiRepository newInstance(String str, StripeNetworkClient stripeNetworkClient, ApiRequest.Factory factory) {
        return new FinancialConnectionsApiRepository(str, stripeNetworkClient, factory);
    }

    @Override // javax.inject.Provider
    public FinancialConnectionsApiRepository get() {
        return newInstance(this.publishableKeyProvider.get(), this.stripeNetworkClientProvider.get(), this.apiRequestFactoryProvider.get());
    }
}