package com.stripe.android.core.networking;

import tw.e;

/* loaded from: classes2.dex */
public final class RetryDelaySupplier_Factory implements e<RetryDelaySupplier> {

    /* loaded from: classes2.dex */
    private static final class InstanceHolder {
        private static final RetryDelaySupplier_Factory INSTANCE = new RetryDelaySupplier_Factory();

        private InstanceHolder() {
        }
    }

    public static RetryDelaySupplier_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static RetryDelaySupplier newInstance() {
        return new RetryDelaySupplier();
    }

    @Override // javax.inject.Provider
    public RetryDelaySupplier get() {
        return newInstance();
    }
}