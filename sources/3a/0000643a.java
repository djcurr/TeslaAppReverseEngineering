package cp;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class h extends k {

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f23029b = {6, 8, 10, 12, 14};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f23030c = {1, 1, 1, 1};

    /* renamed from: d  reason: collision with root package name */
    private static final int[][] f23031d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* renamed from: e  reason: collision with root package name */
    private static final int[][] f23032e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a  reason: collision with root package name */
    private int f23033a = -1;

    private static int g(int[] iArr) {
        int length = f23032e.length;
        float f11 = 0.38f;
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            float d11 = k.d(iArr, f23032e[i12], 0.5f);
            if (d11 < f11) {
                i11 = i12;
                f11 = d11;
            } else if (d11 == f11) {
                i11 = -1;
            }
        }
        if (i11 >= 0) {
            return i11 % 10;
        }
        throw NotFoundException.a();
    }

    private int[] h(uo.a aVar) {
        int i11;
        int[] k11;
        aVar.j();
        try {
            try {
                k11 = k(aVar, l(aVar), f23031d[0]);
            } catch (NotFoundException unused) {
                k11 = k(aVar, i11, f23031d[1]);
            }
            m(aVar, k11[0]);
            int i12 = k11[0];
            k11[0] = aVar.g() - k11[1];
            k11[1] = aVar.g() - i12;
            return k11;
        } finally {
            aVar.j();
        }
    }

    private static void i(uo.a aVar, int i11, int i12, StringBuilder sb2) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i11 < i12) {
            k.e(aVar, i11, iArr);
            for (int i13 = 0; i13 < 5; i13++) {
                int i14 = i13 * 2;
                iArr2[i13] = iArr[i14];
                iArr3[i13] = iArr[i14 + 1];
            }
            sb2.append((char) (g(iArr2) + 48));
            sb2.append((char) (g(iArr3) + 48));
            for (int i15 = 0; i15 < 10; i15++) {
                i11 += iArr[i15];
            }
        }
    }

    private int[] j(uo.a aVar) {
        int[] k11 = k(aVar, l(aVar), f23030c);
        this.f23033a = (k11[1] - k11[0]) / 4;
        m(aVar, k11[0]);
        return k11;
    }

    private static int[] k(uo.a aVar, int i11, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int g11 = aVar.g();
        int i12 = i11;
        boolean z11 = false;
        int i13 = 0;
        while (i11 < g11) {
            if (aVar.c(i11) != z11) {
                iArr2[i13] = iArr2[i13] + 1;
            } else {
                if (i13 != length - 1) {
                    i13++;
                } else if (k.d(iArr2, iArr, 0.5f) < 0.38f) {
                    return new int[]{i12, i11};
                } else {
                    i12 += iArr2[0] + iArr2[1];
                    int i14 = i13 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i14);
                    iArr2[i14] = 0;
                    iArr2[i13] = 0;
                    i13--;
                }
                iArr2[i13] = 1;
                z11 = !z11;
            }
            i11++;
        }
        throw NotFoundException.a();
    }

    private static int l(uo.a aVar) {
        int g11 = aVar.g();
        int e11 = aVar.e(0);
        if (e11 != g11) {
            return e11;
        }
        throw NotFoundException.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m(uo.a r3, int r4) {
        /*
            r2 = this;
            int r0 = r2.f23033a
            int r0 = r0 * 10
            if (r0 >= r4) goto L7
            goto L8
        L7:
            r0 = r4
        L8:
            int r4 = r4 + (-1)
        La:
            if (r0 <= 0) goto L19
            if (r4 < 0) goto L19
            boolean r1 = r3.c(r4)
            if (r1 != 0) goto L19
            int r0 = r0 + (-1)
            int r4 = r4 + (-1)
            goto La
        L19:
            if (r0 != 0) goto L1c
            return
        L1c:
            com.google.zxing.NotFoundException r3 = com.google.zxing.NotFoundException.a()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: cp.h.m(uo.a, int):void");
    }

    @Override // cp.k
    public com.google.zxing.j b(int i11, uo.a aVar, Map<com.google.zxing.d, ?> map) {
        boolean z11;
        int[] j11 = j(aVar);
        int[] h11 = h(aVar);
        StringBuilder sb2 = new StringBuilder(20);
        i(aVar, j11[1], h11[0], sb2);
        String sb3 = sb2.toString();
        int[] iArr = map != null ? (int[]) map.get(com.google.zxing.d.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = f23029b;
        }
        int length = sb3.length();
        int length2 = iArr.length;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= length2) {
                z11 = false;
                break;
            }
            int i14 = iArr[i12];
            if (length == i14) {
                z11 = true;
                break;
            }
            if (i14 > i13) {
                i13 = i14;
            }
            i12++;
        }
        if (!z11 && length > i13) {
            z11 = true;
        }
        if (z11) {
            float f11 = i11;
            return new com.google.zxing.j(sb3, null, new com.google.zxing.l[]{new com.google.zxing.l(j11[1], f11), new com.google.zxing.l(h11[0], f11)}, com.google.zxing.a.ITF);
        }
        throw FormatException.a();
    }
}