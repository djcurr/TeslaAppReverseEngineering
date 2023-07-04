package m50;

import java.math.BigInteger;
import org.bouncycastle.crypto.e;
import r70.i;

/* loaded from: classes5.dex */
class d {

    /* renamed from: a  reason: collision with root package name */
    protected static final double f38420a = Math.log(2.0d);

    /* renamed from: b  reason: collision with root package name */
    protected static final double f38421b = Math.pow(2.0d, 96.0d);

    protected static short[] A(e eVar, int i11, byte[] bArr, short[] sArr, int i12, int i13) {
        int i14 = i13 / 2;
        int i15 = i13 - i14;
        short[] sArr2 = new short[i15];
        short[] sArr3 = new short[i14];
        System.arraycopy(sArr, i12, sArr2, 0, i15);
        System.arraycopy(sArr, i12 + i15, sArr3, 0, i14);
        return m(eVar, i11, bArr, i13, i14, i15, sArr2, sArr3);
    }

    protected static byte[] B(e eVar, int i11, byte[] bArr, byte[] bArr2, int i12, int i13) {
        int i14 = i13 / 2;
        int i15 = i13 - i14;
        return J(s(eVar, i11, bArr, i13, i14, i15, K(bArr2, i12, i15), K(bArr2, i12 + i15, i14)));
    }

    protected static short[] C(e eVar, int i11, byte[] bArr, short[] sArr, int i12, int i13) {
        int i14 = i13 / 2;
        int i15 = i13 - i14;
        short[] sArr2 = new short[i15];
        short[] sArr3 = new short[i14];
        System.arraycopy(sArr, i12, sArr2, 0, i15);
        System.arraycopy(sArr, i12 + i15, sArr3, 0, i14);
        return s(eVar, i11, bArr, i13, i14, i15, sArr2, sArr3);
    }

    protected static BigInteger D(BigInteger bigInteger, short[] sArr) {
        BigInteger bigInteger2 = r70.a.f49293a;
        for (short s11 : sArr) {
            bigInteger2 = bigInteger2.multiply(bigInteger).add(BigInteger.valueOf(s11 & 65535));
        }
        return bigInteger2;
    }

    protected static BigInteger E(byte[] bArr, int i11, int i12) {
        return new BigInteger(1, org.bouncycastle.util.a.w(bArr, i11, i12 + i11));
    }

    protected static byte[] F(e eVar, byte[] bArr) {
        if (bArr.length % 16 == 0) {
            int length = bArr.length / 16;
            byte[] bArr2 = new byte[16];
            for (int i11 = 0; i11 < length; i11++) {
                L(bArr, i11 * 16, bArr2, 0, 16);
                eVar.processBlock(bArr2, 0, bArr2, 0);
            }
            return bArr2;
        }
        throw new IllegalArgumentException();
    }

    protected static void G(byte[] bArr) {
        int length = bArr.length / 2;
        int length2 = bArr.length - 1;
        for (int i11 = 0; i11 < length; i11++) {
            byte b11 = bArr[i11];
            int i12 = length2 - i11;
            bArr[i11] = bArr[i12];
            bArr[i12] = b11;
        }
    }

    protected static void H(short[] sArr) {
        int length = sArr.length / 2;
        int length2 = sArr.length - 1;
        for (int i11 = 0; i11 < length; i11++) {
            short s11 = sArr[i11];
            int i12 = length2 - i11;
            sArr[i11] = sArr[i12];
            sArr[i12] = s11;
        }
    }

    protected static void I(BigInteger bigInteger, BigInteger bigInteger2, int i11, short[] sArr, int i12) {
        if (bigInteger2.signum() < 0) {
            throw new IllegalArgumentException();
        }
        for (int i13 = 1; i13 <= i11; i13++) {
            BigInteger[] divideAndRemainder = bigInteger2.divideAndRemainder(bigInteger);
            sArr[(i12 + i11) - i13] = (short) divideAndRemainder[1].intValue();
            bigInteger2 = divideAndRemainder[0];
        }
        if (bigInteger2.signum() != 0) {
            throw new IllegalArgumentException();
        }
    }

