package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzma;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class k {
    @KeepForSdk

    /* renamed from: a  reason: collision with root package name */
    protected final o f17250a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f17251b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f17252c;

    public k() {
        this.f17251b = new AtomicInteger(0);
        this.f17252c = new AtomicBoolean(false);
        this.f17250a = new o();
    }

    @KeepForSdk
    public <T> Task<T> a(final Executor executor, final Callable<T> callable, final CancellationToken cancellationToken) {
        Preconditions.checkState(this.f17251b.get() > 0);
        if (cancellationToken.isCancellationRequested()) {
            return Tasks.forCanceled();
        }
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f17250a.a(new Executor() { // from class: com.google.mlkit.common.sdkinternal.z
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                Executor executor2 = executor;
                CancellationToken cancellationToken2 = cancellationToken;
                CancellationTokenSource cancellationTokenSource2 = cancellationTokenSource;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                try {
                    executor2.execute(runnable);
                } catch (RuntimeException e11) {
                    if (cancellationToken2.isCancellationRequested()) {
                        cancellationTokenSource2.cancel();
                    } else {
                        taskCompletionSource2.setException(e11);
                    }
                    throw e11;
                }
            }
        }, new Runnable() { // from class: com.google.mlkit.common.sdkinternal.a0
            @Override // java.lang.Runnable
            public final void run() {
                k.this.g(cancellationToken, cancellationTokenSource, callable, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @KeepForSdk
    public abstract void b();

    @KeepForSdk
    public void c() {
        this.f17251b.incrementAndGet();
    }

    @KeepForSdk
    protected abstract void d();

    @KeepForSdk
    public void e(Executor executor) {
        f(executor);
    }

    @KeepForSdk
    public Task<Void> f(Executor executor) {
        Preconditions.checkState(this.f17251b.get() > 0);
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f17250a.a(executor, new Runnable() { // from class: com.google.mlkit.common.sdkinternal.y
            {
                k.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                k.this.h(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void g(CancellationToken cancellationToken, CancellationTokenSource cancellationTokenSource, Callable callable, TaskCompletionSource taskCompletionSource) {
        try {
            if (cancellationToken.isCancellationRequested()) {
                cancellationTokenSource.cancel();
                return;
            }
            try {
                if (!this.f17252c.get()) {
                    b();
                    this.f17252c.set(true);
                }
                if (cancellationToken.isCancellationRequested()) {
                    cancellationTokenSource.cancel();
                    return;
                }
                Object call = callable.call();
                if (cancellationToken.isCancellationRequested()) {
                    cancellationTokenSource.cancel();
                } else {
                    taskCompletionSource.setResult(call);
                }
            } catch (RuntimeException e11) {
                throw new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e11);
            }
        } catch (Exception e12) {
            if (cancellationToken.isCancellationRequested()) {
                cancellationTokenSource.cancel();
            } else {
                taskCompletionSource.setException(e12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void h(TaskCompletionSource taskCompletionSource) {
        int decrementAndGet = this.f17251b.decrementAndGet();
        Preconditions.checkState(decrementAndGet >= 0);
        if (decrementAndGet == 0) {
            d();
            this.f17252c.set(false);
        }
        zzma.zza();
        taskCompletionSource.setResult(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public k(o oVar) {
        this.f17251b = new AtomicInteger(0);
        this.f17252c = new AtomicBoolean(false);
        this.f17250a = oVar;
    }
}