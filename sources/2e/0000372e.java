package com.google.common.base;

import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final c0 f15956a = c0.b();

    /* renamed from: b  reason: collision with root package name */
    private boolean f15957b;

    /* renamed from: c  reason: collision with root package name */
    private long f15958c;

    /* renamed from: d  reason: collision with root package name */
    private long f15959d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15960a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f15960a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15960a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15960a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15960a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15960a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15960a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15960a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    y() {
    }

    private static String a(TimeUnit timeUnit) {
        switch (a.f15960a[timeUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "min";
            case 6:
                return "h";
            case 7:
                return "d";
            default:
                throw new AssertionError();
        }
    }

    private static TimeUnit b(long j11) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(j11, timeUnit2) > 0) {
            return timeUnit;
        }
        TimeUnit timeUnit3 = TimeUnit.HOURS;
        if (timeUnit3.convert(j11, timeUnit2) > 0) {
            return timeUnit3;
        }
        TimeUnit timeUnit4 = TimeUnit.MINUTES;
        if (timeUnit4.convert(j11, timeUnit2) > 0) {
            return timeUnit4;
        }
        TimeUnit timeUnit5 = TimeUnit.SECONDS;
        if (timeUnit5.convert(j11, timeUnit2) > 0) {
            return timeUnit5;
        }
        TimeUnit timeUnit6 = TimeUnit.MILLISECONDS;
        if (timeUnit6.convert(j11, timeUnit2) > 0) {
            return timeUnit6;
        }
        TimeUnit timeUnit7 = TimeUnit.MICROSECONDS;
        return timeUnit7.convert(j11, timeUnit2) > 0 ? timeUnit7 : timeUnit2;
    }

    public static y c() {
        return new y();
    }

    private long e() {
        return this.f15957b ? (this.f15956a.a() - this.f15959d) + this.f15958c : this.f15958c;
    }

    public long d(TimeUnit timeUnit) {
        return timeUnit.convert(e(), TimeUnit.NANOSECONDS);
    }

    public y f() {
        this.f15958c = 0L;
        this.f15957b = false;
        return this;
    }

    public y g() {
        u.v(!this.f15957b, "This stopwatch is already running.");
        this.f15957b = true;
        this.f15959d = this.f15956a.a();
        return this;
    }

    public String toString() {
        long e11 = e();
        TimeUnit b11 = b(e11);
        String c11 = t.c(e11 / TimeUnit.NANOSECONDS.convert(1L, b11));
        String a11 = a(b11);
        StringBuilder sb2 = new StringBuilder(String.valueOf(c11).length() + 1 + String.valueOf(a11).length());
        sb2.append(c11);
        sb2.append(" ");
        sb2.append(a11);
        return sb2.toString();
    }
}