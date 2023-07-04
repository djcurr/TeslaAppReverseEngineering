package com.plaid.internal;

import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes2.dex */
public final class y0 extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WebView f19872a;

    public y0(WebView webView) {
        this.f19872a = webView;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f19872a.loadUrl("javascript:(function() { document.getElementsByClassName('Recaptcha')[0].style.display='none'; })()");
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (URLUtil.isHttpUrl(String.valueOf(webResourceRequest == null ? null : webResourceRequest.getUrl())) && webView != null) {
            webView.removeJavascriptInterface("RecaptchaJSListener");
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }
}