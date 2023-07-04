package io.grpc.internal;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public interface u1 extends Closeable {
    void A1(OutputStream outputStream, int i11);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void d1(byte[] bArr, int i11, int i12);

    int f();

    void k1();

    boolean markSupported();

    void o0(ByteBuffer byteBuffer);

    int readUnsignedByte();

    void reset();

    void skipBytes(int i11);

    u1 y(int i11);
}