package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzjk implements Runnable {
    final /* synthetic */ zzjl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjk(zzjl zzjlVar) {
        this.zza = zzjlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza.zzb = null;
        this.zza.zza.zzP();
    }
}