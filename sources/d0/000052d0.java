package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.SetupIntent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class SetupIntentJsonParser implements ModelJsonParser<SetupIntent> {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_CANCELLATION_REASON = "cancellation_reason";
    @Deprecated
    private static final String FIELD_CLIENT_SECRET = "client_secret";
    @Deprecated
    private static final String FIELD_CREATED = "created";
    @Deprecated
    private static final String FIELD_DESCRIPTION = "description";
    @Deprecated
    private static final String FIELD_ID = "id";
    @Deprecated
    private static final String FIELD_LAST_SETUP_ERROR = "last_setup_error";
    @Deprecated
    private static final String FIELD_LIVEMODE = "livemode";
    @Deprecated
    private static final String FIELD_NEXT_ACTION = "next_action";
    @Deprecated
    private static final String FIELD_OBJECT = "object";
    @Deprecated
    private static final String FIELD_PAYMENT_METHOD = "payment_method";
    @Deprecated
    private static final String FIELD_PAYMENT_METHOD_TYPES = "payment_method_types";
    @Deprecated
    private static final String FIELD_STATUS = "status";
    @Deprecated
    private static final String FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES = "unactivated_payment_method_types";
    @Deprecated
    private static final String FIELD_USAGE = "usage";
    @Deprecated
    private static final String VALUE_SETUP_INTENT = "setup_intent";

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class ErrorJsonParser implements ModelJsonParser<SetupIntent.Error> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_CODE = "code";
        @Deprecated
        private static final String FIELD_DECLINE_CODE = "decline_code";
        @Deprecated
        private static final String FIELD_DOC_URL = "doc_url";
        @Deprecated
        private static final String FIELD_MESSAGE = "message";
        @Deprecated
        private static final String FIELD_PARAM = "param";
        @Deprecated
        private static final String FIELD_PAYMENT_METHOD = "payment_method";
        @Deprecated
        private static final String FIELD_TYPE = "type";

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public SetupIntent.Error parse(JSONObject json) {
            s.g(json, "json");
            String optString = StripeJsonUtils.optString(json, "code");
            String optString2 = StripeJsonUtils.optString(json, FIELD_DECLINE_CODE);
            String optString3 = StripeJsonUtils.optString(json, FIELD_DOC_URL);
            String optString4 = StripeJsonUtils.optString(json, FIELD_MESSAGE);
            String optString5 = StripeJsonUtils.optString(json, FIELD_PARAM);
            JSONObject optJSONObject = json.optJSONObject("payment_method");
            return new SetupIntent.Error(optString, optString2, optString3, optString4, optString5, optJSONObject == null ? null : new PaymentMethodJsonParser().parse(optJSONObject), SetupIntent.Error.Type.Companion.fromCode$payments_core_release(StripeJsonUtils.optString(json, "type")));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.stripe.android.model.SetupIntent parse(org.json.JSONObject r21) {
        /*
            r20 = this;
            r0 = r21
            java.lang.String r1 = "json"
            kotlin.jvm.internal.s.g(r0, r1)
            java.lang.String r1 = "object"
            java.lang.String r1 = com.stripe.android.core.model.StripeJsonUtils.optString(r0, r1)
            java.lang.String r2 = "setup_intent"
            boolean r1 = kotlin.jvm.internal.s.c(r2, r1)
            r2 = 0
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = "payment_method"
            org.json.JSONObject r3 = r0.optJSONObject(r1)
            if (r3 != 0) goto L21
            r12 = r2
            goto L2b
        L21:
            com.stripe.android.model.parsers.PaymentMethodJsonParser r4 = new com.stripe.android.model.parsers.PaymentMethodJsonParser
            r4.<init>()
            com.stripe.android.model.PaymentMethod r3 = r4.parse(r3)
            r12 = r3
        L2b:
            java.lang.String r1 = com.stripe.android.core.model.StripeJsonUtils.optString(r0, r1)
            if (r12 != 0) goto L33
            r3 = 1
            goto L34
        L33:
            r3 = 0
        L34:
            if (r3 == 0) goto L37
            goto L38
        L37:
            r1 = r2
        L38:
            if (r1 != 0) goto L40
            if (r12 != 0) goto L3e
            r13 = r2
            goto L41
        L3e:
            java.lang.String r1 = r12.f20932id
        L40:
            r13 = r1
        L41:
            com.stripe.android.core.model.parsers.ModelJsonParser$Companion r1 = com.stripe.android.core.model.parsers.ModelJsonParser.Companion
            java.lang.String r3 = "unactivated_payment_method_types"
            org.json.JSONArray r3 = r0.optJSONArray(r3)
            java.util.List r18 = r1.jsonArrayToList(r3)
            java.lang.String r3 = "id"
            java.lang.String r5 = com.stripe.android.core.model.StripeJsonUtils.optString(r0, r3)
            java.lang.String r3 = "created"
            long r7 = r0.optLong(r3)
            java.lang.String r3 = "client_secret"
            java.lang.String r9 = com.stripe.android.core.model.StripeJsonUtils.optString(r0, r3)
            com.stripe.android.model.SetupIntent$CancellationReason$Companion r3 = com.stripe.android.model.SetupIntent.CancellationReason.Companion
            java.lang.String r4 = "cancellation_reason"
            java.lang.String r4 = com.stripe.android.core.model.StripeJsonUtils.optString(r0, r4)
            com.stripe.android.model.SetupIntent$CancellationReason r6 = r3.fromCode$payments_core_release(r4)
            java.lang.String r3 = "description"
            java.lang.String r10 = com.stripe.android.core.model.StripeJsonUtils.optString(r0, r3)
            java.lang.String r3 = "livemode"
            boolean r11 = r0.optBoolean(r3)
            java.lang.String r3 = "payment_method_types"
            org.json.JSONArray r3 = r0.optJSONArray(r3)
            java.util.List r14 = r1.jsonArrayToList(r3)
            com.stripe.android.model.StripeIntent$Status$Companion r1 = com.stripe.android.model.StripeIntent.Status.Companion
            java.lang.String r3 = "status"
            java.lang.String r3 = com.stripe.android.core.model.StripeJsonUtils.optString(r0, r3)
            com.stripe.android.model.StripeIntent$Status r15 = r1.fromCode$payments_core_release(r3)
            com.stripe.android.model.StripeIntent$Usage$Companion r1 = com.stripe.android.model.StripeIntent.Usage.Companion
            java.lang.String r3 = "usage"
            java.lang.String r3 = com.stripe.android.core.model.StripeJsonUtils.optString(r0, r3)
            com.stripe.android.model.StripeIntent$Usage r16 = r1.fromCode$payments_core_release(r3)
            java.lang.String r1 = "last_setup_error"
            org.json.JSONObject r1 = r0.optJSONObject(r1)
            if (r1 != 0) goto La4
            r17 = r2
            goto Laf
        La4:
            com.stripe.android.model.parsers.SetupIntentJsonParser$ErrorJsonParser r3 = new com.stripe.android.model.parsers.SetupIntentJsonParser$ErrorJsonParser
            r3.<init>()
            com.stripe.android.model.SetupIntent$Error r1 = r3.parse(r1)
            r17 = r1
        Laf:
            java.lang.String r1 = "next_action"
            org.json.JSONObject r0 = r0.optJSONObject(r1)
            if (r0 != 0) goto Lb8
            goto Lc1
        Lb8:
            com.stripe.android.model.parsers.NextActionDataParser r1 = new com.stripe.android.model.parsers.NextActionDataParser
            r1.<init>()
            com.stripe.android.model.StripeIntent$NextActionData r2 = r1.parse(r0)
        Lc1:
            r19 = r2
            com.stripe.android.model.SetupIntent r0 = new com.stripe.android.model.SetupIntent
            r4 = r0
            r4.<init>(r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.parsers.SetupIntentJsonParser.parse(org.json.JSONObject):com.stripe.android.model.SetupIntent");
    }
}