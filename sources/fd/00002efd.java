package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class zzex {
    final /* synthetic */ zzey zza;
    private final String zzb;
    private boolean zzc;
    private String zzd;

    public zzex(zzey zzeyVar, String str, String str2) {
        this.zza = zzeyVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
    }

    public final String zza() {
        if (!this.zzc) {
            this.zzc = true;
            this.zzd = this.zza.zza().getString(this.zzb, null);
        }
        return this.zzd;
    }

    public final void zzb(String str) {
        SharedPreferences.Editor edit = this.zza.zza().edit();
        edit.putString(this.zzb, str);
        edit.apply();
        this.zzd = str;
    }
}