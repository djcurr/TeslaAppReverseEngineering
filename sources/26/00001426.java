package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.e.f;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {
    public static Map<String, String> a(Context context) {
        l8.b c11 = l8.b.c(APSecuritySdk.getInstance(context));
        HashMap hashMap = new HashMap();
        f a11 = com.alipay.apmobilesecuritysdk.e.e.a(context);
        String b11 = c11.b(context);
        String j11 = c11.j(context);
        if (a11 != null) {
            if (x9.a.c(b11)) {
                b11 = a11.b();
            }
            if (x9.a.c(j11)) {
                j11 = a11.e();
            }
        }
        f fVar = new f("", b11, "", "", j11);
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("imei", fVar.a());
                jSONObject.put("imsi", fVar.b());
                jSONObject.put("mac", fVar.c());
                jSONObject.put("bluetoothmac", fVar.d());
                jSONObject.put("gsi", fVar.e());
                String jSONObject2 = jSONObject.toString();
                com.alipay.apmobilesecuritysdk.f.a.a("device_feature_file_name", "device_feature_file_key", jSONObject2);
                com.alipay.apmobilesecuritysdk.f.a.a(context, "device_feature_prefs_name", "device_feature_prefs_key", jSONObject2);
            } catch (Exception e11) {
                com.alipay.apmobilesecuritysdk.c.a.a(e11);
            }
        }
        hashMap.put("AD1", "");
        hashMap.put("AD2", b11);
        hashMap.put("AD3", l8.b.r(context));
        hashMap.put("AD5", l8.b.v(context));
        hashMap.put("AD6", l8.b.x(context));
        hashMap.put("AD7", l8.b.z(context));
        hashMap.put("AD9", c11.h(context));
        hashMap.put("AD10", j11);
        hashMap.put("AD11", l8.b.i());
        hashMap.put("AD12", c11.a());
        hashMap.put("AD13", l8.b.k());
        hashMap.put("AD14", l8.b.o());
        hashMap.put("AD15", l8.b.q());
        hashMap.put("AD16", l8.b.s());
        hashMap.put("AD17", "");
        hashMap.put("AD19", l8.b.B(context));
        hashMap.put("AD20", l8.b.u());
        hashMap.put("AD22", "");
        hashMap.put("AD23", l8.b.D(context));
        hashMap.put("AD24", x9.a.k(l8.b.t(context)));
        hashMap.put("AD26", c11.f(context));
        hashMap.put("AD27", l8.b.E());
        hashMap.put("AD28", l8.b.I());
        hashMap.put("AD29", l8.b.L());
        hashMap.put("AD30", l8.b.G());
        hashMap.put("AD31", l8.b.K());
        hashMap.put("AD32", l8.b.A());
        hashMap.put("AD33", l8.b.C());
        hashMap.put("AD34", l8.b.F(context));
        hashMap.put("AD35", l8.b.H(context));
        hashMap.put("AD36", c11.l(context));
        hashMap.put("AD37", l8.b.y());
        hashMap.put("AD38", l8.b.w());
        hashMap.put("AD39", l8.b.n(context));
        hashMap.put("AD40", l8.b.p(context));
        hashMap.put("AD41", l8.b.e());
        hashMap.put("AD42", l8.b.g());
        return hashMap;
    }
}