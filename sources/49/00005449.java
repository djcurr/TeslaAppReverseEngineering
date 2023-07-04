package com.stripe.android.payments.core.injection;

import android.content.Context;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.injection.UIContext;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel;
import h00.a;
import java.util.Set;
import zz.g;

/* loaded from: classes6.dex */
public interface PaymentLauncherComponent {

    /* loaded from: classes6.dex */
    public interface Builder {
        Builder analyticsRequestFactory(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory);

        PaymentLauncherComponent build();

        Builder context(Context context);

        Builder enableLogging(boolean z11);

        Builder ioContext(@IOContext g gVar);

        Builder productUsage(Set<String> set);

        Builder publishableKeyProvider(a<String> aVar);

        Builder stripeAccountIdProvider(a<String> aVar);

        Builder stripeRepository(StripeRepository stripeRepository);

        Builder uiContext(@UIContext g gVar);
    }

    void inject(PaymentLauncherViewModel.Factory factory);
}