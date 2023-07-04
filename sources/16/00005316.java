package com.stripe.android.networking;

import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.networking.NetworkConstantsKt;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.core.networking.StripeRequest;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.d;

/* loaded from: classes6.dex */
public final class FraudDetectionDataRequest extends StripeRequest {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String URL = "https://m.stripe.com/6";
    private final Map<String, String> headers;
    private final RequestHeadersFactory.FraudDetection headersFactory;
    private final StripeRequest.Method method;
    private final StripeRequest.MimeType mimeType;
    private final Map<String, Object> params;
    private Map<String, String> postHeaders;
    private final Iterable<Integer> retryResponseCodes;
    private final String url;

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FraudDetectionDataRequest(Map<String, ? extends Object> params, String guid) {
        s.g(params, "params");
        s.g(guid, "guid");
        this.params = params;
        RequestHeadersFactory.FraudDetection fraudDetection = new RequestHeadersFactory.FraudDetection(guid);
        this.headersFactory = fraudDetection;
        this.method = StripeRequest.Method.POST;
        this.mimeType = StripeRequest.MimeType.Json;
        this.retryResponseCodes = NetworkConstantsKt.getDEFAULT_RETRY_CODES();
        this.url = URL;
        this.headers = fraudDetection.create();
        this.postHeaders = fraudDetection.createPostHeader();
    }

    private final String getJsonBody() {
        return String.valueOf(StripeJsonUtils.INSTANCE.mapToJsonObject(this.params));
    }

    private final byte[] getPostBodyBytes() {
        try {
            byte[] bytes = getJsonBody().getBytes(d.f35187b);
            s.f(bytes, "this as java.lang.String).getBytes(charset)");
            return bytes;
        } catch (UnsupportedEncodingException e11) {
            throw new InvalidRequestException(null, null, 0, "Unable to encode parameters to " + ((Object) d.f35187b.name()) + ". Please contact support@stripe.com for assistance.", e11, 7, null);
        }
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

    @Override // com.stripe.android.core.networking.StripeRequest
    public Map<String, String> getPostHeaders() {
        return this.postHeaders;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public Iterable<Integer> getRetryResponseCodes() {
        return this.retryResponseCodes;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public String getUrl() {
        return this.url;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public void setPostHeaders(Map<String, String> map) {
        this.postHeaders = map;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public void writePostBody(OutputStream outputStream) {
        s.g(outputStream, "outputStream");
        outputStream.write(getPostBodyBytes());
        outputStream.flush();
    }
}