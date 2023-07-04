package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.Card;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.CardFunding;
import com.stripe.android.model.SourceTypeModel;
import com.stripe.android.model.TokenizationMethod;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class SourceCardDataJsonParser implements ModelJsonParser<SourceTypeModel.Card> {
    public static final Companion Companion = new Companion(null);
    private static final String FIELD_ADDRESS_LINE1_CHECK = "address_line1_check";
    private static final String FIELD_ADDRESS_ZIP_CHECK = "address_zip_check";
    private static final String FIELD_BRAND = "brand";
    private static final String FIELD_COUNTRY = "country";
    private static final String FIELD_CVC_CHECK = "cvc_check";
    private static final String FIELD_DYNAMIC_LAST4 = "dynamic_last4";
    private static final String FIELD_EXP_MONTH = "exp_month";
    private static final String FIELD_EXP_YEAR = "exp_year";
    private static final String FIELD_FUNDING = "funding";
    private static final String FIELD_LAST4 = "last4";
    private static final String FIELD_THREE_D_SECURE = "three_d_secure";
    private static final String FIELD_TOKENIZATION_METHOD = "tokenization_method";

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public SourceTypeModel.Card parse(JSONObject json) {
        s.g(json, "json");
        String optString = StripeJsonUtils.optString(json, FIELD_ADDRESS_LINE1_CHECK);
        String optString2 = StripeJsonUtils.optString(json, FIELD_ADDRESS_ZIP_CHECK);
        CardBrand cardBrand = Card.Companion.getCardBrand(StripeJsonUtils.optString(json, "brand"));
        String optString3 = StripeJsonUtils.optString(json, "country");
        String optString4 = StripeJsonUtils.optString(json, FIELD_CVC_CHECK);
        String optString5 = StripeJsonUtils.optString(json, FIELD_DYNAMIC_LAST4);
        StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
        return new SourceTypeModel.Card(optString, optString2, cardBrand, optString3, optString4, optString5, stripeJsonUtils.optInteger(json, FIELD_EXP_MONTH), stripeJsonUtils.optInteger(json, FIELD_EXP_YEAR), CardFunding.Companion.fromCode(StripeJsonUtils.optString(json, FIELD_FUNDING)), StripeJsonUtils.optString(json, FIELD_LAST4), SourceTypeModel.Card.ThreeDSecureStatus.Companion.fromCode(StripeJsonUtils.optString(json, "three_d_secure")), TokenizationMethod.Companion.fromCode(StripeJsonUtils.optString(json, FIELD_TOKENIZATION_METHOD)));
    }
}