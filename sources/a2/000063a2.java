package com.withpersona.sdk.inquiry.network;

import okhttp3.Interceptor;
import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class NetworkModule_InterceptorFactory implements e<Interceptor> {
    private final NetworkModule module;

    public NetworkModule_InterceptorFactory(NetworkModule networkModule) {
        this.module = networkModule;
    }

    public static NetworkModule_InterceptorFactory create(NetworkModule networkModule) {
        return new NetworkModule_InterceptorFactory(networkModule);
    }

    public static Interceptor interceptor(NetworkModule networkModule) {
        return (Interceptor) h.e(networkModule.interceptor());
    }

    @Override // javax.inject.Provider
    public Interceptor get() {
        return interceptor(this.module);
    }
}