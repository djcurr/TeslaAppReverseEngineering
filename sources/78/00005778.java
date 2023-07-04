package com.stripe.android.paymentsheet.repositories;

import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentsheet.model.ClientSecret;
import java.util.Locale;
import javax.inject.Provider;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import v20.i;
import zz.d;
import zz.g;

/* loaded from: classes6.dex */
public abstract class StripeIntentRepository {

    /* loaded from: classes6.dex */
    public static final class Api extends StripeIntentRepository {
        public static final int $stable = 8;
        private final Provider<PaymentConfiguration> lazyPaymentConfig;
        private final Locale locale;
        private final StripeRepository stripeRepository;
        private final g workContext;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Api(StripeRepository stripeRepository, Provider<PaymentConfiguration> lazyPaymentConfig, @IOContext g workContext, Locale locale) {
            super(null);
            s.g(stripeRepository, "stripeRepository");
            s.g(lazyPaymentConfig, "lazyPaymentConfig");
            s.g(workContext, "workContext");
            this.stripeRepository = stripeRepository;
            this.lazyPaymentConfig = lazyPaymentConfig;
            this.workContext = workContext;
            this.locale = locale;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ApiRequest.Options getRequestOptions() {
            return new ApiRequest.Options(this.lazyPaymentConfig.get().getPublishableKey(), this.lazyPaymentConfig.get().getStripeAccountId(), null, 4, null);
        }

        @Override // com.stripe.android.paymentsheet.repositories.StripeIntentRepository
        public Object get(ClientSecret clientSecret, d<? super StripeIntent> dVar) {
            return i.g(this.workContext, new StripeIntentRepository$Api$get$2(clientSecret, this, null), dVar);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Static extends StripeIntentRepository {
        public static final int $stable = 8;
        private final StripeIntent stripeIntent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Static(StripeIntent stripeIntent) {
            super(null);
            s.g(stripeIntent, "stripeIntent");
            this.stripeIntent = stripeIntent;
        }

        @Override // com.stripe.android.paymentsheet.repositories.StripeIntentRepository
        public Object get(ClientSecret clientSecret, d<? super StripeIntent> dVar) {
            return this.stripeIntent;
        }
    }

    private StripeIntentRepository() {
    }

    public /* synthetic */ StripeIntentRepository(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Object get(ClientSecret clientSecret, d<? super StripeIntent> dVar);
}