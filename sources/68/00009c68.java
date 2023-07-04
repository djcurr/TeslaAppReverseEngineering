package org.spongycastle.crypto.modes.gcm;

import org.spongycastle.util.Pack;

/* loaded from: classes4.dex */
public abstract class GCMUtil {
    private static final int E1 = -520093696;
    private static final long E1L = -2233785415175766016L;
    private static final int[] LOOKUP = generateLookup();

    public static byte[] asBytes(int[] iArr) {
        byte[] bArr = new byte[16];
        Pack.intToBigEndian(iArr, bArr, 0);
        return bArr;
    }

    public static int[] asInts(byte[] bArr) {
        int[] iArr = new int[4];
        Pack.bigEndianToInt(bArr, 0, iArr);
        return iArr;
    }

    public static long[] asLongs(byte[] bArr) {
        long[] jArr = new long[2];
        Pack.bigEndianToLong(bArr, 0, jArr);
        return jArr;
    }

    private static int[] generateLookup() {
        int[] iArr = new int[256];
        for (int i11 = 0; i11 < 256; i11++) {
            int i12 = 0;
            for (int i13 = 7; i13 >= 0; i13--) {
                if (((1 << i13) & i11) != 0) {
                    i12 ^= E1 >>> (7 - i13);
                }
            }
            iArr[i11] = i12;
        }
        return iArr;
    }

    public static void multiply(byte[] bArr, byte[] bArr2) {
        int[] asInts = asInts(bArr);
        multiply(asInts, asInts(bArr2));
        asBytes(asInts, bArr);
    }

    public static void multiplyP(int[] iArr) {
        iArr[0] = ((shiftRight(iArr) >> 8) & E1) ^ iArr[0];
    }

    public static void multiplyP8(int[] iArr) {
        int shiftRightN = shiftRightN(iArr, 8);
        iArr[0] = LOOKUP[shiftRightN >>> 24] ^ iArr[0];
    }

    public static byte[] oneAsBytes() {
        byte[] bArr = new byte[16];
        bArr[0] = Byte.MIN_VALUE;
        return bArr;
    }

    public static int[] oneAsInts() {
        int[] iArr = new int[4];
        iArr[0] = Integer.MIN_VALUE;
        return iArr;
    }

    public static long[] oneAsLongs() {
        return new long[]{Long.MIN_VALUE};
    }

    static int shiftRight(int[] iArr) {
        int i11 = iArr[0];
        iArr[0] = i11 >>> 1;
        int i12 = iArr[1];
        iArr[1] = (i11 << 31) | (i12 >>> 1);
        int i13 = i12 << 31;
        int i14 = iArr[2];
        iArr[2] = i13 | (i14 >>> 1);
        int i15 = i14 << 31;
        int i16 = iArr[3];
        iArr[3] = i15 | (i16 >>> 1);
        return i16 << 31;
    }

    static int shiftRightN(int[] iArr, int i11) {
        int i12 = iArr[0];
        int i13 = 32 - i11;
        iArr[0] = i12 >>> i11;
        int i14 = iArr[1];
        iArr[1] = (i12 << i13) | (i14 >>> i11);
        int i15 = i14 << i13;
        int i16 = iArr[2];
        iArr[2] = i15 | (i16 >>> i11);
        int i17 = i16 << i13;
        int i18 = iArr[3];
        iArr[3] = (i18 >>> i11) | i17;
        return i18 << i13;
    }

    public static void xor(byte[] bArr, byte[] bArr2) {
        int i11 = 0;
        do {
            bArr[i11] = (byte) (bArr[i11] ^ bArr2[i11]);
            int i12 = i11 + 1;
            bArr[i12] = (byte) (bArr[i12] ^ bArr2[i12]);
            int i13 = i12 + 1;
            bArr[i13] = (byte) (bArr[i13] ^ bArr2[i13]);
            int i14 = i13 + 1;
            bArr[i14] = (byte) (bArr[i14] ^ bArr2[i14]);
            i11 = i14 + 1;
        } while (i11 < 16);
    }

    public static void asBytes(int[] iArr, byte[] bArr) {
        Pack.intToBigEndian(iArr, bArr, 0);
    }

    public static void asInts(byte[] bArr, int[] iArr) {
        Pack.bigEndianToInt(bArr, 0, iArr);
    }

    public static void asLongs(byte[] bArr, long[] jArr) {
        Pack.bigEndianToLong(bArr, 0, jArr);
    }

    public static byte[] asBytes(long[] jArr) {
        byte[] bArr = new byte[16];
        Pack.longToBigEndian(jArr, bArr, 0);
        return bArr;
    }

    public static void multiplyP(int[] iArr, int[] iArr2) {
        iArr2[0] = ((shiftRight(iArr, iArr2) >> 8) & E1) ^ iArr2[0];
    }

    public static void multiplyP8(int[] iArr, int[] iArr2) {
        int shiftRightN = shiftRightN(iArr, 8, iArr2);
        iArr2[0] = LOOKUP[shiftRightN >>> 24] ^ iArr2[0];
    }

