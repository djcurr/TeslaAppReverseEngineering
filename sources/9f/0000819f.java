package l0;

/* loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<Double, Double> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ double f36257a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ double f36258b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ double f36259c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ double f36260d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(double d11, double d12, double d13, double d14) {
            super(1);
            this.f36257a = d11;
            this.f36258b = d12;
            this.f36259c = d13;
            this.f36260d = d14;
        }

        public final Double a(double d11) {
            return Double.valueOf(((this.f36257a + (this.f36258b * d11)) * Math.exp(this.f36259c * d11)) + this.f36260d);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ Double invoke(Double d11) {
            return a(d11.doubleValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<Double, Double> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ double f36261a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ double f36262b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ double f36263c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(double d11, double d12, double d13) {
            super(1);
            this.f36261a = d11;
            this.f36262b = d12;
            this.f36263c = d13;
        }

        public final Double a(double d11) {
            double d12 = this.f36261a;
            double d13 = this.f36262b;
            return Double.valueOf(((d12 * ((d13 * d11) + 1)) + (this.f36263c * d13)) * Math.exp(d13 * d11));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ Double invoke(Double d11) {
            return a(d11.doubleValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<Double, Double> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ double f36264a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ double f36265b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ double f36266c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ double f36267d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ double f36268e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(double d11, double d12, double d13, double d14, double d15) {
            super(1);
            this.f36264a = d11;
            this.f36265b = d12;
            this.f36266c = d13;
            this.f36267d = d14;
            this.f36268e = d15;
        }

        public final Double a(double d11) {
            return Double.valueOf((this.f36264a * Math.exp(this.f36265b * d11)) + (this.f36266c * Math.exp(this.f36267d * d11)) + this.f36268e);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ Double invoke(Double d11) {
            return a(d11.doubleValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.l<Double, Double> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ double f36269a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ double f36270b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ double f36271c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ double f36272d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(double d11, double d12, double d13, double d14) {
            super(1);
            this.f36269a = d11;
            this.f36270b = d12;
            this.f36271c = d13;
            this.f36272d = d14;
        }

        public final Double a(double d11) {
            double d12 = this.f36269a;
            double d13 = this.f36270b;
            double exp = d12 * d13 * Math.exp(d13 * d11);
            double d14 = this.f36271c;
            double d15 = this.f36272d;
            return Double.valueOf(exp + (d14 * d15 * Math.exp(d15 * d11)));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ Double invoke(Double d11) {
            return a(d11.doubleValue());
        }
    }

    public static final long a(double d11, double d12, double d13, double d14, double d15) {
        return f(t.a(1.0d, 2.0d * d12 * Math.sqrt(d11), d11), d12, d13, d14, d15);
    }

    public static final long b(float f11, float f12, float f13, float f14, float f15) {
        return a(f11, f12, f13, f14, f15);
    }

    private static final double c(vz.p<s, s> pVar, double d11, double d12, double d13) {
        double d14;
        double d15;
        a aVar;
        b bVar;
        double d16;
        double f11 = pVar.c().f();
        double d17 = f11 * d11;
        double d18 = d12 - d17;
        double log = Math.log(Math.abs(d13 / d11)) / f11;
        double d19 = d(Math.log(Math.abs(d13 / d18)), f11) / f11;
        int i11 = 0;
        if (!((Double.isInfinite(log) || Double.isNaN(log)) ? false : true)) {
            d14 = d19;
        } else {
            if (!(!((Double.isInfinite(d19) || Double.isNaN(d19)) ? false : true))) {
                log = Math.max(log, d19);
            }
            d14 = log;
        }
        double d21 = (-(d17 + d18)) / (f11 * d18);
        if (!Double.isNaN(d21) && d21 > 0.0d) {
            if (d21 <= 0.0d || (-e(d11, f11, d21, d18)) >= d13) {
                d14 = (-(2.0d / f11)) - (d11 / d18);
                d15 = d13;
                aVar = new a(d11, d18, f11, d15);
                bVar = new b(d18, f11, d11);
                d16 = Double.MAX_VALUE;
                while (d16 > 0.001d && i11 < 100) {
                    i11++;
                    double doubleValue = d14 - (aVar.invoke(Double.valueOf(d14)).doubleValue() / bVar.invoke(Double.valueOf(d14)).doubleValue());
                    double abs = Math.abs(d14 - doubleValue);
                    d14 = doubleValue;
                    d16 = abs;
                }
                return d14;
            } else if (d18 < 0.0d && d11 > 0.0d) {
                d14 = 0.0d;
            }
        }
        d15 = -d13;
        aVar = new a(d11, d18, f11, d15);
        bVar = new b(d18, f11, d11);
        d16 = Double.MAX_VALUE;
        while (d16 > 0.001d) {
            i11++;
            double doubleValue2 = d14 - (aVar.invoke(Double.valueOf(d14)).doubleValue() / bVar.invoke(Double.valueOf(d14)).doubleValue());
            double abs2 = Math.abs(d14 - doubleValue2);
            d14 = doubleValue2;
            d16 = abs2;
        }
        return d14;
    }

    private static final double d(double d11, double d12) {
        int i11 = 0;
        double d13 = d11;
        while (i11 < 6) {
            i11++;
            d13 = d11 - Math.log(Math.abs(d13 / d12));
        }
        return d13;
    }

    private static final double e(double d11, double d12, double d13, double d14) {
        double d15 = d12 * d13;
        return (d11 * Math.exp(d15)) + (d14 * d13 * Math.exp(d15));
    }

    private static final long f(vz.p<s, s> pVar, double d11, double d12, double d13, double d14) {
        double c11;
        int i11 = (d13 > 0.0d ? 1 : (d13 == 0.0d ? 0 : -1));
        if (i11 == 0) {
            if (d12 == 0.0d) {
                return 0L;
            }
        }
        if (i11 < 0) {
            d12 = -d12;
        }
        double d15 = d12;
        double abs = Math.abs(d13);
        if (d11 > 1.0d) {
            c11 = g(pVar, abs, d15, d14);
        } else if (d11 < 1.0d) {
            c11 = i(pVar, abs, d15, d14);
        } else {
            c11 = c(pVar, abs, d15, d14);
        }
        return (long) (c11 * 1000.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final double g(vz.p<l0.s, l0.s> r31, double r32, double r34, double r36) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.s0.g(vz.p, double, double, double):double");
    }

    private static final double h(double d11, double d12, double d13, double d14, double d15) {
        return (d11 * Math.exp(d12 * d13)) + (d14 * Math.exp(d15 * d13));
    }

    private static final double i(vz.p<s, s> pVar, double d11, double d12, double d13) {
        double f11 = pVar.c().f();
        double e11 = (d12 - (f11 * d11)) / pVar.c().e();
        return Math.log(d13 / Math.sqrt((d11 * d11) + (e11 * e11))) / f11;
    }
}