package com.google.android.gms.internal.vision;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class zzjb extends zziy {
    private static int zza(byte[] bArr, int i11, long j11, int i12) {
        int zzbr;
        int zzt;
        int zzc;
        if (i12 == 0) {
            zzbr = zziw.zzbr(i11);
            return zzbr;
        } else if (i12 == 1) {
            zzt = zziw.zzt(i11, zziu.zza(bArr, j11));
            return zzt;
        } else if (i12 == 2) {
            zzc = zziw.zzc(i11, zziu.zza(bArr, j11), zziu.zza(bArr, j11 + 1));
            return zzc;
        } else {
            throw new AssertionError();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ba, code lost:
        return -1;
     */
    @Override // com.google.android.gms.internal.vision.zziy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int zzb(int r18, byte[] r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzjb.zzb(int, byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.vision.zziy
    public final String zzi(byte[] bArr, int i11, int i12) {
        boolean zzd;
        boolean zzd2;
        boolean zze;
        boolean zzf;
        boolean zzd3;
        if ((i11 | i12 | ((bArr.length - i11) - i12)) >= 0) {
            int i13 = i11 + i12;
            char[] cArr = new char[i12];
            int i14 = 0;
            while (i11 < i13) {
                byte zza = zziu.zza(bArr, i11);
                zzd3 = zzix.zzd(zza);
                if (!zzd3) {
                    break;
                }
                i11++;
                zzix.zza(zza, cArr, i14);
                i14++;
            }
            int i15 = i14;
            while (i11 < i13) {
                int i16 = i11 + 1;
                byte zza2 = zziu.zza(bArr, i11);
                zzd = zzix.zzd(zza2);
                if (zzd) {
                    int i17 = i15 + 1;
                    zzix.zza(zza2, cArr, i15);
                    while (i16 < i13) {
                        byte zza3 = zziu.zza(bArr, i16);
                        zzd2 = zzix.zzd(zza3);
                        if (!zzd2) {
                            break;
                        }
                        i16++;
                        zzix.zza(zza3, cArr, i17);
                        i17++;
                    }
                    i11 = i16;
                    i15 = i17;
                } else {
                    zze = zzix.zze(zza2);
                    if (!zze) {
                        zzf = zzix.zzf(zza2);
                        if (zzf) {
                            if (i16 < i13 - 1) {
                                int i18 = i16 + 1;
                                zzix.zza(zza2, zziu.zza(bArr, i16), zziu.zza(bArr, i18), cArr, i15);
                                i11 = i18 + 1;
                                i15++;
                            } else {
                                throw zzgf.zzfp();
                            }
                        } else if (i16 < i13 - 2) {
                            int i19 = i16 + 1;
                            int i21 = i19 + 1;
                            zzix.zza(zza2, zziu.zza(bArr, i16), zziu.zza(bArr, i19), zziu.zza(bArr, i21), cArr, i15);
                            i11 = i21 + 1;
                            i15 = i15 + 1 + 1;
                        } else {
                            throw zzgf.zzfp();
                        }
                    } else if (i16 < i13) {
                        zzix.zza(zza2, zziu.zza(bArr, i16), cArr, i15);
                        i11 = i16 + 1;
                        i15++;
                    } else {
                        throw zzgf.zzfp();
                    }
                }
            }
            return new String(cArr, 0, i15);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.vision.zziy
    public final int zzb(CharSequence charSequence, byte[] bArr, int i11, int i12) {
        char c11;
        long j11;
        long j12;
        long j13;
        char c12;
        int i13;
        char charAt;
        long j14 = i11;
        long j15 = i12 + j14;
        int length = charSequence.length();
        if (length > i12 || bArr.length - i12 < i11) {
            char charAt2 = charSequence.charAt(length - 1);
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("Failed writing ");
            sb2.append(charAt2);
            sb2.append(" at index ");
            sb2.append(i11 + i12);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        int i14 = 0;
        while (true) {
            c11 = 128;
            j11 = 1;
            if (i14 >= length || (charAt = charSequence.charAt(i14)) >= 128) {
                break;
            }
            zziu.zza(bArr, j14, (byte) charAt);
            i14++;
            j14 = 1 + j14;
        }
        if (i14 == length) {
            return (int) j14;
        }
        while (i14 < length) {
            char charAt3 = charSequence.charAt(i14);
            if (charAt3 < c11 && j14 < j15) {
                long j16 = j14 + j11;
                zziu.zza(bArr, j14, (byte) charAt3);
                j13 = j11;
                j12 = j16;
                c12 = c11;
            } else if (charAt3 < 2048 && j14 <= j15 - 2) {
                long j17 = j14 + j11;
                zziu.zza(bArr, j14, (byte) ((charAt3 >>> 6) | 960));
                long j18 = j17 + j11;
                zziu.zza(bArr, j17, (byte) ((charAt3 & '?') | 128));
                long j19 = j11;
                c12 = 128;
                j12 = j18;
                j13 = j19;
            } else if ((charAt3 >= 55296 && 57343 >= charAt3) || j14 > j15 - 3) {
                if (j14 <= j15 - 4) {
                    int i15 = i14 + 1;
                    if (i15 != length) {
                        char charAt4 = charSequence.charAt(i15);
                        if (Character.isSurrogatePair(charAt3, charAt4)) {
                            int codePoint = Character.toCodePoint(charAt3, charAt4);
                            long j21 = j14 + 1;
                            zziu.zza(bArr, j14, (byte) ((codePoint >>> 18) | 240));
                            long j22 = j21 + 1;
                            c12 = 128;
                            zziu.zza(bArr, j21, (byte) (((codePoint >>> 12) & 63) | 128));
                            long j23 = j22 + 1;
                            zziu.zza(bArr, j22, (byte) (((codePoint >>> 6) & 63) | 128));
                            j13 = 1;
                            j12 = j23 + 1;
                            zziu.zza(bArr, j23, (byte) ((codePoint & 63) | 128));
                            i14 = i15;
                        } else {
                            i14 = i15;
                        }
                    }
                    throw new zzja(i14 - 1, length);
                } else if (55296 <= charAt3 && charAt3 <= 57343 && ((i13 = i14 + 1) == length || !Character.isSurrogatePair(charAt3, charSequence.charAt(i13)))) {
                    throw new zzja(i14, length);
                } else {
                    StringBuilder sb3 = new StringBuilder(46);
                    sb3.append("Failed writing ");
                    sb3.append(charAt3);
                    sb3.append(" at index ");
                    sb3.append(j14);
                    throw new ArrayIndexOutOfBoundsException(sb3.toString());
                }
            } else {
                long j24 = j14 + j11;
                zziu.zza(bArr, j14, (byte) ((charAt3 >>> '\f') | 480));
                long j25 = j24 + j11;
                zziu.zza(bArr, j24, (byte) (((charAt3 >>> 6) & 63) | 128));
                zziu.zza(bArr, j25, (byte) ((charAt3 & '?') | 128));
                j12 = j25 + 1;
                j13 = 1;
                c12 = 128;
            }
            i14++;
            c11 = c12;
            long j26 = j13;
            j14 = j12;
            j11 = j26;
        }
        return (int) j14;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.vision.zziy
    public final void zzb(CharSequence charSequence, ByteBuffer byteBuffer) {
        char c11;
        long j11;
        int i11;
        int i12;
        long j12;
        char c12;
        char charAt;
        long zzb = zziu.zzb(byteBuffer);
        long position = byteBuffer.position() + zzb;
        long limit = byteBuffer.limit() + zzb;
        int length = charSequence.length();
        if (length > limit - position) {
            char charAt2 = charSequence.charAt(length - 1);
            int limit2 = byteBuffer.limit();
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("Failed writing ");
            sb2.append(charAt2);
            sb2.append(" at index ");
            sb2.append(limit2);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        int i13 = 0;
        while (true) {
            c11 = 128;
            if (i13 >= length || (charAt = charSequence.charAt(i13)) >= 128) {
                break;
            }
            zziu.zza(position, (byte) charAt);
            i13++;
            position++;
        }
        if (i13 == length) {
            byteBuffer.position((int) (position - zzb));
            return;
        }
        while (i13 < length) {
            char charAt3 = charSequence.charAt(i13);
            if (charAt3 >= c11 || position >= limit) {
                if (charAt3 >= 2048 || position > limit - 2) {
                    j11 = zzb;
                    if ((charAt3 >= 55296 && 57343 >= charAt3) || position > limit - 3) {
                        if (position <= limit - 4) {
                            i12 = i13 + 1;
                            if (i12 != length) {
                                char charAt4 = charSequence.charAt(i12);
                                if (Character.isSurrogatePair(charAt3, charAt4)) {
                                    int codePoint = Character.toCodePoint(charAt3, charAt4);
                                    j12 = limit;
                                    long j13 = position + 1;
                                    zziu.zza(position, (byte) ((codePoint >>> 18) | 240));
                                    long j14 = j13 + 1;
                                    c12 = 128;
                                    zziu.zza(j13, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j15 = j14 + 1;
                                    zziu.zza(j14, (byte) (((codePoint >>> 6) & 63) | 128));
                                    zziu.zza(j15, (byte) ((codePoint & 63) | 128));
                                    position = j15 + 1;
                                } else {
                                    i13 = i12;
                                }
                            }
                            throw new zzja(i13 - 1, length);
                        } else if (55296 <= charAt3 && charAt3 <= 57343 && ((i11 = i13 + 1) == length || !Character.isSurrogatePair(charAt3, charSequence.charAt(i11)))) {
                            throw new zzja(i13, length);
                        } else {
                            StringBuilder sb3 = new StringBuilder(46);
                            sb3.append("Failed writing ");
                            sb3.append(charAt3);
                            sb3.append(" at index ");
                            sb3.append(position);
                            throw new ArrayIndexOutOfBoundsException(sb3.toString());
                        }
                    }
                    long j16 = position + 1;
                    zziu.zza(position, (byte) ((charAt3 >>> '\f') | 480));
                    long j17 = j16 + 1;
                    zziu.zza(j16, (byte) (((charAt3 >>> 6) & 63) | 128));
                    zziu.zza(j17, (byte) ((charAt3 & '?') | 128));
                    position = j17 + 1;
                } else {
                    j11 = zzb;
                    long j18 = position + 1;
                    zziu.zza(position, (byte) ((charAt3 >>> 6) | 960));
                    zziu.zza(j18, (byte) ((charAt3 & '?') | 128));
                    position = j18 + 1;
                }
                j12 = limit;
                i12 = i13;
                c12 = 128;
            } else {
                zziu.zza(position, (byte) charAt3);
                j12 = limit;
                i12 = i13;
                c12 = c11;
                position++;
                j11 = zzb;
            }
            c11 = c12;
            zzb = j11;
            limit = j12;
            i13 = i12 + 1;
        }
        byteBuffer.position((int) (position - zzb));
    }
}