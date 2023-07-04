package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfy;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzfg implements zzjj {
    private final zzfe zzsd;

    private zzfg(zzfe zzfeVar) {
        zzfe zzfeVar2 = (zzfe) zzga.zza(zzfeVar, "output");
        this.zzsd = zzfeVar2;
        zzfeVar2.zzss = this;
    }

    public static zzfg zza(zzfe zzfeVar) {
        zzfg zzfgVar = zzfeVar.zzss;
        return zzfgVar != null ? zzfgVar : new zzfg(zzfeVar);
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zzb(int i11, boolean z11) {
        this.zzsd.zzb(i11, z11);
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zzbe(int i11) {
        this.zzsd.zzd(i11, 3);
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zzbf(int i11) {
        this.zzsd.zzd(i11, 4);
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zzc(int i11, long j11) {
        this.zzsd.zzc(i11, j11);
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zzd(int i11, List<Long> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.zzsd.zzd(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzfe.zzi(list.get(i14).longValue());
            }
            this.zzsd.zzas(i13);
            while (i12 < list.size()) {
                this.zzsd.zze(list.get(i12).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.zzsd.zza(i11, list.get(i12).longValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zze(int i11, int i12) {
        this.zzsd.zze(i11, i12);
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final int zzed() {
        return zzfy.zzg.zzxi;
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zzf(int i11, int i12) {
        this.zzsd.zzf(i11, i12);
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zzg(int i11, int i12) {
        this.zzsd.zzg(i11, i12);
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zzh(int i11, int i12) {
        this.zzsd.zzh(i11, i12);
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zzi(int i11, long j11) {
        this.zzsd.zza(i11, j11);
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zzj(int i11, long j11) {
        this.zzsd.zzc(i11, j11);
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zzk(int i11, List<Integer> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.zzsd.zzd(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzfe.zzba(list.get(i14).intValue());
            }
            this.zzsd.zzas(i13);
            while (i12 < list.size()) {
                this.zzsd.zzau(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.zzsd.zzh(i11, list.get(i12).intValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zzl(int i11, List<Long> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.zzsd.zzd(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzfe.zzl(list.get(i14).longValue());
            }
            this.zzsd.zzas(i13);
            while (i12 < list.size()) {
                this.zzsd.zzg(list.get(i12).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.zzsd.zzc(i11, list.get(i12).longValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zzm(int i11, List<Integer> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.zzsd.zzd(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzfe.zzay(list.get(i14).intValue());
            }
            this.zzsd.zzas(i13);
            while (i12 < list.size()) {
                this.zzsd.zzat(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.zzsd.zzg(i11, list.get(i12).intValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zzn(int i11, List<Long> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.zzsd.zzd(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzfe.zzj(list.get(i14).longValue());
            }
            this.zzsd.zzas(i13);
            while (i12 < list.size()) {
                this.zzsd.zzf(list.get(i12).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.zzsd.zzb(i11, list.get(i12).longValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zzo(int i11, int i12) {
        this.zzsd.zzh(i11, i12);
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zzp(int i11, int i12) {
        this.zzsd.zze(i11, i12);
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zzb(int i11, long j11) {
        this.zzsd.zzb(i11, j11);
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zzc(int i11, List<Long> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.zzsd.zzd(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzfe.zzh(list.get(i14).longValue());
            }
            this.zzsd.zzas(i13);
            while (i12 < list.size()) {
                this.zzsd.zze(list.get(i12).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.zzsd.zza(i11, list.get(i12).longValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zze(int i11, List<Long> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.zzsd.zzd(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzfe.zzk(list.get(i14).longValue());
            }
            this.zzsd.zzas(i13);
            while (i12 < list.size()) {
                this.zzsd.zzg(list.get(i12).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.zzsd.zzc(i11, list.get(i12).longValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zzf(int i11, List<Float> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.zzsd.zzd(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzfe.zzg(list.get(i14).floatValue());
            }
            this.zzsd.zzas(i13);
            while (i12 < list.size()) {
                this.zzsd.zzf(list.get(i12).floatValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.zzsd.zza(i11, list.get(i12).floatValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zzg(int i11, List<Double> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.zzsd.zzd(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzfe.zzb(list.get(i14).doubleValue());
            }
            this.zzsd.zzas(i13);
            while (i12 < list.size()) {
                this.zzsd.zza(list.get(i12).doubleValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.zzsd.zza(i11, list.get(i12).doubleValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zzh(int i11, List<Integer> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.zzsd.zzd(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzfe.zzbb(list.get(i14).intValue());
            }
            this.zzsd.zzas(i13);
            while (i12 < list.size()) {
                this.zzsd.zzar(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.zzsd.zze(i11, list.get(i12).intValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zza(int i11, float f11) {
        this.zzsd.zza(i11, f11);
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zzb(int i11, Object obj, zzhw zzhwVar) {
        zzfe zzfeVar = this.zzsd;
        zzfeVar.zzd(i11, 3);
        zzhwVar.zza((zzhf) obj, zzfeVar.zzss);
        zzfeVar.zzd(i11, 4);
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zzi(int i11, List<Boolean> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.zzsd.zzd(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzfe.zzi(list.get(i14).booleanValue());
            }
            this.zzsd.zzas(i13);
            while (i12 < list.size()) {
                this.zzsd.zzh(list.get(i12).booleanValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.zzsd.zzb(i11, list.get(i12).booleanValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zzj(int i11, List<Integer> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.zzsd.zzd(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzfe.zzax(list.get(i14).intValue());
            }
            this.zzsd.zzas(i13);
            while (i12 < list.size()) {
                this.zzsd.zzas(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.zzsd.zzf(i11, list.get(i12).intValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zza(int i11, double d11) {
        this.zzsd.zza(i11, d11);
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zza(int i11, long j11) {
        this.zzsd.zza(i11, j11);
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zza(int i11, String str) {
        this.zzsd.zza(i11, str);
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zza(int i11, zzeo zzeoVar) {
        this.zzsd.zza(i11, zzeoVar);
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zzb(int i11, List<Integer> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.zzsd.zzd(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzfe.zzaz(list.get(i14).intValue());
            }
            this.zzsd.zzas(i13);
            while (i12 < list.size()) {
                this.zzsd.zzau(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.zzsd.zzh(i11, list.get(i12).intValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zza(int i11, Object obj, zzhw zzhwVar) {
        this.zzsd.zza(i11, (zzhf) obj, zzhwVar);
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zza(int i11, Object obj) {
        if (obj instanceof zzeo) {
            this.zzsd.zzb(i11, (zzeo) obj);
        } else {
            this.zzsd.zzb(i11, (zzhf) obj);
        }
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zza(int i11, List<Integer> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.zzsd.zzd(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzfe.zzaw(list.get(i14).intValue());
            }
            this.zzsd.zzas(i13);
            while (i12 < list.size()) {
                this.zzsd.zzar(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.zzsd.zze(i11, list.get(i12).intValue());
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zzb(int i11, List<zzeo> list) {
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.zzsd.zza(i11, list.get(i12));
        }
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zzb(int i11, List<?> list, zzhw zzhwVar) {
        for (int i12 = 0; i12 < list.size(); i12++) {
            zzb(i11, list.get(i12), zzhwVar);
        }
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zza(int i11, List<String> list) {
        int i12 = 0;
        if (list instanceof zzgo) {
            zzgo zzgoVar = (zzgo) list;
            while (i12 < list.size()) {
                Object raw = zzgoVar.getRaw(i12);
                if (raw instanceof String) {
                    this.zzsd.zza(i11, (String) raw);
                } else {
                    this.zzsd.zza(i11, (zzeo) raw);
                }
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.zzsd.zza(i11, list.get(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final void zza(int i11, List<?> list, zzhw zzhwVar) {
        for (int i12 = 0; i12 < list.size(); i12++) {
            zza(i11, list.get(i12), zzhwVar);
        }
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    public final <K, V> void zza(int i11, zzgy<K, V> zzgyVar, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zzsd.zzd(i11, 2);
            this.zzsd.zzas(zzgx.zza(zzgyVar, entry.getKey(), entry.getValue()));
            zzgx.zza(this.zzsd, zzgyVar, entry.getKey(), entry.getValue());
        }
    }
}