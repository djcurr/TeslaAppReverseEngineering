package com.plaid.internal;

import android.net.Uri;
import android.webkit.ValueCallback;
import com.plaid.core.webview.PlaidWebview;
import com.plaid.internal.h4;
import com.plaid.internal.k6;
import com.plaid.internal.wa;
import com.plaid.link.Plaid;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.event.LinkEventMetadata;
import com.plaid.link.event.LinkEventName;
import com.plaid.link.exception.LinkException;
import com.plaid.link.result.LinkAccount;
import com.plaid.link.result.LinkError;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkSuccess;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import kotlinx.serialization.SerializationException;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class fd extends androidx.lifecycle.p0 implements PlaidWebview.a, k6.a {

    /* renamed from: a  reason: collision with root package name */
    public kotlinx.serialization.json.a f18596a;

    /* renamed from: b  reason: collision with root package name */
    public p5 f18597b;

    /* renamed from: c  reason: collision with root package name */
    public db f18598c;

    /* renamed from: d  reason: collision with root package name */
    public e9 f18599d;

    /* renamed from: e  reason: collision with root package name */
    public final k6 f18600e;

    /* renamed from: f  reason: collision with root package name */
    public final kotlinx.coroutines.flow.t<String> f18601f;

    /* renamed from: g  reason: collision with root package name */
    public ValueCallback<Uri[]> f18602g;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.webview.WebviewViewModel$1", f = "WebviewViewModel.kt", l = {56, 62}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f18603a;

        public a(zz.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new a(dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f18603a;
            boolean z11 = true;
            if (i11 == 0) {
                vz.r.b(obj);
                db dbVar = fd.this.f18598c;
                if (dbVar == null) {
                    kotlin.jvm.internal.s.x("readWebviewFallbackUri");
                    dbVar = null;
                }
                this.f18603a = 1;
                obj = dbVar.a(this);
                if (obj == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vz.r.b(obj);
                return vz.b0.f54756a;
            } else {
                vz.r.b(obj);
            }
            String str = (String) obj;
            if (str != null && str.length() != 0) {
                z11 = false;
            }
            if (z11) {
                return vz.b0.f54756a;
            }
            kotlinx.coroutines.flow.t<String> tVar = fd.this.f18601f;
            this.f18603a = 2;
            if (tVar.emit(str, this) == d11) {
                return d11;
            }
            return vz.b0.f54756a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.webview.WebviewViewModel$onCleared$1", f = "WebviewViewModel.kt", l = {68, 69}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public Object f18605a;

        /* renamed from: b  reason: collision with root package name */
        public Object f18606b;

        /* renamed from: c  reason: collision with root package name */
        public int f18607c;

        public b(zz.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new b(dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new b(dVar).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = a00.b.d()
                int r1 = r8.f18607c
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L27
                if (r1 == r4) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r8.f18606b
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r4 = r8.f18605a
                com.plaid.internal.fd r4 = (com.plaid.internal.fd) r4
                vz.r.b(r9)
                goto L4d
            L1b:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L23:
                vz.r.b(r9)
                goto L45
            L27:
                vz.r.b(r9)
                com.plaid.internal.fd r9 = com.plaid.internal.fd.this
                com.plaid.internal.e9 r9 = r9.b()
                r8.f18607c = r4
                r9.getClass()
                v20.j0 r1 = v20.e1.b()
                com.plaid.internal.e9$a r4 = new com.plaid.internal.e9$a
                r4.<init>(r3)
                java.lang.Object r9 = v20.i.g(r1, r4, r8)
                if (r9 != r0) goto L45
                return r0
            L45:
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                com.plaid.internal.fd r4 = com.plaid.internal.fd.this
                java.util.Iterator r1 = r9.iterator()
            L4d:
                boolean r9 = r1.hasNext()
                if (r9 == 0) goto L7f
                java.lang.Object r9 = r1.next()
                java.lang.String r9 = (java.lang.String) r9
                com.plaid.internal.e9 r5 = r4.b()
                r8.f18605a = r4
                r8.f18606b = r1
                r8.f18607c = r2
                r5.getClass()
                v20.j0 r6 = v20.e1.b()
                com.plaid.internal.e9$c r7 = new com.plaid.internal.e9$c
                r7.<init>(r9, r3)
                java.lang.Object r9 = v20.i.g(r6, r7, r8)
                java.lang.Object r5 = a00.b.d()
                if (r9 != r5) goto L7a
                goto L7c
            L7a:
                vz.b0 r9 = vz.b0.f54756a
            L7c:
                if (r9 != r0) goto L4d
                return r0
            L7f:
                vz.b0 r9 = vz.b0.f54756a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.fd.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.webview.WebviewViewModel$onWebviewCancelled$1", f = "WebviewViewModel.kt", l = {84}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f18609a;

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
            int i11 = this.f18609a;
            if (i11 == 0) {
                vz.r.b(obj);
                p5 d12 = fd.this.d();
                this.f18609a = 1;
                if (d12.a(this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            return vz.b0.f54756a;
        }
    }

    public fd(cd webviewComponent) {
        kotlin.jvm.internal.s.g(webviewComponent, "webviewComponent");
        this.f18601f = kotlinx.coroutines.flow.a0.b(1, 0, null, 6, null);
        webviewComponent.a(this);
        this.f18600e = new k6(this, c());
        v20.i.d(androidx.lifecycle.q0.a(this), null, null, new a(null), 3, null);
    }

    @Override // com.plaid.core.webview.PlaidWebview.a
    public void a() {
        v20.i.d(androidx.lifecycle.q0.a(this), null, null, new c(null), 3, null);
    }

    @Override // com.plaid.internal.k6.a
    public void a(String str) {
    }

    public final e9 b() {
        e9 e9Var = this.f18599d;
        if (e9Var != null) {
            return e9Var;
        }
        kotlin.jvm.internal.s.x("internalPictureStorage");
        return null;
    }

    public final kotlinx.serialization.json.a c() {
        kotlinx.serialization.json.a aVar = this.f18596a;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.s.x("json");
        return null;
    }

    public final p5 d() {
        p5 p5Var = this.f18597b;
        if (p5Var != null) {
            return p5Var;
        }
        kotlin.jvm.internal.s.x("linkController");
        return null;
    }

    @Override // androidx.lifecycle.p0
    public void onCleared() {
        v20.i.d(v20.t1.f54002a, null, null, new b(null), 3, null);
        super.onCleared();
    }

    @Override // com.plaid.core.webview.PlaidWebview.a
    public void a(ValueCallback<Uri[]> valueCallback) {
        this.f18602g = valueCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.plaid.core.webview.PlaidWebview.a
    public boolean b(String url) {
        boolean H;
        String D;
        int t11;
        int e11;
        int d11;
        String str;
        List<h4> list;
        int t12;
        kotlin.jvm.internal.s.g(url, "url");
        k6 k6Var = this.f18600e;
        k6Var.getClass();
        kotlin.jvm.internal.s.g(url, "url");
        List accounts = 0;
        vz.b0 b0Var = null;
        H = kotlin.text.v.H(url, "plaidlink://", false, 2, null);
        if (!H) {
            wa.a.a(wa.f19678a, kotlin.jvm.internal.s.p("external link: ", url), false, 2);
            k6Var.f18924a.c(url);
        } else {
            HttpUrl.Companion companion = HttpUrl.Companion;
            D = kotlin.text.v.D(url, "plaidlink://", "https://", false, 4, null);
            HttpUrl httpUrl = companion.get(D);
            wa.a.a(wa.f19678a, kotlin.jvm.internal.s.p("plaidcallback ", url), false, 2);
            String host = httpUrl.host();
            Set<String> queryParameterNames = httpUrl.queryParameterNames();
            t11 = wz.x.t(queryParameterNames, 10);
            e11 = wz.r0.e(t11);
            d11 = m00.l.d(e11, 16);
            LinkedHashMap linkData = new LinkedHashMap(d11);
            Iterator<T> it2 = queryParameterNames.iterator();
            while (true) {
                str = "";
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                String queryParameter = httpUrl.queryParameter((String) next);
                if (queryParameter != null) {
                    str = queryParameter;
                }
                linkData.put(next, str);
            }
            k6Var.f18926c = (String) linkData.get("link_session_id");
            int hashCode = host.hashCode();
            if (hashCode != -579210487) {
                if (hashCode != 3127582) {
                    if (hashCode == 96891546 && host.equals("event")) {
                        wa.a aVar = wa.f19678a;
                        wa.f19679b.d(kotlin.jvm.internal.s.p("Event name: ", linkData.get("event_name")), Arrays.copyOf(new Object[0], 0), false);
                        wa.a.a(aVar, httpUrl.toString(), false, 2);
                        String str2 = (String) linkData.get("event_name");
                        if (str2 != null) {
                            Locale SERVER_LOCALE = k6.f18923d;
                            kotlin.jvm.internal.s.f(SERVER_LOCALE, "SERVER_LOCALE");
                            kotlin.jvm.internal.s.f(str2.toUpperCase(SERVER_LOCALE), "this as java.lang.String).toUpperCase(locale)");
                            if (kotlin.jvm.internal.s.c(str2, "OPEN")) {
                                k6Var.f18924a.a((String) linkData.get("link_session_id"));
                            }
                            k6Var.a(linkData);
                            b0Var = vz.b0.f54756a;
                        }
                        if (b0Var == null) {
                            k6Var.a(linkData);
                        }
                    }
                } else if (host.equals("exit")) {
                    wa.a aVar2 = wa.f19678a;
                    wa.a.a(aVar2, "User status in flow: ", new Object[]{kotlin.jvm.internal.s.p("data: ", linkData.get(PermissionsResponse.STATUS_KEY))}, false, 4);
                    wa.a.a(aVar2, "Link request ID: ", new Object[]{kotlin.jvm.internal.s.p("data: ", linkData.get("request_id"))}, false, 4);
                    try {
                        k6.a aVar3 = k6Var.f18924a;
                        kotlin.jvm.internal.s.g(linkData, "linkData");
                        aVar3.a(LinkExit.Companion.fromMap$link_sdk_release(linkData));
                    } catch (NoSuchElementException unused) {
                        k6Var.f18924a.a(new j3("Failed to parse exit"));
                    }
                }
            } else if (host.equals("connected")) {
                wa.a aVar4 = wa.f19678a;
                wa.a.a(aVar4, kotlin.jvm.internal.s.p("Institution id: ", linkData.get("institution_id")), false, 2);
                wa.a.a(aVar4, kotlin.jvm.internal.s.p("Institution name:  ", linkData.get("institution_name")), false, 2);
                String str3 = (String) linkData.get("accounts");
                str = str3 != null ? str3 : "";
                try {
                    try {
                        kotlinx.serialization.json.a aVar5 = k6Var.f18925b;
                        h4.f18687g.getClass();
                        list = (List) aVar5.b(d30.a.h(h4.a.f18694a), str);
                    } catch (SerializationException unused2) {
                        wa.a.b(wa.f19678a, kotlin.jvm.internal.s.p("Unable to parse accounts data: ", e8.f18527a.a(str)), false, 2);
                        list = null;
                    }
                    if (list != null) {
                        t12 = wz.x.t(list, 10);
                        accounts = new ArrayList(t12);
                        for (h4 account : list) {
                            kotlin.jvm.internal.s.g(account, "account");
                            accounts.add(LinkAccount.Companion.fromResponse$link_sdk_release(account));
                        }
                    }
                    if (accounts == 0) {
                        accounts = wz.w.i();
                    }
                    k6.a aVar6 = k6Var.f18924a;
                    kotlin.jvm.internal.s.g(linkData, "linkData");
                    kotlin.jvm.internal.s.g(accounts, "accounts");
                    aVar6.a(LinkSuccess.Companion.fromMap$link_sdk_release(linkData, accounts));
                } catch (NoSuchElementException unused3) {
                    k6Var.f18924a.a(new j3("Failed to parse success"));
                }
            }
            wa.a.a(wa.f19678a, kotlin.jvm.internal.s.p("Link action detected: ", host), false, 2);
            k6Var.f18924a.a(host, LinkEventMetadata.Companion.fromMap(linkData, k6Var.f18926c));
        }
        return true;
    }

    @Override // com.plaid.internal.k6.a
    public void c(String url) {
        kotlin.jvm.internal.s.g(url, "url");
        d().a(url);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Collection<? extends Uri> uris) {
        kotlin.jvm.internal.s.g(uris, "uris");
        ValueCallback<Uri[]> valueCallback = this.f18602g;
        if (valueCallback == 0) {
            return;
        }
        Object[] array = uris.toArray(new Uri[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        valueCallback.onReceiveValue(array);
    }

    @Override // com.plaid.internal.k6.a
    public void a(LinkSuccess linkSuccess) {
        kotlin.jvm.internal.s.g(linkSuccess, "linkSuccess");
        d().a(linkSuccess);
    }

    @Override // com.plaid.internal.k6.a
    public void a(LinkEvent linkEvent) {
        kotlin.jvm.internal.s.g(linkEvent, "linkEvent");
        h00.l<LinkEvent, vz.b0> linkEventListenerInternal$link_sdk_release = Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release();
        if (linkEventListenerInternal$link_sdk_release == null) {
            return;
        }
        linkEventListenerInternal$link_sdk_release.invoke(linkEvent);
    }

    @Override // com.plaid.internal.k6.a
    public void a(Throwable exception) {
        kotlin.jvm.internal.s.g(exception, "exception");
        p5 d11 = d();
        wa.a aVar = wa.f19678a;
        wa.f19679b.a(exception, true);
        d11.a(new LinkExit(LinkError.Companion.fromException$link_sdk_release(new LinkException("Link has exited unexpectedly please report this to support via https://dashboard.plaid.com/support with the session id if it persists")), null, 2, null));
    }

    @Override // com.plaid.internal.k6.a
    public void a(LinkExit linkExit) {
        kotlin.jvm.internal.s.g(linkExit, "linkExit");
        d().a(linkExit);
    }

    @Override // com.plaid.internal.k6.a
    public void a(String string, LinkEventMetadata metadata) {
        kotlin.jvm.internal.s.g(string, "action");
        kotlin.jvm.internal.s.g(metadata, "linkEventMetadata");
        h00.l<LinkEvent, vz.b0> linkEventListenerInternal$link_sdk_release = Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release();
        if (linkEventListenerInternal$link_sdk_release == null) {
            return;
        }
        kotlin.jvm.internal.s.g(string, "string");
        LinkEventName eventName = LinkEventName.Companion.fromString$link_sdk_release(string);
        kotlin.jvm.internal.s.g(eventName, "eventName");
        kotlin.jvm.internal.s.g(metadata, "metadata");
        linkEventListenerInternal$link_sdk_release.invoke(new LinkEvent(eventName, metadata));
    }
}