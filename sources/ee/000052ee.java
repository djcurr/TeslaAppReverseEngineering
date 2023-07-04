package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import m00.i;
import m00.l;
import org.json.JSONArray;
import org.json.JSONObject;
import vz.v;
import wz.n0;
import wz.r0;
import wz.s0;
import wz.x;

/* loaded from: classes6.dex */
public final class Stripe3ds2AuthResultJsonParser implements ModelJsonParser<Stripe3ds2AuthResult> {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_ARES = "ares";
    @Deprecated
    private static final String FIELD_CREATED = "created";
    @Deprecated
    private static final String FIELD_CREQ = "creq";
    @Deprecated
    private static final String FIELD_ERROR = "error";
    @Deprecated
    private static final String FIELD_FALLBACK_REDIRECT_URL = "fallback_redirect_url";
    @Deprecated
    private static final String FIELD_ID = "id";
    @Deprecated
    private static final String FIELD_LIVEMODE = "livemode";
    @Deprecated
    private static final String FIELD_SOURCE = "source";
    @Deprecated
    private static final String FIELD_STATE = "state";

    /* loaded from: classes6.dex */
    public static final class AresJsonParser implements ModelJsonParser<Stripe3ds2AuthResult.Ares> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_ACS_CHALLENGE_MANDATED = "acsChallengeMandated";
        @Deprecated
        private static final String FIELD_ACS_SIGNED_CONTENT = "acsSignedContent";
        @Deprecated
        private static final String FIELD_ACS_TRANS_ID = "acsTransID";
        @Deprecated
        private static final String FIELD_ACS_URL = "acsURL";
        @Deprecated
        private static final String FIELD_AUTHENTICATION_TYPE = "authenticationType";
        @Deprecated
        private static final String FIELD_CARDHOLDER_INFO = "cardholderInfo";
        @Deprecated
        private static final String FIELD_MESSAGE_EXTENSION = "messageExtension";
        @Deprecated
        private static final String FIELD_MESSAGE_TYPE = "messageType";
        @Deprecated
        private static final String FIELD_MESSAGE_VERSION = "messageVersion";
        @Deprecated
        private static final String FIELD_SDK_TRANS_ID = "sdkTransID";
        @Deprecated
        private static final String FIELD_THREE_DS_SERVER_TRANS_ID = "threeDSServerTransID";
        @Deprecated
        private static final String FIELD_TRANS_STATUS = "transStatus";

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public Stripe3ds2AuthResult.Ares parse(JSONObject json) {
            s.g(json, "json");
            String optString = StripeJsonUtils.optString(json, "threeDSServerTransID");
            String optString2 = StripeJsonUtils.optString(json, FIELD_ACS_CHALLENGE_MANDATED);
            String optString3 = StripeJsonUtils.optString(json, FIELD_ACS_SIGNED_CONTENT);
            String string = json.getString("acsTransID");
            String optString4 = StripeJsonUtils.optString(json, "acsURL");
            String optString5 = StripeJsonUtils.optString(json, FIELD_AUTHENTICATION_TYPE);
            String optString6 = StripeJsonUtils.optString(json, FIELD_CARDHOLDER_INFO);
            String string2 = json.getString("messageType");
            String string3 = json.getString("messageVersion");
            String optString7 = StripeJsonUtils.optString(json, "sdkTransID");
            String optString8 = StripeJsonUtils.optString(json, FIELD_TRANS_STATUS);
            JSONArray optJSONArray = json.optJSONArray(FIELD_MESSAGE_EXTENSION);
            return new Stripe3ds2AuthResult.Ares(optString, optString2, optString3, string, optString4, optString5, optString6, optJSONArray == null ? null : new MessageExtensionJsonParser().parse(optJSONArray), string2, string3, optString7, optString8);
        }
    }

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class MessageExtensionJsonParser implements ModelJsonParser<Stripe3ds2AuthResult.MessageExtension> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_CRITICALITY_INDICATOR = "criticalityIndicator";
        @Deprecated
        private static final String FIELD_DATA = "data";
        @Deprecated
        private static final String FIELD_ID = "id";
        @Deprecated
        private static final String FIELD_NAME = "name";

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final List<Stripe3ds2AuthResult.MessageExtension> parse(JSONArray jsonArray) {
            i r11;
            int t11;
            s.g(jsonArray, "jsonArray");
            r11 = l.r(0, jsonArray.length());
            ArrayList<JSONObject> arrayList = new ArrayList();
            Iterator<Integer> it2 = r11.iterator();
            while (it2.hasNext()) {
                JSONObject optJSONObject = jsonArray.optJSONObject(((n0) it2).a());
                if (optJSONObject != null) {
                    arrayList.add(optJSONObject);
                }
            }
            t11 = x.t(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(t11);
            for (JSONObject jSONObject : arrayList) {
                arrayList2.add(parse(jSONObject));
            }
            return arrayList2;
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public Stripe3ds2AuthResult.MessageExtension parse(JSONObject json) {
            Map i11;
            Map v11;
            i r11;
            int t11;
            int t12;
            Map f11;
            s.g(json, "json");
            JSONObject optJSONObject = json.optJSONObject("data");
            if (optJSONObject != null) {
                JSONArray names = optJSONObject.names();
                if (names == null) {
                    names = new JSONArray();
                }
                r11 = l.r(0, names.length());
                t11 = x.t(r11, 10);
                ArrayList<String> arrayList = new ArrayList(t11);
                Iterator<Integer> it2 = r11.iterator();
                while (it2.hasNext()) {
                    arrayList.add(names.getString(((n0) it2).a()));
                }
                t12 = x.t(arrayList, 10);
                ArrayList<Map> arrayList2 = new ArrayList(t12);
                for (String str : arrayList) {
                    f11 = r0.f(v.a(str, optJSONObject.getString(str)));
                    arrayList2.add(f11);
                }
                i11 = s0.i();
                for (Map map : arrayList2) {
                    i11 = s0.p(i11, map);
                }
            } else {
                i11 = s0.i();
            }
            String optString = StripeJsonUtils.optString(json, "name");
            boolean optBoolean = json.optBoolean("criticalityIndicator");
            String optString2 = StripeJsonUtils.optString(json, "id");
            v11 = s0.v(i11);
            return new Stripe3ds2AuthResult.MessageExtension(optString, optBoolean, optString2, v11);
        }
    }

    /* loaded from: classes6.dex */
    public static final class ThreeDS2ErrorJsonParser implements ModelJsonParser<Stripe3ds2AuthResult.ThreeDS2Error> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_ACS_TRANS_ID = "acsTransID";
        @Deprecated
        private static final String FIELD_DS_TRANS_ID = "dsTransID";
        @Deprecated
        private static final String FIELD_ERROR_CODE = "errorCode";
        @Deprecated
        private static final String FIELD_ERROR_COMPONENT = "errorComponent";
        @Deprecated
        private static final String FIELD_ERROR_DESCRIPTION = "errorDescription";
        @Deprecated
        private static final String FIELD_ERROR_DETAIL = "errorDetail";
        @Deprecated
        private static final String FIELD_ERROR_MESSAGE_TYPE = "errorMessageType";
        @Deprecated
        private static final String FIELD_MESSAGE_TYPE = "messageType";
        @Deprecated
        private static final String FIELD_MESSAGE_VERSION = "messageVersion";
        @Deprecated
        private static final String FIELD_SDK_TRANS_ID = "sdkTransID";
        @Deprecated
        private static final String FIELD_THREE_DS_SERVER_TRANS_ID = "threeDSServerTransID";

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public Stripe3ds2AuthResult.ThreeDS2Error parse(JSONObject json) {
            s.g(json, "json");
            return new Stripe3ds2AuthResult.ThreeDS2Error(json.getString("threeDSServerTransID"), StripeJsonUtils.optString(json, "acsTransID"), StripeJsonUtils.optString(json, FIELD_DS_TRANS_ID), json.getString(FIELD_ERROR_CODE), json.getString(FIELD_ERROR_COMPONENT), json.getString(FIELD_ERROR_DESCRIPTION), json.getString(FIELD_ERROR_DETAIL), StripeJsonUtils.optString(json, FIELD_ERROR_MESSAGE_TYPE), json.getString("messageType"), json.getString("messageVersion"), StripeJsonUtils.optString(json, "sdkTransID"));
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public Stripe3ds2AuthResult parse(JSONObject json) {
        s.g(json, "json");
        String string = json.getString("id");
        long j11 = json.getLong(FIELD_CREATED);
        boolean z11 = json.getBoolean(FIELD_LIVEMODE);
        String string2 = json.getString("source");
        String optString = json.optString(FIELD_STATE);
        JSONObject optJSONObject = json.optJSONObject(FIELD_ARES);
        Stripe3ds2AuthResult.Ares parse = optJSONObject == null ? null : new AresJsonParser().parse(optJSONObject);
        JSONObject optJSONObject2 = json.optJSONObject(FIELD_ERROR);
        return new Stripe3ds2AuthResult(string, parse, Long.valueOf(j11), string2, optString, z11, optJSONObject2 != null ? new ThreeDS2ErrorJsonParser().parse(optJSONObject2) : null, StripeJsonUtils.optString(json, FIELD_FALLBACK_REDIRECT_URL), StripeJsonUtils.optString(json, FIELD_CREQ));
    }
}