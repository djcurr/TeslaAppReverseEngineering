package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class zzeh {
    private static final Class<?> zzoh = zzdp();
    private static final zzex<?, ?> zzoi = zzd(false);
    private static final zzex<?, ?> zzoj = zzd(true);
    private static final zzex<?, ?> zzok = new zzez();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(List<Long> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdc) {
            zzdc zzdcVar = (zzdc) list;
            i11 = 0;
            while (i12 < size) {
                i11 += zzbn.zze(zzdcVar.getLong(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += zzbn.zze(list.get(i12).longValue());
                i12++;
            }
        }
        return i11;
    }

    private static <UT, UB> UB zza(int i11, int i12, UB ub2, zzex<UT, UB> zzexVar) {
        if (ub2 == null) {
            ub2 = zzexVar.zzdz();
        }
        zzexVar.zza((zzex<UT, UB>) ub2, i11, i12);
        return ub2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB zza(int i11, List<Integer> list, zzck<?> zzckVar, UB ub2, zzex<UT, UB> zzexVar) {
        if (zzckVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                int intValue = list.get(i13).intValue();
                if (zzckVar.zzb(intValue) != null) {
                    if (i13 != i12) {
                        list.set(i12, Integer.valueOf(intValue));
                    }
                    i12++;
                } else {
                    ub2 = (UB) zza(i11, intValue, ub2, zzexVar);
                }
            }
            if (i12 != size) {
                list.subList(i12, size).clear();
            }
        } else {
            Iterator<Integer> it2 = list.iterator();
            while (it2.hasNext()) {
                int intValue2 = it2.next().intValue();
                if (zzckVar.zzb(intValue2) == null) {
                    ub2 = (UB) zza(i11, intValue2, ub2, zzexVar);
                    it2.remove();
                }
            }
        }
        return ub2;
    }

    public static void zza(int i11, List<String> list, zzfr zzfrVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zza(i11, list);
    }

    public static void zza(int i11, List<?> list, zzfr zzfrVar, zzef zzefVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zza(i11, list, zzefVar);
    }

    public static void zza(int i11, List<Double> list, zzfr zzfrVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzg(i11, list, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends zzca<FT>> void zza(zzbu<FT> zzbuVar, T t11, T t12) {
        zzby<FT> zza = zzbuVar.zza(t12);
        if (zza.isEmpty()) {
            return;
        }
        zzbuVar.zzb(t11).zza(zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void zza(zzdj zzdjVar, T t11, T t12, long j11) {
        zzfd.zza(t11, j11, zzdjVar.zzb(zzfd.zzo(t11, j11), zzfd.zzo(t12, j11)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void zza(zzex<UT, UB> zzexVar, T t11, T t12) {
        zzexVar.zze(t11, zzexVar.zzg(zzexVar.zzq(t11), zzexVar.zzq(t12)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(List<Long> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdc) {
            zzdc zzdcVar = (zzdc) list;
            i11 = 0;
            while (i12 < size) {
                i11 += zzbn.zzf(zzdcVar.getLong(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += zzbn.zzf(list.get(i12).longValue());
                i12++;
            }
        }
        return i11;
    }

    public static void zzb(int i11, List<zzbb> list, zzfr zzfrVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzb(i11, list);
    }

    public static void zzb(int i11, List<?> list, zzfr zzfrVar, zzef zzefVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzb(i11, list, zzefVar);
    }

    public static void zzb(int i11, List<Float> list, zzfr zzfrVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzf(i11, list, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i11, Object obj, zzef zzefVar) {
        return obj instanceof zzcv ? zzbn.zza(i11, (zzcv) obj) : zzbn.zzb(i11, (zzdo) obj, zzefVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i11, List<?> list) {
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        int zzr = zzbn.zzr(i11) * size;
        if (list instanceof zzcx) {
            zzcx zzcxVar = (zzcx) list;
            while (i12 < size) {
                Object raw = zzcxVar.getRaw(i12);
                zzr += raw instanceof zzbb ? zzbn.zzb((zzbb) raw) : zzbn.zzh((String) raw);
                i12++;
            }
        } else {
            while (i12 < size) {
                Object obj = list.get(i12);
                zzr += obj instanceof zzbb ? zzbn.zzb((zzbb) obj) : zzbn.zzh((String) obj);
                i12++;
            }
        }
        return zzr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i11, List<?> list, zzef zzefVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzr = zzbn.zzr(i11) * size;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            zzr += obj instanceof zzcv ? zzbn.zza((zzcv) obj) : zzbn.zzb((zzdo) obj, zzefVar);
        }
        return zzr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(List<Long> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdc) {
            zzdc zzdcVar = (zzdc) list;
            i11 = 0;
            while (i12 < size) {
                i11 += zzbn.zzg(zzdcVar.getLong(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += zzbn.zzg(list.get(i12).longValue());
                i12++;
            }
        }
        return i11;
    }

    public static void zzc(int i11, List<Long> list, zzfr zzfrVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzc(i11, list, z11);
    }

    public static boolean zzc(int i11, int i12, int i13) {
        if (i12 < 40) {
            return true;
        }
        long j11 = i13;
        return ((((long) i12) - ((long) i11)) + 1) + 9 <= ((2 * j11) + 3) + ((j11 + 3) * 3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i11, List<zzbb> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzr = size * zzbn.zzr(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            zzr += zzbn.zzb(list.get(i12));
        }
        return zzr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i11, List<zzdo> list, zzef zzefVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            i12 += zzbn.zzc(i11, list.get(i13), zzefVar);
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(List<Integer> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzch) {
            zzch zzchVar = (zzch) list;
            i11 = 0;
            while (i12 < size) {
                i11 += zzbn.zzx(zzchVar.getInt(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += zzbn.zzx(list.get(i12).intValue());
                i12++;
            }
        }
        return i11;
    }

    private static zzex<?, ?> zzd(boolean z11) {
        try {
            Class<?> zzdq = zzdq();
            if (zzdq == null) {
                return null;
            }
            return (zzex) zzdq.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z11));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zzd(int i11, List<Long> list, zzfr zzfrVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzd(i11, list, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzd(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static zzex<?, ?> zzdm() {
        return zzoi;
    }

    public static zzex<?, ?> zzdn() {
        return zzoj;
    }

    public static zzex<?, ?> zzdo() {
        return zzok;
    }

    private static Class<?> zzdp() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzdq() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(List<Integer> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzch) {
            zzch zzchVar = (zzch) list;
            i11 = 0;
            while (i12 < size) {
                i11 += zzbn.zzs(zzchVar.getInt(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += zzbn.zzs(list.get(i12).intValue());
                i12++;
            }
        }
        return i11;
    }

    public static void zze(int i11, List<Long> list, zzfr zzfrVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzn(i11, list, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(List<Integer> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzch) {
            zzch zzchVar = (zzch) list;
            i11 = 0;
            while (i12 < size) {
                i11 += zzbn.zzt(zzchVar.getInt(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += zzbn.zzt(list.get(i12).intValue());
                i12++;
            }
        }
        return i11;
    }

    public static void zzf(int i11, List<Long> list, zzfr zzfrVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zze(i11, list, z11);
    }

    public static void zzf(Class<?> cls) {
        Class<?> cls2;
        if (!zzcg.class.isAssignableFrom(cls) && (cls2 = zzoh) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(List<Integer> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzch) {
            zzch zzchVar = (zzch) list;
            i11 = 0;
            while (i12 < size) {
                i11 += zzbn.zzu(zzchVar.getInt(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += zzbn.zzu(list.get(i12).intValue());
                i12++;
            }
        }
        return i11;
    }

    public static void zzg(int i11, List<Long> list, zzfr zzfrVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzl(i11, list, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(List<?> list) {
        return list.size() << 2;
    }

    public static void zzh(int i11, List<Integer> list, zzfr zzfrVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zza(i11, list, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(List<?> list) {
        return list.size() << 3;
    }

    public static void zzi(int i11, List<Integer> list, zzfr zzfrVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzj(i11, list, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(List<?> list) {
        return list.size();
    }

    public static void zzj(int i11, List<Integer> list, zzfr zzfrVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzm(i11, list, z11);
    }

    public static void zzk(int i11, List<Integer> list, zzfr zzfrVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzb(i11, list, z11);
    }

    public static void zzl(int i11, List<Integer> list, zzfr zzfrVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzk(i11, list, z11);
    }

    public static void zzm(int i11, List<Integer> list, zzfr zzfrVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzh(i11, list, z11);
    }

    public static void zzn(int i11, List<Boolean> list, zzfr zzfrVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzi(i11, list, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzo(int i11, List<Long> list, boolean z11) {
        if (list.size() == 0) {
            return 0;
        }
        return zza(list) + (list.size() * zzbn.zzr(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzp(int i11, List<Long> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * zzbn.zzr(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzq(int i11, List<Long> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzc(list) + (size * zzbn.zzr(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzr(int i11, List<Integer> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzd(list) + (size * zzbn.zzr(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzs(int i11, List<Integer> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzbn.zzr(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzt(int i11, List<Integer> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzf(list) + (size * zzbn.zzr(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzu(int i11, List<Integer> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * zzbn.zzr(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzv(int i11, List<?> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzbn.zzj(i11, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzw(int i11, List<?> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzbn.zzg(i11, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzx(int i11, List<?> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzbn.zzc(i11, true);
    }
}