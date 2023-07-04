package com.plaid.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Challenge$ChallengePane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.ui_components.PlaidInstitutionHeaderItem;
import com.plaid.internal.core.ui_components.PlaidNavigationBar;
import com.plaid.link.R;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import n00.r;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public final class x0 extends pd<z0> {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f19725f = 0;

    /* renamed from: e  reason: collision with root package name */
    public q8 f19726e;

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19727a;

        static {
            int[] iArr = new int[Challenge$ChallengePane.Rendering.b.values().length];
            iArr[Challenge$ChallengePane.Rendering.b.RECAPTCHA.ordinal()] = 1;
            iArr[Challenge$ChallengePane.Rendering.b.JAVA_SCRIPT.ordinal()] = 2;
            iArr[Challenge$ChallengePane.Rendering.b.CHALLENGE_NOT_SET.ordinal()] = 3;
            f19727a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.challenge.ChallengeFragment$onViewCreated$1", f = "ChallengeFragment.kt", l = {52}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19728a;

        /* loaded from: classes2.dex */
        public /* synthetic */ class a implements kotlinx.coroutines.flow.f, kotlin.jvm.internal.m {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ x0 f19730a;

            public a(x0 x0Var) {
                this.f19730a = x0Var;
            }

            @Override // kotlinx.coroutines.flow.f
            public Object emit(Object obj, zz.d dVar) {
                String a11;
                String D;
                int t11;
                Map localizedStringMap;
                String D2;
                String D3;
                String D4;
                String D5;
                String str;
                Challenge$ChallengePane.Rendering rendering = (Challenge$ChallengePane.Rendering) obj;
                x0 x0Var = this.f19730a;
                q8 q8Var = x0Var.f19726e;
                q8 q8Var2 = null;
                kotlinx.serialization.json.a aVar = null;
                if (q8Var == null) {
                    kotlin.jvm.internal.s.x("binding");
                    q8Var = null;
                }
                PlaidInstitutionHeaderItem plaidInstitutionHeaderItem = q8Var.f19315d;
                kotlin.jvm.internal.s.f(plaidInstitutionHeaderItem, "binding.plaidInstitution");
                k9.a(plaidInstitutionHeaderItem, rendering.getInstitution());
                q8 q8Var3 = x0Var.f19726e;
                if (q8Var3 == null) {
                    kotlin.jvm.internal.s.x("binding");
                    q8Var3 = null;
                }
                TextView textView = q8Var3.f19314c;
                kotlin.jvm.internal.s.f(textView, "binding.header");
                Common$LocalizedString header = rendering.getHeader();
                if (header == null) {
                    a11 = null;
                } else {
                    Resources resources = x0Var.getResources();
                    kotlin.jvm.internal.s.f(resources, "resources");
                    Context context = x0Var.getContext();
                    a11 = z6.a(header, resources, context == null ? null : context.getPackageName(), 0, 4);
                }
                jc.a(textView, a11);
                Challenge$ChallengePane.Rendering.b challengeCase = rendering.getChallengeCase();
                int i11 = challengeCase == null ? -1 : a.f19727a[challengeCase.ordinal()];
                if (i11 == 1) {
                    Challenge$ChallengePane.Rendering.RecaptchaChallenge recaptcha = rendering.getRecaptcha();
                    kotlin.jvm.internal.s.f(recaptcha, "rendering.recaptcha");
                    InputStream openRawResource = x0Var.getResources().openRawResource(R.raw.plaid_recaptcha);
                    kotlin.jvm.internal.s.f(openRawResource, "resources.openRawResource(R.raw.plaid_recaptcha)");
                    InputStreamReader inputStreamReader = new InputStreamReader(openRawResource, kotlin.text.d.f35187b);
                    BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, PKIFailureInfo.certRevoked);
                    try {
                        String e11 = e00.l.e(bufferedReader);
                        e00.b.a(bufferedReader, null);
                        String sitekey = recaptcha.getSitekey();
                        kotlin.jvm.internal.s.f(sitekey, "recaptcha.sitekey");
                        D = kotlin.text.v.D(e11, "<SITE_KEY>", sitekey, false, 4, null);
                        q8 q8Var4 = x0Var.f19726e;
                        if (q8Var4 == null) {
                            kotlin.jvm.internal.s.x("binding");
                        } else {
                            q8Var2 = q8Var4;
                        }
                        WebView webView = q8Var2.f19313b;
                        webView.getSettings().setJavaScriptEnabled(true);
                        webView.addJavascriptInterface(new eb(x0Var.b()), "RecaptchaJSListener");
                        webView.loadDataWithBaseURL("https://cdn.plaid.com", D, "text/html", "UTF-8", null);
                        webView.setWebViewClient(new y0(webView));
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } else if (i11 == 2) {
                    Challenge$ChallengePane.Rendering.JavaScriptChallenge javaScriptChallenge = rendering.getJavaScript();
                    kotlin.jvm.internal.s.f(javaScriptChallenge, "rendering.javaScript");
                    q8 q8Var5 = x0Var.f19726e;
                    if (q8Var5 == null) {
                        kotlin.jvm.internal.s.x("binding");
                        q8Var5 = null;
                    }
                    q8Var5.f19313b.getSettings().setJavaScriptEnabled(true);
                    InputStream openRawResource2 = x0Var.getResources().openRawResource(R.raw.plaid_javascript_challenge);
                    kotlin.jvm.internal.s.f(openRawResource2, "resources.openRawResourc…aid_javascript_challenge)");
                    InputStreamReader inputStreamReader2 = new InputStreamReader(openRawResource2, kotlin.text.d.f35187b);
                    BufferedReader bufferedReader2 = inputStreamReader2 instanceof BufferedReader ? (BufferedReader) inputStreamReader2 : new BufferedReader(inputStreamReader2, PKIFailureInfo.certRevoked);
                    try {
                        String rawHtml = e00.l.e(bufferedReader2);
                        e00.b.a(bufferedReader2, null);
                        Set<Map.Entry<String, Common$LocalizedString>> entrySet = javaScriptChallenge.getLocalizedStrings().entrySet();
                        t11 = wz.x.t(entrySet, 10);
                        ArrayList arrayList = new ArrayList(t11);
                        Iterator<T> it2 = entrySet.iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            Object key = entry.getKey();
                            Common$LocalizedString common$LocalizedString = (Common$LocalizedString) entry.getValue();
                            if (common$LocalizedString != null) {
                                Resources resources2 = x0Var.getResources();
                                kotlin.jvm.internal.s.f(resources2, "resources");
                                Context context2 = x0Var.getContext();
                                str = z6.a(common$LocalizedString, resources2, context2 == null ? null : context2.getPackageName(), 0, 4);
                                if (str != null) {
                                    arrayList.add(vz.v.a(key, str));
                                }
                            }
                            str = "";
                            arrayList.add(vz.v.a(key, str));
                        }
                        localizedStringMap = wz.s0.t(arrayList);
                        q8 q8Var6 = x0Var.f19726e;
                        if (q8Var6 == null) {
                            kotlin.jvm.internal.s.x("binding");
                            q8Var6 = null;
                        }
                        WebView webView2 = q8Var6.f19313b;
                        z0 b11 = x0Var.b();
                        b11.getClass();
                        kotlin.jvm.internal.s.g(rawHtml, "rawHtml");
                        kotlin.jvm.internal.s.g(localizedStringMap, "localizedStringMap");
                        kotlin.jvm.internal.s.g(javaScriptChallenge, "javaScriptChallenge");
                        String challengeHash = javaScriptChallenge.getChallengeHash();
                        kotlin.jvm.internal.s.f(challengeHash, "javaScriptChallenge.challengeHash");
                        D2 = kotlin.text.v.D("link/challenge/<HASH>", "<HASH>", challengeHash, false, 4, null);
                        g9 g9Var = b11.f19931i;
                        if (g9Var == null) {
                            kotlin.jvm.internal.s.x("plaidEnvironmentStore");
                            g9Var = null;
                        }
                        D3 = kotlin.text.v.D(rawHtml, "<CHALLENGE>", kotlin.jvm.internal.s.p(g9Var.c(), D2), false, 4, null);
                        String initializationOptionsJson = javaScriptChallenge.getInitializationOptionsJson();
                        kotlin.jvm.internal.s.f(initializationOptionsJson, "javaScriptChallenge.initializationOptionsJson");
                        D4 = kotlin.text.v.D(D3, "<INITIALIZATION_OPTIONS>", initializationOptionsJson, false, 4, null);
                        kotlinx.serialization.json.a aVar2 = b11.f19930h;
                        if (aVar2 != null) {
                            aVar = aVar2;
                        } else {
                            kotlin.jvm.internal.s.x("json");
                        }
                        i30.c a12 = aVar.a();
                        r.a aVar3 = n00.r.f40137c;
                        D5 = kotlin.text.v.D(D4, "<PROTO_TRANSLATIONS>", aVar.c(c30.i.b(a12, kotlin.jvm.internal.m0.o(Map.class, aVar3.d(kotlin.jvm.internal.m0.m(String.class)), aVar3.d(kotlin.jvm.internal.m0.m(String.class)))), localizedStringMap), false, 4, null);
                        webView2.loadDataWithBaseURL("https://cdn.plaid.com", D5, "text/html", "UTF-8", null);
                    } finally {
                    }
                } else if (i11 == 3) {
                    throw new vz.o(null, 1, null);
                }
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
                return new kotlin.jvm.internal.a(2, this.f19730a, x0.class, "bindView", "bindView(Lcom/plaid/internal/core/protos/link/workflow/nodes/panes/Challenge$ChallengePane$Rendering;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        public b(zz.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new b(dVar);
        }

        @Override // h00.p
        /* renamed from: invoke */
        public Object mo160invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new b(dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f19728a;
            if (i11 == 0) {
                vz.r.b(obj);
                x0 x0Var = x0.this;
                int i12 = x0.f19725f;
                kotlinx.coroutines.flow.y a11 = kotlinx.coroutines.flow.g.a(x0Var.b().f19933k);
                a aVar = new a(x0.this);
                this.f19728a = 1;
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

    public x0() {
        super(z0.class);
    }

    @Override // com.plaid.internal.pd
    public z0 a(vd paneId, y7 component) {
        kotlin.jvm.internal.s.g(paneId, "paneId");
        kotlin.jvm.internal.s.g(component, "component");
        return new z0(paneId, component);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.s.g(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.plaid_challenge_fragment, viewGroup, false);
        int i11 = R.id.challenge_webview;
        WebView webView = (WebView) b5.b.a(inflate, i11);
        if (webView != null) {
            i11 = R.id.header;
            TextView textView = (TextView) b5.b.a(inflate, i11);
            if (textView != null) {
                i11 = R.id.plaid_institution;
                PlaidInstitutionHeaderItem plaidInstitutionHeaderItem = (PlaidInstitutionHeaderItem) b5.b.a(inflate, i11);
                if (plaidInstitutionHeaderItem != null) {
                    i11 = R.id.plaid_navigation;
                    PlaidNavigationBar plaidNavigationBar = (PlaidNavigationBar) b5.b.a(inflate, i11);
                    if (plaidNavigationBar != null) {
                        LinearLayout linearLayout = (LinearLayout) inflate;
                        q8 q8Var = new q8(linearLayout, webView, textView, plaidInstitutionHeaderItem, plaidNavigationBar);
                        kotlin.jvm.internal.s.f(q8Var, "inflate(inflater, container, false)");
                        this.f19726e = q8Var;
                        return linearLayout;
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
        v20.k.d(androidx.lifecycle.w.a(this), null, null, new b(null), 3, null);
    }
}