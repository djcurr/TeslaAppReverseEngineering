package g9;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t9.e;
import t9.i;
import t9.m;

/* loaded from: classes.dex */
public final class a {
    public static a E;
    public JSONObject A;

    /* renamed from: a  reason: collision with root package name */
    public int f27856a = 10000;

    /* renamed from: b  reason: collision with root package name */
    public boolean f27857b = false;

    /* renamed from: c  reason: collision with root package name */
    public String f27858c = "https://h5.m.taobao.com/mlapp/olist.html";

    /* renamed from: d  reason: collision with root package name */
    public int f27859d = 10;

    /* renamed from: e  reason: collision with root package name */
    public boolean f27860e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f27861f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f27862g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f27863h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f27864i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f27865j = true;

    /* renamed from: k  reason: collision with root package name */
    public boolean f27866k = true;

    /* renamed from: l  reason: collision with root package name */
    public String f27867l = "";

    /* renamed from: m  reason: collision with root package name */
    public boolean f27868m = false;

    /* renamed from: n  reason: collision with root package name */
    public boolean f27869n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f27870o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f27871p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f27872q = true;

    /* renamed from: r  reason: collision with root package name */
    public String f27873r = "";

    /* renamed from: s  reason: collision with root package name */
    public String f27874s = "";

    /* renamed from: t  reason: collision with root package name */
    public boolean f27875t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f27876u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f27877v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f27878w = false;

    /* renamed from: x  reason: collision with root package name */
    public boolean f27879x = false;

    /* renamed from: y  reason: collision with root package name */
    public int f27880y = 1000;

    /* renamed from: z  reason: collision with root package name */
    public boolean f27881z = false;
    public boolean B = true;
    public List<b> C = null;
    public int D = -1;

    /* renamed from: g9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0527a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ r9.a f27882a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f27883b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f27884c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f27885d;

        public RunnableC0527a(r9.a aVar, Context context, boolean z11, int i11) {
            this.f27882a = aVar;
            this.f27883b = context;
            this.f27884c = z11;
            this.f27885d = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                l9.b f11 = new n9.b().f(this.f27882a, this.f27883b);
                if (f11 != null) {
                    a.this.m(this.f27882a, f11.a());
                    a.this.k(r9.a.w());
                    r9.a aVar = this.f27882a;
                    c9.a.b(aVar, "biz", "offcfg|" + this.f27884c + "|" + this.f27885d);
                }
            } catch (Throwable th2) {
                e.d(th2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f27887a;

        /* renamed from: b  reason: collision with root package name */
        public final int f27888b;

        /* renamed from: c  reason: collision with root package name */
        public final String f27889c;

        public b(String str, int i11, String str2) {
            this.f27887a = str;
            this.f27888b = i11;
            this.f27889c = str2;
        }

