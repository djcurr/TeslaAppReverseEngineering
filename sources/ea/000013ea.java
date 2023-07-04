package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import h8.d;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import v7.g;
import v7.k;

/* loaded from: classes.dex */
public class b<T> {

    /* renamed from: e  reason: collision with root package name */
    public static Executor f10044e = Executors.newCachedThreadPool();

    /* renamed from: a  reason: collision with root package name */
    private final Set<g<T>> f10045a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<g<Throwable>> f10046b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f10047c;

    /* renamed from: d  reason: collision with root package name */
    private volatile k<T> f10048d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f10048d == null) {
                return;
            }
            k kVar = b.this.f10048d;
            if (kVar.b() != null) {
                b.this.i(kVar.b());
            } else {
                b.this.g(kVar.a());
            }
        }
    }

    /* renamed from: com.airbnb.lottie.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private class C0190b extends FutureTask<k<T>> {
        C0190b(Callable<k<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (isCancelled()) {
                return;
            }
            try {
                b.this.l(get());
            } catch (InterruptedException | ExecutionException e11) {
                b.this.l(new k(e11));
            }
        }
    }

    public b(Callable<k<T>> callable) {
        this(callable, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void g(Throwable th2) {
        ArrayList<g> arrayList = new ArrayList(this.f10046b);
        if (arrayList.isEmpty()) {
            d.d("Lottie encountered an error but no failure listener was added:", th2);
            return;
        }
        for (g gVar : arrayList) {
            gVar.a(th2);
        }
    }

    private void h() {
        this.f10047c.post(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void i(T t11) {
        for (g gVar : new ArrayList(this.f10045a)) {
            gVar.a(t11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(k<T> kVar) {
        if (this.f10048d == null) {
            this.f10048d = kVar;
            h();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public synchronized b<T> e(g<Throwable> gVar) {
        if (this.f10048d != null && this.f10048d.a() != null) {
            gVar.a(this.f10048d.a());
        }
        this.f10046b.add(gVar);
        return this;
    }

    public synchronized b<T> f(g<T> gVar) {
        if (this.f10048d != null && this.f10048d.b() != null) {
            gVar.a(this.f10048d.b());
        }
        this.f10045a.add(gVar);
        return this;
    }

    public synchronized b<T> j(g<Throwable> gVar) {
        this.f10046b.remove(gVar);
        return this;
    }

    public synchronized b<T> k(g<T> gVar) {
        this.f10045a.remove(gVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Callable<k<T>> callable, boolean z11) {
        this.f10045a = new LinkedHashSet(1);
        this.f10046b = new LinkedHashSet(1);
        this.f10047c = new Handler(Looper.getMainLooper());
        this.f10048d = null;
        if (z11) {
            try {
                l(callable.call());
                return;
            } catch (Throwable th2) {
                l(new k<>(th2));
                return;
            }
        }
        f10044e.execute(new C0190b(callable));
    }
}