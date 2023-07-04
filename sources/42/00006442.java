package cp;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class p extends k {

    /* renamed from: d  reason: collision with root package name */
    static final int[] f23045d = {1, 1, 1};

    /* renamed from: e  reason: collision with root package name */
    static final int[] f23046e = {1, 1, 1, 1, 1};

    /* renamed from: f  reason: collision with root package name */
    static final int[][] f23047f;

    /* renamed from: g  reason: collision with root package name */
    static final int[][] f23048g;

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f23049a = new StringBuilder(20);

    /* renamed from: b  reason: collision with root package name */
    private final o f23050b = new o();

    /* renamed from: c  reason: collision with root package name */
    private final g f23051c = new g();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f23047f = iArr;
        int[][] iArr2 = new int[20];
        f23048g = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i11 = 10; i11 < 20; i11++) {
            int[] iArr3 = f23047f[i11 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i12 = 0; i12 < iArr3.length; i12++) {
                iArr4[i12] = iArr3[(iArr3.length - i12) - 1];
            }
            f23048g[i11] = iArr4;
        }
    }

    static boolean h(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i11 = length - 1;
        return q(charSequence.subSequence(0, i11)) == Character.digit(charSequence.charAt(i11), 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(uo.a aVar, int[] iArr, int i11, int[][] iArr2) {
        k.e(aVar, i11, iArr);
        int length = iArr2.length;
        float f11 = 0.48f;
        int i12 = -1;
        for (int i13 = 0; i13 < length; i13++) {
            float d11 = k.d(iArr, iArr2[i13], 0.7f);
            if (d11 < f11) {
                i12 = i13;
                f11 = d11;
            }
        }
        if (i12 >= 0) {
            return i12;
        }
        throw NotFoundException.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int[] m(uo.a aVar, int i11, boolean z11, int[] iArr) {
        return n(aVar, i11, z11, iArr, new int[iArr.length]);
    }

    private static int[] n(uo.a aVar, int i11, boolean z11, int[] iArr, int[] iArr2) {
        int g11 = aVar.g();
        int f11 = z11 ? aVar.f(i11) : aVar.e(i11);
        int length = iArr.length;
        boolean z12 = z11;
        int i12 = 0;
        int i13 = f11;
        while (f11 < g11) {
            if (aVar.c(f11) != z12) {
                iArr2[i12] = iArr2[i12] + 1;
            } else {
                if (i12 != length - 1) {
                    i12++;
                } else if (k.d(iArr2, iArr, 0.7f) < 0.48f) {
                    return new int[]{i13, f11};
                } else {
                    i13 += iArr2[0] + iArr2[1];
                    int i14 = i12 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i14);
                    iArr2[i14] = 0;
                    iArr2[i12] = 0;
                    i12--;
                }
                iArr2[i12] = 1;
                z12 = !z12;
            }
            f11++;
        }
        throw NotFoundException.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int[] o(uo.a aVar) {
        int[] iArr = new int[f23045d.length];
        int[] iArr2 = null;
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            int[] iArr3 = f23045d;
            Arrays.fill(iArr, 0, iArr3.length, 0);
            iArr2 = n(aVar, i11, false, iArr3, iArr);
            int i12 = iArr2[0];
            int i13 = iArr2[1];
            int i14 = i12 - (i13 - i12);
            if (i14 >= 0) {
                z11 = aVar.h(i14, i12, false);
            }
            i11 = i13;
        }
        return iArr2;
    }

    static int q(CharSequence charSequence) {
        int length = charSequence.length();
        int i11 = 0;
        for (int i12 = length - 1; i12 >= 0; i12 -= 2) {
            int charAt = charSequence.charAt(i12) - '0';
            if (charAt < 0 || charAt > 9) {
                throw FormatException.a();
            }
            i11 += charAt;
        }
        int i13 = i11 * 3;
        for (int i14 = length - 2; i14 >= 0; i14 -= 2) {
            int charAt2 = charSequence.charAt(i14) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw FormatException.a();
            }
            i13 += charAt2;
        }
        return (1000 - i13) % 10;
    }

    @Override // cp.k
    public com.google.zxing.j b(int i11, uo.a aVar, Map<com.google.zxing.d, ?> map) {
        return l(i11, aVar, o(aVar), map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g(String str) {
        return h(str);
    }

    int[] j(uo.a aVar, int i11) {
        return m(aVar, i11, false, f23045d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int k(uo.a aVar, int[] iArr, StringBuilder sb2);

    public com.google.zxing.j l(int i11, uo.a aVar, int[] iArr, Map<com.google.zxing.d, ?> map) {
        int i12;
        String c11;
        com.google.zxing.m mVar = map == null ? null : (com.google.zxing.m) map.get(com.google.zxing.d.NEED_RESULT_POINT_CALLBACK);
        boolean z11 = true;
        if (mVar != null) {
            mVar.a(new com.google.zxing.l((iArr[0] + iArr[1]) / 2.0f, i11));
        }
        StringBuilder sb2 = this.f23049a;
        sb2.setLength(0);
        int k11 = k(aVar, iArr, sb2);
        if (mVar != null) {
            mVar.a(new com.google.zxing.l(k11, i11));
        }
        int[] j11 = j(aVar, k11);
        if (mVar != null) {
            mVar.a(new com.google.zxing.l((j11[0] + j11[1]) / 2.0f, i11));
        }
        int i13 = j11[1];
        int i14 = (i13 - j11[0]) + i13;
        if (i14 < aVar.g() && aVar.h(i13, i14, false)) {
            String sb3 = sb2.toString();
            if (sb3.length() >= 8) {
                if (g(sb3)) {
                    com.google.zxing.a p11 = p();
                    float f11 = i11;
                    com.google.zxing.j jVar = new com.google.zxing.j(sb3, null, new com.google.zxing.l[]{new com.google.zxing.l((iArr[1] + iArr[0]) / 2.0f, f11), new com.google.zxing.l((j11[1] + j11[0]) / 2.0f, f11)}, p11);
                    try {
                        com.google.zxing.j a11 = this.f23050b.a(i11, aVar, j11[1]);
                        jVar.h(com.google.zxing.k.UPC_EAN_EXTENSION, a11.f());
                        jVar.g(a11.d());
                        jVar.a(a11.e());
                        i12 = a11.f().length();
                    } catch (ReaderException unused) {
                        i12 = 0;
                    }
                    int[] iArr2 = map != null ? (int[]) map.get(com.google.zxing.d.ALLOWED_EAN_EXTENSIONS) : null;
                    if (iArr2 != null) {
                        int length = iArr2.length;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= length) {
                                z11 = false;
                                break;
                            } else if (i12 == iArr2[i15]) {
                                break;
                            } else {
                                i15++;
                            }
                        }
                        if (!z11) {
                            throw NotFoundException.a();
                        }
                    }
                    if ((p11 == com.google.zxing.a.EAN_13 || p11 == com.google.zxing.a.UPC_A) && (c11 = this.f23051c.c(sb3)) != null) {
                        jVar.h(com.google.zxing.k.POSSIBLE_COUNTRY, c11);
                    }
                    return jVar;
                }
                throw ChecksumException.a();
            }
            throw FormatException.a();
        }
        throw NotFoundException.a();
    }

    abstract com.google.zxing.a p();
}