package com.plaid.internal;

import android.webkit.WebResourceResponse;
import ch.qos.logback.core.CoreConstants;

/* loaded from: classes2.dex */
public final class bd {
    public static final String a(WebResourceResponse webResourceResponse) {
        kotlin.jvm.internal.s.g(webResourceResponse, "<this>");
        return "WebResourceResponse{, MimeType='" + ((Object) webResourceResponse.getMimeType()) + "', Encoding='" + ((Object) webResourceResponse.getEncoding()) + "', StatusCode=" + webResourceResponse.getStatusCode() + ", ReasonPhrase='" + ((Object) webResourceResponse.getReasonPhrase()) + "', ResponseHeaders=" + webResourceResponse.getResponseHeaders() + ", data=" + webResourceResponse.getData() + CoreConstants.CURLY_RIGHT;
    }
}