package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import retrofit2.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class e extends c.a {

    /* renamed from: a  reason: collision with root package name */
    static final c.a f49375a = new e();

    /* loaded from: classes4.dex */
    private static final class a<R> implements retrofit2.c<R, CompletableFuture<R>> {

        /* renamed from: a  reason: collision with root package name */
        private final Type f49376a;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: retrofit2.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public class C1079a implements d<R> {

            /* renamed from: a  reason: collision with root package name */
            private final CompletableFuture<R> f49377a;

            public C1079a(a aVar, CompletableFuture<R> completableFuture) {
                this.f49377a = completableFuture;
            }

            @Override // retrofit2.d
            public void onFailure(retrofit2.b<R> bVar, Throwable th2) {
                this.f49377a.completeExceptionally(th2);
            }

            @Override // retrofit2.d
            public void onResponse(retrofit2.b<R> bVar, s<R> sVar) {
                if (sVar.f()) {
                    this.f49377a.complete(sVar.a());
                } else {
                    this.f49377a.completeExceptionally(new HttpException(sVar));
                }
            }
        }

        a(Type type) {
            this.f49376a = type;
        }

        @Override // retrofit2.c
        /* renamed from: a */
        public CompletableFuture<R> adapt(retrofit2.b<R> bVar) {
            b bVar2 = new b(bVar);
            bVar.enqueue(new C1079a(this, bVar2));
            return bVar2;
        }

        @Override // retrofit2.c
        public Type responseType() {
            return this.f49376a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class b<T> extends CompletableFuture<T> {

        /* renamed from: a  reason: collision with root package name */
        private final retrofit2.b<?> f49378a;

        b(retrofit2.b<?> bVar) {
            this.f49378a = bVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z11) {
            if (z11) {
                this.f49378a.cancel();
            }
            return super.cancel(z11);
        }
    }

    /* loaded from: classes4.dex */
    private static final class c<R> implements retrofit2.c<R, CompletableFuture<s<R>>> {

        /* renamed from: a  reason: collision with root package name */
        private final Type f49379a;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes4.dex */
        public class a implements d<R> {

            /* renamed from: a  reason: collision with root package name */
            private final CompletableFuture<s<R>> f49380a;

            public a(c cVar, CompletableFuture<s<R>> completableFuture) {
                this.f49380a = completableFuture;
            }

            @Override // retrofit2.d
            public void onFailure(retrofit2.b<R> bVar, Throwable th2) {
                this.f49380a.completeExceptionally(th2);
            }

            @Override // retrofit2.d
            public void onResponse(retrofit2.b<R> bVar, s<R> sVar) {
                this.f49380a.complete(sVar);
            }
        }

        c(Type type) {
            this.f49379a = type;
        }

        @Override // retrofit2.c
        /* renamed from: a */
        public CompletableFuture<s<R>> adapt(retrofit2.b<R> bVar) {
            b bVar2 = new b(bVar);
            bVar.enqueue(new a(this, bVar2));
            return bVar2;
        }

        @Override // retrofit2.c
        public Type responseType() {
            return this.f49379a;
        }
    }

    e() {
    }

    @Override // retrofit2.c.a
    public retrofit2.c<?, ?> get(Type type, Annotation[] annotationArr, t tVar) {
        if (c.a.getRawType(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type parameterUpperBound = c.a.getParameterUpperBound(0, (ParameterizedType) type);
            if (c.a.getRawType(parameterUpperBound) != s.class) {
                return new a(parameterUpperBound);
            }
            if (parameterUpperBound instanceof ParameterizedType) {
                return new c(c.a.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}