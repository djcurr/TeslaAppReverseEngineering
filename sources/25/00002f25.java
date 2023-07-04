package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class zzgi implements Callable {
    final /* synthetic */ String zza;
    final /* synthetic */ zzgl zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgi(zzgl zzglVar, String str) {
        this.zzb = zzglVar;
        this.zza = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzkr zzkrVar;
        zzkr zzkrVar2;
        zzkrVar = this.zzb.zza;
        zzkrVar.zzA();
        zzkrVar2 = this.zzb.zza;
        return zzkrVar2.zzi().zzu(this.zza);
    }
}