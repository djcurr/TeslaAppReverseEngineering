package com.stripe.android.googlepaylauncher;

import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent;
import javax.inject.Provider;

/* loaded from: classes6.dex */
public final class GooglePayPaymentMethodLauncherViewModel_Factory_MembersInjector implements sw.b<GooglePayPaymentMethodLauncherViewModel.Factory> {
    private final Provider<GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder> subComponentBuilderProvider;

    public GooglePayPaymentMethodLauncherViewModel_Factory_MembersInjector(Provider<GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder> provider) {
        this.subComponentBuilderProvider = provider;
    }

    public static sw.b<GooglePayPaymentMethodLauncherViewModel.Factory> create(Provider<GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder> provider) {
        return new GooglePayPaymentMethodLauncherViewModel_Factory_MembersInjector(provider);
    }

    public static void injectSubComponentBuilder(GooglePayPaymentMethodLauncherViewModel.Factory factory, GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder builder) {
        factory.subComponentBuilder = builder;
    }

    public void injectMembers(GooglePayPaymentMethodLauncherViewModel.Factory factory) {
        injectSubComponentBuilder(factory, this.subComponentBuilderProvider.get());
    }
}