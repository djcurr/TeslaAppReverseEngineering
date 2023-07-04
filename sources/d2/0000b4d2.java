package t9;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.adyen.checkout.components.model.payments.request.Address;
import com.alipay.android.app.IAlixPay;
import com.alipay.android.app.IRemoteServiceCallback;
import com.alipay.sdk.app.APayEntranceActivity;
import com.alipay.sdk.app.AlipayResultActivity;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
import r9.a;
import t9.m;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public Activity f51780a;

    /* renamed from: b  reason: collision with root package name */
    public volatile IAlixPay f51781b;

    /* renamed from: d  reason: collision with root package name */
    public boolean f51783d;

    /* renamed from: e  reason: collision with root package name */
    public InterfaceC1150g f51784e;

    /* renamed from: f  reason: collision with root package name */
    public final r9.a f51785f;

    /* renamed from: c  reason: collision with root package name */
    public final Object f51782c = IAlixPay.class;

    /* renamed from: g  reason: collision with root package name */
    public boolean f51786g = false;

    /* renamed from: h  reason: collision with root package name */
    public String f51787h = null;

    /* renamed from: i  reason: collision with root package name */
    public String f51788i = null;

    /* loaded from: classes.dex */
    public class a implements AlipayResultActivity.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f51789a;

        public a(CountDownLatch countDownLatch) {
            this.f51789a = countDownLatch;
        }

        @Override // com.alipay.sdk.app.AlipayResultActivity.a
        public void a(int i11, String str, String str2) {
            g.this.f51787h = a9.b.b(i11, str, str2);
            this.f51789a.countDown();
        }
    }

    /* loaded from: classes.dex */
    public class b implements APayEntranceActivity.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f51791a;

        public b(Object obj) {
            this.f51791a = obj;
        }

        @Override // com.alipay.sdk.app.APayEntranceActivity.a
        public void a(String str) {
            g.this.f51788i = str;
            synchronized (this.f51791a) {
                try {
                    this.f51791a.notify();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ APayEntranceActivity.a f51793a;

        public c(APayEntranceActivity.a aVar) {
            this.f51793a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g.this.f51785f == null || g.this.f51785f.q()) {
                return;
            }
            c9.a.h(g.this.f51785f, "biz", "ErrActNotCreated", "");
            if (g9.a.d().J()) {
                g.this.f51785f.l(true);
                this.f51793a.a(a9.b.a());
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Intent f51795a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f51796b;

        public d(Intent intent, Object obj) {
            this.f51795a = intent;
            this.f51796b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (g.this.f51780a != null) {
                    g.this.f51780a.startActivity(this.f51795a);
                } else {
                    c9.a.h(g.this.f51785f, "biz", "ErrActNull2", "");
                    Context a11 = g.this.f51785f.a();
                    if (a11 != null) {
                        a11.startActivity(this.f51795a);
                    }
                }
            } catch (Throwable th2) {
                c9.a.d(g.this.f51785f, "biz", "ErrActEx2", th2);
                m.t("alipaySdk", "startActivityEx", g.this.f51780a, g.this.f51785f);
                synchronized (this.f51796b) {
                    try {
                        g.this.f51788i = "scheme_failed";
                        this.f51796b.notify();
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class e extends IRemoteServiceCallback.Stub {
        public e() {
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public int getVersion() {
            return 4;
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public boolean isHideLoadingScreen() {
            return false;
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void payEnd(boolean z11, String str) {
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void r03(String str, String str2, Map map) {
            c9.a.c(g.this.f51785f, "wlt", str, str2);
            if (TextUtils.equals(str2, "ActivityStartSuccess")) {
                if (g.this.f51784e != null) {
                    g.this.f51784e.a();
                }
                if (g.this.f51785f != null) {
                    g.this.f51785f.o(true);
                }
            }
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void startActivity(String str, String str2, int i11, Bundle bundle) {
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            if (bundle == null) {
                bundle = new Bundle();
            }
            try {
                bundle.putInt("CallingPid", i11);
                intent.putExtras(bundle);
            } catch (Exception e11) {
                c9.a.d(g.this.f51785f, "biz", "ErrIntentEx", e11);
            }
            intent.setClassName(str, str2);
            try {
                if (Build.VERSION.SDK_INT >= 16) {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    r9.a aVar = g.this.f51785f;
                    c9.a.c(aVar, "biz", "isFg", runningAppProcessInfo.processName + "|" + runningAppProcessInfo.importance + "|");
                }
            } catch (Throwable unused) {
            }
            try {
                if (g.this.f51780a == null) {
                    c9.a.h(g.this.f51785f, "biz", "ErrActNull", "");
                    Context a11 = g.this.f51785f.a();
                    if (a11 != null) {
                        a11.startActivity(intent);
                        return;
                    }
                    return;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                g.this.f51780a.startActivity(intent);
                r9.a aVar2 = g.this.f51785f;
                c9.a.c(aVar2, "biz", "stAct2", "" + (SystemClock.elapsedRealtime() - elapsedRealtime));
            } catch (Throwable th2) {
                c9.a.d(g.this.f51785f, "biz", "ErrActEx", th2);
                throw th2;
            }
        }

        public /* synthetic */ e(g gVar, a aVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public class f implements ServiceConnection {
        public f() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            c9.a.b(g.this.f51785f, "biz", "srvCon");
            synchronized (g.this.f51782c) {
                g.this.f51781b = IAlixPay.Stub.asInterface(iBinder);
                g.this.f51782c.notify();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            c9.a.b(g.this.f51785f, "biz", "srvDis");
            g.this.f51781b = null;
        }

        public /* synthetic */ f(g gVar, a aVar) {
            this();
        }
    }

    /* renamed from: t9.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC1150g {
        void a();

        void b();
    }

    public g(Activity activity, r9.a aVar, InterfaceC1150g interfaceC1150g) {
        this.f51780a = activity;
        this.f51785f = aVar;
        this.f51784e = interfaceC1150g;
        t9.e.h("mspl", "alipaySdk");
    }

    private Pair<String, Boolean> a(String str, String str2, r9.a aVar) {
        int i11;
        f fVar;
        e eVar;
        Activity activity;
        Activity activity2;
        long elapsedRealtime;
        StringBuilder sb2;
        String Pay;
        Activity activity3;
        Activity activity4;
        Intent intent = new Intent();
        intent.setPackage(str2);
        intent.setAction(m.I(str2));
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("");
        sb3.append(elapsedRealtime2);
        sb3.append("|");
        sb3.append(str != null ? str.length() : 0);
        c9.a.c(aVar, "biz", "PgBindStarting", sb3.toString());
        c9.a.a(this.f51780a, aVar, str, aVar.f49316d);
        try {
            if (!g9.a.d().s()) {
                ComponentName startService = this.f51780a.getApplication().startService(intent);
                c9.a.c(aVar, "biz", "stSrv", startService != null ? startService.getPackageName() : Address.ADDRESS_NULL_PLACEHOLDER);
            } else {
                c9.a.c(aVar, "biz", "stSrv", "skipped");
            }
            if (g9.a.d().o()) {
                i11 = 65;
                c9.a.c(aVar, "biz", "bindFlg", "imp");
            } else {
                i11 = 1;
            }
            f fVar2 = new f(this, null);
            if (this.f51780a.getApplicationContext().bindService(intent, fVar2, i11)) {
                synchronized (this.f51782c) {
                    if (this.f51781b == null) {
                        try {
                            this.f51782c.wait(g9.a.d().x());
                        } catch (InterruptedException e11) {
                            c9.a.d(aVar, "biz", "BindWaitTimeoutEx", e11);
                        }
                    }
                }
                IAlixPay iAlixPay = this.f51781b;
                try {
                    if (iAlixPay == null) {
                        c9.a.h(aVar, "biz", "ClientBindFailed", "");
                        m.t("alipaySdk", "bindServiceTimeout", this.f51780a, this.f51785f);
                        Pair<String, Boolean> pair = new Pair<>("failed", Boolean.TRUE);
                        try {
                            this.f51780a.getApplicationContext().unbindService(fVar2);
                        } catch (Throwable th2) {
                            t9.e.d(th2);
                        }
                        c9.a.c(aVar, "biz", "PgBindEnd", "" + SystemClock.elapsedRealtime());
                        c9.a.a(this.f51780a, aVar, str, aVar.f49316d);
                        this.f51781b = null;
                        if (this.f51783d && (activity4 = this.f51780a) != null) {
                            activity4.setRequestedOrientation(0);
                            this.f51783d = false;
                        }
                        return pair;
                    }
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    c9.a.c(aVar, "biz", "PgBinded", "" + elapsedRealtime3);
                    InterfaceC1150g interfaceC1150g = this.f51784e;
                    if (interfaceC1150g != null) {
                        interfaceC1150g.b();
                    }
                    if (this.f51780a.getRequestedOrientation() == 0) {
                        this.f51780a.setRequestedOrientation(1);
                        this.f51783d = true;
                    }
                    int version = iAlixPay.getVersion();
                    eVar = new e(this, null);
                    try {
                        if (version >= 3) {
                            iAlixPay.registerCallback03(eVar, str, null);
                        } else {
                            iAlixPay.registerCallback(eVar);
                        }
                        elapsedRealtime = SystemClock.elapsedRealtime();
                        sb2 = new StringBuilder();
                    } catch (Throwable th3) {
                        th = th3;
                        fVar = fVar2;
                    }
                    try {
                        sb2.append("");
                        sb2.append(elapsedRealtime);
                        c9.a.c(aVar, "biz", "PgBindPay", sb2.toString());
                        if (version >= 3) {
                            iAlixPay.r03("biz", "bind_pay", null);
                        }
                        if (version >= 2) {
                            HashMap<String, String> f11 = r9.a.f(aVar);
                            f11.put("ts_bind", String.valueOf(elapsedRealtime2));
                            f11.put("ts_bend", String.valueOf(elapsedRealtime3));
                            f11.put("ts_pay", String.valueOf(elapsedRealtime));
                            Pay = iAlixPay.pay02(str, f11);
                        } else {
                            Pay = iAlixPay.Pay(str);
                        }
                        String str3 = Pay;
                        try {
                            iAlixPay.unregisterCallback(eVar);
                        } catch (Throwable th4) {
                            t9.e.d(th4);
                        }
                        try {
                            this.f51780a.getApplicationContext().unbindService(fVar2);
                        } catch (Throwable th5) {
                            t9.e.d(th5);
                        }
                        c9.a.c(aVar, "biz", "PgBindEnd", "" + SystemClock.elapsedRealtime());
                        c9.a.a(this.f51780a, aVar, str, aVar.f49316d);
                        this.f51781b = null;
                        if (this.f51783d && (activity3 = this.f51780a) != null) {
                            activity3.setRequestedOrientation(0);
                            this.f51783d = false;
                        }
                        return new Pair<>(str3, Boolean.FALSE);
                    } catch (Throwable th6) {
                        th = th6;
                        fVar = fVar2;
                        try {
                            c9.a.e(aVar, "biz", "ClientBindFailed", th, "in_bind");
                            Pair<String, Boolean> pair2 = new Pair<>("failed", Boolean.TRUE);
                            if (eVar != null) {
                                try {
                                    iAlixPay.unregisterCallback(eVar);
                                } catch (Throwable th7) {
                                    t9.e.d(th7);
                                }
                            }
                            try {
                                this.f51780a.getApplicationContext().unbindService(fVar);
                            } catch (Throwable th8) {
                                t9.e.d(th8);
                            }
                            c9.a.c(aVar, "biz", "PgBindEnd", "" + SystemClock.elapsedRealtime());
                            c9.a.a(this.f51780a, aVar, str, aVar.f49316d);
                            this.f51781b = null;
                            if (this.f51783d && (activity2 = this.f51780a) != null) {
                                activity2.setRequestedOrientation(0);
                                this.f51783d = false;
                            }
                            return pair2;
                        } catch (Throwable th9) {
                            if (eVar != null) {
                                try {
                                    iAlixPay.unregisterCallback(eVar);
                                } catch (Throwable th10) {
                                    t9.e.d(th10);
                                }
                            }
                            try {
                                this.f51780a.getApplicationContext().unbindService(fVar);
                            } catch (Throwable th11) {
                                t9.e.d(th11);
                            }
                            c9.a.c(aVar, "biz", "PgBindEnd", "" + SystemClock.elapsedRealtime());
                            c9.a.a(this.f51780a, aVar, str, aVar.f49316d);
                            this.f51781b = null;
                            if (this.f51783d && (activity = this.f51780a) != null) {
                                activity.setRequestedOrientation(0);
                                this.f51783d = false;
                            }
                            throw th9;
                        }
                    }
                } catch (Throwable th12) {
                    th = th12;
                    fVar = fVar2;
                    eVar = null;
                }
            } else {
                throw new Throwable("bindService fail");
            }
        }
    }

    private String c(String str, String str2) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        String g11 = m.g(32);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        r9.a aVar = this.f51785f;
        c9.a.c(aVar, "biz", "BSPStart", g11 + "|" + elapsedRealtime);
        a.C1076a.d(this.f51785f, g11);
        AlipayResultActivity.f10196a.put(g11, new a(countDownLatch));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sourcePid", Binder.getCallingPid());
            jSONObject.put("external_info", str);
            jSONObject.put("pkgName", this.f51780a.getPackageName());
            jSONObject.put("session", g11);
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes("UTF-8"), 2);
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("alipays").authority("platformapi").path("startapp").appendQueryParameter("appId", "20000125");
            appendQueryParameter.appendQueryParameter("mqpSchemePay", encodeToString);
            HashMap<String, String> f11 = r9.a.f(this.f51785f);
            f11.put("ts_scheme", String.valueOf(elapsedRealtime));
            appendQueryParameter.appendQueryParameter("mqpLoc", new JSONObject(f11).toString());
            String uri = appendQueryParameter.build().toString();
            Intent intent = new Intent();
            intent.setPackage(str2);
            intent.addFlags(268435456);
            intent.setData(Uri.parse(uri));
            Activity activity = this.f51780a;
            r9.a aVar2 = this.f51785f;
            c9.a.a(activity, aVar2, str, aVar2.f49316d);
            this.f51780a.startActivity(intent);
            t9.e.h("mspl", "pay scheme waiting " + uri);
            countDownLatch.await();
            String str3 = this.f51787h;
            String str4 = k.d(this.f51785f, str3).get("resultStatus");
            if (str4 == null) {
                str4 = Address.ADDRESS_NULL_PLACEHOLDER;
            }
            r9.a aVar3 = this.f51785f;
            c9.a.b(aVar3, "biz", "BSPDone-" + str4);
            if (TextUtils.isEmpty(str3)) {
                c9.a.b(this.f51785f, "biz", "BSPEmpty");
                return "scheme_failed";
            }
            return str3;
        } catch (InterruptedException e11) {
            c9.a.d(this.f51785f, "biz", "BSPWaiting", e11);
            a9.c cVar = a9.c.PAY_WAITTING;
            return a9.b.b(cVar.b(), cVar.a(), "");
        } catch (Throwable th2) {
            c9.a.d(this.f51785f, "biz", "BSPEx", th2);
            return "scheme_failed";
        }
    }

    private String d(String str, String str2, PackageInfo packageInfo) {
        String str3 = packageInfo != null ? packageInfo.versionName : "";
        t9.e.h("mspl", "pay payInvokeAct");
        r9.a aVar = this.f51785f;
        c9.a.c(aVar, "biz", "PgWltVer", str2 + "|" + str3);
        Activity activity = this.f51780a;
        r9.a aVar2 = this.f51785f;
        c9.a.a(activity, aVar2, str, aVar2.f49316d);
        return m(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0189 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String e(java.lang.String r9, java.lang.String r10, android.content.pm.PackageInfo r11, t9.m.c r12) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.g.e(java.lang.String, java.lang.String, android.content.pm.PackageInfo, t9.m$c):java.lang.String");
    }

    public static /* synthetic */ r9.a h(g gVar) {
        return gVar.f51785f;
    }

    private void j(m.c cVar) {
        PackageInfo packageInfo;
        if (cVar == null || (packageInfo = cVar.f51806a) == null) {
            return;
        }
        String str = packageInfo.packageName;
        Intent intent = new Intent();
        intent.setClassName(str, "com.alipay.android.app.TransProcessPayActivity");
        try {
            this.f51780a.startActivity(intent);
        } catch (Throwable th2) {
            c9.a.d(this.f51785f, "biz", "StartLaunchAppTransEx", th2);
        }
        Thread.sleep(200L);
    }

    public static boolean k(String str, Context context, r9.a aVar) {
        try {
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            intent.setClassName(str, "com.alipay.android.msp.ui.views.MspContainerActivity");
            if (intent.resolveActivityInfo(context.getPackageManager(), 0) == null) {
                c9.a.b(aVar, "biz", "BSPDetectFail");
                return false;
            }
            return true;
        } catch (Throwable th2) {
            c9.a.d(aVar, "biz", "BSPDetectFail", th2);
            return false;
        }
    }

    private String m(String str, String str2) {
        JSONObject jSONObject;
        Object obj = new Object();
        String g11 = m.g(32);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        r9.a aVar = this.f51785f;
        c9.a.c(aVar, "biz", "BSAStart", g11 + "|" + elapsedRealtime);
        a.C1076a.d(this.f51785f, g11);
        b bVar = new b(obj);
        APayEntranceActivity.f10192d.put(g11, bVar);
        try {
            HashMap<String, String> f11 = r9.a.f(this.f51785f);
            f11.put("ts_intent", String.valueOf(elapsedRealtime));
            jSONObject = new JSONObject(f11);
        } catch (Throwable th2) {
            try {
                c9.a.d(this.f51785f, "biz", "BSALocEx", th2);
                jSONObject = null;
            } catch (InterruptedException e11) {
                c9.a.d(this.f51785f, "biz", "BSAWaiting", e11);
                a9.c cVar = a9.c.PAY_WAITTING;
                return a9.b.b(cVar.b(), cVar.a(), "");
            } catch (Throwable th3) {
                c9.a.d(this.f51785f, "biz", "BSAEx", th3);
                m.t("alipaySdk", "startActivityEx", this.f51780a, this.f51785f);
                return "scheme_failed";
            }
        }
        Intent intent = new Intent(this.f51780a, APayEntranceActivity.class);
        intent.putExtra("ap_order_info", str);
        intent.putExtra("ap_target_packagename", str2);
        intent.putExtra("ap_session", g11);
        if (jSONObject != null) {
            intent.putExtra("ap_local_info", jSONObject.toString());
        }
        new Handler(Looper.getMainLooper()).postDelayed(new c(bVar), g9.a.d().x());
        Activity activity = this.f51780a;
        r9.a aVar2 = this.f51785f;
        c9.a.a(activity, aVar2, str, aVar2.f49316d);
        if (g9.a.d().M()) {
            new Handler(Looper.getMainLooper()).post(new d(intent, obj));
        } else {
            try {
                Activity activity2 = this.f51780a;
                if (activity2 != null) {
                    activity2.startActivity(intent);
                } else {
                    c9.a.h(this.f51785f, "biz", "ErrActNull", "");
                    Context a11 = this.f51785f.a();
                    if (a11 != null) {
                        a11.startActivity(intent);
                    }
                }
            } catch (Throwable th4) {
                c9.a.d(this.f51785f, "biz", "ErrActEx", th4);
                throw th4;
            }
        }
        synchronized (obj) {
            obj.wait();
        }
        String str3 = this.f51788i;
        String str4 = "unknown";
        try {
            String str5 = k.d(this.f51785f, str3).get("resultStatus");
            str4 = str5 == null ? Address.ADDRESS_NULL_PLACEHOLDER : str5;
        } catch (Throwable th5) {
            c9.a.d(this.f51785f, "biz", "BSAStatEx", th5);
        }
        r9.a aVar3 = this.f51785f;
        c9.a.b(aVar3, "biz", "BSADone-" + str4);
        if (TextUtils.isEmpty(str3)) {
            c9.a.b(this.f51785f, "biz", "BSAEmpty");
            return "scheme_failed";
        }
        return str3;
    }

    public static boolean o(String str, Context context, r9.a aVar) {
        try {
            Intent intent = new Intent();
            intent.setClassName(str, "com.alipay.android.app.flybird.ui.window.FlyBirdWindowActivity");
            if (intent.resolveActivityInfo(context.getPackageManager(), 0) == null) {
                c9.a.b(aVar, "biz", "BSADetectFail");
                return false;
            }
            return true;
        } catch (Throwable th2) {
            c9.a.d(aVar, "biz", "BSADetectFail", th2);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063 A[Catch: all -> 0x00ab, TRY_LEAVE, TryCatch #2 {all -> 0x00ab, blocks: (B:10:0x0023, B:12:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0042, B:24:0x004b, B:26:0x0054, B:29:0x0059, B:31:0x0063, B:25:0x0050), top: B:70:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String f(java.lang.String r9, boolean r10) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            r1 = 0
            g9.a r2 = g9.a.d()     // Catch: java.lang.Throwable -> Lae
            java.util.List r2 = r2.y()     // Catch: java.lang.Throwable -> Lae
            g9.a r3 = g9.a.d()     // Catch: java.lang.Throwable -> Lae
            boolean r3 = r3.f27863h     // Catch: java.lang.Throwable -> Lae
            if (r3 == 0) goto L15
            if (r2 != 0) goto L17
        L15:
            java.util.List<g9.a$b> r2 = a9.a.f355d     // Catch: java.lang.Throwable -> Lae
        L17:
            r9.a r3 = r8.f51785f     // Catch: java.lang.Throwable -> Lae
            android.app.Activity r4 = r8.f51780a     // Catch: java.lang.Throwable -> Lae
            t9.m$c r2 = t9.m.s(r3, r4, r2)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r3 = "failed"
            if (r2 == 0) goto Lad
            r9.a r4 = r8.f51785f     // Catch: java.lang.Throwable -> Lab
            boolean r4 = r2.b(r4)     // Catch: java.lang.Throwable -> Lab
            if (r4 != 0) goto Lad
            boolean r4 = r2.a()     // Catch: java.lang.Throwable -> Lab
            if (r4 == 0) goto L33
            goto Lad
        L33:
            android.content.pm.PackageInfo r4 = r2.f51806a     // Catch: java.lang.Throwable -> Lab
            boolean r4 = t9.m.v(r4)     // Catch: java.lang.Throwable -> Lab
            if (r4 == 0) goto L3c
            return r3
        L3c:
            android.content.pm.PackageInfo r3 = r2.f51806a     // Catch: java.lang.Throwable -> Lab
            if (r3 == 0) goto L50
            java.lang.String r4 = "com.eg.android.AlipayGphone"
            java.lang.String r3 = r3.packageName     // Catch: java.lang.Throwable -> Lab
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Throwable -> Lab
            if (r3 == 0) goto L4b
            goto L50
        L4b:
            android.content.pm.PackageInfo r3 = r2.f51806a     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = r3.packageName     // Catch: java.lang.Throwable -> Lab
            goto L54
        L50:
            java.lang.String r0 = t9.m.B()     // Catch: java.lang.Throwable -> Lab
        L54:
            android.content.pm.PackageInfo r3 = r2.f51806a     // Catch: java.lang.Throwable -> Lab
            if (r3 == 0) goto L59
            r1 = r3
        L59:
            g9.a r3 = g9.a.d()     // Catch: java.lang.Throwable -> Lab
            java.lang.String r3 = r3.p()     // Catch: java.lang.Throwable -> Lab
            if (r3 == 0) goto Lb9
            int r4 = r3.length()     // Catch: java.lang.Throwable -> Lab
            if (r4 <= 0) goto Lb9
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lb9
            r4.<init>(r3)     // Catch: java.lang.Throwable -> Lb9
            org.json.JSONObject r3 = r4.optJSONObject(r0)     // Catch: java.lang.Throwable -> Lb9
            if (r3 == 0) goto Lb9
            int r4 = r3.length()     // Catch: java.lang.Throwable -> Lb9
            if (r4 <= 0) goto Lb9
            java.util.Iterator r4 = r3.keys()     // Catch: java.lang.Throwable -> Lb9
        L7e:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> Lb9
            if (r5 == 0) goto Lb9
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Lb9
            int r6 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Throwable -> Lb9
            if (r1 == 0) goto L7e
            int r7 = r1.versionCode     // Catch: java.lang.Throwable -> Lb9
            if (r7 < r6) goto L7e
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> Lb9
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> Lb9
            g9.a r6 = g9.a.d()     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> Lb9
            android.app.Activity r7 = r8.f51780a     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> Lb9
            boolean r5 = r6.n(r7, r5)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> Lb9
            r8.f51786g = r5     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> Lb9
            if (r5 == 0) goto L7e
            goto Lb9
        Lab:
            r3 = move-exception
            goto Lb0
        Lad:
            return r3
        Lae:
            r3 = move-exception
            r2 = r1
        Lb0:
            r9.a r4 = r8.f51785f
            java.lang.String r5 = "biz"
            java.lang.String r6 = "CheckClientSignEx"
            c9.a.d(r4, r5, r6, r3)
        Lb9:
            r9.a r3 = r8.f51785f
            boolean r3 = t9.m.G(r3)
            if (r10 != 0) goto Lc5
            boolean r10 = r8.f51786g
            if (r10 == 0) goto Ld6
        Lc5:
            if (r3 != 0) goto Ld6
            android.app.Activity r10 = r8.f51780a
            r9.a r3 = r8.f51785f
            boolean r10 = o(r0, r10, r3)
            if (r10 == 0) goto Ld6
            java.lang.String r9 = r8.d(r9, r0, r1)
            return r9
        Ld6:
            java.lang.String r9 = r8.e(r9, r0, r1, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.g.f(java.lang.String, boolean):java.lang.String");
    }

    public void i() {
        this.f51780a = null;
        this.f51784e = null;
    }
}