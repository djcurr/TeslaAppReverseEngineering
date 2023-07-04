package yu;

import android.content.Context;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* loaded from: classes6.dex */
public final class a0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f59768c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    private static final com.tesla.logging.g f59769d = com.tesla.logging.g.f21878b.a("OwnerAPI");

    /* renamed from: e  reason: collision with root package name */
    private static volatile a0 f59770e;

    /* renamed from: a  reason: collision with root package name */
    private final OkHttpClient f59771a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f59772b;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return c0.f59778a.a();
        }

        public final a0 b(Context context, js.b authRepository) {
            kotlin.jvm.internal.s.g(context, "context");
            kotlin.jvm.internal.s.g(authRepository, "authRepository");
            if (a0.f59770e == null) {
                synchronized (this) {
                    if (a0.f59770e == null) {
                        a aVar = a0.f59768c;
                        a0.f59770e = new a0(context, authRepository, null);
                    }
                    vz.b0 b0Var = vz.b0.f54756a;
                }
            }
            a0 a0Var = a0.f59770e;
            kotlin.jvm.internal.s.e(a0Var);
            return a0Var;
        }

        public final String c() {
            return c0.f59778a.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public final class b implements Interceptor {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a0 f59773a;

        public b(a0 this$0) {
            kotlin.jvm.internal.s.g(this$0, "this$0");
            this.f59773a = this$0;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
        @Override // okhttp3.Interceptor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public okhttp3.Response intercept(okhttp3.Interceptor.Chain r7) {
            /*
                r6 = this;
                java.lang.String r0 = "chain"
                kotlin.jvm.internal.s.g(r7, r0)
                okhttp3.Request r0 = r7.request()
                okhttp3.Request$Builder r1 = r0.newBuilder()
                yu.a0 r2 = r6.f59773a
                java.util.UUID r3 = java.util.UUID.randomUUID()
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = "randomUUID().toString()"
                kotlin.jvm.internal.s.f(r3, r4)
                java.lang.String r4 = "X-TXID"
                r1.header(r4, r3)
                android.content.Context r3 = yu.a0.a(r2)
                java.lang.String r3 = yu.b.p(r3)
                java.lang.String r4 = "getTeslaUserAgent(appContext)"
                kotlin.jvm.internal.s.f(r3, r4)
                java.lang.String r5 = "X-Tesla-User-Agent"
                r1.header(r5, r3)
                android.content.Context r3 = yu.a0.a(r2)
                java.lang.String r3 = yu.b.p(r3)
                kotlin.jvm.internal.s.f(r3, r4)
                java.lang.String r4 = "User-Agent"
                r1.header(r4, r3)
                okhttp3.Headers r3 = r0.headers()
                java.lang.String r4 = "Content-Type"
                java.lang.String r3 = r3.get(r4)
                r5 = 0
                if (r3 != 0) goto L64
                okhttp3.RequestBody r0 = r0.body()
                if (r0 != 0) goto L58
                r0 = r5
                goto L5c
            L58:
                okhttp3.MediaType r0 = r0.contentType()
            L5c:
                if (r0 != 0) goto L64
                java.lang.String r0 = "application/json"
                r1.header(r4, r0)
                goto L6d
            L64:
                com.tesla.logging.g r0 = yu.a0.c()
                java.lang.String r3 = "Content-Type already present on request, not setting."
                r0.a(r3)
            L6d:
                java.lang.String r0 = "accept"
            */
            //  java.lang.String r3 = "*/*"
            /*
                r1.header(r0, r3)
                java.lang.String r0 = "charset"
                java.lang.String r3 = "utf-8"
                r1.header(r0, r3)
                java.lang.String r0 = "cache-control"
                java.lang.String r3 = "no-cache"
                r1.header(r0, r3)
                android.content.Context r0 = yu.a0.a(r2)
                java.lang.String r0 = yu.b.l(r0)
                if (r0 != 0) goto L8d
                goto L92
            L8d:
                java.lang.String r2 = "X-Tesla-App-Key"
                r1.header(r2, r0)
            L92:
                java.util.Locale r0 = java.util.Locale.getDefault()
                java.lang.String r0 = r0.getLanguage()
                java.lang.String r2 = "it"
                kotlin.jvm.internal.s.f(r0, r2)
                int r2 = r0.length()
                if (r2 <= 0) goto La7
                r2 = 1
                goto La8
            La7:
                r2 = 0
            La8:
                if (r2 == 0) goto Lab
                r5 = r0
            Lab:
                if (r5 != 0) goto Laf
                java.lang.String r5 = "en"
            Laf:
                java.lang.String r0 = "Accept-Language"
                r1.header(r0, r5)
                vz.b0 r0 = vz.b0.f54756a
                okhttp3.Request r0 = r1.build()
                okhttp3.Response r7 = r7.proceed(r0)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: yu.a0.b.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class c implements Interceptor {

        /* renamed from: a  reason: collision with root package name */
        public static final c f59774a = new c();

        /* loaded from: classes6.dex */
        public static final class a extends RequestBody {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ RequestBody f59775a;

            a(RequestBody requestBody) {
                this.f59775a = requestBody;
            }

            @Override // okhttp3.RequestBody
            public long contentLength() {
                return -1L;
            }

            @Override // okhttp3.RequestBody
            public MediaType contentType() {
                return this.f59775a.contentType();
            }

            @Override // okhttp3.RequestBody
            public void writeTo(okio.g sink) {
                kotlin.jvm.internal.s.g(sink, "sink");
                okio.g c11 = okio.r.c(new okio.n(sink));
                this.f59775a.writeTo(c11);
                c11.close();
            }
        }

        private c() {
        }

        private final RequestBody a(RequestBody requestBody) {
            return new a(requestBody);
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) {
            kotlin.jvm.internal.s.g(chain, "chain");
            Request request = chain.request();
            if (request.body() != null && request.header("Content-Encoding") == null) {
                if (request.header("CompressionDisabled") != null) {
                    return chain.proceed(request.newBuilder().removeHeader("CompressionDisabled").build());
                }
                Request.Builder header = request.newBuilder().header("Content-Encoding", "gzip");
                String method = request.method();
                RequestBody body = request.body();
                kotlin.jvm.internal.s.e(body);
                return chain.proceed(header.method(method, a(body)).build());
            }
            return chain.proceed(request);
        }
    }

    private a0(Context context, js.b bVar) {
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.s.f(applicationContext, "context.applicationContext");
        this.f59771a = e(bVar, applicationContext);
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.s.f(applicationContext2, "context.applicationContext");
        this.f59772b = applicationContext2;
    }

    public /* synthetic */ a0(Context context, js.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, bVar);
    }

    private final OkHttpClient e(js.b bVar, Context context) {
        at.i iVar = new at.i(f59769d);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        OkHttpClient.Builder authenticator = builder.connectTimeout(0L, timeUnit).readTimeout(0L, timeUnit).writeTimeout(0L, timeUnit).cookieJar(new com.facebook.react.modules.network.l()).addInterceptor(new b(this)).addInterceptor(iVar).authenticator(new js.j(bVar));
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof at.b) {
            for (Interceptor interceptor : ((at.b) applicationContext).b()) {
                authenticator.addInterceptor(interceptor);
            }
        }
        authenticator.addInterceptor(c.f59774a);
        authenticator.retryOnConnectionFailure(false);
        return authenticator.build();
    }

    public static final a0 g(Context context, js.b bVar) {
        return f59768c.b(context, bVar);
    }

    public static final String h() {
        return f59768c.c();
    }

    public final OkHttpClient f() {
        return this.f59771a;
    }
}