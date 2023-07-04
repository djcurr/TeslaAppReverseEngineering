package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: d */
    private static final Map<String, d> f17099d = new HashMap();

    /* renamed from: e */
    private static final Executor f17100e = com.google.firebase.messaging.h.f16804a;

    /* renamed from: a */
    private final ExecutorService f17101a;

    /* renamed from: b */
    private final n f17102b;

    /* renamed from: c */
    private Task<e> f17103c = null;

    /* loaded from: classes2.dex */
    public static class b<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {

        /* renamed from: a */
        private final CountDownLatch f17104a;

        private b() {
            this.f17104a = new CountDownLatch(1);
        }

        public boolean a(long j11, TimeUnit timeUnit) {
            return this.f17104a.await(j11, timeUnit);
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public void onCanceled() {
            this.f17104a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            this.f17104a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public void onSuccess(TResult tresult) {
            this.f17104a.countDown();
        }
    }

    private d(ExecutorService executorService, n nVar) {
        this.f17101a = executorService;
        this.f17102b = nVar;
    }

    private static <TResult> TResult c(Task<TResult> task, long j11, TimeUnit timeUnit) {
        b bVar = new b();
        Executor executor = f17100e;
        task.addOnSuccessListener(executor, bVar);
        task.addOnFailureListener(executor, bVar);
        task.addOnCanceledListener(executor, bVar);
        if (bVar.a(j11, timeUnit)) {
            if (task.isSuccessful()) {
                return task.getResult();
            }
            throw new ExecutionException(task.getException());
        }
        throw new TimeoutException("Task await timed out.");
    }

    public static synchronized d h(ExecutorService executorService, n nVar) {
        d dVar;
        synchronized (d.class) {
            String b11 = nVar.b();
            Map<String, d> map = f17099d;
            if (!map.containsKey(b11)) {
                map.put(b11, new d(executorService, nVar));
            }
            dVar = map.get(b11);
        }
        return dVar;
    }

    public /* synthetic */ Void i(e eVar) {
        return this.f17102b.e(eVar);
    }

    public /* synthetic */ Task j(boolean z11, e eVar, Void r32) {
        if (z11) {
            m(eVar);
        }
        return Tasks.forResult(eVar);
    }

    private synchronized void m(e eVar) {
        this.f17103c = Tasks.forResult(eVar);
    }

    public void d() {
        synchronized (this) {
            this.f17103c = Tasks.forResult(null);
        }
        this.f17102b.a();
    }

    public synchronized Task<e> e() {
        Task<e> task = this.f17103c;
        if (task == null || (task.isComplete() && !this.f17103c.isSuccessful())) {
            ExecutorService executorService = this.f17101a;
            final n nVar = this.f17102b;
            Objects.requireNonNull(nVar);
            this.f17103c = Tasks.call(executorService, new Callable() { // from class: com.google.firebase.remoteconfig.internal.c
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return nVar.d();
                }
            });
        }
        return this.f17103c;
    }

    public e f() {
        return g(5L);
    }

    e g(long j11) {
        synchronized (this) {
            Task<e> task = this.f17103c;
            if (task != null && task.isSuccessful()) {
                return this.f17103c.getResult();
            }
            try {
                return (e) c(e(), j11, TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e11) {
                Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e11);
                return null;
            }
        }
    }

    public Task<e> k(e eVar) {
        return l(eVar, true);
    }

    public Task<e> l(final e eVar, final boolean z11) {
        return Tasks.call(this.f17101a, new Callable() { // from class: com.google.firebase.remoteconfig.internal.b
            {
                d.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void i11;
                i11 = d.this.i(eVar);
                return i11;
            }
        }).onSuccessTask(this.f17101a, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.internal.a
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task j11;
                j11 = d.this.j(z11, eVar, (Void) obj);
                return j11;
            }
        });
    }
}