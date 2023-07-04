package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zznc implements zznb {
    public static final zzhu zza;
    public static final zzhu zzb;
    public static final zzhu zzc;
    public static final zzhu zzd;
    public static final zzhu zze;
    public static final zzhu zzf;
    public static final zzhu zzg;

    static {
        zzhr zza2 = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zza();
        zza = zza2.zze("measurement.adid_zero.app_instance_id_fix", true);
        zzb = zza2.zze("measurement.adid_zero.service", true);
        zzc = zza2.zze("measurement.adid_zero.adid_uid", false);
        zzd = zza2.zzc("measurement.id.adid_zero.service", 0L);
        zze = zza2.zze("measurement.adid_zero.remove_lair_if_adidzero_false", true);
        zzf = zza2.zze("measurement.adid_zero.remove_lair_if_userid_cleared", true);
        zzg = zza2.zze("measurement.adid_zero.remove_lair_on_id_value_change_only", true);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final boolean zzb() {
        return ((Boolean) zza.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final boolean zzc() {
        return ((Boolean) zzb.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final boolean zzd() {
        return ((Boolean) zzc.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final boolean zze() {
        return ((Boolean) zze.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final boolean zzf() {
        return ((Boolean) zzf.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final boolean zzg() {
        return ((Boolean) zzg.zzb()).booleanValue();
    }
}