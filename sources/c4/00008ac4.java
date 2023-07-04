package net.time4j.calendar;

import ch.qos.logback.core.CoreConstants;
import java.util.Locale;
import net.time4j.calendar.f;
import net.time4j.engine.b0;
import net.time4j.engine.k0;
import net.time4j.engine.y;

/* loaded from: classes5.dex */
public abstract class f<U, D extends f<U, D>> extends net.time4j.engine.m<U, D> {

    /* renamed from: a  reason: collision with root package name */
    private final transient int f40883a;

    /* renamed from: b  reason: collision with root package name */
    private final transient int f40884b;

    /* renamed from: c  reason: collision with root package name */
    private final transient h f40885c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f40886d;

    /* renamed from: e  reason: collision with root package name */
    private final transient long f40887e;

    /* renamed from: f  reason: collision with root package name */
    private final transient int f40888f;

    /* loaded from: classes5.dex */
    private static class b<D extends f<?, D>> implements y<D, net.time4j.calendar.c> {

        /* renamed from: a  reason: collision with root package name */
        private final net.time4j.engine.p<?> f40889a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f40890b;

        @Override // net.time4j.engine.y
        /* renamed from: c */
        public net.time4j.engine.p<?> getChildAtCeiling(D d11) {
            return this.f40889a;
        }

        @Override // net.time4j.engine.y
        /* renamed from: d */
        public net.time4j.engine.p<?> getChildAtFloor(D d11) {
            return this.f40889a;
        }

        @Override // net.time4j.engine.y
        /* renamed from: e */
        public net.time4j.calendar.c getMaximum(D d11) {
            return net.time4j.calendar.c.q(d11.U() == 94 ? 56 : 60);
        }

        @Override // net.time4j.engine.y
        /* renamed from: f */
        public net.time4j.calendar.c getMinimum(D d11) {
            return this.f40890b ? d11.U() == 75 ? net.time4j.calendar.c.q(10) : net.time4j.calendar.c.q(1) : d11.U() == 72 ? net.time4j.calendar.c.q(22) : net.time4j.calendar.c.q(1);
        }

        @Override // net.time4j.engine.y
        /* renamed from: g */
        public net.time4j.calendar.c getValue(D d11) {
            return d11.e0();
        }

        @Override // net.time4j.engine.y
        /* renamed from: h */
        public boolean isValid(D d11, net.time4j.calendar.c cVar) {
            return cVar != null && getMinimum(d11).compareTo(cVar) <= 0 && getMaximum(d11).compareTo(cVar) >= 0;
        }

        /* JADX WARN: Type inference failed for: r8v7, types: [D extends net.time4j.calendar.f<?, D>, net.time4j.calendar.f] */
        /* JADX WARN: Type inference failed for: r8v8, types: [D extends net.time4j.calendar.f<?, D>, net.time4j.calendar.f] */
        @Override // net.time4j.engine.y
        /* renamed from: i */
        public D withValue(D d11, net.time4j.calendar.c cVar, boolean z11) {
            if (isValid(d11, cVar)) {
                net.time4j.calendar.d<D> T = d11.T();
                int n11 = d11.n();
                h a02 = d11.a0();
                int number = cVar.getNumber();
                int U = d11.U();
                h d12 = (!a02.c() || a02.getNumber() == T.f(U, number)) ? a02 : h.d(a02.getNumber());
                if (n11 <= 29) {
                    return T.d(U, number, d12, n11, T.s(U, number, d12, n11));
                }
                long s11 = T.s(U, number, d12, 1);
                int min = Math.min(n11, T.b(s11).h0());
                return T.d(U, number, d12, min, (s11 + min) - 1);
            }
            throw new IllegalArgumentException("Invalid cyclic year: " + cVar);
        }

