package org.spongycastle.crypto.engines;

import androidx.recyclerview.widget.l;
import java.lang.reflect.Array;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.signers.PSSSigner;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.ec.Tnaf;
import org.spongycastle.util.Pack;

/* loaded from: classes4.dex */
public class AESLightEngine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;

    /* renamed from: m1  reason: collision with root package name */
    private static final int f43484m1 = -2139062144;

    /* renamed from: m2  reason: collision with root package name */
    private static final int f43485m2 = 2139062143;

    /* renamed from: m3  reason: collision with root package name */
    private static final int f43486m3 = 27;

    /* renamed from: m4  reason: collision with root package name */
    private static final int f43487m4 = -1061109568;

    /* renamed from: m5  reason: collision with root package name */
    private static final int f43488m5 = 1061109567;
    private int C0;
    private int C1;
    private int C2;
    private int C3;
    private int ROUNDS;
    private int[][] WorkingKey = null;
    private boolean forEncryption;
    private static final byte[] S = {99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, Byte.MIN_VALUE, -30, -21, 39, -78, 117, 9, -125, 44, 26, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, Byte.MAX_VALUE, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, PSSSigner.TRAILER_IMPLICIT, -74, -38, 33, Tnaf.POW_2_WIDTH, -1, -13, -46, -51, 12, 19, -20, 95, -105, 68, 23, -60, -89, 126, 61, 100, 93, 25, 115, 96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, -32, 50, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, -65, -26, 66, 104, 65, -103, 45, 15, -80, 84, -69, 22};
    private static final byte[] Si = {82, 9, 106, -43, 48, 54, -91, 56, -65, 64, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, 50, -90, -62, 35, 61, -18, 76, -107, 11, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, 112, 72, 80, -3, -19, -71, -38, 94, 21, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, 30, -113, -54, 63, 15, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, 79, 103, -36, -22, -105, -14, -49, -50, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, 28, 117, -33, 110, 71, -15, 26, 113, 29, 41, -59, -119, 111, -73, 98, 14, -86, 24, -66, 27, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, -64, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, -79, 18, Tnaf.POW_2_WIDTH, 89, 39, Byte.MIN_VALUE, -20, 95, 96, 81, Byte.MAX_VALUE, -87, 25, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, -17, -96, -32, 59, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, 23, 43, 4, 126, -70, 119, -42, 38, -31, 105, 20, 99, 85, 33, 12, 125};
    private static final int[] rcon = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 77, 154, 47, 94, 188, 99, 198, 151, 53, 106, 212, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 125, l.f.DEFAULT_SWIPE_ANIMATION_DURATION, 239, 197, 145};

    private static int FFmulX(int i11) {
        return (((i11 & f43484m1) >>> 7) * 27) ^ ((f43485m2 & i11) << 1);
    }

    private static int FFmulX2(int i11) {
        int i12 = i11 & f43487m4;
        int i13 = i12 ^ (i12 >>> 1);
        return (i13 >>> 5) ^ (((f43488m5 & i11) << 2) ^ (i13 >>> 2));
    }

    private void decryptBlock(int[][] iArr) {
        int i11 = this.C0;
        int i12 = this.ROUNDS;
        int i13 = i11 ^ iArr[i12][0];
        int i14 = this.C1 ^ iArr[i12][1];
        int i15 = this.C2 ^ iArr[i12][2];
        int i16 = i12 - 1;
        int i17 = iArr[i12][3] ^ this.C3;
        while (i16 > 1) {
            byte[] bArr = Si;
            int inv_mcol = inv_mcol((((bArr[i13 & 255] & 255) ^ ((bArr[(i17 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i15 >> 16) & 255] & 255) << 16)) ^ (bArr[(i14 >> 24) & 255] << 24)) ^ iArr[i16][0];
            int inv_mcol2 = inv_mcol((((bArr[i14 & 255] & 255) ^ ((bArr[(i13 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i17 >> 16) & 255] & 255) << 16)) ^ (bArr[(i15 >> 24) & 255] << 24)) ^ iArr[i16][1];
            int inv_mcol3 = inv_mcol((((bArr[i15 & 255] & 255) ^ ((bArr[(i14 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i13 >> 16) & 255] & 255) << 16)) ^ (bArr[(i17 >> 24) & 255] << 24)) ^ iArr[i16][2];
            int i18 = i16 - 1;
            int inv_mcol4 = inv_mcol((bArr[(i13 >> 24) & 255] << 24) ^ (((bArr[i17 & 255] & 255) ^ ((bArr[(i15 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i14 >> 16) & 255] & 255) << 16))) ^ iArr[i16][3];
            int inv_mcol5 = inv_mcol((((bArr[inv_mcol & 255] & 255) ^ ((bArr[(inv_mcol4 >> 8) & 255] & 255) << 8)) ^ ((bArr[(inv_mcol3 >> 16) & 255] & 255) << 16)) ^ (bArr[(inv_mcol2 >> 24) & 255] << 24)) ^ iArr[i18][0];
            int inv_mcol6 = inv_mcol((((bArr[inv_mcol2 & 255] & 255) ^ ((bArr[(inv_mcol >> 8) & 255] & 255) << 8)) ^ ((bArr[(inv_mcol4 >> 16) & 255] & 255) << 16)) ^ (bArr[(inv_mcol3 >> 24) & 255] << 24)) ^ iArr[i18][1];
            int inv_mcol7 = inv_mcol((((bArr[inv_mcol4 & 255] & 255) ^ ((bArr[(inv_mcol3 >> 8) & 255] & 255) << 8)) ^ ((bArr[(inv_mcol2 >> 16) & 255] & 255) << 16)) ^ (bArr[(inv_mcol >> 24) & 255] << 24));
            int i19 = i18 - 1;
            i17 = iArr[i18][3] ^ inv_mcol7;
            i13 = inv_mcol5;
            i14 = inv_mcol6;
            i15 = inv_mcol((((bArr[inv_mcol3 & 255] & 255) ^ ((bArr[(inv_mcol2 >> 8) & 255] & 255) << 8)) ^ ((bArr[(inv_mcol >> 16) & 255] & 255) << 16)) ^ (bArr[(inv_mcol4 >> 24) & 255] << 24)) ^ iArr[i18][2];
            i16 = i19;
        }
        byte[] bArr2 = Si;
        int inv_mcol8 = inv_mcol((((bArr2[i13 & 255] & 255) ^ ((bArr2[(i17 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i15 >> 16) & 255] & 255) << 16)) ^ (bArr2[(i14 >> 24) & 255] << 24)) ^ iArr[i16][0];
        int inv_mcol9 = inv_mcol((((bArr2[i14 & 255] & 255) ^ ((bArr2[(i13 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i17 >> 16) & 255] & 255) << 16)) ^ (bArr2[(i15 >> 24) & 255] << 24)) ^ iArr[i16][1];
        int inv_mcol10 = inv_mcol((((bArr2[i15 & 255] & 255) ^ ((bArr2[(i14 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i13 >> 16) & 255] & 255) << 16)) ^ (bArr2[(i17 >> 24) & 255] << 24)) ^ iArr[i16][2];
        int inv_mcol11 = inv_mcol((bArr2[(i13 >> 24) & 255] << 24) ^ (((bArr2[i17 & 255] & 255) ^ ((bArr2[(i15 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i14 >> 16) & 255] & 255) << 16))) ^ iArr[i16][3];
        this.C0 = ((((bArr2[inv_mcol8 & 255] & 255) ^ ((bArr2[(inv_mcol11 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(inv_mcol10 >> 16) & 255] & 255) << 16)) ^ (bArr2[(inv_mcol9 >> 24) & 255] << 24)) ^ iArr[0][0];
        this.C1 = ((((bArr2[inv_mcol9 & 255] & 255) ^ ((bArr2[(inv_mcol8 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(inv_mcol11 >> 16) & 255] & 255) << 16)) ^ (bArr2[(inv_mcol10 >> 24) & 255] << 24)) ^ iArr[0][1];
        this.C2 = ((((bArr2[inv_mcol10 & 255] & 255) ^ ((bArr2[(inv_mcol9 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(inv_mcol8 >> 16) & 255] & 255) << 16)) ^ (bArr2[(inv_mcol11 >> 24) & 255] << 24)) ^ iArr[0][2];
        this.C3 = iArr[0][3] ^ ((((bArr2[inv_mcol11 & 255] & 255) ^ ((bArr2[(inv_mcol10 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(inv_mcol9 >> 16) & 255] & 255) << 16)) ^ (bArr2[(inv_mcol8 >> 24) & 255] << 24));
    }

    private void encryptBlock(int[][] iArr) {
        int i11 = this.C0 ^ iArr[0][0];
        int i12 = this.C1 ^ iArr[0][1];
        int i13 = this.C2 ^ iArr[0][2];
        int i14 = this.C3 ^ iArr[0][3];
        int i15 = 1;
        while (i15 < this.ROUNDS - 1) {
            byte[] bArr = S;
            int mcol = mcol((((bArr[i11 & 255] & 255) ^ ((bArr[(i12 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i13 >> 16) & 255] & 255) << 16)) ^ (bArr[(i14 >> 24) & 255] << 24)) ^ iArr[i15][0];
            int mcol2 = mcol((((bArr[i12 & 255] & 255) ^ ((bArr[(i13 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i14 >> 16) & 255] & 255) << 16)) ^ (bArr[(i11 >> 24) & 255] << 24)) ^ iArr[i15][1];
            int mcol3 = mcol((((bArr[i13 & 255] & 255) ^ ((bArr[(i14 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i11 >> 16) & 255] & 255) << 16)) ^ (bArr[(i12 >> 24) & 255] << 24)) ^ iArr[i15][2];
            int i16 = i15 + 1;
            int mcol4 = mcol(((((bArr[(i11 >> 8) & 255] & 255) << 8) ^ (bArr[i14 & 255] & 255)) ^ ((bArr[(i12 >> 16) & 255] & 255) << 16)) ^ (bArr[(i13 >> 24) & 255] << 24)) ^ iArr[i15][3];
            int mcol5 = mcol((((bArr[mcol & 255] & 255) ^ ((bArr[(mcol2 >> 8) & 255] & 255) << 8)) ^ ((bArr[(mcol3 >> 16) & 255] & 255) << 16)) ^ (bArr[(mcol4 >> 24) & 255] << 24)) ^ iArr[i16][0];
            int mcol6 = mcol((((bArr[mcol2 & 255] & 255) ^ ((bArr[(mcol3 >> 8) & 255] & 255) << 8)) ^ ((bArr[(mcol4 >> 16) & 255] & 255) << 16)) ^ (bArr[(mcol >> 24) & 255] << 24)) ^ iArr[i16][1];
            int i17 = i16 + 1;
            int mcol7 = mcol((((bArr[mcol4 & 255] & 255) ^ ((bArr[(mcol >> 8) & 255] & 255) << 8)) ^ ((bArr[(mcol2 >> 16) & 255] & 255) << 16)) ^ (bArr[(mcol3 >> 24) & 255] << 24)) ^ iArr[i16][3];
            i12 = mcol6;
            i14 = mcol7;
            i11 = mcol5;
            i13 = mcol((((bArr[mcol3 & 255] & 255) ^ ((bArr[(mcol4 >> 8) & 255] & 255) << 8)) ^ ((bArr[(mcol >> 16) & 255] & 255) << 16)) ^ (bArr[(mcol2 >> 24) & 255] << 24)) ^ iArr[i16][2];
            i15 = i17;
        }
        byte[] bArr2 = S;
        int mcol8 = mcol((((bArr2[i11 & 255] & 255) ^ ((bArr2[(i12 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i13 >> 16) & 255] & 255) << 16)) ^ (bArr2[(i14 >> 24) & 255] << 24)) ^ iArr[i15][0];
        int mcol9 = mcol((((bArr2[i12 & 255] & 255) ^ ((bArr2[(i13 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i14 >> 16) & 255] & 255) << 16)) ^ (bArr2[(i11 >> 24) & 255] << 24)) ^ iArr[i15][1];
        int mcol10 = mcol((((bArr2[i13 & 255] & 255) ^ ((bArr2[(i14 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i11 >> 16) & 255] & 255) << 16)) ^ (bArr2[(i12 >> 24) & 255] << 24)) ^ iArr[i15][2];
        int i18 = i15 + 1;
        int mcol11 = mcol(((((bArr2[(i11 >> 8) & 255] & 255) << 8) ^ (bArr2[i14 & 255] & 255)) ^ ((bArr2[(i12 >> 16) & 255] & 255) << 16)) ^ (bArr2[(i13 >> 24) & 255] << 24)) ^ iArr[i15][3];
        this.C0 = iArr[i18][0] ^ ((((bArr2[mcol8 & 255] & 255) ^ ((bArr2[(mcol9 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(mcol10 >> 16) & 255] & 255) << 16)) ^ (bArr2[(mcol11 >> 24) & 255] << 24));
        this.C1 = ((((bArr2[mcol9 & 255] & 255) ^ ((bArr2[(mcol10 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(mcol11 >> 16) & 255] & 255) << 16)) ^ (bArr2[(mcol8 >> 24) & 255] << 24)) ^ iArr[i18][1];
        this.C2 = ((((bArr2[mcol10 & 255] & 255) ^ ((bArr2[(mcol11 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(mcol8 >> 16) & 255] & 255) << 16)) ^ (bArr2[(mcol9 >> 24) & 255] << 24)) ^ iArr[i18][2];
        this.C3 = iArr[i18][3] ^ ((((bArr2[mcol11 & 255] & 255) ^ ((bArr2[(mcol8 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(mcol9 >> 16) & 255] & 255) << 16)) ^ (bArr2[(mcol10 >> 24) & 255] << 24));
    }

    private int[][] generateWorkingKey(byte[] bArr, boolean z11) {
        int length = bArr.length;
        if (length >= 16 && length <= 32 && (length & 7) == 0) {
            int i11 = length >> 2;
            int i12 = i11 + 6;
            this.ROUNDS = i12;
            int[][] iArr = (int[][]) Array.newInstance(int.class, i12 + 1, 4);
            if (i11 == 4) {
                int littleEndianToInt = Pack.littleEndianToInt(bArr, 0);
                iArr[0][0] = littleEndianToInt;
                int littleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
                iArr[0][1] = littleEndianToInt2;
                int littleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
                iArr[0][2] = littleEndianToInt3;
                int littleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
                iArr[0][3] = littleEndianToInt4;
                for (int i13 = 1; i13 <= 10; i13++) {
                    littleEndianToInt ^= subWord(shift(littleEndianToInt4, 8)) ^ rcon[i13 - 1];
                    iArr[i13][0] = littleEndianToInt;
                    littleEndianToInt2 ^= littleEndianToInt;
                    iArr[i13][1] = littleEndianToInt2;
                    littleEndianToInt3 ^= littleEndianToInt2;
                    iArr[i13][2] = littleEndianToInt3;
                    littleEndianToInt4 ^= littleEndianToInt3;
                    iArr[i13][3] = littleEndianToInt4;
                }
            } else if (i11 == 6) {
                int littleEndianToInt5 = Pack.littleEndianToInt(bArr, 0);
                iArr[0][0] = littleEndianToInt5;
                int littleEndianToInt6 = Pack.littleEndianToInt(bArr, 4);
                iArr[0][1] = littleEndianToInt6;
                int littleEndianToInt7 = Pack.littleEndianToInt(bArr, 8);
                iArr[0][2] = littleEndianToInt7;
                int littleEndianToInt8 = Pack.littleEndianToInt(bArr, 12);
                iArr[0][3] = littleEndianToInt8;
                int littleEndianToInt9 = Pack.littleEndianToInt(bArr, 16);
                iArr[1][0] = littleEndianToInt9;
                int littleEndianToInt10 = Pack.littleEndianToInt(bArr, 20);
                iArr[1][1] = littleEndianToInt10;
                int subWord = littleEndianToInt5 ^ (subWord(shift(littleEndianToInt10, 8)) ^ 1);
                iArr[1][2] = subWord;
                int i14 = littleEndianToInt6 ^ subWord;
                iArr[1][3] = i14;
                int i15 = littleEndianToInt7 ^ i14;
                iArr[2][0] = i15;
                int i16 = littleEndianToInt8 ^ i15;
                iArr[2][1] = i16;
                int i17 = littleEndianToInt9 ^ i16;
                iArr[2][2] = i17;
                int i18 = littleEndianToInt10 ^ i17;
                iArr[2][3] = i18;
                int i19 = 2;
                for (int i21 = 3; i21 < 12; i21 += 3) {
                    int subWord2 = subWord(shift(i18, 8)) ^ i19;
                    int i22 = i19 << 1;
                    int i23 = subWord ^ subWord2;
                    iArr[i21][0] = i23;
                    int i24 = i14 ^ i23;
                    iArr[i21][1] = i24;
                    int i25 = i15 ^ i24;
                    iArr[i21][2] = i25;
                    int i26 = i16 ^ i25;
                    iArr[i21][3] = i26;
                    int i27 = i17 ^ i26;
                    int i28 = i21 + 1;
                    iArr[i28][0] = i27;
                    int i29 = i18 ^ i27;
                    iArr[i28][1] = i29;
                    int subWord3 = subWord(shift(i29, 8)) ^ i22;
                    i19 = i22 << 1;
                    subWord = i23 ^ subWord3;
                    iArr[i28][2] = subWord;
                    i14 = i24 ^ subWord;
                    iArr[i28][3] = i14;
                    i15 = i25 ^ i14;
                    int i31 = i21 + 2;
                    iArr[i31][0] = i15;
                    i16 = i26 ^ i15;
                    iArr[i31][1] = i16;
                    i17 = i27 ^ i16;
                    iArr[i31][2] = i17;
                    i18 = i29 ^ i17;
                    iArr[i31][3] = i18;
                }
                int subWord4 = (subWord(shift(i18, 8)) ^ i19) ^ subWord;
                iArr[12][0] = subWord4;
                int i32 = subWord4 ^ i14;
                iArr[12][1] = i32;
                int i33 = i32 ^ i15;
                iArr[12][2] = i33;
                iArr[12][3] = i33 ^ i16;
            } else if (i11 == 8) {
                int littleEndianToInt11 = Pack.littleEndianToInt(bArr, 0);
                iArr[0][0] = littleEndianToInt11;
                int littleEndianToInt12 = Pack.littleEndianToInt(bArr, 4);
                iArr[0][1] = littleEndianToInt12;
                int littleEndianToInt13 = Pack.littleEndianToInt(bArr, 8);
                iArr[0][2] = littleEndianToInt13;
                int littleEndianToInt14 = Pack.littleEndianToInt(bArr, 12);
                iArr[0][3] = littleEndianToInt14;
                int littleEndianToInt15 = Pack.littleEndianToInt(bArr, 16);
                iArr[1][0] = littleEndianToInt15;
                int littleEndianToInt16 = Pack.littleEndianToInt(bArr, 20);
                iArr[1][1] = littleEndianToInt16;
                int littleEndianToInt17 = Pack.littleEndianToInt(bArr, 24);
                iArr[1][2] = littleEndianToInt17;
                int littleEndianToInt18 = Pack.littleEndianToInt(bArr, 28);
                iArr[1][3] = littleEndianToInt18;
                int i34 = 1;
                for (int i35 = 2; i35 < 14; i35 += 2) {
                    int subWord5 = subWord(shift(littleEndianToInt18, 8)) ^ i34;
                    i34 <<= 1;
                    littleEndianToInt11 ^= subWord5;
                    iArr[i35][0] = littleEndianToInt11;
                    littleEndianToInt12 ^= littleEndianToInt11;
                    iArr[i35][1] = littleEndianToInt12;
                    littleEndianToInt13 ^= littleEndianToInt12;
                    iArr[i35][2] = littleEndianToInt13;
                    littleEndianToInt14 ^= littleEndianToInt13;
                    iArr[i35][3] = littleEndianToInt14;
                    littleEndianToInt15 ^= subWord(littleEndianToInt14);
                    int i36 = i35 + 1;
                    iArr[i36][0] = littleEndianToInt15;
                    littleEndianToInt16 ^= littleEndianToInt15;
                    iArr[i36][1] = littleEndianToInt16;
                    littleEndianToInt17 ^= littleEndianToInt16;
                    iArr[i36][2] = littleEndianToInt17;
                    littleEndianToInt18 ^= littleEndianToInt17;
                    iArr[i36][3] = littleEndianToInt18;
                }
                int subWord6 = (subWord(shift(littleEndianToInt18, 8)) ^ i34) ^ littleEndianToInt11;
                iArr[14][0] = subWord6;
                int i37 = subWord6 ^ littleEndianToInt12;
                iArr[14][1] = i37;
                int i38 = i37 ^ littleEndianToInt13;
                iArr[14][2] = i38;
                iArr[14][3] = i38 ^ littleEndianToInt14;
            } else {
                throw new IllegalStateException("Should never get here");
            }
            if (!z11) {
                for (int i39 = 1; i39 < this.ROUNDS; i39++) {
                    for (int i41 = 0; i41 < 4; i41++) {
                        iArr[i39][i41] = inv_mcol(iArr[i39][i41]);
                    }
                }
            }
            return iArr;
        }
        throw new IllegalArgumentException("Key length not 128/192/256 bits.");
    }

    private static int inv_mcol(int i11) {
        int shift = shift(i11, 8) ^ i11;
        int FFmulX = i11 ^ FFmulX(shift);
        int FFmulX2 = shift ^ FFmulX2(FFmulX);
        return FFmulX ^ (FFmulX2 ^ shift(FFmulX2, 16));
    }

    private static int mcol(int i11) {
        int shift = shift(i11, 8);
        int i12 = i11 ^ shift;
        return FFmulX(i12) ^ (shift ^ shift(i12, 16));
    }

    private void packBlock(byte[] bArr, int i11) {
        int i12 = i11 + 1;
        int i13 = this.C0;
        bArr[i11] = (byte) i13;
        int i14 = i12 + 1;
        bArr[i12] = (byte) (i13 >> 8);
        int i15 = i14 + 1;
        bArr[i14] = (byte) (i13 >> 16);
        int i16 = i15 + 1;
        bArr[i15] = (byte) (i13 >> 24);
        int i17 = i16 + 1;
        int i18 = this.C1;
        bArr[i16] = (byte) i18;
        int i19 = i17 + 1;
        bArr[i17] = (byte) (i18 >> 8);
        int i21 = i19 + 1;
        bArr[i19] = (byte) (i18 >> 16);
        int i22 = i21 + 1;
        bArr[i21] = (byte) (i18 >> 24);
        int i23 = i22 + 1;
        int i24 = this.C2;
        bArr[i22] = (byte) i24;
        int i25 = i23 + 1;
        bArr[i23] = (byte) (i24 >> 8);
        int i26 = i25 + 1;
        bArr[i25] = (byte) (i24 >> 16);
        int i27 = i26 + 1;
        bArr[i26] = (byte) (i24 >> 24);
        int i28 = i27 + 1;
        int i29 = this.C3;
        bArr[i27] = (byte) i29;
        int i31 = i28 + 1;
        bArr[i28] = (byte) (i29 >> 8);
        bArr[i31] = (byte) (i29 >> 16);
        bArr[i31 + 1] = (byte) (i29 >> 24);
    }

    private static int shift(int i11, int i12) {
        return (i11 << (-i12)) | (i11 >>> i12);
    }

    private static int subWord(int i11) {
        byte[] bArr = S;
        return (bArr[(i11 >> 24) & 255] << 24) | (bArr[i11 & 255] & 255) | ((bArr[(i11 >> 8) & 255] & 255) << 8) | ((bArr[(i11 >> 16) & 255] & 255) << 16);
    }

    private void unpackBlock(byte[] bArr, int i11) {
        int i12 = i11 + 1;
        int i13 = bArr[i11] & 255;
        this.C0 = i13;
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & 255) << 8);
        this.C0 = i15;
        int i16 = i14 + 1;
        int i17 = i15 | ((bArr[i14] & 255) << 16);
        this.C0 = i17;
        int i18 = i16 + 1;
        this.C0 = i17 | (bArr[i16] << 24);
        int i19 = i18 + 1;
        int i21 = bArr[i18] & 255;
        this.C1 = i21;
        int i22 = i19 + 1;
        int i23 = ((bArr[i19] & 255) << 8) | i21;
        this.C1 = i23;
        int i24 = i22 + 1;
        int i25 = i23 | ((bArr[i22] & 255) << 16);
        this.C1 = i25;
        int i26 = i24 + 1;
        this.C1 = i25 | (bArr[i24] << 24);
        int i27 = i26 + 1;
        int i28 = bArr[i26] & 255;
        this.C2 = i28;
        int i29 = i27 + 1;
        int i31 = ((bArr[i27] & 255) << 8) | i28;
        this.C2 = i31;
        int i32 = i29 + 1;
        int i33 = i31 | ((bArr[i29] & 255) << 16);
        this.C2 = i33;
        int i34 = i32 + 1;
        this.C2 = i33 | (bArr[i32] << 24);
        int i35 = i34 + 1;
        int i36 = bArr[i34] & 255;
        this.C3 = i36;
        int i37 = i35 + 1;
        int i38 = ((bArr[i35] & 255) << 8) | i36;
        this.C3 = i38;
        int i39 = i38 | ((bArr[i37] & 255) << 16);
        this.C3 = i39;
        this.C3 = (bArr[i37 + 1] << 24) | i39;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "AES";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            this.WorkingKey = generateWorkingKey(((KeyParameter) cipherParameters).getKey(), z11);
            this.forEncryption = z11;
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to AES init - " + cipherParameters.getClass().getName());
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (this.WorkingKey != null) {
            if (i11 + 16 <= bArr.length) {
                if (i12 + 16 <= bArr2.length) {
                    if (this.forEncryption) {
                        unpackBlock(bArr, i11);
                        encryptBlock(this.WorkingKey);
                        packBlock(bArr2, i12);
                        return 16;
                    }
                    unpackBlock(bArr, i11);
                    decryptBlock(this.WorkingKey);
                    packBlock(bArr2, i12);
                    return 16;
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException("AES engine not initialised");
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }
}