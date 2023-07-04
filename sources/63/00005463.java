package com.stripe.android.payments.core.injection;

import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeRepository;

/* loaded from: classes6.dex */
public abstract class StripeRepositoryModule {
    public static final int $stable = 0;

    public abstract AnalyticsRequestExecutor bindsAnalyticsRequestExecutor$payments_core_release(DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor);

    public abstract StripeRepository bindsStripeRepository$payments_core_release(StripeApiRepository stripeApiRepository);
}