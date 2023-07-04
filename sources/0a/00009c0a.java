package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.signers.PSSSigner;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.ec.Tnaf;

/* loaded from: classes4.dex */
public final class TwofishEngine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;
    private static final int GF256_FDBK = 361;
    private static final int GF256_FDBK_2 = 180;
    private static final int GF256_FDBK_4 = 90;
    private static final int INPUT_WHITEN = 0;
    private static final int MAX_KEY_BITS = 256;
    private static final int MAX_ROUNDS = 16;
    private static final int OUTPUT_WHITEN = 4;
    private static final byte[][] P = {new byte[]{-87, 103, -77, -24, 4, -3, -93, 118, -102, -110, Byte.MIN_VALUE, 120, -28, -35, -47, 56, 13, -58, 53, -104, 24, -9, -20, 108, 67, 117, 55, 38, -6, 19, -108, 72, -14, -48, -117, 48, -124, 84, -33, 35, 25, 91, 61, 89, -13, -82, -94, -126, 99, 1, -125, 46, -39, 81, -101, 124, -90, -21, -91, -66, 22, 12, -29, 97, -64, -116, 58, -11, 115, 44, 37, 11, -69, 78, -119, 107, 83, 106, -76, -15, -31, -26, -67, 69, -30, -12, -74, 102, -52, -107, 3, 86, -44, 28, 30, -41, -5, -61, -114, -75, -23, -49, -65, -70, -22, 119, 57, -81, 51, -55, 98, 113, -127, 121, 9, -83, 36, -51, -7, -40, -27, -59, -71, 77, 68, 8, -122, -25, -95, 29, -86, -19, 6, 112, -78, -46, 65, 123, -96, 17, 49, -62, 39, -112, 32, -10, 96, -1, -106, 92, -79, -85, -98, -100, 82, 27, 95, -109, 10, -17, -111, -123, 73, -18, 45, 79, -113, 59, 71, -121, 109, 70, -42, 62, 105, 100, 42, -50, -53, 47, -4, -105, 5, 122, -84, Byte.MAX_VALUE, -43, 26, 75, 14, -89, 90, 40, 20, 63, 41, -120, 60, 76, 2, -72, -38, -80, 23, 85, 31, -118, 125, 87, -57, -115, 116, -73, -60, -97, 114, 126, 21, 34, 18, 88, 7, -103, 52, 110, 80, -34, 104, 101, PSSSigner.TRAILER_IMPLICIT, -37, -8, -56, -88, 43, 64, -36, -2, 50, -92, -54, Tnaf.POW_2_WIDTH, 33, -16, -45, 93, 15, 0, 111, -99, 54, 66, 74, 94, -63, -32}, new byte[]{117, -13, -58, -12, -37, 123, -5, -56, 74, -45, -26, 107, 69, 125, -24, 75, -42, 50, -40, -3, 55, 113, -15, -31, 48, 15, -8, 27, -121, -6, 6, 63, 94, -70, -82, 91, -118, 0, PSSSigner.TRAILER_IMPLICIT, -99, 109, -63, -79, 14, Byte.MIN_VALUE, 93, -46, -43, -96, -124, 7, 20, -75, -112, 44, -93, -78, 115, 76, 84, -110, 116, 54, 81, 56, -80, -67, 90, -4, 96, 98, -106, 108, 66, -9, Tnaf.POW_2_WIDTH, 124, 40, 39, -116, 19, -107, -100, -57, 36, 70, 59, 112, -54, -29, -123, -53, 17, -48, -109, -72, -90, -125, 32, -1, -97, 119, -61, -52, 3, 111, 8, -65, 64, -25, 43, -30, 121, 12, -86, -126, 65, 58, -22, -71, -28, -102, -92, -105, 126, -38, 122, 23, 102, -108, -95, 29, 61, -16, -34, -77, 11, 114, -89, 28, -17, -47, 83, 62, -113, 51, 38, 95, -20, 118, 42, 73, -127, -120, -18, 33, -60, 26, -21, -39, -59, 57, -103, -51, -83, 49, -117, 1, 24, 35, -35, 31, 78, 45, -7, 72, 79, -14, 101, -114, 120, 92, 88, 25, -115, -27, -104, 87, 103, Byte.MAX_VALUE, 5, 100, -81, 99, -74, -2, -11, -73, 60, -91, -50, -23, 104, 68, -32, 77, 67, 105, 41, 46, -84, 21, 89, -88, 10, -98, 110, 71, -33, 52, 53, 106, -49, -36, 34, -55, -64, -101, -119, -44, -19, -85, 18, -94, 13, 82, -69, 2, 47, -87, -41, 97, 30, -76, 80, 4, -10, -62, 22, 37, -122, 86, 85, 9, -66, -111}};
    private static final int P_00 = 1;
    private static final int P_01 = 0;
    private static final int P_02 = 0;
    private static final int P_03 = 1;
    private static final int P_04 = 1;
    private static final int P_10 = 0;
    private static final int P_11 = 0;
    private static final int P_12 = 1;
    private static final int P_13 = 1;
    private static final int P_14 = 0;
    private static final int P_20 = 1;
    private static final int P_21 = 1;
    private static final int P_22 = 0;
    private static final int P_23 = 0;
    private static final int P_24 = 0;
    private static final int P_30 = 0;
    private static final int P_31 = 1;
    private static final int P_32 = 1;
    private static final int P_33 = 0;
    private static final int P_34 = 1;
    private static final int ROUNDS = 16;
    private static final int ROUND_SUBKEYS = 8;
    private static final int RS_GF_FDBK = 333;
    private static final int SK_BUMP = 16843009;
    private static final int SK_ROTL = 9;
    private static final int SK_STEP = 33686018;
    private static final int TOTAL_SUBKEYS = 40;
    private int[] gSBox;
    private int[] gSubKeys;
    private boolean encrypting = false;
    private int[] gMDS0 = new int[256];
    private int[] gMDS1 = new int[256];
    private int[] gMDS2 = new int[256];
    private int[] gMDS3 = new int[256];
    private int k64Cnt = 0;
    private byte[] workingKey = null;

    public TwofishEngine() {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        int[] iArr3 = new int[2];
        for (int i11 = 0; i11 < 256; i11++) {
            byte[][] bArr = P;
            int i12 = bArr[0][i11] & 255;
            iArr[0] = i12;
            iArr2[0] = Mx_X(i12) & 255;
            iArr3[0] = Mx_Y(i12) & 255;
            int i13 = bArr[1][i11] & 255;
            iArr[1] = i13;
            iArr2[1] = Mx_X(i13) & 255;
            iArr3[1] = Mx_Y(i13) & 255;
            this.gMDS0[i11] = iArr[1] | (iArr2[1] << 8) | (iArr3[1] << 16) | (iArr3[1] << 24);
            this.gMDS1[i11] = iArr3[0] | (iArr3[0] << 8) | (iArr2[0] << 16) | (iArr[0] << 24);
            this.gMDS2[i11] = (iArr3[1] << 24) | iArr2[1] | (iArr3[1] << 8) | (iArr[1] << 16);
            this.gMDS3[i11] = iArr2[0] | (iArr[0] << 8) | (iArr3[0] << 16) | (iArr2[0] << 24);
        }
    }

    private void Bits32ToBytes(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) i11;
        bArr[i12 + 1] = (byte) (i11 >> 8);
        bArr[i12 + 2] = (byte) (i11 >> 16);
        bArr[i12 + 3] = (byte) (i11 >> 24);
    }

    private int BytesTo32Bits(byte[] bArr, int i11) {
        return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    private int F32(int i11, int[] iArr) {
        int i12;
        int i13;
        int b02 = b0(i11);
        int b12 = b1(i11);
        int b22 = b2(i11);
        int b32 = b3(i11);
        int i14 = iArr[0];
        int i15 = iArr[1];
        int i16 = iArr[2];
        int i17 = iArr[3];
        int i18 = this.k64Cnt & 3;
        if (i18 != 0) {
            if (i18 == 1) {
                int[] iArr2 = this.gMDS0;
                byte[][] bArr = P;
                i12 = (iArr2[(bArr[0][b02] & 255) ^ b0(i14)] ^ this.gMDS1[(bArr[0][b12] & 255) ^ b1(i14)]) ^ this.gMDS2[(bArr[1][b22] & 255) ^ b2(i14)];
                i13 = this.gMDS3[(bArr[1][b32] & 255) ^ b3(i14)];
                return i12 ^ i13;
            }
            if (i18 != 2) {
                if (i18 != 3) {
                    return 0;
                }
            }
            int[] iArr3 = this.gMDS0;
            byte[][] bArr2 = P;
            i12 = (iArr3[(bArr2[0][(bArr2[0][b02] & 255) ^ b0(i15)] & 255) ^ b0(i14)] ^ this.gMDS1[(bArr2[0][(bArr2[1][b12] & 255) ^ b1(i15)] & 255) ^ b1(i14)]) ^ this.gMDS2[(bArr2[1][(bArr2[0][b22] & 255) ^ b2(i15)] & 255) ^ b2(i14)];
            i13 = this.gMDS3[(bArr2[1][(bArr2[1][b32] & 255) ^ b3(i15)] & 255) ^ b3(i14)];
            return i12 ^ i13;
        }
        byte[][] bArr3 = P;
        b02 = (bArr3[1][b02] & 255) ^ b0(i17);
        b12 = (bArr3[0][b12] & 255) ^ b1(i17);
        b22 = (bArr3[0][b22] & 255) ^ b2(i17);
        b32 = (bArr3[1][b32] & 255) ^ b3(i17);
        byte[][] bArr4 = P;
        b02 = (bArr4[1][b02] & 255) ^ b0(i16);
        b12 = (bArr4[1][b12] & 255) ^ b1(i16);
        b22 = (bArr4[0][b22] & 255) ^ b2(i16);
        b32 = (bArr4[0][b32] & 255) ^ b3(i16);
        int[] iArr32 = this.gMDS0;
        byte[][] bArr22 = P;
        i12 = (iArr32[(bArr22[0][(bArr22[0][b02] & 255) ^ b0(i15)] & 255) ^ b0(i14)] ^ this.gMDS1[(bArr22[0][(bArr22[1][b12] & 255) ^ b1(i15)] & 255) ^ b1(i14)]) ^ this.gMDS2[(bArr22[1][(bArr22[0][b22] & 255) ^ b2(i15)] & 255) ^ b2(i14)];
        i13 = this.gMDS3[(bArr22[1][(bArr22[1][b32] & 255) ^ b3(i15)] & 255) ^ b3(i14)];
        return i12 ^ i13;
    }

    private int Fe32_0(int i11) {
        int[] iArr = this.gSBox;
        return iArr[(((i11 >>> 24) & 255) * 2) + 513] ^ ((iArr[((i11 & 255) * 2) + 0] ^ iArr[(((i11 >>> 8) & 255) * 2) + 1]) ^ iArr[(((i11 >>> 16) & 255) * 2) + 512]);
    }

    private int Fe32_3(int i11) {
        int[] iArr = this.gSBox;
        return iArr[(((i11 >>> 16) & 255) * 2) + 513] ^ ((iArr[(((i11 >>> 24) & 255) * 2) + 0] ^ iArr[((i11 & 255) * 2) + 1]) ^ iArr[(((i11 >>> 8) & 255) * 2) + 512]);
    }

    private int LFSR1(int i11) {
        return ((i11 & 1) != 0 ? 180 : 0) ^ (i11 >> 1);
    }

    private int LFSR2(int i11) {
        return ((i11 >> 2) ^ ((i11 & 2) != 0 ? 180 : 0)) ^ ((i11 & 1) != 0 ? 90 : 0);
    }

    private int Mx_X(int i11) {
        return i11 ^ LFSR2(i11);
    }

    private int Mx_Y(int i11) {
        return LFSR2(i11) ^ (LFSR1(i11) ^ i11);
    }

    private int RS_MDS_Encode(int i11, int i12) {
        for (int i13 = 0; i13 < 4; i13++) {
            i12 = RS_rem(i12);
        }
        int i14 = i11 ^ i12;
        for (int i15 = 0; i15 < 4; i15++) {
            i14 = RS_rem(i14);
        }
        return i14;
    }

    private int RS_rem(int i11) {
        int i12 = (i11 >>> 24) & 255;
        int i13 = ((i12 << 1) ^ ((i12 & 128) != 0 ? RS_GF_FDBK : 0)) & 255;
        int i14 = ((i12 >>> 1) ^ ((i12 & 1) != 0 ? CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256 : 0)) ^ i13;
        return ((((i11 << 8) ^ (i14 << 24)) ^ (i13 << 16)) ^ (i14 << 8)) ^ i12;
    }

    private int b0(int i11) {
        return i11 & 255;
    }

    private int b1(int i11) {
        return (i11 >>> 8) & 255;
    }

    private int b2(int i11) {
        return (i11 >>> 16) & 255;
    }

    private int b3(int i11) {
        return (i11 >>> 24) & 255;
    }

    private void decryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int BytesTo32Bits = BytesTo32Bits(bArr, i11) ^ this.gSubKeys[4];
        int BytesTo32Bits2 = BytesTo32Bits(bArr, i11 + 4) ^ this.gSubKeys[5];
        int BytesTo32Bits3 = BytesTo32Bits(bArr, i11 + 8) ^ this.gSubKeys[6];
        int BytesTo32Bits4 = BytesTo32Bits(bArr, i11 + 12) ^ this.gSubKeys[7];
        int i13 = 39;
        for (int i14 = 0; i14 < 16; i14 += 2) {
            int Fe32_0 = Fe32_0(BytesTo32Bits);
            int Fe32_3 = Fe32_3(BytesTo32Bits2);
            int[] iArr = this.gSubKeys;
            int i15 = i13 - 1;
            int i16 = BytesTo32Bits4 ^ (((Fe32_3 * 2) + Fe32_0) + iArr[i13]);
            int i17 = i15 - 1;
            BytesTo32Bits3 = ((BytesTo32Bits3 >>> 31) | (BytesTo32Bits3 << 1)) ^ ((Fe32_0 + Fe32_3) + iArr[i15]);
            BytesTo32Bits4 = (i16 << 31) | (i16 >>> 1);
            int Fe32_02 = Fe32_0(BytesTo32Bits3);
            int Fe32_32 = Fe32_3(BytesTo32Bits4);
            int[] iArr2 = this.gSubKeys;
            int i18 = i17 - 1;
            int i19 = BytesTo32Bits2 ^ (((Fe32_32 * 2) + Fe32_02) + iArr2[i17]);
            i13 = i18 - 1;
            BytesTo32Bits = ((BytesTo32Bits >>> 31) | (BytesTo32Bits << 1)) ^ ((Fe32_02 + Fe32_32) + iArr2[i18]);
            BytesTo32Bits2 = (i19 << 31) | (i19 >>> 1);
        }
        Bits32ToBytes(this.gSubKeys[0] ^ BytesTo32Bits3, bArr2, i12);
        Bits32ToBytes(BytesTo32Bits4 ^ this.gSubKeys[1], bArr2, i12 + 4);
        Bits32ToBytes(this.gSubKeys[2] ^ BytesTo32Bits, bArr2, i12 + 8);
        Bits32ToBytes(this.gSubKeys[3] ^ BytesTo32Bits2, bArr2, i12 + 12);
    }

    private void encryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13 = 0;
        int BytesTo32Bits = BytesTo32Bits(bArr, i11) ^ this.gSubKeys[0];
        int BytesTo32Bits2 = BytesTo32Bits(bArr, i11 + 4) ^ this.gSubKeys[1];
        int BytesTo32Bits3 = BytesTo32Bits(bArr, i11 + 8) ^ this.gSubKeys[2];
        int BytesTo32Bits4 = BytesTo32Bits(bArr, i11 + 12) ^ this.gSubKeys[3];
        int i14 = 8;
        while (i13 < 16) {
            int Fe32_0 = Fe32_0(BytesTo32Bits);
            int Fe32_3 = Fe32_3(BytesTo32Bits2);
            int[] iArr = this.gSubKeys;
            int i15 = i14 + 1;
            int i16 = BytesTo32Bits3 ^ ((Fe32_0 + Fe32_3) + iArr[i14]);
            BytesTo32Bits3 = (i16 >>> 1) | (i16 << 31);
            int i17 = (BytesTo32Bits4 >>> 31) | (BytesTo32Bits4 << 1);
            int i18 = i15 + 1;
            BytesTo32Bits4 = i17 ^ ((Fe32_0 + (Fe32_3 * 2)) + iArr[i15]);
            int Fe32_02 = Fe32_0(BytesTo32Bits3);
            int Fe32_32 = Fe32_3(BytesTo32Bits4);
            int[] iArr2 = this.gSubKeys;
            int i19 = i18 + 1;
            int i21 = BytesTo32Bits ^ ((Fe32_02 + Fe32_32) + iArr2[i18]);
            BytesTo32Bits = (i21 >>> 1) | (i21 << 31);
            i13 += 2;
            BytesTo32Bits2 = ((BytesTo32Bits2 << 1) | (BytesTo32Bits2 >>> 31)) ^ ((Fe32_02 + (Fe32_32 * 2)) + iArr2[i19]);
            i14 = i19 + 1;
        }
        Bits32ToBytes(this.gSubKeys[4] ^ BytesTo32Bits3, bArr2, i12);
        Bits32ToBytes(BytesTo32Bits4 ^ this.gSubKeys[5], bArr2, i12 + 4);
        Bits32ToBytes(this.gSubKeys[6] ^ BytesTo32Bits, bArr2, i12 + 8);
        Bits32ToBytes(this.gSubKeys[7] ^ BytesTo32Bits2, bArr2, i12 + 12);
    }

    private void setKey(byte[] bArr) {
        int b02;
        int b12;
        int b22;
        int b32;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        int[] iArr3 = new int[4];
        this.gSubKeys = new int[40];
        int i15 = this.k64Cnt;
        if (i15 < 1) {
            throw new IllegalArgumentException("Key size less than 64 bits");
        }
        if (i15 <= 4) {
            for (int i16 = 0; i16 < this.k64Cnt; i16++) {
                int i17 = i16 * 8;
                iArr[i16] = BytesTo32Bits(bArr, i17);
                iArr2[i16] = BytesTo32Bits(bArr, i17 + 4);
                iArr3[(this.k64Cnt - 1) - i16] = RS_MDS_Encode(iArr[i16], iArr2[i16]);
            }
            for (int i18 = 0; i18 < 20; i18++) {
                int i19 = SK_STEP * i18;
                int F32 = F32(i19, iArr);
                int F322 = F32(i19 + SK_BUMP, iArr2);
                int i21 = (F322 >>> 24) | (F322 << 8);
                int i22 = F32 + i21;
                int[] iArr4 = this.gSubKeys;
                int i23 = i18 * 2;
                iArr4[i23] = i22;
                int i24 = i22 + i21;
                iArr4[i23 + 1] = (i24 << 9) | (i24 >>> 23);
            }
            int i25 = iArr3[0];
            int i26 = iArr3[1];
            int i27 = 2;
            int i28 = iArr3[2];
            int i29 = iArr3[3];
            this.gSBox = new int[1024];
            int i31 = 0;
            while (i31 < 256) {
                int i32 = this.k64Cnt & 3;
                if (i32 != 0) {
                    if (i32 == 1) {
                        int[] iArr5 = this.gSBox;
                        int i33 = i31 * 2;
                        int[] iArr6 = this.gMDS0;
                        byte[][] bArr2 = P;
                        iArr5[i33] = iArr6[(bArr2[0][i31] & 255) ^ b0(i25)];
                        this.gSBox[i33 + 1] = this.gMDS1[(bArr2[0][i31] & 255) ^ b1(i25)];
                        this.gSBox[i33 + 512] = this.gMDS2[(bArr2[1][i31] & 255) ^ b2(i25)];
                        this.gSBox[i33 + 513] = this.gMDS3[(bArr2[1][i31] & 255) ^ b3(i25)];
                    } else if (i32 == i27) {
                        i14 = i31;
                        i13 = i14;
                        i12 = i13;
                        i11 = i12;
                        int[] iArr7 = this.gSBox;
                        int i34 = i31 * 2;
                        int[] iArr8 = this.gMDS0;
                        byte[][] bArr3 = P;
                        iArr7[i34] = iArr8[(bArr3[0][(bArr3[0][i13] & 255) ^ b0(i26)] & 255) ^ b0(i25)];
                        this.gSBox[i34 + 1] = this.gMDS1[(bArr3[0][(bArr3[1][i12] & 255) ^ b1(i26)] & 255) ^ b1(i25)];
                        this.gSBox[i34 + 512] = this.gMDS2[(bArr3[1][(bArr3[0][i11] & 255) ^ b2(i26)] & 255) ^ b2(i25)];
                        this.gSBox[i34 + 513] = this.gMDS3[(bArr3[1][(bArr3[1][i14] & 255) ^ b3(i26)] & 255) ^ b3(i25)];
                    } else if (i32 == 3) {
                        b32 = i31;
                        b02 = b32;
                        b12 = b02;
                        b22 = b12;
                    }
                    i31++;
                    i27 = 2;
                } else {
                    byte[][] bArr4 = P;
                    b02 = (bArr4[1][i31] & 255) ^ b0(i29);
                    b12 = (bArr4[0][i31] & 255) ^ b1(i29);
                    b22 = (bArr4[0][i31] & 255) ^ b2(i29);
                    b32 = (bArr4[1][i31] & 255) ^ b3(i29);
                }
                byte[][] bArr5 = P;
                i13 = (bArr5[1][b02] & 255) ^ b0(i28);
                i12 = (bArr5[1][b12] & 255) ^ b1(i28);
                i11 = (bArr5[0][b22] & 255) ^ b2(i28);
                i14 = (bArr5[0][b32] & 255) ^ b3(i28);
                int[] iArr72 = this.gSBox;
                int i342 = i31 * 2;
                int[] iArr82 = this.gMDS0;
                byte[][] bArr32 = P;
                iArr72[i342] = iArr82[(bArr32[0][(bArr32[0][i13] & 255) ^ b0(i26)] & 255) ^ b0(i25)];
                this.gSBox[i342 + 1] = this.gMDS1[(bArr32[0][(bArr32[1][i12] & 255) ^ b1(i26)] & 255) ^ b1(i25)];
                this.gSBox[i342 + 512] = this.gMDS2[(bArr32[1][(bArr32[0][i11] & 255) ^ b2(i26)] & 255) ^ b2(i25)];
                this.gSBox[i342 + 513] = this.gMDS3[(bArr32[1][(bArr32[1][i14] & 255) ^ b3(i26)] & 255) ^ b3(i25)];
                i31++;
                i27 = 2;
            }
            return;
        }
        throw new IllegalArgumentException("Key size larger than 256 bits");
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Twofish";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            this.encrypting = z11;
            byte[] key = ((KeyParameter) cipherParameters).getKey();
            this.workingKey = key;
            this.k64Cnt = key.length / 8;
            setKey(key);
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to Twofish init - " + cipherParameters.getClass().getName());
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (this.workingKey != null) {
            if (i11 + 16 <= bArr.length) {
                if (i12 + 16 <= bArr2.length) {
                    if (this.encrypting) {
                        encryptBlock(bArr, i11, bArr2, i12);
                        return 16;
                    }
                    decryptBlock(bArr, i11, bArr2, i12);
                    return 16;
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException("Twofish not initialised");
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
        byte[] bArr = this.workingKey;
        if (bArr != null) {
            setKey(bArr);
        }
    }
}