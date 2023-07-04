package yo;

import com.google.zxing.FormatException;

/* loaded from: classes2.dex */
final class a {

    /* renamed from: a  reason: collision with root package name */
    private final uo.b f59647a;

    /* renamed from: b  reason: collision with root package name */
    private final uo.b f59648b;

    /* renamed from: c  reason: collision with root package name */
    private final e f59649c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(uo.b bVar) {
        int g11 = bVar.g();
        if (g11 >= 8 && g11 <= 144 && (g11 & 1) == 0) {
            this.f59649c = j(bVar);
            uo.b a11 = a(bVar);
            this.f59647a = a11;
            this.f59648b = new uo.b(a11.j(), a11.g());
            return;
        }
        throw FormatException.a();
    }

    private uo.b a(uo.b bVar) {
        int f11 = this.f59649c.f();
        int e11 = this.f59649c.e();
        if (bVar.g() == f11) {
            int c11 = this.f59649c.c();
            int b11 = this.f59649c.b();
            int i11 = f11 / c11;
            int i12 = e11 / b11;
            uo.b bVar2 = new uo.b(i12 * b11, i11 * c11);
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = i13 * c11;
                for (int i15 = 0; i15 < i12; i15++) {
                    int i16 = i15 * b11;
                    for (int i17 = 0; i17 < c11; i17++) {
                        int i18 = ((c11 + 2) * i13) + 1 + i17;
                        int i19 = i14 + i17;
                        for (int i21 = 0; i21 < b11; i21++) {
                            if (bVar.d(((b11 + 2) * i15) + 1 + i21, i18)) {
                                bVar2.l(i16 + i21, i19);
                            }
                        }
                    }
                }
            }
            return bVar2;
        }
        throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
    }

    private int d(int i11, int i12) {
        int i13 = i11 - 1;
        int i14 = (h(i13, 0, i11, i12) ? 1 : 0) << 1;
        if (h(i13, 1, i11, i12)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (h(i13, 2, i11, i12)) {
            i15 |= 1;
        }
        int i16 = i15 << 1;
        if (h(0, i12 - 2, i11, i12)) {
            i16 |= 1;
        }
        int i17 = i16 << 1;
        int i18 = i12 - 1;
        if (h(0, i18, i11, i12)) {
            i17 |= 1;
        }
        int i19 = i17 << 1;
        if (h(1, i18, i11, i12)) {
            i19 |= 1;
        }
        int i21 = i19 << 1;
        if (h(2, i18, i11, i12)) {
            i21 |= 1;
        }
        int i22 = i21 << 1;
        return h(3, i18, i11, i12) ? i22 | 1 : i22;
    }

    private int e(int i11, int i12) {
        int i13 = (h(i11 + (-3), 0, i11, i12) ? 1 : 0) << 1;
        if (h(i11 - 2, 0, i11, i12)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (h(i11 - 1, 0, i11, i12)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (h(0, i12 - 4, i11, i12)) {
            i15 |= 1;
        }
        int i16 = i15 << 1;
        if (h(0, i12 - 3, i11, i12)) {
            i16 |= 1;
        }
        int i17 = i16 << 1;
        if (h(0, i12 - 2, i11, i12)) {
            i17 |= 1;
        }
        int i18 = i17 << 1;
        int i19 = i12 - 1;
        if (h(0, i19, i11, i12)) {
            i18 |= 1;
        }
        int i21 = i18 << 1;
        return h(1, i19, i11, i12) ? i21 | 1 : i21;
    }

    private int f(int i11, int i12) {
        int i13 = i11 - 1;
        int i14 = (h(i13, 0, i11, i12) ? 1 : 0) << 1;
        int i15 = i12 - 1;
        if (h(i13, i15, i11, i12)) {
            i14 |= 1;
        }
        int i16 = i14 << 1;
        int i17 = i12 - 3;
        if (h(0, i17, i11, i12)) {
            i16 |= 1;
        }
        int i18 = i16 << 1;
        int i19 = i12 - 2;
        if (h(0, i19, i11, i12)) {
            i18 |= 1;
        }
        int i21 = i18 << 1;
        if (h(0, i15, i11, i12)) {
            i21 |= 1;
        }
        int i22 = i21 << 1;
        if (h(1, i17, i11, i12)) {
            i22 |= 1;
        }
        int i23 = i22 << 1;
        if (h(1, i19, i11, i12)) {
            i23 |= 1;
        }
        int i24 = i23 << 1;
        return h(1, i15, i11, i12) ? i24 | 1 : i24;
    }

    private int g(int i11, int i12) {
        int i13 = (h(i11 + (-3), 0, i11, i12) ? 1 : 0) << 1;
        if (h(i11 - 2, 0, i11, i12)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (h(i11 - 1, 0, i11, i12)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (h(0, i12 - 2, i11, i12)) {
            i15 |= 1;
        }
        int i16 = i15 << 1;
        int i17 = i12 - 1;
        if (h(0, i17, i11, i12)) {
            i16 |= 1;
        }
        int i18 = i16 << 1;
        if (h(1, i17, i11, i12)) {
            i18 |= 1;
        }
        int i19 = i18 << 1;
        if (h(2, i17, i11, i12)) {
            i19 |= 1;
        }
        int i21 = i19 << 1;
        return h(3, i17, i11, i12) ? i21 | 1 : i21;
    }

    private boolean h(int i11, int i12, int i13, int i14) {
        if (i11 < 0) {
            i11 += i13;
            i12 += 4 - ((i13 + 4) & 7);
        }
        if (i12 < 0) {
            i12 += i14;
            i11 += 4 - ((i14 + 4) & 7);
        }
        this.f59648b.l(i12, i11);
        return this.f59647a.d(i12, i11);
    }

    private int i(int i11, int i12, int i13, int i14) {
        int i15 = i11 - 2;
        int i16 = i12 - 2;
        int i17 = (h(i15, i16, i13, i14) ? 1 : 0) << 1;
        int i18 = i12 - 1;
        if (h(i15, i18, i13, i14)) {
            i17 |= 1;
        }
        int i19 = i17 << 1;
        int i21 = i11 - 1;
        if (h(i21, i16, i13, i14)) {
            i19 |= 1;
        }
        int i22 = i19 << 1;
        if (h(i21, i18, i13, i14)) {
            i22 |= 1;
        }
        int i23 = i22 << 1;
        if (h(i21, i12, i13, i14)) {
            i23 |= 1;
        }
        int i24 = i23 << 1;
        if (h(i11, i16, i13, i14)) {
            i24 |= 1;
        }
        int i25 = i24 << 1;
        if (h(i11, i18, i13, i14)) {
            i25 |= 1;
        }
        int i26 = i25 << 1;
        return h(i11, i12, i13, i14) ? i26 | 1 : i26;
    }

    private static e j(uo.b bVar) {
        return e.h(bVar.g(), bVar.j());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e b() {
        return this.f59649c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] c() {
        byte[] bArr = new byte[this.f59649c.g()];
        int g11 = this.f59647a.g();
        int j11 = this.f59647a.j();
        int i11 = 0;
        int i12 = 4;
        boolean z11 = false;
        int i13 = 0;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        while (true) {
            if (i12 == g11 && i11 == 0 && !z11) {
                bArr[i13] = (byte) d(g11, j11);
                i12 -= 2;
                i11 += 2;
                i13++;
                z11 = true;
            } else {
                int i14 = g11 - 2;
                if (i12 == i14 && i11 == 0 && (j11 & 3) != 0 && !z12) {
                    bArr[i13] = (byte) e(g11, j11);
                    i12 -= 2;
                    i11 += 2;
                    i13++;
                    z12 = true;
                } else if (i12 == g11 + 4 && i11 == 2 && (j11 & 7) == 0 && !z13) {
                    bArr[i13] = (byte) f(g11, j11);
                    i12 -= 2;
                    i11 += 2;
                    i13++;
                    z13 = true;
                } else if (i12 == i14 && i11 == 0 && (j11 & 7) == 4 && !z14) {
                    bArr[i13] = (byte) g(g11, j11);
                    i12 -= 2;
                    i11 += 2;
                    i13++;
                    z14 = true;
                } else {
                    do {
                        if (i12 < g11 && i11 >= 0 && !this.f59648b.d(i11, i12)) {
                            bArr[i13] = (byte) i(i12, i11, g11, j11);
                            i13++;
                        }
                        i12 -= 2;
                        i11 += 2;
                        if (i12 < 0) {
                            break;
                        }
                    } while (i11 < j11);
                    int i15 = i12 + 1;
                    int i16 = i11 + 3;
                    do {
                        if (i15 >= 0 && i16 < j11 && !this.f59648b.d(i16, i15)) {
                            bArr[i13] = (byte) i(i15, i16, g11, j11);
                            i13++;
                        }
                        i15 += 2;
                        i16 -= 2;
                        if (i15 >= g11) {
                            break;
                        }
                    } while (i16 >= 0);
                    i12 = i15 + 3;
                    i11 = i16 + 1;
                }
            }
            if (i12 >= g11 && i11 >= j11) {
                break;
            }
        }
        if (i13 == this.f59649c.g()) {
            return bArr;
        }
        throw FormatException.a();
    }
}