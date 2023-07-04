package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zznf implements zzne {
    public static final zzhu zza;
    public static final zzhu zzb;

    static {
        zzhr zzhrVar = new zzhr(zzhk.zza("com.google.android.gms.measurement"));
        zza = zzhrVar.zze("measurement.androidId.delete_feature", true);
        zzb = zzhrVar.zze("measurement.log_androidId_enabled", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final boolean zza() {
        return ((Boolean) zza.zzb()).booleanValue();
    }
}