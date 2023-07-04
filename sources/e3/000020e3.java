package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class zzfj extends zzfg {
    private static int zza(byte[] bArr, int i11, long j11, int i12) {
        int zzam;
        int zzp;
        int zzd;
        if (i12 == 0) {
            zzam = zzff.zzam(i11);
            return zzam;
        } else if (i12 == 1) {
            zzp = zzff.zzp(i11, zzfd.zza(bArr, j11));
            return zzp;
        } else if (i12 == 2) {
            zzd = zzff.zzd(i11, zzfd.zza(bArr, j11), zzfd.zza(bArr, j11 + 1));
            return zzd;
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
    @Override // com.google.android.gms.internal.clearcut.zzfg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int zzb(int r18, byte[] r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzfj.zzb(int, byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.clearcut.zzfg
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
            zzfd.zza(bArr, j14, (byte) charAt);
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
                zzfd.zza(bArr, j14, (byte) charAt3);
                j13 = j11;
                j12 = j16;
                c12 = c11;
            } else if (charAt3 < 2048 && j14 <= j15 - 2) {
                long j17 = j14 + j11;
                zzfd.zza(bArr, j14, (byte) ((charAt3 >>> 6) | 960));
                long j18 = j17 + j11;
                zzfd.zza(bArr, j17, (byte) ((charAt3 & '?') | 128));
                long j19 = j11;
                c12 = 128;
                j12 = j18;
                j13 = j19;
            } else if ((charAt3 >= 55296 && 57343 >= charAt3) || j14 > j15 - 3) {
                if (j14 > j15 - 4) {
                    if (55296 > charAt3 || charAt3 > 57343 || ((i13 = i14 + 1) != length && Character.isSurrogatePair(charAt3, charSequence.charAt(i13)))) {
                        StringBuilder sb3 = new StringBuilder(46);
                        sb3.append("Failed writing ");
                        sb3.append(charAt3);
                        sb3.append(" at index ");
                        sb3.append(j14);
                        throw new ArrayIndexOutOfBoundsException(sb3.toString());
                    }
                    throw new zzfi(i14, length);
                }
                int i15 = i14 + 1;
                if (i15 != length) {
                    char charAt4 = charSequence.charAt(i15);
                    if (Character.isSurrogatePair(charAt3, charAt4)) {
                        int codePoint = Character.toCodePoint(charAt3, charAt4);
                        long j21 = j14 + 1;
                        zzfd.zza(bArr, j14, (byte) ((codePoint >>> 18) | 240));
                        long j22 = j21 + 1;
                        c12 = 128;
                        zzfd.zza(bArr, j21, (byte) (((codePoint >>> 12) & 63) | 128));
                        long j23 = j22 + 1;
                        zzfd.zza(bArr, j22, (byte) (((codePoint >>> 6) & 63) | 128));
                        j13 = 1;
                        j12 = j23 + 1;
                        zzfd.zza(bArr, j23, (byte) ((codePoint & 63) | 128));
                        i14 = i15;
                    } else {
                        i14 = i15;
                    }
                }
                throw new zzfi(i14 - 1, length);
            } else {
                long j24 = j14 + j11;
                zzfd.zza(bArr, j14, (byte) ((charAt3 >>> '\f') | 480));
                long j25 = j24 + j11;
                zzfd.zza(bArr, j24, (byte) (((charAt3 >>> 6) & 63) | 128));
                zzfd.zza(bArr, j25, (byte) ((charAt3 & '?') | 128));
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
    @Override // com.google.android.gms.internal.clearcut.zzfg
    public final void zzb(CharSequence charSequence, ByteBuffer byteBuffer) {
        char c11;
        int i11;
        long j11;
        int i12;
        int i13;
        long j12;
        char c12;
        char charAt;
        ByteBuffer byteBuffer2 = byteBuffer;
        long zzb = zzfd.zzb(byteBuffer);
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
        int i14 = 0;
        while (true) {
            c11 = 128;
            if (i14 >= length || (charAt = charSequence.charAt(i14)) >= 128) {
                break;
            }
            zzfd.zza(position, (byte) charAt);
            i14++;
            position++;
        }
        if (i14 == length) {
            i11 = (int) (position - zzb);
        } else {
            while (i14 < length) {
                char charAt3 = charSequence.charAt(i14);
                if (charAt3 >= c11 || position >= limit) {
                    if (charAt3 >= 2048 || position > limit - 2) {
                        j11 = zzb;
                        if ((charAt3 >= 55296 && 57343 >= charAt3) || position > limit - 3) {
                            if (position > limit - 4) {
                                if (55296 <= charAt3 && charAt3 <= 57343 && ((i12 = i14 + 1) == length || !Character.isSurrogatePair(charAt3, charSequence.charAt(i12)))) {
                                    throw new zzfi(i14, length);
                                }
                                StringBuilder sb3 = new StringBuilder(46);
                                sb3.append("Failed writing ");
                                sb3.append(charAt3);
                                sb3.append(" at index ");
                                sb3.append(position);
                                throw new ArrayIndexOutOfBoundsException(sb3.toString());
                            }
                            i13 = i14 + 1;
                            if (i13 != length) {
                                char charAt4 = charSequence.charAt(i13);
                                if (Character.isSurrogatePair(charAt3, charAt4)) {
                                    int codePoint = Character.toCodePoint(charAt3, charAt4);
                                    j12 = limit;
                                    long j13 = position + 1;
                                    zzfd.zza(position, (byte) ((codePoint >>> 18) | 240));
                                    long j14 = j13 + 1;
                                    c12 = 128;
                                    zzfd.zza(j13, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j15 = j14 + 1;
                                    zzfd.zza(j14, (byte) (((codePoint >>> 6) & 63) | 128));
                                    zzfd.zza(j15, (byte) ((codePoint & 63) | 128));
                                    position = j15 + 1;
                                } else {
                                    i14 = i13;
                                }
                            }
                            throw new zzfi(i14 - 1, length);
                        }
                        long j16 = position + 1;
                        zzfd.zza(position, (byte) ((charAt3 >>> '\f') | 480));
                        long j17 = j16 + 1;
                        zzfd.zza(j16, (byte) (((charAt3 >>> 6) & 63) | 128));
                        zzfd.zza(j17, (byte) ((charAt3 & '?') | 128));
                        position = j17 + 1;
                    } else {
                        j11 = zzb;
                        long j18 = position + 1;
                        zzfd.zza(position, (byte) ((charAt3 >>> 6) | 960));
                        zzfd.zza(j18, (byte) ((charAt3 & '?') | 128));
                        position = j18 + 1;
                    }
                    j12 = limit;
                    i13 = i14;
                    c12 = 128;
                } else {
                    zzfd.zza(position, (byte) charAt3);
                    j12 = limit;
                    i13 = i14;
                    c12 = c11;
                    position++;
                    j11 = zzb;
                }
                c11 = c12;
                zzb = j11;
                limit = j12;
                i14 = i13 + 1;
            }
            i11 = (int) (position - zzb);
            byteBuffer2 = byteBuffer;
        }
        byteBuffer2.position(i11);
    }
}