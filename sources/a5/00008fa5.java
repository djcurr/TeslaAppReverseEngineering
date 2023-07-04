package okio;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes5.dex */
public abstract class l implements e0 {
    private final e0 delegate;

    public l(e0 delegate) {
        kotlin.jvm.internal.s.g(delegate, "delegate");
        this.delegate = delegate;
    }

    /* renamed from: -deprecated_delegate  reason: not valid java name */
    public final e0 m952deprecated_delegate() {
        return this.delegate;
    }

    @Override // okio.e0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final e0 delegate() {
        return this.delegate;
    }

    @Override // okio.e0
    public long read(f sink, long j11) {
        kotlin.jvm.internal.s.g(sink, "sink");
        return this.delegate.read(sink, j11);
    }

    @Override // okio.e0
    public f0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + CoreConstants.LEFT_PARENTHESIS_CHAR + this.delegate + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}