package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeZoneWebViewBinding;
import com.stripe.android.stripe3ds2.views.ThreeDS2WebViewClient;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class ChallengeZoneWebView extends FrameLayout implements FormField {
    @Deprecated
    private static final String ENCODING = "UTF-8";
    @Deprecated
    private static final String HTML_MIME_TYPE = "text/html";
    @Deprecated
    private static final String METHOD_GET = "method=\"get\"";
    private View.OnClickListener onClickListener;
    private String userEntry;
    private final ThreeDS2WebView webView;
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final Pattern PATTERN_METHOD_POST = Pattern.compile("method=\"post\"", 10);
    @Deprecated
    private static final Pattern PATTERN_FORM_ACTION = Pattern.compile("action=\"(.+?)\"", 10);

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneWebView(Context context) {
        this(context, null, 0, 6, null);
        s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.g(context, "context");
    }

    public /* synthetic */ ChallengeZoneWebView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* renamed from: _init_$lambda-0 */
    public static final void m360_init_$lambda0(ChallengeZoneWebView this$0, String str) {
        s.g(this$0, "this$0");
        if (str == null) {
            str = "";
        }
        this$0.userEntry = str;
        View.OnClickListener onClickListener = this$0.onClickListener;
        if (onClickListener == null) {
            return;
        }
        onClickListener.onClick(this$0);
    }

    public static /* synthetic */ void a(ChallengeZoneWebView challengeZoneWebView, String str) {
        m360_init_$lambda0(challengeZoneWebView, str);
    }

    private final String transformFormActionUrl(String str) {
        String group;
        Matcher matcher = PATTERN_FORM_ACTION.matcher(str);
        return (!matcher.find() || (group = matcher.group(1)) == null || s.c(ThreeDS2WebViewClient.CHALLENGE_URL, group)) ? str : new kotlin.text.i(group).i(str, ThreeDS2WebViewClient.CHALLENGE_URL);
    }

    private final String transformFormMethod(String str) {
        String replaceAll = PATTERN_METHOD_POST.matcher(str).replaceAll(METHOD_GET);
        s.f(replaceAll, "methodMatcher.replaceAll(METHOD_GET)");
        return replaceAll;
    }

    public final View.OnClickListener getOnClickListener$3ds2sdk_release() {
        return this.onClickListener;
    }

    @Override // com.stripe.android.stripe3ds2.views.FormField
    public String getUserEntry() {
        return this.userEntry;
    }

    public final ThreeDS2WebView getWebView() {
        return this.webView;
    }

    public final void loadHtml(String str) {
        if (str == null) {
            return;
        }
        this.webView.loadDataWithBaseURL(null, transformHtml$3ds2sdk_release(str), HTML_MIME_TYPE, ENCODING, null);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public final void setOnClickListener$3ds2sdk_release(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public final String transformHtml$3ds2sdk_release(String html) {
        s.g(html, "html");
        return transformFormActionUrl(transformFormMethod(html));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneWebView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.g(context, "context");
        this.userEntry = "";
        StripeChallengeZoneWebViewBinding inflate = StripeChallengeZoneWebViewBinding.inflate(LayoutInflater.from(context), this);
        s.f(inflate, "inflate(\n            Lay…           this\n        )");
        ThreeDS2WebView threeDS2WebView = inflate.webView;
        s.f(threeDS2WebView, "viewBinding.webView");
        this.webView = threeDS2WebView;
        threeDS2WebView.setOnHtmlSubmitListener$3ds2sdk_release(new ThreeDS2WebViewClient.OnHtmlSubmitListener() { // from class: com.stripe.android.stripe3ds2.views.m
            {
                ChallengeZoneWebView.this = this;
            }

            @Override // com.stripe.android.stripe3ds2.views.ThreeDS2WebViewClient.OnHtmlSubmitListener
            public final void onHtmlSubmit(String str) {
                ChallengeZoneWebView.a(ChallengeZoneWebView.this, str);
            }
        });
    }
}