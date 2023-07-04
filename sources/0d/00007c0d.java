package jp;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.zxing.c;
import com.google.zxing.d;
import com.google.zxing.l;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f33896a = {0, 4, 1, 5};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f33897b = {6, 2, 7, 3};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f33898c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f33899d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    private static void a(l[] lVarArr, l[] lVarArr2, int[] iArr) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            lVarArr[iArr[i11]] = lVarArr2[i11];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r5 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r4.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
        r5 = (com.google.zxing.l[]) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r5[1] == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        r3 = (int) java.lang.Math.max(r3, r5[1].d());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r5[3] == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
        r3 = java.lang.Math.max(r3, (int) r5[3].d());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List<com.google.zxing.l[]> b(boolean r8, uo.b r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            r2 = 0
            r3 = r2
            r4 = r3
        L9:
            r5 = r4
        La:
            int r6 = r9.g()
            if (r3 >= r6) goto L7d
            com.google.zxing.l[] r4 = f(r9, r3, r4)
            r6 = r4[r2]
            if (r6 != 0) goto L53
            r6 = 3
            r7 = r4[r6]
            if (r7 != 0) goto L53
            if (r5 == 0) goto L7d
            java.util.Iterator r4 = r0.iterator()
        L23:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4f
            java.lang.Object r5 = r4.next()
            com.google.zxing.l[] r5 = (com.google.zxing.l[]) r5
            r7 = r5[r1]
            if (r7 == 0) goto L3f
            float r3 = (float) r3
            r7 = r5[r1]
            float r7 = r7.d()
            float r3 = java.lang.Math.max(r3, r7)
            int r3 = (int) r3
        L3f:
            r7 = r5[r6]
            if (r7 == 0) goto L23
            r5 = r5[r6]
            float r5 = r5.d()
            int r5 = (int) r5
            int r3 = java.lang.Math.max(r3, r5)
            goto L23
        L4f:
            int r3 = r3 + 5
            r4 = r2
            goto L9
        L53:
            r0.add(r4)
            if (r8 == 0) goto L7d
            r3 = 2
            r5 = r4[r3]
            if (r5 == 0) goto L6b
            r5 = r4[r3]
            float r5 = r5.c()
            int r5 = (int) r5
            r3 = r4[r3]
            float r3 = r3.d()
            goto L79
        L6b:
            r3 = 4
            r5 = r4[r3]
            float r5 = r5.c()
            int r5 = (int) r5
            r3 = r4[r3]
            float r3 = r3.d()
        L79:
            int r3 = (int) r3
            r4 = r5
            r5 = r1
            goto La
        L7d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.a.b(boolean, uo.b):java.util.List");
    }

    public static b c(c cVar, Map<d, ?> map, boolean z11) {
        uo.b a11 = cVar.a();
        List<l[]> b11 = b(z11, a11);
        if (b11.isEmpty()) {
            a11 = a11.clone();
            a11.k();
            b11 = b(z11, a11);
        }
        return new b(a11, b11);
    }

    private static int[] d(uo.b bVar, int i11, int i12, int i13, boolean z11, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i14 = 0;
        while (bVar.d(i11, i12) && i11 > 0) {
            int i15 = i14 + 1;
            if (i14 >= 3) {
                break;
            }
            i11--;
            i14 = i15;
        }
        int length = iArr.length;
        boolean z12 = z11;
        int i16 = 0;
        int i17 = i11;
        while (i11 < i13) {
            if (bVar.d(i11, i12) != z12) {
                iArr2[i16] = iArr2[i16] + 1;
            } else {
                if (i16 != length - 1) {
                    i16++;
                } else if (g(iArr2, iArr, 0.8f) < 0.42f) {
                    return new int[]{i17, i11};
                } else {
                    i17 += iArr2[0] + iArr2[1];
                    int i18 = i16 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i18);
                    iArr2[i18] = 0;
                    iArr2[i16] = 0;
                    i16--;
                }
                iArr2[i16] = 1;
                z12 = !z12;
            }
            i11++;
        }
        if (i16 != length - 1 || g(iArr2, iArr, 0.8f) >= 0.42f) {
            return null;
        }
        return new int[]{i17, i11 - 1};
    }

    private static l[] e(uo.b bVar, int i11, int i12, int i13, int i14, int[] iArr) {
        boolean z11;
        int i15;
        int i16;
        int i17;
        l[] lVarArr = new l[4];
        int[] iArr2 = new int[iArr.length];
        int i18 = i13;
        while (true) {
            if (i18 >= i11) {
                z11 = false;
                break;
            }
            int[] d11 = d(bVar, i14, i18, i12, false, iArr, iArr2);
            if (d11 != null) {
                int i19 = i18;
                int[] iArr3 = d11;
                int i21 = i19;
                while (true) {
                    if (i21 <= 0) {
                        i17 = i21;
                        break;
                    }
                    int i22 = i21 - 1;
                    int[] d12 = d(bVar, i14, i22, i12, false, iArr, iArr2);
                    if (d12 == null) {
                        i17 = i22 + 1;
                        break;
                    }
                    iArr3 = d12;
                    i21 = i22;
                }
                float f11 = i17;
                lVarArr[0] = new l(iArr3[0], f11);
                lVarArr[1] = new l(iArr3[1], f11);
                z11 = true;
                i18 = i17;
            } else {
                i18 += 5;
            }
        }
        int i23 = i18 + 1;
        if (z11) {
            int[] iArr4 = {(int) lVarArr[0].c(), (int) lVarArr[1].c()};
            int i24 = i23;
            int i25 = 0;
            while (true) {
                if (i24 >= i11) {
                    i15 = i25;
                    i16 = i24;
                    break;
                }
                i15 = i25;
                i16 = i24;
                int[] d13 = d(bVar, iArr4[0], i24, i12, false, iArr, iArr2);
                if (d13 != null && Math.abs(iArr4[0] - d13[0]) < 5 && Math.abs(iArr4[1] - d13[1]) < 5) {
                    iArr4 = d13;
                    i25 = 0;
                } else if (i15 > 25) {
                    break;
                } else {
                    i25 = i15 + 1;
                }
                i24 = i16 + 1;
            }
            i23 = i16 - (i15 + 1);
            float f12 = i23;
            lVarArr[2] = new l(iArr4[0], f12);
            lVarArr[3] = new l(iArr4[1], f12);
        }
        if (i23 - i18 < 10) {
            Arrays.fill(lVarArr, (Object) null);
        }
        return lVarArr;
    }

    private static l[] f(uo.b bVar, int i11, int i12) {
        int g11 = bVar.g();
        int j11 = bVar.j();
        l[] lVarArr = new l[8];
        a(lVarArr, e(bVar, g11, j11, i11, i12, f33898c), f33896a);
        if (lVarArr[4] != null) {
            i12 = (int) lVarArr[4].c();
            i11 = (int) lVarArr[4].d();
        }
        a(lVarArr, e(bVar, g11, j11, i11, i12, f33899d), f33897b);
        return lVarArr;
    }

    private static float g(int[] iArr, int[] iArr2, float f11) {
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            i11 += iArr[i13];
            i12 += iArr2[i13];
        }
        if (i11 < i12) {
            return Float.POSITIVE_INFINITY;
        }
        float f12 = i11;
        float f13 = f12 / i12;
        float f14 = f11 * f13;
        float f15 = BitmapDescriptorFactory.HUE_RED;
        for (int i14 = 0; i14 < length; i14++) {
            float f16 = iArr2[i14] * f13;
            float f17 = iArr[i14];
            float f18 = f17 > f16 ? f17 - f16 : f16 - f17;
            if (f18 > f14) {
                return Float.POSITIVE_INFINITY;
            }
            f15 += f18;
        }
        return f15 / f12;
    }
}