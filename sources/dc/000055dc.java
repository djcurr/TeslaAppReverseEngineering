package com.stripe.android.paymentsheet.analytics;

import android.content.Context;
import javax.inject.Provider;
import tw.e;
import zz.g;

/* loaded from: classes6.dex */
public final class DefaultDeviceIdRepository_Factory implements e<DefaultDeviceIdRepository> {
    private final Provider<Context> contextProvider;
    private final Provider<g> workContextProvider;

    public DefaultDeviceIdRepository_Factory(Provider<Context> provider, Provider<g> provider2) {
        this.contextProvider = provider;
        this.workContextProvider = provider2;
    }

    public static DefaultDeviceIdRepository_Factory create(Provider<Context> provider, Provider<g> provider2) {
        return new DefaultDeviceIdRepository_Factory(provider, provider2);
    }

    public static DefaultDeviceIdRepository newInstance(Context context, g gVar) {
        return new DefaultDeviceIdRepository(context, gVar);
    }

    @Override // javax.inject.Provider
    public DefaultDeviceIdRepository get() {
        return newInstance(this.contextProvider.get(), this.workContextProvider.get());
    }
}