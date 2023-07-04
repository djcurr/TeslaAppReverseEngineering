package okio;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class e implements c0 {
    @Override // okio.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // okio.c0, java.io.Flushable
    public void flush() {
    }

    @Override // okio.c0
    public f0 timeout() {
        return f0.NONE;
    }

    @Override // okio.c0
    public void write(f source, long j11) {
        kotlin.jvm.internal.s.g(source, "source");
        source.skip(j11);
    }
}