package com.tesla.data.oapi;

import android.net.Uri;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.u;
import okhttp3.Headers;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.s;

/* loaded from: classes6.dex */
public final class k {

    /* renamed from: k  reason: collision with root package name */
    public static final a f21782k = new a(null);

    /* renamed from: l  reason: collision with root package name */
    private static final com.tesla.logging.g f21783l = com.tesla.logging.g.f21878b.a("OwnerResponse");

    /* renamed from: a  reason: collision with root package name */
    private final s<ResponseBody> f21784a;

    /* renamed from: b  reason: collision with root package name */
    private final long f21785b;

    /* renamed from: c  reason: collision with root package name */
    private final long f21786c;

    /* renamed from: d  reason: collision with root package name */
    private final j f21787d;

    /* renamed from: e  reason: collision with root package name */
    private long f21788e;

    /* renamed from: f  reason: collision with root package name */
    private f f21789f;

    /* renamed from: g  reason: collision with root package name */
    private String f21790g;

    /* renamed from: h  reason: collision with root package name */
    private JSONObject f21791h;

    /* renamed from: i  reason: collision with root package name */
    private Headers f21792i;

    /* renamed from: j  reason: collision with root package name */
    private final vz.k f21793j;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ k d(a aVar, s sVar, long j11, long j12, Uri uri, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                j12 = System.currentTimeMillis();
            }
            return aVar.c(sVar, j11, j12, uri);
        }

        public final k a(j statusCode) {
            kotlin.jvm.internal.s.g(statusCode, "statusCode");
            return new k(null, statusCode, 0L, 0L, null, 28, null);
        }

        public final k b(s<ResponseBody> body) {
            kotlin.jvm.internal.s.g(body, "body");
            return new k(body, null, 0L, 0L, null, 28, null);
        }

        public final k c(s<ResponseBody> body, long j11, long j12, Uri uri) {
            kotlin.jvm.internal.s.g(body, "body");
            kotlin.jvm.internal.s.g(uri, "uri");
            return new k(body, null, j11, j12, uri, null);
        }
    }

    /* loaded from: classes6.dex */
    static final class b extends u implements h00.a<Boolean> {
        b() {
            super(0);
        }

        private static final Boolean a(String str) {
            if (str == null) {
                return null;
            }
            Locale US = Locale.US;
            kotlin.jvm.internal.s.f(US, "US");
            String upperCase = str.toUpperCase(US);
            kotlin.jvm.internal.s.f(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            if (upperCase == null) {
                return null;
            }
            return Boolean.valueOf(kotlin.jvm.internal.s.c(upperCase, "HIT"));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        public final Boolean invoke() {
            Headers d11;
            String str;
            String str2;
            Headers d12 = k.this.d();
            Boolean bool = null;
            if (d12 != null && (str2 = d12.get("x-cache")) != null) {
                bool = a(str2);
            }
            boolean z11 = false;
            if (bool != null || ((d11 = k.this.d()) != null && (str = d11.get("X-Cache")) != null && (bool = a(str)) != null)) {
                z11 = bool.booleanValue();
            }
            return Boolean.valueOf(z11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
        if (r5 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b7, code lost:
        if (r5 == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private k(retrofit2.s<okhttp3.ResponseBody> r7, com.tesla.data.oapi.j r8, long r9, long r11, android.net.Uri r13) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tesla.data.oapi.k.<init>(retrofit2.s, com.tesla.data.oapi.j, long, long, android.net.Uri):void");
    }

    public /* synthetic */ k(s sVar, j jVar, long j11, long j12, Uri uri, DefaultConstructorMarker defaultConstructorMarker) {
        this(sVar, jVar, j11, j12, uri);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
        if (r2 == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void j(org.json.JSONObject r6) {
        /*
            r5 = this;
            java.lang.String r0 = "error"
            boolean r1 = r6.has(r0)
            if (r1 == 0) goto L69
            java.lang.String r1 = r6.getString(r0)
            java.lang.String r2 = "body.getString(KEY_ERROR)"
            kotlin.jvm.internal.s.f(r1, r2)
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r3 = "getDefault()"
            kotlin.jvm.internal.s.f(r2, r3)
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.String r2 = "(this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.s.f(r1, r2)
            java.lang.String r2 = "error_description"
            boolean r3 = r6.has(r2)
            r4 = 0
            if (r3 == 0) goto L45
            java.lang.String r2 = r6.getString(r2)
            r5.f21790g = r2
            r3 = 1
            if (r2 != 0) goto L37
        L35:
            r3 = r4
            goto L3d
        L37:
            boolean r2 = kotlin.text.m.w(r2)
            if (r2 != r3) goto L35
        L3d:
            if (r3 == 0) goto L45
            java.lang.String r6 = r6.getString(r0)
            r5.f21790g = r6
        L45:
            java.lang.String r6 = "timeout in request"
            r0 = 2
            r2 = 0
            boolean r6 = kotlin.text.m.M(r1, r6, r4, r0, r2)
            if (r6 != 0) goto L65
            java.lang.String r6 = "unable to connect to"
            boolean r6 = kotlin.text.m.M(r1, r6, r4, r0, r2)
            if (r6 == 0) goto L58
            goto L65
        L58:
            java.lang.String r6 = "vehicle is currently in service"
            boolean r6 = kotlin.text.m.M(r1, r6, r4, r0, r2)
            if (r6 == 0) goto L69
            com.tesla.data.oapi.f r6 = com.tesla.data.oapi.f.OWNERAPI_ERROR_SERVICE_MAINTENANCE
            r5.f21789f = r6
            goto L69
        L65:
            com.tesla.data.oapi.f r6 = com.tesla.data.oapi.f.OWNERAPI_ERROR_TIMEOUT
            r5.f21789f = r6
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tesla.data.oapi.k.j(org.json.JSONObject):void");
    }

    private final void k(JSONObject jSONObject) {
        if (jSONObject.has("error")) {
            j(jSONObject);
        }
        this.f21791h = jSONObject;
    }

    private final JSONObject l(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    private final JSONObject m(ResponseBody responseBody) {
        String string = responseBody == null ? null : responseBody.string();
        return string == null ? new JSONObject() : l(string);
    }

    public final int a() {
        s<ResponseBody> sVar = this.f21784a;
        Integer valueOf = sVar == null ? null : Integer.valueOf(sVar.b());
        return valueOf == null ? this.f21787d.getCode() : valueOf.intValue();
    }

    public final f b() {
        return this.f21789f;
    }

    public final String c() {
        return this.f21790g;
    }

    public final Headers d() {
        return this.f21792i;
    }

    public final JSONObject e() {
        return this.f21791h;
    }

    public final long f() {
        return this.f21788e;
    }

    public final j g() {
        return this.f21787d;
    }

    public final boolean h() {
        return ((Boolean) this.f21793j.getValue()).booleanValue();
    }

    public final boolean i() {
        return j.Companion.a(a()).isSuccess();
    }

    /* synthetic */ k(s sVar, j jVar, long j11, long j12, Uri uri, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(sVar, jVar, (i11 & 4) != 0 ? 0L : j11, (i11 & 8) != 0 ? 0L : j12, (i11 & 16) != 0 ? null : uri);
    }
}