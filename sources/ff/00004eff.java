package com.stripe.android.link.account;

import android.content.Context;
import javax.inject.Provider;
import tw.e;

/* loaded from: classes6.dex */
public final class EncryptedStore_Factory implements e<EncryptedStore> {
    private final Provider<Context> contextProvider;

    public EncryptedStore_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static EncryptedStore_Factory create(Provider<Context> provider) {
        return new EncryptedStore_Factory(provider);
    }

    public static EncryptedStore newInstance(Context context) {
        return new EncryptedStore(context);
    }

    @Override // javax.inject.Provider
    public EncryptedStore get() {
        return newInstance(this.contextProvider.get());
    }
}