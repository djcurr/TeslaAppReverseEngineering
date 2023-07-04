package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzdt implements Runnable {
    final long zzh;
    final long zzi;
    final boolean zzj;
    final /* synthetic */ zzee zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdt(zzee zzeeVar, boolean z11) {
        this.zzk = zzeeVar;
        this.zzh = zzeeVar.zza.currentTimeMillis();
        this.zzi = zzeeVar.zza.elapsedRealtime();
        this.zzj = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z11;
        z11 = this.zzk.zzh;
        if (z11) {
            zzb();
            return;
        }
        try {
            zza();
        } catch (Exception e11) {
            this.zzk.zzS(e11, false, this.zzj);
            zzb();
        }
    }

    abstract void zza();

    protected void zzb() {
    }
}