    private static byte[] J(short[] sArr) {
        int length = sArr.length;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 != length; i11++) {
            bArr[i11] = (byte) sArr[i11];
        }
        return bArr;
    }

    private static short[] K(byte[] bArr, int i11, int i12) {
        short[] sArr = new short[i12];
        for (int i13 = 0; i13 != i12; i13++) {
            sArr[i13] = (short) (bArr[i11 + i13] & 255);
        }
        return sArr;
    }

    protected static void L(byte[] bArr, int i11, byte[] bArr2, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i12 + i14;
            bArr2[i15] = (byte) (bArr2[i15] ^ bArr[i11 + i14]);
        }
    }

    protected static BigInteger[] a(BigInteger bigInteger, int i11, int i12) {
        BigInteger[] bigIntegerArr = {bigInteger.pow(i11), bigIntegerArr[0]};
        if (i12 != i11) {
            bigIntegerArr[1] = bigIntegerArr[1].multiply(bigInteger);
        }
        return bigIntegerArr;
    }

    protected static byte[] b(int i11, byte b11, int i12, int i13) {
        byte[] bArr = {1, 2, 1, 0, (byte) (i11 >> 8), (byte) i11, 10, b11};
        i.f(i12, bArr, 8);
        i.f(i13, bArr, 12);
        return bArr;
    }

    protected static byte[] c(byte[] bArr) {
        return new byte[]{bArr[0], bArr[1], bArr[2], (byte) (bArr[3] & 240), bArr[4], bArr[5], bArr[6], (byte) (bArr[3] << 4)};
    }

    protected static BigInteger d(e eVar, BigInteger bigInteger, byte[] bArr, int i11, int i12, int i13, byte[] bArr2, short[] sArr) {
        int length = bArr.length;
        byte[] c11 = r70.a.c(D(bigInteger, sArr));
        int i14 = ((-(length + i11 + 1)) & 15) + length;
        int i15 = i14 + 1 + i11;
        byte[] bArr3 = new byte[i15];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        bArr3[i14] = (byte) i13;
        System.arraycopy(c11, 0, bArr3, i15 - c11.length, c11.length);
        byte[] F = F(eVar, org.bouncycastle.util.a.p(bArr2, bArr3));
        if (i12 > 16) {
            int i16 = ((i12 + 16) - 1) / 16;
            byte[] bArr4 = new byte[i16 * 16];
            System.arraycopy(F, 0, bArr4, 0, 16);
            byte[] bArr5 = new byte[4];
            for (int i17 = 1; i17 < i16; i17++) {
                int i18 = i17 * 16;
                System.arraycopy(F, 0, bArr4, i18, 16);
                i.f(i17, bArr5, 0);
                L(bArr5, 0, bArr4, (i18 + 16) - 4, 4);
                eVar.processBlock(bArr4, i18, bArr4, i18);
            }
            F = bArr4;
        }
        return E(F, 0, i12);
    }

    protected static BigInteger e(e eVar, BigInteger bigInteger, byte[] bArr, int i11, int i12, short[] sArr) {
        byte[] bArr2 = new byte[16];
        i.f(i12, bArr2, 0);
        L(bArr, i11, bArr2, 0, 4);
        byte[] c11 = r70.a.c(D(bigInteger, sArr));
        if (16 - c11.length >= 4) {
            System.arraycopy(c11, 0, bArr2, 16 - c11.length, c11.length);
            G(bArr2);
            eVar.processBlock(bArr2, 0, bArr2, 0);
            G(bArr2);
            return E(bArr2, 0, 16);
        }
        throw new IllegalStateException("input out of range");
    }

    protected static void f(e eVar, boolean z11, int i11, byte[] bArr, int i12, int i13) {
        h(eVar);
        if (i11 < 2 || i11 > 256) {
            throw new IllegalArgumentException();
        }
        i(z11, i11, bArr, i12, i13);
    }

    protected static void g(e eVar, boolean z11, int i11, short[] sArr, int i12, int i13) {
        h(eVar);
        if (i11 < 2 || i11 > 65536) {
            throw new IllegalArgumentException();
        }
        j(z11, i11, sArr, i12, i13);
    }

    protected static void h(e eVar) {
        if (16 != eVar.getBlockSize()) {
            throw new IllegalArgumentException();
        }
    }

    protected static void i(boolean z11, int i11, byte[] bArr, int i12, int i13) {
        k(z11, i11, i13);
        for (int i14 = 0; i14 < i13; i14++) {
            if ((bArr[i12 + i14] & 255) >= i11) {
                throw new IllegalArgumentException("input data outside of radix");
            }
        }
    }

    protected static void j(boolean z11, int i11, short[] sArr, int i12, int i13) {
        k(z11, i11, i13);
        for (int i14 = 0; i14 < i13; i14++) {
            if ((sArr[i12 + i14] & 65535) >= i11) {
                throw new IllegalArgumentException("input data outside of radix");
            }
        }
    }

    private static void k(boolean z11, int i11, int i12) {
        int floor;
        if (i12 >= 2) {
            double d11 = i11;
            if (Math.pow(d11, i12) >= 1000000.0d) {
                if (z11 || i12 <= (floor = ((int) Math.floor(Math.log(f38421b) / Math.log(d11))) * 2)) {
                    return;
                }
                throw new IllegalArgumentException("maximum input length is " + floor);
            }
        }
        throw new IllegalArgumentException("input too short");
    }

    static short[] l(e eVar, int i11, byte[] bArr, int i12, int i13, int i14, short[] sArr, short[] sArr2) {
        int length = bArr.length;
        int ceil = (((int) Math.ceil((Math.log(i11) * i14) / f38420a)) + 7) / 8;
        int i15 = (((ceil + 3) / 4) * 4) + 4;
        byte[] b11 = b(i11, (byte) i13, i12, length);
        BigInteger valueOf = BigInteger.valueOf(i11);
        BigInteger[] a11 = a(valueOf, i13, i14);
        short[] sArr3 = sArr;
        short[] sArr4 = sArr2;
        int i16 = i13;
        int i17 = 9;
        while (i17 >= 0) {
            short[] sArr5 = sArr4;
            i16 = i12 - i16;
            I(valueOf, D(valueOf, sArr5).subtract(d(eVar, valueOf, bArr, ceil, i15, i17, b11, sArr3)).mod(a11[i17 & 1]), i16, sArr5, 0);
            i17--;
            sArr4 = sArr3;
            sArr3 = sArr5;
        }
        return org.bouncycastle.util.a.s(sArr3, sArr4);
    }

    private static short[] m(e eVar, int i11, byte[] bArr, int i12, int i13, int i14, short[] sArr, short[] sArr2) {
        BigInteger valueOf = BigInteger.valueOf(i11);
        int i15 = i14;
        BigInteger[] a11 = a(valueOf, i13, i15);
        H(sArr);
        H(sArr2);
        short[] sArr3 = sArr;
        short[] sArr4 = sArr2;
        int i16 = 7;
        while (i16 >= 0) {
            int i17 = i12 - i15;
            int i18 = i16 & 1;
            I(valueOf, D(valueOf, sArr4).subtract(e(eVar, valueOf, bArr, 4 - (i18 * 4), i16, sArr3)).mod(a11[1 - i18]), i17, sArr4, 0);
            i16--;
            i15 = i17;
            short[] sArr5 = sArr4;
            sArr4 = sArr3;
            sArr3 = sArr5;
        }
        H(sArr3);
        H(sArr4);
        return org.bouncycastle.util.a.s(sArr3, sArr4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] n(e eVar, int i11, byte[] bArr, byte[] bArr2, int i12, int i13) {
        f(eVar, true, i11, bArr2, i12, i13);
        int i14 = i13 / 2;
        int i15 = i13 - i14;
        return J(l(eVar, i11, bArr, i13, i14, i15, K(bArr2, i12, i14), K(bArr2, i12 + i14, i15)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static short[] o(e eVar, int i11, byte[] bArr, short[] sArr, int i12, int i13) {
        g(eVar, true, i11, sArr, i12, i13);
        int i14 = i13 / 2;
        int i15 = i13 - i14;
        short[] sArr2 = new short[i14];
        short[] sArr3 = new short[i15];
        System.arraycopy(sArr, i12, sArr2, 0, i14);
        System.arraycopy(sArr, i12 + i14, sArr3, 0, i15);
        return l(eVar, i11, bArr, i13, i14, i15, sArr2, sArr3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] p(e eVar, int i11, byte[] bArr, byte[] bArr2, int i12, int i13) {
        f(eVar, false, i11, bArr2, i12, i13);
        if (bArr.length == 7) {
            return z(eVar, i11, c(bArr), bArr2, i12, i13);
        }
        throw new IllegalArgumentException("tweak should be 56 bits");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static short[] q(e eVar, int i11, byte[] bArr, short[] sArr, int i12, int i13) {
        g(eVar, false, i11, sArr, i12, i13);
        if (bArr.length == 7) {
            return A(eVar, i11, c(bArr), sArr, i12, i13);
        }
        throw new IllegalArgumentException("tweak should be 56 bits");
    }

    private static short[] r(e eVar, int i11, byte[] bArr, int i12, int i13, int i14, short[] sArr, short[] sArr2) {
        int length = bArr.length;
        int ceil = (((int) Math.ceil((Math.log(i11) * i14) / f38420a)) + 7) / 8;
        int i15 = (((ceil + 3) / 4) * 4) + 4;
        byte[] b11 = b(i11, (byte) i13, i12, length);
        BigInteger valueOf = BigInteger.valueOf(i11);
        BigInteger[] a11 = a(valueOf, i13, i14);
        short[] sArr3 = sArr;
        short[] sArr4 = sArr2;
        int i16 = i14;
        int i17 = 0;
        while (i17 < 10) {
            int i18 = i17;
            short[] sArr5 = sArr3;
            sArr3 = sArr4;
            BigInteger d11 = d(eVar, valueOf, bArr, ceil, i15, i17, b11, sArr3);
            int i19 = i12 - i16;
            I(valueOf, D(valueOf, sArr5).add(d11).mod(a11[i18 & 1]), i19, sArr5, 0);
            i17 = i18 + 1;
            i16 = i19;
            sArr4 = sArr5;
        }
        return org.bouncycastle.util.a.s(sArr3, sArr4);
    }

    private static short[] s(e eVar, int i11, byte[] bArr, int i12, int i13, int i14, short[] sArr, short[] sArr2) {
        BigInteger valueOf = BigInteger.valueOf(i11);
        int i15 = i13;
        BigInteger[] a11 = a(valueOf, i15, i14);
        H(sArr);
        H(sArr2);
        short[] sArr3 = sArr;
        short[] sArr4 = sArr2;
        int i16 = 0;
        while (i16 < 8) {
            i15 = i12 - i15;
            int i17 = i16 & 1;
            I(valueOf, D(valueOf, sArr3).add(e(eVar, valueOf, bArr, 4 - (i17 * 4), i16, sArr4)).mod(a11[1 - i17]), i15, sArr3, 0);
            i16++;
            short[] sArr5 = sArr4;
            sArr4 = sArr3;
            sArr3 = sArr5;
        }
        H(sArr3);
        H(sArr4);
        return org.bouncycastle.util.a.s(sArr3, sArr4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] t(e eVar, int i11, byte[] bArr, byte[] bArr2, int i12, int i13) {
        f(eVar, true, i11, bArr2, i12, i13);
        int i14 = i13 / 2;
        int i15 = i13 - i14;
        return J(r(eVar, i11, bArr, i13, i14, i15, K(bArr2, i12, i14), K(bArr2, i12 + i14, i15)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static short[] u(e eVar, int i11, byte[] bArr, short[] sArr, int i12, int i13) {
        g(eVar, true, i11, sArr, i12, i13);
        int i14 = i13 / 2;
        int i15 = i13 - i14;
        short[] sArr2 = new short[i14];
        short[] sArr3 = new short[i15];
        System.arraycopy(sArr, i12, sArr2, 0, i14);
        System.arraycopy(sArr, i12 + i14, sArr3, 0, i15);
        return r(eVar, i11, bArr, i13, i14, i15, sArr2, sArr3);
    }

    static byte[] v(e eVar, int i11, byte[] bArr, byte[] bArr2, int i12, int i13) {
        f(eVar, false, i11, bArr2, i12, i13);
        if (bArr.length == 8) {
            return B(eVar, i11, bArr, bArr2, i12, i13);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] w(e eVar, int i11, byte[] bArr, byte[] bArr2, int i12, int i13) {
        f(eVar, false, i11, bArr2, i12, i13);
        if (bArr.length == 7) {
            return v(eVar, i11, c(bArr), bArr2, i12, i13);
        }
        throw new IllegalArgumentException("tweak should be 56 bits");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static short[] x(e eVar, int i11, byte[] bArr, short[] sArr, int i12, int i13) {
        g(eVar, false, i11, sArr, i12, i13);
        if (bArr.length == 7) {
            return y(eVar, i11, c(bArr), sArr, i12, i13);
        }
        throw new IllegalArgumentException("tweak should be 56 bits");
    }

    static short[] y(e eVar, int i11, byte[] bArr, short[] sArr, int i12, int i13) {
        g(eVar, false, i11, sArr, i12, i13);
        if (bArr.length == 8) {
            return C(eVar, i11, bArr, sArr, i12, i13);
        }
        throw new IllegalArgumentException();
    }

    protected static byte[] z(e eVar, int i11, byte[] bArr, byte[] bArr2, int i12, int i13) {
        int i14 = i13 / 2;
        int i15 = i13 - i14;
        return J(m(eVar, i11, bArr, i13, i14, i15, K(bArr2, i12, i15), K(bArr2, i12 + i15, i14)));
    }
}