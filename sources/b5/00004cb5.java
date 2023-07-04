package com.stripe.android.core.model.parsers;

import com.stripe.android.core.StripeError;
import com.stripe.android.core.model.StripeJsonUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;
import vz.q;
import vz.r;

/* loaded from: classes2.dex */
public final class StripeErrorJsonParser implements ModelJsonParser<StripeError> {
    public static final Companion Companion = new Companion(null);
    private static final String FIELD_CHARGE = "charge";
    private static final String FIELD_CODE = "code";
    private static final String FIELD_DECLINE_CODE = "decline_code";
    private static final String FIELD_DOC_URL = "doc_url";
    private static final String FIELD_ERROR = "error";
    private static final String FIELD_MESSAGE = "message";
    private static final String FIELD_PARAM = "param";
    private static final String FIELD_TYPE = "type";
    public static final String MALFORMED_RESPONSE_MESSAGE = "An improperly formatted error response was found.";

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getMALFORMED_RESPONSE_MESSAGE$stripe_core_release$annotations() {
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public StripeError parse(JSONObject json) {
        StripeError b11;
        s.g(json, "json");
        try {
            q.a aVar = q.f54772b;
            JSONObject jSONObject = json.getJSONObject(FIELD_ERROR);
            String optString = StripeJsonUtils.optString(jSONObject, FIELD_CHARGE);
            String optString2 = StripeJsonUtils.optString(jSONObject, "code");
            String optString3 = StripeJsonUtils.optString(jSONObject, FIELD_DECLINE_CODE);
            b11 = q.b(new StripeError(StripeJsonUtils.optString(jSONObject, "type"), StripeJsonUtils.optString(jSONObject, FIELD_MESSAGE), optString2, StripeJsonUtils.optString(jSONObject, FIELD_PARAM), optString3, optString, StripeJsonUtils.optString(jSONObject, FIELD_DOC_URL)));
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        StripeError stripeError = new StripeError(null, MALFORMED_RESPONSE_MESSAGE, null, null, null, null, null, 125, null);
        if (q.g(b11)) {
            b11 = stripeError;
        }
        return (StripeError) b11;
    }
}