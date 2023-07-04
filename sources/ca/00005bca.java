package com.stripe.android.ui.core.forms.resources.injection;

import android.content.Context;
import android.content.res.Resources;
import javax.inject.Provider;
import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class ResourceRepositoryModule_Companion_ProvideResourcesFactory implements e<Resources> {
    private final Provider<Context> contextProvider;

    public ResourceRepositoryModule_Companion_ProvideResourcesFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static ResourceRepositoryModule_Companion_ProvideResourcesFactory create(Provider<Context> provider) {
        return new ResourceRepositoryModule_Companion_ProvideResourcesFactory(provider);
    }

    public static Resources provideResources(Context context) {
        return (Resources) h.e(ResourceRepositoryModule.Companion.provideResources(context));
    }

    @Override // javax.inject.Provider
    public Resources get() {
        return provideResources(this.contextProvider.get());
    }
}