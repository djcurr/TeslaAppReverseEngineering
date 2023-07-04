package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzen implements Runnable {
    private final zzel zza;
    private final int zzb;
    private final Throwable zzc;
    private final byte[] zzd;
    private final String zze;
    private final Map zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzen(String str, zzel zzelVar, int i11, Throwable th2, byte[] bArr, Map map, zzem zzemVar) {
        Preconditions.checkNotNull(zzelVar);
        this.zza = zzelVar;
        this.zzb = i11;
        this.zzc = th2;
        this.zzd = bArr;
        this.zze = str;
        this.zzf = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza(this.zze, this.zzb, this.zzc, this.zzd, this.zzf);
    }
}