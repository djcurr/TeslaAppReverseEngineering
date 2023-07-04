package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.WeChat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class WeChatJsonParser implements ModelJsonParser<WeChat> {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_APPID = "android_appId";
    @Deprecated
    private static final String FIELD_NONCE = "android_nonceStr";
    @Deprecated
    private static final String FIELD_PACKAGE = "android_package";
    @Deprecated
    private static final String FIELD_PARTNERID = "android_partnerId";
    @Deprecated
    private static final String FIELD_PREPAYID = "android_prepayId";
    @Deprecated
    private static final String FIELD_QR_CODE_URL = "qr_code_url";
    @Deprecated
    private static final String FIELD_SIGN = "android_sign";
    @Deprecated
    private static final String FIELD_STATEMENT_DESCRIPTOR = "statement_descriptor";
    @Deprecated
    private static final String FIELD_TIMESTAMP = "android_timeStamp";

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public WeChat parse(JSONObject json) {
        s.g(json, "json");
        return new WeChat(StripeJsonUtils.optString(json, FIELD_STATEMENT_DESCRIPTOR), StripeJsonUtils.optString(json, FIELD_APPID), StripeJsonUtils.optString(json, FIELD_NONCE), StripeJsonUtils.optString(json, FIELD_PACKAGE), StripeJsonUtils.optString(json, FIELD_PARTNERID), StripeJsonUtils.optString(json, FIELD_PREPAYID), StripeJsonUtils.optString(json, FIELD_SIGN), StripeJsonUtils.optString(json, FIELD_TIMESTAMP), StripeJsonUtils.optString(json, FIELD_QR_CODE_URL));
    }
}