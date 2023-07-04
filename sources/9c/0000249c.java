package com.google.android.gms.internal.mlkit_common;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzh {
    public static final zzh zza;
    public static final zzh zzb;
    private final boolean zzc;
    private final boolean zzd = false;
    private final zzao zze;

    static {
        zzf zzfVar = new zzf(null);
        zzfVar.zza();
        zza = zzfVar.zzc();
        zzf zzfVar2 = new zzf(null);
        zzfVar2.zzb();
        zzb = zzfVar2.zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzh(boolean z11, boolean z12, zzao zzaoVar, zzg zzgVar) {
        this.zzc = z11;
        this.zze = zzaoVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean zza(zzh zzhVar) {
        boolean z11 = zzhVar.zzd;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ int zzc(zzh zzhVar, Context context, zzq zzqVar) {
        zzao zzaoVar = zzhVar.zze;
        int size = zzaoVar.size();
        int i11 = 0;
        while (i11 < size) {
            int zza2 = ((zzr) zzaoVar.get(i11)).zza();
            int i12 = zza2 - 1;
            if (zza2 == 0) {
                throw null;
            }
            i11++;
            if (i12 == 0) {
                return 1;
            }
            if (i12 == 1) {
                return 2;
            }
        }
        return 3;
    }
}