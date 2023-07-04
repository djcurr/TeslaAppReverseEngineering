package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.RadarSession;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class RadarSessionJsonParser implements ModelJsonParser<RadarSession> {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_ID = "id";

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public RadarSession parse(JSONObject json) {
        s.g(json, "json");
        String optString = StripeJsonUtils.optString(json, "id");
        if (optString == null) {
            return null;
        }
        return new RadarSession(optString);
    }
}