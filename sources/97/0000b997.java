package v60;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public abstract class n {
    public static boolean A(int i11, int[] iArr) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (iArr[i12] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int B(int i11, int[] iArr, int[] iArr2) {
        long j11 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            j11 = (j11 + ((iArr[i12] & 4294967295L) - (4294967295L & iArr2[i12]))) >> 32;
        }
        return (int) j11;
    }

    public static int C(int i11, int i12, int[] iArr, int i13, int[] iArr2, int[] iArr3, int i14) {
        long j11 = i12 & 4294967295L;
        long j12 = i13 & 4294967295L;
        long j13 = 0;
        int i15 = 0;
        do {
            int i16 = i14 + i15;
            long j14 = j13 + ((iArr[i15] & 4294967295L) * j11) + ((iArr2[i15] & 4294967295L) * j12) + (iArr3[i16] & 4294967295L);
            iArr3[i16] = (int) j14;
            j13 = j14 >>> 32;
            i15++;
        } while (i15 < i11);
        return (int) j13;
    }

    public static int D(int i11, int[] iArr, int[] iArr2, int[] iArr3) {
        int i12;
        long j11 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            long E = j11 + (E(i11, iArr[i13], iArr2, 0, iArr3, i13) & 4294967295L) + (iArr3[i12] & 4294967295L);
            iArr3[i13 + i11] = (int) E;
            j11 = E >>> 32;
        }
        return (int) j11;
    }

    public static int E(int i11, int i12, int[] iArr, int i13, int[] iArr2, int i14) {
        long j11 = i12 & 4294967295L;
        long j12 = 0;
        int i15 = 0;
        do {
            int i16 = i14 + i15;
            long j13 = j12 + ((iArr[i13 + i15] & 4294967295L) * j11) + (iArr2[i16] & 4294967295L);
            iArr2[i16] = (int) j13;
            j12 = j13 >>> 32;
            i15++;
        } while (i15 < i11);
        return (int) j12;
    }

    public static int F(int i11, int[] iArr, int i12) {
        while (true) {
            i11--;
            if (i11 < 0) {
                return i12 << 31;
            }
            int i13 = iArr[i11];
            iArr[i11] = (i12 << 31) | (i13 >>> 1);
            i12 = i13;
        }
    }

    public static int G(int i11, int[] iArr, int i12, int i13) {
        while (true) {
            i11--;
            if (i11 < 0) {
                return i13 << (-i12);
            }
            int i14 = iArr[i11];
            iArr[i11] = (i13 << (-i12)) | (i14 >>> i12);
            i13 = i14;
        }
    }

    public static int H(int i11, int[] iArr, int i12, int i13, int i14, int[] iArr2, int i15) {
        while (true) {
            i11--;
            if (i11 < 0) {
                return i14 << (-i13);
            }
            int i16 = iArr[i12 + i11];
            iArr2[i15 + i11] = (i14 << (-i13)) | (i16 >>> i13);
            i14 = i16;
        }
    }

    public static int I(int i11, int[] iArr, int i12) {
        while (true) {
            i11--;
            if (i11 < 0) {
                return i12;
            }
            int i13 = iArr[i11];
            iArr[i11] = i12;
            i12 = i13;
        }
    }

    public static int J(int i11, int[] iArr, int i12, int i13, int[] iArr2, int i14) {
        int i15 = 0;
        while (i15 < i11) {
            int i16 = iArr[i12 + i15];
            iArr2[i14 + i15] = (i13 >>> 31) | (i16 << 1);
            i15++;
            i13 = i16;
        }
        return i13 >>> 31;
    }

    public static int K(int i11, int[] iArr, int i12, int[] iArr2) {
        int i13 = 0;
        while (i13 < i11) {
            int i14 = iArr[i13];
            iArr2[i13] = (i12 >>> 31) | (i14 << 1);
            i13++;
            i12 = i14;
        }
        return i12 >>> 31;
    }

    public static long L(int i11, long[] jArr, int i12, long j11, long[] jArr2, int i13) {
        int i14 = 0;
        while (i14 < i11) {
            long j12 = jArr[i12 + i14];
            jArr2[i13 + i14] = (j11 >>> 63) | (j12 << 1);
            i14++;
            j11 = j12;
        }
        return j11 >>> 63;
    }

    public static int M(int i11, int[] iArr, int i12, int i13) {
        int i14 = 0;
        while (i14 < i11) {
            int i15 = iArr[i14];
            iArr[i14] = (i13 >>> (-i12)) | (i15 << i12);
            i14++;
            i13 = i15;
        }
        return i13 >>> (-i12);
    }

    public static int N(int i11, int[] iArr, int i12, int i13, int[] iArr2) {
        int i14 = 0;
        while (i14 < i11) {
            int i15 = iArr[i14];
            iArr2[i14] = (i13 >>> (-i12)) | (i15 << i12);
            i14++;
            i13 = i15;
        }
        return i13 >>> (-i12);
    }

    public static long O(int i11, long[] jArr, int i12, int i13, long j11) {
        int i14 = 0;
        while (i14 < i11) {
            int i15 = i12 + i14;
            long j12 = jArr[i15];
            jArr[i15] = (j11 >>> (-i13)) | (j12 << i13);
            i14++;
            j11 = j12;
        }
        return j11 >>> (-i13);
    }

    public static long P(int i11, long[] jArr, int i12, int i13, long j11, long[] jArr2, int i14) {
        int i15 = 0;
        while (i15 < i11) {
            long j12 = jArr[i12 + i15];
            jArr2[i14 + i15] = (j11 >>> (-i13)) | (j12 << i13);
            i15++;
            j11 = j12;
        }
        return j11 >>> (-i13);
    }

    public static int Q(int i11, int[] iArr, int[] iArr2, int[] iArr3) {
        long j11 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            long j12 = j11 + ((iArr[i12] & 4294967295L) - (4294967295L & iArr2[i12]));
            iArr3[i12] = (int) j12;
            j11 = j12 >> 32;
        }
        return (int) j11;
    }

    public static int R(int i11, int i12, int[] iArr) {
        long j11 = (iArr[0] & 4294967295L) - (i12 & 4294967295L);
        iArr[0] = (int) j11;
        long j12 = (j11 >> 32) + ((4294967295L & iArr[1]) - 1);
        iArr[1] = (int) j12;
        if ((j12 >> 32) == 0) {
            return 0;
        }
        return n(i11, iArr, 2);
    }

    public static int S(int i11, int[] iArr, int i12, int[] iArr2, int i13) {
        long j11 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = i13 + i14;
            long j12 = j11 + ((iArr2[i15] & 4294967295L) - (4294967295L & iArr[i12 + i14]));
            iArr2[i15] = (int) j12;
            j11 = j12 >> 32;
        }
        return (int) j11;
    }

    public static int T(int i11, int[] iArr, int[] iArr2) {
        long j11 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            long j12 = j11 + ((iArr2[i12] & 4294967295L) - (4294967295L & iArr[i12]));
            iArr2[i12] = (int) j12;
            j11 = j12 >> 32;
        }
        return (int) j11;
    }

    public static int U(int i11, int i12, int[] iArr) {
        long j11 = (iArr[0] & 4294967295L) - (4294967295L & i12);
        iArr[0] = (int) j11;
        if ((j11 >> 32) == 0) {
            return 0;
        }
        return n(i11, iArr, 1);
    }

    public static BigInteger V(int i11, int[] iArr) {
        byte[] bArr = new byte[i11 << 2];
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = iArr[i12];
            if (i13 != 0) {
                r70.i.f(i13, bArr, ((i11 - 1) - i12) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void W(int i11, int[] iArr) {
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i12] = 0;
        }
    }

    public static void X(int i11, long[] jArr) {
        for (int i12 = 0; i12 < i11; i12++) {
            jArr[i12] = 0;
        }
    }

    public static int a(int i11, int[] iArr, int[] iArr2, int[] iArr3) {
        long j11 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            long j12 = j11 + (iArr[i12] & 4294967295L) + (4294967295L & iArr2[i12]);
            iArr3[i12] = (int) j12;
            j11 = j12 >>> 32;
        }
        return (int) j11;
    }

    public static int b(int i11, int i12, int[] iArr) {
        long j11 = (iArr[0] & 4294967295L) + (i12 & 4294967295L);
        iArr[0] = (int) j11;
        long j12 = (j11 >>> 32) + (4294967295L & iArr[1]) + 1;
        iArr[1] = (int) j12;
        if ((j12 >>> 32) == 0) {
            return 0;
        }
        return x(i11, iArr, 2);
    }

    public static int c(int i11, int[] iArr, int[] iArr2, int[] iArr3) {
        long j11 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            long j12 = j11 + (iArr[i12] & 4294967295L) + (iArr2[i12] & 4294967295L) + (4294967295L & iArr3[i12]);
            iArr3[i12] = (int) j12;
            j11 = j12 >>> 32;
        }
        return (int) j11;
    }

    public static int d(int i11, int[] iArr, int i12, int[] iArr2, int i13) {
        long j11 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = i13 + i14;
            long j12 = j11 + (iArr[i12 + i14] & 4294967295L) + (4294967295L & iArr2[i15]);
            iArr2[i15] = (int) j12;
            j11 = j12 >>> 32;
        }
        return (int) j11;
    }

    public static int e(int i11, int[] iArr, int[] iArr2) {
        long j11 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            long j12 = j11 + (iArr[i12] & 4294967295L) + (4294967295L & iArr2[i12]);
            iArr2[i12] = (int) j12;
            j11 = j12 >>> 32;
        }
        return (int) j11;
    }

    public static int f(int i11, int i12, int[] iArr, int i13) {
        long j11 = (i12 & 4294967295L) + (4294967295L & iArr[i13]);
        iArr[i13] = (int) j11;
        if ((j11 >>> 32) == 0) {
            return 0;
        }
        return x(i11, iArr, i13 + 1);
    }

    public static int g(int i11, int i12, int[] iArr) {
        long j11 = (i12 & 4294967295L) + (4294967295L & iArr[0]);
        iArr[0] = (int) j11;
        if ((j11 >>> 32) == 0) {
            return 0;
        }
        return x(i11, iArr, 1);
    }

    public static int h(int i11, int i12, int[] iArr, int[] iArr2, int[] iArr3) {
        long j11 = (-(i12 & 1)) & 4294967295L;
        long j12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            long j13 = j12 + (iArr[i13] & 4294967295L) + (iArr2[i13] & j11);
            iArr3[i13] = (int) j13;
            j12 = j13 >>> 32;
        }
        return (int) j12;
    }

    public static int i(int i11, int[] iArr, int[] iArr2) {
        for (int i12 = i11 - 1; i12 >= 0; i12--) {
            int i13 = iArr[i12] ^ Integer.MIN_VALUE;
            int i14 = Integer.MIN_VALUE ^ iArr2[i12];
            if (i13 < i14) {
                return -1;
            }
            if (i13 > i14) {
                return 1;
            }
        }
        return 0;
    }

    public static void j(int i11, int[] iArr, int i12, int[] iArr2, int i13) {
        System.arraycopy(iArr, i12, iArr2, i13, i11);
    }

    public static int[] k(int i11) {
        return new int[i11];
    }

    public static long[] l(int i11) {
        return new long[i11];
    }

    public static int m(int i11, int[] iArr) {
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = iArr[i12] - 1;
            iArr[i12] = i13;
            if (i13 != -1) {
                return 0;
            }
        }
        return -1;
    }

    public static int n(int i11, int[] iArr, int i12) {
        while (i12 < i11) {
            int i13 = iArr[i12] - 1;
            iArr[i12] = i13;
            if (i13 != -1) {
                return 0;
            }
            i12++;
        }
        return -1;
    }

    public static boolean o(int i11, int[] iArr, int[] iArr2) {
        for (int i12 = i11 - 1; i12 >= 0; i12--) {
            if (iArr[i12] != iArr2[i12]) {
                return false;
            }
        }
        return true;
    }

    public static int p(int i11, int[] iArr, int i12) {
        int i13 = i12 ^ iArr[0];
        for (int i14 = 1; i14 < i11; i14++) {
            i13 |= iArr[i14];
        }
        return (((i13 >>> 1) | (i13 & 1)) - 1) >> 31;
    }

    public static int q(int i11, int[] iArr) {
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 |= iArr[i13];
        }
        return (((i12 >>> 1) | (i12 & 1)) - 1) >> 31;
    }

    public static int[] r(int i11, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i11) {
            throw new IllegalArgumentException();
        }
        int i12 = (i11 + 31) >> 5;
        int[] k11 = k(i12);
        for (int i13 = 0; i13 < i12; i13++) {
            k11[i13] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return k11;
    }

    public static long[] s(int i11, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i11) {
            throw new IllegalArgumentException();
        }
        int i12 = (i11 + 63) >> 6;
        long[] l11 = l(i12);
        for (int i13 = 0; i13 < i12; i13++) {
            l11[i13] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
        }
        return l11;
    }

    public static int t(int[] iArr, int i11) {
        int i12;
        if (i11 == 0) {
            i12 = iArr[0];
        } else {
            int i13 = i11 >> 5;
            if (i13 < 0 || i13 >= iArr.length) {
                return 0;
            }
            i12 = iArr[i13] >>> (i11 & 31);
        }
        return i12 & 1;
    }

    public static boolean u(int i11, int[] iArr, int[] iArr2) {
        for (int i12 = i11 - 1; i12 >= 0; i12--) {
            int i13 = iArr[i12] ^ Integer.MIN_VALUE;
            int i14 = Integer.MIN_VALUE ^ iArr2[i12];
            if (i13 < i14) {
                return false;
            }
            if (i13 > i14) {
                return true;
            }
        }
        return true;
    }

    public static int v(int i11, int[] iArr) {
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = iArr[i12] + 1;
            iArr[i12] = i13;
            if (i13 != 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int w(int i11, int[] iArr, int[] iArr2) {
        int i12 = 0;
        while (i12 < i11) {
            int i13 = iArr[i12] + 1;
            iArr2[i12] = i13;
            i12++;
            if (i13 != 0) {
                while (i12 < i11) {
                    iArr2[i12] = iArr[i12];
                    i12++;
                }
                return 0;
            }
        }
        return 1;
    }

    public static int x(int i11, int[] iArr, int i12) {
        while (i12 < i11) {
            int i13 = iArr[i12] + 1;
            iArr[i12] = i13;
            if (i13 != 0) {
                return 0;
            }
            i12++;
        }
        return 1;
    }

    public static int y(int i11, int[] iArr, int i12, int i13) {
        while (i13 < i11) {
            int i14 = i12 + i13;
            int i15 = iArr[i14] + 1;
            iArr[i14] = i15;
            if (i15 != 0) {
                return 0;
            }
            i13++;
        }
        return 1;
    }

    public static boolean z(int i11, int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i12 = 1; i12 < i11; i12++) {
            if (iArr[i12] != 0) {
                return false;
            }
        }
        return true;
    }
}