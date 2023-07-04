package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfo extends FutureTask implements Comparable {
    final boolean zza;
    final /* synthetic */ zzfq zzb;
    private final long zzc;
    private final String zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfo(zzfq zzfqVar, Runnable runnable, boolean z11, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.zzb = zzfqVar;
        Preconditions.checkNotNull(str);
        atomicLong = zzfq.zza;
        long andIncrement = atomicLong.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = str;
        this.zza = z11;
        if (andIncrement == Long.MAX_VALUE) {
            zzfqVar.zzs.zzay().zzd().zza("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzfo zzfoVar = (zzfo) obj;
        boolean z11 = this.zza;
        if (z11 != zzfoVar.zza) {
            return !z11 ? 1 : -1;
        }
        int i11 = (this.zzc > zzfoVar.zzc ? 1 : (this.zzc == zzfoVar.zzc ? 0 : -1));
        if (i11 < 0) {
            return -1;
        }
        if (i11 > 0) {
            return 1;
        }
        this.zzb.zzs.zzay().zzh().zzb("Two tasks share the same index. index", Long.valueOf(this.zzc));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th2) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.zzb.zzs.zzay().zzd().zzb(this.zzd, th2);
        if ((th2 instanceof zzfm) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
        }
        super.setException(th2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfo(zzfq zzfqVar, Callable callable, boolean z11, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.zzb = zzfqVar;
        Preconditions.checkNotNull("Task exception on worker thread");
        atomicLong = zzfq.zza;
        long andIncrement = atomicLong.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = "Task exception on worker thread";
        this.zza = z11;
        if (andIncrement == Long.MAX_VALUE) {
            zzfqVar.zzs.zzay().zzd().zza("Tasks index overflow");
        }
    }
}