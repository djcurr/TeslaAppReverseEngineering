package t60;

import i50.c0;
import java.security.SecureRandom;
import java.util.Objects;
import org.bouncycastle.crypto.d0;
import s60.c;
import s60.d;
import v60.n;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f51731a = {83, 105, 103, 69, 100, 52, 52, 56};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f51732b = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f51733c = {-1420278541, 595116690, -1916432555, 560775794, -1361693040, -1001465015, 2093622249, -1, -1, -1, -1, -1, -1, 1073741823};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f51734d = {118276190, 40534716, 9670182, 135141552, 85017403, 259173222, 68333082, 171784774, 174973732, 15824510, 73756743, 57518561, 94773951, 248652241, 107736333, 82941708};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f51735e = {36764180, 8885695, 130592152, 20104429, 163904957, 30304195, 121295871, 5901357, 125344798, 171541512, 175338348, 209069246, 3626697, 38307682, 24032956, 110359655};

    /* renamed from: f  reason: collision with root package name */
    private static final Object f51736f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private static C1149b[] f51737g = null;

    /* renamed from: h  reason: collision with root package name */
    private static int[] f51738h = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t60.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1149b {

        /* renamed from: a  reason: collision with root package name */
        int[] f51739a;

        /* renamed from: b  reason: collision with root package name */
        int[] f51740b;

        /* renamed from: c  reason: collision with root package name */
        int[] f51741c;

        private C1149b() {
            this.f51739a = d.g();
            this.f51740b = d.g();
            this.f51741c = d.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        int[] f51742a;

        /* renamed from: b  reason: collision with root package name */
        int[] f51743b;

        private c() {
            this.f51742a = d.g();
            this.f51743b = d.g();
        }
    }

    private static void A(boolean z11, C1149b c1149b, C1149b c1149b2) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] g11 = d.g();
        int[] g12 = d.g();
        int[] g13 = d.g();
        int[] g14 = d.g();
        int[] g15 = d.g();
        int[] g16 = d.g();
        int[] g17 = d.g();
        int[] g18 = d.g();
        if (z11) {
            d.J(c1149b.f51740b, c1149b.f51739a, g18);
            iArr2 = g12;
            iArr = g15;
            iArr4 = g16;
            iArr3 = g17;
        } else {
            d.a(c1149b.f51740b, c1149b.f51739a, g18);
            iArr = g12;
            iArr2 = g15;
            iArr3 = g16;
            iArr4 = g17;
        }
        d.A(c1149b.f51741c, c1149b2.f51741c, g11);
        d.H(g11, g12);
        d.A(c1149b.f51739a, c1149b2.f51739a, g13);
        d.A(c1149b.f51740b, c1149b2.f51740b, g14);
        d.A(g13, g14, g15);
        d.z(g15, 39081, g15);
        d.a(g12, g15, iArr3);
        d.J(g12, g15, iArr4);
        d.a(c1149b2.f51739a, c1149b2.f51740b, g15);
        d.A(g18, g15, g18);
        d.a(g14, g13, iArr);
        d.J(g14, g13, iArr2);
        d.c(iArr);
        d.J(g18, g12, g18);
        d.A(g18, g11, g18);
        d.A(g15, g11, g15);
        d.A(g16, g18, c1149b2.f51739a);
        d.A(g15, g17, c1149b2.f51740b);
        d.A(g16, g17, c1149b2.f51741c);
    }

    private static C1149b B(C1149b c1149b) {
        C1149b c1149b2 = new C1149b();
        C(c1149b, c1149b2);
        return c1149b2;
    }

    private static void C(C1149b c1149b, C1149b c1149b2) {
        d.f(c1149b.f51739a, 0, c1149b2.f51739a, 0);
        d.f(c1149b.f51740b, 0, c1149b2.f51740b, 0);
        d.f(c1149b.f51741c, 0, c1149b2.f51741c, 0);
    }

    private static void D(C1149b c1149b) {
        int[] g11 = d.g();
        int[] g12 = d.g();
        int[] g13 = d.g();
        int[] g14 = d.g();
        int[] g15 = d.g();
        int[] g16 = d.g();
        d.a(c1149b.f51739a, c1149b.f51740b, g11);
        d.H(g11, g11);
        d.H(c1149b.f51739a, g12);
        d.H(c1149b.f51740b, g13);
        d.a(g12, g13, g14);
        d.c(g14);
        d.H(c1149b.f51741c, g15);
        d.a(g15, g15, g15);
        d.c(g15);
        d.J(g14, g15, g16);
        d.J(g11, g14, g11);
        d.J(g12, g13, g12);
        d.A(g11, g16, c1149b.f51739a);
        d.A(g14, g12, c1149b.f51740b);
        d.A(g14, g16, c1149b.f51741c);
    }

    private static void E(C1149b c1149b) {
        d.D(c1149b.f51741c);
    }

    private static void F(int i11, int i12, c cVar) {
        int i13 = i11 * 16 * 2 * 16;
        for (int i14 = 0; i14 < 16; i14++) {
            int i15 = ((i14 ^ i12) - 1) >> 31;
            d.d(i15, f51738h, i13, cVar.f51742a, 0);
            int i16 = i13 + 16;
            d.d(i15, f51738h, i16, cVar.f51743b, 0);
            i13 = i16 + 16;
        }
    }

    private static C1149b[] G(C1149b c1149b, int i11) {
        C1149b B = B(c1149b);
        D(B);
        C1149b[] c1149bArr = new C1149b[i11];
        c1149bArr[0] = B(c1149b);
        for (int i12 = 1; i12 < i11; i12++) {
            c1149bArr[i12] = B(c1149bArr[i12 - 1]);
            A(false, B, c1149bArr[i12]);
        }
        return c1149bArr;
    }

    private static void H(C1149b c1149b) {
        d.L(c1149b.f51739a);
        d.D(c1149b.f51740b);
        d.D(c1149b.f51741c);
    }

    public static void I() {
        synchronized (f51736f) {
            if (f51738h != null) {
                return;
            }
            C1149b c1149b = new C1149b();
            d.f(f51734d, 0, c1149b.f51739a, 0);
            d.f(f51735e, 0, c1149b.f51740b, 0);
            E(c1149b);
            f51737g = G(c1149b, 32);
            f51738h = d.h(160);
            int i11 = 0;
            for (int i12 = 0; i12 < 5; i12++) {
                C1149b[] c1149bArr = new C1149b[5];
                C1149b c1149b2 = new C1149b();
                H(c1149b2);
                int i13 = 0;
                while (true) {
                    if (i13 >= 5) {
                        break;
                    }
                    A(true, c1149b, c1149b2);
                    D(c1149b);
                    c1149bArr[i13] = B(c1149b);
                    if (i12 + i13 != 8) {
                        for (int i14 = 1; i14 < 18; i14++) {
                            D(c1149b);
                        }
                    }
                    i13++;
                }
                C1149b[] c1149bArr2 = new C1149b[16];
                c1149bArr2[0] = c1149b2;
                int i15 = 1;
                for (int i16 = 0; i16 < 4; i16++) {
                    int i17 = 1 << i16;
                    int i18 = 0;
                    while (i18 < i17) {
                        c1149bArr2[i15] = B(c1149bArr2[i15 - i17]);
                        A(false, c1149bArr[i16], c1149bArr2[i15]);
                        i18++;
                        i15++;
                    }
                }
                int[] h11 = d.h(16);
                int[] g11 = d.g();
                d.f(c1149bArr2[0].f51741c, 0, g11, 0);
                d.f(g11, 0, h11, 0);
                int i19 = 0;
                while (true) {
                    i19++;
                    if (i19 >= 16) {
                        break;
                    }
                    d.A(g11, c1149bArr2[i19].f51741c, g11);
                    d.f(g11, 0, h11, i19 * 16);
                }
                d.w(g11, g11);
                int i21 = i19 - 1;
                int[] g12 = d.g();
                while (i21 > 0) {
                    int i22 = i21 - 1;
                    d.f(h11, i22 * 16, g12, 0);
                    d.A(g12, g11, g12);
                    d.f(g12, 0, h11, i21 * 16);
                    d.A(g11, c1149bArr2[i21].f51741c, g11);
                    i21 = i22;
                }
                d.f(g11, 0, h11, 0);
                for (int i23 = 0; i23 < 16; i23++) {
                    C1149b c1149b3 = c1149bArr2[i23];
                    d.f(h11, i23 * 16, c1149b3.f51741c, 0);
                    int[] iArr = c1149b3.f51739a;
                    d.A(iArr, c1149b3.f51741c, iArr);
                    int[] iArr2 = c1149b3.f51740b;
                    d.A(iArr2, c1149b3.f51741c, iArr2);
                    d.f(c1149b3.f51739a, 0, f51738h, i11);
                    int i24 = i11 + 16;
                    d.f(c1149b3.f51740b, 0, f51738h, i24);
                    i11 = i24 + 16;
                }
            }
        }
    }

    private static void J(byte[] bArr, int i11, byte[] bArr2) {
        System.arraycopy(bArr, i11, bArr2, 0, 56);
        bArr2[0] = (byte) (bArr2[0] & 252);
        bArr2[55] = (byte) (bArr2[55] | 128);
        bArr2[56] = 0;
    }

    private static byte[] K(byte[] bArr) {
        long j11 = (j(bArr, 4) << 4) & 4294967295L;
        long k11 = k(bArr, 7) & 4294967295L;
        long j12 = (j(bArr, 11) << 4) & 4294967295L;
        long k12 = k(bArr, 14) & 4294967295L;
        long j13 = (j(bArr, 18) << 4) & 4294967295L;
        long k13 = k(bArr, 21) & 4294967295L;
        long k14 = k(bArr, 28) & 4294967295L;
        long j14 = (j(bArr, 32) << 4) & 4294967295L;
        long k15 = k(bArr, 35) & 4294967295L;
        long j15 = (j(bArr, 39) << 4) & 4294967295L;
        long k16 = k(bArr, 42) & 4294967295L;
        long j16 = (j(bArr, 46) << 4) & 4294967295L;
        long k17 = k(bArr, 49) & 4294967295L;
        long j17 = (j(bArr, 53) << 4) & 4294967295L;
        long j18 = (j(bArr, 74) << 4) & 4294967295L;
        long k18 = k(bArr, 77) & 4294967295L;
        long j19 = (j(bArr, 81) << 4) & 4294967295L;
        long k19 = k(bArr, 84) & 4294967295L;
        long j21 = (j(bArr, 88) << 4) & 4294967295L;
        long k21 = k(bArr, 91) & 4294967295L;
        long j22 = (j(bArr, 95) << 4) & 4294967295L;
        long k22 = k(bArr, 98) & 4294967295L;
        long j23 = (j(bArr, 102) << 4) & 4294967295L;
        long k23 = k(bArr, 105) & 4294967295L;
        long j24 = (j(bArr, 109) << 4) & 4294967295L;
        long i11 = i(bArr, 112) & 4294967295L;
        long j25 = j24 + (k23 >>> 28);
        long j26 = k23 & 268435455;
        long k24 = (k(bArr, 56) & 4294967295L) + (i11 * 43969588) + (j25 * 30366549);
        long j27 = ((j(bArr, 60) << 4) & 4294967295L) + (i11 * 30366549) + (j25 * 163752818);
        long k25 = (k(bArr, 63) & 4294967295L) + (i11 * 163752818) + (j25 * 258169998);
        long j28 = ((j(bArr, 67) << 4) & 4294967295L) + (i11 * 258169998) + (j25 * 96434764);
        long j29 = k18 + (i11 * 149865618) + (j25 * 550336261);
        long j31 = k17 + (j26 * 43969588);
        long j32 = j23 + (k22 >>> 28);
        long j33 = k22 & 268435455;
        long k26 = (k(bArr, 70) & 4294967295L) + (i11 * 96434764) + (j25 * 227822194) + (j26 * 149865618) + (j32 * 550336261);
        long j34 = k16 + (j33 * 43969588);
        long j35 = j22 + (k21 >>> 28);
        long j36 = k21 & 268435455;
        long j37 = k25 + (j26 * 96434764) + (j32 * 227822194) + (j33 * 149865618) + (j35 * 550336261);
        long j38 = k15 + (j36 * 43969588);
        long j39 = j27 + (j26 * 258169998) + (j32 * 96434764) + (j33 * 227822194) + (j35 * 149865618) + (j36 * 550336261);
        long j41 = j21 + (k19 >>> 28);
        long j42 = j18 + (i11 * 227822194) + (j25 * 149865618) + (j26 * 550336261) + (k26 >>> 28);
        long j43 = j29 + (j42 >>> 28);
        long j44 = j19 + (i11 * 550336261) + (j43 >>> 28);
        long j45 = j43 & 268435455;
        long j46 = (k19 & 268435455) + (j44 >>> 28);
        long j47 = j44 & 268435455;
        long j48 = ((j(bArr, 25) << 4) & 4294967295L) + (j47 * 43969588);
        long j49 = k14 + (j46 * 43969588) + (j47 * 30366549);
        long j51 = j14 + (j41 * 43969588) + (j46 * 30366549) + (j47 * 163752818);
        long j52 = j38 + (j41 * 30366549) + (j46 * 163752818) + (j47 * 258169998);
        long j53 = j15 + (j35 * 43969588) + (j36 * 30366549) + (j41 * 163752818) + (j46 * 258169998) + (j47 * 96434764);
        long j54 = j34 + (j35 * 30366549) + (j36 * 163752818) + (j41 * 258169998) + (j46 * 96434764) + (j47 * 227822194);
        long j55 = j31 + (j32 * 30366549) + (j33 * 163752818) + (j35 * 258169998) + (j36 * 96434764) + (j41 * 227822194) + (j46 * 149865618) + (j47 * 550336261);
        long j56 = k13 + (j45 * 43969588);
        long j57 = j37 + (j39 >>> 28);
        long j58 = j28 + (j26 * 227822194) + (j32 * 149865618) + (j33 * 550336261) + (j57 >>> 28);
        long j59 = (k26 & 268435455) + (j58 >>> 28);
        long j61 = j58 & 268435455;
        long j62 = (j42 & 268435455) + (j59 >>> 28);
        long j63 = j59 & 268435455;
        long j64 = j53 + (j45 * 227822194) + (j62 * 149865618) + (j63 * 550336261);
        long j65 = j52 + (j45 * 96434764) + (j62 * 227822194) + (j63 * 149865618) + (j61 * 550336261);
        long j66 = j17 + (j25 * 43969588) + (j26 * 30366549) + (j32 * 163752818) + (j33 * 258169998) + (j35 * 96434764) + (j36 * 227822194) + (j41 * 149865618) + (j46 * 550336261) + (j55 >>> 28);
        long j67 = k24 + (j26 * 163752818) + (j32 * 258169998) + (j33 * 96434764) + (j35 * 227822194) + (j36 * 149865618) + (j41 * 550336261) + (j66 >>> 28);
        long j68 = j66 & 268435455;
        long j69 = (j39 & 268435455) + (j67 >>> 28);
        long j71 = (j57 & 268435455) + (j69 >>> 28);
        long j72 = j69 & 268435455;
        long j73 = k11 + (j71 * 43969588);
        long j74 = j12 + (j61 * 43969588) + (j71 * 30366549);
        long j75 = k12 + (j63 * 43969588) + (j61 * 30366549) + (j71 * 163752818);
        long j76 = j13 + (j62 * 43969588) + (j63 * 30366549) + (j61 * 163752818) + (j71 * 258169998);
        long j77 = j56 + (j62 * 30366549) + (j63 * 163752818) + (j61 * 258169998) + (j71 * 96434764);
        long j78 = j48 + (j45 * 30366549) + (j62 * 163752818) + (j63 * 258169998) + (j61 * 96434764) + (j71 * 227822194);
        long j79 = j51 + (j45 * 258169998) + (j62 * 96434764) + (j63 * 227822194) + (j61 * 149865618) + (j71 * 550336261);
        long j81 = j68 & 67108863;
        long j82 = ((j67 & 268435455) * 4) + (j68 >>> 26) + 1;
        long k27 = (k(bArr, 0) & 4294967295L) + (78101261 * j82);
        long j83 = j73 + (30366549 * j72) + (175155932 * j82);
        long j84 = j74 + (163752818 * j72) + (64542499 * j82);
        long j85 = j75 + (258169998 * j72) + (158326419 * j82);
        long j86 = j76 + (96434764 * j72) + (191173276 * j82);
        long j87 = j78 + (149865618 * j72) + (j82 * 137584065);
        long j88 = j11 + (43969588 * j72) + (141809365 * j82) + (k27 >>> 28);
        long j89 = j83 + (j88 >>> 28);
        long j90 = j84 + (j89 >>> 28);
        long j91 = j85 + (j90 >>> 28);
        long j92 = j86 + (j91 >>> 28);
        long j93 = j91 & 268435455;
        long j94 = j77 + (227822194 * j72) + (104575268 * j82) + (j92 >>> 28);
        long j95 = j92 & 268435455;
        long j96 = j87 + (j94 >>> 28);
        long j97 = j49 + (j45 * 163752818) + (j62 * 258169998) + (j63 * 96434764) + (j61 * 227822194) + (j71 * 149865618) + (j72 * 550336261) + (j96 >>> 28);
        long j98 = j96 & 268435455;
        long j99 = j79 + (j97 >>> 28);
        long j100 = j97 & 268435455;
        long j101 = j65 + (j99 >>> 28);
        long j102 = j64 + (j101 >>> 28);
        long j103 = j54 + (j45 * 149865618) + (j62 * 550336261) + (j102 >>> 28);
        long j104 = j102 & 268435455;
        long j105 = j16 + (j32 * 43969588) + (j33 * 30366549) + (j35 * 163752818) + (j36 * 258169998) + (j41 * 96434764) + (j46 * 227822194) + (j47 * 149865618) + (j45 * 550336261) + (j103 >>> 28);
        long j106 = (j55 & 268435455) + (j105 >>> 28);
        long j107 = j81 + (j106 >>> 28);
        long j108 = (j107 >>> 26) - 1;
        long j109 = (k27 & 268435455) - (j108 & 78101261);
        long j110 = ((j88 & 268435455) - (j108 & 141809365)) + (j109 >> 28);
        long j111 = ((j89 & 268435455) - (j108 & 175155932)) + (j110 >> 28);
        long j112 = ((j90 & 268435455) - (j108 & 64542499)) + (j111 >> 28);
        long j113 = j111 & 268435455;
        long j114 = (j93 - (j108 & 158326419)) + (j112 >> 28);
        long j115 = (j95 - (j108 & 191173276)) + (j114 >> 28);
        long j116 = j114 & 268435455;
        long j117 = ((j94 & 268435455) - (j108 & 104575268)) + (j115 >> 28);
        long j118 = j115 & 268435455;
        long j119 = (j98 - (j108 & 137584065)) + (j117 >> 28);
        long j120 = j100 + (j119 >> 28);
        long j121 = j119 & 268435455;
        long j122 = (j99 & 268435455) + (j120 >> 28);
        long j123 = (j101 & 268435455) + (j122 >> 28);
        long j124 = j104 + (j123 >> 28);
        long j125 = (j103 & 268435455) + (j124 >> 28);
        long j126 = (j105 & 268435455) + (j125 >> 28);
        long j127 = (j106 & 268435455) + (j126 >> 28);
        byte[] bArr2 = new byte[57];
        r(((j110 & 268435455) << 28) | (j109 & 268435455), bArr2, 0);
        r(((j112 & 268435455) << 28) | j113, bArr2, 7);
        r(j116 | (j118 << 28), bArr2, 14);
        r((j117 & 268435455) | (j121 << 28), bArr2, 21);
        r((j120 & 268435455) | ((j122 & 268435455) << 28), bArr2, 28);
        r((j123 & 268435455) | ((j124 & 268435455) << 28), bArr2, 35);
        r((j125 & 268435455) | ((j126 & 268435455) << 28), bArr2, 42);
        r((((j107 & 67108863) + (j127 >> 28)) << 28) | (j127 & 268435455), bArr2, 49);
        return bArr2;
    }

    private static void L(byte[] bArr, C1149b c1149b) {
        I();
        int[] iArr = new int[15];
        n(bArr, 0, iArr);
        iArr[14] = n.h(14, (~iArr[0]) & 1, iArr, f51733c, iArr) + 4;
        n.F(15, iArr, 0);
        c cVar = new c();
        H(c1149b);
        int i11 = 17;
        while (true) {
            int i12 = i11;
            for (int i13 = 0; i13 < 5; i13++) {
                int i14 = 0;
                for (int i15 = 0; i15 < 5; i15++) {
                    i14 = (i14 & (~(1 << i15))) ^ ((iArr[i12 >>> 5] >>> (i12 & 31)) << i15);
                    i12 += 18;
                }
                int i16 = (i14 >>> 4) & 1;
                F(i13, ((-i16) ^ i14) & 15, cVar);
                d.e(i16, cVar.f51742a);
                z(cVar, c1149b);
            }
            i11--;
            if (i11 < 0) {
                return;
            }
            D(c1149b);
        }
    }

    private static void M(byte[] bArr, byte[] bArr2, int i11) {
        C1149b c1149b = new C1149b();
        L(bArr, c1149b);
        if (s(c1149b, bArr2, i11) == 0) {
            throw new IllegalStateException();
        }
    }

    public static void N(c.a aVar, byte[] bArr, int i11, int[] iArr, int[] iArr2) {
        Objects.requireNonNull(aVar, "This method is only for use by X448");
        byte[] bArr2 = new byte[57];
        J(bArr, i11, bArr2);
        C1149b c1149b = new C1149b();
        L(bArr2, c1149b);
        if (d(c1149b.f51739a, c1149b.f51740b, c1149b.f51741c) == 0) {
            throw new IllegalStateException();
        }
        d.f(c1149b.f51739a, 0, iArr, 0);
        d.f(c1149b.f51740b, 0, iArr2, 0);
    }

    private static void O(int[] iArr, int[] iArr2, C1149b c1149b, C1149b c1149b2) {
        I();
        byte[] v11 = v(iArr, 7);
        byte[] v12 = v(iArr2, 5);
        C1149b[] G = G(c1149b, 8);
        H(c1149b2);
        int i11 = 446;
        while (true) {
            byte b11 = v11[i11];
            if (b11 != 0) {
                int i12 = b11 >> 31;
                A(i12 != 0, f51737g[(b11 ^ i12) >>> 1], c1149b2);
            }
            byte b12 = v12[i11];
            if (b12 != 0) {
                int i13 = b12 >> 31;
                A(i13 != 0, G[(b12 ^ i13) >>> 1], c1149b2);
            }
            i11--;
            if (i11 < 0) {
                return;
            }
            D(c1149b2);
        }
    }

    public static void P(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, byte[] bArr4, int i13, int i14, byte[] bArr5, int i15) {
        x(bArr, i11, bArr2, i12, bArr3, (byte) 0, bArr4, i13, i14, bArr5, i15);
    }

    public static void Q(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, byte[] bArr4, int i13, byte[] bArr5, int i14) {
        x(bArr, i11, bArr2, i12, bArr3, (byte) 1, bArr4, i13, 64, bArr5, i14);
    }

    public static boolean R(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, byte[] bArr4, int i13, int i14) {
        return y(bArr, i11, bArr2, i12, bArr3, (byte) 0, bArr4, i13, i14);
    }

    private static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int[] iArr = new int[28];
        n(bArr, 0, iArr);
        int[] iArr2 = new int[14];
        n(bArr2, 0, iArr2);
        int[] iArr3 = new int[14];
        n(bArr3, 0, iArr3);
        n.D(14, iArr2, iArr3, iArr);
        byte[] bArr4 = new byte[114];
        for (int i11 = 0; i11 < 28; i11++) {
            q(iArr[i11], bArr4, i11 * 4);
        }
        return K(bArr4);
    }

    private static boolean b(byte[] bArr) {
        return bArr != null && bArr.length < 256;
    }

    private static int c(int[] iArr, int[] iArr2) {
        int[] g11 = d.g();
        int[] g12 = d.g();
        int[] g13 = d.g();
        d.H(iArr, g12);
        d.H(iArr2, g13);
        d.A(g12, g13, g11);
        d.a(g12, g13, g12);
        d.z(g11, 39081, g11);
        d.K(g11);
        d.a(g11, g12, g11);
        d.C(g11);
        return d.x(g11);
    }

    private static int d(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] g11 = d.g();
        int[] g12 = d.g();
        int[] g13 = d.g();
        int[] g14 = d.g();
        d.H(iArr, g12);
        d.H(iArr2, g13);
        d.H(iArr3, g14);
        d.A(g12, g13, g11);
        d.a(g12, g13, g12);
        d.A(g12, g14, g12);
        d.H(g14, g14);
        d.z(g11, 39081, g11);
        d.J(g11, g14, g11);
        d.a(g11, g12, g11);
        d.C(g11);
        return d.x(g11);
    }

    private static boolean e(byte[] bArr) {
        if ((bArr[56] & Byte.MAX_VALUE) != 0) {
            return false;
        }
        int[] iArr = new int[14];
        l(bArr, 0, iArr, 0, 14);
        return !n.u(14, iArr, f51732b);
    }

    private static boolean f(byte[] bArr, int[] iArr) {
        if (bArr[56] != 0) {
            return false;
        }
        n(bArr, 0, iArr);
        return !n.u(14, iArr, f51733c);
    }

    private static byte[] g(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        return bArr2;
    }

    private static d0 h() {
        return new c0(256);
    }

    private static int i(byte[] bArr, int i11) {
        return ((bArr[i11 + 1] & 255) << 8) | (bArr[i11] & 255);
    }

    private static int j(byte[] bArr, int i11) {
        int i12 = i11 + 1;
        return ((bArr[i12 + 1] & 255) << 16) | (bArr[i11] & 255) | ((bArr[i12] & 255) << 8);
    }

    private static int k(byte[] bArr, int i11) {
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        return (bArr[i13 + 1] << 24) | (bArr[i11] & 255) | ((bArr[i12] & 255) << 8) | ((bArr[i13] & 255) << 16);
    }

    private static void l(byte[] bArr, int i11, int[] iArr, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            iArr[i12 + i14] = k(bArr, (i14 * 4) + i11);
        }
    }

    private static boolean m(byte[] bArr, int i11, boolean z11, C1149b c1149b) {
        byte[] g11 = g(bArr, i11, 57);
        if (e(g11)) {
            int i12 = (g11[56] & 128) >>> 7;
            g11[56] = (byte) (g11[56] & Byte.MAX_VALUE);
            d.j(g11, 0, c1149b.f51740b);
            int[] g12 = d.g();
            int[] g13 = d.g();
            d.H(c1149b.f51740b, g12);
            d.z(g12, 39081, g13);
            d.B(g12, g12);
            d.b(g12);
            d.b(g13);
            if (d.I(g12, g13, c1149b.f51739a)) {
                d.C(c1149b.f51739a);
                if (i12 == 1 && d.y(c1149b.f51739a)) {
                    return false;
                }
                int[] iArr = c1149b.f51739a;
                if (z11 ^ (i12 != (iArr[0] & 1))) {
                    d.B(iArr, iArr);
                }
                E(c1149b);
                return true;
            }
            return false;
        }
        return false;
    }

    private static void n(byte[] bArr, int i11, int[] iArr) {
        l(bArr, i11, iArr, 0, 14);
    }

    private static void o(d0 d0Var, byte b11, byte[] bArr) {
        byte[] bArr2 = f51731a;
        int length = bArr2.length;
        int i11 = length + 2;
        int length2 = bArr.length + i11;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr2, 0, bArr3, 0, length);
        bArr3[length] = b11;
        bArr3[length + 1] = (byte) bArr.length;
        System.arraycopy(bArr, 0, bArr3, i11, bArr.length);
        d0Var.update(bArr3, 0, length2);
    }

    private static void p(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) i11;
        int i13 = i12 + 1;
        bArr[i13] = (byte) (i11 >>> 8);
        bArr[i13 + 1] = (byte) (i11 >>> 16);
    }

    private static void q(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) i11;
        int i13 = i12 + 1;
        bArr[i13] = (byte) (i11 >>> 8);
        int i14 = i13 + 1;
        bArr[i14] = (byte) (i11 >>> 16);
        bArr[i14 + 1] = (byte) (i11 >>> 24);
    }

    private static void r(long j11, byte[] bArr, int i11) {
        q((int) j11, bArr, i11);
        p((int) (j11 >>> 32), bArr, i11 + 4);
    }

    private static int s(C1149b c1149b, byte[] bArr, int i11) {
        int[] g11 = d.g();
        int[] g12 = d.g();
        d.v(c1149b.f51741c, g12);
        d.A(c1149b.f51739a, g12, g11);
        d.A(c1149b.f51740b, g12, g12);
        d.C(g11);
        d.C(g12);
        int c11 = c(g11, g12);
        d.p(g12, bArr, i11);
        bArr[(i11 + 57) - 1] = (byte) ((g11[0] & 1) << 7);
        return c11;
    }

    public static void t(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
    }

    public static void u(byte[] bArr, int i11, byte[] bArr2, int i12) {
        d0 h11 = h();
        byte[] bArr3 = new byte[114];
        h11.update(bArr, i11, 57);
        h11.doFinal(bArr3, 0, 114);
        byte[] bArr4 = new byte[57];
        J(bArr3, 0, bArr4);
        M(bArr4, bArr2, i12);
    }

    private static byte[] v(int[] iArr, int i11) {
        int[] iArr2 = new int[28];
        int i12 = 0;
        int i13 = 14;
        int i14 = 28;
        int i15 = 0;
        while (true) {
            i13--;
            if (i13 < 0) {
                break;
            }
            int i16 = iArr[i13];
            int i17 = i14 - 1;
            iArr2[i17] = (i15 << 16) | (i16 >>> 16);
            i14 = i17 - 1;
            iArr2[i14] = i16;
            i15 = i16;
        }
        byte[] bArr = new byte[447];
        int i18 = 32 - i11;
        int i19 = 0;
        int i21 = 0;
        while (i12 < 28) {
            int i22 = iArr2[i12];
            while (i19 < 16) {
                int i23 = i22 >>> i19;
                if ((i23 & 1) == i21) {
                    i19++;
                } else {
                    int i24 = (i23 | 1) << i18;
                    bArr[(i12 << 4) + i19] = (byte) (i24 >> i18);
                    i19 += i11;
                    i21 = i24 >>> 31;
                }
            }
            i12++;
            i19 -= 16;
        }
        return bArr;
    }

    private static void w(d0 d0Var, byte[] bArr, byte[] bArr2, byte[] bArr3, int i11, byte[] bArr4, byte b11, byte[] bArr5, int i12, int i13, byte[] bArr6, int i14) {
        o(d0Var, b11, bArr4);
        d0Var.update(bArr, 57, 57);
        d0Var.update(bArr5, i12, i13);
        d0Var.doFinal(bArr, 0, bArr.length);
        byte[] K = K(bArr);
        byte[] bArr7 = new byte[57];
        M(K, bArr7, 0);
        o(d0Var, b11, bArr4);
        d0Var.update(bArr7, 0, 57);
        d0Var.update(bArr3, i11, 57);
        d0Var.update(bArr5, i12, i13);
        d0Var.doFinal(bArr, 0, bArr.length);
        byte[] a11 = a(K, K(bArr), bArr2);
        System.arraycopy(bArr7, 0, bArr6, i14, 57);
        System.arraycopy(a11, 0, bArr6, i14 + 57, 57);
    }

    private static void x(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, byte b11, byte[] bArr4, int i13, int i14, byte[] bArr5, int i15) {
        if (!b(bArr3)) {
            throw new IllegalArgumentException("ctx");
        }
        d0 h11 = h();
        byte[] bArr6 = new byte[114];
        h11.update(bArr, i11, 57);
        h11.doFinal(bArr6, 0, 114);
        byte[] bArr7 = new byte[57];
        J(bArr6, 0, bArr7);
        w(h11, bArr6, bArr7, bArr2, i12, bArr3, b11, bArr4, i13, i14, bArr5, i15);
    }

    private static boolean y(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, byte b11, byte[] bArr4, int i13, int i14) {
        if (b(bArr3)) {
            byte[] g11 = g(bArr, i11, 57);
            byte[] g12 = g(bArr, i11 + 57, 57);
            if (e(g11)) {
                int[] iArr = new int[14];
                if (f(g12, iArr)) {
                    C1149b c1149b = new C1149b();
                    if (m(bArr2, i12, true, c1149b)) {
                        d0 h11 = h();
                        byte[] bArr5 = new byte[114];
                        o(h11, b11, bArr3);
                        h11.update(g11, 0, 57);
                        h11.update(bArr2, i12, 57);
                        h11.update(bArr4, i13, i14);
                        h11.doFinal(bArr5, 0, 114);
                        int[] iArr2 = new int[14];
                        n(K(bArr5), 0, iArr2);
                        C1149b c1149b2 = new C1149b();
                        O(iArr, iArr2, c1149b, c1149b2);
                        byte[] bArr6 = new byte[57];
                        return s(c1149b2, bArr6, 0) != 0 && org.bouncycastle.util.a.c(bArr6, g11);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        throw new IllegalArgumentException("ctx");
    }

    private static void z(c cVar, C1149b c1149b) {
        int[] g11 = d.g();
        int[] g12 = d.g();
        int[] g13 = d.g();
        int[] g14 = d.g();
        int[] g15 = d.g();
        int[] g16 = d.g();
        int[] g17 = d.g();
        d.H(c1149b.f51741c, g11);
        d.A(cVar.f51742a, c1149b.f51739a, g12);
        d.A(cVar.f51743b, c1149b.f51740b, g13);
        d.A(g12, g13, g14);
        d.z(g14, 39081, g14);
        d.a(g11, g14, g15);
        d.J(g11, g14, g16);
        d.a(cVar.f51742a, cVar.f51743b, g11);
        d.a(c1149b.f51739a, c1149b.f51740b, g14);
        d.A(g11, g14, g17);
        d.a(g13, g12, g11);
        d.J(g13, g12, g14);
        d.c(g11);
        d.J(g17, g11, g17);
        d.A(g17, c1149b.f51741c, g17);
        d.A(g14, c1149b.f51741c, g14);
        d.A(g15, g17, c1149b.f51739a);
        d.A(g14, g16, c1149b.f51740b);
        d.A(g15, g16, c1149b.f51741c);
    }
}