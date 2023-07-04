package com.google.mlkit.common.sdkinternal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_common.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

@KeepForSdk
/* loaded from: classes2.dex */
public class g {

    /* renamed from: b  reason: collision with root package name */
    private static final Object f17238b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static g f17239c;

    /* renamed from: a  reason: collision with root package name */
    private Handler f17240a;

    private g(Looper looper) {
        this.f17240a = new zza(looper);
    }

    @KeepForSdk
    public static g a() {
        g gVar;
        synchronized (f17238b) {
            if (f17239c == null) {
                HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                handlerThread.start();
                f17239c = new g(handlerThread.getLooper());
            }
            gVar = f17239c;
        }
        return gVar;
    }

    @KeepForSdk
    public static Executor d() {
        return u.zza;
    }

    @KeepForSdk
    public <ResultT> Task<ResultT> b(final Callable<ResultT> callable) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        c(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.t
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                try {
                    taskCompletionSource2.setResult(callable2.call());
                } catch (MlKitException e11) {
                    taskCompletionSource2.setException(e11);
                } catch (Exception e12) {
                    taskCompletionSource2.setException(new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e12));
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    @KeepForSdk
    public void c(Runnable runnable) {
        d().execute(runnable);
    }
}