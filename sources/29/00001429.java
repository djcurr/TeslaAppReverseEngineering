package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import com.stripe.android.networking.FraudDetectionData;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {
    public static b a(String str) {
        try {
            if (!x9.a.c(str)) {
                JSONObject jSONObject = new JSONObject(str);
                return new b(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString(FraudDetectionData.KEY_TIMESTAMP));
            }
        } catch (Exception e11) {
            com.alipay.apmobilesecuritysdk.c.a.a(e11);
        }
        return null;
    }

    public static synchronized void a() {
        synchronized (a.class) {
        }
    }

    public static synchronized void a(Context context) {
        synchronized (a.class) {
            com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", "deviceid", "");
            com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx", "");
        }
    }

    public static synchronized void a(Context context, b bVar) {
        synchronized (a.class) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("apdid", bVar.f10154a);
                jSONObject.put("deviceInfoHash", bVar.f10155b);
                jSONObject.put(FraudDetectionData.KEY_TIMESTAMP, bVar.f10156c);
                String jSONObject2 = jSONObject.toString();
                com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", "deviceid", jSONObject2);
                com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx", jSONObject2);
            } catch (Exception e11) {
                com.alipay.apmobilesecuritysdk.c.a.a(e11);
            }
        }
    }

    public static synchronized b b() {
        synchronized (a.class) {
            String a11 = com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx");
            if (x9.a.c(a11)) {
                return null;
            }
            return a(a11);
        }
    }

    public static synchronized b b(Context context) {
        b a11;
        synchronized (a.class) {
            String a12 = com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", "deviceid");
            if (x9.a.c(a12)) {
                a12 = com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx");
            }
            a11 = a(a12);
        }
        return a11;
    }

    public static synchronized b c(Context context) {
        synchronized (a.class) {
            String a11 = com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", "deviceid");
            if (x9.a.c(a11)) {
                return null;
            }
            return a(a11);
        }
    }
}