package com.stripe.android.core.networking;

import com.stripe.android.core.networking.ApiRequest;
import h00.a;
import javax.inject.Provider;
import tw.e;

/* loaded from: classes2.dex */
public final class ApiRequest_Options_Factory implements e<ApiRequest.Options> {
    private final Provider<a<String>> publishableKeyProvider;
    private final Provider<a<String>> stripeAccountIdProvider;

    public ApiRequest_Options_Factory(Provider<a<String>> provider, Provider<a<String>> provider2) {
        this.publishableKeyProvider = provider;
        this.stripeAccountIdProvider = provider2;
    }

    public static ApiRequest_Options_Factory create(Provider<a<String>> provider, Provider<a<String>> provider2) {
        return new ApiRequest_Options_Factory(provider, provider2);
    }

    public static ApiRequest.Options newInstance(a<String> aVar, a<String> aVar2) {
        return new ApiRequest.Options(aVar, aVar2);
    }

    @Override // javax.inject.Provider
    public ApiRequest.Options get() {
        return newInstance(this.publishableKeyProvider.get(), this.stripeAccountIdProvider.get());
    }
}