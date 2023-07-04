package io.grpc.internal;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class e2 {

    /* renamed from: d  reason: collision with root package name */
    private static final e2 f30778d = new e2(new a());

    /* renamed from: a  reason: collision with root package name */
    private final IdentityHashMap<d<?>, c> f30779a = new IdentityHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final e f30780b;

    /* renamed from: c  reason: collision with root package name */
    private ScheduledExecutorService f30781c;

    /* loaded from: classes5.dex */
    class a implements e {
        a() {
        }

        @Override // io.grpc.internal.e2.e
        public ScheduledExecutorService a() {
            return Executors.newSingleThreadScheduledExecutor(q0.i("grpc-shared-destroyer-%d", true));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f30782a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f30783b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f30784c;

        b(c cVar, d dVar, Object obj) {
            this.f30782a = cVar;
            this.f30783b = dVar;
            this.f30784c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (e2.this) {
                if (this.f30782a.f30787b == 0) {
                    this.f30783b.b(this.f30784c);
                    e2.this.f30779a.remove(this.f30783b);
                    if (e2.this.f30779a.isEmpty()) {
                        e2.this.f30781c.shutdown();
                        e2.this.f30781c = null;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final Object f30786a;

        /* renamed from: b  reason: collision with root package name */
        int f30787b;

        /* renamed from: c  reason: collision with root package name */
        ScheduledFuture<?> f30788c;

        c(Object obj) {
            this.f30786a = obj;
        }
    }

    /* loaded from: classes5.dex */
    public interface d<T> {
        void b(T t11);

        T create();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public interface e {
        ScheduledExecutorService a();
    }

    e2(e eVar) {
        this.f30780b = eVar;
    }

    public static <T> T d(d<T> dVar) {
        return (T) f30778d.e(dVar);
    }

    public static <T> T f(d<T> dVar, T t11) {
        return (T) f30778d.g(dVar, t11);
    }

    synchronized <T> T e(d<T> dVar) {
        c cVar;
        cVar = this.f30779a.get(dVar);
        if (cVar == null) {
            cVar = new c(dVar.create());
            this.f30779a.put(dVar, cVar);
        }
        ScheduledFuture<?> scheduledFuture = cVar.f30788c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            cVar.f30788c = null;
        }
        cVar.f30787b++;
        return (T) cVar.f30786a;
    }

    synchronized <T> T g(d<T> dVar, T t11) {
        c cVar = this.f30779a.get(dVar);
        if (cVar != null) {
            com.google.common.base.u.e(t11 == cVar.f30786a, "Releasing the wrong instance");
            com.google.common.base.u.v(cVar.f30787b > 0, "Refcount has already reached zero");
            int i11 = cVar.f30787b - 1;
            cVar.f30787b = i11;
            if (i11 == 0) {
                com.google.common.base.u.v(cVar.f30788c == null, "Destroy task already scheduled");
                if (this.f30781c == null) {
                    this.f30781c = this.f30780b.a();
                }
                cVar.f30788c = this.f30781c.schedule(new c1(new b(cVar, dVar, t11)), 1L, TimeUnit.SECONDS);
            }
        } else {
            throw new IllegalArgumentException("No cached instance found for " + dVar);
        }
        return null;
    }
}