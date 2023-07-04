package com.bumptech.glide.load.engine;

import android.os.Process;
import com.bumptech.glide.load.engine.o;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f10541a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f10542b;

    /* renamed from: c  reason: collision with root package name */
    final Map<ha.b, d> f10543c;

    /* renamed from: d  reason: collision with root package name */
    private final ReferenceQueue<o<?>> f10544d;

    /* renamed from: e  reason: collision with root package name */
    private o.a f10545e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f10546f;

    /* renamed from: g  reason: collision with root package name */
    private volatile c f10547g;

    /* renamed from: com.bumptech.glide.load.engine.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class ThreadFactoryC0201a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.engine.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0202a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Runnable f10548a;

            RunnableC0202a(ThreadFactoryC0201a threadFactoryC0201a, Runnable runnable) {
                this.f10548a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f10548a.run();
            }
        }

        ThreadFactoryC0201a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC0202a(this, runnable), "glide-active-resources");
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface c {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends WeakReference<o<?>> {

        /* renamed from: a  reason: collision with root package name */
        final ha.b f10550a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f10551b;

        /* renamed from: c  reason: collision with root package name */
        ja.c<?> f10552c;

        d(ha.b bVar, o<?> oVar, ReferenceQueue<? super o<?>> referenceQueue, boolean z11) {
            super(oVar, referenceQueue);
            this.f10550a = (ha.b) bb.j.d(bVar);
            this.f10552c = (oVar.e() && z11) ? (ja.c) bb.j.d(oVar.d()) : null;
            this.f10551b = oVar.e();
        }

        void a() {
            this.f10552c = null;
            clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(boolean z11) {
        this(z11, Executors.newSingleThreadExecutor(new ThreadFactoryC0201a()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(ha.b bVar, o<?> oVar) {
        d put = this.f10543c.put(bVar, new d(bVar, oVar, this.f10544d, this.f10541a));
        if (put != null) {
            put.a();
        }
    }

    void b() {
        while (!this.f10546f) {
            try {
                c((d) this.f10544d.remove());
                c cVar = this.f10547g;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    void c(d dVar) {
        ja.c<?> cVar;
        synchronized (this) {
            this.f10543c.remove(dVar.f10550a);
            if (dVar.f10551b && (cVar = dVar.f10552c) != null) {
                this.f10545e.d(dVar.f10550a, new o<>(cVar, true, false, dVar.f10550a, this.f10545e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void d(ha.b bVar) {
        d remove = this.f10543c.remove(bVar);
        if (remove != null) {
            remove.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized o<?> e(ha.b bVar) {
        d dVar = this.f10543c.get(bVar);
        if (dVar == null) {
            return null;
        }
        o<?> oVar = dVar.get();
        if (oVar == null) {
            c(dVar);
        }
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(o.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f10545e = aVar;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        this.f10546f = true;
        Executor executor = this.f10542b;
        if (executor instanceof ExecutorService) {
            bb.e.c((ExecutorService) executor);
        }
    }

    a(boolean z11, Executor executor) {
        this.f10543c = new HashMap();
        this.f10544d = new ReferenceQueue<>();
        this.f10541a = z11;
        this.f10542b = executor;
        executor.execute(new b());
    }
}