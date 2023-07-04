package com.stripe.android.core.networking;

import com.stripe.android.core.Logger;
import javax.inject.Provider;
import tw.e;
import zz.g;

/* loaded from: classes2.dex */
public final class DefaultAnalyticsRequestExecutor_Factory implements e<DefaultAnalyticsRequestExecutor> {
    private final Provider<Logger> loggerProvider;
    private final Provider<g> workContextProvider;

    public DefaultAnalyticsRequestExecutor_Factory(Provider<Logger> provider, Provider<g> provider2) {
        this.loggerProvider = provider;
        this.workContextProvider = provider2;
    }

    public static DefaultAnalyticsRequestExecutor_Factory create(Provider<Logger> provider, Provider<g> provider2) {
        return new DefaultAnalyticsRequestExecutor_Factory(provider, provider2);
    }

    public static DefaultAnalyticsRequestExecutor newInstance(Logger logger, g gVar) {
        return new DefaultAnalyticsRequestExecutor(logger, gVar);
    }

    @Override // javax.inject.Provider
    public DefaultAnalyticsRequestExecutor get() {
        return newInstance(this.loggerProvider.get(), this.workContextProvider.get());
    }
}