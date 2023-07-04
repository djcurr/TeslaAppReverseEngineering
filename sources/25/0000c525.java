package zs;

import java.util.Arrays;

/* loaded from: classes6.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f60697a;

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f60698b;

    static {
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        f60697a = charArray;
        int[] iArr = new int[256];
        f60698b = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i11 = 0; i11 < length; i11++) {
            f60698b[f60697a[i11]] = i11;
        }
        f60698b[61] = 0;
    }

    public static final byte[] a(String str) {
        int i11;
        int length = str.length();
        int i12 = 0;
        if (length == 0) {
            return new byte[0];
        }
        int i13 = length - 1;
        int i14 = 0;
        while (i14 < i13 && f60698b[str.charAt(i14) & 255] < 0) {
            i14++;
        }
        while (i13 > 0 && f60698b[str.charAt(i13) & 255] < 0) {
            i13--;
        }
        int i15 = str.charAt(i13) == '=' ? str.charAt(i13 + (-1)) == '=' ? 2 : 1 : 0;
        int i16 = (i13 - i14) + 1;
        if (length > 76) {
            i11 = (str.charAt(76) == '\r' ? i16 / 78 : 0) << 1;
        } else {
            i11 = 0;
        }
        int i17 = (((i16 - i11) * 6) >> 3) - i15;
        byte[] bArr = new byte[i17];
        int i18 = (i17 / 3) * 3;
        int i19 = 0;
        int i21 = 0;
        while (i19 < i18) {
            int[] iArr = f60698b;
            int i22 = i14 + 1;
            int i23 = i22 + 1;
            int i24 = (iArr[str.charAt(i14)] << 18) | (iArr[str.charAt(i22)] << 12);
            int i25 = i23 + 1;
            int i26 = i24 | (iArr[str.charAt(i23)] << 6);
            int i27 = i25 + 1;
            int i28 = i26 | iArr[str.charAt(i25)];
            int i29 = i19 + 1;
            bArr[i19] = (byte) (i28 >> 16);
            int i31 = i29 + 1;
            bArr[i29] = (byte) (i28 >> 8);
            int i32 = i31 + 1;
            bArr[i31] = (byte) i28;
            if (i11 > 0 && (i21 = i21 + 1) == 19) {
                i27 += 2;
                i21 = 0;
            }
            i14 = i27;
            i19 = i32;
        }
        if (i19 < i17) {
            int i33 = 0;
            while (i14 <= i13 - i15) {
                i12 |= f60698b[str.charAt(i14)] << (18 - (i33 * 6));
                i33++;
                i14++;
            }
            int i34 = 16;
            while (i19 < i17) {
                bArr[i19] = (byte) (i12 >> i34);
                i34 -= 8;
                i19++;
            }
        }
        return bArr;
    }

    public static final char[] b(byte[] bArr, boolean z11) {
        int length = bArr != null ? bArr.length : 0;
        if (length == 0) {
            return new char[0];
        }
        int i11 = (length / 3) * 3;
        int i12 = length - 1;
        int i13 = ((i12 / 3) + 1) << 2;
        int i14 = i13 + (z11 ? ((i13 - 1) / 76) << 1 : 0);
        char[] cArr = new char[i14];
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < i11) {
            int i18 = i15 + 1;
            int i19 = i18 + 1;
            int i21 = ((bArr[i15] & 255) << 16) | ((bArr[i18] & 255) << 8);
            int i22 = i19 + 1;
            int i23 = i21 | (bArr[i19] & 255);
            int i24 = i16 + 1;
            char[] cArr2 = f60697a;
            cArr[i16] = cArr2[(i23 >>> 18) & 63];
            int i25 = i24 + 1;
            cArr[i24] = cArr2[(i23 >>> 12) & 63];
            int i26 = i25 + 1;
            cArr[i25] = cArr2[(i23 >>> 6) & 63];
            i16 = i26 + 1;
            cArr[i26] = cArr2[i23 & 63];
            if (z11 && (i17 = i17 + 1) == 19 && i16 < i14 - 2) {
                int i27 = i16 + 1;
                cArr[i16] = '\r';
                i16 = i27 + 1;
                cArr[i27] = '\n';
                i17 = 0;
            }
            i15 = i22;
        }
        int i28 = length - i11;
        if (i28 > 0) {
            int i29 = ((bArr[i11] & 255) << 10) | (i28 == 2 ? (bArr[i12] & 255) << 2 : 0);
            char[] cArr3 = f60697a;
            cArr[i14 - 4] = cArr3[i29 >> 12];
            cArr[i14 - 3] = cArr3[(i29 >>> 6) & 63];
            cArr[i14 - 2] = i28 == 2 ? cArr3[i29 & 63] : '=';
            cArr[i14 - 1] = '=';
        }
        return cArr;
    }

    public static final String c(byte[] bArr, boolean z11) {
        return new String(b(bArr, z11));
    }
}