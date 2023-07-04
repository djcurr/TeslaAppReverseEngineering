package com.reactnativecommunity.webview;

import android.app.DownloadManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.JavascriptInterface;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.n0;
import com.stripe.android.core.networking.NetworkConstantsKt;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.i18n.MessageBundle;

@fg.a(name = "RNCWebView")
/* loaded from: classes2.dex */
public class RNCWebViewManager extends SimpleViewManager<WebView> {
    protected static final String BLANK_URL = "about:blank";
    public static final int COMMAND_CLEAR_CACHE = 1001;
    public static final int COMMAND_CLEAR_FORM_DATA = 1000;
    public static final int COMMAND_CLEAR_HISTORY = 1002;
    public static final int COMMAND_FOCUS = 8;
    public static final int COMMAND_GO_BACK = 1;
    public static final int COMMAND_GO_FORWARD = 2;
    public static final int COMMAND_INJECT_JAVASCRIPT = 6;
    public static final int COMMAND_LOAD_URL = 7;
    public static final int COMMAND_POST_MESSAGE = 5;
    public static final int COMMAND_RELOAD = 3;
    public static final int COMMAND_STOP_LOADING = 4;
    protected static final String HTML_ENCODING = "UTF-8";
    protected static final String HTML_MIME_TYPE = "text/html";
    protected static final String HTTP_METHOD_POST = "POST";
    protected static final String JAVASCRIPT_INTERFACE = "ReactNativeWebView";
    protected static final String REACT_CLASS = "RNCWebView";
    protected boolean mAllowsFullscreenVideo;
    protected String mUserAgent;
    protected String mUserAgentWithApplicationName;
    protected e mWebChromeClient;
    protected com.reactnativecommunity.webview.b mWebViewConfig;

    /* loaded from: classes2.dex */
    class a implements com.reactnativecommunity.webview.b {
        a(RNCWebViewManager rNCWebViewManager) {
        }

