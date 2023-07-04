package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzig implements Runnable {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzif zzb;
    final /* synthetic */ zzif zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzim zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzig(zzim zzimVar, Bundle bundle, zzif zzifVar, zzif zzifVar2, long j11) {
        this.zze = zzimVar;
        this.zza = bundle;
        this.zzb = zzifVar;
        this.zzc = zzifVar2;
        this.zzd = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzim.zzp(this.zze, this.zza, this.zzb, this.zzc, this.zzd);
    }
}