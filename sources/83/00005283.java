package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.ConsumerSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import m00.i;
import m00.l;
import org.json.JSONArray;
import org.json.JSONObject;
import wz.n0;
import wz.w;
import wz.x;

/* loaded from: classes6.dex */
public final class ConsumerSessionJsonParser implements ModelJsonParser<ConsumerSession> {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_CONSUMER_SESSION = "consumer_session";
    @Deprecated
    private static final String FIELD_CONSUMER_SESSION_AUTH_SESSION_SECRET = "auth_session_client_secret";
    @Deprecated
    private static final String FIELD_CONSUMER_SESSION_EMAIL = "email_address";
    @Deprecated
    private static final String FIELD_CONSUMER_SESSION_PHONE = "redacted_phone_number";
    @Deprecated
    private static final String FIELD_CONSUMER_SESSION_SECRET = "client_secret";
    @Deprecated
    private static final String FIELD_CONSUMER_SESSION_VERIFICATION_SESSIONS = "verification_sessions";
    @Deprecated
    private static final String FIELD_VERIFICATION_SESSION_STATE = "state";
    @Deprecated
    private static final String FIELD_VERIFICATION_SESSION_TYPE = "type";

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final ConsumerSession.VerificationSession parseVerificationSession(JSONObject jSONObject) {
        ConsumerSession.VerificationSession.SessionType.Companion companion = ConsumerSession.VerificationSession.SessionType.Companion;
        String string = jSONObject.getString("type");
        s.f(string, "json.getString(FIELD_VERIFICATION_SESSION_TYPE)");
        Locale locale = Locale.ROOT;
        String lowerCase = string.toLowerCase(locale);
        s.f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        ConsumerSession.VerificationSession.SessionType fromValue = companion.fromValue(lowerCase);
        ConsumerSession.VerificationSession.SessionState.Companion companion2 = ConsumerSession.VerificationSession.SessionState.Companion;
        String string2 = jSONObject.getString(FIELD_VERIFICATION_SESSION_STATE);
        s.f(string2, "json.getString(FIELD_VERIFICATION_SESSION_STATE)");
        String lowerCase2 = string2.toLowerCase(locale);
        s.f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return new ConsumerSession.VerificationSession(fromValue, companion2.fromValue(lowerCase2));
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public ConsumerSession parse(JSONObject json) {
        i r11;
        int t11;
        s.g(json, "json");
        JSONObject optJSONObject = json.optJSONObject(FIELD_CONSUMER_SESSION);
        List list = null;
        if (optJSONObject == null) {
            return null;
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray(FIELD_CONSUMER_SESSION_VERIFICATION_SESSIONS);
        if (optJSONArray != null) {
            r11 = l.r(0, optJSONArray.length());
            t11 = x.t(r11, 10);
            ArrayList<JSONObject> arrayList = new ArrayList(t11);
            Iterator<Integer> it2 = r11.iterator();
            while (it2.hasNext()) {
                arrayList.add(optJSONArray.getJSONObject(((n0) it2).a()));
            }
            list = new ArrayList();
            for (JSONObject it3 : arrayList) {
                s.f(it3, "it");
                ConsumerSession.VerificationSession parseVerificationSession = parseVerificationSession(it3);
                if (parseVerificationSession != null) {
                    list.add(parseVerificationSession);
                }
            }
        }
        if (list == null) {
            list = w.i();
        }
        String string = optJSONObject.getString("client_secret");
        s.f(string, "consumerSessionJson.getS…_CONSUMER_SESSION_SECRET)");
        String string2 = optJSONObject.getString(FIELD_CONSUMER_SESSION_EMAIL);
        s.f(string2, "consumerSessionJson.getS…D_CONSUMER_SESSION_EMAIL)");
        String string3 = optJSONObject.getString(FIELD_CONSUMER_SESSION_PHONE);
        s.f(string3, "consumerSessionJson.getS…D_CONSUMER_SESSION_PHONE)");
        return new ConsumerSession(string, string2, string3, list, StripeJsonUtils.optString(json, FIELD_CONSUMER_SESSION_AUTH_SESSION_SECRET));
    }
}