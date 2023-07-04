package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public final class zzk {
    private static int zza(byte[] bArr, int i11) {
        return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    private static long zza(long j11, long j12, long j13) {
        long j14 = (j11 ^ j12) * j13;
        long j15 = ((j14 ^ (j14 >>> 47)) ^ j12) * j13;
        return (j15 ^ (j15 >>> 47)) * j13;
    }

    public static long zza(byte[] bArr) {
        int length = bArr.length;
        if (length < 0 || length > bArr.length) {
            StringBuilder sb2 = new StringBuilder(67);
            sb2.append("Out of bound index with offput: 0 and length: ");
            sb2.append(length);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        int i11 = 37;
        char c11 = 0;
        if (length <= 32) {
            if (length > 16) {
                long j11 = (length << 1) - 7286425919675154353L;
                long zzb = zzb(bArr, 0) * (-5435081209227447693L);
                long zzb2 = zzb(bArr, 8);
                int i12 = length + 0;
                long zzb3 = zzb(bArr, i12 - 8) * j11;
                return zza(Long.rotateRight(zzb + zzb2, 43) + Long.rotateRight(zzb3, 30) + (zzb(bArr, i12 - 16) * (-7286425919675154353L)), zzb + Long.rotateRight(zzb2 - 7286425919675154353L, 18) + zzb3, j11);
            } else if (length >= 8) {
                long j12 = (length << 1) - 7286425919675154353L;
                long zzb4 = zzb(bArr, 0) - 7286425919675154353L;
                long zzb5 = zzb(bArr, (length + 0) - 8);
                return zza((Long.rotateRight(zzb5, 37) * j12) + zzb4, (Long.rotateRight(zzb4, 25) + zzb5) * j12, j12);
            } else if (length >= 4) {
                return zza(length + ((zza(bArr, 0) & 4294967295L) << 3), zza(bArr, (length + 0) - 4) & 4294967295L, (length << 1) - 7286425919675154353L);
            } else if (length > 0) {
                long j13 = (((bArr[0] & 255) + ((bArr[(length >> 1) + 0] & 255) << 8)) * (-7286425919675154353L)) ^ ((length + ((bArr[(length - 1) + 0] & 255) << 2)) * (-4348849565147123417L));
                return (j13 ^ (j13 >>> 47)) * (-7286425919675154353L);
            } else {
                return -7286425919675154353L;
            }
        } else if (length <= 64) {
            long j14 = (length << 1) - 7286425919675154353L;
            long zzb6 = zzb(bArr, 0) * (-7286425919675154353L);
            long zzb7 = zzb(bArr, 8);
            int i13 = length + 0;
            long zzb8 = zzb(bArr, i13 - 8) * j14;
            long rotateRight = Long.rotateRight(zzb6 + zzb7, 43) + Long.rotateRight(zzb8, 30) + (zzb(bArr, i13 - 16) * (-7286425919675154353L));
            long zza = zza(rotateRight, Long.rotateRight((-7286425919675154353L) + zzb7, 18) + zzb6 + zzb8, j14);
            long zzb9 = zzb(bArr, 16) * j14;
            long zzb10 = zzb(bArr, 24);
            long zzb11 = (rotateRight + zzb(bArr, i13 - 32)) * j14;
            return zza(Long.rotateRight(zzb9 + zzb10, 43) + Long.rotateRight(zzb11, 30) + ((zza + zzb(bArr, i13 - 24)) * j14), zzb9 + Long.rotateRight(zzb10 + zzb6, 18) + zzb11, j14);
        } else {
            long j15 = 2480279821605975764L;
            long j16 = 1390051526045402406L;
            long[] jArr = new long[2];
            long[] jArr2 = new long[2];
            long zzb12 = zzb(bArr, 0) + 95310865018149119L;
            int i14 = length - 1;
            int i15 = ((i14 / 64) << 6) + 0;
            int i16 = i14 & 63;
            int i17 = (i15 + i16) - 63;
            int i18 = 0;
            while (true) {
                long rotateRight2 = (Long.rotateRight(((zzb12 + j15) + jArr[c11]) + zzb(bArr, i18 + 8), i11) * (-5435081209227447693L)) ^ jArr2[1];
                long rotateRight3 = (Long.rotateRight(j15 + jArr[1] + zzb(bArr, i18 + 48), 42) * (-5435081209227447693L)) + jArr[0] + zzb(bArr, i18 + 40);
                long rotateRight4 = Long.rotateRight(j16 + jArr2[0], 33) * (-5435081209227447693L);
                int i19 = i16;
                int i21 = i15;
                zza(bArr, i18, jArr[1] * (-5435081209227447693L), rotateRight2 + jArr2[0], jArr);
                zza(bArr, i18 + 32, rotateRight4 + jArr2[1], rotateRight3 + zzb(bArr, i18 + 16), jArr2);
                int i22 = i18 + 64;
                if (i22 == i21) {
                    long j17 = ((255 & rotateRight2) << 1) - 5435081209227447693L;
                    jArr2[0] = jArr2[0] + i19;
                    jArr[0] = jArr[0] + jArr2[0];
                    jArr2[0] = jArr2[0] + jArr[0];
                    long rotateRight5 = (Long.rotateRight(((rotateRight4 + rotateRight3) + jArr[0]) + zzb(bArr, i17 + 8), 37) * j17) ^ (jArr2[1] * 9);
                    long rotateRight6 = (Long.rotateRight(rotateRight3 + jArr[1] + zzb(bArr, i17 + 48), 42) * j17) + (jArr[0] * 9) + zzb(bArr, i17 + 40);
                    long rotateRight7 = Long.rotateRight(rotateRight2 + jArr2[0], 33) * j17;
                    zza(bArr, i17, jArr[1] * j17, rotateRight5 + jArr2[0], jArr);
                    zza(bArr, i17 + 32, jArr2[1] + rotateRight7, zzb(bArr, i17 + 16) + rotateRight6, jArr2);
                    return zza(zza(jArr[0], jArr2[0], j17) + (((rotateRight6 >>> 47) ^ rotateRight6) * (-4348849565147123417L)) + rotateRight5, zza(jArr[1], jArr2[1], j17) + rotateRight7, j17);
                }
                i18 = i22;
                i15 = i21;
                i16 = i19;
                j16 = rotateRight2;
                zzb12 = rotateRight4;
                i11 = 37;
                c11 = 0;
                j15 = rotateRight3;
            }
        }
    }

    private static void zza(byte[] bArr, int i11, long j11, long j12, long[] jArr) {
        long zzb = zzb(bArr, i11);
        long zzb2 = zzb(bArr, i11 + 8);
        long zzb3 = zzb(bArr, i11 + 16);
        long zzb4 = zzb(bArr, i11 + 24);
        long j13 = j11 + zzb;
        long j14 = zzb2 + j13 + zzb3;
        jArr[0] = j14 + zzb4;
        jArr[1] = Long.rotateRight(j12 + j13 + zzb4, 21) + Long.rotateRight(j14, 44) + j13;
    }

    private static long zzb(byte[] bArr, int i11) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i11, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }
}