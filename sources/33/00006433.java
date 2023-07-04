package cp;

import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a extends k {

    /* renamed from: d  reason: collision with root package name */
    static final char[] f23007d = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: e  reason: collision with root package name */
    static final int[] f23008e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: f  reason: collision with root package name */
    private static final char[] f23009f = {'A', 'B', 'C', 'D'};

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f23010a = new StringBuilder(20);

    /* renamed from: b  reason: collision with root package name */
    private int[] f23011b = new int[80];

    /* renamed from: c  reason: collision with root package name */
    private int f23012c = 0;

    static boolean g(char[] cArr, char c11) {
        if (cArr != null) {
            for (char c12 : cArr) {
                if (c12 == c11) {
                    return true;
                }
            }
        }
        return false;
    }

    private void h(int i11) {
        int[] iArr = this.f23011b;
        int i12 = this.f23012c;
        iArr[i12] = i11;
        int i13 = i12 + 1;
        this.f23012c = i13;
        if (i13 >= iArr.length) {
            int[] iArr2 = new int[i13 << 1];
            System.arraycopy(iArr, 0, iArr2, 0, i13);
            this.f23011b = iArr2;
        }
    }

    private int i() {
        for (int i11 = 1; i11 < this.f23012c; i11 += 2) {
            int k11 = k(i11);
            if (k11 != -1 && g(f23009f, f23007d[k11])) {
                int i12 = 0;
                for (int i13 = i11; i13 < i11 + 7; i13++) {
                    i12 += this.f23011b[i13];
                }
                if (i11 == 1 || this.f23011b[i11 - 1] >= i12 / 2) {
                    return i11;
                }
            }
        }
        throw NotFoundException.a();
    }

    private void j(uo.a aVar) {
        int i11 = 0;
        this.f23012c = 0;
        int f11 = aVar.f(0);
        int g11 = aVar.g();
        if (f11 < g11) {
            boolean z11 = true;
            while (f11 < g11) {
                if (aVar.c(f11) != z11) {
                    i11++;
                } else {
                    h(i11);
                    z11 = !z11;
                    i11 = 1;
                }
                f11++;
            }
            h(i11);
            return;
        }
        throw NotFoundException.a();
    }

    private int k(int i11) {
        int i12 = i11 + 7;
        if (i12 >= this.f23012c) {
            return -1;
        }
        int[] iArr = this.f23011b;
        int i13 = Integer.MAX_VALUE;
        int i14 = 0;
        int i15 = Integer.MAX_VALUE;
        int i16 = 0;
        for (int i17 = i11; i17 < i12; i17 += 2) {
            int i18 = iArr[i17];
            if (i18 < i15) {
                i15 = i18;
            }
            if (i18 > i16) {
                i16 = i18;
            }
        }
        int i19 = (i15 + i16) / 2;
        int i21 = 0;
        for (int i22 = i11 + 1; i22 < i12; i22 += 2) {
            int i23 = iArr[i22];
            if (i23 < i13) {
                i13 = i23;
            }
            if (i23 > i21) {
                i21 = i23;
            }
        }
        int i24 = (i13 + i21) / 2;
        int i25 = 128;
        int i26 = 0;
        for (int i27 = 0; i27 < 7; i27++) {
            i25 >>= 1;
            if (iArr[i11 + i27] > ((i27 & 1) == 0 ? i19 : i24)) {
                i26 |= i25;
            }
        }
        while (true) {
            int[] iArr2 = f23008e;
            if (i14 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i14] == i26) {
                return i14;
            }
            i14++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ad, code lost:
        throw com.google.zxing.NotFoundException.a();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void l(int r15) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cp.a.l(int):void");
    }

    @Override // cp.k
    public com.google.zxing.j b(int i11, uo.a aVar, Map<com.google.zxing.d, ?> map) {
        Arrays.fill(this.f23011b, 0);
        j(aVar);
        int i12 = i();
        this.f23010a.setLength(0);
        int i13 = i12;
        do {
            int k11 = k(i13);
            if (k11 != -1) {
                this.f23010a.append((char) k11);
                i13 += 8;
                if (this.f23010a.length() > 1 && g(f23009f, f23007d[k11])) {
                    break;
                }
            } else {
                throw NotFoundException.a();
            }
        } while (i13 < this.f23012c);
        int i14 = i13 - 1;
        int i15 = this.f23011b[i14];
        int i16 = 0;
        for (int i17 = -8; i17 < -1; i17++) {
            i16 += this.f23011b[i13 + i17];
        }
        if (i13 < this.f23012c && i15 < i16 / 2) {
            throw NotFoundException.a();
        }
        l(i12);
        for (int i18 = 0; i18 < this.f23010a.length(); i18++) {
            StringBuilder sb2 = this.f23010a;
            sb2.setCharAt(i18, f23007d[sb2.charAt(i18)]);
        }
        char charAt = this.f23010a.charAt(0);
        char[] cArr = f23009f;
        if (g(cArr, charAt)) {
            StringBuilder sb3 = this.f23010a;
            if (g(cArr, sb3.charAt(sb3.length() - 1))) {
                if (this.f23010a.length() > 3) {
                    if (map == null || !map.containsKey(com.google.zxing.d.RETURN_CODABAR_START_END)) {
                        StringBuilder sb4 = this.f23010a;
                        sb4.deleteCharAt(sb4.length() - 1);
                        this.f23010a.deleteCharAt(0);
                    }
                    int i19 = 0;
                    for (int i21 = 0; i21 < i12; i21++) {
                        i19 += this.f23011b[i21];
                    }
                    float f11 = i19;
                    while (i12 < i14) {
                        i19 += this.f23011b[i12];
                        i12++;
                    }
                    float f12 = i11;
                    return new com.google.zxing.j(this.f23010a.toString(), null, new com.google.zxing.l[]{new com.google.zxing.l(f11, f12), new com.google.zxing.l(i19, f12)}, com.google.zxing.a.CODABAR);
                }
                throw NotFoundException.a();
            }
            throw NotFoundException.a();
        }
        throw NotFoundException.a();
    }
}