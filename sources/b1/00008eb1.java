package okhttp3.internal.cache;

import com.stripe.android.core.networking.NetworkConstantsKt;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.v;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.RealResponseBody;
import okio.c0;
import okio.e0;
import okio.f;
import okio.f0;
import okio.g;
import okio.h;
import okio.r;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/cache/CacheInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/internal/cache/CacheRequest;", "cacheRequest", "Lokhttp3/Response;", "response", "cacheWritingResponse", "Lokhttp3/Interceptor$Chain;", "chain", "intercept", "Lokhttp3/Cache;", "cache", "Lokhttp3/Cache;", "getCache$okhttp", "()Lokhttp3/Cache;", "<init>", "(Lokhttp3/Cache;)V", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class CacheInterceptor implements Interceptor {
    public static final Companion Companion = new Companion(null);
    private final Cache cache;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/cache/CacheInterceptor$Companion;", "", "Lokhttp3/Response;", "response", "stripBody", "Lokhttp3/Headers;", "cachedHeaders", "networkHeaders", "combine", "", "fieldName", "", "isEndToEnd", "isContentSpecificHeader", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Headers combine(Headers headers, Headers headers2) {
            int i11;
            boolean u11;
            boolean H;
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (i11 = 0; i11 < size; i11 = i11 + 1) {
                String name = headers.name(i11);
                String value = headers.value(i11);
                u11 = v.u("Warning", name, true);
                if (u11) {
                    H = v.H(value, "1", false, 2, null);
                    i11 = H ? i11 + 1 : 0;
                }
                if (isContentSpecificHeader(name) || !isEndToEnd(name) || headers2.get(name) == null) {
                    builder.addLenient$okhttp(name, value);
                }
            }
            int size2 = headers2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                String name2 = headers2.name(i12);
                if (!isContentSpecificHeader(name2) && isEndToEnd(name2)) {
                    builder.addLenient$okhttp(name2, headers2.value(i12));
                }
            }
            return builder.build();
        }

        private final boolean isContentSpecificHeader(String str) {
            boolean u11;
            boolean u12;
            boolean u13;
            u11 = v.u("Content-Length", str, true);
            if (u11) {
                return true;
            }
            u12 = v.u("Content-Encoding", str, true);
            if (u12) {
                return true;
            }
            u13 = v.u(NetworkConstantsKt.HEADER_CONTENT_TYPE, str, true);
            return u13;
        }

        private final boolean isEndToEnd(String str) {
            boolean u11;
            boolean u12;
            boolean u13;
            boolean u14;
            boolean u15;
            boolean u16;
            boolean u17;
            boolean u18;
            u11 = v.u("Connection", str, true);
            if (!u11) {
                u12 = v.u("Keep-Alive", str, true);
                if (!u12) {
                    u13 = v.u("Proxy-Authenticate", str, true);
                    if (!u13) {
                        u14 = v.u("Proxy-Authorization", str, true);
                        if (!u14) {
                            u15 = v.u("TE", str, true);
                            if (!u15) {
                                u16 = v.u("Trailers", str, true);
                                if (!u16) {
                                    u17 = v.u("Transfer-Encoding", str, true);
                                    if (!u17) {
                                        u18 = v.u("Upgrade", str, true);
                                        if (!u18) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Response stripBody(Response response) {
            return (response != null ? response.body() : null) != null ? response.newBuilder().body(null).build() : response;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CacheInterceptor(Cache cache) {
        this.cache = cache;
    }

    private final Response cacheWritingResponse(final CacheRequest cacheRequest, Response response) {
        if (cacheRequest == null) {
            return response;
        }
        c0 body = cacheRequest.body();
        ResponseBody body2 = response.body();
        s.e(body2);
        final h source = body2.source();
        final g c11 = r.c(body);
        e0 e0Var = new e0() { // from class: okhttp3.internal.cache.CacheInterceptor$cacheWritingResponse$cacheWritingSource$1
            private boolean cacheRequestClosed;

            @Override // okio.e0, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    this.cacheRequestClosed = true;
                    cacheRequest.abort();
                }
                h.this.close();
            }

            @Override // okio.e0
            public long read(f sink, long j11) {
                s.g(sink, "sink");
                try {
                    long read = h.this.read(sink, j11);
                    if (read == -1) {
                        if (!this.cacheRequestClosed) {
                            this.cacheRequestClosed = true;
                            c11.close();
                        }
                        return -1L;
                    }
                    sink.m(c11.b(), sink.P0() - read, read);
                    c11.mo188I();
                    return read;
                } catch (IOException e11) {
                    if (!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        cacheRequest.abort();
                    }
                    throw e11;
                }
            }

            @Override // okio.e0
            /* renamed from: timeout */
            public f0 mo187timeout() {
                return h.this.mo187timeout();
            }
        };
        return response.newBuilder().body(new RealResponseBody(Response.header$default(response, NetworkConstantsKt.HEADER_CONTENT_TYPE, null, 2, null), response.body().contentLength(), r.d(e0Var))).build();
    }

    public final Cache getCache$okhttp() {
        return this.cache;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        EventListener eventListener;
        ResponseBody body;
        ResponseBody body2;
        s.g(chain, "chain");
        Call call = chain.call();
        Cache cache = this.cache;
        Response response = cache != null ? cache.get$okhttp(chain.request()) : null;
        CacheStrategy compute = new CacheStrategy.Factory(System.currentTimeMillis(), chain.request(), response).compute();
        Request networkRequest = compute.getNetworkRequest();
        Response cacheResponse = compute.getCacheResponse();
        Cache cache2 = this.cache;
        if (cache2 != null) {
            cache2.trackResponse$okhttp(compute);
        }
        RealCall realCall = call instanceof RealCall ? call : null;
        if (realCall == null || (eventListener = realCall.getEventListener$okhttp()) == null) {
            eventListener = EventListener.NONE;
        }
        if (response != null && cacheResponse == null && (body2 = response.body()) != null) {
            Util.closeQuietly(body2);
        }
        if (networkRequest == null && cacheResponse == null) {
            Response build = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1).code(504).message("Unsatisfiable Request (only-if-cached)").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(System.currentTimeMillis()).build();
            eventListener.satisfactionFailure(call, build);
            return build;
        } else if (networkRequest == null) {
            s.e(cacheResponse);
            Response build2 = cacheResponse.newBuilder().cacheResponse(Companion.stripBody(cacheResponse)).build();
            eventListener.cacheHit(call, build2);
            return build2;
        } else {
            if (cacheResponse != null) {
                eventListener.cacheConditionalHit(call, cacheResponse);
            } else if (this.cache != null) {
                eventListener.cacheMiss(call);
            }
            try {
                Response proceed = chain.proceed(networkRequest);
                if (proceed == null && response != null && body != null) {
                }
                if (cacheResponse != null) {
                    if (proceed != null && proceed.code() == 304) {
                        Response.Builder newBuilder = cacheResponse.newBuilder();
                        Companion companion = Companion;
                        Response build3 = newBuilder.headers(companion.combine(cacheResponse.headers(), proceed.headers())).sentRequestAtMillis(proceed.sentRequestAtMillis()).receivedResponseAtMillis(proceed.receivedResponseAtMillis()).cacheResponse(companion.stripBody(cacheResponse)).networkResponse(companion.stripBody(proceed)).build();
                        ResponseBody body3 = proceed.body();
                        s.e(body3);
                        body3.close();
                        Cache cache3 = this.cache;
                        s.e(cache3);
                        cache3.trackConditionalCacheHit$okhttp();
                        this.cache.update$okhttp(cacheResponse, build3);
                        eventListener.cacheHit(call, build3);
                        return build3;
                    }
                    ResponseBody body4 = cacheResponse.body();
                    if (body4 != null) {
                        Util.closeQuietly(body4);
                    }
                }
                s.e(proceed);
                Response.Builder newBuilder2 = proceed.newBuilder();
                Companion companion2 = Companion;
                Response build4 = newBuilder2.cacheResponse(companion2.stripBody(cacheResponse)).networkResponse(companion2.stripBody(proceed)).build();
                if (this.cache != null) {
                    if (HttpHeaders.promisesBody(build4) && CacheStrategy.Companion.isCacheable(build4, networkRequest)) {
                        Response cacheWritingResponse = cacheWritingResponse(this.cache.put$okhttp(build4), build4);
                        if (cacheResponse != null) {
                            eventListener.cacheMiss(call);
                        }
                        return cacheWritingResponse;
                    } else if (HttpMethod.INSTANCE.invalidatesCache(networkRequest.method())) {
                        try {
                            this.cache.remove$okhttp(networkRequest);
                        } catch (IOException unused) {
                        }
                    }
                }
                return build4;
            } finally {
                if (response != null && (body = response.body()) != null) {
                    Util.closeQuietly(body);
                }
            }
        }
    }
}