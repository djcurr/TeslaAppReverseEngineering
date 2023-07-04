package com.google.android.gms.internal.vision;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzeh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i11, zzei zzeiVar) {
        int i12 = i11 + 1;
        byte b11 = bArr[i11];
        if (b11 >= 0) {
            zzeiVar.zzro = b11;
            return i12;
        }
        return zza(b11, bArr, i12, zzeiVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(byte[] bArr, int i11, zzei zzeiVar) {
        byte b11;
        int i12 = i11 + 1;
        long j11 = bArr[i11];
        if (j11 >= 0) {
            zzeiVar.zzrp = j11;
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
        zzeiVar.zzrp = j12;
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double zzc(byte[] bArr, int i11) {
        return Double.longBitsToDouble(zzb(bArr, i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float zzd(byte[] bArr, int i11) {
        return Float.intBitsToFloat(zza(bArr, i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(byte[] bArr, int i11, zzei zzeiVar) {
        int zza = zza(bArr, i11, zzeiVar);
        int i12 = zzeiVar.zzro;
        if (i12 >= 0) {
            if (i12 <= bArr.length - zza) {
                if (i12 == 0) {
                    zzeiVar.zzrq = zzeo.zzrx;
                    return zza;
                }
                zzeiVar.zzrq = zzeo.zzb(bArr, zza, i12);
                return zza + i12;
            }
            throw zzgf.zzfh();
        }
        throw zzgf.zzfi();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(byte[] bArr, int i11, zzei zzeiVar) {
        int zza = zza(bArr, i11, zzeiVar);
        int i12 = zzeiVar.zzro;
        if (i12 >= 0) {
            if (i12 == 0) {
                zzeiVar.zzrq = "";
                return zza;
            }
            zzeiVar.zzrq = new String(bArr, zza, i12, zzga.UTF_8);
            return zza + i12;
        }
        throw zzgf.zzfi();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(byte[] bArr, int i11, zzei zzeiVar) {
        int zza = zza(bArr, i11, zzeiVar);
        int i12 = zzeiVar.zzro;
        if (i12 >= 0) {
            if (i12 == 0) {
                zzeiVar.zzrq = "";
                return zza;
            }
            zzeiVar.zzrq = zziw.zzi(bArr, zza, i12);
            return zza + i12;
        }
        throw zzgf.zzfi();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i11, byte[] bArr, int i12, zzei zzeiVar) {
        int i13 = i11 & 127;
        int i14 = i12 + 1;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzeiVar.zzro = i13 | (b11 << 7);
            return i14;
        }
        int i15 = i13 | ((b11 & Byte.MAX_VALUE) << 7);
        int i16 = i14 + 1;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            zzeiVar.zzro = i15 | (b12 << 14);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 14);
        int i18 = i16 + 1;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            zzeiVar.zzro = i17 | (b13 << 21);
            return i18;
        }
        int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 21);
        int i21 = i18 + 1;
        byte b14 = bArr[i18];
        if (b14 >= 0) {
            zzeiVar.zzro = i19 | (b14 << 28);
            return i21;
        }
        int i22 = i19 | ((b14 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i23 = i21 + 1;
            if (bArr[i21] >= 0) {
                zzeiVar.zzro = i22;
                return i23;
            }
            i21 = i23;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzb(byte[] bArr, int i11) {
        return ((bArr[i11 + 7] & 255) << 56) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i11) {
        return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i11, byte[] bArr, int i12, int i13, zzge<?> zzgeVar, zzei zzeiVar) {
        zzfz zzfzVar = (zzfz) zzgeVar;
        int zza = zza(bArr, i12, zzeiVar);
        zzfzVar.zzbg(zzeiVar.zzro);
        while (zza < i13) {
            int zza2 = zza(bArr, zza, zzeiVar);
            if (i11 != zzeiVar.zzro) {
                break;
            }
            zza = zza(bArr, zza2, zzeiVar);
            zzfzVar.zzbg(zzeiVar.zzro);
        }
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i11, zzge<?> zzgeVar, zzei zzeiVar) {
        zzfz zzfzVar = (zzfz) zzgeVar;
        int zza = zza(bArr, i11, zzeiVar);
        int i12 = zzeiVar.zzro + zza;
        while (zza < i12) {
            zza = zza(bArr, zza, zzeiVar);
            zzfzVar.zzbg(zzeiVar.zzro);
        }
        if (zza == i12) {
            return zza;
        }
        throw zzgf.zzfh();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i11, byte[] bArr, int i12, int i13, zzip zzipVar, zzei zzeiVar) {
        if ((i11 >>> 3) != 0) {
            int i14 = i11 & 7;
            if (i14 == 0) {
                int zzb = zzb(bArr, i12, zzeiVar);
                zzipVar.zzb(i11, Long.valueOf(zzeiVar.zzrp));
                return zzb;
            } else if (i14 == 1) {
                zzipVar.zzb(i11, Long.valueOf(zzb(bArr, i12)));
                return i12 + 8;
            } else if (i14 == 2) {
                int zza = zza(bArr, i12, zzeiVar);
                int i15 = zzeiVar.zzro;
                if (i15 >= 0) {
                    if (i15 <= bArr.length - zza) {
                        if (i15 == 0) {
                            zzipVar.zzb(i11, zzeo.zzrx);
                        } else {
                            zzipVar.zzb(i11, zzeo.zzb(bArr, zza, i15));
                        }
                        return zza + i15;
                    }
                    throw zzgf.zzfh();
                }
                throw zzgf.zzfi();
            } else if (i14 != 3) {
                if (i14 == 5) {
                    zzipVar.zzb(i11, Integer.valueOf(zza(bArr, i12)));
                    return i12 + 4;
                }
                throw zzgf.zzfk();
            } else {
                zzip zzhf = zzip.zzhf();
                int i16 = (i11 & (-8)) | 4;
                int i17 = 0;
                while (true) {
                    if (i12 >= i13) {
                        break;
                    }
                    int zza2 = zza(bArr, i12, zzeiVar);
                    int i18 = zzeiVar.zzro;
                    i17 = i18;
                    if (i18 == i16) {
                        i12 = zza2;
                        break;
                    }
                    int zza3 = zza(i17, bArr, zza2, i13, zzhf, zzeiVar);
                    i17 = i18;
                    i12 = zza3;
                }
                if (i12 <= i13 && i17 == i16) {
                    zzipVar.zzb(i11, zzhf);
                    return i12;
                }
                throw zzgf.zzfo();
            }
        }
        throw zzgf.zzfk();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i11, byte[] bArr, int i12, int i13, zzei zzeiVar) {
        if ((i11 >>> 3) != 0) {
            int i14 = i11 & 7;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 == 5) {
                                return i12 + 4;
                            }
                            throw zzgf.zzfk();
                        }
                        int i15 = (i11 & (-8)) | 4;
                        int i16 = 0;
                        while (i12 < i13) {
                            i12 = zza(bArr, i12, zzeiVar);
                            i16 = zzeiVar.zzro;
                            if (i16 == i15) {
                                break;
                            }
                            i12 = zza(i16, bArr, i12, i13, zzeiVar);
                        }
                        if (i12 > i13 || i16 != i15) {
                            throw zzgf.zzfo();
                        }
                        return i12;
                    }
                    return zza(bArr, i12, zzeiVar) + zzeiVar.zzro;
                }
                return i12 + 8;
            }
            return zzb(bArr, i12, zzeiVar);
        }
        throw zzgf.zzfk();
    }
}