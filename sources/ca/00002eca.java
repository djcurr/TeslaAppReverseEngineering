package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.collection.a;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzd extends zze {
    private final Map zza;
    private final Map zzb;
    private long zzc;

    public zzd(zzft zzftVar) {
        super(zzftVar);
        this.zzb = new a();
        this.zza = new a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zza(zzd zzdVar, String str, long j11) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        if (zzdVar.zzb.isEmpty()) {
            zzdVar.zzc = j11;
        }
        Integer num = (Integer) zzdVar.zzb.get(str);
        if (num != null) {
            zzdVar.zzb.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (zzdVar.zzb.size() >= 100) {
            zzdVar.zzs.zzay().zzk().zza("Too many ads visible");
        } else {
            zzdVar.zzb.put(str, 1);
            zzdVar.zza.put(str, Long.valueOf(j11));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzb(zzd zzdVar, String str, long j11) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        Integer num = (Integer) zzdVar.zzb.get(str);
        if (num != null) {
            zzif zzj = zzdVar.zzs.zzs().zzj(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                zzdVar.zzb.remove(str);
                Long l11 = (Long) zzdVar.zza.get(str);
                if (l11 == null) {
                    zzdVar.zzs.zzay().zzd().zza("First ad unit exposure time was never set");
                } else {
                    long longValue = l11.longValue();
                    zzdVar.zza.remove(str);
                    zzdVar.zzi(str, j11 - longValue, zzj);
                }
                if (zzdVar.zzb.isEmpty()) {
                    long j12 = zzdVar.zzc;
                    if (j12 == 0) {
                        zzdVar.zzs.zzay().zzd().zza("First ad exposure time was never set");
                        return;
                    }
                    zzdVar.zzh(j11 - j12, zzj);
                    zzdVar.zzc = 0L;
                    return;
                }
                return;
            }
            zzdVar.zzb.put(str, Integer.valueOf(intValue));
            return;
        }
        zzdVar.zzs.zzay().zzd().zzb("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    private final void zzh(long j11, zzif zzifVar) {
        if (zzifVar == null) {
            this.zzs.zzay().zzj().zza("Not logging ad exposure. No active activity");
        } else if (j11 < 1000) {
            this.zzs.zzay().zzj().zzb("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j11));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j11);
            zzky.zzJ(zzifVar, bundle, true);
            this.zzs.zzq().zzG("am", "_xa", bundle);
        }
    }

    private final void zzi(String str, long j11, zzif zzifVar) {
        if (zzifVar == null) {
            this.zzs.zzay().zzj().zza("Not logging ad unit exposure. No active activity");
        } else if (j11 < 1000) {
            this.zzs.zzay().zzj().zzb("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j11));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j11);
            zzky.zzJ(zzifVar, bundle, true);
            this.zzs.zzq().zzG("am", "_xu", bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj(long j11) {
        for (String str : this.zza.keySet()) {
            this.zza.put(str, Long.valueOf(j11));
        }
        if (this.zza.isEmpty()) {
            return;
        }
        this.zzc = j11;
    }

    public final void zzd(String str, long j11) {
        if (str != null && str.length() != 0) {
            this.zzs.zzaz().zzp(new zza(this, str, j11));
        } else {
            this.zzs.zzay().zzd().zza("Ad unit id must be a non-empty string");
        }
    }

    public final void zze(String str, long j11) {
        if (str != null && str.length() != 0) {
            this.zzs.zzaz().zzp(new zzb(this, str, j11));
        } else {
            this.zzs.zzay().zzd().zza("Ad unit id must be a non-empty string");
        }
    }

    public final void zzf(long j11) {
        zzif zzj = this.zzs.zzs().zzj(false);
        for (String str : this.zza.keySet()) {
            zzi(str, j11 - ((Long) this.zza.get(str)).longValue(), zzj);
        }
        if (!this.zza.isEmpty()) {
            zzh(j11 - this.zzc, zzj);
        }
        zzj(j11);
    }
}