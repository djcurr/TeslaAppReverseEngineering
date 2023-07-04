package com.stripe.android.paymentsheet.model;

import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import kotlin.jvm.internal.s;
import kotlin.text.o;

/* loaded from: classes6.dex */
public final class StripeIntentValidator {
    public final /* synthetic */ StripeIntent requireValid(StripeIntent stripeIntent) {
        String f11;
        String f12;
        String f13;
        s.g(stripeIntent, "stripeIntent");
        boolean z11 = stripeIntent instanceof PaymentIntent;
        if (z11) {
            PaymentIntent paymentIntent = (PaymentIntent) stripeIntent;
            if (paymentIntent.getConfirmationMethod() != PaymentIntent.ConfirmationMethod.Automatic) {
                f13 = o.f("\n                        PaymentIntent with confirmation_method='automatic' is required.\n                        The current PaymentIntent has confirmation_method '" + paymentIntent.getConfirmationMethod() + "'.\n                        See https://stripe.com/docs/api/payment_intents/object#payment_intent_object-confirmation_method.\n                    ");
                throw new IllegalStateException(f13.toString());
            }
        }
        if (z11 && (stripeIntent.getStatus() == StripeIntent.Status.Canceled || stripeIntent.getStatus() == StripeIntent.Status.Succeeded || stripeIntent.getStatus() == StripeIntent.Status.RequiresCapture)) {
            f12 = o.f("\n                        PaymentSheet cannot set up a PaymentIntent in status '" + stripeIntent.getStatus() + "'.\n                        See https://stripe.com/docs/api/payment_intents/object#payment_intent_object-status.\n                    ");
            throw new IllegalStateException(f12.toString());
        } else if ((stripeIntent instanceof SetupIntent) && (stripeIntent.getStatus() == StripeIntent.Status.Canceled || stripeIntent.getStatus() == StripeIntent.Status.Succeeded)) {
            f11 = o.f("\n                        PaymentSheet cannot set up a SetupIntent in status '" + stripeIntent.getStatus() + "'.\n                        See https://stripe.com/docs/api/setup_intents/object#setup_intent_object-status\n                    ");
            throw new IllegalStateException(f11.toString());
        } else {
            return stripeIntent;
        }
    }
}