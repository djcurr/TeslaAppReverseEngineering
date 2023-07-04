package okio;

import java.io.Closeable;

/* loaded from: classes5.dex */
public interface e0 extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    long read(f fVar, long j11);

    f0 timeout();
}