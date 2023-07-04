package uo;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private final int f53613a;

    /* renamed from: b  reason: collision with root package name */
    private final int f53614b;

    /* renamed from: c  reason: collision with root package name */
    private final int f53615c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f53616d;

    public b(int i11) {
        this(i11, i11);
    }

    private String a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(this.f53614b * (this.f53613a + 1));
        for (int i11 = 0; i11 < this.f53614b; i11++) {
            for (int i12 = 0; i12 < this.f53613a; i12++) {
                sb2.append(d(i12, i11) ? str : str2);
            }
            sb2.append(str3);
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public b clone() {
        return new b(this.f53613a, this.f53614b, this.f53615c, (int[]) this.f53616d.clone());
    }

    public void c(int i11, int i12) {
        int i13 = (i12 * this.f53615c) + (i11 / 32);
        int[] iArr = this.f53616d;
        iArr[i13] = (1 << (i11 & 31)) ^ iArr[i13];
    }

    public boolean d(int i11, int i12) {
        return ((this.f53616d[(i12 * this.f53615c) + (i11 / 32)] >>> (i11 & 31)) & 1) != 0;
    }

    public int[] e() {
        int length = this.f53616d.length - 1;
        while (length >= 0 && this.f53616d[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i11 = this.f53615c;
        int i12 = length / i11;
        int i13 = (length % i11) << 5;
        int i14 = 31;
        while ((this.f53616d[length] >>> i14) == 0) {
            i14--;
        }
        return new int[]{i13 + i14, i12};
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f53613a == bVar.f53613a && this.f53614b == bVar.f53614b && this.f53615c == bVar.f53615c && Arrays.equals(this.f53616d, bVar.f53616d);
        }
        return false;
    }

    public int[] f() {
        int i11 = this.f53613a;
        int i12 = this.f53614b;
        int i13 = -1;
        int i14 = -1;
        for (int i15 = 0; i15 < this.f53614b; i15++) {
            int i16 = 0;
            while (true) {
                int i17 = this.f53615c;
                if (i16 < i17) {
                    int i18 = this.f53616d[(i17 * i15) + i16];
                    if (i18 != 0) {
                        if (i15 < i12) {
                            i12 = i15;
                        }
                        if (i15 > i14) {
                            i14 = i15;
                        }
                        int i19 = i16 << 5;
                        if (i19 < i11) {
                            int i21 = 0;
                            while ((i18 << (31 - i21)) == 0) {
                                i21++;
                            }
                            int i22 = i21 + i19;
                            if (i22 < i11) {
                                i11 = i22;
                            }
                        }
                        if (i19 + 31 > i13) {
                            int i23 = 31;
                            while ((i18 >>> i23) == 0) {
                                i23--;
                            }
                            int i24 = i19 + i23;
                            if (i24 > i13) {
                                i13 = i24;
                            }
                        }
                    }
                    i16++;
                }
            }
        }
        if (i13 < i11 || i14 < i12) {
            return null;
        }
        return new int[]{i11, i12, (i13 - i11) + 1, (i14 - i12) + 1};
    }

    public int g() {
        return this.f53614b;
    }

    public a h(int i11, a aVar) {
        if (aVar != null && aVar.g() >= this.f53613a) {
            aVar.a();
        } else {
            aVar = new a(this.f53613a);
        }
        int i12 = i11 * this.f53615c;
        for (int i13 = 0; i13 < this.f53615c; i13++) {
            aVar.l(i13 << 5, this.f53616d[i12 + i13]);
        }
        return aVar;
    }

    public int hashCode() {
        int i11 = this.f53613a;
        return (((((((i11 * 31) + i11) * 31) + this.f53614b) * 31) + this.f53615c) * 31) + Arrays.hashCode(this.f53616d);
    }

    public int[] i() {
        int[] iArr;
        int i11 = 0;
        while (true) {
            iArr = this.f53616d;
            if (i11 >= iArr.length || iArr[i11] != 0) {
                break;
            }
            i11++;
        }
        if (i11 == iArr.length) {
            return null;
        }
        int i12 = this.f53615c;
        int i13 = i11 / i12;
        int i14 = (i11 % i12) << 5;
        int i15 = iArr[i11];
        int i16 = 0;
        while ((i15 << (31 - i16)) == 0) {
            i16++;
        }
        return new int[]{i14 + i16, i13};
    }

    public int j() {
        return this.f53613a;
    }

    public void k() {
        int j11 = j();
        int g11 = g();
        a aVar = new a(j11);
        a aVar2 = new a(j11);
        for (int i11 = 0; i11 < (g11 + 1) / 2; i11++) {
            aVar = h(i11, aVar);
            int i12 = (g11 - 1) - i11;
            aVar2 = h(i12, aVar2);
            aVar.j();
            aVar2.j();
            n(i11, aVar2);
            n(i12, aVar);
        }
    }

    public void l(int i11, int i12) {
        int i13 = (i12 * this.f53615c) + (i11 / 32);
        int[] iArr = this.f53616d;
        iArr[i13] = (1 << (i11 & 31)) | iArr[i13];
    }

    public void m(int i11, int i12, int i13, int i14) {
        if (i12 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i14 > 0 && i13 > 0) {
            int i15 = i13 + i11;
            int i16 = i14 + i12;
            if (i16 > this.f53614b || i15 > this.f53613a) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i12 < i16) {
                int i17 = this.f53615c * i12;
                for (int i18 = i11; i18 < i15; i18++) {
                    int[] iArr = this.f53616d;
                    int i19 = (i18 / 32) + i17;
                    iArr[i19] = iArr[i19] | (1 << (i18 & 31));
                }
                i12++;
            }
            return;
        }
        throw new IllegalArgumentException("Height and width must be at least 1");
    }

    public void n(int i11, a aVar) {
        int[] d11 = aVar.d();
        int[] iArr = this.f53616d;
        int i12 = this.f53615c;
        System.arraycopy(d11, 0, iArr, i11 * i12, i12);
    }

    public String o(String str, String str2) {
        return a(str, str2, "\n");
    }

    public String toString() {
        return o("X ", "  ");
    }

    public b(int i11, int i12) {
        if (i11 > 0 && i12 > 0) {
            this.f53613a = i11;
            this.f53614b = i12;
            int i13 = (i11 + 31) / 32;
            this.f53615c = i13;
            this.f53616d = new int[i13 * i12];
            return;
        }
        throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }

    private b(int i11, int i12, int i13, int[] iArr) {
        this.f53613a = i11;
        this.f53614b = i12;
        this.f53615c = i13;
        this.f53616d = iArr;
    }
}