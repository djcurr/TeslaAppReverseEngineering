package net.time4j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public abstract class f implements v {
    private static final /* synthetic */ f[] $VALUES;
    public static final f CENTURIES;
    public static final f DAYS;
    public static final f DECADES;
    public static final f MILLENNIA;
    public static final f MONTHS;
    public static final f QUARTERS;
    public static final f WEEKS;
    public static final f YEARS;

    /* renamed from: co  reason: collision with root package name */
    private final v f40989co;
    private final v eof;
    private final v joda;
    private final v kld;
    private final v nvd;

    /* renamed from: ui  reason: collision with root package name */
    private final v f40990ui;

    /* loaded from: classes5.dex */
    enum a extends f {
        a(String str, int i11) {
            super(str, i11, null);
        }

        @Override // net.time4j.f, net.time4j.engine.v
        public double getLength() {
            return 3.1556952E10d;
        }

        @Override // net.time4j.f, net.time4j.x
        public char getSymbol() {
            return 'I';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class i {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f40991a;

        static {
            int[] iArr = new int[f.values().length];
            f40991a = iArr;
            try {
                iArr[f.WEEKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40991a[f.DAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40991a[f.MILLENNIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40991a[f.CENTURIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40991a[f.DECADES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40991a[f.YEARS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f40991a[f.QUARTERS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f40991a[f.MONTHS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class j<T extends net.time4j.engine.q<T>> implements net.time4j.engine.k0<T> {

        /* renamed from: a  reason: collision with root package name */
        private final f f40992a;

        /* renamed from: b  reason: collision with root package name */
        private final int f40993b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public j(f fVar) {
            this(fVar, 0);
        }

        private static long e(g0 g0Var, g0 g0Var2) {
            if (g0Var.getYear() == g0Var2.getYear()) {
                return g0Var2.D0() - g0Var.D0();
            }
            return g0Var2.E0() - g0Var.E0();
        }

        private long f(g0 g0Var, g0 g0Var2) {
            long F0 = g0Var2.F0() - g0Var.F0();
            int i11 = this.f40993b;
            if (i11 != 5 && i11 != 2 && i11 != 6) {
                int i12 = (F0 > 0L ? 1 : (F0 == 0L ? 0 : -1));
                if (i12 <= 0 || g0Var2.n() >= g0Var.n()) {
                    if (i12 >= 0 || g0Var2.n() <= g0Var.n()) {
                        return F0;
                    }
                    return F0 + 1;
                }
                return F0 - 1;
            }
            f fVar = f.MONTHS;
            int i13 = (F0 > 0L ? 1 : (F0 == 0L ? 0 : -1));
            if (i13 <= 0 || !g0.s0(fVar, g0Var, F0, i11).M(g0Var2)) {
                if (i13 >= 0 || !g0.s0(fVar, g0Var, F0, this.f40993b).N(g0Var2)) {
                    return F0;
                }
                return F0 + 1;
            }
            return F0 - 1;
        }

        @Override // net.time4j.engine.k0
        /* renamed from: c */
        public T b(T t11, long j11) {
            net.time4j.engine.p<g0> pVar = g0.f41292n;
            return (T) t11.z(pVar, g0.s0(this.f40992a, (g0) t11.l(pVar), j11, this.f40993b));
        }

        @Override // net.time4j.engine.k0
        /* renamed from: d */
        public long a(T t11, T t12) {
            long e11;
            net.time4j.engine.p<g0> pVar = g0.f41292n;
            g0 g0Var = (g0) t11.l(pVar);
            g0 g0Var2 = (g0) t12.l(pVar);
            switch (i.f40991a[this.f40992a.ordinal()]) {
                case 1:
                    e11 = e(g0Var, g0Var2) / 7;
                    break;
                case 2:
                    e11 = e(g0Var, g0Var2);
                    break;
                case 3:
                    e11 = f(g0Var, g0Var2) / 12000;
                    break;
                case 4:
                    e11 = f(g0Var, g0Var2) / 1200;
                    break;
                case 5:
                    e11 = f(g0Var, g0Var2) / 120;
                    break;
                case 6:
                    e11 = f(g0Var, g0Var2) / 12;
                    break;
                case 7:
                    e11 = f(g0Var, g0Var2) / 3;
                    break;
                case 8:
                    e11 = f(g0Var, g0Var2);
                    break;
                default:
                    throw new UnsupportedOperationException(this.f40992a.name());
            }
            int i11 = (e11 > 0L ? 1 : (e11 == 0L ? 0 : -1));
            if (i11 != 0) {
                net.time4j.engine.p<h0> pVar2 = h0.f41327o;
                if (t11.q(pVar2) && t12.q(pVar2)) {
                    f fVar = this.f40992a;
                    boolean z11 = true;
                    if (fVar != f.DAYS && ((g0) g0Var.G(e11, fVar)).I(g0Var2) != 0) {
                        z11 = false;
                    }
                    if (z11) {
                        h0 h0Var = (h0) t11.l(pVar2);
                        h0 h0Var2 = (h0) t12.l(pVar2);
                        return (i11 <= 0 || !h0Var.y0(h0Var2)) ? (i11 >= 0 || !h0Var.z0(h0Var2)) ? e11 : e11 + 1 : e11 - 1;
                    }
                    return e11;
                }
                return e11;
            }
            return e11;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public j(f fVar, int i11) {
            this.f40992a = fVar;
            this.f40993b = i11;
        }
    }

    static {
        a aVar = new a("MILLENNIA", 0);
        MILLENNIA = aVar;
        f fVar = new f("CENTURIES", 1) { // from class: net.time4j.f.b
            @Override // net.time4j.f, net.time4j.engine.v
            public double getLength() {
                return 3.1556952E9d;
            }

            @Override // net.time4j.f, net.time4j.x
            public char getSymbol() {
                return 'C';
            }
        };
        CENTURIES = fVar;
        f fVar2 = new f("DECADES", 2) { // from class: net.time4j.f.c
            @Override // net.time4j.f, net.time4j.engine.v
            public double getLength() {
                return 3.1556952E8d;
            }

            @Override // net.time4j.f, net.time4j.x
            public char getSymbol() {
                return 'E';
            }
        };
        DECADES = fVar2;
        f fVar3 = new f("YEARS", 3) { // from class: net.time4j.f.d
            @Override // net.time4j.f, net.time4j.engine.v
            public double getLength() {
                return 3.1556952E7d;
            }

            @Override // net.time4j.f, net.time4j.x
            public char getSymbol() {
                return 'Y';
            }
        };
        YEARS = fVar3;
        f fVar4 = new f("QUARTERS", 4) { // from class: net.time4j.f.e
            @Override // net.time4j.f, net.time4j.engine.v
            public double getLength() {
                return 7889238.0d;
            }

            @Override // net.time4j.f, net.time4j.x
            public char getSymbol() {
                return 'Q';
            }
        };
        QUARTERS = fVar4;
        f fVar5 = new f("MONTHS", 5) { // from class: net.time4j.f.f
            @Override // net.time4j.f, net.time4j.engine.v
            public double getLength() {
                return 2629746.0d;
            }

            @Override // net.time4j.f, net.time4j.x
            public char getSymbol() {
                return 'M';
            }
        };
        MONTHS = fVar5;
        f fVar6 = new f("WEEKS", 6) { // from class: net.time4j.f.g
            @Override // net.time4j.f, net.time4j.engine.v
            public double getLength() {
                return 604800.0d;
            }

            @Override // net.time4j.f, net.time4j.x
            public char getSymbol() {
                return 'W';
            }
        };
        WEEKS = fVar6;
        f fVar7 = new f("DAYS", 7) { // from class: net.time4j.f.h
            @Override // net.time4j.f, net.time4j.engine.v
            public double getLength() {
                return 86400.0d;
            }

            @Override // net.time4j.f, net.time4j.x
            public char getSymbol() {
                return 'D';
            }
        };
        DAYS = fVar7;
        $VALUES = new f[]{aVar, fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7};
    }

    private f(String str, int i11) {
        this.eof = new f0(this, 2);
        this.kld = new f0(this, 5);
        this.f40990ui = new f0(this, 4);
        this.nvd = new f0(this, 1);
        this.f40989co = new f0(this, 3);
        this.joda = new f0(this, 6);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public static v weekBasedYears() {
        return w0.f41605a;
    }

    public v atEndOfMonth() {
        int i11 = i.f40991a[ordinal()];
        if (i11 != 1 && i11 != 2) {
            return this.eof;
        }
        throw new UnsupportedOperationException("Original unit is not month-based: " + name());
    }

    public <T extends net.time4j.engine.i0<? super f, T>> long between(T t11, T t12) {
        return t11.H(t12, this);
    }

    @Override // net.time4j.engine.v
    public abstract /* synthetic */ double getLength();

    @Override // net.time4j.x
    public abstract /* synthetic */ char getSymbol();

    @Override // net.time4j.engine.v
    public boolean isCalendrical() {
        return true;
    }

    public v keepingEndOfMonth() {
        int i11 = i.f40991a[ordinal()];
        if (i11 != 1 && i11 != 2) {
            return this.kld;
        }
        throw new UnsupportedOperationException("Original unit is not month-based: " + name());
    }

    public v nextValidDate() {
        int i11 = i.f40991a[ordinal()];
        return (i11 == 1 || i11 == 2) ? this : this.nvd;
    }

    public v unlessInvalid() {
        int i11 = i.f40991a[ordinal()];
        return (i11 == 1 || i11 == 2) ? this : this.f40990ui;
    }

    public v withCarryOver() {
        int i11 = i.f40991a[ordinal()];
        return (i11 == 1 || i11 == 2) ? this : this.f40989co;
    }

    public v withJodaMetric() {
        int i11 = i.f40991a[ordinal()];
        return (i11 == 1 || i11 == 2) ? this : this.joda;
    }

    /* synthetic */ f(String str, int i11, a aVar) {
        this(str, i11);
    }
}