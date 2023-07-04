package vy;

import hy.l;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class b extends hy.l {

    /* renamed from: e  reason: collision with root package name */
    static final C1235b f54653e;

    /* renamed from: f  reason: collision with root package name */
    static final j f54654f;

    /* renamed from: g  reason: collision with root package name */
    static final int f54655g = g(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx3.computation-threads", 0).intValue());

    /* renamed from: h  reason: collision with root package name */
    static final c f54656h;

    /* renamed from: c  reason: collision with root package name */
    final ThreadFactory f54657c;

    /* renamed from: d  reason: collision with root package name */
    final AtomicReference<C1235b> f54658d;

    /* loaded from: classes5.dex */
    static final class a extends l.c {

        /* renamed from: a  reason: collision with root package name */
        private final ly.c f54659a;

        /* renamed from: b  reason: collision with root package name */
        private final iy.a f54660b;

        /* renamed from: c  reason: collision with root package name */
        private final ly.c f54661c;

        /* renamed from: d  reason: collision with root package name */
        private final c f54662d;

        /* renamed from: e  reason: collision with root package name */
        volatile boolean f54663e;

        a(c cVar) {
            this.f54662d = cVar;
            ly.c cVar2 = new ly.c();
            this.f54659a = cVar2;
            iy.a aVar = new iy.a();
            this.f54660b = aVar;
            ly.c cVar3 = new ly.c();
            this.f54661c = cVar3;
            cVar3.c(cVar2);
            cVar3.c(aVar);
        }

        @Override // hy.l.c
        public iy.b b(Runnable runnable) {
            if (this.f54663e) {
                return ly.b.INSTANCE;
            }
            return this.f54662d.h(runnable, 0L, TimeUnit.MILLISECONDS, this.f54659a);
        }

        @Override // hy.l.c
        public iy.b c(Runnable runnable, long j11, TimeUnit timeUnit) {
            if (this.f54663e) {
                return ly.b.INSTANCE;
            }
            return this.f54662d.h(runnable, j11, timeUnit, this.f54660b);
        }

        @Override // iy.b
        public void dispose() {
            if (this.f54663e) {
                return;
            }
            this.f54663e = true;
            this.f54661c.dispose();
        }

        @Override // iy.b
        public boolean isDisposed() {
            return this.f54663e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vy.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C1235b {

        /* renamed from: a  reason: collision with root package name */
        final int f54664a;

        /* renamed from: b  reason: collision with root package name */
        final c[] f54665b;

        /* renamed from: c  reason: collision with root package name */
        long f54666c;

        C1235b(int i11, ThreadFactory threadFactory) {
            this.f54664a = i11;
            this.f54665b = new c[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                this.f54665b[i12] = new c(threadFactory);
            }
        }

        public c a() {
            int i11 = this.f54664a;
            if (i11 == 0) {
                return b.f54656h;
            }
            c[] cVarArr = this.f54665b;
            long j11 = this.f54666c;
            this.f54666c = 1 + j11;
            return cVarArr[(int) (j11 % i11)];
        }

        public void b() {
            for (c cVar : this.f54665b) {
                cVar.dispose();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends h {
        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        c cVar = new c(new j("RxComputationShutdown"));
        f54656h = cVar;
        cVar.dispose();
        j jVar = new j("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx3.computation-priority", 5).intValue())), true);
        f54654f = jVar;
        C1235b c1235b = new C1235b(0, jVar);
        f54653e = c1235b;
        c1235b.b();
    }

    public b() {
        this(f54654f);
    }

    static int g(int i11, int i12) {
        return (i12 <= 0 || i12 > i11) ? i11 : i12;
    }

    @Override // hy.l
    public l.c c() {
        return new a(this.f54658d.get().a());
    }

    @Override // hy.l
    public iy.b e(Runnable runnable, long j11, TimeUnit timeUnit) {
        return this.f54658d.get().a().i(runnable, j11, timeUnit);
    }

    @Override // hy.l
    public iy.b f(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
        return this.f54658d.get().a().j(runnable, j11, j12, timeUnit);
    }

    public void h() {
        C1235b c1235b = new C1235b(f54655g, this.f54657c);
        if (this.f54658d.compareAndSet(f54653e, c1235b)) {
            return;
        }
        c1235b.b();
    }

    public b(ThreadFactory threadFactory) {
        this.f54657c = threadFactory;
        this.f54658d = new AtomicReference<>(f54653e);
        h();
    }
}