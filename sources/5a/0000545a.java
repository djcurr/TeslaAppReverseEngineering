package com.stripe.android.payments.core.injection;

import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class Stripe3ds2TransactionModule_Companion_ProvideMessageVersionRegistryFactory implements e<MessageVersionRegistry> {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class InstanceHolder {
        private static final Stripe3ds2TransactionModule_Companion_ProvideMessageVersionRegistryFactory INSTANCE = new Stripe3ds2TransactionModule_Companion_ProvideMessageVersionRegistryFactory();

        private InstanceHolder() {
        }
    }

    public static Stripe3ds2TransactionModule_Companion_ProvideMessageVersionRegistryFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MessageVersionRegistry provideMessageVersionRegistry() {
        return (MessageVersionRegistry) h.e(Stripe3ds2TransactionModule.Companion.provideMessageVersionRegistry());
    }

    @Override // javax.inject.Provider
    public MessageVersionRegistry get() {
        return provideMessageVersionRegistry();
    }
}