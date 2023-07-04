package net.time4j.history;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public abstract class c implements net.time4j.history.b {
    private static final /* synthetic */ c[] $VALUES;
    public static final c GREGORIAN;
    public static final c JULIAN;
    public static final c SWEDISH;

    /* loaded from: classes5.dex */
    enum a extends c {
        a(String str, int i11) {
            super(str, i11, null);
        }

        @Override // net.time4j.history.c, net.time4j.history.b
        public h fromMJD(long j11) {
            long l11 = net.time4j.base.b.l(j11);
            int i11 = net.time4j.base.b.i(l11);
            int h11 = net.time4j.base.b.h(l11);
            int g11 = net.time4j.base.b.g(l11);
            j jVar = i11 <= 0 ? j.BC : j.AD;
            if (i11 <= 0) {
                i11 = 1 - i11;
            }
            return new h(jVar, i11, h11, g11);
        }

        @Override // net.time4j.history.c, net.time4j.history.b
        public int getMaximumDayOfMonth(h hVar) {
            return net.time4j.base.b.d(c.getProlepticYear(hVar), hVar.getMonth());
        }

        @Override // net.time4j.history.c, net.time4j.history.b
        public boolean isValid(h hVar) {
            return net.time4j.base.b.f(c.getProlepticYear(hVar), hVar.getMonth(), hVar.b());
        }

        @Override // net.time4j.history.c, net.time4j.history.b
        public long toMJD(h hVar) {
            return net.time4j.base.b.j(c.getProlepticYear(hVar), hVar.getMonth(), hVar.b());
        }
    }

    static {
        a aVar = new a("GREGORIAN", 0);
        GREGORIAN = aVar;
        c cVar = new c("JULIAN", 1) { // from class: net.time4j.history.c.b
            @Override // net.time4j.history.c, net.time4j.history.b
            public h fromMJD(long j11) {
                long i11 = m.i(j11);
                int g11 = m.g(i11);
                int f11 = m.f(i11);
                int e11 = m.e(i11);
                j jVar = g11 <= 0 ? j.BC : j.AD;
                if (g11 <= 0) {
                    g11 = 1 - g11;
                }
                return new h(jVar, g11, f11, e11);
            }

            @Override // net.time4j.history.c, net.time4j.history.b
            public int getMaximumDayOfMonth(h hVar) {
                return m.b(c.getProlepticYear(hVar), hVar.getMonth());
            }

            @Override // net.time4j.history.c, net.time4j.history.b
            public boolean isValid(h hVar) {
                return m.d(c.getProlepticYear(hVar), hVar.getMonth(), hVar.b());
            }

            @Override // net.time4j.history.c, net.time4j.history.b
            public long toMJD(h hVar) {
                return m.h(c.getProlepticYear(hVar), hVar.getMonth(), hVar.b());
            }
        };
        JULIAN = cVar;
        c cVar2 = new c("SWEDISH", 2) { // from class: net.time4j.history.c.c
            @Override // net.time4j.history.c, net.time4j.history.b
            public h fromMJD(long j11) {
                if (j11 == -53576) {
                    return new h(j.AD, 1712, 2, 30);
                }
                return c.JULIAN.fromMJD(j11 + 1);
            }

            @Override // net.time4j.history.c, net.time4j.history.b
            public int getMaximumDayOfMonth(h hVar) {
                int prolepticYear = c.getProlepticYear(hVar);
                if (hVar.getMonth() == 2 && prolepticYear == 1712) {
                    return 30;
                }
                return m.b(prolepticYear, hVar.getMonth());
            }

            @Override // net.time4j.history.c, net.time4j.history.b
            public boolean isValid(h hVar) {
                int prolepticYear = c.getProlepticYear(hVar);
                if (hVar.b() == 30 && hVar.getMonth() == 2 && prolepticYear == 1712) {
                    return true;
                }
                return m.d(prolepticYear, hVar.getMonth(), hVar.b());
            }

            @Override // net.time4j.history.c, net.time4j.history.b
            public long toMJD(h hVar) {
                int prolepticYear = c.getProlepticYear(hVar);
                if (hVar.b() == 30 && hVar.getMonth() == 2 && prolepticYear == 1712) {
                    return -53576L;
                }
                return m.h(prolepticYear, hVar.getMonth(), hVar.b()) - 1;
            }
        };
        SWEDISH = cVar2;
        $VALUES = new c[]{aVar, cVar, cVar2};
    }

    private c(String str, int i11) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getProlepticYear(h hVar) {
        return hVar.c().annoDomini(hVar.d());
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    @Override // net.time4j.history.b
    public abstract /* synthetic */ h fromMJD(long j11);

    @Override // net.time4j.history.b
    public abstract /* synthetic */ int getMaximumDayOfMonth(h hVar);

    @Override // net.time4j.history.b
    public abstract /* synthetic */ boolean isValid(h hVar);

    @Override // net.time4j.history.b
    public abstract /* synthetic */ long toMJD(h hVar);

    /* synthetic */ c(String str, int i11, a aVar) {
        this(str, i11);
    }
}