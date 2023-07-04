package com.plaid.internal;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.plaid.core.webview.PlaidWebview;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithWebview$ButtonWithWebviewPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.ui_components.PlaidNavigationBar;
import com.plaid.internal.core.ui_components.PlaidPrimaryButton;
import com.plaid.internal.core.ui_components.PlaidSecondaryButton;
import com.plaid.internal.wa;
import com.plaid.link.R;
import kotlin.KotlinNothingValueException;

/* loaded from: classes2.dex */
public final class p0 extends pd<s0> implements PlaidWebview.a {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f19197f = 0;

    /* renamed from: e  reason: collision with root package name */
    public o8 f19198e;

    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<Common$LocalAction, vz.b0> {
        public a() {
            super(1);
        }

        @Override // h00.l
        public vz.b0 invoke(Common$LocalAction common$LocalAction) {
            Common$LocalAction it2 = common$LocalAction;
            kotlin.jvm.internal.s.g(it2, "it");
            p0 p0Var = p0.this;
            p0Var.a(it2, (h00.l<? super String, vz.b0>) null, new o0(p0Var));
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<Common$LocalAction, vz.b0> {
        public b() {
            super(1);
        }

        @Override // h00.l
        public vz.b0 invoke(Common$LocalAction common$LocalAction) {
            Common$LocalAction localAction = common$LocalAction;
            kotlin.jvm.internal.s.g(localAction, "localAction");
            p0 p0Var = p0.this;
            p0Var.a(localAction, (h00.l<? super String, vz.b0>) null, new q0(p0Var));
            return vz.b0.f54756a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.buttonwithwebview.ButtonWithWebviewFragment$onViewCreated$1", f = "ButtonWithWebviewFragment.kt", l = {50}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19201a;

        /* loaded from: classes2.dex */
        public /* synthetic */ class a implements kotlinx.coroutines.flow.f, kotlin.jvm.internal.m {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ p0 f19203a;

            public a(p0 p0Var) {
                this.f19203a = p0Var;
            }

            @Override // kotlinx.coroutines.flow.f
            public Object emit(Object obj, zz.d dVar) {
                p0 p0Var = this.f19203a;
                int i11 = p0.f19197f;
                p0Var.a((ButtonWithWebview$ButtonWithWebviewPane.Rendering) obj);
                vz.b0 b0Var = vz.b0.f54756a;
                a00.d.d();
                return b0Var;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof kotlinx.coroutines.flow.f) && (obj instanceof kotlin.jvm.internal.m)) {
                    return kotlin.jvm.internal.s.c(getFunctionDelegate(), ((kotlin.jvm.internal.m) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.m
            public final vz.g<?> getFunctionDelegate() {
                return new kotlin.jvm.internal.a(2, this.f19203a, p0.class, "bindView", "bindView(Lcom/plaid/internal/core/protos/link/workflow/nodes/panes/ButtonWithWebview$ButtonWithWebviewPane$Rendering;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        public c(zz.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new c(dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new c(dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f19201a;
            if (i11 == 0) {
                vz.r.b(obj);
                p0 p0Var = p0.this;
                int i12 = p0.f19197f;
                kotlinx.coroutines.flow.y a11 = kotlinx.coroutines.flow.g.a(p0Var.b().f19407l);
                a aVar = new a(p0.this);
                this.f19201a = 1;
                if (a11.collect(aVar, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public p0() {
        super(s0.class);
    }

    public static final void b(p0 this$0, View view) {
        Object b11;
        boolean a11;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        s0 b12 = this$0.b();
        b12.getClass();
        b11 = v20.j.b(null, new t0(b12, null), 1, null);
        ButtonWithWebview$ButtonWithWebviewPane.Rendering rendering = (ButtonWithWebview$ButtonWithWebviewPane.Rendering) b11;
        a11 = b12.a(rendering == null ? null : rendering.getSecondaryButton(), (h00.l<? super Common$LocalAction, Boolean>) null);
        if (a11) {
            ButtonWithWebview$ButtonWithWebviewPane.Actions.b buttonWithWebviewPaneSecondaryTapAction = (ButtonWithWebview$ButtonWithWebviewPane.Actions.b) b12.f19404i.getValue();
            kotlin.jvm.internal.s.f(buttonWithWebviewPaneSecondaryTapAction, "buttonWithWebviewPaneSecondaryTapAction");
            ButtonWithWebview$ButtonWithWebviewPane.Rendering.Events events = b12.f19409n;
            b12.a(buttonWithWebviewPaneSecondaryTapAction, events != null ? events.getOnSecondaryButtonTap() : null);
        }
    }

    @Override // com.plaid.internal.pd
    public s0 a(vd paneId, y7 component) {
        kotlin.jvm.internal.s.g(paneId, "paneId");
        kotlin.jvm.internal.s.g(component, "component");
        return new s0(paneId, component);
    }

    @Override // com.plaid.core.webview.PlaidWebview.a
    public void a() {
    }

    @Override // com.plaid.core.webview.PlaidWebview.a
    public void a(ValueCallback<Uri[]> valueCallback) {
    }

    @Override // com.plaid.core.webview.PlaidWebview.a
    public boolean b(String url) {
        kotlin.jvm.internal.s.g(url, "url");
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.s.g(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.plaid_button_with_webview_fragment, viewGroup, false);
        int i11 = R.id.buttonDisclaimer;
        TextView textView = (TextView) b5.b.a(inflate, i11);
        if (textView != null) {
            i11 = R.id.button_with_webview_content;
            LinearLayout linearLayout = (LinearLayout) b5.b.a(inflate, i11);
            if (linearLayout != null) {
                i11 = R.id.header;
                TextView textView2 = (TextView) b5.b.a(inflate, i11);
                if (textView2 != null) {
                    i11 = R.id.loadingProgress;
                    ProgressBar progressBar = (ProgressBar) b5.b.a(inflate, i11);
                    if (progressBar != null) {
                        i11 = R.id.plaid_header_image;
                        ImageView imageView = (ImageView) b5.b.a(inflate, i11);
                        if (imageView != null) {
                            i11 = R.id.plaid_navigation;
                            PlaidNavigationBar plaidNavigationBar = (PlaidNavigationBar) b5.b.a(inflate, i11);
                            if (plaidNavigationBar != null) {
                                i11 = R.id.plaid_webview;
                                WebView webView = (WebView) b5.b.a(inflate, i11);
                                if (webView != null) {
                                    i11 = R.id.primaryButton;
                                    PlaidPrimaryButton plaidPrimaryButton = (PlaidPrimaryButton) b5.b.a(inflate, i11);
                                    if (plaidPrimaryButton != null) {
                                        i11 = R.id.secondaryButton;
                                        PlaidSecondaryButton plaidSecondaryButton = (PlaidSecondaryButton) b5.b.a(inflate, i11);
                                        if (plaidSecondaryButton != null) {
                                            LinearLayout linearLayout2 = (LinearLayout) inflate;
                                            o8 o8Var = new o8(linearLayout2, textView, linearLayout, textView2, progressBar, imageView, plaidNavigationBar, webView, plaidPrimaryButton, plaidSecondaryButton);
                                            kotlin.jvm.internal.s.f(o8Var, "inflate(inflater, container, false)");
                                            this.f19198e = o8Var;
                                            return linearLayout2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @Override // com.plaid.internal.pd, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.s.g(view, "view");
        super.onViewCreated(view, bundle);
        o8 o8Var = this.f19198e;
        if (o8Var == null) {
            kotlin.jvm.internal.s.x("binding");
            o8Var = null;
        }
        o8Var.f19173f.setWebViewClient(new r0(this));
        v20.k.d(androidx.lifecycle.w.a(this), null, null, new c(null), 3, null);
    }

    public final void a(ButtonWithWebview$ButtonWithWebviewPane.Rendering rendering) {
        String str;
        Common$LocalizedString title;
        String str2;
        Common$LocalizedString title2;
        String inlineHtml;
        String url;
        String a11;
        o8 o8Var = null;
        if (rendering.hasHeaderAsset()) {
            o8 o8Var2 = this.f19198e;
            if (o8Var2 == null) {
                kotlin.jvm.internal.s.x("binding");
                o8Var2 = null;
            }
            ImageView imageView = o8Var2.f19172e;
            kotlin.jvm.internal.s.f(imageView, "binding.plaidHeaderImage");
            a4.a(imageView, rendering.getHeaderAsset());
        }
        if (rendering.hasHeader()) {
            o8 o8Var3 = this.f19198e;
            if (o8Var3 == null) {
                kotlin.jvm.internal.s.x("binding");
                o8Var3 = null;
            }
            TextView textView = o8Var3.f19170c;
            kotlin.jvm.internal.s.f(textView, "binding.header");
            Common$LocalizedString header = rendering.getHeader();
            if (header == null) {
                a11 = null;
            } else {
                Resources resources = getResources();
                kotlin.jvm.internal.s.f(resources, "resources");
                Context context = getContext();
                a11 = z6.a(header, resources, context == null ? null : context.getPackageName(), 0, 4);
            }
            jc.a(textView, a11);
        }
        if (rendering.hasUrl() && rendering.hasInlineHtml()) {
            wa.a.b(wa.f19678a, "url and inline html should not both be sent down", false, 2);
        }
        if (rendering.hasUrl() && (url = rendering.getUrl()) != null) {
            o8 o8Var4 = this.f19198e;
            if (o8Var4 == null) {
                kotlin.jvm.internal.s.x("binding");
                o8Var4 = null;
            }
            WebView webView = o8Var4.f19173f;
            kotlin.jvm.internal.s.f(webView, "binding.plaidWebview");
            webView.setVisibility(8);
            o8 o8Var5 = this.f19198e;
            if (o8Var5 == null) {
                kotlin.jvm.internal.s.x("binding");
                o8Var5 = null;
            }
            ProgressBar progressBar = o8Var5.f19171d;
            kotlin.jvm.internal.s.f(progressBar, "binding.loadingProgress");
            progressBar.setVisibility(0);
            o8 o8Var6 = this.f19198e;
            if (o8Var6 == null) {
                kotlin.jvm.internal.s.x("binding");
                o8Var6 = null;
            }
            o8Var6.f19173f.loadUrl(url);
        }
        if (rendering.hasInlineHtml() && (inlineHtml = rendering.getInlineHtml()) != null) {
            o8 o8Var7 = this.f19198e;
            if (o8Var7 == null) {
                kotlin.jvm.internal.s.x("binding");
                o8Var7 = null;
            }
            o8Var7.f19173f.loadData(inlineHtml, "text/html", "UTF-8");
        }
        if (rendering.hasButtonDisclaimerText()) {
            o8 o8Var8 = this.f19198e;
            if (o8Var8 == null) {
                kotlin.jvm.internal.s.x("binding");
                o8Var8 = null;
            }
            TextView textView2 = o8Var8.f19169b;
            kotlin.jvm.internal.s.f(textView2, "binding.buttonDisclaimer");
            ic.a(textView2, rendering.getButtonDisclaimerText(), new a());
        } else if (rendering.hasButtonDisclaimer()) {
            o8 o8Var9 = this.f19198e;
            if (o8Var9 == null) {
                kotlin.jvm.internal.s.x("binding");
                o8Var9 = null;
            }
            TextView textView3 = o8Var9.f19169b;
            kotlin.jvm.internal.s.f(textView3, "binding.buttonDisclaimer");
            ic.a(textView3, rendering.getButtonDisclaimer(), new b());
        }
        if (rendering.hasButton()) {
            o8 o8Var10 = this.f19198e;
            if (o8Var10 == null) {
                kotlin.jvm.internal.s.x("binding");
                o8Var10 = null;
            }
            PlaidPrimaryButton plaidPrimaryButton = o8Var10.f19174g;
            kotlin.jvm.internal.s.f(plaidPrimaryButton, "binding.primaryButton");
            Common$ButtonContent button = rendering.getButton();
            if (button == null || (title2 = button.getTitle()) == null) {
                str2 = null;
            } else {
                Resources resources2 = getResources();
                kotlin.jvm.internal.s.f(resources2, "resources");
                Context context2 = getContext();
                str2 = z6.a(title2, resources2, context2 == null ? null : context2.getPackageName(), 0, 4);
            }
            jc.a(plaidPrimaryButton, str2);
            o8 o8Var11 = this.f19198e;
            if (o8Var11 == null) {
                kotlin.jvm.internal.s.x("binding");
                o8Var11 = null;
            }
            o8Var11.f19174g.setOnClickListener(new View.OnClickListener() { // from class: qq.w
                {
                    com.plaid.internal.p0.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.plaid.internal.p0.a(com.plaid.internal.p0.this, view);
                }
            });
        }
        if (rendering.hasSecondaryButton()) {
            o8 o8Var12 = this.f19198e;
            if (o8Var12 == null) {
                kotlin.jvm.internal.s.x("binding");
                o8Var12 = null;
            }
            PlaidSecondaryButton plaidSecondaryButton = o8Var12.f19175h;
            kotlin.jvm.internal.s.f(plaidSecondaryButton, "binding.secondaryButton");
            Common$ButtonContent secondaryButton = rendering.getSecondaryButton();
            if (secondaryButton == null || (title = secondaryButton.getTitle()) == null) {
                str = null;
            } else {
                Resources resources3 = getResources();
                kotlin.jvm.internal.s.f(resources3, "resources");
                Context context3 = getContext();
                str = z6.a(title, resources3, context3 == null ? null : context3.getPackageName(), 0, 4);
            }
            jc.a(plaidSecondaryButton, str);
            o8 o8Var13 = this.f19198e;
            if (o8Var13 == null) {
                kotlin.jvm.internal.s.x("binding");
            } else {
                o8Var = o8Var13;
            }
            o8Var.f19175h.setOnClickListener(new View.OnClickListener() { // from class: qq.x
                {
                    com.plaid.internal.p0.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.plaid.internal.p0.b(com.plaid.internal.p0.this, view);
                }
            });
        }
    }

    public static final void a(p0 this$0, View view) {
        Object b11;
        boolean a11;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        s0 b12 = this$0.b();
        b12.getClass();
        b11 = v20.j.b(null, new t0(b12, null), 1, null);
        ButtonWithWebview$ButtonWithWebviewPane.Rendering rendering = (ButtonWithWebview$ButtonWithWebviewPane.Rendering) b11;
        a11 = b12.a(rendering == null ? null : rendering.getButton(), (h00.l<? super Common$LocalAction, Boolean>) null);
        if (a11) {
            ButtonWithWebview$ButtonWithWebviewPane.Actions.b buttonWithWebviewPaneTapAction = (ButtonWithWebview$ButtonWithWebviewPane.Actions.b) b12.f19403h.getValue();
            kotlin.jvm.internal.s.f(buttonWithWebviewPaneTapAction, "buttonWithWebviewPaneTapAction");
            ButtonWithWebview$ButtonWithWebviewPane.Rendering.Events events = b12.f19409n;
            b12.a(buttonWithWebviewPaneTapAction, events != null ? events.getOnButtonTap() : null);
        }
    }
}