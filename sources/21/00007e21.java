package kn;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.perf.v1.PerfMetric;
import com.google.firebase.perf.v1.PerfSession;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.firebase.perf.config.a f34829a;

    /* renamed from: b  reason: collision with root package name */
    private final float f34830b;

    /* renamed from: c  reason: collision with root package name */
    private a f34831c;

    /* renamed from: d  reason: collision with root package name */
    private a f34832d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f34833e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: k  reason: collision with root package name */
        private static final fn.a f34834k = fn.a.e();

        /* renamed from: l  reason: collision with root package name */
        private static final long f34835l = TimeUnit.SECONDS.toMicros(1);

        /* renamed from: a  reason: collision with root package name */
        private final com.google.firebase.perf.util.a f34836a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f34837b;

        /* renamed from: c  reason: collision with root package name */
        private com.google.firebase.perf.util.h f34838c;

        /* renamed from: d  reason: collision with root package name */
        private com.google.firebase.perf.util.f f34839d;

        /* renamed from: e  reason: collision with root package name */
        private long f34840e;

        /* renamed from: f  reason: collision with root package name */
        private long f34841f;

        /* renamed from: g  reason: collision with root package name */
        private com.google.firebase.perf.util.f f34842g;

        /* renamed from: h  reason: collision with root package name */
        private com.google.firebase.perf.util.f f34843h;

        /* renamed from: i  reason: collision with root package name */
        private long f34844i;

        /* renamed from: j  reason: collision with root package name */
        private long f34845j;

        a(com.google.firebase.perf.util.f fVar, long j11, com.google.firebase.perf.util.a aVar, com.google.firebase.perf.config.a aVar2, String str, boolean z11) {
            this.f34836a = aVar;
            this.f34840e = j11;
            this.f34839d = fVar;
            this.f34841f = j11;
            this.f34838c = aVar.a();
            g(aVar2, str, z11);
            this.f34837b = z11;
        }

        private static long c(com.google.firebase.perf.config.a aVar, String str) {
            if (str == "Trace") {
                return aVar.C();
            }
            return aVar.o();
        }

        private static long d(com.google.firebase.perf.config.a aVar, String str) {
            if (str == "Trace") {
                return aVar.r();
            }
            return aVar.r();
        }

        private static long e(com.google.firebase.perf.config.a aVar, String str) {
            if (str == "Trace") {
                return aVar.D();
            }
            return aVar.p();
        }

        private static long f(com.google.firebase.perf.config.a aVar, String str) {
            if (str == "Trace") {
                return aVar.r();
            }
            return aVar.r();
        }

        private void g(com.google.firebase.perf.config.a aVar, String str, boolean z11) {
            long f11 = f(aVar, str);
            long e11 = e(aVar, str);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            com.google.firebase.perf.util.f fVar = new com.google.firebase.perf.util.f(e11, f11, timeUnit);
            this.f34842g = fVar;
            this.f34844i = e11;
            if (z11) {
                f34834k.b("Foreground %s logging rate:%f, burst capacity:%d", str, fVar, Long.valueOf(e11));
            }
            long d11 = d(aVar, str);
            long c11 = c(aVar, str);
            com.google.firebase.perf.util.f fVar2 = new com.google.firebase.perf.util.f(c11, d11, timeUnit);
            this.f34843h = fVar2;
            this.f34845j = c11;
            if (z11) {
                f34834k.b("Background %s logging rate:%f, capacity:%d", str, fVar2, Long.valueOf(c11));
            }
        }

        synchronized void a(boolean z11) {
            this.f34839d = z11 ? this.f34842g : this.f34843h;
            this.f34840e = z11 ? this.f34844i : this.f34845j;
        }

        synchronized boolean b(PerfMetric perfMetric) {
            double c11 = this.f34838c.c(this.f34836a.a()) * this.f34839d.a();
            long j11 = f34835l;
            long max = Math.max(0L, (long) (c11 / j11));
            this.f34841f = Math.min(this.f34841f + max, this.f34840e);
            if (max > 0) {
                this.f34838c = new com.google.firebase.perf.util.h(this.f34838c.d() + ((long) ((max * j11) / this.f34839d.a())));
            }
            long j12 = this.f34841f;
            if (j12 > 0) {
                this.f34841f = j12 - 1;
                return true;
            }
            if (this.f34837b) {
                f34834k.j("Exceeded log rate limit, dropping the log.");
            }
            return false;
        }
    }

    public d(Context context, com.google.firebase.perf.util.f fVar, long j11) {
        this(fVar, j11, new com.google.firebase.perf.util.a(), b(), com.google.firebase.perf.config.a.f());
        this.f34833e = com.google.firebase.perf.util.k.b(context);
    }

    @VisibleForTesting
    static float b() {
        return new Random().nextFloat();
    }

    private boolean c(List<PerfSession> list) {
        return list.size() > 0 && list.get(0).getSessionVerbosityCount() > 0 && list.get(0).getSessionVerbosity(0) == com.google.firebase.perf.v1.f.GAUGES_AND_SYSTEM_EVENTS;
    }

    private boolean d() {
        return this.f34830b < this.f34829a.q();
    }

    private boolean e() {
        return this.f34830b < this.f34829a.E();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z11) {
        this.f34831c.a(z11);
        this.f34832d.a(z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f(PerfMetric perfMetric) {
        if (h(perfMetric)) {
            if (perfMetric.hasNetworkRequestMetric()) {
                return !this.f34832d.b(perfMetric);
            }
            if (perfMetric.hasTraceMetric()) {
                return !this.f34831c.b(perfMetric);
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g(PerfMetric perfMetric) {
        if (!perfMetric.hasTraceMetric() || e() || c(perfMetric.getTraceMetric().getPerfSessionsList())) {
            return !perfMetric.hasNetworkRequestMetric() || d() || c(perfMetric.getNetworkRequestMetric().getPerfSessionsList());
        }
        return false;
    }

    boolean h(PerfMetric perfMetric) {
        return (!perfMetric.hasTraceMetric() || (!(perfMetric.getTraceMetric().getName().equals(com.google.firebase.perf.util.c.FOREGROUND_TRACE_NAME.toString()) || perfMetric.getTraceMetric().getName().equals(com.google.firebase.perf.util.c.BACKGROUND_TRACE_NAME.toString())) || perfMetric.getTraceMetric().getCountersCount() <= 0)) && !perfMetric.hasGaugeMetric();
    }

    d(com.google.firebase.perf.util.f fVar, long j11, com.google.firebase.perf.util.a aVar, float f11, com.google.firebase.perf.config.a aVar2) {
        this.f34831c = null;
        this.f34832d = null;
        boolean z11 = false;
        this.f34833e = false;
        if (BitmapDescriptorFactory.HUE_RED <= f11 && f11 < 1.0f) {
            z11 = true;
        }
        com.google.firebase.perf.util.k.a(z11, "Sampling bucket ID should be in range [0.0f, 1.0f).");
        this.f34830b = f11;
        this.f34829a = aVar2;
        this.f34831c = new a(fVar, j11, aVar, aVar2, "Trace", this.f34833e);
        this.f34832d = new a(fVar, j11, aVar, aVar2, "Network", this.f34833e);
    }
}