package atd.q0;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adyen.threeds2.R;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class b extends atd.q0.a<atd.d.f, atd.p0.b> {

    /* renamed from: c  reason: collision with root package name */
    static final Charset f6916c;

    /* renamed from: b  reason: collision with root package name */
    private final WebView f6917b;

    static {
        atd.s0.a.a(-840644022823488L);
        atd.s0.a.a(-840656907725376L);
        atd.s0.a.a(-840665497659968L);
        atd.s0.a.a(-840704152365632L);
        atd.s0.a.a(-841034864847424L);
        f6916c = com.adyen.threeds2.internal.b.f9630a;
    }

    public b(Context context) {
        this(context, null);
    }

    public void a(atd.d.f fVar) {
        a(fVar.b());
    }

    public void b(atd.d.f fVar) {
        a(fVar.c());
    }

    @Override // atd.q0.a
    protected int getChallengeContainerLayoutId() {
        return R.layout.a3ds2_view_challenge_html_container;
    }

    /* loaded from: classes.dex */
    private final class a extends WebViewClient {
        a() {
        }

        private WebResourceResponse a(Uri uri) {
            if (atd.s0.a.a(-841185188702784L).equals(uri.getScheme())) {
                return null;
            }
            if (atd.s0.a.a(-841198073604672L).equalsIgnoreCase(uri.getScheme()) && atd.s0.a.a(-841241023277632L).equalsIgnoreCase(uri.getHost()) && atd.s0.a.a(-841554555890240L).equalsIgnoreCase(uri.getPath())) {
                if (b.this.getChallengeListener() != null) {
                    b.this.getChallengeListener().b(uri.getQuery());
                }
                return a(atd.s0.a.a(-841576030726720L));
            }
            return a(atd.s0.a.a(-841606095497792L) + uri.toString());
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            try {
                return a(Uri.parse(str));
            } catch (Exception unused) {
                return a(atd.s0.a.a(-841382757198400L) + str);
            }
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            return a(webResourceRequest.getUrl());
        }

        private WebResourceResponse a(String str) {
            String a11 = atd.s0.a.a(-841515901184576L);
            Charset charset = b.f6916c;
            return new WebResourceResponse(a11, charset.toString(), new ByteArrayInputStream(str.getBytes(charset)));
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f6917b.loadDataWithBaseURL(atd.s0.a.a(-840790051711552L), atd.r0.a.a().c(str), atd.s0.a.a(-840785756744256L), f6916c.toString(), null);
    }

    public b(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        WebView webView = (WebView) findViewById(R.id.webView_htmlChallengeContainer);
        this.f6917b = webView;
        webView.getSettings().setJavaScriptEnabled(false);
        webView.setWebViewClient(new a());
    }
}