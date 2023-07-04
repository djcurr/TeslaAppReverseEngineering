package com.stripe.android.core.injection;

import tw.e;
import tw.h;
import zz.g;

/* loaded from: classes2.dex */
public final class CoroutineContextModule_ProvideUIContextFactory implements e<g> {
    private final CoroutineContextModule module;

    public CoroutineContextModule_ProvideUIContextFactory(CoroutineContextModule coroutineContextModule) {
        this.module = coroutineContextModule;
    }

    public static CoroutineContextModule_ProvideUIContextFactory create(CoroutineContextModule coroutineContextModule) {
        return new CoroutineContextModule_ProvideUIContextFactory(coroutineContextModule);
    }

    public static g provideUIContext(CoroutineContextModule coroutineContextModule) {
        return (g) h.e(coroutineContextModule.provideUIContext());
    }

    @Override // javax.inject.Provider
    public g get() {
        return provideUIContext(this.module);
    }
}