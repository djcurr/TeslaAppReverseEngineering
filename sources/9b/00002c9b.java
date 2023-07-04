package com.google.android.gms.internal.vision;

import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zziw {
    private static final zziy zzabt;

    static {
        zziy zzizVar;
        if ((zziu.zzhh() && zziu.zzhi()) && !zzeg.zzck()) {
            zzizVar = new zzjb();
        } else {
            zzizVar = new zziz();
        }
        zzabt = zzizVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(CharSequence charSequence) {
        int length = charSequence.length();
        int i11 = 0;
        int i12 = 0;
        while (i12 < length && charSequence.charAt(i12) < 128) {
            i12++;
        }
        int i13 = length;
        while (true) {
            if (i12 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i12);
            if (charAt < 2048) {
                i13 += (127 - charAt) >>> 31;
                i12++;
            } else {
                int length2 = charSequence.length();
                while (i12 < length2) {
                    char charAt2 = charSequence.charAt(i12);
                    if (charAt2 < 2048) {
                        i11 += (127 - charAt2) >>> 31;
                    } else {
                        i11 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i12) < 65536) {
                                throw new zzja(i12, length2);
                            }
                            i12++;
                        }
                    }
                    i12++;
                }
                i13 += i11;
            }
        }
        if (i13 >= length) {
            return i13;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(i13 + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzbr(int i11) {
        if (i11 > -12) {
            return -1;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzc(int i11, int i12, int i13) {
        if (i11 > -12 || i12 > -65 || i13 > -65) {
            return -1;
        }
        return (i11 ^ (i12 << 8)) ^ (i13 << 16);
    }

    public static boolean zzg(byte[] bArr, int i11, int i12) {
        return zzabt.zzg(bArr, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzh(byte[] bArr, int i11, int i12) {
        byte b11 = bArr[i11 - 1];
        int i13 = i12 - i11;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    return zzc(b11, bArr[i11], bArr[i11 + 1]);
                }
                throw new AssertionError();
            }
            return zzt(b11, bArr[i11]);
        }
        return zzbr(b11);
    }

    public static boolean zzi(byte[] bArr) {
        return zzabt.zzg(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzt(int i11, int i12) {
        if (i11 > -12 || i12 > -65) {
            return -1;
        }
        return i11 ^ (i12 << 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzi(byte[] bArr, int i11, int i12) {
        return zzabt.zzi(bArr, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(CharSequence charSequence, byte[] bArr, int i11, int i12) {
        return zzabt.zzb(charSequence, bArr, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(CharSequence charSequence, ByteBuffer byteBuffer) {
        zziy zziyVar = zzabt;
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(zza(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else if (byteBuffer.isDirect()) {
            zziyVar.zzb(charSequence, byteBuffer);
        } else {
            zziy.zzc(charSequence, byteBuffer);
        }
    }
}