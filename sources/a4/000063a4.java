package com.withpersona.sdk.inquiry.network;

import com.squareup.moshi.f;
import com.squareup.moshi.p;
import java.util.Set;
import javax.inject.Provider;
import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class NetworkModule_MoshiFactory implements e<p> {
    private final Provider<Set<JsonAdapterBinding<?>>> jsonAdapterBindingsProvider;
    private final Provider<Set<f.d>> jsonAdapterFactoryProvider;
    private final Provider<Set<Object>> jsonAdaptersProvider;
    private final NetworkModule module;

    public NetworkModule_MoshiFactory(NetworkModule networkModule, Provider<Set<Object>> provider, Provider<Set<JsonAdapterBinding<?>>> provider2, Provider<Set<f.d>> provider3) {
        this.module = networkModule;
        this.jsonAdaptersProvider = provider;
        this.jsonAdapterBindingsProvider = provider2;
        this.jsonAdapterFactoryProvider = provider3;
    }

    public static NetworkModule_MoshiFactory create(NetworkModule networkModule, Provider<Set<Object>> provider, Provider<Set<JsonAdapterBinding<?>>> provider2, Provider<Set<f.d>> provider3) {
        return new NetworkModule_MoshiFactory(networkModule, provider, provider2, provider3);
    }

    public static p moshi(NetworkModule networkModule, Set<Object> set, Set<JsonAdapterBinding<?>> set2, Set<f.d> set3) {
        return (p) h.e(networkModule.moshi(set, set2, set3));
    }

    @Override // javax.inject.Provider
    public p get() {
        return moshi(this.module, this.jsonAdaptersProvider.get(), this.jsonAdapterBindingsProvider.get(), this.jsonAdapterFactoryProvider.get());
    }
}