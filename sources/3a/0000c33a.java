package yu;

import android.content.Context;
import android.net.Uri;
import com.tesla.data.HttpMethodType;
import com.tesla.data.oapi.k;
import com.tesla.logging.g;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.net.UnknownHostException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.l0;
import ku.a;
import ku.e;
import ku.f;
import lt.w2;
import mt.j;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import wz.r0;
import wz.s0;
import yu.m;
import yu.y;

/* loaded from: classes6.dex */
public final class y implements f {

    /* renamed from: h */
    public static final a f59842h = new a(null);

    /* renamed from: i */
    private static final com.tesla.logging.g f59843i;

    /* renamed from: j */
    private static final com.tesla.logging.g f59844j;

    /* renamed from: a */
    private final at.f f59845a;

    /* renamed from: b */
    private final js.b f59846b;

    /* renamed from: c */
    private final ku.e f59847c;

    /* renamed from: d */
    private final yu.a f59848d;

    /* renamed from: e */
    private final k f59849e;

    /* renamed from: f */
    private final e f59850f;

    /* renamed from: g */
    private final Context f59851g;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final y a(Context context) {
            kotlin.jvm.internal.s.g(context, "context");
            Context appContext = context.getApplicationContext();
            kotlin.jvm.internal.s.f(appContext, "appContext");
            return b(context, j.b(appContext), j.a(appContext));
        }

