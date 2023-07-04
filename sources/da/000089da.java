package n60;

import java.math.BigInteger;
import n60.e;

/* loaded from: classes5.dex */
public class c {
    public static i a(e eVar, i iVar) {
        if (eVar.l(iVar.i())) {
            return eVar.j(iVar.l(false));
        }
        throw new IllegalArgumentException("Point must be on the same curve");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i b(i iVar) {
        if (iVar.x()) {
            return iVar;
        }
        throw new IllegalStateException("Invalid result");
    }

    private static i c(i iVar, BigInteger bigInteger, i iVar2, BigInteger bigInteger2) {
        i a11;
        i b11;
        e i11 = iVar.i();
        int a12 = m.a(i11);
        if (bigInteger.bitLength() > a12 || bigInteger2.bitLength() > a12) {
            throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
        }
        l b12 = m.b(iVar);
        l b13 = m.b(iVar2);
        g a13 = b12.a();
        g a14 = b13.a();
        int c11 = b12.c();
        if (c11 != b13.c()) {
            k kVar = new k();
            a11 = kVar.a(iVar, bigInteger);
            b11 = kVar.a(iVar2, bigInteger2);
        } else {
            int i12 = ((a12 + c11) - 1) / c11;
            i u11 = i11.u();
            int i13 = c11 * i12;
            int[] r11 = v60.n.r(i13, bigInteger);
            int[] r12 = v60.n.r(i13, bigInteger2);
            int i14 = i13 - 1;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = 0;
                int i17 = 0;
                for (int i18 = i14 - i15; i18 >= 0; i18 -= i12) {
                    int i19 = i18 >>> 5;
                    int i21 = i18 & 31;
                    int i22 = r11[i19] >>> i21;
                    i16 = ((i16 ^ (i22 >>> 1)) << 1) ^ i22;
                    int i23 = r12[i19] >>> i21;
                    i17 = ((i17 ^ (i23 >>> 1)) << 1) ^ i23;
                }
                u11 = u11.K(a13.c(i16).a(a14.c(i17)));
            }
            a11 = u11.a(b12.b());
            b11 = b13.b();
        }
        return a11.a(b11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i d(i iVar, BigInteger bigInteger, i iVar2, BigInteger bigInteger2) {
        boolean z11 = bigInteger.signum() < 0;
        boolean z12 = bigInteger2.signum() < 0;
        BigInteger abs = bigInteger.abs();
        BigInteger abs2 = bigInteger2.abs();
        int j11 = x.j(abs.bitLength(), 8);
        int j12 = x.j(abs2.bitLength(), 8);
        w l11 = x.l(iVar, j11, true);
        w l12 = x.l(iVar2, j12, true);
        int a11 = m.a(iVar.i());
        if (z11 || z12 || bigInteger.bitLength() > a11 || bigInteger2.bitLength() > a11 || !l11.h() || !l12.h()) {
            int min = Math.min(8, l11.g());
            int min2 = Math.min(8, l12.g());
            return f(z11 ? l11.d() : l11.c(), z11 ? l11.c() : l11.d(), x.g(min, abs), z12 ? l12.d() : l12.c(), z12 ? l12.c() : l12.d(), x.g(min2, abs2));
        }
        return c(iVar, bigInteger, iVar2, bigInteger2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i e(r60.a aVar, i iVar, BigInteger bigInteger, BigInteger bigInteger2) {
        boolean z11 = bigInteger.signum() < 0;
        boolean z12 = bigInteger2.signum() < 0;
        BigInteger abs = bigInteger.abs();
        BigInteger abs2 = bigInteger2.abs();
        w l11 = x.l(iVar, x.j(Math.max(abs.bitLength(), abs2.bitLength()), 8), true);
        w m11 = x.m(r60.c.c(aVar, iVar), aVar.getPointMap(), l11, true);
        int min = Math.min(8, l11.g());
        int min2 = Math.min(8, m11.g());
        return f(z11 ? l11.d() : l11.c(), z11 ? l11.c() : l11.d(), x.g(min, abs), z12 ? m11.d() : m11.c(), z12 ? m11.c() : m11.d(), x.g(min2, abs2));
    }

    private static i f(i[] iVarArr, i[] iVarArr2, byte[] bArr, i[] iVarArr3, i[] iVarArr4, byte[] bArr2) {
        i iVar;
        int max = Math.max(bArr.length, bArr2.length);
        i u11 = iVarArr[0].i().u();
        int i11 = max - 1;
        int i12 = 0;
        i iVar2 = u11;
        while (i11 >= 0) {
            byte b11 = i11 < bArr.length ? bArr[i11] : (byte) 0;
            byte b12 = i11 < bArr2.length ? bArr2[i11] : (byte) 0;
            if ((b11 | b12) == 0) {
                i12++;
            } else {
                if (b11 != 0) {
                    iVar = u11.a((b11 < 0 ? iVarArr2 : iVarArr)[Math.abs((int) b11) >>> 1]);
                } else {
                    iVar = u11;
                }
                if (b12 != 0) {
                    iVar = iVar.a((b12 < 0 ? iVarArr4 : iVarArr3)[Math.abs((int) b12) >>> 1]);
                }
                if (i12 > 0) {
                    iVar2 = iVar2.I(i12);
                    i12 = 0;
                }
                iVar2 = iVar2.K(iVar);
            }
            i11--;
        }
        return i12 > 0 ? iVar2.I(i12) : iVar2;
    }

    static i g(r60.a aVar, i[] iVarArr, BigInteger[] bigIntegerArr) {
        i[] iVarArr2 = iVarArr;
        int length = iVarArr2.length;
        int i11 = length << 1;
        boolean[] zArr = new boolean[i11];
        w[] wVarArr = new w[i11];
        byte[][] bArr = new byte[i11];
        j pointMap = aVar.getPointMap();
        int i12 = 0;
        while (i12 < length) {
            int i13 = i12 << 1;
            int i14 = i13 + 1;
            BigInteger bigInteger = bigIntegerArr[i13];
            zArr[i13] = bigInteger.signum() < 0;
            BigInteger abs = bigInteger.abs();
            BigInteger bigInteger2 = bigIntegerArr[i14];
            zArr[i14] = bigInteger2.signum() < 0;
            BigInteger abs2 = bigInteger2.abs();
            int j11 = x.j(Math.max(abs.bitLength(), abs2.bitLength()), 8);
            i iVar = iVarArr2[i12];
            w l11 = x.l(iVar, j11, true);
            w m11 = x.m(r60.c.c(aVar, iVar), pointMap, l11, true);
            int min = Math.min(8, l11.g());
            int min2 = Math.min(8, m11.g());
            wVarArr[i13] = l11;
            wVarArr[i14] = m11;
            bArr[i13] = x.g(min, abs);
            bArr[i14] = x.g(min2, abs2);
            i12++;
            iVarArr2 = iVarArr;
        }
        return i(zArr, wVarArr, bArr);
    }

    static i h(i[] iVarArr, BigInteger[] bigIntegerArr) {
        int length = iVarArr.length;
        boolean[] zArr = new boolean[length];
        w[] wVarArr = new w[length];
        byte[][] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            BigInteger bigInteger = bigIntegerArr[i11];
            zArr[i11] = bigInteger.signum() < 0;
            BigInteger abs = bigInteger.abs();
            w l11 = x.l(iVarArr[i11], x.j(abs.bitLength(), 8), true);
            int min = Math.min(8, l11.g());
            wVarArr[i11] = l11;
            bArr[i11] = x.g(min, abs);
        }
        return i(zArr, wVarArr, bArr);
    }

    private static i i(boolean[] zArr, w[] wVarArr, byte[][] bArr) {
        int length = bArr.length;
        int i11 = 0;
        for (byte[] bArr2 : bArr) {
            i11 = Math.max(i11, bArr2.length);
        }
        i u11 = wVarArr[0].c()[0].i().u();
        int i12 = i11 - 1;
        int i13 = 0;
        i iVar = u11;
        while (i12 >= 0) {
            i iVar2 = u11;
            for (int i14 = 0; i14 < length; i14++) {
                byte[] bArr3 = bArr[i14];
                byte b11 = i12 < bArr3.length ? bArr3[i12] : (byte) 0;
                if (b11 != 0) {
                    int abs = Math.abs((int) b11);
                    w wVar = wVarArr[i14];
                    iVar2 = iVar2.a(((b11 < 0) == zArr[i14] ? wVar.c() : wVar.d())[abs >>> 1]);
                }
            }
            if (iVar2 == u11) {
                i13++;
            } else {
                if (i13 > 0) {
                    iVar = iVar.I(i13);
                    i13 = 0;
                }
                iVar = iVar.K(iVar2);
            }
            i12--;
        }
        return i13 > 0 ? iVar.I(i13) : iVar;
    }

    static i j(i[] iVarArr, BigInteger[] bigIntegerArr, r60.d dVar) {
        BigInteger w11 = iVarArr[0].i().w();
        int length = iVarArr.length;
        int i11 = length << 1;
        BigInteger[] bigIntegerArr2 = new BigInteger[i11];
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            BigInteger[] decomposeScalar = dVar.decomposeScalar(bigIntegerArr[i13].mod(w11));
            int i14 = i12 + 1;
            bigIntegerArr2[i12] = decomposeScalar[0];
            i12 = i14 + 1;
            bigIntegerArr2[i14] = decomposeScalar[1];
        }
        if (dVar.hasEfficientPointMap()) {
            return g(dVar, iVarArr, bigIntegerArr2);
        }
        i[] iVarArr2 = new i[i11];
        int i15 = 0;
        for (i iVar : iVarArr) {
            i c11 = r60.c.c(dVar, iVar);
            int i16 = i15 + 1;
            iVarArr2[i15] = iVar;
            i15 = i16 + 1;
            iVarArr2[i16] = c11;
        }
        return h(iVarArr2, bigIntegerArr2);
    }

    public static i k(e eVar, i iVar) {
        if (eVar.l(iVar.i())) {
            return eVar.x(iVar);
        }
        throw new IllegalArgumentException("Point must be on the same curve");
    }

    public static boolean l(e eVar) {
        return m(eVar.s());
    }

    public static boolean m(u60.a aVar) {
        return aVar.getDimension() > 1 && aVar.getCharacteristic().equals(d.f40586c) && (aVar instanceof u60.f);
    }

    public static boolean n(e eVar) {
        return o(eVar.s());
    }

    public static boolean o(u60.a aVar) {
        return aVar.getDimension() == 1;
    }

    public static void p(f[] fVarArr, int i11, int i12, f fVar) {
        f[] fVarArr2 = new f[i12];
        int i13 = 0;
        fVarArr2[0] = fVarArr[i11];
        while (true) {
            i13++;
            if (i13 >= i12) {
                break;
            }
            fVarArr2[i13] = fVarArr2[i13 - 1].j(fVarArr[i11 + i13]);
        }
        int i14 = i13 - 1;
        if (fVar != null) {
            fVarArr2[i14] = fVarArr2[i14].j(fVar);
        }
        f g11 = fVarArr2[i14].g();
        while (i14 > 0) {
            int i15 = i14 - 1;
            int i16 = i14 + i11;
            f fVar2 = fVarArr[i16];
            fVarArr[i16] = fVarArr2[i15].j(g11);
            g11 = g11.j(fVar2);
            i14 = i15;
        }
        fVarArr[i11] = g11;
    }

    public static i q(i iVar, BigInteger bigInteger) {
        BigInteger abs = bigInteger.abs();
        i u11 = iVar.i().u();
        int bitLength = abs.bitLength();
        if (bitLength > 0) {
            if (abs.testBit(0)) {
                u11 = iVar;
            }
            for (int i11 = 1; i11 < bitLength; i11++) {
                iVar = iVar.J();
                if (abs.testBit(i11)) {
                    u11 = u11.a(iVar);
                }
            }
        }
        return bigInteger.signum() < 0 ? u11.z() : u11;
    }

    public static i r(i iVar, BigInteger bigInteger, i iVar2, BigInteger bigInteger2) {
        i j11;
        e i11 = iVar.i();
        i k11 = k(i11, iVar2);
        if ((i11 instanceof e.b) && ((e.b) i11).I()) {
            j11 = iVar.y(bigInteger).a(k11.y(bigInteger2));
        } else {
            r60.a r11 = i11.r();
            j11 = r11 instanceof r60.d ? j(new i[]{iVar, k11}, new BigInteger[]{bigInteger, bigInteger2}, (r60.d) r11) : d(iVar, bigInteger, k11, bigInteger2);
        }
        return b(j11);
    }
}