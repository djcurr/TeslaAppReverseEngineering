package r9;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import com.adyen.checkout.components.model.payments.request.Address;
import com.stripe.android.core.networking.AnalyticsFields;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONObject;
import t9.e;
import t9.m;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    public String f49313a;

    /* renamed from: b */
    public String f49314b;

    /* renamed from: c */
    public Context f49315c;

    /* renamed from: d */
    public final String f49316d;

    /* renamed from: e */
    public final long f49317e;

    /* renamed from: f */
    public final int f49318f;

    /* renamed from: g */
    public final String f49319g;

    /* renamed from: h */
    public boolean f49320h = false;

    /* renamed from: i */
    public boolean f49321i = false;

    /* renamed from: j */
    public boolean f49322j = false;

    /* renamed from: k */
    public final ActivityInfo f49323k;

    /* renamed from: l */
    public final c9.b f49324l;

    /* renamed from: r9.a$a */
    /* loaded from: classes.dex */
    public static final class C1076a {

        /* renamed from: a */
        public static final HashMap<UUID, a> f49325a = new HashMap<>();

        /* renamed from: b */
        public static final HashMap<String, a> f49326b = new HashMap<>();

        public static a a(Intent intent) {
            if (intent == null) {
                return null;
            }
            Serializable serializableExtra = intent.getSerializableExtra("i_uuid_b_c");
            if (serializableExtra instanceof UUID) {
                return f49325a.remove((UUID) serializableExtra);
            }
            return null;
        }

        public static a b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return f49326b.remove(str);
        }

        public static void c(a aVar, Intent intent) {
            if (aVar == null || intent == null) {
                return;
            }
            UUID randomUUID = UUID.randomUUID();
            f49325a.put(randomUUID, aVar);
            intent.putExtra("i_uuid_b_c", randomUUID);
        }

        public static void d(a aVar, String str) {
            if (aVar == null || TextUtils.isEmpty(str)) {
                return;
            }
            f49326b.put(str, aVar);
        }
    }

    public a(Context context, String str, String str2) {
        String str3;
        this.f49313a = "";
        this.f49314b = "";
        this.f49315c = null;
        boolean isEmpty = TextUtils.isEmpty(str2);
        this.f49324l = new c9.b(context, isEmpty);
        String j11 = j(str, this.f49314b);
        this.f49316d = j11;
        this.f49317e = SystemClock.elapsedRealtime();
        this.f49318f = m.V();
        ActivityInfo d11 = m.d(context);
        this.f49323k = d11;
        this.f49319g = str2;
        if (!isEmpty) {
            c9.a.c(this, "biz", "eptyp", str2 + "|" + j11);
            if (d11 != null) {
                str3 = d11.name + "|" + d11.launchMode;
            } else {
                str3 = Address.ADDRESS_NULL_PLACEHOLDER;
            }
            c9.a.c(this, "biz", "actInfo", str3);
            c9.a.c(this, "biz", "sys", m.k(this));
            c9.a.c(this, "biz", "sdkv", "1d4833b-clean");
        }
        try {
            this.f49315c = context.getApplicationContext();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.f49313a = packageInfo.versionName;
            this.f49314b = packageInfo.packageName;
        } catch (Exception e11) {
            e.d(e11);
        }
        if (!isEmpty) {
            c9.a.b(this, "biz", "u" + m.V());
            c9.a.c(this, "biz", "PgApiInvoke", "" + SystemClock.elapsedRealtime());
            c9.a.a(context, this, str, this.f49316d);
        }
        if (isEmpty || !g9.a.d().F()) {
            return;
        }
        g9.a.d().l(this, this.f49315c, true, 2);
    }

    private String c(String str, String str2) {
        return str + e(new JSONObject()) + str2;
    }

    private String d(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(str2);
        for (int i11 = 0; i11 < split.length; i11++) {
            if (!TextUtils.isEmpty(split[i11]) && split[i11].startsWith(str3)) {
                return split[i11];
            }
        }
        return null;
    }

    public static HashMap<String, String> f(a aVar) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (aVar != null) {
            hashMap.put("sdk_ver", "15.8.14");
            hashMap.put(AnalyticsFields.APP_NAME, aVar.f49314b);
            hashMap.put("token", aVar.f49316d);
            hashMap.put("call_type", aVar.f49319g);
            hashMap.put("ts_api_invoke", String.valueOf(aVar.f49317e));
            t9.a.d(aVar, hashMap);
        }
        return hashMap;
    }

    private String i(String str) {
        return e(new JSONObject(str));
    }

    public static String j(String str, String str2) {
        try {
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[4];
            if (str == null) {
                str = "";
            }
            objArr[0] = str;
            if (str2 == null) {
                str2 = "";
            }
            objArr[1] = str2;
            objArr[2] = Long.valueOf(System.currentTimeMillis());
            objArr[3] = UUID.randomUUID().toString();
            return String.format("EP%s%s_%s", "1", m.X(String.format(locale, "%s%s%d%s", objArr)), Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable unused) {
            return "-";
        }
    }

    private String k(String str, String str2, String str3) {
        JSONObject jSONObject;
        String substring = str.substring(str2.length());
        boolean z11 = false;
        String substring2 = substring.substring(0, substring.length() - str3.length());
        if (substring2.length() >= 2 && substring2.startsWith("\"") && substring2.endsWith("\"")) {
            jSONObject = new JSONObject(substring2.substring(1, substring2.length() - 1));
            z11 = true;
        } else {
            jSONObject = new JSONObject(substring2);
        }
        String e11 = e(jSONObject);
        if (z11) {
            e11 = "\"" + e11 + "\"";
        }
        return str2 + e11 + str3;
    }

    private String n(String str) {
        try {
            String d11 = d(str, "&", "bizcontext=");
            if (TextUtils.isEmpty(d11)) {
                str = str + "&" + c("bizcontext=", "");
            } else {
                int indexOf = str.indexOf(d11);
                str = str.substring(0, indexOf) + k(d11, "bizcontext=", "") + str.substring(indexOf + d11.length());
            }
        } catch (Throwable th2) {
            c9.a.e(this, "biz", "fmt1", th2, str);
        }
        return str;
    }

    private String p(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str.substring(19));
            jSONObject.put("bizcontext", i(jSONObject.optString("bizcontext")));
            return "new_external_info==" + jSONObject.toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    private String r(String str) {
        try {
            String d11 = d(str, "\"&", "bizcontext=\"");
            if (TextUtils.isEmpty(d11)) {
                return str + "&" + c("bizcontext=\"", "\"");
            }
            if (!d11.endsWith("\"")) {
                d11 = d11 + "\"";
            }
            int indexOf = str.indexOf(d11);
            return str.substring(0, indexOf) + k(d11, "bizcontext=\"", "\"") + str.substring(indexOf + d11.length());
        } catch (Throwable th2) {
            c9.a.e(this, "biz", "fmt2", th2, str);
            return str;
        }
    }

    private boolean u(String str) {
        return !str.contains("\"&");
    }

    private JSONObject v() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ap_link_token", this.f49316d);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static a w() {
        return null;
    }

    public Context a() {
        return this.f49315c;
    }

    public String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.startsWith("new_external_info==")) {
            return p(str);
        }
        if (u(str)) {
            return n(str);
        }
        return r(str);
    }

    public String e(JSONObject jSONObject) {
        String str;
        try {
            if (!jSONObject.has("appkey")) {
                jSONObject.put("appkey", "2014052600006128");
            }
            if (!jSONObject.has("ty")) {
                jSONObject.put("ty", "and_lite");
            }
            if (!jSONObject.has("sv")) {
                jSONObject.put("sv", "h.a.3.8.14");
            }
            if (!jSONObject.has("an")) {
                jSONObject.put("an", this.f49314b);
            }
            if (!jSONObject.has("av")) {
                jSONObject.put("av", this.f49313a);
            }
            if (!jSONObject.has("sdk_start_time")) {
                jSONObject.put("sdk_start_time", System.currentTimeMillis());
            }
            if (!jSONObject.has("extInfo")) {
                jSONObject.put("extInfo", v());
            }
            if (!jSONObject.has("act_info")) {
                if (this.f49323k != null) {
                    str = this.f49323k.name + "|" + this.f49323k.launchMode;
                } else {
                    str = Address.ADDRESS_NULL_PLACEHOLDER;
                }
                jSONObject.put("act_info", str);
            }
            return jSONObject.toString();
        } catch (Throwable th2) {
            c9.a.e(this, "biz", "fmt3", th2, String.valueOf(jSONObject));
            e.d(th2);
            return jSONObject != null ? jSONObject.toString() : "{}";
        }
    }

    public void g(boolean z11) {
        this.f49321i = z11;
    }

    public String h() {
        return this.f49314b;
    }

    public void l(boolean z11) {
        this.f49320h = z11;
    }

    public String m() {
        return this.f49313a;
    }

    public void o(boolean z11) {
        this.f49322j = z11;
    }

    public boolean q() {
        return this.f49321i;
    }

    public boolean s() {
        return this.f49320h;
    }

    public boolean t() {
        return this.f49322j;
    }
}