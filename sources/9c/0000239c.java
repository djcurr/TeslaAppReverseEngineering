package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zznu implements zznt {
    public static final zzhu zza;
    public static final zzhu zzb;
    public static final zzhu zzc;
    public static final zzhu zzd;
    public static final zzhu zze;

    static {
        zzhr zza2 = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zza();
        zza = zza2.zze("measurement.enhanced_campaign.client", false);
        zzb = zza2.zze("measurement.enhanced_campaign.service", false);
        zzc = zza2.zze("measurement.enhanced_campaign.srsltid.client", false);
        zzd = zza2.zze("measurement.enhanced_campaign.srsltid.service", false);
        zze = zza2.zzc("measurement.id.enhanced_campaign.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final boolean zzb() {
        return ((Boolean) zza.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final boolean zzc() {
        return ((Boolean) zzb.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final boolean zzd() {
        return ((Boolean) zzc.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final boolean zze() {
        return ((Boolean) zzd.zzb()).booleanValue();
    }
}