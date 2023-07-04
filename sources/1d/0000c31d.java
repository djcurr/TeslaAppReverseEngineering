package yu;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lt.w2;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static final a f59783c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    private static final com.tesla.logging.g f59784d = com.tesla.logging.g.f21878b.a("GetVehicleData");

    /* renamed from: a  reason: collision with root package name */
    private final ct.i f59785a;

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentHashMap<String, String> f59786b;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            ct.i i11 = ct.i.i();
            kotlin.jvm.internal.s.f(i11, "getDB()");
            return new e(i11, null);
        }
    }

    private e(ct.i iVar) {
        this.f59785a = iVar;
        this.f59786b = new ConcurrentHashMap<>();
    }

    public /* synthetic */ e(ct.i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar);
    }

    private final JSONObject c() {
        String g11 = this.f59785a.g("persist:vehicleList");
        if (g11 == null) {
            return null;
        }
        return new JSONObject(new JSONObject(g11).optString("byId"));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d A[Catch: Exception -> 0x0063, TRY_LEAVE, TryCatch #0 {Exception -> 0x0063, blocks: (B:3:0x0006, B:5:0x001f, B:7:0x0030, B:14:0x003d, B:17:0x004b, B:20:0x0056, B:23:0x005d), top: B:27:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final lt.w2 a(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "id"
            kotlin.jvm.internal.s.g(r6, r0)
            r1 = 0
            ct.i r2 = r5.f59785a     // Catch: java.lang.Exception -> L63
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L63
            r3.<init>()     // Catch: java.lang.Exception -> L63
            java.lang.String r4 = "V_"
            r3.append(r4)     // Catch: java.lang.Exception -> L63
            r3.append(r6)     // Catch: java.lang.Exception -> L63
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L63
            java.lang.String r2 = r2.g(r3)     // Catch: java.lang.Exception -> L63
            if (r2 != 0) goto L2e
            com.tesla.logging.g r2 = yu.e.f59784d     // Catch: java.lang.Exception -> L63
            java.lang.String r3 = "Failed to find vehicle by direct `V_{id}` lookup, trying selected vehicle..."
            r2.i(r3)     // Catch: java.lang.Exception -> L63
            ct.i r2 = r5.f59785a     // Catch: java.lang.Exception -> L63
            java.lang.String r3 = "SELECTED_PRODUCT"
            java.lang.String r2 = r2.g(r3)     // Catch: java.lang.Exception -> L63
        L2e:
            if (r2 == 0) goto L39
            boolean r3 = kotlin.text.m.w(r2)     // Catch: java.lang.Exception -> L63
            if (r3 == 0) goto L37
            goto L39
        L37:
            r3 = 0
            goto L3a
        L39:
            r3 = 1
        L3a:
            if (r3 == 0) goto L3d
            return r1
        L3d:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L63
            r3.<init>(r2)     // Catch: java.lang.Exception -> L63
            du.j r2 = du.j.f24245a     // Catch: java.lang.Exception -> L63
            lt.w2 r2 = r2.d(r3)     // Catch: java.lang.Exception -> L63
            if (r2 != 0) goto L4b
            goto L63
        L4b:
            java.lang.String r0 = r3.optString(r0)     // Catch: java.lang.Exception -> L63
            boolean r0 = kotlin.jvm.internal.s.c(r0, r6)     // Catch: java.lang.Exception -> L63
            if (r0 != 0) goto L56
            goto L63
        L56:
            java.lang.String r0 = et.a.p(r2)     // Catch: java.lang.Exception -> L63
            if (r0 != 0) goto L5d
            goto L62
        L5d:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r3 = r5.f59786b     // Catch: java.lang.Exception -> L63
            r3.put(r6, r0)     // Catch: java.lang.Exception -> L63
        L62:
            r1 = r2
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yu.e.a(java.lang.String):lt.w2");
    }

    public final JSONObject b(String id2) {
        kotlin.jvm.internal.s.g(id2, "id");
        JSONObject c11 = c();
        if (c11 == null) {
            return null;
        }
        return c11.optJSONObject(id2);
    }

    public final String d(String id2) {
        kotlin.jvm.internal.s.g(id2, "id");
        String str = this.f59786b.get(id2);
        if (str == null) {
            w2 a11 = a(id2);
            if (a11 == null) {
                return null;
            }
            return et.a.p(a11);
        }
        return str;
    }
}