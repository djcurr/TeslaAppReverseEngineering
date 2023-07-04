package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzok;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzka {
    @VisibleForTesting
    protected long zza;
    @VisibleForTesting
    protected long zzb;
    final /* synthetic */ zzkc zzc;
    private final zzan zzd;

    public zzka(zzkc zzkcVar) {
        this.zzc = zzkcVar;
        this.zzd = new zzjz(this, zzkcVar.zzs);
        long elapsedRealtime = zzkcVar.zzs.zzav().elapsedRealtime();
        this.zza = elapsedRealtime;
        this.zzb = elapsedRealtime;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        this.zzd.zzb();
        this.zza = 0L;
        this.zzb = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(long j11) {
        this.zzd.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(long j11) {
        this.zzc.zzg();
        this.zzd.zzb();
        this.zza = j11;
        this.zzb = j11;
    }

    public final boolean zzd(boolean z11, boolean z12, long j11) {
        this.zzc.zzg();
        this.zzc.zza();
        zzok.zzc();
        if (this.zzc.zzs.zzf().zzs(null, zzdw.zzad)) {
            if (this.zzc.zzs.zzJ()) {
                this.zzc.zzs.zzm().zzj.zzb(this.zzc.zzs.zzav().currentTimeMillis());
            }
        } else {
            this.zzc.zzs.zzm().zzj.zzb(this.zzc.zzs.zzav().currentTimeMillis());
        }
        long j12 = j11 - this.zza;
        if (!z11 && j12 < 1000) {
            this.zzc.zzs.zzay().zzj().zzb("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j12));
            return false;
        }
        if (!z12) {
            j12 = j11 - this.zzb;
            this.zzb = j11;
        }
        this.zzc.zzs.zzay().zzj().zzb("Recording user engagement, ms", Long.valueOf(j12));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j12);
        zzky.zzJ(this.zzc.zzs.zzs().zzj(!this.zzc.zzs.zzf().zzu()), bundle, true);
        if (!z12) {
            this.zzc.zzs.zzq().zzG("auto", "_e", bundle);
        }
        this.zza = j11;
        this.zzd.zzb();
        this.zzd.zzd(CoreConstants.MILLIS_IN_ONE_HOUR);
        return true;
    }
}