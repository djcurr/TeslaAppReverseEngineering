package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.Address;
import com.stripe.android.model.PaymentIntent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class PaymentIntentJsonParser implements ModelJsonParser<PaymentIntent> {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_AMOUNT = "amount";
    @Deprecated
    private static final String FIELD_CANCELED_AT = "canceled_at";
    @Deprecated
    private static final String FIELD_CANCELLATION_REASON = "cancellation_reason";
    @Deprecated
    private static final String FIELD_CAPTURE_METHOD = "capture_method";
    @Deprecated
    private static final String FIELD_CLIENT_SECRET = "client_secret";
    @Deprecated
    private static final String FIELD_CONFIRMATION_METHOD = "confirmation_method";
    @Deprecated
    private static final String FIELD_CREATED = "created";
    @Deprecated
    private static final String FIELD_CURRENCY = "currency";
    @Deprecated
    private static final String FIELD_DESCRIPTION = "description";
    @Deprecated
    private static final String FIELD_ID = "id";
    @Deprecated
    private static final String FIELD_LAST_PAYMENT_ERROR = "last_payment_error";
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
    private static final String FIELD_RECEIPT_EMAIL = "receipt_email";
    @Deprecated
    private static final String FIELD_SETUP_FUTURE_USAGE = "setup_future_usage";
    @Deprecated
    private static final String FIELD_SHIPPING = "shipping";
    @Deprecated
    private static final String FIELD_STATUS = "status";
    @Deprecated
    private static final String FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES = "unactivated_payment_method_types";
    @Deprecated
    private static final String OBJECT_TYPE = "payment_intent";

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class ErrorJsonParser implements ModelJsonParser<PaymentIntent.Error> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_CHARGE = "charge";
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
        public PaymentIntent.Error parse(JSONObject json) {
            s.g(json, "json");
            String optString = StripeJsonUtils.optString(json, FIELD_CHARGE);
            String optString2 = StripeJsonUtils.optString(json, "code");
            String optString3 = StripeJsonUtils.optString(json, FIELD_DECLINE_CODE);
            String optString4 = StripeJsonUtils.optString(json, FIELD_DOC_URL);
            String optString5 = StripeJsonUtils.optString(json, FIELD_MESSAGE);
            String optString6 = StripeJsonUtils.optString(json, FIELD_PARAM);
            JSONObject optJSONObject = json.optJSONObject("payment_method");
            return new PaymentIntent.Error(optString, optString2, optString3, optString4, optString5, optString6, optJSONObject == null ? null : new PaymentMethodJsonParser().parse(optJSONObject), PaymentIntent.Error.Type.Companion.fromCode(StripeJsonUtils.optString(json, "type")));
        }
    }

    /* loaded from: classes6.dex */
    public static final class ShippingJsonParser implements ModelJsonParser<PaymentIntent.Shipping> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_ADDRESS = "address";
        @Deprecated
        private static final String FIELD_CARRIER = "carrier";
        @Deprecated
        private static final String FIELD_NAME = "name";
        @Deprecated
        private static final String FIELD_PHONE = "phone";
        @Deprecated
        private static final String FIELD_TRACKING_NUMBER = "tracking_number";

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentIntent.Shipping parse(JSONObject json) {
            s.g(json, "json");
            JSONObject optJSONObject = json.optJSONObject("address");
            Address parse = optJSONObject == null ? null : new AddressJsonParser().parse(optJSONObject);
            if (parse == null) {
                parse = new Address(null, null, null, null, null, null, 63, null);
            }
            return new PaymentIntent.Shipping(parse, StripeJsonUtils.optString(json, FIELD_CARRIER), StripeJsonUtils.optString(json, "name"), StripeJsonUtils.optString(json, "phone"), StripeJsonUtils.optString(json, FIELD_TRACKING_NUMBER));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0101  */
    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.stripe.android.model.PaymentIntent parse(org.json.JSONObject r29) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.parsers.PaymentIntentJsonParser.parse(org.json.JSONObject):com.stripe.android.model.PaymentIntent");
    }
}