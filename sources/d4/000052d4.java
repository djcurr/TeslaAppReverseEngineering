package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.ShippingInformation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class ShippingInformationJsonParser implements ModelJsonParser<ShippingInformation> {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_ADDRESS = "address";
    @Deprecated
    private static final String FIELD_NAME = "name";
    @Deprecated
    private static final String FIELD_PHONE = "phone";

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public ShippingInformation parse(JSONObject json) {
        s.g(json, "json");
        JSONObject optJSONObject = json.optJSONObject("address");
        return new ShippingInformation(optJSONObject == null ? null : new AddressJsonParser().parse(optJSONObject), StripeJsonUtils.optString(json, "name"), StripeJsonUtils.optString(json, "phone"));
    }
}