        public final y b(Context context, at.f remote, js.b authRepository) {
            kotlin.jvm.internal.s.g(context, "context");
            kotlin.jvm.internal.s.g(remote, "remote");
            kotlin.jvm.internal.s.g(authRepository, "authRepository");
            Context applicationContext = context.getApplicationContext();
            ku.e a11 = ku.e.f35884a.a();
            Objects.requireNonNull(applicationContext, "null cannot be cast to non-null type com.tesla.temp.CachedResponseListener");
            return new y(remote, authRepository, a11, (yu.a) applicationContext, (k) applicationContext, e.f59783c.a(), applicationContext, null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class b {

        /* renamed from: a */
        private final String f59852a;

        /* renamed from: b */
        private final Map<String, String> f59853b;

        /* renamed from: c */
        private final Map<String, String> f59854c;

        /* renamed from: d */
        private final String f59855d;

        public b(String url, Map<String, String> params, Map<String, String> headers, String str) {
            kotlin.jvm.internal.s.g(url, "url");
            kotlin.jvm.internal.s.g(params, "params");
            kotlin.jvm.internal.s.g(headers, "headers");
            this.f59852a = url;
            this.f59853b = params;
            this.f59854c = headers;
            this.f59855d = str;
        }

        public final Map<String, String> a() {
            return this.f59854c;
        }

        public final Map<String, String> b() {
            return this.f59853b;
        }

        public final String c() {
            return this.f59852a;
        }

        public final String d() {
            return this.f59855d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return kotlin.jvm.internal.s.c(this.f59852a, bVar.f59852a) && kotlin.jvm.internal.s.c(this.f59853b, bVar.f59853b) && kotlin.jvm.internal.s.c(this.f59854c, bVar.f59854c) && kotlin.jvm.internal.s.c(this.f59855d, bVar.f59855d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = ((((this.f59852a.hashCode() * 31) + this.f59853b.hashCode()) * 31) + this.f59854c.hashCode()) * 31;
            String str = this.f59855d;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.f59852a;
            Map<String, String> map = this.f59853b;
            Map<String, String> map2 = this.f59854c;
            String str2 = this.f59855d;
            return "RequestInfo(url=" + str + ", params=" + map + ", headers=" + map2 + ", vehicleId=" + str2 + ")";
        }
    }

    /* loaded from: classes6.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<String, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ Map<String, String> f59856a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Map<String, String> map) {
            super(1);
            this.f59856a = map;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(String str) {
            invoke2(str);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2(String token) {
            kotlin.jvm.internal.s.g(token, "token");
            js.c.f33945a.d(this.f59856a, token);
        }
    }

    static {
        g.a aVar = com.tesla.logging.g.f21878b;
        f59843i = aVar.a("SendOwnerRequest");
        f59844j = aVar.a("SendOwnerRequest");
    }

    private y(at.f fVar, js.b bVar, ku.e eVar, yu.a aVar, k kVar, e eVar2, Context context) {
        this.f59845a = fVar;
        this.f59846b = bVar;
        this.f59847c = eVar;
        this.f59848d = aVar;
        this.f59849e = kVar;
        this.f59850f = eVar2;
        this.f59851g = context.getApplicationContext();
    }

    public /* synthetic */ y(at.f fVar, js.b bVar, ku.e eVar, yu.a aVar, k kVar, e eVar2, Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, bVar, eVar, aVar, kVar, eVar2, context);
    }

    private final RequestBody A(String str) {
        return RequestBody.Companion.create(str, MediaType.Companion.parse("application/json; charset=utf-8"));
    }

    private final RequestBody B(Map<String, ? extends Object> map) {
        return C(zu.u.f60790a.d(map));
    }

    private final RequestBody C(JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.s.f(jSONObject2, "toString()");
        return A(jSONObject2);
    }

    public static final hy.q E(y this$0, MultipartBody.Part file, Integer num, b bVar) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(file, "$file");
        return this$0.f59845a.d(bVar.c(), bVar.b(), file, bVar.a()).x(num == null ? 15 : num.intValue(), TimeUnit.SECONDS).w(bz.a.c()).o(new ky.h() { // from class: yu.x
            @Override // ky.h
            public final Object apply(Object obj) {
                return y.m((retrofit2.s) obj);
            }
        });
    }

    public static final com.tesla.data.oapi.k F(retrofit2.s it2) {
        k.a aVar = com.tesla.data.oapi.k.f21782k;
        kotlin.jvm.internal.s.f(it2, "it");
        return aVar.b(it2);
    }

    public static /* synthetic */ void f(String str, y yVar, String str2, b bVar, l0 l0Var, long j11, com.tesla.data.oapi.k kVar) {
        w(str, yVar, str2, bVar, l0Var, j11, kVar);
    }

    public static /* synthetic */ com.tesla.data.oapi.k g(long j11, Uri uri, retrofit2.s sVar) {
        return u(j11, uri, sVar);
    }

    public static /* synthetic */ hy.q h(y yVar, MultipartBody.Part part, Integer num, b bVar) {
        return E(yVar, part, num, bVar);
    }

    public static /* synthetic */ hy.q i(y yVar, b bVar) {
        return q(yVar, bVar);
    }

    public static /* synthetic */ void j(y yVar, String str, Map map, Map map2, Map map3, boolean z11, boolean z12, hy.n nVar) {
        o(yVar, str, map, map2, map3, z11, z12, nVar);
    }

    public static /* synthetic */ hy.q k(Throwable th2) {
        return v(th2);
    }

    public static /* synthetic */ hy.q l(Map map, y yVar, JSONObject jSONObject, String str, String str2, String str3, Map map2, Integer num, b bVar) {
        return t(map, yVar, jSONObject, str, str2, str3, map2, num, bVar);
    }

    public static /* synthetic */ com.tesla.data.oapi.k m(retrofit2.s sVar) {
        return F(sVar);
    }

    private final hy.m<b> n(final String str, final Map<String, ? extends Object> map, final Map<String, ? extends Object> map2, final Map<String, String> map3, final boolean z11, final boolean z12) {
        hy.m<b> w11 = hy.m.e(new hy.p() { // from class: yu.q
            {
                y.this = this;
            }

            @Override // hy.p
            public final void a(hy.n nVar) {
                y.j(y.this, str, map, map2, map3, z12, z11, nVar);
            }
        }).w(bz.a.c());
        kotlin.jvm.internal.s.f(w11, "create<RequestInfo> { em…scribeOn(Schedulers.io())");
        return w11;
    }

    public static final void o(y this$0, String url, Map map, Map map2, Map map3, boolean z11, boolean z12, hy.n nVar) {
        Map linkedHashMap;
        int e11;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(url, "$url");
        String y11 = this$0.y(url, map);
        if (map2 == null) {
            linkedHashMap = null;
        } else {
            e11 = r0.e(map2.size());
            linkedHashMap = new LinkedHashMap(e11);
            for (Map.Entry entry : map2.entrySet()) {
                linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        if (linkedHashMap == null) {
            linkedHashMap = s0.i();
        }
        Map y12 = map3 == null ? null : s0.y(map3);
        if (y12 == null) {
            y12 = new LinkedHashMap();
        }
        Object obj = map == null ? null : map.get("vehicle_id");
        String str = obj instanceof String ? (String) obj : null;
        if (z11) {
            y12.put("CompressionDisabled", "");
        }
        if (z12 ? this$0.x(new c(y12)) : false) {
            nVar.onError(new js.l("Failed to refresh token"));
        } else {
            nVar.onSuccess(new b(y11, linkedHashMap, y12, str));
        }
    }

    public static final hy.q q(y this$0, b bVar) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        return this$0.f59845a.f(bVar.c(), bVar.b(), bVar.a());
    }

    private final hy.m<com.tesla.data.oapi.k> r(final String str, final String str2, final Map<String, ? extends Object> map, final Map<String, ? extends Object> map2, final JSONObject jSONObject, final String str3, Map<String, ? extends Object> map3, Map<String, String> map4, final Integer num, boolean z11, boolean z12) {
        e.b.a(this.f59847c, tt.h.OWNER_API_REQUEST, 0L, 2, null);
        hy.m k11 = n(str2, map, map3, map4, z11, z12).k(new ky.h() { // from class: yu.t
            @Override // ky.h
            public final Object apply(Object obj) {
                return y.l(map2, this, jSONObject, str3, str, str2, map, num, (y.b) obj);
            }
        });
        kotlin.jvm.internal.s.f(k11, "requestInfoSingle.flatMa…On(Schedulers.io())\n    }");
        return k11;
    }

    static /* synthetic */ hy.m s(y yVar, String str, String str2, Map map, Map map2, JSONObject jSONObject, String str3, Map map3, Map map4, Integer num, boolean z11, boolean z12, int i11, Object obj) {
        return yVar.r(str, str2, (i11 & 4) != 0 ? null : map, (i11 & 8) != 0 ? null : map2, (i11 & 16) != 0 ? null : jSONObject, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : map3, (i11 & 128) != 0 ? null : map4, (i11 & 256) != 0 ? 15 : num, (i11 & 512) != 0 ? true : z11, (i11 & 1024) != 0 ? false : z12);
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [ku.f, T] */
    public static final hy.q t(Map map, final y this$0, JSONObject jSONObject, String str, String method, final String url, Map map2, Integer num, final b bVar) {
        RequestBody B;
        hy.m<retrofit2.s<ResponseBody>> a11;
        boolean M;
        w2 a12;
        String p11;
        String n11;
        List<ku.a> l11;
        j.f Y;
        tt.e a13;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(method, "$method");
        kotlin.jvm.internal.s.g(url, "$url");
        if (map != null) {
            B = this$0.B(map);
        } else if (jSONObject != null) {
            B = this$0.C(jSONObject);
        } else if (str == null) {
            B = this$0.C(new JSONObject());
        } else {
            B = this$0.A(str);
        }
        boolean z11 = (map == null && jSONObject == null && str == null) ? false : true;
        if (kotlin.jvm.internal.s.c(method, HttpMethodType.GET.name())) {
            a11 = this$0.f59845a.f(bVar.c(), bVar.b(), bVar.a());
        } else if (kotlin.jvm.internal.s.c(method, HttpMethodType.POST.name())) {
            a11 = this$0.f59845a.b(bVar.c(), bVar.b(), B, bVar.a());
        } else if (kotlin.jvm.internal.s.c(method, HttpMethodType.PUT.name())) {
            a11 = this$0.f59845a.c(bVar.c(), bVar.b(), B, bVar.a());
        } else if (kotlin.jvm.internal.s.c(method, HttpMethodType.PATCH.name())) {
            a11 = this$0.f59845a.g(bVar.c(), bVar.b(), B, bVar.a());
        } else if (!kotlin.jvm.internal.s.c(method, HttpMethodType.DELETE.name())) {
            throw new IllegalArgumentException("method type '" + method + "' not supported!");
        } else if (z11) {
            a11 = this$0.f59845a.e(bVar.c(), bVar.b(), B, bVar.a());
        } else {
            a11 = this$0.f59845a.a(bVar.c(), bVar.b(), bVar.a());
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final Uri parse = Uri.parse(url);
        String lastPathSegment = parse.getLastPathSegment();
        String str2 = "UNKNOWN";
        if (lastPathSegment != null) {
            Locale US = Locale.US;
            kotlin.jvm.internal.s.f(US, "US");
            String upperCase = lastPathSegment.toUpperCase(US);
            kotlin.jvm.internal.s.f(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            if (upperCase != null) {
                str2 = upperCase;
            }
        }
        final l0 l0Var = new l0();
        m.a aVar = m.f59801c;
        Context appContext = this$0.f59851g;
        kotlin.jvm.internal.s.f(appContext, "appContext");
        if (!kotlin.jvm.internal.s.c(url, aVar.c(appContext).getUri()) && (a13 = lu.a.f37743a.a(method)) != null) {
            l0Var.f34916a = this$0.f59847c.b(url, a13, -1L);
        }
        Object obj = map2 == null ? null : map2.get("vehicle_id");
        String str3 = obj instanceof String ? (String) obj : null;
        M = kotlin.text.w.M(url, "wake_up", false, 2, null);
        if (M && str3 != null && (a12 = this$0.f59850f.a(str3)) != null && (p11 = et.a.p(a12)) != null) {
            ku.e eVar = this$0.f59847c;
            tt.l lVar = tt.l.WAKE_TO_FRESH_DATA;
            ku.a[] aVarArr = new ku.a[3];
            a.C0683a c0683a = ku.a.f35879c;
            aVarArr[0] = c0683a.a("car_tye", et.a.g(a12));
            mt.v o11 = a12.o();
            Object obj2 = "unknown";
            if (o11 == null || (n11 = o11.n()) == null) {
                n11 = "unknown";
            }
            aVarArr[1] = c0683a.a("version", n11);
            mt.j c11 = a12.c();
            if (c11 != null && (Y = c11.Y()) != null) {
                obj2 = Y;
            }
            aVarArr[2] = c0683a.a("charging", obj2);
            l11 = wz.w.l(aVarArr);
            eVar.a(lVar, p11, l11);
        }
        final String str4 = str2;
        return a11.x(num == null ? 15 : num.intValue(), TimeUnit.SECONDS).o(new ky.h() { // from class: yu.s
            @Override // ky.h
            public final Object apply(Object obj3) {
                return y.g(currentTimeMillis, parse, (retrofit2.s) obj3);
            }
        }).q(new ky.h() { // from class: yu.w
            @Override // ky.h
            public final Object apply(Object obj3) {
                return y.k((Throwable) obj3);
            }
        }).g(new ky.f() { // from class: yu.r
            @Override // ky.f
            public final void accept(Object obj3) {
                y.f(url, this$0, str4, bVar, l0Var, currentTimeMillis, (com.tesla.data.oapi.k) obj3);
            }
        }).w(bz.a.c());
    }

    public static final com.tesla.data.oapi.k u(long j11, Uri uri, retrofit2.s responseBody) {
        k.a aVar = com.tesla.data.oapi.k.f21782k;
        kotlin.jvm.internal.s.f(responseBody, "responseBody");
        kotlin.jvm.internal.s.f(uri, "uri");
        return k.a.d(aVar, responseBody, j11, 0L, uri, 4, null);
    }

    public static final hy.q v(Throwable th2) {
        if (th2 instanceof TimeoutException) {
            return hy.m.n(com.tesla.data.oapi.k.f21782k.a(com.tesla.data.oapi.j.TIMEOUT));
        }
        if (th2 instanceof UnknownHostException) {
            return hy.m.n(com.tesla.data.oapi.k.f21782k.a(com.tesla.data.oapi.j.NO_NETWORK));
        }
        return hy.m.i(th2);
    }

    public static final void w(String url, y this$0, String lastPathSegment, b bVar, l0 networkTrace, long j11, com.tesla.data.oapi.k kVar) {
        Map<String, ? extends Object> l11;
        w2 a11;
        String p11;
        List<ku.a> i11;
        kotlin.jvm.internal.s.g(url, "$url");
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(lastPathSegment, "$lastPathSegment");
        kotlin.jvm.internal.s.g(networkTrace, "$networkTrace");
        m.a aVar = m.f59801c;
        Context appContext = this$0.f59851g;
        kotlin.jvm.internal.s.f(appContext, "appContext");
        if (kotlin.jvm.internal.s.c(url, aVar.c(appContext).getUri())) {
            return;
        }
        if (kVar.i()) {
            if (kotlin.jvm.internal.s.c(lastPathSegment, "VEHICLE_DATA")) {
                String d11 = bVar.d();
                if (d11 != null) {
                    boolean h11 = kVar.h();
                    this$0.f59848d.d(d11, h11);
                    if (!h11 && (a11 = this$0.f59850f.a(d11)) != null && (p11 = et.a.p(a11)) != null) {
                        ku.e a12 = ku.e.f35884a.a();
                        tt.l lVar = tt.l.WAKE_TO_FRESH_DATA;
                        i11 = wz.w.i();
                        a12.g(lVar, p11, i11);
                    }
                }
            } else if (kotlin.jvm.internal.s.c(lastPathSegment, "PRODUCTS")) {
                f59843i.i("products response success, notifying listener");
                this$0.f59849e.i();
            }
        }
        ku.f fVar = (ku.f) networkTrace.f34916a;
        if (fVar != null) {
            f.a.a(fVar, kVar.a(), kVar.f(), null, 4, null);
        }
        if (k00.c.f34202a.d(100) < 5) {
            Context appContext2 = this$0.f59851g;
            kotlin.jvm.internal.s.f(appContext2, "appContext");
            m b11 = aVar.b(appContext2);
            l11 = s0.l(vz.v.a(PermissionsResponse.STATUS_KEY, Integer.valueOf(kVar.a())), vz.v.a("duration", Long.valueOf(System.currentTimeMillis() - j11)), vz.v.a("type", "mobile-app-request-telemetry"), vz.v.a("endpoint", lastPathSegment));
            b11.d(l11, true);
        }
    }

    private final String y(String str, Map<String, ? extends Object> map) {
        if (map == null) {
            return str;
        }
        String str2 = str;
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            str2 = kotlin.text.v.D(str2, "{" + entry.getKey() + "}", value.toString(), false, 4, null);
        }
        return str2;
    }

    public static final y z(Context context, at.f fVar, js.b bVar) {
        return f59842h.b(context, fVar, bVar);
    }

    public hy.m<com.tesla.data.oapi.k> D(String url, Map<String, ? extends Object> map, final MultipartBody.Part file, Map<String, ? extends Object> map2, Map<String, String> map3, final Integer num, boolean z11, boolean z12) {
        kotlin.jvm.internal.s.g(url, "url");
        kotlin.jvm.internal.s.g(file, "file");
        hy.m k11 = n(url, map, map2, map3, z11, z12).k(new ky.h() { // from class: yu.v
            @Override // ky.h
            public final Object apply(Object obj) {
                return y.h(y.this, file, num, (y.b) obj);
            }
        });
        kotlin.jvm.internal.s.f(k11, "requestInfoSingle.flatMa…e.newInstance(it) }\n    }");
        return k11;
    }

    @Override // yu.f
    public hy.m<com.tesla.data.oapi.k> a(HttpMethodType method, String url, Map<String, ? extends Object> map, JSONObject jSONObject, Map<String, ? extends Object> map2, Map<String, String> map3, Integer num, boolean z11, boolean z12) {
        kotlin.jvm.internal.s.g(method, "method");
        kotlin.jvm.internal.s.g(url, "url");
        return s(this, method.name(), url, map, null, jSONObject, null, map2, map3, num, z11, z12, 32, null);
    }

    @Override // yu.f
    public hy.m<com.tesla.data.oapi.k> b(HttpMethodType method, String url, Integer num, boolean z11, boolean z12) {
        kotlin.jvm.internal.s.g(method, "method");
        kotlin.jvm.internal.s.g(url, "url");
        return s(this, method.name(), url, null, null, null, null, null, null, num, z11, z12, 236, null);
    }

    @Override // yu.f
    public hy.m<com.tesla.data.oapi.k> c(String method, String url, Map<String, ? extends Object> map, JSONObject jSONObject, Map<String, ? extends Object> map2, Map<String, String> map3, Integer num, boolean z11, boolean z12) {
        kotlin.jvm.internal.s.g(method, "method");
        kotlin.jvm.internal.s.g(url, "url");
        return s(this, method, url, map, null, jSONObject, null, map2, map3, num, z11, z12, 32, null);
    }

    @Override // yu.f
    public hy.m<com.tesla.data.oapi.k> d(HttpMethodType method, String url, Map<String, ? extends Object> map, String str, Map<String, ? extends Object> map2, Map<String, String> map3, Integer num, boolean z11, boolean z12) {
        kotlin.jvm.internal.s.g(method, "method");
        kotlin.jvm.internal.s.g(url, "url");
        return r(method.name(), url, map, null, null, str, map2, map3, num, z11, z12);
    }

    @Override // yu.f
    public hy.m<com.tesla.data.oapi.k> e(HttpMethodType method, String url, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, Map<String, String> map4, Integer num, boolean z11, boolean z12) {
        kotlin.jvm.internal.s.g(method, "method");
        kotlin.jvm.internal.s.g(url, "url");
        return s(this, method.name(), url, map, map2, null, null, map3, map4, num, z11, z12, 32, null);
    }

    public hy.m<retrofit2.s<ResponseBody>> p(String url, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, String> map3, Integer num, boolean z11, boolean z12) {
        kotlin.jvm.internal.s.g(url, "url");
        hy.m<retrofit2.s<ResponseBody>> w11 = n(url, map, map2, map3, z11, z12).k(new ky.h() { // from class: yu.u
            {
                y.this = this;
            }

            @Override // ky.h
            public final Object apply(Object obj) {
                return y.i(y.this, (y.b) obj);
            }
        }).x(num == null ? 15 : num.intValue(), TimeUnit.SECONDS).w(bz.a.c());
        kotlin.jvm.internal.s.f(w11, "requestInfoSingle\n      …scribeOn(Schedulers.io())");
        return w11;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean x(h00.l<? super java.lang.String, vz.b0> r10) {
        /*
            r9 = this;
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.s.g(r10, r0)
            r0 = 1
            r1 = 0
            js.b r2 = r9.f59846b     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r2 = r2.b()     // Catch: java.lang.Throwable -> Lc7
            if (r2 == 0) goto L18
            int r2 = r2.length()     // Catch: java.lang.Throwable -> Lc7
            if (r2 != 0) goto L16
            goto L18
        L16:
            r2 = r1
            goto L19
        L18:
            r2 = r0
        L19:
            r3 = 2
            r4 = 0
            if (r2 == 0) goto L2a
            com.tesla.logging.a$a r1 = com.tesla.logging.a.EnumC0395a.AUTH_FAILURE     // Catch: java.lang.Throwable -> L24
            com.tesla.logging.a.d(r1, r4, r3, r4)     // Catch: java.lang.Throwable -> L24
            goto Ld0
        L24:
            r1 = move-exception
            r8 = r1
            r1 = r0
            r0 = r8
            goto Lc8
        L2a:
            js.b r2 = r9.f59846b     // Catch: java.lang.Throwable -> Lc7
            hy.m r2 = js.b.a.a(r2, r4, r1, r3, r4)     // Catch: java.lang.Throwable -> Lc7
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> Lc7
            js.k r2 = (js.k) r2     // Catch: java.lang.Throwable -> Lc7
            boolean r3 = r2 instanceof js.k.a     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r5 = ": "
            if (r3 == 0) goto L6c
            java.lang.String r0 = "requesting auth token failed locally"
            js.k$a r2 = (js.k.a) r2     // Catch: java.lang.Throwable -> Lc7
            java.lang.Throwable r2 = r2.a()     // Catch: java.lang.Throwable -> Lc7
            if (r2 != 0) goto L47
            goto L64
        L47:
            com.tesla.logging.g r3 = yu.y.f59844j     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> Lc7
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc7
            r4.<init>()     // Catch: java.lang.Throwable -> Lc7
            r4.append(r0)     // Catch: java.lang.Throwable -> Lc7
            r4.append(r5)     // Catch: java.lang.Throwable -> Lc7
            r4.append(r2)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> Lc7
            r3.i(r2)     // Catch: java.lang.Throwable -> Lc7
            vz.b0 r4 = vz.b0.f54756a     // Catch: java.lang.Throwable -> Lc7
        L64:
            if (r4 != 0) goto Lcf
            com.tesla.logging.g r2 = yu.y.f59844j     // Catch: java.lang.Throwable -> Lc7
            r2.i(r0)     // Catch: java.lang.Throwable -> Lc7
            goto Lcf
        L6c:
            boolean r3 = r2 instanceof js.k.c     // Catch: java.lang.Throwable -> Lc7
            if (r3 == 0) goto Laf
            java.lang.String r3 = "requesting auth token failed remotely"
            r6 = r2
            js.k$c r6 = (js.k.c) r6     // Catch: java.lang.Throwable -> Lc7
            java.lang.Throwable r6 = r6.a()     // Catch: java.lang.Throwable -> Lc7
            if (r6 != 0) goto L7c
            goto L99
        L7c:
            com.tesla.logging.g r4 = yu.y.f59844j     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> Lc7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc7
            r7.<init>()     // Catch: java.lang.Throwable -> Lc7
            r7.append(r3)     // Catch: java.lang.Throwable -> Lc7
            r7.append(r5)     // Catch: java.lang.Throwable -> Lc7
            r7.append(r6)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> Lc7
            r4.i(r5)     // Catch: java.lang.Throwable -> Lc7
            vz.b0 r4 = vz.b0.f54756a     // Catch: java.lang.Throwable -> Lc7
        L99:
            if (r4 != 0) goto La0
            com.tesla.logging.g r4 = yu.y.f59844j     // Catch: java.lang.Throwable -> Lc7
            r4.i(r3)     // Catch: java.lang.Throwable -> Lc7
        La0:
            js.k$c r2 = (js.k.c) r2     // Catch: java.lang.Throwable -> Lc7
            int r2 = r2.b()     // Catch: java.lang.Throwable -> Lc7
            com.tesla.data.oapi.j r3 = com.tesla.data.oapi.j.UNAUTHORIZED     // Catch: java.lang.Throwable -> Lc7
            int r3 = r3.getCode()     // Catch: java.lang.Throwable -> Lc7
            if (r2 != r3) goto Lcf
            goto Ld0
        Laf:
            boolean r0 = r2 instanceof js.k.b     // Catch: java.lang.Throwable -> Lc7
            if (r0 == 0) goto Lbb
            com.tesla.logging.g r0 = yu.y.f59844j     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r2 = "requesting auth token succeeded locally"
            r0.i(r2)     // Catch: java.lang.Throwable -> Lc7
            goto Lcf
        Lbb:
            boolean r0 = r2 instanceof js.k.d     // Catch: java.lang.Throwable -> Lc7
            if (r0 == 0) goto Lcf
            com.tesla.logging.g r0 = yu.y.f59844j     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r2 = "requesting auth token succeeded remotely"
            r0.i(r2)     // Catch: java.lang.Throwable -> Lc7
            goto Lcf
        Lc7:
            r0 = move-exception
        Lc8:
            com.tesla.logging.g r2 = yu.y.f59844j
            java.lang.String r3 = "error occurs when requesting token"
            r2.d(r3, r0)
        Lcf:
            r0 = r1
        Ld0:
            js.b r1 = r9.f59846b
            java.lang.String r1 = r1.a()
            if (r1 != 0) goto Ld9
            goto Ldc
        Ld9:
            r10.invoke(r1)
        Ldc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yu.y.x(h00.l):boolean");
    }
}