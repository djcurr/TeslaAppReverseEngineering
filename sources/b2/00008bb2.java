package net.time4j;

import ch.qos.logback.core.CoreConstants;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.engine.f0;
import net.time4j.l;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.math.ec.Tnaf;

@net.time4j.format.c("iso8601")
/* loaded from: classes5.dex */
public final class h0 extends net.time4j.engine.i0<w, h0> implements net.time4j.base.g, net.time4j.format.h {
    public static final k0<Integer, h0> A;
    public static final k0<Integer, h0> B;
    public static final k0<Integer, h0> C;
    public static final k0<Integer, h0> E;
    public static final k0<Integer, h0> F;
    public static final k0<Integer, h0> G;
    public static final k0<Integer, h0> H;
    public static final k0<Integer, h0> K;
    public static final k0<Long, h0> L;
    public static final k0<Long, h0> O;
    public static final c1<BigDecimal> P;
    public static final c1<BigDecimal> Q;
    public static final c1<BigDecimal> R;
    public static final net.time4j.engine.p<net.time4j.h> T;
    private static final Map<String, Object> Y;

    /* renamed from: b1  reason: collision with root package name */
    private static final net.time4j.engine.y<h0, BigDecimal> f41315b1;

    /* renamed from: e  reason: collision with root package name */
    static final char f41316e;

    /* renamed from: f  reason: collision with root package name */
    private static final BigDecimal f41317f;

    /* renamed from: g  reason: collision with root package name */
    private static final BigDecimal f41318g;

    /* renamed from: g1  reason: collision with root package name */
    private static final net.time4j.engine.y<h0, BigDecimal> f41319g1;

    /* renamed from: h  reason: collision with root package name */
    private static final BigDecimal f41320h;

    /* renamed from: i  reason: collision with root package name */
    private static final BigDecimal f41321i;

    /* renamed from: j  reason: collision with root package name */
    private static final BigDecimal f41322j;

    /* renamed from: k  reason: collision with root package name */
    private static final BigDecimal f41323k;

    /* renamed from: l  reason: collision with root package name */
    private static final h0[] f41324l;

    /* renamed from: m  reason: collision with root package name */
    static final h0 f41325m;

    /* renamed from: n  reason: collision with root package name */
    static final h0 f41326n;

    /* renamed from: o  reason: collision with root package name */
    static final net.time4j.engine.p<h0> f41327o;

    /* renamed from: p  reason: collision with root package name */
    public static final u0 f41328p;

    /* renamed from: p1  reason: collision with root package name */
    private static final net.time4j.engine.y<h0, BigDecimal> f41329p1;

    /* renamed from: q  reason: collision with root package name */
    public static final c1<a0> f41330q;
    private static final long serialVersionUID = 2780881537313863339L;

    /* renamed from: t  reason: collision with root package name */
    public static final net.time4j.c<Integer, h0> f41331t;

    /* renamed from: w  reason: collision with root package name */
    public static final net.time4j.c<Integer, h0> f41332w;

    /* renamed from: x  reason: collision with root package name */
    public static final k0<Integer, h0> f41333x;

    /* renamed from: x1  reason: collision with root package name */
    private static final net.time4j.engine.f0<w, h0> f41334x1;

    /* renamed from: y  reason: collision with root package name */
    public static final k0<Integer, h0> f41335y;

    /* renamed from: z  reason: collision with root package name */
    public static final k0<Integer, h0> f41336z;

    /* renamed from: a  reason: collision with root package name */
    private final transient byte f41337a;

    /* renamed from: b  reason: collision with root package name */
    private final transient byte f41338b;

    /* renamed from: c  reason: collision with root package name */
    private final transient byte f41339c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f41340d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f41341a;

