package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzik implements Runnable {
    final /* synthetic */ zzif zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzim zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzik(zzim zzimVar, zzif zzifVar, long j11) {
        this.zzc = zzimVar;
        this.zza = zzifVar;
        this.zzb = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzC(this.zza, false, this.zzb);
        zzim zzimVar = this.zzc;
        zzimVar.zza = null;
        zzimVar.zzs.zzt().zzG(null);
    }
}