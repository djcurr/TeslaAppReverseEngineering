package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.Address;
import com.stripe.android.model.Source;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;
import wz.x0;

/* loaded from: classes6.dex */
public final class SourceJsonParser implements ModelJsonParser<Source> {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_AMOUNT = "amount";
    @Deprecated
    private static final String FIELD_CLIENT_SECRET = "client_secret";
    @Deprecated
    private static final String FIELD_CODE_VERIFICATION = "code_verification";
    @Deprecated
    private static final String FIELD_CREATED = "created";
    @Deprecated
    private static final String FIELD_CURRENCY = "currency";
    @Deprecated
    private static final String FIELD_FLOW = "flow";
    @Deprecated
    private static final String FIELD_ID = "id";
    @Deprecated
    private static final String FIELD_KLARNA = "klarna";
    @Deprecated
    private static final String FIELD_LIVEMODE = "livemode";
    @Deprecated
    private static final String FIELD_OBJECT = "object";
    @Deprecated
    private static final String FIELD_OWNER = "owner";
    @Deprecated
    private static final String FIELD_RECEIVER = "receiver";
    @Deprecated
    private static final String FIELD_REDIRECT = "redirect";
    @Deprecated
    private static final String FIELD_SOURCE_ORDER = "source_order";
    @Deprecated
    private static final String FIELD_STATEMENT_DESCRIPTOR = "statement_descriptor";
    @Deprecated
    private static final String FIELD_STATUS = "status";
    @Deprecated
    private static final String FIELD_TYPE = "type";
    @Deprecated
    private static final String FIELD_USAGE = "usage";
    @Deprecated
    private static final String FIELD_WECHAT = "wechat";
    @Deprecated
    private static final Set<String> MODELED_TYPES;
    @Deprecated
    private static final String VALUE_CARD = "card";
    @Deprecated
    private static final String VALUE_SOURCE = "source";

