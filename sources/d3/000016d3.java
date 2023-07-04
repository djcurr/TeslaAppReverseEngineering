package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class a0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f11321a;

    /* renamed from: b  reason: collision with root package name */
    private final d f11322b;

    /* renamed from: e  reason: collision with root package name */
    private final int f11325e;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f11323c = new a();

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f11324d = new b();

    /* renamed from: f  reason: collision with root package name */
    nf.e f11326f = null;

    /* renamed from: g  reason: collision with root package name */
    int f11327g = 0;

    /* renamed from: h  reason: collision with root package name */
    f f11328h = f.IDLE;

    /* renamed from: i  reason: collision with root package name */
    long f11329i = 0;

    /* renamed from: j  reason: collision with root package name */
    long f11330j = 0;

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a0.this.d();
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a0.this.j();
        }
    }

    /* loaded from: classes3.dex */
    static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11333a;

        static {
            int[] iArr = new int[f.values().length];
            f11333a = iArr;
            try {
                iArr[f.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11333a[f.QUEUED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11333a[f.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11333a[f.RUNNING_AND_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
        void a(nf.e eVar, int i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private static ScheduledExecutorService f11334a;

        static ScheduledExecutorService a() {
            if (f11334a == null) {
                f11334a = Executors.newSingleThreadScheduledExecutor();
            }
            return f11334a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public enum f {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING
    }

    public a0(Executor executor, d dVar, int i11) {
        this.f11321a = executor;
        this.f11322b = dVar;
        this.f11325e = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        nf.e eVar;
        int i11;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            eVar = this.f11326f;
            i11 = this.f11327g;
            this.f11326f = null;
            this.f11327g = 0;
            this.f11328h = f.RUNNING;
            this.f11330j = uptimeMillis;
        }
        try {
            if (i(eVar, i11)) {
                this.f11322b.a(eVar, i11);
            }
        } finally {
            nf.e.j(eVar);
            g();
        }
    }

    private void e(long j11) {
        Runnable a11 = of.a.a(this.f11324d, "JobScheduler_enqueueJob");
        if (j11 > 0) {
            e.a().schedule(a11, j11, TimeUnit.MILLISECONDS);
        } else {
            a11.run();
        }
    }

    private void g() {
        long j11;
        boolean z11;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            if (this.f11328h == f.RUNNING_AND_PENDING) {
                j11 = Math.max(this.f11330j + this.f11325e, uptimeMillis);
                z11 = true;
                this.f11329i = uptimeMillis;
                this.f11328h = f.QUEUED;
            } else {
                this.f11328h = f.IDLE;
                j11 = 0;
                z11 = false;
            }
        }
        if (z11) {
            e(j11 - uptimeMillis);
        }
    }

    private static boolean i(nf.e eVar, int i11) {
        return com.facebook.imagepipeline.producers.b.d(i11) || com.facebook.imagepipeline.producers.b.m(i11, 4) || nf.e.G0(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f11321a.execute(of.a.a(this.f11323c, "JobScheduler_submitJob"));
    }

    public void c() {
        nf.e eVar;
        synchronized (this) {
            eVar = this.f11326f;
            this.f11326f = null;
            this.f11327g = 0;
        }
        nf.e.j(eVar);
    }

    public synchronized long f() {
        return this.f11330j - this.f11329i;
    }

    public boolean h() {
        long max;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            boolean z11 = false;
            if (i(this.f11326f, this.f11327g)) {
                int i11 = c.f11333a[this.f11328h.ordinal()];
                if (i11 != 1) {
                    if (i11 == 3) {
                        this.f11328h = f.RUNNING_AND_PENDING;
                    }
                    max = 0;
                } else {
                    max = Math.max(this.f11330j + this.f11325e, uptimeMillis);
                    this.f11329i = uptimeMillis;
                    this.f11328h = f.QUEUED;
                    z11 = true;
                }
                if (z11) {
                    e(max - uptimeMillis);
                }
                return true;
            }
            return false;
        }
    }

    public boolean k(nf.e eVar, int i11) {
        nf.e eVar2;
        if (i(eVar, i11)) {
            synchronized (this) {
                eVar2 = this.f11326f;
                this.f11326f = nf.e.g(eVar);
                this.f11327g = i11;
            }
            nf.e.j(eVar2);
            return true;
        }
        return false;
    }
}