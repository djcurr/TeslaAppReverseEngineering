package c0;

import androidx.concurrent.futures.b;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class d<V> implements com.google.common.util.concurrent.c<V> {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.common.util.concurrent.c<V> f8358a;

    /* renamed from: b  reason: collision with root package name */
    b.a<V> f8359b;

    /* loaded from: classes.dex */
    class a implements b.c<V> {
        a() {
        }

        @Override // androidx.concurrent.futures.b.c
        public Object a(b.a<V> aVar) {
            v3.h.i(d.this.f8359b == null, "The result can only set once!");
            d.this.f8359b = aVar;
            return "FutureChain[" + d.this + "]";
        }
    }

    d(com.google.common.util.concurrent.c<V> cVar) {
        this.f8358a = (com.google.common.util.concurrent.c) v3.h.f(cVar);
    }

    public static <V> d<V> b(com.google.common.util.concurrent.c<V> cVar) {
        return cVar instanceof d ? (d) cVar : new d<>(cVar);
    }

    @Override // com.google.common.util.concurrent.c
    public void a(Runnable runnable, Executor executor) {
        this.f8358a.a(runnable, executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(V v11) {
        b.a<V> aVar = this.f8359b;
        if (aVar != null) {
            return aVar.c(v11);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        return this.f8358a.cancel(z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(Throwable th2) {
        b.a<V> aVar = this.f8359b;
        if (aVar != null) {
            return aVar.f(th2);
        }
        return false;
    }

    public final <T> d<T> e(p.a<? super V, T> aVar, Executor executor) {
        return (d) f.o(this, aVar, executor);
    }

    public final <T> d<T> f(c0.a<? super V, T> aVar, Executor executor) {
        return (d) f.p(this, aVar, executor);
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.f8358a.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f8358a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f8358a.isDone();
    }

    @Override // java.util.concurrent.Future
    public V get(long j11, TimeUnit timeUnit) {
        return this.f8358a.get(j11, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d() {
        this.f8358a = androidx.concurrent.futures.b.a(new a());
    }
}