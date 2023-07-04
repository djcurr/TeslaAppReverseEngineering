package n50;

import l50.t0;
import u50.b1;

/* loaded from: classes5.dex */
public class a0 {
    private static void a(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i11) {
        System.arraycopy(iArr, iArr.length - 16, iArr2, 0, 16);
        int length = iArr.length >>> 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = i11 * 2; i14 > 0; i14--) {
            h(iArr2, iArr, i12, iArr3);
            t0.h(8, iArr3, iArr2);
            System.arraycopy(iArr2, 0, iArr4, i13, 16);
            i13 = (length + i12) - i13;
            i12 += 16;
        }
    }

    private static void b(byte[] bArr) {
        if (bArr != null) {
            org.bouncycastle.util.a.y(bArr, (byte) 0);
        }
    }

    private static void c(int[] iArr) {
        if (iArr != null) {
            org.bouncycastle.util.a.B(iArr, 0);
        }
    }

    private static void d(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            c(iArr2);
        }
    }

    private static byte[] e(byte[] bArr, byte[] bArr2, int i11, int i12, int i13, int i14) {
        int i15 = i12 * 128;
        byte[] g11 = g(bArr, bArr2, i13 * i15);
        int[] iArr = null;
        try {
            int length = g11.length >>> 2;
            iArr = new int[length];
            r70.i.m(g11, 0, iArr);
            int i16 = 0;
            for (int i17 = i11 * i12; i11 - i16 > 2 && i17 > 1024; i17 >>>= 1) {
                i16++;
            }
            int i18 = i15 >>> 2;
            for (int i19 = 0; i19 < length; i19 += i18) {
                f(iArr, i19, i11, i16, i12);
            }
            r70.i.j(iArr, g11, 0);
            return g(bArr, g11, i14);
        } finally {
            b(g11);
            c(iArr);
        }
    }

    private static void f(int[] iArr, int i11, int i12, int i13, int i14) {
        int i15 = i12 >>> i13;
        int i16 = 1 << i13;
        int i17 = i15 - 1;
        int b11 = r70.f.b(i12) - i13;
        int i18 = i14 * 32;
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[i18];
        int[] iArr5 = new int[i18];
        int[][] iArr6 = new int[i16];
        try {
            System.arraycopy(iArr, i11, iArr5, 0, i18);
            int i19 = 0;
            while (i19 < i16) {
                int[] iArr7 = new int[i15 * i18];
                iArr6[i19] = iArr7;
                int i21 = i16;
                int i22 = 0;
                int i23 = 0;
                while (i23 < i15) {
                    System.arraycopy(iArr5, 0, iArr7, i22, i18);
                    int i24 = i22 + i18;
                    a(iArr5, iArr2, iArr3, iArr4, i14);
                    System.arraycopy(iArr4, 0, iArr7, i24, i18);
                    i22 = i24 + i18;
                    a(iArr4, iArr2, iArr3, iArr5, i14);
                    i23 += 2;
                    i15 = i15;
                }
                i19++;
                i16 = i21;
            }
            int i25 = i12 - 1;
            for (int i26 = 0; i26 < i12; i26++) {
                int i27 = iArr5[i18 - 16] & i25;
                System.arraycopy(iArr6[i27 >>> b11], (i27 & i17) * i18, iArr4, 0, i18);
                h(iArr4, iArr5, 0, iArr4);
                a(iArr4, iArr2, iArr3, iArr5, i14);
            }
            System.arraycopy(iArr5, 0, iArr, i11, i18);
            d(iArr6);
            d(new int[][]{iArr5, iArr2, iArr3, iArr4});
        } catch (Throwable th2) {
            d(iArr6);
            d(new int[][]{iArr5, iArr2, iArr3, iArr4});
            throw th2;
        }
    }

    private static byte[] g(byte[] bArr, byte[] bArr2, int i11) {
        x xVar = new x(new i50.x());
        xVar.init(bArr, bArr2, 1);
        return ((b1) xVar.generateDerivedMacParameters(i11 * 8)).a();
    }

    private static void h(int[] iArr, int[] iArr2, int i11, int[] iArr3) {
        for (int length = iArr3.length - 1; length >= 0; length--) {
            iArr3[length] = iArr[length] ^ iArr2[i11 + length];
        }
    }

    public static byte[] i(byte[] bArr, byte[] bArr2, int i11, int i12, int i13, int i14) {
        if (bArr != null) {
            if (bArr2 != null) {
                if (i11 <= 1 || !j(i11)) {
                    throw new IllegalArgumentException("Cost parameter N must be > 1 and a power of 2");
                }
                if (i12 != 1 || i11 < 65536) {
                    if (i12 >= 1) {
                        int i15 = Integer.MAX_VALUE / ((i12 * 128) * 8);
                        if (i13 >= 1 && i13 <= i15) {
                            if (i14 >= 1) {
                                return e(bArr, bArr2, i11, i12, i13, i14);
                            }
                            throw new IllegalArgumentException("Generated key length dkLen must be >= 1.");
                        }
                        throw new IllegalArgumentException("Parallelisation parameter p must be >= 1 and <= " + i15 + " (based on block size r of " + i12 + ")");
                    }
                    throw new IllegalArgumentException("Block size r must be >= 1.");
                }
                throw new IllegalArgumentException("Cost parameter N must be > 1 and < 65536.");
            }
            throw new IllegalArgumentException("Salt S must be provided.");
        }
        throw new IllegalArgumentException("Passphrase P must be provided.");
    }

    private static boolean j(int i11) {
        return (i11 & (i11 + (-1))) == 0;
    }
}