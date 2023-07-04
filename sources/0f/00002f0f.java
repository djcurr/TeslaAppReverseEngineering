package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfn implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ zzfq zza;
    private final String zzb;

    public zzfn(zzfq zzfqVar, String str) {
        this.zza = zzfqVar;
        Preconditions.checkNotNull(str);
        this.zzb = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        this.zza.zzs.zzay().zzd().zzb(this.zzb, th2);
    }
}