package io.grpc.internal;

import java.io.InputStream;

/* loaded from: classes5.dex */
public interface o0 {
    o0 a(io.grpc.n nVar);

    void b(InputStream inputStream);

    void close();

    void flush();

    boolean isClosed();

    void k(int i11);
}