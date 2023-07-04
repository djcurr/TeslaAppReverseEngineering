package com.teslamotors.plugins.securewebview;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tesla.TeslaV4.BuildConfig;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes6.dex */
public class SecureWebviewActivity extends Activity {

    /* renamed from: b  reason: collision with root package name */
    private static final Set<String> f22253b = new HashSet(Arrays.asList("www.tesla.com", "stage.tesla.com", "www.tesla.cn", "stage.tesla.cn", "static-assets.tesla.com", "sdlc-assets.tesla.com", "stagecn-assets.teslamotors.com", "static-assets.tesla.cn", "js.stripe.com", "tesla-cdn.thron.com", "digitalassets-energy.tesla.com"));

    /* renamed from: a  reason: collision with root package name */
    private BroadcastReceiver f22254a = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SecureWebviewActivity.this.c();
        }
    }

    /* loaded from: classes6.dex */
    class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            SecureWebviewActivity.this.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public class c extends WebViewClient {
        private c() {
        }

        private boolean a(WebView webView, Uri uri) {
            if (SecureWebviewActivity.f22253b.contains(uri.getHost()) && "https".equals(uri.getScheme())) {
                String uri2 = uri.toString();
                if (SecureWebviewActivity.this.getIntent().getBooleanExtra("allowPDFs", false) && (uri2.endsWith(".pdf") || uri2.contains("/public/document/tesla"))) {
                    webView.loadUrl("https://docs.google.com/viewer?url=" + Uri.encode(uri2));
                } else {
                    webView.loadUrl(uri2);
                }
            } else {
                webView.loadUrl(BuildConfig.TESLA_WEB_URL);
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            webView.loadUrl(BuildConfig.TESLA_WEB_URL);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return a(webView, Uri.parse(str));
        }

        /* synthetic */ c(SecureWebviewActivity secureWebviewActivity, a aVar) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return a(webView, webResourceRequest.getUrl());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        setResult(201);
        androidx.core.app.a.b(this);
    }

    private void d(WebView webView) {
        WebSettings settings = webView.getSettings();
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        webView.setWebViewClient(new c(this, null));
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        c();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.teslamotors.plugins.securewebview.c.activity_webview);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("header");
        String stringExtra2 = intent.getStringExtra("url");
        int intExtra = intent.getIntExtra("controlTintColor", -7829368);
        int intExtra2 = intent.getIntExtra("barTintColor", -16777216);
        TextView textView = (TextView) findViewById(com.teslamotors.plugins.securewebview.b.f22261d);
        WebView webView = (WebView) findViewById(com.teslamotors.plugins.securewebview.b.secure_webview);
        d(webView);
        webView.loadUrl(stringExtra2);
        ((LinearLayout) findViewById(com.teslamotors.plugins.securewebview.b.nav_bar)).setBackgroundColor(intExtra2);
        textView.setText(stringExtra);
        textView.setTextColor(intExtra);
        ((TextView) findViewById(com.teslamotors.plugins.securewebview.b.done_button)).setOnClickListener(new a());
    }

    @Override // android.app.Activity
    protected void onPause() {
        o4.a.b(this).e(this.f22254a);
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        o4.a.b(this).c(this.f22254a, new IntentFilter("com.teslamotors.plugins.securewebview.dismiss"));
    }
}