package com.google.firebase.perf.session.gauges;

import android.os.Build;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.perf.v1.CpuMetricReading;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: g */
    private static final fn.a f16995g = fn.a.e();

    /* renamed from: h */
    private static final long f16996h = TimeUnit.SECONDS.toMicros(1);

    /* renamed from: c */
    private final String f16999c;

    /* renamed from: d */
    private final long f17000d;

    /* renamed from: e */
    private ScheduledFuture f17001e = null;

    /* renamed from: f */
    private long f17002f = -1;

    /* renamed from: a */
    public final ConcurrentLinkedQueue<CpuMetricReading> f16997a = new ConcurrentLinkedQueue<>();

    /* renamed from: b */
    private final ScheduledExecutorService f16998b = Executors.newSingleThreadScheduledExecutor();

    public c() {
        int myPid = Process.myPid();
        this.f16999c = "/proc/" + Integer.toString(myPid) + "/stat";
        this.f17000d = e();
    }

    public static /* synthetic */ void a(c cVar, com.google.firebase.perf.util.h hVar) {
        cVar.g(hVar);
    }

    public static /* synthetic */ void b(c cVar, com.google.firebase.perf.util.h hVar) {
        cVar.h(hVar);
    }

    private long d(long j11) {
        return Math.round((j11 / this.f17000d) * f16996h);
    }

    private long e() {
        if (Build.VERSION.SDK_INT >= 21) {
            return Os.sysconf(OsConstants._SC_CLK_TCK);
        }
        return -1L;
    }

    public static boolean f(long j11) {
        return j11 <= 0;
    }

    public /* synthetic */ void g(com.google.firebase.perf.util.h hVar) {
        CpuMetricReading m11 = m(hVar);
        if (m11 != null) {
            this.f16997a.add(m11);
        }
    }

    public /* synthetic */ void h(com.google.firebase.perf.util.h hVar) {
        CpuMetricReading m11 = m(hVar);
        if (m11 != null) {
            this.f16997a.add(m11);
        }
    }

    private synchronized void i(final com.google.firebase.perf.util.h hVar) {
        try {
            this.f16998b.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.a
                @Override // java.lang.Runnable
                public final void run() {
                    c.a(c.this, hVar);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e11) {
            fn.a aVar = f16995g;
            aVar.j("Unable to collect Cpu Metric: " + e11.getMessage());
        }
    }

    private synchronized void j(long j11, final com.google.firebase.perf.util.h hVar) {
        this.f17002f = j11;
        try {
            this.f17001e = this.f16998b.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.b(c.this, hVar);
                }
            }, 0L, j11, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e11) {
            fn.a aVar = f16995g;
            aVar.j("Unable to start collecting Cpu Metrics: " + e11.getMessage());
        }
    }

    private CpuMetricReading m(com.google.firebase.perf.util.h hVar) {
        if (hVar == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.f16999c));
            try {
                long a11 = hVar.a();
                String[] split = bufferedReader.readLine().split(" ");
                long parseLong = Long.parseLong(split[13]);
                long parseLong2 = Long.parseLong(split[15]);
                CpuMetricReading build = CpuMetricReading.newBuilder().a(a11).b(d(Long.parseLong(split[14]) + Long.parseLong(split[16]))).c(d(parseLong + parseLong2)).build();
                bufferedReader.close();
                return build;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e11) {
            fn.a aVar = f16995g;
            aVar.j("Unable to read 'proc/[pid]/stat' file: " + e11.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e12) {
            e = e12;
            fn.a aVar2 = f16995g;
            aVar2.j("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NullPointerException e13) {
            e = e13;
            fn.a aVar22 = f16995g;
            aVar22.j("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NumberFormatException e14) {
            e = e14;
            fn.a aVar222 = f16995g;
            aVar222.j("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        }
    }

    public void c(com.google.firebase.perf.util.h hVar) {
        i(hVar);
    }

    public void k(long j11, com.google.firebase.perf.util.h hVar) {
        long j12 = this.f17000d;
        if (j12 == -1 || j12 == 0 || f(j11)) {
            return;
        }
        if (this.f17001e != null) {
            if (this.f17002f != j11) {
                l();
                j(j11, hVar);
                return;
            }
            return;
        }
        j(j11, hVar);
    }

    public void l() {
        ScheduledFuture scheduledFuture = this.f17001e;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f17001e = null;
        this.f17002f = -1L;
    }
}