package freemarker.core;

import java.io.IOException;
import java.io.Writer;

/* loaded from: classes5.dex */
final class b extends Writer {
    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i11, int i12) {
        if (i12 > 0) {
            throw new IOException("This transform does not allow nested content.");
        }
    }
}