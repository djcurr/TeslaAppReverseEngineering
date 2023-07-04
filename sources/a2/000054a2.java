package com.stripe.android.payments.paymentlauncher;

import android.content.Context;
import androidx.activity.result.d;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import java.util.Set;
import javax.inject.Provider;
import zz.g;

/* loaded from: classes6.dex */
public final class StripePaymentLauncher_Factory {
    private final Provider<Context> contextProvider;
    private final Provider<Boolean> enableLoggingProvider;
    private final Provider<g> ioContextProvider;
    private final Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
    private final Provider<Set<String>> productUsageProvider;
    private final Provider<StripeRepository> stripeRepositoryProvider;
    private final Provider<g> uiContextProvider;

    public StripePaymentLauncher_Factory(Provider<Context> provider, Provider<Boolean> provider2, Provider<g> provider3, Provider<g> provider4, Provider<StripeRepository> provider5, Provider<PaymentAnalyticsRequestFactory> provider6, Provider<Set<String>> provider7) {
        this.contextProvider = provider;
        this.enableLoggingProvider = provider2;
        this.ioContextProvider = provider3;
        this.uiContextProvider = provider4;
        this.stripeRepositoryProvider = provider5;
        this.paymentAnalyticsRequestFactoryProvider = provider6;
        this.productUsageProvider = provider7;
    }

    public static StripePaymentLauncher_Factory create(Provider<Context> provider, Provider<Boolean> provider2, Provider<g> provider3, Provider<g> provider4, Provider<StripeRepository> provider5, Provider<PaymentAnalyticsRequestFactory> provider6, Provider<Set<String>> provider7) {
        return new StripePaymentLauncher_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static StripePaymentLauncher newInstance(h00.a<String> aVar, h00.a<String> aVar2, d<PaymentLauncherContract.Args> dVar, Context context, boolean z11, g gVar, g gVar2, StripeRepository stripeRepository, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Set<String> set) {
        return new StripePaymentLauncher(aVar, aVar2, dVar, context, z11, gVar, gVar2, stripeRepository, paymentAnalyticsRequestFactory, set);
    }

    public StripePaymentLauncher get(h00.a<String> aVar, h00.a<String> aVar2, d<PaymentLauncherContract.Args> dVar) {
        return newInstance(aVar, aVar2, dVar, this.contextProvider.get(), this.enableLoggingProvider.get().booleanValue(), this.ioContextProvider.get(), this.uiContextProvider.get(), this.stripeRepositoryProvider.get(), this.paymentAnalyticsRequestFactoryProvider.get(), this.productUsageProvider.get());
    }
}