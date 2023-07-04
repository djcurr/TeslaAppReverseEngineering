package com.stripe.android.paymentsheet.injection;

import androidx.lifecycle.u0;
import com.stripe.android.paymentsheet.flowcontroller.FlowControllerViewModel;
import javax.inject.Provider;
import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class FlowControllerModule_Companion_ProvideViewModelFactory implements e<FlowControllerViewModel> {
    private final Provider<u0> viewModelStoreOwnerProvider;

    public FlowControllerModule_Companion_ProvideViewModelFactory(Provider<u0> provider) {
        this.viewModelStoreOwnerProvider = provider;
    }

    public static FlowControllerModule_Companion_ProvideViewModelFactory create(Provider<u0> provider) {
        return new FlowControllerModule_Companion_ProvideViewModelFactory(provider);
    }

    public static FlowControllerViewModel provideViewModel(u0 u0Var) {
        return (FlowControllerViewModel) h.e(FlowControllerModule.Companion.provideViewModel(u0Var));
    }

    @Override // javax.inject.Provider
    public FlowControllerViewModel get() {
        return provideViewModel(this.viewModelStoreOwnerProvider.get());
    }
}