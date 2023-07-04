package ff;

import android.os.Looper;
import android.os.SystemClock;
import com.facebook.imagepipeline.producers.e;
import com.facebook.imagepipeline.producers.k0;
import com.facebook.imagepipeline.producers.l;
import com.facebook.imagepipeline.producers.p0;
import com.facebook.imagepipeline.producers.w;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes3.dex */
public class b extends com.facebook.imagepipeline.producers.c<c> {

    /* renamed from: a  reason: collision with root package name */
    private final Call.Factory f26217a;

    /* renamed from: b  reason: collision with root package name */
    private final CacheControl f26218b;

    /* renamed from: c  reason: collision with root package name */
    private Executor f26219c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Call f26220a;

        /* renamed from: ff.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class RunnableC0516a implements Runnable {
            RunnableC0516a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f26220a.cancel();
            }
        }

        a(Call call) {
            this.f26220a = call;
        }

        @Override // com.facebook.imagepipeline.producers.q0
        public void b() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                b.this.f26219c.execute(new RunnableC0516a());
            } else {
                this.f26220a.cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ff.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0517b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f26223a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k0.a f26224b;

        C0517b(c cVar, k0.a aVar) {
            this.f26223a = cVar;
            this.f26224b = aVar;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            b.this.l(call, iOException, this.f26224b);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            this.f26223a.f26227g = SystemClock.elapsedRealtime();
            ResponseBody body = response.body();
            try {
                if (body != null) {
                    try {
                    } catch (Exception e11) {
                        b.this.l(call, e11, this.f26224b);
                    }
                    if (!response.isSuccessful()) {
                        b.this.l(call, new IOException("Unexpected HTTP code " + response), this.f26224b);
                        return;
                    }
                    p001if.a c11 = p001if.a.c(response.header("Content-Range"));
                    if (c11 != null && (c11.f30358a != 0 || c11.f30359b != Integer.MAX_VALUE)) {
                        this.f26223a.j(c11);
                        this.f26223a.i(8);
                    }
                    long contentLength = body.contentLength();
                    if (contentLength < 0) {
                        contentLength = 0;
                    }
                    this.f26224b.b(body.byteStream(), (int) contentLength);
                    return;
                }
                b.this.l(call, new IOException("Response body null: " + response), this.f26224b);
            } finally {
                body.close();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class c extends w {

        /* renamed from: f  reason: collision with root package name */
        public long f26226f;

        /* renamed from: g  reason: collision with root package name */
        public long f26227g;

        /* renamed from: h  reason: collision with root package name */
        public long f26228h;

        public c(l<nf.e> lVar, p0 p0Var) {
            super(lVar, p0Var);
        }
    }

    public b(OkHttpClient okHttpClient) {
        this(okHttpClient, okHttpClient.dispatcher().executorService());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(Call call, Exception exc, k0.a aVar) {
        if (call.isCanceled()) {
            aVar.a();
        } else {
            aVar.onFailure(exc);
        }
    }

    @Override // com.facebook.imagepipeline.producers.k0
    /* renamed from: h */
    public c e(l<nf.e> lVar, p0 p0Var) {
        return new c(lVar, p0Var);
    }

    @Override // com.facebook.imagepipeline.producers.k0
    /* renamed from: i */
    public void a(c cVar, k0.a aVar) {
        cVar.f26226f = SystemClock.elapsedRealtime();
        try {
            Request.Builder builder = new Request.Builder().url(cVar.g().toString()).get();
            CacheControl cacheControl = this.f26218b;
            if (cacheControl != null) {
                builder.cacheControl(cacheControl);
            }
            p001if.a c11 = cVar.b().l().c();
            if (c11 != null) {
                builder.addHeader("Range", c11.d());
            }
            j(cVar, aVar, builder.build());
        } catch (Exception e11) {
            aVar.onFailure(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j(c cVar, k0.a aVar, Request request) {
        Call newCall = this.f26217a.newCall(request);
        cVar.b().c(new a(newCall));
        FirebasePerfOkHttpClient.enqueue(newCall, new C0517b(cVar, aVar));
    }

    @Override // com.facebook.imagepipeline.producers.k0
    /* renamed from: k */
    public Map<String, String> d(c cVar, int i11) {
        HashMap hashMap = new HashMap(4);
        hashMap.put("queue_time", Long.toString(cVar.f26227g - cVar.f26226f));
        hashMap.put("fetch_time", Long.toString(cVar.f26228h - cVar.f26227g));
        hashMap.put("total_time", Long.toString(cVar.f26228h - cVar.f26226f));
        hashMap.put("image_size", Integer.toString(i11));
        return hashMap;
    }

    @Override // com.facebook.imagepipeline.producers.k0
    /* renamed from: m */
    public void b(c cVar, int i11) {
        cVar.f26228h = SystemClock.elapsedRealtime();
    }

    public b(Call.Factory factory, Executor executor) {
        this(factory, executor, true);
    }

    public b(Call.Factory factory, Executor executor, boolean z11) {
        this.f26217a = factory;
        this.f26219c = executor;
        this.f26218b = z11 ? new CacheControl.Builder().noStore().build() : null;
    }
}