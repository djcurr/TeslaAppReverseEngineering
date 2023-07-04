package io.grpc.internal;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class c2 implements Executor, Runnable {

    /* renamed from: d  reason: collision with root package name */
    private static final Logger f30752d = Logger.getLogger(c2.class.getName());

    /* renamed from: e  reason: collision with root package name */
    private static final b f30753e = c();

    /* renamed from: a  reason: collision with root package name */
    private Executor f30754a;

    /* renamed from: b  reason: collision with root package name */
    private final Queue<Runnable> f30755b = new ConcurrentLinkedQueue();

    /* renamed from: c  reason: collision with root package name */
    private volatile int f30756c = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static abstract class b {
        private b() {
        }

        public abstract boolean a(c2 c2Var, int i11, int i12);

        public abstract void b(c2 c2Var, int i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class c extends b {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicIntegerFieldUpdater<c2> f30757a;

        @Override // io.grpc.internal.c2.b
        public boolean a(c2 c2Var, int i11, int i12) {
            return this.f30757a.compareAndSet(c2Var, i11, i12);
        }

        @Override // io.grpc.internal.c2.b
        public void b(c2 c2Var, int i11) {
            this.f30757a.set(c2Var, i11);
        }

        private c(AtomicIntegerFieldUpdater<c2> atomicIntegerFieldUpdater) {
            super();
            this.f30757a = atomicIntegerFieldUpdater;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class d extends b {
        private d() {
            super();
        }

        @Override // io.grpc.internal.c2.b
        public boolean a(c2 c2Var, int i11, int i12) {
            synchronized (c2Var) {
                if (c2Var.f30756c == i11) {
                    c2Var.f30756c = i12;
                    return true;
                }
                return false;
            }
        }

        @Override // io.grpc.internal.c2.b
        public void b(c2 c2Var, int i11) {
            synchronized (c2Var) {
                c2Var.f30756c = i11;
            }
        }
    }

    public c2(Executor executor) {
        com.google.common.base.u.p(executor, "'executor' must not be null.");
        this.f30754a = executor;
    }

    private static b c() {
        try {
            return new c(AtomicIntegerFieldUpdater.newUpdater(c2.class, cg.c.f9084i));
        } catch (Throwable th2) {
            f30752d.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th2);
            return new d();
        }
    }

    private void d(Runnable runnable) {
        if (f30753e.a(this, 0, -1)) {
            try {
                this.f30754a.execute(this);
            } catch (Throwable th2) {
                if (runnable != null) {
                    this.f30755b.remove(runnable);
                }
                f30753e.b(this, 0);
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f30755b.add((Runnable) com.google.common.base.u.p(runnable, "'r' must not be null."));
        d(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable poll;
        try {
            Executor executor = this.f30754a;
            while (executor == this.f30754a && (poll = this.f30755b.poll()) != null) {
                try {
                    poll.run();
                } catch (RuntimeException e11) {
                    Logger logger = f30752d;
                    Level level = Level.SEVERE;
                    logger.log(level, "Exception while executing runnable " + poll, (Throwable) e11);
                }
            }
            f30753e.b(this, 0);
            if (this.f30755b.isEmpty()) {
                return;
            }
            d(null);
        } catch (Throwable th2) {
            f30753e.b(this, 0);
            throw th2;
        }
    }
}