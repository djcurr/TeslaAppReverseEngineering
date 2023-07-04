package com.stripe.android.link.model;

import tw.e;

/* loaded from: classes6.dex */
public final class Navigator_Factory implements e<Navigator> {

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final Navigator_Factory INSTANCE = new Navigator_Factory();

        private InstanceHolder() {
        }
    }

    public static Navigator_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Navigator newInstance() {
        return new Navigator();
    }

    @Override // javax.inject.Provider
    public Navigator get() {
        return newInstance();
    }
}