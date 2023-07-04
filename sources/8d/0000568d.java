package com.stripe.android.paymentsheet.injection;

import com.stripe.android.paymentsheet.flowcontroller.FlowControllerViewModel;
import com.stripe.android.paymentsheet.model.ClientSecret;
import javax.inject.Provider;
import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class FlowControllerModule_Companion_ProvideClientSecretFactory implements e<ClientSecret> {
    private final Provider<FlowControllerViewModel> viewModelProvider;

    public FlowControllerModule_Companion_ProvideClientSecretFactory(Provider<FlowControllerViewModel> provider) {
        this.viewModelProvider = provider;
    }

    public static FlowControllerModule_Companion_ProvideClientSecretFactory create(Provider<FlowControllerViewModel> provider) {
        return new FlowControllerModule_Companion_ProvideClientSecretFactory(provider);
    }

    public static ClientSecret provideClientSecret(FlowControllerViewModel flowControllerViewModel) {
        return (ClientSecret) h.e(FlowControllerModule.Companion.provideClientSecret(flowControllerViewModel));
    }

    @Override // javax.inject.Provider
    public ClientSecret get() {
        return provideClientSecret(this.viewModelProvider.get());
    }
}