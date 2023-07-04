package c1;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class t1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<j1.d> f8692a = new AtomicReference<>(j1.e.a());

    /* renamed from: b  reason: collision with root package name */
    private final Object f8693b = new Object();

    public final T a() {
        return (T) this.f8692a.get().b(Thread.currentThread().getId());
    }

    public final void b(T t11) {
        long id2 = Thread.currentThread().getId();
        synchronized (this.f8693b) {
            j1.d dVar = this.f8692a.get();
            if (dVar.d(id2, t11)) {
                return;
            }
            this.f8692a.set(dVar.c(id2, t11));
            vz.b0 b0Var = vz.b0.f54756a;
        }
    }
}