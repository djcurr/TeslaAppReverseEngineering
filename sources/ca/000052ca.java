package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.StripeIntent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class PaymentMethodPreferenceJsonParser<StripeIntentType extends StripeIntent> implements ModelJsonParser<StripeIntentType> {
    protected static final Companion Companion = new Companion(null);
    private static final String FIELD_OBJECT = "object";
    private static final String FIELD_ORDERED_PAYMENT_METHOD_TYPES = "ordered_payment_method_types";
    private static final String FIELD_PAYMENT_METHOD_TYPES = "payment_method_types";
    private static final String FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES = "unactivated_payment_method_types";
    private static final String OBJECT_TYPE = "payment_method_preference";

    /* loaded from: classes6.dex */
    protected static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private PaymentMethodPreferenceJsonParser() {
    }

    public /* synthetic */ PaymentMethodPreferenceJsonParser(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getStripeIntentFieldName();

    public abstract StripeIntentType parseStripeIntent(JSONObject jSONObject);

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public StripeIntentType parse(JSONObject json) {
        s.g(json, "json");
        StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
        JSONObject mapToJsonObject = stripeJsonUtils.mapToJsonObject(stripeJsonUtils.optMap(json, OBJECT_TYPE));
        String optString = StripeJsonUtils.optString(mapToJsonObject, FIELD_OBJECT);
        if (mapToJsonObject == null || !s.c(OBJECT_TYPE, optString)) {
            return null;
        }
        JSONArray optJSONArray = mapToJsonObject.optJSONArray(FIELD_ORDERED_PAYMENT_METHOD_TYPES);
        JSONArray optJSONArray2 = json.optJSONArray(FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES);
        JSONObject optJSONObject = mapToJsonObject.optJSONObject(getStripeIntentFieldName());
        if (optJSONObject == null) {
            return null;
        }
        optJSONObject.put(FIELD_PAYMENT_METHOD_TYPES, optJSONArray);
        optJSONObject.put(FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES, optJSONArray2);
        return parseStripeIntent(optJSONObject);
    }
}