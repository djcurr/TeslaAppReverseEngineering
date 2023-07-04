package com.plaid.internal;

import com.plaid.internal.a2;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.t;

/* loaded from: classes2.dex */
public final class ja {

    /* renamed from: e  reason: collision with root package name */
    public static final a f18891e = new a();

    /* renamed from: f  reason: collision with root package name */
    public static volatile ja f18892f;

    /* renamed from: a  reason: collision with root package name */
    public final String f18893a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, retrofit2.t> f18894b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final vz.k f18895c = vz.l.a(new b());

    /* renamed from: d  reason: collision with root package name */
    public HttpLoggingInterceptor f18896d;

    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.a<OkHttpClient.Builder> {
        public b() {
            super(0);
        }

        @Override // h00.a
        public OkHttpClient.Builder invoke() {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            ja jaVar = ja.this;
            HttpLoggingInterceptor httpLoggingInterceptor = jaVar.f18896d;
            if (httpLoggingInterceptor != null) {
                builder.addNetworkInterceptor(httpLoggingInterceptor);
            }
            builder.addInterceptor(new ka(jaVar));
            builder.readTimeout(10L, TimeUnit.MINUTES);
            return builder;
        }
    }

    public ja(boolean z11, String str) {
        this.f18893a = str;
        if (z11) {
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, null);
            httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);
            this.f18896d = httpLoggingInterceptor;
        }
    }

    public final retrofit2.t a(String baseUrl, la options) {
        j80.a g11;
        kotlin.jvm.internal.s.g(baseUrl, "baseUrl");
        kotlin.jvm.internal.s.g(options, "options");
        retrofit2.t tVar = this.f18894b.get(baseUrl);
        if (tVar == null) {
            OkHttpClient.Builder builder = (OkHttpClient.Builder) this.f18895c.getValue();
            SocketFactory socketFactory = options.f18982b;
            if (socketFactory != null) {
                builder.socketFactory(socketFactory);
            }
            com.google.gson.e eVar = options.f18981a;
            if (eVar == null) {
                g11 = j80.a.f();
            } else {
                g11 = j80.a.g(eVar);
            }
            t.b g12 = new t.b().g(((OkHttpClient.Builder) this.f18895c.getValue()).build());
            a2.a aVar = a2.f18156a;
            t.b a11 = g12.a(new a2());
            kotlin.jvm.internal.s.f(a11, "Builder()\n      .client(…lAdapterFactory.create())");
            a11.c(baseUrl);
            a11.b(l80.a.f());
            a11.b(g11);
            retrofit2.t retrofit = a11.e();
            Map<String, retrofit2.t> map = this.f18894b;
            kotlin.jvm.internal.s.f(retrofit, "retrofit");
            map.put(baseUrl, retrofit);
            return retrofit;
        }
        return tVar;
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public final ja a(boolean z11, String str) {
            ja jaVar = ja.f18892f;
            if (jaVar == null) {
                synchronized (this) {
                    jaVar = ja.f18892f;
                    if (jaVar == null) {
                        jaVar = new ja(z11, str);
                        ja.f18892f = jaVar;
                    }
                }
            }
            return jaVar;
        }
    }
}