        static {
            int[] iArr = new int[net.time4j.h.values().length];
            f41341a = iArr;
            try {
                iArr[net.time4j.h.HOURS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41341a[net.time4j.h.MINUTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41341a[net.time4j.h.SECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41341a[net.time4j.h.MILLIS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41341a[net.time4j.h.MICROS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41341a[net.time4j.h.NANOS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes5.dex */
    private static class b implements net.time4j.engine.y<h0, BigDecimal> {

        /* renamed from: a  reason: collision with root package name */
        private final net.time4j.engine.p<BigDecimal> f41342a;

        /* renamed from: b  reason: collision with root package name */
        private final BigDecimal f41343b;

        b(net.time4j.engine.p<BigDecimal> pVar, BigDecimal bigDecimal) {
            this.f41342a = pVar;
            this.f41343b = bigDecimal;
        }

        private static BigDecimal c(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.divide(bigDecimal2, 16, RoundingMode.FLOOR);
        }

        private static int j(BigDecimal bigDecimal) {
            return Math.min(999999999, bigDecimal.movePointRight(9).setScale(0, RoundingMode.HALF_UP).intValue());
        }

        @Override // net.time4j.engine.y
        /* renamed from: d */
        public net.time4j.engine.p<?> getChildAtCeiling(h0 h0Var) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* renamed from: e */
        public net.time4j.engine.p<?> getChildAtFloor(h0 h0Var) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* renamed from: f */
        public BigDecimal getMaximum(h0 h0Var) {
            net.time4j.engine.p<BigDecimal> pVar;
            if (h0Var.f41337a == 24 && ((pVar = this.f41342a) == h0.Q || pVar == h0.R)) {
                return BigDecimal.ZERO;
            }
            return this.f41343b;
        }

        @Override // net.time4j.engine.y
        /* renamed from: g */
        public BigDecimal getMinimum(h0 h0Var) {
            return BigDecimal.ZERO;
        }

        @Override // net.time4j.engine.y
        /* renamed from: h */
        public BigDecimal getValue(h0 h0Var) {
            BigDecimal add;
            net.time4j.engine.p<BigDecimal> pVar = this.f41342a;
            if (pVar == h0.P) {
                if (!h0Var.equals(h0.f41325m)) {
                    if (h0Var.f41337a == 24) {
                        return h0.f41321i;
                    }
                    add = BigDecimal.valueOf(h0Var.f41337a).add(c(BigDecimal.valueOf(h0Var.f41338b), h0.f41317f)).add(c(BigDecimal.valueOf(h0Var.f41339c), h0.f41318g)).add(c(BigDecimal.valueOf(h0Var.f41340d), h0.f41318g.multiply(h0.f41320h)));
                } else {
                    return BigDecimal.ZERO;
                }
            } else if (pVar == h0.Q) {
                if (h0Var.A0()) {
                    return BigDecimal.ZERO;
                }
                add = BigDecimal.valueOf(h0Var.f41338b).add(c(BigDecimal.valueOf(h0Var.f41339c), h0.f41317f)).add(c(BigDecimal.valueOf(h0Var.f41340d), h0.f41317f.multiply(h0.f41320h)));
            } else if (pVar == h0.R) {
                if (!h0Var.B0()) {
                    add = BigDecimal.valueOf(h0Var.f41339c).add(c(BigDecimal.valueOf(h0Var.f41340d), h0.f41320h));
                } else {
                    return BigDecimal.ZERO;
                }
            } else {
                throw new UnsupportedOperationException(this.f41342a.name());
            }
            return add.setScale(15, RoundingMode.FLOOR).stripTrailingZeros();
        }

        @Override // net.time4j.engine.y
        /* renamed from: i */
        public boolean isValid(h0 h0Var, BigDecimal bigDecimal) {
            net.time4j.engine.p<BigDecimal> pVar;
            if (bigDecimal == null) {
                return false;
            }
            return (h0Var.f41337a == 24 && ((pVar = this.f41342a) == h0.Q || pVar == h0.R)) ? BigDecimal.ZERO.compareTo(bigDecimal) == 0 : BigDecimal.ZERO.compareTo(bigDecimal) <= 0 && this.f41343b.compareTo(bigDecimal) >= 0;
        }

        @Override // net.time4j.engine.y
        /* renamed from: k */
        public h0 withValue(h0 h0Var, BigDecimal bigDecimal, boolean z11) {
            int i11;
            int i12;
            long j11;
            int i13;
            int i14;
            int i15;
            if (bigDecimal != null) {
                net.time4j.engine.p<BigDecimal> pVar = this.f41342a;
                if (pVar == h0.P) {
                    BigDecimal scale = bigDecimal.setScale(0, RoundingMode.FLOOR);
                    BigDecimal multiply = bigDecimal.subtract(scale).multiply(h0.f41317f);
                    BigDecimal scale2 = multiply.setScale(0, RoundingMode.FLOOR);
                    BigDecimal multiply2 = multiply.subtract(scale2).multiply(h0.f41317f);
                    BigDecimal scale3 = multiply2.setScale(0, RoundingMode.FLOOR);
                    j11 = scale.longValueExact();
                    i11 = scale2.intValue();
                    i13 = scale3.intValue();
                    i14 = j(multiply2.subtract(scale3));
                } else if (pVar == h0.Q) {
                    BigDecimal scale4 = bigDecimal.setScale(0, RoundingMode.FLOOR);
                    BigDecimal multiply3 = bigDecimal.subtract(scale4).multiply(h0.f41317f);
                    BigDecimal scale5 = multiply3.setScale(0, RoundingMode.FLOOR);
                    int intValue = scale5.intValue();
                    int j12 = j(multiply3.subtract(scale5));
                    long longValueExact = scale4.longValueExact();
                    long j13 = h0Var.f41337a;
                    if (!z11) {
                        h0.i0(longValueExact);
                        i11 = (int) longValueExact;
                    } else {
                        j13 += net.time4j.base.c.b(longValueExact, 60);
                        i11 = net.time4j.base.c.d(longValueExact, 60);
                    }
                    i14 = j12;
                    i13 = intValue;
                    j11 = j13;
                } else if (pVar == h0.R) {
                    BigDecimal scale6 = bigDecimal.setScale(0, RoundingMode.FLOOR);
                    int j14 = j(bigDecimal.subtract(scale6));
                    long longValueExact2 = scale6.longValueExact();
                    long j15 = h0Var.f41337a;
                    i11 = h0Var.f41338b;
                    if (!z11) {
                        h0.k0(longValueExact2);
                        i12 = (int) longValueExact2;
                    } else {
                        i12 = net.time4j.base.c.d(longValueExact2, 60);
                        long b11 = i11 + net.time4j.base.c.b(longValueExact2, 60);
                        j15 += net.time4j.base.c.b(b11, 60);
                        i11 = net.time4j.base.c.d(b11, 60);
                    }
                    j11 = j15;
                    i13 = i12;
                    i14 = j14;
                } else {
                    throw new UnsupportedOperationException(this.f41342a.name());
                }
                if (z11) {
                    i15 = net.time4j.base.c.d(j11, 24);
                    if (j11 > 0 && (i15 | i11 | i13 | i14) == 0) {
                        return h0.f41326n;
                    }
                } else if (j11 < 0 || j11 > 24) {
                    throw new IllegalArgumentException("Value out of range: " + bigDecimal);
                } else {
                    i15 = (int) j11;
                }
                return h0.N0(i15, i11, i13, i14);
            }
            throw new IllegalArgumentException("Missing element value.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class c implements net.time4j.engine.k0<h0> {

        /* renamed from: a  reason: collision with root package name */
        private final net.time4j.h f41344a;

        /* synthetic */ c(net.time4j.h hVar, a aVar) {
            this(hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static k e(h0 h0Var, long j11, net.time4j.h hVar) {
            if (j11 == 0 && h0Var.f41337a < 24) {
                return new k(0L, h0Var);
            }
            return (k) g(k.class, hVar, h0Var, j11);
        }

        private static <R> R g(Class<R> cls, net.time4j.h hVar, h0 h0Var, long j11) {
            long f11;
            h0 N0;
            int i11 = h0Var.f41338b;
            int i12 = h0Var.f41339c;
            int i13 = h0Var.f41340d;
            switch (a.f41341a[hVar.ordinal()]) {
                case 1:
                    f11 = net.time4j.base.c.f(h0Var.f41337a, j11);
                    break;
                case 2:
                    long f12 = net.time4j.base.c.f(h0Var.f41338b, j11);
                    f11 = net.time4j.base.c.f(h0Var.f41337a, net.time4j.base.c.b(f12, 60));
                    i11 = net.time4j.base.c.d(f12, 60);
                    break;
                case 3:
                    long f13 = net.time4j.base.c.f(h0Var.f41339c, j11);
                    long f14 = net.time4j.base.c.f(h0Var.f41338b, net.time4j.base.c.b(f13, 60));
                    f11 = net.time4j.base.c.f(h0Var.f41337a, net.time4j.base.c.b(f14, 60));
                    int d11 = net.time4j.base.c.d(f14, 60);
                    i12 = net.time4j.base.c.d(f13, 60);
                    i11 = d11;
                    break;
                case 4:
                    return (R) g(cls, net.time4j.h.NANOS, h0Var, net.time4j.base.c.i(j11, 1000000L));
                case 5:
                    return (R) g(cls, net.time4j.h.NANOS, h0Var, net.time4j.base.c.i(j11, 1000L));
                case 6:
                    long f15 = net.time4j.base.c.f(h0Var.f41340d, j11);
                    long f16 = net.time4j.base.c.f(h0Var.f41339c, net.time4j.base.c.b(f15, Http2Connection.DEGRADED_PONG_TIMEOUT_NS));
                    long f17 = net.time4j.base.c.f(h0Var.f41338b, net.time4j.base.c.b(f16, 60));
                    f11 = net.time4j.base.c.f(h0Var.f41337a, net.time4j.base.c.b(f17, 60));
                    int d12 = net.time4j.base.c.d(f17, 60);
                    int d13 = net.time4j.base.c.d(f16, 60);
                    int d14 = net.time4j.base.c.d(f15, Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
                    i11 = d12;
                    i12 = d13;
                    i13 = d14;
                    break;
                default:
                    throw new UnsupportedOperationException(hVar.name());
            }
            int d15 = net.time4j.base.c.d(f11, 24);
            if ((d15 | i11 | i12 | i13) == 0) {
                N0 = (j11 <= 0 || cls != h0.class) ? h0.f41325m : h0.f41326n;
            } else {
                N0 = h0.N0(d15, i11, i12, i13);
            }
            if (cls == h0.class) {
                return cls.cast(N0);
            }
            return cls.cast(new k(net.time4j.base.c.b(f11, 24), N0));
        }

        @Override // net.time4j.engine.k0
        /* renamed from: d */
        public h0 b(h0 h0Var, long j11) {
            return j11 == 0 ? h0Var : (h0) g(h0.class, this.f41344a, h0Var, j11);
        }

        @Override // net.time4j.engine.k0
        /* renamed from: f */
        public long a(h0 h0Var, h0 h0Var2) {
            long j11;
            long w02 = h0Var2.w0() - h0Var.w0();
            switch (a.f41341a[this.f41344a.ordinal()]) {
                case 1:
                    j11 = 3600000000000L;
                    break;
                case 2:
                    j11 = 60000000000L;
                    break;
                case 3:
                    j11 = 1000000000;
                    break;
                case 4:
                    j11 = 1000000;
                    break;
                case 5:
                    j11 = 1000;
                    break;
                case 6:
                    j11 = 1;
                    break;
                default:
                    throw new UnsupportedOperationException(this.f41344a.name());
            }
            return w02 / j11;
        }

        private c(net.time4j.h hVar) {
            this.f41344a = hVar;
        }
    }

    /* loaded from: classes5.dex */
    private static class d implements net.time4j.engine.y<h0, Integer> {

        /* renamed from: a  reason: collision with root package name */
        private final net.time4j.engine.p<Integer> f41345a;

        /* renamed from: b  reason: collision with root package name */
        private final int f41346b;

        /* renamed from: c  reason: collision with root package name */
        private final int f41347c;

        /* renamed from: d  reason: collision with root package name */
        private final int f41348d;

        d(net.time4j.engine.p<Integer> pVar, int i11, int i12) {
            this.f41345a = pVar;
            if (pVar instanceof u) {
                this.f41346b = ((u) pVar).t();
            } else {
                this.f41346b = -1;
            }
            this.f41347c = i11;
            this.f41348d = i12;
        }

        private net.time4j.engine.p<?> c(h0 h0Var) {
            switch (this.f41346b) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    return h0.A;
                case 6:
                case 7:
                    return h0.C;
                case 8:
                case 9:
                    return h0.H;
                default:
                    return null;
            }
        }

        private static boolean i(h0 h0Var) {
            return h0Var.f41337a < 12 || h0Var.f41337a == 24;
        }

        private h0 l(h0 h0Var, int i11) {
            net.time4j.engine.p<Integer> pVar = this.f41345a;
            if (pVar != h0.f41336z && pVar != h0.f41335y && pVar != h0.f41333x) {
                if (pVar == h0.A) {
                    return h0Var.G(net.time4j.base.c.l(i11, h0Var.f41338b), net.time4j.h.MINUTES);
                }
                if (pVar == h0.C) {
                    return h0Var.G(net.time4j.base.c.l(i11, h0Var.f41339c), net.time4j.h.SECONDS);
                }
                k0<Integer, h0> k0Var = h0.F;
                if (pVar == k0Var) {
                    return h0Var.G(net.time4j.base.c.l(i11, ((Integer) h0Var.l(k0Var)).intValue()), net.time4j.h.MILLIS);
                }
                k0<Integer, h0> k0Var2 = h0.G;
                if (pVar == k0Var2) {
                    return h0Var.G(net.time4j.base.c.l(i11, ((Integer) h0Var.l(k0Var2)).intValue()), net.time4j.h.MICROS);
                }
                if (pVar == h0.H) {
                    return h0Var.G(net.time4j.base.c.l(i11, h0Var.f41340d), net.time4j.h.NANOS);
                }
                if (pVar == h0.K) {
                    int c11 = net.time4j.base.c.c(i11, 86400000);
                    int i12 = h0Var.f41340d % 1000000;
                    if (c11 == 0 && i12 == 0) {
                        return i11 > 0 ? h0.f41326n : h0.f41325m;
                    }
                    return h0.o0(c11, i12);
                } else if (pVar == h0.B) {
                    int c12 = net.time4j.base.c.c(i11, 1440);
                    if (c12 == 0 && h0Var.B0()) {
                        return i11 > 0 ? h0.f41326n : h0.f41325m;
                    }
                    return withValue(h0Var, Integer.valueOf(c12), false);
                } else if (pVar == h0.E) {
                    int c13 = net.time4j.base.c.c(i11, 86400);
                    if (c13 == 0 && h0Var.f41340d == 0) {
                        return i11 > 0 ? h0.f41326n : h0.f41325m;
                    }
                    return withValue(h0Var, Integer.valueOf(c13), false);
                } else {
                    throw new UnsupportedOperationException(this.f41345a.name());
                }
            }
            return h0Var.G(net.time4j.base.c.l(i11, ((Integer) h0Var.l(pVar)).intValue()), net.time4j.h.HOURS);
        }

        @Override // net.time4j.engine.y
        /* renamed from: d */
        public net.time4j.engine.p<?> getChildAtCeiling(h0 h0Var) {
            return c(h0Var);
        }

        @Override // net.time4j.engine.y
        /* renamed from: e */
        public net.time4j.engine.p<?> getChildAtFloor(h0 h0Var) {
            return c(h0Var);
        }

        @Override // net.time4j.engine.y
        /* renamed from: f */
        public Integer getMaximum(h0 h0Var) {
            if (h0Var.f41337a == 24) {
                switch (this.f41346b) {
                    case 6:
                    case 8:
                    case 10:
                    case 11:
                    case 12:
                        return 0;
                }
            }
            if (h0Var.x0(this.f41345a)) {
                return Integer.valueOf(this.f41348d - 1);
            }
            return Integer.valueOf(this.f41348d);
        }

        @Override // net.time4j.engine.y
        /* renamed from: g */
        public Integer getMinimum(h0 h0Var) {
            return Integer.valueOf(this.f41347c);
        }

        @Override // net.time4j.engine.y
        /* renamed from: h */
        public Integer getValue(h0 h0Var) {
            int i11;
            byte b11;
            int i12 = 24;
            switch (this.f41346b) {
                case 1:
                    i12 = h0Var.f41337a % 12;
                    if (i12 == 0) {
                        i12 = 12;
                        break;
                    }
                    break;
                case 2:
                    int i13 = h0Var.f41337a % 24;
                    if (i13 != 0) {
                        i12 = i13;
                        break;
                    }
                    break;
                case 3:
                    i12 = h0Var.f41337a % 12;
                    break;
                case 4:
                    i12 = h0Var.f41337a % 24;
                    break;
                case 5:
                    i12 = h0Var.f41337a;
                    break;
                case 6:
                    i12 = h0Var.f41338b;
                    break;
                case 7:
                    i11 = h0Var.f41337a * 60;
                    b11 = h0Var.f41338b;
                    i12 = i11 + b11;
                    break;
                case 8:
                    i12 = h0Var.f41339c;
                    break;
                case 9:
                    i11 = (h0Var.f41337a * Tnaf.POW_2_WIDTH) + (h0Var.f41338b * 60);
                    b11 = h0Var.f41339c;
                    i12 = i11 + b11;
                    break;
                case 10:
                    i12 = h0Var.f41340d / 1000000;
                    break;
                case 11:
                    i12 = h0Var.f41340d / 1000;
                    break;
                case 12:
                    i12 = h0Var.f41340d;
                    break;
                case 13:
                    i12 = (int) (h0Var.w0() / 1000000);
                    break;
                default:
                    throw new UnsupportedOperationException(this.f41345a.name());
            }
            return Integer.valueOf(i12);
        }

        @Override // net.time4j.engine.y
        /* renamed from: j */
        public boolean isValid(h0 h0Var, Integer num) {
            int intValue;
            int i11;
            if (num != null && (intValue = num.intValue()) >= this.f41347c && intValue <= (i11 = this.f41348d)) {
                if (intValue == i11) {
                    int i12 = this.f41346b;
                    if (i12 == 5) {
                        return h0Var.A0();
                    }
                    if (i12 == 7) {
                        return h0Var.B0();
                    }
                    if (i12 == 9) {
                        return h0Var.f41340d == 0;
                    } else if (i12 == 13) {
                        return h0Var.f41340d % 1000000 == 0;
                    }
                }
                if (h0Var.f41337a == 24) {
                    switch (this.f41346b) {
                        case 6:
                        case 8:
                        case 10:
                        case 11:
                        case 12:
                            return intValue == 0;
                    }
                }
                return true;
            }
            return false;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
            if (i(r7) != false) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
            r8 = r8 + 12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
            if (i(r7) != false) goto L24;
         */
        @Override // net.time4j.engine.y
        /* renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public net.time4j.h0 withValue(net.time4j.h0 r7, java.lang.Integer r8, boolean r9) {
            /*
                r6 = this;
                if (r8 == 0) goto La6
                if (r9 == 0) goto Ld
                int r8 = r8.intValue()
                net.time4j.h0 r7 = r6.l(r7, r8)
                return r7
            Ld:
                boolean r9 = r6.isValid(r7, r8)
                if (r9 == 0) goto L8f
                byte r9 = net.time4j.h0.c0(r7)
                byte r0 = net.time4j.h0.d0(r7)
                byte r1 = net.time4j.h0.e0(r7)
                int r2 = net.time4j.h0.I(r7)
                int r8 = r8.intValue()
                int r3 = r6.f41346b
                r4 = 0
                r5 = 1000000(0xf4240, float:1.401298E-39)
                switch(r3) {
                    case 1: goto L7e;
                    case 2: goto L78;
                    case 3: goto L6e;
                    case 4: goto L6c;
                    case 5: goto L6c;
                    case 6: goto L6a;
                    case 7: goto L65;
                    case 8: goto L63;
                    case 9: goto L5a;
                    case 10: goto L51;
                    case 11: goto L48;
                    case 12: goto L46;
                    case 13: goto L3c;
                    default: goto L30;
                }
            L30:
                java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
                net.time4j.engine.p<java.lang.Integer> r8 = r6.f41345a
                java.lang.String r8 = r8.name()
                r7.<init>(r8)
                throw r7
            L3c:
                int r7 = net.time4j.h0.I(r7)
                int r7 = r7 % r5
                net.time4j.h0 r7 = net.time4j.h0.J(r8, r7)
                return r7
            L46:
                r2 = r8
                goto L8a
            L48:
                int r8 = r8 * 1000
                int r7 = net.time4j.h0.I(r7)
                int r7 = r7 % 1000
                goto L57
            L51:
                int r8 = r8 * r5
                int r7 = net.time4j.h0.I(r7)
                int r7 = r7 % r5
            L57:
                int r2 = r8 + r7
                goto L8a
            L5a:
                int r9 = r8 / 3600
                int r8 = r8 % 3600
                int r0 = r8 / 60
                int r1 = r8 % 60
                goto L8a
            L63:
                r1 = r8
                goto L8a
            L65:
                int r9 = r8 / 60
                int r0 = r8 % 60
                goto L8a
            L6a:
                r0 = r8
                goto L8a
            L6c:
                r9 = r8
                goto L8a
            L6e:
                boolean r7 = i(r7)
                if (r7 == 0) goto L75
                goto L6c
            L75:
                int r8 = r8 + 12
                goto L6c
            L78:
                r7 = 24
                if (r8 != r7) goto L6c
                r9 = r4
                goto L8a
            L7e:
                r9 = 12
                if (r8 != r9) goto L83
                r8 = r4
            L83:
                boolean r7 = i(r7)
                if (r7 == 0) goto L75
                goto L6c
            L8a:
                net.time4j.h0 r7 = net.time4j.h0.N0(r9, r0, r1, r2)
                return r7
            L8f:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r0 = "Value out of range: "
                r9.append(r0)
                r9.append(r8)
                java.lang.String r8 = r9.toString()
                r7.<init>(r8)
                throw r7
            La6:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r8 = "Missing element value."
                r7.<init>(r8)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: net.time4j.h0.d.withValue(net.time4j.h0, java.lang.Integer, boolean):net.time4j.h0");
        }
    }

    /* loaded from: classes5.dex */
    private static class e implements net.time4j.engine.y<h0, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final net.time4j.engine.p<Long> f41349a;

        /* renamed from: b  reason: collision with root package name */
        private final long f41350b;

        /* renamed from: c  reason: collision with root package name */
        private final long f41351c;

        e(net.time4j.engine.p<Long> pVar, long j11, long j12) {
            this.f41349a = pVar;
            this.f41350b = j11;
            this.f41351c = j12;
        }

        private h0 j(h0 h0Var, long j11) {
            if (this.f41349a == h0.L) {
                long s02 = h0.s0(j11, 86400000000L);
                int i11 = h0Var.f41340d % 1000;
                if (s02 != 0 || i11 != 0 || j11 <= 0) {
                    return h0.m0(s02, i11);
                }
                return h0.f41326n;
            }
            long s03 = h0.s0(j11, 86400000000000L);
            if (s03 != 0 || j11 <= 0) {
                return h0.p0(s03);
            }
            return h0.f41326n;
        }

        @Override // net.time4j.engine.y
        /* renamed from: c */
        public net.time4j.engine.p<?> getChildAtCeiling(h0 h0Var) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* renamed from: d */
        public net.time4j.engine.p<?> getChildAtFloor(h0 h0Var) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* renamed from: e */
        public Long getMaximum(h0 h0Var) {
            if (this.f41349a == h0.L && h0Var.f41340d % 1000 != 0) {
                return Long.valueOf(this.f41351c - 1);
            }
            return Long.valueOf(this.f41351c);
        }

        @Override // net.time4j.engine.y
        /* renamed from: f */
        public Long getMinimum(h0 h0Var) {
            return Long.valueOf(this.f41350b);
        }

        @Override // net.time4j.engine.y
        /* renamed from: g */
        public Long getValue(h0 h0Var) {
            return Long.valueOf(this.f41349a == h0.L ? h0Var.w0() / 1000 : h0Var.w0());
        }

        @Override // net.time4j.engine.y
        /* renamed from: h */
        public boolean isValid(h0 h0Var, Long l11) {
            if (l11 == null) {
                return false;
            }
            return (this.f41349a == h0.L && l11.longValue() == this.f41351c) ? h0Var.f41340d % 1000 == 0 : this.f41350b <= l11.longValue() && l11.longValue() <= this.f41351c;
        }

        @Override // net.time4j.engine.y
        /* renamed from: i */
        public h0 withValue(h0 h0Var, Long l11, boolean z11) {
            if (l11 != null) {
                if (z11) {
                    return j(h0Var, l11.longValue());
                }
                if (isValid(h0Var, l11)) {
                    long longValue = l11.longValue();
                    return this.f41349a == h0.L ? h0.m0(longValue, h0Var.f41340d % 1000) : h0.p0(longValue);
                }
                throw new IllegalArgumentException("Value out of range: " + l11);
            }
            throw new IllegalArgumentException("Missing element value.");
        }
    }

    /* loaded from: classes5.dex */
    private static class f implements net.time4j.engine.t<h0> {
        private f() {
        }

        private static void e(net.time4j.engine.q<?> qVar, String str) {
            net.time4j.engine.l0 l0Var = net.time4j.engine.l0.ERROR_MESSAGE;
            if (qVar.w(l0Var, str)) {
                qVar.z(l0Var, str);
            }
        }

        private static int j(net.time4j.engine.q<?> qVar) {
            int h11 = qVar.h(h0.f41335y);
            if (h11 != Integer.MIN_VALUE) {
                return h11;
            }
            int h12 = qVar.h(h0.f41332w);
            if (h12 == 0) {
                return -1;
            }
            if (h12 == 24) {
                return 0;
            }
            if (h12 != Integer.MIN_VALUE) {
                return h12;
            }
            c1<a0> c1Var = h0.f41330q;
            if (qVar.q(c1Var)) {
                a0 a0Var = (a0) qVar.l(c1Var);
                int h13 = qVar.h(h0.f41331t);
                if (h13 != Integer.MIN_VALUE) {
                    if (h13 == 0) {
                        return a0Var == a0.AM ? -1 : -2;
                    }
                    int i11 = h13 != 12 ? h13 : 0;
                    return a0Var == a0.AM ? i11 : i11 + 12;
                }
                int h14 = qVar.h(h0.f41333x);
                if (h14 != Integer.MIN_VALUE) {
                    return a0Var == a0.AM ? h14 : h14 + 12;
                }
            }
            return Integer.MIN_VALUE;
        }

        private static h0 k(net.time4j.engine.q<?> qVar) {
            int intValue;
            int intValue2;
            k0<Long, h0> k0Var = h0.O;
            if (qVar.q(k0Var)) {
                long longValue = ((Long) qVar.l(k0Var)).longValue();
                if (longValue >= 0 && longValue <= 86400000000000L) {
                    return h0.p0(longValue);
                }
                e(qVar, "NANO_OF_DAY out of range: " + longValue);
                return null;
            }
            k0<Long, h0> k0Var2 = h0.L;
            if (qVar.q(k0Var2)) {
                k0<Integer, h0> k0Var3 = h0.H;
                return h0.m0(((Long) qVar.l(k0Var2)).longValue(), qVar.q(k0Var3) ? ((Integer) qVar.l(k0Var3)).intValue() % 1000 : 0);
            }
            k0<Integer, h0> k0Var4 = h0.K;
            if (qVar.q(k0Var4)) {
                k0<Integer, h0> k0Var5 = h0.H;
                if (qVar.q(k0Var5)) {
                    int intValue3 = ((Integer) qVar.l(k0Var5)).intValue();
                    if (intValue3 >= 0 && intValue3 < 1000000000) {
                        r3 = intValue3 % 1000000;
                    } else {
                        e(qVar, "NANO_OF_SECOND out of range: " + intValue3);
                        return null;
                    }
                } else {
                    k0<Integer, h0> k0Var6 = h0.G;
                    if (qVar.q(k0Var6)) {
                        int intValue4 = ((Integer) qVar.l(k0Var6)).intValue();
                        if (intValue4 >= 0 && intValue4 < 1000000) {
                            r3 = intValue4 % 1000;
                        } else {
                            e(qVar, "MICRO_OF_SECOND out of range: " + intValue4);
                            return null;
                        }
                    }
                }
                int intValue5 = ((Integer) qVar.l(k0Var4)).intValue();
                if (intValue5 >= 0 && intValue5 <= 86400000) {
                    return h0.o0(intValue5, r3);
                }
                e(qVar, "MILLI_OF_DAY out of range: " + intValue5);
                return null;
            }
            k0<Integer, h0> k0Var7 = h0.E;
            if (qVar.q(k0Var7)) {
                k0<Integer, h0> k0Var8 = h0.H;
                if (qVar.q(k0Var8)) {
                    intValue2 = ((Integer) qVar.l(k0Var8)).intValue();
                } else {
                    k0<Integer, h0> k0Var9 = h0.G;
                    if (qVar.q(k0Var9)) {
                        intValue2 = ((Integer) qVar.l(k0Var9)).intValue() * 1000;
                    } else {
                        k0<Integer, h0> k0Var10 = h0.F;
                        intValue2 = qVar.q(k0Var10) ? ((Integer) qVar.l(k0Var10)).intValue() * 1000000 : 0;
                    }
                }
                return (h0) h0.N0(0, 0, 0, intValue2).z(k0Var7, qVar.l(k0Var7));
            }
            k0<Integer, h0> k0Var11 = h0.B;
            if (qVar.q(k0Var11)) {
                k0<Integer, h0> k0Var12 = h0.H;
                if (qVar.q(k0Var12)) {
                    intValue = ((Integer) qVar.l(k0Var12)).intValue();
                } else {
                    k0<Integer, h0> k0Var13 = h0.G;
                    if (qVar.q(k0Var13)) {
                        intValue = ((Integer) qVar.l(k0Var13)).intValue() * 1000;
                    } else {
                        k0<Integer, h0> k0Var14 = h0.F;
                        intValue = qVar.q(k0Var14) ? ((Integer) qVar.l(k0Var14)).intValue() * 1000000 : 0;
                    }
                }
                k0<Integer, h0> k0Var15 = h0.C;
                return (h0) h0.N0(0, 0, qVar.q(k0Var15) ? ((Integer) qVar.l(k0Var15)).intValue() : 0, intValue).z(k0Var11, qVar.l(k0Var11));
            }
            return null;
        }

        @Override // net.time4j.engine.t
        public net.time4j.engine.d0 a() {
            return net.time4j.engine.d0.f40947a;
        }

        @Override // net.time4j.engine.t
        public net.time4j.engine.w<?> b() {
            return null;
        }

        @Override // net.time4j.engine.t
        /* renamed from: d */
        public h0 c(net.time4j.engine.q<?> qVar, net.time4j.engine.d dVar, boolean z11, boolean z12) {
            if (qVar instanceof net.time4j.base.f) {
                return i0.P().c(qVar, dVar, z11, z12).V();
            }
            net.time4j.engine.p<?> pVar = h0.f41327o;
            if (qVar.q(pVar)) {
                return (h0) qVar.l(pVar);
            }
            c1<BigDecimal> c1Var = h0.P;
            if (qVar.q(c1Var)) {
                return h0.R0((BigDecimal) qVar.l(c1Var));
            }
            int h11 = qVar.h(h0.f41336z);
            if (h11 == Integer.MIN_VALUE) {
                h11 = j(qVar);
                if (h11 == Integer.MIN_VALUE) {
                    return k(qVar);
                }
                if (h11 == -1 || h11 == -2) {
                    if (!z11) {
                        e(qVar, "Clock hour cannot be zero.");
                        return null;
                    }
                    h11 = h11 == -1 ? 0 : 12;
                } else if (h11 == 24 && !z11) {
                    e(qVar, "Time 24:00 not allowed, use lax mode or element HOUR_FROM_0_TO_24 instead.");
                    return null;
                }
            }
            c1<BigDecimal> c1Var2 = h0.Q;
            if (qVar.q(c1Var2)) {
                return (h0) h0.f41319g1.withValue(h0.K0(h11), qVar.l(c1Var2), false);
            }
            int h12 = qVar.h(h0.A);
            if (h12 == Integer.MIN_VALUE) {
                h12 = 0;
            }
            c1<BigDecimal> c1Var3 = h0.R;
            if (qVar.q(c1Var3)) {
                return (h0) h0.f41329p1.withValue(h0.L0(h11, h12), qVar.l(c1Var3), false);
            }
            int h13 = qVar.h(h0.C);
            if (h13 == Integer.MIN_VALUE) {
                h13 = 0;
            }
            int h14 = qVar.h(h0.H);
            if (h14 == Integer.MIN_VALUE) {
                int h15 = qVar.h(h0.G);
                if (h15 == Integer.MIN_VALUE) {
                    int h16 = qVar.h(h0.F);
                    h14 = h16 == Integer.MIN_VALUE ? 0 : net.time4j.base.c.h(h16, 1000000);
                } else {
                    h14 = net.time4j.base.c.h(h15, 1000);
                }
            }
            if (z11) {
                long f11 = net.time4j.base.c.f(net.time4j.base.c.i(net.time4j.base.c.f(net.time4j.base.c.f(net.time4j.base.c.i(h11, 3600L), net.time4j.base.c.i(h12, 60L)), h13), 1000000000L), h14);
                long s02 = h0.s0(f11, 86400000000000L);
                long r02 = h0.r0(f11, 86400000000000L);
                int i11 = (r02 > 0L ? 1 : (r02 == 0L ? 0 : -1));
                if (i11 != 0) {
                    net.time4j.engine.p<Long> pVar2 = y.f41606d;
                    if (qVar.v(pVar2, r02)) {
                        qVar.y(pVar2, r02);
                    }
                }
                if (s02 != 0 || i11 <= 0) {
                    return h0.p0(s02);
                }
                return h0.f41326n;
            } else if ((h11 >= 0 && h12 >= 0 && h13 >= 0 && h14 >= 0 && h11 == 24 && (h12 | h13 | h14) == 0) || (h11 < 24 && h12 <= 59 && h13 <= 59 && h14 <= 1000000000)) {
                return h0.O0(h11, h12, h13, h14, false);
            } else {
                e(qVar, "Time component out of range.");
                return null;
            }
        }

        @Override // net.time4j.engine.t
        public int f() {
            return g0.r0().f();
        }

        @Override // net.time4j.engine.t
        /* renamed from: h */
        public net.time4j.engine.o g(h0 h0Var, net.time4j.engine.d dVar) {
            return h0Var;
        }

        @Override // net.time4j.engine.t
        public String i(net.time4j.engine.x xVar, Locale locale) {
            return net.time4j.format.b.t(net.time4j.format.e.ofStyle(xVar.getStyleValue()), locale);
        }

        /* synthetic */ f(a aVar) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    private static class g implements net.time4j.engine.y<h0, a0> {
        private g() {
        }

        @Override // net.time4j.engine.y
        /* renamed from: c */
        public net.time4j.engine.p<?> getChildAtCeiling(h0 h0Var) {
            return h0.f41333x;
        }

        @Override // net.time4j.engine.y
        /* renamed from: d */
        public net.time4j.engine.p<?> getChildAtFloor(h0 h0Var) {
            return h0.f41333x;
        }

        @Override // net.time4j.engine.y
        /* renamed from: e */
        public a0 getMaximum(h0 h0Var) {
            return a0.PM;
        }

        @Override // net.time4j.engine.y
        /* renamed from: f */
        public a0 getMinimum(h0 h0Var) {
            return a0.AM;
        }

        @Override // net.time4j.engine.y
        /* renamed from: g */
        public a0 getValue(h0 h0Var) {
            return a0.ofHour(h0Var.f41337a);
        }

        @Override // net.time4j.engine.y
        /* renamed from: h */
        public boolean isValid(h0 h0Var, a0 a0Var) {
            return a0Var != null;
        }

        @Override // net.time4j.engine.y
        /* renamed from: i */
        public h0 withValue(h0 h0Var, a0 a0Var, boolean z11) {
            int i11 = h0Var.f41337a == 24 ? 0 : h0Var.f41337a;
            if (a0Var != null) {
                if (a0Var == a0.AM) {
                    if (i11 >= 12) {
                        i11 -= 12;
                    }
                } else if (a0Var == a0.PM && i11 < 12) {
                    i11 += 12;
                }
                return h0.N0(i11, h0Var.f41338b, h0Var.f41339c, h0Var.f41340d);
            }
            throw new IllegalArgumentException("Missing am/pm-value.");
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    private static class h implements net.time4j.engine.y<h0, net.time4j.h> {
        private h() {
        }

        @Override // net.time4j.engine.y
        /* renamed from: c */
        public net.time4j.engine.p<?> getChildAtCeiling(h0 h0Var) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* renamed from: d */
        public net.time4j.engine.p<?> getChildAtFloor(h0 h0Var) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* renamed from: e */
        public net.time4j.h getMaximum(h0 h0Var) {
            return net.time4j.h.NANOS;
        }

        @Override // net.time4j.engine.y
        /* renamed from: f */
        public net.time4j.h getMinimum(h0 h0Var) {
            return net.time4j.h.HOURS;
        }

        @Override // net.time4j.engine.y
        /* renamed from: g */
        public net.time4j.h getValue(h0 h0Var) {
            if (h0Var.f41340d != 0) {
                if (h0Var.f41340d % 1000000 != 0) {
                    if (h0Var.f41340d % 1000 == 0) {
                        return net.time4j.h.MICROS;
                    }
                    return net.time4j.h.NANOS;
                }
                return net.time4j.h.MILLIS;
            } else if (h0Var.f41339c == 0) {
                if (h0Var.f41338b != 0) {
                    return net.time4j.h.MINUTES;
                }
                return net.time4j.h.HOURS;
            } else {
                return net.time4j.h.SECONDS;
            }
        }

        @Override // net.time4j.engine.y
        /* renamed from: h */
        public boolean isValid(h0 h0Var, net.time4j.h hVar) {
            return hVar != null;
        }

        @Override // net.time4j.engine.y
        /* renamed from: i */
        public h0 withValue(h0 h0Var, net.time4j.h hVar, boolean z11) {
            if (hVar != null) {
                if (hVar.ordinal() >= getValue(h0Var).ordinal()) {
                    return h0Var;
                }
                switch (a.f41341a[hVar.ordinal()]) {
                    case 1:
                        return h0.K0(h0Var.f41337a);
                    case 2:
                        return h0.L0(h0Var.f41337a, h0Var.f41338b);
                    case 3:
                        return h0.M0(h0Var.f41337a, h0Var.f41338b, h0Var.f41339c);
                    case 4:
                        return h0.N0(h0Var.f41337a, h0Var.f41338b, h0Var.f41339c, (h0Var.f41340d / 1000000) * 1000000);
                    case 5:
                        return h0.N0(h0Var.f41337a, h0Var.f41338b, h0Var.f41339c, (h0Var.f41340d / 1000) * 1000);
                    case 6:
                        return h0Var;
                    default:
                        throw new UnsupportedOperationException(hVar.name());
                }
            }
            throw new IllegalArgumentException("Missing precision value.");
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    private static class i implements net.time4j.engine.y<h0, h0> {
        private i() {
        }

        @Override // net.time4j.engine.y
        /* renamed from: c */
        public net.time4j.engine.p<?> getChildAtCeiling(h0 h0Var) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* renamed from: d */
        public net.time4j.engine.p<?> getChildAtFloor(h0 h0Var) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* renamed from: e */
        public h0 getMaximum(h0 h0Var) {
            return h0.f41326n;
        }

        @Override // net.time4j.engine.y
        /* renamed from: f */
        public h0 getMinimum(h0 h0Var) {
            return h0.f41325m;
        }

        @Override // net.time4j.engine.y
        /* renamed from: g */
        public h0 getValue(h0 h0Var) {
            return h0Var;
        }

        @Override // net.time4j.engine.y
        /* renamed from: h */
        public boolean isValid(h0 h0Var, h0 h0Var2) {
            return h0Var2 != null;
        }

        @Override // net.time4j.engine.y
        /* renamed from: i */
        public h0 withValue(h0 h0Var, h0 h0Var2, boolean z11) {
            if (h0Var2 != null) {
                return h0Var2;
            }
            throw new IllegalArgumentException("Missing time value.");
        }

        /* synthetic */ i(a aVar) {
            this();
        }
    }

    static {
        f41316e = Boolean.getBoolean("net.time4j.format.iso.decimal.dot") ? CoreConstants.DOT : CoreConstants.COMMA_CHAR;
        f41317f = new BigDecimal(60);
        f41318g = new BigDecimal(3600);
        f41320h = new BigDecimal((int) Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
        f41321i = new BigDecimal("24");
        f41322j = new BigDecimal("23.999999999999999");
        f41323k = new BigDecimal("59.999999999999999");
        f41324l = new h0[25];
        for (int i11 = 0; i11 <= 24; i11++) {
            f41324l[i11] = new h0(i11, 0, 0, 0, false);
        }
        h0[] h0VarArr = f41324l;
        h0 h0Var = h0VarArr[0];
        f41325m = h0Var;
        h0 h0Var2 = h0VarArr[24];
        f41326n = h0Var2;
        q0 q0Var = q0.f41498a;
        f41327o = q0Var;
        f41328p = q0Var;
        net.time4j.d dVar = net.time4j.d.AM_PM_OF_DAY;
        f41330q = dVar;
        u p11 = u.p("CLOCK_HOUR_OF_AMPM", false);
        f41331t = p11;
        u p12 = u.p("CLOCK_HOUR_OF_DAY", true);
        f41332w = p12;
        u q11 = u.q("DIGITAL_HOUR_OF_AMPM", 3, 0, 11, 'K');
        f41333x = q11;
        u q12 = u.q("DIGITAL_HOUR_OF_DAY", 4, 0, 23, 'H');
        f41335y = q12;
        u q13 = u.q("HOUR_FROM_0_TO_24", 5, 0, 23, 'H');
        f41336z = q13;
        u q14 = u.q("MINUTE_OF_HOUR", 6, 0, 59, 'm');
        A = q14;
        u q15 = u.q("MINUTE_OF_DAY", 7, 0, 1439, f41316e);
        B = q15;
        u q16 = u.q("SECOND_OF_MINUTE", 8, 0, 59, 's');
        C = q16;
        u q17 = u.q("SECOND_OF_DAY", 9, 0, 86399, f41316e);
        E = q17;
        u q18 = u.q("MILLI_OF_SECOND", 10, 0, 999, f41316e);
        F = q18;
        u q19 = u.q("MICRO_OF_SECOND", 11, 0, 999999, f41316e);
        G = q19;
        u q21 = u.q("NANO_OF_SECOND", 12, 0, 999999999, 'S');
        H = q21;
        u q22 = u.q("MILLI_OF_DAY", 13, 0, 86399999, 'A');
        K = q22;
        y p13 = y.p("MICRO_OF_DAY", 0L, 86399999999L);
        L = p13;
        y p14 = y.p("NANO_OF_DAY", 0L, 86399999999999L);
        O = p14;
        m mVar = new m("DECIMAL_HOUR", f41322j);
        P = mVar;
        BigDecimal bigDecimal = f41323k;
        m mVar2 = new m("DECIMAL_MINUTE", bigDecimal);
        Q = mVar2;
        m mVar3 = new m("DECIMAL_SECOND", bigDecimal);
        R = mVar3;
        net.time4j.engine.p<net.time4j.h> pVar = j0.f41459d;
        T = pVar;
        HashMap hashMap = new HashMap();
        q0(hashMap, q0Var);
        q0(hashMap, dVar);
        q0(hashMap, p11);
        q0(hashMap, p12);
        q0(hashMap, q11);
        q0(hashMap, q12);
        q0(hashMap, q13);
        q0(hashMap, q14);
        q0(hashMap, q15);
        q0(hashMap, q16);
        q0(hashMap, q17);
        q0(hashMap, q18);
        q0(hashMap, q19);
        q0(hashMap, q21);
        q0(hashMap, q22);
        q0(hashMap, p13);
        q0(hashMap, p14);
        q0(hashMap, mVar);
        q0(hashMap, mVar2);
        q0(hashMap, mVar3);
        Y = Collections.unmodifiableMap(hashMap);
        b bVar = new b(mVar, f41321i);
        f41315b1 = bVar;
        b bVar2 = new b(mVar2, bigDecimal);
        f41319g1 = bVar2;
        b bVar3 = new b(mVar3, bigDecimal);
        f41329p1 = bVar3;
        f0.b d11 = f0.b.k(w.class, h0.class, new f(null), h0Var, h0Var2).d(q0Var, new i(null)).d(dVar, new g(null));
        d dVar2 = new d(p11, 1, 12);
        net.time4j.h hVar = net.time4j.h.HOURS;
        f0.b e11 = d11.e(p11, dVar2, hVar).e(p12, new d(p12, 1, 24), hVar).e(q11, new d(q11, 0, 11), hVar).e(q12, new d(q12, 0, 23), hVar).e(q13, new d(q13, 0, 24), hVar);
        d dVar3 = new d(q14, 0, 59);
        net.time4j.h hVar2 = net.time4j.h.MINUTES;
        f0.b e12 = e11.e(q14, dVar3, hVar2).e(q15, new d(q15, 0, 1440), hVar2);
        d dVar4 = new d(q16, 0, 59);
        net.time4j.h hVar3 = net.time4j.h.SECONDS;
        f0.b e13 = e12.e(q16, dVar4, hVar3).e(q17, new d(q17, 0, 86400), hVar3);
        d dVar5 = new d(q18, 0, 999);
        net.time4j.h hVar4 = net.time4j.h.MILLIS;
        f0.b e14 = e13.e(q18, dVar5, hVar4);
        d dVar6 = new d(q19, 0, 999999);
        net.time4j.h hVar5 = net.time4j.h.MICROS;
        f0.b e15 = e14.e(q19, dVar6, hVar5);
        d dVar7 = new d(q21, 0, 999999999);
        net.time4j.h hVar6 = net.time4j.h.NANOS;
        f0.b d12 = e15.e(q21, dVar7, hVar6).e(q22, new d(q22, 0, 86400000), hVar4).e(p13, new e(p13, 0L, 86400000000L), hVar5).e(p14, new e(p14, 0L, 86400000000000L), hVar6).d(mVar, bVar).d(mVar2, bVar2).d(mVar3, bVar3).d(pVar, new h(null));
        U0(d12);
        V0(d12);
        f41334x1 = d12.h();
    }

    private h0(int i11, int i12, int i13, int i14, boolean z11) {
        if (z11) {
            h0(i11);
            i0(i12);
            k0(i13);
            j0(i14);
            if (i11 == 24 && (i12 | i13 | i14) != 0) {
                throw new IllegalArgumentException("T24:00:00 exceeded.");
            }
        }
        this.f41337a = (byte) i11;
        this.f41338b = (byte) i12;
        this.f41339c = (byte) i13;
        this.f41340d = i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0() {
        return ((this.f41338b | this.f41339c) | this.f41340d) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean B0() {
        return (this.f41339c | this.f41340d) == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object E0(String str) {
        return Y.get(str);
    }

    public static h0 F0() {
        return f41326n;
    }

    public static h0 H0() {
        return f41325m;
    }

    public static h0 K0(int i11) {
        h0(i11);
        return f41324l[i11];
    }

    public static h0 L0(int i11, int i12) {
        if (i12 == 0) {
            return K0(i11);
        }
        return new h0(i11, i12, 0, 0, true);
    }

    public static h0 M0(int i11, int i12, int i13) {
        if ((i12 | i13) == 0) {
            return K0(i11);
        }
        return new h0(i11, i12, i13, 0, true);
    }

    public static h0 N0(int i11, int i12, int i13, int i14) {
        return O0(i11, i12, i13, i14, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h0 O0(int i11, int i12, int i13, int i14, boolean z11) {
        if ((i12 | i13 | i14) == 0) {
            if (z11) {
                return K0(i11);
            }
            return f41324l[i11];
        }
        return new h0(i11, i12, i13, i14, z11);
    }

    public static h0 R0(BigDecimal bigDecimal) {
        return f41315b1.withValue(null, bigDecimal, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void T0(StringBuilder sb2, int i11) {
        int i12;
        sb2.append(f41316e);
        String num = Integer.toString(i11);
        if (i11 % 1000000 == 0) {
            i12 = 3;
        } else {
            i12 = i11 % 1000 == 0 ? 6 : 9;
        }
        for (int length = num.length(); length < 9; length++) {
            sb2.append('0');
        }
        int length2 = (i12 + num.length()) - 9;
        for (int i13 = 0; i13 < length2; i13++) {
            sb2.append(num.charAt(i13));
        }
    }

    private static void U0(f0.b<w, h0> bVar) {
        for (net.time4j.engine.r rVar : net.time4j.base.d.c().g(net.time4j.engine.r.class)) {
            if (rVar.d(h0.class)) {
                bVar.f(rVar);
            }
        }
        bVar.f(new l.c());
    }

    private static void V0(f0.b<w, h0> bVar) {
        net.time4j.h[] values;
        Set<? extends w> allOf = EnumSet.allOf(net.time4j.h.class);
        for (net.time4j.h hVar : net.time4j.h.values()) {
            bVar.g(hVar, new c(hVar, null), hVar.getLength(), allOf);
        }
    }

    private static void f0(int i11, StringBuilder sb2) {
        if (i11 < 10) {
            sb2.append('0');
        }
        sb2.append(i11);
    }

    public static net.time4j.engine.f0<w, h0> g0() {
        return f41334x1;
    }

    private static void h0(long j11) {
        if (j11 < 0 || j11 > 24) {
            throw new IllegalArgumentException("HOUR_OF_DAY out of range: " + j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i0(long j11) {
        if (j11 < 0 || j11 > 59) {
            throw new IllegalArgumentException("MINUTE_OF_HOUR out of range: " + j11);
        }
    }

    private static void j0(int i11) {
        if (i11 < 0 || i11 >= 1000000000) {
            throw new IllegalArgumentException("NANO_OF_SECOND out of range: " + i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k0(long j11) {
        if (j11 < 0 || j11 > 59) {
            throw new IllegalArgumentException("SECOND_OF_MINUTE out of range: " + j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h0 m0(long j11, int i11) {
        int i12 = (((int) (j11 % 1000000)) * 1000) + i11;
        int i13 = (int) (j11 / 1000000);
        int i14 = i13 % 60;
        int i15 = i13 / 60;
        return N0(i15 / 60, i15 % 60, i14, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h0 o0(int i11, int i12) {
        int i13 = ((i11 % 1000) * 1000000) + i12;
        int i14 = i11 / 1000;
        int i15 = i14 % 60;
        int i16 = i14 / 60;
        return N0(i16 / 60, i16 % 60, i15, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h0 p0(long j11) {
        int i11 = (int) (j11 / 1000000000);
        int i12 = i11 % 60;
        int i13 = i11 / 60;
        int i14 = i13 % 60;
        return N0(i13 / 60, i14, i12, (int) (j11 % 1000000000));
    }

    private static void q0(Map<String, Object> map, net.time4j.engine.p<?> pVar) {
        map.put(pVar.name(), pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long r0(long j11, long j12) {
        if (j11 >= 0) {
            return j11 / j12;
        }
        return ((j11 + 1) / j12) - 1;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long s0(long j11, long j12) {
        return j11 - (j12 * (j11 >= 0 ? j11 / j12 : ((j11 + 1) / j12) - 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long w0() {
        return this.f41340d + (this.f41339c * 1000000000) + (this.f41338b * 60 * 1000000000) + (this.f41337a * 3600 * 1000000000);
    }

    private Object writeReplace() {
        return new SPX(this, 2);
    }

    public boolean C0() {
        return A0() && this.f41337a % 24 == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.i0, net.time4j.engine.q
    /* renamed from: D */
    public net.time4j.engine.f0<w, h0> r() {
        return f41334x1;
    }

    public boolean D0(h0 h0Var) {
        return compareTo(h0Var) == 0;
    }

    public k W0(long j11, net.time4j.h hVar) {
        return c.e(this, j11, hVar);
    }

    @Override // net.time4j.base.g
    public int a() {
        return this.f41340d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            return this.f41337a == h0Var.f41337a && this.f41338b == h0Var.f41338b && this.f41339c == h0Var.f41339c && this.f41340d == h0Var.f41340d;
        }
        return false;
    }

    public int hashCode() {
        return this.f41337a + (this.f41338b * 60) + (this.f41339c * Tnaf.POW_2_WIDTH) + (this.f41340d * 37);
    }

    @Override // net.time4j.base.g
    public int j() {
        return this.f41339c;
    }

    @Override // net.time4j.engine.i0, java.lang.Comparable
    /* renamed from: l0 */
    public int compareTo(h0 h0Var) {
        int i11 = this.f41337a - h0Var.f41337a;
        if (i11 == 0 && (i11 = this.f41338b - h0Var.f41338b) == 0 && (i11 = this.f41339c - h0Var.f41339c) == 0) {
            i11 = this.f41340d - h0Var.f41340d;
        }
        if (i11 < 0) {
            return -1;
        }
        return i11 == 0 ? 0 : 1;
    }

    @Override // net.time4j.base.g
    public int m() {
        return this.f41338b;
    }

    @Override // net.time4j.base.g
    public int p() {
        return this.f41337a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(19);
        sb2.append('T');
        f0(this.f41337a, sb2);
        if ((this.f41338b | this.f41339c | this.f41340d) != 0) {
            sb2.append(CoreConstants.COLON_CHAR);
            f0(this.f41338b, sb2);
            if ((this.f41339c | this.f41340d) != 0) {
                sb2.append(CoreConstants.COLON_CHAR);
                f0(this.f41339c, sb2);
                int i11 = this.f41340d;
                if (i11 != 0) {
                    T0(sb2, i11);
                }
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.q
    /* renamed from: v0 */
    public h0 s() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x0(net.time4j.engine.p<?> pVar) {
        return (pVar == K && this.f41340d % 1000000 != 0) || (pVar == f41336z && !A0()) || ((pVar == B && !B0()) || ((pVar == E && this.f41340d != 0) || (pVar == L && this.f41340d % 1000 != 0)));
    }

    public boolean y0(h0 h0Var) {
        return compareTo(h0Var) > 0;
    }

    public boolean z0(h0 h0Var) {
        return compareTo(h0Var) < 0;
    }
}