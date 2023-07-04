package c0;

import androidx.concurrent.futures.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class h<V> implements com.google.common.util.concurrent.c<List<V>> {

    /* renamed from: a  reason: collision with root package name */
    List<? extends com.google.common.util.concurrent.c<? extends V>> f8372a;

    /* renamed from: b  reason: collision with root package name */
    List<V> f8373b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f8374c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicInteger f8375d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.common.util.concurrent.c<List<V>> f8376e = androidx.concurrent.futures.b.a(new a());

    /* renamed from: f  reason: collision with root package name */
    b.a<List<V>> f8377f;

    /* loaded from: classes.dex */
    class a implements b.c<List<V>> {
        a() {
        }

        @Override // androidx.concurrent.futures.b.c
        public Object a(b.a<List<V>> aVar) {
            v3.h.i(h.this.f8377f == null, "The result can only set once!");
            h.this.f8377f = aVar;
            return "ListFuture[" + this + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            hVar.f8373b = null;
            hVar.f8372a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f8380a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.c f8381b;

        c(int i11, com.google.common.util.concurrent.c cVar) {
            this.f8380a = i11;
            this.f8381b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.f(this.f8380a, this.f8381b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(List<? extends com.google.common.util.concurrent.c<? extends V>> list, boolean z11, Executor executor) {
        this.f8372a = (List) v3.h.f(list);
        this.f8373b = new ArrayList(list.size());
        this.f8374c = z11;
        this.f8375d = new AtomicInteger(list.size());
        e(executor);
    }

    private void b() {
        List<? extends com.google.common.util.concurrent.c<? extends V>> list = this.f8372a;
        if (list == null || isDone()) {
            return;
        }
        for (com.google.common.util.concurrent.c<? extends V> cVar : list) {
            while (!cVar.isDone()) {
                try {
                    cVar.get();
                } catch (Error e11) {
                    throw e11;
                } catch (InterruptedException e12) {
                    throw e12;
                } catch (Throwable unused) {
                    if (this.f8374c) {
                        return;
                    }
                }
            }
        }
    }

    private void e(Executor executor) {
        a(new b(), b0.a.a());
        if (this.f8372a.isEmpty()) {
            this.f8377f.c(new ArrayList(this.f8373b));
            return;
        }
        for (int i11 = 0; i11 < this.f8372a.size(); i11++) {
            this.f8373b.add(null);
        }
        List<? extends com.google.common.util.concurrent.c<? extends V>> list = this.f8372a;
        for (int i12 = 0; i12 < list.size(); i12++) {
            com.google.common.util.concurrent.c<? extends V> cVar = list.get(i12);
            cVar.a(new c(i12, cVar), executor);
        }
    }

    @Override // com.google.common.util.concurrent.c
    public void a(Runnable runnable, Executor executor) {
        this.f8376e.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    /* renamed from: c */
    public List<V> get() {
        b();
        return this.f8376e.get();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        List<? extends com.google.common.util.concurrent.c<? extends V>> list = this.f8372a;
        if (list != null) {
            for (com.google.common.util.concurrent.c<? extends V> cVar : list) {
                cVar.cancel(z11);
            }
        }
        return this.f8376e.cancel(z11);
    }

    @Override // java.util.concurrent.Future
    /* renamed from: d */
    public List<V> get(long j11, TimeUnit timeUnit) {
        return this.f8376e.get(j11, timeUnit);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void f(int i11, Future<? extends V> future) {
        b.a<List<V>> aVar;
        ArrayList arrayList;
        int decrementAndGet;
        List<V> list = this.f8373b;
        if (!isDone() && list != 0) {
            try {
                try {
                    try {
                        try {
                            v3.h.i(future.isDone(), "Tried to set value from future which is not done");
                            list.set(i11, f.e(future));
                            decrementAndGet = this.f8375d.decrementAndGet();
                            v3.h.i(decrementAndGet >= 0, "Less than 0 remaining futures");
                        } catch (Error e11) {
                            this.f8377f.f(e11);
                            int decrementAndGet2 = this.f8375d.decrementAndGet();
                            v3.h.i(decrementAndGet2 >= 0, "Less than 0 remaining futures");
                            if (decrementAndGet2 != 0) {
                                return;
                            }
                            List<V> list2 = this.f8373b;
                            if (list2 != null) {
                                aVar = this.f8377f;
                                arrayList = new ArrayList(list2);
                            }
                        } catch (CancellationException unused) {
                            if (this.f8374c) {
                                cancel(false);
                            }
                            int decrementAndGet3 = this.f8375d.decrementAndGet();
                            v3.h.i(decrementAndGet3 >= 0, "Less than 0 remaining futures");
                            if (decrementAndGet3 != 0) {
                                return;
                            }
                            List<V> list3 = this.f8373b;
                            if (list3 != null) {
                                aVar = this.f8377f;
                                arrayList = new ArrayList(list3);
                            }
                        }
                    } catch (RuntimeException e12) {
                        if (this.f8374c) {
                            this.f8377f.f(e12);
                        }
                        int decrementAndGet4 = this.f8375d.decrementAndGet();
                        v3.h.i(decrementAndGet4 >= 0, "Less than 0 remaining futures");
                        if (decrementAndGet4 != 0) {
                            return;
                        }
                        List<V> list4 = this.f8373b;
                        if (list4 != null) {
                            aVar = this.f8377f;
                            arrayList = new ArrayList(list4);
                        }
                    }
                } catch (ExecutionException e13) {
                    if (this.f8374c) {
                        this.f8377f.f(e13.getCause());
                    }
                    int decrementAndGet5 = this.f8375d.decrementAndGet();
                    v3.h.i(decrementAndGet5 >= 0, "Less than 0 remaining futures");
                    if (decrementAndGet5 != 0) {
                        return;
                    }
                    List<V> list5 = this.f8373b;
                    if (list5 != null) {
                        aVar = this.f8377f;
                        arrayList = new ArrayList(list5);
                    }
                }
                if (decrementAndGet == 0) {
                    List<V> list6 = this.f8373b;
                    if (list6 != null) {
                        aVar = this.f8377f;
                        arrayList = new ArrayList(list6);
                        aVar.c(arrayList);
                        return;
                    }
                    v3.h.h(isDone());
                    return;
                }
                return;
            } catch (Throwable th2) {
                int decrementAndGet6 = this.f8375d.decrementAndGet();
                v3.h.i(decrementAndGet6 >= 0, "Less than 0 remaining futures");
                if (decrementAndGet6 == 0) {
                    List<V> list7 = this.f8373b;
                    if (list7 != null) {
                        this.f8377f.c(new ArrayList(list7));
                    } else {
                        v3.h.h(isDone());
                    }
                }
                throw th2;
            }
        }
        v3.h.i(this.f8374c, "Future was done before all dependencies completed");
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f8376e.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f8376e.isDone();
    }
}