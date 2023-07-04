package c3;

import java.util.Arrays;

/* loaded from: classes.dex */
public class a extends b {

    /* renamed from: a  reason: collision with root package name */
    private final double[] f8767a;

    /* renamed from: b  reason: collision with root package name */
    C0170a[] f8768b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f8769c = true;

    /* renamed from: c3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0170a {

        /* renamed from: s  reason: collision with root package name */
        private static double[] f8770s = new double[91];

        /* renamed from: a  reason: collision with root package name */
        double[] f8771a;

        /* renamed from: b  reason: collision with root package name */
        double f8772b;

        /* renamed from: c  reason: collision with root package name */
        double f8773c;

        /* renamed from: d  reason: collision with root package name */
        double f8774d;

        /* renamed from: e  reason: collision with root package name */
        double f8775e;

        /* renamed from: f  reason: collision with root package name */
        double f8776f;

        /* renamed from: g  reason: collision with root package name */
        double f8777g;

        /* renamed from: h  reason: collision with root package name */
        double f8778h;

        /* renamed from: i  reason: collision with root package name */
        double f8779i;

        /* renamed from: j  reason: collision with root package name */
        double f8780j;

        /* renamed from: k  reason: collision with root package name */
        double f8781k;

        /* renamed from: l  reason: collision with root package name */
        double f8782l;

        /* renamed from: m  reason: collision with root package name */
        double f8783m;

        /* renamed from: n  reason: collision with root package name */
        double f8784n;

        /* renamed from: o  reason: collision with root package name */
        double f8785o;

        /* renamed from: p  reason: collision with root package name */
        double f8786p;

        /* renamed from: q  reason: collision with root package name */
        boolean f8787q;

        /* renamed from: r  reason: collision with root package name */
        boolean f8788r;

        C0170a(int i11, double d11, double d12, double d13, double d14, double d15, double d16) {
            this.f8788r = false;
            this.f8787q = i11 == 1;
            this.f8773c = d11;
            this.f8774d = d12;
            this.f8779i = 1.0d / (d12 - d11);
            if (3 == i11) {
                this.f8788r = true;
            }
            double d17 = d15 - d13;
            double d18 = d16 - d14;
            if (!this.f8788r && Math.abs(d17) >= 0.001d && Math.abs(d18) >= 0.001d) {
                this.f8771a = new double[101];
                boolean z11 = this.f8787q;
                this.f8780j = d17 * (z11 ? -1 : 1);
                this.f8781k = d18 * (z11 ? 1 : -1);
                this.f8782l = z11 ? d15 : d13;
                this.f8783m = z11 ? d14 : d16;
                a(d13, d14, d15, d16);
                this.f8784n = this.f8772b * this.f8779i;
                return;
            }
            this.f8788r = true;
            this.f8775e = d13;
            this.f8776f = d15;
            this.f8777g = d14;
            this.f8778h = d16;
            double hypot = Math.hypot(d18, d17);
            this.f8772b = hypot;
            this.f8784n = hypot * this.f8779i;
            double d19 = this.f8774d;
            double d21 = this.f8773c;
            this.f8782l = d17 / (d19 - d21);
            this.f8783m = d18 / (d19 - d21);
        }

        private void a(double d11, double d12, double d13, double d14) {
            double[] dArr;
            double[] dArr2;
            double d15;
            double d16 = d13 - d11;
            double d17 = d12 - d14;
            int i11 = 0;
            double d18 = 0.0d;
            double d19 = 0.0d;
            double d21 = 0.0d;
            while (true) {
                if (i11 >= f8770s.length) {
                    break;
                }
                double d22 = d18;
                double radians = Math.toRadians((i11 * 90.0d) / (dArr.length - 1));
                double sin = Math.sin(radians) * d16;
                double cos = Math.cos(radians) * d17;
                if (i11 > 0) {
                    d15 = Math.hypot(sin - d19, cos - d21) + d22;
                    f8770s[i11] = d15;
                } else {
                    d15 = d22;
                }
                i11++;
                d21 = cos;
                d18 = d15;
                d19 = sin;
            }
            double d23 = d18;
            this.f8772b = d23;
            int i12 = 0;
            while (true) {
                double[] dArr3 = f8770s;
                if (i12 >= dArr3.length) {
                    break;
                }
                dArr3[i12] = dArr3[i12] / d23;
                i12++;
            }
            int i13 = 0;
            while (true) {
                if (i13 >= this.f8771a.length) {
                    return;
                }
                double length = i13 / (dArr2.length - 1);
                int binarySearch = Arrays.binarySearch(f8770s, length);
                if (binarySearch >= 0) {
                    this.f8771a[i13] = binarySearch / (f8770s.length - 1);
                } else if (binarySearch == -1) {
                    this.f8771a[i13] = 0.0d;
                } else {
                    int i14 = -binarySearch;
                    int i15 = i14 - 2;
                    double[] dArr4 = f8770s;
                    this.f8771a[i13] = (i15 + ((length - dArr4[i15]) / (dArr4[i14 - 1] - dArr4[i15]))) / (dArr4.length - 1);
                }
                i13++;
            }
        }

