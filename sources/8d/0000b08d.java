package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import okhttp3.Request;
import okio.f0;
import retrofit2.c;
import retrofit2.g;

/* loaded from: classes4.dex */
public final class g extends c.a {

    /* renamed from: a */
    private final Executor f49381a;

    /* loaded from: classes4.dex */
    class a implements c<Object, retrofit2.b<?>> {

        /* renamed from: a */
        final /* synthetic */ Type f49382a;

        /* renamed from: b */
        final /* synthetic */ Executor f49383b;

        a(g gVar, Type type, Executor executor) {
            this.f49382a = type;
            this.f49383b = executor;
        }

        @Override // retrofit2.c
        /* renamed from: a */
        public retrofit2.b<Object> adapt(retrofit2.b<Object> bVar) {
            Executor executor = this.f49383b;
            return executor == null ? bVar : new b(executor, bVar);
        }

        @Override // retrofit2.c
        public Type responseType() {
            return this.f49382a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b<T> implements retrofit2.b<T> {

        /* renamed from: a */
        final Executor f49384a;

        /* renamed from: b */
        final retrofit2.b<T> f49385b;

        /* loaded from: classes4.dex */
        public class a implements d<T> {

            /* renamed from: a */
            final /* synthetic */ d f49386a;

            a(d dVar) {
                b.this = r1;
                this.f49386a = dVar;
            }

            public static /* synthetic */ void a(a aVar, d dVar, Throwable th2) {
                aVar.c(dVar, th2);
            }

            public static /* synthetic */ void b(a aVar, d dVar, s sVar) {
                aVar.d(dVar, sVar);
            }

            public /* synthetic */ void c(d dVar, Throwable th2) {
                dVar.onFailure(b.this, th2);
            }

            public /* synthetic */ void d(d dVar, s sVar) {
                if (b.this.f49385b.isCanceled()) {
                    dVar.onFailure(b.this, new IOException("Canceled"));
                } else {
                    dVar.onResponse(b.this, sVar);
                }
            }

            @Override // retrofit2.d
            public void onFailure(retrofit2.b<T> bVar, final Throwable th2) {
                Executor executor = b.this.f49384a;
                final d dVar = this.f49386a;
                executor.execute(new Runnable() { // from class: retrofit2.h
                    {
                        g.b.a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        g.b.a.a(g.b.a.this, dVar, th2);
                    }
                });
            }

            @Override // retrofit2.d
            public void onResponse(retrofit2.b<T> bVar, final s<T> sVar) {
                Executor executor = b.this.f49384a;
                final d dVar = this.f49386a;
                executor.execute(new Runnable() { // from class: retrofit2.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.b.a.b(g.b.a.this, dVar, sVar);
                    }
                });
            }
        }

        b(Executor executor, retrofit2.b<T> bVar) {
            this.f49384a = executor;
            this.f49385b = bVar;
        }

        @Override // retrofit2.b
        public void cancel() {
            this.f49385b.cancel();
        }

        @Override // retrofit2.b
        public void enqueue(d<T> dVar) {
            Objects.requireNonNull(dVar, "callback == null");
            this.f49385b.enqueue(new a(dVar));
        }

        @Override // retrofit2.b
        public s<T> execute() {
            return this.f49385b.execute();
        }

        @Override // retrofit2.b
        public boolean isCanceled() {
            return this.f49385b.isCanceled();
        }

        @Override // retrofit2.b
        public boolean isExecuted() {
            return this.f49385b.isExecuted();
        }

        @Override // retrofit2.b
        public Request request() {
            return this.f49385b.request();
        }

        @Override // retrofit2.b
        public f0 timeout() {
            return this.f49385b.timeout();
        }

        @Override // retrofit2.b
        public retrofit2.b<T> clone() {
            return new b(this.f49384a, this.f49385b.mo117clone());
        }
    }

    public g(Executor executor) {
        this.f49381a = executor;
    }

    @Override // retrofit2.c.a
    public c<?, ?> get(Type type, Annotation[] annotationArr, t tVar) {
        if (c.a.getRawType(type) != retrofit2.b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(this, x.g(0, (ParameterizedType) type), x.l(annotationArr, v.class) ? null : this.f49381a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}