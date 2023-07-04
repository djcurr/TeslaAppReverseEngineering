package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzop implements zzoo {
    public static final zzhu zza;
    public static final zzhu zzb;
    public static final zzhu zzc;
    public static final zzhu zzd;

    static {
        zzhr zzhrVar = new zzhr(zzhk.zza("com.google.android.gms.measurement"));
        zza = zzhrVar.zze("measurement.sdk.collection.enable_extend_user_property_size", true);
        zzb = zzhrVar.zze("measurement.sdk.collection.last_deep_link_referrer2", true);
        zzc = zzhrVar.zze("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        zzd = zzhrVar.zzc("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final boolean zza() {
        return ((Boolean) zzc.zzb()).booleanValue();
    }
}