package com.withpersona.sdk.inquiry.network;

import java.util.Map;
import javax.inject.Provider;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class NetworkModule_OkhttpClientFactory implements e<OkHttpClient> {
    private final Provider<Map<String, String>> headersProvider;
    private final Provider<Interceptor> interceptorProvider;
    private final NetworkModule module;

    public NetworkModule_OkhttpClientFactory(NetworkModule networkModule, Provider<Interceptor> provider, Provider<Map<String, String>> provider2) {
        this.module = networkModule;
        this.interceptorProvider = provider;
        this.headersProvider = provider2;
    }

    public static NetworkModule_OkhttpClientFactory create(NetworkModule networkModule, Provider<Interceptor> provider, Provider<Map<String, String>> provider2) {
        return new NetworkModule_OkhttpClientFactory(networkModule, provider, provider2);
    }

    public static OkHttpClient okhttpClient(NetworkModule networkModule, Interceptor interceptor, Map<String, String> map) {
        return (OkHttpClient) h.e(networkModule.okhttpClient(interceptor, map));
    }

    @Override // javax.inject.Provider
    public OkHttpClient get() {
        return okhttpClient(this.module, this.interceptorProvider.get(), this.headersProvider.get());
    }
}