package com.stripe.android.ui.core.forms.resources;

import android.content.res.Resources;
import java.util.Locale;
import javax.inject.Provider;
import tw.e;
import zz.g;

/* loaded from: classes6.dex */
public final class AsyncResourceRepository_Factory implements e<AsyncResourceRepository> {
    private final Provider<Locale> localeProvider;
    private final Provider<Resources> resourcesProvider;
    private final Provider<g> workContextProvider;

    public AsyncResourceRepository_Factory(Provider<Resources> provider, Provider<g> provider2, Provider<Locale> provider3) {
        this.resourcesProvider = provider;
        this.workContextProvider = provider2;
        this.localeProvider = provider3;
    }

    public static AsyncResourceRepository_Factory create(Provider<Resources> provider, Provider<g> provider2, Provider<Locale> provider3) {
        return new AsyncResourceRepository_Factory(provider, provider2, provider3);
    }

    public static AsyncResourceRepository newInstance(Resources resources, g gVar, Locale locale) {
        return new AsyncResourceRepository(resources, gVar, locale);
    }

    @Override // javax.inject.Provider
    public AsyncResourceRepository get() {
        return newInstance(this.resourcesProvider.get(), this.workContextProvider.get(), this.localeProvider.get());
    }
}