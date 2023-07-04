package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzlj<T> implements zzlr<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzms.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlg zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzku zzm;
    private final zzmi zzn;
    private final zzjm zzo;
    private final zzll zzp;
    private final zzlb zzq;

    private zzlj(int[] iArr, Object[] objArr, int i11, int i12, zzlg zzlgVar, boolean z11, boolean z12, int[] iArr2, int i13, int i14, zzll zzllVar, zzku zzkuVar, zzmi zzmiVar, zzjm zzjmVar, zzlb zzlbVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i11;
        this.zzf = i12;
        this.zzi = z11;
        boolean z13 = false;
        if (zzjmVar != null && zzjmVar.zzc(zzlgVar)) {
            z13 = true;
        }
        this.zzh = z13;
        this.zzj = iArr2;
        this.zzk = i13;
        this.zzl = i14;
        this.zzp = zzllVar;
        this.zzm = zzkuVar;
        this.zzn = zzmiVar;
        this.zzo = zzjmVar;
        this.zzg = zzlgVar;
        this.zzq = zzlbVar;
    }

    private static int zzA(int i11) {
        return (i11 >>> 20) & 255;
    }

    private final int zzB(int i11) {
        return this.zzc[i11 + 1];
    }

    private static long zzC(Object obj, long j11) {
        return ((Long) zzms.zzf(obj, j11)).longValue();
    }

    private final zzkd zzD(int i11) {
        int i12 = i11 / 3;
        return (zzkd) this.zzd[i12 + i12 + 1];
    }

    private final zzlr zzE(int i11) {
        int i12 = i11 / 3;
        int i13 = i12 + i12;
        zzlr zzlrVar = (zzlr) this.zzd[i13];
        if (zzlrVar != null) {
            return zzlrVar;
        }
        zzlr zzb2 = zzlo.zza().zzb((Class) this.zzd[i13 + 1]);
        this.zzd[i13] = zzb2;
        return zzb2;
    }

    private final Object zzF(int i11) {
        int i12 = i11 / 3;
        return this.zzd[i12 + i12];
    }

    private static Field zzG(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb2.append("Field ");
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(name);
            sb2.append(" not found. Known fields are ");
            sb2.append(arrays);
            throw new RuntimeException(sb2.toString());
        }
    }

    private final void zzH(Object obj, Object obj2, int i11) {
        long zzB = zzB(i11) & 1048575;
        if (zzM(obj2, i11)) {
            Object zzf = zzms.zzf(obj, zzB);
            Object zzf2 = zzms.zzf(obj2, zzB);
            if (zzf != null && zzf2 != null) {
                zzms.zzs(obj, zzB, zzkh.zzg(zzf, zzf2));
                zzJ(obj, i11);
            } else if (zzf2 != null) {
                zzms.zzs(obj, zzB, zzf2);
                zzJ(obj, i11);
            }
        }
    }

    private final void zzI(Object obj, Object obj2, int i11) {
        int zzB = zzB(i11);
        int i12 = this.zzc[i11];
        long j11 = zzB & 1048575;
        if (zzP(obj2, i12, i11)) {
            Object zzf = zzP(obj, i12, i11) ? zzms.zzf(obj, j11) : null;
            Object zzf2 = zzms.zzf(obj2, j11);
            if (zzf != null && zzf2 != null) {
                zzms.zzs(obj, j11, zzkh.zzg(zzf, zzf2));
                zzK(obj, i12, i11);
            } else if (zzf2 != null) {
                zzms.zzs(obj, j11, zzf2);
                zzK(obj, i12, i11);
            }
        }
    }

    private final void zzJ(Object obj, int i11) {
        int zzy = zzy(i11);
        long j11 = 1048575 & zzy;
        if (j11 == 1048575) {
            return;
        }
        zzms.zzq(obj, j11, (1 << (zzy >>> 20)) | zzms.zzc(obj, j11));
    }

    private final void zzK(Object obj, int i11, int i12) {
        zzms.zzq(obj, zzy(i12) & 1048575, i11);
    }

    private final boolean zzL(Object obj, Object obj2, int i11) {
        return zzM(obj, i11) == zzM(obj2, i11);
    }

    private final boolean zzM(Object obj, int i11) {
        int zzy = zzy(i11);
        long j11 = zzy & 1048575;
        if (j11 != 1048575) {
            return (zzms.zzc(obj, j11) & (1 << (zzy >>> 20))) != 0;
        }
        int zzB = zzB(i11);
        long j12 = zzB & 1048575;
        switch (zzA(zzB)) {
            case 0:
                return Double.doubleToRawLongBits(zzms.zza(obj, j12)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzms.zzb(obj, j12)) != 0;
            case 2:
                return zzms.zzd(obj, j12) != 0;
            case 3:
                return zzms.zzd(obj, j12) != 0;
            case 4:
                return zzms.zzc(obj, j12) != 0;
            case 5:
                return zzms.zzd(obj, j12) != 0;
            case 6:
                return zzms.zzc(obj, j12) != 0;
            case 7:
                return zzms.zzw(obj, j12);
            case 8:
                Object zzf = zzms.zzf(obj, j12);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                } else if (zzf instanceof zziy) {
                    return !zziy.zzb.equals(zzf);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzms.zzf(obj, j12) != null;
            case 10:
                return !zziy.zzb.equals(zzms.zzf(obj, j12));
            case 11:
                return zzms.zzc(obj, j12) != 0;
            case 12:
                return zzms.zzc(obj, j12) != 0;
            case 13:
                return zzms.zzc(obj, j12) != 0;
            case 14:
                return zzms.zzd(obj, j12) != 0;
            case 15:
                return zzms.zzc(obj, j12) != 0;
            case 16:
                return zzms.zzd(obj, j12) != 0;
            case 17:
                return zzms.zzf(obj, j12) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzN(Object obj, int i11, int i12, int i13, int i14) {
        if (i12 == 1048575) {
            return zzM(obj, i11);
        }
        return (i13 & i14) != 0;
    }

    private static boolean zzO(Object obj, int i11, zzlr zzlrVar) {
        return zzlrVar.zzj(zzms.zzf(obj, i11 & 1048575));
    }

    private final boolean zzP(Object obj, int i11, int i12) {
        return zzms.zzc(obj, (long) (zzy(i12) & 1048575)) == i11;
    }

    private static boolean zzQ(Object obj, long j11) {
        return ((Boolean) zzms.zzf(obj, j11)).booleanValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void zzR(Object obj, zzjh zzjhVar) {
        int i11;
        boolean z11;
        if (!this.zzh) {
            int length = this.zzc.length;
            Unsafe unsafe = zzb;
            int i12 = 1048575;
            int i13 = 1048575;
            int i14 = 0;
            int i15 = 0;
            while (i14 < length) {
                int zzB = zzB(i14);
                int[] iArr = this.zzc;
                int i16 = iArr[i14];
                int zzA = zzA(zzB);
                if (zzA <= 17) {
                    int i17 = iArr[i14 + 2];
                    int i18 = i17 & i12;
                    if (i18 != i13) {
                        i15 = unsafe.getInt(obj, i18);
                        i13 = i18;
                    }
                    i11 = 1 << (i17 >>> 20);
                } else {
                    i11 = 0;
                }
                long j11 = zzB & i12;
                switch (zzA) {
                    case 0:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzjhVar.zzf(i16, zzms.zza(obj, j11));
                            break;
                        }
                    case 1:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzjhVar.zzo(i16, zzms.zzb(obj, j11));
                            break;
                        }
                    case 2:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzjhVar.zzt(i16, unsafe.getLong(obj, j11));
                            break;
                        }
                    case 3:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzjhVar.zzJ(i16, unsafe.getLong(obj, j11));
                            break;
                        }
                    case 4:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzjhVar.zzr(i16, unsafe.getInt(obj, j11));
                            break;
                        }
                    case 5:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzjhVar.zzm(i16, unsafe.getLong(obj, j11));
                            break;
                        }
                    case 6:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzjhVar.zzk(i16, unsafe.getInt(obj, j11));
                            break;
                        }
                    case 7:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzjhVar.zzb(i16, zzms.zzw(obj, j11));
                            break;
                        }
                    case 8:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzT(i16, unsafe.getObject(obj, j11), zzjhVar);
                            break;
                        }
                    case 9:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzjhVar.zzv(i16, unsafe.getObject(obj, j11), zzE(i14));
                            break;
                        }
                    case 10:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzjhVar.zzd(i16, (zziy) unsafe.getObject(obj, j11));
                            break;
                        }
                    case 11:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzjhVar.zzH(i16, unsafe.getInt(obj, j11));
                            break;
                        }
                    case 12:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzjhVar.zzi(i16, unsafe.getInt(obj, j11));
                            break;
                        }
                    case 13:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzjhVar.zzw(i16, unsafe.getInt(obj, j11));
                            break;
                        }
                    case 14:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzjhVar.zzy(i16, unsafe.getLong(obj, j11));
                            break;
                        }
                    case 15:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzjhVar.zzA(i16, unsafe.getInt(obj, j11));
                            break;
                        }
                    case 16:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzjhVar.zzC(i16, unsafe.getLong(obj, j11));
                            break;
                        }
                    case 17:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzjhVar.zzq(i16, unsafe.getObject(obj, j11), zzE(i14));
                            break;
                        }
                    case 18:
                        zzlt.zzL(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzjhVar, false);
                        break;
                    case 19:
                        zzlt.zzP(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzjhVar, false);
                        break;
                    case 20:
                        zzlt.zzS(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzjhVar, false);
                        break;
                    case 21:
                        zzlt.zzaa(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzjhVar, false);
                        break;
                    case 22:
                        zzlt.zzR(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzjhVar, false);
                        break;
                    case 23:
                        zzlt.zzO(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzjhVar, false);
                        break;
                    case 24:
                        zzlt.zzN(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzjhVar, false);
                        break;
                    case 25:
                        zzlt.zzJ(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzjhVar, false);
                        break;
                    case 26:
                        zzlt.zzY(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzjhVar);
                        break;
                    case 27:
                        zzlt.zzT(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzjhVar, zzE(i14));
                        break;
                    case 28:
                        zzlt.zzK(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzjhVar);
                        break;
                    case 29:
                        z11 = false;
                        zzlt.zzZ(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzjhVar, false);
                        break;
                    case 30:
                        z11 = false;
                        zzlt.zzM(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzjhVar, false);
                        break;
                    case 31:
                        z11 = false;
                        zzlt.zzU(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzjhVar, false);
                        break;
                    case 32:
                        z11 = false;
                        zzlt.zzV(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzjhVar, false);
                        break;
                    case 33:
                        z11 = false;
                        zzlt.zzW(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzjhVar, false);
                        break;
                    case 34:
                        z11 = false;
                        zzlt.zzX(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzjhVar, false);
                        break;
                    case 35:
                        zzlt.zzL(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzjhVar, true);
                        break;
                    case 36:
                        zzlt.zzP(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzjhVar, true);
                        break;
                    case 37:
                        zzlt.zzS(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzjhVar, true);
                        break;
                    case 38:
                        zzlt.zzaa(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzjhVar, true);
                        break;
                    case 39:
                        zzlt.zzR(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzjhVar, true);
                        break;
                    case 40:
                        zzlt.zzO(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzjhVar, true);
                        break;
                    case 41:
                        zzlt.zzN(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzjhVar, true);
                        break;
                    case 42:
                        zzlt.zzJ(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzjhVar, true);
                        break;
                    case 43:
                        zzlt.zzZ(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzjhVar, true);
                        break;
                    case 44:
                        zzlt.zzM(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzjhVar, true);
                        break;
                    case 45:
                        zzlt.zzU(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzjhVar, true);
                        break;
                    case 46:
                        zzlt.zzV(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzjhVar, true);
                        break;
                    case 47:
                        zzlt.zzW(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzjhVar, true);
                        break;
                    case 48:
                        zzlt.zzX(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzjhVar, true);
                        break;
                    case 49:
                        zzlt.zzQ(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzjhVar, zzE(i14));
                        break;
                    case 50:
                        zzS(zzjhVar, i16, unsafe.getObject(obj, j11), i14);
                        break;
                    case 51:
                        if (zzP(obj, i16, i14)) {
                            zzjhVar.zzf(i16, zzn(obj, j11));
                        }
                        break;
                    case 52:
                        if (zzP(obj, i16, i14)) {
                            zzjhVar.zzo(i16, zzo(obj, j11));
                        }
                        break;
                    case 53:
                        if (zzP(obj, i16, i14)) {
                            zzjhVar.zzt(i16, zzC(obj, j11));
                        }
                        break;
                    case 54:
                        if (zzP(obj, i16, i14)) {
                            zzjhVar.zzJ(i16, zzC(obj, j11));
                        }
                        break;
                    case 55:
                        if (zzP(obj, i16, i14)) {
                            zzjhVar.zzr(i16, zzr(obj, j11));
                        }
                        break;
                    case 56:
                        if (zzP(obj, i16, i14)) {
                            zzjhVar.zzm(i16, zzC(obj, j11));
                        }
                        break;
                    case 57:
                        if (zzP(obj, i16, i14)) {
                            zzjhVar.zzk(i16, zzr(obj, j11));
                        }
                        break;
                    case 58:
                        if (zzP(obj, i16, i14)) {
                            zzjhVar.zzb(i16, zzQ(obj, j11));
                        }
                        break;
                    case 59:
                        if (zzP(obj, i16, i14)) {
                            zzT(i16, unsafe.getObject(obj, j11), zzjhVar);
                        }
                        break;
                    case 60:
                        if (zzP(obj, i16, i14)) {
                            zzjhVar.zzv(i16, unsafe.getObject(obj, j11), zzE(i14));
                        }
                        break;
                    case 61:
                        if (zzP(obj, i16, i14)) {
                            zzjhVar.zzd(i16, (zziy) unsafe.getObject(obj, j11));
                        }
                        break;
                    case 62:
                        if (zzP(obj, i16, i14)) {
                            zzjhVar.zzH(i16, zzr(obj, j11));
                        }
                        break;
                    case 63:
                        if (zzP(obj, i16, i14)) {
                            zzjhVar.zzi(i16, zzr(obj, j11));
                        }
                        break;
                    case 64:
                        if (zzP(obj, i16, i14)) {
                            zzjhVar.zzw(i16, zzr(obj, j11));
                        }
                        break;
                    case 65:
                        if (zzP(obj, i16, i14)) {
                            zzjhVar.zzy(i16, zzC(obj, j11));
                        }
                        break;
                    case 66:
                        if (zzP(obj, i16, i14)) {
                            zzjhVar.zzA(i16, zzr(obj, j11));
                        }
                        break;
                    case 67:
                        if (zzP(obj, i16, i14)) {
                            zzjhVar.zzC(i16, zzC(obj, j11));
                        }
                        break;
                    case 68:
                        if (zzP(obj, i16, i14)) {
                            zzjhVar.zzq(i16, unsafe.getObject(obj, j11), zzE(i14));
                        }
                        break;
                }
                i14 += 3;
                i12 = 1048575;
            }
            zzmi zzmiVar = this.zzn;
            zzmiVar.zzi(zzmiVar.zzc(obj), zzjhVar);
            return;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private final void zzS(zzjh zzjhVar, int i11, Object obj, int i12) {
        if (obj == null) {
            return;
        }
        zzkz zzkzVar = (zzkz) zzF(i12);
        throw null;
    }

    private static final void zzT(int i11, Object obj, zzjh zzjhVar) {
        if (obj instanceof String) {
            zzjhVar.zzF(i11, (String) obj);
        } else {
            zzjhVar.zzd(i11, (zziy) obj);
        }
    }

    static zzmj zzd(Object obj) {
        zzjz zzjzVar = (zzjz) obj;
        zzmj zzmjVar = zzjzVar.zzc;
        if (zzmjVar == zzmj.zzc()) {
            zzmj zze = zzmj.zze();
            zzjzVar.zzc = zze;
            return zze;
        }
        return zzmjVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzlj zzk(Class cls, zzld zzldVar, zzll zzllVar, zzku zzkuVar, zzmi zzmiVar, zzjm zzjmVar, zzlb zzlbVar) {
        if (zzldVar instanceof zzlq) {
            return zzl((zzlq) zzldVar, zzllVar, zzkuVar, zzmiVar, zzjmVar, zzlbVar);
        }
        zzmf zzmfVar = (zzmf) zzldVar;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0385  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.android.gms.internal.measurement.zzlj zzl(com.google.android.gms.internal.measurement.zzlq r34, com.google.android.gms.internal.measurement.zzll r35, com.google.android.gms.internal.measurement.zzku r36, com.google.android.gms.internal.measurement.zzmi r37, com.google.android.gms.internal.measurement.zzjm r38, com.google.android.gms.internal.measurement.zzlb r39) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlj.zzl(com.google.android.gms.internal.measurement.zzlq, com.google.android.gms.internal.measurement.zzll, com.google.android.gms.internal.measurement.zzku, com.google.android.gms.internal.measurement.zzmi, com.google.android.gms.internal.measurement.zzjm, com.google.android.gms.internal.measurement.zzlb):com.google.android.gms.internal.measurement.zzlj");
    }

    private static double zzn(Object obj, long j11) {
        return ((Double) zzms.zzf(obj, j11)).doubleValue();
    }

    private static float zzo(Object obj, long j11) {
        return ((Float) zzms.zzf(obj, j11)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzp(Object obj) {
        int i11;
        int zzA;
        int zzA2;
        int zzA3;
        int zzB;
        int zzA4;
        int zzv;
        int zzA5;
        int zzA6;
        int zzd;
        int zzA7;
        int i12;
        int zzu;
        boolean z11;
        int zzd2;
        int zzi;
        int zzz;
        int zzA8;
        int i13;
        int zzA9;
        int zzA10;
        int zzA11;
        int zzB2;
        int zzA12;
        int zzd3;
        int zzA13;
        int i14;
        Unsafe unsafe = zzb;
        int i15 = 1048575;
        int i16 = 1048575;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i17 < this.zzc.length) {
            int zzB3 = zzB(i17);
            int[] iArr = this.zzc;
            int i21 = iArr[i17];
            int zzA14 = zzA(zzB3);
            if (zzA14 <= 17) {
                int i22 = iArr[i17 + 2];
                int i23 = i22 & i15;
                i11 = 1 << (i22 >>> 20);
                if (i23 != i16) {
                    i19 = unsafe.getInt(obj, i23);
                    i16 = i23;
                }
            } else {
                i11 = 0;
            }
            long j11 = zzB3 & i15;
            switch (zzA14) {
                case 0:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        zzA = zzjg.zzA(i21 << 3);
                        zzA5 = zzA + 8;
                        i18 += zzA5;
                        break;
                    }
                case 1:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        zzA2 = zzjg.zzA(i21 << 3);
                        zzA5 = zzA2 + 4;
                        i18 += zzA5;
                        break;
                    }
                case 2:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        long j12 = unsafe.getLong(obj, j11);
                        zzA3 = zzjg.zzA(i21 << 3);
                        zzB = zzjg.zzB(j12);
                        i18 += zzA3 + zzB;
                        break;
                    }
                case 3:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        long j13 = unsafe.getLong(obj, j11);
                        zzA3 = zzjg.zzA(i21 << 3);
                        zzB = zzjg.zzB(j13);
                        i18 += zzA3 + zzB;
                        break;
                    }
                case 4:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        int i24 = unsafe.getInt(obj, j11);
                        zzA4 = zzjg.zzA(i21 << 3);
                        zzv = zzjg.zzv(i24);
                        i12 = zzA4 + zzv;
                        i18 += i12;
                        break;
                    }
                case 5:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        zzA = zzjg.zzA(i21 << 3);
                        zzA5 = zzA + 8;
                        i18 += zzA5;
                        break;
                    }
                case 6:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        zzA2 = zzjg.zzA(i21 << 3);
                        zzA5 = zzA2 + 4;
                        i18 += zzA5;
                        break;
                    }
                case 7:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        zzA5 = zzjg.zzA(i21 << 3) + 1;
                        i18 += zzA5;
                        break;
                    }
                case 8:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j11);
                        if (object instanceof zziy) {
                            zzA6 = zzjg.zzA(i21 << 3);
                            zzd = ((zziy) object).zzd();
                            zzA7 = zzjg.zzA(zzd);
                            i12 = zzA6 + zzA7 + zzd;
                            i18 += i12;
                            break;
                        } else {
                            zzA4 = zzjg.zzA(i21 << 3);
                            zzv = zzjg.zzy((String) object);
                            i12 = zzA4 + zzv;
                            i18 += i12;
                        }
                    }
                case 9:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        zzA5 = zzlt.zzo(i21, unsafe.getObject(obj, j11), zzE(i17));
                        i18 += zzA5;
                        break;
                    }
                case 10:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        zzA6 = zzjg.zzA(i21 << 3);
                        zzd = ((zziy) unsafe.getObject(obj, j11)).zzd();
                        zzA7 = zzjg.zzA(zzd);
                        i12 = zzA6 + zzA7 + zzd;
                        i18 += i12;
                        break;
                    }
                case 11:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        int i25 = unsafe.getInt(obj, j11);
                        zzA4 = zzjg.zzA(i21 << 3);
                        zzv = zzjg.zzA(i25);
                        i12 = zzA4 + zzv;
                        i18 += i12;
                        break;
                    }
                case 12:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        int i26 = unsafe.getInt(obj, j11);
                        zzA4 = zzjg.zzA(i21 << 3);
                        zzv = zzjg.zzv(i26);
                        i12 = zzA4 + zzv;
                        i18 += i12;
                        break;
                    }
                case 13:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        zzA2 = zzjg.zzA(i21 << 3);
                        zzA5 = zzA2 + 4;
                        i18 += zzA5;
                        break;
                    }
                case 14:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        zzA = zzjg.zzA(i21 << 3);
                        zzA5 = zzA + 8;
                        i18 += zzA5;
                        break;
                    }
                case 15:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        int i27 = unsafe.getInt(obj, j11);
                        zzA4 = zzjg.zzA(i21 << 3);
                        zzv = zzjg.zzA((i27 >> 31) ^ (i27 + i27));
                        i12 = zzA4 + zzv;
                        i18 += i12;
                        break;
                    }
                case 16:
                    if ((i11 & i19) == 0) {
                        break;
                    } else {
                        long j14 = unsafe.getLong(obj, j11);
                        i18 += zzjg.zzA(i21 << 3) + zzjg.zzB((j14 >> 63) ^ (j14 + j14));
                        break;
                    }
                case 17:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        zzA5 = zzjg.zzu(i21, (zzlg) unsafe.getObject(obj, j11), zzE(i17));
                        i18 += zzA5;
                        break;
                    }
                case 18:
                    zzA5 = zzlt.zzh(i21, (List) unsafe.getObject(obj, j11), false);
                    i18 += zzA5;
                    break;
                case 19:
                    zzA5 = zzlt.zzf(i21, (List) unsafe.getObject(obj, j11), false);
                    i18 += zzA5;
                    break;
                case 20:
                    zzA5 = zzlt.zzm(i21, (List) unsafe.getObject(obj, j11), false);
                    i18 += zzA5;
                    break;
                case 21:
                    zzA5 = zzlt.zzx(i21, (List) unsafe.getObject(obj, j11), false);
                    i18 += zzA5;
                    break;
                case 22:
                    zzA5 = zzlt.zzk(i21, (List) unsafe.getObject(obj, j11), false);
                    i18 += zzA5;
                    break;
                case 23:
                    zzA5 = zzlt.zzh(i21, (List) unsafe.getObject(obj, j11), false);
                    i18 += zzA5;
                    break;
                case 24:
                    zzA5 = zzlt.zzf(i21, (List) unsafe.getObject(obj, j11), false);
                    i18 += zzA5;
                    break;
                case 25:
                    zzA5 = zzlt.zza(i21, (List) unsafe.getObject(obj, j11), false);
                    i18 += zzA5;
                    break;
                case 26:
                    zzu = zzlt.zzu(i21, (List) unsafe.getObject(obj, j11));
                    i18 += zzu;
                    break;
                case 27:
                    zzu = zzlt.zzp(i21, (List) unsafe.getObject(obj, j11), zzE(i17));
                    i18 += zzu;
                    break;
                case 28:
                    zzu = zzlt.zzc(i21, (List) unsafe.getObject(obj, j11));
                    i18 += zzu;
                    break;
                case 29:
                    zzu = zzlt.zzv(i21, (List) unsafe.getObject(obj, j11), false);
                    i18 += zzu;
                    break;
                case 30:
                    z11 = false;
                    zzd2 = zzlt.zzd(i21, (List) unsafe.getObject(obj, j11), false);
                    i18 += zzd2;
                    break;
                case 31:
                    z11 = false;
                    zzd2 = zzlt.zzf(i21, (List) unsafe.getObject(obj, j11), false);
                    i18 += zzd2;
                    break;
                case 32:
                    z11 = false;
                    zzd2 = zzlt.zzh(i21, (List) unsafe.getObject(obj, j11), false);
                    i18 += zzd2;
                    break;
                case 33:
                    z11 = false;
                    zzd2 = zzlt.zzq(i21, (List) unsafe.getObject(obj, j11), false);
                    i18 += zzd2;
                    break;
                case 34:
                    z11 = false;
                    zzd2 = zzlt.zzs(i21, (List) unsafe.getObject(obj, j11), false);
                    i18 += zzd2;
                    break;
                case 35:
                    zzi = zzlt.zzi((List) unsafe.getObject(obj, j11));
                    if (zzi > 0) {
                        zzz = zzjg.zzz(i21);
                        zzA8 = zzjg.zzA(zzi);
                        i13 = zzz + zzA8;
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 36:
                    zzi = zzlt.zzg((List) unsafe.getObject(obj, j11));
                    if (zzi > 0) {
                        zzz = zzjg.zzz(i21);
                        zzA8 = zzjg.zzA(zzi);
                        i13 = zzz + zzA8;
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 37:
                    zzi = zzlt.zzn((List) unsafe.getObject(obj, j11));
                    if (zzi > 0) {
                        zzz = zzjg.zzz(i21);
                        zzA8 = zzjg.zzA(zzi);
                        i13 = zzz + zzA8;
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 38:
                    zzi = zzlt.zzy((List) unsafe.getObject(obj, j11));
                    if (zzi > 0) {
                        zzz = zzjg.zzz(i21);
                        zzA8 = zzjg.zzA(zzi);
                        i13 = zzz + zzA8;
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 39:
                    zzi = zzlt.zzl((List) unsafe.getObject(obj, j11));
                    if (zzi > 0) {
                        zzz = zzjg.zzz(i21);
                        zzA8 = zzjg.zzA(zzi);
                        i13 = zzz + zzA8;
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 40:
                    zzi = zzlt.zzi((List) unsafe.getObject(obj, j11));
                    if (zzi > 0) {
                        zzz = zzjg.zzz(i21);
                        zzA8 = zzjg.zzA(zzi);
                        i13 = zzz + zzA8;
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 41:
                    zzi = zzlt.zzg((List) unsafe.getObject(obj, j11));
                    if (zzi > 0) {
                        zzz = zzjg.zzz(i21);
                        zzA8 = zzjg.zzA(zzi);
                        i13 = zzz + zzA8;
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 42:
                    zzi = zzlt.zzb((List) unsafe.getObject(obj, j11));
                    if (zzi > 0) {
                        zzz = zzjg.zzz(i21);
                        zzA8 = zzjg.zzA(zzi);
                        i13 = zzz + zzA8;
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 43:
                    zzi = zzlt.zzw((List) unsafe.getObject(obj, j11));
                    if (zzi > 0) {
                        zzz = zzjg.zzz(i21);
                        zzA8 = zzjg.zzA(zzi);
                        i13 = zzz + zzA8;
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 44:
                    zzi = zzlt.zze((List) unsafe.getObject(obj, j11));
                    if (zzi > 0) {
                        zzz = zzjg.zzz(i21);
                        zzA8 = zzjg.zzA(zzi);
                        i13 = zzz + zzA8;
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 45:
                    zzi = zzlt.zzg((List) unsafe.getObject(obj, j11));
                    if (zzi > 0) {
                        zzz = zzjg.zzz(i21);
                        zzA8 = zzjg.zzA(zzi);
                        i13 = zzz + zzA8;
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 46:
                    zzi = zzlt.zzi((List) unsafe.getObject(obj, j11));
                    if (zzi > 0) {
                        zzz = zzjg.zzz(i21);
                        zzA8 = zzjg.zzA(zzi);
                        i13 = zzz + zzA8;
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 47:
                    zzi = zzlt.zzr((List) unsafe.getObject(obj, j11));
                    if (zzi > 0) {
                        zzz = zzjg.zzz(i21);
                        zzA8 = zzjg.zzA(zzi);
                        i13 = zzz + zzA8;
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 48:
                    zzi = zzlt.zzt((List) unsafe.getObject(obj, j11));
                    if (zzi > 0) {
                        zzz = zzjg.zzz(i21);
                        zzA8 = zzjg.zzA(zzi);
                        i13 = zzz + zzA8;
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 49:
                    zzu = zzlt.zzj(i21, (List) unsafe.getObject(obj, j11), zzE(i17));
                    i18 += zzu;
                    break;
                case 50:
                    zzlb.zza(i21, unsafe.getObject(obj, j11), zzF(i17));
                    break;
                case 51:
                    if (zzP(obj, i21, i17)) {
                        zzA9 = zzjg.zzA(i21 << 3);
                        zzu = zzA9 + 8;
                        i18 += zzu;
                    }
                    break;
                case 52:
                    if (zzP(obj, i21, i17)) {
                        zzA10 = zzjg.zzA(i21 << 3);
                        zzu = zzA10 + 4;
                        i18 += zzu;
                    }
                    break;
                case 53:
                    if (zzP(obj, i21, i17)) {
                        long zzC = zzC(obj, j11);
                        zzA11 = zzjg.zzA(i21 << 3);
                        zzB2 = zzjg.zzB(zzC);
                        i18 += zzA11 + zzB2;
                    }
                    break;
                case 54:
                    if (zzP(obj, i21, i17)) {
                        long zzC2 = zzC(obj, j11);
                        zzA11 = zzjg.zzA(i21 << 3);
                        zzB2 = zzjg.zzB(zzC2);
                        i18 += zzA11 + zzB2;
                    }
                    break;
                case 55:
                    if (zzP(obj, i21, i17)) {
                        int zzr = zzr(obj, j11);
                        i13 = zzjg.zzA(i21 << 3);
                        zzi = zzjg.zzv(zzr);
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 56:
                    if (zzP(obj, i21, i17)) {
                        zzA9 = zzjg.zzA(i21 << 3);
                        zzu = zzA9 + 8;
                        i18 += zzu;
                    }
                    break;
                case 57:
                    if (zzP(obj, i21, i17)) {
                        zzA10 = zzjg.zzA(i21 << 3);
                        zzu = zzA10 + 4;
                        i18 += zzu;
                    }
                    break;
                case 58:
                    if (zzP(obj, i21, i17)) {
                        zzu = zzjg.zzA(i21 << 3) + 1;
                        i18 += zzu;
                    }
                    break;
                case 59:
                    if (zzP(obj, i21, i17)) {
                        Object object2 = unsafe.getObject(obj, j11);
                        if (object2 instanceof zziy) {
                            zzA12 = zzjg.zzA(i21 << 3);
                            zzd3 = ((zziy) object2).zzd();
                            zzA13 = zzjg.zzA(zzd3);
                            i14 = zzA12 + zzA13 + zzd3;
                            i18 += i14;
                        } else {
                            i13 = zzjg.zzA(i21 << 3);
                            zzi = zzjg.zzy((String) object2);
                            i14 = i13 + zzi;
                            i18 += i14;
                        }
                    }
                    break;
                case 60:
                    if (zzP(obj, i21, i17)) {
                        zzu = zzlt.zzo(i21, unsafe.getObject(obj, j11), zzE(i17));
                        i18 += zzu;
                    }
                    break;
                case 61:
                    if (zzP(obj, i21, i17)) {
                        zzA12 = zzjg.zzA(i21 << 3);
                        zzd3 = ((zziy) unsafe.getObject(obj, j11)).zzd();
                        zzA13 = zzjg.zzA(zzd3);
                        i14 = zzA12 + zzA13 + zzd3;
                        i18 += i14;
                    }
                    break;
                case 62:
                    if (zzP(obj, i21, i17)) {
                        int zzr2 = zzr(obj, j11);
                        i13 = zzjg.zzA(i21 << 3);
                        zzi = zzjg.zzA(zzr2);
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 63:
                    if (zzP(obj, i21, i17)) {
                        int zzr3 = zzr(obj, j11);
                        i13 = zzjg.zzA(i21 << 3);
                        zzi = zzjg.zzv(zzr3);
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 64:
                    if (zzP(obj, i21, i17)) {
                        zzA10 = zzjg.zzA(i21 << 3);
                        zzu = zzA10 + 4;
                        i18 += zzu;
                    }
                    break;
                case 65:
                    if (zzP(obj, i21, i17)) {
                        zzA9 = zzjg.zzA(i21 << 3);
                        zzu = zzA9 + 8;
                        i18 += zzu;
                    }
                    break;
                case 66:
                    if (zzP(obj, i21, i17)) {
                        int zzr4 = zzr(obj, j11);
                        i13 = zzjg.zzA(i21 << 3);
                        zzi = zzjg.zzA((zzr4 >> 31) ^ (zzr4 + zzr4));
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 67:
                    if (zzP(obj, i21, i17)) {
                        long zzC3 = zzC(obj, j11);
                        i18 += zzjg.zzA(i21 << 3) + zzjg.zzB((zzC3 >> 63) ^ (zzC3 + zzC3));
                    }
                    break;
                case 68:
                    if (zzP(obj, i21, i17)) {
                        zzu = zzjg.zzu(i21, (zzlg) unsafe.getObject(obj, j11), zzE(i17));
                        i18 += zzu;
                    }
                    break;
            }
            i17 += 3;
            i15 = 1048575;
        }
        zzmi zzmiVar = this.zzn;
        int zza2 = i18 + zzmiVar.zza(zzmiVar.zzc(obj));
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        return zza2;
    }

    private final int zzq(Object obj) {
        int zzA;
        int zzA2;
        int zzA3;
        int zzB;
        int zzA4;
        int zzv;
        int zzA5;
        int zzA6;
        int zzd;
        int zzA7;
        int zzo;
        int zzz;
        int zzA8;
        int i11;
        Unsafe unsafe = zzb;
        int i12 = 0;
        for (int i13 = 0; i13 < this.zzc.length; i13 += 3) {
            int zzB2 = zzB(i13);
            int zzA9 = zzA(zzB2);
            int i14 = this.zzc[i13];
            long j11 = zzB2 & 1048575;
            if (zzA9 >= zzjr.zzJ.zza() && zzA9 <= zzjr.zzW.zza()) {
                int i15 = this.zzc[i13 + 2];
            }
            switch (zzA9) {
                case 0:
                    if (zzM(obj, i13)) {
                        zzA = zzjg.zzA(i14 << 3);
                        zzo = zzA + 8;
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzM(obj, i13)) {
                        zzA2 = zzjg.zzA(i14 << 3);
                        zzo = zzA2 + 4;
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzM(obj, i13)) {
                        long zzd2 = zzms.zzd(obj, j11);
                        zzA3 = zzjg.zzA(i14 << 3);
                        zzB = zzjg.zzB(zzd2);
                        i12 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzM(obj, i13)) {
                        long zzd3 = zzms.zzd(obj, j11);
                        zzA3 = zzjg.zzA(i14 << 3);
                        zzB = zzjg.zzB(zzd3);
                        i12 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzM(obj, i13)) {
                        int zzc = zzms.zzc(obj, j11);
                        zzA4 = zzjg.zzA(i14 << 3);
                        zzv = zzjg.zzv(zzc);
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzM(obj, i13)) {
                        zzA = zzjg.zzA(i14 << 3);
                        zzo = zzA + 8;
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzM(obj, i13)) {
                        zzA2 = zzjg.zzA(i14 << 3);
                        zzo = zzA2 + 4;
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzM(obj, i13)) {
                        zzA5 = zzjg.zzA(i14 << 3);
                        zzo = zzA5 + 1;
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzM(obj, i13)) {
                        break;
                    } else {
                        Object zzf = zzms.zzf(obj, j11);
                        if (zzf instanceof zziy) {
                            zzA6 = zzjg.zzA(i14 << 3);
                            zzd = ((zziy) zzf).zzd();
                            zzA7 = zzjg.zzA(zzd);
                            i11 = zzA6 + zzA7 + zzd;
                            i12 += i11;
                            break;
                        } else {
                            zzA4 = zzjg.zzA(i14 << 3);
                            zzv = zzjg.zzy((String) zzf);
                            i11 = zzA4 + zzv;
                            i12 += i11;
                        }
                    }
                case 9:
                    if (zzM(obj, i13)) {
                        zzo = zzlt.zzo(i14, zzms.zzf(obj, j11), zzE(i13));
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzM(obj, i13)) {
                        zzA6 = zzjg.zzA(i14 << 3);
                        zzd = ((zziy) zzms.zzf(obj, j11)).zzd();
                        zzA7 = zzjg.zzA(zzd);
                        i11 = zzA6 + zzA7 + zzd;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzM(obj, i13)) {
                        int zzc2 = zzms.zzc(obj, j11);
                        zzA4 = zzjg.zzA(i14 << 3);
                        zzv = zzjg.zzA(zzc2);
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzM(obj, i13)) {
                        int zzc3 = zzms.zzc(obj, j11);
                        zzA4 = zzjg.zzA(i14 << 3);
                        zzv = zzjg.zzv(zzc3);
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzM(obj, i13)) {
                        zzA2 = zzjg.zzA(i14 << 3);
                        zzo = zzA2 + 4;
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzM(obj, i13)) {
                        zzA = zzjg.zzA(i14 << 3);
                        zzo = zzA + 8;
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzM(obj, i13)) {
                        int zzc4 = zzms.zzc(obj, j11);
                        zzA4 = zzjg.zzA(i14 << 3);
                        zzv = zzjg.zzA((zzc4 >> 31) ^ (zzc4 + zzc4));
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzM(obj, i13)) {
                        long zzd4 = zzms.zzd(obj, j11);
                        zzA4 = zzjg.zzA(i14 << 3);
                        zzv = zzjg.zzB((zzd4 >> 63) ^ (zzd4 + zzd4));
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzM(obj, i13)) {
                        zzo = zzjg.zzu(i14, (zzlg) zzms.zzf(obj, j11), zzE(i13));
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzo = zzlt.zzh(i14, (List) zzms.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 19:
                    zzo = zzlt.zzf(i14, (List) zzms.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 20:
                    zzo = zzlt.zzm(i14, (List) zzms.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 21:
                    zzo = zzlt.zzx(i14, (List) zzms.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 22:
                    zzo = zzlt.zzk(i14, (List) zzms.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 23:
                    zzo = zzlt.zzh(i14, (List) zzms.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 24:
                    zzo = zzlt.zzf(i14, (List) zzms.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 25:
                    zzo = zzlt.zza(i14, (List) zzms.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 26:
                    zzo = zzlt.zzu(i14, (List) zzms.zzf(obj, j11));
                    i12 += zzo;
                    break;
                case 27:
                    zzo = zzlt.zzp(i14, (List) zzms.zzf(obj, j11), zzE(i13));
                    i12 += zzo;
                    break;
                case 28:
                    zzo = zzlt.zzc(i14, (List) zzms.zzf(obj, j11));
                    i12 += zzo;
                    break;
                case 29:
                    zzo = zzlt.zzv(i14, (List) zzms.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 30:
                    zzo = zzlt.zzd(i14, (List) zzms.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 31:
                    zzo = zzlt.zzf(i14, (List) zzms.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 32:
                    zzo = zzlt.zzh(i14, (List) zzms.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 33:
                    zzo = zzlt.zzq(i14, (List) zzms.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 34:
                    zzo = zzlt.zzs(i14, (List) zzms.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 35:
                    zzv = zzlt.zzi((List) unsafe.getObject(obj, j11));
                    if (zzv > 0) {
                        zzz = zzjg.zzz(i14);
                        zzA8 = zzjg.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzv = zzlt.zzg((List) unsafe.getObject(obj, j11));
                    if (zzv > 0) {
                        zzz = zzjg.zzz(i14);
                        zzA8 = zzjg.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzv = zzlt.zzn((List) unsafe.getObject(obj, j11));
                    if (zzv > 0) {
                        zzz = zzjg.zzz(i14);
                        zzA8 = zzjg.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzv = zzlt.zzy((List) unsafe.getObject(obj, j11));
                    if (zzv > 0) {
                        zzz = zzjg.zzz(i14);
                        zzA8 = zzjg.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzv = zzlt.zzl((List) unsafe.getObject(obj, j11));
                    if (zzv > 0) {
                        zzz = zzjg.zzz(i14);
                        zzA8 = zzjg.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzv = zzlt.zzi((List) unsafe.getObject(obj, j11));
                    if (zzv > 0) {
                        zzz = zzjg.zzz(i14);
                        zzA8 = zzjg.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzv = zzlt.zzg((List) unsafe.getObject(obj, j11));
                    if (zzv > 0) {
                        zzz = zzjg.zzz(i14);
                        zzA8 = zzjg.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    zzv = zzlt.zzb((List) unsafe.getObject(obj, j11));
                    if (zzv > 0) {
                        zzz = zzjg.zzz(i14);
                        zzA8 = zzjg.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzv = zzlt.zzw((List) unsafe.getObject(obj, j11));
                    if (zzv > 0) {
                        zzz = zzjg.zzz(i14);
                        zzA8 = zzjg.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzv = zzlt.zze((List) unsafe.getObject(obj, j11));
                    if (zzv > 0) {
                        zzz = zzjg.zzz(i14);
                        zzA8 = zzjg.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzv = zzlt.zzg((List) unsafe.getObject(obj, j11));
                    if (zzv > 0) {
                        zzz = zzjg.zzz(i14);
                        zzA8 = zzjg.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzv = zzlt.zzi((List) unsafe.getObject(obj, j11));
                    if (zzv > 0) {
                        zzz = zzjg.zzz(i14);
                        zzA8 = zzjg.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzv = zzlt.zzr((List) unsafe.getObject(obj, j11));
                    if (zzv > 0) {
                        zzz = zzjg.zzz(i14);
                        zzA8 = zzjg.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzv = zzlt.zzt((List) unsafe.getObject(obj, j11));
                    if (zzv > 0) {
                        zzz = zzjg.zzz(i14);
                        zzA8 = zzjg.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzo = zzlt.zzj(i14, (List) zzms.zzf(obj, j11), zzE(i13));
                    i12 += zzo;
                    break;
                case 50:
                    zzlb.zza(i14, zzms.zzf(obj, j11), zzF(i13));
                    break;
                case 51:
                    if (zzP(obj, i14, i13)) {
                        zzA = zzjg.zzA(i14 << 3);
                        zzo = zzA + 8;
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzP(obj, i14, i13)) {
                        zzA2 = zzjg.zzA(i14 << 3);
                        zzo = zzA2 + 4;
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzP(obj, i14, i13)) {
                        long zzC = zzC(obj, j11);
                        zzA3 = zzjg.zzA(i14 << 3);
                        zzB = zzjg.zzB(zzC);
                        i12 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzP(obj, i14, i13)) {
                        long zzC2 = zzC(obj, j11);
                        zzA3 = zzjg.zzA(i14 << 3);
                        zzB = zzjg.zzB(zzC2);
                        i12 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzP(obj, i14, i13)) {
                        int zzr = zzr(obj, j11);
                        zzA4 = zzjg.zzA(i14 << 3);
                        zzv = zzjg.zzv(zzr);
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzP(obj, i14, i13)) {
                        zzA = zzjg.zzA(i14 << 3);
                        zzo = zzA + 8;
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzP(obj, i14, i13)) {
                        zzA2 = zzjg.zzA(i14 << 3);
                        zzo = zzA2 + 4;
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzP(obj, i14, i13)) {
                        zzA5 = zzjg.zzA(i14 << 3);
                        zzo = zzA5 + 1;
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zzP(obj, i14, i13)) {
                        break;
                    } else {
                        Object zzf2 = zzms.zzf(obj, j11);
                        if (zzf2 instanceof zziy) {
                            zzA6 = zzjg.zzA(i14 << 3);
                            zzd = ((zziy) zzf2).zzd();
                            zzA7 = zzjg.zzA(zzd);
                            i11 = zzA6 + zzA7 + zzd;
                            i12 += i11;
                            break;
                        } else {
                            zzA4 = zzjg.zzA(i14 << 3);
                            zzv = zzjg.zzy((String) zzf2);
                            i11 = zzA4 + zzv;
                            i12 += i11;
                        }
                    }
                case 60:
                    if (zzP(obj, i14, i13)) {
                        zzo = zzlt.zzo(i14, zzms.zzf(obj, j11), zzE(i13));
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzP(obj, i14, i13)) {
                        zzA6 = zzjg.zzA(i14 << 3);
                        zzd = ((zziy) zzms.zzf(obj, j11)).zzd();
                        zzA7 = zzjg.zzA(zzd);
                        i11 = zzA6 + zzA7 + zzd;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzP(obj, i14, i13)) {
                        int zzr2 = zzr(obj, j11);
                        zzA4 = zzjg.zzA(i14 << 3);
                        zzv = zzjg.zzA(zzr2);
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzP(obj, i14, i13)) {
                        int zzr3 = zzr(obj, j11);
                        zzA4 = zzjg.zzA(i14 << 3);
                        zzv = zzjg.zzv(zzr3);
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzP(obj, i14, i13)) {
                        zzA2 = zzjg.zzA(i14 << 3);
                        zzo = zzA2 + 4;
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzP(obj, i14, i13)) {
                        zzA = zzjg.zzA(i14 << 3);
                        zzo = zzA + 8;
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzP(obj, i14, i13)) {
                        int zzr4 = zzr(obj, j11);
                        zzA4 = zzjg.zzA(i14 << 3);
                        zzv = zzjg.zzA((zzr4 >> 31) ^ (zzr4 + zzr4));
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzP(obj, i14, i13)) {
                        long zzC3 = zzC(obj, j11);
                        zzA4 = zzjg.zzA(i14 << 3);
                        zzv = zzjg.zzB((zzC3 >> 63) ^ (zzC3 + zzC3));
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzP(obj, i14, i13)) {
                        zzo = zzjg.zzu(i14, (zzlg) zzms.zzf(obj, j11), zzE(i13));
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzmi zzmiVar = this.zzn;
        return i12 + zzmiVar.zza(zzmiVar.zzc(obj));
    }

    private static int zzr(Object obj, long j11) {
        return ((Integer) zzms.zzf(obj, j11)).intValue();
    }

    private final int zzs(Object obj, byte[] bArr, int i11, int i12, int i13, long j11, zzik zzikVar) {
        Unsafe unsafe = zzb;
        Object zzF = zzF(i13);
        Object object = unsafe.getObject(obj, j11);
        if (!((zzla) object).zze()) {
            zzla zzb2 = zzla.zza().zzb();
            zzlb.zzb(zzb2, object);
            unsafe.putObject(obj, j11, zzb2);
        }
        zzkz zzkzVar = (zzkz) zzF;
        throw null;
    }

    private final int zzt(Object obj, byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j11, int i18, zzik zzikVar) {
        Unsafe unsafe = zzb;
        long j12 = this.zzc[i18 + 2] & 1048575;
        switch (i17) {
            case 51:
                if (i15 == 1) {
                    unsafe.putObject(obj, j11, Double.valueOf(Double.longBitsToDouble(zzil.zzn(bArr, i11))));
                    unsafe.putInt(obj, j12, i14);
                    return i11 + 8;
                }
                break;
            case 52:
                if (i15 == 5) {
                    unsafe.putObject(obj, j11, Float.valueOf(Float.intBitsToFloat(zzil.zzb(bArr, i11))));
                    unsafe.putInt(obj, j12, i14);
                    return i11 + 4;
                }
                break;
            case 53:
            case 54:
                if (i15 == 0) {
                    int zzm = zzil.zzm(bArr, i11, zzikVar);
                    unsafe.putObject(obj, j11, Long.valueOf(zzikVar.zzb));
                    unsafe.putInt(obj, j12, i14);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i15 == 0) {
                    int zzj = zzil.zzj(bArr, i11, zzikVar);
                    unsafe.putObject(obj, j11, Integer.valueOf(zzikVar.zza));
                    unsafe.putInt(obj, j12, i14);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i15 == 1) {
                    unsafe.putObject(obj, j11, Long.valueOf(zzil.zzn(bArr, i11)));
                    unsafe.putInt(obj, j12, i14);
                    return i11 + 8;
                }
                break;
            case 57:
            case 64:
                if (i15 == 5) {
                    unsafe.putObject(obj, j11, Integer.valueOf(zzil.zzb(bArr, i11)));
                    unsafe.putInt(obj, j12, i14);
                    return i11 + 4;
                }
                break;
            case 58:
                if (i15 == 0) {
                    int zzm2 = zzil.zzm(bArr, i11, zzikVar);
                    unsafe.putObject(obj, j11, Boolean.valueOf(zzikVar.zzb != 0));
                    unsafe.putInt(obj, j12, i14);
                    return zzm2;
                }
                break;
            case 59:
                if (i15 == 2) {
                    int zzj2 = zzil.zzj(bArr, i11, zzikVar);
                    int i19 = zzikVar.zza;
                    if (i19 == 0) {
                        unsafe.putObject(obj, j11, "");
                    } else if ((i16 & PKIFailureInfo.duplicateCertReq) != 0 && !zzmx.zzf(bArr, zzj2, zzj2 + i19)) {
                        throw zzkj.zzc();
                    } else {
                        unsafe.putObject(obj, j11, new String(bArr, zzj2, i19, zzkh.zzb));
                        zzj2 += i19;
                    }
                    unsafe.putInt(obj, j12, i14);
                    return zzj2;
                }
                break;
            case 60:
                if (i15 == 2) {
                    int zzd = zzil.zzd(zzE(i18), bArr, i11, i12, zzikVar);
                    Object object = unsafe.getInt(obj, j12) == i14 ? unsafe.getObject(obj, j11) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j11, zzikVar.zzc);
                    } else {
                        unsafe.putObject(obj, j11, zzkh.zzg(object, zzikVar.zzc));
                    }
                    unsafe.putInt(obj, j12, i14);
                    return zzd;
                }
                break;
            case 61:
                if (i15 == 2) {
                    int zza2 = zzil.zza(bArr, i11, zzikVar);
                    unsafe.putObject(obj, j11, zzikVar.zzc);
                    unsafe.putInt(obj, j12, i14);
                    return zza2;
                }
                break;
            case 63:
                if (i15 == 0) {
                    int zzj3 = zzil.zzj(bArr, i11, zzikVar);
                    int i21 = zzikVar.zza;
                    zzkd zzD = zzD(i18);
                    if (zzD != null && !zzD.zza(i21)) {
                        zzd(obj).zzh(i13, Long.valueOf(i21));
                    } else {
                        unsafe.putObject(obj, j11, Integer.valueOf(i21));
                        unsafe.putInt(obj, j12, i14);
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i15 == 0) {
                    int zzj4 = zzil.zzj(bArr, i11, zzikVar);
                    unsafe.putObject(obj, j11, Integer.valueOf(zzjc.zzb(zzikVar.zza)));
                    unsafe.putInt(obj, j12, i14);
                    return zzj4;
                }
                break;
            case 67:
                if (i15 == 0) {
                    int zzm3 = zzil.zzm(bArr, i11, zzikVar);
                    unsafe.putObject(obj, j11, Long.valueOf(zzjc.zzc(zzikVar.zzb)));
                    unsafe.putInt(obj, j12, i14);
                    return zzm3;
                }
                break;
            case 68:
                if (i15 == 3) {
                    int zzc = zzil.zzc(zzE(i18), bArr, i11, i12, (i13 & (-8)) | 4, zzikVar);
                    Object object2 = unsafe.getInt(obj, j12) == i14 ? unsafe.getObject(obj, j11) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j11, zzikVar.zzc);
                    } else {
                        unsafe.putObject(obj, j11, zzkh.zzg(object2, zzikVar.zzc));
                    }
                    unsafe.putInt(obj, j12, i14);
                    return zzc;
                }
                break;
        }
        return i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02d9, code lost:
        if (r0 != r5) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02db, code lost:
        r15 = r31;
        r14 = r32;
        r12 = r33;
        r13 = r35;
        r11 = r36;
        r10 = r19;
        r1 = r20;
        r2 = r23;
        r6 = r26;
        r7 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02f1, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0322, code lost:
        if (r0 != r15) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0345, code lost:
        if (r0 != r15) goto L135;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzu(java.lang.Object r32, byte[] r33, int r34, int r35, com.google.android.gms.internal.measurement.zzik r36) {
        /*
            Method dump skipped, instructions count: 944
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlj.zzu(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzik):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0152  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x021a -> B:120:0x021b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x014f -> B:67:0x0150). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x01cc -> B:100:0x01cd). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzv(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.measurement.zzik r29) {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlj.zzv(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.zzik):int");
    }

    private final int zzw(int i11) {
        if (i11 < this.zze || i11 > this.zzf) {
            return -1;
        }
        return zzz(i11, 0);
    }

    private final int zzx(int i11, int i12) {
        if (i11 < this.zze || i11 > this.zzf) {
            return -1;
        }
        return zzz(i11, i12);
    }

    private final int zzy(int i11) {
        return this.zzc[i11 + 2];
    }

    private final int zzz(int i11, int i12) {
        int length = (this.zzc.length / 3) - 1;
        while (i12 <= length) {
            int i13 = (length + i12) >>> 1;
            int i14 = i13 * 3;
            int i15 = this.zzc[i14];
            if (i11 == i15) {
                return i14;
            }
            if (i11 < i15) {
                length = i13 - 1;
            } else {
                i12 = i13 + 1;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final int zza(Object obj) {
        return this.zzi ? zzq(obj) : zzp(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final int zzb(Object obj) {
        int i11;
        int zzc;
        int length = this.zzc.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int zzB = zzB(i13);
            int i14 = this.zzc[i13];
            long j11 = 1048575 & zzB;
            int i15 = 37;
            switch (zzA(zzB)) {
                case 0:
                    i11 = i12 * 53;
                    zzc = zzkh.zzc(Double.doubleToLongBits(zzms.zza(obj, j11)));
                    i12 = i11 + zzc;
                    break;
                case 1:
                    i11 = i12 * 53;
                    zzc = Float.floatToIntBits(zzms.zzb(obj, j11));
                    i12 = i11 + zzc;
                    break;
                case 2:
                    i11 = i12 * 53;
                    zzc = zzkh.zzc(zzms.zzd(obj, j11));
                    i12 = i11 + zzc;
                    break;
                case 3:
                    i11 = i12 * 53;
                    zzc = zzkh.zzc(zzms.zzd(obj, j11));
                    i12 = i11 + zzc;
                    break;
                case 4:
                    i11 = i12 * 53;
                    zzc = zzms.zzc(obj, j11);
                    i12 = i11 + zzc;
                    break;
                case 5:
                    i11 = i12 * 53;
                    zzc = zzkh.zzc(zzms.zzd(obj, j11));
                    i12 = i11 + zzc;
                    break;
                case 6:
                    i11 = i12 * 53;
                    zzc = zzms.zzc(obj, j11);
                    i12 = i11 + zzc;
                    break;
                case 7:
                    i11 = i12 * 53;
                    zzc = zzkh.zza(zzms.zzw(obj, j11));
                    i12 = i11 + zzc;
                    break;
                case 8:
                    i11 = i12 * 53;
                    zzc = ((String) zzms.zzf(obj, j11)).hashCode();
                    i12 = i11 + zzc;
                    break;
                case 9:
                    Object zzf = zzms.zzf(obj, j11);
                    if (zzf != null) {
                        i15 = zzf.hashCode();
                    }
                    i12 = (i12 * 53) + i15;
                    break;
                case 10:
                    i11 = i12 * 53;
                    zzc = zzms.zzf(obj, j11).hashCode();
                    i12 = i11 + zzc;
                    break;
                case 11:
                    i11 = i12 * 53;
                    zzc = zzms.zzc(obj, j11);
                    i12 = i11 + zzc;
                    break;
                case 12:
                    i11 = i12 * 53;
                    zzc = zzms.zzc(obj, j11);
                    i12 = i11 + zzc;
                    break;
                case 13:
                    i11 = i12 * 53;
                    zzc = zzms.zzc(obj, j11);
                    i12 = i11 + zzc;
                    break;
                case 14:
                    i11 = i12 * 53;
                    zzc = zzkh.zzc(zzms.zzd(obj, j11));
                    i12 = i11 + zzc;
                    break;
                case 15:
                    i11 = i12 * 53;
                    zzc = zzms.zzc(obj, j11);
                    i12 = i11 + zzc;
                    break;
                case 16:
                    i11 = i12 * 53;
                    zzc = zzkh.zzc(zzms.zzd(obj, j11));
                    i12 = i11 + zzc;
                    break;
                case 17:
                    Object zzf2 = zzms.zzf(obj, j11);
                    if (zzf2 != null) {
                        i15 = zzf2.hashCode();
                    }
                    i12 = (i12 * 53) + i15;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i11 = i12 * 53;
                    zzc = zzms.zzf(obj, j11).hashCode();
                    i12 = i11 + zzc;
                    break;
                case 50:
                    i11 = i12 * 53;
                    zzc = zzms.zzf(obj, j11).hashCode();
                    i12 = i11 + zzc;
                    break;
                case 51:
                    if (zzP(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzkh.zzc(Double.doubleToLongBits(zzn(obj, j11)));
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzP(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = Float.floatToIntBits(zzo(obj, j11));
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzP(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzkh.zzc(zzC(obj, j11));
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzP(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzkh.zzc(zzC(obj, j11));
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzP(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzr(obj, j11);
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzP(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzkh.zzc(zzC(obj, j11));
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzP(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzr(obj, j11);
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzP(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzkh.zza(zzQ(obj, j11));
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzP(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = ((String) zzms.zzf(obj, j11)).hashCode();
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzP(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzms.zzf(obj, j11).hashCode();
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzP(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzms.zzf(obj, j11).hashCode();
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzP(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzr(obj, j11);
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzP(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzr(obj, j11);
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzP(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzr(obj, j11);
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzP(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzkh.zzc(zzC(obj, j11));
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzP(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzr(obj, j11);
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzP(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzkh.zzc(zzC(obj, j11));
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzP(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzms.zzf(obj, j11).hashCode();
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i12 * 53) + this.zzn.zzc(obj).hashCode();
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        return hashCode;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzc(Object obj, byte[] bArr, int i11, int i12, int i13, zzik zzikVar) {
        Unsafe unsafe;
        int i14;
        Object obj2;
        zzlj<T> zzljVar;
        byte b11;
        int zzw;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Object obj3;
        int i21;
        zzik zzikVar2;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i31;
        int i32;
        zzlj<T> zzljVar2 = this;
        Object obj4 = obj;
        byte[] bArr2 = bArr;
        int i33 = i12;
        int i34 = i13;
        zzik zzikVar3 = zzikVar;
        Unsafe unsafe2 = zzb;
        int i35 = i11;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = -1;
        int i41 = 1048575;
        while (true) {
            if (i35 < i33) {
                int i42 = i35 + 1;
                byte b12 = bArr2[i35];
                if (b12 < 0) {
                    int zzk = zzil.zzk(b12, bArr2, i42, zzikVar3);
                    b11 = zzikVar3.zza;
                    i42 = zzk;
                } else {
                    b11 = b12;
                }
                int i43 = b11 >>> 3;
                int i44 = b11 & 7;
                if (i43 > i39) {
                    zzw = zzljVar2.zzx(i43, i37 / 3);
                } else {
                    zzw = zzljVar2.zzw(i43);
                }
                if (zzw == -1) {
                    i15 = i43;
                    i16 = i42;
                    i17 = b11;
                    i18 = i38;
                    unsafe = unsafe2;
                    i14 = i34;
                    i19 = 0;
                } else {
                    int[] iArr = zzljVar2.zzc;
                    int i45 = iArr[zzw + 1];
                    int zzA = zzA(i45);
                    int i46 = i42;
                    long j11 = i45 & 1048575;
                    if (zzA <= 17) {
                        int i47 = iArr[zzw + 2];
                        int i48 = 1 << (i47 >>> 20);
                        int i49 = i47 & 1048575;
                        if (i49 != i41) {
                            i22 = b11;
                            if (i41 != 1048575) {
                                unsafe2.putInt(obj4, i41, i38);
                            }
                            i38 = unsafe2.getInt(obj4, i49);
                            i23 = i49;
                        } else {
                            i22 = b11;
                            i23 = i41;
                        }
                        int i51 = i38;
                        switch (zzA) {
                            case 0:
                                i24 = zzw;
                                i15 = i43;
                                i25 = i46;
                                if (i44 == 1) {
                                    zzms.zzo(obj4, j11, Double.longBitsToDouble(zzil.zzn(bArr2, i25)));
                                    i35 = i25 + 8;
                                    i38 = i51 | i48;
                                    i39 = i15;
                                    i34 = i13;
                                    i37 = i24;
                                    i36 = i22;
                                    i41 = i23;
                                    i33 = i12;
                                    break;
                                } else {
                                    i46 = i25;
                                    i14 = i13;
                                    i18 = i51;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i16 = i46;
                                    i41 = i23;
                                    i19 = i24;
                                    break;
                                }
                            case 1:
                                i24 = zzw;
                                i15 = i43;
                                i25 = i46;
                                if (i44 == 5) {
                                    zzms.zzp(obj4, j11, Float.intBitsToFloat(zzil.zzb(bArr2, i25)));
                                    i35 = i25 + 4;
                                    i38 = i51 | i48;
                                    i39 = i15;
                                    i34 = i13;
                                    i37 = i24;
                                    i36 = i22;
                                    i41 = i23;
                                    i33 = i12;
                                    break;
                                } else {
                                    i46 = i25;
                                    i14 = i13;
                                    i18 = i51;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i16 = i46;
                                    i41 = i23;
                                    i19 = i24;
                                    break;
                                }
                            case 2:
                            case 3:
                                i24 = zzw;
                                i15 = i43;
                                i25 = i46;
                                if (i44 == 0) {
                                    int zzm = zzil.zzm(bArr2, i25, zzikVar3);
                                    unsafe2.putLong(obj, j11, zzikVar3.zzb);
                                    i38 = i51 | i48;
                                    i39 = i15;
                                    i34 = i13;
                                    i35 = zzm;
                                    i37 = i24;
                                    i36 = i22;
                                    i41 = i23;
                                    i33 = i12;
                                    break;
                                } else {
                                    i46 = i25;
                                    i14 = i13;
                                    i18 = i51;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i16 = i46;
                                    i41 = i23;
                                    i19 = i24;
                                    break;
                                }
                            case 4:
                            case 11:
                                i24 = zzw;
                                i15 = i43;
                                i25 = i46;
                                if (i44 == 0) {
                                    i35 = zzil.zzj(bArr2, i25, zzikVar3);
                                    unsafe2.putInt(obj4, j11, zzikVar3.zza);
                                    i38 = i51 | i48;
                                    i39 = i15;
                                    i34 = i13;
                                    i37 = i24;
                                    i36 = i22;
                                    i41 = i23;
                                    i33 = i12;
                                    break;
                                } else {
                                    i46 = i25;
                                    i14 = i13;
                                    i18 = i51;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i16 = i46;
                                    i41 = i23;
                                    i19 = i24;
                                    break;
                                }
                            case 5:
                            case 14:
                                int i52 = i22;
                                i15 = i43;
                                if (i44 == 1) {
                                    i24 = zzw;
                                    i22 = i52;
                                    i25 = i46;
                                    unsafe2.putLong(obj, j11, zzil.zzn(bArr2, i46));
                                    i35 = i25 + 8;
                                    i38 = i51 | i48;
                                    i39 = i15;
                                    i34 = i13;
                                    i37 = i24;
                                    i36 = i22;
                                    i41 = i23;
                                    i33 = i12;
                                    break;
                                } else {
                                    i24 = zzw;
                                    i22 = i52;
                                    i46 = i46;
                                    i14 = i13;
                                    i18 = i51;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i16 = i46;
                                    i41 = i23;
                                    i19 = i24;
                                    break;
                                }
                            case 6:
                            case 13:
                                i26 = i22;
                                i15 = i43;
                                i27 = i46;
                                if (i44 == 5) {
                                    unsafe2.putInt(obj4, j11, zzil.zzb(bArr2, i27));
                                    i35 = i27 + 4;
                                    i38 = i51 | i48;
                                    i37 = zzw;
                                    i36 = i26;
                                    i41 = i23;
                                    i39 = i15;
                                    i34 = i13;
                                    break;
                                } else {
                                    i24 = zzw;
                                    i46 = i27;
                                    i22 = i26;
                                    i14 = i13;
                                    i18 = i51;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i16 = i46;
                                    i41 = i23;
                                    i19 = i24;
                                    break;
                                }
                            case 7:
                                i26 = i22;
                                i15 = i43;
                                i27 = i46;
                                if (i44 == 0) {
                                    i35 = zzil.zzm(bArr2, i27, zzikVar3);
                                    zzms.zzm(obj4, j11, zzikVar3.zzb != 0);
                                    i38 = i51 | i48;
                                    i37 = zzw;
                                    i36 = i26;
                                    i41 = i23;
                                    i39 = i15;
                                    i34 = i13;
                                    break;
                                } else {
                                    i24 = zzw;
                                    i46 = i27;
                                    i22 = i26;
                                    i14 = i13;
                                    i18 = i51;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i16 = i46;
                                    i41 = i23;
                                    i19 = i24;
                                    break;
                                }
                            case 8:
                                i26 = i22;
                                i15 = i43;
                                i27 = i46;
                                if (i44 == 2) {
                                    if ((536870912 & i45) == 0) {
                                        i35 = zzil.zzg(bArr2, i27, zzikVar3);
                                    } else {
                                        i35 = zzil.zzh(bArr2, i27, zzikVar3);
                                    }
                                    unsafe2.putObject(obj4, j11, zzikVar3.zzc);
                                    i38 = i51 | i48;
                                    i37 = zzw;
                                    i36 = i26;
                                    i41 = i23;
                                    i39 = i15;
                                    i34 = i13;
                                    break;
                                } else {
                                    i24 = zzw;
                                    i46 = i27;
                                    i22 = i26;
                                    i14 = i13;
                                    i18 = i51;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i16 = i46;
                                    i41 = i23;
                                    i19 = i24;
                                    break;
                                }
                            case 9:
                                i28 = zzw;
                                i26 = i22;
                                i15 = i43;
                                i29 = i46;
                                if (i44 == 2) {
                                    i35 = zzil.zzd(zzljVar2.zzE(i28), bArr2, i29, i33, zzikVar3);
                                    if ((i51 & i48) == 0) {
                                        unsafe2.putObject(obj4, j11, zzikVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj4, j11, zzkh.zzg(unsafe2.getObject(obj4, j11), zzikVar3.zzc));
                                    }
                                    i38 = i51 | i48;
                                    i39 = i15;
                                    i37 = i28;
                                    i36 = i26;
                                    i41 = i23;
                                    i34 = i13;
                                    break;
                                } else {
                                    i46 = i29;
                                    i24 = i28;
                                    i22 = i26;
                                    i14 = i13;
                                    i18 = i51;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i16 = i46;
                                    i41 = i23;
                                    i19 = i24;
                                    break;
                                }
                            case 10:
                                i28 = zzw;
                                i26 = i22;
                                i15 = i43;
                                i29 = i46;
                                if (i44 == 2) {
                                    i35 = zzil.zza(bArr2, i29, zzikVar3);
                                    unsafe2.putObject(obj4, j11, zzikVar3.zzc);
                                    i38 = i51 | i48;
                                    i39 = i15;
                                    i37 = i28;
                                    i36 = i26;
                                    i41 = i23;
                                    i34 = i13;
                                    break;
                                } else {
                                    i46 = i29;
                                    i24 = i28;
                                    i22 = i26;
                                    i14 = i13;
                                    i18 = i51;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i16 = i46;
                                    i41 = i23;
                                    i19 = i24;
                                    break;
                                }
                            case 12:
                                i28 = zzw;
                                i26 = i22;
                                i15 = i43;
                                i29 = i46;
                                if (i44 == 0) {
                                    i35 = zzil.zzj(bArr2, i29, zzikVar3);
                                    int i53 = zzikVar3.zza;
                                    zzkd zzD = zzljVar2.zzD(i28);
                                    if (zzD != null && !zzD.zza(i53)) {
                                        zzd(obj).zzh(i26, Long.valueOf(i53));
                                        i39 = i15;
                                        i38 = i51;
                                        i37 = i28;
                                        i36 = i26;
                                        i41 = i23;
                                        i34 = i13;
                                    } else {
                                        unsafe2.putInt(obj4, j11, i53);
                                        i38 = i51 | i48;
                                        i39 = i15;
                                        i37 = i28;
                                        i36 = i26;
                                        i41 = i23;
                                        i34 = i13;
                                        break;
                                    }
                                } else {
                                    i46 = i29;
                                    i24 = i28;
                                    i22 = i26;
                                    i14 = i13;
                                    i18 = i51;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i16 = i46;
                                    i41 = i23;
                                    i19 = i24;
                                    break;
                                }
                                break;
                            case 15:
                                i28 = zzw;
                                i26 = i22;
                                i15 = i43;
                                i29 = i46;
                                if (i44 == 0) {
                                    i35 = zzil.zzj(bArr2, i29, zzikVar3);
                                    unsafe2.putInt(obj4, j11, zzjc.zzb(zzikVar3.zza));
                                    i38 = i51 | i48;
                                    i39 = i15;
                                    i37 = i28;
                                    i36 = i26;
                                    i41 = i23;
                                    i34 = i13;
                                    break;
                                } else {
                                    i46 = i29;
                                    i24 = i28;
                                    i22 = i26;
                                    i14 = i13;
                                    i18 = i51;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i16 = i46;
                                    i41 = i23;
                                    i19 = i24;
                                    break;
                                }
                            case 16:
                                if (i44 == 0) {
                                    int zzm2 = zzil.zzm(bArr2, i46, zzikVar3);
                                    i28 = zzw;
                                    i26 = i22;
                                    unsafe2.putLong(obj, j11, zzjc.zzc(zzikVar3.zzb));
                                    i38 = i51 | i48;
                                    i39 = i43;
                                    i35 = zzm2;
                                    i37 = i28;
                                    i36 = i26;
                                    i41 = i23;
                                    i34 = i13;
                                    break;
                                } else {
                                    i15 = i43;
                                    i24 = zzw;
                                    i14 = i13;
                                    i18 = i51;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i16 = i46;
                                    i41 = i23;
                                    i19 = i24;
                                    break;
                                }
                            default:
                                i24 = zzw;
                                i15 = i43;
                                i25 = i46;
                                if (i44 == 3) {
                                    i35 = zzil.zzc(zzljVar2.zzE(i24), bArr, i25, i12, (i15 << 3) | 4, zzikVar);
                                    if ((i51 & i48) == 0) {
                                        unsafe2.putObject(obj4, j11, zzikVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj4, j11, zzkh.zzg(unsafe2.getObject(obj4, j11), zzikVar3.zzc));
                                    }
                                    i38 = i51 | i48;
                                    bArr2 = bArr;
                                    i39 = i15;
                                    i34 = i13;
                                    i37 = i24;
                                    i36 = i22;
                                    i41 = i23;
                                    i33 = i12;
                                    break;
                                } else {
                                    i46 = i25;
                                    i14 = i13;
                                    i18 = i51;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i16 = i46;
                                    i41 = i23;
                                    i19 = i24;
                                    break;
                                }
                        }
                    } else {
                        int i54 = zzw;
                        int i55 = b11;
                        if (zzA != 27) {
                            i18 = i38;
                            i31 = i41;
                            if (zzA <= 49) {
                                i15 = i43;
                                unsafe = unsafe2;
                                i19 = i54;
                                i35 = zzv(obj, bArr, i46, i12, i55, i43, i44, i54, i45, zzA, j11, zzikVar);
                                if (i35 != i46) {
                                    zzljVar2 = this;
                                    obj4 = obj;
                                    bArr2 = bArr;
                                    i39 = i15;
                                    i33 = i12;
                                    i34 = i13;
                                    zzikVar3 = zzikVar;
                                    i36 = i55;
                                    i37 = i19;
                                    i38 = i18;
                                    i41 = i31;
                                    unsafe2 = unsafe;
                                } else {
                                    i14 = i13;
                                    i16 = i35;
                                    i17 = i55;
                                    i41 = i31;
                                }
                            } else {
                                i15 = i43;
                                unsafe = unsafe2;
                                i32 = i46;
                                i19 = i54;
                                if (zzA != 50) {
                                    i35 = zzt(obj, bArr, i32, i12, i55, i15, i44, i45, zzA, j11, i19, zzikVar);
                                    if (i35 != i32) {
                                        zzljVar2 = this;
                                        obj4 = obj;
                                        bArr2 = bArr;
                                        i39 = i15;
                                        i33 = i12;
                                        i34 = i13;
                                        zzikVar3 = zzikVar;
                                        i36 = i55;
                                        i37 = i19;
                                        i38 = i18;
                                        i41 = i31;
                                        unsafe2 = unsafe;
                                    } else {
                                        i14 = i13;
                                        i16 = i35;
                                        i17 = i55;
                                        i41 = i31;
                                    }
                                } else if (i44 == 2) {
                                    i35 = zzs(obj, bArr, i32, i12, i19, j11, zzikVar);
                                    if (i35 != i32) {
                                        zzljVar2 = this;
                                        obj4 = obj;
                                        bArr2 = bArr;
                                        i39 = i15;
                                        i33 = i12;
                                        i34 = i13;
                                        zzikVar3 = zzikVar;
                                        i36 = i55;
                                        i37 = i19;
                                        i38 = i18;
                                        i41 = i31;
                                        unsafe2 = unsafe;
                                    } else {
                                        i14 = i13;
                                        i16 = i35;
                                        i17 = i55;
                                        i41 = i31;
                                    }
                                }
                            }
                        } else if (i44 == 2) {
                            zzkg zzkgVar = (zzkg) unsafe2.getObject(obj4, j11);
                            if (!zzkgVar.zzc()) {
                                int size = zzkgVar.size();
                                zzkgVar = zzkgVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj4, j11, zzkgVar);
                            }
                            i36 = i55;
                            i23 = i41;
                            i35 = zzil.zze(zzljVar2.zzE(i54), i36, bArr, i46, i12, zzkgVar, zzikVar);
                            bArr2 = bArr;
                            i34 = i13;
                            i39 = i43;
                            i37 = i54;
                            i38 = i38;
                            i41 = i23;
                            i33 = i12;
                        } else {
                            i18 = i38;
                            i31 = i41;
                            i15 = i43;
                            unsafe = unsafe2;
                            i32 = i46;
                            i19 = i54;
                        }
                        i14 = i13;
                        i16 = i32;
                        i17 = i55;
                        i41 = i31;
                    }
                }
                if (i17 != i14 || i14 == 0) {
                    if (this.zzh) {
                        zzikVar2 = zzikVar;
                        if (zzikVar2.zzd != zzjl.zza()) {
                            i21 = i15;
                            if (zzikVar2.zzd.zzc(this.zzg, i21) == null) {
                                i35 = zzil.zzi(i17, bArr, i16, i12, zzd(obj), zzikVar);
                                obj3 = obj;
                                i33 = i12;
                                i36 = i17;
                                zzljVar2 = this;
                                zzikVar3 = zzikVar2;
                                i39 = i21;
                                obj4 = obj3;
                                i37 = i19;
                                i38 = i18;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i34 = i14;
                            } else {
                                zzjw zzjwVar = (zzjw) obj;
                                throw null;
                            }
                        } else {
                            obj3 = obj;
                            i21 = i15;
                        }
                    } else {
                        obj3 = obj;
                        i21 = i15;
                        zzikVar2 = zzikVar;
                    }
                    i35 = zzil.zzi(i17, bArr, i16, i12, zzd(obj), zzikVar);
                    i33 = i12;
                    i36 = i17;
                    zzljVar2 = this;
                    zzikVar3 = zzikVar2;
                    i39 = i21;
                    obj4 = obj3;
                    i37 = i19;
                    i38 = i18;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i34 = i14;
                } else {
                    zzljVar = this;
                    obj2 = obj;
                    i35 = i16;
                    i36 = i17;
                    i38 = i18;
                }
            } else {
                unsafe = unsafe2;
                i14 = i34;
                obj2 = obj4;
                zzljVar = zzljVar2;
            }
        }
        if (i41 != 1048575) {
            unsafe.putInt(obj2, i41, i38);
        }
        for (int i56 = zzljVar.zzk; i56 < zzljVar.zzl; i56++) {
            int i57 = zzljVar.zzj[i56];
            int i58 = zzljVar.zzc[i57];
            Object zzf = zzms.zzf(obj2, zzljVar.zzB(i57) & 1048575);
            if (zzf != null && zzljVar.zzD(i57) != null) {
                zzla zzlaVar = (zzla) zzf;
                zzkz zzkzVar = (zzkz) zzljVar.zzF(i57);
                throw null;
            }
        }
        if (i14 == 0) {
            if (i35 != i12) {
                throw zzkj.zze();
            }
        } else if (i35 > i12 || i36 != i14) {
            throw zzkj.zze();
        }
        return i35;
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final Object zze() {
        return ((zzjz) this.zzg).zzl(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzf(Object obj) {
        int i11;
        int i12 = this.zzk;
        while (true) {
            i11 = this.zzl;
            if (i12 >= i11) {
                break;
            }
            long zzB = zzB(this.zzj[i12]) & 1048575;
            Object zzf = zzms.zzf(obj, zzB);
            if (zzf != null) {
                ((zzla) zzf).zzc();
                zzms.zzs(obj, zzB, zzf);
            }
            i12++;
        }
        int length = this.zzj.length;
        while (i11 < length) {
            this.zzm.zza(obj, this.zzj[i11]);
            i11++;
        }
        this.zzn.zzg(obj);
        if (this.zzh) {
            this.zzo.zzb(obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzg(Object obj, Object obj2) {
        Objects.requireNonNull(obj2);
        for (int i11 = 0; i11 < this.zzc.length; i11 += 3) {
            int zzB = zzB(i11);
            long j11 = 1048575 & zzB;
            int i12 = this.zzc[i11];
            switch (zzA(zzB)) {
                case 0:
                    if (zzM(obj2, i11)) {
                        zzms.zzo(obj, j11, zzms.zza(obj2, j11));
                        zzJ(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzM(obj2, i11)) {
                        zzms.zzp(obj, j11, zzms.zzb(obj2, j11));
                        zzJ(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzM(obj2, i11)) {
                        zzms.zzr(obj, j11, zzms.zzd(obj2, j11));
                        zzJ(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzM(obj2, i11)) {
                        zzms.zzr(obj, j11, zzms.zzd(obj2, j11));
                        zzJ(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzM(obj2, i11)) {
                        zzms.zzq(obj, j11, zzms.zzc(obj2, j11));
                        zzJ(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzM(obj2, i11)) {
                        zzms.zzr(obj, j11, zzms.zzd(obj2, j11));
                        zzJ(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzM(obj2, i11)) {
                        zzms.zzq(obj, j11, zzms.zzc(obj2, j11));
                        zzJ(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzM(obj2, i11)) {
                        zzms.zzm(obj, j11, zzms.zzw(obj2, j11));
                        zzJ(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzM(obj2, i11)) {
                        zzms.zzs(obj, j11, zzms.zzf(obj2, j11));
                        zzJ(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzH(obj, obj2, i11);
                    break;
                case 10:
                    if (zzM(obj2, i11)) {
                        zzms.zzs(obj, j11, zzms.zzf(obj2, j11));
                        zzJ(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzM(obj2, i11)) {
                        zzms.zzq(obj, j11, zzms.zzc(obj2, j11));
                        zzJ(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzM(obj2, i11)) {
                        zzms.zzq(obj, j11, zzms.zzc(obj2, j11));
                        zzJ(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzM(obj2, i11)) {
                        zzms.zzq(obj, j11, zzms.zzc(obj2, j11));
                        zzJ(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzM(obj2, i11)) {
                        zzms.zzr(obj, j11, zzms.zzd(obj2, j11));
                        zzJ(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzM(obj2, i11)) {
                        zzms.zzq(obj, j11, zzms.zzc(obj2, j11));
                        zzJ(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzM(obj2, i11)) {
                        zzms.zzr(obj, j11, zzms.zzd(obj2, j11));
                        zzJ(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzH(obj, obj2, i11);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzm.zzb(obj, obj2, j11);
                    break;
                case 50:
                    zzlt.zzI(this.zzq, obj, obj2, j11);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzP(obj2, i12, i11)) {
                        zzms.zzs(obj, j11, zzms.zzf(obj2, j11));
                        zzK(obj, i12, i11);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzI(obj, obj2, i11);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzP(obj2, i12, i11)) {
                        zzms.zzs(obj, j11, zzms.zzf(obj2, j11));
                        zzK(obj, i12, i11);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzI(obj, obj2, i11);
                    break;
            }
        }
        zzlt.zzF(this.zzn, obj, obj2);
        if (this.zzh) {
            zzlt.zzE(this.zzo, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzh(Object obj, byte[] bArr, int i11, int i12, zzik zzikVar) {
        if (this.zzi) {
            zzu(obj, bArr, i11, i12, zzikVar);
        } else {
            zzc(obj, bArr, i11, i12, 0, zzikVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final boolean zzi(Object obj, Object obj2) {
        boolean zzH;
        int length = this.zzc.length;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int zzB = zzB(i11);
            long j11 = zzB & 1048575;
            switch (zzA(zzB)) {
                case 0:
                    if (zzL(obj, obj2, i11) && Double.doubleToLongBits(zzms.zza(obj, j11)) == Double.doubleToLongBits(zzms.zza(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzL(obj, obj2, i11) && Float.floatToIntBits(zzms.zzb(obj, j11)) == Float.floatToIntBits(zzms.zzb(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i11) && zzms.zzd(obj, j11) == zzms.zzd(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i11) && zzms.zzd(obj, j11) == zzms.zzd(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i11) && zzms.zzc(obj, j11) == zzms.zzc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i11) && zzms.zzd(obj, j11) == zzms.zzd(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i11) && zzms.zzc(obj, j11) == zzms.zzc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i11) && zzms.zzw(obj, j11) == zzms.zzw(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzL(obj, obj2, i11) && zzlt.zzH(zzms.zzf(obj, j11), zzms.zzf(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i11) && zzlt.zzH(zzms.zzf(obj, j11), zzms.zzf(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i11) && zzlt.zzH(zzms.zzf(obj, j11), zzms.zzf(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzL(obj, obj2, i11) && zzms.zzc(obj, j11) == zzms.zzc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzL(obj, obj2, i11) && zzms.zzc(obj, j11) == zzms.zzc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i11) && zzms.zzc(obj, j11) == zzms.zzc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i11) && zzms.zzd(obj, j11) == zzms.zzd(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i11) && zzms.zzc(obj, j11) == zzms.zzc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzL(obj, obj2, i11) && zzms.zzd(obj, j11) == zzms.zzd(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i11) && zzlt.zzH(zzms.zzf(obj, j11), zzms.zzf(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzH = zzlt.zzH(zzms.zzf(obj, j11), zzms.zzf(obj2, j11));
                    break;
                case 50:
                    zzH = zzlt.zzH(zzms.zzf(obj, j11), zzms.zzf(obj2, j11));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzy = zzy(i11) & 1048575;
                    if (zzms.zzc(obj, zzy) == zzms.zzc(obj2, zzy) && zzlt.zzH(zzms.zzf(obj, j11), zzms.zzf(obj2, j11))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzH) {
                return false;
            }
        }
        if (this.zzn.zzc(obj).equals(this.zzn.zzc(obj2))) {
            if (this.zzh) {
                this.zzo.zza(obj);
                this.zzo.zza(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final boolean zzj(Object obj) {
        int i11;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.zzk) {
            int i16 = this.zzj[i15];
            int i17 = this.zzc[i16];
            int zzB = zzB(i16);
            int i18 = this.zzc[i16 + 2];
            int i19 = i18 & 1048575;
            int i21 = 1 << (i18 >>> 20);
            if (i19 != i13) {
                if (i19 != 1048575) {
                    i14 = zzb.getInt(obj, i19);
                }
                i12 = i14;
                i11 = i19;
            } else {
                i11 = i13;
                i12 = i14;
            }
            if ((268435456 & zzB) != 0 && !zzN(obj, i16, i11, i12, i21)) {
                return false;
            }
            int zzA = zzA(zzB);
            if (zzA != 9 && zzA != 17) {
                if (zzA != 27) {
                    if (zzA == 60 || zzA == 68) {
                        if (zzP(obj, i17, i16) && !zzO(obj, zzB, zzE(i16))) {
                            return false;
                        }
                    } else if (zzA != 49) {
                        if (zzA == 50 && !((zzla) zzms.zzf(obj, zzB & 1048575)).isEmpty()) {
                            zzkz zzkzVar = (zzkz) zzF(i16);
                            throw null;
                        }
                    }
                }
                List list = (List) zzms.zzf(obj, zzB & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzlr zzE = zzE(i16);
                    for (int i22 = 0; i22 < list.size(); i22++) {
                        if (!zzE.zzj(list.get(i22))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzN(obj, i16, i11, i12, i21) && !zzO(obj, zzB, zzE(i16))) {
                return false;
            }
            i15++;
            i13 = i11;
            i14 = i12;
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzm(Object obj, zzjh zzjhVar) {
        if (!this.zzi) {
            zzR(obj, zzjhVar);
        } else if (!this.zzh) {
            int length = this.zzc.length;
            for (int i11 = 0; i11 < length; i11 += 3) {
                int zzB = zzB(i11);
                int i12 = this.zzc[i11];
                switch (zzA(zzB)) {
                    case 0:
                        if (zzM(obj, i11)) {
                            zzjhVar.zzf(i12, zzms.zza(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzM(obj, i11)) {
                            zzjhVar.zzo(i12, zzms.zzb(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzM(obj, i11)) {
                            zzjhVar.zzt(i12, zzms.zzd(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzM(obj, i11)) {
                            zzjhVar.zzJ(i12, zzms.zzd(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzM(obj, i11)) {
                            zzjhVar.zzr(i12, zzms.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzM(obj, i11)) {
                            zzjhVar.zzm(i12, zzms.zzd(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzM(obj, i11)) {
                            zzjhVar.zzk(i12, zzms.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzM(obj, i11)) {
                            zzjhVar.zzb(i12, zzms.zzw(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzM(obj, i11)) {
                            zzT(i12, zzms.zzf(obj, zzB & 1048575), zzjhVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zzM(obj, i11)) {
                            zzjhVar.zzv(i12, zzms.zzf(obj, zzB & 1048575), zzE(i11));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzM(obj, i11)) {
                            zzjhVar.zzd(i12, (zziy) zzms.zzf(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzM(obj, i11)) {
                            zzjhVar.zzH(i12, zzms.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzM(obj, i11)) {
                            zzjhVar.zzi(i12, zzms.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzM(obj, i11)) {
                            zzjhVar.zzw(i12, zzms.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzM(obj, i11)) {
                            zzjhVar.zzy(i12, zzms.zzd(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzM(obj, i11)) {
                            zzjhVar.zzA(i12, zzms.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzM(obj, i11)) {
                            zzjhVar.zzC(i12, zzms.zzd(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzM(obj, i11)) {
                            zzjhVar.zzq(i12, zzms.zzf(obj, zzB & 1048575), zzE(i11));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzlt.zzL(i12, (List) zzms.zzf(obj, zzB & 1048575), zzjhVar, false);
                        break;
                    case 19:
                        zzlt.zzP(i12, (List) zzms.zzf(obj, zzB & 1048575), zzjhVar, false);
                        break;
                    case 20:
                        zzlt.zzS(i12, (List) zzms.zzf(obj, zzB & 1048575), zzjhVar, false);
                        break;
                    case 21:
                        zzlt.zzaa(i12, (List) zzms.zzf(obj, zzB & 1048575), zzjhVar, false);
                        break;
                    case 22:
                        zzlt.zzR(i12, (List) zzms.zzf(obj, zzB & 1048575), zzjhVar, false);
                        break;
                    case 23:
                        zzlt.zzO(i12, (List) zzms.zzf(obj, zzB & 1048575), zzjhVar, false);
                        break;
                    case 24:
                        zzlt.zzN(i12, (List) zzms.zzf(obj, zzB & 1048575), zzjhVar, false);
                        break;
                    case 25:
                        zzlt.zzJ(i12, (List) zzms.zzf(obj, zzB & 1048575), zzjhVar, false);
                        break;
                    case 26:
                        zzlt.zzY(i12, (List) zzms.zzf(obj, zzB & 1048575), zzjhVar);
                        break;
                    case 27:
                        zzlt.zzT(i12, (List) zzms.zzf(obj, zzB & 1048575), zzjhVar, zzE(i11));
                        break;
                    case 28:
                        zzlt.zzK(i12, (List) zzms.zzf(obj, zzB & 1048575), zzjhVar);
                        break;
                    case 29:
                        zzlt.zzZ(i12, (List) zzms.zzf(obj, zzB & 1048575), zzjhVar, false);
                        break;
                    case 30:
                        zzlt.zzM(i12, (List) zzms.zzf(obj, zzB & 1048575), zzjhVar, false);
                        break;
                    case 31:
                        zzlt.zzU(i12, (List) zzms.zzf(obj, zzB & 1048575), zzjhVar, false);
                        break;
                    case 32:
                        zzlt.zzV(i12, (List) zzms.zzf(obj, zzB & 1048575), zzjhVar, false);
                        break;
                    case 33:
                        zzlt.zzW(i12, (List) zzms.zzf(obj, zzB & 1048575), zzjhVar, false);
                        break;
                    case 34:
                        zzlt.zzX(i12, (List) zzms.zzf(obj, zzB & 1048575), zzjhVar, false);
                        break;
                    case 35:
                        zzlt.zzL(i12, (List) zzms.zzf(obj, zzB & 1048575), zzjhVar, true);
                        break;
                    case 36:
                        zzlt.zzP(i12, (List) zzms.zzf(obj, zzB & 1048575), zzjhVar, true);
                        break;
                    case 37:
                        zzlt.zzS(i12, (List) zzms.zzf(obj, zzB & 1048575), zzjhVar, true);
                        break;
                    case 38:
                        zzlt.zzaa(i12, (List) zzms.zzf(obj, zzB & 1048575), zzjhVar, true);
                        break;
                    case 39:
                        zzlt.zzR(i12, (List) zzms.zzf(obj, zzB & 1048575), zzjhVar, true);
                        break;
                    case 40:
                        zzlt.zzO(i12, (List) zzms.zzf(obj, zzB & 1048575), zzjhVar, true);
                        break;
                    case 41:
                        zzlt.zzN(i12, (List) zzms.zzf(obj, zzB & 1048575), zzjhVar, true);
                        break;
                    case 42:
                        zzlt.zzJ(i12, (List) zzms.zzf(obj, zzB & 1048575), zzjhVar, true);
                        break;
                    case 43:
                        zzlt.zzZ(i12, (List) zzms.zzf(obj, zzB & 1048575), zzjhVar, true);
                        break;
                    case 44:
                        zzlt.zzM(i12, (List) zzms.zzf(obj, zzB & 1048575), zzjhVar, true);
                        break;
                    case 45:
                        zzlt.zzU(i12, (List) zzms.zzf(obj, zzB & 1048575), zzjhVar, true);
                        break;
                    case 46:
                        zzlt.zzV(i12, (List) zzms.zzf(obj, zzB & 1048575), zzjhVar, true);
                        break;
                    case 47:
                        zzlt.zzW(i12, (List) zzms.zzf(obj, zzB & 1048575), zzjhVar, true);
                        break;
                    case 48:
                        zzlt.zzX(i12, (List) zzms.zzf(obj, zzB & 1048575), zzjhVar, true);
                        break;
                    case 49:
                        zzlt.zzQ(i12, (List) zzms.zzf(obj, zzB & 1048575), zzjhVar, zzE(i11));
                        break;
                    case 50:
                        zzS(zzjhVar, i12, zzms.zzf(obj, zzB & 1048575), i11);
                        break;
                    case 51:
                        if (zzP(obj, i12, i11)) {
                            zzjhVar.zzf(i12, zzn(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzP(obj, i12, i11)) {
                            zzjhVar.zzo(i12, zzo(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzP(obj, i12, i11)) {
                            zzjhVar.zzt(i12, zzC(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzP(obj, i12, i11)) {
                            zzjhVar.zzJ(i12, zzC(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzP(obj, i12, i11)) {
                            zzjhVar.zzr(i12, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzP(obj, i12, i11)) {
                            zzjhVar.zzm(i12, zzC(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzP(obj, i12, i11)) {
                            zzjhVar.zzk(i12, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzP(obj, i12, i11)) {
                            zzjhVar.zzb(i12, zzQ(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzP(obj, i12, i11)) {
                            zzT(i12, zzms.zzf(obj, zzB & 1048575), zzjhVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (zzP(obj, i12, i11)) {
                            zzjhVar.zzv(i12, zzms.zzf(obj, zzB & 1048575), zzE(i11));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzP(obj, i12, i11)) {
                            zzjhVar.zzd(i12, (zziy) zzms.zzf(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzP(obj, i12, i11)) {
                            zzjhVar.zzH(i12, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzP(obj, i12, i11)) {
                            zzjhVar.zzi(i12, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzP(obj, i12, i11)) {
                            zzjhVar.zzw(i12, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzP(obj, i12, i11)) {
                            zzjhVar.zzy(i12, zzC(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzP(obj, i12, i11)) {
                            zzjhVar.zzA(i12, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzP(obj, i12, i11)) {
                            zzjhVar.zzC(i12, zzC(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzP(obj, i12, i11)) {
                            zzjhVar.zzq(i12, zzms.zzf(obj, zzB & 1048575), zzE(i11));
                            break;
                        } else {
                            break;
                        }
                }
            }
            zzmi zzmiVar = this.zzn;
            zzmiVar.zzi(zzmiVar.zzc(obj), zzjhVar);
        } else {
            this.zzo.zza(obj);
            throw null;
        }
    }
}