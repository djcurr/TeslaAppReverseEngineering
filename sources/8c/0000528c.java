package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.FinancialConnectionsSession;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class FinancialConnectionsSessionJsonParser implements ModelJsonParser<FinancialConnectionsSession> {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_CLIENT_SECRET = "client_secret";
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
    public FinancialConnectionsSession parse(JSONObject json) {
        s.g(json, "json");
        return new FinancialConnectionsSession(StripeJsonUtils.optString(json, "client_secret"), StripeJsonUtils.optString(json, "id"));
    }
}