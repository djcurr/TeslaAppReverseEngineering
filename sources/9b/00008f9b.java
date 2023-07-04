package okio;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public class f0 {
    public static final b Companion = new b(null);
    public static final f0 NONE = new a();
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    /* loaded from: classes5.dex */
    public static final class a extends f0 {
        a() {
        }

        @Override // okio.f0
        public f0 deadlineNanoTime(long j11) {
            return this;
        }

        @Override // okio.f0
        public void throwIfReached() {
        }

        @Override // okio.f0
        public f0 timeout(long j11, TimeUnit unit) {
            kotlin.jvm.internal.s.g(unit, "unit");
            return this;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public final long a(long j11, long j12) {
            return (j11 != 0 && (j12 == 0 || j11 < j12)) ? j11 : j12;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public f0 clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public f0 clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    public final f0 deadline(long j11, TimeUnit unit) {
        kotlin.jvm.internal.s.g(unit, "unit");
        if (j11 > 0) {
            return deadlineNanoTime(System.nanoTime() + unit.toNanos(j11));
        }
        throw new IllegalArgumentException(("duration <= 0: " + j11).toString());
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final void intersectWith(f0 other, h00.a<vz.b0> block) {
        kotlin.jvm.internal.s.g(other, "other");
        kotlin.jvm.internal.s.g(block, "block");
        long timeoutNanos = timeoutNanos();
        long a11 = Companion.a(other.timeoutNanos(), timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(a11, timeUnit);
        if (hasDeadline()) {
            long deadlineNanoTime = deadlineNanoTime();
            if (other.hasDeadline()) {
                deadlineNanoTime(Math.min(deadlineNanoTime(), other.deadlineNanoTime()));
            }
            try {
                block.invoke();
                kotlin.jvm.internal.q.b(1);
                timeout(timeoutNanos, timeUnit);
                if (other.hasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime);
                }
                kotlin.jvm.internal.q.a(1);
                return;
            } catch (Throwable th2) {
                kotlin.jvm.internal.q.b(1);
                timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (other.hasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime);
                }
                kotlin.jvm.internal.q.a(1);
                throw th2;
            }
        }
        if (other.hasDeadline()) {
            deadlineNanoTime(other.deadlineNanoTime());
        }
        try {
            block.invoke();
            kotlin.jvm.internal.q.b(1);
            timeout(timeoutNanos, timeUnit);
            if (other.hasDeadline()) {
                clearDeadline();
            }
            kotlin.jvm.internal.q.a(1);
        } catch (Throwable th3) {
            kotlin.jvm.internal.q.b(1);
            timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            if (other.hasDeadline()) {
                clearDeadline();
            }
            kotlin.jvm.internal.q.a(1);
            throw th3;
        }
    }

    public void throwIfReached() {
        Thread currentThread = Thread.currentThread();
        kotlin.jvm.internal.s.f(currentThread, "Thread.currentThread()");
        if (!currentThread.isInterrupted()) {
            if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public f0 timeout(long j11, TimeUnit unit) {
        kotlin.jvm.internal.s.g(unit, "unit");
        if (j11 >= 0) {
            this.timeoutNanos = unit.toNanos(j11);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j11).toString());
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(Object monitor) {
        kotlin.jvm.internal.s.g(monitor, "monitor");
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            long j11 = 0;
            if (!hasDeadline && timeoutNanos == 0) {
                monitor.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - nanoTime;
            }
            if (timeoutNanos > 0) {
                long j12 = timeoutNanos / 1000000;
                monitor.wait(j12, (int) (timeoutNanos - (1000000 * j12)));
                j11 = System.nanoTime() - nanoTime;
            }
            if (j11 >= timeoutNanos) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public f0 deadlineNanoTime(long j11) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j11;
        return this;
    }
}