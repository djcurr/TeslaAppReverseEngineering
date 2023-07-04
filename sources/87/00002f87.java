package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjz extends zzan {
    final /* synthetic */ zzka zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjz(zzka zzkaVar, zzgo zzgoVar) {
        super(zzgoVar);
        this.zza = zzkaVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzan
    public final void zzc() {
        zzka zzkaVar = this.zza;
        zzkaVar.zzc.zzg();
        zzkaVar.zzd(false, false, zzkaVar.zzc.zzs.zzav().elapsedRealtime());
        zzkaVar.zzc.zzs.zzd().zzf(zzkaVar.zzc.zzs.zzav().elapsedRealtime());
    }
}