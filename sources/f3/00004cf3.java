package com.stripe.android.core.networking;

import java.io.OutputStream;
import java.util.Map;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public abstract class StripeRequest {
    private Map<String, String> postHeaders;

    /* loaded from: classes2.dex */
    public enum Method {
        GET("GET"),
        POST("POST"),
        DELETE("DELETE");
        
        private final String code;

        Method(String str) {
            this.code = str;
        }

        public final String getCode() {
            return this.code;
        }
    }

    /* loaded from: classes2.dex */
    public enum MimeType {
        Form("application/x-www-form-urlencoded"),
        MultipartForm("multipart/form-data"),
        Json("application/json");
        
        private final String code;

        MimeType(String str) {
            this.code = str;
        }

        public final String getCode() {
            return this.code;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }
    }

    public abstract Map<String, String> getHeaders();

    public abstract Method getMethod();

    public abstract MimeType getMimeType();

    public Map<String, String> getPostHeaders() {
        return this.postHeaders;
    }

    public abstract Iterable<Integer> getRetryResponseCodes();

    public abstract String getUrl();

    public void setPostHeaders(Map<String, String> map) {
        this.postHeaders = map;
    }

    public void writePostBody(OutputStream outputStream) {
        s.g(outputStream, "outputStream");
    }
}