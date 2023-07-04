package io.grpc.internal;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public interface s extends io.grpc.f0<Object> {

    /* loaded from: classes5.dex */
    public interface a {
        void a(long j11);

        void onFailure(Throwable th2);
    }

    void d(a aVar, Executor executor);

    q e(io.grpc.s0<?, ?> s0Var, io.grpc.r0 r0Var, io.grpc.c cVar, io.grpc.k[] kVarArr);
}