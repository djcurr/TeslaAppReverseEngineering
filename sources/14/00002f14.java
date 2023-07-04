package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfs implements Runnable {
    final /* synthetic */ zzgw zza;
    final /* synthetic */ zzft zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfs(zzft zzftVar, zzgw zzgwVar) {
        this.zzb = zzftVar;
        this.zza = zzgwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzft.zzA(this.zzb, this.zza);
        this.zzb.zzH(this.zza.zzg);
    }
}