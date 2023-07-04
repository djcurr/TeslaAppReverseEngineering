package org.spongycastle.crypto.generators;

import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.engines.Salsa20Engine;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Pack;

/* loaded from: classes4.dex */
public class SCrypt {
    private static void BlockMix(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i11) {
        System.arraycopy(iArr, iArr.length - 16, iArr2, 0, 16);
        int length = iArr.length >>> 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = i11 * 2; i14 > 0; i14--) {
            Xor(iArr2, iArr, i12, iArr3);
            Salsa20Engine.salsaCore(8, iArr3, iArr2);
            System.arraycopy(iArr2, 0, iArr4, i13, 16);
            i13 = (length + i12) - i13;
            i12 += 16;
        }
        System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
    }

    private static void Clear(byte[] bArr) {
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    private static void ClearAll(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            Clear(iArr2);
        }
    }

    private static byte[] MFcrypt(byte[] bArr, byte[] bArr2, int i11, int i12, int i13, int i14) {
        int i15 = i12 * 128;
        byte[] SingleIterationPBKDF2 = SingleIterationPBKDF2(bArr, bArr2, i13 * i15);
        int[] iArr = null;
        try {
            int length = SingleIterationPBKDF2.length >>> 2;
            iArr = new int[length];
            Pack.littleEndianToInt(SingleIterationPBKDF2, 0, iArr);
            int i16 = i15 >>> 2;
            for (int i17 = 0; i17 < length; i17 += i16) {
                SMix(iArr, i17, i11, i12);
            }
            Pack.intToLittleEndian(iArr, SingleIterationPBKDF2, 0);
            return SingleIterationPBKDF2(bArr, SingleIterationPBKDF2, i14);
        } finally {
            Clear(SingleIterationPBKDF2);
            Clear(iArr);
        }
    }

    private static void SMix(int[] iArr, int i11, int i12, int i13) {
        int i14 = i13 * 32;
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[i14];
        int[] iArr5 = new int[i14];
        int[][] iArr6 = new int[i12];
        try {
            System.arraycopy(iArr, i11, iArr5, 0, i14);
            for (int i15 = 0; i15 < i12; i15++) {
                iArr6[i15] = Arrays.clone(iArr5);
                BlockMix(iArr5, iArr2, iArr3, iArr4, i13);
            }
            int i16 = i12 - 1;
            for (int i17 = 0; i17 < i12; i17++) {
                Xor(iArr5, iArr6[iArr5[i14 - 16] & i16], 0, iArr5);
                BlockMix(iArr5, iArr2, iArr3, iArr4, i13);
            }
            System.arraycopy(iArr5, 0, iArr, i11, i14);
            ClearAll(iArr6);
            ClearAll(new int[][]{iArr5, iArr2, iArr3, iArr4});
        } catch (Throwable th2) {
            ClearAll(iArr6);
            ClearAll(new int[][]{iArr5, iArr2, iArr3, iArr4});
            throw th2;
        }
    }

    private static byte[] SingleIterationPBKDF2(byte[] bArr, byte[] bArr2, int i11) {
        PKCS5S2ParametersGenerator pKCS5S2ParametersGenerator = new PKCS5S2ParametersGenerator(new SHA256Digest());
        pKCS5S2ParametersGenerator.init(bArr, bArr2, 1);
        return ((KeyParameter) pKCS5S2ParametersGenerator.generateDerivedMacParameters(i11 * 8)).getKey();
    }

    private static void Xor(int[] iArr, int[] iArr2, int i11, int[] iArr3) {
        for (int length = iArr3.length - 1; length >= 0; length--) {
            iArr3[length] = iArr[length] ^ iArr2[i11 + length];
        }
    }

    public static byte[] generate(byte[] bArr, byte[] bArr2, int i11, int i12, int i13, int i14) {
        if (bArr != null) {
            if (bArr2 != null) {
                if (i11 > 1) {
                    if (i12 != 1 || i11 <= 65536) {
                        if (i12 >= 1) {
                            int i15 = Integer.MAX_VALUE / ((i12 * 128) * 8);
                            if (i13 >= 1 && i13 <= i15) {
                                if (i14 >= 1) {
                                    return MFcrypt(bArr, bArr2, i11, i12, i13, i14);
                                }
                                throw new IllegalArgumentException("Generated key length dkLen must be >= 1.");
                            }
                            throw new IllegalArgumentException("Parallelisation parameter p must be >= 1 and <= " + i15 + " (based on block size r of " + i12 + ")");
                        }
                        throw new IllegalArgumentException("Block size r must be >= 1.");
                    }
                    throw new IllegalArgumentException("Cost parameter N must be > 1 and < 65536.");
                }
                throw new IllegalArgumentException("Cost parameter N must be > 1.");
            }
            throw new IllegalArgumentException("Salt S must be provided.");
        }
        throw new IllegalArgumentException("Passphrase P must be provided.");
    }

    private static void Clear(int[] iArr) {
        if (iArr != null) {
            Arrays.fill(iArr, 0);
        }
    }
}