        @Override // com.reactnativecommunity.webview.b
        public void a(WebView webView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements DownloadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f20150a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n0 f20151b;

        b(RNCWebViewManager rNCWebViewManager, f fVar, n0 n0Var) {
            this.f20150a = fVar;
            this.f20151b = n0Var;
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j11) {
            this.f20150a.setIgnoreErrFailedForThisURL(str);
            RNCWebViewModule module = RNCWebViewManager.getModule(this.f20151b);
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            String guessFileName = URLUtil.guessFileName(str, str3, str4);
            String str5 = "Downloading " + guessFileName;
            try {
                URL url = new URL(str);
                request.addRequestHeader(RequestHeadersFactory.FraudDetection.HEADER_COOKIE, CookieManager.getInstance().getCookie(url.getProtocol() + "://" + url.getHost()));
            } catch (MalformedURLException e11) {
                System.out.println("Error getting cookie for DownloadManager: " + e11.toString());
                e11.printStackTrace();
            }
            request.addRequestHeader(NetworkConstantsKt.HEADER_USER_AGENT, str2);
            request.setTitle(guessFileName);
            request.setDescription(str5);
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
            module.setDownloadRequest(request);
            if (module.grantFileDownloaderPermissions()) {
                module.downloadFile();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c extends e {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f20152g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(RNCWebViewManager rNCWebViewManager, ReactContext reactContext, WebView webView, int i11) {
            super(reactContext, webView);
            this.f20152g = i11;
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            View view = this.f20156c;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            a().removeView(this.f20156c);
            this.f20157d.onCustomViewHidden();
            this.f20156c = null;
            this.f20157d = null;
            this.f20155b.setVisibility(0);
            if (Build.VERSION.SDK_INT >= 19) {
                this.f20154a.getCurrentActivity().getWindow().clearFlags(512);
            }
            this.f20154a.getCurrentActivity().setRequestedOrientation(this.f20152g);
            this.f20154a.removeLifecycleEventListener(this);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            if (this.f20156c != null) {
                customViewCallback.onCustomViewHidden();
                return;
            }
            this.f20156c = view;
            this.f20157d = customViewCallback;
            this.f20154a.getCurrentActivity().setRequestedOrientation(-1);
            if (Build.VERSION.SDK_INT >= 19) {
                this.f20156c.setSystemUiVisibility(7942);
                this.f20154a.getCurrentActivity().getWindow().setFlags(512, 512);
            }
            this.f20156c.setBackgroundColor(-16777216);
            a().addView(this.f20156c, e.f20153f);
            this.f20155b.setVisibility(8);
            this.f20154a.addLifecycleEventListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d extends e {
        d(RNCWebViewManager rNCWebViewManager, ReactContext reactContext, WebView webView) {
            super(reactContext, webView);
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public static class e extends WebChromeClient implements LifecycleEventListener {

        /* renamed from: f  reason: collision with root package name */
        protected static final FrameLayout.LayoutParams f20153f = new FrameLayout.LayoutParams(-1, -1, 17);

        /* renamed from: a  reason: collision with root package name */
        protected ReactContext f20154a;

        /* renamed from: b  reason: collision with root package name */
        protected View f20155b;

        /* renamed from: c  reason: collision with root package name */
        protected View f20156c;

        /* renamed from: d  reason: collision with root package name */
        protected WebChromeClient.CustomViewCallback f20157d;

        /* renamed from: e  reason: collision with root package name */
        protected f.b f20158e = null;

        public e(ReactContext reactContext, WebView webView) {
            this.f20154a = reactContext;
            this.f20155b = webView;
        }

        protected ViewGroup a() {
            return (ViewGroup) this.f20154a.getCurrentActivity().findViewById(16908290);
        }

        public void b(f.b bVar) {
            this.f20158e = bVar;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            callback.invoke(str, true, false);
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
            View view;
            if (Build.VERSION.SDK_INT < 19 || (view = this.f20156c) == null || view.getSystemUiVisibility() == 7942) {
                return;
            }
            this.f20156c.setSystemUiVisibility(7942);
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            String[] resources = permissionRequest.getResources();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < resources.length; i11++) {
                if (resources[i11].equals("android.webkit.resource.AUDIO_CAPTURE")) {
                    arrayList.add("android.permission.RECORD_AUDIO");
                } else if (resources[i11].equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    arrayList.add("android.permission.CAMERA");
                }
            }
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (androidx.core.content.b.checkSelfPermission(this.f20154a, (String) arrayList.get(i12)) == 0) {
                    if (((String) arrayList.get(i12)).equals("android.permission.RECORD_AUDIO")) {
                        arrayList2.add("android.webkit.resource.AUDIO_CAPTURE");
                    } else if (((String) arrayList.get(i12)).equals("android.permission.CAMERA")) {
                        arrayList2.add("android.webkit.resource.VIDEO_CAPTURE");
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                permissionRequest.deny();
            } else {
                permissionRequest.grant((String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i11) {
            super.onProgressChanged(webView, i11);
            String url = webView.getUrl();
            if (this.f20158e.a()) {
                return;
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("target", webView.getId());
            createMap.putString(MessageBundle.TITLE_ENTRY, webView.getTitle());
            createMap.putString("url", url);
            createMap.putBoolean("canGoBack", webView.canGoBack());
            createMap.putBoolean("canGoForward", webView.canGoForward());
            createMap.putDouble("progress", i11 / 100.0f);
            RNCWebViewManager.dispatchEvent(webView, new xq.d(webView.getId(), createMap));
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            return RNCWebViewManager.getModule(this.f20154a).startPhotoPickerIntent(valueCallback, fileChooserParams.getAcceptTypes(), fileChooserParams.getMode() == 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public static class f extends WebView implements LifecycleEventListener {

        /* renamed from: a  reason: collision with root package name */
        protected String f20159a;

        /* renamed from: b  reason: collision with root package name */
        protected String f20160b;

        /* renamed from: c  reason: collision with root package name */
        protected boolean f20161c;

        /* renamed from: d  reason: collision with root package name */
        protected String f20162d;

        /* renamed from: e  reason: collision with root package name */
        protected g f20163e;

        /* renamed from: f  reason: collision with root package name */
        protected CatalystInstance f20164f;

        /* renamed from: g  reason: collision with root package name */
        protected boolean f20165g;

        /* renamed from: h  reason: collision with root package name */
        private wg.b f20166h;

        /* renamed from: i  reason: collision with root package name */
        protected boolean f20167i;

        /* renamed from: j  reason: collision with root package name */
        protected b f20168j;

        /* renamed from: k  reason: collision with root package name */
        WebChromeClient f20169k;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ WebView f20170a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f20171b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ f f20172c;

            a(WebView webView, String str, f fVar) {
                this.f20170a = webView;
                this.f20171b = str;
                this.f20172c = fVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                g gVar = f.this.f20163e;
                if (gVar == null) {
                    return;
                }
                WebView webView = this.f20170a;
                WritableMap a11 = gVar.a(webView, webView.getUrl());
                a11.putString(MessageExtension.FIELD_DATA, this.f20171b);
                if (f.this.f20164f != null) {
                    this.f20172c.h(a11);
                } else {
                    RNCWebViewManager.dispatchEvent(this.f20170a, new xq.f(this.f20170a.getId(), a11));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* loaded from: classes2.dex */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            private boolean f20174a = false;

            protected b() {
            }

            public boolean a() {
                return this.f20174a;
            }

            public void b(boolean z11) {
                this.f20174a = z11;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* loaded from: classes2.dex */
        public class c {

            /* renamed from: a  reason: collision with root package name */
            f f20175a;

            c(f fVar, f fVar2) {
                this.f20175a = fVar2;
            }

            @JavascriptInterface
            public void postMessage(String str) {
                this.f20175a.g(str);
            }
        }

        public f(n0 n0Var) {
            super(n0Var);
            this.f20161c = false;
            this.f20165g = false;
            this.f20167i = false;
            this.f20168j = new b();
        }

        public void a() {
            String str;
            if (!getSettings().getJavaScriptEnabled() || (str = this.f20159a) == null || TextUtils.isEmpty(str)) {
                return;
            }
            f("(function() {\n" + this.f20159a + ";\n})();");
        }

        public void b() {
            String str;
            if (!getSettings().getJavaScriptEnabled() || (str = this.f20160b) == null || TextUtils.isEmpty(str)) {
                return;
            }
            f("(function() {\n" + this.f20160b + ";\n})();");
        }

        protected void c() {
            setWebViewClient(null);
            destroy();
        }

        protected void d() {
            ReactContext reactContext = (ReactContext) getContext();
            if (reactContext != null) {
                this.f20164f = reactContext.getCatalystInstance();
            }
        }

        @Override // android.webkit.WebView
        public void destroy() {
            WebChromeClient webChromeClient = this.f20169k;
            if (webChromeClient != null) {
                webChromeClient.onHideCustomView();
            }
            super.destroy();
        }

        protected c e(f fVar) {
            return new c(this, fVar);
        }

        protected void f(String str) {
            if (Build.VERSION.SDK_INT >= 19) {
                evaluateJavascript(str, null);
                return;
            }
            try {
                loadUrl("javascript:" + URLEncoder.encode(str, RNCWebViewManager.HTML_ENCODING));
            } catch (UnsupportedEncodingException e11) {
                throw new RuntimeException(e11);
            }
        }

        public void g(String str) {
            ReactContext reactContext = (ReactContext) getContext();
            if (this.f20163e != null) {
                post(new a(this, str, this));
                return;
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putString(MessageExtension.FIELD_DATA, str);
            if (this.f20164f != null) {
                h(createMap);
            } else {
                RNCWebViewManager.dispatchEvent(this, new xq.f(getId(), createMap));
            }
        }

        public g getRNCWebViewClient() {
            return this.f20163e;
        }

        protected void h(WritableMap writableMap) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putMap("nativeEvent", writableMap);
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            writableNativeArray.pushMap(writableNativeMap);
            this.f20164f.callFunction(this.f20162d, "onMessage", writableNativeArray);
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
            c();
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
        }

        @Override // android.webkit.WebView, android.view.View
        protected void onScrollChanged(int i11, int i12, int i13, int i14) {
            super.onScrollChanged(i11, i12, i13, i14);
            if (this.f20167i) {
                if (this.f20166h == null) {
                    this.f20166h = new wg.b();
                }
                if (this.f20166h.c(i11, i12)) {
                    RNCWebViewManager.dispatchEvent(this, wg.g.c(getId(), com.facebook.react.views.scroll.b.SCROLL, i11, i12, this.f20166h.a(), this.f20166h.b(), computeHorizontalScrollRange(), computeVerticalScrollRange(), getWidth(), getHeight()));
                }
            }
        }

        @Override // android.webkit.WebView, android.view.View
        protected void onSizeChanged(int i11, int i12, int i13, int i14) {
            super.onSizeChanged(i11, i12, i13, i14);
            if (this.f20165g) {
                RNCWebViewManager.dispatchEvent(this, new com.facebook.react.uimanager.events.b(getId(), i11, i12));
            }
        }

        public void setHasScrollEvent(boolean z11) {
            this.f20167i = z11;
        }

        public void setIgnoreErrFailedForThisURL(String str) {
            this.f20163e.c(str);
        }

        public void setInjectedJavaScript(String str) {
            this.f20159a = str;
        }

        public void setInjectedJavaScriptBeforeContentLoaded(String str) {
            this.f20160b = str;
        }

        public void setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(boolean z11) {
        }

        public void setInjectedJavaScriptForMainFrameOnly(boolean z11) {
        }

        public void setMessagingEnabled(boolean z11) {
            if (this.f20161c == z11) {
                return;
            }
            this.f20161c = z11;
            if (z11) {
                addJavascriptInterface(e(this), RNCWebViewManager.JAVASCRIPT_INTERFACE);
                d();
                return;
            }
            removeJavascriptInterface(RNCWebViewManager.JAVASCRIPT_INTERFACE);
        }

        public void setMessagingModuleName(String str) {
            this.f20162d = str;
        }

        public void setSendContentSizeChangeEvents(boolean z11) {
            this.f20165g = z11;
        }

        @Override // android.webkit.WebView
        public void setWebChromeClient(WebChromeClient webChromeClient) {
            this.f20169k = webChromeClient;
            super.setWebChromeClient(webChromeClient);
            if (webChromeClient instanceof e) {
                ((e) webChromeClient).b(this.f20168j);
            }
        }

        @Override // android.webkit.WebView
        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            if (webViewClient instanceof g) {
                g gVar = (g) webViewClient;
                this.f20163e = gVar;
                gVar.d(this.f20168j);
            }
        }
    }

    public RNCWebViewManager() {
        this.mWebChromeClient = null;
        this.mAllowsFullscreenVideo = false;
        this.mUserAgent = null;
        this.mUserAgentWithApplicationName = null;
        this.mWebViewConfig = new a(this);
    }

    protected static void dispatchEvent(WebView webView, com.facebook.react.uimanager.events.c cVar) {
        ((UIManagerModule) ((ReactContext) webView.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().g(cVar);
    }

    public static RNCWebViewModule getModule(ReactContext reactContext) {
        return (RNCWebViewModule) reactContext.getNativeModule(RNCWebViewModule.class);
    }

    protected f createRNCWebViewInstance(n0 n0Var) {
        return new f(n0Var);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return yf.c.a().b("goBack", 1).b("goForward", 2).b("reload", 3).b("stopLoading", 4).b("postMessage", 5).b("injectJavaScript", 6).b("loadUrl", 7).b("requestFocus", 8).b("clearFormData", 1000).b("clearCache", 1001).b("clearHistory", 1002).a();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = yf.c.b();
        }
        exportedCustomDirectEventTypeConstants.put("topLoadingProgress", yf.c.d("registrationName", "onLoadingProgress"));
        exportedCustomDirectEventTypeConstants.put("topShouldStartLoadWithRequest", yf.c.d("registrationName", "onShouldStartLoadWithRequest"));
        exportedCustomDirectEventTypeConstants.put(com.facebook.react.views.scroll.b.getJSEventName(com.facebook.react.views.scroll.b.SCROLL), yf.c.d("registrationName", "onScroll"));
        exportedCustomDirectEventTypeConstants.put("topHttpError", yf.c.d("registrationName", "onHttpError"));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCWebView";
    }

    @ng.a(name = "allowFileAccess")
    public void setAllowFileAccess(WebView webView, Boolean bool) {
        webView.getSettings().setAllowFileAccess(bool != null && bool.booleanValue());
    }

    @ng.a(name = "allowFileAccessFromFileURLs")
    public void setAllowFileAccessFromFileURLs(WebView webView, boolean z11) {
        webView.getSettings().setAllowFileAccessFromFileURLs(z11);
    }

    @ng.a(name = "allowUniversalAccessFromFileURLs")
    public void setAllowUniversalAccessFromFileURLs(WebView webView, boolean z11) {
        webView.getSettings().setAllowUniversalAccessFromFileURLs(z11);
    }

    @ng.a(name = "allowsFullscreenVideo")
    public void setAllowsFullscreenVideo(WebView webView, Boolean bool) {
        this.mAllowsFullscreenVideo = bool != null && bool.booleanValue();
        setupWebChromeClient((ReactContext) webView.getContext(), webView);
    }

    @ng.a(name = "applicationNameForUserAgent")
    public void setApplicationNameForUserAgent(WebView webView, String str) {
        if (str != null) {
            if (Build.VERSION.SDK_INT >= 17) {
                String defaultUserAgent = WebSettings.getDefaultUserAgent(webView.getContext());
                this.mUserAgentWithApplicationName = defaultUserAgent + " " + str;
            }
        } else {
            this.mUserAgentWithApplicationName = null;
        }
        setUserAgentString(webView);
    }

    @ng.a(name = "cacheEnabled")
    public void setCacheEnabled(WebView webView, boolean z11) {
        if (z11) {
            Context context = webView.getContext();
            if (context != null) {
                webView.getSettings().setAppCachePath(context.getCacheDir().getAbsolutePath());
                webView.getSettings().setCacheMode(-1);
                webView.getSettings().setAppCacheEnabled(true);
                return;
            }
            return;
        }
        webView.getSettings().setCacheMode(2);
        webView.getSettings().setAppCacheEnabled(false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @ng.a(name = "cacheMode")
    public void setCacheMode(WebView webView, String str) {
        boolean z11;
        Integer num;
        switch (str.hashCode()) {
            case -2059164003:
                if (str.equals("LOAD_NO_CACHE")) {
                    z11 = true;
                    break;
                }
                z11 = true;
                break;
            case -1215135800:
                if (str.equals("LOAD_DEFAULT")) {
                    z11 = true;
                    break;
                }
                z11 = true;
                break;
            case -873877826:
                if (str.equals("LOAD_CACHE_ELSE_NETWORK")) {
                    z11 = true;
                    break;
                }
                z11 = true;
                break;
            case 1548620642:
                if (str.equals("LOAD_CACHE_ONLY")) {
                    z11 = false;
                    break;
                }
                z11 = true;
                break;
            default:
                z11 = true;
                break;
        }
        if (!z11) {
            num = 3;
        } else if (z11) {
            num = 1;
        } else if (!z11) {
            num = -1;
        } else {
            num = 2;
        }
        webView.getSettings().setCacheMode(num.intValue());
    }

    @ng.a(name = "domStorageEnabled")
    public void setDomStorageEnabled(WebView webView, boolean z11) {
        webView.getSettings().setDomStorageEnabled(z11);
    }

    @ng.a(name = "geolocationEnabled")
    public void setGeolocationEnabled(WebView webView, Boolean bool) {
        webView.getSettings().setGeolocationEnabled(bool != null && bool.booleanValue());
    }

    @ng.a(name = "androidHardwareAccelerationDisabled")
    public void setHardwareAccelerationDisabled(WebView webView, boolean z11) {
        if (z11) {
            webView.setLayerType(1, null);
        }
    }

    @ng.a(name = "incognito")
    public void setIncognito(WebView webView, boolean z11) {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().removeAllCookies(null);
        } else {
            CookieManager.getInstance().removeAllCookie();
        }
        webView.getSettings().setCacheMode(2);
        webView.getSettings().setAppCacheEnabled(!z11);
        webView.clearHistory();
        webView.clearCache(z11);
        webView.clearFormData();
        webView.getSettings().setSavePassword(!z11);
        webView.getSettings().setSaveFormData(!z11);
    }

    @ng.a(name = "injectedJavaScript")
    public void setInjectedJavaScript(WebView webView, String str) {
        ((f) webView).setInjectedJavaScript(str);
    }

    @ng.a(name = "injectedJavaScriptBeforeContentLoaded")
    public void setInjectedJavaScriptBeforeContentLoaded(WebView webView, String str) {
        ((f) webView).setInjectedJavaScriptBeforeContentLoaded(str);
    }

    @ng.a(name = "injectedJavaScriptBeforeContentLoadedForMainFrameOnly")
    public void setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(WebView webView, boolean z11) {
        ((f) webView).setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(z11);
    }

    @ng.a(name = "injectedJavaScriptForMainFrameOnly")
    public void setInjectedJavaScriptForMainFrameOnly(WebView webView, boolean z11) {
        ((f) webView).setInjectedJavaScriptForMainFrameOnly(z11);
    }

    @ng.a(name = "javaScriptCanOpenWindowsAutomatically")
    public void setJavaScriptCanOpenWindowsAutomatically(WebView webView, boolean z11) {
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(z11);
    }

    @ng.a(name = "javaScriptEnabled")
    public void setJavaScriptEnabled(WebView webView, boolean z11) {
        webView.getSettings().setJavaScriptEnabled(z11);
    }

    @ng.a(name = "mediaPlaybackRequiresUserAction")
    public void setMediaPlaybackRequiresUserAction(WebView webView, boolean z11) {
        webView.getSettings().setMediaPlaybackRequiresUserGesture(z11);
    }

    @ng.a(name = "messagingEnabled")
    public void setMessagingEnabled(WebView webView, boolean z11) {
        ((f) webView).setMessagingEnabled(z11);
    }

    @ng.a(name = "messagingModuleName")
    public void setMessagingModuleName(WebView webView, String str) {
        ((f) webView).setMessagingModuleName(str);
    }

    @ng.a(name = "mixedContentMode")
    public void setMixedContentMode(WebView webView, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            if (str != null && !PermissionsResponse.PERMISSION_EXPIRES_NEVER.equals(str)) {
                if (PermissionsResponse.SCOPE_ALWAYS.equals(str)) {
                    webView.getSettings().setMixedContentMode(0);
                    return;
                } else if ("compatibility".equals(str)) {
                    webView.getSettings().setMixedContentMode(2);
                    return;
                } else {
                    return;
                }
            }
            webView.getSettings().setMixedContentMode(1);
        }
    }

    @ng.a(name = "onContentSizeChange")
    public void setOnContentSizeChange(WebView webView, boolean z11) {
        ((f) webView).setSendContentSizeChangeEvents(z11);
    }

    @ng.a(name = "onScroll")
    public void setOnScroll(WebView webView, boolean z11) {
        ((f) webView).setHasScrollEvent(z11);
    }

    @ng.a(name = "overScrollMode")
    public void setOverScrollMode(WebView webView, String str) {
        char c11;
        Integer num;
        int hashCode = str.hashCode();
        if (hashCode == -1414557169) {
            if (str.equals(PermissionsResponse.SCOPE_ALWAYS)) {
                c11 = 2;
            }
            c11 = 65535;
        } else if (hashCode != 104712844) {
            if (hashCode == 951530617 && str.equals("content")) {
                c11 = 1;
            }
            c11 = 65535;
        } else {
            if (str.equals(PermissionsResponse.PERMISSION_EXPIRES_NEVER)) {
                c11 = 0;
            }
            c11 = 65535;
        }
        if (c11 == 0) {
            num = 2;
        } else if (c11 != 1) {
            num = 0;
        } else {
            num = 1;
        }
        webView.setOverScrollMode(num.intValue());
    }

    @ng.a(name = "saveFormDataDisabled")
    public void setSaveFormDataDisabled(WebView webView, boolean z11) {
        webView.getSettings().setSaveFormData(!z11);
    }

    @ng.a(name = "scalesPageToFit")
    public void setScalesPageToFit(WebView webView, boolean z11) {
        webView.getSettings().setLoadWithOverviewMode(z11);
        webView.getSettings().setUseWideViewPort(z11);
    }

    @ng.a(name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(WebView webView, boolean z11) {
        webView.setHorizontalScrollBarEnabled(z11);
    }

    @ng.a(name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(WebView webView, boolean z11) {
        webView.setVerticalScrollBarEnabled(z11);
    }

    @ng.a(name = Stripe3ds2AuthParams.FIELD_SOURCE)
    public void setSource(WebView webView, ReadableMap readableMap) {
        if (readableMap != null) {
            if (readableMap.hasKey("html")) {
                webView.loadDataWithBaseURL(readableMap.hasKey("baseUrl") ? readableMap.getString("baseUrl") : "", readableMap.getString("html"), HTML_MIME_TYPE, HTML_ENCODING, null);
                return;
            } else if (readableMap.hasKey("uri")) {
                String string = readableMap.getString("uri");
                String url = webView.getUrl();
                if (url == null || !url.equals(string)) {
                    if (readableMap.hasKey("method") && readableMap.getString("method").equalsIgnoreCase(HTTP_METHOD_POST)) {
                        byte[] bArr = null;
                        if (readableMap.hasKey("body")) {
                            String string2 = readableMap.getString("body");
                            try {
                                bArr = string2.getBytes(HTML_ENCODING);
                            } catch (UnsupportedEncodingException unused) {
                                bArr = string2.getBytes();
                            }
                        }
                        if (bArr == null) {
                            bArr = new byte[0];
                        }
                        webView.postUrl(string, bArr);
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    if (readableMap.hasKey("headers")) {
                        ReadableMap map = readableMap.getMap("headers");
                        ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
                        while (keySetIterator.hasNextKey()) {
                            String nextKey = keySetIterator.nextKey();
                            if ("user-agent".equals(nextKey.toLowerCase(Locale.ENGLISH))) {
                                if (webView.getSettings() != null) {
                                    webView.getSettings().setUserAgentString(map.getString(nextKey));
                                }
                            } else {
                                hashMap.put(nextKey, map.getString(nextKey));
                            }
                        }
                    }
                    webView.loadUrl(string, hashMap);
                    return;
                }
                return;
            }
        }
        webView.loadUrl("about:blank");
    }

    @ng.a(name = "textZoom")
    public void setTextZoom(WebView webView, int i11) {
        webView.getSettings().setTextZoom(i11);
    }

    @ng.a(name = "thirdPartyCookiesEnabled")
    public void setThirdPartyCookiesEnabled(WebView webView, boolean z11) {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, z11);
        }
    }

    @ng.a(name = "urlPrefixesForDefaultIntent")
    public void setUrlPrefixesForDefaultIntent(WebView webView, ReadableArray readableArray) {
        g rNCWebViewClient = ((f) webView).getRNCWebViewClient();
        if (rNCWebViewClient == null || readableArray == null) {
            return;
        }
        rNCWebViewClient.e(readableArray);
    }

    @ng.a(name = "userAgent")
    public void setUserAgent(WebView webView, String str) {
        if (str != null) {
            this.mUserAgent = str;
        } else {
            this.mUserAgent = null;
        }
        setUserAgentString(webView);
    }

    protected void setUserAgentString(WebView webView) {
        if (this.mUserAgent != null) {
            webView.getSettings().setUserAgentString(this.mUserAgent);
        } else if (this.mUserAgentWithApplicationName != null) {
            webView.getSettings().setUserAgentString(this.mUserAgentWithApplicationName);
        } else if (Build.VERSION.SDK_INT >= 17) {
            webView.getSettings().setUserAgentString(WebSettings.getDefaultUserAgent(webView.getContext()));
        }
    }

    protected void setupWebChromeClient(ReactContext reactContext, WebView webView) {
        if (this.mAllowsFullscreenVideo) {
            c cVar = new c(this, reactContext, webView, reactContext.getCurrentActivity().getRequestedOrientation());
            this.mWebChromeClient = cVar;
            webView.setWebChromeClient(cVar);
            return;
        }
        e eVar = this.mWebChromeClient;
        if (eVar != null) {
            eVar.onHideCustomView();
        }
        d dVar = new d(this, reactContext, webView);
        this.mWebChromeClient = dVar;
        webView.setWebChromeClient(dVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(n0 n0Var, WebView webView) {
        webView.setWebViewClient(new g());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public WebView createViewInstance(n0 n0Var) {
        f createRNCWebViewInstance = createRNCWebViewInstance(n0Var);
        setupWebChromeClient(n0Var, createRNCWebViewInstance);
        n0Var.addLifecycleEventListener(createRNCWebViewInstance);
        this.mWebViewConfig.a(createRNCWebViewInstance);
        WebSettings settings = createRNCWebViewInstance.getSettings();
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        if (Build.VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(false);
            setAllowUniversalAccessFromFileURLs(createRNCWebViewInstance, false);
        }
        setMixedContentMode(createRNCWebViewInstance, PermissionsResponse.PERMISSION_EXPIRES_NEVER);
        createRNCWebViewInstance.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        createRNCWebViewInstance.setDownloadListener(new b(this, createRNCWebViewInstance, n0Var));
        return createRNCWebViewInstance;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(WebView webView) {
        super.onDropViewInstance((RNCWebViewManager) webView);
        f fVar = (f) webView;
        ((n0) webView.getContext()).removeLifecycleEventListener(fVar);
        fVar.c();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(WebView webView, int i11, ReadableArray readableArray) {
        boolean z11 = false;
        switch (i11) {
            case 1:
                webView.goBack();
                return;
            case 2:
                webView.goForward();
                return;
            case 3:
                webView.reload();
                return;
            case 4:
                webView.stopLoading();
                return;
            case 5:
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(MessageExtension.FIELD_DATA, readableArray.getString(0));
                    ((f) webView).f("(function () {var event;var data = " + jSONObject.toString() + ";try {event = new MessageEvent('message', data);} catch (e) {event = document.createEvent('MessageEvent');event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();");
                    return;
                } catch (JSONException e11) {
                    throw new RuntimeException(e11);
                }
            case 6:
                ((f) webView).f(readableArray.getString(0));
                return;
            case 7:
                if (readableArray != null) {
                    ((f) webView).f20168j.b(false);
                    webView.loadUrl(readableArray.getString(0));
                    return;
                }
                throw new RuntimeException("Arguments for loading an url are null!");
            case 8:
                webView.requestFocus();
                return;
            default:
                switch (i11) {
                    case 1000:
                        webView.clearFormData();
                        return;
                    case 1001:
                        if (readableArray != null && readableArray.getBoolean(0)) {
                            z11 = true;
                        }
                        webView.clearCache(z11);
                        return;
                    case 1002:
                        webView.clearHistory();
                        return;
                    default:
                        return;
                }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public static class g extends WebViewClient {

        /* renamed from: b  reason: collision with root package name */
        protected ReadableArray f20177b;

        /* renamed from: a  reason: collision with root package name */
        protected boolean f20176a = false;

        /* renamed from: c  reason: collision with root package name */
        protected f.b f20178c = null;

        /* renamed from: d  reason: collision with root package name */
        protected String f20179d = null;

        protected g() {
        }

        protected WritableMap a(WebView webView, String str) {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("target", webView.getId());
            createMap.putString("url", str);
            createMap.putBoolean("loading", (this.f20176a || webView.getProgress() == 100) ? false : true);
            createMap.putString(MessageBundle.TITLE_ENTRY, webView.getTitle());
            createMap.putBoolean("canGoBack", webView.canGoBack());
            createMap.putBoolean("canGoForward", webView.canGoForward());
            return createMap;
        }

        protected void b(WebView webView, String str) {
            RNCWebViewManager.dispatchEvent(webView, new xq.c(webView.getId(), a(webView, str)));
        }

        public void c(String str) {
            this.f20179d = str;
        }

        public void d(f.b bVar) {
            this.f20178c = bVar;
        }

        public void e(ReadableArray readableArray) {
            this.f20177b = readableArray;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (this.f20176a) {
                return;
            }
            ((f) webView).a();
            b(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            this.f20176a = false;
            ((f) webView).b();
            RNCWebViewManager.dispatchEvent(webView, new xq.e(webView.getId(), a(webView, str)));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i11, String str, String str2) {
            String str3 = this.f20179d;
            if (str3 != null && str2.equals(str3) && i11 == -1 && str.equals("net::ERR_FAILED")) {
                c(null);
                return;
            }
            super.onReceivedError(webView, i11, str, str2);
            this.f20176a = true;
            b(webView, str2);
            WritableMap a11 = a(webView, str2);
            a11.putDouble(PaymentMethodOptionsParams.Blik.PARAM_CODE, i11);
            a11.putString("description", str);
            RNCWebViewManager.dispatchEvent(webView, new xq.b(webView.getId(), a11));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest.isForMainFrame()) {
                WritableMap a11 = a(webView, webResourceRequest.getUrl().toString());
                a11.putInt("statusCode", webResourceResponse.getStatusCode());
                a11.putString("description", webResourceResponse.getReasonPhrase());
                RNCWebViewManager.dispatchEvent(webView, new xq.a(webView.getId(), a11));
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            sslErrorHandler.cancel();
            int primaryError = sslError.getPrimaryError();
            String url = sslError.getUrl();
            String str = primaryError != 0 ? primaryError != 1 ? primaryError != 2 ? primaryError != 3 ? primaryError != 4 ? primaryError != 5 ? "Unknown SSL Error" : "A generic error occurred" : "The date of the certificate is invalid" : "The certificate authority is not trusted" : "Hostname mismatch" : "The certificate has expired" : "The certificate is not yet valid";
            onReceivedError(webView, primaryError, "SSL error: " + str, url);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.f20178c.b(true);
            RNCWebViewManager.dispatchEvent(webView, new xq.g(webView.getId(), a(webView, str)));
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }
    }

    public RNCWebViewManager(com.reactnativecommunity.webview.b bVar) {
        this.mWebChromeClient = null;
        this.mAllowsFullscreenVideo = false;
        this.mUserAgent = null;
        this.mUserAgentWithApplicationName = null;
        this.mWebViewConfig = bVar;
    }
}