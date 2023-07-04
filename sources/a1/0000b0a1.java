package retrofit2;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.Objects;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.e0;
import okio.f0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class m<T> implements retrofit2.b<T> {

    /* renamed from: a  reason: collision with root package name */
    private final r f49414a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f49415b;

    /* renamed from: c  reason: collision with root package name */
    private final Call.Factory f49416c;

    /* renamed from: d  reason: collision with root package name */
    private final f<ResponseBody, T> f49417d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f49418e;

    /* renamed from: f  reason: collision with root package name */
    private Call f49419f;

    /* renamed from: g  reason: collision with root package name */
    private Throwable f49420g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f49421h;

    /* loaded from: classes4.dex */
    class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f49422a;

        a(d dVar) {
            this.f49422a = dVar;
        }

        private void a(Throwable th2) {
            try {
                this.f49422a.onFailure(m.this, th2);
            } catch (Throwable th3) {
                x.s(th3);
                th3.printStackTrace();
            }
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            a(iOException);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            try {
                try {
                    this.f49422a.onResponse(m.this, m.this.d(response));
                } catch (Throwable th2) {
                    x.s(th2);
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                x.s(th3);
                a(th3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends ResponseBody {

        /* renamed from: a  reason: collision with root package name */
        private final ResponseBody f49424a;

        /* renamed from: b  reason: collision with root package name */
        private final okio.h f49425b;

        /* renamed from: c  reason: collision with root package name */
        IOException f49426c;

        /* loaded from: classes4.dex */
        class a extends okio.l {
            a(e0 e0Var) {
                super(e0Var);
            }

            @Override // okio.l, okio.e0
            public long read(okio.f fVar, long j11) {
                try {
                    return super.read(fVar, j11);
                } catch (IOException e11) {
                    b.this.f49426c = e11;
                    throw e11;
                }
            }
        }

        b(ResponseBody responseBody) {
            this.f49424a = responseBody;
            this.f49425b = okio.r.d(new a(responseBody.source()));
        }

        void a() {
            IOException iOException = this.f49426c;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f49424a.close();
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.f49424a.contentLength();
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.f49424a.contentType();
        }

        @Override // okhttp3.ResponseBody
        public okio.h source() {
            return this.f49425b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends ResponseBody {

        /* renamed from: a  reason: collision with root package name */
        private final MediaType f49428a;

        /* renamed from: b  reason: collision with root package name */
        private final long f49429b;

        c(MediaType mediaType, long j11) {
            this.f49428a = mediaType;
            this.f49429b = j11;
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.f49429b;
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.f49428a;
        }

        @Override // okhttp3.ResponseBody
        public okio.h source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(r rVar, Object[] objArr, Call.Factory factory, f<ResponseBody, T> fVar) {
        this.f49414a = rVar;
        this.f49415b = objArr;
        this.f49416c = factory;
        this.f49417d = fVar;
    }

    private Call b() {
        Call newCall = this.f49416c.newCall(this.f49414a.a(this.f49415b));
        Objects.requireNonNull(newCall, "Call.Factory returned null.");
        return newCall;
    }

    private Call c() {
        Call call = this.f49419f;
        if (call != null) {
            return call;
        }
        Throwable th2 = this.f49420g;
        if (th2 != null) {
            if (!(th2 instanceof IOException)) {
                if (th2 instanceof RuntimeException) {
                    throw ((RuntimeException) th2);
                }
                throw ((Error) th2);
            }
            throw ((IOException) th2);
        }
        try {
            Call b11 = b();
            this.f49419f = b11;
            return b11;
        } catch (IOException | Error | RuntimeException e11) {
            x.s(e11);
            this.f49420g = e11;
            throw e11;
        }
    }

    @Override // retrofit2.b
    /* renamed from: a */
    public m<T> mo117clone() {
        return new m<>(this.f49414a, this.f49415b, this.f49416c, this.f49417d);
    }

    @Override // retrofit2.b
    public void cancel() {
        Call call;
        this.f49418e = true;
        synchronized (this) {
            call = this.f49419f;
        }
        if (call != null) {
            call.cancel();
        }
    }

    s<T> d(Response response) {
        ResponseBody body = response.body();
        Response build = response.newBuilder().body(new c(body.contentType(), body.contentLength())).build();
        int code = build.code();
        if (code < 200 || code >= 300) {
            try {
                return s.c(x.a(body), build);
            } finally {
                body.close();
            }
        } else if (code != 204 && code != 205) {
            b bVar = new b(body);
            try {
                return s.i(this.f49417d.convert(bVar), build);
            } catch (RuntimeException e11) {
                bVar.a();
                throw e11;
            }
        } else {
            body.close();
            return s.i(null, build);
        }
    }

    @Override // retrofit2.b
    public void enqueue(d<T> dVar) {
        Call call;
        Throwable th2;
        Objects.requireNonNull(dVar, "callback == null");
        synchronized (this) {
            if (!this.f49421h) {
                this.f49421h = true;
                call = this.f49419f;
                th2 = this.f49420g;
                if (call == null && th2 == null) {
                    Call b11 = b();
                    this.f49419f = b11;
                    call = b11;
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th2 != null) {
            dVar.onFailure(this, th2);
            return;
        }
        if (this.f49418e) {
            call.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(call, new a(dVar));
    }

    @Override // retrofit2.b
    public s<T> execute() {
        Call c11;
        synchronized (this) {
            if (!this.f49421h) {
                this.f49421h = true;
                c11 = c();
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.f49418e) {
            c11.cancel();
        }
        return d(FirebasePerfOkHttpClient.execute(c11));
    }

    @Override // retrofit2.b
    public boolean isCanceled() {
        boolean z11 = true;
        if (this.f49418e) {
            return true;
        }
        synchronized (this) {
            Call call = this.f49419f;
            if (call == null || !call.isCanceled()) {
                z11 = false;
            }
        }
        return z11;
    }

    @Override // retrofit2.b
    public synchronized boolean isExecuted() {
        return this.f49421h;
    }

    @Override // retrofit2.b
    public synchronized Request request() {
        try {
        } catch (IOException e11) {
            throw new RuntimeException("Unable to create request.", e11);
        }
        return c().request();
    }

    @Override // retrofit2.b
    public synchronized f0 timeout() {
        try {
        } catch (IOException e11) {
            throw new RuntimeException("Unable to create call.", e11);
        }
        return c().timeout();
    }
}