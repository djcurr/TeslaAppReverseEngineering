package com.dylanvann.fastimage;

import android.content.Context;
import com.bumptech.glide.Registry;
import com.bumptech.glide.integration.okhttp3.b;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import na.g;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.e0;
import okio.f;
import okio.h;
import okio.l;
import okio.r;

/* loaded from: classes.dex */
public class FastImageOkHttpProgressGlideModule extends wa.c {
    private static b progressListener = new b(null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Interceptor {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f11032a;

        a(d dVar) {
            this.f11032a = dVar;
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) {
            Request request = chain.request();
            Response proceed = chain.proceed(request);
            return proceed.newBuilder().body(new c(request.url().toString(), proceed.body(), this.f11032a)).build();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface d {
        void a(String str, long j11, long j12);
    }

    private static Interceptor createInterceptor(d dVar) {
        return new a(dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void expect(String str, FastImageProgressListener fastImageProgressListener) {
        progressListener.b(str, fastImageProgressListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void forget(String str) {
        progressListener.c(str);
    }

    @Override // wa.c
    public void registerComponents(Context context, com.bumptech.glide.c cVar, Registry registry) {
        registry.r(g.class, InputStream.class, new b.a(com.facebook.react.modules.network.g.f().newBuilder().addInterceptor(createInterceptor(progressListener)).build()));
    }

    /* loaded from: classes.dex */
    private static class b implements d {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, FastImageProgressListener> f11033a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, Long> f11034b;

        private b() {
            this.f11033a = new WeakHashMap();
            this.f11034b = new HashMap();
        }

        private boolean d(String str, long j11, long j12, float f11) {
            if (f11 != BitmapDescriptorFactory.HUE_RED && j11 != 0 && j12 != j11) {
                long j13 = ((((float) j11) * 100.0f) / ((float) j12)) / f11;
                Long l11 = this.f11034b.get(str);
                if (l11 != null && j13 == l11.longValue()) {
                    return false;
                }
                this.f11034b.put(str, Long.valueOf(j13));
            }
            return true;
        }

        @Override // com.dylanvann.fastimage.FastImageOkHttpProgressGlideModule.d
        public void a(String str, long j11, long j12) {
            FastImageProgressListener fastImageProgressListener = this.f11033a.get(str);
            if (fastImageProgressListener == null) {
                return;
            }
            if (j12 <= j11) {
                c(str);
            }
            if (d(str, j11, j12, fastImageProgressListener.getGranularityPercentage())) {
                fastImageProgressListener.onProgress(str, j11, j12);
            }
        }

        void b(String str, FastImageProgressListener fastImageProgressListener) {
            this.f11033a.put(str, fastImageProgressListener);
        }

        void c(String str) {
            this.f11033a.remove(str);
            this.f11034b.remove(str);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    private static class c extends ResponseBody {

        /* renamed from: a  reason: collision with root package name */
        private final String f11035a;

        /* renamed from: b  reason: collision with root package name */
        private final ResponseBody f11036b;

        /* renamed from: c  reason: collision with root package name */
        private final d f11037c;

        /* renamed from: d  reason: collision with root package name */
        private h f11038d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends l {

            /* renamed from: a  reason: collision with root package name */
            long f11039a;

            a(e0 e0Var) {
                super(e0Var);
                this.f11039a = 0L;
            }

            @Override // okio.l, okio.e0
            public long read(f fVar, long j11) {
                long read = super.read(fVar, j11);
                long contentLength = c.this.f11036b.contentLength();
                if (read == -1) {
                    this.f11039a = contentLength;
                } else {
                    this.f11039a += read;
                }
                c.this.f11037c.a(c.this.f11035a, this.f11039a, contentLength);
                return read;
            }
        }

        c(String str, ResponseBody responseBody, d dVar) {
            this.f11035a = str;
            this.f11036b = responseBody;
            this.f11037c = dVar;
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.f11036b.contentLength();
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.f11036b.contentType();
        }

        @Override // okhttp3.ResponseBody
        public h source() {
            if (this.f11038d == null) {
                this.f11038d = r.d(source(this.f11036b.source()));
            }
            return this.f11038d;
        }

        private e0 source(e0 e0Var) {
            return new a(e0Var);
        }
    }
}