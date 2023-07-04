package net.time4j.history;

/* loaded from: classes5.dex */
public abstract class n {
    private static final /* synthetic */ n[] $VALUES;
    public static final n BEGIN_OF_JANUARY;
    public static final n BEGIN_OF_MARCH;
    public static final n BEGIN_OF_SEPTEMBER;
    public static final n CALCULUS_PISANUS;
    public static final n CHRISTMAS_STYLE;
    private static final int COUNCIL_OF_TOURS = 567;
    public static final n EASTER_STYLE;
    public static final n EPIPHANY;
    public static final n GOOD_FRIDAY;
    public static final n MARIA_ANUNCIATA;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public enum a extends n {
        a(String str, int i11) {
            super(str, i11, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // net.time4j.history.n
        public int displayedYear(o oVar, net.time4j.history.h hVar) {
            return hVar.d();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // net.time4j.history.n
        public net.time4j.history.h newYear(j jVar, int i11) {
            return net.time4j.history.h.f(jVar, i11, 1, 1);
        }
    }

    static {
        a aVar = new a("BEGIN_OF_JANUARY", 0);
        BEGIN_OF_JANUARY = aVar;
        n nVar = new n("BEGIN_OF_MARCH", 1) { // from class: net.time4j.history.n.b
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // net.time4j.history.n
            public net.time4j.history.h newYear(j jVar, int i11) {
                return net.time4j.history.h.f(jVar, i11, 3, 1);
            }
        };
        BEGIN_OF_MARCH = nVar;
        n nVar2 = new n("BEGIN_OF_SEPTEMBER", 2) { // from class: net.time4j.history.n.c
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // net.time4j.history.n
            public int displayedYear(o oVar, net.time4j.history.h hVar) {
                j c11 = hVar.c();
                int d11 = hVar.d();
                int i11 = d11 + 1;
                return hVar.compareTo(oVar.d(c11, i11)) >= 0 ? i11 : d11;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // net.time4j.history.n
            public net.time4j.history.h newYear(j jVar, int i11) {
                return net.time4j.history.h.f(jVar, i11 - 1, 9, 1);
            }
        };
        BEGIN_OF_SEPTEMBER = nVar2;
        n nVar3 = new n("CHRISTMAS_STYLE", 3) { // from class: net.time4j.history.n.d
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // net.time4j.history.n
            public int displayedYear(o oVar, net.time4j.history.h hVar) {
                int d11 = hVar.d();
                int i11 = d11 + 1;
                return hVar.compareTo(oVar.d(hVar.c(), i11)) >= 0 ? i11 : d11;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // net.time4j.history.n
            public net.time4j.history.h newYear(j jVar, int i11) {
                return net.time4j.history.h.f(jVar, i11 - 1, 12, 25);
            }
        };
        CHRISTMAS_STYLE = nVar3;
        n nVar4 = new n("EASTER_STYLE", 4) { // from class: net.time4j.history.n.e
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // net.time4j.history.n
            public net.time4j.history.h newYear(j jVar, int i11) {
                int i12;
                int marchDay = net.time4j.history.e.EASTERN.marchDay(jVar.annoDomini(i11)) - 1;
                if (marchDay > 31) {
                    i12 = 4;
                    marchDay -= 31;
                } else {
                    i12 = 3;
                }
                return net.time4j.history.h.f(jVar, i11, i12, marchDay);
            }
        };
        EASTER_STYLE = nVar4;
        n nVar5 = new n("GOOD_FRIDAY", 5) { // from class: net.time4j.history.n.f
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // net.time4j.history.n
            public net.time4j.history.h newYear(j jVar, int i11) {
                int i12;
                int marchDay = net.time4j.history.e.EASTERN.marchDay(jVar.annoDomini(i11)) - 2;
                if (marchDay > 31) {
                    i12 = 4;
                    marchDay -= 31;
                } else {
                    i12 = 3;
                }
                return net.time4j.history.h.f(jVar, i11, i12, marchDay);
            }
        };
        GOOD_FRIDAY = nVar5;
        n nVar6 = new n("MARIA_ANUNCIATA", 6) { // from class: net.time4j.history.n.g
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // net.time4j.history.n
            public net.time4j.history.h newYear(j jVar, int i11) {
                return net.time4j.history.h.f(jVar, i11, 3, 25);
            }
        };
        MARIA_ANUNCIATA = nVar6;
        n nVar7 = new n("CALCULUS_PISANUS", 7) { // from class: net.time4j.history.n.h
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // net.time4j.history.n
            public int displayedYear(o oVar, net.time4j.history.h hVar) {
                int d11 = hVar.d() - 1;
                return hVar.compareTo(newYear(hVar.c(), d11)) < 0 ? d11 - 1 : d11;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // net.time4j.history.n
            public net.time4j.history.h newYear(j jVar, int i11) {
                return n.MARIA_ANUNCIATA.newYear(jVar, i11 + 1);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // net.time4j.history.n
            public int standardYear(boolean z11, o oVar, j jVar, int i11, int i12, int i13) {
                return n.MARIA_ANUNCIATA.standardYear(z11, oVar, jVar, i11 + 1, i12, i13);
            }
        };
        CALCULUS_PISANUS = nVar7;
        n nVar8 = new n("EPIPHANY", 8) { // from class: net.time4j.history.n.i
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // net.time4j.history.n
            public net.time4j.history.h newYear(j jVar, int i11) {
                return net.time4j.history.h.f(jVar, i11, 1, 6);
            }
        };
        EPIPHANY = nVar8;
        $VALUES = new n[]{aVar, nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8};
    }

    private n(String str, int i11) {
        super(str, i11);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    public int displayedYear(o oVar, net.time4j.history.h hVar) {
        int d11 = hVar.d();
        return hVar.compareTo(newYear(hVar.c(), d11)) < 0 ? d11 - 1 : d11;
    }

    public abstract net.time4j.history.h newYear(j jVar, int i11);

    /* JADX WARN: Code restructure failed: missing block: B:45:0x002a, code lost:
        if (r7.compareTo(r6) >= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x002d, code lost:
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0042, code lost:
        if (r2.compareTo(r6) >= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0045, code lost:
        if (r9 > r8) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0047, code lost:
        if (r5 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0061, code lost:
        throw new java.lang.IllegalArgumentException("Invalid date due to changing new year rule (year too short to cover month and day-of-month): " + r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int standardYear(boolean r5, net.time4j.history.o r6, net.time4j.history.j r7, int r8, int r9, int r10) {
        /*
            r4 = this;
            r0 = 5
            if (r9 < r0) goto L8
            r0 = 8
            if (r9 > r0) goto L8
            return r8
        L8:
            net.time4j.history.h r0 = r4.newYear(r7, r8)
            int r1 = r8 + 1
            net.time4j.history.h r6 = r6.d(r7, r1)
            net.time4j.history.h r2 = net.time4j.history.h.f(r7, r8, r9, r10)
            r3 = 4
            if (r9 > r3) goto L2f
            net.time4j.history.h r7 = net.time4j.history.h.f(r7, r1, r9, r10)
            int r9 = r2.compareTo(r0)
            if (r9 < 0) goto L25
            r9 = r8
            goto L26
        L25:
            r9 = r1
        L26:
            int r6 = r7.compareTo(r6)
            if (r6 < 0) goto L2d
            goto L45
        L2d:
            r8 = r1
            goto L45
        L2f:
            int r1 = r8 + (-1)
            net.time4j.history.h r7 = net.time4j.history.h.f(r7, r1, r9, r10)
            int r7 = r7.compareTo(r0)
            if (r7 < 0) goto L3d
            r9 = r1
            goto L3e
        L3d:
            r9 = r8
        L3e:
            int r6 = r2.compareTo(r6)
            if (r6 < 0) goto L45
            goto L2d
        L45:
            if (r9 > r8) goto L4b
            if (r5 == 0) goto L4a
            r8 = r9
        L4a:
            return r8
        L4b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Invalid date due to changing new year rule (year too short to cover month and day-of-month): "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.history.n.standardYear(boolean, net.time4j.history.o, net.time4j.history.j, int, int, int):int");
    }

    public o until(int i11) {
        if (i11 > COUNCIL_OF_TOURS) {
            o oVar = new o(this, i11);
            n nVar = BEGIN_OF_JANUARY;
            return this != nVar ? new o(nVar, COUNCIL_OF_TOURS).b(oVar) : oVar;
        }
        throw new IllegalArgumentException("Defining New-Year-strategy is not supported before Council of Tours in AD 567.");
    }

    /* synthetic */ n(String str, int i11, a aVar) {
        this(str, i11);
    }
}