package com.stripe.android.stripe3ds2.views;

import android.net.Uri;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.v;

/* loaded from: classes6.dex */
public final class ThreeDS2WebViewClient extends WebViewClient {
    public static final String CHALLENGE_URL = "https://emv3ds/challenge";
    public static final Companion Companion = new Companion(null);
    private OnHtmlSubmitListener listener;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public interface OnHtmlSubmitListener {
        void onHtmlSubmit(String str);
    }

    public final OnHtmlSubmitListener getListener$3ds2sdk_release() {
        return this.listener;
    }

    public final void handleFormSubmitUrl(Uri uri) {
        boolean H;
        OnHtmlSubmitListener onHtmlSubmitListener;
        s.g(uri, "uri");
        String uri2 = uri.toString();
        s.f(uri2, "uri.toString()");
        Locale ENGLISH = Locale.ENGLISH;
        s.f(ENGLISH, "ENGLISH");
        String lowerCase = uri2.toLowerCase(ENGLISH);
        s.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        H = v.H(lowerCase, CHALLENGE_URL, false, 2, null);
        if (!H || (onHtmlSubmitListener = this.listener) == null) {
            return;
        }
        onHtmlSubmitListener.onHtmlSubmit(uri.getQuery());
    }

    public final void setListener$3ds2sdk_release(OnHtmlSubmitListener onHtmlSubmitListener) {
        this.listener = onHtmlSubmitListener;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        s.g(view, "view");
        s.g(request, "request");
        Uri url = request.getUrl();
        s.f(url, "request.url");
        handleFormSubmitUrl(url);
        Uri url2 = request.getUrl();
        s.f(url2, "request.url");
        if (shouldNotInterceptUrl(url2)) {
            return super.shouldInterceptRequest(view, request);
        }
        return new WebResourceResponse(null, null, null);
    }

    public final boolean shouldNotInterceptUrl(Uri uri) {
        s.g(uri, "uri");
        return URLUtil.isDataUrl(uri.toString());
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        s.g(view, "view");
        s.g(request, "request");
        Uri url = request.getUrl();
        s.f(url, "request.url");
        handleFormSubmitUrl(url);
        return true;
    }
}