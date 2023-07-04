package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.tls.AlertDescription;

/* loaded from: classes4.dex */
public class SkipjackEngine implements BlockCipher {
    static final int BLOCK_SIZE = 8;
    static short[] ftable = {163, 215, 9, 131, 248, 72, 246, 244, 179, 33, 21, 120, 153, 177, 175, 249, 231, 45, 77, 138, 206, 76, 202, 46, 82, 149, 217, 30, 78, 56, 68, 40, 10, 223, 2, 160, 23, 241, 96, 104, 18, 183, 122, 195, 233, 250, 61, 83, 150, 132, 107, 186, 242, 99, 154, 25, 124, 174, 229, 245, 247, 22, 106, 162, 57, 182, 123, 15, 193, 147, 129, 27, 238, 180, 26, 234, 208, 145, 47, 184, 85, 185, 218, 133, 63, 65, 191, 224, 90, 88, 128, 95, 102, 11, 216, 144, 53, 213, 192, 167, 51, 6, 101, 105, 69, 0, 148, 86, 109, 152, 155, 118, 151, 252, 178, 194, 176, 254, 219, 32, 225, 235, 214, 228, 221, 71, 74, 29, 66, 237, 158, AlertDescription.unsupported_extension, 73, 60, 205, 67, 39, 210, 7, 212, 222, 199, 103, 24, 137, 203, 48, 31, 141, 198, 143, 170, 200, 116, 220, 201, 93, 92, 49, 164, AlertDescription.unrecognized_name, 136, 97, 44, 159, 13, 43, 135, 80, 130, 84, 100, 38, 125, 3, 64, 52, 75, 28, AlertDescription.unknown_psk_identity, 209, 196, 253, 59, 204, 251, 127, 171, 230, 62, 91, 165, 173, 4, 35, 156, 20, 81, 34, 240, 41, 121, AlertDescription.bad_certificate_status_response, 126, 255, 140, 14, 226, 12, 239, 188, AlertDescription.bad_certificate_hash_value, 117, AlertDescription.certificate_unobtainable, 55, 161, 236, 211, 142, 98, 139, 134, 16, 232, 8, 119, 17, 190, 146, 79, 36, 197, 50, 54, 157, 207, 243, 166, 187, 172, 94, 108, 169, 19, 87, 37, 181, 227, 189, 168, 58, 1, 5, 89, 42, 70};
    private boolean encrypting;
    private int[] key0;
    private int[] key1;
    private int[] key2;
    private int[] key3;

    private int g(int i11, int i12) {
        int i13 = i12 & 255;
        short[] sArr = ftable;
        int i14 = ((i12 >> 8) & 255) ^ sArr[this.key0[i11] ^ i13];
        int i15 = i13 ^ sArr[this.key1[i11] ^ i14];
        int i16 = i14 ^ sArr[this.key2[i11] ^ i15];
        return (i16 << 8) + (sArr[this.key3[i11] ^ i16] ^ i15);
    }

    private int h(int i11, int i12) {
        int i13 = i12 & 255;
        int i14 = (i12 >> 8) & 255;
        short[] sArr = ftable;
        int i15 = i13 ^ sArr[this.key3[i11] ^ i14];
        int i16 = i14 ^ sArr[this.key2[i11] ^ i15];
        int i17 = i15 ^ sArr[this.key1[i11] ^ i16];
        return ((sArr[this.key0[i11] ^ i17] ^ i16) << 8) + i17;
    }

    public int decryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13 = (bArr[i11 + 0] << 8) + (bArr[i11 + 1] & 255);
        int i14 = (bArr[i11 + 2] << 8) + (bArr[i11 + 3] & 255);
        int i15 = (bArr[i11 + 4] << 8) + (bArr[i11 + 5] & 255);
        int i16 = (bArr[i11 + 6] << 8) + (bArr[i11 + 7] & 255);
        int i17 = 31;
        for (int i18 = 0; i18 < 2; i18++) {
            int i19 = 0;
            while (i19 < 8) {
                int h11 = h(i17, i14);
                i17--;
                i19++;
                int i21 = i16;
                i16 = i13;
                i13 = h11;
                i14 = (i15 ^ h11) ^ (i17 + 1);
                i15 = i21;
            }
            int i22 = 0;
            while (i22 < 8) {
                int h12 = h(i17, i14);
                i17--;
                i22++;
                int i23 = i16;
                i16 = (i13 ^ i14) ^ (i17 + 1);
                i13 = h12;
                i14 = i15;
                i15 = i23;
            }
        }
        bArr2[i12 + 0] = (byte) (i13 >> 8);
        bArr2[i12 + 1] = (byte) i13;
        bArr2[i12 + 2] = (byte) (i14 >> 8);
        bArr2[i12 + 3] = (byte) i14;
        bArr2[i12 + 4] = (byte) (i15 >> 8);
        bArr2[i12 + 5] = (byte) i15;
        bArr2[i12 + 6] = (byte) (i16 >> 8);
        bArr2[i12 + 7] = (byte) i16;
        return 8;
    }

    public int encryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13 = (bArr[i11 + 0] << 8) + (bArr[i11 + 1] & 255);
        int i14 = (bArr[i11 + 2] << 8) + (bArr[i11 + 3] & 255);
        int i15 = (bArr[i11 + 4] << 8) + (bArr[i11 + 5] & 255);
        int i16 = (bArr[i11 + 6] << 8) + (bArr[i11 + 7] & 255);
        int i17 = 0;
        for (int i18 = 0; i18 < 2; i18++) {
            int i19 = 0;
            while (i19 < 8) {
                int g11 = g(i17, i13);
                i17++;
                i19++;
                int i21 = i14;
                i14 = g11;
                i13 = (i16 ^ g11) ^ i17;
                i16 = i15;
                i15 = i21;
            }
            int i22 = 0;
            while (i22 < 8) {
                int i23 = i17 + 1;
                int i24 = (i14 ^ i13) ^ i23;
                int g12 = g(i17, i13);
                i22++;
                i17 = i23;
                i14 = g12;
                i13 = i16;
                i16 = i15;
                i15 = i24;
            }
        }
        bArr2[i12 + 0] = (byte) (i13 >> 8);
        bArr2[i12 + 1] = (byte) i13;
        bArr2[i12 + 2] = (byte) (i14 >> 8);
        bArr2[i12 + 3] = (byte) i14;
        bArr2[i12 + 4] = (byte) (i15 >> 8);
        bArr2[i12 + 5] = (byte) i15;
        bArr2[i12 + 6] = (byte) (i16 >> 8);
        bArr2[i12 + 7] = (byte) i16;
        return 8;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "SKIPJACK";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            byte[] key = ((KeyParameter) cipherParameters).getKey();
            this.encrypting = z11;
            this.key0 = new int[32];
            this.key1 = new int[32];
            this.key2 = new int[32];
            this.key3 = new int[32];
            for (int i11 = 0; i11 < 32; i11++) {
                int i12 = i11 * 4;
                this.key0[i11] = key[i12 % 10] & 255;
                this.key1[i11] = key[(i12 + 1) % 10] & 255;
                this.key2[i11] = key[(i12 + 2) % 10] & 255;
                this.key3[i11] = key[(i12 + 3) % 10] & 255;
            }
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to SKIPJACK init - " + cipherParameters.getClass().getName());
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (this.key1 != null) {
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
        throw new IllegalStateException("SKIPJACK engine not initialised");
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }
}