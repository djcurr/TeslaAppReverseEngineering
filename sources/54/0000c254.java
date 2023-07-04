package yb;

import bc.i;
import bc.k;
import com.drew.imaging.tiff.TiffProcessingException;
import java.util.HashSet;

/* loaded from: classes.dex */
public class d {
    private static int a(int i11, int i12) {
        return i11 + 2 + (i12 * 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(yb.b r29, bc.i r30, java.util.Set<java.lang.Integer> r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yb.d.b(yb.b, bc.i, java.util.Set, int, int):void");
    }

    private static void c(b bVar, int i11, int i12, int i13, int i14, i iVar) {
        int i15 = 0;
        switch (i14) {
            case 1:
                if (i13 == 1) {
                    bVar.p(i11, iVar.u(i12));
                    return;
                }
                short[] sArr = new short[i13];
                while (i15 < i13) {
                    sArr[i15] = iVar.u(i12 + i15);
                    i15++;
                }
                bVar.r(i11, sArr);
                return;
            case 2:
                bVar.h(i11, iVar.n(i12, i13, null));
                return;
            case 3:
                if (i13 == 1) {
                    bVar.s(i11, iVar.s(i12));
                    return;
                }
                int[] iArr = new int[i13];
                while (i15 < i13) {
                    iArr[i15] = iVar.s((i15 * 2) + i12);
                    i15++;
                }
                bVar.v(i11, iArr);
                return;
            case 4:
                if (i13 == 1) {
                    bVar.f(i11, iVar.t(i12));
                    return;
                }
                long[] jArr = new long[i13];
                while (i15 < i13) {
                    jArr[i15] = iVar.t((i15 * 4) + i12);
                    i15++;
                }
                bVar.x(i11, jArr);
                return;
            case 5:
                if (i13 == 1) {
                    bVar.m(i11, new k(iVar.t(i12), iVar.t(i12 + 4)));
                    return;
                } else if (i13 > 1) {
                    k[] kVarArr = new k[i13];
                    while (i15 < i13) {
                        int i16 = i15 * 8;
                        kVarArr[i15] = new k(iVar.t(i12 + i16), iVar.t(i12 + 4 + i16));
                        i15++;
                    }
                    bVar.d(i11, kVarArr);
                    return;
                } else {
                    return;
                }
            case 6:
                if (i13 == 1) {
                    bVar.w(i11, iVar.j(i12));
                    return;
                }
                byte[] bArr = new byte[i13];
                while (i15 < i13) {
                    bArr[i15] = iVar.j(i12 + i15);
                    i15++;
                }
                bVar.j(i11, bArr);
                return;
            case 7:
                bVar.q(i11, iVar.c(i12, i13));
                return;
            case 8:
                if (i13 == 1) {
                    bVar.t(i11, iVar.f(i12));
                    return;
                }
                short[] sArr2 = new short[i13];
                while (i15 < i13) {
                    sArr2[i15] = iVar.f((i15 * 2) + i12);
                    i15++;
                }
                bVar.e(i11, sArr2);
                return;
            case 9:
                if (i13 == 1) {
                    bVar.k(i11, iVar.h(i12));
                    return;
                }
                int[] iArr2 = new int[i13];
                while (i15 < i13) {
                    iArr2[i15] = iVar.h((i15 * 4) + i12);
                    i15++;
                }
                bVar.o(i11, iArr2);
                return;
            case 10:
                if (i13 == 1) {
                    bVar.m(i11, new k(iVar.h(i12), iVar.h(i12 + 4)));
                    return;
                } else if (i13 > 1) {
                    k[] kVarArr2 = new k[i13];
                    while (i15 < i13) {
                        int i17 = i15 * 8;
                        kVarArr2[i15] = new k(iVar.h(i12 + i17), iVar.h(i12 + 4 + i17));
                        i15++;
                    }
                    bVar.d(i11, kVarArr2);
                    return;
                } else {
                    return;
                }
            case 11:
                if (i13 == 1) {
                    bVar.setFloat(i11, iVar.e(i12));
                    return;
                }
                float[] fArr = new float[i13];
                while (i15 < i13) {
                    fArr[i15] = iVar.e((i15 * 4) + i12);
                    i15++;
                }
                bVar.g(i11, fArr);
                return;
            case 12:
                if (i13 == 1) {
                    bVar.setDouble(i11, iVar.d(i12));
                    return;
                }
                double[] dArr = new double[i13];
                while (i15 < i13) {
                    dArr[i15] = iVar.d((i15 * 4) + i12);
                    i15++;
                }
                bVar.u(i11, dArr);
                return;
            default:
                bVar.error(String.format("Invalid TIFF tag format code %d for tag 0x%04X", Integer.valueOf(i14), Integer.valueOf(i11)));
                return;
        }
    }

    public void d(i iVar, b bVar, int i11) {
        short f11 = iVar.f(i11);
        if (f11 == 19789) {
            iVar.w(true);
        } else if (f11 == 18761) {
            iVar.w(false);
        } else {
            throw new TiffProcessingException("Unclear distinction between Motorola/Intel byte ordering: " + ((int) f11));
        }
        int i12 = i11 + 2;
        bVar.n(iVar.s(i12));
        int h11 = iVar.h(i11 + 4) + i11;
        if (h11 >= iVar.k() - 1) {
            bVar.warn("First IFD offset is beyond the end of the TIFF data segment -- trying default offset");
            h11 = i12 + 2 + 4;
        }
        b(bVar, iVar, new HashSet(), h11, i11);
    }
}