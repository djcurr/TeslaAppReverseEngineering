package com.stripe.android.model.parsers;

import com.stripe.android.model.PaymentIntent;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class PaymentMethodPreferenceForPaymentIntentJsonParser extends PaymentMethodPreferenceJsonParser<PaymentIntent> {
    private final String stripeIntentFieldName;

    public PaymentMethodPreferenceForPaymentIntentJsonParser() {
        super(null);
        this.stripeIntentFieldName = "payment_intent";
    }

    @Override // com.stripe.android.model.parsers.PaymentMethodPreferenceJsonParser
    public String getStripeIntentFieldName() {
        return this.stripeIntentFieldName;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.stripe.android.model.parsers.PaymentMethodPreferenceJsonParser
    public PaymentIntent parseStripeIntent(JSONObject stripeIntentJson) {
        s.g(stripeIntentJson, "stripeIntentJson");
        return new PaymentIntentJsonParser().parse(stripeIntentJson);
    }
}