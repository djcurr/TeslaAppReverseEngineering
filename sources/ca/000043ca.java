package com.plaid.internal;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.plaid.core.webview.PlaidWebview;
import com.plaid.internal.wa;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class f8 extends f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(PlaidWebview.a listener) {
        super(listener);
        kotlin.jvm.internal.s.g(listener, "listener");
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, int i11, String description, String failingUrl) {
        kotlin.jvm.internal.s.g(view, "view");
        kotlin.jvm.internal.s.g(description, "description");
        kotlin.jvm.internal.s.g(failingUrl, "failingUrl");
        super.onReceivedError(view, i11, description, failingUrl);
        boolean z11 = true;
        if (!(400 <= i11 && i11 < 500) || i11 == 408 || i11 == 404) {
            z11 = false;
        }
        if (z11) {
            wa.a.a(wa.f19678a, (Throwable) new i9(description), "onReceivedError", false, 4);
        } else {
            wa.a.b(wa.f19678a, (Throwable) new i9(description), "onReceivedError", false, 4);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        boolean M;
        kotlin.jvm.internal.s.g(view, "view");
        kotlin.jvm.internal.s.g(url, "url");
        Locale ENGLISH = Locale.ENGLISH;
        kotlin.jvm.internal.s.f(ENGLISH, "ENGLISH");
        String lowerCase = url.toLowerCase(ENGLISH);
        kotlin.jvm.internal.s.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        M = kotlin.text.w.M(lowerCase, "/favicon.ico", false, 2, null);
        if (M) {
            try {
                return new WebResourceResponse("image/png", null, null);
            } catch (Exception e11) {
                wa.a.a(wa.f19678a, (Throwable) e11, "shouldInterceptRequest", false, 4);
            }
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, String str) {
        kotlin.jvm.internal.s.g(view, "view");
        if (str == null) {
            return false;
        }
        try {
            return this.f18556a.b(str);
        } catch (Exception e11) {
            wa.a aVar = wa.f19678a;
            wa.f19679b.a(e11, true);
            return true;
        }
    }
}