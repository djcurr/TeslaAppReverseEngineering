package androidx.concurrent.futures;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class b {

    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        Object f3349a;

        /* renamed from: b  reason: collision with root package name */
        d<T> f3350b;

        /* renamed from: c  reason: collision with root package name */
        private androidx.concurrent.futures.c<Void> f3351c = androidx.concurrent.futures.c.s();

        /* renamed from: d  reason: collision with root package name */
        private boolean f3352d;

        a() {
        }

        private void e() {
            this.f3349a = null;
            this.f3350b = null;
            this.f3351c = null;
        }

        public void a(Runnable runnable, Executor executor) {
            androidx.concurrent.futures.c<Void> cVar = this.f3351c;
            if (cVar != null) {
                cVar.a(runnable, executor);
            }
        }

        void b() {
            this.f3349a = null;
            this.f3350b = null;
            this.f3351c.p(null);
        }

        public boolean c(T t11) {
            boolean z11 = true;
            this.f3352d = true;
            d<T> dVar = this.f3350b;
            z11 = (dVar == null || !dVar.c(t11)) ? false : false;
            if (z11) {
                e();
            }
            return z11;
        }

        public boolean d() {
            boolean z11 = true;
            this.f3352d = true;
            d<T> dVar = this.f3350b;
            z11 = (dVar == null || !dVar.b(true)) ? false : false;
            if (z11) {
                e();
            }
            return z11;
        }

        public boolean f(Throwable th2) {
            boolean z11 = true;
            this.f3352d = true;
            d<T> dVar = this.f3350b;
            z11 = (dVar == null || !dVar.d(th2)) ? false : false;
            if (z11) {
                e();
            }
            return z11;
        }

        protected void finalize() {
            androidx.concurrent.futures.c<Void> cVar;
            d<T> dVar = this.f3350b;
            if (dVar != null && !dVar.isDone()) {
                dVar.d(new C0064b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f3349a));
            }
            if (this.f3352d || (cVar = this.f3351c) == null) {
                return;
            }
            cVar.p(null);
        }
    }

    /* renamed from: androidx.concurrent.futures.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0064b extends Throwable {
        C0064b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface c<T> {
        Object a(a<T> aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d<T> implements com.google.common.util.concurrent.c<T> {

        /* renamed from: a  reason: collision with root package name */
        final WeakReference<a<T>> f3353a;

        /* renamed from: b  reason: collision with root package name */
        private final androidx.concurrent.futures.a<T> f3354b = new a();

        /* loaded from: classes.dex */
        class a extends androidx.concurrent.futures.a<Object> {
            a() {
            }

            @Override // androidx.concurrent.futures.a
            protected String m() {
                a<T> aVar = d.this.f3353a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f3349a + "]";
            }
        }

        d(a<T> aVar) {
            this.f3353a = new WeakReference<>(aVar);
        }

        @Override // com.google.common.util.concurrent.c
        public void a(Runnable runnable, Executor executor) {
            this.f3354b.a(runnable, executor);
        }

        boolean b(boolean z11) {
            return this.f3354b.cancel(z11);
        }

        boolean c(T t11) {
            return this.f3354b.p(t11);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z11) {
            a<T> aVar = this.f3353a.get();
            boolean cancel = this.f3354b.cancel(z11);
            if (cancel && aVar != null) {
                aVar.b();
            }
            return cancel;
        }

        boolean d(Throwable th2) {
            return this.f3354b.q(th2);
        }

        @Override // java.util.concurrent.Future
        public T get() {
            return this.f3354b.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f3354b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f3354b.isDone();
        }

        public String toString() {
            return this.f3354b.toString();
        }

        @Override // java.util.concurrent.Future
        public T get(long j11, TimeUnit timeUnit) {
            return this.f3354b.get(j11, timeUnit);
        }
    }

    public static <T> com.google.common.util.concurrent.c<T> a(c<T> cVar) {
        a<T> aVar = new a<>();
        d<T> dVar = new d<>(aVar);
        aVar.f3350b = dVar;
        aVar.f3349a = cVar.getClass();
        try {
            Object a11 = cVar.a(aVar);
            if (a11 != null) {
                aVar.f3349a = a11;
            }
        } catch (Exception e11) {
            dVar.d(e11);
        }
        return dVar;
    }
}