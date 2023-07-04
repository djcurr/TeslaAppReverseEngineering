package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.paymentsheet.analytics.DefaultDeviceIdRepository;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter;
import com.stripe.android.paymentsheet.analytics.DeviceIdRepository;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.repositories.CustomerApiRepository;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.paymentsheet.repositories.StripeIntentRepository;
import h00.a;
import java.util.Locale;
import javax.inject.Provider;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import r3.g;

/* loaded from: classes6.dex */
public abstract class PaymentSheetCommonModule {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean provideEnabledLogging() {
            return false;
        }

        public final Locale provideLocale() {
            g d11 = g.d();
            if (d11.e()) {
                d11 = null;
            }
            if (d11 == null) {
                return null;
            }
            return d11.c(0);
        }

        public final PaymentConfiguration providePaymentConfiguration(Context appContext) {
            s.g(appContext, "appContext");
            return PaymentConfiguration.Companion.getInstance(appContext);
        }

        public final a<String> providePublishableKey(Provider<PaymentConfiguration> paymentConfiguration) {
            s.g(paymentConfiguration, "paymentConfiguration");
            return new PaymentSheetCommonModule$Companion$providePublishableKey$1(paymentConfiguration);
        }

        public final a<String> provideStripeAccountId(Provider<PaymentConfiguration> paymentConfiguration) {
            s.g(paymentConfiguration, "paymentConfiguration");
            return new PaymentSheetCommonModule$Companion$provideStripeAccountId$1(paymentConfiguration);
        }
    }

    public abstract CustomerRepository bindsCustomerRepository(CustomerApiRepository customerApiRepository);

    public abstract DeviceIdRepository bindsDeviceIdRepository(DefaultDeviceIdRepository defaultDeviceIdRepository);

    public abstract EventReporter bindsEventReporter(DefaultEventReporter defaultEventReporter);

    public abstract StripeIntentRepository bindsStripeIntentRepository(StripeIntentRepository.Api api);
}