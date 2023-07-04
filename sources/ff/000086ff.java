package mp;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes2.dex */
public interface e extends Closeable {
    long O();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    ByteBuffer m1(long j11, long j12);

    long q(long j11, long j12, WritableByteChannel writableByteChannel);

    void r0(long j11);
}