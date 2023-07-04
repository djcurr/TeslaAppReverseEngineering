package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.adyen.checkout.components.model.payments.response.SdkAction;
import com.adyen.checkout.components.status.model.StatusResponse;
import g9.a;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import r9.a;
import t9.e;
import t9.m;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final Map<String, InterfaceC0193b> f10232e = new ConcurrentHashMap();

    /* renamed from: f  reason: collision with root package name */
    public static long f10233f = -1;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f10235b;

    /* renamed from: c  reason: collision with root package name */
    public InterfaceC0193b f10236c;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f10234a = false;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f10237d = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public enum a {
        Invoice("20000920"),
        AccountAuth("20000067"),
        Deduct("60000157");
        
        public String appId;

        a(String str) {
            this.appId = str;
        }
    }

    /* renamed from: com.alipay.sdk.app.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0193b {
        void a(int i11, String str, Bundle bundle);
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10238a;

        static {
            int[] iArr = new int[a.values().length];
            f10238a = iArr;
            try {
                iArr[a.Deduct.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10238a[a.AccountAuth.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10238a[a.Invoice.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final int f10239a;

        /* renamed from: b  reason: collision with root package name */
        public final String f10240b;

        /* renamed from: c  reason: collision with root package name */
        public final Bundle f10241c;

        public /* synthetic */ d(b bVar, int i11, String str, Bundle bundle, c cVar) {
            this(i11, str, bundle);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f10236c != null) {
                b.this.f10236c.a(this.f10239a, this.f10240b, this.f10241c);
            }
        }

        public d(int i11, String str, Bundle bundle) {
            this.f10239a = i11;
            this.f10240b = str;
            this.f10241c = bundle;
        }
    }

    public b(Activity activity) {
        this.f10235b = activity;
        r9.b.e().b(activity);
    }

    private String b(long j11, String str, a aVar, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("startTime", String.valueOf(j11));
        jSONObject.put("session", str);
        jSONObject.put("package", this.f10235b.getPackageName());
        if (aVar != null) {
            jSONObject.put("appId", aVar.appId);
        }
        jSONObject.put("sdkVersion", "h.a.3.8.14");
        jSONObject.put("mqpURL", str2);
        return Base64.encodeToString(jSONObject.toString().getBytes(Charset.forName("UTF-8")), 2);
    }

    private String c(a aVar, Map<String, String> map) {
        if (aVar != null) {
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("alipays").authority("platformapi").path("startapp").appendQueryParameter("appId", aVar.appId);
            if (c.f10238a[aVar.ordinal()] == 1) {
                appendQueryParameter.appendQueryParameter("appClearTop", "false").appendQueryParameter("startMultApp", "YES");
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                appendQueryParameter.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            return appendQueryParameter.build().toString();
        }
        throw new RuntimeException("missing bizType");
    }

    public static void d(String str, int i11, String str2, Bundle bundle) {
        InterfaceC0193b remove = f10232e.remove(str);
        if (remove != null) {
            try {
                remove.a(i11, str2, bundle);
            } catch (Throwable th2) {
                e.d(th2);
            }
        }
    }

    private boolean e(r9.a aVar, String str, a aVar2, Map<String, String> map, boolean z11) {
        PackageInfo packageInfo;
        if (this.f10234a) {
            this.f10237d.post(new d(this, 4000, "该 OpenAuthTask 已在执行", null, null));
            return true;
        }
        this.f10234a = true;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - f10233f <= 3000) {
            this.f10237d.post(new d(this, 5000, "3s 内重复支付", null, null));
            return true;
        }
        f10233f = elapsedRealtime;
        a9.a.b("");
        String g11 = m.g(32);
        HashMap hashMap = new HashMap(map);
        hashMap.put("mqpPkgName", this.f10235b.getPackageName());
        hashMap.put("mqpScene", SdkAction.ACTION_TYPE);
        List<a.b> y11 = g9.a.d().y();
        if (!g9.a.d().f27863h || y11 == null) {
            y11 = a9.a.f355d;
        }
        m.c s11 = m.s(aVar, this.f10235b, y11);
        if (s11 == null || s11.b(aVar) || s11.a() || (packageInfo = s11.f51806a) == null || packageInfo.versionCode < 122) {
            if (z11) {
                hashMap.put("mqpScheme", String.valueOf(str));
                hashMap.put("mqpNotifyName", g11);
                hashMap.put("mqpScene", "landing");
                String c11 = c(aVar2, hashMap);
                Intent intent = new Intent(this.f10235b, H5OpenAuthActivity.class);
                intent.putExtra("url", String.format("https://render.alipay.com/p/s/i?scheme=%s", Uri.encode(c11)));
                a.C1076a.c(aVar, intent);
                this.f10235b.startActivity(intent);
                return false;
            }
            this.f10237d.post(new d(this, 4001, "支付宝未安装或签名错误", null, null));
            return true;
        }
        try {
            HashMap<String, String> f11 = r9.a.f(aVar);
            f11.put("ts_scheme", String.valueOf(SystemClock.elapsedRealtime()));
            hashMap.put("mqpLoc", new JSONObject(f11).toString());
            String c12 = c(aVar2, hashMap);
            f10232e.put(g11, this.f10236c);
            String str2 = null;
            try {
                str2 = b(elapsedRealtime, g11, aVar2, c12);
            } catch (JSONException e11) {
                c9.a.d(aVar, "biz", "JSONEx", e11);
            }
            String str3 = str2;
            if (TextUtils.isEmpty(str3)) {
                this.f10237d.post(new d(this, 4000, "参数错误", null, null));
                return true;
            }
            Intent intent2 = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("alipays").authority("platformapi").path("startapp").appendQueryParameter("appId", "20001129").appendQueryParameter(StatusResponse.PAYLOAD, str3).build());
            intent2.addFlags(268435456);
            intent2.setPackage(s11.f51806a.packageName);
            try {
                c9.a.c(aVar, "biz", "PgOpenStarting", "" + elapsedRealtime);
                a.C1076a.d(aVar, g11);
                this.f10235b.startActivity(intent2);
            } catch (Throwable th2) {
                c9.a.d(aVar, "biz", "StartWalletEx", th2);
            }
            return false;
        }
    }

    public void f(String str, a aVar, Map<String, String> map, InterfaceC0193b interfaceC0193b, boolean z11) {
        Activity activity = this.f10235b;
        String valueOf = String.valueOf(map);
        r9.a aVar2 = new r9.a(activity, valueOf, "oa-" + aVar);
        this.f10236c = interfaceC0193b;
        if (e(aVar2, str, aVar, map, z11)) {
            c9.a.g(this.f10235b, aVar2, "", aVar2.f49316d);
        }
    }
}