package nq;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class b {
    private static int a(long j11) {
        int i11 = (int) j11;
        if (i11 == j11) {
            return i11;
        }
        throw new IllegalArgumentException(j11 + " cannot be cast to int without changing its value.");
    }

    static int b(int i11, boolean z11) {
        if (i11 == 0) {
            return 0;
        }
        if (z11) {
            int i12 = (i11 / 3) << 2;
            int i13 = i11 % 3;
            return i13 == 0 ? i12 : i12 + i13 + 1;
        }
        return (((i11 - 1) / 3) + 1) << 2;
    }

    public static byte[] c(String str) {
        if (str == null || str.isEmpty()) {
            return new byte[0];
        }
        byte[] bytes = str.getBytes(l.f41779a);
        int length = bytes.length;
        byte[] bArr = new byte[a((length * 6) >> 3)];
        int i11 = 0;
        int i12 = 0;
        while (i11 < bytes.length) {
            int i13 = 0;
            int i14 = 0;
            while (i13 < 4 && i11 < length) {
                int i15 = i11 + 1;
                int d11 = d(bytes[i11]);
                if (d11 >= 0) {
                    i14 |= d11 << (18 - (i13 * 6));
                    i13++;
                }
                i11 = i15;
            }
            if (i13 >= 2) {
                int i16 = i12 + 1;
                bArr[i12] = (byte) (i14 >> 16);
                if (i13 >= 3) {
                    i12 = i16 + 1;
                    bArr[i16] = (byte) (i14 >> 8);
                    if (i13 >= 4) {
                        bArr[i12] = (byte) i14;
                        i12++;
                    }
                } else {
                    i12 = i16;
                }
            }
        }
        return Arrays.copyOf(bArr, i12);
    }

    static int d(byte b11) {
        int i11 = i(b11, 64) & j(b11, 91);
        int i12 = i(b11, 96) & j(b11, 123);
        int i13 = i(b11, 47) & j(b11, 58);
        int h11 = h(b11, 45) | h(b11, 43);
        int h12 = h(b11, 47) | h(b11, 95);
        return k(i13, (b11 - 48) + 52, 0) | k(i11, (b11 - 65) + 0, 0) | k(i12, (b11 - 97) + 26, 0) | k(h11, 62, 0) | k(h12, 63, 0) | k(i11 | i12 | i13 | h11 | h12, 0, -1);
    }

    static byte e(int i11) {
        int j11 = j(i11, 26);
        int i12 = i(i11, 25) & j(i11, 52);
        int i13 = i(i11, 51) & j(i11, 62);
        int h11 = h(i11, 62);
        int h12 = h(i11, 63);
        return (byte) (k(i13, (i11 - 52) + 48, 0) | k(j11, i11 + 0 + 65, 0) | k(i12, (i11 - 26) + 97, 0) | k(h11, 43, 0) | k(h12, 47, 0));
    }

    static byte f(int i11) {
        int j11 = j(i11, 26);
        int i12 = i(i11, 25) & j(i11, 52);
        int i13 = i(i11, 51) & j(i11, 62);
        int h11 = h(i11, 62);
        int h12 = h(i11, 63);
        return (byte) (k(i13, (i11 - 52) + 48, 0) | k(j11, i11 + 0 + 65, 0) | k(i12, (i11 - 26) + 97, 0) | k(h11, 45, 0) | k(h12, 95, 0));
    }

    public static String g(byte[] bArr, boolean z11) {
        int length = bArr != null ? bArr.length : 0;
        if (length == 0) {
            return "";
        }
        int i11 = (length / 3) * 3;
        int b11 = b(length, z11);
        byte[] bArr2 = new byte[b11];
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i12 + 1;
            int i15 = i14 + 1;
            int i16 = ((bArr[i12] & 255) << 16) | ((bArr[i14] & 255) << 8);
            int i17 = i15 + 1;
            int i18 = i16 | (bArr[i15] & 255);
            if (z11) {
                int i19 = i13 + 1;
                bArr2[i13] = f((i18 >>> 18) & 63);
                int i21 = i19 + 1;
                bArr2[i19] = f((i18 >>> 12) & 63);
                int i22 = i21 + 1;
                bArr2[i21] = f((i18 >>> 6) & 63);
                i13 = i22 + 1;
                bArr2[i22] = f(i18 & 63);
            } else {
                int i23 = i13 + 1;
                bArr2[i13] = e((i18 >>> 18) & 63);
                int i24 = i23 + 1;
                bArr2[i23] = e((i18 >>> 12) & 63);
                int i25 = i24 + 1;
                bArr2[i24] = e((i18 >>> 6) & 63);
                i13 = i25 + 1;
                bArr2[i25] = e(i18 & 63);
            }
            i12 = i17;
        }
        int i26 = length - i11;
        if (i26 > 0) {
            int i27 = ((bArr[i11] & 255) << 10) | (i26 == 2 ? (bArr[length - 1] & 255) << 2 : 0);
            if (!z11) {
                bArr2[b11 - 4] = e(i27 >> 12);
                bArr2[b11 - 3] = e((i27 >>> 6) & 63);
                bArr2[b11 - 2] = i26 == 2 ? e(i27 & 63) : (byte) 61;
                bArr2[b11 - 1] = 61;
            } else if (i26 == 2) {
                bArr2[b11 - 3] = f(i27 >> 12);
                bArr2[b11 - 2] = f((i27 >>> 6) & 63);
                bArr2[b11 - 1] = f(i27 & 63);
            } else {
                bArr2[b11 - 2] = f(i27 >> 12);
                bArr2[b11 - 1] = f((i27 >>> 6) & 63);
            }
        }
        return new String(bArr2, l.f41779a);
    }

    static int h(int i11, int i12) {
        int i13 = i11 ^ i12;
        return ((~i13) & (i13 - 1)) >>> 63;
    }

    static int i(int i11, int i12) {
        return (int) ((i12 - i11) >>> 63);
    }

    static int j(int i11, int i12) {
        return (int) ((i11 - i12) >>> 63);
    }

    static int k(int i11, int i12, int i13) {
        return ((i11 - 1) & (i13 ^ i12)) ^ i12;
    }
}