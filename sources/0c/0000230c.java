package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzil {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i11, zzik zzikVar) {
        int zzj = zzj(bArr, i11, zzikVar);
        int i12 = zzikVar.zza;
        if (i12 >= 0) {
            if (i12 <= bArr.length - zzj) {
                if (i12 == 0) {
                    zzikVar.zzc = zziy.zzb;
                    return zzj;
                }
                zzikVar.zzc = zziy.zzl(bArr, zzj, i12);
                return zzj + i12;
            }
            throw zzkj.zzf();
        }
        throw zzkj.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(byte[] bArr, int i11) {
        return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(zzlr zzlrVar, byte[] bArr, int i11, int i12, int i13, zzik zzikVar) {
        zzlj zzljVar = (zzlj) zzlrVar;
        Object zze = zzljVar.zze();
        int zzc = zzljVar.zzc(zze, bArr, i11, i12, i13, zzikVar);
        zzljVar.zzf(zze);
        zzikVar.zzc = zze;
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(zzlr zzlrVar, byte[] bArr, int i11, int i12, zzik zzikVar) {
        int i13 = i11 + 1;
        int i14 = bArr[i11];
        if (i14 < 0) {
            i13 = zzk(i14, bArr, i13, zzikVar);
            i14 = zzikVar.zza;
        }
        int i15 = i13;
        if (i14 >= 0 && i14 <= i12 - i15) {
            Object zze = zzlrVar.zze();
            int i16 = i14 + i15;
            zzlrVar.zzh(zze, bArr, i15, i16, zzikVar);
            zzlrVar.zzf(zze);
            zzikVar.zzc = zze;
            return i16;
        }
        throw zzkj.zzf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(zzlr zzlrVar, int i11, byte[] bArr, int i12, int i13, zzkg zzkgVar, zzik zzikVar) {
        int zzd = zzd(zzlrVar, bArr, i12, i13, zzikVar);
        zzkgVar.add(zzikVar.zzc);
        while (zzd < i13) {
            int zzj = zzj(bArr, zzd, zzikVar);
            if (i11 != zzikVar.zza) {
                break;
            }
            zzd = zzd(zzlrVar, bArr, zzj, i13, zzikVar);
            zzkgVar.add(zzikVar.zzc);
        }
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(byte[] bArr, int i11, zzkg zzkgVar, zzik zzikVar) {
        zzka zzkaVar = (zzka) zzkgVar;
        int zzj = zzj(bArr, i11, zzikVar);
        int i12 = zzikVar.zza + zzj;
        while (zzj < i12) {
            zzj = zzj(bArr, zzj, zzikVar);
            zzkaVar.zzh(zzikVar.zza);
        }
        if (zzj == i12) {
            return zzj;
        }
        throw zzkj.zzf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(byte[] bArr, int i11, zzik zzikVar) {
        int zzj = zzj(bArr, i11, zzikVar);
        int i12 = zzikVar.zza;
        if (i12 >= 0) {
            if (i12 == 0) {
                zzikVar.zzc = "";
                return zzj;
            }
            zzikVar.zzc = new String(bArr, zzj, i12, zzkh.zzb);
            return zzj + i12;
        }
        throw zzkj.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(byte[] bArr, int i11, zzik zzikVar) {
        int zzj = zzj(bArr, i11, zzikVar);
        int i12 = zzikVar.zza;
        if (i12 >= 0) {
            if (i12 == 0) {
                zzikVar.zzc = "";
                return zzj;
            }
            zzikVar.zzc = zzmx.zzd(bArr, zzj, i12);
            return zzj + i12;
        }
        throw zzkj.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(int i11, byte[] bArr, int i12, int i13, zzmj zzmjVar, zzik zzikVar) {
        if ((i11 >>> 3) != 0) {
            int i14 = i11 & 7;
            if (i14 == 0) {
                int zzm = zzm(bArr, i12, zzikVar);
                zzmjVar.zzh(i11, Long.valueOf(zzikVar.zzb));
                return zzm;
            } else if (i14 == 1) {
                zzmjVar.zzh(i11, Long.valueOf(zzn(bArr, i12)));
                return i12 + 8;
            } else if (i14 == 2) {
                int zzj = zzj(bArr, i12, zzikVar);
                int i15 = zzikVar.zza;
                if (i15 >= 0) {
                    if (i15 <= bArr.length - zzj) {
                        if (i15 == 0) {
                            zzmjVar.zzh(i11, zziy.zzb);
                        } else {
                            zzmjVar.zzh(i11, zziy.zzl(bArr, zzj, i15));
                        }
                        return zzj + i15;
                    }
                    throw zzkj.zzf();
                }
                throw zzkj.zzd();
            } else if (i14 != 3) {
                if (i14 == 5) {
                    zzmjVar.zzh(i11, Integer.valueOf(zzb(bArr, i12)));
                    return i12 + 4;
                }
                throw zzkj.zzb();
            } else {
                int i16 = (i11 & (-8)) | 4;
                zzmj zze = zzmj.zze();
                int i17 = 0;
                while (true) {
                    if (i12 >= i13) {
                        break;
                    }
                    int zzj2 = zzj(bArr, i12, zzikVar);
                    int i18 = zzikVar.zza;
                    if (i18 == i16) {
                        i17 = i18;
                        i12 = zzj2;
                        break;
                    }
                    i17 = i18;
                    i12 = zzi(i18, bArr, zzj2, i13, zze, zzikVar);
                }
                if (i12 <= i13 && i17 == i16) {
                    zzmjVar.zzh(i11, zze);
                    return i12;
                }
                throw zzkj.zze();
            }
        }
        throw zzkj.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(byte[] bArr, int i11, zzik zzikVar) {
        int i12 = i11 + 1;
        byte b11 = bArr[i11];
        if (b11 >= 0) {
            zzikVar.zza = b11;
            return i12;
        }
        return zzk(b11, bArr, i12, zzikVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzk(int i11, byte[] bArr, int i12, zzik zzikVar) {
        int i13 = i11 & 127;
        int i14 = i12 + 1;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzikVar.zza = i13 | (b11 << 7);
            return i14;
        }
        int i15 = i13 | ((b11 & Byte.MAX_VALUE) << 7);
        int i16 = i14 + 1;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            zzikVar.zza = i15 | (b12 << 14);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 14);
        int i18 = i16 + 1;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            zzikVar.zza = i17 | (b13 << 21);
            return i18;
        }
        int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 21);
        int i21 = i18 + 1;
        byte b14 = bArr[i18];
        if (b14 >= 0) {
            zzikVar.zza = i19 | (b14 << 28);
            return i21;
        }
        int i22 = i19 | ((b14 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i23 = i21 + 1;
            if (bArr[i21] >= 0) {
                zzikVar.zza = i22;
                return i23;
            }
            i21 = i23;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzl(int i11, byte[] bArr, int i12, int i13, zzkg zzkgVar, zzik zzikVar) {
        zzka zzkaVar = (zzka) zzkgVar;
        int zzj = zzj(bArr, i12, zzikVar);
        zzkaVar.zzh(zzikVar.zza);
        while (zzj < i13) {
            int zzj2 = zzj(bArr, zzj, zzikVar);
            if (i11 != zzikVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzikVar);
            zzkaVar.zzh(zzikVar.zza);
        }
        return zzj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzm(byte[] bArr, int i11, zzik zzikVar) {
        byte b11;
        int i12 = i11 + 1;
        long j11 = bArr[i11];
        if (j11 >= 0) {
            zzikVar.zzb = j11;
            return i12;
        }
        int i13 = i12 + 1;
        byte b12 = bArr[i12];
        long j12 = (j11 & 127) | ((b12 & Byte.MAX_VALUE) << 7);
        int i14 = 7;
        while (b12 < 0) {
            int i15 = i13 + 1;
            i14 += 7;
            j12 |= (b11 & Byte.MAX_VALUE) << i14;
            b12 = bArr[i13];
            i13 = i15;
        }
        zzikVar.zzb = j12;
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzn(byte[] bArr, int i11) {
        return ((bArr[i11 + 7] & 255) << 56) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48);
    }
}