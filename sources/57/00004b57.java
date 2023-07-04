package com.stripe.android;

import android.content.Context;
import com.stripe.android.core.ApiKeyValidator;
import com.stripe.android.core.ApiVersion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class GooglePayConfig {
    public static final int $stable = 0;
    private final String apiVersion;
    private final String connectedAccountId;
    private final String validPublishableKey;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GooglePayConfig(String publishableKey) {
        this(publishableKey, null, 2, null);
        s.g(publishableKey, "publishableKey");
    }

    public GooglePayConfig(String publishableKey, String str) {
        s.g(publishableKey, "publishableKey");
        this.connectedAccountId = str;
        this.validPublishableKey = ApiKeyValidator.Companion.get().requireValid(publishableKey);
        this.apiVersion = ApiVersion.Companion.get().getCode();
    }

    private final String getKey() {
        String str;
        String str2 = this.connectedAccountId;
        if (str2 == null) {
            str = null;
        } else {
            str = this.validPublishableKey + '/' + str2;
        }
        return str == null ? this.validPublishableKey : str;
    }

    public final JSONObject getTokenizationSpecification() {
        JSONObject put = new JSONObject().put("type", "PAYMENT_GATEWAY").put("parameters", new JSONObject().put("gateway", "stripe").put("stripe:version", this.apiVersion).put("stripe:publishableKey", getKey()));
        s.f(put, "JSONObject()\n           …eKey\", key)\n            )");
        return put;
    }

    public /* synthetic */ GooglePayConfig(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GooglePayConfig(Context context) {
        this(PaymentConfiguration.Companion.getInstance(context));
        s.g(context, "context");
    }

    private GooglePayConfig(PaymentConfiguration paymentConfiguration) {
        this(paymentConfiguration.getPublishableKey(), paymentConfiguration.getStripeAccountId());
    }
}