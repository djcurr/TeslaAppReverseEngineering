package com.stripe.android.paymentsheet.injection;

import java.util.Set;
import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class FlowControllerModule_Companion_ProvideProductUsageTokensFactory implements e<Set<String>> {

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final FlowControllerModule_Companion_ProvideProductUsageTokensFactory INSTANCE = new FlowControllerModule_Companion_ProvideProductUsageTokensFactory();

        private InstanceHolder() {
        }
    }

    public static FlowControllerModule_Companion_ProvideProductUsageTokensFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<String> provideProductUsageTokens() {
        return (Set) h.e(FlowControllerModule.Companion.provideProductUsageTokens());
    }

    @Override // javax.inject.Provider
    public Set<String> get() {
        return provideProductUsageTokens();
    }
}