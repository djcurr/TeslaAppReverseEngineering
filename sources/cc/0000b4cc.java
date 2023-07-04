package t9;

import android.content.Context;
import android.text.TextUtils;
import c9.a;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    public static HashMap<String, String> a(r9.a aVar) {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            v8.a c11 = c();
            JSONObject jSONObject = new JSONObject();
            Context a11 = aVar != null ? aVar.a() : null;
            if (a11 == null) {
                a11 = r9.b.e().c().getApplicationContext();
            }
            String l11 = m.l(aVar, a11);
            String c12 = u9.b.c(aVar, a11);
            jSONObject.put("ap_q", c11 != null ? c11.a() : "");
            jSONObject.put("ap_link_token", aVar != null ? aVar.f49316d : "");
            jSONObject.put("u_pd", String.valueOf(m.V()));
            jSONObject.put("u_lk", String.valueOf(m.O(m.B())));
            jSONObject.put("u_pi", String.valueOf(aVar != null ? aVar.f49319g : "_"));
            jSONObject.put("u_fu", l11);
            jSONObject.put("u_oi", c12);
            hashMap.put("ap_req", jSONObject.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c11 != null ? c11.a() : "");
            sb2.append("|");
            sb2.append(l11);
            c9.a.c(aVar, "biz", "ap_q", sb2.toString());
        } catch (Exception e11) {
            c9.a.d(aVar, "biz", "APMEx1", e11);
        }
        return hashMap;
    }

    public static JSONObject b(r9.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("ap_resp");
        try {
            if (TextUtils.isEmpty(optString)) {
                return null;
            }
            return new JSONObject(optString);
        } catch (JSONException e11) {
            c9.a.d(aVar, "biz", "APMEx2", e11);
            return null;
        }
    }

    public static v8.a c() {
        try {
            try {
                return x8.a.b("NP", System.currentTimeMillis(), new x8.c(r9.b.e().d()), (short) a.c.a(r9.b.e().c()), new x8.f());
            } catch (Exception unused) {
                return x8.a.c();
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public static void d(r9.a aVar, HashMap<String, String> hashMap) {
        JSONObject f11 = g9.a.d().f();
        if (hashMap == null || f11 == null) {
            return;
        }
        c9.a.c(aVar, "biz", "ap_r", f11.optString("ap_r"));
        hashMap.putAll(m.o(f11));
    }

    public static void e(r9.a aVar, JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        try {
            jSONObject.putOpt("ap_args", jSONObject2);
        } catch (JSONException e11) {
            c9.a.d(aVar, "biz", "APMEx2", e11);
        }
    }
}