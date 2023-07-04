package yu;

import android.content.Context;
import com.tesla.data.oapi.OwnerApiEndpoint;
import com.tesla.logging.TeslaLog;
import com.tesla.temp.RemoteLogWorker;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;
import wz.s0;

/* loaded from: classes6.dex */
public final class m {

    /* renamed from: c */
    public static final a f59801c = new a(null);

    /* renamed from: d */
    private static volatile m f59802d;

    /* renamed from: a */
    private final Context f59803a;

    /* renamed from: b */
    private final Deque<Map<String, Object>> f59804b;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JSONArray d(List<?> list) {
            JSONArray jSONArray = new JSONArray();
            for (Object obj : list) {
                if (obj instanceof Integer) {
                    jSONArray.put(((Number) obj).intValue());
                } else if (obj instanceof Boolean) {
                    jSONArray.put(((Boolean) obj).booleanValue());
                } else if (obj instanceof Long) {
                    jSONArray.put(((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    jSONArray.put(((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    jSONArray.put(obj);
                } else if (obj instanceof List) {
                    jSONArray.put(m.f59801c.d((List) obj));
                } else if (obj instanceof Map) {
                    a aVar = m.f59801c;
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
                    jSONArray.put(aVar.e((Map) obj));
                } else {
                    jSONArray.put(obj);
                }
            }
            return jSONArray;
        }

        private final JSONObject e(Map<String, ?> map) {
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                for (Map.Entry<String, ?> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof List) {
                        jSONObject.put(key, m.f59801c.d((List) value));
                    } else if (value instanceof Map) {
                        a aVar = m.f59801c;
                        Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
                        jSONObject.put(key, aVar.e((Map) value));
                    } else {
                        jSONObject.put(key, value);
                    }
                }
            }
            return jSONObject;
        }

        public final m b(Context context) {
            kotlin.jvm.internal.s.g(context, "context");
            if (m.f59802d == null) {
                synchronized (this) {
                    if (m.f59802d == null) {
                        a aVar = m.f59801c;
                        m.f59802d = new m(context, null);
                    }
                    vz.b0 b0Var = vz.b0.f54756a;
                }
            }
            m mVar = m.f59802d;
            kotlin.jvm.internal.s.e(mVar);
            return mVar;
        }

        public final OwnerApiEndpoint c(Context context) {
            kotlin.jvm.internal.s.g(context, "context");
            OwnerApiEndpoint c11 = com.tesla.data.oapi.h.f21733b.a(context).c("SPLUNK_TELEMETRY");
            kotlin.jvm.internal.s.e(c11);
            return c11;
        }
    }

    /* loaded from: classes6.dex */
    public static final class b {

        /* renamed from: a */
        private final String f59805a;

        /* renamed from: b */
        private final String f59806b;

        /* renamed from: c */
        private final String f59807c;

        /* renamed from: d */
        private final String f59808d;

        /* loaded from: classes6.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new a(null);
        }

        public b(String id2, String vin, String carVersion) {
            kotlin.jvm.internal.s.g(id2, "id");
            kotlin.jvm.internal.s.g(vin, "vin");
            kotlin.jvm.internal.s.g(carVersion, "carVersion");
            this.f59805a = id2;
            this.f59806b = vin;
            this.f59807c = carVersion;
            char charAt = vin.charAt(3);
            this.f59808d = "model" + charAt;
        }

        public final String a() {
            return this.f59807c;
        }

        public final String b() {
            return this.f59808d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return kotlin.jvm.internal.s.c(this.f59805a, bVar.f59805a) && kotlin.jvm.internal.s.c(this.f59806b, bVar.f59806b) && kotlin.jvm.internal.s.c(this.f59807c, bVar.f59807c);
            }
            return false;
        }

        public int hashCode() {
            return (((this.f59805a.hashCode() * 31) + this.f59806b.hashCode()) * 31) + this.f59807c.hashCode();
        }

        public String toString() {
            String str = this.f59805a;
            String str2 = this.f59806b;
            String str3 = this.f59807c;
            return "VehicleInfo(id=" + str + ", vin=" + str2 + ", carVersion=" + str3 + ")";
        }
    }

    private m(Context context) {
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.s.f(applicationContext, "context.applicationContext");
        this.f59803a = applicationContext;
        this.f59804b = new ArrayDeque();
    }

    public /* synthetic */ m(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    public static /* synthetic */ vz.b0 a(Map map, boolean z11, m mVar) {
        return e(map, z11, mVar);
    }

    public static final vz.b0 e(Map data, boolean z11, m this$0) {
        Map<String, Object> p11;
        List d11;
        kotlin.jvm.internal.s.g(data, "$data");
        kotlin.jvm.internal.s.g(this$0, "this$0");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String p12 = yu.b.p(this$0.f59803a);
        kotlin.jvm.internal.s.f(p12, "getTeslaUserAgent(appContext)");
        linkedHashMap.put("user_agent", p12);
        linkedHashMap.put("platform", "android");
        linkedHashMap.put("conn_type", zu.y.f60801a.a(this$0.f59803a));
        linkedHashMap.put("locale", zu.v.f60791a.a(this$0.f59803a));
        Object obj = data.get("id");
        String str = obj instanceof String ? (String) obj : null;
        if (str != null) {
            try {
                b g11 = this$0.g(this$0.f59803a, str);
                linkedHashMap.put("product_type", g11.b());
                linkedHashMap.put("product_firmware", g11.a());
            } catch (Exception e11) {
                TeslaLog.INSTANCE.e("RemoteLog", "Failed to set additional data", e11);
            }
        }
        p11 = s0.p(data, linkedHashMap);
        if (z11) {
            synchronized (this$0.f59804b) {
                this$0.f59804b.add(p11);
                if (this$0.f59804b.size() >= 20) {
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < 20; i11++) {
                        Map<String, Object> remove = this$0.f59804b.remove();
                        kotlin.jvm.internal.s.f(remove, "logs.remove()");
                        arrayList.add(remove);
                    }
                    RemoteLogWorker.f21980d.b(this$0.f59803a, f59801c.d(arrayList));
                }
                vz.b0 b0Var = vz.b0.f54756a;
            }
        } else {
            RemoteLogWorker.a aVar = RemoteLogWorker.f21980d;
            Context context = this$0.f59803a;
            a aVar2 = f59801c;
            d11 = wz.v.d(p11);
            aVar.b(context, aVar2.d(d11));
        }
        return vz.b0.f54756a;
    }

    public static final m f(Context context) {
        return f59801c.b(context);
    }

    private final b g(Context context, String str) {
        ct.i i11 = ct.i.i();
        String g11 = i11.g("V_" + str);
        try {
            if (g11 != null) {
                JSONObject jSONObject = new JSONObject(g11);
                JSONObject jSONObject2 = jSONObject.getJSONObject("vehicle_state");
                String string = jSONObject.getString("vin");
                String string2 = jSONObject.getString("id");
                String string3 = jSONObject2.getString("car_version");
                kotlin.jvm.internal.s.f(string2, "getString(\"id\")");
                kotlin.jvm.internal.s.f(string, "getString(\"vin\")");
                kotlin.jvm.internal.s.f(string3, "getString(\"car_version\")");
                return new b(string2, string, string3);
            }
            throw new IllegalStateException("Failed to build vehicle information");
        } catch (Exception e11) {
            throw new IllegalStateException("Failed to build vehicle information", e11);
        }
    }

    public final void d(final Map<String, ? extends Object> data, final boolean z11) {
        kotlin.jvm.internal.s.g(data, "data");
        hy.m.l(new Callable() { // from class: yu.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return m.a(data, z11, this);
            }
        }).w(bz.a.c()).s();
    }
}