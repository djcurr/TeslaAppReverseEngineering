package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.v1.AndroidMemoryReading;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: f */
    private static final fn.a f17022f = fn.a.e();

    /* renamed from: a */
    private final ScheduledExecutorService f17023a;

    /* renamed from: b */
    public final ConcurrentLinkedQueue<AndroidMemoryReading> f17024b;

    /* renamed from: c */
    private final Runtime f17025c;

    /* renamed from: d */
    private ScheduledFuture f17026d;

    /* renamed from: e */
    private long f17027e;

    public l() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    public static /* synthetic */ void a(l lVar, com.google.firebase.perf.util.h hVar) {
        lVar.g(hVar);
    }

    public static /* synthetic */ void b(l lVar, com.google.firebase.perf.util.h hVar) {
        lVar.f(hVar);
    }

    private int d() {
        return com.google.firebase.perf.util.k.c(com.google.firebase.perf.util.g.BYTES.toKilobytes(this.f17025c.totalMemory() - this.f17025c.freeMemory()));
    }

    public static boolean e(long j11) {
        return j11 <= 0;
    }

    public /* synthetic */ void f(com.google.firebase.perf.util.h hVar) {
        AndroidMemoryReading l11 = l(hVar);
        if (l11 != null) {
            this.f17024b.add(l11);
        }
    }

    public /* synthetic */ void g(com.google.firebase.perf.util.h hVar) {
        AndroidMemoryReading l11 = l(hVar);
        if (l11 != null) {
            this.f17024b.add(l11);
        }
    }

    private synchronized void h(final com.google.firebase.perf.util.h hVar) {
        try {
            this.f17023a.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.k
                {
                    l.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    l.b(l.this, hVar);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e11) {
            fn.a aVar = f17022f;
            aVar.j("Unable to collect Memory Metric: " + e11.getMessage());
        }
    }

    private synchronized void i(long j11, final com.google.firebase.perf.util.h hVar) {
        this.f17027e = j11;
        try {
            this.f17026d = this.f17023a.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.j
                {
                    l.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    l.a(l.this, hVar);
                }
            }, 0L, j11, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e11) {
            fn.a aVar = f17022f;
            aVar.j("Unable to start collecting Memory Metrics: " + e11.getMessage());
        }
    }

    private AndroidMemoryReading l(com.google.firebase.perf.util.h hVar) {
        if (hVar == null) {
            return null;
        }
        return AndroidMemoryReading.newBuilder().a(hVar.a()).b(d()).build();
    }

    public void c(com.google.firebase.perf.util.h hVar) {
        h(hVar);
    }

    public void j(long j11, com.google.firebase.perf.util.h hVar) {
        if (e(j11)) {
            return;
        }
        if (this.f17026d != null) {
            if (this.f17027e != j11) {
                k();
                i(j11, hVar);
                return;
            }
            return;
        }
        i(j11, hVar);
    }

    public void k() {
        ScheduledFuture scheduledFuture = this.f17026d;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f17026d = null;
        this.f17027e = -1L;
    }

    l(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.f17026d = null;
        this.f17027e = -1L;
        this.f17023a = scheduledExecutorService;
        this.f17024b = new ConcurrentLinkedQueue<>();
        this.f17025c = runtime;
    }
}