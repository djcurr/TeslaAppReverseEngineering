package com.stripe.android.ui.core.address;

import android.content.res.Resources;
import javax.inject.Provider;
import tw.e;

/* loaded from: classes6.dex */
public final class AddressFieldElementRepository_Factory implements e<AddressFieldElementRepository> {
    private final Provider<Resources> resourcesProvider;

    public AddressFieldElementRepository_Factory(Provider<Resources> provider) {
        this.resourcesProvider = provider;
    }

    public static AddressFieldElementRepository_Factory create(Provider<Resources> provider) {
        return new AddressFieldElementRepository_Factory(provider);
    }

    public static AddressFieldElementRepository newInstance(Resources resources) {
        return new AddressFieldElementRepository(resources);
    }

    @Override // javax.inject.Provider
    public AddressFieldElementRepository get() {
        return newInstance(this.resourcesProvider.get());
    }
}