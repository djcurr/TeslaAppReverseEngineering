package com.google.firebase.perf.util;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private long f17031a;

    /* renamed from: b  reason: collision with root package name */
    private long f17032b;

    /* renamed from: c  reason: collision with root package name */
    private TimeUnit f17033c;

    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f17034a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f17034a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17034a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17034a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(long j11, long j12, TimeUnit timeUnit) {
        this.f17031a = j11;
        this.f17032b = j12;
        this.f17033c = timeUnit;
    }

    public double a() {
        int i11 = a.f17034a[this.f17033c.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return this.f17031a / this.f17033c.toSeconds(this.f17032b);
                }
                return (this.f17031a / this.f17032b) * TimeUnit.SECONDS.toMillis(1L);
            }
            return (this.f17031a / this.f17032b) * TimeUnit.SECONDS.toMicros(1L);
        }
        return (this.f17031a / this.f17032b) * TimeUnit.SECONDS.toNanos(1L);
    }
}