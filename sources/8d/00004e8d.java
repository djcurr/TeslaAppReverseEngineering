package com.stripe.android.googlepaylauncher.injection;

import android.content.Context;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import h00.a;
import zz.g;

/* loaded from: classes6.dex */
public abstract class GooglePayPaymentMethodLauncherComponent {

    /* loaded from: classes6.dex */
    public interface Builder {
        Builder analyticsRequestFactory(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory);

        GooglePayPaymentMethodLauncherComponent build();

        Builder context(Context context);

        Builder enableLogging(boolean z11);

        Builder googlePayConfig(GooglePayPaymentMethodLauncher.Config config);

        Builder ioContext(@IOContext g gVar);

        Builder publishableKeyProvider(a<String> aVar);

        Builder stripeAccountIdProvider(a<String> aVar);

        Builder stripeRepository(StripeRepository stripeRepository);
    }

    public abstract void inject(GooglePayPaymentMethodLauncherViewModel.Factory factory);
}