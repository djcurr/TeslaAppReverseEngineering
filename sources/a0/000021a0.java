package com.google.android.gms.internal.gcm;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public interface zzf {
    ExecutorService zzd(int i11, ThreadFactory threadFactory, int i12);

    ExecutorService zzd(ThreadFactory threadFactory, int i11);

    ScheduledExecutorService zze(int i11, ThreadFactory threadFactory, int i12);
}