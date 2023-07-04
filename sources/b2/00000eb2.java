package c0;

import androidx.concurrent.futures.b;
import c0.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    private static final p.a<?, ?> f8362a = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a<I, O> implements c0.a<I, O> {

        /* renamed from: a */
        final /* synthetic */ p.a f8363a;

        a(p.a aVar) {
            this.f8363a = aVar;
        }

        @Override // c0.a
        public com.google.common.util.concurrent.c<O> apply(I i11) {
            return f.h(this.f8363a.apply(i11));
        }
    }

    /* loaded from: classes.dex */
    class b implements p.a<Object, Object> {
        b() {
        }

        @Override // p.a
        public Object apply(Object obj) {
            return obj;
        }
    }

    /* loaded from: classes.dex */
    public class c<I> implements c0.c<I> {

        /* renamed from: a */
        final /* synthetic */ b.a f8364a;

        /* renamed from: b */
        final /* synthetic */ p.a f8365b;

        c(b.a aVar, p.a aVar2) {
            this.f8364a = aVar;
            this.f8365b = aVar2;
        }

        @Override // c0.c
        public void onFailure(Throwable th2) {
            this.f8364a.f(th2);
        }

        @Override // c0.c
        public void onSuccess(I i11) {
            try {
                this.f8364a.c(this.f8365b.apply(i11));
            } catch (Throwable th2) {
                this.f8364a.f(th2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ com.google.common.util.concurrent.c f8366a;

        d(com.google.common.util.concurrent.c cVar) {
            this.f8366a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8366a.cancel(true);
        }
    }

    /* loaded from: classes.dex */
    public static final class e<V> implements Runnable {

        /* renamed from: a */
        final Future<V> f8367a;

        /* renamed from: b */
        final c0.c<? super V> f8368b;

        e(Future<V> future, c0.c<? super V> cVar) {
            this.f8367a = future;
            this.f8368b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f8368b.onSuccess(f.d(this.f8367a));
            } catch (Error e11) {
                e = e11;
                this.f8368b.onFailure(e);
            } catch (RuntimeException e12) {
                e = e12;
                this.f8368b.onFailure(e);
            } catch (ExecutionException e13) {
                this.f8368b.onFailure(e13.getCause());
            }
        }

        public String toString() {
            return e.class.getSimpleName() + "," + this.f8368b;
        }
    }

    public static <V> void b(com.google.common.util.concurrent.c<V> cVar, c0.c<? super V> cVar2, Executor executor) {
        v3.h.f(cVar2);
        cVar.a(new e(cVar, cVar2), executor);
    }

    public static <V> com.google.common.util.concurrent.c<List<V>> c(Collection<? extends com.google.common.util.concurrent.c<? extends V>> collection) {
        return new h(new ArrayList(collection), true, b0.a.a());
    }

    public static <V> V d(Future<V> future) {
        boolean isDone = future.isDone();
        v3.h.i(isDone, "Future was expected to be done, " + future);
        return (V) e(future);
    }

    public static <V> V e(Future<V> future) {
        V v11;
        boolean z11 = false;
        while (true) {
            try {
                v11 = future.get();
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        return v11;
    }

    public static <V> com.google.common.util.concurrent.c<V> f(Throwable th2) {
        return new g.a(th2);
    }

    public static <V> ScheduledFuture<V> g(Throwable th2) {
        return new g.b(th2);
    }

    public static <V> com.google.common.util.concurrent.c<V> h(V v11) {
        if (v11 == null) {
            return g.b();
        }
        return new g.c(v11);
    }

    public static /* synthetic */ Object i(com.google.common.util.concurrent.c cVar, b.a aVar) {
        m(false, cVar, f8362a, aVar, b0.a.a());
        return "nonCancellationPropagating[" + cVar + "]";
    }

    public static <V> com.google.common.util.concurrent.c<V> j(final com.google.common.util.concurrent.c<V> cVar) {
        v3.h.f(cVar);
        return cVar.isDone() ? cVar : androidx.concurrent.futures.b.a(new b.c() { // from class: c0.e
            @Override // androidx.concurrent.futures.b.c
            public final Object a(b.a aVar) {
                Object i11;
                i11 = f.i(cVar, aVar);
                return i11;
            }
        });
    }

    public static <V> void k(com.google.common.util.concurrent.c<V> cVar, b.a<V> aVar) {
        l(cVar, f8362a, aVar, b0.a.a());
    }

    public static <I, O> void l(com.google.common.util.concurrent.c<I> cVar, p.a<? super I, ? extends O> aVar, b.a<O> aVar2, Executor executor) {
        m(true, cVar, aVar, aVar2, executor);
    }

    private static <I, O> void m(boolean z11, com.google.common.util.concurrent.c<I> cVar, p.a<? super I, ? extends O> aVar, b.a<O> aVar2, Executor executor) {
        v3.h.f(cVar);
        v3.h.f(aVar);
        v3.h.f(aVar2);
        v3.h.f(executor);
        b(cVar, new c(aVar2, aVar), executor);
        if (z11) {
            aVar2.a(new d(cVar), b0.a.a());
        }
    }

    public static <V> com.google.common.util.concurrent.c<List<V>> n(Collection<? extends com.google.common.util.concurrent.c<? extends V>> collection) {
        return new h(new ArrayList(collection), false, b0.a.a());
    }

    public static <I, O> com.google.common.util.concurrent.c<O> o(com.google.common.util.concurrent.c<I> cVar, p.a<? super I, ? extends O> aVar, Executor executor) {
        v3.h.f(aVar);
        return p(cVar, new a(aVar), executor);
    }

    public static <I, O> com.google.common.util.concurrent.c<O> p(com.google.common.util.concurrent.c<I> cVar, c0.a<? super I, ? extends O> aVar, Executor executor) {
        c0.b bVar = new c0.b(aVar, cVar);
        cVar.a(bVar, executor);
        return bVar;
    }
}