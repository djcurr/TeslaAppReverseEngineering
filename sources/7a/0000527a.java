package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.Address;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class AddressJsonParser implements ModelJsonParser<Address> {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_CITY = "city";
    @Deprecated
    private static final String FIELD_COUNTRY = "country";
    @Deprecated
    private static final String FIELD_LINE_1 = "line1";
    @Deprecated
    private static final String FIELD_LINE_2 = "line2";
    @Deprecated
    private static final String FIELD_POSTAL_CODE = "postal_code";
    @Deprecated
    private static final String FIELD_STATE = "state";

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public Address parse(JSONObject json) {
        s.g(json, "json");
        return new Address(StripeJsonUtils.optString(json, FIELD_CITY), StripeJsonUtils.optString(json, "country"), StripeJsonUtils.optString(json, FIELD_LINE_1), StripeJsonUtils.optString(json, FIELD_LINE_2), StripeJsonUtils.optString(json, "postal_code"), StripeJsonUtils.optString(json, FIELD_STATE));
    }
}