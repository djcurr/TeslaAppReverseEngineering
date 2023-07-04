package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e {
    public static f a(Context context) {
        if (context == null) {
            return null;
        }
        String a11 = com.alipay.apmobilesecuritysdk.f.a.a(context, "device_feature_prefs_name", "device_feature_prefs_key");
        if (x9.a.c(a11)) {
            a11 = com.alipay.apmobilesecuritysdk.f.a.a("device_feature_file_name", "device_feature_file_key");
        }
        if (x9.a.c(a11)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(a11);
            f fVar = new f();
            fVar.a(jSONObject.getString("imei"));
            fVar.b(jSONObject.getString("imsi"));
            fVar.c(jSONObject.getString("mac"));
            fVar.d(jSONObject.getString("bluetoothmac"));
            fVar.e(jSONObject.getString("gsi"));
            return fVar;
        } catch (Exception e11) {
            com.alipay.apmobilesecuritysdk.c.a.a(e11);
            return null;
        }
    }
}