package com.stripe.android.link.confirmation;

import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public abstract class ConfirmStripeIntentParamsFactory<T extends ConfirmStripeIntentParams> {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ConfirmStripeIntentParamsFactory<ConfirmStripeIntentParams> createFactory(StripeIntent stripeIntent) {
            s.g(stripeIntent, "stripeIntent");
            if (stripeIntent instanceof PaymentIntent) {
                return new ConfirmPaymentIntentParamsFactory((PaymentIntent) stripeIntent);
            }
            if (stripeIntent instanceof SetupIntent) {
                return new ConfirmSetupIntentParamsFactory((SetupIntent) stripeIntent);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    private ConfirmStripeIntentParamsFactory() {
    }

    public /* synthetic */ ConfirmStripeIntentParamsFactory(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentMethodCreateParams createPaymentMethodCreateParams$default(ConfirmStripeIntentParamsFactory confirmStripeIntentParamsFactory, String str, ConsumerPaymentDetails.PaymentDetails paymentDetails, Map map, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                map = null;
            }
            return confirmStripeIntentParamsFactory.createPaymentMethodCreateParams(str, paymentDetails, map);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createPaymentMethodCreateParams");
    }

    public abstract T createConfirmStripeIntentParams(PaymentMethodCreateParams paymentMethodCreateParams);

    public abstract PaymentMethodCreateParams createPaymentMethodCreateParams(String str, ConsumerPaymentDetails.PaymentDetails paymentDetails, Map<String, ? extends Object> map);
}