package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzagt {
    private static final Class zza;
    private static final zzahi zzb;
    private static final zzahi zzc;
    private static final zzahi zzd;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzZ(false);
        zzc = zzZ(true);
        zzd = new zzahk();
    }

    public static zzahi zzA() {
        return zzc;
    }

    public static zzahi zzB() {
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzC(zzaeo zzaeoVar, Object obj, Object obj2) {
        zzaeoVar.zza(obj2);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzD(zzahi zzahiVar, Object obj, Object obj2) {
        zzahiVar.zzf(obj, zzahiVar.zzd(zzahiVar.zzc(obj), zzahiVar.zzc(obj2)));
    }

    public static void zzE(Class cls) {
        Class cls2;
        if (!zzaey.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzF(int i11, List list, zzahz zzahzVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzahzVar.zzc(i11, list, z11);
    }

    public static void zzG(int i11, List list, zzahz zzahzVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzahzVar.zze(i11, list);
    }

    public static void zzH(int i11, List list, zzahz zzahzVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzahzVar.zzg(i11, list, z11);
    }

    public static void zzI(int i11, List list, zzahz zzahzVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzahzVar.zzi(i11, list, z11);
    }

    public static void zzJ(int i11, List list, zzahz zzahzVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzahzVar.zzk(i11, list, z11);
    }

    public static void zzK(int i11, List list, zzahz zzahzVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzahzVar.zzm(i11, list, z11);
    }

    public static void zzL(int i11, List list, zzahz zzahzVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzahzVar.zzo(i11, list, z11);
    }

    public static void zzM(int i11, List list, zzahz zzahzVar, zzagr zzagrVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((zzaem) zzahzVar).zzp(i11, list.get(i12), zzagrVar);
        }
    }

    public static void zzN(int i11, List list, zzahz zzahzVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzahzVar.zzr(i11, list, z11);
    }

    public static void zzO(int i11, List list, zzahz zzahzVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzahzVar.zzt(i11, list, z11);
    }

    public static void zzP(int i11, List list, zzahz zzahzVar, zzagr zzagrVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((zzaem) zzahzVar).zzu(i11, list.get(i12), zzagrVar);
        }
    }

    public static void zzQ(int i11, List list, zzahz zzahzVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzahzVar.zzw(i11, list, z11);
    }

    public static void zzR(int i11, List list, zzahz zzahzVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzahzVar.zzy(i11, list, z11);
    }

    public static void zzS(int i11, List list, zzahz zzahzVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzahzVar.zzA(i11, list, z11);
    }

    public static void zzT(int i11, List list, zzahz zzahzVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzahzVar.zzC(i11, list, z11);
    }

    public static void zzU(int i11, List list, zzahz zzahzVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzahzVar.zzE(i11, list);
    }

    public static void zzV(int i11, List list, zzahz zzahzVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzahzVar.zzG(i11, list, z11);
    }

    public static void zzW(int i11, List list, zzahz zzahzVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzahzVar.zzI(i11, list, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzX(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzY(zzagb zzagbVar, Object obj, Object obj2, long j11) {
        zzaga zzagaVar = (zzaga) zzahs.zzf(obj, j11);
        zzaga zzagaVar2 = (zzaga) zzahs.zzf(obj2, j11);
        if (!zzagaVar2.isEmpty()) {
            if (!zzagaVar.zzd()) {
                zzagaVar = zzagaVar.zza();
            }
            zzagaVar.zzc(zzagaVar2);
        }
        zzahs.zzs(obj, j11, zzagaVar);
    }

    private static zzahi zzZ(boolean z11) {
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
            return (zzahi) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z11));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzael.zzA(i11 << 3) + 1);
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
        int zzz = size * zzael.zzz(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            zzz += zzael.zzt((zzaed) list.get(i12));
        }
        return zzz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzael.zzz(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(List list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaez) {
            zzaez zzaezVar = (zzaez) list;
            i11 = 0;
            while (i12 < size) {
                i11 += zzael.zzv(zzaezVar.zzd(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += zzael.zzv(((Integer) list.get(i12)).intValue());
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
        return size * (zzael.zzA(i11 << 3) + 4);
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
        return size * (zzael.zzA(i11 << 3) + 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(int i11, List list, zzagr zzagrVar) {
        int size = list.size();
        if (size != 0) {
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                i12 += zzael.zzu(i11, (zzagg) list.get(i13), zzagrVar);
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
        return zzl(list) + (size * zzael.zzz(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzl(List list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaez) {
            zzaez zzaezVar = (zzaez) list;
            i11 = 0;
            while (i12 < size) {
                i11 += zzael.zzv(zzaezVar.zzd(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += zzael.zzv(((Integer) list.get(i12)).intValue());
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
        return zzn(list) + (list.size() * zzael.zzz(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzn(List list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzafv) {
            zzafv zzafvVar = (zzafv) list;
            i11 = 0;
            while (i12 < size) {
                i11 += zzael.zzB(zzafvVar.zzd(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += zzael.zzB(((Long) list.get(i12)).longValue());
                i12++;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzo(int i11, Object obj, zzagr zzagrVar) {
        if (obj instanceof zzafm) {
            int zzA = zzael.zzA(i11 << 3);
            int zza2 = ((zzafm) obj).zza();
            return zzA + zzael.zzA(zza2) + zza2;
        }
        return zzael.zzA(i11 << 3) + zzael.zzx((zzagg) obj, zzagrVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzp(int i11, List list, zzagr zzagrVar) {
        int zzx;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = zzael.zzz(i11) * size;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            if (obj instanceof zzafm) {
                zzx = zzael.zzw((zzafm) obj);
            } else {
                zzx = zzael.zzx((zzagg) obj, zzagrVar);
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
        return zzr(list) + (size * zzael.zzz(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzr(List list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaez) {
            zzaez zzaezVar = (zzaez) list;
            i11 = 0;
            while (i12 < size) {
                int zzd2 = zzaezVar.zzd(i12);
                i11 += zzael.zzA((zzd2 >> 31) ^ (zzd2 + zzd2));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                int intValue = ((Integer) list.get(i12)).intValue();
                i11 += zzael.zzA((intValue >> 31) ^ (intValue + intValue));
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
        return zzt(list) + (size * zzael.zzz(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzt(List list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzafv) {
            zzafv zzafvVar = (zzafv) list;
            i11 = 0;
            while (i12 < size) {
                long zzd2 = zzafvVar.zzd(i12);
                i11 += zzael.zzB((zzd2 >> 63) ^ (zzd2 + zzd2));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                long longValue = ((Long) list.get(i12)).longValue();
                i11 += zzael.zzB((longValue >> 63) ^ (longValue + longValue));
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
        int zzz = zzael.zzz(i11) * size;
        if (list instanceof zzafo) {
            zzafo zzafoVar = (zzafo) list;
            while (i12 < size) {
                Object zze = zzafoVar.zze(i12);
                if (zze instanceof zzaed) {
                    zzy2 = zzael.zzt((zzaed) zze);
                } else {
                    zzy2 = zzael.zzy((String) zze);
                }
                zzz += zzy2;
                i12++;
            }
        } else {
            while (i12 < size) {
                Object obj = list.get(i12);
                if (obj instanceof zzaed) {
                    zzy = zzael.zzt((zzaed) obj);
                } else {
                    zzy = zzael.zzy((String) obj);
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
        return zzw(list) + (size * zzael.zzz(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzw(List list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaez) {
            zzaez zzaezVar = (zzaez) list;
            i11 = 0;
            while (i12 < size) {
                i11 += zzael.zzA(zzaezVar.zzd(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += zzael.zzA(((Integer) list.get(i12)).intValue());
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
        return zzy(list) + (size * zzael.zzz(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzy(List list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzafv) {
            zzafv zzafvVar = (zzafv) list;
            i11 = 0;
            while (i12 < size) {
                i11 += zzael.zzB(zzafvVar.zzd(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += zzael.zzB(((Long) list.get(i12)).longValue());
                i12++;
            }
        }
        return i11;
    }

    public static zzahi zzz() {
        return zzb;
    }
}