package s60;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f50300a = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f50301b = {34513072, 59165138, 4688974, 3500415, 6194736, 33281959, 54535759, 32551604, 163342, 5703241};

    public static void A(int[] iArr, int[] iArr2) {
        for (int i11 = 0; i11 < 10; i11++) {
            iArr2[i11] = -iArr[i11];
        }
    }

    public static void B(int[] iArr) {
        int i11 = (iArr[9] >>> 23) & 1;
        E(iArr, i11);
        E(iArr, -i11);
    }

    public static void C(int[] iArr) {
        iArr[0] = 1;
        for (int i11 = 1; i11 < 10; i11++) {
            iArr[i11] = 0;
        }
    }

    private static void D(int[] iArr, int[] iArr2, int[] iArr3) {
        G(iArr, iArr2);
        z(iArr, iArr2, iArr2);
        int[] h11 = h();
        G(iArr2, h11);
        z(iArr, h11, h11);
        F(h11, 2, h11);
        z(iArr2, h11, h11);
        int[] h12 = h();
        F(h11, 5, h12);
        z(h11, h12, h12);
        int[] h13 = h();
        F(h12, 5, h13);
        z(h11, h13, h13);
        F(h13, 10, h11);
        z(h12, h11, h11);
        F(h11, 25, h12);
        z(h11, h12, h12);
        F(h12, 25, h13);
        z(h11, h13, h13);
        F(h13, 50, h11);
        z(h12, h11, h11);
        F(h11, 125, h12);
        z(h11, h12, h12);
        F(h12, 2, h11);
        z(h11, iArr, iArr3);
    }

    private static void E(int[] iArr, int i11) {
        int i12 = iArr[9];
        long j11 = (((i12 >> 24) + i11) * 19) + iArr[0];
        iArr[0] = ((int) j11) & 67108863;
        long j12 = (j11 >> 26) + iArr[1];
        iArr[1] = ((int) j12) & 67108863;
        long j13 = (j12 >> 26) + iArr[2];
        iArr[2] = ((int) j13) & 33554431;
        long j14 = (j13 >> 25) + iArr[3];
        iArr[3] = ((int) j14) & 67108863;
        long j15 = (j14 >> 26) + iArr[4];
        iArr[4] = ((int) j15) & 33554431;
        long j16 = (j15 >> 25) + iArr[5];
        iArr[5] = ((int) j16) & 67108863;
        long j17 = (j16 >> 26) + iArr[6];
        iArr[6] = ((int) j17) & 67108863;
        long j18 = (j17 >> 26) + iArr[7];
        iArr[7] = 33554431 & ((int) j18);
        long j19 = (j18 >> 25) + iArr[8];
        iArr[8] = 67108863 & ((int) j19);
        iArr[9] = (16777215 & i12) + ((int) (j19 >> 26));
    }

    public static void F(int[] iArr, int i11, int[] iArr2) {
        G(iArr, iArr2);
        while (true) {
            i11--;
            if (i11 <= 0) {
                return;
            }
            G(iArr2, iArr2);
        }
    }

    public static void G(int[] iArr, int[] iArr2) {
        long j11;
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = iArr[4];
        int i16 = iArr[5];
        int i17 = iArr[6];
        int i18 = iArr[7];
        int i19 = iArr[8];
        int i21 = iArr[9];
        long j12 = i11;
        long j13 = j12 * j12;
        long j14 = i12 * 2;
        long j15 = j12 * j14;
        long j16 = i13 * 2;
        long j17 = i12;
        long j18 = (j12 * j16) + (j17 * j17);
        long j19 = i14 * 2;
        long j21 = i15 * 2;
        long j22 = (i13 * j16) + (j12 * j21) + (j17 * j19);
        long j23 = (j14 * j21) + (j19 * j16);
        long j24 = i14;
        long j25 = (j16 * j21) + (j24 * j24);
        long j26 = j24 * j21;
        long j27 = i15 * j21;
        int i22 = i21 * 2;
        long j28 = i16;
        long j29 = j28 * j28;
        long j31 = i17 * 2;
        long j32 = j28 * j31;
        long j33 = i18 * 2;
        long j34 = i17;
        long j35 = (j28 * j33) + (j34 * j34);
        long j36 = i19 * 2;
        long j37 = i22;
        long j38 = (i18 * j33) + (j28 * j37) + (j34 * j36);
        long j39 = i19;
        long j41 = j13 - (((j31 * j37) + (j36 * j33)) * 38);
        long j42 = j15 - (((j33 * j37) + (j39 * j39)) * 38);
        long j43 = j18 - ((j39 * j37) * 38);
        long j44 = ((j14 * j16) + (j12 * j19)) - ((i21 * j37) * 38);
        long j45 = j23 - j29;
        long j46 = j25 - j32;
        long j47 = j26 - j35;
        long j48 = j27 - ((j31 * j33) + (j28 * j36));
        int i23 = i12 + i17;
        int i24 = i13 + i18;
        int i25 = i14 + i19;
        int i26 = i15 + i21;
        long j49 = i11 + i16;
        long j51 = j49 * j49;
        long j52 = i23 * 2;
        long j53 = j49 * j52;
        long j54 = i24 * 2;
        long j55 = i23;
        long j56 = (j49 * j54) + (j55 * j55);
        long j57 = i25 * 2;
        long j58 = i26 * 2;
        long j59 = (j52 * j58) + (j57 * j54);
        long j61 = i25;
        long j62 = (j54 * j58) + (j61 * j61);
        long j63 = j61 * j58;
        long j64 = i26 * j58;
        long j65 = ((j48 + (((j52 * j54) + (j49 * j57)) - j44)) >> 26) + (((((i24 * j54) + (j49 * j58)) + (j55 * j57)) - j22) - j38);
        long j66 = j41 + ((((j65 >> 25) + j59) - j45) * 38);
        iArr2[0] = ((int) j66) & 67108863;
        long j67 = (j66 >> 26) + j42 + ((j62 - j46) * 38);
        iArr2[1] = ((int) j67) & 67108863;
        long j68 = (j67 >> 26) + j43 + ((j63 - j47) * 38);
        iArr2[2] = ((int) j68) & 33554431;
        long j69 = (j68 >> 25) + j44 + ((j64 - j48) * 38);
        iArr2[3] = ((int) j69) & 67108863;
        long j71 = (j69 >> 26) + j22 + (38 * j38);
        iArr2[4] = ((int) j71) & 33554431;
        long j72 = (j71 >> 25) + j45 + (j51 - j41);
        iArr2[5] = ((int) j72) & 67108863;
        long j73 = (j72 >> 26) + j46 + (j53 - j42);
        iArr2[6] = ((int) j73) & 67108863;
        long j74 = (j73 >> 26) + j47 + (j56 - j43);
        iArr2[7] = ((int) j74) & 33554431;
        long j75 = (j74 >> 25) + (((int) j11) & 67108863);
        iArr2[8] = ((int) j75) & 67108863;
        iArr2[9] = (((int) j65) & 33554431) + ((int) (j75 >> 26));
    }

    public static boolean H(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] h11 = h();
        int[] h12 = h();
        z(iArr, iArr2, h11);
        G(iArr2, h12);
        z(h11, h12, h11);
        G(h12, h12);
        z(h12, h11, h12);
        int[] h13 = h();
        int[] h14 = h();
        D(h12, h13, h14);
        z(h14, h11, h14);
        int[] h15 = h();
        G(h14, h15);
        z(h15, iArr2, h15);
        I(h15, iArr, h13);
        B(h13);
        if (x(h13)) {
            g(h14, 0, iArr3, 0);
            return true;
        }
        a(h15, iArr, h13);
        B(h13);
        if (x(h13)) {
            z(h14, f50301b, iArr3);
            return true;
        }
        return false;
    }

    public static void I(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i11 = 0; i11 < 10; i11++) {
            iArr3[i11] = iArr[i11] - iArr2[i11];
        }
    }

    public static void J(int[] iArr) {
        iArr[0] = iArr[0] - 1;
    }

    public static void K(int[] iArr) {
        for (int i11 = 0; i11 < 10; i11++) {
            iArr[i11] = 0;
        }
    }

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i11 = 0; i11 < 10; i11++) {
            iArr3[i11] = iArr[i11] + iArr2[i11];
        }
    }

    public static void b(int[] iArr) {
        iArr[0] = iArr[0] + 1;
    }

    public static void c(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        for (int i11 = 0; i11 < 10; i11++) {
            int i12 = iArr[i11];
            int i13 = iArr2[i11];
            iArr3[i11] = i12 + i13;
            iArr4[i11] = i12 - i13;
        }
    }

    public static void d(int[] iArr) {
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = iArr[4];
        int i16 = iArr[5];
        int i17 = iArr[6];
        int i18 = iArr[7];
        int i19 = iArr[8];
        int i21 = i13 + (i12 >> 26);
        int i22 = i15 + (i14 >> 26);
        int i23 = i18 + (i17 >> 26);
        int i24 = iArr[9] + (i19 >> 26);
        int i25 = (i14 & 67108863) + (i21 >> 25);
        int i26 = i16 + (i22 >> 25);
        int i27 = (i19 & 67108863) + (i23 >> 25);
        int i28 = i11 + ((i24 >> 25) * 38);
        int i29 = (i12 & 67108863) + (i28 >> 26);
        int i31 = (i17 & 67108863) + (i26 >> 26);
        iArr[0] = i28 & 67108863;
        iArr[1] = i29 & 67108863;
        iArr[2] = (i21 & 33554431) + (i29 >> 26);
        iArr[3] = i25 & 67108863;
        iArr[4] = (i22 & 33554431) + (i25 >> 26);
        iArr[5] = i26 & 67108863;
        iArr[6] = i31 & 67108863;
        iArr[7] = (i23 & 33554431) + (i31 >> 26);
        iArr[8] = i27 & 67108863;
        iArr[9] = (i24 & 33554431) + (i27 >> 26);
    }

    public static void e(int i11, int[] iArr, int i12, int[] iArr2, int i13) {
        for (int i14 = 0; i14 < 10; i14++) {
            int i15 = i13 + i14;
            int i16 = iArr2[i15];
            iArr2[i15] = i16 ^ ((iArr[i12 + i14] ^ i16) & i11);
        }
    }

    public static void f(int i11, int[] iArr) {
        int i12 = 0 - i11;
        for (int i13 = 0; i13 < 10; i13++) {
            iArr[i13] = (iArr[i13] ^ i12) - i12;
        }
    }

    public static void g(int[] iArr, int i11, int[] iArr2, int i12) {
        for (int i13 = 0; i13 < 10; i13++) {
            iArr2[i12 + i13] = iArr[i11 + i13];
        }
    }

    public static int[] h() {
        return new int[10];
    }

    public static int[] i(int i11) {
        return new int[i11 * 10];
    }

    public static void j(int i11, int[] iArr, int[] iArr2) {
        int i12 = 0 - i11;
        for (int i13 = 0; i13 < 10; i13++) {
            int i14 = iArr[i13];
            int i15 = iArr2[i13];
            int i16 = (i14 ^ i15) & i12;
            iArr[i13] = i14 ^ i16;
            iArr2[i13] = i15 ^ i16;
        }
    }

    public static void k(byte[] bArr, int i11, int[] iArr) {
        m(bArr, i11, iArr, 0);
        m(bArr, i11 + 16, iArr, 5);
        iArr[9] = iArr[9] & 16777215;
    }

    public static void l(int[] iArr, int i11, int[] iArr2) {
        n(iArr, i11, iArr2, 0);
        n(iArr, i11 + 4, iArr2, 5);
        iArr2[9] = iArr2[9] & 16777215;
    }

    private static void m(byte[] bArr, int i11, int[] iArr, int i12) {
        int o11 = o(bArr, i11 + 0);
        int o12 = o(bArr, i11 + 4);
        int o13 = o(bArr, i11 + 8);
        int o14 = o(bArr, i11 + 12);
        iArr[i12 + 0] = o11 & 67108863;
        iArr[i12 + 1] = ((o11 >>> 26) | (o12 << 6)) & 67108863;
        iArr[i12 + 2] = ((o13 << 12) | (o12 >>> 20)) & 33554431;
        iArr[i12 + 3] = ((o14 << 19) | (o13 >>> 13)) & 67108863;
        iArr[i12 + 4] = o14 >>> 7;
    }

    private static void n(int[] iArr, int i11, int[] iArr2, int i12) {
        int i13 = iArr[i11 + 0];
        int i14 = iArr[i11 + 1];
        int i15 = iArr[i11 + 2];
        int i16 = iArr[i11 + 3];
        iArr2[i12 + 0] = i13 & 67108863;
        iArr2[i12 + 1] = ((i13 >>> 26) | (i14 << 6)) & 67108863;
        iArr2[i12 + 2] = ((i15 << 12) | (i14 >>> 20)) & 33554431;
        iArr2[i12 + 3] = ((i16 << 19) | (i15 >>> 13)) & 67108863;
        iArr2[i12 + 4] = i16 >>> 7;
    }

    private static int o(byte[] bArr, int i11) {
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        return (bArr[i13 + 1] << 24) | (bArr[i11] & 255) | ((bArr[i12] & 255) << 8) | ((bArr[i13] & 255) << 16);
    }

    public static void p(int[] iArr, byte[] bArr, int i11) {
        r(iArr, 0, bArr, i11);
        r(iArr, 5, bArr, i11 + 16);
    }

    public static void q(int[] iArr, int[] iArr2, int i11) {
        s(iArr, 0, iArr2, i11);
        s(iArr, 5, iArr2, i11 + 4);
    }

    private static void r(int[] iArr, int i11, byte[] bArr, int i12) {
        int i13 = iArr[i11 + 0];
        int i14 = iArr[i11 + 1];
        int i15 = iArr[i11 + 2];
        int i16 = iArr[i11 + 3];
        int i17 = iArr[i11 + 4];
        t((i14 << 26) | i13, bArr, i12 + 0);
        t((i14 >>> 6) | (i15 << 20), bArr, i12 + 4);
        t((i15 >>> 12) | (i16 << 13), bArr, i12 + 8);
        t((i17 << 7) | (i16 >>> 19), bArr, i12 + 12);
    }

    private static void s(int[] iArr, int i11, int[] iArr2, int i12) {
        int i13 = iArr[i11 + 0];
        int i14 = iArr[i11 + 1];
        int i15 = iArr[i11 + 2];
        int i16 = iArr[i11 + 3];
        int i17 = iArr[i11 + 4];
        iArr2[i12 + 0] = i13 | (i14 << 26);
        iArr2[i12 + 1] = (i14 >>> 6) | (i15 << 20);
        iArr2[i12 + 2] = (i15 >>> 12) | (i16 << 13);
        iArr2[i12 + 3] = (i17 << 7) | (i16 >>> 19);
    }

    private static void t(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) i11;
        int i13 = i12 + 1;
        bArr[i13] = (byte) (i11 >>> 8);
        int i14 = i13 + 1;
        bArr[i14] = (byte) (i11 >>> 16);
        bArr[i14 + 1] = (byte) (i11 >>> 24);
    }

    public static void u(int[] iArr, int[] iArr2) {
        int[] h11 = h();
        int[] iArr3 = new int[8];
        g(iArr, 0, h11, 0);
        B(h11);
        q(h11, iArr3, 0);
        v60.c.k(f50300a, iArr3, iArr3);
        l(iArr3, 0, iArr2);
    }

    public static void v(int[] iArr, int[] iArr2) {
        int[] h11 = h();
        int[] iArr3 = new int[8];
        g(iArr, 0, h11, 0);
        B(h11);
        q(h11, iArr3, 0);
        v60.c.l(f50300a, iArr3, iArr3);
        l(iArr3, 0, iArr2);
    }

    public static int w(int[] iArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 10; i12++) {
            i11 |= iArr[i12];
        }
        return (((i11 >>> 1) | (i11 & 1)) - 1) >> 31;
    }

    public static boolean x(int[] iArr) {
        return w(iArr) != 0;
    }

    public static void y(int[] iArr, int i11, int[] iArr2) {
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        int i15 = iArr[3];
        int i16 = iArr[4];
        int i17 = iArr[5];
        int i18 = iArr[6];
        int i19 = iArr[7];
        int i21 = iArr[8];
        long j11 = i11;
        long j12 = i14 * j11;
        long j13 = i16 * j11;
        int i22 = ((int) j13) & 33554431;
        long j14 = i19 * j11;
        long j15 = iArr[9] * j11;
        int i23 = ((int) j15) & 33554431;
        long j16 = ((j15 >> 25) * 38) + (i12 * j11);
        iArr2[0] = ((int) j16) & 67108863;
        long j17 = (j13 >> 25) + (i17 * j11);
        iArr2[5] = ((int) j17) & 67108863;
        long j18 = (j16 >> 26) + (i13 * j11);
        iArr2[1] = ((int) j18) & 67108863;
        long j19 = (j12 >> 25) + (i15 * j11);
        iArr2[3] = ((int) j19) & 67108863;
        long j21 = (j17 >> 26) + (i18 * j11);
        iArr2[6] = ((int) j21) & 67108863;
        long j22 = (j14 >> 25) + (i21 * j11);
        iArr2[8] = ((int) j22) & 67108863;
        iArr2[2] = (((int) j12) & 33554431) + ((int) (j18 >> 26));
        iArr2[4] = i22 + ((int) (j19 >> 26));
        iArr2[7] = (((int) j14) & 33554431) + ((int) (j21 >> 26));
        iArr2[9] = i23 + ((int) (j22 >> 26));
    }

    public static void z(int[] iArr, int[] iArr2, int[] iArr3) {
        long j11;
        int i11 = iArr[0];
        int i12 = iArr2[0];
        int i13 = iArr[1];
        int i14 = iArr2[1];
        int i15 = iArr[2];
        int i16 = iArr2[2];
        int i17 = iArr[3];
        int i18 = iArr2[3];
        int i19 = iArr[4];
        int i21 = iArr2[4];
        int i22 = iArr[5];
        int i23 = iArr2[5];
        int i24 = iArr[6];
        int i25 = iArr2[6];
        int i26 = iArr[7];
        int i27 = iArr2[7];
        int i28 = iArr[8];
        int i29 = iArr2[8];
        int i31 = iArr[9];
        int i32 = iArr2[9];
        long j12 = i11;
        long j13 = i12;
        long j14 = j12 * j13;
        long j15 = i14;
        long j16 = i13;
        long j17 = i16;
        long j18 = i15;
        long j19 = (j12 * j17) + (j16 * j15) + (j18 * j13);
        long j21 = i18;
        long j22 = j12 * j21;
        long j23 = i17;
        long j24 = (((j16 * j17) + (j18 * j15)) << 1) + j22 + (j23 * j13);
        long j25 = i21;
        long j26 = i19;
        long j27 = ((j18 * j17) << 1) + (j12 * j25) + (j16 * j21) + (j23 * j15) + (j13 * j26);
        long j28 = ((((j16 * j25) + (j18 * j21)) + (j23 * j17)) + (j26 * j15)) << 1;
        long j29 = (((j18 * j25) + (j26 * j17)) << 1) + (j23 * j21);
        long j31 = (j23 * j25) + (j26 * j21);
        long j32 = (j26 * j25) << 1;
        long j33 = i22;
        long j34 = i23;
        long j35 = i25;
        long j36 = i24;
        long j37 = i27;
        long j38 = i26;
        long j39 = (j33 * j37) + (j36 * j35) + (j38 * j34);
        long j41 = i29;
        long j42 = i28;
        long j43 = (((j36 * j37) + (j38 * j35)) << 1) + (j33 * j41) + (j42 * j34);
        long j44 = i32;
        long j45 = i31;
        long j46 = ((j38 * j37) << 1) + (j33 * j44) + (j36 * j41) + (j42 * j35) + (j34 * j45);
        long j47 = j14 - (((((j36 * j44) + (j38 * j41)) + (j42 * j37)) + (j45 * j35)) * 76);
        long j48 = ((j12 * j15) + (j16 * j13)) - (((((j38 * j44) + (j45 * j37)) << 1) + (j42 * j41)) * 38);
        long j49 = j19 - (((j42 * j44) + (j41 * j45)) * 38);
        long j51 = j24 - ((j45 * j44) * 76);
        long j52 = j28 - (j33 * j34);
        long j53 = j29 - ((j33 * j35) + (j36 * j34));
        long j54 = j31 - j39;
        long j55 = j32 - j43;
        int i33 = i11 + i22;
        int i34 = i13 + i24;
        int i35 = i15 + i26;
        int i36 = i16 + i27;
        int i37 = i17 + i28;
        int i38 = i19 + i31;
        long j56 = i33;
        long j57 = i12 + i23;
        long j58 = i14 + i25;
        long j59 = i34;
        long j61 = (j56 * j58) + (j59 * j57);
        long j62 = i36;
        long j63 = i35;
        long j64 = (j56 * j62) + (j59 * j58) + (j63 * j57);
        long j65 = i18 + i29;
        long j66 = i37;
        long j67 = i21 + i32;
        long j68 = i38;
        long j69 = ((j55 + (((((j59 * j62) + (j63 * j58)) << 1) + ((j56 * j65) + (j66 * j57))) - j51)) >> 26) + (((((j63 * j62) << 1) + ((((j56 * j67) + (j59 * j65)) + (j66 * j58)) + (j57 * j68))) - j27) - j46);
        long j71 = j47 + ((((j69 >> 25) + (((((j59 * j67) + (j63 * j65)) + (j66 * j62)) + (j68 * j58)) << 1)) - j52) * 38);
        iArr3[0] = ((int) j71) & 67108863;
        long j72 = (j71 >> 26) + j48 + ((((((j63 * j67) + (j68 * j62)) << 1) + (j66 * j65)) - j53) * 38);
        iArr3[1] = ((int) j72) & 67108863;
        long j73 = (j72 >> 26) + j49 + ((((j66 * j67) + (j68 * j65)) - j54) * 38);
        iArr3[2] = ((int) j73) & 33554431;
        long j74 = (j73 >> 25) + j51 + ((((j68 * j67) << 1) - j55) * 38);
        iArr3[3] = ((int) j74) & 67108863;
        long j75 = (j74 >> 26) + j27 + (j46 * 38);
        iArr3[4] = ((int) j75) & 33554431;
        long j76 = (j75 >> 25) + j52 + ((j56 * j57) - j47);
        iArr3[5] = ((int) j76) & 67108863;
        long j77 = (j76 >> 26) + j53 + (j61 - j48);
        iArr3[6] = ((int) j77) & 67108863;
        long j78 = (j77 >> 26) + j54 + (j64 - j49);
        iArr3[7] = ((int) j78) & 33554431;
        long j79 = (j78 >> 25) + (((int) j11) & 67108863);
        iArr3[8] = ((int) j79) & 67108863;
        iArr3[9] = (((int) j69) & 33554431) + ((int) (j79 >> 26));
    }
}