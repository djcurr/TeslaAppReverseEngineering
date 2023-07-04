package net.time4j;

import ch.qos.logback.core.CoreConstants;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import net.time4j.engine.ChronoException;
import net.time4j.engine.f0;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.pqc.math.linearalgebra.Matrix;

@net.time4j.format.c("iso8601")
/* loaded from: classes5.dex */
public final class b0 extends net.time4j.engine.i0<TimeUnit, b0> implements m30.g {

    /* renamed from: c  reason: collision with root package name */
    private static final long f40815c;

    /* renamed from: d  reason: collision with root package name */
    private static final long f40816d;

    /* renamed from: e  reason: collision with root package name */
    private static final b0 f40817e;

    /* renamed from: f  reason: collision with root package name */
    private static final b0 f40818f;

    /* renamed from: g  reason: collision with root package name */
    private static final Set<net.time4j.engine.p<?>> f40819g;

    /* renamed from: h  reason: collision with root package name */
    private static final Map<net.time4j.engine.p<?>, Integer> f40820h;

    /* renamed from: i  reason: collision with root package name */
    private static final Map<TimeUnit, Double> f40821i;

    /* renamed from: j  reason: collision with root package name */
    private static final net.time4j.engine.f0<TimeUnit, b0> f40822j;

    /* renamed from: k  reason: collision with root package name */
    public static final b0 f40823k;

    /* renamed from: l  reason: collision with root package name */
    public static final net.time4j.engine.p<TimeUnit> f40824l;
    private static final long serialVersionUID = -3192884724477742274L;

    /* renamed from: a  reason: collision with root package name */
    private final transient long f40825a;