        private b(net.time4j.engine.p<?> pVar, boolean z11) {
            this.f40889a = pVar;
            this.f40890b = z11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class c<D extends f<?, D>> implements k0<D> {

        /* renamed from: a  reason: collision with root package name */
        private final int f40891a;

        c(int i11) {
            this.f40891a = i11;
        }

        private static <D extends f<?, D>> long e(D d11, D d12, int i11) {
            int compareTo;
            D d13;
            D d14;
            net.time4j.calendar.d<D> T = d11.T();
            if (i11 != 0) {
                if (i11 == 1) {
                    int U = (((d12.U() * 60) + d12.e0().getNumber()) - (d11.U() * 60)) - d11.e0().getNumber();
                    if (U > 0) {
                        int compareTo2 = d11.a0().compareTo(d12.a0());
                        if (compareTo2 > 0 || (compareTo2 == 0 && d11.n() > d12.n())) {
                            U--;
                        }
                    } else if (U < 0 && ((compareTo = d11.a0().compareTo(d12.a0())) < 0 || (compareTo == 0 && d11.n() < d12.n()))) {
                        U++;
                    }
                    return U;
                } else if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            return d12.b() - d11.b();
                        }
                        throw new UnsupportedOperationException();
                    }
                    return (d12.b() - d11.b()) / 7;
                } else {
                    boolean M = d11.M(d12);
                    if (M) {
                        d14 = d11;
                        d13 = d12;
                    } else {
                        d13 = d11;
                        d14 = d12;
                    }
                    int U2 = d13.U();
                    int number = d13.e0().getNumber();
                    h a02 = d13.a0();
                    int number2 = a02.getNumber();
                    boolean c11 = a02.c();
                    int f11 = T.f(U2, number);
                    int i12 = 0;
                    while (true) {
                        if (U2 == d14.U() && number == d14.e0().getNumber() && a02.equals(d14.a0())) {
                            break;
                        }
                        if (c11) {
                            number2++;
                            c11 = false;
                        } else if (f11 == number2) {
                            c11 = true;
                        } else {
                            number2++;
                        }
                        if (!c11) {
                            if (number2 == 13) {
                                number++;
                                if (number == 61) {
                                    U2++;
                                    number = 1;
                                }
                                number2 = 1;
                                f11 = T.f(U2, number);
                            } else if (number2 == 0) {
                                number--;
                                if (number == 0) {
                                    U2--;
                                    number = 60;
                                }
                                f11 = T.f(U2, number);
                                number2 = 12;
                            }
                        }
                        a02 = h.d(number2);
                        if (c11) {
                            a02 = a02.e();
                        }
                        i12++;
                    }
                    if (i12 > 0 && d13.n() > d14.n()) {
                        i12--;
                    }
                    if (M) {
                        i12 = -i12;
                    }
                    return i12;
                }
            }
            return e(d11, d12, 1) / 60;
        }

        private static void f(long j11) {
            if (j11 > 1200 || j11 < -1200) {
                throw new ArithmeticException("Month arithmetic limited to delta not greater than 1200.");
            }
        }

        private static <D extends f<?, D>> D g(int i11, int i12, h hVar, int i13, net.time4j.calendar.d<D> dVar) {
            if (i13 <= 29) {
                return dVar.d(i11, i12, hVar, i13, dVar.s(i11, i12, hVar, i13));
            }
            long s11 = dVar.s(i11, i12, hVar, 1);
            int min = Math.min(i13, dVar.b(s11).h0());
            return dVar.d(i11, i12, hVar, min, (s11 + min) - 1);
        }

