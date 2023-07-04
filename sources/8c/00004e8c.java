package com.stripe.android.googlepaylauncher.injection;

import android.content.Context;
import com.stripe.android.core.Logger;
import com.stripe.android.googlepaylauncher.GooglePayEnvironment;
import com.stripe.android.googlepaylauncher.GooglePayRepository;
import h00.l;
import javax.inject.Provider;
import tw.e;
import tw.h;

/* loaded from: classes6.dex */
public final class GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory implements e<l<GooglePayEnvironment, GooglePayRepository>> {
    private final Provider<Context> appContextProvider;
    private final Provider<Logger> loggerProvider;
    private final GooglePayLauncherModule module;

    public GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory(GooglePayLauncherModule googlePayLauncherModule, Provider<Context> provider, Provider<Logger> provider2) {
        this.module = googlePayLauncherModule;
        this.appContextProvider = provider;
        this.loggerProvider = provider2;
    }

    public static GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory create(GooglePayLauncherModule googlePayLauncherModule, Provider<Context> provider, Provider<Logger> provider2) {
        return new GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory(googlePayLauncherModule, provider, provider2);
    }

    public static l<GooglePayEnvironment, GooglePayRepository> provideGooglePayRepositoryFactory(GooglePayLauncherModule googlePayLauncherModule, Context context, Logger logger) {
        return (l) h.e(googlePayLauncherModule.provideGooglePayRepositoryFactory(context, logger));
    }

    @Override // javax.inject.Provider
    public l<GooglePayEnvironment, GooglePayRepository> get() {
        return provideGooglePayRepositoryFactory(this.module, this.appContextProvider.get(), this.loggerProvider.get());
    }
}