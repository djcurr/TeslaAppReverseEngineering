package com.stripe.android.paymentsheet.model;

import tw.e;

/* loaded from: classes6.dex */
public final class StripeIntentValidator_Factory implements e<StripeIntentValidator> {

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final StripeIntentValidator_Factory INSTANCE = new StripeIntentValidator_Factory();

        private InstanceHolder() {
        }
    }

    public static StripeIntentValidator_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static StripeIntentValidator newInstance() {
        return new StripeIntentValidator();
    }

    @Override // javax.inject.Provider
    public StripeIntentValidator get() {
        return newInstance();
    }
}