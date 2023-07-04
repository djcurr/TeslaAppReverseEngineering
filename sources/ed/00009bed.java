package org.spongycastle.crypto.engines;

import okhttp3.internal.http2.Settings;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.RC2Parameters;
import org.spongycastle.crypto.signers.PSSSigner;
import org.spongycastle.math.ec.Tnaf;

/* loaded from: classes4.dex */
public class RC2Engine implements BlockCipher {
    private static final int BLOCK_SIZE = 8;
    private static byte[] piTable = {-39, 120, -7, -60, 25, -35, -75, -19, 40, -23, -3, 121, 74, -96, -40, -99, -58, 126, 55, -125, 43, 118, 83, -114, 98, 76, 100, -120, 68, -117, -5, -94, 23, -102, 89, -11, -121, -77, 79, 19, 97, 69, 109, -115, 9, -127, 125, 50, -67, -113, 64, -21, -122, -73, 123, 11, -16, -107, 33, 34, 92, 107, 78, -126, 84, -42, 101, -109, -50, 96, -78, 28, 115, 86, -64, 20, -89, -116, -15, -36, 18, 117, -54, 31, 59, -66, -28, -47, 66, 61, -44, 48, -93, 60, -74, 38, 111, -65, 14, -38, 70, 105, 7, 87, 39, -14, 29, -101, PSSSigner.TRAILER_IMPLICIT, -108, 67, 3, -8, 17, -57, -10, -112, -17, 62, -25, 6, -61, -43, 47, -56, 102, 30, -41, 8, -24, -22, -34, Byte.MIN_VALUE, 82, -18, -9, -124, -86, 114, -84, 53, 77, 106, 42, -106, 26, -46, 113, 90, 21, 73, 116, 75, -97, -48, 94, 4, 24, -92, -20, -62, -32, 65, 110, 15, 81, -53, -52, 36, -111, -81, 80, -95, -12, 112, 57, -103, 124, 58, -123, 35, -72, -76, 122, -4, 2, 54, 91, 37, 85, -105, 49, 45, 93, -6, -104, -29, -118, -110, -82, 5, -33, 41, Tnaf.POW_2_WIDTH, 103, 108, -70, -55, -45, 0, -26, -49, -31, -98, -88, 44, 99, 22, 1, 63, 88, -30, -119, -87, 13, 56, 52, 27, -85, 51, -1, -80, -69, 72, 12, 95, -71, -79, -51, 46, -59, -13, -37, 71, -27, -91, -100, 119, 10, -90, 32, 104, -2, Byte.MAX_VALUE, -63, -83};
    private boolean encrypting;
    private int[] workingKey;

