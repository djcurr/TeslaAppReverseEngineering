package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.signers.PSSSigner;
import org.spongycastle.math.ec.Tnaf;

/* loaded from: classes4.dex */
public class CamelliaLightEngine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;
    private static final int MASK8 = 255;
    private boolean _keyis128;
    private boolean initialized;
    private static final int[] SIGMA = {-1600231809, 1003262091, -1233459112, 1286239154, -957401297, -380665154, 1426019237, -237801700, 283453434, -563598051, -1336506174, -1276722691};
    private static final byte[] SBOX1 = {112, -126, 44, -20, -77, 39, -64, -27, -28, -123, 87, 53, -22, 12, -82, 65, 35, -17, 107, -109, 69, 25, -91, 33, -19, 14, 79, 78, 29, 101, -110, -67, -122, -72, -81, -113, 124, -21, 31, -50, 62, 48, -36, 95, 94, -59, 11, 26, -90, -31, 57, -54, -43, 71, 93, 61, -39, 1, 90, -42, 81, 86, 108, 77, -117, 13, -102, 102, -5, -52, -80, 45, 116, 18, 43, 32, -16, -79, -124, -103, -33, 76, -53, -62, 52, 126, 118, 5, 109, -73, -87, 49, -47, 23, 4, -41, 20, 88, 58, 97, -34, 27, 17, 28, 50, 15, -100, 22, 83, 24, -14, 34, -2, 68, -49, -78, -61, -75, 122, -111, 36, 8, -24, -88, 96, -4, 105, 80, -86, -48, -96, 125, -95, -119, 98, -105, 84, 91, 30, -107, -32, -1, 100, -46, Tnaf.POW_2_WIDTH, -60, 0, 72, -93, -9, 117, -37, -118, 3, -26, -38, 9, 63, -35, -108, -121, 92, -125, 2, -51, 74, -112, 51, 115, 103, -10, -13, -99, Byte.MAX_VALUE, -65, -30, 82, -101, -40, 38, -56, 55, -58, 59, -127, -106, 111, 75, 19, -66, 99, 46, -23, 121, -89, -116, -97, 110, PSSSigner.TRAILER_IMPLICIT, -114, 41, -11, -7, -74, 47, -3, -76, 89, 120, -104, 6, 106, -25, 70, 113, -70, -44, 37, -85, 66, -120, -94, -115, -6, 114, 7, -71, 85, -8, -18, -84, 10, 54, 73, 42, 104, 60, 56, -15, -92, 64, 40, -45, 123, -69, -55, 67, -63, 21, -29, -83, -12, 119, -57, Byte.MIN_VALUE, -98};
    private int[] subkey = new int[96];

    /* renamed from: kw  reason: collision with root package name */
    private int[] f43492kw = new int[8];

    /* renamed from: ke  reason: collision with root package name */
    private int[] f43491ke = new int[12];
    private int[] state = new int[4];

    private int bytes2int(byte[] bArr, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 < 4; i13++) {
            i12 = (i12 << 8) + (bArr[i13 + i11] & 255);
        }
        return i12;
    }

    private void camelliaF2(int[] iArr, int[] iArr2, int i11) {
        int i12 = iArr[0] ^ iArr2[i11 + 0];
        int sbox4 = sbox4(i12 & 255) | (sbox3((i12 >>> 8) & 255) << 8) | (sbox2((i12 >>> 16) & 255) << 16);
        byte[] bArr = SBOX1;
        int i13 = iArr[1] ^ iArr2[i11 + 1];
        int leftRotate = leftRotate((sbox2((i13 >>> 24) & 255) << 24) | (bArr[i13 & 255] & 255) | (sbox4((i13 >>> 8) & 255) << 8) | (sbox3((i13 >>> 16) & 255) << 16), 8);
        int i14 = (((bArr[(i12 >>> 24) & 255] & 255) << 24) | sbox4) ^ leftRotate;
        int leftRotate2 = leftRotate(leftRotate, 8) ^ i14;
        int rightRotate = rightRotate(i14, 8) ^ leftRotate2;
        iArr[2] = (leftRotate(leftRotate2, 16) ^ rightRotate) ^ iArr[2];
        iArr[3] = leftRotate(rightRotate, 8) ^ iArr[3];
        int i15 = iArr[2] ^ iArr2[i11 + 2];
        int sbox42 = ((bArr[(i15 >>> 24) & 255] & 255) << 24) | sbox4(i15 & 255) | (sbox3((i15 >>> 8) & 255) << 8) | (sbox2((i15 >>> 16) & 255) << 16);
        int i16 = iArr2[i11 + 3] ^ iArr[3];
        int leftRotate3 = leftRotate((sbox2((i16 >>> 24) & 255) << 24) | (bArr[i16 & 255] & 255) | (sbox4((i16 >>> 8) & 255) << 8) | (sbox3((i16 >>> 16) & 255) << 16), 8);
        int i17 = sbox42 ^ leftRotate3;
        int leftRotate4 = leftRotate(leftRotate3, 8) ^ i17;
        int rightRotate2 = rightRotate(i17, 8) ^ leftRotate4;
        iArr[0] = (leftRotate(leftRotate4, 16) ^ rightRotate2) ^ iArr[0];
        iArr[1] = iArr[1] ^ leftRotate(rightRotate2, 8);
    }

    private void camelliaFLs(int[] iArr, int[] iArr2, int i11) {
        iArr[1] = iArr[1] ^ leftRotate(iArr[0] & iArr2[i11 + 0], 1);
        iArr[0] = iArr[0] ^ (iArr2[i11 + 1] | iArr[1]);
        iArr[2] = iArr[2] ^ (iArr2[i11 + 3] | iArr[3]);
        iArr[3] = leftRotate(iArr2[i11 + 2] & iArr[2], 1) ^ iArr[3];
    }

    private static void decroldq(int i11, int[] iArr, int i12, int[] iArr2, int i13) {
        int i14 = i13 + 2;
        int i15 = i12 + 0;
        int i16 = i12 + 1;
        int i17 = 32 - i11;
        iArr2[i14] = (iArr[i15] << i11) | (iArr[i16] >>> i17);
        int i18 = i13 + 3;
        int i19 = i12 + 2;
        iArr2[i18] = (iArr[i16] << i11) | (iArr[i19] >>> i17);
        int i21 = i13 + 0;
        int i22 = i12 + 3;
        iArr2[i21] = (iArr[i19] << i11) | (iArr[i22] >>> i17);
        int i23 = i13 + 1;
        iArr2[i23] = (iArr[i22] << i11) | (iArr[i15] >>> i17);
        iArr[i15] = iArr2[i14];
        iArr[i16] = iArr2[i18];
        iArr[i19] = iArr2[i21];
        iArr[i22] = iArr2[i23];
    }

    private static void decroldqo32(int i11, int[] iArr, int i12, int[] iArr2, int i13) {
        int i14 = i13 + 2;
        int i15 = i12 + 1;
        int i16 = i11 - 32;
        int i17 = i12 + 2;
        int i18 = 64 - i11;
        iArr2[i14] = (iArr[i15] << i16) | (iArr[i17] >>> i18);
        int i19 = i13 + 3;
        int i21 = i12 + 3;
        iArr2[i19] = (iArr[i17] << i16) | (iArr[i21] >>> i18);
        int i22 = i13 + 0;
        int i23 = i12 + 0;
        iArr2[i22] = (iArr[i21] << i16) | (iArr[i23] >>> i18);
        int i24 = i13 + 1;
        iArr2[i24] = (iArr[i15] >>> i18) | (iArr[i23] << i16);
        iArr[i23] = iArr2[i14];
        iArr[i15] = iArr2[i19];
        iArr[i17] = iArr2[i22];
        iArr[i21] = iArr2[i24];
    }

    private void int2bytes(int i11, byte[] bArr, int i12) {
        for (int i13 = 0; i13 < 4; i13++) {
            bArr[(3 - i13) + i12] = (byte) i11;
            i11 >>>= 8;
        }
    }

    private byte lRot8(byte b11, int i11) {
        return (byte) (((b11 & 255) >>> (8 - i11)) | (b11 << i11));
    }

    private static int leftRotate(int i11, int i12) {
        return (i11 << i12) + (i11 >>> (32 - i12));
    }

    private int processBlock128(byte[] bArr, int i11, byte[] bArr2, int i12) {
        for (int i13 = 0; i13 < 4; i13++) {
            this.state[i13] = bytes2int(bArr, (i13 * 4) + i11);
            int[] iArr = this.state;
            iArr[i13] = iArr[i13] ^ this.f43492kw[i13];
        }
        camelliaF2(this.state, this.subkey, 0);
        camelliaF2(this.state, this.subkey, 4);
        camelliaF2(this.state, this.subkey, 8);
        camelliaFLs(this.state, this.f43491ke, 0);
        camelliaF2(this.state, this.subkey, 12);
        camelliaF2(this.state, this.subkey, 16);
        camelliaF2(this.state, this.subkey, 20);
        camelliaFLs(this.state, this.f43491ke, 4);
        camelliaF2(this.state, this.subkey, 24);
        camelliaF2(this.state, this.subkey, 28);
        camelliaF2(this.state, this.subkey, 32);
        int[] iArr2 = this.state;
        int i14 = iArr2[2];
        int[] iArr3 = this.f43492kw;
        iArr2[2] = iArr3[4] ^ i14;
        iArr2[3] = iArr2[3] ^ iArr3[5];
        iArr2[0] = iArr2[0] ^ iArr3[6];
        iArr2[1] = iArr3[7] ^ iArr2[1];
        int2bytes(iArr2[2], bArr2, i12);
        int2bytes(this.state[3], bArr2, i12 + 4);
        int2bytes(this.state[0], bArr2, i12 + 8);
        int2bytes(this.state[1], bArr2, i12 + 12);
        return 16;
    }

    private int processBlock192or256(byte[] bArr, int i11, byte[] bArr2, int i12) {
        for (int i13 = 0; i13 < 4; i13++) {
            this.state[i13] = bytes2int(bArr, (i13 * 4) + i11);
            int[] iArr = this.state;
            iArr[i13] = iArr[i13] ^ this.f43492kw[i13];
        }
        camelliaF2(this.state, this.subkey, 0);
        camelliaF2(this.state, this.subkey, 4);
        camelliaF2(this.state, this.subkey, 8);
        camelliaFLs(this.state, this.f43491ke, 0);
        camelliaF2(this.state, this.subkey, 12);
        camelliaF2(this.state, this.subkey, 16);
        camelliaF2(this.state, this.subkey, 20);
        camelliaFLs(this.state, this.f43491ke, 4);
        camelliaF2(this.state, this.subkey, 24);
        camelliaF2(this.state, this.subkey, 28);
        camelliaF2(this.state, this.subkey, 32);
        camelliaFLs(this.state, this.f43491ke, 8);
        camelliaF2(this.state, this.subkey, 36);
        camelliaF2(this.state, this.subkey, 40);
        camelliaF2(this.state, this.subkey, 44);
        int[] iArr2 = this.state;
        int i14 = iArr2[2];
        int[] iArr3 = this.f43492kw;
        iArr2[2] = i14 ^ iArr3[4];
        iArr2[3] = iArr2[3] ^ iArr3[5];
        iArr2[0] = iArr2[0] ^ iArr3[6];
        iArr2[1] = iArr3[7] ^ iArr2[1];
        int2bytes(iArr2[2], bArr2, i12);
        int2bytes(this.state[3], bArr2, i12 + 4);
        int2bytes(this.state[0], bArr2, i12 + 8);
        int2bytes(this.state[1], bArr2, i12 + 12);
        return 16;
    }

    private static int rightRotate(int i11, int i12) {
        return (i11 >>> i12) + (i11 << (32 - i12));
    }

    private static void roldq(int i11, int[] iArr, int i12, int[] iArr2, int i13) {
        int i14 = i13 + 0;
        int i15 = i12 + 0;
        int i16 = i12 + 1;
        int i17 = 32 - i11;
        iArr2[i14] = (iArr[i15] << i11) | (iArr[i16] >>> i17);
        int i18 = i13 + 1;
        int i19 = i12 + 2;
        iArr2[i18] = (iArr[i16] << i11) | (iArr[i19] >>> i17);
        int i21 = i13 + 2;
        int i22 = i12 + 3;
        iArr2[i21] = (iArr[i19] << i11) | (iArr[i22] >>> i17);
        int i23 = i13 + 3;
        iArr2[i23] = (iArr[i22] << i11) | (iArr[i15] >>> i17);
        iArr[i15] = iArr2[i14];
        iArr[i16] = iArr2[i18];
        iArr[i19] = iArr2[i21];
        iArr[i22] = iArr2[i23];
    }

    private static void roldqo32(int i11, int[] iArr, int i12, int[] iArr2, int i13) {
        int i14 = i13 + 0;
        int i15 = i12 + 1;
        int i16 = i11 - 32;
        int i17 = i12 + 2;
        int i18 = 64 - i11;
        iArr2[i14] = (iArr[i15] << i16) | (iArr[i17] >>> i18);
        int i19 = i13 + 1;
        int i21 = i12 + 3;
        iArr2[i19] = (iArr[i17] << i16) | (iArr[i21] >>> i18);
        int i22 = i13 + 2;
        int i23 = i12 + 0;
        iArr2[i22] = (iArr[i21] << i16) | (iArr[i23] >>> i18);
        int i24 = i13 + 3;
        iArr2[i24] = (iArr[i15] >>> i18) | (iArr[i23] << i16);
        iArr[i23] = iArr2[i14];
        iArr[i15] = iArr2[i19];
        iArr[i17] = iArr2[i22];
        iArr[i21] = iArr2[i24];
    }

    private int sbox2(int i11) {
        return lRot8(SBOX1[i11], 1) & 255;
    }

    private int sbox3(int i11) {
        return lRot8(SBOX1[i11], 7) & 255;
    }

    private int sbox4(int i11) {
        return SBOX1[lRot8((byte) i11, 1) & 255] & 255;
    }

    private void setKey(boolean z11, byte[] bArr) {
        int[] iArr = new int[8];
        int[] iArr2 = new int[4];
        int[] iArr3 = new int[4];
        int[] iArr4 = new int[4];
        int length = bArr.length;
        if (length == 16) {
            this._keyis128 = true;
            iArr[0] = bytes2int(bArr, 0);
            iArr[1] = bytes2int(bArr, 4);
            iArr[2] = bytes2int(bArr, 8);
            iArr[3] = bytes2int(bArr, 12);
            iArr[7] = 0;
            iArr[6] = 0;
            iArr[5] = 0;
            iArr[4] = 0;
        } else if (length == 24) {
            iArr[0] = bytes2int(bArr, 0);
            iArr[1] = bytes2int(bArr, 4);
            iArr[2] = bytes2int(bArr, 8);
            iArr[3] = bytes2int(bArr, 12);
            iArr[4] = bytes2int(bArr, 16);
            iArr[5] = bytes2int(bArr, 20);
            iArr[6] = ~iArr[4];
            iArr[7] = ~iArr[5];
            this._keyis128 = false;
        } else if (length == 32) {
            iArr[0] = bytes2int(bArr, 0);
            iArr[1] = bytes2int(bArr, 4);
            iArr[2] = bytes2int(bArr, 8);
            iArr[3] = bytes2int(bArr, 12);
            iArr[4] = bytes2int(bArr, 16);
            iArr[5] = bytes2int(bArr, 20);
            iArr[6] = bytes2int(bArr, 24);
            iArr[7] = bytes2int(bArr, 28);
            this._keyis128 = false;
        } else {
            throw new IllegalArgumentException("key sizes are only 16/24/32 bytes.");
        }
        for (int i11 = 0; i11 < 4; i11++) {
            iArr2[i11] = iArr[i11] ^ iArr[i11 + 4];
        }
        camelliaF2(iArr2, SIGMA, 0);
        for (int i12 = 0; i12 < 4; i12++) {
            iArr2[i12] = iArr2[i12] ^ iArr[i12];
        }
        camelliaF2(iArr2, SIGMA, 4);
        if (this._keyis128) {
            if (z11) {
                int[] iArr5 = this.f43492kw;
                iArr5[0] = iArr[0];
                iArr5[1] = iArr[1];
                iArr5[2] = iArr[2];
                iArr5[3] = iArr[3];
                roldq(15, iArr, 0, this.subkey, 4);
                roldq(30, iArr, 0, this.subkey, 12);
                roldq(15, iArr, 0, iArr4, 0);
                int[] iArr6 = this.subkey;
                iArr6[18] = iArr4[2];
                iArr6[19] = iArr4[3];
                roldq(17, iArr, 0, this.f43491ke, 4);
                roldq(17, iArr, 0, this.subkey, 24);
                roldq(17, iArr, 0, this.subkey, 32);
                int[] iArr7 = this.subkey;
                iArr7[0] = iArr2[0];
                iArr7[1] = iArr2[1];
                iArr7[2] = iArr2[2];
                iArr7[3] = iArr2[3];
                roldq(15, iArr2, 0, iArr7, 8);
                roldq(15, iArr2, 0, this.f43491ke, 0);
                roldq(15, iArr2, 0, iArr4, 0);
                int[] iArr8 = this.subkey;
                iArr8[16] = iArr4[0];
                iArr8[17] = iArr4[1];
                roldq(15, iArr2, 0, iArr8, 20);
                roldqo32(34, iArr2, 0, this.subkey, 28);
                roldq(17, iArr2, 0, this.f43492kw, 4);
                return;
            }
            int[] iArr9 = this.f43492kw;
            iArr9[4] = iArr[0];
            iArr9[5] = iArr[1];
            iArr9[6] = iArr[2];
            iArr9[7] = iArr[3];
            decroldq(15, iArr, 0, this.subkey, 28);
            decroldq(30, iArr, 0, this.subkey, 20);
            decroldq(15, iArr, 0, iArr4, 0);
            int[] iArr10 = this.subkey;
            iArr10[16] = iArr4[0];
            iArr10[17] = iArr4[1];
            decroldq(17, iArr, 0, this.f43491ke, 0);
            decroldq(17, iArr, 0, this.subkey, 8);
            decroldq(17, iArr, 0, this.subkey, 0);
            int[] iArr11 = this.subkey;
            iArr11[34] = iArr2[0];
            iArr11[35] = iArr2[1];
            iArr11[32] = iArr2[2];
            iArr11[33] = iArr2[3];
            decroldq(15, iArr2, 0, iArr11, 24);
            decroldq(15, iArr2, 0, this.f43491ke, 4);
            decroldq(15, iArr2, 0, iArr4, 0);
            int[] iArr12 = this.subkey;
            iArr12[18] = iArr4[2];
            iArr12[19] = iArr4[3];
            decroldq(15, iArr2, 0, iArr12, 12);
            decroldqo32(34, iArr2, 0, this.subkey, 4);
            roldq(17, iArr2, 0, this.f43492kw, 0);
            return;
        }
        for (int i13 = 0; i13 < 4; i13++) {
            iArr3[i13] = iArr2[i13] ^ iArr[i13 + 4];
        }
        camelliaF2(iArr3, SIGMA, 8);
        if (z11) {
            int[] iArr13 = this.f43492kw;
            iArr13[0] = iArr[0];
            iArr13[1] = iArr[1];
            iArr13[2] = iArr[2];
            iArr13[3] = iArr[3];
            roldqo32(45, iArr, 0, this.subkey, 16);
            roldq(15, iArr, 0, this.f43491ke, 4);
            roldq(17, iArr, 0, this.subkey, 32);
            roldqo32(34, iArr, 0, this.subkey, 44);
            roldq(15, iArr, 4, this.subkey, 4);
            roldq(15, iArr, 4, this.f43491ke, 0);
            roldq(30, iArr, 4, this.subkey, 24);
            roldqo32(34, iArr, 4, this.subkey, 36);
            roldq(15, iArr2, 0, this.subkey, 8);
            roldq(30, iArr2, 0, this.subkey, 20);
            int[] iArr14 = this.f43491ke;
            iArr14[8] = iArr2[1];
            iArr14[9] = iArr2[2];
            iArr14[10] = iArr2[3];
            iArr14[11] = iArr2[0];
            roldqo32(49, iArr2, 0, this.subkey, 40);
            int[] iArr15 = this.subkey;
            iArr15[0] = iArr3[0];
            iArr15[1] = iArr3[1];
            iArr15[2] = iArr3[2];
            iArr15[3] = iArr3[3];
            roldq(30, iArr3, 0, iArr15, 12);
            roldq(30, iArr3, 0, this.subkey, 28);
            roldqo32(51, iArr3, 0, this.f43492kw, 4);
            return;
        }
        int[] iArr16 = this.f43492kw;
        iArr16[4] = iArr[0];
        iArr16[5] = iArr[1];
        iArr16[6] = iArr[2];
        iArr16[7] = iArr[3];
        decroldqo32(45, iArr, 0, this.subkey, 28);
        decroldq(15, iArr, 0, this.f43491ke, 4);
        decroldq(17, iArr, 0, this.subkey, 12);
        decroldqo32(34, iArr, 0, this.subkey, 0);
        decroldq(15, iArr, 4, this.subkey, 40);
        decroldq(15, iArr, 4, this.f43491ke, 8);
        decroldq(30, iArr, 4, this.subkey, 20);
        decroldqo32(34, iArr, 4, this.subkey, 8);
        decroldq(15, iArr2, 0, this.subkey, 36);
        decroldq(30, iArr2, 0, this.subkey, 24);
        int[] iArr17 = this.f43491ke;
        iArr17[2] = iArr2[1];
        iArr17[3] = iArr2[2];
        iArr17[0] = iArr2[3];
        iArr17[1] = iArr2[0];
        decroldqo32(49, iArr2, 0, this.subkey, 4);
        int[] iArr18 = this.subkey;
        iArr18[46] = iArr3[0];
        iArr18[47] = iArr3[1];
        iArr18[44] = iArr3[2];
        iArr18[45] = iArr3[3];
        decroldq(30, iArr3, 0, iArr18, 32);
        decroldq(30, iArr3, 0, this.subkey, 16);
        roldqo32(51, iArr3, 0, this.f43492kw, 0);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Camellia";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            setKey(z11, ((KeyParameter) cipherParameters).getKey());
            this.initialized = true;
            return;
        }
        throw new IllegalArgumentException("only simple KeyParameter expected.");
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (this.initialized) {
            if (i11 + 16 <= bArr.length) {
                if (i12 + 16 <= bArr2.length) {
                    if (this._keyis128) {
                        return processBlock128(bArr, i11, bArr2, i12);
                    }
                    return processBlock192or256(bArr, i11, bArr2, i12);
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException("Camellia is not initialized");
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }
}