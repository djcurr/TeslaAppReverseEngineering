package com.stripe.android.model.parsers;

import com.stripe.android.model.SetupIntent;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class PaymentMethodPreferenceForSetupIntentJsonParser extends PaymentMethodPreferenceJsonParser<SetupIntent> {
    private final String stripeIntentFieldName;

    public PaymentMethodPreferenceForSetupIntentJsonParser() {
        super(null);
        this.stripeIntentFieldName = "setup_intent";
    }

    @Override // com.stripe.android.model.parsers.PaymentMethodPreferenceJsonParser
    public String getStripeIntentFieldName() {
        return this.stripeIntentFieldName;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.stripe.android.model.parsers.PaymentMethodPreferenceJsonParser
    public SetupIntent parseStripeIntent(JSONObject stripeIntentJson) {
        s.g(stripeIntentJson, "stripeIntentJson");
        return new SetupIntentJsonParser().parse(stripeIntentJson);
    }
}