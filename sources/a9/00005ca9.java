package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.stripe.android.core.networking.RequestHeadersFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class PaymentAuthWebView extends WebView {
    private h00.a<vz.b0> onLoadBlank;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentAuthWebView(Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentAuthWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    public /* synthetic */ PaymentAuthWebView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void cleanup() {
        clearHistory();
        this.onLoadBlank.invoke();
        loadUrl(PaymentAuthWebViewClient.BLANK_PAGE);
        onPause();
        removeAllViews();
        destroyDrawingCache();
    }

    private final void configureSettings() {
        String userAgent$default = RequestHeadersFactory.Companion.getUserAgent$default(RequestHeadersFactory.Companion, null, 1, null);
        WebSettings settings = getSettings();
        StringBuilder sb2 = new StringBuilder();
        String userAgentString = getSettings().getUserAgentString();
        if (userAgentString == null) {
            userAgentString = "";
        }
        sb2.append(userAgentString);
        sb2.append(" [");
        sb2.append(userAgent$default);
        sb2.append(']');
        settings.setUserAgentString(sb2.toString());
        getSettings().setJavaScriptEnabled(true);
        getSettings().setAllowContentAccess(false);
        getSettings().setDomStorageEnabled(true);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        cleanup();
        super.destroy();
    }

    public final h00.a<vz.b0> getOnLoadBlank$payments_core_release() {
        return this.onLoadBlank;
    }

    public final void setOnLoadBlank$payments_core_release(h00.a<vz.b0> aVar) {
        kotlin.jvm.internal.s.g(aVar, "<set-?>");
        this.onLoadBlank = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentAuthWebView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.s.g(context, "context");
        this.onLoadBlank = PaymentAuthWebView$onLoadBlank$1.INSTANCE;
        configureSettings();
    }
}