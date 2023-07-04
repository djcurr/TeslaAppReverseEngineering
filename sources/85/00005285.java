package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.ConsumerSessionLookup;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class ConsumerSessionLookupJsonParser implements ModelJsonParser<ConsumerSessionLookup> {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_ERROR_MESSAGE = "error_message";
    @Deprecated
    private static final String FIELD_EXISTS = "exists";

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public ConsumerSessionLookup parse(JSONObject json) {
        s.g(json, "json");
        return new ConsumerSessionLookup(StripeJsonUtils.INSTANCE.optBoolean(json, FIELD_EXISTS), new ConsumerSessionJsonParser().parse(json), StripeJsonUtils.optString(json, FIELD_ERROR_MESSAGE));
    }
}