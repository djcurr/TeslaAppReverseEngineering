package okio;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes5.dex */
public interface c0 extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    f0 timeout();

    void write(f fVar, long j11);
}