    public static void asBytes(long[] jArr, byte[] bArr) {
        Pack.longToBigEndian(jArr, bArr, 0);
    }

    public static void multiply(int[] iArr, int[] iArr2) {
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < 4; i19++) {
            int i21 = iArr2[i19];
            for (int i22 = 0; i22 < 32; i22++) {
                int i23 = i21 >> 31;
                i21 <<= 1;
                i15 ^= i11 & i23;
                i16 ^= i12 & i23;
                i17 ^= i13 & i23;
                i18 ^= i23 & i14;
                i14 = (i14 >>> 1) | (i13 << 31);
                i13 = (i13 >>> 1) | (i12 << 31);
                i12 = (i12 >>> 1) | (i11 << 31);
                i11 = (i11 >>> 1) ^ (((i14 << 31) >> 8) & E1);
            }
        }
        iArr[0] = i15;
        iArr[1] = i16;
        iArr[2] = i17;
        iArr[3] = i18;
    }

    public static void xor(byte[] bArr, byte[] bArr2, int i11, int i12) {
        while (true) {
            i12--;
            if (i12 < 0) {
                return;
            }
            bArr[i12] = (byte) (bArr[i12] ^ bArr2[i11 + i12]);
        }
    }

    public static void xor(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i11 = 0;
        do {
            bArr3[i11] = (byte) (bArr[i11] ^ bArr2[i11]);
            int i12 = i11 + 1;
            bArr3[i12] = (byte) (bArr[i12] ^ bArr2[i12]);
            int i13 = i12 + 1;
            bArr3[i13] = (byte) (bArr[i13] ^ bArr2[i13]);
            int i14 = i13 + 1;
            bArr3[i14] = (byte) (bArr[i14] ^ bArr2[i14]);
            i11 = i14 + 1;
        } while (i11 < 16);
    }

    static int shiftRight(int[] iArr, int[] iArr2) {
        int i11 = iArr[0];
        iArr2[0] = i11 >>> 1;
        int i12 = iArr[1];
        iArr2[1] = (i11 << 31) | (i12 >>> 1);
        int i13 = i12 << 31;
        int i14 = iArr[2];
        iArr2[2] = i13 | (i14 >>> 1);
        int i15 = iArr[3];
        iArr2[3] = (i14 << 31) | (i15 >>> 1);
        return i15 << 31;
    }

    static int shiftRightN(int[] iArr, int i11, int[] iArr2) {
        int i12 = iArr[0];
        int i13 = 32 - i11;
        iArr2[0] = i12 >>> i11;
        int i14 = iArr[1];
        iArr2[1] = (i12 << i13) | (i14 >>> i11);
        int i15 = i14 << i13;
        int i16 = iArr[2];
        iArr2[2] = i15 | (i16 >>> i11);
        int i17 = iArr[3];
        iArr2[3] = (i17 >>> i11) | (i16 << i13);
        return i17 << i13;
    }

    public static void xor(int[] iArr, int[] iArr2) {
        iArr[0] = iArr[0] ^ iArr2[0];
        iArr[1] = iArr[1] ^ iArr2[1];
        iArr[2] = iArr[2] ^ iArr2[2];
        iArr[3] = iArr2[3] ^ iArr[3];
    }

    public static void multiply(long[] jArr, long[] jArr2) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = 0;
        long j14 = 0;
        for (int i11 = 0; i11 < 2; i11++) {
            long j15 = jArr2[i11];
            for (int i12 = 0; i12 < 64; i12++) {
                long j16 = j15 >> 63;
                j15 <<= 1;
                j13 ^= j11 & j16;
                j14 ^= j16 & j12;
                j12 = (j12 >>> 1) | (j11 << 63);
                j11 = (j11 >>> 1) ^ (((j12 << 63) >> 8) & E1L);
            }
        }
        jArr[0] = j13;
        jArr[1] = j14;
    }

    public static void xor(int[] iArr, int[] iArr2, int[] iArr3) {
        iArr3[0] = iArr[0] ^ iArr2[0];
        iArr3[1] = iArr[1] ^ iArr2[1];
        iArr3[2] = iArr[2] ^ iArr2[2];
        iArr3[3] = iArr[3] ^ iArr2[3];
    }

    static long shiftRight(long[] jArr) {
        long j11 = jArr[0];
        jArr[0] = j11 >>> 1;
        long j12 = jArr[1];
        jArr[1] = (j11 << 63) | (j12 >>> 1);
        return j12 << 63;
    }

    public static void xor(long[] jArr, long[] jArr2) {
        jArr[0] = jArr[0] ^ jArr2[0];
        jArr[1] = jArr[1] ^ jArr2[1];
    }

    public static void xor(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }

    static long shiftRight(long[] jArr, long[] jArr2) {
        long j11 = jArr[0];
        jArr2[0] = j11 >>> 1;
        long j12 = jArr[1];
        jArr2[1] = (j11 << 63) | (j12 >>> 1);
        return j12 << 63;
    }
}