package com.google.android.libraries.places.internal;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class zzagj<T> implements zzagr<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzahs.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final zzagg zze;
    private final boolean zzf;
    private final boolean zzg;
    private final int[] zzh;
    private final int zzi;
    private final zzafu zzj;
    private final zzahi zzk;
    private final zzaeo zzl;
    private final zzagl zzm;
    private final zzagb zzn;

    private zzagj(int[] iArr, Object[] objArr, int i11, int i12, zzagg zzaggVar, boolean z11, boolean z12, int[] iArr2, int i13, int i14, zzagl zzaglVar, zzafu zzafuVar, zzahi zzahiVar, zzaeo zzaeoVar, zzagb zzagbVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzg = z11;
        boolean z13 = false;
        if (zzaeoVar != null && zzaeoVar.zzc(zzaggVar)) {
            z13 = true;
        }
        this.zzf = z13;
        this.zzh = iArr2;
        this.zzi = i13;
        this.zzm = zzaglVar;
        this.zzj = zzafuVar;
        this.zzk = zzahiVar;
        this.zzl = zzaeoVar;
        this.zze = zzaggVar;
        this.zzn = zzagbVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void zzA(Object obj, zzahz zzahzVar) {
        int i11;
        boolean z11;
        if (!this.zzf) {
            int length = this.zzc.length;
            Unsafe unsafe = zzb;
            int i12 = 1048575;
            int i13 = 1048575;
            int i14 = 0;
            int i15 = 0;
            while (i14 < length) {
                int zzr = zzr(i14);
                int[] iArr = this.zzc;
                int i16 = iArr[i14];
                int zzq = zzq(zzr);
                if (zzq <= 17) {
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
                long j11 = zzr & i12;
                switch (zzq) {
                    case 0:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzahzVar.zzf(i16, zzahs.zza(obj, j11));
                            break;
                        }
                    case 1:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzahzVar.zzn(i16, zzahs.zzb(obj, j11));
                            break;
                        }
                    case 2:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzahzVar.zzs(i16, unsafe.getLong(obj, j11));
                            break;
                        }
                    case 3:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzahzVar.zzH(i16, unsafe.getLong(obj, j11));
                            break;
                        }
                    case 4:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzahzVar.zzq(i16, unsafe.getInt(obj, j11));
                            break;
                        }
                    case 5:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzahzVar.zzl(i16, unsafe.getLong(obj, j11));
                            break;
                        }
                    case 6:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzahzVar.zzj(i16, unsafe.getInt(obj, j11));
                            break;
                        }
                    case 7:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzahzVar.zzb(i16, zzahs.zzw(obj, j11));
                            break;
                        }
                    case 8:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzJ(i16, unsafe.getObject(obj, j11), zzahzVar);
                            break;
                        }
                    case 9:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzahzVar.zzu(i16, unsafe.getObject(obj, j11), zzt(i14));
                            break;
                        }
                    case 10:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzahzVar.zzd(i16, (zzaed) unsafe.getObject(obj, j11));
                            break;
                        }
                    case 11:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzahzVar.zzF(i16, unsafe.getInt(obj, j11));
                            break;
                        }
                    case 12:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzahzVar.zzh(i16, unsafe.getInt(obj, j11));
                            break;
                        }
                    case 13:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzahzVar.zzv(i16, unsafe.getInt(obj, j11));
                            break;
                        }
                    case 14:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzahzVar.zzx(i16, unsafe.getLong(obj, j11));
                            break;
                        }
                    case 15:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzahzVar.zzz(i16, unsafe.getInt(obj, j11));
                            break;
                        }
                    case 16:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzahzVar.zzB(i16, unsafe.getLong(obj, j11));
                            break;
                        }
                    case 17:
                        if ((i15 & i11) == 0) {
                            break;
                        } else {
                            zzahzVar.zzp(i16, unsafe.getObject(obj, j11), zzt(i14));
                            break;
                        }
                    case 18:
                        zzagt.zzH(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, false);
                        break;
                    case 19:
                        zzagt.zzL(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, false);
                        break;
                    case 20:
                        zzagt.zzO(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, false);
                        break;
                    case 21:
                        zzagt.zzW(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, false);
                        break;
                    case 22:
                        zzagt.zzN(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, false);
                        break;
                    case 23:
                        zzagt.zzK(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, false);
                        break;
                    case 24:
                        zzagt.zzJ(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, false);
                        break;
                    case 25:
                        zzagt.zzF(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, false);
                        break;
                    case 26:
                        zzagt.zzU(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar);
                        break;
                    case 27:
                        zzagt.zzP(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, zzt(i14));
                        break;
                    case 28:
                        zzagt.zzG(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar);
                        break;
                    case 29:
                        z11 = false;
                        zzagt.zzV(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, false);
                        break;
                    case 30:
                        z11 = false;
                        zzagt.zzI(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, false);
                        break;
                    case 31:
                        z11 = false;
                        zzagt.zzQ(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, false);
                        break;
                    case 32:
                        z11 = false;
                        zzagt.zzR(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, false);
                        break;
                    case 33:
                        z11 = false;
                        zzagt.zzS(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, false);
                        break;
                    case 34:
                        z11 = false;
                        zzagt.zzT(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, false);
                        break;
                    case 35:
                        zzagt.zzH(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, true);
                        break;
                    case 36:
                        zzagt.zzL(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, true);
                        break;
                    case 37:
                        zzagt.zzO(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, true);
                        break;
                    case 38:
                        zzagt.zzW(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, true);
                        break;
                    case 39:
                        zzagt.zzN(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, true);
                        break;
                    case 40:
                        zzagt.zzK(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, true);
                        break;
                    case 41:
                        zzagt.zzJ(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, true);
                        break;
                    case 42:
                        zzagt.zzF(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, true);
                        break;
                    case 43:
                        zzagt.zzV(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, true);
                        break;
                    case 44:
                        zzagt.zzI(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, true);
                        break;
                    case 45:
                        zzagt.zzQ(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, true);
                        break;
                    case 46:
                        zzagt.zzR(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, true);
                        break;
                    case 47:
                        zzagt.zzS(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, true);
                        break;
                    case 48:
                        zzagt.zzT(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, true);
                        break;
                    case 49:
                        zzagt.zzM(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzahzVar, zzt(i14));
                        break;
                    case 50:
                        zzB(zzahzVar, i16, unsafe.getObject(obj, j11), i14);
                        break;
                    case 51:
                        if (zzH(obj, i16, i14)) {
                            zzahzVar.zzf(i16, zzk(obj, j11));
                        }
                        break;
                    case 52:
                        if (zzH(obj, i16, i14)) {
                            zzahzVar.zzn(i16, zzl(obj, j11));
                        }
                        break;
                    case 53:
                        if (zzH(obj, i16, i14)) {
                            zzahzVar.zzs(i16, zzs(obj, j11));
                        }
                        break;
                    case 54:
                        if (zzH(obj, i16, i14)) {
                            zzahzVar.zzH(i16, zzs(obj, j11));
                        }
                        break;
                    case 55:
                        if (zzH(obj, i16, i14)) {
                            zzahzVar.zzq(i16, zzo(obj, j11));
                        }
                        break;
                    case 56:
                        if (zzH(obj, i16, i14)) {
                            zzahzVar.zzl(i16, zzs(obj, j11));
                        }
                        break;
                    case 57:
                        if (zzH(obj, i16, i14)) {
                            zzahzVar.zzj(i16, zzo(obj, j11));
                        }
                        break;
                    case 58:
                        if (zzH(obj, i16, i14)) {
                            zzahzVar.zzb(i16, zzI(obj, j11));
                        }
                        break;
                    case 59:
                        if (zzH(obj, i16, i14)) {
                            zzJ(i16, unsafe.getObject(obj, j11), zzahzVar);
                        }
                        break;
                    case 60:
                        if (zzH(obj, i16, i14)) {
                            zzahzVar.zzu(i16, unsafe.getObject(obj, j11), zzt(i14));
                        }
                        break;
                    case 61:
                        if (zzH(obj, i16, i14)) {
                            zzahzVar.zzd(i16, (zzaed) unsafe.getObject(obj, j11));
                        }
                        break;
                    case 62:
                        if (zzH(obj, i16, i14)) {
                            zzahzVar.zzF(i16, zzo(obj, j11));
                        }
                        break;
                    case 63:
                        if (zzH(obj, i16, i14)) {
                            zzahzVar.zzh(i16, zzo(obj, j11));
                        }
                        break;
                    case 64:
                        if (zzH(obj, i16, i14)) {
                            zzahzVar.zzv(i16, zzo(obj, j11));
                        }
                        break;
                    case 65:
                        if (zzH(obj, i16, i14)) {
                            zzahzVar.zzx(i16, zzs(obj, j11));
                        }
                        break;
                    case 66:
                        if (zzH(obj, i16, i14)) {
                            zzahzVar.zzz(i16, zzo(obj, j11));
                        }
                        break;
                    case 67:
                        if (zzH(obj, i16, i14)) {
                            zzahzVar.zzB(i16, zzs(obj, j11));
                        }
                        break;
                    case 68:
                        if (zzH(obj, i16, i14)) {
                            zzahzVar.zzp(i16, unsafe.getObject(obj, j11), zzt(i14));
                        }
                        break;
                }
                i14 += 3;
                i12 = 1048575;
            }
            zzahi zzahiVar = this.zzk;
            zzahiVar.zzg(zzahiVar.zzc(obj), zzahzVar);
            return;
        }
        this.zzl.zza(obj);
        throw null;
    }

    private final void zzB(zzahz zzahzVar, int i11, Object obj, int i12) {
        if (obj == null) {
            return;
        }
        zzafz zzafzVar = (zzafz) zzu(i12);
        throw null;
    }

    private final boolean zzC(Object obj, Object obj2, int i11) {
        return zzD(obj, i11) == zzD(obj2, i11);
    }

    private final boolean zzD(Object obj, int i11) {
        int zzp = zzp(i11);
        long j11 = zzp & 1048575;
        if (j11 != 1048575) {
            return (zzahs.zzc(obj, j11) & (1 << (zzp >>> 20))) != 0;
        }
        int zzr = zzr(i11);
        long j12 = zzr & 1048575;
        switch (zzq(zzr)) {
            case 0:
                return Double.doubleToRawLongBits(zzahs.zza(obj, j12)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzahs.zzb(obj, j12)) != 0;
            case 2:
                return zzahs.zzd(obj, j12) != 0;
            case 3:
                return zzahs.zzd(obj, j12) != 0;
            case 4:
                return zzahs.zzc(obj, j12) != 0;
            case 5:
                return zzahs.zzd(obj, j12) != 0;
            case 6:
                return zzahs.zzc(obj, j12) != 0;
            case 7:
                return zzahs.zzw(obj, j12);
            case 8:
                Object zzf = zzahs.zzf(obj, j12);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                } else if (zzf instanceof zzaed) {
                    return !zzaed.zzb.equals(zzf);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzahs.zzf(obj, j12) != null;
            case 10:
                return !zzaed.zzb.equals(zzahs.zzf(obj, j12));
            case 11:
                return zzahs.zzc(obj, j12) != 0;
            case 12:
                return zzahs.zzc(obj, j12) != 0;
            case 13:
                return zzahs.zzc(obj, j12) != 0;
            case 14:
                return zzahs.zzd(obj, j12) != 0;
            case 15:
                return zzahs.zzc(obj, j12) != 0;
            case 16:
                return zzahs.zzd(obj, j12) != 0;
            case 17:
                return zzahs.zzf(obj, j12) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzE(Object obj, int i11, int i12, int i13, int i14) {
        if (i12 == 1048575) {
            return zzD(obj, i11);
        }
        return (i13 & i14) != 0;
    }

    private static boolean zzF(Object obj, int i11, zzagr zzagrVar) {
        return zzagrVar.zzh(zzahs.zzf(obj, i11 & 1048575));
    }

    private static boolean zzG(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzaey) {
            return ((zzaey) obj).zzL();
        }
        return true;
    }

    private final boolean zzH(Object obj, int i11, int i12) {
        return zzahs.zzc(obj, (long) (zzp(i12) & 1048575)) == i11;
    }

    private static boolean zzI(Object obj, long j11) {
        return ((Boolean) zzahs.zzf(obj, j11)).booleanValue();
    }

    private static final void zzJ(int i11, Object obj, zzahz zzahzVar) {
        if (obj instanceof String) {
            zzahzVar.zzD(i11, (String) obj);
        } else {
            zzahzVar.zzd(i11, (zzaed) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzagj zzi(Class cls, zzagd zzagdVar, zzagl zzaglVar, zzafu zzafuVar, zzahi zzahiVar, zzaeo zzaeoVar, zzagb zzagbVar) {
        if (zzagdVar instanceof zzagq) {
            return zzj((zzagq) zzagdVar, zzaglVar, zzafuVar, zzahiVar, zzaeoVar, zzagbVar);
        }
        zzahf zzahfVar = (zzahf) zzagdVar;
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
    static com.google.android.libraries.places.internal.zzagj zzj(com.google.android.libraries.places.internal.zzagq r34, com.google.android.libraries.places.internal.zzagl r35, com.google.android.libraries.places.internal.zzafu r36, com.google.android.libraries.places.internal.zzahi r37, com.google.android.libraries.places.internal.zzaeo r38, com.google.android.libraries.places.internal.zzagb r39) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzagj.zzj(com.google.android.libraries.places.internal.zzagq, com.google.android.libraries.places.internal.zzagl, com.google.android.libraries.places.internal.zzafu, com.google.android.libraries.places.internal.zzahi, com.google.android.libraries.places.internal.zzaeo, com.google.android.libraries.places.internal.zzagb):com.google.android.libraries.places.internal.zzagj");
    }

    private static double zzk(Object obj, long j11) {
        return ((Double) zzahs.zzf(obj, j11)).doubleValue();
    }

    private static float zzl(Object obj, long j11) {
        return ((Float) zzahs.zzf(obj, j11)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzm(Object obj) {
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
            int zzr = zzr(i17);
            int[] iArr = this.zzc;
            int i21 = iArr[i17];
            int zzq = zzq(zzr);
            if (zzq <= 17) {
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
            long j11 = zzr & i15;
            switch (zzq) {
                case 0:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        zzA = zzael.zzA(i21 << 3);
                        zzA5 = zzA + 8;
                        i18 += zzA5;
                        break;
                    }
                case 1:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        zzA2 = zzael.zzA(i21 << 3);
                        zzA5 = zzA2 + 4;
                        i18 += zzA5;
                        break;
                    }
                case 2:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        long j12 = unsafe.getLong(obj, j11);
                        zzA3 = zzael.zzA(i21 << 3);
                        zzB = zzael.zzB(j12);
                        i18 += zzA3 + zzB;
                        break;
                    }
                case 3:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        long j13 = unsafe.getLong(obj, j11);
                        zzA3 = zzael.zzA(i21 << 3);
                        zzB = zzael.zzB(j13);
                        i18 += zzA3 + zzB;
                        break;
                    }
                case 4:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        int i24 = unsafe.getInt(obj, j11);
                        zzA4 = zzael.zzA(i21 << 3);
                        zzv = zzael.zzv(i24);
                        i12 = zzA4 + zzv;
                        i18 += i12;
                        break;
                    }
                case 5:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        zzA = zzael.zzA(i21 << 3);
                        zzA5 = zzA + 8;
                        i18 += zzA5;
                        break;
                    }
                case 6:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        zzA2 = zzael.zzA(i21 << 3);
                        zzA5 = zzA2 + 4;
                        i18 += zzA5;
                        break;
                    }
                case 7:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        zzA5 = zzael.zzA(i21 << 3) + 1;
                        i18 += zzA5;
                        break;
                    }
                case 8:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j11);
                        if (object instanceof zzaed) {
                            zzA6 = zzael.zzA(i21 << 3);
                            zzd = ((zzaed) object).zzd();
                            zzA7 = zzael.zzA(zzd);
                            i12 = zzA6 + zzA7 + zzd;
                            i18 += i12;
                            break;
                        } else {
                            zzA4 = zzael.zzA(i21 << 3);
                            zzv = zzael.zzy((String) object);
                            i12 = zzA4 + zzv;
                            i18 += i12;
                        }
                    }
                case 9:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        zzA5 = zzagt.zzo(i21, unsafe.getObject(obj, j11), zzt(i17));
                        i18 += zzA5;
                        break;
                    }
                case 10:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        zzA6 = zzael.zzA(i21 << 3);
                        zzd = ((zzaed) unsafe.getObject(obj, j11)).zzd();
                        zzA7 = zzael.zzA(zzd);
                        i12 = zzA6 + zzA7 + zzd;
                        i18 += i12;
                        break;
                    }
                case 11:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        int i25 = unsafe.getInt(obj, j11);
                        zzA4 = zzael.zzA(i21 << 3);
                        zzv = zzael.zzA(i25);
                        i12 = zzA4 + zzv;
                        i18 += i12;
                        break;
                    }
                case 12:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        int i26 = unsafe.getInt(obj, j11);
                        zzA4 = zzael.zzA(i21 << 3);
                        zzv = zzael.zzv(i26);
                        i12 = zzA4 + zzv;
                        i18 += i12;
                        break;
                    }
                case 13:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        zzA2 = zzael.zzA(i21 << 3);
                        zzA5 = zzA2 + 4;
                        i18 += zzA5;
                        break;
                    }
                case 14:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        zzA = zzael.zzA(i21 << 3);
                        zzA5 = zzA + 8;
                        i18 += zzA5;
                        break;
                    }
                case 15:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        int i27 = unsafe.getInt(obj, j11);
                        zzA4 = zzael.zzA(i21 << 3);
                        zzv = zzael.zzA((i27 >> 31) ^ (i27 + i27));
                        i12 = zzA4 + zzv;
                        i18 += i12;
                        break;
                    }
                case 16:
                    if ((i11 & i19) == 0) {
                        break;
                    } else {
                        long j14 = unsafe.getLong(obj, j11);
                        i18 += zzael.zzA(i21 << 3) + zzael.zzB((j14 >> 63) ^ (j14 + j14));
                        break;
                    }
                case 17:
                    if ((i19 & i11) == 0) {
                        break;
                    } else {
                        zzA5 = zzael.zzu(i21, (zzagg) unsafe.getObject(obj, j11), zzt(i17));
                        i18 += zzA5;
                        break;
                    }
                case 18:
                    zzA5 = zzagt.zzh(i21, (List) unsafe.getObject(obj, j11), false);
                    i18 += zzA5;
                    break;
                case 19:
                    zzA5 = zzagt.zzf(i21, (List) unsafe.getObject(obj, j11), false);
                    i18 += zzA5;
                    break;
                case 20:
                    zzA5 = zzagt.zzm(i21, (List) unsafe.getObject(obj, j11), false);
                    i18 += zzA5;
                    break;
                case 21:
                    zzA5 = zzagt.zzx(i21, (List) unsafe.getObject(obj, j11), false);
                    i18 += zzA5;
                    break;
                case 22:
                    zzA5 = zzagt.zzk(i21, (List) unsafe.getObject(obj, j11), false);
                    i18 += zzA5;
                    break;
                case 23:
                    zzA5 = zzagt.zzh(i21, (List) unsafe.getObject(obj, j11), false);
                    i18 += zzA5;
                    break;
                case 24:
                    zzA5 = zzagt.zzf(i21, (List) unsafe.getObject(obj, j11), false);
                    i18 += zzA5;
                    break;
                case 25:
                    zzA5 = zzagt.zza(i21, (List) unsafe.getObject(obj, j11), false);
                    i18 += zzA5;
                    break;
                case 26:
                    zzu = zzagt.zzu(i21, (List) unsafe.getObject(obj, j11));
                    i18 += zzu;
                    break;
                case 27:
                    zzu = zzagt.zzp(i21, (List) unsafe.getObject(obj, j11), zzt(i17));
                    i18 += zzu;
                    break;
                case 28:
                    zzu = zzagt.zzc(i21, (List) unsafe.getObject(obj, j11));
                    i18 += zzu;
                    break;
                case 29:
                    zzu = zzagt.zzv(i21, (List) unsafe.getObject(obj, j11), false);
                    i18 += zzu;
                    break;
                case 30:
                    z11 = false;
                    zzd2 = zzagt.zzd(i21, (List) unsafe.getObject(obj, j11), false);
                    i18 += zzd2;
                    break;
                case 31:
                    z11 = false;
                    zzd2 = zzagt.zzf(i21, (List) unsafe.getObject(obj, j11), false);
                    i18 += zzd2;
                    break;
                case 32:
                    z11 = false;
                    zzd2 = zzagt.zzh(i21, (List) unsafe.getObject(obj, j11), false);
                    i18 += zzd2;
                    break;
                case 33:
                    z11 = false;
                    zzd2 = zzagt.zzq(i21, (List) unsafe.getObject(obj, j11), false);
                    i18 += zzd2;
                    break;
                case 34:
                    z11 = false;
                    zzd2 = zzagt.zzs(i21, (List) unsafe.getObject(obj, j11), false);
                    i18 += zzd2;
                    break;
                case 35:
                    zzi = zzagt.zzi((List) unsafe.getObject(obj, j11));
                    if (zzi > 0) {
                        zzz = zzael.zzz(i21);
                        zzA8 = zzael.zzA(zzi);
                        i13 = zzz + zzA8;
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 36:
                    zzi = zzagt.zzg((List) unsafe.getObject(obj, j11));
                    if (zzi > 0) {
                        zzz = zzael.zzz(i21);
                        zzA8 = zzael.zzA(zzi);
                        i13 = zzz + zzA8;
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 37:
                    zzi = zzagt.zzn((List) unsafe.getObject(obj, j11));
                    if (zzi > 0) {
                        zzz = zzael.zzz(i21);
                        zzA8 = zzael.zzA(zzi);
                        i13 = zzz + zzA8;
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 38:
                    zzi = zzagt.zzy((List) unsafe.getObject(obj, j11));
                    if (zzi > 0) {
                        zzz = zzael.zzz(i21);
                        zzA8 = zzael.zzA(zzi);
                        i13 = zzz + zzA8;
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 39:
                    zzi = zzagt.zzl((List) unsafe.getObject(obj, j11));
                    if (zzi > 0) {
                        zzz = zzael.zzz(i21);
                        zzA8 = zzael.zzA(zzi);
                        i13 = zzz + zzA8;
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 40:
                    zzi = zzagt.zzi((List) unsafe.getObject(obj, j11));
                    if (zzi > 0) {
                        zzz = zzael.zzz(i21);
                        zzA8 = zzael.zzA(zzi);
                        i13 = zzz + zzA8;
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 41:
                    zzi = zzagt.zzg((List) unsafe.getObject(obj, j11));
                    if (zzi > 0) {
                        zzz = zzael.zzz(i21);
                        zzA8 = zzael.zzA(zzi);
                        i13 = zzz + zzA8;
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 42:
                    zzi = zzagt.zzb((List) unsafe.getObject(obj, j11));
                    if (zzi > 0) {
                        zzz = zzael.zzz(i21);
                        zzA8 = zzael.zzA(zzi);
                        i13 = zzz + zzA8;
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 43:
                    zzi = zzagt.zzw((List) unsafe.getObject(obj, j11));
                    if (zzi > 0) {
                        zzz = zzael.zzz(i21);
                        zzA8 = zzael.zzA(zzi);
                        i13 = zzz + zzA8;
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 44:
                    zzi = zzagt.zze((List) unsafe.getObject(obj, j11));
                    if (zzi > 0) {
                        zzz = zzael.zzz(i21);
                        zzA8 = zzael.zzA(zzi);
                        i13 = zzz + zzA8;
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 45:
                    zzi = zzagt.zzg((List) unsafe.getObject(obj, j11));
                    if (zzi > 0) {
                        zzz = zzael.zzz(i21);
                        zzA8 = zzael.zzA(zzi);
                        i13 = zzz + zzA8;
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 46:
                    zzi = zzagt.zzi((List) unsafe.getObject(obj, j11));
                    if (zzi > 0) {
                        zzz = zzael.zzz(i21);
                        zzA8 = zzael.zzA(zzi);
                        i13 = zzz + zzA8;
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 47:
                    zzi = zzagt.zzr((List) unsafe.getObject(obj, j11));
                    if (zzi > 0) {
                        zzz = zzael.zzz(i21);
                        zzA8 = zzael.zzA(zzi);
                        i13 = zzz + zzA8;
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 48:
                    zzi = zzagt.zzt((List) unsafe.getObject(obj, j11));
                    if (zzi > 0) {
                        zzz = zzael.zzz(i21);
                        zzA8 = zzael.zzA(zzi);
                        i13 = zzz + zzA8;
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 49:
                    zzu = zzagt.zzj(i21, (List) unsafe.getObject(obj, j11), zzt(i17));
                    i18 += zzu;
                    break;
                case 50:
                    zzagb.zza(i21, unsafe.getObject(obj, j11), zzu(i17));
                    break;
                case 51:
                    if (zzH(obj, i21, i17)) {
                        zzA9 = zzael.zzA(i21 << 3);
                        zzu = zzA9 + 8;
                        i18 += zzu;
                    }
                    break;
                case 52:
                    if (zzH(obj, i21, i17)) {
                        zzA10 = zzael.zzA(i21 << 3);
                        zzu = zzA10 + 4;
                        i18 += zzu;
                    }
                    break;
                case 53:
                    if (zzH(obj, i21, i17)) {
                        long zzs = zzs(obj, j11);
                        zzA11 = zzael.zzA(i21 << 3);
                        zzB2 = zzael.zzB(zzs);
                        i18 += zzA11 + zzB2;
                    }
                    break;
                case 54:
                    if (zzH(obj, i21, i17)) {
                        long zzs2 = zzs(obj, j11);
                        zzA11 = zzael.zzA(i21 << 3);
                        zzB2 = zzael.zzB(zzs2);
                        i18 += zzA11 + zzB2;
                    }
                    break;
                case 55:
                    if (zzH(obj, i21, i17)) {
                        int zzo = zzo(obj, j11);
                        i13 = zzael.zzA(i21 << 3);
                        zzi = zzael.zzv(zzo);
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 56:
                    if (zzH(obj, i21, i17)) {
                        zzA9 = zzael.zzA(i21 << 3);
                        zzu = zzA9 + 8;
                        i18 += zzu;
                    }
                    break;
                case 57:
                    if (zzH(obj, i21, i17)) {
                        zzA10 = zzael.zzA(i21 << 3);
                        zzu = zzA10 + 4;
                        i18 += zzu;
                    }
                    break;
                case 58:
                    if (zzH(obj, i21, i17)) {
                        zzu = zzael.zzA(i21 << 3) + 1;
                        i18 += zzu;
                    }
                    break;
                case 59:
                    if (zzH(obj, i21, i17)) {
                        Object object2 = unsafe.getObject(obj, j11);
                        if (object2 instanceof zzaed) {
                            zzA12 = zzael.zzA(i21 << 3);
                            zzd3 = ((zzaed) object2).zzd();
                            zzA13 = zzael.zzA(zzd3);
                            i14 = zzA12 + zzA13 + zzd3;
                            i18 += i14;
                        } else {
                            i13 = zzael.zzA(i21 << 3);
                            zzi = zzael.zzy((String) object2);
                            i14 = i13 + zzi;
                            i18 += i14;
                        }
                    }
                    break;
                case 60:
                    if (zzH(obj, i21, i17)) {
                        zzu = zzagt.zzo(i21, unsafe.getObject(obj, j11), zzt(i17));
                        i18 += zzu;
                    }
                    break;
                case 61:
                    if (zzH(obj, i21, i17)) {
                        zzA12 = zzael.zzA(i21 << 3);
                        zzd3 = ((zzaed) unsafe.getObject(obj, j11)).zzd();
                        zzA13 = zzael.zzA(zzd3);
                        i14 = zzA12 + zzA13 + zzd3;
                        i18 += i14;
                    }
                    break;
                case 62:
                    if (zzH(obj, i21, i17)) {
                        int zzo2 = zzo(obj, j11);
                        i13 = zzael.zzA(i21 << 3);
                        zzi = zzael.zzA(zzo2);
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 63:
                    if (zzH(obj, i21, i17)) {
                        int zzo3 = zzo(obj, j11);
                        i13 = zzael.zzA(i21 << 3);
                        zzi = zzael.zzv(zzo3);
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 64:
                    if (zzH(obj, i21, i17)) {
                        zzA10 = zzael.zzA(i21 << 3);
                        zzu = zzA10 + 4;
                        i18 += zzu;
                    }
                    break;
                case 65:
                    if (zzH(obj, i21, i17)) {
                        zzA9 = zzael.zzA(i21 << 3);
                        zzu = zzA9 + 8;
                        i18 += zzu;
                    }
                    break;
                case 66:
                    if (zzH(obj, i21, i17)) {
                        int zzo4 = zzo(obj, j11);
                        i13 = zzael.zzA(i21 << 3);
                        zzi = zzael.zzA((zzo4 >> 31) ^ (zzo4 + zzo4));
                        i14 = i13 + zzi;
                        i18 += i14;
                    }
                    break;
                case 67:
                    if (zzH(obj, i21, i17)) {
                        long zzs3 = zzs(obj, j11);
                        i18 += zzael.zzA(i21 << 3) + zzael.zzB((zzs3 >> 63) ^ (zzs3 + zzs3));
                    }
                    break;
                case 68:
                    if (zzH(obj, i21, i17)) {
                        zzu = zzael.zzu(i21, (zzagg) unsafe.getObject(obj, j11), zzt(i17));
                        i18 += zzu;
                    }
                    break;
            }
            i17 += 3;
            i15 = 1048575;
        }
        zzahi zzahiVar = this.zzk;
        int zza2 = i18 + zzahiVar.zza(zzahiVar.zzc(obj));
        if (this.zzf) {
            this.zzl.zza(obj);
            throw null;
        }
        return zza2;
    }

    private final int zzn(Object obj) {
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
            int zzr = zzr(i13);
            int zzq = zzq(zzr);
            int i14 = this.zzc[i13];
            long j11 = zzr & 1048575;
            if (zzq >= zzaet.zzJ.zza() && zzq <= zzaet.zzW.zza()) {
                int i15 = this.zzc[i13 + 2];
            }
            switch (zzq) {
                case 0:
                    if (zzD(obj, i13)) {
                        zzA = zzael.zzA(i14 << 3);
                        zzo = zzA + 8;
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzD(obj, i13)) {
                        zzA2 = zzael.zzA(i14 << 3);
                        zzo = zzA2 + 4;
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzD(obj, i13)) {
                        long zzd2 = zzahs.zzd(obj, j11);
                        zzA3 = zzael.zzA(i14 << 3);
                        zzB = zzael.zzB(zzd2);
                        i12 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzD(obj, i13)) {
                        long zzd3 = zzahs.zzd(obj, j11);
                        zzA3 = zzael.zzA(i14 << 3);
                        zzB = zzael.zzB(zzd3);
                        i12 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzD(obj, i13)) {
                        int zzc = zzahs.zzc(obj, j11);
                        zzA4 = zzael.zzA(i14 << 3);
                        zzv = zzael.zzv(zzc);
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzD(obj, i13)) {
                        zzA = zzael.zzA(i14 << 3);
                        zzo = zzA + 8;
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzD(obj, i13)) {
                        zzA2 = zzael.zzA(i14 << 3);
                        zzo = zzA2 + 4;
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzD(obj, i13)) {
                        zzA5 = zzael.zzA(i14 << 3);
                        zzo = zzA5 + 1;
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzD(obj, i13)) {
                        break;
                    } else {
                        Object zzf = zzahs.zzf(obj, j11);
                        if (zzf instanceof zzaed) {
                            zzA6 = zzael.zzA(i14 << 3);
                            zzd = ((zzaed) zzf).zzd();
                            zzA7 = zzael.zzA(zzd);
                            i11 = zzA6 + zzA7 + zzd;
                            i12 += i11;
                            break;
                        } else {
                            zzA4 = zzael.zzA(i14 << 3);
                            zzv = zzael.zzy((String) zzf);
                            i11 = zzA4 + zzv;
                            i12 += i11;
                        }
                    }
                case 9:
                    if (zzD(obj, i13)) {
                        zzo = zzagt.zzo(i14, zzahs.zzf(obj, j11), zzt(i13));
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzD(obj, i13)) {
                        zzA6 = zzael.zzA(i14 << 3);
                        zzd = ((zzaed) zzahs.zzf(obj, j11)).zzd();
                        zzA7 = zzael.zzA(zzd);
                        i11 = zzA6 + zzA7 + zzd;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzD(obj, i13)) {
                        int zzc2 = zzahs.zzc(obj, j11);
                        zzA4 = zzael.zzA(i14 << 3);
                        zzv = zzael.zzA(zzc2);
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzD(obj, i13)) {
                        int zzc3 = zzahs.zzc(obj, j11);
                        zzA4 = zzael.zzA(i14 << 3);
                        zzv = zzael.zzv(zzc3);
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzD(obj, i13)) {
                        zzA2 = zzael.zzA(i14 << 3);
                        zzo = zzA2 + 4;
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzD(obj, i13)) {
                        zzA = zzael.zzA(i14 << 3);
                        zzo = zzA + 8;
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzD(obj, i13)) {
                        int zzc4 = zzahs.zzc(obj, j11);
                        zzA4 = zzael.zzA(i14 << 3);
                        zzv = zzael.zzA((zzc4 >> 31) ^ (zzc4 + zzc4));
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzD(obj, i13)) {
                        long zzd4 = zzahs.zzd(obj, j11);
                        zzA4 = zzael.zzA(i14 << 3);
                        zzv = zzael.zzB((zzd4 >> 63) ^ (zzd4 + zzd4));
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzD(obj, i13)) {
                        zzo = zzael.zzu(i14, (zzagg) zzahs.zzf(obj, j11), zzt(i13));
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzo = zzagt.zzh(i14, (List) zzahs.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 19:
                    zzo = zzagt.zzf(i14, (List) zzahs.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 20:
                    zzo = zzagt.zzm(i14, (List) zzahs.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 21:
                    zzo = zzagt.zzx(i14, (List) zzahs.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 22:
                    zzo = zzagt.zzk(i14, (List) zzahs.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 23:
                    zzo = zzagt.zzh(i14, (List) zzahs.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 24:
                    zzo = zzagt.zzf(i14, (List) zzahs.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 25:
                    zzo = zzagt.zza(i14, (List) zzahs.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 26:
                    zzo = zzagt.zzu(i14, (List) zzahs.zzf(obj, j11));
                    i12 += zzo;
                    break;
                case 27:
                    zzo = zzagt.zzp(i14, (List) zzahs.zzf(obj, j11), zzt(i13));
                    i12 += zzo;
                    break;
                case 28:
                    zzo = zzagt.zzc(i14, (List) zzahs.zzf(obj, j11));
                    i12 += zzo;
                    break;
                case 29:
                    zzo = zzagt.zzv(i14, (List) zzahs.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 30:
                    zzo = zzagt.zzd(i14, (List) zzahs.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 31:
                    zzo = zzagt.zzf(i14, (List) zzahs.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 32:
                    zzo = zzagt.zzh(i14, (List) zzahs.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 33:
                    zzo = zzagt.zzq(i14, (List) zzahs.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 34:
                    zzo = zzagt.zzs(i14, (List) zzahs.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 35:
                    zzv = zzagt.zzi((List) unsafe.getObject(obj, j11));
                    if (zzv > 0) {
                        zzz = zzael.zzz(i14);
                        zzA8 = zzael.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzv = zzagt.zzg((List) unsafe.getObject(obj, j11));
                    if (zzv > 0) {
                        zzz = zzael.zzz(i14);
                        zzA8 = zzael.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzv = zzagt.zzn((List) unsafe.getObject(obj, j11));
                    if (zzv > 0) {
                        zzz = zzael.zzz(i14);
                        zzA8 = zzael.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzv = zzagt.zzy((List) unsafe.getObject(obj, j11));
                    if (zzv > 0) {
                        zzz = zzael.zzz(i14);
                        zzA8 = zzael.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzv = zzagt.zzl((List) unsafe.getObject(obj, j11));
                    if (zzv > 0) {
                        zzz = zzael.zzz(i14);
                        zzA8 = zzael.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzv = zzagt.zzi((List) unsafe.getObject(obj, j11));
                    if (zzv > 0) {
                        zzz = zzael.zzz(i14);
                        zzA8 = zzael.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzv = zzagt.zzg((List) unsafe.getObject(obj, j11));
                    if (zzv > 0) {
                        zzz = zzael.zzz(i14);
                        zzA8 = zzael.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    zzv = zzagt.zzb((List) unsafe.getObject(obj, j11));
                    if (zzv > 0) {
                        zzz = zzael.zzz(i14);
                        zzA8 = zzael.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzv = zzagt.zzw((List) unsafe.getObject(obj, j11));
                    if (zzv > 0) {
                        zzz = zzael.zzz(i14);
                        zzA8 = zzael.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzv = zzagt.zze((List) unsafe.getObject(obj, j11));
                    if (zzv > 0) {
                        zzz = zzael.zzz(i14);
                        zzA8 = zzael.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzv = zzagt.zzg((List) unsafe.getObject(obj, j11));
                    if (zzv > 0) {
                        zzz = zzael.zzz(i14);
                        zzA8 = zzael.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzv = zzagt.zzi((List) unsafe.getObject(obj, j11));
                    if (zzv > 0) {
                        zzz = zzael.zzz(i14);
                        zzA8 = zzael.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzv = zzagt.zzr((List) unsafe.getObject(obj, j11));
                    if (zzv > 0) {
                        zzz = zzael.zzz(i14);
                        zzA8 = zzael.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzv = zzagt.zzt((List) unsafe.getObject(obj, j11));
                    if (zzv > 0) {
                        zzz = zzael.zzz(i14);
                        zzA8 = zzael.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzo = zzagt.zzj(i14, (List) zzahs.zzf(obj, j11), zzt(i13));
                    i12 += zzo;
                    break;
                case 50:
                    zzagb.zza(i14, zzahs.zzf(obj, j11), zzu(i13));
                    break;
                case 51:
                    if (zzH(obj, i14, i13)) {
                        zzA = zzael.zzA(i14 << 3);
                        zzo = zzA + 8;
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzH(obj, i14, i13)) {
                        zzA2 = zzael.zzA(i14 << 3);
                        zzo = zzA2 + 4;
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzH(obj, i14, i13)) {
                        long zzs = zzs(obj, j11);
                        zzA3 = zzael.zzA(i14 << 3);
                        zzB = zzael.zzB(zzs);
                        i12 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzH(obj, i14, i13)) {
                        long zzs2 = zzs(obj, j11);
                        zzA3 = zzael.zzA(i14 << 3);
                        zzB = zzael.zzB(zzs2);
                        i12 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzH(obj, i14, i13)) {
                        int zzo2 = zzo(obj, j11);
                        zzA4 = zzael.zzA(i14 << 3);
                        zzv = zzael.zzv(zzo2);
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzH(obj, i14, i13)) {
                        zzA = zzael.zzA(i14 << 3);
                        zzo = zzA + 8;
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzH(obj, i14, i13)) {
                        zzA2 = zzael.zzA(i14 << 3);
                        zzo = zzA2 + 4;
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzH(obj, i14, i13)) {
                        zzA5 = zzael.zzA(i14 << 3);
                        zzo = zzA5 + 1;
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zzH(obj, i14, i13)) {
                        break;
                    } else {
                        Object zzf2 = zzahs.zzf(obj, j11);
                        if (zzf2 instanceof zzaed) {
                            zzA6 = zzael.zzA(i14 << 3);
                            zzd = ((zzaed) zzf2).zzd();
                            zzA7 = zzael.zzA(zzd);
                            i11 = zzA6 + zzA7 + zzd;
                            i12 += i11;
                            break;
                        } else {
                            zzA4 = zzael.zzA(i14 << 3);
                            zzv = zzael.zzy((String) zzf2);
                            i11 = zzA4 + zzv;
                            i12 += i11;
                        }
                    }
                case 60:
                    if (zzH(obj, i14, i13)) {
                        zzo = zzagt.zzo(i14, zzahs.zzf(obj, j11), zzt(i13));
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzH(obj, i14, i13)) {
                        zzA6 = zzael.zzA(i14 << 3);
                        zzd = ((zzaed) zzahs.zzf(obj, j11)).zzd();
                        zzA7 = zzael.zzA(zzd);
                        i11 = zzA6 + zzA7 + zzd;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzH(obj, i14, i13)) {
                        int zzo3 = zzo(obj, j11);
                        zzA4 = zzael.zzA(i14 << 3);
                        zzv = zzael.zzA(zzo3);
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzH(obj, i14, i13)) {
                        int zzo4 = zzo(obj, j11);
                        zzA4 = zzael.zzA(i14 << 3);
                        zzv = zzael.zzv(zzo4);
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzH(obj, i14, i13)) {
                        zzA2 = zzael.zzA(i14 << 3);
                        zzo = zzA2 + 4;
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzH(obj, i14, i13)) {
                        zzA = zzael.zzA(i14 << 3);
                        zzo = zzA + 8;
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzH(obj, i14, i13)) {
                        int zzo5 = zzo(obj, j11);
                        zzA4 = zzael.zzA(i14 << 3);
                        zzv = zzael.zzA((zzo5 >> 31) ^ (zzo5 + zzo5));
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzH(obj, i14, i13)) {
                        long zzs3 = zzs(obj, j11);
                        zzA4 = zzael.zzA(i14 << 3);
                        zzv = zzael.zzB((zzs3 >> 63) ^ (zzs3 + zzs3));
                        i11 = zzA4 + zzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzH(obj, i14, i13)) {
                        zzo = zzael.zzu(i14, (zzagg) zzahs.zzf(obj, j11), zzt(i13));
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzahi zzahiVar = this.zzk;
        return i12 + zzahiVar.zza(zzahiVar.zzc(obj));
    }

    private static int zzo(Object obj, long j11) {
        return ((Integer) zzahs.zzf(obj, j11)).intValue();
    }

    private final int zzp(int i11) {
        return this.zzc[i11 + 2];
    }

    private static int zzq(int i11) {
        return (i11 >>> 20) & 255;
    }

    private final int zzr(int i11) {
        return this.zzc[i11 + 1];
    }

    private static long zzs(Object obj, long j11) {
        return ((Long) zzahs.zzf(obj, j11)).longValue();
    }

    private final zzagr zzt(int i11) {
        int i12 = i11 / 3;
        int i13 = i12 + i12;
        zzagr zzagrVar = (zzagr) this.zzd[i13];
        if (zzagrVar != null) {
            return zzagrVar;
        }
        zzagr zzb2 = zzago.zza().zzb((Class) this.zzd[i13 + 1]);
        this.zzd[i13] = zzb2;
        return zzb2;
    }

    private final Object zzu(int i11) {
        int i12 = i11 / 3;
        return this.zzd[i12 + i12];
    }

    private static Field zzv(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private final void zzw(Object obj, Object obj2, int i11) {
        if (zzD(obj2, i11)) {
            long zzr = zzr(i11) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(obj2, zzr);
            if (object != null) {
                zzagr zzt = zzt(i11);
                if (!zzD(obj, i11)) {
                    if (!zzG(object)) {
                        unsafe.putObject(obj, zzr, object);
                    } else {
                        Object zzc = zzt.zzc();
                        zzt.zze(zzc, object);
                        unsafe.putObject(obj, zzr, zzc);
                    }
                    zzy(obj, i11);
                    return;
                }
                Object object2 = unsafe.getObject(obj, zzr);
                if (!zzG(object2)) {
                    Object zzc2 = zzt.zzc();
                    zzt.zze(zzc2, object2);
                    unsafe.putObject(obj, zzr, zzc2);
                    object2 = zzc2;
                }
                zzt.zze(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i11] + " is present but null: " + obj2.toString());
        }
    }

    private final void zzx(Object obj, Object obj2, int i11) {
        int i12 = this.zzc[i11];
        if (zzH(obj2, i12, i11)) {
            long zzr = zzr(i11) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(obj2, zzr);
            if (object != null) {
                zzagr zzt = zzt(i11);
                if (!zzH(obj, i12, i11)) {
                    if (!zzG(object)) {
                        unsafe.putObject(obj, zzr, object);
                    } else {
                        Object zzc = zzt.zzc();
                        zzt.zze(zzc, object);
                        unsafe.putObject(obj, zzr, zzc);
                    }
                    zzz(obj, i12, i11);
                    return;
                }
                Object object2 = unsafe.getObject(obj, zzr);
                if (!zzG(object2)) {
                    Object zzc2 = zzt.zzc();
                    zzt.zze(zzc2, object2);
                    unsafe.putObject(obj, zzr, zzc2);
                    object2 = zzc2;
                }
                zzt.zze(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i11] + " is present but null: " + obj2.toString());
        }
    }

    private final void zzy(Object obj, int i11) {
        int zzp = zzp(i11);
        long j11 = 1048575 & zzp;
        if (j11 == 1048575) {
            return;
        }
        zzahs.zzq(obj, j11, (1 << (zzp >>> 20)) | zzahs.zzc(obj, j11));
    }

    private final void zzz(Object obj, int i11, int i12) {
        zzahs.zzq(obj, zzp(i12) & 1048575, i11);
    }

    @Override // com.google.android.libraries.places.internal.zzagr
    public final int zza(Object obj) {
        return this.zzg ? zzn(obj) : zzm(obj);
    }

    @Override // com.google.android.libraries.places.internal.zzagr
    public final int zzb(Object obj) {
        int i11;
        int zzc;
        int length = this.zzc.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int zzr = zzr(i13);
            int i14 = this.zzc[i13];
            long j11 = 1048575 & zzr;
            int i15 = 37;
            switch (zzq(zzr)) {
                case 0:
                    i11 = i12 * 53;
                    zzc = zzafh.zzc(Double.doubleToLongBits(zzahs.zza(obj, j11)));
                    i12 = i11 + zzc;
                    break;
                case 1:
                    i11 = i12 * 53;
                    zzc = Float.floatToIntBits(zzahs.zzb(obj, j11));
                    i12 = i11 + zzc;
                    break;
                case 2:
                    i11 = i12 * 53;
                    zzc = zzafh.zzc(zzahs.zzd(obj, j11));
                    i12 = i11 + zzc;
                    break;
                case 3:
                    i11 = i12 * 53;
                    zzc = zzafh.zzc(zzahs.zzd(obj, j11));
                    i12 = i11 + zzc;
                    break;
                case 4:
                    i11 = i12 * 53;
                    zzc = zzahs.zzc(obj, j11);
                    i12 = i11 + zzc;
                    break;
                case 5:
                    i11 = i12 * 53;
                    zzc = zzafh.zzc(zzahs.zzd(obj, j11));
                    i12 = i11 + zzc;
                    break;
                case 6:
                    i11 = i12 * 53;
                    zzc = zzahs.zzc(obj, j11);
                    i12 = i11 + zzc;
                    break;
                case 7:
                    i11 = i12 * 53;
                    zzc = zzafh.zza(zzahs.zzw(obj, j11));
                    i12 = i11 + zzc;
                    break;
                case 8:
                    i11 = i12 * 53;
                    zzc = ((String) zzahs.zzf(obj, j11)).hashCode();
                    i12 = i11 + zzc;
                    break;
                case 9:
                    Object zzf = zzahs.zzf(obj, j11);
                    if (zzf != null) {
                        i15 = zzf.hashCode();
                    }
                    i12 = (i12 * 53) + i15;
                    break;
                case 10:
                    i11 = i12 * 53;
                    zzc = zzahs.zzf(obj, j11).hashCode();
                    i12 = i11 + zzc;
                    break;
                case 11:
                    i11 = i12 * 53;
                    zzc = zzahs.zzc(obj, j11);
                    i12 = i11 + zzc;
                    break;
                case 12:
                    i11 = i12 * 53;
                    zzc = zzahs.zzc(obj, j11);
                    i12 = i11 + zzc;
                    break;
                case 13:
                    i11 = i12 * 53;
                    zzc = zzahs.zzc(obj, j11);
                    i12 = i11 + zzc;
                    break;
                case 14:
                    i11 = i12 * 53;
                    zzc = zzafh.zzc(zzahs.zzd(obj, j11));
                    i12 = i11 + zzc;
                    break;
                case 15:
                    i11 = i12 * 53;
                    zzc = zzahs.zzc(obj, j11);
                    i12 = i11 + zzc;
                    break;
                case 16:
                    i11 = i12 * 53;
                    zzc = zzafh.zzc(zzahs.zzd(obj, j11));
                    i12 = i11 + zzc;
                    break;
                case 17:
                    Object zzf2 = zzahs.zzf(obj, j11);
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
                    zzc = zzahs.zzf(obj, j11).hashCode();
                    i12 = i11 + zzc;
                    break;
                case 50:
                    i11 = i12 * 53;
                    zzc = zzahs.zzf(obj, j11).hashCode();
                    i12 = i11 + zzc;
                    break;
                case 51:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzafh.zzc(Double.doubleToLongBits(zzk(obj, j11)));
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = Float.floatToIntBits(zzl(obj, j11));
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzafh.zzc(zzs(obj, j11));
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzafh.zzc(zzs(obj, j11));
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzo(obj, j11);
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzafh.zzc(zzs(obj, j11));
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzo(obj, j11);
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzafh.zza(zzI(obj, j11));
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = ((String) zzahs.zzf(obj, j11)).hashCode();
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzahs.zzf(obj, j11).hashCode();
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzahs.zzf(obj, j11).hashCode();
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzo(obj, j11);
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzo(obj, j11);
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzo(obj, j11);
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzafh.zzc(zzs(obj, j11));
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzo(obj, j11);
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzafh.zzc(zzs(obj, j11));
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzH(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzahs.zzf(obj, j11).hashCode();
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i12 * 53) + this.zzk.zzc(obj).hashCode();
        if (this.zzf) {
            this.zzl.zza(obj);
            throw null;
        }
        return hashCode;
    }

    @Override // com.google.android.libraries.places.internal.zzagr
    public final Object zzc() {
        return ((zzaey) this.zze).zzy();
    }

    @Override // com.google.android.libraries.places.internal.zzagr
    public final void zzd(Object obj) {
        if (zzG(obj)) {
            if (obj instanceof zzaey) {
                zzaey zzaeyVar = (zzaey) obj;
                zzaeyVar.zzJ(Integer.MAX_VALUE);
                zzaeyVar.zza = 0;
                zzaeyVar.zzH();
            }
            int length = this.zzc.length;
            for (int i11 = 0; i11 < length; i11 += 3) {
                int zzr = zzr(i11);
                long j11 = 1048575 & zzr;
                int zzq = zzq(zzr);
                if (zzq != 9) {
                    switch (zzq) {
                        case 17:
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
                            this.zzj.zza(obj, j11);
                            continue;
                        case 50:
                            Unsafe unsafe = zzb;
                            Object object = unsafe.getObject(obj, j11);
                            if (object != null) {
                                ((zzaga) object).zzb();
                                unsafe.putObject(obj, j11, object);
                            } else {
                                continue;
                            }
                        default:
                    }
                }
                if (zzD(obj, i11)) {
                    zzt(i11).zzd(zzb.getObject(obj, j11));
                }
            }
            this.zzk.zze(obj);
            if (this.zzf) {
                this.zzl.zzb(obj);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzagr
    public final void zze(Object obj, Object obj2) {
        if (zzG(obj)) {
            Objects.requireNonNull(obj2);
            for (int i11 = 0; i11 < this.zzc.length; i11 += 3) {
                int zzr = zzr(i11);
                long j11 = 1048575 & zzr;
                int i12 = this.zzc[i11];
                switch (zzq(zzr)) {
                    case 0:
                        if (zzD(obj2, i11)) {
                            zzahs.zzo(obj, j11, zzahs.zza(obj2, j11));
                            zzy(obj, i11);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzD(obj2, i11)) {
                            zzahs.zzp(obj, j11, zzahs.zzb(obj2, j11));
                            zzy(obj, i11);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzD(obj2, i11)) {
                            zzahs.zzr(obj, j11, zzahs.zzd(obj2, j11));
                            zzy(obj, i11);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzD(obj2, i11)) {
                            zzahs.zzr(obj, j11, zzahs.zzd(obj2, j11));
                            zzy(obj, i11);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzD(obj2, i11)) {
                            zzahs.zzq(obj, j11, zzahs.zzc(obj2, j11));
                            zzy(obj, i11);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzD(obj2, i11)) {
                            zzahs.zzr(obj, j11, zzahs.zzd(obj2, j11));
                            zzy(obj, i11);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzD(obj2, i11)) {
                            zzahs.zzq(obj, j11, zzahs.zzc(obj2, j11));
                            zzy(obj, i11);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzD(obj2, i11)) {
                            zzahs.zzm(obj, j11, zzahs.zzw(obj2, j11));
                            zzy(obj, i11);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzD(obj2, i11)) {
                            zzahs.zzs(obj, j11, zzahs.zzf(obj2, j11));
                            zzy(obj, i11);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        zzw(obj, obj2, i11);
                        break;
                    case 10:
                        if (zzD(obj2, i11)) {
                            zzahs.zzs(obj, j11, zzahs.zzf(obj2, j11));
                            zzy(obj, i11);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzD(obj2, i11)) {
                            zzahs.zzq(obj, j11, zzahs.zzc(obj2, j11));
                            zzy(obj, i11);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzD(obj2, i11)) {
                            zzahs.zzq(obj, j11, zzahs.zzc(obj2, j11));
                            zzy(obj, i11);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzD(obj2, i11)) {
                            zzahs.zzq(obj, j11, zzahs.zzc(obj2, j11));
                            zzy(obj, i11);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzD(obj2, i11)) {
                            zzahs.zzr(obj, j11, zzahs.zzd(obj2, j11));
                            zzy(obj, i11);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzD(obj2, i11)) {
                            zzahs.zzq(obj, j11, zzahs.zzc(obj2, j11));
                            zzy(obj, i11);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzD(obj2, i11)) {
                            zzahs.zzr(obj, j11, zzahs.zzd(obj2, j11));
                            zzy(obj, i11);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        zzw(obj, obj2, i11);
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
                        this.zzj.zzb(obj, obj2, j11);
                        break;
                    case 50:
                        zzagt.zzY(this.zzn, obj, obj2, j11);
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
                        if (zzH(obj2, i12, i11)) {
                            zzahs.zzs(obj, j11, zzahs.zzf(obj2, j11));
                            zzz(obj, i12, i11);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        zzx(obj, obj2, i11);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (zzH(obj2, i12, i11)) {
                            zzahs.zzs(obj, j11, zzahs.zzf(obj2, j11));
                            zzz(obj, i12, i11);
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        zzx(obj, obj2, i11);
                        break;
                }
            }
            zzagt.zzD(this.zzk, obj, obj2);
            if (this.zzf) {
                zzagt.zzC(this.zzl, obj, obj2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    @Override // com.google.android.libraries.places.internal.zzagr
    public final void zzf(Object obj, zzahz zzahzVar) {
        if (!this.zzg) {
            zzA(obj, zzahzVar);
        } else if (!this.zzf) {
            int length = this.zzc.length;
            for (int i11 = 0; i11 < length; i11 += 3) {
                int zzr = zzr(i11);
                int i12 = this.zzc[i11];
                switch (zzq(zzr)) {
                    case 0:
                        if (zzD(obj, i11)) {
                            zzahzVar.zzf(i12, zzahs.zza(obj, zzr & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzD(obj, i11)) {
                            zzahzVar.zzn(i12, zzahs.zzb(obj, zzr & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzD(obj, i11)) {
                            zzahzVar.zzs(i12, zzahs.zzd(obj, zzr & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzD(obj, i11)) {
                            zzahzVar.zzH(i12, zzahs.zzd(obj, zzr & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzD(obj, i11)) {
                            zzahzVar.zzq(i12, zzahs.zzc(obj, zzr & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzD(obj, i11)) {
                            zzahzVar.zzl(i12, zzahs.zzd(obj, zzr & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzD(obj, i11)) {
                            zzahzVar.zzj(i12, zzahs.zzc(obj, zzr & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzD(obj, i11)) {
                            zzahzVar.zzb(i12, zzahs.zzw(obj, zzr & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzD(obj, i11)) {
                            zzJ(i12, zzahs.zzf(obj, zzr & 1048575), zzahzVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zzD(obj, i11)) {
                            zzahzVar.zzu(i12, zzahs.zzf(obj, zzr & 1048575), zzt(i11));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzD(obj, i11)) {
                            zzahzVar.zzd(i12, (zzaed) zzahs.zzf(obj, zzr & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzD(obj, i11)) {
                            zzahzVar.zzF(i12, zzahs.zzc(obj, zzr & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzD(obj, i11)) {
                            zzahzVar.zzh(i12, zzahs.zzc(obj, zzr & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzD(obj, i11)) {
                            zzahzVar.zzv(i12, zzahs.zzc(obj, zzr & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzD(obj, i11)) {
                            zzahzVar.zzx(i12, zzahs.zzd(obj, zzr & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzD(obj, i11)) {
                            zzahzVar.zzz(i12, zzahs.zzc(obj, zzr & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzD(obj, i11)) {
                            zzahzVar.zzB(i12, zzahs.zzd(obj, zzr & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzD(obj, i11)) {
                            zzahzVar.zzp(i12, zzahs.zzf(obj, zzr & 1048575), zzt(i11));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzagt.zzH(i12, (List) zzahs.zzf(obj, zzr & 1048575), zzahzVar, false);
                        break;
                    case 19:
                        zzagt.zzL(i12, (List) zzahs.zzf(obj, zzr & 1048575), zzahzVar, false);
                        break;
                    case 20:
                        zzagt.zzO(i12, (List) zzahs.zzf(obj, zzr & 1048575), zzahzVar, false);
                        break;
                    case 21:
                        zzagt.zzW(i12, (List) zzahs.zzf(obj, zzr & 1048575), zzahzVar, false);
                        break;
                    case 22:
                        zzagt.zzN(i12, (List) zzahs.zzf(obj, zzr & 1048575), zzahzVar, false);
                        break;
                    case 23:
                        zzagt.zzK(i12, (List) zzahs.zzf(obj, zzr & 1048575), zzahzVar, false);
                        break;
                    case 24:
                        zzagt.zzJ(i12, (List) zzahs.zzf(obj, zzr & 1048575), zzahzVar, false);
                        break;
                    case 25:
                        zzagt.zzF(i12, (List) zzahs.zzf(obj, zzr & 1048575), zzahzVar, false);
                        break;
                    case 26:
                        zzagt.zzU(i12, (List) zzahs.zzf(obj, zzr & 1048575), zzahzVar);
                        break;
                    case 27:
                        zzagt.zzP(i12, (List) zzahs.zzf(obj, zzr & 1048575), zzahzVar, zzt(i11));
                        break;
                    case 28:
                        zzagt.zzG(i12, (List) zzahs.zzf(obj, zzr & 1048575), zzahzVar);
                        break;
                    case 29:
                        zzagt.zzV(i12, (List) zzahs.zzf(obj, zzr & 1048575), zzahzVar, false);
                        break;
                    case 30:
                        zzagt.zzI(i12, (List) zzahs.zzf(obj, zzr & 1048575), zzahzVar, false);
                        break;
                    case 31:
                        zzagt.zzQ(i12, (List) zzahs.zzf(obj, zzr & 1048575), zzahzVar, false);
                        break;
                    case 32:
                        zzagt.zzR(i12, (List) zzahs.zzf(obj, zzr & 1048575), zzahzVar, false);
                        break;
                    case 33:
                        zzagt.zzS(i12, (List) zzahs.zzf(obj, zzr & 1048575), zzahzVar, false);
                        break;
                    case 34:
                        zzagt.zzT(i12, (List) zzahs.zzf(obj, zzr & 1048575), zzahzVar, false);
                        break;
                    case 35:
                        zzagt.zzH(i12, (List) zzahs.zzf(obj, zzr & 1048575), zzahzVar, true);
                        break;
                    case 36:
                        zzagt.zzL(i12, (List) zzahs.zzf(obj, zzr & 1048575), zzahzVar, true);
                        break;
                    case 37:
                        zzagt.zzO(i12, (List) zzahs.zzf(obj, zzr & 1048575), zzahzVar, true);
                        break;
                    case 38:
                        zzagt.zzW(i12, (List) zzahs.zzf(obj, zzr & 1048575), zzahzVar, true);
                        break;
                    case 39:
                        zzagt.zzN(i12, (List) zzahs.zzf(obj, zzr & 1048575), zzahzVar, true);
                        break;
                    case 40:
                        zzagt.zzK(i12, (List) zzahs.zzf(obj, zzr & 1048575), zzahzVar, true);
                        break;
                    case 41:
                        zzagt.zzJ(i12, (List) zzahs.zzf(obj, zzr & 1048575), zzahzVar, true);
                        break;
                    case 42:
                        zzagt.zzF(i12, (List) zzahs.zzf(obj, zzr & 1048575), zzahzVar, true);
                        break;
                    case 43:
                        zzagt.zzV(i12, (List) zzahs.zzf(obj, zzr & 1048575), zzahzVar, true);
                        break;
                    case 44:
                        zzagt.zzI(i12, (List) zzahs.zzf(obj, zzr & 1048575), zzahzVar, true);
                        break;
                    case 45:
                        zzagt.zzQ(i12, (List) zzahs.zzf(obj, zzr & 1048575), zzahzVar, true);
                        break;
                    case 46:
                        zzagt.zzR(i12, (List) zzahs.zzf(obj, zzr & 1048575), zzahzVar, true);
                        break;
                    case 47:
                        zzagt.zzS(i12, (List) zzahs.zzf(obj, zzr & 1048575), zzahzVar, true);
                        break;
                    case 48:
                        zzagt.zzT(i12, (List) zzahs.zzf(obj, zzr & 1048575), zzahzVar, true);
                        break;
                    case 49:
                        zzagt.zzM(i12, (List) zzahs.zzf(obj, zzr & 1048575), zzahzVar, zzt(i11));
                        break;
                    case 50:
                        zzB(zzahzVar, i12, zzahs.zzf(obj, zzr & 1048575), i11);
                        break;
                    case 51:
                        if (zzH(obj, i12, i11)) {
                            zzahzVar.zzf(i12, zzk(obj, zzr & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzH(obj, i12, i11)) {
                            zzahzVar.zzn(i12, zzl(obj, zzr & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzH(obj, i12, i11)) {
                            zzahzVar.zzs(i12, zzs(obj, zzr & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzH(obj, i12, i11)) {
                            zzahzVar.zzH(i12, zzs(obj, zzr & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzH(obj, i12, i11)) {
                            zzahzVar.zzq(i12, zzo(obj, zzr & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzH(obj, i12, i11)) {
                            zzahzVar.zzl(i12, zzs(obj, zzr & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzH(obj, i12, i11)) {
                            zzahzVar.zzj(i12, zzo(obj, zzr & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzH(obj, i12, i11)) {
                            zzahzVar.zzb(i12, zzI(obj, zzr & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzH(obj, i12, i11)) {
                            zzJ(i12, zzahs.zzf(obj, zzr & 1048575), zzahzVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (zzH(obj, i12, i11)) {
                            zzahzVar.zzu(i12, zzahs.zzf(obj, zzr & 1048575), zzt(i11));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzH(obj, i12, i11)) {
                            zzahzVar.zzd(i12, (zzaed) zzahs.zzf(obj, zzr & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzH(obj, i12, i11)) {
                            zzahzVar.zzF(i12, zzo(obj, zzr & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzH(obj, i12, i11)) {
                            zzahzVar.zzh(i12, zzo(obj, zzr & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzH(obj, i12, i11)) {
                            zzahzVar.zzv(i12, zzo(obj, zzr & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzH(obj, i12, i11)) {
                            zzahzVar.zzx(i12, zzs(obj, zzr & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzH(obj, i12, i11)) {
                            zzahzVar.zzz(i12, zzo(obj, zzr & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzH(obj, i12, i11)) {
                            zzahzVar.zzB(i12, zzs(obj, zzr & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzH(obj, i12, i11)) {
                            zzahzVar.zzp(i12, zzahs.zzf(obj, zzr & 1048575), zzt(i11));
                            break;
                        } else {
                            break;
                        }
                }
            }
            zzahi zzahiVar = this.zzk;
            zzahiVar.zzg(zzahiVar.zzc(obj), zzahzVar);
        } else {
            this.zzl.zza(obj);
            throw null;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzagr
    public final boolean zzg(Object obj, Object obj2) {
        boolean zzX;
        int length = this.zzc.length;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int zzr = zzr(i11);
            long j11 = zzr & 1048575;
            switch (zzq(zzr)) {
                case 0:
                    if (zzC(obj, obj2, i11) && Double.doubleToLongBits(zzahs.zza(obj, j11)) == Double.doubleToLongBits(zzahs.zza(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzC(obj, obj2, i11) && Float.floatToIntBits(zzahs.zzb(obj, j11)) == Float.floatToIntBits(zzahs.zzb(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzC(obj, obj2, i11) && zzahs.zzd(obj, j11) == zzahs.zzd(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzC(obj, obj2, i11) && zzahs.zzd(obj, j11) == zzahs.zzd(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzC(obj, obj2, i11) && zzahs.zzc(obj, j11) == zzahs.zzc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzC(obj, obj2, i11) && zzahs.zzd(obj, j11) == zzahs.zzd(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzC(obj, obj2, i11) && zzahs.zzc(obj, j11) == zzahs.zzc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzC(obj, obj2, i11) && zzahs.zzw(obj, j11) == zzahs.zzw(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzC(obj, obj2, i11) && zzagt.zzX(zzahs.zzf(obj, j11), zzahs.zzf(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzC(obj, obj2, i11) && zzagt.zzX(zzahs.zzf(obj, j11), zzahs.zzf(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzC(obj, obj2, i11) && zzagt.zzX(zzahs.zzf(obj, j11), zzahs.zzf(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzC(obj, obj2, i11) && zzahs.zzc(obj, j11) == zzahs.zzc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzC(obj, obj2, i11) && zzahs.zzc(obj, j11) == zzahs.zzc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzC(obj, obj2, i11) && zzahs.zzc(obj, j11) == zzahs.zzc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzC(obj, obj2, i11) && zzahs.zzd(obj, j11) == zzahs.zzd(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzC(obj, obj2, i11) && zzahs.zzc(obj, j11) == zzahs.zzc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzC(obj, obj2, i11) && zzahs.zzd(obj, j11) == zzahs.zzd(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzC(obj, obj2, i11) && zzagt.zzX(zzahs.zzf(obj, j11), zzahs.zzf(obj2, j11))) {
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
                    zzX = zzagt.zzX(zzahs.zzf(obj, j11), zzahs.zzf(obj2, j11));
                    break;
                case 50:
                    zzX = zzagt.zzX(zzahs.zzf(obj, j11), zzahs.zzf(obj2, j11));
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
                    long zzp = zzp(i11) & 1048575;
                    if (zzahs.zzc(obj, zzp) == zzahs.zzc(obj2, zzp) && zzagt.zzX(zzahs.zzf(obj, j11), zzahs.zzf(obj2, j11))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzX) {
                return false;
            }
        }
        if (this.zzk.zzc(obj).equals(this.zzk.zzc(obj2))) {
            if (this.zzf) {
                this.zzl.zza(obj);
                this.zzl.zza(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzagr
    public final boolean zzh(Object obj) {
        int i11;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.zzi) {
            int i16 = this.zzh[i15];
            int i17 = this.zzc[i16];
            int zzr = zzr(i16);
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
            if ((268435456 & zzr) != 0 && !zzE(obj, i16, i11, i12, i21)) {
                return false;
            }
            int zzq = zzq(zzr);
            if (zzq != 9 && zzq != 17) {
                if (zzq != 27) {
                    if (zzq == 60 || zzq == 68) {
                        if (zzH(obj, i17, i16) && !zzF(obj, zzr, zzt(i16))) {
                            return false;
                        }
                    } else if (zzq != 49) {
                        if (zzq == 50 && !((zzaga) zzahs.zzf(obj, zzr & 1048575)).isEmpty()) {
                            zzafz zzafzVar = (zzafz) zzu(i16);
                            throw null;
                        }
                    }
                }
                List list = (List) zzahs.zzf(obj, zzr & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzagr zzt = zzt(i16);
                    for (int i22 = 0; i22 < list.size(); i22++) {
                        if (!zzt.zzh(list.get(i22))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzE(obj, i16, i11, i12, i21) && !zzF(obj, zzr, zzt(i16))) {
                return false;
            }
            i15++;
            i13 = i11;
            i14 = i12;
        }
        if (this.zzf) {
            this.zzl.zza(obj);
            throw null;
        }
        return true;
    }
}