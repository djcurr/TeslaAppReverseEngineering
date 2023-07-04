package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.networking.FraudDetectionData;
import h00.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class FraudDetectionDataJsonParser implements ModelJsonParser<FraudDetectionData> {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_GUID = "guid";
    @Deprecated
    private static final String FIELD_MUID = "muid";
    @Deprecated
    private static final String FIELD_SID = "sid";
    private final a<Long> timestampSupplier;

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FraudDetectionDataJsonParser(a<Long> timestampSupplier) {
        s.g(timestampSupplier, "timestampSupplier");
        this.timestampSupplier = timestampSupplier;
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public FraudDetectionData parse(JSONObject json) {
        String optString;
        String optString2;
        s.g(json, "json");
        String optString3 = StripeJsonUtils.optString(json, FIELD_GUID);
        if (optString3 == null || (optString = StripeJsonUtils.optString(json, FIELD_MUID)) == null || (optString2 = StripeJsonUtils.optString(json, FIELD_SID)) == null) {
            return null;
        }
        return new FraudDetectionData(optString3, optString, optString2, this.timestampSupplier.invoke().longValue());
    }
}