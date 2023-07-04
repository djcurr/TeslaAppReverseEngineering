package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import ch.qos.logback.classic.spi.CallerData;
import com.alipay.sdk.app.PayResultActivity;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.model.AlipayAuthResult;
import g9.a;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;
import r9.a;
import t9.e;
import t9.g;
import t9.h;
import t9.k;
import t9.m;

/* loaded from: classes.dex */
public class PayTask {

    /* renamed from: h  reason: collision with root package name */
    public static final Object f10215h = g.class;

    /* renamed from: i  reason: collision with root package name */
    public static long f10216i;

    /* renamed from: a  reason: collision with root package name */
    public Activity f10217a;

    /* renamed from: b  reason: collision with root package name */
    public v9.a f10218b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10219c = "wappaygw.alipay.com/service/rest.htm";

    /* renamed from: d  reason: collision with root package name */
    public final String f10220d = "mclient.alipay.com/service/rest.htm";

    /* renamed from: e  reason: collision with root package name */
    public final String f10221e = "mclient.alipay.com/home/exterfaceAssign.htm";

    /* renamed from: f  reason: collision with root package name */
    public final String f10222f = "mclient.alipay.com/cashier/mobilepay.htm";

    /* renamed from: g  reason: collision with root package name */
    public Map<String, c> f10223g = new HashMap();

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10224a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f10225b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ H5PayCallback f10226c;

