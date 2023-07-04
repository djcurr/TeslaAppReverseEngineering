package cv;

import com.tesla.data.oapi.k;
import com.tesla.widget.data.OwnerApiErrorException;
import hy.m;
import hy.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import lt.w2;
import mt.o;
import org.json.JSONArray;
import org.json.JSONObject;
import vz.b0;
import wz.w;

/* loaded from: classes6.dex */
public final class h implements i {

    /* renamed from: f */
    public static final a f23125f = new a(null);

    /* renamed from: g */
    private static final List<bv.c> f23126g;

    /* renamed from: a */
    private final ct.i f23127a;

    /* renamed from: b */
    private final js.b f23128b;

    /* renamed from: c */
    private final com.tesla.data.oapi.h f23129c;

    /* renamed from: d */
    private final yu.f f23130d;

    /* renamed from: e */
    private final ConcurrentHashMap<String, cu.b> f23131e;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<bv.c> a() {
            return h.f23126g;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.tesla.widget.data.TeslaVehicleRepository", f = "TeslaVehicleRepository.kt", l = {99, 101, 103}, m = "getVehicle")
    /* loaded from: classes6.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        Object f23132a;

        /* renamed from: b */
        Object f23133b;

        /* renamed from: c */
        boolean f23134c;

        /* renamed from: d */
        /* synthetic */ Object f23135d;

        /* renamed from: f */
        int f23137f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(zz.d<? super b> dVar) {
            super(dVar);
            h.this = r1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23135d = obj;
            this.f23137f |= Integer.MIN_VALUE;
            return h.this.i(null, false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.tesla.widget.data.TeslaVehicleRepository", f = "TeslaVehicleRepository.kt", l = {120, 122}, m = "migrateVehicle")
    /* loaded from: classes6.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        Object f23138a;

        /* renamed from: b */
        /* synthetic */ Object f23139b;

        /* renamed from: d */
        int f23141d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(zz.d<? super c> dVar) {
            super(dVar);
            h.this = r1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23139b = obj;
            this.f23141d |= Integer.MIN_VALUE;
            return h.this.k(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.tesla.widget.data.TeslaVehicleRepository", f = "TeslaVehicleRepository.kt", l = {196}, m = "requestVehicleData")
    /* loaded from: classes6.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        /* synthetic */ Object f23142a;

        /* renamed from: c */
        int f23144c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(zz.d<? super d> dVar) {
            super(dVar);
            h.this = r1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23142a = obj;
            this.f23144c |= Integer.MIN_VALUE;
            return h.this.w(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.tesla.widget.data.TeslaVehicleRepository", f = "TeslaVehicleRepository.kt", l = {261}, m = "requestVehicleList")
    /* loaded from: classes6.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        /* synthetic */ Object f23145a;

        /* renamed from: c */
        int f23147c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(zz.d<? super e> dVar) {
            super(dVar);
            h.this = r1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23145a = obj;
            this.f23147c |= Integer.MIN_VALUE;
            return h.this.A(this);
        }
    }

    static {
        List<bv.c> l11;
        l11 = w.l(bv.c.LOCK, bv.c.CLIMATE_TOGGLE, bv.c.CHARGE_PORT, bv.c.FRUNK);
        f23126g = l11;
    }

    public h(ct.i realmHelper, js.b authRepository, com.tesla.data.oapi.h ownerApiEndpoints, yu.f ownerApiSender) {
        s.g(realmHelper, "realmHelper");
        s.g(authRepository, "authRepository");
        s.g(ownerApiEndpoints, "ownerApiEndpoints");
        s.g(ownerApiSender, "ownerApiSender");
        this.f23127a = realmHelper;
        this.f23128b = authRepository;
        this.f23129c = ownerApiEndpoints;
        this.f23130d = ownerApiSender;
        j.f23148a.a(realmHelper);
        this.f23131e = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A(zz.d<? super java.util.List<com.tesla.domain.model.Vehicle>> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof cv.h.e
            if (r0 == 0) goto L13
            r0 = r13
            cv.h$e r0 = (cv.h.e) r0
            int r1 = r0.f23147c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23147c = r1
            goto L18
        L13:
            cv.h$e r0 = new cv.h$e
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f23145a
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f23147c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r13)
            goto L6a
        L29:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L31:
            vz.r.b(r13)
            com.tesla.data.oapi.h r13 = r12.f23129c
            java.lang.String r2 = "PRODUCT_LIST"
            com.tesla.data.oapi.OwnerApiEndpoint r13 = r13.c(r2)
            kotlin.jvm.internal.s.e(r13)
            yu.f r4 = r12.f23130d
            com.tesla.data.HttpMethodType r5 = r13.getMethod()
            java.lang.String r6 = r13.getUri()
            r7 = 0
            boolean r8 = r13.isAuthenticated()
            r9 = 0
            r10 = 20
            r11 = 0
            hy.m r13 = yu.f.a.a(r4, r5, r6, r7, r8, r9, r10, r11)
            cv.g r2 = new ky.h() { // from class: cv.g
                static {
                    /*
                        cv.g r0 = new cv.g
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:cv.g) cv.g.a cv.g
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: cv.g.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: cv.g.<init>():void");
                }

                @Override // ky.h
                public final java.lang.Object apply(java.lang.Object r1) {
                    /*
                        r0 = this;
                        com.tesla.data.oapi.k r1 = (com.tesla.data.oapi.k) r1
                        java.util.List r1 = cv.h.p(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: cv.g.apply(java.lang.Object):java.lang.Object");
                }
            }
            hy.m r13 = r13.o(r2)
            java.lang.String r2 = "ownerApiSender.execute(\n…      }\n        }\n      }"
            kotlin.jvm.internal.s.f(r13, r2)
            r0.f23147c = r3
            java.lang.Object r13 = a30.a.a(r13, r0)
            if (r13 != r1) goto L6a
            return r1
        L6a:
            java.lang.String r0 = "ownerApiSender.execute(\n… }\n      }\n      .await()"
            kotlin.jvm.internal.s.f(r13, r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: cv.h.A(zz.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0062, code lost:
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tesla.domain.model.Vehicle");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List B(com.tesla.data.oapi.k r8) {
        /*
            com.tesla.data.oapi.f r0 = r8.b()
            if (r0 != 0) goto L87
            org.json.JSONObject r8 = r8.e()
            if (r8 != 0) goto Le
            r8 = 0
            goto L14
        Le:
            java.lang.String r0 = "response"
            org.json.JSONArray r8 = r8.getJSONArray(r0)
        L14:
            if (r8 != 0) goto L1b
            java.util.List r8 = wz.u.i()
            return r8
        L1b:
            r0 = 1
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> L68
            r1.<init>()     // Catch: java.lang.Exception -> L68
            int r2 = r8.length()     // Catch: java.lang.Exception -> L68
            if (r2 <= 0) goto L85
            r3 = 0
            r4 = r3
        L29:
            int r5 = r4 + 1
            org.json.JSONObject r4 = r8.getJSONObject(r4)     // Catch: java.lang.Exception -> L68
            if (r4 != 0) goto L33
        L31:
            r6 = r3
            goto L3c
        L33:
            java.lang.String r6 = "vehicle_id"
            boolean r6 = r4.has(r6)     // Catch: java.lang.Exception -> L68
            if (r6 != r0) goto L31
            r6 = r0
        L3c:
            if (r6 == 0) goto L63
            java.lang.String r6 = "type"
            java.lang.String r7 = "VEHICLE"
            r4.put(r6, r7)     // Catch: java.lang.Exception -> L68
            ft.a r6 = ft.a.f27026a     // Catch: java.lang.Exception -> L68
            com.squareup.moshi.f r6 = r6.b()     // Catch: java.lang.Exception -> L68
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L68
            java.lang.Object r4 = r6.c(r4)     // Catch: java.lang.Exception -> L68
            if (r4 == 0) goto L5b
            com.tesla.domain.model.Vehicle r4 = (com.tesla.domain.model.Vehicle) r4     // Catch: java.lang.Exception -> L68
            r1.add(r4)     // Catch: java.lang.Exception -> L68
            goto L63
        L5b:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L68
            java.lang.String r1 = "null cannot be cast to non-null type com.tesla.domain.model.Vehicle"
            r8.<init>(r1)     // Catch: java.lang.Exception -> L68
            throw r8     // Catch: java.lang.Exception -> L68
        L63:
            if (r5 < r2) goto L66
            goto L85
        L66:
            r4 = r5
            goto L29
        L68:
            r8 = move-exception
            boolean r1 = r8 instanceof org.json.JSONException
            if (r1 == 0) goto L6f
            r1 = r0
            goto L71
        L6f:
            boolean r1 = r8 instanceof com.squareup.moshi.JsonDataException
        L71:
            if (r1 == 0) goto L74
            goto L76
        L74:
            boolean r0 = r8 instanceof com.squareup.moshi.JsonEncodingException
        L76:
            if (r0 == 0) goto L86
            com.tesla.logging.g r0 = av.a.a()
            java.lang.String r1 = "JSON error occurs"
            r0.d(r1, r8)
            java.util.List r1 = wz.u.i()
        L85:
            return r1
        L86:
            throw r8
        L87:
            com.tesla.widget.data.OwnerApiErrorException r8 = new com.tesla.widget.data.OwnerApiErrorException
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: cv.h.B(com.tesla.data.oapi.k):java.util.List");
    }

    public static /* synthetic */ cu.a n(h hVar, cu.a aVar, k kVar) {
        return x(hVar, aVar, kVar);
    }

    public static /* synthetic */ q o(cu.a aVar, Throwable th2) {
        return y(aVar, th2);
    }

    public static /* synthetic */ List p(k kVar) {
        return B(kVar);
    }

    public static /* synthetic */ void q(h hVar, cu.a aVar) {
        z(hVar, aVar);
    }

    private final cu.a u(k kVar) {
        JSONObject optJSONObject;
        cu.a b11;
        com.tesla.data.oapi.f b12 = kVar.b();
        if (b12 == null) {
            JSONObject e11 = kVar.e();
            if (e11 == null || (optJSONObject = e11.optJSONObject("response")) == null || (b11 = cv.a.f23118a.b(optJSONObject)) == null) {
                return null;
            }
            JSONObject optJSONObject2 = e11.optJSONObject("response");
            w2 b13 = optJSONObject2 == null ? null : du.j.f24245a.b(optJSONObject2);
            if (b13 != null && et.a.A(b13, b11.g())) {
                av.a.a().i("Cached data is fresher than the JSON converted protos use it.");
                w2 g11 = b11.g();
                o i11 = g11 != null ? g11.i() : null;
                if (i11 == null) {
                    i11 = b13.i();
                }
                return cu.a.b(b11, null, null, false, null, w2.b(b13, null, null, null, null, null, null, i11, null, 0, null, null, null, false, null, 16319, null), null, null, null, 239, null);
            }
            av.a.a().i("No cached_data, vehicle likely awake or the backend cache is missing.");
            return b11;
        }
        throw new OwnerApiErrorException(b12);
    }

    private final cu.a v(cu.a aVar) {
        cu.b bVar = this.f23131e.get(et.a.o(aVar));
        return bVar == null ? aVar : cu.a.b(aVar, null, null, false, null, null, bVar, null, null, 223, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(java.lang.String r20, final cu.a r21, zz.d<? super cu.a> r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            r2 = r22
            boolean r3 = r2 instanceof cv.h.d
            if (r3 == 0) goto L19
            r3 = r2
            cv.h$d r3 = (cv.h.d) r3
            int r4 = r3.f23144c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f23144c = r4
            goto L1e
        L19:
            cv.h$d r3 = new cv.h$d
            r3.<init>(r2)
        L1e:
            java.lang.Object r2 = r3.f23142a
            java.lang.Object r4 = a00.b.d()
            int r5 = r3.f23144c
            r6 = 1
            if (r5 == 0) goto L38
            if (r5 != r6) goto L30
            vz.r.b(r2)
            goto Lb8
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            vz.r.b(r2)
            com.tesla.data.oapi.h r2 = r0.f23129c
            java.lang.String r5 = "VEHICLE_DATA"
            com.tesla.data.oapi.OwnerApiEndpoint r2 = r2.c(r5)
            kotlin.jvm.internal.s.e(r2)
            yu.f r7 = r0.f23130d
            com.tesla.data.HttpMethodType r8 = r2.getMethod()
            java.lang.String r9 = r2.getUri()
            java.lang.String r5 = "vehicle_id"
            r10 = r20
            vz.p r5 = vz.v.a(r5, r10)
            java.util.Map r10 = wz.p0.f(r5)
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>()
            r5 = 2
            vz.p[] r5 = new vz.p[r5]
            r12 = 0
            java.lang.String r13 = "endpoints"
            java.lang.String r14 = "vehicle_config;vehicle_state;climate_state;charge_state;gui_settings;drive_state;vehicle_data_combo"
            vz.p r13 = vz.v.a(r13, r14)
            r5[r12] = r13
            java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.b.a(r6)
            java.lang.String r13 = "let_sleep"
            vz.p r12 = vz.v.a(r13, r12)
            r5[r6] = r12
            java.util.Map r12 = wz.p0.l(r5)
            r13 = 0
            r14 = 0
            boolean r15 = r2.isAuthenticated()
            r16 = 0
            r17 = 352(0x160, float:4.93E-43)
            r18 = 0
            hy.m r2 = yu.f.a.d(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            cv.f r5 = new cv.f
            r5.<init>()
            hy.m r2 = r2.o(r5)
            cv.e r5 = new cv.e
            r5.<init>()
            hy.m r1 = r2.q(r5)
            cv.d r2 = new cv.d
            r2.<init>()
            hy.m r1 = r1.g(r2)
            java.lang.String r2 = "ownerApiSender.execute(\n…er.saveVehicleCache(it) }"
            kotlin.jvm.internal.s.f(r1, r2)
            r3.f23144c = r6
            java.lang.Object r2 = a30.a.a(r1, r3)
            if (r2 != r4) goto Lb8
            return r4
        Lb8:
            java.lang.String r1 = "ownerApiSender.execute(\n…ache(it) }\n      .await()"
            kotlin.jvm.internal.s.f(r2, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: cv.h.w(java.lang.String, cu.a, zz.d):java.lang.Object");
    }

    public static final cu.a x(h this$0, cu.a aVar, k response) {
        cu.a aVar2;
        s.g(this$0, "this$0");
        com.tesla.data.oapi.f b11 = response.b();
        if (b11 == null) {
            s.f(response, "response");
            cu.a u11 = this$0.u(response);
            if (u11 == null) {
                aVar2 = null;
            } else {
                if (aVar != null) {
                    u11 = cu.a.b(u11, null, aVar.f(), false, null, null, null, null, null, 253, null);
                }
                aVar2 = u11;
            }
            s.e(aVar2);
            return aVar2;
        }
        throw new OwnerApiErrorException(b11);
    }

    public static final q y(cu.a aVar, Throwable th2) {
        if (!(th2 instanceof OwnerApiErrorException)) {
            s.e(aVar);
            return m.n(aVar);
        }
        return m.i(th2);
    }

    public static final void z(h this$0, cu.a it2) {
        s.g(this$0, "this$0");
        ct.i iVar = this$0.f23127a;
        s.f(it2, "it");
        cv.c.e(iVar, it2);
    }

    @Override // cv.i
    public Object a(zz.d<? super List<cu.a>> dVar) {
        return cv.c.d(this.f23127a);
    }

    @Override // cv.i
    public int b() {
        return cv.c.d(this.f23127a).size();
    }

    @Override // cv.i
    public int c(String vin, int[] appWidgetIds) {
        Integer num;
        Object obj;
        s.g(vin, "vin");
        s.g(appWidgetIds, "appWidgetIds");
        Iterator<T> it2 = cv.c.d(this.f23127a).iterator();
        while (true) {
            num = null;
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (s.c(et.a.o((cu.a) obj), vin)) {
                break;
            }
        }
        cu.a aVar = (cu.a) obj;
        if (aVar == null) {
            return 0;
        }
        int length = appWidgetIds.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            int i12 = appWidgetIds[i11];
            if (s.c(d(i12), aVar.h())) {
                num = Integer.valueOf(i12);
                break;
            }
            i11++;
        }
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // cv.i
    public String d(int i11) {
        return cv.b.d(this.f23127a, i11);
    }

    @Override // cv.i
    public boolean e() {
        return this.f23128b.a() != null;
    }

    @Override // cv.i
    public Object f(String str, zz.d<? super cu.a> dVar) {
        cu.a b11 = cv.c.b(this.f23127a, str);
        if (b11 == null) {
            return null;
        }
        return v(b11);
    }

    @Override // cv.i
    public void g(String vin, cu.b bleStatus) {
        s.g(vin, "vin");
        s.g(bleStatus, "bleStatus");
        this.f23131e.put(vin, bleStatus);
    }

    @Override // cv.i
    public void h(int i11, String vehicleId) {
        s.g(vehicleId, "vehicleId");
        cv.b.f(this.f23127a, i11, vehicleId);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0084  */
    @Override // cv.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object i(java.lang.String r8, boolean r9, zz.d<? super cu.a> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof cv.h.b
            if (r0 == 0) goto L13
            r0 = r10
            cv.h$b r0 = (cv.h.b) r0
            int r1 = r0.f23137f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23137f = r1
            goto L18
        L13:
            cv.h$b r0 = new cv.h$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f23135d
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f23137f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L56
            if (r2 == r5) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.f23132a
            cv.h r8 = (cv.h) r8
            vz.r.b(r10)
            goto L91
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.f23132a
            cv.h r8 = (cv.h) r8
            vz.r.b(r10)
            goto L80
        L43:
            boolean r9 = r0.f23134c
            java.lang.Object r8 = r0.f23133b
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r0.f23132a
            cv.h r2 = (cv.h) r2
            vz.r.b(r10)
            r6 = r9
            r9 = r8
            r8 = r2
            r2 = r10
            r10 = r6
            goto L6c
        L56:
            vz.r.b(r10)
            r0.f23132a = r7
            r0.f23133b = r8
            r0.f23134c = r9
            r0.f23137f = r5
            java.lang.Object r10 = r7.f(r8, r0)
            if (r10 != r1) goto L68
            return r1
        L68:
            r2 = r10
            r10 = r9
            r9 = r8
            r8 = r7
        L6c:
            cu.a r2 = (cu.a) r2
            r5 = 0
            if (r10 == 0) goto L84
            if (r2 != 0) goto L94
            r0.f23132a = r8
            r0.f23133b = r5
            r0.f23137f = r4
            java.lang.Object r10 = r8.w(r9, r2, r0)
            if (r10 != r1) goto L80
            return r1
        L80:
            r2 = r10
            cu.a r2 = (cu.a) r2
            goto L94
        L84:
            r0.f23132a = r8
            r0.f23133b = r5
            r0.f23137f = r3
            java.lang.Object r10 = r8.w(r9, r2, r0)
            if (r10 != r1) goto L91
            return r1
        L91:
            r2 = r10
            cu.a r2 = (cu.a) r2
        L94:
            cu.a r8 = r8.v(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: cv.h.i(java.lang.String, boolean, zz.d):java.lang.Object");
    }

    @Override // cv.i
    public void j(int i11) {
        cv.b.b(this.f23127a, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0055 A[Catch: Exception -> 0x0090, TRY_ENTER, TryCatch #0 {Exception -> 0x0090, blocks: (B:62:0x002d, B:78:0x0063, B:79:0x0069, B:81:0x006f, B:85:0x0086, B:88:0x008b, B:74:0x0055), top: B:92:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x006f A[Catch: Exception -> 0x0090, TryCatch #0 {Exception -> 0x0090, blocks: (B:62:0x002d, B:78:0x0063, B:79:0x0069, B:81:0x006f, B:85:0x0086, B:88:0x008b, B:74:0x0055), top: B:92:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x008b A[Catch: Exception -> 0x0090, TRY_LEAVE, TryCatch #0 {Exception -> 0x0090, blocks: (B:62:0x002d, B:78:0x0063, B:79:0x0069, B:81:0x006f, B:85:0x0086, B:88:0x008b, B:74:0x0055), top: B:92:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0085 A[SYNTHETIC] */
    @Override // cv.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object k(java.lang.String r8, zz.d<? super java.lang.String> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof cv.h.c
            if (r0 == 0) goto L13
            r0 = r9
            cv.h$c r0 = (cv.h.c) r0
            int r1 = r0.f23141d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23141d = r1
            goto L18
        L13:
            cv.h$c r0 = new cv.h$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f23139b
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f23141d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.f23138a
            cu.a r8 = (cu.a) r8
            vz.r.b(r9)     // Catch: java.lang.Exception -> L90
            goto L63
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            java.lang.Object r8 = r0.f23138a
            cv.h r8 = (cv.h) r8
            vz.r.b(r9)
            goto L50
        L41:
            vz.r.b(r9)
            r0.f23138a = r7
            r0.f23141d = r4
            java.lang.Object r9 = r7.f(r8, r0)
            if (r9 != r1) goto L4f
            return r1
        L4f:
            r8 = r7
        L50:
            cu.a r9 = (cu.a) r9
            if (r9 != 0) goto L55
            return r5
        L55:
            r0.f23138a = r9     // Catch: java.lang.Exception -> L90
            r0.f23141d = r3     // Catch: java.lang.Exception -> L90
            java.lang.Object r8 = r8.A(r0)     // Catch: java.lang.Exception -> L90
            if (r8 != r1) goto L60
            return r1
        L60:
            r6 = r9
            r9 = r8
            r8 = r6
        L63:
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Exception -> L90
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Exception -> L90
        L69:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Exception -> L90
            if (r0 == 0) goto L85
            java.lang.Object r0 = r9.next()     // Catch: java.lang.Exception -> L90
            r1 = r0
            com.tesla.domain.model.Vehicle r1 = (com.tesla.domain.model.Vehicle) r1     // Catch: java.lang.Exception -> L90
            java.lang.String r1 = r1.getVin()     // Catch: java.lang.Exception -> L90
            java.lang.String r2 = et.a.o(r8)     // Catch: java.lang.Exception -> L90
            boolean r1 = kotlin.jvm.internal.s.c(r1, r2)     // Catch: java.lang.Exception -> L90
            if (r1 == 0) goto L69
            goto L86
        L85:
            r0 = r5
        L86:
            com.tesla.domain.model.Vehicle r0 = (com.tesla.domain.model.Vehicle) r0     // Catch: java.lang.Exception -> L90
            if (r0 != 0) goto L8b
            goto L90
        L8b:
            java.lang.String r8 = r0.getId()     // Catch: java.lang.Exception -> L90
            r5 = r8
        L90:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: cv.h.k(java.lang.String, zz.d):java.lang.Object");
    }

    @Override // cv.i
    public Object l(zz.d<? super b0> dVar) {
        cv.c.a(this.f23127a);
        return b0.f54756a;
    }

    @Override // cv.i
    public List<bv.c> m(String vehicleId) {
        s.g(vehicleId, "vehicleId");
        String g11 = this.f23127a.g("persist:vehiclePresentation");
        if (g11 == null) {
            return f23126g;
        }
        try {
            JSONArray jSONArray = new JSONObject(new JSONObject(g11).getString("quickControlsLayout")).getJSONArray(vehicleId);
            if (jSONArray.length() < 4) {
                return f23126g;
            }
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            int length = jSONArray.length();
            if (length > 0) {
                while (true) {
                    int i12 = i11 + 1;
                    String string = jSONArray.getString(i11);
                    s.f(string, "jsonArray.getString(i)");
                    bv.c d11 = bv.d.d(string);
                    if (d11 == null) {
                        return f23126g;
                    }
                    arrayList.add(d11);
                    if (i12 >= length) {
                        break;
                    }
                    i11 = i12;
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return f23126g;
        }
    }
}