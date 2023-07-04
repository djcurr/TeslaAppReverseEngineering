package com.stripe.android.link.account;

import javax.inject.Provider;
import tw.e;

/* loaded from: classes6.dex */
public final class CookieStore_Factory implements e<CookieStore> {
    private final Provider<EncryptedStore> storeProvider;

    public CookieStore_Factory(Provider<EncryptedStore> provider) {
        this.storeProvider = provider;
    }

    public static CookieStore_Factory create(Provider<EncryptedStore> provider) {
        return new CookieStore_Factory(provider);
    }

    public static CookieStore newInstance(EncryptedStore encryptedStore) {
        return new CookieStore(encryptedStore);
    }

    @Override // javax.inject.Provider
    public CookieStore get() {
        return newInstance(this.storeProvider.get());
    }
}