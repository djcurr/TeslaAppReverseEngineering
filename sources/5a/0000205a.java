package com.google.android.gms.internal.clearcut;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzax {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i11, byte[] bArr, int i12, int i13, zzay zzayVar) {
        if ((i11 >>> 3) != 0) {
            int i14 = i11 & 7;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 == 5) {
                                return i12 + 4;
                            }
                            throw zzco.zzbm();
                        }
                        int i15 = (i11 & (-8)) | 4;
                        int i16 = 0;
                        while (i12 < i13) {
                            i12 = zza(bArr, i12, zzayVar);
                            i16 = zzayVar.zzfd;
                            if (i16 == i15) {
                                break;
                            }
                            i12 = zza(i16, bArr, i12, i13, zzayVar);
                        }
                        if (i12 > i13 || i16 != i15) {
                            throw zzco.zzbo();
                        }
                        return i12;
                    }
                    return zza(bArr, i12, zzayVar) + zzayVar.zzfd;
                }
                return i12 + 8;
            }
            return zzb(bArr, i12, zzayVar);
        }
        throw zzco.zzbm();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i11, byte[] bArr, int i12, int i13, zzcn<?> zzcnVar, zzay zzayVar) {
        zzch zzchVar = (zzch) zzcnVar;
        int zza = zza(bArr, i12, zzayVar);
        while (true) {
            zzchVar.zzac(zzayVar.zzfd);
            if (zza >= i13) {
                break;
            }
            int zza2 = zza(bArr, zza, zzayVar);
            if (i11 != zzayVar.zzfd) {
                break;
            }
            zza = zza(bArr, zza2, zzayVar);
        }
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i11, byte[] bArr, int i12, int i13, zzey zzeyVar, zzay zzayVar) {
        if ((i11 >>> 3) != 0) {
            int i14 = i11 & 7;
            if (i14 == 0) {
                int zzb = zzb(bArr, i12, zzayVar);
                zzeyVar.zzb(i11, Long.valueOf(zzayVar.zzfe));
                return zzb;
            } else if (i14 == 1) {
                zzeyVar.zzb(i11, Long.valueOf(zzd(bArr, i12)));
                return i12 + 8;
            } else if (i14 == 2) {
                int zza = zza(bArr, i12, zzayVar);
                int i15 = zzayVar.zzfd;
                zzeyVar.zzb(i11, i15 == 0 ? zzbb.zzfi : zzbb.zzb(bArr, zza, i15));
                return zza + i15;
            } else if (i14 != 3) {
                if (i14 == 5) {
                    zzeyVar.zzb(i11, Integer.valueOf(zzc(bArr, i12)));
                    return i12 + 4;
                }
                throw zzco.zzbm();
            } else {
                zzey zzeb = zzey.zzeb();
                int i16 = (i11 & (-8)) | 4;
                int i17 = 0;
                while (true) {
                    if (i12 >= i13) {
                        break;
                    }
                    int zza2 = zza(bArr, i12, zzayVar);
                    int i18 = zzayVar.zzfd;
                    i17 = i18;
                    if (i18 == i16) {
                        i12 = zza2;
                        break;
                    }
                    int zza3 = zza(i17, bArr, zza2, i13, zzeb, zzayVar);
                    i17 = i18;
                    i12 = zza3;
                }
                if (i12 > i13 || i17 != i16) {
                    throw zzco.zzbo();
                }
                zzeyVar.zzb(i11, zzeb);
                return i12;
            }
        }
        throw zzco.zzbm();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i11, byte[] bArr, int i12, zzay zzayVar) {
        int i13;
        int i14;
        int i15 = i11 & 127;
        int i16 = i12 + 1;
        byte b11 = bArr[i12];
        if (b11 < 0) {
            int i17 = i15 | ((b11 & Byte.MAX_VALUE) << 7);
            int i18 = i16 + 1;
            byte b12 = bArr[i16];
            if (b12 >= 0) {
                i13 = b12 << 14;
            } else {
                i15 = i17 | ((b12 & Byte.MAX_VALUE) << 14);
                i16 = i18 + 1;
                byte b13 = bArr[i18];
                if (b13 >= 0) {
                    i14 = b13 << 21;
                } else {
                    i17 = i15 | ((b13 & Byte.MAX_VALUE) << 21);
                    i18 = i16 + 1;
                    byte b14 = bArr[i16];
                    if (b14 >= 0) {
                        i13 = b14 << 28;
                    } else {
                        int i19 = i17 | ((b14 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i21 = i18 + 1;
                            if (bArr[i18] >= 0) {
                                zzayVar.zzfd = i19;
                                return i21;
                            }
                            i18 = i21;
                        }
                    }
                }
            }
            zzayVar.zzfd = i17 | i13;
            return i18;
        }
        i14 = b11 << 7;
        zzayVar.zzfd = i15 | i14;
        return i16;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i11, zzay zzayVar) {
        int i12 = i11 + 1;
        byte b11 = bArr[i11];
        if (b11 >= 0) {
            zzayVar.zzfd = b11;
            return i12;
        }
        return zza(b11, bArr, i12, zzayVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i11, zzcn<?> zzcnVar, zzay zzayVar) {
        zzch zzchVar = (zzch) zzcnVar;
        int zza = zza(bArr, i11, zzayVar);
        int i12 = zzayVar.zzfd + zza;
        while (zza < i12) {
            zza = zza(bArr, zza, zzayVar);
            zzchVar.zzac(zzayVar.zzfd);
        }
        if (zza == i12) {
            return zza;
        }
        throw zzco.zzbl();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(byte[] bArr, int i11, zzay zzayVar) {
        byte b11;
        int i12 = i11 + 1;
        long j11 = bArr[i11];
        if (j11 >= 0) {
            zzayVar.zzfe = j11;
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
        zzayVar.zzfe = j12;
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(byte[] bArr, int i11) {
        return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(byte[] bArr, int i11, zzay zzayVar) {
        int zza = zza(bArr, i11, zzayVar);
        int i12 = zzayVar.zzfd;
        if (i12 == 0) {
            zzayVar.zzff = "";
            return zza;
        }
        zzayVar.zzff = new String(bArr, zza, i12, zzci.UTF_8);
        return zza + i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(byte[] bArr, int i11, zzay zzayVar) {
        int zza = zza(bArr, i11, zzayVar);
        int i12 = zzayVar.zzfd;
        if (i12 == 0) {
            zzayVar.zzff = "";
            return zza;
        }
        int i13 = zza + i12;
        if (zzff.zze(bArr, zza, i13)) {
            zzayVar.zzff = new String(bArr, zza, i12, zzci.UTF_8);
            return i13;
        }
        throw zzco.zzbp();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzd(byte[] bArr, int i11) {
        return ((bArr[i11 + 7] & 255) << 56) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double zze(byte[] bArr, int i11) {
        return Double.longBitsToDouble(zzd(bArr, i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(byte[] bArr, int i11, zzay zzayVar) {
        int zza = zza(bArr, i11, zzayVar);
        int i12 = zzayVar.zzfd;
        if (i12 == 0) {
            zzayVar.zzff = zzbb.zzfi;
            return zza;
        }
        zzayVar.zzff = zzbb.zzb(bArr, zza, i12);
        return zza + i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float zzf(byte[] bArr, int i11) {
        return Float.intBitsToFloat(zzc(bArr, i11));
    }
}