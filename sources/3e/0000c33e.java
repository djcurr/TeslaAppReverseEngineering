package yu;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.tesla.TeslaV4.BuildConfig;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.t;

/* loaded from: classes6.dex */
public class z {

    /* renamed from: e  reason: collision with root package name */
    private static z f59857e;

    /* renamed from: a  reason: collision with root package name */
    private final com.tesla.logging.g f59858a = com.tesla.logging.g.g("TeslaClient");

    /* renamed from: b  reason: collision with root package name */
    private String f59859b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f59860c;

    /* renamed from: d  reason: collision with root package name */
    private js.b f59861d;

    private z(Context context) {
        this.f59860c = context.getApplicationContext();
        G();
        try {
            this.f59859b = "CN".equals(m("REGION")) ? BuildConfig.DEVICE_TYPE_ANDROID_JPUSH : BuildConfig.DEVICE_TYPE_ANDROID_FCM;
            InputStream open = context.getAssets().open("shared/ownerapi_endpoints.json");
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            zu.t.g(new JSONObject(new String(bArr, StandardCharsets.UTF_8)));
        } catch (Exception e11) {
            this.f59858a.f("Failed to initialize environment variables", e11);
        }
    }

    private void G() {
        Context applicationContext = this.f59860c.getApplicationContext();
        js.i iVar = new js.i(applicationContext, new js.f(ct.i.i()));
        this.f59861d = iVar;
        iVar.f33955b = new b0(y.z(applicationContext, (at.f) new t.b().c(a0.h()).g(a0.g(applicationContext, iVar).f()).a(kx.g.a()).b(k80.a.f()).e().b(at.f.class), iVar), ct.i.i());
    }

    private String Y(String str, String str2) {
        return String.format("VEHICLE_%s_%s_LAST_SEEN_BLE", str2, str);
    }

    private String Z(String str) {
        return String.format("VEHICLE_BLE_PUBLIC_KEY_%s", str);
    }

    private String b(String str, String str2) {
        return String.format("VEHICLE_%s_%s_INITIALIZATION_VECTOR", str2, str);
    }

    private String c(String str, String str2) {
        return String.format("VEHICLE_BLE_%s_%s_PERIPHERALS", str2, str);
    }

    private String d(String str) {
        return String.format("VEHICLE_BLE_%s_NAME", str);
    }

    private String e(String str, String str2) {
        return String.format("VEHICLE_%s_%s_CHALLENGE_TOKEN_SUPPORT", str2, str);
    }

    private String f(String str, String str2) {
        return String.format("VEHICLE_%s_%s_WHITELIST_COUNT", str2, str);
    }

    private String g(String str, String str2) {
        return String.format("VEHICLE_%s_%s_WHITELIST_KEYS", str2, str);
    }

