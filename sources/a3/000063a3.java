package com.withpersona.sdk.inquiry.network;

import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class NetworkModule_KeyInflectionFactory implements e<String> {
    private final NetworkModule module;

    public NetworkModule_KeyInflectionFactory(NetworkModule networkModule) {
        this.module = networkModule;
    }

    public static NetworkModule_KeyInflectionFactory create(NetworkModule networkModule) {
        return new NetworkModule_KeyInflectionFactory(networkModule);
    }

    public static String keyInflection(NetworkModule networkModule) {
        return (String) h.e(networkModule.keyInflection());
    }

    @Override // javax.inject.Provider
    public String get() {
        return keyInflection(this.module);
    }
}