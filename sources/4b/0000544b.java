package com.stripe.android.payments.core.injection;

import android.content.Context;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.injection.UIContext;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.core.authentication.DefaultPaymentAuthenticatorRegistry;
import com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry;
import ek.a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.s;
import zz.g;

/* loaded from: classes6.dex */
public final class PaymentLauncherModule {
    public final DefaultReturnUrl provideDefaultReturnUrl(Context context) {
        s.g(context, "context");
        return DefaultReturnUrl.Companion.create(context);
    }

    public final boolean provideIsInstantApp(Context context) {
        s.g(context, "context");
        return a.c(context);
    }

    public final PaymentAuthenticatorRegistry providePaymentAuthenticatorRegistry(Context context, StripeRepository stripeRepository, boolean z11, @IOContext g workContext, @UIContext g uiContext, Map<String, String> threeDs1IntentReturnUrlMap, DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, h00.a<String> publishableKeyProvider, Set<String> productUsage, boolean z12) {
        s.g(context, "context");
        s.g(stripeRepository, "stripeRepository");
        s.g(workContext, "workContext");
        s.g(uiContext, "uiContext");
        s.g(threeDs1IntentReturnUrlMap, "threeDs1IntentReturnUrlMap");
        s.g(defaultAnalyticsRequestExecutor, "defaultAnalyticsRequestExecutor");
        s.g(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        s.g(publishableKeyProvider, "publishableKeyProvider");
        s.g(productUsage, "productUsage");
        return DefaultPaymentAuthenticatorRegistry.Companion.createInstance(context, stripeRepository, defaultAnalyticsRequestExecutor, paymentAnalyticsRequestFactory, z11, workContext, uiContext, threeDs1IntentReturnUrlMap, publishableKeyProvider, productUsage, z12);
    }

    public final Map<String, String> provideThreeDs1IntentReturnUrlMap() {
        return new LinkedHashMap();
    }
}