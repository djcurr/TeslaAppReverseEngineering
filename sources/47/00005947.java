package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.stripe.android.stripe3ds2.views.ThreeDS2WebViewClient;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class ThreeDS2WebView extends WebView {
    private final ThreeDS2WebViewClient webViewClient;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreeDS2WebView(Context context) {
        this(context, null, 0, 6, null);
        s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreeDS2WebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.g(context, "context");
    }

    public /* synthetic */ ThreeDS2WebView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void configureSettings() {
        WebSettings settings = getSettings();
        settings.setCacheMode(2);
        settings.setJavaScriptEnabled(false);
        settings.setAllowContentAccess(false);
        settings.setBlockNetworkImage(true);
        settings.setBlockNetworkLoads(true);
    }

    public final void setOnHtmlSubmitListener$3ds2sdk_release(ThreeDS2WebViewClient.OnHtmlSubmitListener onHtmlSubmitListener) {
        this.webViewClient.setListener$3ds2sdk_release(onHtmlSubmitListener);
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient client) {
        s.g(client, "client");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeDS2WebView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.g(context, "context");
        ThreeDS2WebViewClient threeDS2WebViewClient = new ThreeDS2WebViewClient();
        this.webViewClient = threeDS2WebViewClient;
        configureSettings();
        super.setWebViewClient(threeDS2WebViewClient);
    }
}