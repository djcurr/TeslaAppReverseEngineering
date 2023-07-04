package okio;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes5.dex */
public abstract class k implements c0 {
    private final c0 delegate;

    public k(c0 delegate) {
        kotlin.jvm.internal.s.g(delegate, "delegate");
        this.delegate = delegate;
    }

    /* renamed from: -deprecated_delegate  reason: not valid java name */
    public final c0 m951deprecated_delegate() {
        return this.delegate;
    }

    @Override // okio.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final c0 delegate() {
        return this.delegate;
    }

    @Override // okio.c0, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    @Override // okio.c0
    public f0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + CoreConstants.LEFT_PARENTHESIS_CHAR + this.delegate + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // okio.c0
    public void write(f source, long j11) {
        kotlin.jvm.internal.s.g(source, "source");
        this.delegate.write(source, j11);
    }
}