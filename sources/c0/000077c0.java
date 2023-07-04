package io.grpc;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class t implements Comparable<t> {

    /* renamed from: d  reason: collision with root package name */
    private static final b f31636d = new b();

    /* renamed from: e  reason: collision with root package name */
    private static final long f31637e;

    /* renamed from: f  reason: collision with root package name */
    private static final long f31638f;

    /* renamed from: g  reason: collision with root package name */
    private static final long f31639g;

    /* renamed from: a  reason: collision with root package name */
    private final c f31640a;

    /* renamed from: b  reason: collision with root package name */
    private final long f31641b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f31642c;

    /* loaded from: classes5.dex */
    private static class b extends c {
        private b() {
        }

        @Override // io.grpc.t.c
        public long a() {
            return System.nanoTime();
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class c {
        public abstract long a();
    }

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        f31637e = nanos;
        f31638f = -nanos;
        f31639g = TimeUnit.SECONDS.toNanos(1L);
    }

    private t(c cVar, long j11, boolean z11) {
        this(cVar, cVar.a(), j11, z11);
    }

    public static t a(long j11, TimeUnit timeUnit) {
        return b(j11, timeUnit, f31636d);
    }

    public static t b(long j11, TimeUnit timeUnit, c cVar) {
        c(timeUnit, "units");
        return new t(cVar, timeUnit.toNanos(j11), true);
    }

    private static <T> T c(T t11, Object obj) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    private void d(t tVar) {
        if (this.f31640a == tVar.f31640a) {
            return;
        }
        throw new AssertionError("Tickers (" + this.f31640a + " and " + tVar.f31640a + ") don't match. Custom Ticker should only be used in tests!");
    }

    @Override // java.lang.Comparable
    /* renamed from: e */
    public int compareTo(t tVar) {
        d(tVar);
        int i11 = ((this.f31641b - tVar.f31641b) > 0L ? 1 : ((this.f31641b - tVar.f31641b) == 0L ? 0 : -1));
        if (i11 < 0) {
            return -1;
        }
        return i11 > 0 ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            c cVar = this.f31640a;
            if (cVar != null ? cVar == tVar.f31640a : tVar.f31640a == null) {
                return this.f31641b == tVar.f31641b;
            }
            return false;
        }
        return false;
    }

    public boolean f(t tVar) {
        d(tVar);
        return this.f31641b - tVar.f31641b < 0;
    }

    public boolean g() {
        if (!this.f31642c) {
            if (this.f31641b - this.f31640a.a() > 0) {
                return false;
            }
            this.f31642c = true;
        }
        return true;
    }

    public t h(t tVar) {
        d(tVar);
        return f(tVar) ? this : tVar;
    }

    public int hashCode() {
        return Arrays.asList(this.f31640a, Long.valueOf(this.f31641b)).hashCode();
    }

    public long i(TimeUnit timeUnit) {
        long a11 = this.f31640a.a();
        if (!this.f31642c && this.f31641b - a11 <= 0) {
            this.f31642c = true;
        }
        return timeUnit.convert(this.f31641b - a11, TimeUnit.NANOSECONDS);
    }

    public String toString() {
        long i11 = i(TimeUnit.NANOSECONDS);
        long abs = Math.abs(i11);
        long j11 = f31639g;
        long j12 = abs / j11;
        long abs2 = Math.abs(i11) % j11;
        StringBuilder sb2 = new StringBuilder();
        if (i11 < 0) {
            sb2.append(CoreConstants.DASH_CHAR);
        }
        sb2.append(j12);
        if (abs2 > 0) {
            sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        }
        sb2.append("s from now");
        if (this.f31640a != f31636d) {
            sb2.append(" (ticker=" + this.f31640a + ")");
        }
        return sb2.toString();
    }

    private t(c cVar, long j11, long j12, boolean z11) {
        this.f31640a = cVar;
        long min = Math.min(f31637e, Math.max(f31638f, j12));
        this.f31641b = j11 + min;
        this.f31642c = z11 && min <= 0;
    }
}