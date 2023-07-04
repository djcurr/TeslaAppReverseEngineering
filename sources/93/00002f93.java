package com.google.android.gms.measurement.internal;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkk implements zzel {
    final /* synthetic */ String zza;
    final /* synthetic */ zzkr zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkk(zzkr zzkrVar, String str) {
        this.zzb = zzkrVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.measurement.internal.zzel
    public final void zza(String str, int i11, Throwable th2, byte[] bArr, Map map) {
        this.zzb.zzJ(i11, th2, bArr, this.zza);
    }
}