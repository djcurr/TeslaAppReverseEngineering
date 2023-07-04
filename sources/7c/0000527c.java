package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.BankAccount;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class BankAccountJsonParser implements ModelJsonParser<BankAccount> {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_ACCOUNT_HOLDER_NAME = "account_holder_name";
    @Deprecated
    private static final String FIELD_ACCOUNT_HOLDER_TYPE = "account_holder_type";
    @Deprecated
    private static final String FIELD_BANK_NAME = "bank_name";
    @Deprecated
    private static final String FIELD_COUNTRY = "country";
    @Deprecated
    private static final String FIELD_CURRENCY = "currency";
    @Deprecated
    private static final String FIELD_FINGERPRINT = "fingerprint";
    @Deprecated
    private static final String FIELD_ID = "id";
    @Deprecated
    private static final String FIELD_LAST4 = "last4";
    @Deprecated
    private static final String FIELD_ROUTING_NUMBER = "routing_number";
    @Deprecated
    private static final String FIELD_STATUS = "status";

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public BankAccount parse(JSONObject json) {
        s.g(json, "json");
        return new BankAccount(StripeJsonUtils.optString(json, "id"), StripeJsonUtils.optString(json, FIELD_ACCOUNT_HOLDER_NAME), BankAccount.Type.Companion.fromCode$payments_model_release(StripeJsonUtils.optString(json, FIELD_ACCOUNT_HOLDER_TYPE)), StripeJsonUtils.optString(json, FIELD_BANK_NAME), StripeJsonUtils.INSTANCE.optCountryCode(json, "country"), StripeJsonUtils.optCurrency(json, FIELD_CURRENCY), StripeJsonUtils.optString(json, FIELD_FINGERPRINT), StripeJsonUtils.optString(json, FIELD_LAST4), StripeJsonUtils.optString(json, FIELD_ROUTING_NUMBER), BankAccount.Status.Companion.fromCode$payments_model_release(StripeJsonUtils.optString(json, "status")));
    }
}