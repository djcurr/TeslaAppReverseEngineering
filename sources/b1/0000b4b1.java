package t60;

import i50.a0;
import java.security.SecureRandom;
import java.util.Objects;
import org.bouncycastle.crypto.p;
import s60.a;
import v60.h;
import v60.n;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f51706a = {83, 105, 103, 69, 100, 50, 53, 53, 49, 57, 32, 110, 111, 32, 69, 100, 50, 53, 53, 49, 57, 32, 99, 111, 108, 108, 105, 115, 105, 111, 110, 115};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f51707b = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f51708c = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, 268435456};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f51709d = {52811034, 25909283, 8072341, 50637101, 13785486, 30858332, 20483199, 20966410, 43936626, 4379245};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f51710e = {40265304, 26843545, 6710886, 53687091, 13421772, 40265318, 26843545, 6710886, 53687091, 13421772};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f51711f = {56195235, 47411844, 25868126, 40503822, 57364, 58321048, 30416477, 31930572, 57760639, 10749657};

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f51712g = {45281625, 27714825, 18181821, 13898781, 114729, 49533232, 60832955, 30306712, 48412415, 4722099};

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f51713h = {23454386, 55429651, 2809210, 27797563, 229458, 31957600, 54557047, 27058993, 29715967, 9444199};

    /* renamed from: i  reason: collision with root package name */
    private static final Object f51714i = new Object();

    /* renamed from: j  reason: collision with root package name */
    private static d[] f51715j = null;

    /* renamed from: k  reason: collision with root package name */
    private static int[] f51716k = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        int[] f51717a;

        /* renamed from: b  reason: collision with root package name */
        int[] f51718b;

        /* renamed from: c  reason: collision with root package name */
        int[] f51719c;

        /* renamed from: d  reason: collision with root package name */
        int[] f51720d;

        /* renamed from: e  reason: collision with root package name */
        int[] f51721e;

        private b() {
            this.f51717a = s60.b.h();
            this.f51718b = s60.b.h();
            this.f51719c = s60.b.h();
            this.f51720d = s60.b.h();
            this.f51721e = s60.b.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        int[] f51722a;

        /* renamed from: b  reason: collision with root package name */
        int[] f51723b;

        private c() {
            this.f51722a = s60.b.h();
            this.f51723b = s60.b.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        int[] f51724a;

        /* renamed from: b  reason: collision with root package name */
        int[] f51725b;

        /* renamed from: c  reason: collision with root package name */
        int[] f51726c;

        /* renamed from: d  reason: collision with root package name */
        int[] f51727d;

        private d() {
            this.f51724a = s60.b.h();
            this.f51725b = s60.b.h();
            this.f51726c = s60.b.h();
            this.f51727d = s60.b.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        int[] f51728a;

        /* renamed from: b  reason: collision with root package name */
        int[] f51729b;

        /* renamed from: c  reason: collision with root package name */
        int[] f51730c;

        private e() {
            this.f51728a = s60.b.h();
            this.f51729b = s60.b.h();
            this.f51730c = s60.b.h();
        }
    }

    private static void A(boolean z11, d dVar, d dVar2, d dVar3) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] h11 = s60.b.h();
        int[] h12 = s60.b.h();
        int[] h13 = s60.b.h();
        int[] h14 = s60.b.h();
        int[] h15 = s60.b.h();
        int[] h16 = s60.b.h();
        int[] h17 = s60.b.h();
        int[] h18 = s60.b.h();
        if (z11) {
            iArr2 = h13;
            iArr = h14;
            iArr4 = h16;
            iArr3 = h17;
        } else {
            iArr = h13;
            iArr2 = h14;
            iArr3 = h16;
            iArr4 = h17;
        }
        s60.b.c(dVar.f51725b, dVar.f51724a, h12, h11);
        s60.b.c(dVar2.f51725b, dVar2.f51724a, iArr2, iArr);
        s60.b.z(h11, h13, h11);
        s60.b.z(h12, h14, h12);
        s60.b.z(dVar.f51727d, dVar2.f51727d, h13);
        s60.b.z(h13, f51712g, h13);
        s60.b.z(dVar.f51726c, dVar2.f51726c, h14);
        s60.b.a(h14, h14, h14);
        s60.b.c(h12, h11, h18, h15);
        s60.b.c(h14, h13, iArr4, iArr3);
        s60.b.d(iArr4);
        s60.b.z(h15, h16, dVar3.f51724a);
        s60.b.z(h17, h18, dVar3.f51725b);
        s60.b.z(h16, h17, dVar3.f51726c);
        s60.b.z(h15, h18, dVar3.f51727d);
    }

    private static d B(b bVar) {
        d dVar = new d();
        s60.b.g(bVar.f51717a, 0, dVar.f51724a, 0);
        s60.b.g(bVar.f51718b, 0, dVar.f51725b, 0);
        s60.b.g(bVar.f51719c, 0, dVar.f51726c, 0);
        s60.b.z(bVar.f51720d, bVar.f51721e, dVar.f51727d);
        return dVar;
    }

    private static d C(c cVar) {
        d dVar = new d();
        s60.b.g(cVar.f51722a, 0, dVar.f51724a, 0);
        s60.b.g(cVar.f51723b, 0, dVar.f51725b, 0);
        H(dVar);
        return dVar;
    }

    private static d D(d dVar) {
        d dVar2 = new d();
        E(dVar, dVar2);
        return dVar2;
    }

    private static void E(d dVar, d dVar2) {
        s60.b.g(dVar.f51724a, 0, dVar2.f51724a, 0);
        s60.b.g(dVar.f51725b, 0, dVar2.f51725b, 0);
        s60.b.g(dVar.f51726c, 0, dVar2.f51726c, 0);
        s60.b.g(dVar.f51727d, 0, dVar2.f51727d, 0);
    }

    private static void F(b bVar) {
        int[] h11 = s60.b.h();
        int[] h12 = s60.b.h();
        int[] h13 = s60.b.h();
        int[] iArr = bVar.f51720d;
        int[] h14 = s60.b.h();
        int[] h15 = s60.b.h();
        int[] iArr2 = bVar.f51721e;
        s60.b.G(bVar.f51717a, h11);
        s60.b.G(bVar.f51718b, h12);
        s60.b.G(bVar.f51719c, h13);
        s60.b.a(h13, h13, h13);
        s60.b.c(h11, h12, iArr2, h15);
        s60.b.a(bVar.f51717a, bVar.f51718b, iArr);
        s60.b.G(iArr, iArr);
        s60.b.I(iArr2, iArr, iArr);
        s60.b.a(h13, h15, h14);
        s60.b.d(h14);
        s60.b.z(iArr, h14, bVar.f51717a);
        s60.b.z(h15, iArr2, bVar.f51718b);
        s60.b.z(h14, h15, bVar.f51719c);
    }

    private static void G(b bVar) {
        s60.b.C(bVar.f51719c);
        s60.b.g(bVar.f51717a, 0, bVar.f51720d, 0);
        s60.b.g(bVar.f51718b, 0, bVar.f51721e, 0);
    }

    private static void H(d dVar) {
        s60.b.C(dVar.f51726c);
        s60.b.z(dVar.f51724a, dVar.f51725b, dVar.f51727d);
    }

    private static void I(int i11, int i12, e eVar) {
        int i13 = i11 * 8 * 3 * 10;
        for (int i14 = 0; i14 < 8; i14++) {
            int i15 = ((i14 ^ i12) - 1) >> 31;
            s60.b.e(i15, f51716k, i13, eVar.f51728a, 0);
            int i16 = i13 + 10;
            s60.b.e(i15, f51716k, i16, eVar.f51729b, 0);
            int i17 = i16 + 10;
            s60.b.e(i15, f51716k, i17, eVar.f51730c, 0);
            i13 = i17 + 10;
        }
    }

    private static d[] J(d dVar, int i11) {
        d dVar2 = new d();
        A(false, dVar, dVar, dVar2);
        d[] dVarArr = new d[i11];
        dVarArr[0] = D(dVar);
        for (int i12 = 1; i12 < i11; i12++) {
            d dVar3 = dVarArr[i12 - 1];
            d dVar4 = new d();
            dVarArr[i12] = dVar4;
            A(false, dVar3, dVar2, dVar4);
        }
        return dVarArr;
    }

    private static void K(b bVar) {
        s60.b.K(bVar.f51717a);
        s60.b.C(bVar.f51718b);
        s60.b.C(bVar.f51719c);
        s60.b.K(bVar.f51720d);
        s60.b.C(bVar.f51721e);
    }

    private static void L(d dVar) {
        s60.b.K(dVar.f51724a);
        s60.b.C(dVar.f51725b);
        s60.b.C(dVar.f51726c);
        s60.b.K(dVar.f51727d);
    }

    public static void M() {
        int i11;
        synchronized (f51714i) {
            if (f51716k != null) {
                return;
            }
            d dVar = new d();
            int[] iArr = f51709d;
            s60.b.g(iArr, 0, dVar.f51724a, 0);
            int[] iArr2 = f51710e;
            s60.b.g(iArr2, 0, dVar.f51725b, 0);
            H(dVar);
            f51715j = J(dVar, 32);
            b bVar = new b();
            s60.b.g(iArr, 0, bVar.f51717a, 0);
            s60.b.g(iArr2, 0, bVar.f51718b, 0);
            G(bVar);
            f51716k = s60.b.i(192);
            int i12 = 0;
            for (int i13 = 0; i13 < 8; i13++) {
                d[] dVarArr = new d[4];
                d dVar2 = new d();
                L(dVar2);
                int i14 = 0;
                while (true) {
                    i11 = 1;
                    if (i14 >= 4) {
                        break;
                    }
                    A(true, dVar2, B(bVar), dVar2);
                    F(bVar);
                    dVarArr[i14] = B(bVar);
                    if (i13 + i14 != 10) {
                        while (i11 < 8) {
                            F(bVar);
                            i11++;
                        }
                    }
                    i14++;
                }
                d[] dVarArr2 = new d[8];
                dVarArr2[0] = dVar2;
                int i15 = 0;
                int i16 = 1;
                while (i15 < 3) {
                    int i17 = i11 << i15;
                    int i18 = 0;
                    while (i18 < i17) {
                        d dVar3 = dVarArr2[i16 - i17];
                        d dVar4 = dVarArr[i15];
                        d dVar5 = new d();
                        dVarArr2[i16] = dVar5;
                        A(false, dVar3, dVar4, dVar5);
                        i18++;
                        i16++;
                    }
                    i15++;
                    i11 = 1;
                }
                int[] i19 = s60.b.i(8);
                int[] h11 = s60.b.h();
                s60.b.g(dVarArr2[0].f51726c, 0, h11, 0);
                s60.b.g(h11, 0, i19, 0);
                int i21 = 0;
                while (true) {
                    i21++;
                    if (i21 >= 8) {
                        break;
                    }
                    s60.b.z(h11, dVarArr2[i21].f51726c, h11);
                    s60.b.g(h11, 0, i19, i21 * 10);
                }
                s60.b.a(h11, h11, h11);
                s60.b.v(h11, h11);
                int i22 = i21 - 1;
                int[] h12 = s60.b.h();
                while (i22 > 0) {
                    int i23 = i22 - 1;
                    s60.b.g(i19, i23 * 10, h12, 0);
                    s60.b.z(h12, h11, h12);
                    s60.b.g(h12, 0, i19, i22 * 10);
                    s60.b.z(h11, dVarArr2[i22].f51726c, h11);
                    i22 = i23;
                }
                s60.b.g(h11, 0, i19, 0);
                for (int i24 = 0; i24 < 8; i24++) {
                    d dVar6 = dVarArr2[i24];
                    int[] h13 = s60.b.h();
                    int[] h14 = s60.b.h();
                    s60.b.g(i19, i24 * 10, h14, 0);
                    s60.b.z(dVar6.f51724a, h14, h13);
                    s60.b.z(dVar6.f51725b, h14, h14);
                    e eVar = new e();
                    s60.b.c(h14, h13, eVar.f51728a, eVar.f51729b);
                    s60.b.z(h13, h14, eVar.f51730c);
                    int[] iArr3 = eVar.f51730c;
                    s60.b.z(iArr3, f51713h, iArr3);
                    s60.b.B(eVar.f51728a);
                    s60.b.B(eVar.f51729b);
                    s60.b.g(eVar.f51728a, 0, f51716k, i12);
                    int i25 = i12 + 10;
                    s60.b.g(eVar.f51729b, 0, f51716k, i25);
                    int i26 = i25 + 10;
                    s60.b.g(eVar.f51730c, 0, f51716k, i26);
                    i12 = i26 + 10;
                }
            }
        }
    }

    private static void N(byte[] bArr, int i11, byte[] bArr2) {
        System.arraycopy(bArr, i11, bArr2, 0, 32);
        bArr2[0] = (byte) (bArr2[0] & 248);
        bArr2[31] = (byte) (bArr2[31] & Byte.MAX_VALUE);
        bArr2[31] = (byte) (bArr2[31] | 64);
    }

    private static byte[] O(byte[] bArr) {
        long i11 = (i(bArr, 4) << 4) & 4294967295L;
        long j11 = j(bArr, 7) & 4294967295L;
        long i12 = (i(bArr, 11) << 4) & 4294967295L;
        long j12 = j(bArr, 14) & 4294967295L;
        long i13 = (i(bArr, 18) << 4) & 4294967295L;
        long j13 = j(bArr, 21) & 4294967295L;
        long j14 = j(bArr, 28) & 4294967295L;
        long j15 = j(bArr, 49) & 4294967295L;
        long i14 = (i(bArr, 53) << 4) & 4294967295L;
        long j16 = j(bArr, 56) & 4294967295L;
        long i15 = (i(bArr, 60) << 4) & 4294967295L;
        long j17 = bArr[63] & 255;
        long i16 = ((i(bArr, 46) << 4) & 4294967295L) - (j17 * 5343);
        long j18 = i15 + (j16 >> 28);
        long j19 = j16 & 268435455;
        long i17 = (((i(bArr, 32) << 4) & 4294967295L) - (j17 * (-50998291))) - (j18 * 19280294);
        long j21 = ((j(bArr, 35) & 4294967295L) - (j17 * 19280294)) - (j18 * 127719000);
        long j22 = ((j(bArr, 42) & 4294967295L) - (j17 * (-6428113))) - (j18 * 5343);
        long i18 = ((((i(bArr, 39) << 4) & 4294967295L) - (j17 * 127719000)) - (j18 * (-6428113))) - (j19 * 5343);
        long j23 = i14 + (j15 >> 28);
        long j24 = j15 & 268435455;
        long j25 = (j21 - (j19 * (-6428113))) - (j23 * 5343);
        long j26 = ((i17 - (j19 * 127719000)) - (j23 * (-6428113))) - (j24 * 5343);
        long j27 = i16 + (j22 >> 28);
        long j28 = (j22 & 268435455) + (i18 >> 28);
        long j29 = (j12 - (j27 * (-50998291))) - (j28 * 19280294);
        long j31 = ((i13 - (j24 * (-50998291))) - (j27 * 19280294)) - (j28 * 127719000);
        long i19 = ((((((i(bArr, 25) << 4) & 4294967295L) - (j19 * (-50998291))) - (j23 * 19280294)) - (j24 * 127719000)) - (j27 * (-6428113))) - (j28 * 5343);
        long j32 = (i18 & 268435455) + (j25 >> 28);
        long j33 = (i12 - (j28 * (-50998291))) - (j32 * 19280294);
        long j34 = j29 - (j32 * 127719000);
        long j35 = ((((j13 - (j23 * (-50998291))) - (j24 * 19280294)) - (j27 * 127719000)) - (j28 * (-6428113))) - (j32 * 5343);
        long j36 = (j25 & 268435455) + (j26 >> 28);
        long j37 = j26 & 268435455;
        long j38 = i11 - (j36 * (-50998291));
        long j39 = (j11 - (j32 * (-50998291))) - (j36 * 19280294);
        long j41 = j33 - (j36 * 127719000);
        long j42 = j34 - (j36 * (-6428113));
        long j43 = (j31 - (j32 * (-6428113))) - (j36 * 5343);
        long j44 = (((((j14 - (j18 * (-50998291))) - (j19 * 19280294)) - (j23 * 127719000)) - (j24 * (-6428113))) - (j27 * 5343)) + (i19 >> 28);
        long j45 = j44 & 268435455;
        long j46 = j45 >>> 27;
        long j47 = j37 + (j44 >> 28) + j46;
        long j48 = (j(bArr, 0) & 4294967295L) - (j47 * (-50998291));
        long j49 = (j38 - (j47 * 19280294)) + (j48 >> 28);
        long j51 = j48 & 268435455;
        long j52 = (j39 - (j47 * 127719000)) + (j49 >> 28);
        long j53 = (j41 - (j47 * (-6428113))) + (j52 >> 28);
        long j54 = (j42 - (j47 * 5343)) + (j53 >> 28);
        long j55 = j43 + (j54 >> 28);
        long j56 = j54 & 268435455;
        long j57 = j35 + (j55 >> 28);
        long j58 = (i19 & 268435455) + (j57 >> 28);
        long j59 = j45 + (j58 >> 28);
        long j61 = (j59 >> 28) - j46;
        long j62 = j51 + (j61 & (-50998291));
        long j63 = (j49 & 268435455) + (j61 & 19280294) + (j62 >> 28);
        long j64 = (j52 & 268435455) + (j61 & 127719000) + (j63 >> 28);
        long j65 = (j53 & 268435455) + (j61 & (-6428113)) + (j64 >> 28);
        long j66 = j56 + (j61 & 5343) + (j65 >> 28);
        long j67 = (j55 & 268435455) + (j66 >> 28);
        long j68 = (j57 & 268435455) + (j67 >> 28);
        long j69 = (j58 & 268435455) + (j68 >> 28);
        byte[] bArr2 = new byte[32];
        q((j62 & 268435455) | ((j63 & 268435455) << 28), bArr2, 0);
        q(((j65 & 268435455) << 28) | (j64 & 268435455), bArr2, 7);
        q((j66 & 268435455) | ((j67 & 268435455) << 28), bArr2, 14);
        q((j68 & 268435455) | ((j69 & 268435455) << 28), bArr2, 21);
        p((int) ((j59 & 268435455) + (j69 >> 28)), bArr2, 28);
        return bArr2;
    }

    private static void P(byte[] bArr, b bVar) {
        M();
        int[] iArr = new int[8];
        m(bArr, 0, iArr);
        n.h(8, (~iArr[0]) & 1, iArr, f51708c, iArr);
        n.F(8, iArr, 1);
        for (int i11 = 0; i11 < 8; i11++) {
            iArr[i11] = v60.b.f(iArr[i11]);
        }
        e eVar = new e();
        K(bVar);
        int i12 = 28;
        while (true) {
            for (int i13 = 0; i13 < 8; i13++) {
                int i14 = iArr[i13] >>> i12;
                int i15 = (i14 >>> 3) & 1;
                I(i13, (i14 ^ (-i15)) & 7, eVar);
                s60.b.j(i15, eVar.f51728a, eVar.f51729b);
                s60.b.f(i15, eVar.f51730c);
                y(eVar, bVar);
            }
            i12 -= 4;
            if (i12 < 0) {
                return;
            }
            F(bVar);
        }
    }

    private static void Q(byte[] bArr, byte[] bArr2, int i11) {
        b bVar = new b();
        P(bArr, bVar);
        if (r(bVar, bArr2, i11) == 0) {
            throw new IllegalStateException();
        }
    }

    public static void R(a.C1116a c1116a, byte[] bArr, int i11, int[] iArr, int[] iArr2) {
        Objects.requireNonNull(c1116a, "This method is only for use by X25519");
        byte[] bArr2 = new byte[32];
        N(bArr, i11, bArr2);
        b bVar = new b();
        P(bArr2, bVar);
        if (d(bVar.f51717a, bVar.f51718b, bVar.f51719c) == 0) {
            throw new IllegalStateException();
        }
        s60.b.g(bVar.f51718b, 0, iArr, 0);
        s60.b.g(bVar.f51719c, 0, iArr2, 0);
    }

    private static void S(int[] iArr, int[] iArr2, c cVar, b bVar) {
        M();
        byte[] u11 = u(iArr, 7);
        byte[] u12 = u(iArr2, 5);
        d[] J = J(C(cVar), 8);
        K(bVar);
        int i11 = 252;
        while (true) {
            byte b11 = u11[i11];
            if (b11 != 0) {
                int i12 = b11 >> 31;
                z(i12 != 0, f51715j[(b11 ^ i12) >>> 1], bVar);
            }
            byte b12 = u12[i11];
            if (b12 != 0) {
                int i13 = b12 >> 31;
                z(i13 != 0, J[(b12 ^ i13) >>> 1], bVar);
            }
            i11--;
            if (i11 < 0) {
                return;
            }
            F(bVar);
        }
    }

    public static void T(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, int i13, int i14, byte[] bArr4, int i15) {
        w(bArr, i11, bArr2, i12, null, (byte) 0, bArr3, i13, i14, bArr4, i15);
    }

    public static void U(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, byte[] bArr4, int i13, int i14, byte[] bArr5, int i15) {
        w(bArr, i11, bArr2, i12, bArr3, (byte) 0, bArr4, i13, i14, bArr5, i15);
    }

    public static void V(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, byte[] bArr4, int i13, byte[] bArr5, int i14) {
        w(bArr, i11, bArr2, i12, bArr3, (byte) 1, bArr4, i13, 64, bArr5, i14);
    }

    public static boolean W(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, int i13, int i14) {
        return x(bArr, i11, bArr2, i12, null, (byte) 0, bArr3, i13, i14);
    }

    private static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int[] iArr = new int[16];
        m(bArr, 0, iArr);
        int[] iArr2 = new int[8];
        m(bArr2, 0, iArr2);
        int[] iArr3 = new int[8];
        m(bArr3, 0, iArr3);
        h.C(iArr2, iArr3, iArr);
        byte[] bArr4 = new byte[64];
        for (int i11 = 0; i11 < 16; i11++) {
            p(iArr[i11], bArr4, i11 * 4);
        }
        return O(bArr4);
    }

    private static boolean b(byte[] bArr, byte b11) {
        return (bArr == null && b11 == 0) || (bArr != null && bArr.length < 256);
    }

    private static int c(int[] iArr, int[] iArr2) {
        int[] h11 = s60.b.h();
        int[] h12 = s60.b.h();
        int[] h13 = s60.b.h();
        s60.b.G(iArr, h12);
        s60.b.G(iArr2, h13);
        s60.b.z(h12, h13, h11);
        s60.b.I(h13, h12, h13);
        s60.b.z(h11, f51711f, h11);
        s60.b.b(h11);
        s60.b.I(h11, h13, h11);
        s60.b.B(h11);
        return s60.b.w(h11);
    }

    private static int d(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] h11 = s60.b.h();
        int[] h12 = s60.b.h();
        int[] h13 = s60.b.h();
        int[] h14 = s60.b.h();
        s60.b.G(iArr, h12);
        s60.b.G(iArr2, h13);
        s60.b.G(iArr3, h14);
        s60.b.z(h12, h13, h11);
        s60.b.I(h13, h12, h13);
        s60.b.z(h13, h14, h13);
        s60.b.G(h14, h14);
        s60.b.z(h11, f51711f, h11);
        s60.b.a(h11, h14, h11);
        s60.b.I(h11, h13, h11);
        s60.b.B(h11);
        return s60.b.w(h11);
    }

    private static boolean e(byte[] bArr) {
        int[] iArr = new int[8];
        k(bArr, 0, iArr, 0, 8);
        iArr[7] = iArr[7] & Integer.MAX_VALUE;
        return !h.s(iArr, f51707b);
    }

    private static boolean f(byte[] bArr, int[] iArr) {
        m(bArr, 0, iArr);
        return !h.s(iArr, f51708c);
    }

    private static byte[] g(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        return bArr2;
    }

    private static p h() {
        return new a0();
    }

    private static int i(byte[] bArr, int i11) {
        int i12 = i11 + 1;
        return ((bArr[i12 + 1] & 255) << 16) | (bArr[i11] & 255) | ((bArr[i12] & 255) << 8);
    }

    private static int j(byte[] bArr, int i11) {
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        return (bArr[i13 + 1] << 24) | (bArr[i11] & 255) | ((bArr[i12] & 255) << 8) | ((bArr[i13] & 255) << 16);
    }

    private static void k(byte[] bArr, int i11, int[] iArr, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            iArr[i12 + i14] = j(bArr, (i14 * 4) + i11);
        }
    }

    private static boolean l(byte[] bArr, int i11, boolean z11, c cVar) {
        byte[] g11 = g(bArr, i11, 32);
        if (e(g11)) {
            int i12 = (g11[31] & 128) >>> 7;
            g11[31] = (byte) (g11[31] & Byte.MAX_VALUE);
            s60.b.k(g11, 0, cVar.f51723b);
            int[] h11 = s60.b.h();
            int[] h12 = s60.b.h();
            s60.b.G(cVar.f51723b, h11);
            s60.b.z(f51711f, h11, h12);
            s60.b.J(h11);
            s60.b.b(h12);
            if (s60.b.H(h11, h12, cVar.f51722a)) {
                s60.b.B(cVar.f51722a);
                if (i12 == 1 && s60.b.x(cVar.f51722a)) {
                    return false;
                }
                int[] iArr = cVar.f51722a;
                if (z11 ^ (i12 != (iArr[0] & 1))) {
                    s60.b.A(iArr, iArr);
                }
                return true;
            }
            return false;
        }
        return false;
    }

    private static void m(byte[] bArr, int i11, int[] iArr) {
        k(bArr, i11, iArr, 0, 8);
    }

    private static void n(p pVar, byte b11, byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = f51706a;
            int length = bArr2.length;
            int i11 = length + 2;
            int length2 = bArr.length + i11;
            byte[] bArr3 = new byte[length2];
            System.arraycopy(bArr2, 0, bArr3, 0, length);
            bArr3[length] = b11;
            bArr3[length + 1] = (byte) bArr.length;
            System.arraycopy(bArr, 0, bArr3, i11, bArr.length);
            pVar.update(bArr3, 0, length2);
        }
    }

    private static void o(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) i11;
        int i13 = i12 + 1;
        bArr[i13] = (byte) (i11 >>> 8);
        bArr[i13 + 1] = (byte) (i11 >>> 16);
    }

    private static void p(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) i11;
        int i13 = i12 + 1;
        bArr[i13] = (byte) (i11 >>> 8);
        int i14 = i13 + 1;
        bArr[i14] = (byte) (i11 >>> 16);
        bArr[i14 + 1] = (byte) (i11 >>> 24);
    }

    private static void q(long j11, byte[] bArr, int i11) {
        p((int) j11, bArr, i11);
        o((int) (j11 >>> 32), bArr, i11 + 4);
    }

    private static int r(b bVar, byte[] bArr, int i11) {
        int[] h11 = s60.b.h();
        int[] h12 = s60.b.h();
        s60.b.u(bVar.f51719c, h12);
        s60.b.z(bVar.f51717a, h12, h11);
        s60.b.z(bVar.f51718b, h12, h12);
        s60.b.B(h11);
        s60.b.B(h12);
        int c11 = c(h11, h12);
        s60.b.p(h12, bArr, i11);
        int i12 = (i11 + 32) - 1;
        bArr[i12] = (byte) (((h11[0] & 1) << 7) | bArr[i12]);
        return c11;
    }

    public static void s(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
    }

    public static void t(byte[] bArr, int i11, byte[] bArr2, int i12) {
        p h11 = h();
        byte[] bArr3 = new byte[h11.getDigestSize()];
        h11.update(bArr, i11, 32);
        h11.doFinal(bArr3, 0);
        byte[] bArr4 = new byte[32];
        N(bArr3, 0, bArr4);
        Q(bArr4, bArr2, i12);
    }

    private static byte[] u(int[] iArr, int i11) {
        int[] iArr2 = new int[16];
        int i12 = 0;
        int i13 = 8;
        int i14 = 16;
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
        byte[] bArr = new byte[253];
        int i18 = 32 - i11;
        int i19 = 0;
        int i21 = 0;
        while (i12 < 16) {
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

    private static void v(p pVar, byte[] bArr, byte[] bArr2, byte[] bArr3, int i11, byte[] bArr4, byte b11, byte[] bArr5, int i12, int i13, byte[] bArr6, int i14) {
        n(pVar, b11, bArr4);
        pVar.update(bArr, 32, 32);
        pVar.update(bArr5, i12, i13);
        pVar.doFinal(bArr, 0);
        byte[] O = O(bArr);
        byte[] bArr7 = new byte[32];
        Q(O, bArr7, 0);
        n(pVar, b11, bArr4);
        pVar.update(bArr7, 0, 32);
        pVar.update(bArr3, i11, 32);
        pVar.update(bArr5, i12, i13);
        pVar.doFinal(bArr, 0);
        byte[] a11 = a(O, O(bArr), bArr2);
        System.arraycopy(bArr7, 0, bArr6, i14, 32);
        System.arraycopy(a11, 0, bArr6, i14 + 32, 32);
    }

    private static void w(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, byte b11, byte[] bArr4, int i13, int i14, byte[] bArr5, int i15) {
        if (!b(bArr3, b11)) {
            throw new IllegalArgumentException("ctx");
        }
        p h11 = h();
        byte[] bArr6 = new byte[h11.getDigestSize()];
        h11.update(bArr, i11, 32);
        h11.doFinal(bArr6, 0);
        byte[] bArr7 = new byte[32];
        N(bArr6, 0, bArr7);
        v(h11, bArr6, bArr7, bArr2, i12, bArr3, b11, bArr4, i13, i14, bArr5, i15);
    }

    private static boolean x(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, byte b11, byte[] bArr4, int i13, int i14) {
        if (b(bArr3, b11)) {
            byte[] g11 = g(bArr, i11, 32);
            byte[] g12 = g(bArr, i11 + 32, 32);
            if (e(g11)) {
                int[] iArr = new int[8];
                if (f(g12, iArr)) {
                    c cVar = new c();
                    if (l(bArr2, i12, true, cVar)) {
                        p h11 = h();
                        byte[] bArr5 = new byte[h11.getDigestSize()];
                        n(h11, b11, bArr3);
                        h11.update(g11, 0, 32);
                        h11.update(bArr2, i12, 32);
                        h11.update(bArr4, i13, i14);
                        h11.doFinal(bArr5, 0);
                        int[] iArr2 = new int[8];
                        m(O(bArr5), 0, iArr2);
                        b bVar = new b();
                        S(iArr, iArr2, cVar, bVar);
                        byte[] bArr6 = new byte[32];
                        return r(bVar, bArr6, 0) != 0 && org.bouncycastle.util.a.c(bArr6, g11);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        throw new IllegalArgumentException("ctx");
    }

    private static void y(e eVar, b bVar) {
        int[] h11 = s60.b.h();
        int[] h12 = s60.b.h();
        int[] h13 = s60.b.h();
        int[] iArr = bVar.f51720d;
        int[] h14 = s60.b.h();
        int[] h15 = s60.b.h();
        int[] iArr2 = bVar.f51721e;
        s60.b.c(bVar.f51718b, bVar.f51717a, h12, h11);
        s60.b.z(h11, eVar.f51729b, h11);
        s60.b.z(h12, eVar.f51728a, h12);
        s60.b.z(bVar.f51720d, bVar.f51721e, h13);
        s60.b.z(h13, eVar.f51730c, h13);
        s60.b.c(h12, h11, iArr2, iArr);
        s60.b.c(bVar.f51719c, h13, h15, h14);
        s60.b.d(h15);
        s60.b.z(iArr, h14, bVar.f51717a);
        s60.b.z(h15, iArr2, bVar.f51718b);
        s60.b.z(h14, h15, bVar.f51719c);
    }

    private static void z(boolean z11, d dVar, b bVar) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] h11 = s60.b.h();
        int[] h12 = s60.b.h();
        int[] h13 = s60.b.h();
        int[] h14 = s60.b.h();
        int[] iArr5 = bVar.f51720d;
        int[] h15 = s60.b.h();
        int[] h16 = s60.b.h();
        int[] iArr6 = bVar.f51721e;
        if (z11) {
            iArr2 = h13;
            iArr = h14;
            iArr4 = h15;
            iArr3 = h16;
        } else {
            iArr = h13;
            iArr2 = h14;
            iArr3 = h15;
            iArr4 = h16;
        }
        s60.b.c(bVar.f51718b, bVar.f51717a, h12, h11);
        s60.b.c(dVar.f51725b, dVar.f51724a, iArr2, iArr);
        s60.b.z(h11, h13, h11);
        s60.b.z(h12, h14, h12);
        s60.b.z(bVar.f51720d, bVar.f51721e, h13);
        s60.b.z(h13, dVar.f51727d, h13);
        s60.b.z(h13, f51712g, h13);
        s60.b.z(bVar.f51719c, dVar.f51726c, h14);
        s60.b.a(h14, h14, h14);
        s60.b.c(h12, h11, iArr6, iArr5);
        s60.b.c(h14, h13, iArr4, iArr3);
        s60.b.d(iArr4);
        s60.b.z(iArr5, h15, bVar.f51717a);
        s60.b.z(h16, iArr6, bVar.f51718b);
        s60.b.z(h15, h16, bVar.f51719c);
    }
}