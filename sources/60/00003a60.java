package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzbe;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@KeepForSdk
/* loaded from: classes2.dex */
public class j extends zzbe {

    /* renamed from: b */
    private static final ThreadLocal f17248b = new ThreadLocal();

    /* renamed from: a */
    private final ThreadPoolExecutor f17249a;

    public j() {
        final ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.google.mlkit.common.sdkinternal.w
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return defaultThreadFactory.newThread(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.b(runnable);
                    }
                });
            }
        });
        this.f17249a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static /* synthetic */ void a(Runnable runnable) {
        c((Deque) f17248b.get(), runnable);
    }

    public static /* synthetic */ void b(Runnable runnable) {
        f17248b.set(new ArrayDeque());
        runnable.run();
    }

    public static void c(Deque deque, Runnable runnable) {
        Preconditions.checkNotNull(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbe, java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        Deque deque = (Deque) f17248b.get();
        if (deque != null && deque.size() <= 1) {
            c(deque, runnable);
        } else {
            this.f17249a.execute(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.x
                @Override // java.lang.Runnable
                public final void run() {
                    j.a(runnable);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbe, com.google.android.gms.internal.mlkit_common.zzag
    protected final /* synthetic */ Object zza() {
        return this.f17249a;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbe
    protected final ExecutorService zzb() {
        return this.f17249a;
    }
}