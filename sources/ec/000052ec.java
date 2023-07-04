package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.SourceTypeModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class SourceSepaDebitDataJsonParser implements ModelJsonParser<SourceTypeModel.SepaDebit> {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_BANK_CODE = "bank_code";
    @Deprecated
    private static final String FIELD_BRANCH_CODE = "branch_code";
    @Deprecated
    private static final String FIELD_COUNTRY = "country";
    @Deprecated
    private static final String FIELD_FINGERPRINT = "fingerprint";
    @Deprecated
    private static final String FIELD_LAST4 = "last4";
    @Deprecated
    private static final String FIELD_MANDATE_REFERENCE = "mandate_reference";
    @Deprecated
    private static final String FIELD_MANDATE_URL = "mandate_url";

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public SourceTypeModel.SepaDebit parse(JSONObject json) {
        s.g(json, "json");
        return new SourceTypeModel.SepaDebit(StripeJsonUtils.optString(json, FIELD_BANK_CODE), StripeJsonUtils.optString(json, FIELD_BRANCH_CODE), StripeJsonUtils.optString(json, "country"), StripeJsonUtils.optString(json, FIELD_FINGERPRINT), StripeJsonUtils.optString(json, FIELD_LAST4), StripeJsonUtils.optString(json, FIELD_MANDATE_REFERENCE), StripeJsonUtils.optString(json, FIELD_MANDATE_URL));
    }
}