package com.stripe.android.payments.bankaccount.di;

import tw.e;

/* loaded from: classes6.dex */
public final class CollectBankAccountModule_ProvidesEnableLoggingFactory implements e<Boolean> {

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final CollectBankAccountModule_ProvidesEnableLoggingFactory INSTANCE = new CollectBankAccountModule_ProvidesEnableLoggingFactory();

        private InstanceHolder() {
        }
    }

    public static CollectBankAccountModule_ProvidesEnableLoggingFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean providesEnableLogging() {
        return CollectBankAccountModule.INSTANCE.providesEnableLogging();
    }

    @Override // javax.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(providesEnableLogging());
    }
}