        double b() {
            double d11 = this.f8780j * this.f8786p;
            double hypot = this.f8784n / Math.hypot(d11, (-this.f8781k) * this.f8785o);
            if (this.f8787q) {
                d11 = -d11;
            }
            return d11 * hypot;
        }

        double c() {
            double d11 = this.f8780j * this.f8786p;
            double d12 = (-this.f8781k) * this.f8785o;
            double hypot = this.f8784n / Math.hypot(d11, d12);
            return this.f8787q ? (-d12) * hypot : d12 * hypot;
        }

        public double d(double d11) {
            return this.f8782l;
        }

        public double e(double d11) {
            return this.f8783m;
        }

        public double f(double d11) {
            double d12 = (d11 - this.f8773c) * this.f8779i;
            double d13 = this.f8775e;
            return d13 + (d12 * (this.f8776f - d13));
        }

        public double g(double d11) {
            double d12 = (d11 - this.f8773c) * this.f8779i;
            double d13 = this.f8777g;
            return d13 + (d12 * (this.f8778h - d13));
        }

        double h() {
            return this.f8782l + (this.f8780j * this.f8785o);
        }

        double i() {
            return this.f8783m + (this.f8781k * this.f8786p);
        }

        double j(double d11) {
            if (d11 <= 0.0d) {
                return 0.0d;
            }
            if (d11 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f8771a;
            double length = d11 * (dArr.length - 1);
            int i11 = (int) length;
            return dArr[i11] + ((length - i11) * (dArr[i11 + 1] - dArr[i11]));
        }

        void k(double d11) {
            double j11 = j((this.f8787q ? this.f8774d - d11 : d11 - this.f8773c) * this.f8779i) * 1.5707963267948966d;
            this.f8785o = Math.sin(j11);
            this.f8786p = Math.cos(j11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r5 == 1) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(int[] r25, double[] r26, double[][] r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            r24.<init>()
            r2 = 1
            r0.f8769c = r2
            r0.f8767a = r1
            int r3 = r1.length
            int r3 = r3 - r2
            c3.a$a[] r3 = new c3.a.C0170a[r3]
            r0.f8768b = r3
            r3 = 0
            r5 = r2
            r6 = r5
            r4 = r3
        L16:
            c3.a$a[] r7 = r0.f8768b
            int r8 = r7.length
            if (r4 >= r8) goto L53
            r8 = r25[r4]
            r9 = 3
            r10 = 2
            if (r8 == 0) goto L2f
            if (r8 == r2) goto L2c
            if (r8 == r10) goto L2a
            if (r8 == r9) goto L28
            goto L30
        L28:
            if (r5 != r2) goto L2c
        L2a:
            r5 = r10
            goto L2d
        L2c:
            r5 = r2
        L2d:
            r6 = r5
            goto L30
        L2f:
            r6 = r9
        L30:
            c3.a$a r22 = new c3.a$a
            r10 = r1[r4]
            int r23 = r4 + 1
            r12 = r1[r23]
            r8 = r27[r4]
            r14 = r8[r3]
            r8 = r27[r4]
            r16 = r8[r2]
            r8 = r27[r23]
            r18 = r8[r3]
            r8 = r27[r23]
            r20 = r8[r2]
            r8 = r22
            r9 = r6
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r22
            r4 = r23
            goto L16
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.a.<init>(int[], double[], double[][]):void");
    }

    @Override // c3.b
    public double c(double d11, int i11) {
        double d12;
        double g11;
        double e11;
        double i12;
        double c11;
        int i13 = 0;
        if (this.f8769c) {
            C0170a[] c0170aArr = this.f8768b;
            if (d11 < c0170aArr[0].f8773c) {
                double d13 = c0170aArr[0].f8773c;
                d12 = d11 - c0170aArr[0].f8773c;
                if (!c0170aArr[0].f8788r) {
                    c0170aArr[0].k(d13);
                    if (i11 == 0) {
                        i12 = this.f8768b[0].h();
                        c11 = this.f8768b[0].b();
                    } else {
                        i12 = this.f8768b[0].i();
                        c11 = this.f8768b[0].c();
                    }
                    return i12 + (d12 * c11);
                } else if (i11 == 0) {
                    g11 = c0170aArr[0].f(d13);
                    e11 = this.f8768b[0].d(d13);
                } else {
                    g11 = c0170aArr[0].g(d13);
                    e11 = this.f8768b[0].e(d13);
                }
            } else if (d11 > c0170aArr[c0170aArr.length - 1].f8774d) {
                double d14 = c0170aArr[c0170aArr.length - 1].f8774d;
                d12 = d11 - d14;
                int length = c0170aArr.length - 1;
                if (i11 == 0) {
                    g11 = c0170aArr[length].f(d14);
                    e11 = this.f8768b[length].d(d14);
                } else {
                    g11 = c0170aArr[length].g(d14);
                    e11 = this.f8768b[length].e(d14);
                }
            }
            return g11 + (d12 * e11);
        }
        C0170a[] c0170aArr2 = this.f8768b;
        if (d11 < c0170aArr2[0].f8773c) {
            d11 = c0170aArr2[0].f8773c;
        } else if (d11 > c0170aArr2[c0170aArr2.length - 1].f8774d) {
            d11 = c0170aArr2[c0170aArr2.length - 1].f8774d;
        }
        while (true) {
            C0170a[] c0170aArr3 = this.f8768b;
            if (i13 >= c0170aArr3.length) {
                return Double.NaN;
            }
            if (d11 <= c0170aArr3[i13].f8774d) {
                if (c0170aArr3[i13].f8788r) {
                    if (i11 == 0) {
                        return c0170aArr3[i13].f(d11);
                    }
                    return c0170aArr3[i13].g(d11);
                }
                c0170aArr3[i13].k(d11);
                if (i11 == 0) {
                    return this.f8768b[i13].h();
                }
                return this.f8768b[i13].i();
            }
            i13++;
        }
    }

    @Override // c3.b
    public void d(double d11, double[] dArr) {
        if (this.f8769c) {
            C0170a[] c0170aArr = this.f8768b;
            if (d11 < c0170aArr[0].f8773c) {
                double d12 = c0170aArr[0].f8773c;
                double d13 = d11 - c0170aArr[0].f8773c;
                if (c0170aArr[0].f8788r) {
                    dArr[0] = c0170aArr[0].f(d12) + (this.f8768b[0].d(d12) * d13);
                    dArr[1] = this.f8768b[0].g(d12) + (d13 * this.f8768b[0].e(d12));
                    return;
                }
                c0170aArr[0].k(d12);
                dArr[0] = this.f8768b[0].h() + (this.f8768b[0].b() * d13);
                dArr[1] = this.f8768b[0].i() + (d13 * this.f8768b[0].c());
                return;
            } else if (d11 > c0170aArr[c0170aArr.length - 1].f8774d) {
                double d14 = c0170aArr[c0170aArr.length - 1].f8774d;
                double d15 = d11 - d14;
                int length = c0170aArr.length - 1;
                if (c0170aArr[length].f8788r) {
                    dArr[0] = c0170aArr[length].f(d14) + (this.f8768b[length].d(d14) * d15);
                    dArr[1] = this.f8768b[length].g(d14) + (d15 * this.f8768b[length].e(d14));
                    return;
                }
                c0170aArr[length].k(d11);
                dArr[0] = this.f8768b[length].h() + (this.f8768b[length].b() * d15);
                dArr[1] = this.f8768b[length].i() + (d15 * this.f8768b[length].c());
                return;
            }
        } else {
            C0170a[] c0170aArr2 = this.f8768b;
            if (d11 < c0170aArr2[0].f8773c) {
                d11 = c0170aArr2[0].f8773c;
            }
            if (d11 > c0170aArr2[c0170aArr2.length - 1].f8774d) {
                d11 = c0170aArr2[c0170aArr2.length - 1].f8774d;
            }
        }
        int i11 = 0;
        while (true) {
            C0170a[] c0170aArr3 = this.f8768b;
            if (i11 >= c0170aArr3.length) {
                return;
            }
            if (d11 <= c0170aArr3[i11].f8774d) {
                if (c0170aArr3[i11].f8788r) {
                    dArr[0] = c0170aArr3[i11].f(d11);
                    dArr[1] = this.f8768b[i11].g(d11);
                    return;
                }
                c0170aArr3[i11].k(d11);
                dArr[0] = this.f8768b[i11].h();
                dArr[1] = this.f8768b[i11].i();
                return;
            }
            i11++;
        }
    }

    @Override // c3.b
    public void e(double d11, float[] fArr) {
        if (this.f8769c) {
            C0170a[] c0170aArr = this.f8768b;
            if (d11 < c0170aArr[0].f8773c) {
                double d12 = c0170aArr[0].f8773c;
                double d13 = d11 - c0170aArr[0].f8773c;
                if (c0170aArr[0].f8788r) {
                    fArr[0] = (float) (c0170aArr[0].f(d12) + (this.f8768b[0].d(d12) * d13));
                    fArr[1] = (float) (this.f8768b[0].g(d12) + (d13 * this.f8768b[0].e(d12)));
                    return;
                }
                c0170aArr[0].k(d12);
                fArr[0] = (float) (this.f8768b[0].h() + (this.f8768b[0].b() * d13));
                fArr[1] = (float) (this.f8768b[0].i() + (d13 * this.f8768b[0].c()));
                return;
            } else if (d11 > c0170aArr[c0170aArr.length - 1].f8774d) {
                double d14 = c0170aArr[c0170aArr.length - 1].f8774d;
                double d15 = d11 - d14;
                int length = c0170aArr.length - 1;
                if (c0170aArr[length].f8788r) {
                    fArr[0] = (float) (c0170aArr[length].f(d14) + (this.f8768b[length].d(d14) * d15));
                    fArr[1] = (float) (this.f8768b[length].g(d14) + (d15 * this.f8768b[length].e(d14)));
                    return;
                }
                c0170aArr[length].k(d11);
                fArr[0] = (float) this.f8768b[length].h();
                fArr[1] = (float) this.f8768b[length].i();
                return;
            }
        } else {
            C0170a[] c0170aArr2 = this.f8768b;
            if (d11 < c0170aArr2[0].f8773c) {
                d11 = c0170aArr2[0].f8773c;
            } else if (d11 > c0170aArr2[c0170aArr2.length - 1].f8774d) {
                d11 = c0170aArr2[c0170aArr2.length - 1].f8774d;
            }
        }
        int i11 = 0;
        while (true) {
            C0170a[] c0170aArr3 = this.f8768b;
            if (i11 >= c0170aArr3.length) {
                return;
            }
            if (d11 <= c0170aArr3[i11].f8774d) {
                if (c0170aArr3[i11].f8788r) {
                    fArr[0] = (float) c0170aArr3[i11].f(d11);
                    fArr[1] = (float) this.f8768b[i11].g(d11);
                    return;
                }
                c0170aArr3[i11].k(d11);
                fArr[0] = (float) this.f8768b[i11].h();
                fArr[1] = (float) this.f8768b[i11].i();
                return;
            }
            i11++;
        }
    }

    @Override // c3.b
    public void f(double d11, double[] dArr) {
        C0170a[] c0170aArr = this.f8768b;
        if (d11 < c0170aArr[0].f8773c) {
            d11 = c0170aArr[0].f8773c;
        } else if (d11 > c0170aArr[c0170aArr.length - 1].f8774d) {
            d11 = c0170aArr[c0170aArr.length - 1].f8774d;
        }
        int i11 = 0;
        while (true) {
            C0170a[] c0170aArr2 = this.f8768b;
            if (i11 >= c0170aArr2.length) {
                return;
            }
            if (d11 <= c0170aArr2[i11].f8774d) {
                if (c0170aArr2[i11].f8788r) {
                    dArr[0] = c0170aArr2[i11].d(d11);
                    dArr[1] = this.f8768b[i11].e(d11);
                    return;
                }
                c0170aArr2[i11].k(d11);
                dArr[0] = this.f8768b[i11].b();
                dArr[1] = this.f8768b[i11].c();
                return;
            }
            i11++;
        }
    }

    @Override // c3.b
    public double[] g() {
        return this.f8767a;
    }
}