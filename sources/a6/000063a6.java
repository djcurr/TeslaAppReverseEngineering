package com.withpersona.sdk.inquiry.network;

import com.squareup.moshi.p;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.t;
import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class NetworkModule_RetrofitFactory implements e<t> {
    private final NetworkModule module;
    private final Provider<p> moshiProvider;
    private final Provider<OkHttpClient> okHttpClientProvider;
    private final Provider<String> serverEndpointProvider;

    public NetworkModule_RetrofitFactory(NetworkModule networkModule, Provider<String> provider, Provider<OkHttpClient> provider2, Provider<p> provider3) {
        this.module = networkModule;
        this.serverEndpointProvider = provider;
        this.okHttpClientProvider = provider2;
        this.moshiProvider = provider3;
    }

    public static NetworkModule_RetrofitFactory create(NetworkModule networkModule, Provider<String> provider, Provider<OkHttpClient> provider2, Provider<p> provider3) {
        return new NetworkModule_RetrofitFactory(networkModule, provider, provider2, provider3);
    }

    public static t retrofit(NetworkModule networkModule, String str, OkHttpClient okHttpClient, p pVar) {
        return (t) h.e(networkModule.retrofit(str, okHttpClient, pVar));
    }

    @Override // javax.inject.Provider
    public t get() {
        return retrofit(this.module, this.serverEndpointProvider.get(), this.okHttpClientProvider.get(), this.moshiProvider.get());
    }
}