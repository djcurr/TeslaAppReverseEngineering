package org.spongycastle.crypto.engines;

import com.plaid.internal.d;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Settings;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.math.ec.Tnaf;

/* loaded from: classes4.dex */
public class DESEngine implements BlockCipher {
    protected static final int BLOCK_SIZE = 8;
    private int[] workingKey = null;
    private static final short[] bytebit = {128, 64, 32, 16, 8, 4, 2, 1};
    private static final int[] bigbyte = {8388608, 4194304, PKIFailureInfo.badSenderNonce, PKIFailureInfo.badCertTemplate, PKIFailureInfo.signerNotTrusted, 262144, 131072, 65536, 32768, 16384, PKIFailureInfo.certRevoked, 4096, 2048, 1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};
    private static final byte[] pc1 = {56, 48, 40, 32, 24, Tnaf.POW_2_WIDTH, 8, 0, 57, 49, 41, 33, 25, 17, 9, 1, 58, 50, 42, 34, 26, 18, 10, 2, 59, 51, 43, 35, 62, 54, 46, 38, 30, 22, 14, 6, 61, 53, 45, 37, 29, 21, 13, 5, 60, 52, 44, 36, 28, 20, 12, 4, 27, 19, 11, 3};
    private static final byte[] totrot = {1, 2, 4, 6, 8, 10, 12, 14, 15, 17, 19, 21, 23, 25, 27, 28};
    private static final byte[] pc2 = {13, Tnaf.POW_2_WIDTH, 10, 23, 0, 4, 2, 27, 14, 5, 20, 9, 22, 18, 11, 3, 25, 7, 15, 6, 26, 19, 12, 1, 40, 51, 30, 36, 46, 54, 29, 39, 50, 44, 32, 47, 43, 48, 38, 55, 33, 52, 45, 41, 49, 35, 28, 31};
    private static final int[] SP1 = {16843776, 0, 65536, 16843780, 16842756, 66564, 4, 65536, 1024, 16843776, 16843780, 1024, 16778244, 16842756, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, 4, 1028, 16778240, 16778240, 66560, 66560, 16842752, 16842752, 16778244, 65540, 16777220, 16777220, 65540, 0, 1028, 66564, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, 65536, 16843780, 4, 16842752, 16843776, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, 1024, 16842756, 65536, 66560, 16777220, 1024, 4, 16778244, 66564, 16843780, 65540, 16842752, 16778244, 16777220, 1028, 66564, 16843776, 1028, 16778240, 16778240, 0, 65540, 66560, 0, 16842756};
    private static final int[] SP2 = {-2146402272, -2147450880, 32768, 1081376, PKIFailureInfo.badCertTemplate, 32, -2146435040, -2147450848, -2147483616, -2146402272, -2146402304, Integer.MIN_VALUE, -2147450880, PKIFailureInfo.badCertTemplate, 32, -2146435040, 1081344, 1048608, -2147450848, 0, Integer.MIN_VALUE, 32768, 1081376, -2146435072, 1048608, -2147483616, 0, 1081344, 32800, -2146402304, -2146435072, 32800, 0, 1081376, -2146435040, PKIFailureInfo.badCertTemplate, -2147450848, -2146435072, -2146402304, 32768, -2146435072, -2147450880, 32, -2146402272, 1081376, 32, 32768, Integer.MIN_VALUE, 32800, -2146402304, PKIFailureInfo.badCertTemplate, -2147483616, 1048608, -2147450848, -2147483616, 1048608, 1081344, 0, -2147450880, 32800, Integer.MIN_VALUE, -2146435040, -2146402272, 1081344};
    private static final int[] SP3 = {520, 134349312, 0, 134348808, 134218240, 0, 131592, 134218240, 131080, 134217736, 134217736, 131072, 134349320, 131080, 134348800, 520, 134217728, 8, 134349312, 512, 131584, 134348800, 134348808, 131592, 134218248, 131584, 131072, 134218248, 8, 134349320, 512, 134217728, 134349312, 134217728, 131080, 520, 131072, 134349312, 134218240, 0, 512, 131080, 134349320, 134218240, 134217736, 512, 0, 134348808, 134218248, 131072, 134217728, 134349320, 8, 131592, 131584, 134217736, 134348800, 134218248, 520, 134348800, 131592, 8, 134348808, 131584};
    private static final int[] SP4 = {8396801, 8321, 8321, 128, 8396928, 8388737, 8388609, 8193, 0, 8396800, 8396800, 8396929, d.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 0, 8388736, 8388609, 1, PKIFailureInfo.certRevoked, 8388608, 8396801, 128, 8388608, 8193, 8320, 8388737, 1, 8320, 8388736, PKIFailureInfo.certRevoked, 8396928, 8396929, d.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 8388736, 8388609, 8396800, 8396929, d.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 0, 0, 8396800, 8320, 8388736, 8388737, 1, 8396801, 8321, 8321, 128, 8396929, d.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 1, PKIFailureInfo.certRevoked, 8388609, 8193, 8396928, 8388737, 8193, 8320, 8388608, 8396801, 128, 8388608, PKIFailureInfo.certRevoked, 8396928};
    private static final int[] SP5 = {256, 34078976, 34078720, 1107296512, PKIFailureInfo.signerNotTrusted, 256, 1073741824, 34078720, 1074266368, PKIFailureInfo.signerNotTrusted, 33554688, 1074266368, 1107296512, 1107820544, 524544, 1073741824, 33554432, 1074266112, 1074266112, 0, 1073742080, 1107820800, 1107820800, 33554688, 1107820544, 1073742080, 0, 1107296256, 34078976, 33554432, 1107296256, 524544, PKIFailureInfo.signerNotTrusted, 1107296512, 256, 33554432, 1073741824, 34078720, 1107296512, 1074266368, 33554688, 1073741824, 1107820544, 34078976, 1074266368, 256, 33554432, 1107820544, 1107820800, 524544, 1107296256, 1107820800, 34078720, 0, 1074266112, 1107296256, 524544, 33554688, 1073742080, PKIFailureInfo.signerNotTrusted, 0, 1074266112, 34078976, 1073742080};
    private static final int[] SP6 = {536870928, 541065216, 16384, 541081616, 541065216, 16, 541081616, 4194304, 536887296, 4210704, 4194304, 536870928, 4194320, 536887296, PKIFailureInfo.duplicateCertReq, 16400, 0, 4194320, 536887312, 16384, 4210688, 536887312, 16, 541065232, 541065232, 0, 4210704, 541081600, 16400, 4210688, 541081600, PKIFailureInfo.duplicateCertReq, 536887296, 16, 541065232, 4210688, 541081616, 4194304, 16400, 536870928, 4194304, 536887296, PKIFailureInfo.duplicateCertReq, 16400, 536870928, 541081616, 4210688, 541065216, 4210704, 541081600, 0, 541065232, 16, 16384, 541065216, 4210704, 16384, 4194320, 536887312, 0, 541081600, PKIFailureInfo.duplicateCertReq, 4194320, 536887312};
    private static final int[] SP7 = {PKIFailureInfo.badSenderNonce, 69206018, 67110914, 0, 2048, 67110914, 2099202, 69208064, 69208066, PKIFailureInfo.badSenderNonce, 0, 67108866, 2, 67108864, 69206018, 2050, 67110912, 2099202, 2097154, 67110912, 67108866, 69206016, 69208064, 2097154, 69206016, 2048, 2050, 69208066, 2099200, 2, 67108864, 2099200, 67108864, 2099200, PKIFailureInfo.badSenderNonce, 67110914, 67110914, 69206018, 69206018, 2, 2097154, 67108864, 67110912, PKIFailureInfo.badSenderNonce, 69208064, 2050, 2099202, 69208064, 2050, 67108866, 69208066, 69206016, 2099200, 0, 2, 69208066, 0, 2099202, 69206016, 2048, 67108866, 67110912, 2048, 2097154};
    private static final int[] SP8 = {268439616, 4096, 262144, 268701760, 268435456, 268439616, 64, 268435456, 262208, 268697600, 268701760, 266240, 268701696, 266304, 4096, 64, 268697600, 268435520, 268439552, 4160, 266240, 262208, 268697664, 268701696, 4160, 0, 0, 268697664, 268435520, 268439552, 266304, 262144, 266304, 262144, 268701696, 4096, 64, 268697664, 4096, 266304, 268439552, 64, 268435520, 268697600, 268697664, 268435456, 262144, 268439616, 0, 268701760, 262208, 268435520, 268697600, 268439552, 268439616, 0, 268701760, 266240, 266240, 4160, 4160, 262208, 268435456, 268701696};

