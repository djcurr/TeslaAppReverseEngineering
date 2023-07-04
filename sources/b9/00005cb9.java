package com.stripe.android.view;

import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.stripe.android.core.Logger;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vz.q;
import wz.w0;
import wz.x0;

/* loaded from: classes6.dex */
public final class PaymentAuthWebViewClient extends WebViewClient {
    private static final Set<String> AUTHENTICATE_URLS;
    public static final String BLANK_PAGE = "about:blank";
    private static final Set<String> COMPLETION_URLS;
    public static final Companion Companion = new Companion(null);
    public static final String PARAM_PAYMENT_CLIENT_SECRET = "payment_intent_client_secret";
    private static final String PARAM_RETURN_URL = "return_url";
    public static final String PARAM_SETUP_CLIENT_SECRET = "setup_intent_client_secret";
    private final h00.l<Throwable, vz.b0> activityFinisher;
    private final h00.l<Intent, vz.b0> activityStarter;
    private final String clientSecret;
    private String completionUrlParam;
    private boolean hasLoadedBlank;
    private final androidx.lifecycle.f0<Boolean> isPageLoaded;
    private final Logger logger;
    private final Uri userReturnUri;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isAuthenticateUrl(String str) {
            boolean H;
            Set<String> set = PaymentAuthWebViewClient.AUTHENTICATE_URLS;
            if ((set instanceof Collection) && set.isEmpty()) {
                return false;
            }
            for (String str2 : set) {
                H = kotlin.text.v.H(str, str2, false, 2, null);
                if (H) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isCompletionUrl$payments_core_release(String url) {
            boolean H;
            kotlin.jvm.internal.s.g(url, "url");
            Set<String> set = PaymentAuthWebViewClient.COMPLETION_URLS;
            if ((set instanceof Collection) && set.isEmpty()) {
                return false;
            }
            for (String str : set) {
                H = kotlin.text.v.H(url, str, false, 2, null);
                if (H) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        Set<String> c11;
        Set<String> i11;
        c11 = w0.c("https://hooks.stripe.com/three_d_secure/authenticate");
        AUTHENTICATE_URLS = c11;
        i11 = x0.i("https://hooks.stripe.com/redirect/complete/", "https://hooks.stripe.com/3d_secure/complete/", "https://hooks.stripe.com/3d_secure_2/hosted/complete");
        COMPLETION_URLS = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentAuthWebViewClient(Logger logger, androidx.lifecycle.f0<Boolean> isPageLoaded, String clientSecret, String str, h00.l<? super Intent, vz.b0> activityStarter, h00.l<? super Throwable, vz.b0> activityFinisher) {
        kotlin.jvm.internal.s.g(logger, "logger");
        kotlin.jvm.internal.s.g(isPageLoaded, "isPageLoaded");
        kotlin.jvm.internal.s.g(clientSecret, "clientSecret");
        kotlin.jvm.internal.s.g(activityStarter, "activityStarter");
        kotlin.jvm.internal.s.g(activityFinisher, "activityFinisher");
        this.logger = logger;
        this.isPageLoaded = isPageLoaded;
        this.clientSecret = clientSecret;
        this.activityStarter = activityStarter;
        this.activityFinisher = activityFinisher;
        this.userReturnUri = str == null ? null : Uri.parse(str);
    }

    private final void hideProgressBar() {
        this.logger.debug("PaymentAuthWebViewClient#hideProgressBar()");
        this.isPageLoaded.setValue(Boolean.TRUE);
    }

    private final boolean isPredefinedReturnUrl(Uri uri) {
        return kotlin.jvm.internal.s.c("stripejs://use_stripe_sdk/return_url", uri.toString());
    }

    private final boolean isReturnUrl(Uri uri) {
        String queryParameter;
        this.logger.debug("PaymentAuthWebViewClient#isReturnUrl()");
        if (isPredefinedReturnUrl(uri)) {
            return true;
        }
        Uri uri2 = this.userReturnUri;
        if (uri2 != null) {
            return uri2.getScheme() != null && kotlin.jvm.internal.s.c(this.userReturnUri.getScheme(), uri.getScheme()) && this.userReturnUri.getHost() != null && kotlin.jvm.internal.s.c(this.userReturnUri.getHost(), uri.getHost());
        } else if (uri.isOpaque()) {
            return false;
        } else {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames.contains(PARAM_PAYMENT_CLIENT_SECRET)) {
                queryParameter = uri.getQueryParameter(PARAM_PAYMENT_CLIENT_SECRET);
            } else {
                queryParameter = queryParameterNames.contains(PARAM_SETUP_CLIENT_SECRET) ? uri.getQueryParameter(PARAM_SETUP_CLIENT_SECRET) : null;
            }
            return kotlin.jvm.internal.s.c(this.clientSecret, queryParameter);
        }
    }

    private final void onAuthCompleted(Throwable th2) {
        this.logger.debug("PaymentAuthWebViewClient#onAuthCompleted()");
        this.activityFinisher.invoke(th2);
    }

    static /* synthetic */ void onAuthCompleted$default(PaymentAuthWebViewClient paymentAuthWebViewClient, Throwable th2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            th2 = null;
        }
        paymentAuthWebViewClient.onAuthCompleted(th2);
    }

    private final void openIntent(Intent intent) {
        Object b11;
        this.logger.debug("PaymentAuthWebViewClient#openIntent()");
        try {
            q.a aVar = vz.q.f54772b;
            this.activityStarter.invoke(intent);
            b11 = vz.q.b(vz.b0.f54756a);
        } catch (Throwable th2) {
            q.a aVar2 = vz.q.f54772b;
            b11 = vz.q.b(vz.r.a(th2));
        }
        Throwable e11 = vz.q.e(b11);
        if (e11 != null) {
            this.logger.error("Failed to start Intent.", e11);
            if (kotlin.jvm.internal.s.c(intent.getScheme(), "alipays")) {
                return;
            }
            onAuthCompleted(e11);
        }
    }

    private final void openIntentScheme(Uri uri) {
        Object b11;
        this.logger.debug("PaymentAuthWebViewClient#openIntentScheme()");
        try {
            q.a aVar = vz.q.f54772b;
            Intent parseUri = Intent.parseUri(uri.toString(), 1);
            kotlin.jvm.internal.s.f(parseUri, "parseUri(uri.toString(), Intent.URI_INTENT_SCHEME)");
            openIntent(parseUri);
            b11 = vz.q.b(vz.b0.f54756a);
        } catch (Throwable th2) {
            q.a aVar2 = vz.q.f54772b;
            b11 = vz.q.b(vz.r.a(th2));
        }
        Throwable e11 = vz.q.e(b11);
        if (e11 != null) {
            this.logger.error("Failed to start Intent.", e11);
            onAuthCompleted(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void updateCompletionUrl(android.net.Uri r4) {
        /*
            r3 = this;
            com.stripe.android.core.Logger r0 = r3.logger
            java.lang.String r1 = "PaymentAuthWebViewClient#updateCompletionUrl()"
            r0.debug(r1)
            com.stripe.android.view.PaymentAuthWebViewClient$Companion r0 = com.stripe.android.view.PaymentAuthWebViewClient.Companion
            java.lang.String r1 = r4.toString()
            java.lang.String r2 = "uri.toString()"
            kotlin.jvm.internal.s.f(r1, r2)
            boolean r0 = com.stripe.android.view.PaymentAuthWebViewClient.Companion.access$isAuthenticateUrl(r0, r1)
            if (r0 == 0) goto L1f
            java.lang.String r0 = "return_url"
            java.lang.String r4 = r4.getQueryParameter(r0)
            goto L20
        L1f:
            r4 = 0
        L20:
            if (r4 == 0) goto L2b
            boolean r0 = kotlin.text.m.w(r4)
            if (r0 == 0) goto L29
            goto L2b
        L29:
            r0 = 0
            goto L2c
        L2b:
            r0 = 1
        L2c:
            if (r0 != 0) goto L30
            r3.completionUrlParam = r4
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.PaymentAuthWebViewClient.updateCompletionUrl(android.net.Uri):void");
    }

    public final String getCompletionUrlParam() {
        return this.completionUrlParam;
    }

    public final boolean getHasLoadedBlank$payments_core_release() {
        return this.hasLoadedBlank;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String str) {
        kotlin.jvm.internal.s.g(view, "view");
        this.logger.debug(kotlin.jvm.internal.s.p("PaymentAuthWebViewClient#onPageFinished() - ", str));
        super.onPageFinished(view, str);
        if (!this.hasLoadedBlank) {
            hideProgressBar();
        }
        if (str == null || !Companion.isCompletionUrl$payments_core_release(str)) {
            return;
        }
        this.logger.debug(kotlin.jvm.internal.s.p(str, " is a completion URL"));
        onAuthCompleted$default(this, null, 1, null);
    }

    public final void setHasLoadedBlank$payments_core_release(boolean z11) {
        this.hasLoadedBlank = z11;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        boolean u11;
        kotlin.jvm.internal.s.g(view, "view");
        kotlin.jvm.internal.s.g(request, "request");
        Uri url = request.getUrl();
        this.logger.debug(kotlin.jvm.internal.s.p("PaymentAuthWebViewClient#shouldOverrideUrlLoading(): ", url));
        kotlin.jvm.internal.s.f(url, "url");
        updateCompletionUrl(url);
        if (isReturnUrl(url)) {
            this.logger.debug("PaymentAuthWebViewClient#shouldOverrideUrlLoading() - handle return URL");
            onAuthCompleted$default(this, null, 1, null);
            return true;
        }
        u11 = kotlin.text.v.u("intent", url.getScheme(), true);
        if (u11) {
            openIntentScheme(url);
            return true;
        } else if (!URLUtil.isNetworkUrl(url.toString())) {
            openIntent(new Intent("android.intent.action.VIEW", url));
            return true;
        } else {
            return super.shouldOverrideUrlLoading(view, request);
        }
    }
}