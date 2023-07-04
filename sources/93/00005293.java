package com.stripe.android.model.parsers;

import android.net.Uri;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.MicrodepositType;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.WeChat;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;
import wz.e0;
import wz.w;

/* loaded from: classes6.dex */
public final class NextActionDataParser implements ModelJsonParser<StripeIntent.NextActionData> {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_NEXT_ACTION_TYPE = "type";

    /* loaded from: classes6.dex */
    public static final class AlipayRedirectParser implements ModelJsonParser<StripeIntent.NextActionData.AlipayRedirect> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        public static final String FIELD_NATIVE_DATA = "native_data";
        @Deprecated
        public static final String FIELD_RETURN_URL = "return_url";
        @Deprecated
        public static final String FIELD_URL = "url";

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public StripeIntent.NextActionData.AlipayRedirect parse(JSONObject json) {
            s.g(json, "json");
            String string = json.getString(FIELD_NATIVE_DATA);
            s.f(string, "json.getString(FIELD_NATIVE_DATA)");
            String string2 = json.getString("url");
            s.f(string2, "json.getString(FIELD_URL)");
            return new StripeIntent.NextActionData.AlipayRedirect(string, string2, StripeJsonUtils.optString(json, "return_url"));
        }
    }

    /* loaded from: classes6.dex */
    public static final class BlikAuthorizeParser implements ModelJsonParser<StripeIntent.NextActionData.BlikAuthorize> {
        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public StripeIntent.NextActionData.BlikAuthorize parse(JSONObject json) {
            s.g(json, "json");
            return StripeIntent.NextActionData.BlikAuthorize.INSTANCE;
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

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class DisplayOxxoDetailsJsonParser implements ModelJsonParser<StripeIntent.NextActionData.DisplayOxxoDetails> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_EXPIRES_AFTER = "expires_after";
        @Deprecated
        private static final String FIELD_HOSTED_VOUCHER_URL = "hosted_voucher_url";
        @Deprecated
        private static final String FIELD_NUMBER = "number";

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public StripeIntent.NextActionData.DisplayOxxoDetails parse(JSONObject json) {
            s.g(json, "json");
            return new StripeIntent.NextActionData.DisplayOxxoDetails(json.optInt(FIELD_EXPIRES_AFTER), StripeJsonUtils.optString(json, FIELD_NUMBER), StripeJsonUtils.optString(json, FIELD_HOSTED_VOUCHER_URL));
        }
    }

    /* loaded from: classes6.dex */
    public static final class RedirectToUrlParser implements ModelJsonParser<StripeIntent.NextActionData.RedirectToUrl> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        public static final String FIELD_RETURN_URL = "return_url";
        @Deprecated
        public static final String FIELD_URL = "url";

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public StripeIntent.NextActionData.RedirectToUrl parse(JSONObject json) {
            s.g(json, "json");
            if (json.has("url")) {
                Uri parse = Uri.parse(json.getString("url"));
                s.f(parse, "parse(json.getString(FIELD_URL))");
                return new StripeIntent.NextActionData.RedirectToUrl(parse, json.optString("return_url"));
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class SdkDataJsonParser implements ModelJsonParser<StripeIntent.NextActionData.SdkData> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_CERTIFICATE = "certificate";
        @Deprecated
        private static final String FIELD_DIRECTORY_SERVER_ENCRYPTION = "directory_server_encryption";
        @Deprecated
        private static final String FIELD_DIRECTORY_SERVER_ID = "directory_server_id";
        @Deprecated
        private static final String FIELD_DIRECTORY_SERVER_NAME = "directory_server_name";
        @Deprecated
        private static final String FIELD_KEY_ID = "key_id";
        @Deprecated
        private static final String FIELD_ROOT_CAS = "root_certificate_authorities";
        @Deprecated
        private static final String FIELD_SERVER_TRANSACTION_ID = "server_transaction_id";
        @Deprecated
        private static final String FIELD_STRIPE_JS = "stripe_js";
        @Deprecated
        private static final String FIELD_THREE_D_SECURE_2_SOURCE = "three_d_secure_2_source";
        @Deprecated
        private static final String FIELD_TYPE = "type";
        @Deprecated
        private static final String TYPE_3DS1 = "three_d_secure_redirect";
        @Deprecated
        private static final String TYPE_3DS2 = "stripe_3ds2_fingerprint";

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private final StripeIntent.NextActionData.SdkData.Use3DS2.DirectoryServerEncryption parseDirectoryServerEncryption(JSONObject jSONObject) {
            List i11;
            List list;
            List jsonArrayToList = StripeJsonUtils.INSTANCE.jsonArrayToList(jSONObject.optJSONArray(FIELD_ROOT_CAS));
            if (jsonArrayToList == null) {
                list = null;
            } else {
                i11 = w.i();
                for (Object obj : jsonArrayToList) {
                    if (obj instanceof String) {
                        i11 = e0.z0(i11, obj);
                    }
                }
                list = i11;
            }
            if (list == null) {
                list = w.i();
            }
            String optString = jSONObject.optString(FIELD_DIRECTORY_SERVER_ID);
            s.f(optString, "json.optString(FIELD_DIRECTORY_SERVER_ID)");
            String optString2 = jSONObject.optString(FIELD_CERTIFICATE);
            s.f(optString2, "json.optString(FIELD_CERTIFICATE)");
            return new StripeIntent.NextActionData.SdkData.Use3DS2.DirectoryServerEncryption(optString, optString2, list, jSONObject.optString(FIELD_KEY_ID));
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public StripeIntent.NextActionData.SdkData parse(JSONObject json) {
            s.g(json, "json");
            String optString = StripeJsonUtils.optString(json, "type");
            if (s.c(optString, TYPE_3DS1)) {
                String optString2 = json.optString(FIELD_STRIPE_JS);
                s.f(optString2, "json.optString(FIELD_STRIPE_JS)");
                return new StripeIntent.NextActionData.SdkData.Use3DS1(optString2);
            } else if (s.c(optString, TYPE_3DS2)) {
                String optString3 = json.optString(FIELD_THREE_D_SECURE_2_SOURCE);
                s.f(optString3, "json.optString(FIELD_THREE_D_SECURE_2_SOURCE)");
                String optString4 = json.optString(FIELD_DIRECTORY_SERVER_NAME);
                s.f(optString4, "json.optString(FIELD_DIRECTORY_SERVER_NAME)");
                String optString5 = json.optString(FIELD_SERVER_TRANSACTION_ID);
                s.f(optString5, "json.optString(FIELD_SERVER_TRANSACTION_ID)");
                JSONObject optJSONObject = json.optJSONObject(FIELD_DIRECTORY_SERVER_ENCRYPTION);
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                return new StripeIntent.NextActionData.SdkData.Use3DS2(optString3, optString4, optString5, parseDirectoryServerEncryption(optJSONObject));
            } else {
                return null;
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class VerifyWithMicrodepositsParser implements ModelJsonParser<StripeIntent.NextActionData.VerifyWithMicrodeposits> {
        @Deprecated
        private static final String ARRIVAL_DATE = "arrival_date";
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String HOSTED_VERIFICATION_URL = "hosted_verification_url";
        @Deprecated
        private static final String MICRODEPOSIT_TYPE = "microdeposit_type";

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private final MicrodepositType parseMicrodepositType(JSONObject jSONObject) {
            MicrodepositType microdepositType;
            MicrodepositType[] values = MicrodepositType.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    microdepositType = null;
                    break;
                }
                microdepositType = values[i11];
                if (s.c(microdepositType.getValue(), jSONObject.optString(MICRODEPOSIT_TYPE))) {
                    break;
                }
                i11++;
            }
            return microdepositType == null ? MicrodepositType.UNKNOWN : microdepositType;
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public StripeIntent.NextActionData.VerifyWithMicrodeposits parse(JSONObject json) {
            s.g(json, "json");
            long optLong = json.optLong(ARRIVAL_DATE);
            String optString = json.optString(HOSTED_VERIFICATION_URL);
            s.f(optString, "json.optString(HOSTED_VERIFICATION_URL)");
            return new StripeIntent.NextActionData.VerifyWithMicrodeposits(optLong, optString, parseMicrodepositType(json));
        }
    }

    /* loaded from: classes6.dex */
    public static final class WeChatPayRedirectParser implements ModelJsonParser<StripeIntent.NextActionData.WeChatPayRedirect> {
        @Deprecated
        private static final String APP_ID = "app_id";
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String NONCE_STR = "nonce_str";
        @Deprecated
        private static final String PACKAGE = "package";
        @Deprecated
        private static final String PARTNER_ID = "partner_id";
        @Deprecated
        private static final String PREPAY_ID = "prepay_id";
        @Deprecated
        private static final String SIGN = "sign";
        @Deprecated
        private static final String TIMESTAMP = "timestamp";

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public StripeIntent.NextActionData.WeChatPayRedirect parse(JSONObject json) {
            s.g(json, "json");
            return new StripeIntent.NextActionData.WeChatPayRedirect(new WeChat(null, json.optString("app_id"), json.optString(NONCE_STR), json.optString(PACKAGE), json.optString(PARTNER_ID), json.optString(PREPAY_ID), json.optString(SIGN), json.optString("timestamp"), null, 257, null));
        }
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StripeIntent.NextActionType.values().length];
            iArr[StripeIntent.NextActionType.DisplayOxxoDetails.ordinal()] = 1;
            iArr[StripeIntent.NextActionType.RedirectToUrl.ordinal()] = 2;
            iArr[StripeIntent.NextActionType.UseStripeSdk.ordinal()] = 3;
            iArr[StripeIntent.NextActionType.AlipayRedirect.ordinal()] = 4;
            iArr[StripeIntent.NextActionType.BlikAuthorize.ordinal()] = 5;
            iArr[StripeIntent.NextActionType.WeChatPayRedirect.ordinal()] = 6;
            iArr[StripeIntent.NextActionType.VerifyWithMicrodeposits.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public StripeIntent.NextActionData parse(JSONObject json) {
        ModelJsonParser displayOxxoDetailsJsonParser;
        s.g(json, "json");
        StripeIntent.NextActionType fromCode$payments_core_release = StripeIntent.NextActionType.Companion.fromCode$payments_core_release(json.optString("type"));
        switch (fromCode$payments_core_release == null ? -1 : WhenMappings.$EnumSwitchMapping$0[fromCode$payments_core_release.ordinal()]) {
            case 1:
                displayOxxoDetailsJsonParser = new DisplayOxxoDetailsJsonParser();
                break;
            case 2:
                displayOxxoDetailsJsonParser = new RedirectToUrlParser();
                break;
            case 3:
                displayOxxoDetailsJsonParser = new SdkDataJsonParser();
                break;
            case 4:
                displayOxxoDetailsJsonParser = new AlipayRedirectParser();
                break;
            case 5:
                displayOxxoDetailsJsonParser = new BlikAuthorizeParser();
                break;
            case 6:
                displayOxxoDetailsJsonParser = new WeChatPayRedirectParser();
                break;
            case 7:
                displayOxxoDetailsJsonParser = new VerifyWithMicrodepositsParser();
                break;
            default:
                return null;
        }
        JSONObject optJSONObject = json.optJSONObject(fromCode$payments_core_release.getCode());
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return (StripeIntent.NextActionData) displayOxxoDetailsJsonParser.parse(optJSONObject);
    }
}