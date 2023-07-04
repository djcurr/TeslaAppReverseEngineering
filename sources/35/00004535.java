package com.plaid.internal;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

/* loaded from: classes2.dex */
public final class r0 extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p0 f19337a;

    public r0(p0 p0Var) {
        this.f19337a = p0Var;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        o8 o8Var = this.f19337a.f19198e;
        o8 o8Var2 = null;
        if (o8Var == null) {
            kotlin.jvm.internal.s.x("binding");
            o8Var = null;
        }
        ProgressBar progressBar = o8Var.f19171d;
        kotlin.jvm.internal.s.f(progressBar, "binding.loadingProgress");
        progressBar.setVisibility(8);
        o8 o8Var3 = this.f19337a.f19198e;
        if (o8Var3 == null) {
            kotlin.jvm.internal.s.x("binding");
        } else {
            o8Var2 = o8Var3;
        }
        WebView webView2 = o8Var2.f19173f;
        kotlin.jvm.internal.s.f(webView2, "binding.plaidWebview");
        webView2.setVisibility(0);
    }
}