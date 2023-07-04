package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class zzhy {
    private static final Class<?> zzaaa = zzgs();
    private static final zzio<?, ?> zzaab = zzk(false);
    private static final zzio<?, ?> zzaac = zzk(true);
    private static final zzio<?, ?> zzaad = new zziq();

    public static void zza(int i11, List<Double> list, zzjj zzjjVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjjVar.zzg(i11, list, z11);
    }

    public static void zzb(int i11, List<Float> list, zzjj zzjjVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjjVar.zzf(i11, list, z11);
    }

    public static void zzc(int i11, List<Long> list, zzjj zzjjVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjjVar.zzc(i11, list, z11);
    }

    public static void zzd(int i11, List<Long> list, zzjj zzjjVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjjVar.zzd(i11, list, z11);
    }

    public static void zze(int i11, List<Long> list, zzjj zzjjVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjjVar.zzn(i11, list, z11);
    }

    public static void zzf(int i11, List<Long> list, zzjj zzjjVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjjVar.zze(i11, list, z11);
    }

    public static void zzg(Class<?> cls) {
        Class<?> cls2;
        if (!zzfy.class.isAssignableFrom(cls) && (cls2 = zzaaa) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static zzio<?, ?> zzgp() {
        return zzaab;
    }

    public static zzio<?, ?> zzgq() {
        return zzaac;
    }

    public static zzio<?, ?> zzgr() {
        return zzaad;
    }

    private static Class<?> zzgs() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzgt() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zzh(int i11, List<Integer> list, zzjj zzjjVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjjVar.zza(i11, list, z11);
    }

    public static void zzi(int i11, List<Integer> list, zzjj zzjjVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjjVar.zzj(i11, list, z11);
    }

    public static void zzj(int i11, List<Integer> list, zzjj zzjjVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjjVar.zzm(i11, list, z11);
    }

    public static void zzk(int i11, List<Integer> list, zzjj zzjjVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjjVar.zzb(i11, list, z11);
    }

    public static void zzl(int i11, List<Integer> list, zzjj zzjjVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjjVar.zzk(i11, list, z11);
    }

    public static void zzm(int i11, List<Integer> list, zzjj zzjjVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjjVar.zzh(i11, list, z11);
    }

    public static void zzn(int i11, List<Boolean> list, zzjj zzjjVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjjVar.zzi(i11, list, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzo(int i11, List<Long> list, boolean z11) {
        if (list.size() == 0) {
            return 0;
        }
        return zzq(list) + (list.size() * zzfe.zzav(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzp(int i11, List<Long> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzr(list) + (size * zzfe.zzav(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzq(List<Long> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgt) {
            zzgt zzgtVar = (zzgt) list;
            i11 = 0;
            while (i12 < size) {
                i11 += zzfe.zzh(zzgtVar.getLong(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += zzfe.zzh(list.get(i12).longValue());
                i12++;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzr(List<Long> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgt) {
            zzgt zzgtVar = (zzgt) list;
            i11 = 0;
            while (i12 < size) {
                i11 += zzfe.zzi(zzgtVar.getLong(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += zzfe.zzi(list.get(i12).longValue());
                i12++;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzs(List<Long> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgt) {
            zzgt zzgtVar = (zzgt) list;
            i11 = 0;
            while (i12 < size) {
                i11 += zzfe.zzj(zzgtVar.getLong(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += zzfe.zzj(list.get(i12).longValue());
                i12++;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzt(List<Integer> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfz) {
            zzfz zzfzVar = (zzfz) list;
            i11 = 0;
            while (i12 < size) {
                i11 += zzfe.zzbb(zzfzVar.getInt(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += zzfe.zzbb(list.get(i12).intValue());
                i12++;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzu(List<Integer> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfz) {
            zzfz zzfzVar = (zzfz) list;
            i11 = 0;
            while (i12 < size) {
                i11 += zzfe.zzaw(zzfzVar.getInt(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += zzfe.zzaw(list.get(i12).intValue());
                i12++;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzv(List<Integer> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfz) {
            zzfz zzfzVar = (zzfz) list;
            i11 = 0;
            while (i12 < size) {
                i11 += zzfe.zzax(zzfzVar.getInt(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += zzfe.zzax(list.get(i12).intValue());
                i12++;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzw(List<Integer> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfz) {
            zzfz zzfzVar = (zzfz) list;
            i11 = 0;
            while (i12 < size) {
                i11 += zzfe.zzay(zzfzVar.getInt(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += zzfe.zzay(list.get(i12).intValue());
                i12++;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzx(List<?> list) {
        return list.size() << 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzy(List<?> list) {
        return list.size() << 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzz(List<?> list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzx(int i11, List<?> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzfe.zzc(i11, true);
    }

    public static void zza(int i11, List<String> list, zzjj zzjjVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjjVar.zza(i11, list);
    }

    public static void zzb(int i11, List<zzeo> list, zzjj zzjjVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjjVar.zzb(i11, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i11, List<?> list) {
        int zzn;
        int zzn2;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        int zzav = zzfe.zzav(i11) * size;
        if (list instanceof zzgo) {
            zzgo zzgoVar = (zzgo) list;
            while (i12 < size) {
                Object raw = zzgoVar.getRaw(i12);
                if (raw instanceof zzeo) {
                    zzn2 = zzfe.zzb((zzeo) raw);
                } else {
                    zzn2 = zzfe.zzn((String) raw);
                }
                zzav += zzn2;
                i12++;
            }
        } else {
            while (i12 < size) {
                Object obj = list.get(i12);
                if (obj instanceof zzeo) {
                    zzn = zzfe.zzb((zzeo) obj);
                } else {
                    zzn = zzfe.zzn((String) obj);
                }
                zzav += zzn;
                i12++;
            }
        }
        return zzav;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i11, List<zzeo> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzav = size * zzfe.zzav(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            zzav += zzfe.zzb(list.get(i12));
        }
        return zzav;
    }

    private static zzio<?, ?> zzk(boolean z11) {
        try {
            Class<?> zzgt = zzgt();
            if (zzgt == null) {
                return null;
            }
            return (zzio) zzgt.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z11));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zzg(int i11, List<Long> list, zzjj zzjjVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjjVar.zzl(i11, list, z11);
    }

    public static void zza(int i11, List<?> list, zzjj zzjjVar, zzhw zzhwVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjjVar.zza(i11, list, zzhwVar);
    }

    public static void zzb(int i11, List<?> list, zzjj zzjjVar, zzhw zzhwVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjjVar.zzb(i11, list, zzhwVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzq(int i11, List<Long> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzs(list) + (size * zzfe.zzav(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzr(int i11, List<Integer> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzt(list) + (size * zzfe.zzav(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzs(int i11, List<Integer> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzu(list) + (size * zzfe.zzav(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzt(int i11, List<Integer> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzv(list) + (size * zzfe.zzav(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzu(int i11, List<Integer> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzw(list) + (size * zzfe.zzav(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzv(int i11, List<?> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzfe.zzl(i11, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzw(int i11, List<?> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzfe.zzg(i11, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void zza(zzha zzhaVar, T t11, T t12, long j11) {
        zziu.zza(t11, j11, zzhaVar.zzb(zziu.zzp(t11, j11), zziu.zzp(t12, j11)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i11, List<zzhf> list, zzhw zzhwVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            i12 += zzfe.zzc(i11, list.get(i13), zzhwVar);
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzd(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends zzfr<FT>> void zza(zzfl<FT> zzflVar, T t11, T t12) {
        zzfp<FT> zzc = zzflVar.zzc(t12);
        if (zzc.isEmpty()) {
            return;
        }
        zzflVar.zzd(t11).zza(zzc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void zza(zzio<UT, UB> zzioVar, T t11, T t12) {
        zzioVar.zze(t11, zzioVar.zzg(zzioVar.zzt(t11), zzioVar.zzt(t12)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i11, Object obj, zzhw zzhwVar) {
        if (obj instanceof zzgm) {
            return zzfe.zza(i11, (zzgm) obj);
        }
        return zzfe.zzb(i11, (zzhf) obj, zzhwVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB zza(int i11, List<Integer> list, zzgc<?> zzgcVar, UB ub2, zzio<UT, UB> zzioVar) {
        if (zzgcVar == null) {
            return ub2;
        }
        int size = list.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            int intValue = list.get(i13).intValue();
            if (zzgcVar.zzf(intValue) != null) {
                if (i13 != i12) {
                    list.set(i12, Integer.valueOf(intValue));
                }
                i12++;
            } else {
                ub2 = (UB) zza(i11, intValue, ub2, zzioVar);
            }
        }
        if (i12 != size) {
            list.subList(i12, size).clear();
        }
        return ub2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i11, List<?> list, zzhw zzhwVar) {
        int zzb;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzav = zzfe.zzav(i11) * size;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            if (obj instanceof zzgm) {
                zzb = zzfe.zza((zzgm) obj);
            } else {
                zzb = zzfe.zzb((zzhf) obj, zzhwVar);
            }
            zzav += zzb;
        }
        return zzav;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB zza(int i11, List<Integer> list, zzgd zzgdVar, UB ub2, zzio<UT, UB> zzioVar) {
        if (zzgdVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                int intValue = list.get(i13).intValue();
                if (zzgdVar.zzh(intValue)) {
                    if (i13 != i12) {
                        list.set(i12, Integer.valueOf(intValue));
                    }
                    i12++;
                } else {
                    ub2 = (UB) zza(i11, intValue, ub2, zzioVar);
                }
            }
            if (i12 != size) {
                list.subList(i12, size).clear();
            }
        } else {
            Iterator<Integer> it2 = list.iterator();
            while (it2.hasNext()) {
                int intValue2 = it2.next().intValue();
                if (!zzgdVar.zzh(intValue2)) {
                    ub2 = (UB) zza(i11, intValue2, ub2, zzioVar);
                    it2.remove();
                }
            }
        }
        return ub2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB zza(int i11, int i12, UB ub2, zzio<UT, UB> zzioVar) {
        if (ub2 == null) {
            ub2 = zzioVar.zzhd();
        }
        zzioVar.zza((zzio<UT, UB>) ub2, i11, i12);
        return ub2;
    }
}