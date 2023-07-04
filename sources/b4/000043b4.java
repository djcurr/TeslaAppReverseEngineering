package com.plaid.internal;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.plaid.core.webview.PlaidWebview;
import com.plaid.internal.wa;

/* loaded from: classes2.dex */
public class f extends WebViewClient {

    /* renamed from: b  reason: collision with root package name */
    public static final a f18555b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final PlaidWebview.a f18556a;

    /* loaded from: classes2.dex */
    public static final class a {
        public final boolean a(int i11) {
            return (!(400 <= i11 && i11 < 500) || i11 == 408 || i11 == 404) ? false : true;
        }
    }

    public f(PlaidWebview.a listener) {
        kotlin.jvm.internal.s.g(listener, "listener");
        this.f18556a = listener;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        kotlin.jvm.internal.s.g(view, "view");
        kotlin.jvm.internal.s.g(request, "request");
        kotlin.jvm.internal.s.g(errorResponse, "errorResponse");
        super.onReceivedHttpError(view, request, errorResponse);
        if (f18555b.a(errorResponse.getStatusCode())) {
            wa.a.b(wa.f19678a, (Throwable) new i9(bd.a(errorResponse)), "onReceivedHttpError", false, 4);
        } else {
            wa.a.b(wa.f19678a, (Throwable) new i9(bd.a(errorResponse)), "onReceivedHttpError", false, 4);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        kotlin.jvm.internal.s.g(view, "view");
        kotlin.jvm.internal.s.g(handler, "handler");
        kotlin.jvm.internal.s.g(error, "error");
        super.onReceivedSslError(view, handler, error);
        wa.a.c(wa.f19678a, kotlin.jvm.internal.s.p("onReceivedSslError ", error), false, 2);
    }
}