        /* JADX WARN: Type inference failed for: r0v16, types: [D extends net.time4j.calendar.f<?, D>, net.time4j.calendar.f] */
        @Override // net.time4j.engine.k0
        /* renamed from: c */
        public D b(D d11, long j11) {
            long j12 = j11;
            net.time4j.calendar.d<D> T = d11.T();
            int n11 = d11.n();
            int U = d11.U();
            int number = d11.e0().getNumber();
            h a02 = d11.a0();
            int i11 = this.f40891a;
            if (i11 == 0) {
                j12 = net.time4j.base.c.i(j12, 60L);
            } else if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        j12 = net.time4j.base.c.i(j12, 7L);
                    } else if (i11 != 4) {
                        throw new UnsupportedOperationException();
                    }
                    return T.b(net.time4j.base.c.f(d11.b(), j12));
                }
                f(j11);
                int i12 = j12 > 0 ? 1 : -1;
                int number2 = a02.getNumber();
                boolean c11 = a02.c();
                int f11 = T.f(U, number);
                for (long j13 = 0; j12 != j13; j13 = 0) {
                    if (c11) {
                        c11 = false;
                        if (i12 == 1) {
                            number2++;
                        }
                    } else {
                        if (i12 != 1 || f11 != number2) {
                            if (i12 == -1 && f11 == number2 - 1) {
                                number2--;
                            } else {
                                number2 += i12;
                            }
                        }
                        c11 = true;
                    }
                    if (!c11) {
                        if (number2 == 13) {
                            number++;
                            if (number == 61) {
                                U++;
                                number = 1;
                            }
                            number2 = 1;
                            f11 = T.f(U, number);
                        } else if (number2 == 0) {
                            number--;
                            if (number == 0) {
                                U--;
                                number = 60;
                            }
                            number2 = 12;
                            f11 = T.f(U, number);
                        }
                    }
                    j12 -= i12;
                }
                h d12 = h.d(number2);
                if (c11) {
                    d12 = d12.e();
                }
                return (D) g(U, number, d12, n11, T);
            }
            long f12 = net.time4j.base.c.f(((U * 60) + number) - 1, j12);
            int g11 = net.time4j.base.c.g(net.time4j.base.c.b(f12, 60));
            int d13 = net.time4j.base.c.d(f12, 60) + 1;
            if (a02.c() && T.f(g11, d13) != a02.getNumber()) {
                a02 = h.d(a02.getNumber());
            }
            return (D) g(g11, d13, a02, n11, T);
        }

        @Override // net.time4j.engine.k0
        /* renamed from: d */
        public long a(D d11, D d12) {
            return e(d11, d12, this.f40891a);
        }
    }

    /* loaded from: classes5.dex */
    private static class d<D extends f<?, D>> implements b0<D> {

        /* renamed from: a  reason: collision with root package name */
        private final net.time4j.engine.p<?> f40892a;

        /* renamed from: b  reason: collision with root package name */
        private final int f40893b;

        @Override // net.time4j.engine.y
        /* renamed from: c */
        public net.time4j.engine.p<?> getChildAtCeiling(D d11) {
            return this.f40892a;
        }

        @Override // net.time4j.engine.y
        /* renamed from: d */
        public net.time4j.engine.p<?> getChildAtFloor(D d11) {
            return this.f40892a;
        }

        @Override // net.time4j.engine.b0
        /* renamed from: e */
        public int b(D d11) {
            int i11 = this.f40893b;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        int number = d11.a0().getNumber();
                        int Z = d11.Z();
                        return ((Z <= 0 || Z >= number) && !d11.a0().c()) ? number : number + 1;
                    } else if (i11 == 3) {
                        return d11.U();
                    } else {
                        throw new UnsupportedOperationException("Unknown element index: " + this.f40893b);
                    }
                }
                return d11.X();
            }
            return d11.n();
        }

        @Override // net.time4j.engine.y
        /* renamed from: f */
        public Integer getMaximum(D d11) {
            int h02;
            int i11 = this.f40893b;
            if (i11 == 0) {
                h02 = d11.h0();
            } else if (i11 == 1) {
                h02 = d11.i0();
            } else if (i11 == 2) {
                h02 = d11.g0() ? 13 : 12;
            } else if (i11 == 3) {
                net.time4j.calendar.d<D> T = d11.T();
                h02 = ((f) T.b(T.a())).U();
            } else {
                throw new UnsupportedOperationException("Unknown element index: " + this.f40893b);
            }
            return Integer.valueOf(h02);
        }

        @Override // net.time4j.engine.y
        /* renamed from: g */
        public Integer getMinimum(D d11) {
            if (this.f40893b == 3) {
                net.time4j.calendar.d<D> T = d11.T();
                return Integer.valueOf(((f) T.b(T.c())).U());
            }
            return 1;
        }

        @Override // net.time4j.engine.y
        /* renamed from: h */
        public Integer getValue(D d11) {
            return Integer.valueOf(b(d11));
        }

        public boolean i(D d11, int i11) {
            if (i11 < 1) {
                return false;
            }
            int i12 = this.f40893b;
            if (i12 == 0) {
                if (i11 > 30) {
                    return false;
                }
                return i11 != 30 || d11.h0() == 30;
            } else if (i12 == 1) {
                return i11 <= d11.i0();
            } else if (i12 == 2) {
                return i11 <= 12 || (i11 == 13 && d11.Z() > 0);
            } else if (i12 == 3) {
                net.time4j.calendar.d<D> T = d11.T();
                return i11 >= ((f) T.b(T.c())).U() && i11 <= ((f) T.b(T.a())).U();
            } else {
                throw new UnsupportedOperationException("Unknown element index: " + this.f40893b);
            }
        }

        @Override // net.time4j.engine.y
        /* renamed from: j */
        public boolean isValid(D d11, Integer num) {
            return num != null && i(d11, num.intValue());
        }

        /* JADX WARN: Type inference failed for: r12v2, types: [D extends net.time4j.calendar.f<?, D>, net.time4j.calendar.f] */
        /* JADX WARN: Type inference failed for: r12v4, types: [D extends net.time4j.calendar.f<?, D>, net.time4j.calendar.f] */
        /* JADX WARN: Type inference failed for: r12v6, types: [D extends net.time4j.calendar.f<?, D>, net.time4j.calendar.f] */
        @Override // net.time4j.engine.b0
        /* renamed from: k */
        public D a(D d11, int i11, boolean z11) {
            int i12 = this.f40893b;
            if (i12 == 0) {
                if (z11) {
                    return d11.T().b((d11.b() + i11) - d11.n());
                } else if (i11 >= 1 && i11 <= 30 && (i11 != 30 || d11.h0() >= 30)) {
                    return d11.T().d(d11.U(), d11.e0().getNumber(), d11.a0(), i11, (d11.b() + i11) - d11.n());
                } else {
                    throw new IllegalArgumentException("Day of month out of range: " + i11);
                }
            } else if (i12 == 1) {
                if (!z11 && (i11 < 1 || i11 > d11.i0())) {
                    throw new IllegalArgumentException("Day of year out of range: " + i11);
                }
                return d11.T().b((d11.b() + i11) - d11.X());
            } else {
                boolean z12 = false;
                if (i12 != 2) {
                    if (i12 == 3) {
                        if (i(d11, i11)) {
                            return (D) f.d0(0).b(d11, i11 - d11.U());
                        }
                        throw new IllegalArgumentException("Sexagesimal cycle out of range: " + i11);
                    }
                    throw new UnsupportedOperationException("Unknown element index: " + this.f40893b);
                } else if (i(d11, i11)) {
                    int Z = d11.Z();
                    if (Z > 0 && Z < i11) {
                        boolean z13 = i11 == Z + 1;
                        i11--;
                        z12 = z13;
                    }
                    h d12 = h.d(i11);
                    if (z12) {
                        d12 = d12.e();
                    }
                    return (D) e.i(d11, d12);
                } else {
                    throw new IllegalArgumentException("Ordinal month out of range: " + i11);
                }
            }
        }

        @Override // net.time4j.engine.y
        /* renamed from: l */
        public D withValue(D d11, Integer num, boolean z11) {
            if (num != null) {
                return a(d11, num.intValue(), z11);
            }
            throw new IllegalArgumentException("Missing element value.");
        }

        private d(int i11, net.time4j.engine.p<?> pVar) {
            this.f40893b = i11;
            this.f40892a = pVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class e<D extends f<?, D>> implements y<D, h> {

        /* renamed from: a  reason: collision with root package name */
        private final net.time4j.engine.p<?> f40894a;

        /* JADX WARN: Type inference failed for: r9v1, types: [D extends net.time4j.calendar.f<?, D>, net.time4j.calendar.f] */
        /* JADX WARN: Type inference failed for: r9v2, types: [D extends net.time4j.calendar.f<?, D>, net.time4j.calendar.f] */
        static <D extends f<?, D>> D i(D d11, h hVar) {
            net.time4j.calendar.d<D> T = d11.T();
            int n11 = d11.n();
            int number = d11.e0().getNumber();
            if (n11 <= 29) {
                return T.d(d11.U(), number, hVar, n11, T.s(d11.U(), number, hVar, n11));
            }
            long s11 = T.s(d11.U(), number, hVar, 1);
            int min = Math.min(n11, T.b(s11).h0());
            return T.d(d11.U(), number, hVar, min, (s11 + min) - 1);
        }

        @Override // net.time4j.engine.y
        /* renamed from: c */
        public net.time4j.engine.p<?> getChildAtCeiling(D d11) {
            return this.f40894a;
        }

        @Override // net.time4j.engine.y
        /* renamed from: d */
        public net.time4j.engine.p<?> getChildAtFloor(D d11) {
            return this.f40894a;
        }

        @Override // net.time4j.engine.y
        /* renamed from: e */
        public h getMaximum(D d11) {
            return h.d(12);
        }

        @Override // net.time4j.engine.y
        /* renamed from: f */
        public h getMinimum(D d11) {
            return h.d(1);
        }

        @Override // net.time4j.engine.y
        /* renamed from: g */
        public h getValue(D d11) {
            return d11.a0();
        }

        @Override // net.time4j.engine.y
        /* renamed from: h */
        public boolean isValid(D d11, h hVar) {
            return hVar != null && (!hVar.c() || hVar.getNumber() == d11.Z());
        }

        @Override // net.time4j.engine.y
        /* renamed from: j */
        public D withValue(D d11, h hVar, boolean z11) {
            if (isValid(d11, hVar)) {
                return (D) i(d11, hVar);
            }
            throw new IllegalArgumentException("Invalid month: " + hVar);
        }

        private e(net.time4j.engine.p<?> pVar) {
            this.f40894a = pVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(int i11, int i12, h hVar, int i13, long j11) {
        this.f40883a = i11;
        this.f40884b = i12;
        this.f40885c = hVar;
        this.f40886d = i13;
        this.f40887e = j11;
        this.f40888f = T().f(i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <D extends f<?, D>> y<D, Integer> V(net.time4j.engine.p<?> pVar) {
        return new d(3, pVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <D extends f<?, D>> y<D, Integer> W() {
        return new d(0, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <D extends f<?, D>> y<D, Integer> Y() {
        return new d(1, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <D extends f<?, D>> y<D, Integer> b0(net.time4j.engine.p<?> pVar) {
        return new d(2, pVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <D extends f<?, D>> y<D, h> c0(net.time4j.engine.p<?> pVar) {
        return new e(pVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <D extends f<?, D>> k0<D> d0(int i11) {
        return new c(i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <D extends f<?, D>> y<D, net.time4j.calendar.c> f0(net.time4j.engine.p<?> pVar) {
        return new b(pVar, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract net.time4j.calendar.d<D> T();

    /* JADX INFO: Access modifiers changed from: package-private */
    public int U() {
        return this.f40883a;
    }

    public int X() {
        return (int) ((this.f40887e - T().p(this.f40883a, this.f40884b)) + 1);
    }

    int Z() {
        return this.f40888f;
    }

    public h a0() {
        return this.f40885c;
    }

    @Override // net.time4j.engine.m, net.time4j.engine.g
    public long b() {
        return this.f40887e;
    }

    public net.time4j.calendar.c e0() {
        return net.time4j.calendar.c.q(this.f40884b);
    }

    @Override // net.time4j.engine.m
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            f fVar = (f) obj;
            return this.f40883a == fVar.f40883a && this.f40884b == fVar.f40884b && this.f40886d == fVar.f40886d && this.f40885c.equals(fVar.f40885c) && this.f40887e == fVar.f40887e;
        }
        return false;
    }

    public boolean g0() {
        return this.f40888f > 0;
    }

    public int h0() {
        return (int) (((this.f40886d + T().o(this.f40887e + 1)) - this.f40887e) - 1);
    }

    @Override // net.time4j.engine.m
    public int hashCode() {
        long j11 = this.f40887e;
        return (int) (j11 ^ (j11 >>> 32));
    }

    public int i0() {
        int i11 = this.f40883a;
        int i12 = 1;
        int i13 = this.f40884b + 1;
        if (i13 > 60) {
            i11++;
        } else {
            i12 = i13;
        }
        return (int) (T().p(i11, i12) - T().p(this.f40883a, this.f40884b));
    }

    public int n() {
        return this.f40886d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String value = ((net.time4j.format.c) getClass().getAnnotation(net.time4j.format.c.class)).value();
        if (value.equals("dangi")) {
            value = "korean";
        }
        sb2.append(value);
        sb2.append('[');
        sb2.append(e0().g(Locale.ROOT));
        sb2.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        sb2.append(h(net.time4j.calendar.b.f40868a));
        sb2.append(")-");
        sb2.append(this.f40885c.toString());
        sb2.append(CoreConstants.DASH_CHAR);
        if (this.f40886d < 10) {
            sb2.append('0');
        }
        sb2.append(this.f40886d);
        sb2.append(']');
        return sb2.toString();
    }
}