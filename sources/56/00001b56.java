package com.google.android.exoplayer2.audio;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class j {

    /* renamed from: a  reason: collision with root package name */
    private final int f13167a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13168b;

    /* renamed from: c  reason: collision with root package name */
    private final float f13169c;

    /* renamed from: d  reason: collision with root package name */
    private final float f13170d;

    /* renamed from: e  reason: collision with root package name */
    private final float f13171e;

    /* renamed from: f  reason: collision with root package name */
    private final int f13172f;

    /* renamed from: g  reason: collision with root package name */
    private final int f13173g;

    /* renamed from: h  reason: collision with root package name */
    private final int f13174h;

    /* renamed from: i  reason: collision with root package name */
    private final short[] f13175i;

    /* renamed from: j  reason: collision with root package name */
    private short[] f13176j;

    /* renamed from: k  reason: collision with root package name */
    private int f13177k;

    /* renamed from: l  reason: collision with root package name */
    private short[] f13178l;

    /* renamed from: m  reason: collision with root package name */
    private int f13179m;

    /* renamed from: n  reason: collision with root package name */
    private short[] f13180n;

    /* renamed from: o  reason: collision with root package name */
    private int f13181o;

    /* renamed from: p  reason: collision with root package name */
    private int f13182p;

    /* renamed from: q  reason: collision with root package name */
    private int f13183q;

    /* renamed from: r  reason: collision with root package name */
    private int f13184r;

    /* renamed from: s  reason: collision with root package name */
    private int f13185s;

    /* renamed from: t  reason: collision with root package name */
    private int f13186t;

    /* renamed from: u  reason: collision with root package name */
    private int f13187u;

    /* renamed from: v  reason: collision with root package name */
    private int f13188v;

    public j(int i11, int i12, float f11, float f12, int i13) {
        this.f13167a = i11;
        this.f13168b = i12;
        this.f13169c = f11;
        this.f13170d = f12;
        this.f13171e = i11 / i13;
        this.f13172f = i11 / 400;
        int i14 = i11 / 65;
        this.f13173g = i14;
        int i15 = i14 * 2;
        this.f13174h = i15;
        this.f13175i = new short[i15];
        this.f13176j = new short[i15 * i12];
        this.f13178l = new short[i15 * i12];
        this.f13180n = new short[i15 * i12];
    }

    private void a(float f11, int i11) {
        int i12;
        int i13;
        if (this.f13179m == i11) {
            return;
        }
        int i14 = this.f13167a;
        int i15 = (int) (i14 / f11);
        while (true) {
            if (i15 <= 16384 && i14 <= 16384) {
                break;
            }
            i15 /= 2;
            i14 /= 2;
        }
        o(i11);
        int i16 = 0;
        while (true) {
            int i17 = this.f13181o;
            if (i16 < i17 - 1) {
                while (true) {
                    i12 = this.f13182p;
                    int i18 = (i12 + 1) * i15;
                    i13 = this.f13183q;
                    if (i18 <= i13 * i14) {
                        break;
                    }
                    this.f13178l = f(this.f13178l, this.f13179m, 1);
                    int i19 = 0;
                    while (true) {
                        int i21 = this.f13168b;
                        if (i19 < i21) {
                            this.f13178l[(this.f13179m * i21) + i19] = n(this.f13180n, (i21 * i16) + i19, i14, i15);
                            i19++;
                        }
                    }
                    this.f13183q++;
                    this.f13179m++;
                }
                int i22 = i12 + 1;
                this.f13182p = i22;
                if (i22 == i14) {
                    this.f13182p = 0;
                    ak.a.f(i13 == i15);
                    this.f13183q = 0;
                }
                i16++;
            } else {
                u(i17 - 1);
                return;
            }
        }
    }

    private void b(float f11) {
        int m11;
        int i11 = this.f13177k;
        if (i11 < this.f13174h) {
            return;
        }
        int i12 = 0;
        do {
            if (this.f13184r > 0) {
                m11 = c(i12);
            } else {
                int g11 = g(this.f13176j, i12);
                if (f11 > 1.0d) {
                    m11 = g11 + w(this.f13176j, i12, f11, g11);
                } else {
                    m11 = m(this.f13176j, i12, f11, g11);
                }
            }
            i12 += m11;
        } while (this.f13174h + i12 <= i11);
        v(i12);
    }

    private int c(int i11) {
        int min = Math.min(this.f13174h, this.f13184r);
        d(this.f13176j, i11, min);
        this.f13184r -= min;
        return min;
    }

    private void d(short[] sArr, int i11, int i12) {
        short[] f11 = f(this.f13178l, this.f13179m, i12);
        this.f13178l = f11;
        int i13 = this.f13168b;
        System.arraycopy(sArr, i11 * i13, f11, this.f13179m * i13, i13 * i12);
        this.f13179m += i12;
    }

    private void e(short[] sArr, int i11, int i12) {
        int i13 = this.f13174h / i12;
        int i14 = this.f13168b;
        int i15 = i12 * i14;
        int i16 = i11 * i14;
        for (int i17 = 0; i17 < i13; i17++) {
            int i18 = 0;
            for (int i19 = 0; i19 < i15; i19++) {
                i18 += sArr[(i17 * i15) + i16 + i19];
            }
            this.f13175i[i17] = (short) (i18 / i15);
        }
    }

    private short[] f(short[] sArr, int i11, int i12) {
        int length = sArr.length;
        int i13 = this.f13168b;
        int i14 = length / i13;
        return i11 + i12 <= i14 ? sArr : Arrays.copyOf(sArr, (((i14 * 3) / 2) + i12) * i13);
    }

    private int g(short[] sArr, int i11) {
        int i12;
        int i13 = this.f13167a;
        int i14 = i13 > 4000 ? i13 / 4000 : 1;
        if (this.f13168b == 1 && i14 == 1) {
            i12 = h(sArr, i11, this.f13172f, this.f13173g);
        } else {
            e(sArr, i11, i14);
            int h11 = h(this.f13175i, 0, this.f13172f / i14, this.f13173g / i14);
            if (i14 != 1) {
                int i15 = h11 * i14;
                int i16 = i14 * 4;
                int i17 = i15 - i16;
                int i18 = i15 + i16;
                int i19 = this.f13172f;
                if (i17 < i19) {
                    i17 = i19;
                }
                int i21 = this.f13173g;
                if (i18 > i21) {
                    i18 = i21;
                }
                if (this.f13168b == 1) {
                    i12 = h(sArr, i11, i17, i18);
                } else {
                    e(sArr, i11, 1);
                    i12 = h(this.f13175i, 0, i17, i18);
                }
            } else {
                i12 = h11;
            }
        }
        int i22 = q(this.f13187u, this.f13188v) ? this.f13185s : i12;
        this.f13186t = this.f13187u;
        this.f13185s = i12;
        return i22;
    }

    private int h(short[] sArr, int i11, int i12, int i13) {
        int i14 = i11 * this.f13168b;
        int i15 = 1;
        int i16 = 255;
        int i17 = 0;
        int i18 = 0;
        while (i12 <= i13) {
            int i19 = 0;
            for (int i21 = 0; i21 < i12; i21++) {
                i19 += Math.abs(sArr[i14 + i21] - sArr[(i14 + i12) + i21]);
            }
            if (i19 * i17 < i15 * i12) {
                i17 = i12;
                i15 = i19;
            }
            if (i19 * i16 > i18 * i12) {
                i16 = i12;
                i18 = i19;
            }
            i12++;
        }
        this.f13187u = i15 / i17;
        this.f13188v = i18 / i16;
        return i17;
    }

    private int m(short[] sArr, int i11, float f11, int i12) {
        int i13;
        if (f11 < 0.5f) {
            i13 = (int) ((i12 * f11) / (1.0f - f11));
        } else {
            this.f13184r = (int) ((i12 * ((2.0f * f11) - 1.0f)) / (1.0f - f11));
            i13 = i12;
        }
        int i14 = i12 + i13;
        short[] f12 = f(this.f13178l, this.f13179m, i14);
        this.f13178l = f12;
        int i15 = this.f13168b;
        System.arraycopy(sArr, i11 * i15, f12, this.f13179m * i15, i15 * i12);
        p(i13, this.f13168b, this.f13178l, this.f13179m + i12, sArr, i11 + i12, sArr, i11);
        this.f13179m += i14;
        return i13;
    }

    private short n(short[] sArr, int i11, int i12, int i13) {
        short s11 = sArr[i11];
        short s12 = sArr[i11 + this.f13168b];
        int i14 = this.f13183q * i12;
        int i15 = this.f13182p;
        int i16 = i15 * i13;
        int i17 = (i15 + 1) * i13;
        int i18 = i17 - i14;
        int i19 = i17 - i16;
        return (short) (((s11 * i18) + ((i19 - i18) * s12)) / i19);
    }

    private void o(int i11) {
        int i12 = this.f13179m - i11;
        short[] f11 = f(this.f13180n, this.f13181o, i12);
        this.f13180n = f11;
        short[] sArr = this.f13178l;
        int i13 = this.f13168b;
        System.arraycopy(sArr, i11 * i13, f11, this.f13181o * i13, i13 * i12);
        this.f13179m = i11;
        this.f13181o += i12;
    }

    private static void p(int i11, int i12, short[] sArr, int i13, short[] sArr2, int i14, short[] sArr3, int i15) {
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = (i13 * i12) + i16;
            int i18 = (i15 * i12) + i16;
            int i19 = (i14 * i12) + i16;
            for (int i21 = 0; i21 < i11; i21++) {
                sArr[i17] = (short) (((sArr2[i19] * (i11 - i21)) + (sArr3[i18] * i21)) / i11);
                i17 += i12;
                i19 += i12;
                i18 += i12;
            }
        }
    }

    private boolean q(int i11, int i12) {
        return i11 != 0 && this.f13185s != 0 && i12 <= i11 * 3 && i11 * 2 > this.f13186t * 3;
    }

    private void r() {
        int i11 = this.f13179m;
        float f11 = this.f13169c;
        float f12 = this.f13170d;
        float f13 = f11 / f12;
        float f14 = this.f13171e * f12;
        double d11 = f13;
        if (d11 <= 1.00001d && d11 >= 0.99999d) {
            d(this.f13176j, 0, this.f13177k);
            this.f13177k = 0;
        } else {
            b(f13);
        }
        if (f14 != 1.0f) {
            a(f14, i11);
        }
    }

    private void u(int i11) {
        if (i11 == 0) {
            return;
        }
        short[] sArr = this.f13180n;
        int i12 = this.f13168b;
        System.arraycopy(sArr, i11 * i12, sArr, 0, (this.f13181o - i11) * i12);
        this.f13181o -= i11;
    }

    private void v(int i11) {
        int i12 = this.f13177k - i11;
        short[] sArr = this.f13176j;
        int i13 = this.f13168b;
        System.arraycopy(sArr, i11 * i13, sArr, 0, i13 * i12);
        this.f13177k = i12;
    }

    private int w(short[] sArr, int i11, float f11, int i12) {
        int i13;
        if (f11 >= 2.0f) {
            i13 = (int) (i12 / (f11 - 1.0f));
        } else {
            this.f13184r = (int) ((i12 * (2.0f - f11)) / (f11 - 1.0f));
            i13 = i12;
        }
        short[] f12 = f(this.f13178l, this.f13179m, i13);
        this.f13178l = f12;
        p(i13, this.f13168b, f12, this.f13179m, sArr, i11, sArr, i11 + i12);
        this.f13179m += i13;
        return i13;
    }

    public void i() {
        this.f13177k = 0;
        this.f13179m = 0;
        this.f13181o = 0;
        this.f13182p = 0;
        this.f13183q = 0;
        this.f13184r = 0;
        this.f13185s = 0;
        this.f13186t = 0;
        this.f13187u = 0;
        this.f13188v = 0;
    }

    public void j(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f13168b, this.f13179m);
        shortBuffer.put(this.f13178l, 0, this.f13168b * min);
        int i11 = this.f13179m - min;
        this.f13179m = i11;
        short[] sArr = this.f13178l;
        int i12 = this.f13168b;
        System.arraycopy(sArr, min * i12, sArr, 0, i11 * i12);
    }

    public int k() {
        return this.f13179m * this.f13168b * 2;
    }

    public int l() {
        return this.f13177k * this.f13168b * 2;
    }

    public void s() {
        int i11;
        int i12 = this.f13177k;
        float f11 = this.f13169c;
        float f12 = this.f13170d;
        int i13 = this.f13179m + ((int) ((((i12 / (f11 / f12)) + this.f13181o) / (this.f13171e * f12)) + 0.5f));
        this.f13176j = f(this.f13176j, i12, (this.f13174h * 2) + i12);
        int i14 = 0;
        while (true) {
            i11 = this.f13174h;
            int i15 = this.f13168b;
            if (i14 >= i11 * 2 * i15) {
                break;
            }
            this.f13176j[(i15 * i12) + i14] = 0;
            i14++;
        }
        this.f13177k += i11 * 2;
        r();
        if (this.f13179m > i13) {
            this.f13179m = i13;
        }
        this.f13177k = 0;
        this.f13184r = 0;
        this.f13181o = 0;
    }

    public void t(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i11 = this.f13168b;
        int i12 = remaining / i11;
        short[] f11 = f(this.f13176j, this.f13177k, i12);
        this.f13176j = f11;
        shortBuffer.get(f11, this.f13177k * this.f13168b, ((i11 * i12) * 2) / 2);
        this.f13177k += i12;
        r();
    }
}