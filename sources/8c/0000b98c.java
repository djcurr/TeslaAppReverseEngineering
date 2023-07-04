package v60;

import java.util.Random;

/* loaded from: classes5.dex */
public abstract class c {
    private static int a(int i11, int[] iArr, int[] iArr2) {
        int i12 = i11 - 1;
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = i13 + iArr[i14] + iArr2[i14];
            iArr[i14] = 1073741823 & i15;
            i13 = i15 >> 30;
        }
        int i16 = i13 + iArr[i12] + iArr2[i12];
        iArr[i12] = i16;
        return i16 >> 30;
    }

    public static void b(int[] iArr, int[] iArr2, int[] iArr3) {
        if (k(iArr, iArr2, iArr3) == 0) {
            throw new ArithmeticException("Inverse does not exist.");
        }
    }

    private static void c(int i11, int i12, int[] iArr) {
        int i13 = i11 - 1;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            int i16 = i14 + ((iArr[i15] ^ i12) - i12);
            iArr[i15] = 1073741823 & i16;
            i14 = i16 >> 30;
        }
        iArr[i13] = i14 + ((iArr[i13] ^ i12) - i12);
    }

    private static void d(int i11, int i12, int[] iArr, int[] iArr2) {
        int i13 = i11 - 1;
        int i14 = iArr[i13] >> 31;
        int i15 = 0;
        for (int i16 = 0; i16 < i13; i16++) {
            int i17 = i15 + (((iArr[i16] + (iArr2[i16] & i14)) ^ i12) - i12);
            iArr[i16] = 1073741823 & i17;
            i15 = i17 >> 30;
        }
        iArr[i13] = i15 + (((iArr[i13] + (i14 & iArr2[i13])) ^ i12) - i12);
        int i18 = iArr[i13] >> 31;
        int i19 = 0;
        for (int i21 = 0; i21 < i13; i21++) {
            int i22 = i19 + iArr[i21] + (iArr2[i21] & i18);
            iArr[i21] = i22 & 1073741823;
            i19 = i22 >> 30;
        }
        iArr[i13] = i19 + iArr[i13] + (i18 & iArr2[i13]);
    }

    private static void e(int i11, int[] iArr, int i12, int[] iArr2, int i13) {
        int i14 = 0;
        long j11 = 0;
        while (i11 > 0) {
            while (i14 < Math.min(32, i11)) {
                j11 |= iArr[i12] << i14;
                i14 += 30;
                i12++;
            }
            iArr2[i13] = (int) j11;
            j11 >>>= 32;
            i14 -= 32;
            i11 -= 32;
            i13++;
        }
    }

    private static int f(int i11, int i12, int i13, int[] iArr) {
        int i14 = 0;
        int i15 = 0;
        int i16 = 1;
        int i17 = 1;
        for (int i18 = 0; i18 < 30; i18++) {
            int i19 = i11 >> 31;
            int i21 = -(i13 & 1);
            int i22 = i13 + (((i12 ^ i19) - i19) & i21);
            i15 += ((i16 ^ i19) - i19) & i21;
            i17 += ((i14 ^ i19) - i19) & i21;
            int i23 = i19 & i21;
            i11 = (i11 ^ i23) - (i23 + 1);
            i12 += i22 & i23;
            i13 = i22 >> 1;
            i16 = (i16 + (i15 & i23)) << 1;
            i14 = (i14 + (i23 & i17)) << 1;
        }
        iArr[0] = i16;
        iArr[1] = i14;
        iArr[2] = i15;
        iArr[3] = i17;
        return i11;
    }

    private static int g(int i11, int i12, int i13, int[] iArr) {
        int i14;
        int i15 = i12;
        int i16 = i13;
        int i17 = 0;
        int i18 = 0;
        int i19 = 1;
        int i21 = 1;
        int i22 = 30;
        int i23 = i11;
        while (true) {
            int b11 = r70.f.b(((-1) << i22) | i16);
            int i24 = i16 >> b11;
            i19 <<= b11;
            i17 <<= b11;
            i23 -= b11;
            i22 -= b11;
            if (i22 <= 0) {
                iArr[0] = i19;
                iArr[1] = i17;
                iArr[2] = i18;
                iArr[3] = i21;
                return i23;
            }
            if (i23 < 0) {
                i23 = -i23;
                int i25 = -i15;
                int i26 = -i19;
                int i27 = -i17;
                int i28 = i23 + 1;
                if (i28 > i22) {
                    i28 = i22;
                }
                i14 = ((-1) >>> (32 - i28)) & 63 & (i24 * i25 * ((i24 * i24) - 2));
                i24 = i25;
                i15 = i24;
                int i29 = i18;
                i18 = i26;
                i19 = i29;
                int i31 = i21;
                i21 = i27;
                i17 = i31;
            } else {
                int i32 = i23 + 1;
                if (i32 > i22) {
                    i32 = i22;
                }
                i14 = ((-1) >>> (32 - i32)) & 15 & ((-((((i15 + 1) & 4) << 1) + i15)) * i24);
            }
            i16 = i24 + (i15 * i14);
            i18 += i19 * i14;
            i21 += i14 * i17;
        }
    }

    private static void h(int i11, int[] iArr, int i12, int[] iArr2, int i13) {
        int i14 = 0;
        long j11 = 0;
        while (i11 > 0) {
            if (i14 < Math.min(30, i11)) {
                j11 |= (iArr[i12] & 4294967295L) << i14;
                i14 += 32;
                i12++;
            }
            iArr2[i13] = ((int) j11) & 1073741823;
            j11 >>>= 30;
            i14 -= 30;
            i11 -= 30;
            i13++;
        }
    }

    private static int i(int i11) {
        return ((i11 * 49) + (i11 < 46 ? 80 : 47)) / 17;
    }

    public static int j(int i11) {
        int i12 = (2 - (i11 * i11)) * i11;
        int i13 = i12 * (2 - (i11 * i12));
        int i14 = i13 * (2 - (i11 * i13));
        return i14 * (2 - (i11 * i14));
    }

    public static int k(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        int a11 = (length << 5) - r70.f.a(iArr[length - 1]);
        int i11 = (a11 + 29) / 30;
        int[] iArr4 = new int[4];
        int[] iArr5 = new int[i11];
        int[] iArr6 = new int[i11];
        int[] iArr7 = new int[i11];
        int[] iArr8 = new int[i11];
        int[] iArr9 = new int[i11];
        int i12 = 0;
        iArr6[0] = 1;
        h(a11, iArr2, 0, iArr8, 0);
        h(a11, iArr, 0, iArr9, 0);
        System.arraycopy(iArr9, 0, iArr7, 0, i11);
        int j11 = j(iArr9[0]);
        int i13 = -1;
        int i14 = 0;
        for (int i15 = i(a11); i14 < i15; i15 = i15) {
            int f11 = f(i13, iArr7[i12], iArr8[i12], iArr4);
            o(i11, iArr5, iArr6, iArr4, j11, iArr9);
            p(i11, iArr7, iArr8, iArr4);
            i14 += 30;
            i12 = i12;
            i13 = f11;
        }
        int i16 = i12;
        int i17 = iArr7[i11 - 1] >> 31;
        c(i11, i17, iArr7);
        d(i11, i17, iArr5, iArr9);
        e(a11, iArr5, i16, iArr3, i16);
        return n.p(i11, iArr7, 1) & n.q(i11, iArr8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v3 */
    public static boolean l(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        int a11 = (length << 5) - r70.f.a(iArr[length - 1]);
        int i11 = (a11 + 29) / 30;
        int[] iArr4 = new int[4];
        int[] iArr5 = new int[i11];
        int[] iArr6 = new int[i11];
        int[] iArr7 = new int[i11];
        int[] iArr8 = new int[i11];
        int[] iArr9 = new int[i11];
        ?? r92 = 0;
        iArr6[0] = 1;
        h(a11, iArr2, 0, iArr8, 0);
        h(a11, iArr, 0, iArr9, 0);
        System.arraycopy(iArr9, 0, iArr7, 0, i11);
        int i12 = i11 - 1;
        int a12 = (-1) - (r70.f.a(iArr8[i12] | 1) - (((i11 * 30) + 2) - a11));
        int j11 = j(iArr9[0]);
        int i13 = i(a11);
        int i14 = i11;
        int i15 = 0;
        while (!n.A(i14, iArr8)) {
            if (i15 >= i13) {
                return r92;
            }
            int i16 = i15 + 30;
            int g11 = g(a12, iArr7[r92], iArr8[r92], iArr4);
            int[] iArr10 = iArr6;
            int i17 = i14;
            int i18 = i13;
            int[] iArr11 = iArr6;
            ?? r12 = r92;
            o(i11, iArr5, iArr10, iArr4, j11, iArr9);
            p(i17, iArr7, iArr8, iArr4);
            int i19 = i17 - 1;
            int i21 = iArr7[i19];
            int i22 = iArr8[i19];
            int i23 = i17 - 2;
            if (((i23 >> 31) | ((i21 >> 31) ^ i21) | ((i22 >> 31) ^ i22)) == 0) {
                iArr7[i23] = (i21 << 30) | iArr7[i23];
                iArr8[i23] = iArr8[i23] | (i22 << 30);
                i14 = i17 - 1;
            } else {
                i14 = i17;
            }
            r92 = r12;
            i15 = i16;
            a12 = g11;
            i13 = i18;
            iArr6 = iArr11;
        }
        int i24 = i14;
        boolean z11 = r92;
        int i25 = iArr7[i24 - 1] >> 31;
        int i26 = iArr5[i12] >> 31;
        if (i26 < 0) {
            i26 = a(i11, iArr5, iArr9);
        }
        if (i25 < 0) {
            i26 = m(i11, iArr5);
            m(i24, iArr7);
        }
        if (n.z(i24, iArr7)) {
            if (i26 < 0) {
                a(i11, iArr5, iArr9);
            }
            e(a11, iArr5, z11 ? 1 : 0, iArr3, z11 ? 1 : 0);
            return true;
        }
        return z11;
    }

    private static int m(int i11, int[] iArr) {
        int i12 = i11 - 1;
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = i13 - iArr[i14];
            iArr[i14] = 1073741823 & i15;
            i13 = i15 >> 30;
        }
        int i16 = i13 - iArr[i12];
        iArr[i12] = i16;
        return i16 >> 30;
    }

    public static int[] n(int[] iArr) {
        int length = iArr.length;
        Random random = new Random();
        int[] k11 = n.k(length);
        int i11 = length - 1;
        int i12 = iArr[i11];
        int i13 = i12 | (i12 >>> 1);
        int i14 = i13 | (i13 >>> 2);
        int i15 = i14 | (i14 >>> 4);
        int i16 = i15 | (i15 >>> 8);
        int i17 = i16 | (i16 >>> 16);
        do {
            for (int i18 = 0; i18 != length; i18++) {
                k11[i18] = random.nextInt();
            }
            k11[i11] = k11[i11] & i17;
        } while (n.u(length, k11, iArr));
        return k11;
    }

    private static void o(int i11, int[] iArr, int[] iArr2, int[] iArr3, int i12, int[] iArr4) {
        int i13 = i11;
        int i14 = iArr3[0];
        int i15 = iArr3[1];
        int i16 = iArr3[2];
        int i17 = iArr3[3];
        int i18 = i13 - 1;
        int i19 = iArr[i18] >> 31;
        int i21 = iArr2[i18] >> 31;
        int i22 = (i14 & i19) + (i15 & i21);
        int i23 = (i19 & i16) + (i21 & i17);
        int i24 = iArr4[0];
        long j11 = i14;
        long j12 = iArr[0];
        long j13 = i15;
        long j14 = iArr2[0];
        long j15 = (j11 * j12) + (j13 * j14);
        long j16 = i16;
        long j17 = i17;
        long j18 = (j12 * j16) + (j14 * j17);
        long j19 = i24;
        long j21 = i22 - (((((int) j15) * i12) + i22) & 1073741823);
        int i25 = i18;
        long j22 = i23 - (((((int) j18) * i12) + i23) & 1073741823);
        long j23 = (j18 + (j19 * j22)) >> 30;
        long j24 = (j15 + (j19 * j21)) >> 30;
        int i26 = 1;
        while (i26 < i13) {
            int i27 = iArr4[i26];
            long j25 = j23;
            long j26 = iArr[i26];
            int i28 = i26;
            long j27 = iArr2[i26];
            long j28 = j22;
            long j29 = i27;
            long j31 = j24 + (j11 * j26) + (j13 * j27) + (j29 * j21);
            long j32 = j25 + (j26 * j16) + (j27 * j17) + (j29 * j28);
            int i29 = i28 - 1;
            iArr[i29] = ((int) j31) & 1073741823;
            j24 = j31 >> 30;
            iArr2[i29] = ((int) j32) & 1073741823;
            j23 = j32 >> 30;
            i26 = i28 + 1;
            i13 = i11;
            i25 = i25;
            j22 = j28;
        }
        int i31 = i25;
        iArr[i31] = (int) j24;
        iArr2[i31] = (int) j23;
    }

    private static void p(int i11, int[] iArr, int[] iArr2, int[] iArr3) {
        int i12 = iArr3[0];
        int i13 = 1;
        int i14 = iArr3[1];
        int i15 = iArr3[2];
        int i16 = iArr3[3];
        long j11 = i12;
        long j12 = iArr[0];
        long j13 = i14;
        long j14 = iArr2[0];
        long j15 = i15;
        long j16 = i16;
        long j17 = ((j11 * j12) + (j13 * j14)) >> 30;
        long j18 = ((j12 * j15) + (j14 * j16)) >> 30;
        int i17 = 1;
        while (i17 < i11) {
            int i18 = iArr[i17];
            int i19 = iArr2[i17];
            int i21 = i17;
            long j19 = i18;
            long j21 = j11 * j19;
            long j22 = j11;
            long j23 = i19;
            long j24 = j17 + j21 + (j13 * j23);
            long j25 = j18 + (j19 * j15) + (j23 * j16);
            int i22 = i21 - 1;
            iArr[i22] = ((int) j24) & 1073741823;
            j17 = j24 >> 30;
            iArr2[i22] = 1073741823 & ((int) j25);
            j18 = j25 >> 30;
            i17 = i21 + 1;
            j11 = j22;
            i13 = 1;
        }
        int i23 = i11 - i13;
        iArr[i23] = (int) j17;
        iArr2[i23] = (int) j18;
    }
}