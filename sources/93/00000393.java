package androidx.camera.core.impl;

import androidx.camera.core.impl.z0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class u0<T> implements z0<T> {

    /* renamed from: a  reason: collision with root package name */
    final androidx.lifecycle.f0<d<T>> f2365a = new androidx.lifecycle.f0<>();

    /* renamed from: b  reason: collision with root package name */
    private final Map<z0.a<T>, c<T>> f2366b = new HashMap();

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f2367a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f2368b;

        a(c cVar, c cVar2) {
            this.f2367a = cVar;
            this.f2368b = cVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            u0.this.f2365a.removeObserver(this.f2367a);
            u0.this.f2365a.observeForever(this.f2368b);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f2370a;

        b(c cVar) {
            this.f2370a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            u0.this.f2365a.removeObserver(this.f2370a);
        }
    }

    /* loaded from: classes.dex */
    private static final class c<T> implements androidx.lifecycle.g0<d<T>> {

        /* renamed from: a  reason: collision with root package name */
        final AtomicBoolean f2372a = new AtomicBoolean(true);

        /* renamed from: b  reason: collision with root package name */
        final z0.a<T> f2373b;

        /* renamed from: c  reason: collision with root package name */
        final Executor f2374c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f2375a;

            a(d dVar) {
                this.f2375a = dVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                if (c.this.f2372a.get()) {
                    if (this.f2375a.a()) {
                        c.this.f2373b.a(this.f2375a.d());
                        return;
                    }
                    v3.h.f(this.f2375a.c());
                    c.this.f2373b.onError(this.f2375a.c());
                }
            }
        }

        c(Executor executor, z0.a<T> aVar) {
            this.f2374c = executor;
            this.f2373b = aVar;
        }

        void a() {
            this.f2372a.set(false);
        }

        @Override // androidx.lifecycle.g0
        /* renamed from: b */
        public void onChanged(d<T> dVar) {
            this.f2374c.execute(new a(dVar));
        }
    }

    /* loaded from: classes.dex */
    public static final class d<T> {

        /* renamed from: a  reason: collision with root package name */
        private T f2377a;

        /* renamed from: b  reason: collision with root package name */
        private Throwable f2378b;

        private d(T t11, Throwable th2) {
            this.f2377a = t11;
            this.f2378b = th2;
        }

        static <T> d<T> b(T t11) {
            return new d<>(t11, null);
        }

        public boolean a() {
            return this.f2378b == null;
        }

        public Throwable c() {
            return this.f2378b;
        }

        public T d() {
            if (a()) {
                return this.f2377a;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[Result: <");
            if (a()) {
                str = "Value: " + this.f2377a;
            } else {
                str = "Error: " + this.f2378b;
            }
            sb2.append(str);
            sb2.append(">]");
            return sb2.toString();
        }
    }

    @Override // androidx.camera.core.impl.z0
    public void a(Executor executor, z0.a<T> aVar) {
        synchronized (this.f2366b) {
            c<T> cVar = this.f2366b.get(aVar);
            if (cVar != null) {
                cVar.a();
            }
            c<T> cVar2 = new c<>(executor, aVar);
            this.f2366b.put(aVar, cVar2);
            b0.a.d().execute(new a(cVar, cVar2));
        }
    }

    @Override // androidx.camera.core.impl.z0
    public void b(z0.a<T> aVar) {
        synchronized (this.f2366b) {
            c<T> remove = this.f2366b.remove(aVar);
            if (remove != null) {
                remove.a();
                b0.a.d().execute(new b(remove));
            }
        }
    }

    public void c(T t11) {
        this.f2365a.postValue(d.b(t11));
    }
}