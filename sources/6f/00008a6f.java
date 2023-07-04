package net.time4j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class a1 extends net.time4j.a<Integer> {

    /* renamed from: b  reason: collision with root package name */
    private static final net.time4j.engine.k0 f40790b = new c();

    /* renamed from: c  reason: collision with root package name */
    static final a1 f40791c = new a1("YEAR_OF_WEEKDATE");
    private static final long serialVersionUID = -6907291758376370420L;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class b<T extends net.time4j.engine.q<T>> implements net.time4j.engine.y<T, Integer> {
        private b() {
        }

        private net.time4j.engine.p<?> c() {
            return z0.f41616l.n();
        }

        private static g0 j(g0 g0Var, int i11) {
            int w11 = a1.w(i11);
            int z11 = a1.z(g0Var);
            long transform = net.time4j.engine.z.UNIX.transform(net.time4j.base.b.j(i11, 1, 1), net.time4j.engine.z.MODIFIED_JULIAN_DATE) + (w11 - 1) + ((z11 - 1) * 7) + (g0Var.C0().getValue(z0.f41616l) - 1);
            if (z11 == 53) {
                if (((a1.w(i11 + 1) + (net.time4j.base.b.e(i11) ? 366 : 365)) - w11) / 7 < 53) {
                    transform -= 7;
                }
            }
            return g0Var.c1(transform - 730);
        }

        @Override // net.time4j.engine.y
        /* renamed from: d */
        public net.time4j.engine.p<?> getChildAtCeiling(T t11) {
            return c();
        }

        @Override // net.time4j.engine.y
        /* renamed from: e */
        public net.time4j.engine.p<?> getChildAtFloor(T t11) {
            return c();
        }

        @Override // net.time4j.engine.y
        /* renamed from: f */
        public Integer getMaximum(T t11) {
            return a1.f40791c.getDefaultMaximum();
        }

        @Override // net.time4j.engine.y
        /* renamed from: g */
        public Integer getMinimum(T t11) {
            return a1.f40791c.getDefaultMinimum();
        }

        @Override // net.time4j.engine.y
        /* renamed from: h */
        public Integer getValue(T t11) {
            g0 g0Var = (g0) t11.l(g0.f41292n);
            int year = g0Var.getYear();
            int D0 = g0Var.D0();
            int x11 = a1.x(g0Var, 0);
            if (x11 > D0) {
                year--;
            } else if (((D0 - x11) / 7) + 1 >= 53 && a1.x(g0Var, 1) + a1.y(g0Var, 0) <= D0) {
                year++;
            }
            return Integer.valueOf(year);
        }

        @Override // net.time4j.engine.y
        /* renamed from: i */
        public boolean isValid(T t11, Integer num) {
            int intValue;
            return num != null && (intValue = num.intValue()) >= -999999999 && intValue <= 999999999;
        }

        @Override // net.time4j.engine.y
        /* renamed from: k */
        public T withValue(T t11, Integer num, boolean z11) {
            if (num != null) {
                net.time4j.engine.p<g0> pVar = g0.f41292n;
                return (T) t11.z(pVar, j((g0) t11.l(pVar), num.intValue()));
            }
            throw new IllegalArgumentException("Missing element value.");
        }
    }

    /* loaded from: classes5.dex */
    private static class c<T extends net.time4j.engine.q<T>> implements net.time4j.engine.k0<T> {
        private c() {
        }

        @Override // net.time4j.engine.k0
        /* renamed from: c */
        public T b(T t11, long j11) {
            if (j11 == 0) {
                return t11;
            }
            int g11 = net.time4j.base.c.g(net.time4j.base.c.f(((Integer) t11.l(a1.f40791c)).intValue(), j11));
            net.time4j.engine.p<g0> pVar = g0.f41292n;
            g0 g0Var = (g0) t11.l(pVar);
            int H0 = g0Var.H0();
            x0 C0 = g0Var.C0();
            if (H0 == 53) {
                H0 = ((Integer) g0.R0(g11, 26, C0).e(z0.f41616l.n())).intValue();
            }
            return (T) t11.z(pVar, g0.R0(g11, H0, C0));
        }

        @Override // net.time4j.engine.k0
        /* renamed from: d */
        public long a(T t11, T t12) {
            net.time4j.engine.p<g0> pVar = g0.f41292n;
            g0 g0Var = (g0) t11.l(pVar);
            g0 g0Var2 = (g0) t12.l(pVar);
            a1 a1Var = a1.f40791c;
            long intValue = ((Integer) g0Var2.l(a1Var)).intValue() - ((Integer) g0Var.l(a1Var)).intValue();
            int i11 = (intValue > 0L ? 1 : (intValue == 0L ? 0 : -1));
            if (i11 != 0) {
                int z11 = a1.z(g0Var);
                int z12 = a1.z(g0Var2);
                if (i11 > 0 && z11 > z12) {
                    intValue--;
                } else if (i11 < 0 && z11 < z12) {
                    intValue++;
                }
                int i12 = (intValue > 0L ? 1 : (intValue == 0L ? 0 : -1));
                if (i12 == 0 || z11 != z12) {
                    return intValue;
                }
                int value = g0Var.C0().getValue();
                int value2 = g0Var2.C0().getValue();
                if (i12 > 0 && value > value2) {
                    intValue--;
                } else if (i12 < 0 && value < value2) {
                    intValue++;
                }
                int i13 = (intValue > 0L ? 1 : (intValue == 0L ? 0 : -1));
                if (i13 == 0 || value != value2) {
                    return intValue;
                }
                net.time4j.engine.p<h0> pVar2 = h0.f41327o;
                if (t11.q(pVar2) && t12.q(pVar2)) {
                    h0 h0Var = (h0) t11.l(pVar2);
                    h0 h0Var2 = (h0) t12.l(pVar2);
                    return (i13 <= 0 || !h0Var.y0(h0Var2)) ? (i13 >= 0 || !h0Var.z0(h0Var2)) ? intValue : intValue + 1 : intValue - 1;
                }
                return intValue;
            }
            return intValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class d extends p<g0> {

        /* renamed from: c  reason: collision with root package name */
        private final long f40792c;

        /* loaded from: classes5.dex */
        class a implements net.time4j.engine.u<i0> {
            a() {
            }

            @Override // net.time4j.engine.u
            /* renamed from: a */
            public i0 apply(i0 i0Var) {
                return (i0) a1.A().b(i0Var, d.this.f40792c);
            }
        }

        @Override // net.time4j.engine.u
        /* renamed from: c */
        public g0 apply(g0 g0Var) {
            return (g0) a1.A().b(g0Var, this.f40792c);
        }

        private d(long j11) {
            super(a1.f40791c, 8);
            this.f40792c = j11;
            new a();
        }
    }

    private a1(String str) {
        super(str);
        new d(-1L);
        new d(1L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends net.time4j.engine.q<T>> net.time4j.engine.k0<T> A() {
        return f40790b;
    }

    private Object readResolve() {
        return f40791c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends net.time4j.engine.q<T>> net.time4j.engine.y<T, Integer> t(Class<T> cls) {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int w(int i11) {
        x0 valueOf = x0.valueOf(net.time4j.base.b.c(i11, 1, 1));
        z0 z0Var = z0.f41616l;
        int value = valueOf.getValue(z0Var);
        return value <= 8 - z0Var.g() ? 2 - value : 9 - value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int x(g0 g0Var, int i11) {
        return w(g0Var.getYear() + i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int y(g0 g0Var, int i11) {
        return net.time4j.base.b.e(g0Var.getYear() + i11) ? 366 : 365;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int z(g0 g0Var) {
        int D0 = g0Var.D0();
        int x11 = x(g0Var, 0);
        if (x11 <= D0) {
            int i11 = ((D0 - x11) / 7) + 1;
            if (i11 < 53 || x(g0Var, 1) + y(g0Var, 0) > D0) {
                return i11;
            }
            return 1;
        }
        return (((D0 + y(g0Var, -1)) - x(g0Var, -1)) / 7) + 1;
    }

    @Override // net.time4j.engine.e, net.time4j.engine.p
    public char getSymbol() {
        return 'Y';
    }

    @Override // net.time4j.engine.p
    public Class<Integer> getType() {
        return Integer.class;
    }

    @Override // net.time4j.engine.p
    public boolean isDateElement() {
        return true;
    }

    @Override // net.time4j.engine.p
    public boolean isTimeElement() {
        return false;
    }

    @Override // net.time4j.engine.e
    protected boolean m() {
        return true;
    }

    @Override // net.time4j.engine.p
    /* renamed from: u */
    public Integer getDefaultMaximum() {
        return g0.f41285g;
    }

    @Override // net.time4j.engine.p
    /* renamed from: v */
    public Integer getDefaultMinimum() {
        return g0.f41284f;
    }
}