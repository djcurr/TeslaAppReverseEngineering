package b0;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import v3.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g implements Executor {

    /* renamed from: b  reason: collision with root package name */
    private final Executor f7167b;

    /* renamed from: a  reason: collision with root package name */
    final Deque<Runnable> f7166a = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    private final b f7168c = new b();

    /* renamed from: d  reason: collision with root package name */
    c f7169d = c.IDLE;

    /* renamed from: e  reason: collision with root package name */
    long f7170e = 0;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f7171a;

        a(g gVar, Runnable runnable) {
            this.f7171a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7171a.run();
        }
    }

    /* loaded from: classes.dex */
    final class b implements Runnable {
        b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
            if (r1 == false) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
            r3.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
            androidx.camera.core.n0.d("SequentialExecutor", "Exception while executing runnable " + r3, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void a() {
            /*
                r9 = this;
                r0 = 0
                r1 = r0
            L2:
                b0.g r2 = b0.g.this     // Catch: java.lang.Throwable -> L68
                java.util.Deque<java.lang.Runnable> r2 = r2.f7166a     // Catch: java.lang.Throwable -> L68
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L68
                if (r0 != 0) goto L26
                b0.g r0 = b0.g.this     // Catch: java.lang.Throwable -> L65
                b0.g$c r3 = r0.f7169d     // Catch: java.lang.Throwable -> L65
                b0.g$c r4 = b0.g.c.RUNNING     // Catch: java.lang.Throwable -> L65
                if (r3 != r4) goto L1c
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L65
                if (r1 == 0) goto L1b
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1b:
                return
            L1c:
                long r5 = r0.f7170e     // Catch: java.lang.Throwable -> L65
                r7 = 1
                long r5 = r5 + r7
                r0.f7170e = r5     // Catch: java.lang.Throwable -> L65
                r0.f7169d = r4     // Catch: java.lang.Throwable -> L65
                r0 = 1
            L26:
                b0.g r3 = b0.g.this     // Catch: java.lang.Throwable -> L65
                java.util.Deque<java.lang.Runnable> r3 = r3.f7166a     // Catch: java.lang.Throwable -> L65
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L65
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L65
                if (r3 != 0) goto L43
                b0.g r0 = b0.g.this     // Catch: java.lang.Throwable -> L65
                b0.g$c r3 = b0.g.c.IDLE     // Catch: java.lang.Throwable -> L65
                r0.f7169d = r3     // Catch: java.lang.Throwable -> L65
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L65
                if (r1 == 0) goto L42
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L42:
                return
            L43:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L65
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L68
                r1 = r1 | r2
                r3.run()     // Catch: java.lang.RuntimeException -> L4d java.lang.Throwable -> L68
                goto L2
            L4d:
                r2 = move-exception
                java.lang.String r4 = "SequentialExecutor"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
                r5.<init>()     // Catch: java.lang.Throwable -> L68
                java.lang.String r6 = "Exception while executing runnable "
                r5.append(r6)     // Catch: java.lang.Throwable -> L68
                r5.append(r3)     // Catch: java.lang.Throwable -> L68
                java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L68
                androidx.camera.core.n0.d(r4, r3, r2)     // Catch: java.lang.Throwable -> L68
                goto L2
            L65:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L65
                throw r0     // Catch: java.lang.Throwable -> L68
            L68:
                r0 = move-exception
                if (r1 == 0) goto L72
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L72:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: b0.g.b.a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e11) {
                synchronized (g.this.f7166a) {
                    g.this.f7169d = c.IDLE;
                    throw e11;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Executor executor) {
        this.f7167b = (Executor) h.f(executor);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c cVar;
        h.f(runnable);
        synchronized (this.f7166a) {
            c cVar2 = this.f7169d;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j11 = this.f7170e;
                a aVar = new a(this, runnable);
                this.f7166a.add(aVar);
                c cVar3 = c.QUEUING;
                this.f7169d = cVar3;
                try {
                    this.f7167b.execute(this.f7168c);
                    if (this.f7169d != cVar3) {
                        return;
                    }
                    synchronized (this.f7166a) {
                        if (this.f7170e == j11 && this.f7169d == cVar3) {
                            this.f7169d = cVar;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e11) {
                    synchronized (this.f7166a) {
                        c cVar4 = this.f7169d;
                        if ((cVar4 != c.IDLE && cVar4 != c.QUEUING) || !this.f7166a.removeLastOccurrence(aVar)) {
                            r0 = false;
                        }
                        if (!(e11 instanceof RejectedExecutionException) || r0) {
                            throw e11;
                        }
                    }
                    return;
                }
            }
            this.f7166a.add(runnable);
        }
    }
}