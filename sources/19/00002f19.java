package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class zzfx implements Callable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzgl zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfx(zzgl zzglVar, String str, String str2, String str3) {
        this.zzd = zzglVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzkr zzkrVar;
        zzkr zzkrVar2;
        zzkrVar = this.zzd.zza;
        zzkrVar.zzA();
        zzkrVar2 = this.zzd.zza;
        return zzkrVar2.zzi().zzv(this.zza, this.zzb, this.zzc);
    }
}