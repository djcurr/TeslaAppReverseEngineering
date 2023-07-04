package okio;

import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class m extends f0 {

    /* renamed from: a  reason: collision with root package name */
    private f0 f42664a;

    public m(f0 delegate) {
        kotlin.jvm.internal.s.g(delegate, "delegate");
        this.f42664a = delegate;
    }

    public final f0 a() {
        return this.f42664a;
    }

    public final m b(f0 delegate) {
        kotlin.jvm.internal.s.g(delegate, "delegate");
        this.f42664a = delegate;
        return this;
    }

    @Override // okio.f0
    public f0 clearDeadline() {
        return this.f42664a.clearDeadline();
    }

    @Override // okio.f0
    public f0 clearTimeout() {
        return this.f42664a.clearTimeout();
    }

    @Override // okio.f0
    public long deadlineNanoTime() {
        return this.f42664a.deadlineNanoTime();
    }

    @Override // okio.f0
    public boolean hasDeadline() {
        return this.f42664a.hasDeadline();
    }

    @Override // okio.f0
    public void throwIfReached() {
        this.f42664a.throwIfReached();
    }

    @Override // okio.f0
    public f0 timeout(long j11, TimeUnit unit) {
        kotlin.jvm.internal.s.g(unit, "unit");
        return this.f42664a.timeout(j11, unit);
    }

    @Override // okio.f0
    public long timeoutNanos() {
        return this.f42664a.timeoutNanos();
    }

    @Override // okio.f0
    public f0 deadlineNanoTime(long j11) {
        return this.f42664a.deadlineNanoTime(j11);
    }
}