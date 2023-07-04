package com.stripe.android.core.networking;

import com.stripe.android.core.networking.RequestId;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.v;
import wz.s0;
import wz.u;

/* loaded from: classes2.dex */
public final class StripeResponse<ResponseBody> {
    public static final Companion Companion = new Companion(null);
    public static final String HEADER_REQUEST_ID = "Request-Id";
    private final ResponseBody body;
    private final int code;
    private final Map<String, List<String>> headers;
    private final boolean isError;
    private final boolean isOk;
    private final boolean isRateLimited;
    private final RequestId requestId;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StripeResponse(int i11, ResponseBody responsebody, Map<String, ? extends List<String>> headers) {
        s.g(headers, "headers");
        this.code = i11;
        this.body = responsebody;
        this.headers = headers;
        this.isOk = i11 == 200;
        this.isError = i11 < 200 || i11 >= 300;
        this.isRateLimited = i11 == 429;
        RequestId.Companion companion = RequestId.Companion;
        List<String> headerValue = getHeaderValue(HEADER_REQUEST_ID);
        this.requestId = companion.fromString(headerValue == null ? null : (String) u.d0(headerValue));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StripeResponse copy$default(StripeResponse stripeResponse, int i11, Object obj, Map map, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            i11 = stripeResponse.code;
        }
        if ((i12 & 2) != 0) {
            obj = stripeResponse.body;
        }
        if ((i12 & 4) != 0) {
            map = stripeResponse.headers;
        }
        return stripeResponse.copy(i11, obj, map);
    }

    public final int component1() {
        return this.code;
    }

    public final ResponseBody component2() {
        return this.body;
    }

    public final Map<String, List<String>> component3() {
        return this.headers;
    }

    public final StripeResponse<ResponseBody> copy(int i11, ResponseBody responsebody, Map<String, ? extends List<String>> headers) {
        s.g(headers, "headers");
        return new StripeResponse<>(i11, responsebody, headers);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StripeResponse) {
            StripeResponse stripeResponse = (StripeResponse) obj;
            return this.code == stripeResponse.code && s.c(this.body, stripeResponse.body) && s.c(this.headers, stripeResponse.headers);
        }
        return false;
    }

    public final ResponseBody getBody() {
        return this.body;
    }

    public final int getCode() {
        return this.code;
    }

    public final List<String> getHeaderValue(String key) {
        Object obj;
        boolean u11;
        s.g(key, "key");
        Iterator<T> it2 = this.headers.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            u11 = v.u((String) ((Map.Entry) obj).getKey(), key, true);
            if (u11) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return null;
        }
        return (List) entry.getValue();
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final RequestId getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.code) * 31;
        ResponseBody responsebody = this.body;
        return ((hashCode + (responsebody == null ? 0 : responsebody.hashCode())) * 31) + this.headers.hashCode();
    }

    public final boolean isError() {
        return this.isError;
    }

    public final boolean isOk() {
        return this.isOk;
    }

    public final boolean isRateLimited() {
        return this.isRateLimited;
    }

    public String toString() {
        return "Request-Id: " + this.requestId + ", Status Code: " + this.code;
    }

    public /* synthetic */ StripeResponse(int i11, Object obj, Map map, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, obj, (i12 & 4) != 0 ? s0.i() : map);
    }
}