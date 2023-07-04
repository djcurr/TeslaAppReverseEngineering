package com.google.android.gms.measurement.internal;

import androidx.collection.a;
import com.google.android.gms.internal.measurement.zzoh;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzt {
    final /* synthetic */ zzz zza;
    private String zzb;
    private boolean zzc;
    private com.google.android.gms.internal.measurement.zzgd zzd;
    private BitSet zze;
    private BitSet zzf;
    private Map zzg;
    private Map zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzt(zzz zzzVar, String str, zzs zzsVar) {
        this.zza = zzzVar;
        this.zzb = str;
        this.zzc = true;
        this.zze = new BitSet();
        this.zzf = new BitSet();
        this.zzg = new a();
        this.zzh = new a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ BitSet zzb(zzt zztVar) {
        return zztVar.zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.gms.internal.measurement.zzfk zza(int i11) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.zzfj zzb = com.google.android.gms.internal.measurement.zzfk.zzb();
        zzb.zza(i11);
        zzb.zzc(this.zzc);
        com.google.android.gms.internal.measurement.zzgd zzgdVar = this.zzd;
        if (zzgdVar != null) {
            zzb.zzd(zzgdVar);
        }
        com.google.android.gms.internal.measurement.zzgc zzf = com.google.android.gms.internal.measurement.zzgd.zzf();
        zzf.zzb(zzkt.zzr(this.zze));
        zzf.zzd(zzkt.zzr(this.zzf));
        Map map = this.zzg;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.zzg.keySet()) {
                int intValue = num.intValue();
                Long l11 = (Long) this.zzg.get(Integer.valueOf(intValue));
                if (l11 != null) {
                    com.google.android.gms.internal.measurement.zzfl zzc = com.google.android.gms.internal.measurement.zzfm.zzc();
                    zzc.zzb(intValue);
                    zzc.zza(l11.longValue());
                    arrayList2.add((com.google.android.gms.internal.measurement.zzfm) zzc.zzay());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            zzf.zza(arrayList);
        }
        Map map2 = this.zzh;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.zzh.keySet()) {
                com.google.android.gms.internal.measurement.zzge zzd = com.google.android.gms.internal.measurement.zzgf.zzd();
                zzd.zzb(num2.intValue());
                List list2 = (List) this.zzh.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    zzd.zza(list2);
                }
                arrayList3.add((com.google.android.gms.internal.measurement.zzgf) zzd.zzay());
            }
            list = arrayList3;
        }
        zzf.zzc(list);
        zzb.zzb(zzf);
        return (com.google.android.gms.internal.measurement.zzfk) zzb.zzay();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(zzx zzxVar) {
        int zza = zzxVar.zza();
        Boolean bool = zzxVar.zzd;
        if (bool != null) {
            this.zzf.set(zza, bool.booleanValue());
        }
        Boolean bool2 = zzxVar.zze;
        if (bool2 != null) {
            this.zze.set(zza, bool2.booleanValue());
        }
        if (zzxVar.zzf != null) {
            Map map = this.zzg;
            Integer valueOf = Integer.valueOf(zza);
            Long l11 = (Long) map.get(valueOf);
            long longValue = zzxVar.zzf.longValue() / 1000;
            if (l11 == null || longValue > l11.longValue()) {
                this.zzg.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (zzxVar.zzg != null) {
            Map map2 = this.zzh;
            Integer valueOf2 = Integer.valueOf(zza);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.zzh.put(valueOf2, list);
            }
            if (zzxVar.zzc()) {
                list.clear();
            }
            zzoh.zzc();
            zzaf zzf = this.zza.zzs.zzf();
            String str = this.zzb;
            zzdv zzdvVar = zzdw.zzW;
            if (zzf.zzs(str, zzdvVar) && zzxVar.zzb()) {
                list.clear();
            }
            zzoh.zzc();
            if (this.zza.zzs.zzf().zzs(this.zzb, zzdvVar)) {
                Long valueOf3 = Long.valueOf(zzxVar.zzg.longValue() / 1000);
                if (list.contains(valueOf3)) {
                    return;
                }
                list.add(valueOf3);
                return;
            }
            list.add(Long.valueOf(zzxVar.zzg.longValue() / 1000));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzt(zzz zzzVar, String str, com.google.android.gms.internal.measurement.zzgd zzgdVar, BitSet bitSet, BitSet bitSet2, Map map, Map map2, zzs zzsVar) {
        this.zza = zzzVar;
        this.zzb = str;
        this.zze = bitSet;
        this.zzf = bitSet2;
        this.zzg = map;
        this.zzh = new a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.zzh.put(num, arrayList);
        }
        this.zzc = false;
        this.zzd = zzgdVar;
    }
}