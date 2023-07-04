package com.google.firebase.crashlytics.internal.common;

import android.os.Looper;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class h0 {

    /* renamed from: a */
    private static final ExecutorService f16502a = t.c("awaitEvenIfOnMainThread task continuation executor");

    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Callable f16503a;

        /* renamed from: b */
        final /* synthetic */ TaskCompletionSource f16504b;

        /* renamed from: com.google.firebase.crashlytics.internal.common.h0$a$a */
        /* loaded from: classes3.dex */
        class C0301a<T> implements Continuation<T, Void> {
            C0301a() {
                a.this = r1;
            }

            @Override // com.google.android.gms.tasks.Continuation
            /* renamed from: a */
            public Void then(Task<T> task) {
                if (task.isSuccessful()) {
                    a.this.f16504b.setResult(task.getResult());
                    return null;
                }
                a.this.f16504b.setException(task.getException());
                return null;
            }
        }

        a(Callable callable, TaskCompletionSource taskCompletionSource) {
            this.f16503a = callable;
            this.f16504b = taskCompletionSource;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ((Task) this.f16503a.call()).continueWith(new C0301a());
            } catch (Exception e11) {
                this.f16504b.setException(e11);
            }
        }
    }

    public static /* synthetic */ Object c(CountDownLatch countDownLatch, Task task) {
        return f(countDownLatch, task);
    }

    public static <T> T d(Task<T> task) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(f16502a, new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.g0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return h0.c(countDownLatch, task2);
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } else {
            countDownLatch.await();
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (!task.isCanceled()) {
            if (task.isComplete()) {
                throw new IllegalStateException(task.getException());
            }
            throw new TimeoutException();
        }
        throw new CancellationException("Task is already canceled");
    }

    public static <T> Task<T> e(Executor executor, Callable<Task<T>> callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new a(callable, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public static /* synthetic */ Object f(CountDownLatch countDownLatch, Task task) {
        countDownLatch.countDown();
        return null;
    }

    public static /* synthetic */ Void g(TaskCompletionSource taskCompletionSource, Task task) {
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        }
        Exception exception = task.getException();
        Objects.requireNonNull(exception);
        taskCompletionSource.trySetException(exception);
        return null;
    }

    public static /* synthetic */ Void h(TaskCompletionSource taskCompletionSource, Task task) {
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        }
        Exception exception = task.getException();
        Objects.requireNonNull(exception);
        taskCompletionSource.trySetException(exception);
        return null;
    }

    public static <T> Task<T> i(Task<T> task, Task<T> task2) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Continuation<T, TContinuationResult> continuation = new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.f0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                Void g11;
                g11 = h0.g(TaskCompletionSource.this, task3);
                return g11;
            }
        };
        task.continueWith(continuation);
        task2.continueWith(continuation);
        return taskCompletionSource.getTask();
    }

    public static <T> Task<T> j(Executor executor, Task<T> task, Task<T> task2) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Continuation<T, TContinuationResult> continuation = new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.e0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                Void h11;
                h11 = h0.h(TaskCompletionSource.this, task3);
                return h11;
            }
        };
        task.continueWith(executor, continuation);
        task2.continueWith(executor, continuation);
        return taskCompletionSource.getTask();
    }
}