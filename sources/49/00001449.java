package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import g9.a;
import java.util.List;
import java.util.Map;
import r9.a;
import t9.g;
import t9.k;
import t9.m;

/* loaded from: classes.dex */
public class AuthTask {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f10197c = g.class;

    /* renamed from: a  reason: collision with root package name */
    public Activity f10198a;

    /* renamed from: b  reason: collision with root package name */
    public v9.a f10199b;

    /* loaded from: classes.dex */
    public class a implements g.InterfaceC1150g {
        public a() {
        }

        @Override // t9.g.InterfaceC1150g
        public void a() {
            AuthTask.this.c();
        }

        @Override // t9.g.InterfaceC1150g
        public void b() {
        }
    }

    public AuthTask(Activity activity) {
        this.f10198a = activity;
        r9.b.e().b(this.f10198a);
        this.f10199b = new v9.a(activity, "去支付宝授权");
    }

    private String b(r9.a aVar, p9.b bVar) {
        String[] f11 = bVar.f();
        Bundle bundle = new Bundle();
        bundle.putString("url", f11[0]);
        Intent intent = new Intent(this.f10198a, H5AuthActivity.class);
        intent.putExtras(bundle);
        a.C1076a.c(aVar, intent);
        this.f10198a.startActivity(intent);
        Object obj = f10197c;
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException unused) {
                return a9.b.a();
            }
        }
        String g11 = a9.b.g();
        return TextUtils.isEmpty(g11) ? a9.b.a() : g11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        v9.a aVar = this.f10199b;
        if (aVar != null) {
            aVar.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String d(android.app.Activity r4, java.lang.String r5, r9.a r6) {
        /*
            r3 = this;
            r3.f()
            r0 = 0
            n9.a r1 = new n9.a     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            r1.<init>()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            l9.b r4 = r1.g(r6, r4, r5)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            org.json.JSONObject r4 = r4.c()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            java.lang.String r5 = "form"
            org.json.JSONObject r4 = r4.optJSONObject(r5)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            java.lang.String r5 = "onload"
            org.json.JSONObject r4 = r4.optJSONObject(r5)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            java.util.List r4 = p9.b.a(r4)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            r3.c()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            r5 = 0
        L25:
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            if (r5 >= r1) goto L4a
            java.lang.Object r1 = r4.get(r5)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            p9.b r1 = (p9.b) r1     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            p9.a r1 = r1.b()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            p9.a r2 = p9.a.WapPay     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            if (r1 != r2) goto L47
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            p9.b r4 = (p9.b) r4     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            java.lang.String r4 = r3.b(r6, r4)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            r3.c()
            return r4
        L47:
            int r5 = r5 + 1
            goto L25
        L4a:
            r3.c()
            goto L6b
        L4e:
            r4 = move-exception
            java.lang.String r5 = "biz"
            java.lang.String r1 = "H5AuthDataAnalysisError"
            c9.a.d(r6, r5, r1, r4)     // Catch: java.lang.Throwable -> L86
            goto L68
        L57:
            r4 = move-exception
            a9.c r5 = a9.c.NETWORK_ERROR     // Catch: java.lang.Throwable -> L86
            int r5 = r5.b()     // Catch: java.lang.Throwable -> L86
            a9.c r5 = a9.c.b(r5)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = "net"
            c9.a.f(r6, r0, r4)     // Catch: java.lang.Throwable -> L86
            r0 = r5
        L68:
            r3.c()
        L6b:
            if (r0 != 0) goto L77
            a9.c r4 = a9.c.FAILED
            int r4 = r4.b()
            a9.c r0 = a9.c.b(r4)
        L77:
            int r4 = r0.b()
            java.lang.String r5 = r0.a()
            java.lang.String r6 = ""
            java.lang.String r4 = a9.b.b(r4, r5, r6)
            return r4
        L86:
            r4 = move-exception
            r3.c()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.AuthTask.d(android.app.Activity, java.lang.String, r9.a):java.lang.String");
    }

    private g.InterfaceC1150g e() {
        return new a();
    }

    private void f() {
        v9.a aVar = this.f10199b;
        if (aVar != null) {
            aVar.f();
        }
    }

    public synchronized String auth(String str, boolean z11) {
        return innerAuth(new r9.a(this.f10198a, str, "auth"), str, z11);
    }

    public synchronized Map<String, String> authV2(String str, boolean z11) {
        r9.a aVar;
        aVar = new r9.a(this.f10198a, str, "authV2");
        return k.d(aVar, innerAuth(aVar, str, z11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00bf, code lost:
        if (g9.a.d().F() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c1, code lost:
        g9.a.d().l(r7, r6.f10198a, false, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ca, code lost:
        c();
        c9.a.g(r6.f10198a, r7, r8, r7.f49316d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006b, code lost:
        if (g9.a.d().F() == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.lang.String innerAuth(r9.a r7, java.lang.String r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.AuthTask.innerAuth(r9.a, java.lang.String, boolean):java.lang.String");
    }

    private String a(Activity activity, String str, r9.a aVar) {
        String b11 = aVar.b(str);
        List<a.b> y11 = g9.a.d().y();
        if (!g9.a.d().f27863h || y11 == null) {
            y11 = a9.a.f355d;
        }
        if (m.w(aVar, this.f10198a, y11, true)) {
            g gVar = new g(activity, aVar, e());
            String f11 = gVar.f(b11, false);
            gVar.i();
            if (!TextUtils.equals(f11, "failed") && !TextUtils.equals(f11, "scheme_failed")) {
                return TextUtils.isEmpty(f11) ? a9.b.a() : f11;
            }
            c9.a.b(aVar, "biz", "LogBindCalledH5");
            return d(activity, b11, aVar);
        }
        c9.a.b(aVar, "biz", "LogCalledH5");
        return d(activity, b11, aVar);
    }
}