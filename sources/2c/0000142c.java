package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import com.stripe.android.networking.FraudDetectionData;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d {
    public static c a(String str) {
        try {
            if (!x9.a.c(str)) {
                JSONObject jSONObject = new JSONObject(str);
                return new c(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString(FraudDetectionData.KEY_TIMESTAMP), jSONObject.optString("tid"), jSONObject.optString("utdid"));
            }
        } catch (Exception e11) {
            com.alipay.apmobilesecuritysdk.c.a.a(e11);
        }
        return null;
    }

    public static synchronized void a() {
        synchronized (d.class) {
        }
    }

    public static synchronized void a(Context context) {
        synchronized (d.class) {
            com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v4", "key_deviceid_v4", "");
            com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v4", "key_wxcasxx_v4", "");
        }
    }

    public static synchronized void a(Context context, c cVar) {
        synchronized (d.class) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("apdid", cVar.f10157a);
                jSONObject.put("deviceInfoHash", cVar.f10158b);
                jSONObject.put(FraudDetectionData.KEY_TIMESTAMP, cVar.f10159c);
                jSONObject.put("tid", cVar.f10160d);
                jSONObject.put("utdid", cVar.f10161e);
                String jSONObject2 = jSONObject.toString();
                com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v4", "key_deviceid_v4", jSONObject2);
                com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v4", "key_wxcasxx_v4", jSONObject2);
            } catch (Exception e11) {
                com.alipay.apmobilesecuritysdk.c.a.a(e11);
            }
        }
    }

    public static synchronized c b() {
        synchronized (d.class) {
            String a11 = com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v4", "key_wxcasxx_v4");
            if (x9.a.c(a11)) {
                return null;
            }
            return a(a11);
        }
    }

    public static synchronized c b(Context context) {
        c a11;
        synchronized (d.class) {
            String a12 = com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v4", "key_deviceid_v4");
            if (x9.a.c(a12)) {
                a12 = com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v4", "key_wxcasxx_v4");
            }
            a11 = a(a12);
        }
        return a11;
    }

    public static synchronized c c(Context context) {
        synchronized (d.class) {
            String a11 = com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v4", "key_deviceid_v4");
            if (x9.a.c(a11)) {
                return null;
            }
            return a(a11);
        }
    }
}