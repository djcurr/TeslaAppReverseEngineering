package com.stripe.android.googlepaylauncher;

import android.content.Context;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import h00.l;
import java.util.Set;
import javax.inject.Provider;
import v20.o0;

/* loaded from: classes6.dex */
public final class GooglePayPaymentMethodLauncher_Factory {
    private final Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;
    private final Provider<Context> contextProvider;
    private final Provider<Boolean> enableLoggingProvider;
    private final Provider<l<GooglePayEnvironment, GooglePayRepository>> googlePayRepositoryFactoryProvider;
    private final Provider<zz.g> ioContextProvider;
    private final Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
    private final Provider<Set<String>> productUsageProvider;
    private final Provider<h00.a<String>> publishableKeyProvider;
    private final Provider<h00.a<String>> stripeAccountIdProvider;
    private final Provider<StripeRepository> stripeRepositoryProvider;

    public GooglePayPaymentMethodLauncher_Factory(Provider<Context> provider, Provider<l<GooglePayEnvironment, GooglePayRepository>> provider2, Provider<Set<String>> provider3, Provider<h00.a<String>> provider4, Provider<h00.a<String>> provider5, Provider<Boolean> provider6, Provider<zz.g> provider7, Provider<PaymentAnalyticsRequestFactory> provider8, Provider<AnalyticsRequestExecutor> provider9, Provider<StripeRepository> provider10) {
        this.contextProvider = provider;
        this.googlePayRepositoryFactoryProvider = provider2;
        this.productUsageProvider = provider3;
        this.publishableKeyProvider = provider4;
        this.stripeAccountIdProvider = provider5;
        this.enableLoggingProvider = provider6;
        this.ioContextProvider = provider7;
        this.paymentAnalyticsRequestFactoryProvider = provider8;
        this.analyticsRequestExecutorProvider = provider9;
        this.stripeRepositoryProvider = provider10;
    }

    public static GooglePayPaymentMethodLauncher_Factory create(Provider<Context> provider, Provider<l<GooglePayEnvironment, GooglePayRepository>> provider2, Provider<Set<String>> provider3, Provider<h00.a<String>> provider4, Provider<h00.a<String>> provider5, Provider<Boolean> provider6, Provider<zz.g> provider7, Provider<PaymentAnalyticsRequestFactory> provider8, Provider<AnalyticsRequestExecutor> provider9, Provider<StripeRepository> provider10) {
        return new GooglePayPaymentMethodLauncher_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static GooglePayPaymentMethodLauncher newInstance(o0 o0Var, GooglePayPaymentMethodLauncher.Config config, GooglePayPaymentMethodLauncher.ReadyCallback readyCallback, androidx.activity.result.d<GooglePayPaymentMethodLauncherContract.Args> dVar, boolean z11, Context context, l<GooglePayEnvironment, GooglePayRepository> lVar, Set<String> set, h00.a<String> aVar, h00.a<String> aVar2, boolean z12, zz.g gVar, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, AnalyticsRequestExecutor analyticsRequestExecutor, StripeRepository stripeRepository) {
        return new GooglePayPaymentMethodLauncher(o0Var, config, readyCallback, dVar, z11, context, lVar, set, aVar, aVar2, z12, gVar, paymentAnalyticsRequestFactory, analyticsRequestExecutor, stripeRepository);
    }

    public GooglePayPaymentMethodLauncher get(o0 o0Var, GooglePayPaymentMethodLauncher.Config config, GooglePayPaymentMethodLauncher.ReadyCallback readyCallback, androidx.activity.result.d<GooglePayPaymentMethodLauncherContract.Args> dVar, boolean z11) {
        return newInstance(o0Var, config, readyCallback, dVar, z11, this.contextProvider.get(), this.googlePayRepositoryFactoryProvider.get(), this.productUsageProvider.get(), this.publishableKeyProvider.get(), this.stripeAccountIdProvider.get(), this.enableLoggingProvider.get().booleanValue(), this.ioContextProvider.get(), this.paymentAnalyticsRequestFactoryProvider.get(), this.analyticsRequestExecutorProvider.get(), this.stripeRepositoryProvider.get());
    }
}