package com.stripe.android.core.injection;

import tw.e;
import tw.h;
import zz.g;

/* loaded from: classes2.dex */
public final class CoroutineContextModule_ProvideWorkContextFactory implements e<g> {
    private final CoroutineContextModule module;

    public CoroutineContextModule_ProvideWorkContextFactory(CoroutineContextModule coroutineContextModule) {
        this.module = coroutineContextModule;
    }

    public static CoroutineContextModule_ProvideWorkContextFactory create(CoroutineContextModule coroutineContextModule) {
        return new CoroutineContextModule_ProvideWorkContextFactory(coroutineContextModule);
    }

    public static g provideWorkContext(CoroutineContextModule coroutineContextModule) {
        return (g) h.e(coroutineContextModule.provideWorkContext());
    }

    @Override // javax.inject.Provider
    public g get() {
        return provideWorkContext(this.module);
    }
}