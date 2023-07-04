package l9;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import ezvcard.property.Kind;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k9.a;
import org.json.JSONException;
import org.json.JSONObject;
import t9.l;
import t9.m;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public boolean f37122a = true;

    /* renamed from: b  reason: collision with root package name */
    public boolean f37123b = true;

    public static String a(a.b bVar, String str) {
        Map<String, List<String>> map;
        List<String> list;
        if (bVar == null || str == null || (map = bVar.f34503a) == null || (list = map.get(str)) == null) {
            return null;
        }
        return TextUtils.join(",", list);
    }

    public static JSONObject k(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", str);
        jSONObject2.put("method", str2);
        jSONObject.put("action", jSONObject2);
        return jSONObject;
    }

    public static boolean l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject(MessageExtension.FIELD_DATA);
            if (jSONObject.has("params")) {
                String optString = jSONObject.getJSONObject("params").optString("public_key", null);
                if (TextUtils.isEmpty(optString)) {
                    return false;
                }
                g9.b.c(optString);
                return true;
            }
            return false;
        } catch (JSONException e11) {
            t9.e.d(e11);
            return false;
        }
    }

    public static boolean m(a.b bVar) {
        return Boolean.valueOf(a(bVar, "msp-gzip")).booleanValue();
    }

    public String b(r9.a aVar) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(Kind.DEVICE, Build.MODEL);
        hashMap.put("namespace", "com.alipay.mobilecashier");
        hashMap.put("api_name", "com.alipay.mcpay");
        hashMap.put("api_version", n());
        return d(aVar, hashMap, new HashMap<>());
    }

    public String c(r9.a aVar, String str, JSONObject jSONObject) {
        r9.b e11 = r9.b.e();
        s9.a a11 = s9.a.a(e11.c());
        JSONObject a12 = t9.d.a(new JSONObject(), jSONObject);
        try {
            a12.put("external_info", str);
            a12.put("tid", a11.g());
            a12.put("user_agent", e11.a().b(aVar, a11, o()));
            a12.put("has_alipay", m.w(aVar, e11.c(), a9.a.f355d, false));
            a12.put("has_msp_app", m.a0(e11.c()));
            a12.put("app_key", "2014052600006128");
            a12.put("utdid", e11.d());
            a12.put("new_client_key", a11.f());
            a12.put("pa", g9.b.e(e11.c()));
        } catch (Throwable th2) {
            c9.a.d(aVar, "biz", "BodyErr", th2);
            t9.e.d(th2);
        }
        return a12.toString();
    }

    public String d(r9.a aVar, HashMap<String, String> hashMap, HashMap<String, String> hashMap2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (hashMap != null) {
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
        }
        if (hashMap2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            for (Map.Entry<String, String> entry2 : hashMap2.entrySet()) {
                jSONObject3.put(entry2.getKey(), entry2.getValue());
            }
            jSONObject2.put("params", jSONObject3);
        }
        jSONObject.put(MessageExtension.FIELD_DATA, jSONObject2);
        return jSONObject.toString();
    }

    public Map<String, String> e(boolean z11, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("msp-gzip", String.valueOf(z11));
        hashMap.put("Operation-Type", "alipay.msp.cashier.dispatch.bytes");
        hashMap.put("content-type", "application/octet-stream");
        hashMap.put("Version", "2.0");
        hashMap.put("AppId", "TAOBAO");
        hashMap.put("Msp-Param", a.a(str));
        hashMap.put("des-mode", "CBC");
        return hashMap;
    }

    public b f(r9.a aVar, Context context) {
        return g(aVar, context, "");
    }

    public b g(r9.a aVar, Context context, String str) {
        return h(aVar, context, str, l.a(context));
    }

    public b h(r9.a aVar, Context context, String str, String str2) {
        return i(aVar, context, str, str2, true);
    }

    public b i(r9.a aVar, Context context, String str, String str2, boolean z11) {
        t9.e.f("mspl", "Packet: " + str2);
        c cVar = new c(this.f37123b);
        b bVar = new b(b(aVar), c(aVar, str, j()));
        Map<String, String> e11 = e(false, str);
        d d11 = cVar.d(bVar, this.f37122a, e11.get("iSr"));
        a.b b11 = k9.a.b(context, new a.C0642a(str2, e(d11.b(), str), d11.a()));
        if (b11 != null) {
            b c11 = cVar.c(new d(m(b11), b11.f34504b), e11.get("iSr"));
            return (c11 != null && l(c11.b()) && z11) ? i(aVar, context, str, str2, false) : c11;
        }
        throw new RuntimeException("Response is null.");
    }

    public abstract JSONObject j();

    public String n() {
        return "4.9.0";
    }

    public abstract boolean o();
}