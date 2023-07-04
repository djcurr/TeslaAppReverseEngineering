package com.plaid.internal;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.plaid.core.webview.PlaidWebview;
import com.plaid.internal.wa;

/* loaded from: classes2.dex */
public final class ua extends f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua(PlaidWebview.a listener) {
        super(listener);
        kotlin.jvm.internal.s.g(listener, "listener");
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError errorResponse) {
        kotlin.jvm.internal.s.g(view, "view");
        kotlin.jvm.internal.s.g(request, "request");
        kotlin.jvm.internal.s.g(errorResponse, "errorResponse");
        int errorCode = errorResponse.getErrorCode();
        boolean z11 = true;
        if (!(400 <= errorCode && errorCode < 500) || errorCode == 408 || errorCode == 404) {
            z11 = false;
        }
        if (z11) {
            wa.a.a(wa.f19678a, (Throwable) new i9(ad.a(errorResponse)), "onReceivedError", false, 4);
        } else {
            wa.a.b(wa.f19678a, (Throwable) new i9(ad.a(errorResponse)), "onReceivedError", false, 4);
        }
        super.onReceivedError(view, request, errorResponse);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r5 == true) goto L7;
     */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r5, android.webkit.WebResourceRequest r6) {
        /*
            r4 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.s.g(r5, r0)
            java.lang.String r5 = "request"
            kotlin.jvm.internal.s.g(r6, r5)
            boolean r5 = r6.isForMainFrame()
            r0 = 0
            if (r5 != 0) goto L3c
            android.net.Uri r5 = r6.getUrl()
            java.lang.String r5 = r5.getPath()
            r6 = 1
            r1 = 0
            if (r5 != 0) goto L1e
            goto L28
        L1e:
            r2 = 2
            java.lang.String r3 = "/favicon.ico"
            boolean r5 = kotlin.text.m.t(r5, r3, r1, r2, r0)
            if (r5 != r6) goto L28
            goto L29
        L28:
            r6 = r1
        L29:
            if (r6 == 0) goto L3c
            android.webkit.WebResourceResponse r5 = new android.webkit.WebResourceResponse     // Catch: java.lang.Exception -> L33
            java.lang.String r6 = "image/png"
            r5.<init>(r6, r0, r0)     // Catch: java.lang.Exception -> L33
            return r5
        L33:
            r5 = move-exception
            com.plaid.internal.wa$a r6 = com.plaid.internal.wa.f19678a
            r2 = 4
            java.lang.String r3 = "shouldInterceptRequest"
            com.plaid.internal.wa.a.a(r6, r5, r3, r1, r2)
        L3c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.ua.shouldInterceptRequest(android.webkit.WebView, android.webkit.WebResourceRequest):android.webkit.WebResourceResponse");
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        kotlin.jvm.internal.s.g(view, "view");
        kotlin.jvm.internal.s.g(request, "request");
        try {
            PlaidWebview.a aVar = this.f18556a;
            String uri = request.getUrl().toString();
            kotlin.jvm.internal.s.f(uri, "request.url.toString()");
            return aVar.b(uri);
        } catch (Exception e11) {
            wa.a aVar2 = wa.f19678a;
            wa.f19679b.a(e11, true);
            return true;
        }
    }
}