    public static Object m(String str) {
        try {
            return BuildConfig.class.getField(str).get(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public static synchronized z p(Context context) {
        z zVar;
        synchronized (z.class) {
            if (f59857e == null) {
                f59857e = new z(context.getApplicationContext());
            }
            zVar = f59857e;
        }
        return zVar;
    }

    public String A() {
        List<String> y11 = y();
        return y11.isEmpty() ? "" : y11.get(0);
    }

    public at.h B() {
        String o11 = b.o(this.f59860c);
        if (o11 != null) {
            try {
                return new at.h(o11);
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public String C(String str) {
        return b.q(d(str), this.f59860c);
    }

    public String D(String str) {
        return b.q(Z(str), this.f59860c);
    }

    public long E(String str, String str2) {
        return b.r(f(str, str2), this.f59860c);
    }

    public Set<String> F(String str, String str2) {
        return b.s(g(str, str2), this.f59860c);
    }

    public void H() {
        ct.i i11 = ct.i.i();
        if (i11.g("SCHEMA_ID") == null) {
            Bundle bundle = new Bundle();
            String a11 = at.a.a(this.f59860c);
            if (a11 != null) {
                bundle.putString("_ACCOUNT_EMAIL", a11);
            }
            String f11 = at.a.f(this.f59860c);
            if (f11 != null) {
                bundle.putString("_KEY_STORE_PASS", f11);
            }
            String i12 = at.a.i(this.f59860c);
            if (i12 != null) {
                bundle.putString("SELECTED_VIN", i12);
            }
            String d11 = d(i12);
            String l11 = at.a.l(d11, this.f59860c);
            if (l11 != null) {
                bundle.putString(d11, l11);
            }
            String j11 = at.a.j(this.f59860c);
            if (j11 != null) {
                bundle.putString("SHARED_SELECTED_PRODUCT_DATA", j11);
            }
            String d12 = at.a.d(this.f59860c);
            if (d12 != null) {
                bundle.putString("_SSO_AUTH_TOKEN", d12);
            }
            String h11 = at.a.h(this.f59860c);
            if (h11 != null) {
                bundle.putString("SELECTED_PRODUCT", h11);
            }
            String k11 = at.a.k(this.f59860c);
            if (k11 != null) {
                bundle.putString("COLORIZED_IMAGE_DIRECTORY_HASH", k11);
            }
            String c11 = at.a.c(this.f59860c);
            if (c11 != null) {
                bundle.putString("APP_UUID", c11);
            }
            String b11 = at.a.b(this.f59860c);
            if (b11 != null) {
                bundle.putString("APP_PREVIOUSLY_LAUNCHED", b11);
            }
            i11.s(bundle);
        }
    }

    public void I(String str) {
        b.t(this.f59860c, str);
    }

    public long J(long j11, String str, String str2) {
        return b.y(j11, b(str, str2), this.f59860c);
    }

    public void K(String str) {
        b.z(str, this.f59860c);
    }

    public void L(String str, String str2, Set<String> set) {
        b.A(c(str, str2), set, this.f59860c);
    }

    public void M(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            try {
                jSONObject.put("id", str);
            } catch (JSONException e11) {
                this.f59858a.f("Failed to insert value into request object", e11);
            }
        }
    }

    public void N(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            try {
                jSONObject.put("type", str);
            } catch (JSONException e11) {
                this.f59858a.f("Failed to insert value into request object", e11);
            }
        }
    }

    public void O(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            try {
                jSONObject.put("vin", str);
            } catch (JSONException e11) {
                this.f59858a.f("Failed to insert value into request object", e11);
            }
        }
    }

    public void P(List<String> list) {
        b.C(list, this.f59860c);
    }

    public boolean Q(String str) {
        String x11;
        String v11;
        List<Pair<String, String>> i11 = i();
        if (i11 != null) {
            com.tesla.logging.g gVar = this.f59858a;
            gVar.i("Looking for the product Id with vin: " + str);
            for (int i12 = 0; i12 < i11.size(); i12++) {
                JSONObject w11 = w((String) i11.get(i12).second);
                if (w11 != null && (x11 = x(w11)) != null && x11.equalsIgnoreCase(str) && (v11 = v(w11)) != null) {
                    JSONObject jSONObject = new JSONObject();
                    M(jSONObject, v11);
                    N(jSONObject, "VEHICLE");
                    O(jSONObject, x11);
                    b.E(jSONObject.toString(), this.f59860c);
                    com.tesla.logging.g gVar2 = this.f59858a;
                    gVar2.i("Saving Selected Product with : " + jSONObject);
                    return true;
                }
            }
        }
        return false;
    }

    public long R(String str, String str2, long j11) {
        return at.g.c().k(Y(str, str2), j11, at.g.j(this.f59860c));
    }

    public void S(String str, String str2) {
        b.F(d(str), str2, this.f59860c);
    }

    public void T(String str, String str2) {
        b.G(Z(str), str2, this.f59860c);
    }

    public void U(String str, String str2, long j11) {
        at.g.c().k(e(str, str2), j11, at.g.j(this.f59860c));
    }

    public void V(String str, String str2, long j11) {
        b.H(j11, f(str, str2), this.f59860c);
    }

    public void W(String str, String str2, Set<String> set) {
        b.I(set, g(str, str2), this.f59860c);
    }

    public long X(String str, String str2) {
        return at.g.c().e(Y(str, str2), at.g.j(this.f59860c));
    }

    public boolean a() {
        String b11 = b.b(this.f59860c);
        String j11 = b.j(this.f59860c);
        int indexOf = j11.indexOf(45);
        return b11 == null || !(b11.equals(j11) || b11.equals(indexOf >= 0 ? j11.substring(0, indexOf) : ""));
    }

    public long a0(String str, String str2) {
        return at.g.c().e(e(str, str2), at.g.j(this.f59860c));
    }

    public String h() {
        return b.a(this.f59860c);
    }

    public List<Pair<String, String>> i() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("STORED_VEHICLE_");
        return ct.i.i().h(arrayList, arrayList2);
    }

    public List<Pair<String, String>> j() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("VEHICLE_BLE_PUBLIC_KEY_");
        return ct.i.i().h(arrayList, arrayList2);
    }

    public String k() {
        return b.c(this.f59860c);
    }

    public js.b l() {
        return this.f59861d;
    }

    public boolean n() {
        return b.f(this.f59860c);
    }

    public long o(String str, String str2) {
        return b.g(b(str, str2), this.f59860c);
    }

    public String q() {
        return b.h(this.f59860c);
    }

    public JSONObject r() {
        return w(b.i(this.f59860c));
    }

    public String s() {
        Locale locale = this.f59860c.getResources().getConfiguration().getLocales().get(0);
        return locale.getLanguage() + "-" + locale.getCountry();
    }

    public String t() {
        return b.d(this.f59860c);
    }

    public Set<String> u(String str, String str2) {
        if (str2 != null && !str2.equals("")) {
            return b.k(c(str, str2), this.f59860c);
        }
        return Collections.emptySet();
    }

    public String v(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.getString("id");
        } catch (JSONException e11) {
            this.f59858a.f("Failed to get product with id string from json file", e11);
            return null;
        }
    }

    public JSONObject w(String str) {
        if (str != null) {
            try {
                return new JSONObject(str);
            } catch (JSONException e11) {
                this.f59858a.f("Failed to get productString from json file", e11);
                return null;
            }
        }
        return null;
    }

    public String x(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.getString("vin");
        } catch (JSONException e11) {
            this.f59858a.f("Failed to get vin string from product json object", e11);
            return null;
        }
    }

    public List<String> y() {
        return b.m(this.f59860c);
    }

    public String z() {
        return this.f59859b;
    }
}