package io.grpc.internal;

import io.grpc.internal.s;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public class u0 {

    /* renamed from: g  reason: collision with root package name */
    private static final Logger f31236g = Logger.getLogger(u0.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final long f31237a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.common.base.y f31238b;

    /* renamed from: c  reason: collision with root package name */
    private Map<s.a, Executor> f31239c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    private boolean f31240d;

    /* renamed from: e  reason: collision with root package name */
    private Throwable f31241e;

    /* renamed from: f  reason: collision with root package name */
    private long f31242f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s.a f31243a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f31244b;

        a(s.a aVar, long j11) {
            this.f31243a = aVar;
            this.f31244b = j11;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f31243a.a(this.f31244b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s.a f31245a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Throwable f31246b;

        b(s.a aVar, Throwable th2) {
            this.f31245a = aVar;
            this.f31246b = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f31245a.onFailure(this.f31246b);
        }
    }

    public u0(long j11, com.google.common.base.y yVar) {
        this.f31237a = j11;
        this.f31238b = yVar;
    }

    private static Runnable b(s.a aVar, long j11) {
        return new a(aVar, j11);
    }

    private static Runnable c(s.a aVar, Throwable th2) {
        return new b(aVar, th2);
    }

    private static void e(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th2) {
            f31236g.log(Level.SEVERE, "Failed to execute PingCallback", th2);
        }
    }

    public static void g(s.a aVar, Executor executor, Throwable th2) {
        e(executor, c(aVar, th2));
    }

    public void a(s.a aVar, Executor executor) {
        synchronized (this) {
            if (!this.f31240d) {
                this.f31239c.put(aVar, executor);
                return;
            }
            Throwable th2 = this.f31241e;
            e(executor, th2 != null ? c(aVar, th2) : b(aVar, this.f31242f));
        }
    }

    public boolean d() {
        synchronized (this) {
            if (this.f31240d) {
                return false;
            }
            this.f31240d = true;
            long d11 = this.f31238b.d(TimeUnit.NANOSECONDS);
            this.f31242f = d11;
            Map<s.a, Executor> map = this.f31239c;
            this.f31239c = null;
            for (Map.Entry<s.a, Executor> entry : map.entrySet()) {
                e(entry.getValue(), b(entry.getKey(), d11));
            }
            return true;
        }
    }

    public void f(Throwable th2) {
        synchronized (this) {
            if (this.f31240d) {
                return;
            }
            this.f31240d = true;
            this.f31241e = th2;
            Map<s.a, Executor> map = this.f31239c;
            this.f31239c = null;
            for (Map.Entry<s.a, Executor> entry : map.entrySet()) {
                g(entry.getKey(), entry.getValue(), th2);
            }
        }
    }

    public long h() {
        return this.f31237a;
    }
}