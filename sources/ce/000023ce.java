package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzpq implements zzpp {
    public static final zzhu zza = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zze("measurement.integration.disable_firebase_instance_id", false);

    @Override // com.google.android.gms.internal.measurement.zzpp
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzpp
    public final boolean zzb() {
        return ((Boolean) zza.zzb()).booleanValue();
    }
}