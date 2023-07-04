package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzw extends zzai {
    final Map zza;
    private final zzj zzb;

    public zzw(zzj zzjVar) {
        super("require");
        this.zza = new HashMap();
        this.zzb = zzjVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        zzap zzapVar;
        zzh.zzh("require", 1, list);
        String zzi = zzgVar.zzb((zzap) list.get(0)).zzi();
        if (this.zza.containsKey(zzi)) {
            return (zzap) this.zza.get(zzi);
        }
        zzj zzjVar = this.zzb;
        if (zzjVar.zza.containsKey(zzi)) {
            try {
                zzapVar = (zzap) ((Callable) zzjVar.zza.get(zzi)).call();
            } catch (Exception unused) {
                String valueOf = String.valueOf(zzi);
                throw new IllegalStateException(valueOf.length() != 0 ? "Failed to create API implementation: ".concat(valueOf) : new String("Failed to create API implementation: "));
            }
        } else {
            zzapVar = zzap.zzf;
        }
        if (zzapVar instanceof zzai) {
            this.zza.put(zzi, (zzai) zzapVar);
        }
        return zzapVar;
    }
}