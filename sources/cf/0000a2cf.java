package org.spongycastle.math.raw;

import okhttp3.internal.http2.Settings;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes4.dex */
public class Interleave {
    private static final long M32 = 1431655765;
    private static final long M64 = 6148914691236517205L;

    public static int expand16to32(int i11) {
        int i12 = i11 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        int i13 = (i12 | (i12 << 8)) & 16711935;
        int i14 = (i13 | (i13 << 4)) & 252645135;
        int i15 = (i14 | (i14 << 2)) & 858993459;
        return (i15 | (i15 << 1)) & 1431655765;
    }

    public static long expand32to64(int i11) {
        int i12 = ((i11 >>> 8) ^ i11) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB;
        int i13 = i11 ^ (i12 ^ (i12 << 8));
        int i14 = ((i13 >>> 4) ^ i13) & 15728880;
        int i15 = i13 ^ (i14 ^ (i14 << 4));
        int i16 = ((i15 >>> 2) ^ i15) & 202116108;
        int i17 = i15 ^ (i16 ^ (i16 << 2));
        int i18 = ((i17 >>> 1) ^ i17) & 572662306;
        int i19 = i17 ^ (i18 ^ (i18 << 1));
        return (((i19 >>> 1) & M32) << 32) | (M32 & i19);
    }

    public static void expand64To128(long j11, long[] jArr, int i11) {
        long j12 = ((j11 >>> 16) ^ j11) & 4294901760L;
        long j13 = j11 ^ (j12 ^ (j12 << 16));
        long j14 = ((j13 >>> 8) ^ j13) & 280375465148160L;
        long j15 = j13 ^ (j14 ^ (j14 << 8));
        long j16 = ((j15 >>> 4) ^ j15) & 67555025218437360L;
        long j17 = j15 ^ (j16 ^ (j16 << 4));
        long j18 = ((j17 >>> 2) ^ j17) & 868082074056920076L;
        long j19 = j17 ^ (j18 ^ (j18 << 2));
        long j21 = ((j19 >>> 1) ^ j19) & 2459565876494606882L;
        long j22 = j19 ^ (j21 ^ (j21 << 1));
        jArr[i11] = j22 & M64;
        jArr[i11 + 1] = (j22 >>> 1) & M64;
    }

    public static int expand8to16(int i11) {
        int i12 = i11 & 255;
        int i13 = (i12 | (i12 << 4)) & 3855;
        int i14 = (i13 | (i13 << 2)) & 13107;
        return (i14 | (i14 << 1)) & 21845;
    }

    public static long unshuffle(long j11) {
        long j12 = ((j11 >>> 1) ^ j11) & 2459565876494606882L;
        long j13 = j11 ^ (j12 ^ (j12 << 1));
        long j14 = ((j13 >>> 2) ^ j13) & 868082074056920076L;
        long j15 = j13 ^ (j14 ^ (j14 << 2));
        long j16 = ((j15 >>> 4) ^ j15) & 67555025218437360L;
        long j17 = j15 ^ (j16 ^ (j16 << 4));
        long j18 = ((j17 >>> 8) ^ j17) & 280375465148160L;
        long j19 = j17 ^ (j18 ^ (j18 << 8));
        long j21 = ((j19 >>> 16) ^ j19) & 4294901760L;
        return j19 ^ (j21 ^ (j21 << 16));
    }
}