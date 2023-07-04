package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f16495a;

    /* renamed from: b  reason: collision with root package name */
    private Task<Void> f16496b = Tasks.forResult(null);

    /* renamed from: c  reason: collision with root package name */
    private final Object f16497c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final ThreadLocal<Boolean> f16498d = new ThreadLocal<>();

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.f16498d.set(Boolean.TRUE);
        }
    }

    /* loaded from: classes3.dex */
    class b implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f16500a;

        b(h hVar, Runnable runnable) {
            this.f16500a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            this.f16500a.run();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    public class c<T> implements Continuation<Void, T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callable f16501a;

        c(h hVar, Callable callable) {
            this.f16501a = callable;
        }

        @Override // com.google.android.gms.tasks.Continuation
        public T then(Task<Void> task) {
            return (T) this.f16501a.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    public class d<T> implements Continuation<T, Void> {
        d(h hVar) {
        }

        @Override // com.google.android.gms.tasks.Continuation
        /* renamed from: a */
        public Void then(Task<T> task) {
            return null;
        }
    }

    public h(Executor executor) {
        this.f16495a = executor;
        executor.execute(new a());
    }

    private <T> Task<Void> d(Task<T> task) {
        return task.continueWith(this.f16495a, new d(this));
    }

    private boolean e() {
        return Boolean.TRUE.equals(this.f16498d.get());
    }

    private <T> Continuation<Void, T> f(Callable<T> callable) {
        return new c(this, callable);
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public Executor c() {
        return this.f16495a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task<Void> g(Runnable runnable) {
        return h(new b(this, runnable));
    }

    public <T> Task<T> h(Callable<T> callable) {
        Task<T> continueWith;
        synchronized (this.f16497c) {
            continueWith = this.f16496b.continueWith(this.f16495a, f(callable));
            this.f16496b = d(continueWith);
        }
        return continueWith;
    }

    public <T> Task<T> i(Callable<Task<T>> callable) {
        Task<T> continueWithTask;
        synchronized (this.f16497c) {
            continueWithTask = this.f16496b.continueWithTask(this.f16495a, f(callable));
            this.f16496b = d(continueWithTask);
        }
        return continueWithTask;
    }
}