package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.Card;
import com.stripe.android.model.CardFunding;
import com.stripe.android.model.TokenizationMethod;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class CardJsonParser implements ModelJsonParser<Card> {
    public static final Companion Companion = new Companion(null);
    private static final String FIELD_ADDRESS_CITY = "address_city";
    private static final String FIELD_ADDRESS_COUNTRY = "address_country";
    private static final String FIELD_ADDRESS_LINE1 = "address_line1";
    private static final String FIELD_ADDRESS_LINE1_CHECK = "address_line1_check";
    private static final String FIELD_ADDRESS_LINE2 = "address_line2";
    private static final String FIELD_ADDRESS_STATE = "address_state";
    private static final String FIELD_ADDRESS_ZIP = "address_zip";
    private static final String FIELD_ADDRESS_ZIP_CHECK = "address_zip_check";
    private static final String FIELD_BRAND = "brand";
    private static final String FIELD_COUNTRY = "country";
    private static final String FIELD_CURRENCY = "currency";
    private static final String FIELD_CUSTOMER = "customer";
    private static final String FIELD_CVC_CHECK = "cvc_check";
    private static final String FIELD_EXP_MONTH = "exp_month";
    private static final String FIELD_EXP_YEAR = "exp_year";
    private static final String FIELD_FINGERPRINT = "fingerprint";
    private static final String FIELD_FUNDING = "funding";
    private static final String FIELD_ID = "id";
    private static final String FIELD_LAST4 = "last4";
    private static final String FIELD_NAME = "name";
    private static final String FIELD_OBJECT = "object";
    private static final String FIELD_TOKENIZATION_METHOD = "tokenization_method";
    public static final String VALUE_CARD = "card";

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public Card parse(JSONObject json) {
        s.g(json, "json");
        if (s.c("card", json.optString(FIELD_OBJECT))) {
            StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
            Integer optInteger = stripeJsonUtils.optInteger(json, FIELD_EXP_MONTH);
            Integer valueOf = Integer.valueOf(optInteger == null ? -1 : optInteger.intValue());
            int intValue = valueOf.intValue();
            Integer num = !(intValue < 1 || intValue > 12) ? valueOf : null;
            Integer optInteger2 = stripeJsonUtils.optInteger(json, FIELD_EXP_YEAR);
            Integer valueOf2 = Integer.valueOf(optInteger2 != null ? optInteger2.intValue() : -1);
            Integer num2 = !(valueOf2.intValue() < 0) ? valueOf2 : null;
            String optString = StripeJsonUtils.optString(json, FIELD_ADDRESS_CITY);
            String optString2 = StripeJsonUtils.optString(json, FIELD_ADDRESS_LINE1);
            String optString3 = StripeJsonUtils.optString(json, FIELD_ADDRESS_LINE1_CHECK);
            String optString4 = StripeJsonUtils.optString(json, FIELD_ADDRESS_LINE2);
            String optString5 = StripeJsonUtils.optString(json, FIELD_ADDRESS_COUNTRY);
            return new Card(num, num2, StripeJsonUtils.optString(json, "name"), optString2, optString3, optString4, optString, StripeJsonUtils.optString(json, FIELD_ADDRESS_STATE), StripeJsonUtils.optString(json, FIELD_ADDRESS_ZIP), StripeJsonUtils.optString(json, FIELD_ADDRESS_ZIP_CHECK), optString5, StripeJsonUtils.optString(json, FIELD_LAST4), Card.Companion.getCardBrand(StripeJsonUtils.optString(json, "brand")), CardFunding.Companion.fromCode(StripeJsonUtils.optString(json, FIELD_FUNDING)), StripeJsonUtils.optString(json, FIELD_FINGERPRINT), stripeJsonUtils.optCountryCode(json, "country"), StripeJsonUtils.optCurrency(json, FIELD_CURRENCY), StripeJsonUtils.optString(json, "customer"), StripeJsonUtils.optString(json, FIELD_CVC_CHECK), StripeJsonUtils.optString(json, "id"), TokenizationMethod.Companion.fromCode(StripeJsonUtils.optString(json, FIELD_TOKENIZATION_METHOD)));
        }
        return null;
    }
}