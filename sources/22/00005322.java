package com.stripe.android.networking;

import android.content.Context;
import java.util.Set;
import javax.inject.Provider;
import tw.e;

/* loaded from: classes6.dex */
public final class PaymentAnalyticsRequestFactory_Factory implements e<PaymentAnalyticsRequestFactory> {
    private final Provider<Context> contextProvider;
    private final Provider<Set<String>> defaultProductUsageTokensProvider;
    private final Provider<h00.a<String>> publishableKeyProvider;

    public PaymentAnalyticsRequestFactory_Factory(Provider<Context> provider, Provider<h00.a<String>> provider2, Provider<Set<String>> provider3) {
        this.contextProvider = provider;
        this.publishableKeyProvider = provider2;
        this.defaultProductUsageTokensProvider = provider3;
    }

    public static PaymentAnalyticsRequestFactory_Factory create(Provider<Context> provider, Provider<h00.a<String>> provider2, Provider<Set<String>> provider3) {
        return new PaymentAnalyticsRequestFactory_Factory(provider, provider2, provider3);
    }

    public static PaymentAnalyticsRequestFactory newInstance(Context context, h00.a<String> aVar, Set<String> set) {
        return new PaymentAnalyticsRequestFactory(context, aVar, set);
    }

    @Override // javax.inject.Provider
    public PaymentAnalyticsRequestFactory get() {
        return newInstance(this.contextProvider.get(), this.publishableKeyProvider.get(), this.defaultProductUsageTokensProvider.get());
    }
}