    private void decryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13 = ((bArr[i11 + 7] & 255) << 8) + (bArr[i11 + 6] & 255);
        int i14 = ((bArr[i11 + 5] & 255) << 8) + (bArr[i11 + 4] & 255);
        int i15 = ((bArr[i11 + 3] & 255) << 8) + (bArr[i11 + 2] & 255);
        int i16 = ((bArr[i11 + 1] & 255) << 8) + (bArr[i11 + 0] & 255);
        for (int i17 = 60; i17 >= 44; i17 -= 4) {
            i13 = rotateWordLeft(i13, 11) - ((((~i14) & i16) + (i15 & i14)) + this.workingKey[i17 + 3]);
            i14 = rotateWordLeft(i14, 13) - ((((~i15) & i13) + (i16 & i15)) + this.workingKey[i17 + 2]);
            i15 = rotateWordLeft(i15, 14) - ((((~i16) & i14) + (i13 & i16)) + this.workingKey[i17 + 1]);
            i16 = rotateWordLeft(i16, 15) - ((((~i13) & i15) + (i14 & i13)) + this.workingKey[i17]);
        }
        int[] iArr = this.workingKey;
        int i18 = i13 - iArr[i14 & 63];
        int i19 = i14 - iArr[i15 & 63];
        int i21 = i15 - iArr[i16 & 63];
        int i22 = i16 - iArr[i18 & 63];
        for (int i23 = 40; i23 >= 20; i23 -= 4) {
            i18 = rotateWordLeft(i18, 11) - ((((~i19) & i22) + (i21 & i19)) + this.workingKey[i23 + 3]);
            i19 = rotateWordLeft(i19, 13) - ((((~i21) & i18) + (i22 & i21)) + this.workingKey[i23 + 2]);
            i21 = rotateWordLeft(i21, 14) - ((((~i22) & i19) + (i18 & i22)) + this.workingKey[i23 + 1]);
            i22 = rotateWordLeft(i22, 15) - ((((~i18) & i21) + (i19 & i18)) + this.workingKey[i23]);
        }
        int[] iArr2 = this.workingKey;
        int i24 = i18 - iArr2[i19 & 63];
        int i25 = i19 - iArr2[i21 & 63];
        int i26 = i21 - iArr2[i22 & 63];
        int i27 = i22 - iArr2[i24 & 63];
        for (int i28 = 16; i28 >= 0; i28 -= 4) {
            i24 = rotateWordLeft(i24, 11) - ((((~i25) & i27) + (i26 & i25)) + this.workingKey[i28 + 3]);
            i25 = rotateWordLeft(i25, 13) - ((((~i26) & i24) + (i27 & i26)) + this.workingKey[i28 + 2]);
            i26 = rotateWordLeft(i26, 14) - ((((~i27) & i25) + (i24 & i27)) + this.workingKey[i28 + 1]);
            i27 = rotateWordLeft(i27, 15) - ((((~i24) & i26) + (i25 & i24)) + this.workingKey[i28]);
        }
        bArr2[i12 + 0] = (byte) i27;
        bArr2[i12 + 1] = (byte) (i27 >> 8);
        bArr2[i12 + 2] = (byte) i26;
        bArr2[i12 + 3] = (byte) (i26 >> 8);
        bArr2[i12 + 4] = (byte) i25;
        bArr2[i12 + 5] = (byte) (i25 >> 8);
        bArr2[i12 + 6] = (byte) i24;
        bArr2[i12 + 7] = (byte) (i24 >> 8);
    }

    private void encryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13 = ((bArr[i11 + 7] & 255) << 8) + (bArr[i11 + 6] & 255);
        int i14 = ((bArr[i11 + 5] & 255) << 8) + (bArr[i11 + 4] & 255);
        int i15 = ((bArr[i11 + 3] & 255) << 8) + (bArr[i11 + 2] & 255);
        int i16 = ((bArr[i11 + 1] & 255) << 8) + (bArr[i11 + 0] & 255);
        for (int i17 = 0; i17 <= 16; i17 += 4) {
            i16 = rotateWordLeft(i16 + ((~i13) & i15) + (i14 & i13) + this.workingKey[i17], 1);
            i15 = rotateWordLeft(i15 + ((~i16) & i14) + (i13 & i16) + this.workingKey[i17 + 1], 2);
            i14 = rotateWordLeft(i14 + ((~i15) & i13) + (i16 & i15) + this.workingKey[i17 + 2], 3);
            i13 = rotateWordLeft(i13 + ((~i14) & i16) + (i15 & i14) + this.workingKey[i17 + 3], 5);
        }
        int[] iArr = this.workingKey;
        int i18 = i16 + iArr[i13 & 63];
        int i19 = i15 + iArr[i18 & 63];
        int i21 = i14 + iArr[i19 & 63];
        int i22 = i13 + iArr[i21 & 63];
        for (int i23 = 20; i23 <= 40; i23 += 4) {
            i18 = rotateWordLeft(i18 + ((~i22) & i19) + (i21 & i22) + this.workingKey[i23], 1);
            i19 = rotateWordLeft(i19 + ((~i18) & i21) + (i22 & i18) + this.workingKey[i23 + 1], 2);
            i21 = rotateWordLeft(i21 + ((~i19) & i22) + (i18 & i19) + this.workingKey[i23 + 2], 3);
            i22 = rotateWordLeft(i22 + ((~i21) & i18) + (i19 & i21) + this.workingKey[i23 + 3], 5);
        }
        int[] iArr2 = this.workingKey;
        int i24 = i18 + iArr2[i22 & 63];
        int i25 = i19 + iArr2[i24 & 63];
        int i26 = i21 + iArr2[i25 & 63];
        int i27 = i22 + iArr2[i26 & 63];
        for (int i28 = 44; i28 < 64; i28 += 4) {
            i24 = rotateWordLeft(i24 + ((~i27) & i25) + (i26 & i27) + this.workingKey[i28], 1);
            i25 = rotateWordLeft(i25 + ((~i24) & i26) + (i27 & i24) + this.workingKey[i28 + 1], 2);
            i26 = rotateWordLeft(i26 + ((~i25) & i27) + (i24 & i25) + this.workingKey[i28 + 2], 3);
            i27 = rotateWordLeft(i27 + ((~i26) & i24) + (i25 & i26) + this.workingKey[i28 + 3], 5);
        }
        bArr2[i12 + 0] = (byte) i24;
        bArr2[i12 + 1] = (byte) (i24 >> 8);
        bArr2[i12 + 2] = (byte) i25;
        bArr2[i12 + 3] = (byte) (i25 >> 8);
        bArr2[i12 + 4] = (byte) i26;
        bArr2[i12 + 5] = (byte) (i26 >> 8);
        bArr2[i12 + 6] = (byte) i27;
        bArr2[i12 + 7] = (byte) (i27 >> 8);
    }

    private int[] generateWorkingKey(byte[] bArr, int i11) {
        int[] iArr = new int[128];
        for (int i12 = 0; i12 != bArr.length; i12++) {
            iArr[i12] = bArr[i12] & 255;
        }
        int length = bArr.length;
        if (length < 128) {
            int i13 = iArr[length - 1];
            int i14 = 0;
            while (true) {
                int i15 = i14 + 1;
                i13 = piTable[(i13 + iArr[i14]) & 255] & 255;
                int i16 = length + 1;
                iArr[length] = i13;
                if (i16 >= 128) {
                    break;
                }
                length = i16;
                i14 = i15;
            }
        }
        int i17 = (i11 + 7) >> 3;
        int i18 = 128 - i17;
        int i19 = piTable[(255 >> ((-i11) & 7)) & iArr[i18]] & 255;
        iArr[i18] = i19;
        for (int i21 = i18 - 1; i21 >= 0; i21--) {
            i19 = piTable[i19 ^ iArr[i21 + i17]] & 255;
            iArr[i21] = i19;
        }
        int[] iArr2 = new int[64];
        for (int i22 = 0; i22 != 64; i22++) {
            int i23 = i22 * 2;
            iArr2[i22] = iArr[i23] + (iArr[i23 + 1] << 8);
        }
        return iArr2;
    }

    private int rotateWordLeft(int i11, int i12) {
        int i13 = i11 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        return (i13 >> (16 - i12)) | (i13 << i12);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "RC2";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        this.encrypting = z11;
        if (cipherParameters instanceof RC2Parameters) {
            RC2Parameters rC2Parameters = (RC2Parameters) cipherParameters;
            this.workingKey = generateWorkingKey(rC2Parameters.getKey(), rC2Parameters.getEffectiveKeyBits());
        } else if (cipherParameters instanceof KeyParameter) {
            byte[] key = ((KeyParameter) cipherParameters).getKey();
            this.workingKey = generateWorkingKey(key, key.length * 8);
        } else {
            throw new IllegalArgumentException("invalid parameter passed to RC2 init - " + cipherParameters.getClass().getName());
        }
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public final int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (this.workingKey != null) {
            if (i11 + 8 <= bArr.length) {
                if (i12 + 8 <= bArr2.length) {
                    if (this.encrypting) {
                        encryptBlock(bArr, i11, bArr2, i12);
                        return 8;
                    }
                    decryptBlock(bArr, i11, bArr2, i12);
                    return 8;
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException("RC2 engine not initialised");
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }
}