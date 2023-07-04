package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzod implements zzoc {
    public static final zzhu zza = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zze("measurement.client.firebase_feature_rollout.v1.enable", true);

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final boolean zzb() {
        return ((Boolean) zza.zzb()).booleanValue();
    }
}