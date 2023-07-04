package com.stripe.android.googlepaylauncher.injection;

import android.content.Context;
import com.google.android.gms.wallet.PaymentsClient;
import com.stripe.android.googlepaylauncher.DefaultGooglePayRepository;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayRepository;
import com.stripe.android.googlepaylauncher.PaymentsClientFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public abstract class GooglePayPaymentMethodLauncherModule {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PaymentsClient providePaymentsClient(Context context, GooglePayPaymentMethodLauncher.Config googlePayConfig, PaymentsClientFactory paymentsClientFactory) {
            s.g(context, "context");
            s.g(googlePayConfig, "googlePayConfig");
            s.g(paymentsClientFactory, "paymentsClientFactory");
            return paymentsClientFactory.create(googlePayConfig.getEnvironment());
        }
    }

    public abstract GooglePayRepository bindsGooglePayRepository(DefaultGooglePayRepository defaultGooglePayRepository);
}