package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import r9.a;
import t9.e;

/* loaded from: classes.dex */
public final class PayResultActivity extends Activity {

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap<String, Object> f10210b = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public r9.a f10211a = null;

    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f10212a;

        public a(Activity activity) {
            this.f10212a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10212a.finish();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static volatile String f10213a;

        /* renamed from: b  reason: collision with root package name */
        public static volatile String f10214b;
    }

    public static void a(Activity activity, int i11) {
        new Handler().postDelayed(new a(activity), i11);
    }

    public static void b(Activity activity, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        Intent intent = new Intent();
        try {
            intent.setPackage("hk.alipay.wallet");
            intent.setData(Uri.parse("alipayhk://platformapi/startApp?appId=20000125&schemePaySession=" + URLEncoder.encode(str, "UTF-8") + "&orderSuffix=" + URLEncoder.encode(str2, "UTF-8") + "&packageName=" + URLEncoder.encode(str3, "UTF-8") + "&externalPkgName=" + URLEncoder.encode(str3, "UTF-8")));
        } catch (UnsupportedEncodingException e11) {
            e.d(e11);
        }
        if (activity != null) {
            try {
                activity.startActivity(intent);
            } catch (Throwable unused) {
                activity.finish();
            }
        }
    }

    public static void c(String str) {
        b.f10214b = a9.b.a();
        e(f10210b, str);
    }

    public static void d(String str, String str2) {
        b.f10214b = str;
        e(f10210b, str2);
    }

    public static boolean e(HashMap<String, Object> hashMap, String str) {
        Object obj;
        if (hashMap == null || str == null || (obj = hashMap.get(str)) == null) {
            return false;
        }
        synchronized (obj) {
            obj.notifyAll();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            if (!TextUtils.isEmpty(intent.getStringExtra("orderSuffix"))) {
                b.f10213a = intent.getStringExtra("phonecashier.pay.hash");
                String stringExtra = intent.getStringExtra("orderSuffix");
                String stringExtra2 = intent.getStringExtra("externalPkgName");
                r9.a a11 = a.C1076a.a(intent);
                this.f10211a = a11;
                if (a11 == null) {
                    finish();
                }
                b(this, b.f10213a, stringExtra, stringExtra2);
                a(this, 300);
                return;
            }
            if (this.f10211a == null) {
                finish();
            }
            String stringExtra3 = intent.getStringExtra("phonecashier.pay.result");
            int intExtra = intent.getIntExtra("phonecashier.pay.resultOrderHash", 0);
            if (intExtra != 0 && TextUtils.equals(b.f10213a, String.valueOf(intExtra))) {
                if (!TextUtils.isEmpty(stringExtra3)) {
                    d(stringExtra3, b.f10213a);
                } else {
                    c(b.f10213a);
                }
                b.f10213a = "";
                a(this, 300);
                return;
            }
            r9.a aVar = this.f10211a;
            c9.a.h(aVar, "biz", "SchemePayWrongHashEx", "Expected " + b.f10213a + ", got " + intExtra);
            c(b.f10213a);
            a(this, 300);
        } catch (Throwable unused) {
            finish();
        }
    }
}