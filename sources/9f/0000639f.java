package com.withpersona.sdk.inquiry.network;

import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class NetworkConstants_ViewRegistryFactory implements e<String> {

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final NetworkConstants_ViewRegistryFactory INSTANCE = new NetworkConstants_ViewRegistryFactory();

        private InstanceHolder() {
        }
    }

    public static NetworkConstants_ViewRegistryFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String viewRegistry() {
        return (String) h.e(NetworkConstants.viewRegistry());
    }

    @Override // javax.inject.Provider
    public String get() {
        return viewRegistry();
    }
}