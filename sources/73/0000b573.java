package to;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.l;
import uo.b;
import uo.i;
import wo.c;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f52370g = {3808, 476, 2107, 1799};

    /* renamed from: a  reason: collision with root package name */
    private final b f52371a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f52372b;

    /* renamed from: c  reason: collision with root package name */
    private int f52373c;

    /* renamed from: d  reason: collision with root package name */
    private int f52374d;

    /* renamed from: e  reason: collision with root package name */
    private int f52375e;

    /* renamed from: f  reason: collision with root package name */
    private int f52376f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: to.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C1157a {

        /* renamed from: a  reason: collision with root package name */
        private final int f52377a;

        /* renamed from: b  reason: collision with root package name */
        private final int f52378b;

        C1157a(int i11, int i12) {
            this.f52377a = i11;
            this.f52378b = i12;
        }

        int a() {
            return this.f52377a;
        }

        int b() {
            return this.f52378b;
        }

        l c() {
            return new l(a(), b());
        }

        public String toString() {
            return "<" + this.f52377a + ' ' + this.f52378b + '>';
        }
    }

    public a(b bVar) {
        this.f52371a = bVar;
    }

    private static float b(l lVar, l lVar2) {
        return vo.a.a(lVar.c(), lVar.d(), lVar2.c(), lVar2.d());
    }

    private static float c(C1157a c1157a, C1157a c1157a2) {
        return vo.a.b(c1157a.a(), c1157a.b(), c1157a2.a(), c1157a2.b());
    }

    private static l[] d(l[] lVarArr, int i11, int i12) {
        float f11 = i12 / (i11 * 2.0f);
        float c11 = lVarArr[0].c() - lVarArr[2].c();
        float d11 = lVarArr[0].d() - lVarArr[2].d();
        float c12 = (lVarArr[0].c() + lVarArr[2].c()) / 2.0f;
        float d12 = (lVarArr[0].d() + lVarArr[2].d()) / 2.0f;
        float f12 = c11 * f11;
        float f13 = d11 * f11;
        l lVar = new l(c12 + f12, d12 + f13);
        l lVar2 = new l(c12 - f12, d12 - f13);
        float c13 = lVarArr[1].c() - lVarArr[3].c();
        float d13 = lVarArr[1].d() - lVarArr[3].d();
        float c14 = (lVarArr[1].c() + lVarArr[3].c()) / 2.0f;
        float d14 = (lVarArr[1].d() + lVarArr[3].d()) / 2.0f;
        float f14 = c13 * f11;
        float f15 = f11 * d13;
        return new l[]{lVar, new l(c14 + f14, d14 + f15), lVar2, new l(c14 - f14, d14 - f15)};
    }

    private void e(l[] lVarArr) {
        long j11;
        long j12;
        if (o(lVarArr[0]) && o(lVarArr[1]) && o(lVarArr[2]) && o(lVarArr[3])) {
            int i11 = this.f52375e * 2;
            int[] iArr = {r(lVarArr[0], lVarArr[1], i11), r(lVarArr[1], lVarArr[2], i11), r(lVarArr[2], lVarArr[3], i11), r(lVarArr[3], lVarArr[0], i11)};
            this.f52376f = m(iArr, i11);
            long j13 = 0;
            for (int i12 = 0; i12 < 4; i12++) {
                int i13 = iArr[(this.f52376f + i12) % 4];
                if (this.f52372b) {
                    j11 = j13 << 7;
                    j12 = (i13 >> 1) & 127;
                } else {
                    j11 = j13 << 10;
                    j12 = ((i13 >> 2) & 992) + ((i13 >> 1) & 31);
                }
                j13 = j11 + j12;
            }
            int h11 = h(j13, this.f52372b);
            if (this.f52372b) {
                this.f52373c = (h11 >> 6) + 1;
                this.f52374d = (h11 & 63) + 1;
                return;
            }
            this.f52373c = (h11 >> 11) + 1;
            this.f52374d = (h11 & 2047) + 1;
            return;
        }
        throw NotFoundException.a();
    }

    private l[] f(C1157a c1157a) {
        this.f52375e = 1;
        C1157a c1157a2 = c1157a;
        C1157a c1157a3 = c1157a2;
        C1157a c1157a4 = c1157a3;
        boolean z11 = true;
        while (this.f52375e < 9) {
            C1157a j11 = j(c1157a, z11, 1, -1);
            C1157a j12 = j(c1157a2, z11, 1, 1);
            C1157a j13 = j(c1157a3, z11, -1, 1);
            C1157a j14 = j(c1157a4, z11, -1, -1);
            if (this.f52375e > 2) {
                double c11 = (c(j14, j11) * this.f52375e) / (c(c1157a4, c1157a) * (this.f52375e + 2));
                if (c11 < 0.75d || c11 > 1.25d || !p(j11, j12, j13, j14)) {
                    break;
                }
            }
            z11 = !z11;
            this.f52375e++;
            c1157a4 = j14;
            c1157a = j11;
            c1157a2 = j12;
            c1157a3 = j13;
        }
        int i11 = this.f52375e;
        if (i11 != 5 && i11 != 7) {
            throw NotFoundException.a();
        }
        this.f52372b = i11 == 5;
        l[] lVarArr = {new l(c1157a.a() + 0.5f, c1157a.b() - 0.5f), new l(c1157a2.a() + 0.5f, c1157a2.b() + 0.5f), new l(c1157a3.a() - 0.5f, c1157a3.b() + 0.5f), new l(c1157a4.a() - 0.5f, c1157a4.b() - 0.5f)};
        int i12 = this.f52375e;
        return d(lVarArr, (i12 * 2) - 3, i12 * 2);
    }

    private int g(C1157a c1157a, C1157a c1157a2) {
        float c11 = c(c1157a, c1157a2);
        float a11 = (c1157a2.a() - c1157a.a()) / c11;
        float b11 = (c1157a2.b() - c1157a.b()) / c11;
        float a12 = c1157a.a();
        float b12 = c1157a.b();
        boolean d11 = this.f52371a.d(c1157a.a(), c1157a.b());
        int ceil = (int) Math.ceil(c11);
        int i11 = 0;
        for (int i12 = 0; i12 < ceil; i12++) {
            a12 += a11;
            b12 += b11;
            if (this.f52371a.d(vo.a.c(a12), vo.a.c(b12)) != d11) {
                i11++;
            }
        }
        float f11 = i11 / c11;
        if (f11 <= 0.1f || f11 >= 0.9f) {
            return (f11 <= 0.1f) == d11 ? 1 : -1;
        }
        return 0;
    }

    private static int h(long j11, boolean z11) {
        int i11;
        int i12;
        if (z11) {
            i11 = 7;
            i12 = 2;
        } else {
            i11 = 10;
            i12 = 4;
        }
        int i13 = i11 - i12;
        int[] iArr = new int[i11];
        for (int i14 = i11 - 1; i14 >= 0; i14--) {
            iArr[i14] = ((int) j11) & 15;
            j11 >>= 4;
        }
        try {
            new c(wo.a.f56143k).a(iArr, i13);
            int i15 = 0;
            for (int i16 = 0; i16 < i12; i16++) {
                i15 = (i15 << 4) + iArr[i16];
            }
            return i15;
        } catch (ReedSolomonException unused) {
            throw NotFoundException.a();
        }
    }

    private int i() {
        if (this.f52372b) {
            return (this.f52373c * 4) + 11;
        }
        int i11 = this.f52373c;
        return i11 <= 4 ? (i11 * 4) + 15 : (i11 * 4) + ((((i11 - 4) / 8) + 1) * 2) + 15;
    }

    private C1157a j(C1157a c1157a, boolean z11, int i11, int i12) {
        int a11 = c1157a.a() + i11;
        int b11 = c1157a.b();
        while (true) {
            b11 += i12;
            if (!n(a11, b11) || this.f52371a.d(a11, b11) != z11) {
                break;
            }
            a11 += i11;
        }
        int i13 = a11 - i11;
        int i14 = b11 - i12;
        while (n(i13, i14) && this.f52371a.d(i13, i14) == z11) {
            i13 += i11;
        }
        int i15 = i13 - i11;
        while (n(i15, i14) && this.f52371a.d(i15, i14) == z11) {
            i14 += i12;
        }
        return new C1157a(i15, i14 - i12);
    }

    private C1157a k() {
        l c11;
        l lVar;
        l lVar2;
        l lVar3;
        l c12;
        l c13;
        l c14;
        l c15;
        try {
            l[] c16 = new vo.b(this.f52371a).c();
            lVar2 = c16[0];
            lVar3 = c16[1];
            lVar = c16[2];
            c11 = c16[3];
        } catch (NotFoundException unused) {
            int j11 = this.f52371a.j() / 2;
            int g11 = this.f52371a.g() / 2;
            int i11 = j11 + 7;
            int i12 = g11 - 7;
            l c17 = j(new C1157a(i11, i12), false, 1, -1).c();
            int i13 = g11 + 7;
            l c18 = j(new C1157a(i11, i13), false, 1, 1).c();
            int i14 = j11 - 7;
            l c19 = j(new C1157a(i14, i13), false, -1, 1).c();
            c11 = j(new C1157a(i14, i12), false, -1, -1).c();
            lVar = c19;
            lVar2 = c17;
            lVar3 = c18;
        }
        int c21 = vo.a.c((((lVar2.c() + c11.c()) + lVar3.c()) + lVar.c()) / 4.0f);
        int c22 = vo.a.c((((lVar2.d() + c11.d()) + lVar3.d()) + lVar.d()) / 4.0f);
        try {
            l[] c23 = new vo.b(this.f52371a, 15, c21, c22).c();
            c12 = c23[0];
            c13 = c23[1];
            c14 = c23[2];
            c15 = c23[3];
        } catch (NotFoundException unused2) {
            int i15 = c21 + 7;
            int i16 = c22 - 7;
            c12 = j(new C1157a(i15, i16), false, 1, -1).c();
            int i17 = c22 + 7;
            c13 = j(new C1157a(i15, i17), false, 1, 1).c();
            int i18 = c21 - 7;
            c14 = j(new C1157a(i18, i17), false, -1, 1).c();
            c15 = j(new C1157a(i18, i16), false, -1, -1).c();
        }
        return new C1157a(vo.a.c((((c12.c() + c15.c()) + c13.c()) + c14.c()) / 4.0f), vo.a.c((((c12.d() + c15.d()) + c13.d()) + c14.d()) / 4.0f));
    }

    private l[] l(l[] lVarArr) {
        return d(lVarArr, this.f52375e * 2, i());
    }

    private static int m(int[] iArr, int i11) {
        int i12 = 0;
        for (int i13 : iArr) {
            i12 = (i12 << 3) + ((i13 >> (i11 - 2)) << 1) + (i13 & 1);
        }
        int i14 = ((i12 & 1) << 11) + (i12 >> 1);
        for (int i15 = 0; i15 < 4; i15++) {
            if (Integer.bitCount(f52370g[i15] ^ i14) <= 2) {
                return i15;
            }
        }
        throw NotFoundException.a();
    }

    private boolean n(int i11, int i12) {
        return i11 >= 0 && i11 < this.f52371a.j() && i12 > 0 && i12 < this.f52371a.g();
    }

    private boolean o(l lVar) {
        return n(vo.a.c(lVar.c()), vo.a.c(lVar.d()));
    }

    private boolean p(C1157a c1157a, C1157a c1157a2, C1157a c1157a3, C1157a c1157a4) {
        C1157a c1157a5 = new C1157a(c1157a.a() - 3, c1157a.b() + 3);
        C1157a c1157a6 = new C1157a(c1157a2.a() - 3, c1157a2.b() - 3);
        C1157a c1157a7 = new C1157a(c1157a3.a() + 3, c1157a3.b() - 3);
        C1157a c1157a8 = new C1157a(c1157a4.a() + 3, c1157a4.b() + 3);
        int g11 = g(c1157a8, c1157a5);
        return g11 != 0 && g(c1157a5, c1157a6) == g11 && g(c1157a6, c1157a7) == g11 && g(c1157a7, c1157a8) == g11;
    }

    private b q(b bVar, l lVar, l lVar2, l lVar3, l lVar4) {
        i b11 = i.b();
        int i11 = i();
        float f11 = i11 / 2.0f;
        int i12 = this.f52375e;
        float f12 = f11 - i12;
        float f13 = f11 + i12;
        return b11.c(bVar, i11, i11, f12, f12, f13, f12, f13, f13, f12, f13, lVar.c(), lVar.d(), lVar2.c(), lVar2.d(), lVar3.c(), lVar3.d(), lVar4.c(), lVar4.d());
    }

    private int r(l lVar, l lVar2, int i11) {
        float b11 = b(lVar, lVar2);
        float f11 = b11 / i11;
        float c11 = lVar.c();
        float d11 = lVar.d();
        float c12 = ((lVar2.c() - lVar.c()) * f11) / b11;
        float d12 = (f11 * (lVar2.d() - lVar.d())) / b11;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            float f12 = i13;
            if (this.f52371a.d(vo.a.c((f12 * c12) + c11), vo.a.c((f12 * d12) + d11))) {
                i12 |= 1 << ((i11 - i13) - 1);
            }
        }
        return i12;
    }

    public ro.a a(boolean z11) {
        l[] f11 = f(k());
        if (z11) {
            l lVar = f11[0];
            f11[0] = f11[2];
            f11[2] = lVar;
        }
        e(f11);
        b bVar = this.f52371a;
        int i11 = this.f52376f;
        return new ro.a(q(bVar, f11[i11 % 4], f11[(i11 + 1) % 4], f11[(i11 + 2) % 4], f11[(i11 + 3) % 4]), l(f11), this.f52372b, this.f52374d, this.f52373c);
    }
}