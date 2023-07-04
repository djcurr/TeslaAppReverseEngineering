package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes3.dex */
public class MurmurHash3 {
    private MurmurHash3() {
    }

    @KeepForSdk
    public static int murmurhash3_x86_32(byte[] bArr, int i11, int i12, int i13) {
        int i14 = (i12 & (-4)) + i11;
        while (i11 < i14) {
            int i15 = ((bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | (bArr[i11 + 3] << 24)) * (-862048943);
            int i16 = i13 ^ (((i15 << 15) | (i15 >>> 17)) * 461845907);
            i13 = (((i16 >>> 19) | (i16 << 13)) * 5) - 430675100;
            i11 += 4;
        }
        int i17 = i12 & 3;
        if (i17 != 1) {
            if (i17 != 2) {
                r3 = i17 == 3 ? (bArr[i14 + 2] & 255) << 16 : 0;
                int i18 = i13 ^ i12;
                int i19 = (i18 ^ (i18 >>> 16)) * (-2048144789);
                int i21 = (i19 ^ (i19 >>> 13)) * (-1028477387);
                return i21 ^ (i21 >>> 16);
            }
            r3 |= (bArr[i14 + 1] & 255) << 8;
        }
        int i22 = ((bArr[i14] & 255) | r3) * (-862048943);
        i13 ^= ((i22 >>> 17) | (i22 << 15)) * 461845907;
        int i182 = i13 ^ i12;
        int i192 = (i182 ^ (i182 >>> 16)) * (-2048144789);
        int i212 = (i192 ^ (i192 >>> 13)) * (-1028477387);
        return i212 ^ (i212 >>> 16);
    }
}