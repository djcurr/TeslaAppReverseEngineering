package com.facebook.common.memory;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface PooledByteBuffer extends Closeable {

    /* loaded from: classes.dex */
    public static class ClosedException extends RuntimeException {
        public ClosedException() {
            super("Invalid bytebuf. Already closed");
        }
    }

    long getNativePtr();

    int h(int i11, byte[] bArr, int i12, int i13);

    ByteBuffer i();

    boolean isClosed();

    byte n(int i11);

    int size();
}