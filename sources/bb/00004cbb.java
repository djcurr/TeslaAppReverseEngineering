package com.stripe.android.core.networking;

import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.networking.StripeRequest;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import m00.i;
import wz.e0;
import wz.w;

/* loaded from: classes2.dex */
public final class AnalyticsRequest extends StripeRequest {
    public static final Companion Companion = new Companion(null);
    public static final String HOST = "https://q.stripe.com";
    private final Map<String, String> headers;
    private final StripeRequest.Method method;
    private final StripeRequest.MimeType mimeType;
    private final Map<String, ?> params;
    private final String query;
    private final Iterable<Integer> retryResponseCodes;
    private final String url;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AnalyticsRequest(Map<String, ?> params, Map<String, String> headers) {
        List n11;
        String l02;
        s.g(params, "params");
        s.g(headers, "headers");
        this.params = params;
        this.headers = headers;
        String createFromParamsWithEmptyValues = QueryStringFactory.INSTANCE.createFromParamsWithEmptyValues(params);
        this.query = createFromParamsWithEmptyValues;
        this.method = StripeRequest.Method.GET;
        this.mimeType = StripeRequest.MimeType.Form;
        this.retryResponseCodes = new i(NetworkConstantsKt.HTTP_TOO_MANY_REQUESTS, NetworkConstantsKt.HTTP_TOO_MANY_REQUESTS);
        String[] strArr = new String[2];
        strArr[0] = HOST;
        strArr[1] = createFromParamsWithEmptyValues.length() > 0 ? createFromParamsWithEmptyValues : null;
        n11 = w.n(strArr);
        l02 = e0.l0(n11, CallerData.NA, null, null, 0, null, null, 62, null);
        this.url = l02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnalyticsRequest copy$default(AnalyticsRequest analyticsRequest, Map map, Map map2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = analyticsRequest.params;
        }
        if ((i11 & 2) != 0) {
            map2 = analyticsRequest.getHeaders();
        }
        return analyticsRequest.copy(map, map2);
    }

    public final Map<String, ?> component1() {
        return this.params;
    }

    public final Map<String, String> component2() {
        return getHeaders();
    }

    public final AnalyticsRequest copy(Map<String, ?> params, Map<String, String> headers) {
        s.g(params, "params");
        s.g(headers, "headers");
        return new AnalyticsRequest(params, headers);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnalyticsRequest) {
            AnalyticsRequest analyticsRequest = (AnalyticsRequest) obj;
            return s.c(this.params, analyticsRequest.params) && s.c(getHeaders(), analyticsRequest.getHeaders());
        }
        return false;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public StripeRequest.Method getMethod() {
        return this.method;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public StripeRequest.MimeType getMimeType() {
        return this.mimeType;
    }

    public final Map<String, ?> getParams() {
        return this.params;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public Iterable<Integer> getRetryResponseCodes() {
        return this.retryResponseCodes;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (this.params.hashCode() * 31) + getHeaders().hashCode();
    }

    public String toString() {
        return "AnalyticsRequest(params=" + this.params + ", headers=" + getHeaders() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}