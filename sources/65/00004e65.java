package com.stripe.android.googlepaylauncher;

import android.content.Context;
import javax.inject.Provider;

/* loaded from: classes6.dex */
public final class PaymentsClientFactory_Factory implements tw.e<PaymentsClientFactory> {
    private final Provider<Context> contextProvider;

    public PaymentsClientFactory_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static PaymentsClientFactory_Factory create(Provider<Context> provider) {
        return new PaymentsClientFactory_Factory(provider);
    }

    public static PaymentsClientFactory newInstance(Context context) {
        return new PaymentsClientFactory(context);
    }

    @Override // javax.inject.Provider
    public PaymentsClientFactory get() {
        return newInstance(this.contextProvider.get());
    }
}