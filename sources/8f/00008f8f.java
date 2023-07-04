package okio;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public class d extends f0 {
    public static final a Companion = new a(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static d head;
    private boolean inQueue;
    private d next;
    private long timeoutAt;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(d dVar) {
            synchronized (d.class) {
                if (dVar.inQueue) {
                    dVar.inQueue = false;
                    for (d dVar2 = d.head; dVar2 != null; dVar2 = dVar2.next) {
                        if (dVar2.next == dVar) {
                            dVar2.next = dVar.next;
                            dVar.next = null;
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(d dVar, long j11, boolean z11) {
            synchronized (d.class) {
                if (!dVar.inQueue) {
                    dVar.inQueue = true;
                    if (d.head == null) {
                        d.head = new d();
                        new b().start();
                    }
                    long nanoTime = System.nanoTime();
                    int i11 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                    if (i11 != 0 && z11) {
                        dVar.timeoutAt = Math.min(j11, dVar.deadlineNanoTime() - nanoTime) + nanoTime;
                    } else if (i11 != 0) {
                        dVar.timeoutAt = j11 + nanoTime;
                    } else if (z11) {
                        dVar.timeoutAt = dVar.deadlineNanoTime();
                    } else {
                        throw new AssertionError();
                    }
                    long remainingNanos = dVar.remainingNanos(nanoTime);
                    d dVar2 = d.head;
                    kotlin.jvm.internal.s.e(dVar2);
                    while (dVar2.next != null) {
                        d dVar3 = dVar2.next;
                        kotlin.jvm.internal.s.e(dVar3);
                        if (remainingNanos < dVar3.remainingNanos(nanoTime)) {
                            break;
                        }
                        dVar2 = dVar2.next;
                        kotlin.jvm.internal.s.e(dVar2);
                    }
                    dVar.next = dVar2.next;
                    dVar2.next = dVar;
                    if (dVar2 == d.head) {
                        d.class.notify();
                    }
                    vz.b0 b0Var = vz.b0.f54756a;
                } else {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
            }
        }

        public final d c() {
            d dVar = d.head;
            kotlin.jvm.internal.s.e(dVar);
            d dVar2 = dVar.next;
            if (dVar2 != null) {
                long remainingNanos = dVar2.remainingNanos(System.nanoTime());
                if (remainingNanos <= 0) {
                    d dVar3 = d.head;
                    kotlin.jvm.internal.s.e(dVar3);
                    dVar3.next = dVar2.next;
                    dVar2.next = null;
                    return dVar2;
                }
                long j11 = remainingNanos / 1000000;
                d.class.wait(j11, (int) (remainingNanos - (1000000 * j11)));
                return null;
            }
            long nanoTime = System.nanoTime();
            d.class.wait(d.IDLE_TIMEOUT_MILLIS);
            d dVar4 = d.head;
            kotlin.jvm.internal.s.e(dVar4);
            if (dVar4.next != null || System.nanoTime() - nanoTime < d.IDLE_TIMEOUT_NANOS) {
                return null;
            }
            return d.head;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            d c11;
            while (true) {
                try {
                    synchronized (d.class) {
                        c11 = d.Companion.c();
                        if (c11 == d.head) {
                            d.head = null;
                            return;
                        }
                        vz.b0 b0Var = vz.b0.f54756a;
                    }
                    if (c11 != null) {
                        c11.timedOut();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class c implements c0 {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c0 f42641b;

        c(c0 c0Var) {
            this.f42641b = c0Var;
        }

        @Override // okio.c0
        /* renamed from: a */
        public d timeout() {
            return d.this;
        }

        @Override // okio.c0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            d dVar = d.this;
            dVar.enter();
            try {
                this.f42641b.close();
                vz.b0 b0Var = vz.b0.f54756a;
                if (dVar.exit()) {
                    throw dVar.access$newTimeoutException(null);
                }
            } catch (IOException e11) {
                if (!dVar.exit()) {
                    throw e11;
                }
                throw dVar.access$newTimeoutException(e11);
            } finally {
                dVar.exit();
            }
        }

        @Override // okio.c0, java.io.Flushable
        public void flush() {
            d dVar = d.this;
            dVar.enter();
            try {
                this.f42641b.flush();
                vz.b0 b0Var = vz.b0.f54756a;
                if (dVar.exit()) {
                    throw dVar.access$newTimeoutException(null);
                }
            } catch (IOException e11) {
                if (!dVar.exit()) {
                    throw e11;
                }
                throw dVar.access$newTimeoutException(e11);
            } finally {
                dVar.exit();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f42641b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // okio.c0
        public void write(f source, long j11) {
            kotlin.jvm.internal.s.g(source, "source");
            okio.c.b(source.P0(), 0L, j11);
            while (true) {
                long j12 = 0;
                if (j11 <= 0) {
                    return;
                }
                z zVar = source.f42645a;
                kotlin.jvm.internal.s.e(zVar);
                while (true) {
                    if (j12 >= 65536) {
                        break;
                    }
                    j12 += zVar.f42703c - zVar.f42702b;
                    if (j12 >= j11) {
                        j12 = j11;
                        break;
                    } else {
                        zVar = zVar.f42706f;
                        kotlin.jvm.internal.s.e(zVar);
                    }
                }
                d dVar = d.this;
                dVar.enter();
                try {
                    this.f42641b.write(source, j12);
                    vz.b0 b0Var = vz.b0.f54756a;
                    if (dVar.exit()) {
                        throw dVar.access$newTimeoutException(null);
                    }
                    j11 -= j12;
                } catch (IOException e11) {
                    if (!dVar.exit()) {
                        throw e11;
                    }
                    throw dVar.access$newTimeoutException(e11);
                } finally {
                    dVar.exit();
                }
            }
        }
    }

    /* renamed from: okio.d$d  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0849d implements e0 {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e0 f42643b;

        C0849d(e0 e0Var) {
            this.f42643b = e0Var;
        }

        @Override // okio.e0
        /* renamed from: a */
        public d timeout() {
            return d.this;
        }

        @Override // okio.e0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            d dVar = d.this;
            dVar.enter();
            try {
                this.f42643b.close();
                vz.b0 b0Var = vz.b0.f54756a;
                if (dVar.exit()) {
                    throw dVar.access$newTimeoutException(null);
                }
            } catch (IOException e11) {
                if (!dVar.exit()) {
                    throw e11;
                }
                throw dVar.access$newTimeoutException(e11);
            } finally {
                dVar.exit();
            }
        }

        @Override // okio.e0
        public long read(f sink, long j11) {
            kotlin.jvm.internal.s.g(sink, "sink");
            d dVar = d.this;
            dVar.enter();
            try {
                long read = this.f42643b.read(sink, j11);
                if (dVar.exit()) {
                    throw dVar.access$newTimeoutException(null);
                }
                return read;
            } catch (IOException e11) {
                if (dVar.exit()) {
                    throw dVar.access$newTimeoutException(e11);
                }
                throw e11;
            } finally {
                dVar.exit();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f42643b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long j11) {
        return this.timeoutAt - j11;
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    public final void enter() {
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            Companion.e(this, timeoutNanos, hasDeadline);
        }
    }

    public final boolean exit() {
        return Companion.d(this);
    }

    protected IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final c0 sink(c0 sink) {
        kotlin.jvm.internal.s.g(sink, "sink");
        return new c(sink);
    }

    public final e0 source(e0 source) {
        kotlin.jvm.internal.s.g(source, "source");
        return new C0849d(source);
    }

    protected void timedOut() {
    }

    public final <T> T withTimeout(h00.a<? extends T> block) {
        kotlin.jvm.internal.s.g(block, "block");
        enter();
        try {
            try {
                T invoke = block.invoke();
                kotlin.jvm.internal.q.b(1);
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                kotlin.jvm.internal.q.a(1);
                return invoke;
            } catch (IOException e11) {
                if (exit()) {
                    throw access$newTimeoutException(e11);
                }
                throw e11;
            }
        } catch (Throwable th2) {
            kotlin.jvm.internal.q.b(1);
            exit();
            kotlin.jvm.internal.q.a(1);
            throw th2;
        }
    }
}