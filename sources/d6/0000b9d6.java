package v9;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.JsPromptResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.lang.reflect.Method;
import t9.j;
import t9.m;

/* loaded from: classes.dex */
public class e extends LinearLayout {

    /* renamed from: l  reason: collision with root package name */
    public static Handler f54404l = new Handler(Looper.getMainLooper());

    /* renamed from: a  reason: collision with root package name */
    public ImageView f54405a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f54406b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f54407c;

    /* renamed from: d  reason: collision with root package name */
    public ProgressBar f54408d;

    /* renamed from: e  reason: collision with root package name */
    public WebView f54409e;

    /* renamed from: f  reason: collision with root package name */
    public final C1226e f54410f;

    /* renamed from: g  reason: collision with root package name */
    public f f54411g;

    /* renamed from: h  reason: collision with root package name */
    public g f54412h;

    /* renamed from: i  reason: collision with root package name */
    public h f54413i;

    /* renamed from: j  reason: collision with root package name */
    public View.OnClickListener f54414j;

    /* renamed from: k  reason: collision with root package name */
    public final float f54415k;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: v9.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC1225a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f54417a;

            public RunnableC1225a(a aVar, View view) {
                this.f54417a = view;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f54417a.setEnabled(true);
            }
        }

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h hVar = e.this.f54413i;
            if (hVar != null) {
                view.setEnabled(false);
                e.f54404l.postDelayed(new RunnableC1225a(this, view), 256L);
                if (view != e.this.f54405a) {
                    if (view == e.this.f54407c) {
                        hVar.g(e.this);
                        return;
                    }
                    return;
                }
                hVar.h(e.this);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements DownloadListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f54418a;

        public b(e eVar, Context context) {
            this.f54418a = context;
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j11) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                this.f54418a.startActivity(intent);
            } catch (Throwable unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends WebChromeClient {
        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            return e.this.f54411g.i(e.this, str, str2, str3, jsPromptResult);
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i11) {
            if (!e.this.f54410f.f54422b) {
                e.this.f54408d.setVisibility(8);
            } else if (i11 > 90) {
                e.this.f54408d.setVisibility(4);
            } else {
                if (e.this.f54408d.getVisibility() == 4) {
                    e.this.f54408d.setVisibility(0);
                }
                e.this.f54408d.setProgress(i11);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            e.this.f54411g.f(e.this, str);
        }
    }

    /* loaded from: classes.dex */
    public class d extends WebViewClient {
        public d() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (e.this.f54412h.b(e.this, str)) {
                return;
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (e.this.f54412h.e(e.this, str)) {
                return;
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i11, String str, String str2) {
            if (e.this.f54412h.c(e.this, i11, str, str2)) {
                return;
            }
            super.onReceivedError(webView, i11, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (e.this.f54412h.a(e.this, sslErrorHandler, sslError)) {
                return;
            }
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (e.this.f54412h.d(e.this, str)) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    /* renamed from: v9.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1226e {

        /* renamed from: a  reason: collision with root package name */
        public boolean f54421a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f54422b;

        public C1226e(boolean z11, boolean z12) {
            this.f54421a = z11;
            this.f54422b = z12;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void f(e eVar, String str);

        boolean i(e eVar, String str, String str2, String str3, JsPromptResult jsPromptResult);
    }

    /* loaded from: classes.dex */
    public interface g {
        boolean a(e eVar, SslErrorHandler sslErrorHandler, SslError sslError);

        boolean b(e eVar, String str);

        boolean c(e eVar, int i11, String str, String str2);

        boolean d(e eVar, String str);

        boolean e(e eVar, String str);
    }

    /* loaded from: classes.dex */
    public interface h {
        void g(e eVar);

        void h(e eVar);
    }

    public e(Context context, r9.a aVar, C1226e c1226e) {
        this(context, null, aVar, c1226e);
    }

    private int a(int i11) {
        return (int) (i11 * this.f54415k);
    }

    private void d(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackgroundColor(-218103809);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setVisibility(this.f54410f.f54421a ? 0 : 8);
        ImageView imageView = new ImageView(context);
        this.f54405a = imageView;
        imageView.setOnClickListener(this.f54414j);
        this.f54405a.setScaleType(ImageView.ScaleType.CENTER);
        this.f54405a.setImageDrawable(j.a("iVBORw0KGgoAAAANSUhEUgAAAEgAAABIBAMAAACnw650AAAAFVBMVEUAAAARjusRkOkQjuoRkeoRj+oQjunya570AAAABnRSTlMAinWeSkk7CjRNAAAAZElEQVRIx+3MOw6AIBQF0YsrMDGx1obaLeGH/S9BQgkJ82rypp4ceTN1ilvyKizmZIAyU7FML0JVYig55BBAfQ2EU4V4CpZJ+2AiSj11C6rUoTannBpRn4W6xNQjLBSI2+TN0w/+3HT2wPClrQAAAABJRU5ErkJggg==", context));
        this.f54405a.setPadding(a(12), 0, a(12), 0);
        linearLayout.addView(this.f54405a, new LinearLayout.LayoutParams(-2, -2));
        View view = new View(context);
        view.setBackgroundColor(-2500135);
        linearLayout.addView(view, new LinearLayout.LayoutParams(a(1), a(25)));
        TextView textView = new TextView(context);
        this.f54406b = textView;
        textView.setTextColor(-15658735);
        this.f54406b.setTextSize(17.0f);
        this.f54406b.setMaxLines(1);
        this.f54406b.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(a(17), 0, 0, 0);
        layoutParams.weight = 1.0f;
        linearLayout.addView(this.f54406b, layoutParams);
        ImageView imageView2 = new ImageView(context);
        this.f54407c = imageView2;
        imageView2.setOnClickListener(this.f54414j);
        this.f54407c.setScaleType(ImageView.ScaleType.CENTER);
        this.f54407c.setImageDrawable(j.a("iVBORw0KGgoAAAANSUhEUgAAAEgAAABICAMAAABiM0N1AAAAmVBMVEUAAAARj+oQjuoRkOsVk/AQj+oRjuoQj+oSkO3///8Rj+kRj+oQkOsTk+whm/8Qj+oRj+oQj+oSkus2p/8QjuoQj+oQj+oQj+oQj+oRj+oTkuwRj+oQj+oRj+oRj+oSkOsSkO0ZlfMbk+8XnPgQj+oRj+oQj+oQj+sSj+sRkOoSkescqv8Rj+oQj+oSj+sXku4Rj+kQjuoQjumXGBCVAAAAMnRSTlMAxPtPF8ry7CoB9npbGwe6lm0wBODazb1+aSejm5GEYjcTDwvls6uJc0g/CdWfRCF20AXrk5QAAAJqSURBVFjD7ZfXmpswEIUFphmDCxi3talurGvm/R8uYSDe5FNBwlzsxf6XmvFBmiaZ/PCdWDk9CWn61OhHCMAaXfoRAth7wx6EkMXnWyrho4yg4bDpquI8Jy78Q7eoj9cmUFijsaLM0JsD9CD0uQAa9aNdPuCFvbA7B9t/Becap8Pu6Q/2jcyH81VHc/WCHDQZXwbvtUhQ61iDlqadncU6Rp31yGkZIzOAu7AjtPpYGREzq/pY5DRFHS1siyO6HfkOKTrMjdb2qevV4zosK7MbkFY2LmYk55hL6juCIFWMOI2KGzblmho3b18EIbxL1hs6r5m2Q2WaEElwS3NW4xh6ZZJuzTtUsBKT4G0h35s4y1mNgkNoS6TZ8SKBXTZQGBNYdPTozXGYKoyLAmOasttjThT4xT6Ch+2qIjRhV9Ja3NC87Kyo5We1vCNEMW1T+j1VLZ9UhE54Q1DL52r5piJ0YxdegvWlHOwTu76uKkJX+MOTHno4YFSEbHYdhViojsLrCTg/MKnhKWaEYzvkZFM8aOkPH7iTSvoFZKD7jGEJbarkRaxQyOeWvGVIbsji152jK7TbDgRzcIuz7SGj89BFU8d30TqWeDtrILxyTkD1IXfvmHseuU3lVHDz607bw0f3xDqejm5ncd0j8VDwfoibRy8RcgTkWHBvocbDbMlJsQAkGnAOHwGy90kLmQY1Wkob07/GaCNRIzdoWK7/+6y/XkLDJCcynOGFuUrKIMuCMonNr9VpSOQoIxBgJ0SacGbzZNy4ICrkscvU2fpElYz+U3sd+aQThjfVmjNa5i15kLcojM3Gz8kP34jf4VaV3X55gNEAAAAASUVORK5CYII=", context));
        this.f54407c.setPadding(a(12), 0, a(12), 0);
        linearLayout.addView(this.f54407c, new LinearLayout.LayoutParams(-2, -2));
        addView(linearLayout, new LinearLayout.LayoutParams(-1, a(48)));
    }

    private void j(Context context) {
        ProgressBar progressBar = new ProgressBar(context, null, 16973855);
        this.f54408d = progressBar;
        progressBar.setProgressDrawable(context.getResources().getDrawable(17301612));
        this.f54408d.setMax(100);
        this.f54408d.setBackgroundColor(-218103809);
        addView(this.f54408d, new LinearLayout.LayoutParams(-1, a(2)));
    }

    private void l(Context context) {
        WebView webView = new WebView(context);
        this.f54409e = webView;
        webView.setVerticalScrollbarOverlay(true);
        e(this.f54409e, context);
        WebSettings settings = this.f54409e.getSettings();
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setSupportMultipleWindows(true);
        settings.setUseWideViewPort(true);
        settings.setAppCacheMaxSize(5242880L);
        settings.setAppCachePath(context.getCacheDir().getAbsolutePath());
        settings.setAllowFileAccess(false);
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        if (Build.VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
        }
        settings.setAppCacheEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setCacheMode(1);
        settings.setDomStorageEnabled(true);
        settings.setAllowContentAccess(false);
        this.f54409e.setVerticalScrollbarOverlay(true);
        this.f54409e.setDownloadListener(new b(this, context));
        try {
            try {
                this.f54409e.removeJavascriptInterface("searchBoxJavaBridge_");
                this.f54409e.removeJavascriptInterface("accessibility");
                this.f54409e.removeJavascriptInterface("accessibilityTraversal");
            } catch (Exception unused) {
                Method method = this.f54409e.getClass().getMethod("removeJavascriptInterface", new Class[0]);
                if (method != null) {
                    method.invoke(this.f54409e, "searchBoxJavaBridge_");
                    method.invoke(this.f54409e, "accessibility");
                    method.invoke(this.f54409e, "accessibilityTraversal");
                }
            }
        } catch (Throwable unused2) {
        }
        v9.c.j(this.f54409e);
        addView(this.f54409e, new LinearLayout.LayoutParams(-1, -1));
    }

    public void c() {
        removeAllViews();
        this.f54409e.removeAllViews();
        this.f54409e.setWebViewClient(null);
        this.f54409e.setWebChromeClient(null);
        this.f54409e.destroy();
    }

    public void e(WebView webView, Context context) {
        String userAgentString = webView.getSettings().getUserAgentString();
        WebSettings settings = webView.getSettings();
        settings.setUserAgentString(userAgentString + m.W(context));
    }

    public void f(String str) {
        this.f54409e.loadUrl(str);
        v9.c.j(this.f54409e);
    }

    public void g(String str, byte[] bArr) {
        this.f54409e.postUrl(str, bArr);
    }

    public ImageView getBackButton() {
        return this.f54405a;
    }

    public ProgressBar getProgressbar() {
        return this.f54408d;
    }

    public ImageView getRefreshButton() {
        return this.f54407c;
    }

    public TextView getTitle() {
        return this.f54406b;
    }

    public String getUrl() {
        return this.f54409e.getUrl();
    }

    public WebView getWebView() {
        return this.f54409e;
    }

    public void setChromeProxy(f fVar) {
        this.f54411g = fVar;
        if (fVar == null) {
            this.f54409e.setWebChromeClient(null);
        } else {
            this.f54409e.setWebChromeClient(new c());
        }
    }

    public void setWebClientProxy(g gVar) {
        this.f54412h = gVar;
        if (gVar == null) {
            this.f54409e.setWebViewClient(null);
        } else {
            this.f54409e.setWebViewClient(new d());
        }
    }

    public void setWebEventProxy(h hVar) {
        this.f54413i = hVar;
    }

    public e(Context context, AttributeSet attributeSet, r9.a aVar, C1226e c1226e) {
        super(context, attributeSet);
        this.f54414j = new a();
        this.f54410f = c1226e == null ? new C1226e(false, false) : c1226e;
        this.f54415k = context.getResources().getDisplayMetrics().density;
        setOrientation(1);
        d(context);
        j(context);
        l(context);
    }
}