    /* renamed from: b  reason: collision with root package name */
    private final transient int f40826b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f40827a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f40828b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f40829c;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f40829c = iArr;
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40829c[TimeUnit.HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40829c[TimeUnit.MINUTES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40829c[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40829c[TimeUnit.MILLISECONDS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40829c[TimeUnit.MICROSECONDS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f40829c[TimeUnit.NANOSECONDS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[n0.values().length];
            f40828b = iArr2;
            try {
                iArr2[n0.SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f40828b[n0.NANOSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr3 = new int[m30.f.values().length];
            f40827a = iArr3;
            try {
                iArr3[m30.f.POSIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f40827a[m30.f.UTC.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f40827a[m30.f.TAI.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f40827a[m30.f.GPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f40827a[m30.f.TT.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f40827a[m30.f.UT.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* loaded from: classes5.dex */
    private static class b implements net.time4j.engine.g0<b0> {
        private b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(b0 b0Var, b0 b0Var2) {
            return b0Var.compareTo(b0Var2);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public enum c implements net.time4j.engine.p<Integer>, net.time4j.engine.y<b0, Integer> {
        FRACTION;

        @Override // net.time4j.engine.y
        public net.time4j.engine.p<?> getChildAtCeiling(b0 b0Var) {
            return null;
        }

        @Override // net.time4j.engine.y
        public net.time4j.engine.p<?> getChildAtFloor(b0 b0Var) {
            return null;
        }

        public String getDisplayName(Locale locale) {
            return name();
        }

        @Override // net.time4j.engine.p
        public char getSymbol() {
            return (char) 0;
        }

        @Override // net.time4j.engine.p
        public Class<Integer> getType() {
            return Integer.class;
        }

        @Override // net.time4j.engine.p
        public boolean isDateElement() {
            return false;
        }

        @Override // net.time4j.engine.p
        public boolean isLenient() {
            return false;
        }

        @Override // net.time4j.engine.p
        public boolean isTimeElement() {
            return false;
        }

        @Override // java.util.Comparator
        public int compare(net.time4j.engine.o oVar, net.time4j.engine.o oVar2) {
            return ((Integer) oVar.l(this)).compareTo((Integer) oVar2.l(this));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // net.time4j.engine.p
        public Integer getDefaultMaximum() {
            return 999999999;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // net.time4j.engine.p
        public Integer getDefaultMinimum() {
            return 0;
        }

        @Override // net.time4j.engine.y
        public Integer getMaximum(b0 b0Var) {
            return getDefaultMaximum();
        }

        @Override // net.time4j.engine.y
        public Integer getMinimum(b0 b0Var) {
            return getDefaultMinimum();
        }

        @Override // net.time4j.engine.y
        public Integer getValue(b0 b0Var) {
            return Integer.valueOf(b0Var.a());
        }

        @Override // net.time4j.engine.y
        public boolean isValid(b0 b0Var, Integer num) {
            int intValue;
            return num != null && (intValue = num.intValue()) >= 0 && intValue < 1000000000;
        }

        @Override // net.time4j.engine.y
        public b0 withValue(b0 b0Var, Integer num, boolean z11) {
            if (num != null) {
                if (m30.d.p().t()) {
                    m30.f fVar = m30.f.UTC;
                    return b0.k0(b0Var.d(fVar), num.intValue(), fVar);
                }
                return b0.k0(b0Var.g(), num.intValue(), m30.f.POSIX);
            }
            throw new IllegalArgumentException("Missing fraction value.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public enum d implements net.time4j.engine.p<Long>, net.time4j.engine.y<b0, Long> {
        POSIX_TIME;

        public String getDisplayName(Locale locale) {
            return name();
        }

        @Override // net.time4j.engine.p
        public char getSymbol() {
            return (char) 0;
        }

        @Override // net.time4j.engine.p
        public Class<Long> getType() {
            return Long.class;
        }

        @Override // net.time4j.engine.p
        public boolean isDateElement() {
            return false;
        }

        @Override // net.time4j.engine.p
        public boolean isLenient() {
            return false;
        }

        @Override // net.time4j.engine.p
        public boolean isTimeElement() {
            return false;
        }

        @Override // java.util.Comparator
        public int compare(net.time4j.engine.o oVar, net.time4j.engine.o oVar2) {
            return ((Long) oVar.l(this)).compareTo((Long) oVar2.l(this));
        }

        @Override // net.time4j.engine.y
        public net.time4j.engine.p<?> getChildAtCeiling(b0 b0Var) {
            return c.FRACTION;
        }

        @Override // net.time4j.engine.y
        public net.time4j.engine.p<?> getChildAtFloor(b0 b0Var) {
            return c.FRACTION;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // net.time4j.engine.p
        public Long getDefaultMaximum() {
            return Long.valueOf(b0.f40816d);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // net.time4j.engine.p
        public Long getDefaultMinimum() {
            return Long.valueOf(b0.f40815c);
        }

        @Override // net.time4j.engine.y
        public Long getMaximum(b0 b0Var) {
            return Long.valueOf(b0.f40816d);
        }

        @Override // net.time4j.engine.y
        public Long getMinimum(b0 b0Var) {
            return Long.valueOf(b0.f40815c);
        }

        @Override // net.time4j.engine.y
        public Long getValue(b0 b0Var) {
            return Long.valueOf(b0Var.g());
        }

        @Override // net.time4j.engine.y
        public boolean isValid(b0 b0Var, Long l11) {
            if (l11 == null) {
                return false;
            }
            long longValue = l11.longValue();
            return longValue >= b0.f40815c && longValue <= b0.f40816d;
        }

        @Override // net.time4j.engine.y
        public b0 withValue(b0 b0Var, Long l11, boolean z11) {
            if (l11 != null) {
                return b0.k0(l11.longValue(), b0Var.a(), m30.f.POSIX);
            }
            throw new IllegalArgumentException("Missing elapsed seconds.");
        }
    }

    /* loaded from: classes5.dex */
    private static class e implements net.time4j.engine.t<b0> {
        private e() {
        }

        @Override // net.time4j.engine.t
        public net.time4j.engine.d0 a() {
            return net.time4j.engine.d0.f40947a;
        }

        @Override // net.time4j.engine.t
        public net.time4j.engine.w<?> b() {
            return i0.P();
        }

        @Override // net.time4j.engine.t
        /* renamed from: d */
        public b0 c(net.time4j.engine.q<?> qVar, net.time4j.engine.d dVar, boolean z11, boolean z12) {
            i0 c11;
            net.time4j.tz.k kVar;
            b0 b0Var;
            net.time4j.tz.p B;
            b0 b0Var2;
            m30.f fVar = (m30.f) dVar.b(net.time4j.format.a.f41015w, m30.f.UTC);
            if (qVar instanceof net.time4j.base.f) {
                return b0.Y((net.time4j.base.f) net.time4j.base.f.class.cast(qVar)).w0(fVar);
            }
            d dVar2 = d.POSIX_TIME;
            if (qVar.q(dVar2)) {
                long longValue = ((Long) qVar.l(dVar2)).longValue();
                c cVar = c.FRACTION;
                return b0.k0(longValue, qVar.q(cVar) ? ((Integer) qVar.l(cVar)).intValue() : 0, m30.f.POSIX).w0(fVar);
            }
            if (qVar.q(net.time4j.engine.a0.LEAP_SECOND)) {
                r3 = 1;
                qVar.x(h0.C, 60);
            }
            net.time4j.engine.p<?> D = i0.P().D();
            if (qVar.q(D)) {
                c11 = (i0) qVar.l(D);
            } else {
                c11 = i0.P().c(qVar, dVar, z11, z12);
            }
            if (c11 == null) {
                return null;
            }
            if (qVar.c()) {
                kVar = qVar.o();
            } else {
                net.time4j.engine.c<net.time4j.tz.k> cVar2 = net.time4j.format.a.f40996d;
                kVar = dVar.c(cVar2) ? (net.time4j.tz.k) dVar.a(cVar2) : null;
            }
            if (kVar != null) {
                net.time4j.engine.a0 a0Var = net.time4j.engine.a0.DAYLIGHT_SAVING;
                if (qVar.q(a0Var)) {
                    b0Var = c11.W(net.time4j.tz.l.N(kVar).Q(((net.time4j.tz.o) dVar.b(net.time4j.format.a.f40997e, net.time4j.tz.l.f41537c)).a(((Boolean) qVar.l(a0Var)).booleanValue() ? net.time4j.tz.g.EARLIER_OFFSET : net.time4j.tz.g.LATER_OFFSET)));
                } else {
                    net.time4j.engine.c<net.time4j.tz.o> cVar3 = net.time4j.format.a.f40997e;
                    if (dVar.c(cVar3)) {
                        b0Var = c11.W(net.time4j.tz.l.N(kVar).Q((net.time4j.tz.o) dVar.a(cVar3)));
                    } else {
                        b0Var = c11.X(kVar);
                    }
                }
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                return null;
            }
            if (r3 != 0) {
                if (kVar instanceof net.time4j.tz.p) {
                    B = (net.time4j.tz.p) kVar;
                } else {
                    B = net.time4j.tz.l.N(kVar).B(b0Var);
                }
                if (B.i() == 0 && B.h() % 60 == 0) {
                    if (b0Var.a0().getYear() >= 1972) {
                        b0Var2 = b0Var.m0(1L, n0.SECONDS);
                    } else {
                        b0Var2 = new b0(b0Var.a(), b0Var.g() + 1, (a) null);
                    }
                    if (!z11) {
                        if (m30.d.p().t()) {
                            if (!b0Var2.j0()) {
                                throw new IllegalArgumentException("SECOND_OF_MINUTE parsed as invalid leapsecond before " + b0Var2);
                            }
                        }
                    }
                    b0Var = b0Var2;
                } else {
                    throw new IllegalArgumentException("Leap second is only allowed  with timezone-offset in full minutes: " + B);
                }
            }
            return b0Var.w0(fVar);
        }

        @Override // net.time4j.engine.t
        /* renamed from: e */
        public net.time4j.engine.o g(b0 b0Var, net.time4j.engine.d dVar) {
            net.time4j.engine.c<net.time4j.tz.k> cVar = net.time4j.format.a.f40996d;
            if (dVar.c(cVar)) {
                return b0Var.x0((m30.f) dVar.b(net.time4j.format.a.f41015w, m30.f.UTC)).f0((net.time4j.tz.k) dVar.a(cVar));
            }
            throw new IllegalArgumentException("Cannot print moment without timezone.");
        }

        @Override // net.time4j.engine.t
        public int f() {
            return g0.r0().f();
        }

        @Override // net.time4j.engine.t
        public String i(net.time4j.engine.x xVar, Locale locale) {
            net.time4j.format.e ofStyle = net.time4j.format.e.ofStyle(xVar.getStyleValue());
            return net.time4j.format.b.s(ofStyle, ofStyle, locale);
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    private static class f implements net.time4j.engine.u<b0> {
        private f() {
        }

        @Override // net.time4j.engine.u
        /* renamed from: a */
        public b0 apply(b0 b0Var) {
            m30.b q11;
            m30.d p11 = m30.d.p();
            if (!p11.t() || (q11 = p11.q(b0Var.d(m30.f.UTC))) == null) {
                return null;
            }
            return g0.y0(q11.getDate()).q0(23, 59, 59).O().m0(q11.a(), n0.SECONDS);
        }

        /* synthetic */ f(a aVar) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    private static class g implements net.time4j.engine.y<b0, TimeUnit> {
        private g() {
        }

        @Override // net.time4j.engine.y
        /* renamed from: c */
        public net.time4j.engine.p<?> getChildAtCeiling(b0 b0Var) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* renamed from: d */
        public net.time4j.engine.p<?> getChildAtFloor(b0 b0Var) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* renamed from: e */
        public TimeUnit getMaximum(b0 b0Var) {
            return TimeUnit.NANOSECONDS;
        }

        @Override // net.time4j.engine.y
        /* renamed from: f */
        public TimeUnit getMinimum(b0 b0Var) {
            return TimeUnit.DAYS;
        }

        @Override // net.time4j.engine.y
        /* renamed from: g */
        public TimeUnit getValue(b0 b0Var) {
            int a11 = b0Var.a();
            if (a11 == 0) {
                long j11 = b0Var.f40825a;
                if (net.time4j.base.c.d(j11, 86400) == 0) {
                    return TimeUnit.DAYS;
                }
                if (net.time4j.base.c.d(j11, 3600) == 0) {
                    return TimeUnit.HOURS;
                }
                if (net.time4j.base.c.d(j11, 60) == 0) {
                    return TimeUnit.MINUTES;
                }
                return TimeUnit.SECONDS;
            } else if (a11 % 1000000 == 0) {
                return TimeUnit.MILLISECONDS;
            } else {
                if (a11 % 1000 == 0) {
                    return TimeUnit.MICROSECONDS;
                }
                return TimeUnit.NANOSECONDS;
            }
        }

        @Override // net.time4j.engine.y
        /* renamed from: h */
        public boolean isValid(b0 b0Var, TimeUnit timeUnit) {
            return timeUnit != null;
        }

        @Override // net.time4j.engine.y
        /* renamed from: i */
        public b0 withValue(b0 b0Var, TimeUnit timeUnit, boolean z11) {
            b0 k02;
            if (timeUnit != null) {
                switch (a.f40829c[timeUnit.ordinal()]) {
                    case 1:
                        return b0.l0(net.time4j.base.c.b(b0Var.f40825a, 86400) * 86400, m30.f.POSIX);
                    case 2:
                        return b0.l0(net.time4j.base.c.b(b0Var.f40825a, 3600) * 3600, m30.f.POSIX);
                    case 3:
                        return b0.l0(net.time4j.base.c.b(b0Var.f40825a, 60) * 60, m30.f.POSIX);
                    case 4:
                        k02 = b0.k0(b0Var.f40825a, 0, m30.f.POSIX);
                        break;
                    case 5:
                        k02 = b0.k0(b0Var.f40825a, (b0Var.a() / 1000000) * 1000000, m30.f.POSIX);
                        break;
                    case 6:
                        k02 = b0.k0(b0Var.f40825a, (b0Var.a() / 1000) * 1000, m30.f.POSIX);
                        break;
                    case 7:
                        return b0Var;
                    default:
                        throw new UnsupportedOperationException(timeUnit.name());
                }
                return (b0Var.i0() && m30.d.p().t()) ? k02.m0(1L, n0.SECONDS) : k02;
            }
            throw new IllegalArgumentException("Missing precision.");
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    private static class h implements net.time4j.engine.k0<b0> {

        /* renamed from: a  reason: collision with root package name */
        private final TimeUnit f40830a;

        h(TimeUnit timeUnit) {
            this.f40830a = timeUnit;
        }

        @Override // net.time4j.engine.k0
        /* renamed from: c */
        public b0 b(b0 b0Var, long j11) {
            if (this.f40830a.compareTo(TimeUnit.SECONDS) >= 0) {
                return b0.k0(net.time4j.base.c.f(b0Var.g(), net.time4j.base.c.i(j11, this.f40830a.toSeconds(1L))), b0Var.a(), m30.f.POSIX);
            }
            long f11 = net.time4j.base.c.f(b0Var.a(), net.time4j.base.c.i(j11, this.f40830a.toNanos(1L)));
            return b0.k0(net.time4j.base.c.f(b0Var.g(), net.time4j.base.c.b(f11, Http2Connection.DEGRADED_PONG_TIMEOUT_NS)), net.time4j.base.c.d(f11, Http2Connection.DEGRADED_PONG_TIMEOUT_NS), m30.f.POSIX);
        }

        @Override // net.time4j.engine.k0
        /* renamed from: d */
        public long a(b0 b0Var, b0 b0Var2) {
            long f11;
            if (this.f40830a.compareTo(TimeUnit.SECONDS) >= 0) {
                f11 = b0Var2.g() - b0Var.g();
                int i11 = (f11 > 0L ? 1 : (f11 == 0L ? 0 : -1));
                if (i11 < 0) {
                    if (b0Var2.a() > b0Var.a()) {
                        f11++;
                    }
                } else if (i11 > 0 && b0Var2.a() < b0Var.a()) {
                    f11--;
                }
            } else {
                f11 = net.time4j.base.c.f(net.time4j.base.c.i(net.time4j.base.c.m(b0Var2.g(), b0Var.g()), 1000000000L), b0Var2.a() - b0Var.a());
            }
            switch (a.f40829c[this.f40830a.ordinal()]) {
                case 1:
                    return f11 / 86400;
                case 2:
                    return f11 / 3600;
                case 3:
                    return f11 / 60;
                case 4:
                case 7:
                    return f11;
                case 5:
                    return f11 / 1000000;
                case 6:
                    return f11 / 1000;
                default:
                    throw new UnsupportedOperationException(this.f40830a.name());
            }
        }
    }

    static {
        TimeUnit[] values;
        long j11 = net.time4j.base.b.j(-999999999, 1, 1);
        long j12 = net.time4j.base.b.j(999999999, 12, 31);
        net.time4j.engine.z zVar = net.time4j.engine.z.UNIX;
        net.time4j.engine.z zVar2 = net.time4j.engine.z.MODIFIED_JULIAN_DATE;
        long transform = zVar.transform(j11, zVar2) * 86400;
        f40815c = transform;
        long transform2 = (zVar.transform(j12, zVar2) * 86400) + 86399;
        f40816d = transform2;
        m30.f fVar = m30.f.POSIX;
        b0 b0Var = new b0(transform, 0, fVar);
        f40817e = b0Var;
        b0 b0Var2 = new b0(transform2, 999999999, fVar);
        f40818f = b0Var2;
        new b0(63158400L, 0, fVar);
        HashSet hashSet = new HashSet();
        hashSet.add(h0.f41336z);
        hashSet.add(h0.f41335y);
        hashSet.add(h0.f41333x);
        hashSet.add(h0.f41332w);
        hashSet.add(h0.f41331t);
        hashSet.add(h0.f41330q);
        hashSet.add(h0.A);
        hashSet.add(h0.B);
        f40819g = Collections.unmodifiableSet(hashSet);
        HashMap hashMap = new HashMap();
        hashMap.put(h0.C, 1);
        hashMap.put(h0.E, 1);
        hashMap.put(h0.F, 1000);
        hashMap.put(h0.K, 1000);
        hashMap.put(h0.G, 1000000);
        hashMap.put(h0.L, 1000000);
        k0<Integer, h0> k0Var = h0.H;
        Integer valueOf = Integer.valueOf((int) Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
        hashMap.put(k0Var, valueOf);
        hashMap.put(h0.O, valueOf);
        f40820h = Collections.unmodifiableMap(hashMap);
        EnumMap enumMap = new EnumMap(TimeUnit.class);
        enumMap.put((EnumMap) TimeUnit.DAYS, (TimeUnit) Double.valueOf(86400.0d));
        enumMap.put((EnumMap) TimeUnit.HOURS, (TimeUnit) Double.valueOf(3600.0d));
        enumMap.put((EnumMap) TimeUnit.MINUTES, (TimeUnit) Double.valueOf(60.0d));
        enumMap.put((EnumMap) TimeUnit.SECONDS, (TimeUnit) Double.valueOf(1.0d));
        enumMap.put((EnumMap) TimeUnit.MILLISECONDS, (TimeUnit) Double.valueOf(0.001d));
        enumMap.put((EnumMap) TimeUnit.MICROSECONDS, (TimeUnit) Double.valueOf(1.0E-6d));
        enumMap.put((EnumMap) TimeUnit.NANOSECONDS, (TimeUnit) Double.valueOf(1.0E-9d));
        f40821i = Collections.unmodifiableMap(enumMap);
        f0.b k11 = f0.b.k(TimeUnit.class, b0.class, new e(null), b0Var, b0Var2);
        for (TimeUnit timeUnit : TimeUnit.values()) {
            h hVar = new h(timeUnit);
            Map<TimeUnit, Double> map = f40821i;
            k11.g(timeUnit, hVar, map.get(timeUnit).doubleValue(), map.keySet());
        }
        d dVar = d.POSIX_TIME;
        k11.e(dVar, dVar, TimeUnit.SECONDS);
        c cVar = c.FRACTION;
        k11.e(cVar, cVar, TimeUnit.NANOSECONDS);
        net.time4j.engine.p<TimeUnit> pVar = j0.f41460e;
        k11.d(pVar, new g(null));
        f40822j = k11.l(new b(null)).h();
        f40823k = new b0(0L, 0, m30.f.POSIX);
        f40824l = pVar;
        new f(null);
    }

    /* synthetic */ b0(int i11, long j11, a aVar) {
        this(i11, j11);
    }

    public static net.time4j.engine.f0<TimeUnit, b0> Q() {
        return f40822j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void S(b0 b0Var) {
        if (b0Var.f40825a < 63072000) {
            throw new UnsupportedOperationException("Cannot calculate SI-duration before 1972-01-01.");
        }
    }

    private static void T(int i11) {
        if (i11 >= 1000000000 || i11 < 0) {
            throw new IllegalArgumentException("Nanosecond out of range: " + i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void U(long j11, i0 i0Var) {
        m30.d p11 = m30.d.p();
        if (!p11.w() || p11.v(p11.f(j11)) <= j11) {
            return;
        }
        throw new ChronoException("Illegal local timestamp due to negative leap second: " + i0Var);
    }

    private static void V(long j11) {
        if (j11 > f40816d || j11 < f40815c) {
            throw new IllegalArgumentException("UNIX time (UT) out of supported range: " + j11);
        }
    }

    private static void X(int i11, int i12, StringBuilder sb2) {
        int i13 = 1;
        for (int i14 = 0; i14 < i12 - 1; i14++) {
            i13 *= 10;
        }
        while (i11 < i13 && i13 >= 10) {
            sb2.append('0');
            i13 /= 10;
        }
        sb2.append(String.valueOf(i11));
    }

    public static b0 Y(net.time4j.base.f fVar) {
        if (fVar instanceof b0) {
            return (b0) b0.class.cast(fVar);
        }
        if ((fVar instanceof m30.g) && m30.d.p().t()) {
            m30.g gVar = (m30.g) m30.g.class.cast(fVar);
            m30.f fVar2 = m30.f.UTC;
            return k0(gVar.d(fVar2), gVar.k(fVar2), fVar2);
        }
        return k0(fVar.g(), fVar.a(), m30.f.POSIX);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public g0 a0() {
        return g0.V0(net.time4j.base.c.b(this.f40825a, 86400), net.time4j.engine.z.UNIX);
    }

    private long b0() {
        if (m30.d.p().t()) {
            long f11 = m30.d.p().f(this.f40825a);
            return j0() ? f11 + 1 : f11;
        }
        return this.f40825a - 63072000;
    }

    private double c0() {
        double b02 = ((b0() + 42.184d) + (a() / 1.0E9d)) - m30.f.deltaT(a0());
        long floor = (long) Math.floor(b02);
        return Double.compare(1.0E9d - ((b02 - ((double) floor)) * 1.0E9d), 1.0d) < 0 ? floor + 1 : b02;
    }

    private static int d0(b0 b0Var) {
        return net.time4j.base.c.d(b0Var.f40825a, 86400);
    }

    private i0 e0(net.time4j.tz.l lVar) {
        return i0.S(this, lVar.B(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j0() {
        return (this.f40826b >>> 30) != 0;
    }

    public static b0 k0(long j11, int i11, m30.f fVar) {
        if (j11 == 0 && i11 == 0 && fVar == m30.f.POSIX) {
            return f40823k;
        }
        return new b0(j11, i11, fVar);
    }

    public static b0 l0(long j11, m30.f fVar) {
        return k0(j11, 0, fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b0 o0(DataInput dataInput, boolean z11, boolean z12) {
        long readLong = dataInput.readLong();
        int readInt = z12 ? dataInput.readInt() : 0;
        if (readLong == 0) {
            if (z11) {
                throw new InvalidObjectException("UTC epoch is no leap second.");
            }
            if (readInt == 0) {
                return f40823k;
            }
        }
        if (readLong == f40815c && readInt == 0) {
            if (!z11) {
                return f40817e;
            }
            throw new InvalidObjectException("Minimum is no leap second.");
        } else if (readLong == f40816d && readInt == 999999999) {
            if (!z11) {
                return f40818f;
            }
            throw new InvalidObjectException("Maximum is no leap second.");
        } else {
            T(readInt);
            if (z11) {
                m30.d p11 = m30.d.p();
                if (p11.t() && !p11.u(p11.f(readLong) + 1)) {
                    long l11 = net.time4j.base.b.l(readLong);
                    int h11 = net.time4j.base.b.h(l11);
                    int g11 = net.time4j.base.b.g(l11);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Not registered as leap second event: ");
                    sb2.append(net.time4j.base.b.i(l11));
                    sb2.append("-");
                    sb2.append(h11 < 10 ? "0" : "");
                    sb2.append(h11);
                    sb2.append(g11 >= 10 ? "" : "0");
                    sb2.append(g11);
                    sb2.append(" [Please check leap second configurations ");
                    sb2.append("either of emitter vm or this target vm]");
                    throw new InvalidObjectException(sb2.toString());
                }
                readInt |= 1073741824;
            }
            return new b0(readInt, readLong);
        }
    }

    private static int r0(double d11, long j11) {
        try {
            return (int) ((d11 * 1.0E9d) - net.time4j.base.c.i(j11, 1000000000L));
        } catch (ArithmeticException unused) {
            return (int) ((d11 - j11) * 1.0E9d);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private String s0(boolean z11) {
        g0 a02 = a0();
        int d02 = d0(this);
        int i11 = d02 / 60;
        int i12 = i11 / 60;
        int i13 = i11 % 60;
        int r11 = (d02 % 60) + m30.d.p().r(b0());
        int a11 = a();
        StringBuilder sb2 = new StringBuilder(50);
        sb2.append(a02);
        sb2.append('T');
        X(i12, 2, sb2);
        if (z11 || (i13 | r11 | a11) != 0) {
            sb2.append(CoreConstants.COLON_CHAR);
            X(i13, 2, sb2);
            if (z11 || (r11 | a11) != 0) {
                sb2.append(CoreConstants.COLON_CHAR);
                X(r11, 2, sb2);
                if (a11 > 0) {
                    sb2.append(CoreConstants.COMMA_CHAR);
                    X(a11, 9, sb2);
                }
            }
        }
        sb2.append(Matrix.MATRIX_TYPE_ZERO);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b0 w0(m30.f fVar) {
        if (fVar == m30.f.UTC) {
            return this;
        }
        if (!i0()) {
            int i11 = a.f40827a[fVar.ordinal()];
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5 && i11 != 6) {
                            throw new UnsupportedOperationException(fVar.name());
                        }
                        return new b0(net.time4j.base.c.m(this.f40825a, 63072000L), a(), fVar);
                    }
                    return new b0(net.time4j.base.c.m(this.f40825a, 315964800L), a(), fVar);
                }
                return new b0(net.time4j.base.c.m(this.f40825a, -378691200L), a(), fVar);
            }
            return this;
        }
        throw new IllegalArgumentException("Leap seconds do not exist on continuous time scale: " + fVar);
    }

    private Object writeReplace() {
        return new SPX(this, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b0 x0(m30.f fVar) {
        switch (a.f40827a[fVar.ordinal()]) {
            case 1:
                return i0() ? new b0(a(), this.f40825a) : this;
            case 2:
                return this;
            case 3:
                return new b0(k(fVar), net.time4j.base.c.f(d(fVar), -378691200L));
            case 4:
                return new b0(a(), net.time4j.base.c.f(d(m30.f.GPS), 315964800L));
            case 5:
            case 6:
                return new b0(k(fVar), net.time4j.base.c.f(d(fVar), 63072000L));
            default:
                throw new UnsupportedOperationException(fVar.name());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.i0, net.time4j.engine.q
    /* renamed from: D */
    public net.time4j.engine.f0<TimeUnit, b0> r() {
        return f40822j;
    }

    @Override // net.time4j.engine.i0, java.lang.Comparable
    /* renamed from: W */
    public int compareTo(b0 b0Var) {
        int a11;
        int i11 = (b0() > b0Var.b0() ? 1 : (b0() == b0Var.b0() ? 0 : -1));
        if (i11 < 0) {
            return -1;
        }
        if (i11 <= 0 && (a11 = a() - b0Var.a()) <= 0) {
            return a11 < 0 ? -1 : 0;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.q
    /* renamed from: Z */
    public b0 s() {
        return this;
    }

    @Override // net.time4j.base.f
    public int a() {
        return this.f40826b & (-1073741825);
    }

    @Override // m30.g
    public long d(m30.f fVar) {
        long b02;
        int r02;
        switch (a.f40827a[fVar.ordinal()]) {
            case 1:
                return this.f40825a;
            case 2:
                return b0();
            case 3:
                if (b0() < 0) {
                    double a11 = (a() / 1.0E9d) + m30.f.deltaT(a0()) + (this.f40825a - 63072000);
                    long floor = (long) Math.floor(a11);
                    if (Double.compare(1.0E9d - ((a11 - floor) * 1.0E9d), 1.0d) < 0) {
                        floor++;
                        r02 = 0;
                    } else {
                        r02 = r0(a11, floor);
                    }
                    b02 = (floor - 32) + 441763200;
                    if (r02 - 184000000 < 0) {
                        b02--;
                    }
                } else {
                    b02 = b0() + 441763200 + 10;
                }
                if (b02 >= 0) {
                    return b02;
                }
                throw new IllegalArgumentException("TAI not supported before 1958-01-01: " + this);
            case 4:
                long b03 = b0();
                if (m30.d.p().v(b03) >= 315964800) {
                    if (!m30.d.p().t()) {
                        b03 += 9;
                    }
                    return b03 - 252892809;
                }
                throw new IllegalArgumentException("GPS not supported before 1980-01-06: " + this);
            case 5:
                if (this.f40825a < 63072000) {
                    double deltaT = m30.f.deltaT(a0()) + (this.f40825a - 63072000) + (a() / 1.0E9d);
                    long floor2 = (long) Math.floor(deltaT);
                    return Double.compare(1.0E9d - ((deltaT - ((double) floor2)) * 1.0E9d), 1.0d) < 0 ? floor2 + 1 : floor2;
                }
                long b04 = b0() + 42;
                return a() + 184000000 >= 1000000000 ? b04 + 1 : b04;
            case 6:
                long j11 = this.f40825a;
                return j11 < 63072000 ? j11 - 63072000 : (long) Math.floor(c0());
            default:
                throw new UnsupportedOperationException("Not yet implemented: " + fVar);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (this.f40825a != b0Var.f40825a) {
                return false;
            }
            return m30.d.p().t() ? this.f40826b == b0Var.f40826b : a() == b0Var.a();
        }
        return false;
    }

    public b1 f0(net.time4j.tz.k kVar) {
        return b1.j(this, net.time4j.tz.l.N(kVar));
    }

    @Override // net.time4j.base.f
    public long g() {
        return this.f40825a;
    }

    public boolean g0(m30.g gVar) {
        return compareTo(Y(gVar)) > 0;
    }

    public boolean h0(m30.g gVar) {
        return compareTo(Y(gVar)) < 0;
    }

    public int hashCode() {
        long j11 = this.f40825a;
        return (((int) (j11 ^ (j11 >>> 32))) * 19) + (a() * 37);
    }

    public boolean i0() {
        return j0() && m30.d.p().t();
    }

    @Override // m30.g
    public int k(m30.f fVar) {
        long b02;
        int a11;
        int r02;
        switch (a.f40827a[fVar.ordinal()]) {
            case 1:
            case 2:
                return a();
            case 3:
                if (b0() < 0) {
                    double a12 = (a() / 1.0E9d) + m30.f.deltaT(a0()) + (this.f40825a - 63072000);
                    long floor = (long) Math.floor(a12);
                    if (Double.compare(1.0E9d - ((a12 - floor) * 1.0E9d), 1.0d) < 0) {
                        floor++;
                        r02 = 0;
                    } else {
                        r02 = r0(a12, floor);
                    }
                    b02 = (floor - 32) + 441763200;
                    a11 = r02 - 184000000;
                    if (a11 < 0) {
                        b02--;
                        a11 += Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
                    }
                } else {
                    b02 = b0() + 441763200;
                    a11 = a();
                }
                if (b02 >= 0) {
                    return a11;
                }
                throw new IllegalArgumentException("TAI not supported before 1958-01-01: " + this);
            case 4:
                if (m30.d.p().v(b0()) >= 315964800) {
                    return a();
                }
                throw new IllegalArgumentException("GPS not supported before 1980-01-06: " + this);
            case 5:
                if (this.f40825a < 63072000) {
                    double deltaT = m30.f.deltaT(a0()) + (this.f40825a - 63072000) + (a() / 1.0E9d);
                    long floor2 = (long) Math.floor(deltaT);
                    if (Double.compare(1.0E9d - ((deltaT - floor2) * 1.0E9d), 1.0d) < 0) {
                        return 0;
                    }
                    return r0(deltaT, floor2);
                }
                int a13 = a() + 184000000;
                return a13 >= 1000000000 ? a13 - Http2Connection.DEGRADED_PONG_TIMEOUT_NS : a13;
            case 6:
                if (this.f40825a < 63072000) {
                    return a();
                }
                double c02 = c0();
                return r0(c02, (long) Math.floor(c02));
            default:
                throw new UnsupportedOperationException("Not yet implemented: " + fVar);
        }
    }

    public b0 m0(long j11, n0 n0Var) {
        b0 k02;
        S(this);
        int i11 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i11 == 0) {
            return this;
        }
        try {
            int i12 = a.f40828b[n0Var.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    long f11 = net.time4j.base.c.f(a(), j11);
                    int d11 = net.time4j.base.c.d(f11, Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
                    long b11 = net.time4j.base.c.b(f11, Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
                    if (m30.d.p().t()) {
                        k02 = new b0(net.time4j.base.c.f(b0(), b11), d11, m30.f.UTC);
                    } else {
                        k02 = k0(net.time4j.base.c.f(this.f40825a, b11), d11, m30.f.POSIX);
                    }
                } else {
                    throw new UnsupportedOperationException();
                }
            } else if (m30.d.p().t()) {
                k02 = new b0(net.time4j.base.c.f(b0(), j11), a(), m30.f.UTC);
            } else {
                k02 = k0(net.time4j.base.c.f(this.f40825a, j11), a(), m30.f.POSIX);
            }
            if (i11 < 0) {
                S(k02);
            }
            return k02;
        } catch (IllegalArgumentException e11) {
            ArithmeticException arithmeticException = new ArithmeticException("Result beyond boundaries of time axis.");
            arithmeticException.initCause(e11);
            throw arithmeticException;
        }
    }

    public <C extends net.time4j.engine.l<C>> s<C> p0(net.time4j.engine.j<C> jVar, String str, net.time4j.tz.k kVar, net.time4j.engine.d0 d0Var) {
        i0 v02 = v0(kVar);
        return s.b(v02.F(d0Var.b(v02.T(), kVar), net.time4j.h.SECONDS).T().Q(jVar.p(), str), v02.V());
    }

    public <C extends net.time4j.engine.m<?, C>> s<C> q0(net.time4j.engine.w<C> wVar, net.time4j.tz.k kVar, net.time4j.engine.d0 d0Var) {
        i0 v02 = v0(kVar);
        return s.d(v02.F(d0Var.b(v02.T(), kVar), net.time4j.h.SECONDS).T().S(wVar.p()), v02.V());
    }

    public String toString() {
        return s0(true);
    }

    public i0 v0(net.time4j.tz.k kVar) {
        return e0(net.time4j.tz.l.N(kVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y0(DataOutput dataOutput) {
        int i11 = j0() ? 65 : 64;
        int a11 = a();
        if (a11 > 0) {
            i11 |= 2;
        }
        dataOutput.writeByte(i11);
        dataOutput.writeLong(this.f40825a);
        if (a11 > 0) {
            dataOutput.writeInt(a11);
        }
    }

    private b0(long j11, int i11, m30.f fVar) {
        int i12;
        long j12;
        long f11;
        long j13 = j11;
        int i13 = i11;
        if (fVar == m30.f.POSIX) {
            this.f40825a = j13;
            this.f40826b = i13;
        } else {
            m30.d p11 = m30.d.p();
            if (p11.t()) {
                if (fVar != m30.f.UTC) {
                    if (fVar == m30.f.TAI) {
                        if (j13 < 0) {
                            throw new IllegalArgumentException("TAI not supported before 1958-01-01: " + j13);
                        } else if (j13 < 441763200) {
                            long f12 = net.time4j.base.c.f(j13, -441763168L);
                            int e11 = net.time4j.base.c.e(i13, 184000000);
                            if (e11 >= 1000000000) {
                                f12 = net.time4j.base.c.f(f12, 1L);
                                e11 = net.time4j.base.c.l(e11, Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
                            }
                            double d11 = f12 + (e11 / 1.0E9d);
                            double deltaT = d11 - m30.f.deltaT(g0.V0(net.time4j.base.c.b((long) (d11 - 42.184d), 86400), net.time4j.engine.z.UTC));
                            j12 = (long) Math.floor(deltaT);
                            i12 = r0(deltaT, j12);
                        } else {
                            i12 = i13;
                            j12 = net.time4j.base.c.m(j13, 441763210L);
                        }
                    } else if (fVar == m30.f.GPS) {
                        long f13 = net.time4j.base.c.f(j13, 252892809L);
                        if (f13 < 252892809) {
                            throw new IllegalArgumentException("GPS not supported before 1980-01-06: " + j13);
                        }
                        i12 = i13;
                        j12 = f13;
                    } else if (fVar == m30.f.TT) {
                        int i14 = (j13 > 42L ? 1 : (j13 == 42L ? 0 : -1));
                        if (i14 >= 0 && (i14 != 0 || i13 >= 184000000)) {
                            j13 = net.time4j.base.c.m(j13, 42L);
                            i13 = net.time4j.base.c.l(i13, 184000000);
                            if (i13 < 0) {
                                j13 = net.time4j.base.c.m(j13, 1L);
                                i13 = net.time4j.base.c.e(i13, Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
                            }
                        } else {
                            double d12 = j13 + (i13 / 1.0E9d);
                            double deltaT2 = d12 - m30.f.deltaT(g0.V0(net.time4j.base.c.b((long) (d12 - 42.184d), 86400), net.time4j.engine.z.UTC));
                            j12 = (long) Math.floor(deltaT2);
                            i12 = r0(deltaT2, j12);
                        }
                    } else if (fVar != m30.f.UT) {
                        throw new UnsupportedOperationException("Not yet implemented: " + fVar.name());
                    } else if (j13 >= 0) {
                        double deltaT3 = ((j13 + (i13 / 1.0E9d)) + m30.f.deltaT(g0.V0(net.time4j.base.c.b(j13, 86400), net.time4j.engine.z.UTC))) - 42.184d;
                        j12 = (long) Math.floor(deltaT3);
                        i12 = r0(deltaT3, j12);
                    }
                    long v11 = p11.v(j12);
                    f11 = j12 - p11.f(v11);
                    this.f40825a = v11;
                    if (f11 != 0 || v11 == f40816d) {
                        this.f40826b = i12;
                    } else if (f11 == 1) {
                        this.f40826b = 1073741824 | i12;
                    } else {
                        throw new IllegalStateException("Cannot handle leap shift of " + j13 + ".");
                    }
                    i13 = i12;
                }
                i12 = i13;
                j12 = j13;
                long v112 = p11.v(j12);
                f11 = j12 - p11.f(v112);
                this.f40825a = v112;
                if (f11 != 0) {
                }
                this.f40826b = i12;
                i13 = i12;
            } else {
                throw new IllegalStateException("Leap seconds are not supported by configuration.");
            }
        }
        V(this.f40825a);
        T(i13);
    }

    private b0(int i11, long j11) {
        V(j11);
        this.f40825a = j11;
        this.f40826b = i11;
    }
}