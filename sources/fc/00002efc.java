package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* loaded from: classes3.dex */
public final class zzew {
    @VisibleForTesting
    final String zza;
    final /* synthetic */ zzey zzb;
    private final String zzc;
    private final String zzd;
    private final long zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzew(zzey zzeyVar, String str, long j11, zzev zzevVar) {
        this.zzb = zzeyVar;
        Preconditions.checkNotEmpty("health_monitor");
        Preconditions.checkArgument(j11 > 0);
        this.zza = "health_monitor:start";
        this.zzc = "health_monitor:count";
        this.zzd = "health_monitor:value";
        this.zze = j11;
    }

    private final long zzc() {
        return this.zzb.zza().getLong(this.zza, 0L);
    }

    private final void zzd() {
        this.zzb.zzg();
        long currentTimeMillis = this.zzb.zzs.zzav().currentTimeMillis();
        SharedPreferences.Editor edit = this.zzb.zza().edit();
        edit.remove(this.zzc);
        edit.remove(this.zzd);
        edit.putLong(this.zza, currentTimeMillis);
        edit.apply();
    }

    public final Pair zza() {
        long abs;
        this.zzb.zzg();
        this.zzb.zzg();
        long zzc = zzc();
        if (zzc == 0) {
            zzd();
            abs = 0;
        } else {
            abs = Math.abs(zzc - this.zzb.zzs.zzav().currentTimeMillis());
        }
        long j11 = this.zze;
        if (abs < j11) {
            return null;
        }
        if (abs > j11 + j11) {
            zzd();
            return null;
        }
        String string = this.zzb.zza().getString(this.zzd, null);
        long j12 = this.zzb.zza().getLong(this.zzc, 0L);
        zzd();
        if (string != null && j12 > 0) {
            return new Pair(string, Long.valueOf(j12));
        }
        return zzey.zza;
    }

    public final void zzb(String str, long j11) {
        this.zzb.zzg();
        if (zzc() == 0) {
            zzd();
        }
        if (str == null) {
            str = "";
        }
        long j12 = this.zzb.zza().getLong(this.zzc, 0L);
        if (j12 <= 0) {
            SharedPreferences.Editor edit = this.zzb.zza().edit();
            edit.putString(this.zzd, str);
            edit.putLong(this.zzc, 1L);
            edit.apply();
            return;
        }
        long nextLong = this.zzb.zzs.zzv().zzF().nextLong();
        long j13 = j12 + 1;
        SharedPreferences.Editor edit2 = this.zzb.zza().edit();
        if ((Long.MAX_VALUE & nextLong) < Long.MAX_VALUE / j13) {
            edit2.putString(this.zzd, str);
        }
        edit2.putLong(this.zzc, j13);
        edit2.apply();
    }
}