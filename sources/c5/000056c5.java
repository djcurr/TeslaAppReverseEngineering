package com.stripe.android.paymentsheet.model;

import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.paymentsheet.model.PaymentSelection;
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

        public final ConfirmStripeIntentParamsFactory<ConfirmStripeIntentParams> createFactory(ClientSecret clientSecret) {
            s.g(clientSecret, "clientSecret");
            if (clientSecret instanceof PaymentIntentClientSecret) {
                return new ConfirmPaymentIntentParamsFactory(clientSecret);
            }
            if (clientSecret instanceof SetupIntentClientSecret) {
                return new ConfirmSetupIntentParamsFactory(clientSecret);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    private ConfirmStripeIntentParamsFactory() {
    }

    public /* synthetic */ ConfirmStripeIntentParamsFactory(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract T create(PaymentSelection.New r12);

    public abstract T create(PaymentSelection.Saved saved);
}