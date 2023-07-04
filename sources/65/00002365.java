package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzlt {
    private static final Class zza;
    private static final zzmi zzb;
    private static final zzmi zzc;
    private static final zzmi zzd;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzab(false);
        zzc = zzab(true);
        zzd = new zzmk();
    }

    public static zzmi zzA() {
        return zzc;
    }

    public static zzmi zzB() {
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzC(int i11, List list, zzkd zzkdVar, Object obj, zzmi zzmiVar) {
        if (zzkdVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                int intValue = ((Integer) list.get(i13)).intValue();
                if (zzkdVar.zza(intValue)) {
                    if (i13 != i12) {
                        list.set(i12, Integer.valueOf(intValue));
                    }
                    i12++;
                } else {
                    obj = zzD(i11, intValue, obj, zzmiVar);
                }
            }
            if (i12 != size) {
                list.subList(i12, size).clear();
                return obj;
            }
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                int intValue2 = ((Integer) it2.next()).intValue();
                if (!zzkdVar.zza(intValue2)) {
                    obj = zzD(i11, intValue2, obj, zzmiVar);
                    it2.remove();
                }
            }
        }
        return obj;
    }

    static Object zzD(int i11, int i12, Object obj, zzmi zzmiVar) {
        if (obj == null) {
            obj = zzmiVar.zze();
        }
        zzmiVar.zzf(obj, i11, i12);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzE(zzjm zzjmVar, Object obj, Object obj2) {
        zzjmVar.zza(obj2);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzF(zzmi zzmiVar, Object obj, Object obj2) {
        zzmiVar.zzh(obj, zzmiVar.zzd(zzmiVar.zzc(obj), zzmiVar.zzc(obj2)));
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzjz.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzH(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzI(zzlb zzlbVar, Object obj, Object obj2, long j11) {
        zzms.zzs(obj, j11, zzlb.zzb(zzms.zzf(obj, j11), zzms.zzf(obj2, j11)));
    }

    public static void zzJ(int i11, List list, zzjh zzjhVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjhVar.zzc(i11, list, z11);
    }

    public static void zzK(int i11, List list, zzjh zzjhVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjhVar.zze(i11, list);
    }

    public static void zzL(int i11, List list, zzjh zzjhVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjhVar.zzg(i11, list, z11);
    }

    public static void zzM(int i11, List list, zzjh zzjhVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjhVar.zzj(i11, list, z11);
    }

    public static void zzN(int i11, List list, zzjh zzjhVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjhVar.zzl(i11, list, z11);
    }

    public static void zzO(int i11, List list, zzjh zzjhVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjhVar.zzn(i11, list, z11);
    }

    public static void zzP(int i11, List list, zzjh zzjhVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjhVar.zzp(i11, list, z11);
    }

    public static void zzQ(int i11, List list, zzjh zzjhVar, zzlr zzlrVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i12 = 0; i12 < list.size(); i12++) {
            zzjhVar.zzq(i11, list.get(i12), zzlrVar);
        }
    }

    public static void zzR(int i11, List list, zzjh zzjhVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjhVar.zzs(i11, list, z11);
    }

    public static void zzS(int i11, List list, zzjh zzjhVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjhVar.zzu(i11, list, z11);
    }

    public static void zzT(int i11, List list, zzjh zzjhVar, zzlr zzlrVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i12 = 0; i12 < list.size(); i12++) {
            zzjhVar.zzv(i11, list.get(i12), zzlrVar);
        }
    }

    public static void zzU(int i11, List list, zzjh zzjhVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjhVar.zzx(i11, list, z11);
    }

    public static void zzV(int i11, List list, zzjh zzjhVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjhVar.zzz(i11, list, z11);
    }

    public static void zzW(int i11, List list, zzjh zzjhVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjhVar.zzB(i11, list, z11);
    }

    public static void zzX(int i11, List list, zzjh zzjhVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjhVar.zzD(i11, list, z11);
    }

    public static void zzY(int i11, List list, zzjh zzjhVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjhVar.zzG(i11, list);
    }

    public static void zzZ(int i11, List list, zzjh zzjhVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjhVar.zzI(i11, list, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzjg.zzA(i11 << 3) + 1);
    }

    public static void zzaa(int i11, List list, zzjh zzjhVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjhVar.zzK(i11, list, z11);
    }

    private static zzmi zzab(boolean z11) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzmi) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z11));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(List list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i11, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = size * zzjg.zzz(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            zzz += zzjg.zzt((zziy) list.get(i12));
        }
        return zzz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzjg.zzz(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(List list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzka) {
            zzka zzkaVar = (zzka) list;
            i11 = 0;
            while (i12 < size) {
                i11 += zzjg.zzv(zzkaVar.zze(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += zzjg.zzv(((Integer) list.get(i12)).intValue());
                i12++;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzjg.zzA(i11 << 3) + 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzjg.zzA(i11 << 3) + 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(int i11, List list, zzlr zzlrVar) {
        int size = list.size();
        if (size != 0) {
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                i12 += zzjg.zzu(i11, (zzlg) list.get(i13), zzlrVar);
            }
            return i12;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzk(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzl(list) + (size * zzjg.zzz(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzl(List list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzka) {
            zzka zzkaVar = (zzka) list;
            i11 = 0;
            while (i12 < size) {
                i11 += zzjg.zzv(zzkaVar.zze(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += zzjg.zzv(((Integer) list.get(i12)).intValue());
                i12++;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzm(int i11, List list, boolean z11) {
        if (list.size() == 0) {
            return 0;
        }
        return zzn(list) + (list.size() * zzjg.zzz(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzn(List list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkv) {
            zzkv zzkvVar = (zzkv) list;
            i11 = 0;
            while (i12 < size) {
                i11 += zzjg.zzB(zzkvVar.zza(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += zzjg.zzB(((Long) list.get(i12)).longValue());
                i12++;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzo(int i11, Object obj, zzlr zzlrVar) {
        if (obj instanceof zzkm) {
            int zzA = zzjg.zzA(i11 << 3);
            int zza2 = ((zzkm) obj).zza();
            return zzA + zzjg.zzA(zza2) + zza2;
        }
        return zzjg.zzA(i11 << 3) + zzjg.zzx((zzlg) obj, zzlrVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzp(int i11, List list, zzlr zzlrVar) {
        int zzx;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = zzjg.zzz(i11) * size;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            if (obj instanceof zzkm) {
                zzx = zzjg.zzw((zzkm) obj);
            } else {
                zzx = zzjg.zzx((zzlg) obj, zzlrVar);
            }
            zzz += zzx;
        }
        return zzz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzq(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzr(list) + (size * zzjg.zzz(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzr(List list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzka) {
            zzka zzkaVar = (zzka) list;
            i11 = 0;
            while (i12 < size) {
                int zze = zzkaVar.zze(i12);
                i11 += zzjg.zzA((zze >> 31) ^ (zze + zze));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                int intValue = ((Integer) list.get(i12)).intValue();
                i11 += zzjg.zzA((intValue >> 31) ^ (intValue + intValue));
                i12++;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzs(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzt(list) + (size * zzjg.zzz(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzt(List list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkv) {
            zzkv zzkvVar = (zzkv) list;
            i11 = 0;
            while (i12 < size) {
                long zza2 = zzkvVar.zza(i12);
                i11 += zzjg.zzB((zza2 >> 63) ^ (zza2 + zza2));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                long longValue = ((Long) list.get(i12)).longValue();
                i11 += zzjg.zzB((longValue >> 63) ^ (longValue + longValue));
                i12++;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzu(int i11, List list) {
        int zzy;
        int zzy2;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        int zzz = zzjg.zzz(i11) * size;
        if (list instanceof zzko) {
            zzko zzkoVar = (zzko) list;
            while (i12 < size) {
                Object zzf = zzkoVar.zzf(i12);
                if (zzf instanceof zziy) {
                    zzy2 = zzjg.zzt((zziy) zzf);
                } else {
                    zzy2 = zzjg.zzy((String) zzf);
                }
                zzz += zzy2;
                i12++;
            }
        } else {
            while (i12 < size) {
                Object obj = list.get(i12);
                if (obj instanceof zziy) {
                    zzy = zzjg.zzt((zziy) obj);
                } else {
                    zzy = zzjg.zzy((String) obj);
                }
                zzz += zzy;
                i12++;
            }
        }
        return zzz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzv(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzw(list) + (size * zzjg.zzz(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzw(List list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzka) {
            zzka zzkaVar = (zzka) list;
            i11 = 0;
            while (i12 < size) {
                i11 += zzjg.zzA(zzkaVar.zze(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += zzjg.zzA(((Integer) list.get(i12)).intValue());
                i12++;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzx(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzy(list) + (size * zzjg.zzz(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzy(List list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkv) {
            zzkv zzkvVar = (zzkv) list;
            i11 = 0;
            while (i12 < size) {
                i11 += zzjg.zzB(zzkvVar.zza(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += zzjg.zzB(((Long) list.get(i12)).longValue());
                i12++;
            }
        }
        return i11;
    }

    public static zzmi zzz() {
        return zzb;
    }
}