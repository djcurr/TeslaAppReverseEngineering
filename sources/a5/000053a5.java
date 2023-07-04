package com.stripe.android.payments.bankaccount.di;

import java.util.Set;
import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class CollectBankAccountModule_ProvidesProductUsageFactory implements e<Set<String>> {

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final CollectBankAccountModule_ProvidesProductUsageFactory INSTANCE = new CollectBankAccountModule_ProvidesProductUsageFactory();

        private InstanceHolder() {
        }
    }

    public static CollectBankAccountModule_ProvidesProductUsageFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<String> providesProductUsage() {
        return (Set) h.e(CollectBankAccountModule.INSTANCE.providesProductUsage());
    }

    @Override // javax.inject.Provider
    public Set<String> get() {
        return providesProductUsage();
    }
}