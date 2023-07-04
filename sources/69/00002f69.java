package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zziw extends zzan {
    final /* synthetic */ zzjm zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziw(zzjm zzjmVar, zzgo zzgoVar) {
        super(zzgoVar);
        this.zza = zzjmVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzan
    public final void zzc() {
        zzjm zzjmVar = this.zza;
        zzjmVar.zzg();
        if (zzjmVar.zzL()) {
            zzjmVar.zzs.zzay().zzj().zza("Inactivity, disconnecting from the service");
            zzjmVar.zzs();
        }
    }
}