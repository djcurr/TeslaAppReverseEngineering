package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhd implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ String zzh;
    final /* synthetic */ zzhy zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhd(zzhy zzhyVar, String str, String str2, long j11, Bundle bundle, boolean z11, boolean z12, boolean z13, String str3) {
        this.zzi = zzhyVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = j11;
        this.zzd = bundle;
        this.zze = z11;
        this.zzf = z12;
        this.zzg = z13;
        this.zzh = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzi.zzI(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
    }
}