package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class zzes {
    final /* synthetic */ zzey zza;
    private final String zzb;
    private final boolean zzc;
    private boolean zzd;
    private boolean zze;

    public zzes(zzey zzeyVar, String str, boolean z11) {
        this.zza = zzeyVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = z11;
    }

    public final void zza(boolean z11) {
        SharedPreferences.Editor edit = this.zza.zza().edit();
        edit.putBoolean(this.zzb, z11);
        edit.apply();
        this.zze = z11;
    }

    public final boolean zzb() {
        if (!this.zzd) {
            this.zzd = true;
            this.zze = this.zza.zza().getBoolean(this.zzb, this.zzc);
        }
        return this.zze;
    }
}