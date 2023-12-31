package com.stripe.android.googlepaylauncher;

import android.content.Context;
import com.stripe.android.core.Logger;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import javax.inject.Provider;

/* loaded from: classes6.dex */
public final class DefaultGooglePayRepository_Factory implements tw.e<DefaultGooglePayRepository> {
    private final Provider<Context> contextProvider;
    private final Provider<GooglePayPaymentMethodLauncher.Config> googlePayConfigProvider;
    private final Provider<Logger> loggerProvider;

    public DefaultGooglePayRepository_Factory(Provider<Context> provider, Provider<GooglePayPaymentMethodLauncher.Config> provider2, Provider<Logger> provider3) {
        this.contextProvider = provider;
        this.googlePayConfigProvider = provider2;
        this.loggerProvider = provider3;
    }

    public static DefaultGooglePayRepository_Factory create(Provider<Context> provider, Provider<GooglePayPaymentMethodLauncher.Config> provider2, Provider<Logger> provider3) {
        return new DefaultGooglePayRepository_Factory(provider, provider2, provider3);
    }

    public static DefaultGooglePayRepository newInstance(Context context, GooglePayPaymentMethodLauncher.Config config, Logger logger) {
        return new DefaultGooglePayRepository(context, config, logger);
    }

    @Override // javax.inject.Provider
    public DefaultGooglePayRepository get() {
        return newInstance(this.contextProvider.get(), this.googlePayConfigProvider.get(), this.loggerProvider.get());
    }
}