    /* JADX INFO: Access modifiers changed from: protected */
    public void desFunc(int[] iArr, byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13 = ((bArr[i11 + 0] & 255) << 24) | ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11 + 2] & 255) << 8) | (bArr[i11 + 3] & 255);
        int i14 = ((bArr[i11 + 4] & 255) << 24) | ((bArr[i11 + 5] & 255) << 16) | ((bArr[i11 + 6] & 255) << 8) | (bArr[i11 + 7] & 255);
        int i15 = ((i13 >>> 4) ^ i14) & 252645135;
        int i16 = i14 ^ i15;
        int i17 = i13 ^ (i15 << 4);
        int i18 = ((i17 >>> 16) ^ i16) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        int i19 = i16 ^ i18;
        int i21 = i17 ^ (i18 << 16);
        int i22 = ((i19 >>> 2) ^ i21) & 858993459;
        int i23 = i21 ^ i22;
        int i24 = i19 ^ (i22 << 2);
        int i25 = ((i24 >>> 8) ^ i23) & 16711935;
        int i26 = i23 ^ i25;
        int i27 = i24 ^ (i25 << 8);
        int i28 = (((i27 >>> 31) & 1) | (i27 << 1)) & (-1);
        int i29 = (i26 ^ i28) & (-1431655766);
        int i31 = i26 ^ i29;
        int i32 = i28 ^ i29;
        int i33 = (((i31 >>> 31) & 1) | (i31 << 1)) & (-1);
        for (int i34 = 0; i34 < 8; i34++) {
            int i35 = i34 * 4;
            int i36 = ((i32 << 28) | (i32 >>> 4)) ^ iArr[i35 + 0];
            int[] iArr2 = SP7;
            int i37 = iArr2[i36 & 63];
            int[] iArr3 = SP5;
            int i38 = i37 | iArr3[(i36 >>> 8) & 63];
            int[] iArr4 = SP3;
            int i39 = i38 | iArr4[(i36 >>> 16) & 63];
            int[] iArr5 = SP1;
            int i41 = iArr5[(i36 >>> 24) & 63] | i39;
            int i42 = iArr[i35 + 1] ^ i32;
            int[] iArr6 = SP8;
            int i43 = i41 | iArr6[i42 & 63];
            int[] iArr7 = SP6;
            int i44 = i43 | iArr7[(i42 >>> 8) & 63];
            int[] iArr8 = SP4;
            int i45 = i44 | iArr8[(i42 >>> 16) & 63];
            int[] iArr9 = SP2;
            i33 ^= i45 | iArr9[(i42 >>> 24) & 63];
            int i46 = ((i33 << 28) | (i33 >>> 4)) ^ iArr[i35 + 2];
            int i47 = iArr5[(i46 >>> 24) & 63];
            int i48 = iArr[i35 + 3] ^ i33;
            i32 ^= ((((i47 | ((iArr2[i46 & 63] | iArr3[(i46 >>> 8) & 63]) | iArr4[(i46 >>> 16) & 63])) | iArr6[i48 & 63]) | iArr7[(i48 >>> 8) & 63]) | iArr8[(i48 >>> 16) & 63]) | iArr9[(i48 >>> 24) & 63];
        }
        int i49 = (i32 >>> 1) | (i32 << 31);
        int i51 = (i33 ^ i49) & (-1431655766);
        int i52 = i33 ^ i51;
        int i53 = i49 ^ i51;
        int i54 = (i52 >>> 1) | (i52 << 31);
        int i55 = ((i54 >>> 8) ^ i53) & 16711935;
        int i56 = i53 ^ i55;
        int i57 = i54 ^ (i55 << 8);
        int i58 = ((i57 >>> 2) ^ i56) & 858993459;
        int i59 = i56 ^ i58;
        int i61 = i57 ^ (i58 << 2);
        int i62 = ((i59 >>> 16) ^ i61) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        int i63 = i61 ^ i62;
        int i64 = i59 ^ (i62 << 16);
        int i65 = ((i64 >>> 4) ^ i63) & 252645135;
        int i66 = i63 ^ i65;
        int i67 = i64 ^ (i65 << 4);
        bArr2[i12 + 0] = (byte) ((i67 >>> 24) & 255);
        bArr2[i12 + 1] = (byte) ((i67 >>> 16) & 255);
        bArr2[i12 + 2] = (byte) ((i67 >>> 8) & 255);
        bArr2[i12 + 3] = (byte) (i67 & 255);
        bArr2[i12 + 4] = (byte) ((i66 >>> 24) & 255);
        bArr2[i12 + 5] = (byte) ((i66 >>> 16) & 255);
        bArr2[i12 + 6] = (byte) ((i66 >>> 8) & 255);
        bArr2[i12 + 7] = (byte) (i66 & 255);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int[] generateWorkingKey(boolean z11, byte[] bArr) {
        int i11;
        int[] iArr = new int[32];
        boolean[] zArr = new boolean[56];
        boolean[] zArr2 = new boolean[56];
        int i12 = 0;
        while (true) {
            boolean z12 = true;
            if (i12 >= 56) {
                break;
            }
            byte b11 = pc1[i12];
            if ((bytebit[b11 & 7] & bArr[b11 >>> 3]) == 0) {
                z12 = false;
            }
            zArr[i12] = z12;
            i12++;
        }
        for (int i13 = 0; i13 < 16; i13++) {
            int i14 = z11 ? i13 << 1 : (15 - i13) << 1;
            int i15 = i14 + 1;
            iArr[i15] = 0;
            iArr[i14] = 0;
            int i16 = 0;
            while (true) {
                if (i16 >= 28) {
                    break;
                }
                int i17 = totrot[i13] + i16;
                if (i17 < 28) {
                    zArr2[i16] = zArr[i17];
                } else {
                    zArr2[i16] = zArr[i17 - 28];
                }
                i16++;
            }
            for (i11 = 28; i11 < 56; i11++) {
                int i18 = totrot[i13] + i11;
                if (i18 < 56) {
                    zArr2[i11] = zArr[i18];
                } else {
                    zArr2[i11] = zArr[i18 - 28];
                }
            }
            for (int i19 = 0; i19 < 24; i19++) {
                byte[] bArr2 = pc2;
                if (zArr2[bArr2[i19]]) {
                    iArr[i14] = iArr[i14] | bigbyte[i19];
                }
                if (zArr2[bArr2[i19 + 24]]) {
                    iArr[i15] = iArr[i15] | bigbyte[i19];
                }
            }
        }
        for (int i21 = 0; i21 != 32; i21 += 2) {
            int i22 = iArr[i21];
            int i23 = i21 + 1;
            int i24 = iArr[i23];
            iArr[i21] = ((16515072 & i24) >>> 10) | ((i22 & 16515072) << 6) | ((i22 & 4032) << 10) | ((i24 & 4032) >>> 6);
            iArr[i23] = ((i22 & 63) << 16) | ((i22 & 258048) << 12) | ((258048 & i24) >>> 4) | (i24 & 63);
        }
        return iArr;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "DES";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            KeyParameter keyParameter = (KeyParameter) cipherParameters;
            if (keyParameter.getKey().length <= 8) {
                this.workingKey = generateWorkingKey(z11, keyParameter.getKey());
                return;
            }
            throw new IllegalArgumentException("DES key too long - should be 8 bytes");
        }
        throw new IllegalArgumentException("invalid parameter passed to DES init - " + cipherParameters.getClass().getName());
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int[] iArr = this.workingKey;
        if (iArr != null) {
            if (i11 + 8 <= bArr.length) {
                if (i12 + 8 <= bArr2.length) {
                    desFunc(iArr, bArr, i11, bArr2, i12);
                    return 8;
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException("DES engine not initialised");
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }
}