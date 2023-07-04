package j$.time.temporal;

import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes7.dex */
enum h implements l {
    DAY_OF_QUARTER { // from class: j$.time.temporal.d
        @Override // j$.time.temporal.h, j$.time.temporal.l
        public x c(k kVar) {
            if (h(kVar)) {
                long e11 = kVar.e(h.QUARTER_OF_YEAR);
                if (e11 == 1) {
                    return j$.time.chrono.g.f32874a.c(kVar.e(a.YEAR)) ? x.i(1L, 91L) : x.i(1L, 90L);
                }
                return e11 == 2 ? x.i(1L, 91L) : (e11 == 3 || e11 == 4) ? x.i(1L, 92L) : g();
            }
            throw new w("Unsupported field: DayOfQuarter");
        }

        @Override // j$.time.temporal.l
        public long d(k kVar) {
            int[] iArr;
            if (h(kVar)) {
                int b11 = kVar.b(a.DAY_OF_YEAR);
                int b12 = kVar.b(a.MONTH_OF_YEAR);
                long e11 = kVar.e(a.YEAR);
                iArr = h.f32955a;
                return b11 - iArr[((b12 - 1) / 3) + (j$.time.chrono.g.f32874a.c(e11) ? 4 : 0)];
            }
            throw new w("Unsupported field: DayOfQuarter");
        }

        @Override // j$.time.temporal.l
        public x g() {
            return x.j(1L, 90L, 92L);
        }

        @Override // j$.time.temporal.l
        public boolean h(k kVar) {
            return kVar.c(a.DAY_OF_YEAR) && kVar.c(a.MONTH_OF_YEAR) && kVar.c(a.YEAR) && h.k(kVar);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "DayOfQuarter";
        }
    },
    QUARTER_OF_YEAR { // from class: j$.time.temporal.e
        @Override // j$.time.temporal.l
        public long d(k kVar) {
            if (h(kVar)) {
                return (kVar.e(a.MONTH_OF_YEAR) + 2) / 3;
            }
            throw new w("Unsupported field: QuarterOfYear");
        }

        @Override // j$.time.temporal.l
        public x g() {
            return x.i(1L, 4L);
        }

        @Override // j$.time.temporal.l
        public boolean h(k kVar) {
            return kVar.c(a.MONTH_OF_YEAR) && h.k(kVar);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "QuarterOfYear";
        }
    },
    WEEK_OF_WEEK_BASED_YEAR { // from class: j$.time.temporal.f
        @Override // j$.time.temporal.h, j$.time.temporal.l
        public x c(k kVar) {
            x q11;
            if (h(kVar)) {
                q11 = h.q(j$.time.f.k(kVar));
                return q11;
            }
            throw new w("Unsupported field: WeekOfWeekBasedYear");
        }

        @Override // j$.time.temporal.l
        public long d(k kVar) {
            if (h(kVar)) {
                return h.n(j$.time.f.k(kVar));
            }
            throw new w("Unsupported field: WeekOfWeekBasedYear");
        }

        @Override // j$.time.temporal.l
        public x g() {
            return x.j(1L, 52L, 53L);
        }

        @Override // j$.time.temporal.l
        public boolean h(k kVar) {
            return kVar.c(a.EPOCH_DAY) && h.k(kVar);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "WeekOfWeekBasedYear";
        }
    },
    WEEK_BASED_YEAR { // from class: j$.time.temporal.g
        @Override // j$.time.temporal.l
        public long d(k kVar) {
            int p11;
            if (h(kVar)) {
                p11 = h.p(j$.time.f.k(kVar));
                return p11;
            }
            throw new w("Unsupported field: WeekBasedYear");
        }

        @Override // j$.time.temporal.l
        public x g() {
            return a.YEAR.g();
        }

        @Override // j$.time.temporal.l
        public boolean h(k kVar) {
            return kVar.c(a.EPOCH_DAY) && h.k(kVar);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "WeekBasedYear";
        }
    };
    

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f32955a = {0, 90, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384, 273, 0, 91, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, 274};

    /* JADX INFO: Access modifiers changed from: package-private */
    h(c cVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean k(k kVar) {
        int i11 = t.f32969a;
        Object obj = (j$.time.chrono.f) kVar.d(n.f32963a);
        if (obj == null) {
            obj = j$.time.chrono.g.f32874a;
        }
        return ((j$.time.chrono.a) obj).equals(j$.time.chrono.g.f32874a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
        if ((r0 == -3 || (r0 == -2 && r5.p())) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int n(j$.time.f r5) {
        /*
            j$.time.d r0 = r5.m()
            int r0 = r0.ordinal()
            int r1 = r5.n()
            r2 = 1
            int r1 = r1 - r2
            int r0 = 3 - r0
            int r0 = r0 + r1
            int r3 = r0 / 7
            int r3 = r3 * 7
            int r0 = r0 - r3
            r3 = -3
            int r0 = r0 + r3
            if (r0 >= r3) goto L1c
            int r0 = r0 + 7
        L1c:
            if (r1 >= r0) goto L34
            r0 = 180(0xb4, float:2.52E-43)
            j$.time.f r5 = r5.u(r0)
            r0 = -1
            j$.time.f r5 = r5.s(r0)
            j$.time.temporal.x r5 = q(r5)
            long r0 = r5.d()
            int r5 = (int) r0
            goto L50
        L34:
            int r1 = r1 - r0
            int r1 = r1 / 7
            int r1 = r1 + r2
            r4 = 53
            if (r1 != r4) goto L4e
            if (r0 == r3) goto L4a
            r3 = -2
            if (r0 != r3) goto L48
            boolean r5 = r5.p()
            if (r5 == 0) goto L48
            goto L4a
        L48:
            r5 = 0
            goto L4b
        L4a:
            r5 = r2
        L4b:
            if (r5 != 0) goto L4e
            goto L4f
        L4e:
            r2 = r1
        L4f:
            r5 = r2
        L50:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.temporal.h.n(j$.time.f):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int p(j$.time.f fVar) {
        int o11 = fVar.o();
        int n11 = fVar.n();
        if (n11 <= 3) {
            return n11 - fVar.m().ordinal() < -2 ? o11 - 1 : o11;
        } else if (n11 >= 363) {
            return ((n11 - 363) - (fVar.p() ? 1 : 0)) - fVar.m().ordinal() >= 0 ? o11 + 1 : o11;
        } else {
            return o11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static x q(j$.time.f fVar) {
        j$.time.f q11 = j$.time.f.q(p(fVar), 1, 1);
        return x.i(1L, (q11.m() == j$.time.d.THURSDAY || (q11.m() == j$.time.d.WEDNESDAY && q11.p())) ? 53 : 52);
    }

    public x c(k kVar) {
        return g();
    }

    @Override // j$.time.temporal.l
    public boolean e() {
        return true;
    }

    @Override // j$.time.temporal.l
    public boolean i() {
        return false;
    }
}