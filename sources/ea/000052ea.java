package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.Address;
import com.stripe.android.model.Source;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class SourceOwnerJsonParser implements ModelJsonParser<Source.Owner> {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_ADDRESS = "address";
    @Deprecated
    private static final String FIELD_EMAIL = "email";
    @Deprecated
    private static final String FIELD_NAME = "name";
    @Deprecated
    private static final String FIELD_PHONE = "phone";
    @Deprecated
    private static final String FIELD_VERIFIED_ADDRESS = "verified_address";
    @Deprecated
    private static final String FIELD_VERIFIED_EMAIL = "verified_email";
    @Deprecated
    private static final String FIELD_VERIFIED_NAME = "verified_name";
    @Deprecated
    private static final String FIELD_VERIFIED_PHONE = "verified_phone";

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public Source.Owner parse(JSONObject json) {
        s.g(json, "json");
        JSONObject optJSONObject = json.optJSONObject("address");
        Address parse = optJSONObject == null ? null : new AddressJsonParser().parse(optJSONObject);
        String optString = StripeJsonUtils.optString(json, "email");
        String optString2 = StripeJsonUtils.optString(json, "name");
        String optString3 = StripeJsonUtils.optString(json, "phone");
        JSONObject optJSONObject2 = json.optJSONObject(FIELD_VERIFIED_ADDRESS);
        return new Source.Owner(parse, optString, optString2, optString3, optJSONObject2 != null ? new AddressJsonParser().parse(optJSONObject2) : null, StripeJsonUtils.optString(json, FIELD_VERIFIED_EMAIL), StripeJsonUtils.optString(json, FIELD_VERIFIED_NAME), StripeJsonUtils.optString(json, FIELD_VERIFIED_PHONE));
    }
}