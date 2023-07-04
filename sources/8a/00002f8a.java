package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzob;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkb {
    final /* synthetic */ zzkc zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkb(zzkc zzkcVar) {
        this.zza = zzkcVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        this.zza.zzg();
        if (this.zza.zzs.zzm().zzk(this.zza.zzs.zzav().currentTimeMillis())) {
            this.zza.zzs.zzm().zzg.zza(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.zza.zzs.zzay().zzj().zza("Detected application was in foreground");
                zzc(this.zza.zzs.zzav().currentTimeMillis(), false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(long j11, boolean z11) {
        this.zza.zzg();
        this.zza.zzm();
        if (this.zza.zzs.zzm().zzk(j11)) {
            this.zza.zzs.zzm().zzg.zza(true);
        }
        this.zza.zzs.zzm().zzj.zzb(j11);
        if (this.zza.zzs.zzm().zzg.zzb()) {
            zzc(j11, z11);
        }
    }

    @VisibleForTesting
    final void zzc(long j11, boolean z11) {
        this.zza.zzg();
        if (this.zza.zzs.zzJ()) {
            this.zza.zzs.zzm().zzj.zzb(j11);
            this.zza.zzs.zzay().zzj().zzb("Session started, time", Long.valueOf(this.zza.zzs.zzav().elapsedRealtime()));
            Long valueOf = Long.valueOf(j11 / 1000);
            this.zza.zzs.zzq().zzZ("auto", "_sid", valueOf, j11);
            this.zza.zzs.zzm().zzg.zza(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.zza.zzs.zzf().zzs(null, zzdw.zzZ) && z11) {
                bundle.putLong("_aib", 1L);
            }
            this.zza.zzs.zzq().zzH("auto", "_s", j11, bundle);
            zzob.zzc();
            if (this.zza.zzs.zzf().zzs(null, zzdw.zzac)) {
                String zza = this.zza.zzs.zzm().zzo.zza();
                if (TextUtils.isEmpty(zza)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", zza);
                this.zza.zzs.zzq().zzH("auto", "_ssr", j11, bundle2);
            }
        }
    }
}