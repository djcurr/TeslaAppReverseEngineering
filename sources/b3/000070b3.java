package gu;

import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.tesla.data.HttpMethodType;
import com.tesla.data.oapi.OwnerApiEndpoint;
import com.tesla.messagebuilder.util.RemoteBuildingRequestBody;
import com.tesla.messagebuilder.util.RemoteBuildingResponse;
import com.tesla.messagebuilder.util.Response;
import gu.o;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.i;
import yu.f;
import yu.y;

/* loaded from: classes6.dex */
public final class o implements p {

    /* renamed from: c */
    public static final a f28120c = new a(null);

    /* renamed from: a */
    private final y f28121a;

    /* renamed from: b */
    private final com.tesla.data.oapi.h f28122b;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o a(y sendOwnerRequest, com.tesla.data.oapi.h endpoints) {
            kotlin.jvm.internal.s.g(sendOwnerRequest, "sendOwnerRequest");
            kotlin.jvm.internal.s.g(endpoints, "endpoints");
            return new o(sendOwnerRequest, endpoints, null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class b {

        /* renamed from: a */
        private final HttpMethodType f28123a;

        /* renamed from: b */
        private final String f28124b;

        /* renamed from: c */
        private final Map<String, Object> f28125c;

        /* renamed from: d */
        private final String f28126d;

        public b(HttpMethodType method, String url, Map<String, ? extends Object> urlParams, String data) {
            kotlin.jvm.internal.s.g(method, "method");
            kotlin.jvm.internal.s.g(url, "url");
            kotlin.jvm.internal.s.g(urlParams, "urlParams");
            kotlin.jvm.internal.s.g(data, "data");
            this.f28123a = method;
            this.f28124b = url;
            this.f28125c = urlParams;
            this.f28126d = data;
        }

        public final HttpMethodType a() {
            return this.f28123a;
        }

        public final String b() {
            return this.f28124b;
        }

        public final Map<String, Object> c() {
            return this.f28125c;
        }

        public final String d() {
            return this.f28126d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f28123a == bVar.f28123a && kotlin.jvm.internal.s.c(this.f28124b, bVar.f28124b) && kotlin.jvm.internal.s.c(this.f28125c, bVar.f28125c) && kotlin.jvm.internal.s.c(this.f28126d, bVar.f28126d);
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f28123a.hashCode() * 31) + this.f28124b.hashCode()) * 31) + this.f28125c.hashCode()) * 31) + this.f28126d.hashCode();
        }

        public String toString() {
            HttpMethodType httpMethodType = this.f28123a;
            String str = this.f28124b;
            Map<String, Object> map = this.f28125c;
            String str2 = this.f28126d;
            return "RequestParams(method=" + httpMethodType + ", url=" + str + ", urlParams=" + map + ", data=" + str2 + ")";
        }
    }

    private o(y yVar, com.tesla.data.oapi.h hVar) {
        this.f28121a = yVar;
        this.f28122b = hVar;
    }

    public /* synthetic */ o(y yVar, com.tesla.data.oapi.h hVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(yVar, hVar);
    }

    public static /* synthetic */ yt.f b(uu.h hVar, k kVar, com.tesla.data.oapi.k kVar2) {
        return g(hVar, kVar, kVar2);
    }

    public static /* synthetic */ b c(o oVar, String str, uu.h hVar, k kVar) {
        return e(oVar, str, hVar, kVar);
    }

    public static /* synthetic */ hy.q d(o oVar, b bVar) {
        return f(oVar, bVar);
    }

    public static final b e(o this$0, String commandGenerationEndpoint, uu.h request, k params) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(commandGenerationEndpoint, "$commandGenerationEndpoint");
        kotlin.jvm.internal.s.g(request, "$request");
        kotlin.jvm.internal.s.g(params, "$params");
        OwnerApiEndpoint c11 = this$0.f28122b.c(commandGenerationEndpoint);
        if (c11 != null) {
            HttpMethodType component1 = c11.component1();
            String component2 = c11.component2();
            String data = iu.a.f32771a.c().i(new RemoteBuildingRequestBody(c.a(request.A()), params.e()));
            Map<String, String> b11 = c.b(request);
            kotlin.jvm.internal.s.f(data, "data");
            return new b(component1, component2, b11, data);
        }
        throw new IllegalStateException(commandGenerationEndpoint + " not found in endpoints");
    }

    public static final hy.q f(o this$0, b bVar) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        return f.a.b(this$0.f28121a, bVar.a(), bVar.b(), bVar.c(), bVar.d(), null, null, null, false, false, DownloaderService.STATUS_HTTP_EXCEPTION, null);
    }

    public static final yt.f g(uu.h request, k params, com.tesla.data.oapi.k kVar) {
        kotlin.jvm.internal.s.g(request, "$request");
        kotlin.jvm.internal.s.g(params, "$params");
        com.tesla.data.oapi.j g11 = kVar.g();
        if (!g11.isLocalError()) {
            RemoteBuildingResponse c11 = iu.a.f32771a.d().c(String.valueOf(kVar.e()));
            Response response = c11 == null ? null : c11.getResponse();
            request.c("received result status code: " + g11);
            if (g11.isSuccess()) {
                if ((response != null ? response.getEncodedRoutableMessage() : null) != null) {
                    yt.f decode = yt.f.f59754k.decode(zu.j.a(response.getEncodedRoutableMessage()));
                    vu.c e11 = params.e();
                    if (e11 != null) {
                        e11.k();
                    }
                    return yt.f.b(decode, new yt.a(request.p(), null, null, 6, null), new yt.a(null, request.B(), null, 5, null), null, null, i.a.h(okio.i.f42657e, new byte[1], 0, 0, 3, null), 0, null, null, null, null, null, 2028, null);
                }
            }
            throw new r(null, g11, kVar.e(), ot.f.RESULT_SERVER_ERROR, null, null, 49, null);
        }
        throw new r(null, null, null, ot.f.RESULT_NO_NETWORK, null, null, 55, null);
    }

    @Override // gu.p
    public hy.m<yt.f> a(final k params) {
        kotlin.jvm.internal.s.g(params, "params");
        final uu.h c11 = params.c();
        final String c12 = c.c(c11.A());
        if (c12 != null) {
            c11.c("start_build_remotely");
            hy.m<yt.f> o11 = hy.m.l(new Callable() { // from class: gu.l
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return o.c(o.this, c12, c11, params);
                }
            }).k(new ky.h() { // from class: gu.m
                {
                    o.this = this;
                }

                @Override // ky.h
                public final Object apply(Object obj) {
                    return o.d(o.this, (o.b) obj);
                }
            }).o(new ky.h() { // from class: gu.n
                @Override // ky.h
                public final Object apply(Object obj) {
                    return o.b(uu.h.this, params, (com.tesla.data.oapi.k) obj);
                }
            });
            kotlin.jvm.internal.s.f(o11, "fromCallable {\n        v…      )\n        }\n      }");
            return o11;
        }
        String m11 = c11.m();
        throw new IllegalStateException(m11 + " does not have remote endpoint");
    }
}