    /* loaded from: classes6.dex */
    public static final class CodeVerificationJsonParser implements ModelJsonParser<Source.CodeVerification> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_ATTEMPTS_REMAINING = "attempts_remaining";
        @Deprecated
        private static final String FIELD_STATUS = "status";
        @Deprecated
        private static final int INVALID_ATTEMPTS_REMAINING = -1;

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public Source.CodeVerification parse(JSONObject json) {
            s.g(json, "json");
            return new Source.CodeVerification(json.optInt(FIELD_ATTEMPTS_REMAINING, -1), Source.CodeVerification.Status.Companion.fromCode(StripeJsonUtils.optString(json, "status")));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String asSourceType(String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -1920743119:
                        if (str.equals("bancontact")) {
                            return "bancontact";
                        }
                        break;
                    case -1414960566:
                        if (str.equals("alipay")) {
                            return "alipay";
                        }
                        break;
                    case -1128905083:
                        if (str.equals("klarna")) {
                            return "klarna";
                        }
                        break;
                    case -896955097:
                        if (str.equals("sofort")) {
                            return "sofort";
                        }
                        break;
                    case -825238221:
                        if (str.equals("three_d_secure")) {
                            return "three_d_secure";
                        }
                        break;
                    case -791770330:
                        if (str.equals("wechat")) {
                            return "wechat";
                        }
                        break;
                    case -284840886:
                        str.equals("unknown");
                        break;
                    case 100648:
                        if (str.equals("eps")) {
                            return "eps";
                        }
                        break;
                    case 109234:
                        if (str.equals("p24")) {
                            return "p24";
                        }
                        break;
                    case 3046160:
                        if (str.equals("card")) {
                            return "card";
                        }
                        break;
                    case 38358441:
                        if (str.equals("giropay")) {
                            return "giropay";
                        }
                        break;
                    case 100048981:
                        if (str.equals("ideal")) {
                            return "ideal";
                        }
                        break;
                    case 1251821346:
                        if (str.equals("multibanco")) {
                            return "multibanco";
                        }
                        break;
                    case 1636477296:
                        if (str.equals("sepa_debit")) {
                            return "sepa_debit";
                        }
                        break;
                }
            }
            return "unknown";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Source fromCardJson(JSONObject jSONObject) {
            return new Source(StripeJsonUtils.optString(jSONObject, "id"), null, null, null, null, null, null, null, null, null, null, null, null, new SourceCardDataJsonParser().parse(jSONObject), "card", "card", null, null, null, null, null, 2039806, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0115, code lost:
            if ((r7 instanceof com.stripe.android.model.Source.CodeVerification) == false) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.stripe.android.model.Source fromSourceJson(org.json.JSONObject r29) {
            /*
                Method dump skipped, instructions count: 594
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.parsers.SourceJsonParser.Companion.fromSourceJson(org.json.JSONObject):com.stripe.android.model.Source");
        }

        private final /* synthetic */ <T extends StripeModel> T optStripeJsonModel(JSONObject jSONObject, String str) {
            JSONObject optJSONObject;
            T parse;
            JSONObject optJSONObject2;
            JSONObject optJSONObject3;
            JSONObject optJSONObject4;
            JSONObject optJSONObject5;
            JSONObject optJSONObject6;
            T t11 = null;
            if (jSONObject.has(str)) {
                switch (str.hashCode()) {
                    case -808719889:
                        if (str.equals(SourceJsonParser.FIELD_RECEIVER) && (optJSONObject = jSONObject.optJSONObject(SourceJsonParser.FIELD_RECEIVER)) != null) {
                            parse = new ReceiverJsonParser().parse(optJSONObject);
                            t11 = parse;
                            break;
                        }
                        break;
                    case -776144932:
                        if (str.equals("redirect") && (optJSONObject2 = jSONObject.optJSONObject("redirect")) != null) {
                            parse = new RedirectJsonParser().parse(optJSONObject2);
                            t11 = parse;
                            break;
                        }
                        break;
                    case 3046160:
                        if (str.equals("card") && (optJSONObject3 = jSONObject.optJSONObject("card")) != null) {
                            parse = new SourceCardDataJsonParser().parse(optJSONObject3);
                            t11 = parse;
                            break;
                        }
                        break;
                    case 106164915:
                        if (str.equals(SourceJsonParser.FIELD_OWNER) && (optJSONObject4 = jSONObject.optJSONObject(SourceJsonParser.FIELD_OWNER)) != null) {
                            parse = new OwnerJsonParser().parse(optJSONObject4);
                            t11 = parse;
                            break;
                        }
                        break;
                    case 1615551277:
                        if (str.equals(SourceJsonParser.FIELD_CODE_VERIFICATION) && (optJSONObject5 = jSONObject.optJSONObject(SourceJsonParser.FIELD_CODE_VERIFICATION)) != null) {
                            parse = new CodeVerificationJsonParser().parse(optJSONObject5);
                            t11 = parse;
                            break;
                        }
                        break;
                    case 1636477296:
                        if (str.equals("sepa_debit") && (optJSONObject6 = jSONObject.optJSONObject("sepa_debit")) != null) {
                            parse = new SourceSepaDebitDataJsonParser().parse(optJSONObject6);
                            t11 = parse;
                            break;
                        }
                        break;
                }
                s.m(2, "T");
                return t11;
            }
            return null;
        }
    }

    /* loaded from: classes6.dex */
    public static final class KlarnaJsonParser implements ModelJsonParser<Source.Klarna> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_CLIENT_TOKEN = "client_token";
        @Deprecated
        private static final String FIELD_CUSTOM_PAYMENT_METHODS = "custom_payment_methods";
        @Deprecated
        private static final String FIELD_FIRST_NAME = "first_name";
        @Deprecated
        private static final String FIELD_LAST_NAME = "last_name";
        @Deprecated
        private static final String FIELD_PAYMENT_METHOD_CATEGORIES = "payment_method_categories";
        @Deprecated
        private static final String FIELD_PAY_LATER_ASSET_URLS_DESCRIPTIVE = "pay_later_asset_urls_descriptive";
        @Deprecated
        private static final String FIELD_PAY_LATER_ASSET_URLS_STANDARD = "pay_later_asset_urls_standard";
        @Deprecated
        private static final String FIELD_PAY_LATER_NAME = "pay_later_name";
        @Deprecated
        private static final String FIELD_PAY_LATER_REDIRECT_URL = "pay_later_redirect_url";
        @Deprecated
        private static final String FIELD_PAY_NOW_ASSET_URLS_DESCRIPTIVE = "pay_now_asset_urls_descriptive";
        @Deprecated
        private static final String FIELD_PAY_NOW_ASSET_URLS_STANDARD = "pay_now_asset_urls_standard";
        @Deprecated
        private static final String FIELD_PAY_NOW_NAME = "pay_now_name";
        @Deprecated
        private static final String FIELD_PAY_NOW_REDIRECT_URL = "pay_now_redirect_url";
        @Deprecated
        private static final String FIELD_PAY_OVER_TIME_ASSET_URLS_DESCRIPTIVE = "pay_over_time_asset_urls_descriptive";
        @Deprecated
        private static final String FIELD_PAY_OVER_TIME_ASSET_URLS_STANDARD = "pay_over_time_asset_urls_standard";
        @Deprecated
        private static final String FIELD_PAY_OVER_TIME_NAME = "pay_over_time_name";
        @Deprecated
        private static final String FIELD_PAY_OVER_TIME_REDIRECT_URL = "pay_over_time_redirect_url";
        @Deprecated
        private static final String FIELD_PURCHASE_COUNTRY = "purchase_country";

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0008, code lost:
            r8 = kotlin.text.w.E0(r0, new java.lang.String[]{","}, false, 0, 6, null);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final java.util.Set<java.lang.String> parseSet(org.json.JSONObject r7, java.lang.String r8) {
            /*
                r6 = this;
                java.lang.String r0 = com.stripe.android.core.model.StripeJsonUtils.optString(r7, r8)
                r7 = 0
                if (r0 != 0) goto L8
                goto L1d
            L8:
                java.lang.String r8 = ","
                java.lang.String[] r1 = new java.lang.String[]{r8}
                r2 = 0
                r3 = 0
                r4 = 6
                r5 = 0
                java.util.List r8 = kotlin.text.m.E0(r0, r1, r2, r3, r4, r5)
                if (r8 != 0) goto L19
                goto L1d
            L19:
                java.util.Set r7 = wz.u.S0(r8)
            L1d:
                if (r7 != 0) goto L23
                java.util.Set r7 = wz.v0.d()
            L23:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.parsers.SourceJsonParser.KlarnaJsonParser.parseSet(org.json.JSONObject, java.lang.String):java.util.Set");
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public Source.Klarna parse(JSONObject json) {
            s.g(json, "json");
            return new Source.Klarna(StripeJsonUtils.optString(json, FIELD_FIRST_NAME), StripeJsonUtils.optString(json, FIELD_LAST_NAME), StripeJsonUtils.optString(json, FIELD_PURCHASE_COUNTRY), StripeJsonUtils.optString(json, FIELD_CLIENT_TOKEN), StripeJsonUtils.optString(json, FIELD_PAY_NOW_ASSET_URLS_DESCRIPTIVE), StripeJsonUtils.optString(json, FIELD_PAY_NOW_ASSET_URLS_STANDARD), StripeJsonUtils.optString(json, FIELD_PAY_NOW_NAME), StripeJsonUtils.optString(json, FIELD_PAY_NOW_REDIRECT_URL), StripeJsonUtils.optString(json, FIELD_PAY_LATER_ASSET_URLS_DESCRIPTIVE), StripeJsonUtils.optString(json, FIELD_PAY_LATER_ASSET_URLS_STANDARD), StripeJsonUtils.optString(json, FIELD_PAY_LATER_NAME), StripeJsonUtils.optString(json, FIELD_PAY_LATER_REDIRECT_URL), StripeJsonUtils.optString(json, FIELD_PAY_OVER_TIME_ASSET_URLS_DESCRIPTIVE), StripeJsonUtils.optString(json, FIELD_PAY_OVER_TIME_ASSET_URLS_STANDARD), StripeJsonUtils.optString(json, FIELD_PAY_OVER_TIME_NAME), StripeJsonUtils.optString(json, FIELD_PAY_OVER_TIME_REDIRECT_URL), parseSet(json, FIELD_PAYMENT_METHOD_CATEGORIES), parseSet(json, FIELD_CUSTOM_PAYMENT_METHODS));
        }
    }

    /* loaded from: classes6.dex */
    public static final class OwnerJsonParser implements ModelJsonParser<Source.Owner> {
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

    /* loaded from: classes6.dex */
    public static final class ReceiverJsonParser implements ModelJsonParser<Source.Receiver> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_ADDRESS = "address";
        @Deprecated
        private static final String FIELD_AMOUNT_CHARGED = "amount_charged";
        @Deprecated
        private static final String FIELD_AMOUNT_RECEIVED = "amount_received";
        @Deprecated
        private static final String FIELD_AMOUNT_RETURNED = "amount_returned";

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public Source.Receiver parse(JSONObject json) {
            s.g(json, "json");
            return new Source.Receiver(StripeJsonUtils.optString(json, "address"), json.optLong(FIELD_AMOUNT_CHARGED), json.optLong(FIELD_AMOUNT_RECEIVED), json.optLong(FIELD_AMOUNT_RETURNED));
        }
    }

    /* loaded from: classes6.dex */
    public static final class RedirectJsonParser implements ModelJsonParser<Source.Redirect> {
        public static final Companion Companion = new Companion(null);
        private static final String FIELD_RETURN_URL = "return_url";
        private static final String FIELD_STATUS = "status";
        private static final String FIELD_URL = "url";

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public Source.Redirect parse(JSONObject json) {
            s.g(json, "json");
            return new Source.Redirect(StripeJsonUtils.optString(json, "return_url"), Source.Redirect.Status.Companion.fromCode(StripeJsonUtils.optString(json, "status")), StripeJsonUtils.optString(json, "url"));
        }
    }

    static {
        Set<String> i11;
        i11 = x0.i("card", "sepa_debit");
        MODELED_TYPES = i11;
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public Source parse(JSONObject json) {
        s.g(json, "json");
        String optString = json.optString(FIELD_OBJECT);
        if (s.c(optString, "card")) {
            return Companion.fromCardJson(json);
        }
        if (s.c(optString, "source")) {
            return Companion.fromSourceJson(json);
        }
        return null;
    }
}