package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import r9.a;

/* loaded from: classes.dex */
public class AlipayResultActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, a> f10196a = new ConcurrentHashMap<>();

    /* loaded from: classes.dex */
    public interface a {
        void a(int i11, String str, String str2);
    }

    private void a(String str, Bundle bundle) {
        a remove = f10196a.remove(str);
        if (remove == null) {
            return;
        }
        try {
            remove.a(bundle.getInt("endCode"), bundle.getString("memo"), bundle.getString("result"));
        } finally {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Throwable th2;
        JSONObject jSONObject;
        Bundle bundle2;
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            String stringExtra = intent.getStringExtra("session");
            Bundle bundleExtra = intent.getBundleExtra("result");
            String stringExtra2 = intent.getStringExtra("scene");
            r9.a b11 = a.C1076a.b(stringExtra);
            if (b11 == null) {
                finish();
                return;
            }
            c9.a.c(b11, "biz", "BSPSession", stringExtra + "|" + SystemClock.elapsedRealtime());
            if (TextUtils.equals("mqpSchemePay", stringExtra2)) {
                a(stringExtra, bundleExtra);
                return;
            }
            if ((TextUtils.isEmpty(stringExtra) || bundleExtra == null) && intent.getData() != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject(new String(Base64.decode(intent.getData().getQuery(), 2), "UTF-8"));
                    jSONObject = jSONObject2.getJSONObject("result");
                    stringExtra = jSONObject2.getString("session");
                    c9.a.c(b11, "biz", "BSPUriSession", stringExtra);
                    bundle2 = new Bundle();
                } catch (Throwable th3) {
                    th2 = th3;
                }
                try {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        bundle2.putString(next, jSONObject.getString(next));
                    }
                    bundleExtra = bundle2;
                } catch (Throwable th4) {
                    th2 = th4;
                    bundleExtra = bundle2;
                    c9.a.d(b11, "biz", "BSPResEx", th2);
                    c9.a.d(b11, "biz", "ParseSchemeQueryError", th2);
                    if (TextUtils.isEmpty(stringExtra)) {
                    }
                    c9.a.g(this, b11, "", b11.f49316d);
                    finish();
                }
            }
            if (TextUtils.isEmpty(stringExtra) && bundleExtra != null) {
                c9.a.c(b11, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                c9.a.c(b11, "biz", "PgReturnV", bundleExtra.getInt("endCode", -1) + "|" + bundleExtra.getString("memo", "-"));
                b.d(stringExtra, 9000, "OK", bundleExtra);
                c9.a.g(this, b11, "", b11.f49316d);
                finish();
                return;
            }
            c9.a.g(this, b11, "", b11.f49316d);
            finish();
        } catch (Throwable unused) {
            finish();
        }
    }
}