        public static b a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            return new b(jSONObject.optString("pn"), jSONObject.optInt("v", 0), jSONObject.optString("pk"));
        }

        public static List<b> b(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                b a11 = a(jSONArray.optJSONObject(i11));
                if (a11 != null) {
                    arrayList.add(a11);
                }
            }
            return arrayList;
        }

        public static JSONArray c(List<b> list) {
            if (list == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (b bVar : list) {
                jSONArray.put(d(bVar));
            }
            return jSONArray;
        }

        public static JSONObject d(b bVar) {
            if (bVar == null) {
                return null;
            }
            try {
                return new JSONObject().put("pn", bVar.f27887a).put("v", bVar.f27888b).put("pk", bVar.f27889c);
            } catch (JSONException e11) {
                e.d(e11);
                return null;
            }
        }

        public String toString() {
            return String.valueOf(d(this));
        }
    }

    private int c() {
        return this.f27880y;
    }

    public static a d() {
        if (E == null) {
            a aVar = new a();
            E = aVar;
            aVar.G();
        }
        return E;
    }

    private JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timeout", x());
        jSONObject.put("h5_port_degrade", L());
        jSONObject.put("tbreturl", E());
        jSONObject.put("configQueryInterval", q());
        jSONObject.put("launchAppSwitch", b.c(y()));
        jSONObject.put("scheme_pay_2", v());
        jSONObject.put("intercept_batch", u());
        jSONObject.put("deg_log_mcgw", r());
        jSONObject.put("deg_start_srv_first", s());
        jSONObject.put("prev_jump_dual", z());
        jSONObject.put("use_sc_only", t());
        jSONObject.put("bind_use_imp", o());
        jSONObject.put("retry_bnd_once", A());
        jSONObject.put("skip_trans", C());
        jSONObject.put("start_trans", b());
        jSONObject.put("up_before_pay", F());
        jSONObject.put("use_sc_lck_a", B());
        jSONObject.put("lck_k", w());
        jSONObject.put("bind_with_startActivity", p());
        jSONObject.put("startActivity_InsteadOf_Scheme", D());
        jSONObject.put("retry_aidl_activity_not_start", a());
        jSONObject.put("cfg_max_time", c());
        jSONObject.put("get_oa_id", K());
        jSONObject.put("notifyFailApp", I());
        jSONObject.put("enableStartActivityFallback", J());
        jSONObject.put("enableBindExFallback", H());
        jSONObject.put("startactivity_in_ui_thread", M());
        jSONObject.put("ap_args", f());
        return jSONObject;
    }

    private void i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            j(new JSONObject(str));
        } catch (Throwable th2) {
            e.d(th2);
        }
    }

    private void j(JSONObject jSONObject) {
        this.f27856a = jSONObject.optInt("timeout", 10000);
        this.f27857b = jSONObject.optBoolean("h5_port_degrade", false);
        this.f27858c = jSONObject.optString("tbreturl", "https://h5.m.taobao.com/mlapp/olist.html").trim();
        this.f27859d = jSONObject.optInt("configQueryInterval", 10);
        this.C = b.b(jSONObject.optJSONArray("launchAppSwitch"));
        this.f27860e = jSONObject.optBoolean("scheme_pay_2", false);
        this.f27861f = jSONObject.optBoolean("intercept_batch", true);
        this.f27864i = jSONObject.optBoolean("deg_log_mcgw", false);
        this.f27865j = jSONObject.optBoolean("deg_start_srv_first", true);
        this.f27866k = jSONObject.optBoolean("prev_jump_dual", true);
        this.f27867l = jSONObject.optString("use_sc_only", "");
        this.f27868m = jSONObject.optBoolean("bind_use_imp", false);
        this.f27869n = jSONObject.optBoolean("retry_bnd_once", false);
        this.f27870o = jSONObject.optBoolean("skip_trans", false);
        this.f27871p = jSONObject.optBoolean("start_trans", false);
        this.f27872q = jSONObject.optBoolean("up_before_pay", true);
        this.f27873r = jSONObject.optString("lck_k", "");
        this.f27878w = jSONObject.optBoolean("use_sc_lck_a", false);
        this.f27879x = jSONObject.optBoolean("retry_aidl_activity_not_start", false);
        this.f27881z = jSONObject.optBoolean("notifyFailApp", false);
        this.f27874s = jSONObject.optString("bind_with_startActivity", "");
        this.f27875t = jSONObject.optBoolean("startActivity_InsteadOf_Scheme", false);
        this.f27880y = jSONObject.optInt("cfg_max_time", 1000);
        this.B = jSONObject.optBoolean("get_oa_id", true);
        this.f27876u = jSONObject.optBoolean("enableStartActivityFallback", false);
        this.f27877v = jSONObject.optBoolean("enableBindExFallback", false);
        this.f27862g = jSONObject.optBoolean("startactivity_in_ui_thread", false);
        this.A = jSONObject.optJSONObject("ap_args");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(r9.a aVar) {
        try {
            JSONObject e11 = e();
            i.c(aVar, r9.b.e().c(), "alipay_cashier_dynamic_config", e11.toString());
        } catch (Exception e12) {
            e.d(e12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(r9.a aVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("st_sdk_config");
            t9.a.e(aVar, optJSONObject, t9.a.b(aVar, jSONObject));
            if (optJSONObject != null) {
                j(optJSONObject);
            } else {
                e.i("DynCon", "empty config");
            }
        } catch (Throwable th2) {
            e.d(th2);
        }
    }

    public boolean A() {
        return this.f27869n;
    }

    public boolean B() {
        return this.f27878w;
    }

    public boolean C() {
        return this.f27870o;
    }

    public boolean D() {
        return this.f27875t;
    }

    public String E() {
        return this.f27858c;
    }

    public boolean F() {
        return this.f27872q;
    }

    public void G() {
        Context c11 = r9.b.e().c();
        String b11 = i.b(r9.a.w(), c11, "alipay_cashier_dynamic_config", null);
        try {
            this.D = Integer.parseInt(i.b(r9.a.w(), c11, "utdid_factor", "-1"));
        } catch (Exception unused) {
        }
        i(b11);
    }

    public boolean H() {
        return this.f27877v;
    }

    public boolean I() {
        return this.f27881z;
    }

    public boolean J() {
        return this.f27876u;
    }

    public boolean K() {
        return this.B;
    }

    public boolean L() {
        return this.f27857b;
    }

    public boolean M() {
        return this.f27862g;
    }

    public boolean a() {
        return this.f27879x;
    }

    public boolean b() {
        return this.f27871p;
    }

    public JSONObject f() {
        return this.A;
    }

    public void l(r9.a aVar, Context context, boolean z11, int i11) {
        c9.a.b(aVar, "biz", "oncfg|" + z11 + "|" + i11);
        RunnableC0527a runnableC0527a = new RunnableC0527a(aVar, context, z11, i11);
        if (z11 && !m.Z()) {
            int c11 = c();
            if (m.u(c11, runnableC0527a, "AlipayDCPBlok")) {
                return;
            }
            c9.a.h(aVar, "biz", "LogAppFetchConfigTimeout", "" + c11);
            return;
        }
        Thread thread = new Thread(runnableC0527a);
        thread.setName("AlipayDCP");
        thread.start();
    }

    public boolean n(Context context, int i11) {
        if (this.D == -1) {
            this.D = m.a();
            i.c(r9.a.w(), context, "utdid_factor", String.valueOf(this.D));
        }
        return this.D < i11;
    }

    public boolean o() {
        return this.f27868m;
    }

    public String p() {
        return this.f27874s;
    }

    public int q() {
        return this.f27859d;
    }

    public boolean r() {
        return this.f27864i;
    }

    public boolean s() {
        return this.f27865j;
    }

    public String t() {
        return this.f27867l;
    }

    public boolean u() {
        return this.f27861f;
    }

    public boolean v() {
        return this.f27860e;
    }

    public String w() {
        return this.f27873r;
    }

    public int x() {
        int i11 = this.f27856a;
        if (i11 >= 1000 && i11 <= 20000) {
            e.f("DynCon", "time = " + this.f27856a);
            return this.f27856a;
        }
        e.f("DynCon", "time(def) = 10000");
        return 10000;
    }

    public List<b> y() {
        return this.C;
    }

    public boolean z() {
        return this.f27866k;
    }
}