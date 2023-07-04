package com.stripe.android.payments.core.injection;

import android.content.Context;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.core.injection.UIContext;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.core.authentication.DefaultPaymentAuthenticatorRegistry;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModelFactory;
import h00.a;
import java.util.Map;
import java.util.Set;
import zz.g;

/* loaded from: classes6.dex */
public interface AuthenticationComponent {

    /* loaded from: classes6.dex */
    public interface Builder {
        Builder analyticsRequestExecutor(AnalyticsRequestExecutor analyticsRequestExecutor);

        Builder analyticsRequestFactory(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory);

        AuthenticationComponent build();

        Builder context(Context context);

        Builder enableLogging(boolean z11);

        Builder injectorKey(@InjectorKey String str);

        Builder isInstantApp(boolean z11);

        Builder productUsage(Set<String> set);

        Builder publishableKeyProvider(a<String> aVar);

        Builder stripeRepository(StripeRepository stripeRepository);

        Builder threeDs1IntentReturnUrlMap(Map<String, String> map);

        Builder uiContext(@UIContext g gVar);

        Builder workContext(@IOContext g gVar);
    }

    DefaultPaymentAuthenticatorRegistry getRegistry();

    void inject(Stripe3ds2TransactionViewModelFactory stripe3ds2TransactionViewModelFactory);
}