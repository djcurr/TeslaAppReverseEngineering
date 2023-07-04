package com.stripe.android.core.networking;

import com.stripe.android.core.exception.APIException;
import java.util.List;
import kotlin.jvm.internal.s;
import kotlin.text.o;
import org.json.JSONException;
import org.json.JSONObject;
import wz.u;

/* loaded from: classes2.dex */
public final class StripeResponseKtxKt {
    public static final JSONObject responseJson(StripeResponse<String> stripeResponse) {
        String f11;
        s.g(stripeResponse, "<this>");
        String body = stripeResponse.getBody();
        JSONObject jSONObject = null;
        if (body != null) {
            try {
                jSONObject = new JSONObject(body);
            } catch (JSONException e11) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\n                    Exception while parsing response body.\n                      Status code: ");
                sb2.append(stripeResponse.getCode());
                sb2.append("\n                      Request-Id: ");
                sb2.append(stripeResponse.getRequestId());
                sb2.append("\n                      Content-Type: ");
                List<String> headerValue = stripeResponse.getHeaderValue(NetworkConstantsKt.HEADER_CONTENT_TYPE);
                sb2.append((Object) (headerValue != null ? (String) u.d0(headerValue) : null));
                sb2.append("\n                      Body: \"");
                sb2.append(body);
                sb2.append("\"\n                ");
                f11 = o.f(sb2.toString());
                throw new APIException(null, null, 0, f11, e11, 7, null);
            }
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }
}