package org.spongycastle.pqc.crypto.sphincs;

import org.spongycastle.util.Pack;

/* loaded from: classes4.dex */
class Permute {
    private static final int CHACHA_ROUNDS = 12;

    public static void permute(int i11, int[] iArr) {
        int i12 = 16;
        if (iArr.length == 16) {
            if (i11 % 2 == 0) {
                char c11 = 0;
                int i13 = iArr[0];
                int i14 = iArr[1];
                int i15 = iArr[2];
                int i16 = iArr[3];
                int i17 = iArr[4];
                int i18 = iArr[5];
                int i19 = iArr[6];
                int i21 = 7;
                int i22 = iArr[7];
                int i23 = 8;
                int i24 = iArr[8];
                int i25 = iArr[9];
                int i26 = iArr[10];
                int i27 = iArr[11];
                int i28 = iArr[12];
                int i29 = iArr[13];
                int i31 = iArr[14];
                int i32 = iArr[15];
                int i33 = i31;
                int i34 = i29;
                int i35 = i28;
                int i36 = i27;
                int i37 = i26;
                int i38 = i25;
                int i39 = i24;
                int i41 = i22;
                int i42 = i19;
                int i43 = i18;
                int i44 = i17;
                int i45 = i16;
                int i46 = i15;
                int i47 = i14;
                int i48 = i13;
                int i49 = i11;
                while (i49 > 0) {
                    int i51 = i48 + i44;
                    int rotl = rotl(i35 ^ i51, i12);
                    int i52 = i39 + rotl;
                    int rotl2 = rotl(i44 ^ i52, 12);
                    int i53 = i51 + rotl2;
                    int rotl3 = rotl(rotl ^ i53, i23);
                    int i54 = i52 + rotl3;
                    int rotl4 = rotl(rotl2 ^ i54, i21);
                    int i55 = i47 + i43;
                    int rotl5 = rotl(i34 ^ i55, i12);
                    int i56 = i38 + rotl5;
                    int rotl6 = rotl(i43 ^ i56, 12);
                    int i57 = i55 + rotl6;
                    int rotl7 = rotl(rotl5 ^ i57, i23);
                    int i58 = i56 + rotl7;
                    int rotl8 = rotl(rotl6 ^ i58, i21);
                    int i59 = i46 + i42;
                    int rotl9 = rotl(i33 ^ i59, i12);
                    int i61 = i37 + rotl9;
                    int rotl10 = rotl(i42 ^ i61, 12);
                    int i62 = i59 + rotl10;
                    int rotl11 = rotl(rotl9 ^ i62, i23);
                    int i63 = i61 + rotl11;
                    int rotl12 = rotl(rotl10 ^ i63, i21);
                    int i64 = i45 + i41;
                    int rotl13 = rotl(i32 ^ i64, i12);
                    int i65 = i36 + rotl13;
                    int rotl14 = rotl(i41 ^ i65, 12);
                    int i66 = i64 + rotl14;
                    int rotl15 = rotl(rotl13 ^ i66, i23);
                    int i67 = i65 + rotl15;
                    int rotl16 = rotl(rotl14 ^ i67, 7);
                    int i68 = i53 + rotl8;
                    int rotl17 = rotl(rotl15 ^ i68, 16);
                    int i69 = i63 + rotl17;
                    int rotl18 = rotl(rotl8 ^ i69, 12);
                    i48 = i68 + rotl18;
                    i32 = rotl(rotl17 ^ i48, 8);
                    i37 = i69 + i32;
                    i43 = rotl(rotl18 ^ i37, 7);
                    int i71 = i57 + rotl12;
                    int rotl19 = rotl(rotl3 ^ i71, 16);
                    int i72 = i67 + rotl19;
                    int rotl20 = rotl(rotl12 ^ i72, 12);
                    i47 = i71 + rotl20;
                    i35 = rotl(rotl19 ^ i47, 8);
                    i36 = i72 + i35;
                    i42 = rotl(rotl20 ^ i36, 7);
                    int i73 = i62 + rotl16;
                    int rotl21 = rotl(rotl7 ^ i73, 16);
                    int i74 = i54 + rotl21;
                    int rotl22 = rotl(rotl16 ^ i74, 12);
                    i46 = i73 + rotl22;
                    i34 = rotl(rotl21 ^ i46, 8);
                    i39 = i74 + i34;
                    i41 = rotl(rotl22 ^ i39, 7);
                    int i75 = i66 + rotl4;
                    i12 = 16;
                    int rotl23 = rotl(rotl11 ^ i75, 16);
                    int i76 = i58 + rotl23;
                    int rotl24 = rotl(rotl4 ^ i76, 12);
                    i45 = i75 + rotl24;
                    i33 = rotl(rotl23 ^ i45, 8);
                    i38 = i76 + i33;
                    i44 = rotl(rotl24 ^ i38, 7);
                    i49 -= 2;
                    i21 = 7;
                    c11 = 0;
                    i23 = 8;
                }
                iArr[c11] = i48;
                iArr[1] = i47;
                iArr[2] = i46;
                iArr[3] = i45;
                iArr[4] = i44;
                iArr[5] = i43;
                iArr[6] = i42;
                iArr[i21] = i41;
                iArr[8] = i39;
                iArr[9] = i38;
                iArr[10] = i37;
                iArr[11] = i36;
                iArr[12] = i35;
                iArr[13] = i34;
                iArr[14] = i33;
                iArr[15] = i32;
                return;
            }
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        throw new IllegalArgumentException();
    }

    protected static int rotl(int i11, int i12) {
        return (i11 >>> (-i12)) | (i11 << i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void chacha_permute(byte[] bArr, byte[] bArr2) {
        int[] iArr = new int[16];
        for (int i11 = 0; i11 < 16; i11++) {
            iArr[i11] = Pack.littleEndianToInt(bArr2, i11 * 4);
        }
        permute(12, iArr);
        for (int i12 = 0; i12 < 16; i12++) {
            Pack.intToLittleEndian(iArr[i12], bArr, i12 * 4);
        }
    }
}