        public a(String str, boolean z11, H5PayCallback h5PayCallback) {
            this.f10224a = str;
            this.f10225b = z11;
            this.f10226c = h5PayCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            y9.a h5Pay = PayTask.this.h5Pay(new r9.a(PayTask.this.f10217a, this.f10224a, "payInterceptorWithUrl"), this.f10224a, this.f10225b);
            e.h("mspl", "inc finished: " + h5Pay.a());
            this.f10226c.onPayResult(h5Pay);
        }
    }

    /* loaded from: classes.dex */
    public class b implements g.InterfaceC1150g {
        public b() {
        }

        @Override // t9.g.InterfaceC1150g
        public void a() {
            PayTask.this.dismissLoading();
        }

        @Override // t9.g.InterfaceC1150g
        public void b() {
        }
    }

    public PayTask(Activity activity) {
        this.f10217a = activity;
        r9.b.e().b(this.f10217a);
        this.f10218b = new v9.a(activity, "去支付宝付款");
    }

    private String b(String str, String str2) {
        String str3 = str2 + "={";
        return str.substring(str.indexOf(str3) + str3.length(), str.lastIndexOf("}"));
    }

    private String c(String str, Map<String, String> map) {
        boolean equals = AlipayAuthResult.RESULT_CODE_SUCCESS.equals(map.get("resultStatus"));
        String str2 = map.get("result");
        c remove = this.f10223g.remove(str);
        if (map.containsKey("callBackUrl")) {
            return map.get("callBackUrl");
        }
        if (str2.length() > 15) {
            String a11 = a(m.i("&callBackUrl=\"", "\"", str2), m.i("&call_back_url=\"", "\"", str2), m.i("&return_url=\"", "\"", str2), URLDecoder.decode(m.i("&return_url=", "&", str2), "utf-8"), URLDecoder.decode(m.i("&callBackUrl=", "&", str2), "utf-8"), m.i("call_back_url=\"", "\"", str2));
            if (!TextUtils.isEmpty(a11)) {
                return a11;
            }
        }
        if (remove != null) {
            String b11 = equals ? remove.b() : remove.d();
            if (!TextUtils.isEmpty(b11)) {
                return b11;
            }
        }
        return remove != null ? g9.a.d().E() : "";
    }

    private String d(String str, r9.a aVar) {
        a9.c cVar;
        String b11 = aVar.b(str);
        if (b11.contains("paymethod=\"expressGateway\"")) {
            return e(aVar, b11);
        }
        List<a.b> y11 = g9.a.d().y();
        if (!g9.a.d().f27863h || y11 == null) {
            y11 = a9.a.f355d;
        }
        if (m.w(aVar, this.f10217a, y11, true)) {
            g gVar = new g(this.f10217a, aVar, i());
            e.h("mspl", "pay inner started: " + b11);
            String f11 = gVar.f(b11, false);
            if (!TextUtils.isEmpty(f11)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("resultStatus={");
                sb2.append(a9.c.ACTIVITY_NOT_START_EXIT.b());
                sb2.append("}");
                if (f11.contains(sb2.toString())) {
                    m.t("alipaySdk", "startActivityEx", this.f10217a, aVar);
                    if (g9.a.d().a()) {
                        f11 = gVar.f(b11, true);
                    } else {
                        f11 = f11.replace("resultStatus={" + cVar.b() + "}", "resultStatus={" + a9.c.CANCELED.b() + "}");
                    }
                }
            }
            e.h("mspl", "pay inner raw result: " + f11);
            gVar.i();
            boolean J = g9.a.d().J();
            if (!TextUtils.equals(f11, "failed") && !TextUtils.equals(f11, "scheme_failed") && (!J || !aVar.s())) {
                if (TextUtils.isEmpty(f11)) {
                    return a9.b.a();
                }
                if (f11.contains("{\"isLogin\":\"false\"}")) {
                    c9.a.b(aVar, "biz", "LogHkLoginByIntent");
                    return a(aVar, b11, y11, f11, this.f10217a);
                }
                return f11;
            }
            c9.a.b(aVar, "biz", "LogBindCalledH5");
            return e(aVar, b11);
        }
        c9.a.b(aVar, "biz", "LogCalledH5");
        return e(aVar, b11);
    }

    private String e(r9.a aVar, String str) {
        showLoading();
        a9.c cVar = null;
        try {
            try {
                JSONObject c11 = new n9.e().g(aVar, this.f10217a.getApplicationContext(), str).c();
                String optString = c11.optString("end_code", null);
                List<p9.b> a11 = p9.b.a(c11.optJSONObject("form").optJSONObject("onload"));
                for (int i11 = 0; i11 < a11.size(); i11++) {
                    if (a11.get(i11).b() == p9.a.Update) {
                        p9.b.c(a11.get(i11));
                    }
                }
                j(aVar, c11);
                dismissLoading();
                c9.a.a(this.f10217a, aVar, str, aVar.f49316d);
                for (int i12 = 0; i12 < a11.size(); i12++) {
                    p9.b bVar = a11.get(i12);
                    if (bVar.b() == p9.a.WapPay) {
                        String g11 = g(aVar, bVar);
                        dismissLoading();
                        c9.a.a(this.f10217a, aVar, str, aVar.f49316d);
                        return g11;
                    } else if (bVar.b() == p9.a.OpenWeb) {
                        String h11 = h(aVar, bVar, optString);
                        dismissLoading();
                        c9.a.a(this.f10217a, aVar, str, aVar.f49316d);
                        return h11;
                    }
                }
                dismissLoading();
                c9.a.a(this.f10217a, aVar, str, aVar.f49316d);
            } catch (IOException e11) {
                a9.c b11 = a9.c.b(a9.c.NETWORK_ERROR.b());
                c9.a.f(aVar, "net", e11);
                dismissLoading();
                c9.a.a(this.f10217a, aVar, str, aVar.f49316d);
                cVar = b11;
            }
            if (cVar == null) {
                cVar = a9.c.b(a9.c.FAILED.b());
            }
            return a9.b.b(cVar.b(), cVar.a(), "");
        }
    }

    private synchronized String f(r9.a aVar, String str, boolean z11) {
        String d11;
        if (z11) {
            showLoading();
        }
        if (str.contains("payment_inst=")) {
            String substring = str.substring(str.indexOf("payment_inst=") + 13);
            int indexOf = substring.indexOf(38);
            if (indexOf > 0) {
                substring = substring.substring(0, indexOf);
            }
            a9.a.b(substring.replaceAll("\"", "").toLowerCase(Locale.getDefault()).replaceAll("alipay", ""));
        } else {
            a9.a.b("");
        }
        if (str.contains("service=alipay.acquire.mr.ord.createandpay")) {
            e9.a.f25023c = true;
        }
        if (e9.a.f25023c) {
            if (str.startsWith("https://wappaygw.alipay.com/home/exterfaceAssign.htm?")) {
                str = str.substring(str.indexOf("https://wappaygw.alipay.com/home/exterfaceAssign.htm?") + 53);
            } else if (str.startsWith("https://mclient.alipay.com/home/exterfaceAssign.htm?")) {
                str = str.substring(str.indexOf("https://mclient.alipay.com/home/exterfaceAssign.htm?") + 52);
            }
        }
        e.h("mspl", "pay prepared: " + str);
        d11 = d(str, aVar);
        e.h("mspl", "pay raw result: " + d11);
        h.c(aVar, this.f10217a.getApplicationContext(), d11);
        c9.a.c(aVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
        c9.a.c(aVar, "biz", "PgReturnV", k.a(d11, "resultStatus") + "|" + k.a(d11, "memo"));
        if (!g9.a.d().F()) {
            g9.a.d().l(aVar, this.f10217a.getApplicationContext(), false, 3);
        }
        dismissLoading();
        c9.a.g(this.f10217a.getApplicationContext(), aVar, str, aVar.f49316d);
        e.h("mspl", "pay returning: " + d11);
        return d11;
    }

    public static synchronized boolean fetchSdkConfig(Context context) {
        synchronized (PayTask.class) {
            try {
                r9.b.e().b(context);
                long elapsedRealtime = SystemClock.elapsedRealtime() / 1000;
                if (elapsedRealtime - f10216i < g9.a.d().q()) {
                    return false;
                }
                f10216i = elapsedRealtime;
                g9.a.d().l(r9.a.w(), context.getApplicationContext(), false, 4);
                return true;
            } catch (Exception e11) {
                e.d(e11);
                return false;
            }
        }
    }

    private String g(r9.a aVar, p9.b bVar) {
        String[] f11 = bVar.f();
        Intent intent = new Intent(this.f10217a, H5PayActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("url", f11[0]);
        if (f11.length == 2) {
            bundle.putString("cookie", f11[1]);
        }
        intent.putExtras(bundle);
        a.C1076a.c(aVar, intent);
        this.f10217a.startActivity(intent);
        Object obj = f10215h;
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException e11) {
                e.d(e11);
                return a9.b.a();
            }
        }
        String g11 = a9.b.g();
        return TextUtils.isEmpty(g11) ? a9.b.a() : g11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
        r0 = r6.f();
        r11 = a9.b.b(java.lang.Integer.valueOf(r0[1]).intValue(), r0[0], t9.m.R(r10, r0[2]));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String h(r9.a r10, p9.b r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.PayTask.h(r9.a, p9.b, java.lang.String):java.lang.String");
    }

    private g.InterfaceC1150g i() {
        return new b();
    }

    private void j(r9.a aVar, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("tid");
            String optString2 = jSONObject.optString("client_key");
            if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
                return;
            }
            s9.a.a(r9.b.e().c()).b(optString, optString2);
        } catch (Throwable th2) {
            c9.a.d(aVar, "biz", "ParserTidClientKeyEx", th2);
        }
    }

    private boolean k(boolean z11, boolean z12, String str, StringBuilder sb2, Map<String, String> map, String... strArr) {
        String str2;
        int length = strArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                str2 = "";
                break;
            }
            String str3 = strArr[i11];
            if (!TextUtils.isEmpty(map.get(str3))) {
                str2 = map.get(str3);
                break;
            }
            i11++;
        }
        if (TextUtils.isEmpty(str2)) {
            return !z12;
        } else if (z11) {
            sb2.append("&");
            sb2.append(str);
            sb2.append("=\"");
            sb2.append(str2);
            sb2.append("\"");
            return true;
        } else {
            sb2.append(str);
            sb2.append("=\"");
            sb2.append(str2);
            sb2.append("\"");
            return true;
        }
    }

    public void dismissLoading() {
        v9.a aVar = this.f10218b;
        if (aVar != null) {
            aVar.c();
            this.f10218b = null;
        }
    }

    public synchronized String fetchOrderInfoFromH5PayUrl(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String trim = str.trim();
                if (trim.startsWith("https://wappaygw.alipay.com/service/rest.htm") || trim.startsWith("http://wappaygw.alipay.com/service/rest.htm")) {
                    String trim2 = trim.replaceFirst("(http|https)://wappaygw.alipay.com/service/rest.htm\\?", "").trim();
                    if (!TextUtils.isEmpty(trim2)) {
                        return "_input_charset=\"utf-8\"&ordertoken=\"" + m.i("<request_token>", "</request_token>", m.E(trim2).get("req_data")) + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + a(this.f10217a) + "\"";
                    }
                }
                if (trim.startsWith("https://mclient.alipay.com/service/rest.htm") || trim.startsWith("http://mclient.alipay.com/service/rest.htm")) {
                    String trim3 = trim.replaceFirst("(http|https)://mclient.alipay.com/service/rest.htm\\?", "").trim();
                    if (!TextUtils.isEmpty(trim3)) {
                        return "_input_charset=\"utf-8\"&ordertoken=\"" + m.i("<request_token>", "</request_token>", m.E(trim3).get("req_data")) + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + a(this.f10217a) + "\"";
                    }
                }
                if ((trim.startsWith("https://mclient.alipay.com/home/exterfaceAssign.htm") || trim.startsWith("http://mclient.alipay.com/home/exterfaceAssign.htm")) && ((trim.contains("alipay.wap.create.direct.pay.by.user") || trim.contains("create_forex_trade_wap")) && !TextUtils.isEmpty(trim.replaceFirst("(http|https)://mclient.alipay.com/home/exterfaceAssign.htm\\?", "").trim()))) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("url", str);
                    jSONObject.put("bizcontext", a(this.f10217a));
                    return "new_external_info==" + jSONObject.toString();
                }
                if (Pattern.compile("^(http|https)://(maliprod\\.alipay\\.com/w/trade_pay\\.do.?|mali\\.alipay\\.com/w/trade_pay\\.do.?|mclient\\.alipay\\.com/w/trade_pay\\.do.?)").matcher(str).find()) {
                    String i11 = m.i(CallerData.NA, "", str);
                    if (!TextUtils.isEmpty(i11)) {
                        Map<String, String> E = m.E(i11);
                        StringBuilder sb2 = new StringBuilder();
                        if (k(false, true, "trade_no", sb2, E, "trade_no", "alipay_trade_no")) {
                            k(true, false, "pay_phase_id", sb2, E, "payPhaseId", "pay_phase_id", "out_relation_id");
                            sb2.append("&biz_sub_type=\"TRADE\"");
                            sb2.append("&biz_type=\"trade\"");
                            String str2 = E.get(AnalyticsFields.APP_NAME);
                            if (TextUtils.isEmpty(str2) && !TextUtils.isEmpty(E.get("cid"))) {
                                str2 = "ali1688";
                            } else if (TextUtils.isEmpty(str2) && (!TextUtils.isEmpty(E.get("sid")) || !TextUtils.isEmpty(E.get("s_id")))) {
                                str2 = "tb";
                            }
                            sb2.append("&app_name=\"" + str2 + "\"");
                            if (k(true, true, "extern_token", sb2, E, "extern_token", "cid", "sid", "s_id")) {
                                k(true, false, "appenv", sb2, E, "appenv");
                                sb2.append("&pay_channel_id=\"alipay_sdk\"");
                                c cVar = new c(this, null);
                                cVar.c(E.get("return_url"));
                                cVar.e(E.get("show_url"));
                                cVar.a(E.get("pay_order_id"));
                                String str3 = sb2.toString() + "&bizcontext=\"" + a(this.f10217a) + "\"";
                                this.f10223g.put(str3, cVar);
                                return str3;
                            }
                            return "";
                        }
                    }
                }
                if (!trim.startsWith("https://mclient.alipay.com/cashier/mobilepay.htm") && !trim.startsWith("http://mclient.alipay.com/cashier/mobilepay.htm") && (!com.alipay.sdk.app.a.c() || !trim.contains("mobileclientgw.alipaydev.com/cashier/mobilepay.htm"))) {
                    if (g9.a.d().u() && Pattern.compile("^https?://(maliprod\\.alipay\\.com|mali\\.alipay\\.com)/batch_payment\\.do\\?").matcher(trim).find()) {
                        Uri parse = Uri.parse(trim);
                        String queryParameter = parse.getQueryParameter("return_url");
                        String queryParameter2 = parse.getQueryParameter("show_url");
                        String queryParameter3 = parse.getQueryParameter("pay_order_id");
                        String a11 = a(parse.getQueryParameter("trade_nos"), parse.getQueryParameter("alipay_trade_no"));
                        String a12 = a(parse.getQueryParameter("payPhaseId"), parse.getQueryParameter("pay_phase_id"), parse.getQueryParameter("out_relation_id"));
                        String[] strArr = new String[4];
                        strArr[0] = parse.getQueryParameter(AnalyticsFields.APP_NAME);
                        strArr[1] = !TextUtils.isEmpty(parse.getQueryParameter("cid")) ? "ali1688" : "";
                        strArr[2] = !TextUtils.isEmpty(parse.getQueryParameter("sid")) ? "tb" : "";
                        strArr[3] = !TextUtils.isEmpty(parse.getQueryParameter("s_id")) ? "tb" : "";
                        String a13 = a(strArr);
                        String a14 = a(parse.getQueryParameter("extern_token"), parse.getQueryParameter("cid"), parse.getQueryParameter("sid"), parse.getQueryParameter("s_id"));
                        String a15 = a(parse.getQueryParameter("appenv"));
                        if (!TextUtils.isEmpty(a11) && !TextUtils.isEmpty(a13) && !TextUtils.isEmpty(a14)) {
                            String format = String.format("trade_no=\"%s\"&pay_phase_id=\"%s\"&biz_type=\"trade\"&biz_sub_type=\"TRADE\"&app_name=\"%s\"&extern_token=\"%s\"&appenv=\"%s\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"%s\"", a11, a12, a13, a14, a15, a(this.f10217a));
                            c cVar2 = new c(this, null);
                            cVar2.c(queryParameter);
                            cVar2.e(queryParameter2);
                            cVar2.a(queryParameter3);
                            cVar2.f(a11);
                            this.f10223g.put(format, cVar2);
                            return format;
                        }
                    }
                }
                String a16 = a(this.f10217a);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", trim);
                jSONObject2.put("bizcontext", a16);
                return String.format("new_external_info==%s", jSONObject2.toString());
            }
        } catch (Throwable th2) {
            e.d(th2);
        }
        return "";
    }

    public synchronized String fetchTradeToken() {
        return h.b(new r9.a(this.f10217a, "", "fetchTradeToken"), this.f10217a.getApplicationContext());
    }

    public String getVersion() {
        return "15.8.14";
    }

    public synchronized y9.a h5Pay(r9.a aVar, String str, boolean z11) {
        y9.a aVar2;
        aVar2 = new y9.a();
        String[] split = f(aVar, str, z11).split(";");
        HashMap hashMap = new HashMap();
        for (String str2 : split) {
            int indexOf = str2.indexOf("={");
            if (indexOf >= 0) {
                String substring = str2.substring(0, indexOf);
                hashMap.put(substring, b(str2, substring));
            }
        }
        if (hashMap.containsKey("resultStatus")) {
            aVar2.c(hashMap.get("resultStatus"));
        }
        aVar2.d(c(str, hashMap));
        if (TextUtils.isEmpty(aVar2.b())) {
            c9.a.h(aVar, "biz", "H5CbUrlEmpty", "");
        }
        return aVar2;
    }

    public synchronized String pay(String str, boolean z11) {
        if (t9.b.a()) {
            return a9.b.e();
        }
        return f(new r9.a(this.f10217a, str, "pay"), str, z11);
    }

    public synchronized boolean payInterceptorWithUrl(String str, boolean z11, H5PayCallback h5PayCallback) {
        String fetchOrderInfoFromH5PayUrl;
        fetchOrderInfoFromH5PayUrl = fetchOrderInfoFromH5PayUrl(str);
        if (!TextUtils.isEmpty(fetchOrderInfoFromH5PayUrl)) {
            e.h("mspl", "intercepted: " + fetchOrderInfoFromH5PayUrl);
            new Thread(new a(fetchOrderInfoFromH5PayUrl, z11, h5PayCallback)).start();
        }
        return !TextUtils.isEmpty(fetchOrderInfoFromH5PayUrl);
    }

    public synchronized Map<String, String> payV2(String str, boolean z11) {
        String f11;
        r9.a aVar;
        if (t9.b.a()) {
            aVar = null;
            f11 = a9.b.e();
        } else {
            r9.a aVar2 = new r9.a(this.f10217a, str, "payV2");
            f11 = f(aVar2, str, z11);
            aVar = aVar2;
        }
        return k.d(aVar, f11);
    }

    public void showLoading() {
        v9.a aVar = this.f10218b;
        if (aVar != null) {
            aVar.f();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[Catch: all -> 0x005b, TryCatch #2 {all -> 0x005b, blocks: (B:11:0x001e, B:13:0x0044, B:15:0x0051, B:16:0x0056), top: B:25:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r6) {
        /*
            java.lang.String r0 = "sc"
            java.lang.String r1 = ""
            android.content.pm.PackageManager r2 = r6.getPackageManager()     // Catch: java.lang.Exception -> L18
            java.lang.String r6 = r6.getPackageName()     // Catch: java.lang.Exception -> L18
            r3 = 0
            android.content.pm.PackageInfo r6 = r2.getPackageInfo(r6, r3)     // Catch: java.lang.Exception -> L18
            java.lang.String r2 = r6.versionName     // Catch: java.lang.Exception -> L18
            java.lang.String r6 = r6.packageName     // Catch: java.lang.Exception -> L16
            goto L1e
        L16:
            r6 = move-exception
            goto L1a
        L18:
            r6 = move-exception
            r2 = r1
        L1a:
            t9.e.d(r6)
            r6 = r1
        L1e:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5b
            r3.<init>()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = "appkey"
            java.lang.String r5 = "2014052600006128"
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = "ty"
            java.lang.String r5 = "and_lite"
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = "sv"
            java.lang.String r5 = "h.a.3.8.14"
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = "an"
            r3.put(r4, r6)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r6 = "av"
            r3.put(r6, r2)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r6 = "sdk_start_time"
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5b
            r3.put(r6, r4)     // Catch: java.lang.Throwable -> L5b
            boolean r6 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L5b
            if (r6 != 0) goto L56
            java.lang.String r6 = "h5tonative"
            r3.put(r0, r6)     // Catch: java.lang.Throwable -> L5b
        L56:
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L5b
            return r6
        L5b:
            r6 = move-exception
            t9.e.d(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.PayTask.a(android.content.Context):java.lang.String");
    }

    /* loaded from: classes.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        public String f10229a;

        /* renamed from: b  reason: collision with root package name */
        public String f10230b;

        public c(PayTask payTask) {
            this.f10229a = "";
            this.f10230b = "";
        }

        public void a(String str) {
        }

        public String b() {
            return this.f10229a;
        }

        public void c(String str) {
            this.f10229a = str;
        }

        public String d() {
            return this.f10230b;
        }

        public void e(String str) {
            this.f10230b = str;
        }

        public void f(String str) {
        }

        public /* synthetic */ c(PayTask payTask, a aVar) {
            this(payTask);
        }
    }

    public static final String a(String... strArr) {
        if (strArr == null) {
            return "";
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }

    public static String a(r9.a aVar, String str, List<a.b> list, String str2, Activity activity) {
        m.c s11 = m.s(aVar, activity, list);
        if (s11 == null || s11.b(aVar) || s11.a() || !TextUtils.equals(s11.f51806a.packageName, "hk.alipay.wallet")) {
            return str2;
        }
        e.f("mspl", "PayTask not_login");
        String valueOf = String.valueOf(str.hashCode());
        Object obj = new Object();
        HashMap<String, Object> hashMap = PayResultActivity.f10210b;
        hashMap.put(valueOf, obj);
        Intent intent = new Intent(activity, PayResultActivity.class);
        intent.putExtra("orderSuffix", str);
        intent.putExtra("externalPkgName", activity.getPackageName());
        intent.putExtra("phonecashier.pay.hash", valueOf);
        a.C1076a.c(aVar, intent);
        activity.startActivity(intent);
        synchronized (hashMap.get(valueOf)) {
            try {
                e.f("mspl", "PayTask wait");
                hashMap.get(valueOf).wait();
            } catch (InterruptedException unused) {
                e.f("mspl", "PayTask interrupted");
                return a9.b.a();
            }
        }
        String str3 = PayResultActivity.b.f10214b;
        e.f("mspl", "PayTask ret: " + str3);
        return str3;
    }
}