package com.google.android.gms.internal.gcm;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class zzi implements zzf {
    private zzi() {
    }

    @Override // com.google.android.gms.internal.gcm.zzf
    public final ExecutorService zzd(int i11, ThreadFactory threadFactory, int i12) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i11, i11, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // com.google.android.gms.internal.gcm.zzf
    public final ScheduledExecutorService zze(int i11, ThreadFactory threadFactory, int i12) {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, threadFactory));
    }

    @Override // com.google.android.gms.internal.gcm.zzf
    public final ExecutorService zzd(ThreadFactory threadFactory, int i11) {
        return zzd(1, threadFactory, 9);
    }
}