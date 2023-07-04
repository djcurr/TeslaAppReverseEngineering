package com.stripe.android.financialconnections.di;

import com.stripe.android.core.networking.ApiRequest;
import tw.e;
import tw.h;

/* loaded from: classes2.dex */
public final class FinancialConnectionsSheetModule_ProvidesApiRequestFactoryFactory implements e<ApiRequest.Factory> {

    /* loaded from: classes2.dex */
    private static final class InstanceHolder {
        private static final FinancialConnectionsSheetModule_ProvidesApiRequestFactoryFactory INSTANCE = new FinancialConnectionsSheetModule_ProvidesApiRequestFactoryFactory();

        private InstanceHolder() {
        }
    }

    public static FinancialConnectionsSheetModule_ProvidesApiRequestFactoryFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ApiRequest.Factory providesApiRequestFactory() {
        return (ApiRequest.Factory) h.e(FinancialConnectionsSheetModule.INSTANCE.providesApiRequestFactory());
    }

    @Override // javax.inject.Provider
    public ApiRequest.Factory get() {
        return providesApiRequestFactory();
    }
}